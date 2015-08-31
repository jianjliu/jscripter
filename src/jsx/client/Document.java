
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

package jsx.client;

import js.*;
import js.core.*;
import js.user.*;
import jsx.dom.Nodes;

/**
 * <p>A utility class accessing the properties of {@link js.user.JsWindow#document}.</p>
 * <p>Users are encouraged to use the utilities provided in this class instead of the 
 * <b>opaque</b> methods of the {@link js.user.JsDocument} class in consideration of the 
 * reuse benefit for re-compilation results.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Document extends Disposable
{
	private Document() {}

	/**
	 * <p>Statically accesses a property of <tt>document</tt> by the name of this field. 
	 * @since 1.0
	 * @see js.user.JsDocument
	 */
	public final static Var<String> compatMode = new Static<String>(new Field<String>(Win.document, JsDocument.compatMode));
	/**
	 * <p>Statically accesses a property of <tt>document</tt> by the name of this field. 
	 * @since 1.0
	 * @see js.user.JsDocument
	 */
	public final static Var<JsHTMLElement> body = new Static<JsHTMLElement>(new Field<JsHTMLElement>(Win.document, JsHTMLDocument.body));
	/**
	 * <p>Statically accesses a property of <tt>document</tt> by the name of this field. 
	 * @since 1.0
	 * @see js.user.JsDocument
	 */
	public final static Var<JsHTMLElement> documentElement = new Static<JsHTMLElement>(new Field<JsHTMLElement>(Win.document, JsHTMLDocument.documentElement));
	/**
	 * <p>Adds an event handler function to the set of event handlers for the current {@link JsWindow#document} object. 
	 * This is a DOM-standard method supported by all modern browsers except IE.</p>
	 * <p>This method adds the specified event <tt>listener</tt> function to the set of 
	 * listeners registered on this node to handle events of the specified <tt>type</tt>. 
	 * If <tt>useCapture</tt> is <tt>true</tt>, the <tt>listener</tt> is registered as 
	 * a capturing event listener. If <tt>useCapture</tt> is <tt>false</tt>, it is 
	 * registered as a normal event listener.</p>
	 * <p>This method may be called multiple times to register multiple event handlers 
	 * for the same type of event on the same node. Note, however, that the DOM 
	 * Specification makes no guarantees about the order in which multiple event handlers 
	 * are invoked.</p>
	 * <p>If the same event listener function is registered twice on the same node with 
	 * the same <tt>type</tt> and <tt>useCapture</tt> arguments, the second registration 
	 * is simply ignored. If a new event listener is registered on this node while an 
	 * event is being handled at this node, the new event listener is not invoked for 
	 * that event.</p>
	 * <p>When a node is duplicated with {@link JsNode#cloneNode(Boolean)} or {@link JsDocument#importNode(JsNode, Boolean)}, 
	 * the event listeners registered for the original node are not copied.</p>
	 * <p>The same method is also defined by, and works analogously on, the {@link JsElement} 
	 * and {@link JsWindow} objects</p>
	 * @param type The type of event for which the event listener is to be invoked.
	 * @param listener The event listener function that is invoked when an event of the 
	 * specified type is dispatched to this node. When invoked, the listener function 
	 * is passed an {@link JsEvent} object and is invoked as a method of the node on 
	 * which it is registered.
	 * @param useCapture If <tt>true</tt>, the specified <tt>listener</tt> is to be 
	 * invoked only during the capturing phase of event propagation. The more common 
	 * value of <tt>false</tt> means that the <tt>listener</tt> is not invoked during 
	 * the capturing phase but instead is invoked when this node is the actual event 
	 * target or when the event bubbles up to this node from its original target.
	 * @since 1.0
	 * @see #attachEvent(String, JsFunction)
	 * @see #removeEventListener(String, JsFunction, Boolean)
	 * @see JsDocument#addEventListener(String, JsFunction, Boolean)
	 * @see Win#addEventListener(String, JsFunction, Boolean)
	 * @see JsWindow#addEventListener(String, JsFunction, Boolean)
	 * @see JsElement#addEventListener(String, JsFunction, Boolean)
	 */
	public static final void addEventListener(String type, JsFunction<?> listener, Boolean useCapture) {
		Win.document.var().addEventListener(type, listener, useCapture);
	}
	/**
	 * <p>Removes an event handler function from the set of handlers for the current {@link JsWindow#document} object. 
	 * This is a standard DOM method implemented by all modern browsers except IE.</p>
	 * <p>This method removes the specified event <tt>listener</tt> function. The <tt>type</tt> 
	 * and <tt>useCapture</tt> arguments must be the same as they are in the 
	 * corresponding call to {@link #addEventListener(String, JsFunction, Boolean)}. If 
	 * no event listener is found that matches the specified arguments, this method does 
	 * nothing.</p>
	 * <p>Once an event <tt>listener</tt> function has been removed by this method, it 
	 * will no longer be invoked for the specified <tt>type</tt> of event on this node. 
	 * This is true even if the event <tt>listener</tt> is removed by another event 
	 * listener registered for the same type of event on the same node.</p>
	 * <p>The same method is also defined by, and works analogously on, the {@link JsElement} 
	 * and {@link JsWindow} objects</p>
	 * @param type The type of event for which the event listener is to be deleted.
	 * @param listener The event listener function that is to be removed.
	 * @param useCapture <tt>true</tt> if a capturing event listener is to be removed; 
	 * <tt>false</tt> if a normal event listener is to be removed.
	 * @since 1.0
	 * @see #detachEvent(String, JsFunction)
	 * @see #addEventListener(String, JsFunction, Boolean)
	 * @see JsDocument#removeEventListener(String, JsFunction, Boolean)
	 * @see Win#removeEventListener(String, JsFunction, Boolean)
	 * @see JsWindow#removeEventListener(String, JsFunction, Boolean)
	 * @see JsElement#removeEventListener(String, JsFunction, Boolean)
	 */
	public static final void removeEventListener(String type, JsFunction<?> listener, Boolean useCapture) {
		Win.document.var().removeEventListener(type, listener, useCapture);
	}
	/**
	 * <p>Adds an event handler function to the set of handlers for the current {@link JsWindow#document} object. 
	 * This is the IE-specific alternative to {@link #addEventListener(String, JsFunction, Boolean)}.</p>
	 * <p>This method is an IE-specific event registration method. It serves the same 
	 * purpose as the standard {@link #addEventListener(String, JsFunction, Boolean)} 
	 * method, which IE does not support, but is different from that function in several 
	 * important ways:
	 * <ul>
	 * <li>Since the IE event model does not support event capturing, this method and 
	 * {@link #detachEvent(String, JsFunction)} expect only two arguments: the event 
	 * type and the handler function.</li>
	 * <li>The event handler names passed to the IE methods should include the "on" 
	 * prefix.</li>
	 * <li>Functions registered with this method are invoked with no {@link JsEvent} 
	 * object argument. Instead, they must read the {@link JsWindow#event} property of 
	 * the {@link JsWindow#window} object.</li>
	 * <li>Functions registered with this method are invoked as global functions, rather 
	 * than as methods of the node on which the event occurred. That is, when an event 
	 * handler registered with this method executes, the <tt>this</tt> keyword refers to 
	 * the {@link JsWindow#window} object, not to the event's target node.</li>
	 * <li>This method allows the same event handler function to be registered more than 
	 * once. When an event of the specified type occurs, the registered function is 
	 * invoked as many times as it is registered.</li>
	 * </ul>
	 * </p>
	 * <p>The same method is also defined by, and works analogously on, the {@link JsElement} 
	 * and {@link JsWindow} objects</p>
	 * @param type The type of event for which the event listener is to be invoked, with 
	 * a leading "on" prefix.
	 * @param listener The event listener function that is invoked when an event of the 
	 * specified type is dispatched to this node. This function is not passed any 
	 * arguments but can obtain the {@link JsEvent} object from the {@link JsWindow#event} 
	 * property of the {@link JsWindow} object.
	 * @since 1.0
	 * @see #addEventListener(String, JsFunction, Boolean)
	 * @see #detachEvent(String, JsFunction)
	 * @see JsDocument#attachEvent(String, JsFunction)
	 * @see Win#attachEvent(String, JsFunction)
	 * @see JsWindow#attachEvent(String, JsFunction)
	 * @see JsElement#attachEvent(String, JsFunction)
	 */
	public static final void attachEvent(String type, JsFunction<?> listener) {
		Win.document.var().attachEvent(type, listener);
	}
	/**
	 * <p>Removes an event handler function from the current {@link JsWindow#document} object. This is the IE-specific 
	 * alternative to the standard {@link #removeEventListener(String, JsFunction, Boolean)} 
	 * method.</p>
	 * <p>This method undoes the event handler function registration performed by the 
	 * {@link #attachEvent(String, JsFunction)} method. It is the IE-specific analog to 
	 * the standard {@link #removeEventListener(String, JsFunction, Boolean)}. To remove 
	 * an event handler function for a node, simply invoke this method with the same 
	 * arguments you originally passed to {@link #attachEvent(String, JsFunction)}.</p>
	 * <p>The same method is also defined by, and works analogously on, the {@link JsElement} 
	 * and {@link JsWindow} objects</p>
	 * @param type The type of event for which the event listener is to be invoked, with 
	 * a leading "on" prefix.
	 * @param listener The event listener function that is to be removed.
	 * @since 1.0
	 * @see #removeEventListener(String, JsFunction, Boolean)
	 * @see #attachEvent(String, JsFunction)
	 * @see JsDocument#detachEvent(String, JsFunction)
	 * @see Win#detachEvent(String, JsFunction)
	 * @see JsWindow#detachEvent(String, JsFunction)
	 * @see JsElement#detachEvent(String, JsFunction)
	 */
	public static final void detachEvent(String type, JsFunction<?> listener) {
		Win.document.var().detachEvent(type, listener);
	}
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
	 * @see #createElement(StringLike)
	 * @see JsDocument#createElement(String)
	 */
	public static final JsElement createElement(String tagName) {
		return Win.document.var().createElement(tagName);
	}
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
	 * @see #createElement(String)
	 * @see JsDocument#createElement(StringLike)
	 */
	public static final JsElement createElement(StringLike tagName) {
		return Win.document.var().createElement(tagName);
	}
	/**
	 * <p>Creates a style sheet for the current document.</p>
	 * <p>This method is IE specific.</p>
	 * @param url Specifies how to add the style sheet to the document. If a file name is 
	 * specified for the argument, the style information will be added as a {@link JsHTMLLinkElement} 
	 * object. If the argument contains style information, this information will be added 
	 * to the style object.
	 * @param index Specifies the index that indicates where the new style sheet is inserted 
	 * in the {@link JsDocument#styleSheets} collection. The default is to insert the new style sheet 
	 * at the end of the collection.
	 * @return A newly created {@link JsCSSStyleSheet} object. 
	 * @since 1.0
	 * @see #createStyleSheet(String)
	 * @see JsDocument#createStyleSheet(String, int)
	 */
	public static final JsCSSStyleSheet createStyleSheet(String url, int index) {
		return Win.document.var().createStyleSheet(url, index);
	}
	/**
	 * <p>Creates a style sheet for the current document.</p>
	 * <p>This method is IE specific.</p>
	 * @param url Specifies how to add the style sheet to the document. If a file name is 
	 * specified for the argument, the style information will be added as a {@link JsHTMLLinkElement} 
	 * object. If the argument contains style information, this information will be added 
	 * to the style object.
	 * @return A newly created {@link JsCSSStyleSheet} object. 
	 * @since 1.0
	 * @see #createStyleSheet(String, int)
	 * @see JsDocument#createStyleSheet(String)
	 */
	public static final JsCSSStyleSheet createStyleSheet(String url) {
		return Win.document.var().createStyleSheet(url);
	}
	/**
	 * <p>Gets the {@link JsHTMLHeadElement} of the current document.</p>
	 * @return The {@link JsHTMLHeadElement} of the current document. 
	 * @since 1.0
	 * @see JsDocument#getElementsByTagName(String)
	 * @see Nodes#getElementsByTagName(JsNode, String)
	 */
	public static final JsHTMLHeadElement head() {
		return new JsHTMLHeadElement(Nodes.getElementsByTagName(Win.document.var(), "head").get(0));
	}
	/**
	 * <p>Gets the {@link JsHTMLBodyElement} of the current document.</p>
	 * @return The {@link JsHTMLBodyElement} of the current document. 
	 * @since 1.0
	 * @see JsDocument#getElementsByTagName(String)
	 * @see Nodes#getElementsByTagName(JsNode, String)
	 */
	public static final JsHTMLBodyElement body() {
		return new JsHTMLBodyElement(Nodes.getElementsByTagName(Win.document.var(), "body").get(0));
	}

	/**
	 * <p>Determines whether the current document is in a {@link #compatMode}.</p>
	 * @see Browser
	 * @since 1.0
	 */
	public static final boolean isStrict = Js.eq(compatMode.var(), "");
}
