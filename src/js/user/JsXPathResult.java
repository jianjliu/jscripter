
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
 * {@link JsClient#XPathResult} class.</p>
 * <p>A {@link JsXPathResult} object represents the value of an XPath expression. Objects 
 * of this type are returned by {@link JsDocument#evaluate(String, JsNode, JsFunction, Number, JsXPathResult)} 
 * and {@link JsXPathExpression#evaluate(JsNode, Number, JsXPathResult)}. XPath queries 
 * can evaluate to strings, numbers, booleans, nodes, and lists of nodes. XPath implementations 
 * can return lists of nodes in several different ways, so this class defines a slightly 
 * complex API for obtaining the actual result of an XPath query.</p>
 * <p>To use a {@link JsXPathResult} object, first check the {@link JsXPathResult#resultType} 
 * property. It will hold one of the {@link js.dom.DOM.XPathResult} constants. The value 
 * of this property tells you which property or method you need to use to determine the 
 * result value. Calling methods or reading properties that are not defined for the 
 * current {@link JsXPathResult#resultType} causes an error.</p>
 * <p>IE does not support the API of this class. To perform XPath queries in IE, see 
 * {@link JsNode#selectNodes(String)} and {@link JsNode#selectSingleNode(String)}.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see JsNode#selectNodes(String)
 * @see JsNode#selectSingleNode(String)
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsXPathResult extends JsClient.XPathResult.Prototype
{
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
	protected static abstract class Members extends JsClient.XPathResult.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsXPathResult#booleanValue
		 * @see JsXPathResult.Member#booleanValue
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid booleanValue         = id("booleanValue"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsXPathResult#invalidIteratorState
		 * @see JsXPathResult.Member#invalidIteratorState
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid invalidIteratorState = id("invalidIteratorState");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsXPathResult#numberValue
		 * @see JsXPathResult.Member#numberValue
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid numberValue          = id("numberValue"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsXPathResult#resultType
		 * @see JsXPathResult.Member#resultType
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid resultType           = id("resultType"          );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsXPathResult#singleNodeValue
		 * @see JsXPathResult.Member#singleNodeValue
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid singleNodeValue      = id("singleNodeValue"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsXPathResult#snapshotLength
		 * @see JsXPathResult.Member#snapshotLength
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid snapshotLength       = id("snapshotLength"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsXPathResult#stringValue
		 * @see JsXPathResult.Member#stringValue
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid stringValue          = id("stringValue"         );
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
	public static class Member extends JsClient.XPathResult.Prototype.Member
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
		public JsXPathResult with(ObjectLike o) {
			return new JsXPathResult(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsXPathResult} object 
		 * refers to a read-only boolean value holding the result value when {@link #resultType} 
		 * is {@link js.dom.DOM.XPathResult#BOOLEAN_TYPE}.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member booleanValue         = new Value.Boolean.Member(this, Members.booleanValue        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsXPathResult} object 
		 * refers to a read-only boolean value which is <tt>true</tt> if {@link #resultType} 
		 * is {@link js.dom.DOM.XPathResult#UNORDERED_NODE_ITERATOR_TYPE} or {@link js.dom.DOM.XPathResult#ORDERED_NODE_ITERATOR_TYPE}, 
		 * and the document has been modified, making the iterator invalid, because the 
		 * result was returned.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member invalidIteratorState = new Value.Boolean.Member(this, Members.invalidIteratorState);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsXPathResult} object 
		 * is a read-only reference to the result {@link JsNode} object when {@link #resultType} 
		 * is {@link js.dom.DOM.XPathResult#ANY_UNORDERED_NODE_TYPE} or {@link js.dom.DOM.XPathResult#FIRST_ORDERED_NODE_TYPE}.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsNode.Member singleNodeValue = new JsNode.Member(this, Members.singleNodeValue);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsXPathResult} object 
		 * refers to a read-only number value holding the result value when {@link #resultType} 
		 * is {@link js.dom.DOM.XPathResult#NUMBER_TYPE}.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member numberValue    = new Value.Number.Member(this, Members.numberValue   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsXPathResult} object 
		 * refers to a read-only number specifying what kind of result the XPath query 
		 * returned and telling you which other properties or methods you can use. The 
		 * value is one of the constants defined by {@link JsClient#XPathResult}.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member resultType     = new Value.Number.Member(this, Members.resultType    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsXPathResult} object 
		 * refers to a read-only number specifying the number of nodes returned when 
		 * {@link #resultType} is {@link js.dom.DOM.XPathResult#UNORDERED_NODE_SNAPSHOT_TYPE} or 
		 * {@link js.dom.DOM.XPathResult#ORDERED_NODE_SNAPSHOT_TYPE}. The property is 
		 * used in conjunction with {@link JsXPathResult#snapshotItem(Number)}.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member snapshotLength = new Value.Number.Member(this, Members.snapshotLength);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsXPathResult} object 
		 * refers to a read-only string value holding the result value when {@link #resultType} 
		 * is {@link js.dom.DOM.XPathResult#STRING_TYPE}.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member stringValue    = new Value.String.Member(this, Members.stringValue   );
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsXPathResult(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsXPathResult} object 
	 * refers to a read-only boolean value holding the result value when {@link #resultType} 
	 * is {@link js.dom.DOM.XPathResult#BOOLEAN_TYPE}.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member booleanValue         = new Value.Boolean.Member(Members.booleanValue        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsXPathResult} object 
	 * refers to a read-only boolean value which is <tt>true</tt> if {@link #resultType} 
	 * is {@link js.dom.DOM.XPathResult#UNORDERED_NODE_ITERATOR_TYPE} or {@link js.dom.DOM.XPathResult#ORDERED_NODE_ITERATOR_TYPE}, 
	 * and the document has been modified, making the iterator invalid, because the 
	 * result was returned.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member invalidIteratorState = new Value.Boolean.Member(Members.invalidIteratorState);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsXPathResult} object 
	 * is a read-only reference to the result {@link JsNode} object when {@link #resultType} 
	 * is {@link js.dom.DOM.XPathResult#ANY_UNORDERED_NODE_TYPE} or {@link js.dom.DOM.XPathResult#FIRST_ORDERED_NODE_TYPE}.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsNode.Member singleNodeValue = new JsNode.Member(Members.singleNodeValue);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsXPathResult} object 
	 * refers to a read-only number value holding the result value when {@link #resultType} 
	 * is {@link js.dom.DOM.XPathResult#NUMBER_TYPE}.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member numberValue    = new Value.Number.Member(Members.numberValue   );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsXPathResult} object 
	 * refers to a read-only number specifying what kind of result the XPath query 
	 * returned and telling you which other properties or methods you can use. The 
	 * value is one of the constants defined by {@link JsClient#XPathResult}.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member resultType     = new Value.Number.Member(Members.resultType    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsXPathResult} object 
	 * refers to a read-only number specifying the number of nodes returned when 
	 * {@link #resultType} is {@link js.dom.DOM.XPathResult#UNORDERED_NODE_SNAPSHOT_TYPE} or 
	 * {@link js.dom.DOM.XPathResult#ORDERED_NODE_SNAPSHOT_TYPE}. The property is 
	 * used in conjunction with {@link #snapshotItem(Number)}.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member snapshotLength = new Value.Number.Member(Members.snapshotLength);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsXPathResult} object 
	 * refers to a read-only string value holding the result value when {@link #resultType} 
	 * is {@link js.dom.DOM.XPathResult#STRING_TYPE}.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member stringValue    = new Value.String.Member(Members.stringValue   );

	@Override
	/**
	 * <p>Returns the primitive value associated with the current instance, if there is one.
	 * This invocation simply returns the instance itself for the current instance is an 
	 * object and there is no primitive value for it.</p>
	 * @return The current object itself.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public JsXPathResult valueOf() {
		return new JsXPathResult((JsObject)var().valueOf());
	}
	public final JsNode var(JsNode.Member r) {
		return r.with(this);
	}

	/**
	 * <p>Returns the next node in the node set.</p>
	 * <p>This method may be only if the {@link #resultType} is {@link js.dom.DOM.XPathResult#UNORDERED_NODE_ITERATOR_TYPE} 
	 * or {@link js.dom.DOM.XPathResult#ORDERED_NODE_ITERATOR_TYPE}.</p>
	 * @return The next node in the list of matching nodes, or <tt>null</tt> if there 
	 * are no more.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsNode iterateNext() {
		return new JsNode(call(iterateNext));
	}
	/**
	 * <p>Returns the node at the specified index in the list of result nodes.</p>
	 * <p>This method may be used only if the {@link #resultType} is {@link js.dom.DOM.XPathResult#UNORDERED_NODE_SNAPSHOT_TYPE} 
	 * or {@link js.dom.DOM.XPathResult#ORDERED_NODE_ITERATOR_TYPE}. Use this method in 
	 * conjunction with the {@link #snapshotLength} property.</p>
	 * @param index The index of the node to be returned.
	 * @return The node at the specified index, or <tt>null</tt> if the <tt>index</tt> 
	 * is less than zero or greater than or equal to {@link #snapshotLength}.
	 * @since 1.0
	 * @see #snapshotItem(NumberLike)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsNode snapshotItem(Number index) {
		return new JsNode(call(snapshotItem, index));
	}
	/**
	 * <p>Returns the node at the specified index in the list of result nodes.</p>
	 * <p>This method may be used only if the {@link #resultType} is {@link js.dom.DOM.XPathResult#UNORDERED_NODE_SNAPSHOT_TYPE} 
	 * or {@link js.dom.DOM.XPathResult#ORDERED_NODE_ITERATOR_TYPE}. Use this method in 
	 * conjunction with the {@link #snapshotLength} property.</p>
	 * @param index The index of the node to be returned.
	 * @return The node at the specified index, or <tt>null</tt> if the <tt>index</tt> 
	 * is less than zero or greater than or equal to {@link #snapshotLength}.
	 * @since 1.0
	 * @see #snapshotItem(Number)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsNode snapshotItem(NumberLike<?> index) {
		return new JsNode(call(snapshotItem, index));
	}
}
