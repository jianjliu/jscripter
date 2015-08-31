
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

package jsx.dom;

import js.*;
import js.core.*;
import js.user.*;
import jsx.Code;
import jsx.client.*;
import jsx.core.*;
import jsx.event.Handle;

/**
 * <p>A utility class manipulating DOM elements with its static methods.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Elements extends Disposable
{
	private Elements() {}

	/**
	 * <p>Creates a new {@link JsElement} node with the specified tag name.</p>
	 * @param tagName The tag name of the {@link JsElement} node being created. Since 
	 * HTML tags are case-insensitive, you may use any capitalization for HTML tag names. 
	 * XML tag names are case-sensitive. 
	 * @return A newly created {@link JsElement} node with the specified tag name. 
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#INVALID_CHARACTER_ERR} 
	 * if <tt>tagName</tt> contains an illegal character. See {@link Js#err(Object)} 
	 * for JS Simulation.
	 * @since 1.0
	 * @see jsx.client.Document#createElement(String)
	 * @see JsDocument#createElement(String)
	 */
	public final static JsElement createElement(String tagName) {
		return Win.document.var().createElement(tagName);
	}

	/**
	 * <p>Creates a new {@link JsElement} node with the specified tag name and name-space.</p>
	 * <p>This method is just like {@link #createElement(String)}, except that the 
	 * created {@link JsElement} node has a name and name space instead of just a name. 
	 * This method is useful only with XML documents that use name spaces.</p>
	 * @param namespaceURI The unique identifier for the name space of the new {@link JsElement} 
	 * node or <tt>null</tt> for no name space. 
	 * @param qualifiedName The qualified name of the new {@link JsElement} node. This 
	 * should include a name space prefix, a colon, and a local name. 
	 * @return A newly created {@link JsElement} node with the specified tag name and 
	 * name space. 
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#INVALID_CHARACTER_ERR} 
	 * if <tt>qualifiedName</tt> contains an illegal character, the value {@link JsDOMException#NAMESPACE_ERR} 
	 * if <tt>qualifiedName</tt> is malformed or there is a mismatch between <tt>qualifiedName</tt> 
	 * and <tt>namespaceURI</tt>, or the value {@link JsDOMException#NOT_SUPPORTED_ERR} 
	 * if the implementation does not support XML documents and therefore does not implement 
	 * this method. See {@link js.Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see JsDocument#createElementNS(String, String)
	 */
	public final static JsElement createElementNS(String namespaceURI, String qualifiedName) {
		return Win.document.var().createElementNS(namespaceURI, qualifiedName);
	}

	/**
	 * <p>Returns the value of a named attribute as a string.</p>
	 * <p>This method returns the value of a named attribute of an element. Note that 
	 * the {@link JsHTMLElement} objects have JavaScript properties that match each of 
	 * the standard HTML attributes, so you need to use this method with HTML documents 
	 * only if you are querying the value of nonstandard attributes.</p>
	 * <p>In XML documents, attribute values are not available directly as element 
	 * properties and must be looked up by calling this method. For XML documents that 
	 * use name spaces, use {@link #getAttributeNS(JsElement, String, String)}.</p>
	 * @param e The current element.
	 * @param name The name of the attribute whose value is to be returned.
	 * @return The value of the named attribute as a string. If the attribute is not 
	 * defined, this method is supposed to return an empty string. Some implementations 
	 * return <tt>null</tt> in this case, however.
	 * @since 1.0
	 * @see JsElement#getAttribute(String)
	 */
	public final static String getAttribute(JsElement e, String name) {
		return e.getAttribute(name);
	}

	/**
	 * <p>Returns the string value of an attribute specified by local name and name space URI.</p> 
	 * <p>This method is useful only with XML documents that use name spaces and works 
	 * just like the {@link #getAttribute(JsElement, String)} method, except that the attribute is 
	 * specified by a combination of name space URI and local name within that name 
	 * space.</p>
	 * @param e The current element.
	 * @param namespaceURI The URI that uniquely identifies the name space of this 
	 * attribute or <tt>null</tt> for no name space.
	 * @param localName The identifier that specifies the name of the attribute within 
	 * its name space.
	 * @return The value of the named attribute, as a string. If the attribute is not 
	 * defined, this method is supposed to return an empty string, but some implementations 
	 * return <tt>null</tt> instead.
	 * @since 1.0
	 * @see JsElement#getAttributeNodeNS(String, String)
	 */
	public final static String getAttributeNS(JsElement e, String namespaceURI, String localName) {
		return e.getAttributeNS(namespaceURI, localName);
	}

	/**
	 * <p>Sets or adds the named attribute to the specified string value.</p>
	 * <p>This method sets the specified attribute to the specified value. If no 
	 * attribute by that name already exists, a new one is created.</p>
	 * <p>Note that {@link JsHTMLElement} objects of an HTML document define JavaScript 
	 * properties that correspond to all standard HTML attributes. Thus, you need to use 
	 * this method only if you want to set a nonstandard attribute.</p>
	 * @param e The current element.
	 * @param name The name of the attribute to be created or modified.
	 * @param value The string value of the attribute.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if this element is read-only and does not allow its attributes to be removed or 
	 * the value {@link JsDOMException#INVALID_CHARACTER_ERR} if the <tt>name</tt> argument 
	 * contains a character that is not allowed in HTML or XML attribute names. See 
	 * {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see JsElement#setAttribute(String, Object)
	 */
	public final static void setAttribute(JsElement e, String name, Object value) {
		e.setAttribute(name, value);
	}

	/**
	 * <p>Sets or adds, to the list of attributes for this element, an attribute with 
	 * the specified a combination of local name and name space URI.</p>
	 * <p>This method is useful only with XML documents that use name spaces and works 
	 * just like {@link #setAttribute(JsElement, String, Object)} method, except that the attribute 
	 * is specified by the combination of a name space URI and a local name defined 
	 * within that name space.</p>
	 * @param e The current element.
	 * @param namespaceURI The URI that uniquely identifies the name space of the 
	 * attribute to be set or created, or <tt>null</tt> for no name space.
	 * @param localName The name of the attribute, specified as an optional name 
	 * space prefix and colon followed by the local name within the name space.
	 * @param value The new value of the attribute.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if this element is read-only and does not allow its attributes to be removed, 
	 * the value {@link JsDOMException#INVALID_CHARACTER_ERR} if <tt>qualifiedName</tt> 
	 * argument contains a character that is not allowed in HTML or XML attribute names, 
	 * the value {@link JsDOMException#NAMESPACE_ERR} if <tt>qualifiedName</tt> is 
	 * malformed, or there is a mismatch between the name space prefix of <tt>qualifiedName</tt> 
	 * and the <tt>namespaceURI</tt> argument, or the value {@link JsDOMException#NOT_SUPPORTED_ERR} 
	 * if the DOM implementation of the browser does not support XML documents. See 
	 * {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see JsElement#setAttributeNS(String, String, String)
	 */
	public final static void setAttributeNS(JsElement e, String namespaceURI, String localName, String value) {
		e.setAttributeNS(namespaceURI, localName, value);
	}

	/**
	 * <p>Removes the named attribute from this element.</p>
	 * <p>This method deletes a named attribute from this element. If the named attribute 
	 * has a default value specified by the document type, subsequent calls to this method 
	 * return that default value. Attempts to remove nonexistent attributes or attributes 
	 * that are not specified but have a default value are silently ignored.</p>
	 * @param e The current element.
	 * @param name The name of the desired attribute.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if this element is read-only and does not allow its attributes to be removed. See 
	 * {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see JsElement#removeAttribute(String)
	 */
	public final static void removeAttribute(JsElement e, String name) {
		e.removeAttribute(name);
	}

	/**
	 * <p>Removes, from this element, an attribute with the specified a combination of 
	 * local name and name space URI.</p>
	 * <p>This method is useful only with XML documents that use name spaces and works 
	 * just like {@link #removeAttribute(JsElement, String)} method, except that the attribute to 
	 * be removed is specified by the combination of a name space URI and a local name 
	 * defined within that name space.</p>
	 * @param e The current element.
	 * @param namespaceURI The URI that uniquely identifies the name space of this 
	 * attribute or <tt>null</tt> for no name space.
	 * @param localName The identifier that specifies the name of the attribute within 
	 * its name space.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if this element is read-only and does not allow its attributes to be removed. See 
	 * {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see JsElement#removeAttributeNS(String, String)
	 */
	public final static void removeAttributeNS(JsElement e, String namespaceURI, String localName) {
		e.removeAttributeNS(namespaceURI, localName);
	}

	/**
	 * <p>Creates an HTML button element.</p>
	 * @param value The string value for the button being created.
	 * @return The newly created HTML element.
	 * @since 1.0
	 */
	public final static JsHTMLButtonElement createButton(String value) {
		JsHTMLButtonElement ret = new JsHTMLButtonElement(
				JsWindow.document.with(Js.core()).createElement("Button")
		);
		JsHTMLButtonElement.value.with(ret, value);
		return ret;
	}

	/**
	 * <p>Creates an HTML div element.</p>
	 * @return The newly created HTML element.
	 * @since 1.0
	 */
	public final static JsHTMLDivElement createDiv() {
		return new JsHTMLDivElement(
				JsWindow.document.with(Js.core()).createElement("div")
		);
	}

	/**
	 * <p>Applies a style object to an HTML element.</p>
	 * @param e The current HTML element.
	 * @param p A {@link JsCSS2Properties} object.
	 * @since 1.0
	 */
	public static final void applyStyle(JsHTMLElement e, ObjectLike p) {
		Js.apply(style(e), p);
	}

	/**
	 * <p>Gets the id value of an HTML element.</p>
	 * @param e The current HTML element.
	 * @return The string representation of the id value.
	 * @since 1.0
	 */
	public final static String id(JsElement e) {
		return JsHTMLElement.id.with(e);
	}

	/**
	 * <p>Sets the id value of an HTML element.</p>
	 * @param e The current HTML element.
	 * @param id The string representation of the id value.
	 * @since 1.0
	 */
	public final static String id(JsElement e, String id) {
		return JsHTMLElement.id.with(e, id);
	}

	/**
	 * <p>Gets the style object of an HTML element.</p>
	 * @param e The current HTML element.
	 * @return The {@link JsCSS2Properties} object.
	 * @since 1.0
	 */
	public final static JsObject style(JsHTMLElement e) {
		return JsHTMLElement.style.with(e);
	}

	/**
	 * <p>Determines if a given element is an HTML element.</p>
	 * <p>This method does the job by only testing the existence of {@link JsHTMLElement#style} 
	 * property in the element object.</p>
	 * @param e The given element.
	 * @return <tt>true</tt> if it is an HTML element; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	public final static boolean isHTMLElement(JsElement e) {
		return Js.be(JsHTMLElement.style.with(e));
	}

	/**
	 * <p>Gets or computes the {@link JsHTMLElement#currentStyle} of an HTML element.</p>
	 * <p>This method eliminates the browser dependencies.</p>
	 * @param e The given HTML element.
	 * @return The current {@link JsCSS2Properties} object in the element.
	 * @since 1.0
	 */
	public final static JsObject currentStyle(JsHTMLElement e) {
		return Browser.isIE ? JsHTMLElement.currentStyle.with(e) :
				Win.getComputedStyle(e);
	}

	/**
	 * <p>Gets the {@link JsHTMLElement#offsetParent} property of an HTML element.</p>
	 * @param e The given HTML element.
	 * @return An HTML element.
	 * @since 1.0
	 */
	public final static JsHTMLElement offsetParent(JsHTMLElement e) {
		return JsHTMLElement.offsetParent.with(e);
	}

	/**
	 * <p>Gets the parent element of an element.</p>
	 * @param e The given element.
	 * @return An element or <tt>null</tt> for none.
	 * @since 1.0
	 */
	public final static JsElement parentNode(JsElement e) {
		JsNode p = Nodes.parentNode(e);
		return Js.be(p) && Js.be(Nodes.tagName(p)) ? new JsElement(p) : null;
	}

	/**
	 * <p>Sets the "position" style of an HTML element to "absolute".</p>
	 * @param e The given HTML element.
	 * @since 1.0
	 */
	public static final void absolute(JsHTMLElement e) {
		Styles.position(style(e), "absolute");
	}

	/**
	 * <p>Computes the transparency value for an HTML element.</p>
	 * @param e The given HTML element.
	 * @return A number value of transparency.
	 * @since 1.0
	 */
	public static final double tranparency(JsHTMLElement e) {
		return Styles.transparency(currentStyle(e));
	}

	/**
	 * <p>Sets the transparency value for an HTML element.</p>
	 * @param e The given HTML element.
	 * @param v A number value of transparency.
	 * @since 1.0
	 */
	public static final void transparency(JsHTMLElement e, double v) {
		Styles.transparency(style(e), v);
	}

	/**
	 * <p>Gets the {@link JsHTMLElement#offsetTop} value of an HTML element.</p>
	 * @param e The given HTML element.
	 * @return A number in pixel.
	 * @since 1.0
	 */
	public final static Number offsetTop(JsHTMLElement e) {
		return JsHTMLElement.offsetTop.with(e);
	}

	/**
	 * <p>Gets the {@link JsHTMLElement#offsetLeft} value of an HTML element.</p>
	 * @param e The given HTML element.
	 * @return A number in pixel.
	 * @since 1.0
	 */
	public final static Number offsetLeft(JsHTMLElement e) {
		return JsHTMLElement.offsetLeft.with(e);
	}

	/**
	 * <p>Gets the {@link JsHTMLElement#offsetWidth} value of an HTML element.</p>
	 * @param e The given HTML element.
	 * @return A number in pixel.
	 * @since 1.0
	 */
	public final static Number offsetWidth(JsHTMLElement e) {
		return JsHTMLElement.offsetWidth.with(e);
	}

	/**
	 * <p>Gets the {@link JsHTMLElement#offsetHeight} value of an HTML element.</p>
	 * @param e The given HTML element.
	 * @return A number in pixel.
	 * @since 1.0
	 */
	public final static Number offsetHeight(JsHTMLElement e) {
		return JsHTMLElement.offsetHeight.with(e);
	}

	/**
	 * <p>Gets the {@link JsHTMLElement#scrollTop} value of an HTML element.</p>
	 * @param e The given HTML element.
	 * @return A number in pixel.
	 * @since 1.0
	 */
	public final static Number scrollTop(JsHTMLElement e) {
		return JsHTMLElement.scrollTop.with(e);
	}

	/**
	 * <p>Gets the {@link JsHTMLElement#scrollLeft} value of an HTML element.</p>
	 * @param e The given HTML element.
	 * @return A number in pixel.
	 * @since 1.0
	 */
	public final static Number scrollLeft(JsHTMLElement e) {
		return JsHTMLElement.scrollLeft.with(e);
	}

	/**
	 * <p>Gets the {@link JsHTMLElement#scrollWidth} value of an HTML element.</p>
	 * @param e The given HTML element.
	 * @return A number in pixel.
	 * @since 1.0
	 */
	public final static Number scrollWidth(JsHTMLElement e) {
		return JsHTMLElement.scrollWidth.with(e);
	}

	/**
	 * <p>Gets the {@link JsHTMLElement#scrollHeight} value of an HTML element.</p>
	 * @param e The given HTML element.
	 * @return A number in pixel.
	 * @since 1.0
	 */
	public final static Number scrollHeight(JsHTMLElement e) {
		return JsHTMLElement.scrollHeight.with(e);
	}

	/**
	 * <p>Returns a function for adding the given CSS to an HTML element.</p>
	 * @param e The given HTML element.
	 * @param s The CSS class name to add.
	 * @return A function for adding the given CSS to the given HTML element.
	 * @since 1.0
	 */
	public final static JsFunction<Void> cssAdder(JsHTMLElement e, String s) {
		return new JsFunction<Void>(
				Handle.HANDLER.var().invoke(
						new Vars<Object>().add(e).add(
								Js.function(
										Code.stmt(
												Code.aasg(
														Code.THIS_CLASSNAME,
														Code.qt(s)
												)
										)
								)
						)
				)
		);
	}

	/**
	 * <p>Returns a function for removing the given CSS from an HTML element.</p>
	 * @param e The given HTML element.
	 * @param s The CSS class name to remove.
	 * @return A function for removing the given CSS from the given HTML element.
	 * @since 1.0
	 */
	public final static JsFunction<Void> cssRemover(JsHTMLElement e, String s) {
		return new JsFunction<Void>(
				Handle.HANDLER.var().invoke(
						new Vars<Object>().add(e).add(
								Js.function(
										Code.replaceThisClassName(
												Code.join(r1, s, r2),
												Code.EMPTY
										)
								)
						)
				)
		);
	}

	/**
	 * <p>Returns the {@link JsHTMLElement#className} value of an HTML element.</p>
	 * @param e The given HTML element.
	 * @return A string of CSS class names.
	 * @since 1.0
	 */
	public final static String className(JsHTMLElement e) {
		return JsHTMLElement.className.with(e);
	}

	/**
	 * <p>Sets the {@link JsHTMLElement#className} property of an HTML element.</p>
	 * @param e The given HTML element.
	 * @param css A string of CSS class names.
	 * @since 1.0
	 */
	public final static String className(JsHTMLElement e, String css) {
		return JsHTMLElement.className.with(e, css);
	}

	/**
	 * <p>Appends a CSS class name to an HTML element.</p>
	 * @param e The given HTML element.
	 * @param cls A string value of CSS class name.
	 * @since 1.0
	 */
	public final static void addClass(JsHTMLElement e, String cls) {
		if (Js.be(cls)) {
			String className = className(e);
			if (!hasClass(className, cls)) {
				className(e, Code.join(className, " ", cls));
			}
		}
	}

	/**
	 * <p>Appends a CSS class name to an HTML element.</p>
	 * @param e The given HTML element.
	 * @param classes An array of CSS class names.
	 * @since 1.0
	 */
	public final static void addClasses(JsHTMLElement e, ArrayLike<String> classes) {
		String className = className(e);
		int n = 0;
		for (int i = 0, len = ArrayLikes.length(classes); i < len; i++) {
			String cls = classes.get(i);
			if (!hasClass(className, cls)) {
				className = Code.join(className, " ", cls);
				n++;
			}
		}
		if (n > 0) {
			className(e, className);
		}
	}

	/**
	 * <p>Determines if an HTML element has a CSS class name.</p>
	 * @param e The given HTML element.
	 * @param cls A string value of CSS class name.
	 * @return <tt>true</tt> if the HTML element has the CSS class name; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	public final static boolean hasClass(JsHTMLElement e, String cls) {
		return Js.be(e) && hasClass(className(e), cls);
	}

	/**
	 * <p>Checks if a name string has a CSS class name.</p>
	 * @param className A string of CSS class names.
	 * @param cls A string value of CSS class name.
	 * @return <tt>true</tt> if the string has the CSS class name; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	public final static boolean hasClass(String className, String cls) {
		return Js.neq(
				Code.join(" ", className, " ").indexOf(
						Code.join(" ", cls, " ")
				),
				-1
		);
	}

	private final static String r1 = "(?:^|\\s+)";
	private final static String r2 = "(?:\\s+|$)";

	/**
	 * <p>Removes a CSS class name from an HTML element.</p>
	 * @param e The given HTML element.
	 * @param cls A string value of CSS class name.
	 * @since 1.0
	 */
	public final static void removeClass(JsHTMLElement e, String cls) {
		String className = className(e);
		if (hasClass(className, cls)) {
			className(
					e,
					StringLikes.trim(StringLikes.replace(
							className,
							Js.re(Code.join(r1, cls, r2), "g"),
							" "
					))
			);
		}
	}

	/**
	 * <p>Removes a CSS class name from an HTML element.</p>
	 * @param e The given HTML element.
	 * @param classes An array of CSS class names.
	 * @since 1.0
	 */
	public final static void removeClasses(JsHTMLElement e, ArrayLike<String> classes) {
		String className = className(e);
		int n = 0;
		for (int i = 0, len = ArrayLikes.length(classes); i < len; i++) {
			String cls = classes.get(i);
			if (hasClass(className, cls)) {
				className = StringLikes.replace(
						className,
						Js.re(Code.join(r1, cls, r2), "g"),
						" "
				);
				n++;
			}
		}
		if (n > 0) {
			className(
					e,
					StringLikes.trim(className)
			);
		}
	}
}
