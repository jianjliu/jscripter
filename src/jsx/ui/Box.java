
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
import js.Vars;
import jsx.Configurable;
import jsx.core.ArrayLikes;
import jsx.ui.event.OnRender;
import jsx.ui.event.OnStyle;
import jsx.ui.event.Render;
import jsx.ui.event.Style;

/**
 * <p>A base class for box widgets.</p>
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
public class Box<T extends Widget> extends Widget implements OnRender, OnStyle
{
	/**
	 * <p>A global identifier for a configurable property of a {@link Box} widget.</p>
	 * <p>The identified configurable property of a {@link Box} widget is a reference 
	 * to an array of children widgets that are contained by the box widget.</p>
	 * @since 1.0
	 */
	public final static Id<ArrayLike<Widget>> CHILDREN = new Id<ArrayLike<Widget>>();

	/**
	 * <p>Typically constructs a box widget.</p>
	 * <p>This constructor invokes {@link #Box(ObjectLike)}.</p>
	 * @param e The underlying component for the box.
	 * @since 1.0
	 */
	public Box(Component e) {
		this(new Initializer().set(COMPONENT, e).set(CHILDREN, new Vars<Widget>().var()).var());
	}

	/**
	 * <p>Typically constructs a box widget.</p>
	 * @param ini An object for configuration.
	 * @since 1.0
	 */
	protected Box(ObjectLike ini) {
		super(ini);
		addClasses();
		Component.addClass(unwrap(), ROUND_CORNER_ALL);
		if (Js.undefined(ini(this).var(CHILDREN))) {
			ini(this).var(CHILDREN, new Vars<Widget>().var());
		}
		unwrap().addListener(Style.class, this);
		if (isRendered()) {
			layout();
		} else {
			unwrap().addListener(Render.class, this);
		}
	}


	/**
	 * <p>Gets an array of child widgets for the current box.</p>
	 * <p>This method copies the children to a new array so that changing 
	 * the array does not change the box.</p>
	 * @return An array of child widgets for the current box.
	 * @since 1.0
	 */
	@SuppressWarnings("unchecked")
	public ArrayLike<T> children() {
		ArrayLike<T> children = (ArrayLike<T>)ini(this).var(CHILDREN);
		return children;
	}

	/**
	 * <p>Adds an array of child widgets for the current box.</p>
	 * <p>This method will force a layout for the current box if the children list has been changed.</p>
	 * @param awt An array of widgets to be the children of this box.
	 * @since 1.0
	 */
	public final void add(ArrayLike<T> awt) {
		boolean dirty = false;
		for (int i = 0, len = ArrayLikes.length(awt); i < len; i++) {
			dirty = append(awt.get(i)) || dirty;
		}
		if (dirty) {
			layout();
		}
	}

	/**
	 * <p>Adds a widget to the children list of the current box.</p>
	 * <p>This method will force a layout for the current box if the children list has been changed.</p>
	 * @param w A widget to be added to the children list of this box.
	 * @return <tt>true</tt> if the specified widget becomes a new child of the 
	 * box; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	public boolean add(T w) {
		if (append(w)) {
			layout();
			return true;
		}
		return false;
	}

	/**
	 * <p>Inserts a given widget to this box immediately before an existing child widget.</p>
	 * <p>This method will force a layout for the current box if the children list has been changed.</p>
	 * @param w A widget to insert.
	 * @param r An existing child widget for reference.
	 * @return <tt>true</tt> if it is successfully inserted; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	public  boolean insert(T w, T r) {
		return false;
	}

	/**
	 * <p>Appends a given widget to this box.</p>
	 * @param w A widget to append.
	 * @return <tt>true</tt> if it is successfully appended; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	protected boolean append(T w) {
		if (isParentOf(w)) {
			return false;
		}
		boolean ret = Js.be(ini(this).var(CHILDREN).push(w));
		if (ret) {
			Component.addClasses(w.unwrap(), subs("item"));
		}
		return ret;
	}

	/**
	 * <p>Removes a widget from the children list of the current box.</p>
	 * <p>This method will force a layout for the current box if the children list has been changed.</p>
	 * @param w A widget to be removed from the children list of this box.
	 * @return <tt>true</tt> if the specified widget is successfully removed; <tt>false</tt>, 
	 * otherwise.
	 * @since 1.0
	 */
	public boolean remove(T w) {
		if (isParentOf(w)) {
			ArrayLikes.remove(ini(this).var(CHILDREN), w);
			Component.removeClasses(w.unwrap(), subs("item"));
			layout();
			return true;
		}
		return false;
	}

	/**
	 * <p>Lays out the box widget.</p>
	 * <p>This method detaches all the child components from their containing elements
	 * and then attaches them to this box.</p>
	 * @since 1.0
	 */
	public void layout() {
		detach();
		Component c = unwrap();
		ArrayLike<Widget> children = ini(this).var(CHILDREN);
		for (int i = 0, len = ArrayLikes.length(children); i < len; i++) {
			Widget w = children.get(i);
			if (Js.be(w)) {
				Component.appendChild(c, w.unwrap());
			}
		}
	}

	/**
	 * <p>Detaches all the children.</p>
	 * <p>This method detaches all the child components from their containing elements.</p>
	 * @since 1.0
	 */
	public final void detach() {
		ArrayLike<Widget> children = ini(this).var(CHILDREN);
		for (int i = 0, len = ArrayLikes.length(children); i < len; i++) {
			Widget w = children.get(i);
			if (Js.be(w)) {
				Component.detach(w.unwrap());
			}
		}
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method simply forces a layout with a call to the {@link #layout()} method 
	 * and then stops listening to {@link Render} events.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(Render evt) {
		layout();
		unwrap().removeListener(Render.class, this);
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method recursively fires the event from all contained widgets.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(Style evt) {
		ArrayLike<Widget> children = ini(this).var(CHILDREN);
		for (int i = 0, len = ArrayLikes.length(children); i < len; i++) {
			Widget w = children.get(i);
			if (Js.be(w)) {
				w.fire(evt);
			}
		}
	}
}
