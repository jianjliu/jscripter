
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
import jsx.client.Win;

/**
 * <p>A utility class manipulating DOM nodes with its static methods.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Nodes extends Disposable
{
	private Nodes() {}

	/**
	 * <p>Adds a node to the document tree by appending it to the {@link JsNode#childNodes} 
	 * array of this node.</p>
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
	 * @see JsNode#appendChild(JsNode)
	 * @since 1.0
	 */
	public final static JsNode appendChild(JsNode p, JsNode c) {
		return p.appendChild(c);
	}

	/**
	 * <p>Removes and returns the specified child node from the document tree.</p>
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
	 * @see JsNode#removeChild(JsNode)
	 * @since 1.0
	 */
	public final static JsNode removeChild(JsNode p, JsNode c) {
		return p.removeChild(c);
	}

	/**
	 * <p>Inserts a node into the current document tree immediately before the specified 
	 * child node.</p>
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
	 * @see JsNode#insertBefore(JsNode, JsNode)
	 */
	public static final JsNode insertBefore(JsNode node, JsNode newChild, JsNode refChild) {
		return node.insertBefore(newChild, refChild);
	}

	/**
	 * <p>Inserts the given HTML text into the element at the location.</p>
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
	 * @see JsNode#insertAdjacentHTML(String, String)
	 * @since 1.0
	 */
	public final static void insertAdjacentHTML(JsNode node, String where, String html) {
		node.insertAdjacentHTML(where, html);
	}

	/**
	 * <p>Removes and returns the specified child node from the document tree, replacing 
	 * it with another node.</p>
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
	 */
	public static final JsNode replaceChild(JsNode node, JsNode oldChild, JsNode newChild) {
		return node.replaceChild(oldChild, newChild);
	}

	/**
	 * <p>Gets parent node of a given node.</p>
	 * @param c The child node. 
	 * @return The parent node or <tt>null</tt> for none.
	 * @since 1.0
	 */
	public final static JsNode parentNode(JsNode c) {
		return JsNode.parentNode.with(c);
	}

	/**
	 * <p>Detaches a node from its parent if it has one.</p>
	 * @param n The node to detach. 
	 * @return The node that was detached.
	 * @since 1.0
	 */
	public final static JsNode detach(JsNode n) {
		JsNode p = parentNode(n);
		return Js.be(p) ? p.removeChild(n) : n;
	}

	/**
	 * <p>Returns a descendant {@link JsElement} element of the current document that has the 
	 * specified value for its <tt>id</tt> attribute, or <tt>null</tt> if no such 
	 * element exists in the document.</p>
	 * <p>This method searches the document for an {@link JsElement} node with an <tt>id</tt> 
	 * attribute whose value is <tt>elementId</tt> and returns that element. If no such 
	 * element is found, it returns <tt>null</tt>. The value of the <tt>id</tt> attribute 
	 * is intended to be unique within a document, and if this method finds more than 
	 * one element with the specified <tt>elementId</tt>, it may return one at random, 
	 * or it may return <tt>null</tt>.</p>
	 * <p>This is an important and commonly used method because it provides a simple 
	 * way to obtain the {@link JsElement} object that represents a specific document 
	 * element.</p>
	 * <p>For HTML documents, this method searches for an element based on the value of 
	 * its <tt>id</tt> attribute. Use {@link JsHTMLDocument#getElementsByName(String)} 
	 * to search for HTML elements based on the value of their <tt>name</tt> attributes.</p>
	 * <p>For XML documents, this method performs its search using any attribute whose 
	 * type is <tt>id</tt>, regardless of what the name of that attribute is. If, for example, 
	 * because the XML parser ignored or could not locate the document's DTD, XML attribute 
	 * types are not known, this method always returns <tt>null</tt>. In JavaScript, 
	 * this method is not usually useful with XML documents. In fact, it was originally 
	 * defined as a member of the <tt>HTMLDocument</tt> interface but was then moved to 
	 * the <tt>Document</tt> interface in DOM Level 2.</p>
	 * @param elementId The value of the <tt>id</tt> attribute of the desired element.
	 * @return The {@link JsElement} node that represents the document element with the 
	 * specified <tt>id</tt> attribute or <tt>null</tt> if no such element is found.
	 * @since 1.0
	 * @see JsDocument#getElementsByTagName(String)
	 */
	public static final JsHTMLElement getElementById(String elementId) {
		return new JsHTMLElement(Win.document.var().getElementById(elementId));
	}

	/**
	 * <p>Returns an array, technically a {@link JsNodeList} object, of all {@link JsElement} 
	 * nodes in the current document that have the specified tag name by traversing all 
	 * descendants of this element. The {@link JsElement} nodes appear in the returned 
	 * array in the same order in which they appear in the document source.</p>
	 * <p>Note that the {@link JsDocument#getElementsByTagName(String)} method works 
	 * just like this one but that traverses the entire document, rather than just the 
	 * descendants of a single element. Do not confuse this method with {@link JsHTMLDocument#getElementsByName(String)}, 
	 * which searches for elements based on the value of their <tt>name</tt> attributes 
	 * rather than by their tag names.</p>
	 * @param node The current node.
	 * @param name The tag name of the desired elements, or the value "*" to specify 
	 * that all descendant elements should be returned, regardless of their tag names.
	 * @return An read-only array, technically a {@link JsNodeList} object, of 
	 * {@link JsElement} nodes that are descendants of this element and have the 
	 * specified tag name.
	 * @since 1.0
	 * @see JsDocument#getElementsByTagName(String)
	 */
	public static final JsNodeList<? extends JsElement> getElementsByTagName(JsNode node, String name) {
		return new JsElement(node).getElementsByTagName(name);
	}

	/**
	 * <p>Gets {@link JsHTMLElement#tagName} of a given node.</p>
	 * @param e The given node. 
	 * @return The property value.
	 * @since 1.0
	 */
	public final static String tagName(JsNode e) {
		return JsHTMLElement.tagName.with(e);
	}

	/**
	 * <p>Gets {@link JsNode#nodeValue} of a given node.</p>
	 * @param n The given node. 
	 * @return The property value.
	 * @since 1.0
	 */
	public static final String nodeValue(JsNode n) {
		return JsNode.nodeValue.with(n);
	}

	/**
	 * <p>Gets {@link JsNode#firstChild} of a given node.</p>
	 * @param node The given node. 
	 * @return The property value.
	 * @since 1.0
	 */
	public static final JsNode firstChild(JsNode node) {
		return JsNode.firstChild.with(node);
	}

	/**
	 * <p>Gets {@link JsNode#lastChild} of a given node.</p>
	 * @param node The given node. 
	 * @return The property value.
	 * @since 1.0
	 */
	public static final JsNode lastChild(JsNode node) {
		return JsNode.lastChild.with(node);
	}

	/**
	 * <p>Gets {@link JsNode#previousSibling} of a given node.</p>
	 * @param node The given node. 
	 * @return The property value.
	 * @since 1.0
	 */
	public static final JsNode previousSibling(JsNode node) {
		return JsNode.previousSibling.with(node);
	}

	/**
	 * <p>Gets {@link JsNode#nextSibling} of a given node.</p>
	 * @param node The given node. 
	 * @return The property value.
	 * @since 1.0
	 */
	public static final JsNode nextSibling(JsNode node) {
		return JsNode.nextSibling.with(node);
	}

	/**
	 * <p>Gets {@link JsNode#nodeType} of a given node.</p>
	 * @param node The given node. 
	 * @return The property value.
	 * @since 1.0
	 */
	public static final Number nodeType(JsNode node) {
		return JsNode.nodeType.with(node);
	}

	private static final JsNode nextType(JsNode node, int type) {
		while (Js.be(node) && Js.neq(nodeType(node), type)) {
			node = nextSibling(node);
		}
		return node;
	}

	private static final JsNode previousType(JsNode node, int type) {
		while (Js.be(node) && Js.neq(nodeType(node), type)) {
			node = previousSibling(node);
		}
		return node;
	}

	/**
	 * <p>Gets the first child with a given type of a given node.</p>
	 * @param node The given node. 
	 * @param type The given node type. The legal node types are:
	 * <ul>
	 * <li>{@link js.dom.DOM2Core.Node#ELEMENT_NODE} or {@link JsNode#ELEMENT_NODE} for {@link JsElement} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#ATTRIBUTE_NODE} or {@link JsNode#ATTRIBUTE_NODE} for {@link JsAttr} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#TEXT_NODE} or {@link JsNode#TEXT_NODE} for {@link JsText} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#CDATA_SECTION_NODE} or {@link JsNode#CDATA_SECTION_NODE} for {@link JsCDATASection} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#PROCESSING_INSTRUCTION_NODE} or {@link JsNode#PROCESSING_INSTRUCTION_NODE} for {@link JsProcessingInstruction} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#COMMENT_NODE} or {@link JsNode#COMMENT_NODE} for {@link JsComment} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#DOCUMENT_NODE} or {@link JsNode#DOCUMENT_NODE} for {@link JsDocument} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#DOCUMENT_TYPE_NODE} or {@link JsNode#DOCUMENT_TYPE_NODE} for {@link JsDocumentType} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#DOCUMENT_FRAGMENT_NODE} or {@link JsNode#DOCUMENT_FRAGMENT_NODE} for {@link JsDocumentFragment} nodes</li>
	 * </ul>
	 * @return The result node.
	 * @since 1.0
	 */
	public static final JsNode firstChild(JsNode node, int type) {
		return nextType(firstChild(node), type);
	}

	/**
	 * <p>Gets the last child with a given type of a given node.</p>
	 * @param node The given node. 
	 * @param type The given node type. The legal node types are:
	 * <ul>
	 * <li>{@link js.dom.DOM2Core.Node#ELEMENT_NODE} or {@link JsNode#ELEMENT_NODE} for {@link JsElement} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#ATTRIBUTE_NODE} or {@link JsNode#ATTRIBUTE_NODE} for {@link JsAttr} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#TEXT_NODE} or {@link JsNode#TEXT_NODE} for {@link JsText} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#CDATA_SECTION_NODE} or {@link JsNode#CDATA_SECTION_NODE} for {@link JsCDATASection} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#PROCESSING_INSTRUCTION_NODE} or {@link JsNode#PROCESSING_INSTRUCTION_NODE} for {@link JsProcessingInstruction} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#COMMENT_NODE} or {@link JsNode#COMMENT_NODE} for {@link JsComment} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#DOCUMENT_NODE} or {@link JsNode#DOCUMENT_NODE} for {@link JsDocument} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#DOCUMENT_TYPE_NODE} or {@link JsNode#DOCUMENT_TYPE_NODE} for {@link JsDocumentType} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#DOCUMENT_FRAGMENT_NODE} or {@link JsNode#DOCUMENT_FRAGMENT_NODE} for {@link JsDocumentFragment} nodes</li>
	 * </ul>
	 * @return The result node.
	 * @since 1.0
	 */
	public static final JsNode lastChild(JsNode node, int type) {
		return previousType(lastChild(node), type);
	}

	/**
	 * <p>Gets the next sibling with a given type of a given node.</p>
	 * @param node The given node. 
	 * @param type The given node type. The legal node types are:
	 * <ul>
	 * <li>{@link js.dom.DOM2Core.Node#ELEMENT_NODE} or {@link JsNode#ELEMENT_NODE} for {@link JsElement} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#ATTRIBUTE_NODE} or {@link JsNode#ATTRIBUTE_NODE} for {@link JsAttr} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#TEXT_NODE} or {@link JsNode#TEXT_NODE} for {@link JsText} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#CDATA_SECTION_NODE} or {@link JsNode#CDATA_SECTION_NODE} for {@link JsCDATASection} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#PROCESSING_INSTRUCTION_NODE} or {@link JsNode#PROCESSING_INSTRUCTION_NODE} for {@link JsProcessingInstruction} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#COMMENT_NODE} or {@link JsNode#COMMENT_NODE} for {@link JsComment} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#DOCUMENT_NODE} or {@link JsNode#DOCUMENT_NODE} for {@link JsDocument} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#DOCUMENT_TYPE_NODE} or {@link JsNode#DOCUMENT_TYPE_NODE} for {@link JsDocumentType} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#DOCUMENT_FRAGMENT_NODE} or {@link JsNode#DOCUMENT_FRAGMENT_NODE} for {@link JsDocumentFragment} nodes</li>
	 * </ul>
	 * @return The result node.
	 * @since 1.0
	 */
	public static final JsNode nextSibling(JsNode node, int type) {
		return nextType(nextSibling(node), type);
	}

	/**
	 * <p>Gets the previous sibling with a given type of a given node.</p>
	 * @param node The given node. 
	 * @param type The given node type. The legal node types are:
	 * <ul>
	 * <li>{@link js.dom.DOM2Core.Node#ELEMENT_NODE} or {@link JsNode#ELEMENT_NODE} for {@link JsElement} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#ATTRIBUTE_NODE} or {@link JsNode#ATTRIBUTE_NODE} for {@link JsAttr} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#TEXT_NODE} or {@link JsNode#TEXT_NODE} for {@link JsText} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#CDATA_SECTION_NODE} or {@link JsNode#CDATA_SECTION_NODE} for {@link JsCDATASection} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#PROCESSING_INSTRUCTION_NODE} or {@link JsNode#PROCESSING_INSTRUCTION_NODE} for {@link JsProcessingInstruction} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#COMMENT_NODE} or {@link JsNode#COMMENT_NODE} for {@link JsComment} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#DOCUMENT_NODE} or {@link JsNode#DOCUMENT_NODE} for {@link JsDocument} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#DOCUMENT_TYPE_NODE} or {@link JsNode#DOCUMENT_TYPE_NODE} for {@link JsDocumentType} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#DOCUMENT_FRAGMENT_NODE} or {@link JsNode#DOCUMENT_FRAGMENT_NODE} for {@link JsDocumentFragment} nodes</li>
	 * </ul>
	 * @return The result node.
	 * @since 1.0
	 */
	public static final JsNode previousSibling(JsNode node, int type) {
		return previousType(previousSibling(node), type);
	}

	/**
	 * <p>Gets {@link JsHTMLElement#innerHTML} of a given node.</p>
	 * @param node The given node. 
	 * @return The property value.
	 * @since 1.0
	 */
	public final static String innerHTML(JsNode node) {
		return JsHTMLElement.innerHTML.with(node);
	}

	/**
	 * <p>Sets {@link JsHTMLElement#innerHTML} of a given element.</p>
	 * @param node The given node. 
	 * @param html The new HTML for the element. 
	 * @return The property value.
	 * @since 1.0
	 */
	public final static String innerHTML(JsNode node, String html) {
		return JsHTMLElement.innerHTML.with(node, html);
	}

	/**
	 * <p>A function that returns a copy of this object.</p>
	 * @since 1.0
	 */
	public final static Var<JsFunction<JsObject>> copy = new Static<JsFunction<JsObject>>(
			new Var<JsFunction<JsObject>>() {
				@Override
				public JsFunction<JsObject> var() {
					return Js.function(
							"var c={};for(var p in this){c[p]=this[p];}return c;"
					);
				}
			}
	);

	/**
	 * <p>A function that checks whether a node is contained within another node.</p>
	 * @since 1.0
	 */
	public final static Var<JsFunction<Boolean>> contains = new Static<JsFunction<Boolean>>(
			new Var<JsFunction<Boolean>>() {
				@Override
				public JsFunction<Boolean> var() {
					return Js.function(
							"c",
							"while(c){c=c.parentNode;if(this==c)return true;}return false;"
					);
				}
			}
	);

	/**
	 * <p>Checks whether a node is contained within another node.</p>
	 * @param p The containing node. 
	 * @param c The contained node. 
	 * @return <tt>true</tt> if the node contains the other; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	public final static boolean contains(JsNode p, JsNode c) {
		try {
			return contains.var().call(p, c);
		} catch (NullPointerException npe) {
			npe.printStackTrace();
			throw npe;
		}
	}

	/**
	 * <p>Checks whether a node is contained within another node.</p>
	 * @param p The containing node. 
	 * @param c The contained node. 
	 * @return <tt>true</tt> if the node contains the other; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	public final static boolean contains2(JsNode p, JsNode c) {
		while(Js.be(c)) {
			c = parentNode(c);
			if (Js.eq(c, p)) return true;
		}
		return false;
	}
}
