
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

import js.Id;
import js.Initializer;
import js.Js;
import js.ObjectLike;
import jsx.Configurable;
import jsx.client.Browser;
import jsx.core.ObjectLikes;
import jsx.dom.Elements;
import jsx.dom.Styles;
import jsx.ui.Component;
import jsx.ui.Widget;
import jsx.ui.dd.event.DragMove;
import jsx.ui.dd.event.DragStart;
import jsx.ui.dd.event.DragStop;
import jsx.ui.dd.event.OnDragMove;
import jsx.ui.dd.event.OnDragStart;
import jsx.ui.dd.event.OnDragStop;
import jsx.ui.event.Popup;
import jsx.ui.event.Position;
import jsx.ui.fx.event.Animation;

/**
 * <p>A base class for wrapper widgets that can be dragged by mouse handles.</p>
 * <p>A {@link Draggable} widget is a {@link Widget} that makes its underlying HTML 
 * element movable or {@link Resizable} in accordance with a {@link Mouse} widget 
 * to which it listens mouse events.</p>
 * <p>A {@link Draggable} widget is {@link Configurable} and is also an event source 
 * which fires {@link jsx.ui.Widget.Event} events.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Draggable extends Widget implements OnDragStart, OnDragMove, OnDragStop
{
	/**
	 * <p>A global identifier for a configurable property of a {@link Draggable} object.</p>
	 * <p>The identified configurable property of a {@link Draggable} object refers to 
	 * a boolean value specifying whether to create a ghost to show dragging of the 
	 * widget.</p>
	 * @since 1.0
	 */
	public final static Id<Boolean> DELEGABLE = new Id<Boolean>();

	/**
	 * <p>This constant is the default value for the {@link #LIMIT} configurable property 
	 * of a {@link Draggable} object meaning dragging is free in X and Y dimensions. 
	 * The constant is also used as an argument in calling the method {@link #limit(int)}.</p>
	 * @since 1.0
	 */
	public final static int NOLIMIT = 0;
	/**
	 * <p>This constant is a legal value for the {@link #LIMIT} configurable property 
	 * of a {@link Draggable} object meaning only the Y dimension is free for dragging. 
	 * The constant is also used as an argument in calling the method {@link #limit(int)}.</p>
	 * @since 1.0
	 */
	public final static int LIMIT_X = 1;
	/**
	 * <p>This constant is a legal value for the {@link #LIMIT} configurable property 
	 * of a {@link Draggable} object meaning only the X dimension is free for dragging. 
	 * The constant is also used as an argument in calling the method {@link #limit(int)}.</p>
	 * @since 1.0
	 */
	public final static int LIMIT_Y = 2;

	/**
	 * <p>A global identifier for a configurable property of a {@link Draggable} object.</p>
	 * <p>The identified configurable property of a {@link Draggable} object refers to 
	 * an integer value specifying whether and how to limit dragging. Possible values 
	 * are:
	 * <ul>
	 * <li>{@link #NOLIMIT}: No limitations. Dragging is free in both dimensions.</li>
	 * <li>{@link #LIMIT_X}: Limited in X dimension but free in Y dimension.</li>
	 * <li>{@link #LIMIT_Y}: Limited in Y dimension but free in X dimension.</li>
	 * </ul>
	 * </p>
	 * @since 1.0
	 */
	protected final static Id<Integer> LIMIT = new Id<Integer>();
	/**
	 * <p>A global identifier for a configurable property of a {@link Draggable} object.</p>
	 * <p>The identified configurable property of a {@link Draggable} widget refers to 
	 * the mouse handle of the draggable widget.</p>
	 * @since 1.0
	 */
	protected final static Id<Mouse> MOUSE = new Id<Mouse>();

	/**
	 * <p>A typical constructor that constructs a wrapper widget of this type and forces 
	 * constructors of subclasses to pass initializing data.</p>
	 * <p>This constructor invokes the typical constructor of the superclass passing 
	 * the specified initializing object as the argument and attaches the draggable 
	 * widget being created to the configured mouse widget or a new mouse handle 
	 * obtained from the wrapped component if such a mouse handle is not specified in 
	 * the passed initializing object.</p>
	 * @param ini The initializing object.
	 * @since 1.0
	 */
	protected Draggable(ObjectLike ini) {
		super(ini);
		addClasses();
		Mouse h = getMouse();
		if (Js.be(h)) {
			attach(h);
		}
	}

	/**
	 * <p>Constructs a draggable widget that wraps a specified component and makes it 
	 * draggable in accordance with the mouse handle specified as an argument to which 
	 * the newly constructed widget will listen mouse events.</p>
	 * <p>This constructor invokes the typical constructor of this class passing 
	 * an new initializing object as the argument and setting the configurable property 
	 * {@link Widget#COMPONENT} to the argument component, {@link #MOUSE} to the 
	 * argument mouse widget.</p>
	 * @param e The component to be wrapped by the wrapper widget being created.
	 * @param h The mouse widget to be attached to the draggable widget being created.
	 * @since 1.0
	 */
	public Draggable(Component e, Mouse h) {
		this(new Initializer().set(COMPONENT, e).set(MOUSE, h).var());
	}

	/**
	 * <p>Constructs a draggable widget that wraps and drags a specified component.</p>
	 * <p>This constructor simply invokes the constructor {@link #Draggable(Component, Mouse)} 
	 * passing the specified component as the first argument and the mouse widget 
	 * obtained from the same component as the second argument.</p>
	 * @param e The component to be wrapped and dragged by the wrapper widget being 
	 * created.
	 * @since 1.0
	 */
	public Draggable(Component e) {
		this(e, Mouse.getMouse(e));
	}

	/**
	 * <p>Sets a limitation for dragging the draggable widget.</p>
	 * <p>This method simply sets the configurable property {@link #LIMIT} 
	 * of the current draggable widget to the argument value.</p>
	 * @param limit An integer value indicating whether and how to limit dragging. 
	 * See {@link #LIMIT} for possible values. 
	 * @since 1.0
	 * @see #LIMIT
	 * @see #NOLIMIT
	 * @see #LIMIT_X
	 * @see #LIMIT_Y
	 */
	public final void limit(int limit) {
		ini(this).var(LIMIT, limit & (LIMIT_X & LIMIT_Y));
	}

	/**
	 * <p>Gets the mouse handle currently attached to the draggable widget.</p>
	 * <p>This method simply returns the configurable property {@link #MOUSE} 
	 * of the current draggable widget.</p>
	 * @return The mouse widget attached to the draggable.
	 * @since 1.0
	 */
	public final Mouse getMouse() {
		return ini(this).var(MOUSE);
	}

	/**
	 * <p>Attaches a specified mouse handle to the draggable widget.</p>
	 * <p>This method detaches the old mouse handle if there is one and attaches the 
	 * specified one to the current draggable widget enabling it to drag and the 
	 * draggable widget to listen mouse events from the mouse handle with a call to 
	 * the method {@link #listen(Mouse)}. Call this method from event listeners with 
	 * caution.</p>
	 * @param h The new mouse widget to be attached to the draggable.
	 * @since 1.0
	 * @see #detach()
	 */
	public final void attach(Mouse h) {
		if (Js.be(getMouse())) {
			detach();
		}
		ini(this).var(MOUSE, h);
		listen(h);
	}

	/**
	 * <p>Detaches the current mouse handle from the draggable widget.</p>
	 * <p>This method removes the mouse handle currently attached to the draggable 
	 * widget and unregisters it as an event listener from the mouse widget with all 
	 * event types. Call the method from event listeners with caution.</p>
	 * @since 1.0
	 * @see #attach(Mouse)
	 */
	public final void detach() {
		Mouse h = getMouse();
		if (Js.be(h)) {
			unlisten(h);
			ObjectLikes.delete(ini(this), MOUSE);
		}
	}

	/**
	 * <p>Registers this draggable widget as an event listener to a specified mouse 
	 * handle with the necessary event types.</p>
	 * <p>A subclass may either override and invoke this method to register with more event 
	 * types or override but not invoke this method to register with a new set of event 
	 * types. Call the method from event listeners with caution.</p>
	 * @param h A mouse widget.
	 * @since 1.0
	 * @see #unlisten(Mouse)
	 */
	protected void listen(Mouse h) {
		h.addListener(DragStart.class, this);
		h.addListener(DragMove .class, this);
		h.addListener(DragStop .class, this);
	}

	/**
	 * <p>unregisters this draggable widget as an event listener from a specified mouse 
	 * handle with the necessary event types.</p>
	 * <p>A subclass may either override and invoke this method or override but not 
	 * invoke this method to unregister with all the registered event types. Call this 
	 * method from event listeners with caution.</p>
	 * @param h A mouse widget.
	 * @since 1.0
	 * @see #listen(Mouse)
	 */
	protected void unlisten(Mouse h) {
		h.removeListener(DragStart.class, this);
		h.removeListener(DragMove .class, this);
		h.removeListener(DragStop .class, this);
	}

	/**
	 * <p>A global identifier for a configurable property of a {@link Draggable} object.</p>
	 * <p>The identified configurable property of a {@link Draggable} object refers to 
	 * a numerical value caching the X coordinate of the mouse position.</p>
	 * @since 1.0
	 */
	protected final static Id<Double> X = new Id<Double>();
	/**
	 * <p>A global identifier for a configurable property of a {@link Draggable} object.</p>
	 * <p>The identified configurable property of a {@link Draggable} object refers to 
	 * a numerical value caching the Y coordinate of the mouse position.</p>
	 * @since 1.0
	 */
	protected final static Id<Double> Y = new Id<Double>();
	/**
	 * <p>A global identifier for a configurable property of a {@link Draggable} object.</p>
	 * <p>The identified configurable property of a {@link Draggable} object refers to 
	 * a boolean value specifying whether the mouse has started to drag.</p>
	 * @since 1.0
	 */
	protected final static Id<Boolean> START = new Id<Boolean>();
	/**
	 * <p>A global identifier for a configurable property of a {@link Draggable} object.</p>
	 * <p>The identified configurable property of a {@link Draggable} object refers to 
	 * a cached ghost component that is delegated to show dragging process.</p>
	 * @since 1.0
	 */
	protected final static Id<Component> GHOST = new Id<Component>();

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method calls the method {@link #press(Draggable, DragStart)} to prepare 
	 * for dragging and then enters the dragging mode if it is not started.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(DragStart evt) {
		if (Js.not(ini(this).var(START))) {
			press(this, evt);
			ini(this).var(START, true);
		}
	}

	/**
	 * <p>Determines whether a specified draggable widget needs to delegate the dragging 
	 * process to a ghost component.</p>
	 * @param d A draggable widget.
	 * @return <tt>true</tt> if the configurable property {@link #DELEGABLE} of the 
	 * specified draggable widget is <tt>true</tt> or the underlying component wrapped by the 
	 * specified draggable widget is fixed. Otherwise, the method returns <tt>false</tt>.
	 * @since 1.0
	 */
	protected static final boolean delegable(Draggable d) {
		return Js.be(ini(d).var(DELEGABLE)) || Component.fixed(d.unwrap());
	}

	private static final void press(Component e, DragStart evt) {
		ObjectLike ini = ini(e);
		ini.var(DragStart.X, ini(evt).var(DragStart.X));
		ini.var(DragStart.Y, ini(evt).var(DragStart.Y));
		ini.var(X, Component.left(e));
		ini.var(Y, Component.top (e));
	}

	/**
	 * <p>Prepares a draggable widget for dragging with a specified mouse press event.</p>
	 * <p>This method caches the necessary position data of both mouse and underlying 
	 * component and creates a ghost component if it is delegable according to a call to 
	 * the method {@link #delegable(Draggable)}. A subclass may also call this method to 
	 * meet its particular needs.</p>
	 * @param d A draggable widget that is being dragged.
	 * @param evt The mouse press event that starts the dragging mode.
	 * @since 1.0
	 */
	protected static final void press(Draggable d, DragStart evt) {
		d.exec(new Popup());
		Component e = d.unwrap();
		press(e, evt);
		if (delegable(d)) {
			Component g = ghost(e);
			ini(d).var(GHOST, g);
			press(g, evt);
		}
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method moves the draggable widget or its ghost component with a call to 
	 * the method {@link #move(Component, Position, Integer)} accordingly.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(DragMove evt) {
		ObjectLike ini = ini(this);
		if (Js.be(ini.var(START))) {
			if (!delegable(this)) {
				move(unwrap(), evt, ini.var(LIMIT));
			} else {
				move(ini.var(GHOST), evt, ini.var(LIMIT));
			}
		}
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method calls the method {@link #release(Draggable, Position)} to end 
	 * dragging if it is in a dragging mode.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(DragStop evt) {
		if (Js.be(ini(this).var(START))) {
			release(this, evt);
		}
	}

	/**
	 * <p>Releases a draggable widget from dragging mode with a specified mouse position event.</p>
	 * <p>This method moves the underlying component of the argument draggable widget 
	 * with a call to the method {@link #move(Component, Position, Integer)} and deletes 
	 * the ghost component if necessary. A subclass may also call this method to meet its 
	 * particular needs.</p>
	 * @param d A draggable widget that is to exit dragging mode.
	 * @param evt A mouse position event ending the dragging and providing the position 
	 * of mouse at that time.
	 * @since 1.0
	 */
	protected static final void release(Draggable d, Position<?> evt) {
		ObjectLike ini = ini(d);
		ObjectLikes.delete(ini, START);
		if (!Component.fixed(d.unwrap())) {
			move(d.unwrap(), evt, ini.var(LIMIT));
		}
		if (delegable(d)) {
			Component.detach(ini.var(GHOST));
		}
	}

	/**
	 * <p>Moves a specified component with a specified mouse position and a required limitation.</p>
	 * <p>This method moves the specified component by applying a style object created 
	 * with the cached position data and the return result of a call to the method 
	 * {@link #move(double, double, Integer)}. It fires an {@link Animation} event, with 
	 * the style object that has just been created, from the specified component. 
	 * A subclass may also call this method to meet its particular needs.</p>
	 * @param e A component need to move.
	 * @param evt A mouse position providing the end position.
	 * @param limit The limitation of the motion. See {@link #LIMIT} for possible values.
	 * @since 1.0
	 */
	protected static final void move(Component e, Position<?> evt, Integer limit) {
		ObjectLike ini = ini(e);
		ObjectLike p = move(
				ini.var(X) + abs(ini(evt).var(Position.X)) - ini.var(Position.X).doubleValue(),
				ini.var(Y) + abs(ini(evt).var(Position.Y)) - ini.var(Position.Y).doubleValue(),
				limit
		);
		if (Js.not(e.exec(new Animation(p)))) {
			Js.apply(Elements.style(Component.getHTMLElement(e)), p);
		}
	}

	/**
	 * <p>Creates and returns a style object of position data with the specified 
	 * coordinates and limitation.</p>
	 * <p>A subclass may also call this method to meet its particular needs.</p>
	 * @param x The X coordinate.
	 * @param y The Y coordinate.
	 * @param limit Limits a coordinate in an axis direction. See {@link #LIMIT} for 
	 * possible values.
	 * @return The created style object.
	 * @since 1.0
	 */
	protected static final ObjectLike move(double x, double y, Integer limit) {
		ObjectLike p = new Initializer().var();
		if (Js.not(limit) || Js.not(limit & LIMIT_X)) {
			Styles.left(p, Styles.px(x));
		}
		if (Js.not(limit) || Js.not(limit & LIMIT_Y)) {
			Styles.top (p, Styles.px(y));
		}
		return p;
	}

	/**
	 * <p>Returns the absolute value of an integer.</p>
	 * <p>A subclass may also call this method to meet its particular needs.</p>
	 * @param x A number value.
	 * @return The absolute value of the integer. It is never less than 0.
	 * @since 1.0
	 */
	protected static final double abs(Number x) {
		return x.doubleValue() < 0 ? 0 : x.doubleValue();
	}

	private static final Component ghost(Component e) {
		Component g = Component.div();
		Component.addClass(g, css(Resizable.class, "ghost"));
		Component.appendChild(e.getParent(), g);
		ObjectLike p = new Initializer().var();
		Styles.left(p, Styles.px(
				Component.left(g, Component.offsetLeft(e)) - Component.contentLeft(g)
		));
		Styles.top(p, Styles.px(
				Component.top (g, Component.offsetTop (e)) - Component.contentTop (g)
		));
		double w = Component.offsetWidth (e);
		double h = Component.offsetHeight(e);
		if (Browser.isIE) {
			w += Component.contentLeft(g) + Component.contentRight (g);
			h += Component.contentTop (g) + Component.contentBottom(g);
		}
		Styles.width (p, Styles.px(w));
		Styles.height(p, Styles.px(h));
		Component.applyStyle(g, p);
		return g;
	}
}
