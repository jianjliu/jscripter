
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
import js.Id;
import js.Initializer;
import js.Js;
import js.ObjectLike;
import jsx.Configurable;
import jsx.core.ArrayLikes;
import jsx.core.Variables;
import jsx.ui.box.Frame;
import jsx.ui.event.Render;
import jsx.ui.event.Style;

/**
 * <p>A base class for container widgets.</p>
 * <p>A container widget is a {@link Widget} that not only wraps a component that wraps 
 * an HTML containing element, but also contains other widgets whose underlying HTML 
 * elements are graphically contained by the HTML containing element wrapped by the 
 * component of the container widget.</p>
 * <p>A {@link Container} widget is {@link Configurable} and is also an event source which 
 * fires {@link Widget.Event} events. It is meanwhile an event listener that handles 
 * events fired from its underlying component.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Container extends Box<Widget>
{
	private final static Id<Container> CONTAINER = new Id<Container>();

	/**
	 * <p>Returns the container source object if this one is graphically contained by 
	 * another widget.</p>
	 * <p>The wrapped object of a widget must also be a widget. This method simply returns 
	 * the configurable property {@link #CONTAINER} of this widget.</p>
	 * <p>The event queuing and dispatching mechanism of the superclass tries to dispatch 
	 * an event fired from a widget also to its container by calling this method, if this 
	 * source is graphically contained by another valid source and the event wants to 
	 * bubble, that is, its {@link jsx.Source.Event#BUBBLE} configurable property is <tt>true</tt>.</p>
	 * @return The value of the configurable property {@link #CONTAINER} of this widget.
	 * @since 1.0
	 */
	public static final Container getContainer(Widget w) {
		return ini(w).var(CONTAINER);
	}

	/**
	 * <p>Sets the configurable property {@link #CONTAINER} of a specified widget.</p>
	 * @param w The widget to set configurable property {@link #CONTAINER} of.
	 * @param c The container to be set to the configurable property {@link #CONTAINER} of 
	 * the specified widget.
	 * @return The new value of the configurable property {@link #CONTAINER} of the 
	 * specified widget.
	 * @since 1.0
	 */
	protected final static Container setContainer(Widget w, Container c) {
		return ini(w).var(CONTAINER, c);
	}
	/**
	 * <p>A global identifier for a configurable property of a {@link Container} widget.</p>
	 * <p>The identified configurable property of a {@link Container} widget 
	 * is a reference to an array of widgets that are contained by or children of the 
	 * container.</p>
	 * @since 1.0
	 */
	/**
	 * <p>A global identifier for a configurable property of a {@link Frame} widget.</p>
	 * <p>The identified configurable property of a {@link Frame} widget 
	 * is a reference to a {@link Layout} that graphically layouts the children of the 
	 * container.</p>
	 * @since 1.0
	 */
	public final static Id<Layout> LAYOUT = new Id<Layout>();

	/**
	 * <p>Gets the layout manager that graphically layouts the children of the specified 
	 * container.</p>
	 * <p>This method simply returns the {@link #LAYOUT} property of the current container.</p>
	 * @param c The current container.
	 * @return The layout manager of the container.
	 * @since 1.0
	 */
	public static final Layout getLayout(Container c) {
		return ini(c).var(LAYOUT);
	}

	private static final boolean needsLayout(Container c) {
		ArrayLike<Widget> children = ini(c).var(CHILDREN);
		return c.isRendered() && Js.be(getLayout(c)) &&  Js.be(children) && 
			ArrayLikes.length(children) > 0;
	}

	/**
	 * <p>Lays out the children of the current container widget.</p>
	 * <p>This method simply displays all the children of the specified container 
	 * by appending them to the container widget in the same sequence as in the children 
	 * list. It does nothing if the current container is not rendered or does not have a 
	 * child. A subclass should override this method to provide a particular layout.</p>
	 * <p>This method does nothing if the current container is not rendered or does not 
	 * have a layout manager and children.</p>
	 * @since 1.0
	 */
	@Override
	public final void layout() {
		Layout u = getLayout(this);
		if (Js.not(u)) {
			super.layout();
		} else if (needsLayout(this)) {
			u.doLayout(this);
		}
	}
	/**
	 * <p>Sets a layout manager for the current container.</p>
	 * @param ut The new layout manager.
	 * @since 1.0
	 */
	public final void setLayout(Layout ut) {
		ini(this).var(LAYOUT, ut);
		Component e = unwrap();
		ArrayLike<?> listeners = getListeners(e, Style.class);
		for (int i = 0, len = ArrayLikes.length(listeners); i < len; i++) {
			Object on = listeners.get(i);
			if (on instanceof Container) {
				e.removeListener(Style.class, (Container)on);
			}
		}
		e.addListener(Style.class, this);
		layout();
	}

	/**
	 * <p>Constructs a new container that wraps the specified component.</p>
	 * <p>This constructor invokes the typical constructor of this class passing 
	 * a newly created initializing object as the argument and specifying the argument 
	 * component as the wrapped one.</p>
	 * @param e The component to be wrapped by the container being created.
	 * @since 1.0
	 */
	public Container(Component e) {
		this(new Initializer().set(COMPONENT, e).var());
	}

	/**
	 * <p>Constructs a new container with a specified layout manager.</p>
	 * <p>This constructor invokes the typical constructor of this class passing a newly 
	 * created initializing object as argument and sets the specified layout manger.</p>
	 * @param ut A layout manager.
	 * @since 1.0
	 */
	public Container(Layout ut) {
		this(new Initializer().set(
				LAYOUT, ut
		).var());
	}

	/**
	 * <p>The default constructor.</p>
	 * <p>This constructor invokes the typical constructor {@link #Container(ObjectLike)} 
	 * passing a newly created initializing object as the argument.</p>
	 * @since 1.0
	 */
	public Container() {
		this(new Initializer().var());
	}

	/**
	 * <p>A typical constructor forcing constructors of subclasses to pass 
	 * initializing data.</p>
	 * <p>This constructor invokes the typical constructor of the superclass passing 
	 * the specified initializing object as the argument, registers itself with the 
	 * underlying component to listener a {@link Render} event if it has not been 
	 * rendered. If the specified component is rendered, this constructor will force to 
	 * layout in the end.</p>
	 * @param ini The initializing object.
	 * @since 1.0
	 */
	protected Container(ObjectLike ini) {
		super(ini);
	}

	@Override
	protected final boolean append(Widget w) {
		if (Js.not(w.getParent()) && Js.neq(w.unwrap(), Component.body())){
			setContainer(w, this);
			return super.append(w);
		}
		return false;
	}

	/**
	 * <p>Removes a widget from the children list of the current container.</p>
	 * <p>This method will force a layout for the current box if the children list has been changed.</p>
	 * @param wt A widget to be removed from the children list of this container.
	 * @return <tt>true</tt> if the specified widget is successfully removed; <tt>false</tt>, 
	 * otherwise.
	 * @since 1.0
	 */
	@Override
	public final boolean remove(Widget wt) {
		if (Js.eq(wt.getParent(), this)) {
			detach(wt);
			return super.remove(wt);
		}
		return false;
	}

	private static final void detach(Widget wt) {
		Component we = wt.unwrap();
		Component.detach(we);
		setContainer(wt, null);
	}

	/**
	 * <p>Removes all children from the current container.</p>
	 * @since 1.0
	 */
	public static final void removeAll(Container c) {
		ArrayLike<Widget> children = ini(c).var(CHILDREN);
		for (int i = 0, len = ArrayLikes.length(children); i < len; i++) {
			detach(children.get(i));
		}
		ArrayLikes.removeAll(children);
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method asks the layout manager to layout this container for resizing if 
	 * it has possibly been resized and has a layout manager.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	@Override
	public void onEvent(Style evt) {
		if (Js.eq(unwrap(), Style.source(evt))) {
			if (needsLayout(this)) {
				getLayout(this).onResize(this);
			}
		}
	}

	/**
	 * <p>A base class that constructs default layout managers.</p>
	 * <p>A layout manager graphically layouts children for a container.</p>
	 * <p>Note, A layout manger is {@link Configurable}.</p>
	 * 
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 */
	public static abstract class Layout extends Configurable
	{
		/**
		 * <p>A global identifier for a configurable property of a {@link Layout} object.</p>
		 * <p>The identified configurable property of a {@link Layout} object refers to 
		 * the cached content width of the container the layout is in charge of.</p>
		 * @since 1.0
		 */
		protected final static Id<Double> CONTENT_WIDTH  = new Id<Double>();
		/**
		 * <p>A global identifier for a configurable property of a {@link Layout} object.</p>
		 * <p>The identified configurable property of a {@link Layout} object refers to 
		 * the cached content height of the container the layout is in charge of.</p>
		 * @since 1.0
		 */
		protected final static Id<Double> CONTENT_HEIGHT = new Id<Double>();

		/**
		 * <p>Evaluates an integer number and returns 0 if the number is undefined.</p>
		 * @param i The integer number to evaluate.
		 * @return The value of the number or 0 if it is undefined.
		 * @since 1.0
		 */
		protected static final int fix(Integer i) {
			return Variables.undefined(i) ? 0 : i;
		}

		/**
		 * <p>Updates the cached content width for a container.</p>
		 * @param c The container of which to update the cached content width.
		 * @return <tt>true</tt> if the cached width is updated; <tt>false</tt>, 
		 * otherwise.
		 * @since 1.0
		 */
		protected static final boolean updateContentWidth(Container c) {
			Double x1 = ini(c).var(CONTENT_WIDTH);
			double x2 = Component.contentWidth(c.unwrap());
			ini(c).var(CONTENT_WIDTH, x2);
			return Js.neq(x1, x2);
		}

		/**
		 * <p>Updates the cached content height for a container.</p>
		 * @param c The container of which to update the cached content height.
		 * @return <tt>true</tt> if the cached height is updated; <tt>false</tt>, 
		 * otherwise.
		 * @since 1.0
		 */
		protected static final boolean updateContentHeight(Container c) {
			Double x1 = ini(c).var(CONTENT_HEIGHT);
			double x2 = Component.contentHeight(c.unwrap());
			ini(c).var(CONTENT_HEIGHT, x2);
			return Js.neq(x1, x2);
		}

		/**
		 * <p>A typical constructor forcing constructors of subclasses to pass initializing data.
		 * <p>This constructor simply invokes the typical constructor of the superclass passing a 
		 * copy of the specified initializing object, or if the argument one is undefined, a newly 
		 * created {@link ObjectLike} object as the argument.</p>
		 * @param ini The initializing object that can also be created with an object literal. 
		 * @since 1.0
		 */
		protected Layout(ObjectLike ini) {
			super(Js.be(ini) ? Js.apply(
					new Initializer().var(),
					ini
			) : new Initializer().var());
		}

		/**
		 * <p>The default constructor that creates a default layout manager.</p>
		 * <p>This constructor invokes the typical constructor of the superclass passing 
		 * the newly created initializing object as the argument without setting any 
		 * configurable properties.</p>
		 * @since 1.0
		 */
		protected Layout() {
			super(new Initializer().var());
		}

		/**
		 * <p>Layouts a container.</p>
		 * <p>This method simply displays all the children of the specified container 
		 * by appending them to the container in the same sequence as in the children 
		 * list. A subclass should override this method to provide a particular layout.</p>
		 * @param c The container to layout.
		 * @since 1.0
		 */
		protected abstract void doLayout(Container c);

		/**
		 * <p>Layouts a container when notified it has been resized.</p>
		 * <p>This method does nothing. A subclass should override this method to 
		 * perform an action if necessary.</p>
		 * @param c The container to layout on resizing.
		 * @since 1.0
		 */
		protected abstract void onResize(Container c);
	}
}
