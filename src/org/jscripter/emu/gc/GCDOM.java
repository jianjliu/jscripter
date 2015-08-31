
/*
 *  JScripter Emulation 1.0 - To Script Java
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

package org.jscripter.emu.gc;

import js.ArrayLike;
import js.Index;
import js.Js;
import js.ObjectLike;
import js.Vars;
import js.core.JsFunction;
import js.dom.EventTarget;
import js.user.JsDOMException;
import js.user.JsDocument;
import js.user.JsDocumentFragment;
import js.user.JsEvent;
import js.user.JsHTMLElement;
import js.user.JsNode;
import js.user.JsWindow;
import jsx.client.Document;
import jsx.core.ArrayLikes;
import jsx.core.ObjectLikes;
import jsx.dom.Nodes;

/**
 * <p>An <tt>internal</tt> base class of DOM object visitors emulating garbage collection based 
 * finalization in JavaScript for DOM implementations.</p>
 * <p>This class is only used internally by JS re-compiler implementations.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript This class is only loaded and resolved by re-compiler implementations.
 */
public class GCDOM extends GC
{
	/**
	 * <p>Internally constructs an object visitor of this type.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	protected GCDOM() {}

	private final static Index<Integer> COUNT = new Index<Integer>("$GCDOM.COUNT");

	/**
	 * <p>Internally visits an object.</p>
	 * @param o An object to visit.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	protected void visit(ObjectLike o) {
		if (isRelevant(o) && nodeType(o) == 1) {
			domInc((JsNode)o);
		}
	}

	static {
		new GCDOM().visit(Document.body.var());
	}

	/**
	 * <p>Internally gets the type of a given node object.</p>
	 * @param o The given node object. 
	 * @return The type of the node of 0 for none.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	protected static final int nodeType(ObjectLike o) {
		Number t = Nodes.nodeType((JsNode)o);
		if (not(t)) {
			return 0;
		}
		return t.intValue();
	}

	/**
	 * <p>Internally determines whether a given object is a node.</p>
	 * @param o The given object. 
	 * @return <tt>true</tt> if the object is a node; <tt>false</tt>, otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	protected static final boolean isNode(ObjectLike o) {
		int t = nodeType(o);
		return Js.not(or(Js.lt(t, 1), Js.gt(t, 11)));
	}

	/**
	 * <p>Internally determines whether a given object is an element but not a 
	 * finalization relevant node.</p>
	 * @param o The given object. 
	 * @return <tt>true</tt> if the object is an element; <tt>false</tt>, otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	protected static final boolean isElement(ObjectLike o) {
		return Js.not(or(Js.lt(ObjectLikes.get(o, COUNT), 1), nodeType(o) != 1));
	}

	private static JsNode domInc(JsNode o) {
		if (isObjectLike(o)) {
			ObjectLikes.inc(o, COUNT);
			ObjectLikes.inc(o, REFS);
		}
		return o;
	}

	private static JsNode domDec(JsNode o) {
		if (isObjectLike(o)) {
			ObjectLikes.dec(o, COUNT);
			ObjectLikes.dec(o, REFS);
		}
		return o;
	}

	/**
	 * <p>Internally adds a node to the document tree by appending it to the {@link JsNode#childNodes} 
	 * array of this node with finalization emulation.</p>
	 * <p>This method adds the node <tt>c</tt> to the document, inserting it as 
	 * the last child of this node. If <tt>c</tt> is already in the document tree, 
	 * it is removed from the tree and then reinserted at its new location. If <tt>c</tt> 
	 * is a {@link JsDocumentFragment} node, it is not inserted itself; instead, all its 
	 * children are appended, in order, to the end of this node's {@link JsNode#childNodes} 
	 * array. Note that a node from (or created by) one document cannot be inserted into 
	 * a different document. That is, the {@link JsNode#ownerDocument} property of <tt>c</tt> 
	 * must be the same as the {@link JsNode#ownerDocument} property of this node.</p>
	 * @param p The current node. 
	 * @param c The node to be inserted into the document. If the node is of 
	 * {@link JsDocumentFragment}, it is not directly inserted, but each of its children 
	 * are.
	 * @return The node that was added.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#HIERARCHY_REQUEST_ERR} 
	 * if the node does not allow children, it does not allow children of the specified 
	 * type, or <tt>c</tt> is an ancestor of this node (or is this node itself), 
	 * the value {@link JsDOMException#WRONG_DOCUMENT_ERR} if the {@link JsNode#ownerDocument} 
	 * property of <tt>c</tt> is not the same as the {@link JsNode#ownerDocument} 
	 * property of this node, or the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if the node is read-only and does not allow children to be appended, or the node 
	 * being appended is already part of the document tree, and its parent is read-only 
	 * and does not allow children to be removed. See {@link Js#err(Object)} for JS 
	 * Simulation.
	 * @see #removeChild(JsNode, JsNode)
	 * @see jsx.dom.Nodes#appendChild(JsNode, JsNode)
	 * @see JsNode#appendChild(JsNode)
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final JsNode appendChild(JsNode p, JsNode c) {
		Nodes.appendChild(p, c);
		return domInc(Nodes.lastChild(p));
	}

	/**
	 * <p>Internally removes and returns the specified child node from the document tree
	 * with finalization emulation.</p>
	 * <p>This method removes the specified child from the {@link JsNode#childNodes} array of 
	 * this node. It is an error to call this method with a node that is not a child. 
	 * This method returns the <tt>c</tt> node after removing it. <tt>c</tt> 
	 * continues to be a valid node and may be reinserted into the document later.</p>
	 * @param p The current node. 
	 * @param c The child node to remove. 
	 * @return The node that was removed.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if the node is read-only and does not allow children to be removed, or the value 
	 * {@link JsDOMException#NOT_FOUND_ERR} if <tt>c</tt> is not a child of this 
	 * node. See {@link Js#err(Object)} for JS Simulation.
	 * @see #appendChild(JsNode, JsNode)
	 * @see jsx.dom.Nodes#removeChild(JsNode, JsNode)
	 * @see JsNode#removeChild(JsNode)
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final JsNode removeChild(JsNode p, JsNode c) {
		return domDec(Nodes.removeChild(p, c));
	}

	/**
	 * <p>Internally inserts the given HTML text into the element at the location with
	 * finalization emulation.</p>
	 * <p>This method is IE-specific.</p>
	 * @param node The current node.
	 * @param where A string that specifies where to insert the HTML text, using one of
	 * the following values: 
	 * <ul>
	 * <li>"beforeBegin": Inserts <tt>html</tt> immediately before the object.</li>
	 * <li>"afterBegin": Inserts <tt>html</tt> after the start of the object but before all other 
	 * content in the object.</li>
	 * <li>"beforeEnd": Inserts <tt>html</tt> immediately before the end of the object but after 
	 * all other content in the object.</li>
	 * <li>"afterEnd": Inserts <tt>html</tt> immediately after the end of the object.</li>
	 * </ul>
	 * @param html A string that specifies the HTML text to insert. The string can be a 
	 * combination of text and HTML tags. This must be well-formed, valid HTML or this 
	 * method will fail.
	 * @see jsx.dom.Nodes#insertAdjacentHTML(JsNode, String, String)
	 * @see JsNode#insertAdjacentHTML(String, String)
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final void insertAdjacentHTML(JsNode node, String where, String html) {
		Nodes.insertAdjacentHTML(node, where, html);
		switch (Js.cases().add("BeforeBegin")
		                  .add("AfterEnd")
		                  .add("AfterBegin")
		                  .add("BeforeEnd").indexOf(where)) {
			case 0:
				domInc(Nodes.previousSibling(node));
				break;
			case 1:
				domInc(Nodes.nextSibling(node));
				break;
			case 2:
				domInc(Nodes.firstChild(node));
				break;
			case 3:
				domInc(Nodes.lastChild(node));
				break;
		}
	}

	/**
	 * <p>Internally sets {@link JsHTMLElement#innerHTML} of a given element with
	 * finalization emulation.</p>
	 * @param node The given node. 
	 * @param html The new HTML for the element. 
	 * @return The property value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public final static String innerHTML(JsNode node, String html) {
		String ret = Nodes.innerHTML(node, html);
		JsNode n = Nodes.firstChild(node, 1);
		if (node == Document.body.var() || ObjectLikes.get(node, COUNT) > 0) {
			ObjectLikes.inc(n, COUNT);
		}
		ObjectLikes.inc(n, REFS);
		return ret;
	}

	/**
	 * <p>Internally inserts a node into the current document tree immediately before the specified 
	 * child node with finalization emulation.</p>
	 * <p>This method inserts the node <tt>newChild</tt> into the document tree as a 
	 * child of this node. The new node is positioned within this node's {@link JsNode#childNodes} 
	 * array so that it comes immediately before the <tt>refChild</tt> node. If <tt>refChild</tt> 
	 * is <tt>null</tt>, <tt>newChild</tt> is inserted at the end of {@link JsNode#childNodes}, 
	 * just as with the {@link JsNode#appendChild(JsNode)} method. Note that it is illegal to 
	 * call this method with a <tt>refChild</tt> that is not a child of this node.</p>
	 * <p>If the node being inserted is already in the tree, it is removed and 
	 * reinserted at its new location.</p>
	 * <p>If <tt>newChild</tt> is a {@link JsDocumentFragment} node, it is not inserted 
	 * itself; instead, each of its children is inserted, in order, at the specified 
	 * location.</p>
	 * @param node The current node. 
	 * @param newChild The node to be inserted into the document. If the node is of 
	 * {@link JsDocumentFragment}, it is not directly inserted, but each of its children 
	 * are.
	 * @param refChild The child of this node before which <tt>newChild</tt> is to be 
	 * inserted. If this argument is <tt>null</tt>, <tt>newChild</tt> is inserted as 
	 * the last child of this node. 
	 * @return The node that was inserted.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#HIERARCHY_REQUEST_ERR} 
	 * if the node does not allow children, it does not allow children of the specified 
	 * type, or <tt>newChild</tt> is an ancestor of this node (or is this node itself), 
	 * the value {@link JsDOMException#WRONG_DOCUMENT_ERR} if the {@link JsNode#ownerDocument} 
	 * property of <tt>newChild</tt> is not the same as the {@link JsNode#ownerDocument} 
	 * property of this node, the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if the node is read-only and does not allow insertion, or the parent of <tt>newChild</tt> 
	 * is read-only and does not allow deletion, or the value {@link JsDOMException#NOT_FOUND_ERR} 
	 * if <tt>refChild</tt> is not a child of this node. See {@link Js#err(Object)} for JS 
	 * Simulation.
	 * @since 1.0
	 * @see jsx.dom.Nodes#insertBefore(JsNode, JsNode, JsNode)
	 * @see JsNode#insertBefore(JsNode, JsNode)
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final JsNode insertBefore(JsNode node, JsNode newChild, JsNode refChild) {
		int t = ObjectLikes.get(newChild, COUNT);
		JsNode ret = Nodes.insertBefore(node, newChild, refChild);
		if (Js.not(t)) {
			domInc(ret);
		}
		ObjectLikes.inc(ret, REFS);
		return ret;
	}

	/**
	 * <p>Internally removes and returns the specified child node from the document tree, replacing 
	 * it with another node with finalization emulation.</p>
	 * <p>This method replaces one node of the document tree with another. <tt>oldChild</tt> 
	 * is the node to be replaced and must be a child of this node. <tt>newChild</tt> is 
	 * the node that takes its place in the {@link JsNode#childNodes} array of this node.</p>
	 * <p>If <tt>newChild</tt> is already part of the document, it is first removed from 
	 * the document before being reinserted at its new position.</p>
	 * <p>If <tt>newChild</tt> is a {@link JsDocumentFragment} node, it is not inserted 
	 * itself; instead, each of its children is inserted, in order, at the position 
	 * formerly occupied by <tt>oldChild</tt>.</p>
	 * @param node The current node.
	 * @param newChild The replacement node. 
	 * @param oldChild The node to be replaced. 
	 * @return The node that was removed from the document and replaced.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#HIERARCHY_REQUEST_ERR} 
	 * if the node does not allow children, it does not allow children of the specified 
	 * type, or <tt>newChild</tt> is an ancestor of this node (or is this node itself), 
	 * the value {@link JsDOMException#WRONG_DOCUMENT_ERR} if <tt>newChild</tt> and this 
	 * node have different values for {@link JsNode#ownerDocument} property, the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if the node is read-only and does not allow replacement, or <tt>newChild</tt> is 
	 * the child of a node that does not allow removals, or the value {@link JsDOMException#NOT_FOUND_ERR} 
	 * if <tt>oldChild</tt> is not a child of this node. See {@link Js#err(Object)} for JS 
	 * Simulation.
	 * @see JsNode#replaceChild(JsNode, JsNode)
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final JsNode replaceChild(JsNode node, JsNode newChild, JsNode oldChild) {
		int t = ObjectLikes.get(newChild, COUNT);
		JsNode ret = Nodes.replaceChild(node, newChild, oldChild);
		if (Js.not(t)) {
			domInc(newChild);
			domDec(ret);
		}
		return ret;
	}

	private final static Index<ArrayLike<JsFunction<?>>> GC_LISTENERS = new Index<ArrayLike<JsFunction<?>>>("$GC.LIST");

	private static final void addListener(EventTarget et, JsFunction<?> listener) {
		ArrayLike<JsFunction<?>> listeners = ((ObjectLike)et).var(GC_LISTENERS);
		if (Js.not(listeners)) {
			listeners = new Vars<JsFunction<?>>().var();
			((ObjectLike)et).var(GC_LISTENERS, inc(listeners));
		}
		ArrayLikes.push(listeners, inc(listener));
	}

	private static final void removeListener(EventTarget et, JsFunction<?> listener) {
		ArrayLike<JsFunction<?>> listeners = ((ObjectLike)et).var(GC_LISTENERS);
		if (Js.be(listeners)) {
			if (ArrayLikes.remove(listeners, listener) != -1) {
				dec(listener);
			}
		}
	}

	/**
	 * <p>Internally adds an event handler function to the set of event handlers for this element
	 * with finalization emulation support. This is a DOM-standard method supported by all modern 
	 * browsers except IE.</p>
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
	 * <p>The same method is also defined by, and works analogously on, the {@link JsDocument} 
	 * and {@link JsWindow} objects.</p>
	 * @param et The current event target.
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
	 * @see #attachEvent(EventTarget, String, JsFunction)
	 * @see #removeEventListener(EventTarget, String, JsFunction, Boolean)
	 * @see EventTarget#addEventListener(String, JsFunction, Boolean)
	 * @see JsDocument#addEventListener(String, JsFunction, Boolean)
	 * @see JsWindow#addEventListener(String, JsFunction, Boolean)
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final void addEventListener(EventTarget et, String type, JsFunction<?> listener, Boolean useCapture) {
		et.addEventListener(type, listener, useCapture);
		addListener(et, listener);
	}

	/**
	 * <p>Internally removes an event handler function from the set of handlers for this element
	 * with finalization emulation support. This is a standard DOM method implemented by all modern 
	 * browsers except IE.</p>
	 * <p>This method removes the specified event <tt>listener</tt> function. The <tt>type</tt> 
	 * and <tt>useCapture</tt> arguments must be the same as they are in the 
	 * corresponding call to {@link #addEventListener(EventTarget, String, JsFunction, Boolean)}. If 
	 * no event listener is found that matches the specified arguments, this method does 
	 * nothing.</p>
	 * <p>Once an event <tt>listener</tt> function has been removed by this method, it 
	 * will no longer be invoked for the specified <tt>type</tt> of event on this node. 
	 * This is true even if the event <tt>listener</tt> is removed by another event 
	 * listener registered for the same type of event on the same node.</p>
	 * <p>The same method is also defined by, and works analogously on, the {@link JsDocument} 
	 * and {@link JsWindow} objects</p>
	 * @param et The current event target.
	 * @param type The type of event for which the event listener is to be deleted.
	 * @param listener The event listener function that is to be removed.
	 * @param useCapture <tt>true</tt> if a capturing event listener is to be removed; 
	 * <tt>false</tt> if a normal event listener is to be removed.
	 * @since 1.0
	 * @see #detachEvent(EventTarget, String, JsFunction)
	 * @see #addEventListener(EventTarget, String, JsFunction, Boolean)
	 * @see EventTarget#removeEventListener(String, JsFunction, Boolean)
	 * @see JsDocument#removeEventListener(String, JsFunction, Boolean)
	 * @see JsWindow#removeEventListener(String, JsFunction, Boolean)
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final void removeEventListener(EventTarget et, String type, JsFunction<?> listener, Boolean useCapture) {
		et.removeEventListener(type, listener, useCapture);
		removeListener(et, listener);
	}

	/**
	 * <p>Internally adds an event handler function to the set of handlers for this element
	 * with finalization emulation support. This is the IE-specific alternative to 
	 * {@link #addEventListener(EventTarget, String, JsFunction, Boolean)}.</p>
	 * <p>This method is an IE-specific event registration method. It serves the same 
	 * purpose as the standard {@link #addEventListener(EventTarget, String, JsFunction, Boolean)} 
	 * method, which IE does not support, but is different from that function in several 
	 * important ways:
	 * <ul>
	 * <li>Since the IE event model does not support event capturing, this method and 
	 * {@link #detachEvent(EventTarget, String, JsFunction)} expect only two arguments: the event 
	 * type and the handler function.</li>
	 * <li>The event handler names passed to the IE methods should include the "on" 
	 * prefix.</li>
	 * <li>Functions registered with this method are invoked with no {@link JsEvent} 
	 * {@link JsWindow#event} property of 
	 * {@link JsWindow#window} object.</li>
	 * <li>Functions registered with this method are invoked as global functions, rather 
	 * than as methods of the node on which the event occurred. That is, when an event 
	 * handler registered with this method executes, the <tt>this</tt> keyword refers to 
	 * {@link JsWindow#window} object, not to the event's target node.</li>
	 * <li>This method allows the same event handler function to be registered more than 
	 * once. When an event of the specified type occurs, the registered function is 
	 * invoked as many times as it is registered.</li>
	 * </ul>
	 * </p>
	 * <p>The same method is also defined by, and works analogously on, the {@link JsDocument} 
	 * and {@link JsWindow} objects.</p>
	 * @param et The current event target.
	 * @param type The type of event for which the event listener is to be invoked, with 
	 * a leading "on" prefix.
	 * @param listener The event listener function that is invoked when an event of the 
	 * specified type is dispatched to this node. This function is not passed any 
	 * {@link JsWindow#event} 
	 * property of the {@link JsWindow} object.
	 * @since 1.0
	 * @see #addEventListener(EventTarget, String, JsFunction, Boolean)
	 * @see #detachEvent(EventTarget, String, JsFunction)
	 * @see EventTarget#attachEvent(String, JsFunction)
	 * @see JsDocument#attachEvent(String, JsFunction)
	 * @see JsWindow#attachEvent(String, JsFunction)
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final void attachEvent(EventTarget et, String type, JsFunction<?> listener) {
		et.attachEvent(type, listener);
		addListener(et, listener);
	}

	/**
	 * <p>Internally removes an event handler function from this element with finalization 
	 * emulation support. This is the IE-specific alternative to the standard 
	 * {@link #removeEventListener(EventTarget, String, JsFunction, Boolean)} method.</p>
	 * <p>This method undoes the event handler function registration performed by the 
	 * {@link #attachEvent(EventTarget, String, JsFunction)} method. It is the IE-specific analog to 
	 * the standard {@link #removeEventListener(EventTarget, String, JsFunction, Boolean)}. To remove 
	 * an event handler function for a node, simply invoke this method with the same 
	 * arguments you originally passed to {@link #attachEvent(EventTarget, String, JsFunction)}.</p>
	 * <p>The same method is also defined by, and works analogously on, the {@link JsDocument} 
	 * and {@link JsWindow} objects</p>
	 * @param et The current event target.
	 * @param type The type of event for which the event listener is to be invoked, with 
	 * a leading "on" prefix.
	 * @param listener The event listener function that is to be removed.
	 * @since 1.0
	 * @see #removeEventListener(EventTarget, String, JsFunction, Boolean)
	 * @see #attachEvent(EventTarget, String, JsFunction)
	 * @see EventTarget#detachEvent(String, JsFunction)
	 * @see JsDocument#detachEvent(String, JsFunction)
	 * @see JsWindow#detachEvent(String, JsFunction)
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final void detachEvent(EventTarget et, String type, JsFunction<?> listener) {
		et.detachEvent(type, listener);
		removeListener(et, listener);
	}
}
