
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

package js.user;

import js.*;
import js.core.*;

/**
 * <p>An <b>opaque</b> class representing JavaScript client-side objects of the global 
 * {@link JsClient#Node} class.</p>
 * {@link JsWindow#document} object 
 * itself) implement this class, which provides the fundamental properties and methods 
 * for traversing and manipulating the tree. For Internet Explorer, this class also 
 * defines some IE-specific properties and methods for working with XML documents, 
 * XPath expressions, and XSLT transforms.</p>
 * <p>The {@link #parentNode} property and {@link #childNodes} array allow you to move 
 * up and down the document tree. You can enumerate the children of a given node by 
 * looping through the elements of {@link #childNodes} array or by using the {@link #firstChild} 
 * and {@link #nextSibling} properties, or the {@link #lastChild} and {@link #previousSibling} 
 * properties to loop backward. The {@link #appendChild(JsNode)}, {@link #insertBefore(JsNode, JsNode)}, 
 * {@link #removeChild(JsNode)}, and {@link #replaceChild(JsNode, JsNode)} methods allow 
 * you to modify the document tree by altering the children of a node.</p>
 * <p>Every object in a document tree implements both the class and a more specialized 
 * subclass, such as {@link JsElement} or {@link JsText}. The {@link #nodeType} property 
 * specifies which subclass a node implements. You can use this property to test the 
 * type of a node before using properties or methods of the more specialized subclass.</p>
 * <p>The {@link #nodeName} and {@link #nodeValue} properties specify additional 
 * information about a node, but their value depends on {@link #nodeType}. Note that 
 * subclasses typically define specialized properties, such as the {@link JsElement#tagName} 
 * property of {@link JsElement} nodes and the {@link JsCharacterData#data} property of 
 * {@link JsText} nodes, for obtaining this information.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsNode extends JsClient.Node.Prototype
{
	/**
	 * A legal value for the {@link #nodeType} property of a {@link JsNode} object 
	 * indicating the type of the node. For the compatibility with IE, you must use 
	 * this numeric literal directly instead of {@link js.dom.DOM2Core.Node#ELEMENT_NODE}.
	 * @since 1.0
	 * @see js.dom.DOM2Core.Node#ELEMENT_NODE
	 * @see js.dom.DOM2Core.Node.Member#ELEMENT_NODE
	 */
	public static final int ELEMENT_NODE                = 1;
	/**
	 * A legal value for the {@link #nodeType} property of a {@link JsNode} object 
	 * indicating the type of the node. For the compatibility with IE, you must use 
	 * this numeric literal directly instead of {@link js.dom.DOM2Core.Node#ATTRIBUTE_NODE}.
	 * @since 1.0
	 * @see js.dom.DOM2Core.Node#ATTRIBUTE_NODE
	 * @see js.dom.DOM2Core.Node.Member#ATTRIBUTE_NODE
	 */
	public static final int ATTRIBUTE_NODE              = 2;
	/**
	 * A legal value for the {@link #nodeType} property of a {@link JsNode} object 
	 * indicating the type of the node. For the compatibility with IE, you must use 
	 * this numeric literal directly instead of {@link js.dom.DOM2Core.Node#TEXT_NODE}.
	 * @since 1.0
	 * @see js.dom.DOM2Core.Node#TEXT_NODE
	 * @see js.dom.DOM2Core.Node.Member#TEXT_NODE
	 */
	public static final int TEXT_NODE                   = 3;
	/**
	 * A legal value for the {@link #nodeType} property of a {@link JsNode} object 
	 * indicating the type of the node. For the compatibility with IE, you must use 
	 * this numeric literal directly instead of {@link js.dom.DOM2Core.Node#CDATA_SECTION_NODE}.
	 * @since 1.0
	 * @see js.dom.DOM2Core.Node#CDATA_SECTION_NODE
	 * @see js.dom.DOM2Core.Node.Member#CDATA_SECTION_NODE
	 */
	public static final int CDATA_SECTION_NODE          = 4;
	/**
	 * A legal value for the {@link #nodeType} property of a {@link JsNode} object 
	 * indicating the type of the node. This constant is only defined by DOM specification 
	 * but not supported in main stream web browsers. It's here for documentation 
	 * purpose only.
	 * @since 1.0
	 */
	public static final int ENTITY_REFERENCE_NODE       = 5;
	/**
	 * A legal value for the {@link #nodeType} property of a {@link JsNode} object 
	 * indicating the type of the node. This constant is only defined by DOM specification 
	 * but not supported in main stream web browsers. It's here for documentation 
	 * purpose only.
	 * @since 1.0
	 */
	public static final int ENTITY_NODE                 = 6;
	/**
	 * A legal value for the {@link #nodeType} property of a {@link JsNode} object 
	 * indicating the type of the node. For the compatibility with IE, you must use 
	 * this numeric literal directly instead of {@link js.dom.DOM2Core.Node#PROCESSING_INSTRUCTION_NODE}.
	 * @since 1.0
	 * @see js.dom.DOM2Core.Node#PROCESSING_INSTRUCTION_NODE
	 * @see js.dom.DOM2Core.Node.Member#PROCESSING_INSTRUCTION_NODE
	 */
	public static final int PROCESSING_INSTRUCTION_NODE = 7;
	/**
	 * A legal value for the {@link #nodeType} property of a {@link JsNode} object 
	 * indicating the type of the node. For the compatibility with IE, you must use 
	 * this numeric literal directly instead of {@link js.dom.DOM2Core.Node#COMMENT_NODE}.
	 * @since 1.0
	 * @see js.dom.DOM2Core.Node#COMMENT_NODE
	 * @see js.dom.DOM2Core.Node.Member#COMMENT_NODE
	 */
	public static final int COMMENT_NODE                = 8;
	/**
	 * A legal value for the {@link #nodeType} property of a {@link JsNode} object 
	 * indicating the type of the node. For the compatibility with IE, you must use 
	 * this numeric literal directly instead of {@link js.dom.DOM2Core.Node#DOCUMENT_NODE}.
	 * @since 1.0
	 * @see js.dom.DOM2Core.Node#DOCUMENT_NODE
	 * @see js.dom.DOM2Core.Node.Member#DOCUMENT_NODE
	 */
	public static final int DOCUMENT_NODE               = 9;
	/**
	 * A legal value for the {@link #nodeType} property of a {@link JsNode} object 
	 * indicating the type of the node. For the compatibility with IE, you must use 
	 * this numeric literal directly instead of {@link js.dom.DOM2Core.Node#DOCUMENT_TYPE_NODE}.
	 * @since 1.0
	 * @see js.dom.DOM2Core.Node#DOCUMENT_TYPE_NODE
	 * @see js.dom.DOM2Core.Node.Member#DOCUMENT_TYPE_NODE
	 */
	public static final int DOCUMENT_TYPE_NODE          = 10;
	/**
	 * A legal value for the {@link #nodeType} property of a {@link JsNode} object 
	 * indicating the type of the node. For the compatibility with IE, you must use 
	 * this numeric literal directly instead of {@link js.dom.DOM2Core.Node#DOCUMENT_FRAGMENT_NODE}.
	 * @since 1.0
	 * @see js.dom.DOM2Core.Node#DOCUMENT_FRAGMENT_NODE
	 * @see js.dom.DOM2Core.Node.Member#DOCUMENT_FRAGMENT_NODE
	 */
	public static final int DOCUMENT_FRAGMENT_NODE      = 11;
	/**
	 * A legal value for the {@link #nodeType} property of a {@link JsNode} object 
	 * indicating the type of the node. This constant is only defined by DOM specification 
	 * but not supported in main stream web browsers. It's here for documentation 
	 * purpose only.
	 * @since 1.0
	 */
	public static final int NOTATION_NODE               = 12;

	/**
	 * <p>An <b>internal</b> class containing membership data for its enclosing
	 * opaque class.</p>
	 * <p>This class is only used inside of <b>opaque</b> or <b>internal</b> classes or
	 * class members.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript Re-compilers must report error on resolving an <b>internal</b> class.
	 */
	protected static abstract class Members extends JsClient.Node.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNode#attributes
		 * @see JsNode.Member#attributes
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid attributes      = id("attributes"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNode#childNodes
		 * @see JsNode.Member#childNodes
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid childNodes      = id("childNodes"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNode#firstChild
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid firstChild      = id("firstChild"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNode#lastChild
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid lastChild       = id("lastChild"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNode#localName
		 * @see JsNode.Member#localName
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid localName       = id("localName"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNode#namespaceURI
		 * @see JsNode.Member#namespaceURI
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid namespaceURI    = id("namespaceURI"   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNode#nextSibling
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid nextSibling     = id("nextSibling"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNode#nodeName
		 * @see JsNode.Member#nodeName
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid nodeName        = id("nodeName"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNode#nodeType
		 * @see JsNode.Member#nodeType
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid nodeType        = id("nodeType"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNode#nodeValue
		 * @see JsNode.Member#nodeValue
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid nodeValue       = id("nodeValue"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNode#ownerDocument
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid ownerDocument   = id("ownerDocument"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNode#parentNode
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid parentNode      = id("parentNode"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNode#prefix
		 * @see JsNode.Member#prefix
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid prefix          = id("prefix"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNode#previousSibling
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid previousSibling = id("previousSibling");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNode#xml
		 * @see JsNode.Member#xml
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid xml             = id("xml"            );
	}
	/**
	 * <p>An <b>opaque</b> class representing members of its enclosing <b>opaque</b> type.</p>
	 * <p>Note that, this class is <b>opaque</b> but its constructors are all <b>internal</b>. 
	 * This class and the subclasses of this class are used to declare either <b>opaque</b> 
	 * <tt>public</tt> instance fields of the opaque type {@link js.Var.Member} or the 
	 * <b>opaque</b> <tt>public</tt> static fields of other <b>opaque</b> types while their 
	 * constructors are used to define the fields inside <b>opaque</b> classes. Under 
	 * either circumstance, the field names must be exactly same as the member names, as 
	 * the <b>opaque</b> fields of <b>opaque</b> types are resolved by re-compilers directly 
	 * based on the field names.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be created
	 * in the target codes. Re-compilers must exit with error on operations accessing that kind 
	 * of class objects.
	 * Re-compilers must resolve an <b>opaque</b> instance field declared by this class in
	 * {@link js.Var.Member} or its subclasses to the JavaScript identifier: 
	 * <pre>q.m</pre>
	 * where <tt>m</tt> is the identifier of the field name and <tt>q</tt> is the identifier
	 * resolved from the instance of the enclosing member. Re-compilers must resolve an 
	 * <b>opaque</b> static field declared by this class in <b>opaque</b> types other than 
	 * {@link js.Var.Member} and its subclasses to the JavaScript identifier: 
	 * <pre>m</pre>
	 * where <tt>m</tt> is the identifier of the field name. And re-compilers must report
	 * error on the access to <b>opaque</b> fields declared by this class under any other 
	 * circumstances.
	 */
	public static class Member extends JsClient.Node.Prototype.Member
	{
		/**
		 * <p>Internally constructs a member based on a qualifying member.</p>
		 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b>
		 * or <b>internal</b> classes or class members.</p>
		 * <p>Note that, this constructor is <b>internal</b> but its declaring class is
		 * <b>opaque</b>. This constructor is used to define <b>opaque</b> instance fields 
		 * declared in the declaring class of this constructor itself or its subclasses. 
		 * Under this circumstance, the field names must be exactly same as the member 
		 * names, as the <b>opaque</b> instance fields of the <b>opaque</b> type 
		 * {@link js.Var.Member} or its subclasses are resolved by re-compilers directly
		 * to their names appending to the name resolved from the specified qualifying 
		 * member with a dot in between.</p>
		 * @param q A qualifying member
		 * @param mid The ID of the member to construct
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor.
		 */
		public Member(JsObject.Member q, Mid mid) {
			super(q, mid);
		}
		/**
		 * <p>Internally constructs a member without a qualifying member.</p>
		 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b>
		 * or <b>internal</b> classes or class members.</p>
		 * <p>Note that, this constructor is <b>internal</b> but its declaring class is
		 * <b>opaque</b>. This constructor is used to define <b>opaque</b> static fields, 
		 * declared in <b>opaque</b> types other than the declaring class of this constructor 
		 * itself and its subclasses. Under this circumstance, the field names must be
		 * exactly same as the member names, as the <b>opaque</b> static fields of <b>opaque</b>
		 * types are generally resolved by re-compilers directly to identifiers of their names.</p>
		 * @param mid The ID of the member to construct
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor.
		 */
		public Member(Mid mid) {
			super(mid);
		}
		@Override
		/**
		 * <p>Evaluates the property, represented by the current member instance, of the
		 * argument object.</p>
		 * @param o The argument object
		 * @return The value of the current member based on the object argument.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into
		 * the JavaScript expression: 
		 * <pre>o.m</pre>
		 * where <tt>m</tt> is the identifier name resolved from the current member
		 * instance of the invocation.
		 */
		public JsNode with(ObjectLike o) {
			return new JsNode(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsElement} object 
		 * refers to a read-only array of {@link JsAttr} nodes that represent the 
		 * attributes of that element. Note that this array is live: any changes to the 
		 * attributes of the element are immediately visible through it.</p>
		 * <p>Technically, the array is of <tt>NamedNodeMap</tt> interface which is 
		 * specified by the Level 1 DOM standard and defines a number of methods for 
		 * querying, setting, and removing elements. {@link JsElement} defines better 
		 * methods for setting and querying element attributes, and there are no other 
		 * uses of <tt>NamedNodeMap</tt> that are relevant to client-side JavaScript. 
		 * Treat the {@link #attributes} property as a read-only array of {@link JsAttr} 
		 * objects, or use the methods defined by {@link JsElement} to query, set, and 
		 * delete attributes.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsArray.Member attributes = new JsArray.Member(this, Members.attributes);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsNode} object 
		 * refers to a read-only array containing the child nodes of the current node. 
		 * This property should never be <tt>null</tt> and for nodes with no children, 
		 * the length of the array is zero. The property is actually a {@link JsNodeList} 
		 * object, but it behaves just like a read-only array of {@link JsNode} objects. 
		 * Note that the {@link JsNodeList} object is live: any changes to this element's 
		 * list of children are immediately visible through the {@link JsNodeList} object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsNodeList.Member<?> childNodes = new JsNodeList.Member<JsNode>(this, Members.childNodes);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsNode} object 
		 * refers to a read-only string specifying the local part of the element or 
		 * attribute name for XML documents that use name spaces. The property is never 
		 * used with HTML documents.</p>
		 * @since 1.0
		 * @see #namespaceURI
		 * @see #prefix
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member localName      = new Value.String.Member(this, Members.localName   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsElement} or {@link JsAttr} object 
		 * refers to a read-only string specifying URI of the name space of the node for 
		 * XML documents that use name spaces. The property is never used with HTML 
		 * documents.</p>
		 * @since 1.0
		 * @see #localName
		 * @see #prefix
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member namespaceURI   = new Value.String.Member(this, Members.namespaceURI);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsNode} object 
		 * refers to a read-only string specifying the name of the node. For {@link JsElement} 
		 * nodes, it specifies the tag name of the element, which can also be retrieved 
		 * with the {@link JsElement#tagName} property. For other types of nodes, the 
		 * value of {@link #nodeName} depends on the node type:
		 * <ul>
		 * <li>{@link JsNode#ELEMENT_NODE}: The element's tag name.</li>
		 * <li>{@link JsNode#ATTRIBUTE_NODE}: The attribute name.</li>
		 * <li>{@link JsNode#TEXT_NODE}: "#text"</li>
		 * <li>{@link JsNode#CDATA_SECTION_NODE}: "#cdata-section"</li>
		 * <li>{@link JsNode#PROCESSING_INSTRUCTION_NODE}: The target of the PI.</li>
		 * <li>{@link JsNode#COMMENT_NODE}: "#comment"</li>
		 * <li>{@link JsNode#DOCUMENT_NODE}: "#document"</li>
		 * <li>{@link JsNode#DOCUMENT_TYPE_NODE}: The document type name.</li>
		 * <li>{@link JsNode#DOCUMENT_FRAGMENT_NODE}: "#document-fragment"</li>
		 * </ul></p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member nodeName       = new Value.String.Member(this, Members.nodeName    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsNode} object 
		 * refers to a read-only integer value represents the type of the node specifying which 
		 * sub-interface the node implements. The legal values are:
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
		 * For the compatibility with IE, you must use the static numeric literals 
		 * {@link JsClient#Node}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member nodeType       = new Value.Number.Member(this, Members.nodeType    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsNode} object 
		 * refers to a read-only string specifying the value of the node. For {@link JsText} 
		 * nodes, it holds the text content. For other types of nodes, the value depends 
		 * on the value of {@link #nodeType}:
		 * <ul>
		 * <li>{@link JsNode#ELEMENT_NODE}: <tt>null</tt></li>
		 * <li>{@link JsNode#ATTRIBUTE_NODE}: The attribute value.</li>
		 * <li>{@link JsNode#TEXT_NODE}: The text of the node.</li>
		 * <li>{@link JsNode#CDATA_SECTION_NODE}: The text of the node.</li>
		 * <li>{@link JsNode#PROCESSING_INSTRUCTION_NODE}: The remainder of the PI.</li>
		 * <li>{@link JsNode#COMMENT_NODE}: The text of the comment.</li>
		 * <li>{@link JsNode#DOCUMENT_NODE}: <tt>null</tt></li>
		 * <li>{@link JsNode#DOCUMENT_TYPE_NODE}: <tt>null</tt></li>
		 * <li>{@link JsNode#DOCUMENT_FRAGMENT_NODE}: <tt>null</tt></li>
		 * </ul></p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member nodeValue      = new Value.String.Member(this, Members.nodeValue   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsElement} or {@link JsAttr} object 
		 * refers to a read-only string specifying the name space prefix of the node for 
		 * XML documents that use name spaces. The property is never used with HTML 
		 * documents.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member prefix         = new Value.String.Member(this, Members.prefix      );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsElement} or {@link JsAttr} object 
		 * refers to a read-only string specifying the text of the XML document or an element within an 
		 * XML document.</p> 
		 * <p>Note that the property is IE-Specific. Compare this property to the {@link JsHTMLElement#innerHTML} 
		 * property, and see {@link JsXMLSerializer} for a cross-platform alternative.</p>
		 * @since 1.0
		 * @see JsHTMLElement#innerHTML
		 * @see JsXMLSerializer
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member xml            = new Value.String.Member(this, Members.xml         );
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsNode(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsElement} object 
	 * refers to a read-only array of {@link JsAttr} nodes that represent the 
	 * attributes of that element. Note that this array is live: any changes to the 
	 * attributes of the element are immediately visible through it.</p>
	 * <p>Technically, the array is of <tt>NamedNodeMap</tt> interface which is 
	 * specified by the Level 1 DOM standard and defines a number of methods for 
	 * querying, setting, and removing elements. {@link JsElement} defines better 
	 * methods for setting and querying element attributes, and there are no other 
	 * uses of <tt>NamedNodeMap</tt> that are relevant to client-side JavaScript. 
	 * Treat the {@link #attributes} property as a read-only array of {@link JsAttr} 
	 * objects, or use the methods defined by {@link JsElement} to query, set, and 
	 * delete attributes.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsArray.Member attributes = new JsArray.Member(Members.attributes);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsNode} object 
	 * refers to a read-only array containing the child nodes of the current node. 
	 * This property should never be <tt>null</tt> and for nodes with no children, 
	 * the length of the array is zero. The property is actually a {@link JsNodeList} 
	 * object, but it behaves just like a read-only array of {@link JsNode} objects. 
	 * Note that the {@link JsNodeList} object is live: any changes to this element's 
	 * list of children are immediately visible through the {@link JsNodeList} object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsNodeList.Member<?> childNodes = new JsNodeList.Member<JsNode>(Members.childNodes);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsNode} object is a 
	 * read-only reference to the first child of the node, or <tt>null</tt> if the node 
	 * has no children.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsNode.Member firstChild      = new JsNode.Member(Members.firstChild     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsNode} object is a 
	 * read-only reference to the last child of the node, or <tt>null</tt> if the node 
	 * has no children.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsNode.Member lastChild       = new JsNode.Member(Members.lastChild      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsNode} object is a 
	 * read-only reference to the sibling node that immediately follows the current node 
	 * in the {@link JsNode#childNodes} array of the {@link #parentNode} of the current 
	 * one, or <tt>null</tt> if there is no such node.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsNode.Member nextSibling     = new JsNode.Member(Members.nextSibling    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsNode} object is a 
	 * read-only reference to the parent or container node of that node, or <tt>null</tt> 
	 * if there is no parent. Note that the {@link JsDocument}, {@link JsDocumentFragment}, 
	 * and {@link JsAttr} nodes never have parent nodes. Also, nodes that have been 
	 * removed from the document, or that are newly created and have not yet been 
	 * inserted into the document tree, have a {@link #parentNode} of <tt>null</tt>.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsNode.Member parentNode      = new JsNode.Member(Members.parentNode     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsNode} object is a 
	 * read-only reference to the sibling node that immediately precedes the current node 
	 * in the {@link JsNode#childNodes} array of the {@link #parentNode} of the current 
	 * one, or <tt>null</tt> if there is no such node.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsNode.Member previousSibling = new JsNode.Member(Members.previousSibling);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsNode} object is a 
	 * read-only reference to the {@link JsDocument} object of which the node is a part. 
	 * For {@link JsDocument} nodes, the property is <tt>null</tt>.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsDocument.Member ownerDocument = new JsDocument.Member(Members.ownerDocument);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsNode} object 
	 * refers to a read-only string specifying the local part of the element or 
	 * attribute name for XML documents that use name spaces. The property is never 
	 * used with HTML documents.</p>
	 * @since 1.0
	 * @see #namespaceURI
	 * @see #prefix
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member localName      = new Value.String.Member(Members.localName   );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsElement} or {@link JsAttr} object 
	 * refers to a read-only string specifying URI of the name space of the node for 
	 * XML documents that use name spaces. The property is never used with HTML 
	 * documents.</p>
	 * @since 1.0
	 * @see #localName
	 * @see #prefix
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member namespaceURI   = new Value.String.Member(Members.namespaceURI);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsNode} object 
	 * refers to a read-only string specifying the name of the node. For {@link JsElement} 
	 * nodes, it specifies the tag name of the element, which can also be retrieved 
	 * with the {@link JsElement#tagName} property. For other types of nodes, the 
	 * value of {@link #nodeName} depends on the node type:
	 * <ul>
	 * <li>{@link #ELEMENT_NODE}: The element's tag name.</li>
	 * <li>{@link #ATTRIBUTE_NODE}: The attribute name.</li>
	 * <li>{@link #TEXT_NODE}: "#text"</li>
	 * <li>{@link #CDATA_SECTION_NODE}: "#cdata-section"</li>
	 * <li>{@link #PROCESSING_INSTRUCTION_NODE}: The target of the PI.</li>
	 * <li>{@link #COMMENT_NODE}: "#comment"</li>
	 * <li>{@link #DOCUMENT_NODE}: "#document"</li>
	 * <li>{@link #DOCUMENT_TYPE_NODE}: The document type name.</li>
	 * <li>{@link #DOCUMENT_FRAGMENT_NODE}: "#document-fragment"</li>
	 * </ul></p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member nodeName       = new Value.String.Member(Members.nodeName    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsNode} object 
	 * refers to a read-only integer value represents the type of the node specifying which 
	 * sub-interface the node implements. The legal values are:
	 * <ul>
	 * <li>{@link js.dom.DOM2Core.Node#ELEMENT_NODE} or {@link #ELEMENT_NODE} for {@link JsElement} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#ATTRIBUTE_NODE} or {@link #ATTRIBUTE_NODE} for {@link JsAttr} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#TEXT_NODE} or {@link #TEXT_NODE} for {@link JsText} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#CDATA_SECTION_NODE} or {@link #CDATA_SECTION_NODE} for {@link JsCDATASection} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#PROCESSING_INSTRUCTION_NODE} or {@link #PROCESSING_INSTRUCTION_NODE} for {@link JsProcessingInstruction} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#COMMENT_NODE} or {@link #COMMENT_NODE} for {@link JsComment} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#DOCUMENT_NODE} or {@link #DOCUMENT_NODE} for {@link JsDocument} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#DOCUMENT_TYPE_NODE} or {@link #DOCUMENT_TYPE_NODE} for {@link JsDocumentType} nodes</li>
	 * <li>{@link js.dom.DOM2Core.Node#DOCUMENT_FRAGMENT_NODE} or {@link #DOCUMENT_FRAGMENT_NODE} for {@link JsDocumentFragment} nodes</li>
	 * </ul>
	 * For the compatibility with IE, you must use the static numeric literals 
	 * {@link JsClient#Node}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member nodeType       = new Value.Number.Member(Members.nodeType    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsNode} object 
	 * refers to a read-only string specifying the value of the node. For {@link JsText} 
	 * nodes, it holds the text content. For other types of nodes, the value depends 
	 * on the value of {@link #nodeType}:
	 * <ul>
	 * <li>{@link #ELEMENT_NODE}: <tt>null</tt></li>
	 * <li>{@link #ATTRIBUTE_NODE}: The attribute value.</li>
	 * <li>{@link #TEXT_NODE}: The text of the node.</li>
	 * <li>{@link #CDATA_SECTION_NODE}: The text of the node.</li>
	 * <li>{@link #PROCESSING_INSTRUCTION_NODE}: The remainder of the PI.</li>
	 * <li>{@link #COMMENT_NODE}: The text of the comment.</li>
	 * <li>{@link #DOCUMENT_NODE}: <tt>null</tt></li>
	 * <li>{@link #DOCUMENT_TYPE_NODE}: <tt>null</tt></li>
	 * <li>{@link #DOCUMENT_FRAGMENT_NODE}: <tt>null</tt></li>
	 * </ul></p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member nodeValue      = new Value.String.Member(Members.nodeValue   );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsElement} or {@link JsAttr} object 
	 * refers to a read-only string specifying the name space prefix of the node for 
	 * XML documents that use name spaces. The property is never used with HTML 
	 * documents.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member prefix         = new Value.String.Member(Members.prefix      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsElement} or {@link JsAttr} object 
	 * refers to a read-only string specifying the text of the XML document or an element within an 
	 * XML document.</p> 
	 * <p>Note that the property is IE-Specific. Compare this property to the {@link JsHTMLElement#innerHTML} 
	 * property, and see {@link JsXMLSerializer} for a cross-platform alternative.</p>
	 * @since 1.0
	 * @see JsHTMLElement#innerHTML
	 * @see JsXMLSerializer
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member xml            = new Value.String.Member(Members.xml         );

	@Override
	/**
	 * <p>Returns the primitive value associated with the current instance, if there is one.
	 * This invocation simply returns the instance itself for the current instance is an 
	 * object and there is no primitive value for it.</p>
	 * @return The current object itself or its copy.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public JsNode valueOf() {
		return new JsNode((JsObject)var().valueOf());
	}
	/**
	 * <p>Gets a property of the current object instance by its opaque member.</p>
	 * @param m The opaque member of the property to get.
	 * @return The property of the current object instance specified by its opaque member.
	 * @see #var(JsNode.Member)
	 * @see #var(JsDocument.Member)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.m</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>m</tt> 
	 * must be resolved to the property identifier at re-compile time.
	 */
	public final JsNodeList<?> var(JsNodeList.Member<?> m) {
		return m.with(this);
	}
	/**
	 * <p>Gets a property of the current object instance by its opaque member.</p>
	 * @param m The opaque member of the property to get.
	 * @return The property of the current object instance specified by its opaque member.
	 * @see #var(JsNodeList.Member)
	 * @see #var(JsDocument.Member)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.m</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>m</tt> 
	 * must be resolved to the property identifier at re-compile time.
	 */
	public final JsNode var(JsNode.Member m) {
		return m.with(this);
	}
	/**
	 * <p>Gets a property of the current object instance by its opaque member.</p>
	 * @param m The opaque member of the property to get.
	 * @return The property of the current object instance specified by its opaque member.
	 * @see #var(JsNodeList.Member)
	 * @see #var(JsNode.Member)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.m</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>m</tt> 
	 * must be resolved to the property identifier at re-compile time.
	 */
	public final JsDocument var(JsDocument.Member m) {
		return m.with(this);
	}

	/**
	 * <p>Adds a node to the document tree by appending it to the {@link #childNodes} 
	 * array of this node.</p>
	 * <p>This method adds the node <tt>newChild</tt> to the document, inserting it as 
	 * the last child of this node. If <tt>newChild</tt> is already in the document tree, 
	 * it is removed from the tree and then reinserted at its new location. If <tt>newChild</tt> 
	 * is a {@link JsDocumentFragment} node, it is not inserted itself; instead, all its 
	 * children are appended, in order, to the end of this node's {@link #childNodes} 
	 * array. Note that a node from (or created by) one document cannot be inserted into 
	 * a different document. That is, the {@link #ownerDocument} property of <tt>newChild</tt> 
	 * must be the same as the {@link #ownerDocument} property of this node.</p>
	 * @param newChild The node to be inserted into the document. If the node is of 
	 * {@link JsDocumentFragment}, it is not directly inserted, but each of its children 
	 * are.
	 * @return The node that was added.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#HIERARCHY_REQUEST_ERR} 
	 * if the node does not allow children, it does not allow children of the specified 
	 * type, or <tt>newChild</tt> is an ancestor of this node (or is this node itself), 
	 * the value {@link JsDOMException#WRONG_DOCUMENT_ERR} if the {@link #ownerDocument} 
	 * property of <tt>newChild</tt> is not the same as the {@link #ownerDocument} 
	 * property of this node, or the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if the node is read-only and does not allow children to be appended, or the node 
	 * being appended is already part of the document tree, and its parent is read-only 
	 * and does not allow children to be removed. See {@link Js#err(Object)} for JS 
	 * Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public JsNode appendChild(JsNode newChild) {
		return new JsNode(call(appendChild, newChild));
	}
	/**
	 * <p>Makes a copy of this node, or of the node and all its descendants.</p>
	 * <p>This method makes and returns a copy of the node on which it is called. If 
	 * passed the argument <tt>true</tt>, it recursively clones all descendants of the 
	 * node as well. Otherwise, it clones only the node and none of its children. The 
	 * returned node is not part of the document tree, and its {@link #parentNode} 
	 * property is <tt>null</tt>. When a {@link JsElement} node is cloned, all of its 
	 * attributes are also cloned. Note, however, that event listener functions 
	 * registered on a node are not cloned.</p>
	 * @param deep <tt>true</tt> to clone recursively all descendants of the node; 
	 * Otherwise, clone only this node.
	 * @return A copy of this node.
	 * @see #cloneNode(JsBoolean)
	 * @see #cloneNode(Value)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public JsNode cloneNode(Boolean deep) {
		return new JsNode(call(cloneNode, deep));
	}
	/**
	 * <p>Makes a copy of this node, or of the node and all its descendants.</p>
	 * <p>This method makes and returns a copy of the node on which it is called. If 
	 * passed the argument <tt>true</tt>, it recursively clones all descendants of the 
	 * node as well. Otherwise, it clones only the node and none of its children. The 
	 * returned node is not part of the document tree, and its {@link #parentNode} 
	 * property is <tt>null</tt>. When a {@link JsElement} node is cloned, all of its 
	 * attributes are also cloned. Note, however, that event listener functions 
	 * registered on a node are not cloned.</p>
	 * @param deep <tt>true</tt> to clone recursively all descendants of the node; 
	 * Otherwise, clone only this node.
	 * @return A copy of this node.
	 * @see #cloneNode(Boolean)
	 * @see #cloneNode(JsBoolean)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public JsNode cloneNode(Value<Boolean> deep) {
		return cloneNode(Js.valueOf(deep));
	}
	/**
	 * <p>Makes a copy of this node, or of the node and all its descendants.</p>
	 * <p>This method makes and returns a copy of the node on which it is called. If 
	 * passed the argument <tt>true</tt>, it recursively clones all descendants of the 
	 * node as well. Otherwise, it clones only the node and none of its children. The 
	 * returned node is not part of the document tree, and its {@link #parentNode} 
	 * property is <tt>null</tt>. When a {@link JsElement} node is cloned, all of its 
	 * attributes are also cloned. Note, however, that event listener functions 
	 * registered on a node are not cloned.</p>
	 * @param deep <tt>true</tt> to clone recursively all descendants of the node; 
	 * Otherwise, clone only this node.
	 * @return A copy of this node.
	 * @see #cloneNode(Boolean)
	 * @see #cloneNode(Value)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public JsNode cloneNode(JsBoolean deep) {
		return cloneNode(Js.valueOf(deep));
	}
	/**
	 * <p>Checks if this node is a {@link JsElement} and has any attributes.</p>
	 * @return <tt>true</tt> if this node has one or more attributes; <tt>false</tt> if 
	 * it has none. Note that only {@link JsElement} nodes can have attributes.
	 * @since 1.0
	 * @see JsElement#getAttribute(String)
	 * @see JsElement#hasAttribute(String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Boolean hasAttributes() {
		return call(hasAttributes);
	}
	/**
	 * <p>Checks if this node has any children.</p>
	 * @return <tt>true</tt> if this node has one or more children; <tt>false</tt> if 
	 * it has none.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Boolean hasChildNodes() {
		return call(hasChildNodes);
	}
	/**
	 * <p>Inserts an element at the specified location.</p>
	 * <p>This method is IE-specific.</p>
	 * @param where A string that specifies where to insert the HTML element, using one of
	 * the following values: 
	 * <ul>
	 * <li>"beforeBegin": Inserts <tt>node</tt> immediately before the object.</li>
	 * <li>"afterBegin": Inserts <tt>node</tt> after the start of the object but before all other 
	 * content in the object.</li>
	 * <li>"beforeEnd": Inserts <tt>node</tt> immediately before the end of the object but after 
	 * all other content in the object.</li>
	 * <li>"afterEnd": Inserts <tt>node</tt> immediately after the end of the object.</li>
	 * </ul>
	 * @param node An object that specifies the element to be inserted adjacent to the 
	 * object that invoked the method.
	 * @return An element object.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Object insertAdjacentElement(String where, JsNode node) {
		return call(insertAdjacentElement, new Vars<Object>().add(where).add(node));
	}
	/**
	 * <p>Inserts the given HTML text into the element at the location.</p>
	 * <p>This method is IE-specific.</p>
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
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void insertAdjacentHTML(String where, String html) {
		call(insertAdjacentHTML, new Vars<Object>().add(where).add(html));
	}
	/**
	 * <p>Inserts the given text into the element at the location.</p>
	 * <p>This method is IE-specific.</p>
	 * @param where A string that specifies where to insert the text, using one of
	 * the following values: 
	 * <ul>
	 * <li>"beforeBegin": Inserts <tt>text</tt> immediately before the object.</li>
	 * <li>"afterBegin": Inserts <tt>text</tt> after the start of the object but before all other 
	 * content in the object.</li>
	 * <li>"beforeEnd": Inserts <tt>text</tt> immediately before the end of the object but after 
	 * all other content in the object.</li>
	 * <li>"afterEnd": Inserts <tt>text</tt> immediately after the end of the object.</li>
	 * </ul>
	 * @param text A string that specifies the text to insert. The text inserted into the element is 
	 * plain text.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void insertAdjacentText(String where, String text) {
		call(insertAdjacentText, new Vars<Object>().add(where).add(text));
	}
	/**
	 * <p>Inserts a node into the document tree immediately before the specified child 
	 * of this node.</p>
	 * <p>This method inserts the node <tt>newChild</tt> into the document tree as a 
	 * child of this node. The new node is positioned within this node's {@link #childNodes} 
	 * array so that it comes immediately before the <tt>refChild</tt> node. If <tt>refChild</tt> 
	 * is <tt>null</tt>, <tt>newChild</tt> is inserted at the end of {@link #childNodes}, 
	 * just as with the {@link #appendChild(JsNode)} method. Note that it is illegal to 
	 * call this method with a <tt>refChild</tt> that is not a child of this node.</p>
	 * <p>If the node being inserted is already in the tree, it is removed and 
	 * reinserted at its new location.</p>
	 * <p>If <tt>newChild</tt> is a {@link JsDocumentFragment} node, it is not inserted 
	 * itself; instead, each of its children is inserted, in order, at the specified 
	 * location.</p>
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
	 * the value {@link JsDOMException#WRONG_DOCUMENT_ERR} if the {@link #ownerDocument} 
	 * property of <tt>newChild</tt> is not the same as the {@link #ownerDocument} 
	 * property of this node, the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if the node is read-only and does not allow insertion, or the parent of <tt>newChild</tt> 
	 * is read-only and does not allow deletion, or the value {@link JsDOMException#NOT_FOUND_ERR} 
	 * if <tt>refChild</tt> is not a child of this node. See {@link Js#err(Object)} for JS 
	 * Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public JsNode insertBefore(JsNode newChild, JsNode refChild) {
		return new JsNode(call(insertBefore, new Vars<Object>().add(newChild).add(refChild)));
	}
	/**
	 * <p>Determines if the specified version number of a named feature is supported 
	 * by this node.</p>
	 * <p>The W3C DOM standard is modular, and implementations are not required to 
	 * implement all modules or features of the standard. This method tests whether the 
	 * implementation of this node supports the specified version of the named feature.</p>
	 * @param feature The name of the feature to test. 
	 * The complete set of valid module names for the 
	 * DOM Level 2 standard that may be used as this argument are listed as follows:
	 * <ul>
	 * <li>Core: Node, Element, Document, Text, and the other fundamental interfaces 
	 * required by all DOM implementations are implemented. All conforming implementations 
	 * must support this module.</li>
	 * <li>HTML: HTMLElement, HTMLDocument, and the other HTML-specific interfaces are 
	 * implemented.</li>
	 * <li>XML: Entity, EntityReference, ProcessingInstruction, Notation, and the other 
	 * node types that are useful only with XML documents are implemented.</li>
	 * <li>StyleSheets: Simple interfaces describing generic style-sheets are implemented.</li>
	 * <li>CSS: Interfaces that are specific to CSS style-sheets are implemented.</li>
	 * <li>CSS2: The CSS2Properties interface is implemented.</li>
	 * <li>Events: The basic event-handling interfaces are implemented.</li>
	 * <li>UIEvents: The interfaces for user-interface events are implemented.</li>
	 * <li>MouseEvents: The interfaces for mouse events are implemented.</li>
	 * <li>HTMLEvents: The interfaces for HTML events are implemented.</li>
	 * <li>MutationEvents: The interfaces for document mutation events are implemented.</li>
	 * <li>Range: The interfaces for manipulating ranges of a document are implemented.</li>
	 * <li>Traversal: The interfaces for advanced document traversal are implemented.</li>
	 * <li>Views: The interfaces for document views are implemented.</li>
	 * </ul>
	 * @param version The version number of the feature to test, or the empty string to 
	 * test for support of any version of the feature. In the Level 2 DOM specification, 
	 * supported version numbers are 1.0 and 2.0.
	 * @since 1.0
	 * @see JsDOMImplementation#hasFeature(String, String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Boolean isSupported(Object feature, Object version) {
		return call(isSupported, new Vars<Object>().add(feature).add(version));
	}
	/**
	 * <p>Normalizes all {@link JsText} node descendants of this node by deleting 
	 * empty {@link JsText} nodes and merging adjacent {@link JsText} nodes.</p>
	 * <p>This method traverses all descendants of this node and normalizes the document 
	 * by removing any empty {@link JsText} nodes and merging all adjacent {@link JsText} 
	 * nodes into a single node. This can simplify the tree structure after node 
	 * insertions or deletions.</p>
	 * @since 1.0
	 * @see JsText
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void normalize() {
		call(normalize);
	}
	/**
	 * <p>Removes mouse capture from the object in the current document.</p>
	 * <p>This method is IE-specific.</p>
	 * @see #setCapture()
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void releaseCapture() {
		call(releaseCapture);
	}
	/**
	 * <p>Removes and returns the specified child node from the document tree.</p>
	 * <p>This method removes the specified child from the {@link #childNodes} array of 
	 * this node. It is an error to call this method with a node that is not a child. 
	 * This method returns the <tt>oldChild</tt> node after removing it. <tt>oldChild</tt> 
	 * continues to be a valid node and may be reinserted into the document later.</p>
	 * @param oldChild The child node to remove. 
	 * @return The node that was removed.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if the node is read-only and does not allow children to be removed, or the value 
	 * {@link JsDOMException#NOT_FOUND_ERR} if <tt>oldChild</tt> is not a child of this 
	 * node. See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public JsNode removeChild(JsNode oldChild) {
		return new JsNode(call(removeChild, oldChild));
	}
	/**
	 * <p>Removes and returns the specified child node from the document tree, replacing 
	 * it with another node.</p>
	 * <p>This method replaces one node of the document tree with another. <tt>oldChild</tt> 
	 * is the node to be replaced and must be a child of this node. <tt>newChild</tt> is 
	 * the node that takes its place in the {@link #childNodes} array of this node.</p>
	 * <p>If <tt>newChild</tt> is already part of the document, it is first removed from 
	 * the document before being reinserted at its new position.</p>
	 * <p>If <tt>newChild</tt> is a {@link JsDocumentFragment} node, it is not inserted 
	 * itself; instead, each of its children is inserted, in order, at the position 
	 * formerly occupied by <tt>oldChild</tt>.</p>
	 * @param newChild The replacement node. 
	 * @param oldChild The node to be replaced. 
	 * @return The node that was removed from the document and replaced.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#HIERARCHY_REQUEST_ERR} 
	 * if the node does not allow children, it does not allow children of the specified 
	 * type, or <tt>newChild</tt> is an ancestor of this node (or is this node itself), 
	 * the value {@link JsDOMException#WRONG_DOCUMENT_ERR} if <tt>newChild</tt> and this 
	 * node have different values for {@link #ownerDocument} property, the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if the node is read-only and does not allow replacement, or <tt>newChild</tt> is 
	 * the child of a node that does not allow removals, or the value {@link JsDOMException#NOT_FOUND_ERR} 
	 * if <tt>oldChild</tt> is not a child of this node. See {@link Js#err(Object)} for JS 
	 * Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public JsNode replaceChild(JsNode newChild, JsNode oldChild) {
		return new JsNode(call(replaceChild, new Vars<Object>().add(newChild).add(oldChild)));
	}
	/**
	 * <p>Performs an XPath query using this node as the root and returns the result as a {@link JsNodeList}.</p>
	 * @param query A string value of XPath query.
	 * @return The query result as a {@link JsNodeList}.
	 * @see #selectNodes(StringLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsNodeList<?> selectNodes(String query) {
		return new JsNodeList<JsNode>(call(selectNodes, query));
	}
	/**
	 * <p>Performs an XPath query using this node as the root and returns the result as a {@link JsNodeList}.</p>
	 * @param query A string value of XPath query.
	 * @return The query result as a {@link JsNodeList}.
	 * @see #selectNodes(String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsNodeList<?> selectNodes(StringLike query) {
		return selectNodes(Js.valueOf(query));
	}
	/**
	 * <p>Performs an XPath query using this node as the root and returns the result as a single node.</p>
	 * @return The query result as a {@link JsNodeList}.
	 * @see #selectSingleNode(StringLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsNode selectSingleNode(String query) {
		return call(selectSingleNode, query);
	}
	/**
	 * <p>Performs an XPath query using this node as the root and returns the result as a single node.</p>
	 * @return The query result as a {@link JsNodeList}.
	 * @see #selectSingleNode(String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsNode selectSingleNode(StringLike query) {
		return call(selectSingleNode, query);
	}
	/**
	 * <p>Sets the mouse capture to the object belonging to the current document.</p>
	 * <p>This method is IE-specific.</p>
	 * @see #releaseCapture()
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void setCapture() {
		call(setCapture);
	}
	/**
	 * <p>Applies an XSLT stylesheet to this node and returns the results as a string.</p>
	 * <p>This IE-specific method transforms a node and its descendants according to the 
	 * rules specified in an XSLT stylesheet and returns the result as an unparsed 
	 * string. The method exists only on the nodes of XML documents, not HTML documents. 
	 * Note that since {@link JsDocument} objects are themselves nodes, this method can 
	 * be applied to entire XML documents.</p>
	 * <p>See {@link JsXSLTProcessor} for a cross-platform alternative.</p>
	 * @param xslt An XSLT stylesheet, parsed to a {@link JsDocument} object. 
	 * @return The text produced by applying the specified stylesheet to this node and 
	 * its descendants.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String transformNode(JsDocument xslt) {
		return call(transformNode, xslt);
	}
	/**
	 * <p>applies an XSLT stylesheet to this node and returns the results as a new 
	 * {@link JsDocument} object.</p>
	 * <p>This IE-specific method transforms a node and its descendants according to the 
	 * rules specified in an XSLT stylesheet and returns the result as a {@link JsDocument} 
	 * object. The method exists only on the nodes of XML documents, not HTML documents. 
	 * Note that since {@link JsDocument} objects are themselves nodes, this method can 
	 * be applied to entire XML documents.</p>
	 * <p>See {@link JsXSLTProcessor} for a cross-platform alternative.</p>
	 * @param xslt An XSLT stylesheet, parsed to a {@link JsDocument} object. 
	 * @return The current object itself.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsDocument transformNodeToObject(JsDocument xslt) {
		return new JsDocument(call(transformNodeToObject, xslt));
	}
	/**
	 * <p>Checks whether the given element is contained within the object.</p>
	 * <p>This method is IE specific.</p>
	 * @return <tt>true</tt> if the element is contained within the object; <tt>false</tt>, otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Boolean contains(JsNode childNode) {
		return call(contains, childNode);
	}
	/**
	 * <p>Compares document positions.</p>
	 * <p>This method is specific.</p>
	 * @param node A node to compare with the current one.
	 * @return The number of the result of comparison.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number compareDocumentPosition(JsNode node) {
		return call(compareDocumentPosition, node);
	}
}
