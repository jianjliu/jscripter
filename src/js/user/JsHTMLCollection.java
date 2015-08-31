
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
 * {@link JsClient#HTMLCollection} class.</p>
 * <p>An object of this class is a collection of HTML elements with methods that allow 
 * you to retrieve an element by its position in the collection or by its {@link JsHTMLElement#id} 
 * or <tt>name</tt> attribute. In JavaScript, a {@link JsHTMLCollection} object behaves 
 * like a read-only array, and you can use JavaScript square-bracket notation to index 
 * the array by number or by <tt>name</tt> instead of calling the {@link JsHTMLCollection#item(Number)} 
 * and {@link JsHTMLCollection#namedItem(String)} methods.</p>
 * <p>A number of the properties of the {@link JsHTMLDocument} object are {@link JsHTMLCollection} 
 * objects and provide convenient access to document elements such as forms, images, and 
 * links. The {@link JsHTMLFormElement#elements} and {@link JsHTMLSelectElement#options} 
 * are also objects of this class. This class provides a convenient way to traverse the 
 * rows of a {@link JsHTMLTableElement} and the cells of a {@link JsHTMLTableRowElement}.</p>
 * <p>Objects of this class are read-only. You cannot assign new elements to them, even 
 * when using JavaScript array notation. They are live, meaning that if the underlying 
 * document changes, those changes are immediately visible through all {@link JsHTMLCollection} 
 * objects.</p>
 * <p>This class is similar to {@link JsNodeList} but its objects may be indexed by name 
 * as well as by number.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see JsHTMLDocument
 * @see JsHTMLFormElement
 * @see JsHTMLSelectElement
 * @see JsHTMLTableElement
 * @see JsHTMLTableRowElement
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsHTMLCollection<T extends JsHTMLElement> extends JsClient.HTMLCollection.Prototype<T> implements ArrayObject<T>
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
	protected static abstract class Members extends JsClient.HTMLCollection.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLCollection#length
		 * @see JsHTMLCollection.Member#length
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
	public final static class Member<T extends JsHTMLElement> extends JsClient.HTMLCollection.Prototype.Member<T>
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
		public JsHTMLCollection<T> with(ObjectLike o) {
			return new JsHTMLCollection<T>(super.with(o), getElementWrapper());
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsHTMLCollection#length()
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member length = new Value.Number.Member(this, Members.length);
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsHTMLCollection(JsObject var, Generic<?> eWrapper) {
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
	public JsHTMLCollection(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
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
	public JsHTMLCollection<T> valueOf() {
		return new JsHTMLCollection<T>((JsObject)var().valueOf());
	}

	/**
	 * <p>Gets the size of the current array instance.</p>
	 * @return size of the array
	 * @see jsx.core.ArrayLikes#length(ArrayObject)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>a.length</pre>
	 * where <tt>a</tt> is the current array instance of the invocation.
	 */
	public final int length() {
		return length.with(this).intValue();
	}

	/**
	 * <p>Reads an element of the current array instance.</p>
	 * @param i Array index of the element
	 * @return value of the element
	 * @since 1.0
	 * @see #item(Number)
	 * @see #item(NumberLike)
	 * @see #namedItem(String)
	 * @see #namedItem(StringLike)
	 * @javascript Re-compilers must convert the instance invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>a[i]</pre>
	 * where <tt>a</tt> is the current array instance of the invocation.
	 */
	public final T get(int i) {
		return item(i);
	}

	@SuppressWarnings("unchecked")
	/**
	 * <p>Returns the element at the specified position in the collection.</p>
	 * @param i The position of the element to be returned. Elements appear in a {@link JsHTMLCollection} 
	 * object in the same order in which they appear in the document source.
	 * @return The element at the specified index <tt>i</tt>, or <tt>null</tt> if the 
	 * index is less than zero or greater than or equal to the {@link #length} 
	 * property.
	 * @since 1.0
	 * @see #get(int)
	 * @see #item(NumberLike)
	 * @see #namedItem(String)
	 * @see #namedItem(StringLike)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final T item(Number i) {
		return (T)getElementWrapper().wrap(call(item, i));
	}
	/**
	 * <p>Returns the element at the specified position in the collection.</p>
	 * @param i The position of the element to be returned. Elements appear in a {@link JsHTMLCollection} 
	 * object in the same order in which they appear in the document source.
	 * @return The element at the specified index <tt>i</tt>, or <tt>null</tt> if the 
	 * index is less than zero or greater than or equal to the {@link #length} 
	 * property.
	 * @since 1.0
	 * @see #get(int)
	 * @see #item(Number)
	 * @see #namedItem(String)
	 * @see #namedItem(StringLike)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final T item(NumberLike<?> i) {
		return item(Js.valueOf(i));
	}
	@SuppressWarnings("unchecked")
	/**
	 * <p>Returns the element from the collection that has the specified value for its 
	 * {@link JsHTMLElement#id} or <tt>name</tt> attribute, or <tt>null</tt> if there is no such element.</p>
	 * @param name The name of the element to be returned.
	 * @return The element in the collection that has the specified value for its {@link JsHTMLElement#id} 
	 * or <tt>name</tt> attribute, or <tt>null</tt> if no elements in the collection 
	 * have that name.
	 * @since 1.0
	 * @see #namedItem(StringLike)
	 * @see #get(int)
	 * @see #item(Number)
	 * @see #item(NumberLike)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final T namedItem(String name) {
		return (T)getElementWrapper().wrap(call(namedItem, name));
	}
	/**
	 * <p>Returns the element from the collection that has the specified value for its 
	 * {@link JsHTMLElement#id} or <tt>name</tt> attribute, or <tt>null</tt> if there is no such element.</p>
	 * @param name The name of the element to be returned.
	 * @return The element in the collection that has the specified value for its {@link JsHTMLElement#id} 
	 * or <tt>name</tt> attribute, or <tt>null</tt> if no elements in the collection 
	 * have that name.
	 * @since 1.0
	 * @see #namedItem(String)
	 * @see #get(int)
	 * @see #item(Number)
	 * @see #item(NumberLike)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final T namedItem(StringLike name) {
		return namedItem(Js.valueOf(name));
	}
}
