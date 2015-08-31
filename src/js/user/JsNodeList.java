
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
 * {@link JsClient#NodeList} class.</p>
 * <p>The <b>opaque</b> class defines a read-only, ordered list or an array of {@link JsNode} 
 * objects. The {@link JsNodeList#length} property specifies how many nodes are in the 
 * list, and the {@link #item(Number)} method allows you to obtain the node at a specified 
 * position in the list. The elements of the list are always valid {@link JsNode} objects and 
 * they never contain <tt>null</tt> elements.</p>
 * <p>Objects of {@link JsNodeList} behave like JavaScript arrays, and you can query an 
 * element from the list using square-bracket array notation in JavaScript, or using {@link #get(int)} 
 * method in JS applications, instead of calling the {@link #item(Number)} method. 
 * However, you cannot assign new nodes to the array (even if using square brackets in JavaScript).</p>
 * <p>Note that objects of {@link JsNodeList} are live, that is, they are not static 
 * snapshots but immediately reflect changes to the document tree.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public final class JsNodeList<T extends JsNode> extends JsClient.NodeList.Prototype<T> implements ArrayObject<JsNode>
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
	protected static abstract class Members extends JsClient.NodeList.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNodeList#length
		 * @see JsNodeList.Member#length
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		protected static final Mid length = id("length");
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
	public final static class Member<T extends JsNode> extends JsClient.NodeList.Prototype.Member<T>
	{
		/**
		 * <p>Internally constructs a member based on a qualifying member with a generic 
		 * wrapper.</p>
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
		 * @param rWrapper The generic wrapper
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
		 */
		public Member(JsObject.Member q, Mid mid, Generic<?> rWrapper) {
			super(q, mid, rWrapper);
		}
		/**
		 * <p>Internally constructs a member without a qualifying member but a generic 
		 * wrapper.</p>
		 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b> 
		 * or <b>internal</b> classes or class members.</p>
		 * <p>Note that, this constructor is <b>internal</b> but its declaring class is 
		 * <b>opaque</b>. This constructor is used to define <b>opaque</b> static fields, 
		 * declared in <b>opaque</b> types other than the declaring class of this constructor 
		 * itself and its subclasses. Under this circumstance, the field names must be 
		 * exactly same as the member names, as the <b>opaque</b> static fields of <b>opaque</b> 
		 * types are generally resolved by re-compilers directly to identifiers of their names.</p>
		 * @param mid The ID of the member to construct
		 * @param rWrapper The generic wrapper
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
		 */
		public Member(Mid mid, Generic<?> rWrapper) {
			super(mid, rWrapper);
		}
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
		public JsNodeList<T> with(ObjectLike o) {
			return new JsNodeList<T>(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsNodeList} object 
		 * refers to the length of the array specifying the number of nodes in it.</p>
		 * @since 1.0
		 * @see JsNodeList#length()
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member length = new Value.Number.Member(this, Members.length);
	}

	public JsNodeList(JsObject var, Generic<?> eWrapper) {
		super(var, eWrapper);
	}
	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsNodeList(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsNodeList} object 
	 * refers to the length of the array specifying the number of nodes in it.</p>
	 * @since 1.0
	 * @see #length()
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member length = new Value.Number.Member(Members.length);

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
	public JsNodeList<T> valueOf() {
		return new JsNodeList<T>((JsObject)var().valueOf());
	}

	/**
	 * <p>Reads an element of the current array instance.</p>
	 * @param i Array index of the element
	 * @return value of the element
	 * @since 1.0
	 * @see #item(Number)
	 * @see #item(NumberLike)
	 * @see #length()
	 * @see #length
	 * @javascript Re-compilers must convert the instance invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>a[i]</pre>
	 * where <tt>a</tt> is the current array instance of the invocation.
	 */
	public final T get(int i) {
		return item(i);
	}

	/**
	 * <p>Gets the size of the current array instance.</p>
	 * @return size of the array
	 * @see jsx.core.ArrayLikes#length(ArrayObject)
	 * @since 1.0
	 * @see #length
	 * @javascript Re-compilers must convert the instance invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>a.length</pre>
	 * where <tt>a</tt> is the current array instance of the invocation.
	 */
	public final int length() {
		return length.with(this).intValue();
	}

	/**
	 * <p>Returns the specified element of the array object.</p>
	 * <p>This method is equivalent to {@link #get(int)}. In JavaScript, you can use the 
	 * square-bracket array notation instead of calling this method.</p>
	 * @param index The position (or index) of the desired node in the array object. The 
	 * index of the first node in the array is 0, and the index of the last node is 
	 * {@link #length} minus 1.
	 * @return The node at the specified position in the {@link JsNodeList} array 
	 * object, or <tt>null</tt> if <tt>index</tt> is less than zero or greater than or 
	 * equal to the {@link #length} of the {@link JsNodeList} array object.
	 * @since 1.0
	 * @see #item(NumberLike)
	 * @see #get(int)
	 * @see #length()
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	@SuppressWarnings("unchecked")
	public final T item(Number index) {
		return (T)getElementWrapper().wrap(call(item, index));
	}
	/**
	 * <p>Returns the specified element of the array object.</p>
	 * <p>This method is equivalent to {@link #get(int)}. In JavaScript, you can use the 
	 * square-bracket array notation instead of calling this method.</p>
	 * @param index The position (or index) of the desired node in the array object. The 
	 * index of the first node in the array is 0, and the index of the last node is 
	 * {@link #length} minus 1.
	 * @return The node at the specified position in the {@link JsNodeList} array 
	 * object, or <tt>null</tt> if <tt>index</tt> is less than zero or greater than or 
	 * equal to the {@link #length} of the {@link JsNodeList} array object.
	 * @since 1.0
	 * @see #item(Number)
	 * @see #get(int)
	 * @see #length()
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final T item(NumberLike<?> index) {
		return item(Js.valueOf(index));
	}
}
