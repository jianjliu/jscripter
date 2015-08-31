
/*
 *  JScripter Standard 1.0 - To Script In Java
 *  Copyright (C) 2008-2011  J.J.Liu<jianjunliu@126.com> <http://www.jscripter.org>
 *  
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *  
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package jsx.ui.dd;

import js.ArrayLike;
import js.Function;
import js.Id;
import js.Js;
import js.JsApplet;
import js.ObjectLike;
import js.Static;
import js.Var;
import js.Vars;
import js.core.JsFunction;
import js.core.JsObject;
import js.dom.EventTarget;
import js.user.JsEvent;
import js.user.JsNode;
import jsx.Configurable;
import jsx.TaskManager;
import jsx.Timeout;
import jsx.client.Browser;
import jsx.client.Win;
import jsx.core.ObjectLikes;
import jsx.core.Variables;
import jsx.event.Events;
import jsx.event.Handle;
import jsx.ui.Component;
import jsx.ui.Widget;
import jsx.ui.dd.event.DragMove;
import jsx.ui.dd.event.DragOut;
import jsx.ui.dd.event.DragOver;
import jsx.ui.dd.event.DragStart;
import jsx.ui.dd.event.DragStop;
import jsx.ui.event.MouseDown;
import jsx.ui.event.MouseMove;
import jsx.ui.event.MouseOut;
import jsx.ui.event.MouseOver;
import jsx.ui.event.MouseUp;
import jsx.ui.event.OnRender;
import jsx.ui.event.Popup;
import jsx.ui.event.Render;

/**
 * <p>A base class for mouse widgets that wrap components to handle mouse operations.</p>
 * <p>A {@link Mouse} widget is a {@link Widget} that wraps a {@link Component} to provide 
 * additional mouse handling functionalities based on that component.</p>
 * <p>A {@link Mouse} widget is {@link Configurable} and is also an event source which 
 * fires mouse events and acts just like a mouse handle. Note that, the mouse events are 
 * fired from the mouse wrapper widget not the wrapped component so that the event 
 * listeners registered with the wrapped component may also handle them.</p>
 * <p>Meanwhile, it is interesting that a {@link Mouse} widget is also an event listener 
 * that handles {@link Render} event fired from the wrapped component, which means an 
 * extended class of this one can do more things in an event handler method that overrides 
 * the handler method of this class, such as {@link Mouse#onEvent(Render)}, but calling the 
 * overridden method would be the first thing for the overriding one to do not to lose the 
 * mouse handling of this class.</p>
 * <p>This class fires {@link DragMove} events by its local event dispatcher other than 
 * the general one.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Mouse extends Widget implements OnRender
{
	/**
	 * <p>A typical constructor forcing constructors of subclasses to pass a component.</p>
	 * <p>This constructor tries to initialize the newly constructed mouse widget. 
	 * If the wrapped component is not rendered, it adds this event listener to the 
	 * component to handle {@link Render} event and makes the event handling method 
	 * {@link #onEvent(Render)} do the initialization.</p>
	 * @param e The underlying component.
	 * @since 1.0
	 */
	protected Mouse(Component e) {
		super(e);
		if (!e.isRendered()) {
			e.addListener(Render.class, this);
		}
		init(this);
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method initializes the mouse wrapper widget.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(Render evt) {
		init(this);
	}

	private final static Var<TaskManager> DISPATCHER = new Static<TaskManager>(new Var<TaskManager>() {
		@Override
		public TaskManager var() {
			return new TaskManager();
		}
	});

	private final static Id<Boolean> CAPTURING = new Id<Boolean>();
	private final static Id<Integer> DELAY = new Id<Integer>();
	private final static Id<Handle> LOSECAPTURE = new Id<Handle>();
	private final static Id<Handle> MOUSEDOWN = new Id<Handle>();
	private final static Id<Handle> MOUSEMOVE = new Id<Handle>();
	private final static Id<Handle> MOUSEOVER = new Id<Handle>();
	private final static Id<Handle> MOUSEOUT = new Id<Handle>();
	private final static Id<Handle> MOUSERELEASE = new Id<Handle>();
	private final static Id<Handle> MOUSEUP = new Id<Handle>();
	private final static Id<Mouse> MOUSE = new Id<Mouse>();

	/**
	 * <p>Gets the mouse widget for a component.</p>
	 * <p>The method simply returns the mouse widget that wraps the specified component if 
	 * there is one. Otherwise, it creates one to wrap the component and returns the newly 
	 * created widget.</p>
	 * @param e An component to handle mouse operations.
	 * @return A mouse widget that wraps the specified component.
	 * @since 1.0
	 */
	public static final Mouse getMouse(Component e) {
		Mouse h = ini(e).var(MOUSE);
		if (Js.not(h)) {
			h = new Mouse(e);
			ini(e).var(MOUSE, h);
		}
		return h;
	}

	/**
	 * <p>Gets the delay of a mouse in milliseconds.</p>
	 * <p>This method returns a number value that specifies the milliseconds the mouse 
	 * needs to wait before firing a {@link MouseOver} event and a {@link DragStart} 
	 * event for dragging mode when it has been pressed.</p>
	 * @param h The current mouse wrapper.
	 * @return The milliseconds to wait before firing a {@link MouseOver} or 
	 * {@link DragStart} event.
	 * @since 1.0
	 */
	public static final int getDelay(Mouse h) {
		Integer d = ini(h).var(DELAY);
		return Variables.undefined(d) ? 0 : d;
	}

	/**
	 * <p>Sets the delay of a mouse in milliseconds.</p>
	 * <p>This method sets the number of milliseconds that the mouse needs to wait before 
	 * firing a {@link MouseOver} event and a {@link DragStart} event for dragging mode 
	 * when it has been pressed.</p>
	 * <p>This method may resets the mouse wrapper and should not be called in an event 
	 * handler method that is handling mouse events fired from this mouse.</p>
	 * @param h The current mouse wrapper.
	 * @param delay The milliseconds to wait before firing a {@link MouseOver} or 
	 * {@link DragStart} events.
	 * @since 1.0
	 */
	public static final void setDelay(Mouse h, int delay) {
		if (Js.neq(delay, getDelay(h))) {
			if (delay > 0) {
				ini(h).var(DELAY, delay);
			} else {
				ObjectLikes.delete(ini(h), DELAY);
			}
			destroy(h);
			init(h);
		}
	}

	/**
	 * <p>Sets the delay of a mouse in milliseconds.</p>
	 * <p>This method sets the number of milliseconds that the mouse needs to wait before 
	 * firing a {@link DragStart} event when it has been pressed.</p>
	 * <p>This method may resets the mouse wrapper and should not be called in an event 
	 * handler method that is handling mouse events fired from this mouse.</p>
	 * @param h The current mouse wrapper.
	 * @param delay The milliseconds to wait before firing a {@link DragStart} event.
	 * @since 1.0
	 */
	public static final void delay(Mouse h, int delay) {
		if (Mouse.getDelay(h) < delay) {
			Mouse.setDelay(h, delay);
		}
	}

	private final static ArrayLike<Id<Handle>> HANDLES = new Vars<Id<Handle>>()
			.add(LOSECAPTURE)
			.add(MOUSEMOVE)
			.add(MOUSEOVER)
			.add(MOUSEOUT)
			.add(MOUSERELEASE)
			.add(MOUSEUP)
			.var();

	/**
	 * <p>Destroys the specified mouse.</p>
	 * <p>It detaches the current mouse wrapper from its underlying component but not that 
	 * the component is to destroy.</p>
	 * <p>A destroyed mouse will not fire any events but you can get it back with a call to 
	 * the method {@link #getMouse(Component)} with the same component.</p>
	 * <p>This method may resets the mouse wrapper and should not be called in an event 
	 * handler method that is handling mouse events fired from this mouse.</p>
	 * @param h The current mouse wrapper.
	 * @since 1.0
	 */
	public static final void destroy(Mouse h) {
		ObjectLike ini = ini(h);
		Handle down = ini.var(MOUSEDOWN);
		if (Js.be(down)) {
			Handle.detach(down);
			ObjectLikes.delete(ini, MOUSEDOWN);
			ObjectLikes.delete(ini, HANDLES);
			ObjectLikes.delete(ini(h.unwrap()), MOUSE);
		}
	}

	private static final JsFunction<Void> mouseOver(final Mouse h) {
		JsFunction<Void> f = new Function<Void>() {
			@Override
			protected Void function(Object jsthis, Call<Void> callee) {
				synchronized(JsApplet.class) {
					JsEvent be = new JsEvent((JsObject)callee.arguments.get(0));
					if (!Browser.isIE) {
						Events.stop(be);
					}
					Component t = Component.get(Events.srcElement(be));
					if (Js.be(ini(h).var(CAPTURING))) {
						h.fire(new DragOver(t));
					} else {
						h.fire(new MouseOver(t));
					}
				}
				return null;
			}
		}.var();
		return Browser.isIE ? new JsFunction<Void>(
				Handle.IE.var().invoke(f)
		) : f;
	}

	private static final JsFunction<Void> mouseOut(final Mouse h) {
		JsFunction<Void> f = new Function<Void>() {
			@Override
			protected Void function(Object jsthis, Call<Void> callee) {
				synchronized(JsApplet.class) {
					JsEvent be = new JsEvent((JsObject)callee.arguments.get(0));
					if (!Browser.isIE) {
						Events.stop(be);
					}
					Component t = Component.get(Events.srcElement(be));
					if (Js.be(ini(h).var(CAPTURING))) {
						h.fire(new DragOut(t));
					} else {
						h.fire(new MouseOut(t));
					}
				}
				return null;
			}
		}.var();
		return Browser.isIE ? new JsFunction<Void>(
				Handle.IE.var().invoke(f)
		) : f;
	}

	private static final JsFunction<Void> mouseMove(final Mouse h) {
		JsFunction<Void> f = new Function<Void>() {
			@Override
			protected Void function(Object jsthis, Call<Void> callee) {
				synchronized(JsApplet.class) {
					JsEvent be = new JsEvent((JsObject)callee.arguments.get(0));
					if (!Browser.isIE) {
						Events.stop(be);
					}
					Component t = Component.get(Events.srcElement(be));
					if (Js.be(ini(h).var(CAPTURING))) {
						h.fire(new DragMove(
								t,
								Events.pageX(be),
								Events.pageY(be)
						), DISPATCHER.var());
					} else {
						h.fire(new MouseMove(
								t,
								Events.pageX(be),
								Events.pageY(be)
						), DISPATCHER.var());
					}
				}
				return null;
			}
		}.var();
		return Browser.isIE ? new JsFunction<Void>(
				Handle.IE.var().invoke(f)
		) : f;
	}

	private static final JsFunction<Void> mouseUp(final Mouse h) {
		JsFunction<Void> f = new Function<Void>() {
			@Override
			protected Void function(Object jsthis, Call<Void> callee) {
				synchronized(JsApplet.class) {
					ObjectLike ini = ini(h);
					JsEvent be = new JsEvent((JsObject)callee.arguments.get(0));
					if (!Browser.isIE) {
						Events.stop(be);
						h.unwrap().pseudo(ACTIVE, "active").getRemover().invoke();
					}
					if (Js.be(ini.var(CAPTURING))) {
						ObjectLikes.delete(ini, CAPTURING);
						h.fire(new DragStop(
								Component.get(Events.srcElement(be)),
								Events.pageX(be),
								Events.pageY(be)
						));
					} else {
						ini.var(CAPTURING, true);
						h.fire(new MouseUp(
								Component.get(Events.srcElement(be))
						));
					}
					Handle.detach(ini, HANDLES);
					Events.releaseCapture(
							(JsNode)getEventTarget(h)
					);
				}
				return null;
			}
		}.var();
		return Browser.isIE ? new JsFunction<Void>(
				Handle.IE.var().invoke(f)
		) : f;
	}

	private static final EventTarget setCapture(Mouse h) {
		EventTarget et = Win.document.var();
		if (Browser.isIE) {
			et = getEventTarget(h);
			handle(LOSECAPTURE, "losecapture" , mouseUp(h), et, h, true);
			Events.setCapture((JsNode)et);
		}
		return et;
	}

	private static final void captureUp(EventTarget et, Mouse h) {
		handle(MOUSEUP, "mouseup" , mouseUp(h), et, h, true);
	}

	private static final void capture(EventTarget et, Mouse h) {
		ini(h).var(CAPTURING, true);
		handle(MOUSERELEASE, "mouseup"  , mouseUp  (h), et, h, true);
		handle(MOUSEOUT ,    "mouseout" , mouseOut (h), et, h, true);
		handle(MOUSEOVER,    "mouseover", mouseOver(h), et, h, true);
		handle(MOUSEMOVE,    "mousemove", mouseMove(h), et, h, true);
	}

	private static final JsFunction<Void> mouseDown(final Mouse h) {
		JsFunction<Void> f = new Function<Void>() {
			@Override
			protected Void function(Object jsthis, Call<Void> callee) {
				synchronized(JsApplet.class) {
					final JsEvent be = new JsEvent((JsObject)callee.arguments.get(0));
					Events.stop(be);
					final Component he = h.unwrap();
					final DragStart dragStart = new DragStart(
							he,
							Events.pageX(be),
							Events.pageY(be)
					);
					h.fire(new Popup());
					h.fire(new MouseDown(he));
					final EventTarget et = setCapture(h);
					int delay = getDelay(h);
					if (Js.not(delay)) {
						h.fire(dragStart);
						capture(et, h);
					} else {
						ObjectLikes.delete(ini(he), PREVENTCLICK);
						new Timeout() {
							@Override
							public void run() {
								synchronized(JsApplet.class) {
									ObjectLike ini = ini(h);
									if (Js.not(ini.var(CAPTURING))) {
										Handle.detach(ini.var(MOUSEUP));
										ini(h.unwrap()).var(PREVENTCLICK, true);
										h.fire(dragStart);
										capture(et, h);
									} else {
										ObjectLikes.delete(ini, CAPTURING);
									}
								}
							}
						}.set(delay);
						captureUp(et, h);
					}
				}
				return null;
			}
		}.var();
		return Browser.isIE ? new JsFunction<Void>(
				Handle.IE.var().invoke(f)
		) : f;
	}

	private static final void init(final Mouse h) {
		if (h.isRendered()) {
			EventTarget et = getEventTarget(h);
			handle(MOUSEDOWN, "mousedown", mouseDown(h), et, h, false);
		}
	}

	private static final void handle(Id<Handle> id, String evt, JsFunction<Void> f, EventTarget et, Mouse t, boolean cap) {
		Handle h = ini(t).var(id);
		if (Js.not(h)) {
			h = new Handle(et, evt, f, cap);
			ini(t).var(id, h);
		}
		h.attach();
	}

	private static final EventTarget getEventTarget(Mouse h) {
		return Component.getElement(h.unwrap());
	}
}
