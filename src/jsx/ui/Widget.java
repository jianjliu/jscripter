
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

package jsx.ui;

import js.ArrayLike;
import js.Function;
import js.Id;
import js.Initializer;
import js.Js;
import js.ObjectLike;
import js.RegExpLike;
import js.Vars;
import js.dom.EventTarget;
import js.user.JsEvent;
import jsx.Code;
import jsx.Configurable;
import jsx.Source;
import jsx.core.ArrayLikes;
import jsx.core.StringLikes;
import jsx.event.Handle;
import jsx.ui.css.Pseudo;
import jsx.ui.css.StyleSheets;

/**
 * <p>A base class for graphical widgets.</p>
 * <p>A {@link Widget} is either a {@link Component} or a wrapper that wraps a {@link Component} 
 * to encapsulate additional functionalities.</p>
 * <p>Note that, widgets are {@link Configurable} and event sources which fire {@link Widget.Event}.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Widget extends Source
{
	/**
	 * <p>A global identifier for a configurable property of a {@link Widget}.</p>
	 * <p>The identified configurable property of a {@link Widget} 
	 * is a reference to the component wrapped by this widget.</p>
	 * @since 1.0
	 */
	protected final static Id<Component> COMPONENT = new Id<Component>();

	/**
	 * <p>A typical constructor forcing constructors of subclasses to pass an initializing 
	 * object as argument.</p>
	 * <p>This constructor simply invokes the typical constructor of the superclass 
	 * passing the specified initializing object as the argument.</p>
	 * <p>Note that, this constructor sets the configurable property {@link #COMPONENT} of 
	 * this widget to a newly created component which wraps a {@link js.user.JsHTMLDivElement} if 
	 * the property is still undefined.</p>
	 * @param ini The initializing object.
	 * @since 1.0
	 */
	protected Widget(ObjectLike ini) {
		super(ini);
		if (this instanceof Component) {
			ini(this).var(COMPONENT, (Component)this);
		} else if (Js.not(unwrap())) {
			ini(this).var(COMPONENT, Component.div());
		}
	}

	/**
	 * <p>A typical constructor forcing constructors of subclasses to pass 
	 * initializing data.</p>
	 * <p>This constructor simply invokes the typical constructor of the superclass 
	 * passing the specified initializing object as the argument.</p>
	 * <p>Note that, this constructor sets the configurable property {@link #COMPONENT} of 
	 * this widget to the argument component.</p>
	 * @param e The underlying component.
	 * @since 1.0
	 */
	public Widget(Component e) {
		this(new Initializer().set(COMPONENT, e).var());
	}

	/**
	 * <p>Returns the string representation of the component.</p>
	 * @return The string representation of the component.
	 * @since 1.0
	 */
	@Override
	public String toString() {
		return ArrayLikes.join(
				new Vars<String>()
					.add(getClass().getName())
					.add(unwrap().toString())
					.var(),
				":"
		);
	}

	/**
	 * <p>Returns the wrapped component.</p>
	 * <p>The event queuing and dispatching mechanism in the superclass {@link jsx.Source.Event} 
	 * tries to dispatch an event fired from a widget also to its wrapped component by calling 
	 * this method, if this widget does wrap another valid source.</p>
	 * <p>This method simply returns the configurable property {@link #COMPONENT} of this 
	 * wrapper widget.</p>
	 * @return The wrapped component.
	 * @since 1.0
	 */
	@Override
	public final Component unwrap() {
		return ini(this).var(COMPONENT);
	}

	@SuppressWarnings("unchecked")
	private static final ArrayLike<String> all(Class<? extends Widget> cls) {
		if (cls == Widget.class) {
			return new Vars<String>().add(css(Widget.class)).var();
		}
		return ArrayLikes.add(
				all((Class<? extends Widget>)cls.getSuperclass()),
				css(cls)
		);
	}

	/**
	 * <p>Creates a CSS sub-class selector for the current widget.</p>
	 * @param name A sub selector.
	 * @return The created CSS class selector.
	 * @since 1.0
	 */
	protected final String sub(String name) {
		return css(getClass(), name); 
	}

	/**
	 * <p>Creates a CSS sub-class selector for the current widget.</p>
	 * @param name A sub selector.
	 * @return The created CSS class selector.
	 * @since 1.0
	 */
	public final ArrayLike<String> subs(String name) {
		ArrayLike<String> all = all(getClass());
		for (int i = 0, len = ArrayLikes.length(all); i < len; i++) {
			all.set(i, Code.join(all.get(i), "_", name));
		}
		return all; 
	}

	/**
	 * <p>Creates a CSS class selector for a type of widget.</p>
	 * @param cls The class of widget.
	 * @return The created CSS class selector.
	 * @since 1.0
	 */
	protected static final String css(Class<? extends Widget> cls) {
		return StringLikes.replace(cls.getName(), DOTDOLLAR, "_"); 
	}

	private static final RegExpLike DOTDOLLAR = Js.re("\\.|\\$", "g");

	/**
	 * <p>Creates a CSS class selector for a widget class with the name of a sub selector.</p>
	 * @param cls A CSS class of the widget.
	 * @param name A sub selector.
	 * @return The created CSS class selector.
	 * @since 1.0
	 */
	protected static final String css(Class<? extends Widget> cls, String name) {
		return Code.join(css(cls), "_", name);
	}

	/**
	 * <p>A CSS class selector for no select.</p>
	 * @since 1.0
	 */
	protected static final String NOSELECT = "jsx_noselect";

	private static final String ROUND_CORNER = Code.join(Code.join("jsx", "_", "round"), "_", "corner");

	/**
	 * <p>A CSS class selector for top-left round corner.</p>
	 * @since 1.0
	 */
	protected static final String ROUND_CORNER_TL = Code.join(ROUND_CORNER, "_", "tl");
	/**
	 * <p>A CSS class selector for top-right round corner.</p>
	 * @since 1.0
	 */
	protected static final String ROUND_CORNER_TR = Code.join(ROUND_CORNER, "_", "tr");
	/**
	 * <p>A CSS class selector for bottom-left round corner.</p>
	 * @since 1.0
	 */
	protected static final String ROUND_CORNER_BL = Code.join(ROUND_CORNER, "_", "bl");
	/**
	 * <p>A CSS class selector for bottom-right round corner.</p>
	 * @since 1.0
	 */
	protected static final String ROUND_CORNER_BR = Code.join(ROUND_CORNER, "_", "br");
	/**
	 * <p>A CSS class selector for top round corner.</p>
	 * @since 1.0
	 */
	protected static final String ROUND_CORNER_TOP    = Code.join(ROUND_CORNER, "_", "top");
	/**
	 * <p>A CSS class selector for bottom round corner.</p>
	 * @since 1.0
	 */
	protected static final String ROUND_CORNER_BOTTOM = Code.join(ROUND_CORNER, "_", "bottom");
	/**
	 * <p>A CSS class selector for right round corner.</p>
	 * @since 1.0
	 */
	protected static final String ROUND_CORNER_RIGHT  = Code.join(ROUND_CORNER, "_", "right");
	/**
	 * <p>A CSS class selector for left round corner.</p>
	 * @since 1.0
	 */
	protected static final String ROUND_CORNER_LEFT   = Code.join(ROUND_CORNER, "_", "left");
	/**
	 * <p>A CSS class selector for round corners.</p>
	 * @since 1.0
	 */
	protected static final String ROUND_CORNER_ALL    = Code.join(ROUND_CORNER, "_", "all");

	/**
	 * <p>Adds CSS class names to the underlying HTML element.</p>
	 * @since 1.0
	 */
	protected final void addClasses() {
		StyleSheets.prelink();
		Component.addClasses(unwrap(), all(getClass()));
	}

	/**
	 * <p>Returns the container source object if this one is graphically contained by 
	 * another widget.</p>
	 * <p>The wrapped object of a widget must also be a widget.</p>
	 * <p>The event queuing and dispatching mechanism of the superclass tries to dispatch 
	 * an event fired from a widget also to its container by calling this method, if this 
	 * source is graphically contained by another valid source and the event wants to 
	 * bubble, that is, its {@link jsx.Source.Event#BUBBLE} configurable property is <tt>true</tt>.</p>
	 * @return The widget graphically containing this widget.
	 * @since 1.0
	 */
	@Override
	public Component getParent() {
		return unwrap().getParent();
	}

	/**
	 * <p>Determines if the widget is the parent of another widget.</p>
	 * <p>This method simply checks if the wrapped component contains that of  the other 
	 * widget.</p>
	 * @param w Another widget.
	 * @return <tt>true</tt> if the widget contains the other; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	public final boolean isParentOf(Widget w) {
		return w.getParent() == unwrap();
	}

	/**
	 * <p>Determines if the widget has been rendered.</p>
	 * <p>This method simply checks if the wrapped component has wrapped an HTML element.</p>
	 * @return <tt>true</tt> if the widget is rendered; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	public final boolean isRendered() {
		return Js.be(Component.getHTMLElement(unwrap()));
	}

	/**
	 * <p>A global identifier for a configurable property of a {@link Widget}.</p>
	 * <p>The identified configurable property of a {@link Widget} 
	 * is a reference to the {@link Pseudo} object associated with the underlying
	 * component wrapped by this widget.</p>
	 * <p>The property stores a {@link Pseudo} object for "active" pseudo-selector.</p>
	 * @since 1.0
	 */
	protected final static Id<Pseudo> ACTIVE   = new Id<Pseudo>();
	/**
	 * <p>A global identifier for a configurable property of a {@link Widget}.</p>
	 * <p>The identified configurable property of a {@link Widget} 
	 * is a reference to the {@link Pseudo} object associated with the underlying
	 * component wrapped by this widget.</p>
	 * <p>The property stores a {@link Pseudo} object for "focus" pseudo-selector.</p>
	 * @since 1.0
	 */
	protected final static Id<Pseudo> FOCUS    = new Id<Pseudo>();
	/**
	 * <p>A global identifier for a configurable property of a {@link Widget}.</p>
	 * <p>The identified configurable property of a {@link Widget} 
	 * is a reference to the {@link Pseudo} object associated with the underlying
	 * component wrapped by this widget.</p>
	 * <p>The property stores a {@link Pseudo} object for "hidee" pseudo-selector.</p>
	 * @since 1.0
	 */
	protected final static Id<Pseudo> HIDE     = new Id<Pseudo>();
	/**
	 * <p>A global identifier for a configurable property of a {@link Widget}.</p>
	 * <p>The identified configurable property of a {@link Widget} 
	 * is a reference to the {@link Pseudo} object associated with the underlying
	 * component wrapped by this widget.</p>
	 * <p>The property stores a {@link Pseudo} object for "hover" pseudo-selector.</p>
	 * @since 1.0
	 */
	protected final static Id<Pseudo> HOVER    = new Id<Pseudo>();
	/**
	 * <p>A global identifier for a configurable property of a {@link Widget}.</p>
	 * <p>The identified configurable property of a {@link Widget} 
	 * is a reference to the {@link Pseudo} object associated with the underlying
	 * component wrapped by this widget.</p>
	 * <p>The property stores a {@link Pseudo} object for "check" pseudo-selector.</p>
	 * @since 1.0
	 */
	protected final static Id<Pseudo> CHECK    = new Id<Pseudo>();
	/**
	 * <p>A global identifier for a configurable property of a {@link Widget}.</p>
	 * <p>The identified configurable property of a {@link Widget} 
	 * is a reference to the {@link Pseudo} object associated with the underlying
	 * component wrapped by this widget.</p>
	 * <p>The property stores a {@link Pseudo} object for "collapse" pseudo-selector.</p>
	 * @since 1.0
	 */
	protected final static Id<Pseudo> COLLAPSE = new Id<Pseudo>();

	/**
	 * <p>A global identifier for a configurable property of a {@link Widget}.</p>
	 * <p>The identified configurable property of a {@link Widget} 
	 * is a reference to a boolean value associated with the underlying
	 * component wrapped by this widget.</p>
	 * <p>The property indicates whether the widget prevents events.</p>
	 * @since 1.0
	 */
	protected final static Id<Boolean> PREVENTEVENT = new Id<Boolean>();
	/**
	 * <p>A global identifier for a configurable property of a {@link Widget}.</p>
	 * <p>The identified configurable property of a {@link Widget} 
	 * is a reference to a boolean value associated with the underlying
	 * component wrapped by this widget.</p>
	 * <p>The property indicates whether the widget prevents click events.</p>
	 * @since 1.0
	 */
	protected final static Id<Boolean> PREVENTCLICK = new Id<Boolean>();

	/**
	 * <p>Associates a type of high level event to a browser event of the underly HTML element.</p>
	 * <p>This method creates, attaches and returns a {@link Handle}. To destroy the 
	 * association, simply detach the returned {@link Handle} by calling 
	 * {@link Handle#detach()}.</p>
	 * @param bevt The name of a browser event.
	 * @param evt A high level widget event.
	 * @param pid A {@link Id} of a property that tells whether prevents any events.
	 * @return The newly created {@link Handle}.
	 * @since 1.0
	 */
	protected final Handle attachEvent(String bevt, final Event<?> evt, final Id<Boolean> pid) {
		return attachEvent(unwrap(), bevt, evt, pid);
	}

	/**
	 * <p>Associates a type of high level event to a browser event of the given component.</p>
	 * <p>This method creates, attaches and returns a {@link Handle}. To destroy the 
	 * association, simply detach the returned {@link Handle} by calling 
	 * {@link Handle#detach()}.</p>
	 * @param e A component that fires the browser event.
	 * @param bevt The name of a browser event.
	 * @param evt A high level widget event.
	 * @param pid A {@link Id} of a property that tells whether prevents any events.
	 * @return The newly created {@link Handle}.
	 * @since 1.0
	 */
	protected final Handle attachEvent(Component e, String bevt, final Event<?> evt, final Id<Boolean> pid) {
		return attachEvent(Component.getHTMLElement(e), bevt, new Function<Boolean>() {
			@Override
			protected Boolean function(Object jsthis, Call<Boolean> callee) {
				try {
					if (Js.not(ini(unwrap()).var(pid))) {
						fire(evt);
					}
				} catch (Exception e) {}
				return true;
			}
		});
	}

	private static final Handle attachEvent(EventTarget et, String bevt, Function<?> f) {
		Handle h = new Handle(
				et,
				bevt,
				f.var(),
				false
		);
		h.attach();
		return h;
	}

	/**
	 * <p>Associates a type of high level event to a browser event of the underly HTML element.</p>
	 * <p>This method creates, attaches and returns a {@link Handle}. To destroy the 
	 * association, simply detach the returned {@link Handle} by calling 
	 * {@link Handle#detach()}.</p>
	 * @param bevt The name of a browser event.
	 * @param evt A high level widget event.
	 * @return The newly created {@link Handle}.
	 * @since 1.0
	 */
	protected final Handle attachEvent(String bevt, final Event<?> evt) {
		return attachEvent(bevt, evt, PREVENTEVENT);
	}

	/**
	 * <p>An abstract base class for high level events to be fired from widgets.</p>
	 * <p>This class is designed generic with the type parameter being the type of its 
	 * corresponding listener type. A subclass must be concrete and final if it is to be an 
	 * event type. As an event type, the subclass must also declare the type parameter of 
	 * this class as the type of its own listener.</p>
	 * <p>An event listener is typically of an interface with a declared method to react on 
	 * the event it handles so that the class of the event can implement the {@link Event#execute(Object)} 
	 * method by simply calling that declared method passing the event itself as the argument. 
	 * A subclass of this class defines events uniquely typed by the subclass itself and 
	 * designates a listener type corresponding to that type of events.</p>
	 * <p>For an event source to fire an event, the listener of the event must have been 
	 * registered onto the source object with a call to the {@link Source#addListener(Class, Object)} 
	 * method which asks both the type of the event and the listener object for arguments.</p>
	 * <p>Note that, high level events are {@link Configurable}.</p>
	 * 
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 */
	public static abstract class Event<T> extends Source.Event<T>
	{
		/**
		 * <p>A typical constructor forcing constructors of subclasses to pass 
		 * initializing data.</p>
		 * <p>This constructor simply invokes the typical constructor of the superclass 
		 * passing the specified initializing object as the argument.</p>
		 * <p>Note that, this constructor does not change the configurable properties 
		 * {@link Event#BUBBLE} and {@link Event#UPDATE} of this event object.</p>
		 * @since 1.0
		 */
		protected Event(ObjectLike ini) {
			super(ini);
		}

		/**
		 * <p>A typical constructor passing the target component.</p>
		 * <p>This constructor creates an initializing object, sets its configurable 
		 * property {@link #TARGET} to the argument component and then invokes the default 
		 * constructor of this class passing the newly created initializing object as the 
		 * argument.</p>
		 * <p>Note that, this constructor does not change the configurable properties 
		 * {@link Event#BUBBLE} and {@link Event#UPDATE} of this event object.</p>
		 * @since 1.0
		 */
		protected Event(Component target) {
			this(new Initializer().set(TARGET, target).var());
		}

		/**
		 * <p>The default constructor which simply invokes the default constructor of the 
		 * superclass.</p>
		 * <p>Note that, this constructor does not change the configurable properties 
		 * {@link Event#BUBBLE} and {@link Event#UPDATE} of this event object.</p>
		 * @since 1.0
		 */
		protected Event() {
		}

		/**
		 * <p>A global identifier for a configurable property of an {@link Event} object.</p>
		 * <p>The identified configurable property of an {@link Event} object 
		 * is a reference to the browser event held by the high level event.</p>
		 * @since 1.0
		 */
		protected final static Id<JsEvent> BROWSEREVENT = new Id<JsEvent>();
		/**
		 * <p>A global identifier for a configurable property of an {@link Event} object.</p>
		 * <p>The identified configurable property of an {@link Event} object 
		 * is a reference to the target component held by the event.</p>
		 * @since 1.0
		 */
		protected final static Id<Component> TARGET = new Id<Component>();

		/**
		 * <p>Gets the browser event held by the specified high level event.</p>
		 * @param evt The high level event to get browser event from.
		 * @return The browser event held by the specified high level event.
		 * @since 1.0
		 */
		public static final JsEvent getBrowserEvent(Event<?> evt) {
			return ini(evt).var(BROWSEREVENT);
		}
		/**
		 * <p>Gets the component referenced by the configurable property {@link #TARGET} of 
		 * a specified event.</p>
		 * @param evt The event to get target component from.
		 * @return The target component held by the specified event.
		 * @since 1.0
		 */
		public static final Component getTarget(Event<?> evt) {
			return ini(evt).var(TARGET);
		}
	}
}
