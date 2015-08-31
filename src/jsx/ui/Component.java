
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
import js.core.JsFunction;
import js.user.JsDOMException;
import js.user.JsElement;
import js.user.JsHTMLElement;
import js.user.JsNode;
import jsx.Configurable;
import jsx.client.Document;
import jsx.client.Browser;
import jsx.client.Win;
import jsx.core.ArrayLikes;
import jsx.core.ObjectLikes;
import jsx.core.StringLikes;
import jsx.core.Variables;
import jsx.dom.Elements;
import jsx.dom.Markups;
import jsx.dom.Nodes;
import jsx.dom.Styles;
import jsx.event.Handle;
import jsx.ui.css.Pseudo;
import jsx.ui.event.OnRender;
import jsx.ui.event.Render;
import jsx.ui.event.Style;
import jsx.ui.fx.event.Animation;

/**
 * <p>Defines components wrapping HTML or XML elements.</p>
 * <p>A component of this class uniquely wraps an underlying HTML or XML element. It is a 
 * {@link Widget} and can be wrapped by {@link Widget} to make more complex widgets.</p>
 * <p>Note that, components are {@link Configurable} and event sources which may fire 
 * {@link Widget.Event} high level events.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Component extends Widget implements OnRender
{
	private final static Id<JsElement> ELEMENT = new Id<JsElement>();
	private final static Id<String> HTML = new Id<String>();
	private final static Id<Boolean> DIV = new Id<Boolean>();
	private final static Id<Boolean> SPAN = new Id<Boolean>();
	private final static Id<Boolean> FIXED = new Id<Boolean>();

	/**
	 * <p>Returns the underlying opaque element.</p>
	 * @param e The current component.
	 * @return The wrapped XML or HTML element.
	 * @since 1.0
	 */
	public static final JsElement getElement(Component e) {
		return ini(e).var(ELEMENT);
	}

	/**
	 * <p>Returns the underlying opaque element as an HTML element.</p>
	 * @param e The current component.
	 * @return The wrapped HTML element.
	 * @since 1.0
	 */
	public static final JsHTMLElement getHTMLElement(Component e) {
		return new JsHTMLElement(getElement(e));
	}

	/**
	 * <p>Returns the HTML text of the underlying element.</p>
	 * @param e The current component.
	 * @return The HTML text of the underlying element.
	 * @since 1.0
	 */
	public static final String getHTML(Component e) {
		return ini(e).var(HTML);
	}

	/**
	 * <p>Determines if the underlying element is an HTML <tt>&lt;div&gt;</tt> element.</p>
	 * @param e The current component.
	 * @return <tt>true</tt> if the underlying element is an HTML <tt>&lt;div&gt;</tt> 
	 * element; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	public static final boolean div(Component e) {
		if (Variables.undefined(ini(e).var(DIV))) {
			ini(e).var(DIV, Nodes.tagName(Component.getHTMLElement(e)) == "DIV");
		}
		return ini(e).var(DIV);
	}

	/**
	 * <p>Determines if the underlying element is an HTML <tt>&lt;span&gt;</tt> element.</p>
	 * @param e The current component.
	 * @return <tt>true</tt> if the underlying element is an HTML <tt>&lt;span&gt;</tt> 
	 * element; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	public static final boolean span(Component e) {
		if (Variables.undefined(ini(e).var(SPAN))) {
			ini(e).var(SPAN, Nodes.tagName(Component.getHTMLElement(e)) == "SPAN" ||
					Nodes.tagName(Component.getHTMLElement(e)) == "NOBR");
		}
		return ini(e).var(SPAN);
	}

	/**
	 * <p>Determines if the underlying element is fixed.</p>
	 * @param e The current component.
	 * @return <tt>true</tt> if the underlying element is fixed; <tt>false</tt>, otherwise.
	 * @since 1.0
	 * @see #fix(Component, boolean)
	 */
	public static final boolean fixed(Component e) {
		return Js.be(ini(e).var(FIXED));
	}

	/**
	 * <p>Fixes the underlying element.</p>
	 * @param e The current component.
	 * @since 1.0
	 * @see #fixed(Component)
	 */
	public static final void fix(Component e, boolean fixed) {
		ini(e).var(FIXED, fixed);
	}

	private static int untitled = 1;

	/**
	 * <p>Creates a component for untitled.</p>
	 * @return The component for untitled.
	 * @since 1.0
	 * @see #title(String)
	 */
	public static final Component untitled() {
		return new Component(Markups.span(Js.add("Untitled", untitled++)));
	}

	/**
	 * <p>Creates a component for a title.</p>
	 * @param html The HTML text for the title.
	 * @return The component for the title.
	 * @since 1.0
	 * @see #untitled()
	 */
	public static final Component title(String html) {
		return new Component(Markups.span(html));
	}

	/**
	 * <p>Determines whether a component contains another.</p>
	 * @param p A component.
	 * @param c A component.
	 * @return <tt>true</tt> if the underlying HTML element of the component <tt>p</tt> 
	 * contains the underlying HTML element of the component <tt>c</tt>; <tt>false</tt>, 
	 * otherwise.
	 * @since 1.0
	 */
	public static final boolean contains(Component p, Component c) {
		return Nodes.contains(getHTMLElement(p), getHTMLElement(c));
	}

	private final static Id<ObjectLike> ATTRIBUTE = new Id<ObjectLike>();
	private final static Id<ObjectLike> CACHE = new Id<ObjectLike>();
	private final static Id<ObjectLike> STYLE = new Id<ObjectLike>();
	private final static Id<ArrayLike<String>> CLASS = new Id<ArrayLike<String>>();
	private final static Id<Component> PARENT = new Id<Component>();
	private final static Id<ArrayLike<Component>> CHILDREN = new Id<ArrayLike<Component>>();

	/**
	 * <p>Returns the id of the underlying element.</p>
	 * <p>No two elements within the same document should have the same value for 
	 * {@link JsHTMLElement#id}.</p>
	 * @param e The current component.
	 * @return The {@link JsHTMLElement#id} property of the underlying element.
	 * @since 1.0
	 */
	public static final String id(Component e) {
		return JsHTMLElement.id.with(getElement(e));
	}

	/**
	 * <p>Returns the title of the underlying element.</p>
	 * <p>Web browsers display the value of the {@link JsHTMLElement#title} attribute in 
	 * a tool tip when the mouse hovers over the element.</p>
	 * @param e The current component.
	 * @return The {@link JsHTMLElement#title} attribute of the underlying element.
	 * @since 1.0
	 */
	public static final String title(Component e) {
		return JsHTMLElement.title.with(getElement(e));
	}

	/**
	 * <p>Sets new id of the underlying element.</p>
	 * <p>No two elements within the same document should have the same value for 
	 * {@link JsHTMLElement#id}.</p>
	 * @param e The current component.
	 * @param id The new id to be set to the {@link JsHTMLElement#id} property of the 
	 * underlying element.
	 * @return The new id.
	 * @since 1.0
	 */
	public static final String id(Component e, String id) {
		JsHTMLElement he = getHTMLElement(e);
		return Js.be(he) ? JsHTMLElement.id.with(he, id) : 
			JsHTMLElement.id.with(ini(e).var(ATTRIBUTE), id);
	}

	/**
	 * <p>Sets new title of the underlying element.</p>
	 * <p>Web browsers display the value of the {@link JsHTMLElement#title} attribute in 
	 * a tool tip when the mouse hovers over the element.</p>
	 * @param e The current component.
	 * @param title The new title to be set to the {@link JsHTMLElement#title} property of 
	 * the underlying element.
	 * @return The new title.
	 * @since 1.0
	 */
	public static final String title(Component e, String title) {
		JsHTMLElement he = getHTMLElement(e);
		return Js.be(he) ? JsHTMLElement.title.with(he, title) : 
			JsHTMLElement.title.with(ini(e).var(ATTRIBUTE), title);
	}

	/**
	 * <p>Gets the style object being applied to the underlying element.</p>
	 * @param e The current component.
	 * @return The style object being applied to the underlying element.
	 * @since 1.0
	 */
	public static final ObjectLike style(Component e) {
		return ini(e).var(STYLE);
	}

	/**
	 * <p>Adds a CSS class name to the underlying HTML element.</p>
	 * @param e The current component.
	 * @param cls The class name to add.
	 * @since 1.0
	 */
	public static final void addClass(Component e, String cls) {
		JsHTMLElement he = getHTMLElement(e);
		if (Js.be(he)) {
			Elements.addClass(he, cls);
			calculate(e);
		} else {
			ArrayLikes.push(ini(e).var(CLASS), cls);
		}
	}

	/**
	 * <p>Removes a CSS class name from the underlying HTML element.</p>
	 * @param e The current component.
	 * @param cls The class name to add.
	 * @since 1.0
	 */
	public static final void removeClass(Component e, String cls) {
		JsHTMLElement he = getHTMLElement(e);
		if (Js.be(he)) {
			Elements.removeClass(he, cls);
			calculate(e);
		} else {
			ArrayLikes.remove(ini(e).var(CLASS), cls);
		}
	}

	/**
	 * <p>Adds CSS class names to the underlying HTML element.</p>
	 * @param e The current component.
	 * @param classes An array of CSS class names to add.
	 * @since 1.0
	 */
	public static final void addClasses(Component e, ArrayLike<String> classes) {
		JsHTMLElement he = getHTMLElement(e);
		if (Js.be(he)) {
			Elements.addClasses(he, classes);
			calculate(e);
		} else {
			for (int i = 0, len = ArrayLikes.length(classes); i < len; i++) {
				ArrayLikes.push(ini(e).var(CLASS), classes.get(i));
			}
		}
	}

	/**
	 * <p>Removes CSS class names from the underlying HTML element.</p>
	 * @param e The current component.
	 * @param classes An array of CSS class names to remove.
	 * @since 1.0
	 */
	public static final void removeClasses(Component e, ArrayLike<String> classes) {
		JsHTMLElement he = getHTMLElement(e);
		if (Js.be(he)) {
			Elements.removeClasses(he, classes);
			calculate(e);
		} else {
			for (int i = 0, len = ArrayLikes.length(classes); i < len; i++) {
				ArrayLikes.remove(ini(e).var(CLASS), classes.get(i));
			}
		}
	}

	/**
	 * <p>Applies a style object to the underlying HTML element.</p>
	 * @param e The current component.
	 * @param p The style object to apply.
	 * @param animated Whether fires an {@link Animation} command from the component.
	 * @since 1.0
	 */
	public static final void applyStyle(Component e, ObjectLike p, boolean animated) {
		ObjectLike style = style(e);
		if (Js.be(style)) {
			if (animated) {
				e.exec(new Animation(p));
			}
			Js.apply(style, p);
			e.fire(new Style(Js.apply(new Initializer().var(), p)));
			if (Styles.relevant(p, Styles.BMP)) {
				calculate(e);
			}
		} else {
			Js.apply(ini(e).var(CACHE), p);
		}
	}

	/**
	 * <p>Applies a style object to the underlying HTML element.</p>
	 * @param e The current component.
	 * @param p The style object to apply.
	 * @since 1.0
	 */
	public static final void applyStyle(Component e, ObjectLike p) {
		applyStyle(e, p, false);
	}

	/**
	 * <p>Gets or creates a {@link Pseudo} widget associated with this component.</p>
	 * @param id Identifies where to store the {@link Pseudo} widget.
	 * @param bevt A browser event type.
	 * @return The required {@link Pseudo} widget.
	 * @since 1.0
	 */
	public final Pseudo pseudo(Id<Pseudo> id, String bevt) {
		ObjectLike ini = ini(this);
		Pseudo ps = ini.var(id);
		if (Js.not(ps)) {
			ps = new Pseudo(this, bevt);
			ini.var(id, ps);
		}
		return ps;
	}

	/**
	 * <p>Handles a browser event from the underly HTML element.</p>
	 * @param bevt A browser event.
	 * @param lstnr A browser event listener.
	 * @return The newly created {@link Handle}.
	 * @since 1.0
	 */
	public final Handle handle(String bevt, JsFunction<?> lstnr) {
		Handle h = new Handle(
				Component.getHTMLElement(this),
				bevt, lstnr, false
		);
		h.attach();
		return h;
	}

	private Component(JsElement e) {
		super(new Initializer().set(
				ELEMENT, e
		).set(
				CACHE, new Initializer().var()
		).var());
	}

	/**
	 * <p>Constructs a component wrapping an HTML element if rendered.</p>
	 * @param html The HTML text to create underlying HTML element when rendered.
	 * @since 1.0
	 */
	public Component(String html) {
		super(new Initializer().set(
				HTML, html
		).set(
				ATTRIBUTE, new Initializer().var()
		).set(
				CACHE, new Initializer().var()
		).set(
				CLASS, new Vars<String>().var()
		).set(
				CHILDREN, new Vars<Component>().var()
		).var());
		addListener(Render.class, this);
	}

	/**
	 * <p>Returns the string representation of the component.</p>
	 * @return The string representation of the component.
	 * @since 1.0
	 */
	@Override
	public final String toString() {
		return ArrayLikes.join(
				new Vars<String>()
					.add(getClass().getName())
					.add(getHTMLElement(this).toString())
					.var(),
				":"
		);
	}

	/**
	 * <p>Gets the rendered element or adds rendering listener to the current component.</p>
	 * <p>This method simply returns the underlying HTML element if the current 
	 * component has been rendered.</p>
	 * @param e The current component.
	 * @param on A rendering listener.
	 * @return The underlying HTML element or <tt>null</tt> if <tt>e</tt> is not rendered.
	 * @since 1.0
	 */
	public static final JsHTMLElement getRendered(Component e, OnRender on) {
		JsHTMLElement he = getHTMLElement(e);
		if (Js.not(he)) {
			e.addListener(Render.class, on);
		}
		return he;
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method renders all the child components it has by calling the {@link #appendChild(Component, Component)} 
	 * method, which fires {@link Render} events from the child components and forces them 
	 * to render their children accordingly.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(Render evt) {
		ObjectLike ini = ini(this);
		ArrayLike<Component> children = ini.var(CHILDREN);
		for (int i = 0, len = ArrayLikes.length(children); i < len; i++) {
			appendChild(this, children.get(i));
		}
		ObjectLikes.delete(ini, CHILDREN);
	}

	private final static String REF = ":xel";
	private static int NXT = 0;

	private static final void syncAttribute(Component e) {
		JsHTMLElement he = getHTMLElement(e);
		if (Js.be(he)) {
			Js.apply(he, ini(e).var(ATTRIBUTE));
			ini(e).var(ATTRIBUTE, new Initializer().var());
		}
	}

	private static final void syncStyle(Component e) {
		if (Js.be(style(e))) {
			Js.apply(style(e), ini(e).var(CACHE));
			ini(e).var(CACHE, new Initializer().var());
		}
	}

	/**
	 * <p>Appends the child component to the parent component.</p>
	 * <p>This method simply adds the child component to the children list of the parent 
	 * component if the parent component has not been rendered. Otherwise, if the child 
	 * component has been rendered, the method simply appends the child element to the 
	 * parent element; if not, the method creates a new HTML element by inserting the 
	 * {@link #HTML} value to the parent element, updates cached styles of the child 
	 * component and forces all of its children to render by firing a {@link Render} event 
	 * from the newly rendered component.</p>
	 * @param p The parent component.
	 * @param c The child component.
	 * @return <tt>true</tt> if the operation is successful; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	public static final boolean appendChild(Component p, Component c) {
		if (Js.eq(c, body())) {
			return false;
		}
		JsHTMLElement pe = getHTMLElement(p);
		if (Js.not(pe)) {
			ArrayLikes.push(ini(p).var(CHILDREN), c);
			ini(c).var(PARENT, p);
		} else {
			JsHTMLElement ce = getHTMLElement(c);
			if (Js.be(ce)) {
				if (Js.be(c.getParent())) {
					return false;
				}
				pe.appendChild(ce);
				ini(c).var(PARENT, p);
			} else {
				accept(c, Markups.insertBeforeEnd(
						pe,
						getHTML(c)
				));
				ini(c).var(PARENT, p);
				c.exec(new Render(p));
			}
		}
		return true;
	}

	private static final void accept(Component c, JsHTMLElement e) {
		e.var(REF, c);
		ini(c).var(ELEMENT, e);
		ini(c).var(STYLE, Elements.style(e));
		genId(e);
		syncAttribute(c);
		syncStyle(c);
		Elements.addClasses(e, ini(c).var(CLASS));
		calculate(c);
	}

	/**
	 * <p>Appends the child component to the parent component.</p>
	 * <p>This method simply adds the child component to the children list of the parent 
	 * component if the parent component has not been rendered. Otherwise, if the child 
	 * component has been rendered, the method simply appends the child element to the 
	 * parent element; if not, the method creates a new HTML element by inserting the 
	 * {@link #HTML} value to the parent element, updates cached styles of the child 
	 * component and forces all of its children to render by firing a {@link Render} event 
	 * from the newly rendered component.</p>
	 * @param p The parent component.
	 * @param c The child component.
	 * @param r The reference component.
	 * @return <tt>true</tt> if the operation is successful; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	public static final boolean insertBefore(Component p, Component c, Component r) {
		if (Js.eq(c, body())) {
			return false;
		}
		JsHTMLElement pe = getHTMLElement(p);
		if (Js.not(pe)) {
			ArrayLikes.insert(ini(p).var(CHILDREN), c, r);
			ini(c).var(PARENT, p);
		} else {
			JsHTMLElement re = getHTMLElement(r);
			if (Js.not(re)) {
				ini(c).var(PARENT, p);
				return appendChild(p, c);
			}
			JsHTMLElement ce = getHTMLElement(c);
			if (Js.be(ce)) {
				if (Js.be(c.getParent())) {
					return false;
				}
				pe.insertBefore(ce, re);
				ini(c).var(PARENT, p);
			} else {
				accept(c, Markups.insertBeforeBegin(
						re,
						getHTML(c)
				));
				ini(c).var(PARENT, p);
				c.exec(new Render(p));
			}
		}
		return true;
	}

	/**
	 * <p>Gets the first child component of the specified one.</p>
	 * <p>The method returns the component wrapping the element that is the first child 
	 * of the underlying element of the argument component.</p>
	 * @param p A parent component.
	 * @return The first child component of the specified one.
	 * @since 1.0
	 */
	public static final Component firstChild(Component p) {
		JsNode e = getElement(p);
		return Js.be(e) ? get(JsElement.firstChild.with(e)) :
			ini(p).var(CHILDREN).get(0);
	}

	/**
	 * <p>Gets the component that wraps the HTML <tt>&lt;body&gt;</tt> element of the 
	 * current HTML document.</p>
	 * @return The newly created component.
	 * @since 1.0
	 */
	public static final Component body() {
		return get(Document.body.var());
	}

	/**
	 * <p>Gets the component that wraps an HTML <tt>&lt;div&gt;</tt> element.</p>
	 * @return The newly created component.
	 * @since 1.0
	 */
	public static final Component div() {
		return new Component(Markups.DIV);
	}

	/**
	 * <p>Gets the component that wraps an HTML <tt>&lt;span&gt;</tt> element.</p>
	 * @return The newly created component.
	 * @since 1.0
	 */
	public static final Component span() {
		return new Component(Markups.SPAN);
	}

	/**
	 * <p>Gets a component wrapping an HTML element that has the specified id.</p>
	 * <p>This method simply calls the {@link Nodes#getElementById(String)} method to find 
	 * the element and then calls the {@link #get(JsElement)} method to return a component 
	 * for it.</p>
	 * @param id The id of an HTML element.
	 * @return The component wrapping an HTML element that has the specified id.
	 * @since 1.0
	 */
	public static final Component getById(String id) {
		return get(Nodes.getElementById(id));
	}

	private static final synchronized String genId(JsElement e) {
		String id = Elements.id(e);
		if (Js.not(id)) {
			id = Js.add(Component.class.getName(), NXT++);
			Elements.id(e, id);
		}
		return id;
	}

	/**
	 * <p>Gets the component for an element.</p>
	 * <p>The method simply returns the component that wraps the specified element if 
	 * there is one. Otherwise, it creates one to wrap the element and returns the newly 
	 * created component.</p>
	 * @param e An underlying element.
	 * @return A component that wraps the specified element.
	 * @since 1.0
	 */
	public static final Component get(JsElement e) {
		if (Js.not(e)) {
			return null;
		}
		Object o = e.var(REF);
		if (Js.be(o)) {
			return (Component)o;
		}
		Component we = new Component(e);
		e.var(REF, we);
		genId(e);
		if (Elements.isHTMLElement(e)) {
			ini(we).var(STYLE, Elements.style(new JsHTMLElement(e)));
			calculate(we);
		}
		return we;
	}

	/**
	 * <p>Gets the parent component of this one.</p>
	 * <p>The method returns the component wrapping the element that is the parent of the 
	 * underlying element of the argument component.</p>
	 * @return The parent component of the current one.
	 * @since 1.0
	 */
	@Override
	public final Component getParent() {
		Component p = ini(this).var(PARENT);
		if (Js.not(p)) {
			p = getParent(getElement(this));
			ini(this).var(PARENT, p);
		}
		return p;
	}

	private static final Component getParent(JsElement e) {
		if (Js.not(e)) return null;
		JsElement p = Elements.parentNode(e);
		if (Browser.isIE && Js.be(p) && Elements.isHTMLElement(e)) {
			String pid = JsHTMLElement.id.with(e);
			if (Js.not(getById(pid))) {
				p = null;
			}
		}
		return get(p);
	}

	/**
	 * <p>Removes a child component from its parent.</p>
	 * <p>The method removes the underlying element of the argument component from its 
	 * parent node by calling the {@link Nodes#detach(JsNode)} method.</p>
	 * @param c A child component.
	 * @since 1.0
	 */
	public static final void detach(Component c) {
		JsElement ce = getElement(c);
		if (Js.be(ce)) {
			Nodes.detach(ce);
		}
		ObjectLikes.delete(ini(c), PARENT);
	}

	/**
	 * <p>Gets the position style of the underlying HTML element of a component.</p>
	 * @param e The current component.
	 * @return The position style of the underlying HTML element of the component.
	 * @since 1.0
	 * @see #isAbsolute(Component)
	 * @see #isRelative(Component)
	 */
	public static final String position(Component e) {
		return Styles.position(Elements.currentStyle(getHTMLElement(e)));
	}

	/**
	 * <p>Is the underlying HTML element of a component being absolutely positioned?</p>
	 * @param e The current component.
	 * @return <tt>true</tt> if the <tt>position</tt> style of the underlying HTML element 
	 * is "absolute"; <tt>false</tt>, otherwise.
	 * @since 1.0
	 * @see #position(Component)
	 * @see #isRelative(Component)
	 */
	public static final boolean isAbsolute(Component e) {
		return Js.eq(position(e), "absolute");
	}

	/**
	 * <p>Is the underlying HTML element of a component being relatively positioned?</p>
	 * @param e The current component.
	 * @return <tt>true</tt> if the <tt>position</tt> style of the underlying HTML element 
	 * is "relative"; <tt>false</tt>, otherwise.
	 * @since 1.0
	 * @see #position(Component)
	 * @see #isAbsolute(Component)
	 */
	public static final boolean isRelative(Component e) {
		return Js.eq(position(e), "relative");
	}

	/**
	 * <p>Makes the underlying element to absolute positioning style.</p>
	 * @param e The current component.
	 * @since 1.0
	 * @see #relative(Component)
	 */
	public static final void absolute(Component e) {
		ObjectLike p = new Initializer().var();
		Styles.position(p, "absolute");
		applyStyle(e, p);
	}

	/**
	 * <p>Makes the underlying element to relative positioning style.</p>
	 * @param e The current component.
	 * @since 1.0
	 * @see #absolute(Component)
	 */
	public static final void relative(Component e) {
		ObjectLike p = new Initializer().var();
		Styles.position(p, "relative");
		applyStyle(e, p);
	}

	/**
	 * <p>Sets visibility of the underlying HTML element.</p>
	 * @param e The current component.
	 * @param s The value of visibility.
	 * @since 1.0
	 */
	public static final void visibility(Component e, String s) {
		ObjectLike p = new Initializer().var();
		Styles.visibility(p, s);
		applyStyle(e, p);
	}

	/**
	 * <p>Gets the transparency style value of the underlying HTML element of a component.</p>
	 * @param e The current component.
	 * @return The transparency value of the underlying HTML element of the component.
	 * @since 1.0
	 * @see #transparency(Component, double)
	 */
	public static final double transparency(Component e) {
		return Styles.transparency(Elements.currentStyle(getHTMLElement(e)));
	}
	/**
	 * <p>Sets the transparency style value of the underlying HTML element of a component.</p>
	 * @param e The current component.
	 * @param v The new transparency value.
	 * @since 1.0
	 * @see #transparency(Component)
	 */
	public static final void transparency(Component e, double v) {
		Elements.transparency(getHTMLElement(e), v);
	}

	/**
	 * <p>Computes and returns the X coordinate of the upper-left corner of the underlying 
	 * element relative to the whole page.</p>
	 * <p>This method has eliminated browser dependencies and is useful for components of 
	 * absolutely positioned element move or resize according to mouse events that can only 
	 * provide position data of page context.</p>
	 * @return The X coordinate of the upper-left corner of the element wrapped by this 
	 * component.
	 * @see #pageTop()
	 */
	public final double pageLeft() {
		double x = offsetLeft(this);
		JsHTMLElement p = Elements.offsetParent(getHTMLElement(this));
		if (Js.be(p) && Js.neq(p, Win.document.var())) {
			Component pe = get(p);
			x = x + border(pe, BORDERLEFT) + pe.pageLeft();
		}
		return x;
	}

	/**
	 * <p>Computes and returns the Y coordinate of the upper-left corner of the underlying 
	 * element relative to the whole page.</p>
	 * <p>This method has eliminated browser dependencies and is useful for components of 
	 * absolutely positioned element move or resize according to mouse events that can only 
	 * provide position data of page context.</p>
	 * @return The Y coordinate of the upper-left corner of the element wrapped by this 
	 * component.
	 * @see #pageTop()
	 */
	public final double pageTop() {
		double y = offsetTop(this);
		JsHTMLElement p = Elements.offsetParent(getHTMLElement(this));
		if (Js.be(p) && Js.neq(p, Win.document.var())) {
			Component pe = get(p);
			y = y + border(pe, BORDERTOP) + pe.pageTop();
		}
		return y;
	}

	/**
	 * <p>A constant used with the {@link #border(Component, int)} method to return 
	 * the left border width of a component.</p>
	 * @since 1.0
	 */
	public final static int BORDERLEFT    = 0;
	/**
	 * <p>A constant used with the {@link #border(Component, int)} method to return 
	 * the right border width of a component.</p>
	 * @since 1.0
	 */
	public final static int BORDERRIGHT   = 1;
	/**
	 * <p>A constant used with the {@link #border(Component, int)} method to return 
	 * the top border width of a component.</p>
	 * @since 1.0
	 */
	public final static int BORDERTOP     = 2;
	/**
	 * <p>A constant used with the {@link #border(Component, int)} method to return 
	 * the bottom border width of a component.</p>
	 * @since 1.0
	 */
	public final static int BORDERBOTTOM  = 3;
	/**
	 * <p>A constant used with the {@link #margin(Component, int)} method to return 
	 * the left margin of a component.</p>
	 * @since 1.0
	 */
	public final static int MARGINLEFT    = 0;
	/**
	 * <p>A constant used with the {@link #margin(Component, int)} method to return 
	 * the right margin of a component.</p>
	 * @since 1.0
	 */
	public final static int MARGINRIGHT   = 1;
	/**
	 * <p>A constant used with the {@link #margin(Component, int)} method to return 
	 * the top margin of a component.</p>
	 * @since 1.0
	 */
	public final static int MARGINTOP     = 2;
	/**
	 * <p>A constant used with the {@link #margin(Component, int)} method to return 
	 * the bottom margin of a component.</p>
	 * @since 1.0
	 */
	public final static int MARGINBOTTOM  = 3;
	/**
	 * <p>A constant used with the {@link #padding(Component, int)} method to return 
	 * the left padding of a component.</p>
	 * @since 1.0
	 */
	public final static int PADDINGLEFT   = 0;
	/**
	 * <p>A constant used with the {@link #padding(Component, int)} method to return 
	 * the right padding of a component.</p>
	 * @since 1.0
	 */
	public final static int PADDINGRIGHT  = 1;
	/**
	 * <p>A constant used with the {@link #padding(Component, int)} method to return 
	 * the top padding of a component.</p>
	 * @since 1.0
	 */
	public final static int PADDINGTOP    = 2;
	/**
	 * <p>A constant used with the {@link #padding(Component, int)} method to return 
	 * the bottom padding of a component.</p>
	 * @since 1.0
	 */
	public final static int PADDINGBOTTOM = 3;

	private final static Id<ArrayLike<Double>> BORDERS  = new Id<ArrayLike<Double>>();
	private final static Id<ArrayLike<Double>> MARGINS  = new Id<ArrayLike<Double>>();
	private final static Id<ArrayLike<Double>> PADDINGS = new Id<ArrayLike<Double>>();
	private final static ArrayLike<String> DIRS = new Vars<String>()
		.add("Left").add("Right").add("Top").add("Bottom").var();

	/**
	 * <p>Forces a component to recalculate its cached data of borders, margins, paddings, 
	 * etc.</p>
	 * @param e A component is to update its cache.
	 * @since 1.0
	 */
	public static final void calculate(Component e) {
		ArrayLike<Double> borders  = new Vars<Double>().var();
		ArrayLike<Double> margins  = new Vars<Double>().var();
		ArrayLike<Double> paddings = new Vars<Double>().var();
		ObjectLike ini = ini(e);
		ObjectLike cs = Elements.currentStyle(getHTMLElement(e));
		if (Js.be(cs)) {
			for (int i = 0; i < 4; i++) {
				String dir = DIRS.get(i);
				borders .set(i, Styles.px((String)cs.var(Js.add("border" , Js.add(dir, "Width")))));
				margins .set(i, Styles.px((String)cs.var(Js.add("margin" , dir))));
				paddings.set(i, Styles.px((String)cs.var(Js.add("padding", dir))));
			}
			if (margins.get(MARGINTOP) > 0 && Browser.userAgent("Firefox/3.6")) {
				margins.set(MARGINTOP, margins.get(MARGINTOP) - 1);
			}
		}
		ini.var(BORDERS , borders );
		ini.var(MARGINS , margins );
		ini.var(PADDINGS, paddings);
	}

	/**
	 * <p>Returns the widths of the left, right, top and bottom borders of a component 
	 * as an array.</p>
	 * <p>This method only returns the cached data. To update the cache of a component, 
	 * use the {@link #calculate(Component)} method.</p>
	 * @return A list of border widths of the specified component.
	 * @since 1.0
	 */
	public static final ArrayLike<Double> borders(Component e) {
		return ArrayLikes.slice(ini(e).var(BORDERS), 0);
	}
	/**
	 * <p>Returns the left, right, top and bottom margins of a component as an array.</p>
	 * <p>This method only returns the cached data. To update the cache of a component, 
	 * use the {@link #calculate(Component)} method.</p>
	 * @return A list of margins of the specified component.
	 * @since 1.0
	 */
	public static final ArrayLike<Double> margins(Component e) {
		return ArrayLikes.slice(ini(e).var(MARGINS), 0);
	}
	/**
	 * <p>Returns the left, right, top and bottom paddings of a component as an array.</p>
	 * <p>This method only returns the cached data. To update the cache of a component, 
	 * use the {@link #calculate(Component)} method.</p>
	 * @return A list of paddings of the specified component.
	 * @since 1.0
	 */
	public static final ArrayLike<Double> paddings(Component e) {
		return ArrayLikes.slice(ini(e).var(PADDINGS), 0);
	}

	/**
	 * <p>Returns the width of a border of the specified component.</p>
	 * <p>This method only returns the cached data. To update the cache of a component, 
	 * use the {@link #calculate(Component)} method.</p>
	 * @param i The index of the border to get width.
	 * @return The width of the <tt>i</tt>th border of the specified component.
	 * @since 1.0
	 * @see #BORDERLEFT
	 * @see #BORDERRIGHT
	 * @see #BORDERTOP
	 * @see #BORDERBOTTOM
	 */
	public static final Double border(Component e, int i) {
		return ini(e).var(BORDERS).get(i);
	}
	/**
	 * <p>Returns a margin of the specified component.</p>
	 * <p>This method only returns the cached data. To update the cache of a component, 
	 * use the {@link #calculate(Component)} method.</p>
	 * @param i The index of the margin.
	 * @return The <tt>i</tt>th margin of the specified component.
	 * @since 1.0
	 * @see #MARGINLEFT
	 * @see #MARGINRIGHT
	 * @see #MARGINTOP
	 * @see #MARGINBOTTOM
	 */
	public static final Double margin(Component e, int i) {
		return ini(e).var(MARGINS).get(i);
	}
	/**
	 * <p>Returns a padding of the specified component.</p>
	 * <p>This method only returns the cached data. To update the cache of a component, 
	 * use the {@link #calculate(Component)} method.</p>
	 * @param i The index of the padding.
	 * @return The <tt>i</tt>th padding of the specified component.
	 * @since 1.0
	 * @see #PADDINGLEFT
	 * @see #PADDINGRIGHT
	 * @see #PADDINGTOP
	 * @see #PADDINGBOTTOM
	 */
	public static final Double padding(Component e, int i) {
		return ini(e).var(PADDINGS).get(i);
	}

	/**
	 * <p>Gets the X coordinate of the upper-left corner of the CSS border of the 
	 * underlying HTML element relative to its parent container element.</p>
	 * <p>This method has eliminated browser dependencies, simply calling the 
	 * {@link Elements#offsetLeft(JsHTMLElement)} method to get the 
	 * {@link JsHTMLElement#offsetLeft} property of the underlying HTML element.</p>
	 * @param e The current component.
	 * @return The X coordinate of the upper-left corner of the CSS border of the 
	 * underlying HTML element relative to its parent container element.
	 * @since 1.0
	 * @see #left(Component)
	 * @see #offsetTop(Component)
	 * @see #offsetWidth(Component)
	 * @see #offsetHeight(Component)
	 */
	public static final double offsetLeft(Component e) {
		double x = Elements.offsetLeft(Component.getHTMLElement(e)).doubleValue();
		if (Browser.isOpera) {
			Component p = e.getParent();
			if (Js.be(p)) {
				x = x - border(p, Component.BORDERLEFT);
			}
		}
		return x;
	}
	/**
	 * <p>Gets the Y coordinate of the upper-left corner of the CSS border of the 
	 * underlying HTML element relative to its parent container element.</p>
	 * <p>This method has eliminated browser dependencies, simply calling the 
	 * {@link Elements#offsetTop(JsHTMLElement)} method to get the 
	 * {@link JsHTMLElement#offsetTop} property of the underlying HTML element.</p>
	 * @param e The current component.
	 * @return The Y coordinate of the upper-left corner of the CSS border of the 
	 * underlying HTML element relative to its parent container element.
	 * @since 1.0
	 * @see #top(Component)
	 * @see #offsetLeft(Component)
	 * @see #offsetWidth(Component)
	 * @see #offsetHeight(Component)
	 */
	public static final double offsetTop(Component e) {
		double y = Elements.offsetTop(Component.getHTMLElement(e)).doubleValue();
		if (Browser.isOpera) {
			Component p = e.getParent();
			if (Js.be(p)) {
				y = y - border(p, Component.BORDERTOP);
			}
		}
		return y;
	}
	/**
	 * <p>Gets the X coordinate of the upper-left corner of the underlying HTML element 
	 * relative to its parent container element.</p>
	 * @param e The current component.
	 * @return The X coordinate of the upper-left corner of the underlying HTML element 
	 * relative to its parent container element. It is the difference between the values 
	 * returned from calling the {@link #offsetLeft(Component)} and {@link #margin(Component, int)} 
	 * methods.</p> 
	 * @since 1.0
	 * @see #top(Component)
	 * @see #offsetLeft(Component)
	 */
	public static final double left(Component e) {
		return left(e, offsetLeft(e));
	}
	/**
	 * <p>Gets the Y coordinate of the upper-left corner of the underlying HTML element 
	 * relative to its parent container element.</p>
	 * @param e The current component.
	 * @return The T coordinate of the upper-left corner of the underlying HTML element 
	 * relative to its parent container element. It is the difference between the values 
	 * returned from calling the {@link #offsetTop(Component)} and {@link #margin(Component, int)} 
	 * methods.</p> 
	 * @since 1.0
	 * @see #left(Component)
	 * @see #offsetLeft(Component)
	 */
	public static final double top(Component e) {
		return top(e, offsetTop(e));
	}
	/**
	 * <p>Corrects a position value of X dimension in consideration of the left margin of 
	 * the underlying HTML element.</p>
	 * @param e The current component.
	 * @param x A position value.
	 * @return The difference between the specified position value and the left margin of 
	 * the underlying HTML element.</p> 
	 * @since 1.0
	 * @see #top(Component, double)
	 */
	public static final double left(Component e, double x) {
		return x - margin(e, Component.MARGINLEFT);
	}
	/**
	 * <p>Corrects a position value of Y dimension in consideration of the top margin of 
	 * the underlying HTML element.</p>
	 * @param e The current component.
	 * @param y A position value.
	 * @return The difference between the specified position value and the top margin of 
	 * the underlying HTML element.</p> 
	 * @since 1.0
	 * @see #left(Component, double)
	 */
	public static final double top(Component e, double y) {
		return y - margin(e, Component.MARGINTOP);
	}
	/**
	 * <p>Gets the width, in pixels, of the underlying element and all its content, 
	 * including the element's CSS padding and border, but not its margin.</p>
	 * <p>This method has eliminated browser dependencies, simply calling the 
	 * {@link Elements#offsetWidth(JsHTMLElement)} method to get the 
	 * {@link JsHTMLElement#offsetWidth} property of the underlying HTML element.</p>
	 * @param e The current component.
	 * @return The width, in pixels, of the underlying element and all its content, 
	 * including the element's CSS padding and border, but not its margin.
	 * @since 1.0
	 * @see #offsetLeft(Component)
	 * @see #offsetTop(Component)
	 * @see #offsetHeight(Component)
	 */
	public static final int offsetWidth(Component e) {
		return Elements.offsetWidth(Component.getHTMLElement(e)).intValue();
	}
	/**
	 * <p>Gets the height, in pixels, of the underlying element and all its content, 
	 * including the element's CSS padding and border, but not its margin.</p>
	 * <p>This method has eliminated browser dependencies, simply calling the 
	 * {@link Elements#offsetHeight(JsHTMLElement)} method to get the 
	 * {@link JsHTMLElement#offsetHeight} property of the underlying HTML element.</p>
	 * @param e The current component.
	 * @return The height, in pixels, of the underlying element and all its content, 
	 * including the element's CSS padding and border, but not its margin.
	 * @since 1.0
	 * @see #offsetLeft(Component)
	 * @see #offsetTop(Component)
	 * @see #offsetWidth(Component)
	 */
	public static final int offsetHeight(Component e) {
		return Elements.offsetHeight(Component.getHTMLElement(e)).intValue();
	}
	/**
	 * <p>Computes the content width of the underlying HTML element.</p>
	 * <p>In IE, use {@link #offsetWidth(Component)} for content width.</p>
	 * @param e The current component.
	 * @return {@link #offsetWidth(Component)} minus {@link #contentLeft(Component)} and 
	 * {@link #contentRight(Component)}.
	 * @since 1.0
	 * @see #contentHeight(Component)
	 * @see #offsetWidth(Component)
	 */
	public static final double contentWidth(Component e) {
		return contentWidth(e, offsetWidth(e));
	}
	/**
	 * <p>Computes the content height of the underlying HTML element.</p>
	 * <p>In IE, use {@link #offsetHeight(Component)} for content height.</p>
	 * @param e The current component.
	 * @return {@link #offsetHeight(Component)} minus {@link #contentTop(Component)} and 
	 * {@link #contentBottom(Component)}.
	 * @since 1.0
	 * @see #contentWidth(Component)
	 * @see #offsetHeight(Component)
	 */
	public static final double contentHeight(Component e) {
		return contentHeight(e, offsetHeight(e));
	}
	/**
	 * <p>Corrects a length value of X dimension in consideration of the borders and 
	 * paddings of the underlying HTML element.</p>
	 * @param e The current component.
	 * @param w A length value.
	 * @return The specified length value minus {@link #contentLeft(Component)} and 
	 * {@link #contentRight(Component)}.</p> 
	 * @since 1.0
	 * @see #contentHeight(Component, double)
	 */
	public static final double contentWidth(Component e, double w) {
		return w - contentLeft(e) - contentRight(e);
	}
	/**
	 * <p>Corrects a length value of Y dimension in consideration of the borders and 
	 * paddings of the underlying HTML element.</p>
	 * @param e The current component.
	 * @param h A length value.
	 * @return The specified length value minus {@link #contentTop(Component)} and 
	 * {@link #contentBottom(Component)}.</p> 
	 * @since 1.0
	 * @see #contentWidth(Component, double)
	 */
	public static final double contentHeight(Component e, double h) {
		return h - contentTop(e) - contentBottom(e);
	}
	/**
	 * <p>Gets the absolute X coordinate of the upper-left corner of the content area of 
	 * the underlying HTML element of a component.</p>
	 * @param e The current component.
	 * @return The sum of the width of left border and the left padding of the underlying 
	 * element.</p> 
	 * @since 1.0
	 * @see #contentRight(Component)
	 * @see #contentTop(Component)
	 * @see #contentBottom(Component)
	 */
	public static final double contentLeft(Component e) {
		return border(e, Component.BORDERLEFT) + padding(e, Component.PADDINGLEFT);
	}
	/**
	 * <p>Gets the distance from the right boundary of the content area of the underlying 
	 * HTML element of a component to its CSS left border.</p>
	 * @param e The current component.
	 * @return The sum of the width of right border and the right padding of the underlying 
	 * element.</p> 
	 * @since 1.0
	 * @see #contentLeft(Component)
	 * @see #contentTop(Component)
	 * @see #contentBottom(Component)
	 */
	public static final double contentRight(Component e) {
		return border(e, Component.BORDERRIGHT) + padding(e, Component.PADDINGRIGHT);
	}
	/**
	 * <p>Gets the absolute Y coordinate of the upper-left corner of the content area of 
	 * the underlying HTML element of a component.</p>
	 * @param e The current component.
	 * @return The sum of the width of top border and the top padding of the underlying 
	 * element.</p> 
	 * @since 1.0
	 * @see #contentLeft(Component)
	 * @see #contentRight(Component)
	 * @see #contentBottom(Component)
	 */
	public static final double contentTop(Component e) {
		return border(e, Component.BORDERTOP) + padding(e, Component.PADDINGTOP);
	}
	/**
	 * <p>Gets the distance from the bottom boundary of the content area of the underlying 
	 * HTML element of a component to its CSS bottom border.</p>
	 * @param e The current component.
	 * @return The sum of the width of bottom border and the bottom padding of the underlying 
	 * element.</p> 
	 * @since 1.0
	 * @see #contentLeft(Component)
	 * @see #contentRight(Component)
	 * @see #contentTop(Component)
	 */
	public static final double contentBottom(Component e) {
		return border(e, Component.BORDERBOTTOM) + padding(e, Component.PADDINGBOTTOM);
	}

	/**
	 * <p>Creates a new element in the current document with the specified tag name and 
	 * returns a component that wraps the element.</p>
	 * <p>This method simply calls the {@link Elements#createElement(String)} method 
	 * to create an element and then calls the {@link #get(JsElement)} method to return a 
	 * component for it.</p>
	 * @param tagName The tag name of the underlying opaque element node being created. 
	 * Since HTML tags are case-insensitive, you may use any capitalization for HTML tag 
	 * names. XML tag names are case-sensitive. 
	 * @return The component that wraps the newly created opaque element.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#INVALID_CHARACTER_ERR} 
	 * if <tt>tagName</tt> contains an illegal character. See {@link js.Js#err(Object)} 
	 * for JS Simulation.
	 * @since 1.0
	 * @see #createElementNS(String, String)
	 * @see js.user.JsDocument#createElement(String)
	 * @see jsx.dom.Elements#createElement(String)
	 */
	public final static Component createElement(String tagName) {
		return get(Elements.createElement(tagName));
	}

	/**
	 * <p>Creates a new element with the specified tag name and name-space in the current 
	 * document and returns a component that wraps the element.</p>
	 * <p>This method simply calls the {@link Elements#createElement(String)} method 
	 * to create an element and then calls the {@link #get(JsElement)} method to return a 
	 * component for it. It is just like {@link #createElement(String)}, except that the 
	 * created element has a name and name space instead of just a name. This method is 
	 * useful only with XML documents that use name spaces.</p>
	 * @param namespaceURI The unique identifier for the name space of the new element 
	 * or <tt>null</tt> for no name space. 
	 * @param qualifiedName The qualified name of the new element. This should include a 
	 * name space prefix, a colon, and a local name. 
	 * @return A component that wraps the newly created element node with the specified tag 
	 * name and name space. 
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#INVALID_CHARACTER_ERR} 
	 * if <tt>qualifiedName</tt> contains an illegal character, the value {@link JsDOMException#NAMESPACE_ERR} 
	 * if <tt>qualifiedName</tt> is malformed or there is a mismatch between <tt>qualifiedName</tt> 
	 * and <tt>namespaceURI</tt>, or the value {@link JsDOMException#NOT_SUPPORTED_ERR} 
	 * if the implementation does not support XML documents and therefore does not implement 
	 * this method. See {@link js.Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see #createElement(String)
	 * @see js.user.JsDocument#createElementNS(String, String)
	 * @see jsx.dom.Elements#createElementNS(String, String)
	 */
	public final static Component createElementNS(String namespaceURI, String qualifiedName) {
		return get(Elements.createElementNS(namespaceURI, qualifiedName));
	}

	/**
	 * <p>Returns the tag name of the underlying element of the current component.</p>
	 * @param e The current component.
	 * @return The tag name of the underlying element of the current component.
	 * @since 1.0
	 */
	public final static String tagName(Component e) {
		return Nodes.tagName(getElement(e));
	}

	/**
	 * <p>Checks if the tag name of the underlying element of the current component matches 
	 * the specified name.</p>
	 * @param e The current component.
	 * @param tag A tag name.
	 * @return <tt>true</tt> if they match case-insensitively; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	public final static boolean tagName(Component e, String tag) {
		return Js.eq(StringLikes.toLowerCase(tagName(e)), StringLikes.toLowerCase(tag));
	}

	/**
	 * <p>Returns the value of a named attribute of the underlying element as a string.</p>
	 * <p>This method simply calls the {@link Elements#getAttribute(JsElement, String)} 
	 * method with the underlying element and returns the value of a named attribute it has. 
	 * Note that the {@link JsHTMLElement} objects have JavaScript properties that match 
	 * each of the standard HTML attributes, so you need to use this method with HTML documents 
	 * only if you are querying the value of nonstandard attributes.</p>
	 * <p>In XML documents, attribute values are not available directly as element 
	 * properties and must be looked up by calling this method. For XML documents that 
	 * use name spaces, use {@link #getAttributeNS(Component, String, String)}.</p>
	 * @param e The current component.
	 * @param name The name of the attribute whose value is to be returned.
	 * @return The value of the named attribute as a string. If the attribute is not 
	 * defined, this method is supposed to return an empty string. Some implementations 
	 * return <tt>null</tt> in this case, however.
	 * @since 1.0
	 * @see #getAttributeNS(Component, String, String)
	 * @see JsElement#getAttribute(String)
	 * @see Elements#getAttribute(JsElement, String)
	 */
	public final static String getAttribute(Component e, String name) {
		return Elements.getAttribute(getElement(e), name);
	}

	/**
	 * <p>Returns the string value of an attribute of the underlying element specified by 
	 * local name and name space URI.</p> 
	 * <p>This method simply calls the {@link Elements#getAttributeNS(JsElement, String, String)} 
	 * method with the underlying element. It is useful only with XML documents that use 
	 * name spaces and works just like the {@link #getAttribute(Component, String)} method, 
	 * except that the attribute is specified by a combination of name space URI and local 
	 * name within that name space.</p>
	 * @param e The current component.
	 * @param namespaceURI The URI that uniquely identifies the name space of this 
	 * attribute or <tt>null</tt> for no name space.
	 * @param localName The identifier that specifies the name of the attribute within 
	 * its name space.
	 * @return The value of the named attribute, as a string. If the attribute is not 
	 * defined, this method is supposed to return an empty string, but some implementations 
	 * return <tt>null</tt> instead.
	 * @since 1.0
	 * @see #getAttribute(Component, String)
	 * @see JsElement#getAttributeNS(String, String)
	 * @see Elements#getAttributeNS(JsElement, String, String)
	 */
	public final static String getAttributeNS(Component e, String namespaceURI, String localName) {
		return Elements.getAttributeNS(getElement(e), namespaceURI, localName);
	}

	/**
	 * <p>Sets or adds the named attribute of the underlying element to the specified 
	 * string value.</p>
	 * <p>This method simply calls the {@link Elements#setAttribute(JsElement, String, Object)} 
	 * method with the underlying element and sets its specified attribute to the specified 
	 * value. If no attribute by that name already exists, a new one is created.</p>
	 * <p>Note that {@link JsHTMLElement} objects of an HTML document define JavaScript 
	 * properties that correspond to all standard HTML attributes. Thus, you need to use 
	 * this method only if you want to set a nonstandard attribute.</p>
	 * @param e The current component.
	 * @param name The name of the attribute to be created or modified.
	 * @param value The string value of the attribute.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if the element is read-only and does not allow its attributes to be removed or 
	 * the value {@link JsDOMException#INVALID_CHARACTER_ERR} if the <tt>name</tt> argument 
	 * contains a character that is not allowed in HTML or XML attribute names. See 
	 * {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see #setAttributeNS(Component, String, String, String)
	 * @see Elements#setAttribute(JsElement, String, Object)
	 * @see JsElement#setAttribute(String, Object)
	 */
	public final static void setAttribute(Component e, String name, Object value) {
		Elements.setAttribute(getElement(e), name, value);
	}

	/**
	 * <p>Sets or adds, to the list of attributes for the underlying element, an attribute 
	 * with the specified a combination of local name and name space URI.</p>
	 * <p>This method simply calls the {@link Elements#setAttributeNS(JsElement, String, String, String)} 
	 * method with the underlying element. It is useful only with XML documents that use 
	 * name spaces and works just like {@link #setAttribute(Component, String, Object)} 
	 * method, except that the attribute is specified by the combination of a name space 
	 * URI and a local name defined within that name space.</p>
	 * @param e The current component.
	 * @param namespaceURI The URI that uniquely identifies the name space of the 
	 * attribute to be set or created, or <tt>null</tt> for no name space.
	 * @param qualifiedName The name of the attribute, specified as an optional name 
	 * space prefix and colon followed by the local name within the name space.
	 * @param value The new value of the attribute.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if the element is read-only and does not allow its attributes to be removed, 
	 * the value {@link JsDOMException#INVALID_CHARACTER_ERR} if <tt>qualifiedName</tt> 
	 * argument contains a character that is not allowed in HTML or XML attribute names, 
	 * the value {@link JsDOMException#NAMESPACE_ERR} if <tt>qualifiedName</tt> is 
	 * malformed, or there is a mismatch between the name space prefix of <tt>qualifiedName</tt> 
	 * and the <tt>namespaceURI</tt> argument, or the value {@link JsDOMException#NOT_SUPPORTED_ERR} 
	 * if the DOM implementation of the browser does not support XML documents. See 
	 * {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see #setAttribute(Component, String, Object)
	 * @see Elements#setAttributeNS(JsElement, String, String, String)
	 * @see JsElement#setAttributeNS(String, String, String)
	 */
	public final static void setAttributeNS(Component e, String namespaceURI, String qualifiedName, String value) {
		Elements.setAttributeNS(getElement(e), namespaceURI, qualifiedName, value);
	}

	/**
	 * <p>Removes the named attribute from the underlying element.</p>
	 * <p>This method simply calls the {@link Elements#removeAttribute(JsElement, String)} 
	 * method with the underlying element and deletes a named attribute from the element. 
	 * If the named attribute has a default value specified by the document type, subsequent 
	 * calls to this method return that default value. Attempts to remove nonexistent 
	 * attributes or attributes that are not specified but have a default value are 
	 * silently ignored.</p>
	 * @param e The current component.
	 * @param name The name of the desired attribute.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if the element is read-only and does not allow its attributes to be removed. See 
	 * {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see #removeAttributeNS(Component, String, String)
	 * @see Elements#removeAttribute(JsElement, String)
	 * @see JsElement#removeAttribute(String)
	 */
	public final static void removeAttribute(Component e, String name) {
		Elements.removeAttribute(getElement(e), name);
	}

	/**
	 * <p>Removes, from the underlying element, an attribute with the specified a combination of 
	 * local name and name space URI.</p>
	 * <p>This method simply calls the {@link Elements#removeAttributeNS(JsElement, String, String)} 
	 * method with the underlying element. It is useful only with XML documents that use 
	 * name spaces and works just like {@link #removeAttribute(Component, String)} method, 
	 * except that the attribute to be removed is specified by the combination of a name 
	 * space URI and a local name defined within that name space.</p>
	 * @param e The current component.
	 * @param namespaceURI The URI that uniquely identifies the name space of this 
	 * attribute or <tt>null</tt> for no name space.
	 * @param localName The identifier that specifies the name of the attribute within 
	 * its name space.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if the element is read-only and does not allow its attributes to be removed. See 
	 * {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see #removeAttribute(Component, String)
	 * @see Elements#removeAttributeNS(JsElement, String, String)
	 * @see JsElement#removeAttributeNS(String, String)
	 */
	public final static void removeAttributeNS(Component e, String namespaceURI, String localName) {
		Elements.removeAttributeNS(getElement(e), namespaceURI, localName);
	}
}
