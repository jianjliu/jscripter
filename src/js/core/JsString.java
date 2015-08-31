
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

package js.core;

import js.*;

/**
 * <p>An <b>opaque</b> class representing JavaScript string objects.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see js.core.JsGlobal.String#create()
 * @see js.core.JsGlobal.String#create(Object)
 * @see js.core.JsGlobal.String#create(Vars)
 * @see jsx.core.StringLikes
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsString extends JsGlobal.String.Prototype implements StringLike
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
	protected static abstract class Members extends JsGlobal.String.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsString#length
		 * @see Member#length
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid length = id("length");
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
	public static class Member extends JsGlobal.String.Prototype.Member
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
		@Override
		public JsString with(ObjectLike o) {
			return new JsString((JsObject)var(o).var(mid()));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The <tt>constructor</tt> property of an object is a reference to the function 
		 * that was the constructor for that object.</p>
		 * <p>A common use of the <tt>constructor</tt> property is to determine the type of unknown 
		 * objects. Given an unknown value, you can use the {@link js.Js#typeof(Object)} operation 
		 * to determine whether it is a primitive value or an object. If it is an object, you can 
		 * use the <tt>constructor</tt> property to determine what type of object it is.</p>
		 * <p>Note, however, that while this technique works for the objects built into core 
		 * JavaScript, it is not guaranteed to work with host objects such as the <tt>window</tt> 
		 * object of client-side JavaScript. The default implementation of the <tt>toString()</tt> 
		 * method provides another way to determine the type of an unknown object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<JsString> constructor = new JsFunction.Member<JsString>(this, Members.constructor, Generic.get(JsString.class));
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsString#length()
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Integer.Member length = new Value.Integer.Member(this, Members.length);
	}

	/**
	 * <p>Internally constructs a string object.</p>
	 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
	 */
	protected JsString(Object var) {
		super((JsObject)var);
	}
	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it 
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor, 
	 * that is, replacing it with its only argument.
	 */
	public JsString(JsObject var) {
		super(var(var, (JsString)null));
	}
	/**
	 * <p>Casts a string value to the current <b>opaque</b> type by wrapping it with the 
	 * wrapping constructor.</p>
	 * @param var The argument of a string.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor, 
	 * that is, replacing it with its only argument.
	 */
	public JsString(String var) {
		super(JsGlobal.String.with().create(var));
	}
	/**
	 * <p>Casts a string value to the current <b>opaque</b> type by wrapping it with the 
	 * wrapping constructor.</p>
	 * @param var The argument of a string.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor, 
	 * that is, replacing it with its only argument.
	 */
	public JsString(Var<String> var) {
		super(JsGlobal.String.with().create(var));
	}

	/**
	 * <p>Simply returns the current string instance.</p>
	 * <p>This method is useful for JS Simulation to implement opaque types.</p>
	 * @return The current string instance.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the instance invocation of this method, that is, 
	 * replacing it with its current instance.
	 */
	@Override
	public JsString var() {
		return (JsString)super.var();
	}
	/**
	 * <p>Assigns the value of another string instance to the string number object.</p>
	 * @param var The argument string instance.
	 * @return The new instance.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into 
	 * the JavaScript expression: 
	 * <pre>o = var</pre>
	 * where <tt>o</tt> is the current instance of the invocation of this method.
	 */
	@Override
	public final <S extends JsObject> S var(S var) {
		var(var, (JsString)null);
		return var;
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The <tt>constructor</tt> property of an object is a reference to the function 
	 * that was the constructor for that object.</p>
	 * <p>A common use of the <tt>constructor</tt> property is to determine the type of unknown 
	 * objects. Given an unknown value, you can use the {@link js.Js#typeof(Object)} operation 
	 * to determine whether it is a primitive value or an object. If it is an object, you can 
	 * use the <tt>constructor</tt> property to determine what type of object it is.</p>
	 * <p>Note, however, that while this technique works for the objects built into core 
	 * JavaScript, it is not guaranteed to work with host objects such as the <tt>window</tt> 
	 * object of client-side JavaScript. The default implementation of the <tt>toString()</tt> 
	 * method provides another way to determine the type of an unknown object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<JsString> constructor = new JsFunction.Member<JsString>(Members.constructor, Generic.get(JsString.class));
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsString#length()
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final Value.Integer.Member length = new Value.Integer.Member(Members.length);

	/**
	 * <p>Gets the length of the current string, an integer that indicates the number of 
	 * characters in the current string. For any string <tt>s</tt>, the index of the 
	 * last character is <tt>s.length() - 1</tt>. The length property of a string may 
	 * not be deleted.</p>
	 * @return The length of the current string.
	 * @see jsx.core.StringLikes#length(StringLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>s.length</pre>
	 * where <tt>s</tt> is the current string instance of the invocation.
	 */
	public final int length() {
		return length.with(this).intValue();
	}

	/**
	 * <p>Returns the character string of length 1 at the specified <tt>index</tt> within 
	 * the current string. An index ranges from 0 to <tt>length() - 1</tt>. The first 
	 * character of the sequence is at index 0, the next at index 1, and so on, as for 
	 * array indexing. If <tt>index</tt> is not between 0 and <tt>length() - 1</tt>, 
	 * this invocation returns an empty string.</p>
	 * @param index The index of the character
	 * @return The character string of length 1 at the specified index of the current string
	 * @see #charCodeAt(Object)
	 * @see #indexOf(Object)
	 * @see #indexOf(Object, Object)
	 * @see #lastIndexOf(Object)
	 * @see #lastIndexOf(Object, Object)
	 * @see jsx.core.StringLikes#charAt(StringLike, Object)
	 * @see jsx.core.StringLikes#charAt(String, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String charAt(Object index) {
		return call(charAt, index);
	}

	/**
	 * <p>Returns the character encoding at a specific <tt>index</tt> within the current 
	 * string. An index ranges from 0 to <tt>length() - 1</tt>. The first 
	 * character of the sequence is at index 0, the next at index 1, and so on, as for 
	 * array indexing. If <tt>index</tt> is not between 0 and <tt>length() - 1</tt>, 
	 * this invocation returns <tt>NaN</tt>.</p>
	 * @param index The index of the character
	 * @return The Unicode encoding of the character within the current string. The return 
	 * value is a 16-bit integer between 0 and 65535.
	 * @see #charAt(Object)
	 * @see #indexOf(Object)
	 * @see #indexOf(Object, Object)
	 * @see #lastIndexOf(Object)
	 * @see #lastIndexOf(Object, Object)
	 * @see jsx.core.StringLikes#charCodeAt(StringLike, Object)
	 * @see jsx.core.StringLikes#charCodeAt(String, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Character charCodeAt(Object index) {
		return call(charCodeAt, index);
	}

	/**
	 * <p>Converts the argument to a string (if necessary) and appends them, in order, to 
	 * the end of the current string and returns the resulting concatenation.</p>
	 * <p>Note that the current string itself is not modified.</p>
	 * <p>This method is an analog to {@link ArrayLike#concat(Object)}. Note that it is 
	 * often easier to use {@link Js#add(Object, Object)} perform string concatenation.</p>
	 * @param other A value to be concatenated to the current string
	 * @return A new string that results from concatenating the argument to the current 
	 * string.
	 * @see #concat(Vars)
	 * @see ArrayLike#concat(Object)
	 * @see ArrayLike#concat(Vars)
	 * @see jsx.core.StringLikes#concat(StringLike, Object)
	 * @see jsx.core.StringLikes#concat(String, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String concat(Object other) {
		return call(concat, other);
	}

	/**
	 * <p>Converts each of the argument values to a string (if necessary) and appends them, 
	 * in order, to the end of the current string and returns the resulting concatenation.</p>
	 * <p>Note that the current string itself is not modified.</p>
	 * <p>This method is an analog to {@link ArrayLike#concat(Vars)}. Note that it is 
	 * often easier to use {@link Js#add(Object, Object)} perform string concatenation.</p>
	 * @param args A list of the values to be concatenated to the current string
	 * @return A new string that results from concatenating each of the argument values 
	 * to the current string.
	 * @see #concat(Object)
	 * @see ArrayLike#concat(Object)
	 * @see ArrayLike#concat(Vars)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String concat(Vars<?> args) {
		return call(concat, args);
	}

	/**
	 * <p>Searches the current string instance from beginning to end to see if it contains 
	 * an occurrence of the substring <tt>other</tt>. The search begins at the beginning 
	 * of the current string. If an occurrence of the substring is found, this invocation 
	 * returns the position of the first character of the first occurrence of the substring 
	 * within the current string. Character positions within string are numbered starting with 
	 * zero. If no occurrence of substring is found within the current string, this invocation 
	 * returns -1.</p>
	 * @param other The substring that is to be searched for within the current string
	 * @return The position of the first occurrence of <tt>other</tt> within string, if 
	 * any, or -1 if no such occurrence is found.
	 * @see #indexOf(Object, Object)
	 * @see #charAt(Object)
	 * @see #lastIndexOf(Object)
	 * @see #lastIndexOf(Object, Object)
	 * @see #substr(Object)
	 * @see #substr(Object, Object)
	 * @see #substring(Object)
	 * @see #substring(Object, Object)
	 * @see jsx.core.StringLikes#indexOf(StringLike, Object)
	 * @see jsx.core.StringLikes#indexOf(String, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Integer indexOf(Object other) {
		return call(indexOf, other);
	}

	/**
	 * <p>Searches the current string instance from beginning to end to see if it contains 
	 * an occurrence of the substring <tt>other</tt>. The search begins at position 
	 * <tt>pos</tt> within string, or at the beginning of string if <tt>pos</tt> is  
	 * undefined. If an occurrence of the substring is found, this invocation returns the 
	 * position of the first character of the first occurrence of the substring within 
	 * the current string. Character positions within string are numbered starting with 
	 * zero. If no occurrence of substring is found within the current string, this invocation 
	 * returns -1.</p>
	 * @param other The substring that is to be searched for within the current string
	 * @param pos An optional integer argument that specifies the position within the 
	 * current string at which the search is to start. Legal values are 0 (the position of 
	 * the first character in the string) to <tt>length() - 1</tt> (the position of 
	 * the last character in the string). If this argument is undefined, the search begins 
	 * at the first character of the string
	 * @return The position of the first occurrence of <tt>other</tt> within string that 
	 * appears after the <tt>pos</tt> position, if any, or -1 if no such occurrence 
	 * is found.
	 * @see #indexOf(Object)
	 * @see #charAt(Object)
	 * @see #lastIndexOf(Object)
	 * @see #lastIndexOf(Object, Object)
	 * @see #substr(Object)
	 * @see #substr(Object, Object)
	 * @see #substring(Object)
	 * @see #substring(Object, Object)
	 * @see jsx.core.StringLikes#indexOf(StringLike, Object, Object)
	 * @see jsx.core.StringLikes#indexOf(String, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Integer indexOf(Object other, Object pos) {
		return call(indexOf, new Vars<Object>().add(other).add(pos));
	}

	/**
	 * <p>Searches the current string instance from end to beginning to see if it contains 
	 * an occurrence of the substring <tt>other</tt>. The search begins at the end 
	 * of the current string. If an occurrence of the substring is found, this invocation 
	 * returns the position of the first character of that occurrence. If no occurrence of 
	 * substring is found within the current string, this invocation returns -1.</p>
	 * @param other The substring that is to be searched for within the current string
	 * @return The position of the last occurrence of <tt>other</tt> within string, if 
	 * any, or -1 if no such occurrence is found.
	 * @see #lastIndexOf(Object, Object)
	 * @see #charAt(Object)
	 * @see #indexOf(Object)
	 * @see #indexOf(Object, Object)
	 * @see #substr(Object)
	 * @see #substr(Object, Object)
	 * @see #substring(Object)
	 * @see #substring(Object, Object)
	 * @see jsx.core.StringLikes#lastIndexOf(StringLike, Object)
	 * @see jsx.core.StringLikes#lastIndexOf(String, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Integer lastIndexOf(Object other) {
		return call(lastIndexOf, other);
	}

	/**
	 * <p>Searches the current string instance from end to beginning to see if it contains 
	 * an occurrence of the substring <tt>other</tt>. The search begins at position 
	 * <tt>pos</tt> within string, or at the end of string if <tt>pos</tt> is  
	 * undefined. If an occurrence of the substring is found, this invocation returns the 
	 * position of the first character that occurrence. Since this method 
	 * searches from end to beginning of the string, the first occurrence found is the last 
	 * one in the string that occurs before the <tt>pos</tt> position. If no occurrence 
	 * of substring is found within the current string, this invocation returns -1.</p>
	 * @param other The substring that is to be searched for within the current string
	 * @param pos An optional integer argument that specifies the position within the 
	 * current string at which the search is to start. Legal values are 0 (the position of 
	 * the first character in the string) to <tt>length() - 1</tt> (the position of 
	 * the last character in the string). If this argument is undefined, the search begins 
	 * at the last character of the string
	 * @return The position of the last occurrence of <tt>other</tt> within string that 
	 * appears before the <tt>pos</tt> position, if any, or -1 if no such occurrence 
	 * is found.
	 * @see #lastIndexOf(Object)
	 * @see #charAt(Object)
	 * @see #indexOf(Object)
	 * @see #indexOf(Object, Object)
	 * @see #substr(Object)
	 * @see #substr(Object, Object)
	 * @see #substring(Object)
	 * @see #substring(Object, Object)
	 * @see jsx.core.StringLikes#lastIndexOf(StringLike, Object, Object)
	 * @see jsx.core.StringLikes#lastIndexOf(String, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Integer lastIndexOf(Object other, Object pos) {
		return call(lastIndexOf, new Vars<Object>().add(other).add(pos));
	}

	/**
	 * <p>Compares strings taking the collation order of the default locale into account.</p>
	 * <p>The ECMAScript standard does not specify how the locale-specific comparison is done; 
	 * it merely specifies that this function utilize the collation order provided by the 
	 * underlying operating system.</p>
	 * @param other A string to be compared, in a locale-sensitive fashion, with the current string
	 * @return An integer number that indicates the result of the comparison. If the current 
	 * string is "less than" the string <tt>other</tt>, this invocation returns a 
	 * number less than zero. If the current string is "greater than" <tt>other</tt>, 
	 * it returns a integer number greater than zero. And if the strings are identical or 
	 * indistinguishable according to the locale ordering conventions, the method returns 0.
	 * @see jsx.core.StringLikes#localeCompare(StringLike, Object)
	 * @see jsx.core.StringLikes#localeCompare(String, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Integer localeCompare(Object other) {
		return call(localeCompare, other);
	}

	/**
	 * <p>Searches the current string for one or more matches of <tt>regexp</tt>. 
	 * The behavior of this invocation depends significantly on whether <tt>regexp</tt> 
	 * has the "g" attribute or not .</p>
	 * <p>If <tt>regexp</tt> does not have the "g" attribute, this invocation searches 
	 * string for a single match. If no match is found, it returns <tt>null</tt>. 
	 * Otherwise, it returns an array containing information about the match that it found. 
	 * Element 0 of the array contains the matched text. The remaining elements contain 
	 * the text that matches any parenthesized subexpressions within the regular expression. 
	 * In addition to these normal array elements, the returned array also has two object 
	 * properties. The <tt>index</tt> property (see {@link ArrayLike#index()}) of the array  
	 * specifies the character position within string of the start of the matched text. Also, 
	 * the <tt>input</tt> property (see {@link ArrayLike#input()}) of the returned array 
	 * is a reference to string itself.</p>
	 * <p>If <tt>regexp</tt> has the "g" flag, this invocation does a global search, 
	 * searching string for all matching substrings. It returns <tt>null</tt> if no 
	 * match is found, and it returns an array if one or more matches are found. The 
	 * contents of this returned array are quite different for global matches, however. In 
	 * this case, the array elements contain each of the matched substrings within string. 
	 * The returned array does not have <tt>index</tt> (see {@link ArrayLike#index()}) 
	 * or <tt>input</tt> (see {@link ArrayLike#input()}) properties in this case. Note 
	 * that for global matches, this invocation does not provide information about 
	 * parenthesized subexpressions, nor does it specify where within string each match 
	 * occurred. If you need to obtain this information for a global search, you can use 
	 * {@link RegExpLike#exec(Object)}.</p>
	 * @param regexp A RegExp object that specifies the pattern to be matched
	 * @return An array containing the results of the match. The contents of the array 
	 * depend on whether regexp has the global "g" attribute set.
	 * @see #replace(RegExpLike, String)
	 * @see #replace(RegExpLike, StringLike)
	 * @see #replace(RegExpLike, JsFunction)
	 * @see #search(RegExpLike)
	 * @see ArrayLike#index()
	 * @see ArrayLike#input()
	 * @see Js#re(String)
	 * @see Js#re(String, String)
	 * @see RegExpLike#exec(Object)
	 * @see RegExpLike#test(Object)
	 * @see jsx.core.StringLikes#match(StringLike, RegExpLike)
	 * @see jsx.core.StringLikes#match(String, RegExpLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsArray match(RegExpLike regexp) {
		return new JsArray(call(match, regexp));
	}

	/**
	 * <p>Performs a search-and-replace operation on the current string.</p>
	 * <p>This invocation searches the current string for one or more substrings that 
	 * match <tt>regexp</tt> and replaces them with the replacement string 
	 * <tt>newSubStr</tt>.</p>
	 * <p>If <tt>regexp</tt> has the global "g" attribute specified, this invocation 
	 * replaces all matching substrings. Otherwise, it replaces only the first matching 
	 * substring.</p>
	 * <p>Note that the $ character has special meaning within the replacement string 
	 * <tt>newSubStr</tt>. As shown in the following, it indicates that a string 
	 * derived from the pattern match is used in the replacement.</p>
	 * <ul>
	 * <li>$1, $2, ..., $99 The text that matched the 1st through 99th parenthesized 
	 * subexpression within <tt>regexp</tt></li>
	 * <li>$& The substring that matched <tt>regexp</tt></li>
	 * <li>$' The text to the left of the matched substring</li>
	 * <li>$' The text to the right of the matched substring</li>
	 * <li>$$ A literal dollar sign</li>
	 * </ul>
	 * @param regexp The RegExp object that specifies the pattern to be replaced
	 * @param newSubStr A string that specifies the replacement text
	 * @return A new string, with the first match, or all matches, of <tt>regexp</tt> 
	 * replaced with the replacement.
	 * @see #replace(RegExpLike, StringLike)
	 * @see #replace(RegExpLike, JsFunction)
	 * @see #match(RegExpLike)
	 * @see #search(RegExpLike)
	 * @see Js#re(String)
	 * @see Js#re(String, String)
	 * @see RegExpLike#exec(Object)
	 * @see RegExpLike#test(Object)
	 * @see jsx.core.StringLikes#replace(StringLike, RegExpLike, String)
	 * @see jsx.core.StringLikes#replace(String, RegExpLike, String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String replace(RegExpLike regexp, String newSubStr) {
		return call(replace, new Vars<Object>().add(regexp).add(newSubStr));
	}

	/**
	 * <p>Performs a search-and-replace operation on the current string.</p>
	 * <p>This invocation searches the current string for one or more substrings that 
	 * match <tt>regexp</tt> and replaces them with the replacement string 
	 * <tt>newSubStr</tt>.</p>
	 * <p>If <tt>regexp</tt> has the global "g" attribute specified, this invocation 
	 * replaces all matching substrings. Otherwise, it replaces only the first matching 
	 * substring.</p>
	 * <p>Note that the $ character has special meaning within the replacement string 
	 * <tt>newSubStr</tt>. As shown in the following, it indicates that a string 
	 * derived from the pattern match is used in the replacement.</p>
	 * <ul>
	 * <li>$1, $2, ..., $99 The text that matched the 1st through 99th parenthesized 
	 * subexpression within <tt>regexp</tt></li>
	 * <li>$& The substring that matched <tt>regexp</tt></li>
	 * <li>$' The text to the left of the matched substring</li>
	 * <li>$' The text to the right of the matched substring</li>
	 * <li>$$ A literal dollar sign</li>
	 * </ul>
	 * @param regexp The RegExp object that specifies the pattern to be replaced
	 * @param newSubStr A string that specifies the replacement text
	 * @return A new string, with the first match, or all matches, of <tt>regexp</tt> 
	 * replaced with the replacement.
	 * @see #replace(RegExpLike, String)
	 * @see #replace(RegExpLike, JsFunction)
	 * @see #match(RegExpLike)
	 * @see #search(RegExpLike)
	 * @see Js#re(String)
	 * @see Js#re(String, String)
	 * @see RegExpLike#exec(Object)
	 * @see RegExpLike#test(Object)
	 * @see jsx.core.StringLikes#replace(StringLike, RegExpLike, StringLike)
	 * @see jsx.core.StringLikes#replace(String, RegExpLike, StringLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String replace(RegExpLike regexp, StringLike newSubStr) {
		return call(replace, new Vars<Object>().add(regexp).add(newSubStr));
	}

	/**
	 * <p>Performs a search-and-replace operation on the current string.</p>
	 * <p>This invocation searches the current string for one or more substrings that 
	 * match <tt>regexp</tt> and replaces them with the replacement string generated by 
	 * <tt>lambda</tt>.</p>
	 * <p>If <tt>regexp</tt> has the global "g" attribute specified, this invocation 
	 * replaces all matching substrings. Otherwise, it replaces only the first matching 
	 * substring.</p>
	 * @param regexp The RegExp object that specifies the pattern to be replaced
	 * @param lambda A function that is invoked to generate the replacement text
	 * @return A new string, with the first match, or all matches, of <tt>regexp</tt> 
	 * replaced with the replacement.
	 * @see #replace(RegExpLike, String)
	 * @see #replace(RegExpLike, StringLike)
	 * @see #match(RegExpLike)
	 * @see #search(RegExpLike)
	 * @see Js#re(String)
	 * @see Js#re(String, String)
	 * @see RegExpLike#exec(Object)
	 * @see RegExpLike#test(Object)
	 * @see jsx.core.StringLikes#replace(StringLike, RegExpLike, JsFunction)
	 * @see jsx.core.StringLikes#replace(String, RegExpLike, JsFunction)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String replace(RegExpLike regexp, JsFunction<String> lambda) {
		return call(replace, new Vars<Object>().add(regexp).add(lambda));
	}

	/**
	 * <p>Looks for a substring matching <tt>regexp</tt> within the current string 
	 * and returns the position of the first character of the matching substring, 
	 * or -1 if no match was found.</p>
	 * <p>This invocation does not do global matches; it ignores the "g" flag of 
	 * <tt>regexp</tt>. It also ignores the <tt>lastIndex</tt> property 
	 * (see {@link RegExpLike#lastIndex()} and {@link RegExpLike#lastIndex(Integer)}) of 
	 * <tt>regexp</tt> and always searches from the beginning of the string, which 
	 * means that it always returns the position of the first match in the string.</p>
	 * @param regexp A RegExp object that specifies the pattern to be searched for in the current string.
	 * @return The position of the start of the first substring of the current string 
	 * that matches <tt>regexp</tt>, or -1 if no match is found.
	 * @see #replace(RegExpLike, String)
	 * @see #replace(RegExpLike, StringLike)
	 * @see #replace(RegExpLike, JsFunction)
	 * @see #match(RegExpLike)
	 * @see Js#re(String)
	 * @see Js#re(String, String)
	 * @see RegExpLike#exec(Object)
	 * @see RegExpLike#test(Object)
	 * @see jsx.core.StringLikes#search(StringLike, RegExpLike)
	 * @see jsx.core.StringLikes#search(String, RegExpLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Integer search(RegExpLike regexp) {
		return call(search, regexp);
	}

	/**
	 * <p>Returns a string containing a slice, or substring, of the current string without 
	 * modify it.</p>
	 * @param begin The string index where the slice is to begin. If negative, this argument 
	 * specifies a position measured from the end of the string. That is, -1 indicates the 
	 * last character, -2 indicates the second from last character, and so on.
	 * @return A new string that contains all the characters of string from and including 
	 * <tt>begin</tt>.
	 * @see #slice(Object, Object)
	 * @see #substr(Object)
	 * @see #substr(Object, Object)
	 * @see #substring(Object)
	 * @see #substring(Object, Object)
	 * @see ArrayLike#slice(Object)
	 * @see ArrayLike#slice(Object, Object)
	 * @see ArrayLike#slice(Vars)
	 * @see jsx.core.StringLikes#slice(StringLike, Object)
	 * @see jsx.core.StringLikes#slice(String, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String slice(Object begin) {
		return call(slice, begin);
	}

	/**
	 * <p>Returns a string containing a slice, or substring, of the current string without 
	 * modify it.</p>
	 * @param begin The string index where the slice is to begin. If negative, this argument 
	 * specifies a position measured from the end of the string. That is, -1 indicates the 
	 * last character, -2 indicates the second from last character, and so on.
	 * @param end The string index immediately after the end of the slice. If undefined, 
	 * the slice includes all characters from <tt>begin</tt> to the end of the string. 
	 * If this argument is negative, it specifies a position measured from the end of the 
	 * string.
	 * @return A new string that contains all the characters of string from and including 
	 * <tt>begin</tt>, and up to but not including <tt>end</tt>.
	 * @see #slice(Object, Object)
	 * @see #substr(Object)
	 * @see #substr(Object, Object)
	 * @see #substring(Object)
	 * @see #substring(Object, Object)
	 * @see ArrayLike#slice(Object)
	 * @see ArrayLike#slice(Object, Object)
	 * @see ArrayLike#slice(Vars)
	 * @see jsx.core.StringLikes#slice(StringLike, Object, Object)
	 * @see jsx.core.StringLikes#slice(String, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String slice(Object begin, Object end) {
		return call(slice, new Vars<Object>().add(begin).add(end));
	}

	/**
	 * <p>Creates and returns an array of substrings of the current string. These 
	 * substrings are created by searching the string from start to end for text that 
	 * matches <tt>separator</tt> and breaking the string before and after that 
	 * matching text. The <tt>separator</tt> text is not included in any of the 
	 * returned substrings, except as noted at the end of this section. Note that if the 
	 * <tt>separator</tt> matches the beginning of the string, the first element of 
	 * the returned array will be an empty string, the text that appears before the 
	 * <tt>separator</tt>. Similarly, if the <tt>separator</tt> matches the end of 
	 * the string, the last element of the array will be the empty string.</p>
	 * <p>If <tt>separator</tt> is undefined, the current string is not split at all, 
	 * and the returned array contains only a single, unbroken string element. If 
	 * <tt>separator</tt> is the empty string or a regular expression that matches 
	 * the empty string, the string is broken between each character, and the returned 
	 * array has the same length as the string does. Note that this is a special case 
	 * because the empty strings before the first character and after the last character 
	 * are not matched.</p>
	 * <p>As noted earlier, the substrings in the array returned by this invocation do not 
	 * contain the delimiting text <tt>separator</tt> used to split the string. However, 
	 * if <tt>separator</tt> is a regular expression that contains parenthesized 
	 * subexpressions, the substrings that match those parenthesized subexpressions 
	 * (but not the text that matches the regular expression as a whole) are included in 
	 * the returned array.</p>
	 * <p>Note that this method is the inverse of the {@link ArrayLike#join()} or 
	 * {@link ArrayLike#join(Object)} method.</p>
	 * @param separator The string or regular expression at which the current string splits.
	 * @return An array of strings, created by splitting string into substrings at the 
	 * boundaries specified by <tt>separator</tt>. The substrings in the returned 
	 * array do not include <tt>separator</tt> itself, except in the case noted in the 
	 * above description.
	 * @see #split(Object, Object)
	 * @see ArrayLike#join()
	 * @see ArrayLike#join(Object)
	 * @see jsx.core.StringLikes#split(StringLike, Object)
	 * @see jsx.core.StringLikes#split(String, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsArray split(Object separator) {
		return new JsArray(call(split, separator));
	}

	/**
	 * <p>Creates and returns an array of as many as <tt>limit</tt> substrings of the 
	 * current string. These substrings are created by searching the string from start to 
	 * end for text that matches <tt>separator</tt> and breaking the string before and 
	 * after that matching text. The <tt>separator</tt> text is not included in any of 
	 * the returned substrings, except as noted at the end of this section. Note that if 
	 * the <tt>separator</tt> matches the beginning of the string, the first element 
	 * of the returned array will be an empty string, the text that appears before the 
	 * <tt>separator</tt>. Similarly, if the <tt>separator</tt> matches the end of 
	 * the string, the last element of the array (assuming no conflicting <tt>limit</tt>) 
	 * will be the empty string.</p>
	 * <p>If <tt>separator</tt> is undefined, the current string is not split at all, 
	 * and the returned array contains only a single, unbroken string element. If 
	 * <tt>separator</tt> is the empty string or a regular expression that matches 
	 * the empty string, the string is broken between each character, and the returned 
	 * array has the same length as the string does, assuming no smaller <tt>limit</tt> 
	 * is specified. Note that this is a special case because the empty strings before 
	 * the first character and after the last character are not matched.</p>
	 * <p>As noted earlier, the substrings in the array returned by this invocation do not 
	 * contain the delimiting text <tt>separator</tt> used to split the string. However, 
	 * if <tt>separator</tt> is a regular expression that contains parenthesized 
	 * subexpressions, the substrings that match those parenthesized subexpressions 
	 * (but not the text that matches the regular expression as a whole) are included in 
	 * the returned array.</p>
	 * <p>Note that this method is the inverse of the {@link ArrayLike#join()} or 
	 * {@link ArrayLike#join(Object)} method.</p>
	 * @param separator The string or regular expression at which the current string splits.
	 * @param limit This optional integer specifies the maximum length of the returned 
	 * array. If defined, no more than this number of substrings will be returned. 
	 * If undefined, the entire string will be split, regardless of its length.
	 * @return An array of strings, created by splitting string into substrings at the 
	 * boundaries specified by <tt>separator</tt>. The substrings in the returned 
	 * array do not include <tt>separator</tt> itself, except in the case noted in the 
	 * above description.
	 * @see #split(Object)
	 * @see ArrayLike#join()
	 * @see ArrayLike#join(Object)
	 * @see jsx.core.StringLikes#split(StringLike, Object, Object)
	 * @see jsx.core.StringLikes#split(String, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsArray split(Object separator, Object limit) {
		return new JsArray(call(split, new Vars<Object>().add(separator).add(limit)));
	}

	/**
	 * <p>Extracts and returns a substring of the current string without modifying it.</p>
	 * <p>Note that this method has not been standardized by ECMAScript and is therefore 
	 * deprecated</p>
	 * @param start The start position of the substring. If this argument is negative, it 
	 * specifies a position measured from the end of the string: -1 specifies the last character, 
	 * -2 specifies the second-to-last character, and so on.
	 * @return A copy of the portion of the current string starting at and including the character 
	 * specified by <tt>start</tt> to the end of the string.
	 * @see #substr(Object)
	 * @see #slice(Object)
	 * @see #slice(Object, Object)
	 * @see #substring(Object)
	 * @see #substring(Object, Object)
	 * @see jsx.core.StringLikes#substr(StringLike, Object)
	 * @see jsx.core.StringLikes#substr(String, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String substr(Object start) {
		return call(substr, start);
	}

	/**
	 * <p>Extracts and returns a substring of the current string without modifying it.</p>
	 * <p>Note this method specifies the desired substring with a character position and a 
	 * <tt>length</tt>. This provides a useful alternative to 
	 * {@link StringLike#substring(Object, Object)}, which specify a substring with two 
	 * character positions. Note, however, that this method has not been standardized by 
	 * ECMAScript and is therefore deprecated</p>
	 * @param start The start position of the substring. If this argument is negative, it 
	 * specifies a position measured from the end of the string: -1 specifies the last character, 
	 * -2 specifies the second-to-last character, and so on.
	 * @param length The number of characters in the substring. If this argument is undefined, 
	 * the returned substring includes all characters from the starting position to the end of 
	 * the string.
	 * @return A copy of the portion of the current string starting at and including the character 
	 * specified by <tt>start</tt> and continuing for <tt>length</tt> characters, 
	 * or to the end of the string if <tt>length</tt> is undefined.
	 * @see #substr(Object)
	 * @see #slice(Object)
	 * @see #slice(Object, Object)
	 * @see #substring(Object)
	 * @see #substring(Object, Object)
	 * @see jsx.core.StringLikes#substr(StringLike, Object, Object)
	 * @see jsx.core.StringLikes#substr(String, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String substr(Object start, Object length) {
		return call(substr, new Vars<Object>().add(start).add(length));
	}

	/**
	 * <p>Returns a substring of the current string consisting of the characters from 
	 * position <tt>from</tt> to the end of the string. The character at position 
	 * <tt>from</tt> is included.</p>
	 * <p>It is important to remember that the character at position <tt>from</tt> is 
	 * included in the substring.</p>
	 * <p>Note that {@link StringLike#slice(Object)} and the nonstandard 
	 * {@link StringLike#substr(Object)} can also extract substrings from a string. 
	 * Unlike those methods, this method does not accept negative arguments.</p>
	 * @param from A nonnegative integer that specifies the position within the current 
	 * string of the first character of the desired substring.
	 * @return  A substring of the current string containing characters copied from 
	 * position <tt>from</tt> to the end of the current string.
	 * @see #substring(Object, Object)
	 * @see #charAt(Object)
	 * @see #indexOf(Object)
	 * @see #indexOf(Object, Object)
	 * @see #lastIndexOf(Object)
	 * @see #lastIndexOf(Object, Object)
	 * @see #slice(Object)
	 * @see #slice(Object, Object)
	 * @see #substr(Object)
	 * @see #substr(Object, Object)
	 * @see jsx.core.StringLikes#substring(StringLike, Object)
	 * @see jsx.core.StringLikes#substring(String, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String substring(Object from) {
		return call(substring, from);
	}

	/**
	 * <p>Returns a substring of the current string consisting of the characters between 
	 * positions <tt>from</tt> and <tt>to</tt>. The character at position <tt>from</tt> 
	 * is included, but the character at position <tt>to</tt> is not included.</p>
	 * <p>If <tt>from</tt> equals <tt>to</tt>, this method returns an empty 
	 * (length 0) string. If <tt>from</tt> is greater than <tt>to</tt>, this method 
	 * first swaps the two arguments and then returns the substring between them.</p>
	 * <p>It is important to remember that the character at position <tt>from</tt> is 
	 * included in the substring but that the character at position <tt>to</tt> is 
	 * not included in the substring. While this may seem arbitrary or counter-intuitive, 
	 * a notable feature of this system is that the length of the returned substring is 
	 * always equal to <tt>to - from</tt>.</p>
	 * <p>Note that {@link StringLike#slice(Object, Object)} and the nonstandard 
	 * {@link StringLike#substr(Object, Object)} can also extract substrings from a string. 
	 * Unlike those methods, this method does not accept negative arguments.</p>
	 * @param from A nonnegative integer that specifies the position within the current 
	 * string of the first character of the desired substring.
	 * @param to A nonnegative optional integer that is one greater than the position of 
	 * the last character of the desired substring. If this argument is undefined, the 
	 * returned substring runs to the end of the string.
	 * @return A new string, of length <tt>to - from</tt>, which contains a substring 
	 * of the current string. The new string contains characters copied from positions 
	 * <tt>from</tt> to <tt>to</tt> - 1 of the string.
	 * @see #substring(Object)
	 * @see #charAt(Object)
	 * @see #indexOf(Object)
	 * @see #indexOf(Object, Object)
	 * @see #lastIndexOf(Object)
	 * @see #lastIndexOf(Object, Object)
	 * @see #slice(Object)
	 * @see #slice(Object, Object)
	 * @see #substr(Object)
	 * @see #substr(Object, Object)
	 * @see jsx.core.StringLikes#substring(StringLike, Object, Object)
	 * @see jsx.core.StringLikes#substring(String, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String substring(Object from, Object to) {
		return call(substring, new Vars<Object>().add(from).add(to));
	}

	/**
	 * <p>Returns a copy of string, with each upper-case letter converted to its lower-case 
	 * equivalent, if it has one.</p>
	 * @return A copy of string, with each upper-case letter converted to its lower-case 
	 * equivalent, if it has one.
	 * @see #toLocaleLowerCase()
	 * @see #toLocaleUpperCase()
	 * @see #toUpperCase()
	 * @see jsx.core.StringLikes#toLowerCase(StringLike)
	 * @see jsx.core.StringLikes#toLowerCase(String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String toLowerCase() {
		return call(toLowerCase);
	}

	/**
	 * <p>Returns a copy of string, with each lower-case letter converted to its upper-case 
	 * equivalent, if it has one.</p>
	 * @return A copy of string, with each lower-case letter converted to its upper-case 
	 * equivalent, if it has one.
	 * @see #toLocaleLowerCase()
	 * @see #toLocaleUpperCase()
	 * @see #toLowerCase()
	 * @see jsx.core.StringLikes#toUpperCase(StringLike)
	 * @see jsx.core.StringLikes#toUpperCase(String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String toUpperCase() {
		return call(toUpperCase);
	}

	/**
	 * <p>Returns a copy of the current string, converted to lower-case letters in a 
	 * locale-specific way. Only a few languages, such as Turkish, have locale-specific 
	 * case mappings, so this method usually returns the same value as 
	 * {@link #toLowerCase()}.</p>
	 * @return A copy of the current string, converted to lower-case letters in a 
	 * locale-specific way.
	 * @see #toLocaleUpperCase()
	 * @see #toLowerCase()
	 * @see #toUpperCase()
	 * @see jsx.core.StringLikes#toLocaleLowerCase(StringLike)
	 * @see jsx.core.StringLikes#toLocaleLowerCase(String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String toLocaleLowerCase() {
		return call(toLocaleLowerCase);
	}

	/**
	 * <p>Returns a copy of the current string, converted to upper-case letters in a 
	 * locale-specific way. Only a few languages, such as Turkish, have locale-specific 
	 * case mappings, so this method usually returns the same value as 
	 * {@link #toUpperCase()}.</p>
	 * @return A copy of the current string, converted to upper-case letters in a 
	 * locale-specific way.
	 * @see #toLocaleLowerCase()
	 * @see #toLowerCase()
	 * @see #toUpperCase()
	 * @see jsx.core.StringLikes#toLocaleUpperCase(StringLike)
	 * @see jsx.core.StringLikes#toLocaleUpperCase(String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String toLocaleUpperCase() {
		return call(toLocaleUpperCase);
	}

	/**
	 * <p>Returns the primitive value associated with the current instance, if there is one. 
	 * This invocation returns the same thing as {@link #toString()}.</p>
	 * @return The primitive string value associated with the current instance.
	 * @see #toString()
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current string instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	@Override
	public String valueOf() {
		return var().valueOf();
	}

	/**
	 * <p>Checks if the current string instance is the name of a property of the second 
	 * operand, resembling the <tt>in</tt> operator in JavaScript.</p>
	 * <p>This operation converts the current string instance to a string and expects 
	 * the second operand be an object (or array).</p>
	 * @param other Any object or array.
	 * @return <tt>true</tt> if the current string instance is the name of a property of 
	 * the second operand; <tt>false</tt>, otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p in other</pre>
	 * where <tt>p</tt> is the current string instance of the invocation of this method.
	 */
	public boolean in(Object other) {
		return var().in(other);
	}

	/**
	 * <p>Checks if the current string instance is an instance of the second operand, 
	 * resembling the <tt>instanceof</tt> operator in JavaScript.</p>
	 * <p>This operation expects the first operand be an object and the second be a class 
	 * of objects. In JavaScript, classes of objects are defined by the constructor function 
	 * that initializes them.</p>
	 * @param other A constructor function.
	 * @return <tt>true</tt> if the current string instance is an instance of the second 
	 * operand; <tt>false</tt>, otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p instanceof other</pre>
	 * where <tt>p</tt> is the current string instance of the invocation of this method.
	 */
	public final boolean instanceOf(Object other) {
		return Js.instanceOf(this, other);
	}

	/**
	 * <p>Adds the current string instance to a numeric operand or concatenates it with 
	 * a string operand, resembling the addition operator in JavaScript.</p>
	 * <p>If one value is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link Js#valueOf(Object)}  
	 * method and/or the {@link Js#toString(Object)} method on the object.</p>
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p + other</pre>
	 * where <tt>p</tt> is the current string instance of the invocation of this method.
	 */
	public final String add(Object other) {
		return Js.add(this, other);
	}

	/**
	 * <p>Logically evaluates the current string instance.</p>
	 * @return The logical value of the current string instance.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the instance invocation of this method, that is, 
	 * replacing it with its current primitive instance.
	 */
	public final boolean be() {
		return Js.be(var());
	}

	/**
	 * <p>Inverts the boolean value of the current string instance, resembling the 
	 * logical NOT operator in JavaScript.</p>
	 * <p>This operation converts the current string instance to a boolean value using 
	 * the following rules if necessary before inverting the converted value.</p>
	 * <ul>
	 * <li>If a number is used where a boolean value is expected, the number is converted 
	 * to <tt>true</tt> unless the number is 0 or NaN, which are converted to <tt>false</tt>.</li>
	 * <li>If a string is used where a boolean value is expected, it is converted to <tt>true</tt> 
	 * except for the empty string, which is converted to <tt>false</tt>.</li>
	 * <li><tt>null</tt> and the undefined value convert to <tt>false</tt>, and any 
	 * non-null object, array, or function converts to <tt>true</tt>.
	 * </ul>
	 * <p>You can convert any value <tt>x</tt> to its equivalent boolean value by applying 
	 * this operation twice: <tt>Js.not(Js.not(x))</tt></p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical NOT operator of the 
	 * Java language like this:
	 * <pre>!Js.be(var)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @return The inverted boolean value.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>!p</pre>
	 * where <tt>p</tt> is the current string instance of the invocation of this method.
	 */
	public final boolean not() {
		return Js.not(var());
	}

	/**
	 * <p>Checks whether the two operands are "equal" using a more relaxed definition of 
	 * sameness that allows type conversions, resembling the equality operator in 
	 * JavaScript.</p>
	 * <p>The equality and identity operations check whether two values are the same, using 
	 * two different definitions of sameness. Both operations accept operands of any type, 
	 * and both return <tt>true</tt> if their operands are the same and <tt>false</tt> 
	 * if they are different. The identity operation checks whether its two operands are 
	 * "identical" using a strict definition of sameness. The equality operation checks 
	 * whether its two operands are "equal" using a more relaxed definition of sameness 
	 * that allows type conversions.</p>
	 * <p>The identity operation is standardized by ECMAScript v3 and implemented in 
	 * JavaScript 1.3 and later. Be sure you understand the differences between the 
	 * assignment, equality, and identity operations, and be careful to use the correct one 
	 * when coding! Although it is tempting to call all three operations "equals," it may 
	 * help to reduce confusion if you read "gets or is assigned" for assignment operation, 
	 * "is equal to" for equality operation, and "is identical to" for identity operation.</p>
	 * <p>In JavaScript, numbers, strings, and boolean values are compared by value. In this 
	 * case, two separate values are involved, and the equality and identity operations 
	 * check that these two values are identical. This means that two variables are equal 
	 * or identical only if they contain the same value. For example, two strings are equal 
	 * only if they each contain exactly the same characters.</p>
	 * <p>On the other hand, objects, arrays, and functions are compared by reference. This 
	 * means that two variables are equal only if they refer to the same object. Two 
	 * separate arrays are never equal or identical, even if they contain equal or identical 
	 * elements. Two variables that contain references to objects, arrays, or functions are 
	 * equal only if they refer to the same object, array, or function. If you want to test 
	 * that two distinct objects contain the same properties or that two distinct arrays 
	 * contain the same elements, you'll have to check the properties or elements individually 
	 * for equality or identity. And, if any of the properties or elements are themselves 
	 * objects or arrays, you'll have to decide how deep you want the comparison to go.</p>
	 * <p>The following rules determine whether two values are equal according to the 
	 * equality operation:
	 * <ul>
	 * <li>If the two values have the same type, test them for identity. If the values are 
	 * identical, they are equal; if they are not identical, they are not equal.</li>
	 * <li>If the two values do not have the same type, they may still be equal. Use the 
	 * following rules and type conversions to check for equality:</li>
	 * <ul>
	 * <li>If one value is null and the other is undefined, they are equal.</li>
	 * <li>If one value is a number and the other is a string, convert the string to a 
	 * number and try the comparison again, using the converted value.</li>
	 * <li>If either value is <tt>true</tt>, convert it to 1 and try the comparison 
	 * again. If either value is <tt>false</tt>, convert it to 0 and try the comparison 
	 * again.</li>
	 * <li>If one value is an object and the other is a number or string, convert the 
	 * object to a primitive and try the comparison again. An object is converted to a 
	 * primitive value by either its <tt>toString()</tt> method or its <tt>valueOf()</tt> 
	 * method. The built-in classes of core JavaScript attempt <tt>valueOf()</tt> 
	 * conversion before <tt>toString()</tt> conversion, except for the Date class, 
	 * which performs <tt>toString()</tt> conversion. Objects that are not part of core 
	 * JavaScript may convert themselves to primitive values in an implementation-defined 
	 * way.</li>
	 * <li>Any other combinations of values are not equal.</li>
	 * </ul>
	 * </ul>
	 * @param other Any value or object.
	 * @return <tt>true</tt> if the first operand equals the second; <tt>false</tt>, 
	 * otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p == other</pre>
	 * where <tt>p</tt> is the current string instance of the invocation of this method.
	 */
	public final boolean eq(Object other) {
		return Js.eq(var(), other);
	}

	/**
	 * <p>Checks whether the two operands are "identical" using a strict definition of 
	 * sameness, resembling the identity operator in JavaScript.</p>
	 * <p>The equality and identity operations check whether two values are the same, using 
	 * two different definitions of sameness. Both operations accept operands of any type, 
	 * and both return <tt>true</tt> if their operands are the same and <tt>false</tt> 
	 * if they are different. The identity operation checks whether its two operands are 
	 * "identical" using a strict definition of sameness. The equality operation checks 
	 * whether its two operands are "equal" using a more relaxed definition of sameness 
	 * that allows type conversions.</p>
	 * <p>The identity operation is standardized by ECMAScript v3 and implemented in 
	 * JavaScript 1.3 and later. Be sure you understand the differences between the 
	 * assignment, equality, and identity operations, and be careful to use the correct one 
	 * when coding! Although it is tempting to call all three operations "equals," it may 
	 * help to reduce confusion if you read "gets or is assigned" for assignment operation, 
	 * "is equal to" for equality operation, and "is identical to" for identity operation.</p>
	 * <p>In JavaScript, numbers, strings, and boolean values are compared by value. In this 
	 * case, two separate values are involved, and the equality and identity operations 
	 * check that these two values are identical. This means that two variables are equal 
	 * or identical only if they contain the same value. For example, two strings are equal 
	 * only if they each contain exactly the same characters.</p>
	 * <p>On the other hand, objects, arrays, and functions are compared by reference. This 
	 * means that two variables are equal only if they refer to the same object. Two 
	 * separate arrays are never equal or identical, even if they contain equal or identical 
	 * elements. Two variables that contain references to objects, arrays, or functions are 
	 * equal only if they refer to the same object, array, or function. If you want to test 
	 * that two distinct objects contain the same properties or that two distinct arrays 
	 * contain the same elements, you'll have to check the properties or elements individually 
	 * for equality or identity. And, if any of the properties or elements are themselves 
	 * objects or arrays, you'll have to decide how deep you want the comparison to go.</p>
	 * <p>The following rules determine whether two values are identical according to the identity operation:
	 * <ul>
	 * <li>If the two values have different types, they are not identical.</li>
	 * <li>If both values are numbers and have the same value, they are identical, unless 
	 * either or both values are <tt>NaN</tt>, in which case they are not identical. 
	 * The <tt>NaN</tt> value is never identical to any other value, including itself! 
	 * To check whether a value is <tt>NaN</tt>, use the global {@link Js#isNaN(Object)} 
	 * function.</li>
	 * <li>If both values are strings and contain exactly the same characters in the same 
	 * positions, they are identical. If the strings differ in length or content, they are 
	 * not identical. Note that in some cases, the Unicode standard allows more than one 
	 * way to encode the same string. For efficiency, however, JavaScript's string 
	 * comparison compares strictly on a character-by-character basis, and it assumes that 
	 * all strings have been converted to a "normalized form" before they are compared. 
	 * See the {@link StringLike#localeCompare(Object)} for another way to compare strings.</li>
	 * <li>If both values are the boolean value <tt>true</tt> or both are the boolean 
	 * value <tt>false</tt>, they are identical.</li>
	 * <li>If both values refer to the same object, array, or function, they are identical. 
	 * If they refer to different objects (or arrays or functions) they are not identical, 
	 * even if both objects have identical properties or both arrays have identical elements.</li>
	 * <li>If both values are null or both values are undefined, they are identical.</li>
	 * </ul>
	 * @param other Any value or object.
	 * @return <tt>true</tt> if the first operand is identical to the second; 
	 * <tt>false</tt>, otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p === other</pre>
	 * where <tt>p</tt> is the current string instance of the invocation of this method.
	 */
	public final boolean eqs(Object other) {
		return Js.eqs(this, other);
	}

	/**
	 * <p>Checks whether the two operands are not "equal" using a more relaxed definition of 
	 * sameness that allows type conversions, resembling the equality operator in 
	 * JavaScript.</p>
	 * <p>The equality and identity operations check whether two values are the same, using 
	 * two different definitions of sameness. Both operations accept operands of any type, 
	 * and both return <tt>true</tt> if their operands are the same and <tt>false</tt> 
	 * if they are different. The identity operation checks whether its two operands are 
	 * "identical" using a strict definition of sameness. The equality operation checks 
	 * whether its two operands are "equal" using a more relaxed definition of sameness 
	 * that allows type conversions.</p>
	 * <p>The identity operation is standardized by ECMAScript v3 and implemented in 
	 * JavaScript 1.3 and later. Be sure you understand the differences between the 
	 * assignment, equality, and identity operations, and be careful to use the correct one 
	 * when coding! Although it is tempting to call all three operations "equals," it may 
	 * help to reduce confusion if you read "gets or is assigned" for assignment operation, 
	 * "is equal to" for equality operation, and "is identical to" for identity operation.</p>
	 * <p>In JavaScript, numbers, strings, and boolean values are compared by value. In this 
	 * case, two separate values are involved, and the equality and identity operations 
	 * check that these two values are identical. This means that two variables are equal 
	 * or identical only if they contain the same value. For example, two strings are equal 
	 * only if they each contain exactly the same characters.</p>
	 * <p>On the other hand, objects, arrays, and functions are compared by reference. This 
	 * means that two variables are equal only if they refer to the same object. Two 
	 * separate arrays are never equal or identical, even if they contain equal or identical 
	 * elements. Two variables that contain references to objects, arrays, or functions are 
	 * equal only if they refer to the same object, array, or function. If you want to test 
	 * that two distinct objects contain the same properties or that two distinct arrays 
	 * contain the same elements, you'll have to check the properties or elements individually 
	 * for equality or identity. And, if any of the properties or elements are themselves 
	 * objects or arrays, you'll have to decide how deep you want the comparison to go.</p>
	 * <p>The following rules determine whether two values are equal according to the 
	 * equality operation:
	 * <ul>
	 * <li>If the two values have the same type, test them for identity. If the values are 
	 * identical, they are equal; if they are not identical, they are not equal.</li>
	 * <li>If the two values do not have the same type, they may still be equal. Use the 
	 * following rules and type conversions to check for equality:</li>
	 * <ul>
	 * <li>If one value is null and the other is undefined, they are equal.</li>
	 * <li>If one value is a number and the other is a string, convert the string to a 
	 * number and try the comparison again, using the converted value.</li>
	 * <li>If either value is <tt>true</tt>, convert it to 1 and try the comparison 
	 * again. If either value is <tt>false</tt>, convert it to 0 and try the comparison 
	 * again.</li>
	 * <li>If one value is an object and the other is a number or string, convert the 
	 * object to a primitive and try the comparison again. An object is converted to a 
	 * primitive value by either its <tt>toString()</tt> method or its <tt>valueOf()</tt> 
	 * method. The built-in classes of core JavaScript attempt <tt>valueOf()</tt> 
	 * conversion before <tt>toString()</tt> conversion, except for the Date class, 
	 * which performs <tt>toString()</tt> conversion. Objects that are not part of core 
	 * JavaScript may convert themselves to primitive values in an implementation-defined 
	 * way.</li>
	 * <li>Any other combinations of values are not equal.</li>
	 * </ul>
	 * </ul>
	 * @param other Any value or object.
	 * @return <tt>false</tt> if the first operand equals the second; <tt>true</tt>, 
	 * otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p != other</pre>
	 * where <tt>p</tt> is the current string instance of the invocation of this method.
	 */
	public final boolean neq(Object other) {
		return Js.neq(var(), other);
	}

	/**
	 * <p>Checks whether the two operands are not "identical" using a strict definition of 
	 * sameness, resembling the identity operator in JavaScript.</p>
	 * <p>The equality and identity operations check whether two values are the same, using 
	 * two different definitions of sameness. Both operations accept operands of any type, 
	 * and both return <tt>true</tt> if their operands are the same and <tt>false</tt> 
	 * if they are different. The identity operation checks whether its two operands are 
	 * "identical" using a strict definition of sameness. The equality operation checks 
	 * whether its two operands are "equal" using a more relaxed definition of sameness 
	 * that allows type conversions.</p>
	 * <p>The identity operation is standardized by ECMAScript v3 and implemented in 
	 * JavaScript 1.3 and later. Be sure you understand the differences between the 
	 * assignment, equality, and identity operations, and be careful to use the correct one 
	 * when coding! Although it is tempting to call all three operations "equals," it may 
	 * help to reduce confusion if you read "gets or is assigned" for assignment operation, 
	 * "is equal to" for equality operation, and "is identical to" for identity operation.</p>
	 * <p>In JavaScript, numbers, strings, and boolean values are compared by value. In this 
	 * case, two separate values are involved, and the equality and identity operations 
	 * check that these two values are identical. This means that two variables are equal 
	 * or identical only if they contain the same value. For example, two strings are equal 
	 * only if they each contain exactly the same characters.</p>
	 * <p>On the other hand, objects, arrays, and functions are compared by reference. This 
	 * means that two variables are equal only if they refer to the same object. Two 
	 * separate arrays are never equal or identical, even if they contain equal or identical 
	 * elements. Two variables that contain references to objects, arrays, or functions are 
	 * equal only if they refer to the same object, array, or function. If you want to test 
	 * that two distinct objects contain the same properties or that two distinct arrays 
	 * contain the same elements, you'll have to check the properties or elements individually 
	 * for equality or identity. And, if any of the properties or elements are themselves 
	 * objects or arrays, you'll have to decide how deep you want the comparison to go.</p>
	 * <p>The following rules determine whether two values are identical according to the identity operation:
	 * <ul>
	 * <li>If the two values have different types, they are not identical.</li>
	 * <li>If both values are numbers and have the same value, they are identical, unless 
	 * either or both values are <tt>NaN</tt>, in which case they are not identical. 
	 * The <tt>NaN</tt> value is never identical to any other value, including itself! 
	 * To check whether a value is <tt>NaN</tt>, use the global {@link Js#isNaN(Object)} 
	 * function.</li>
	 * <li>If both values are strings and contain exactly the same characters in the same 
	 * positions, they are identical. If the strings differ in length or content, they are 
	 * not identical. Note that in some cases, the Unicode standard allows more than one 
	 * way to encode the same string. For efficiency, however, JavaScript's string 
	 * comparison compares strictly on a character-by-character basis, and it assumes that 
	 * all strings have been converted to a "normalized form" before they are compared. 
	 * See the {@link StringLike#localeCompare(Object)} for another way to compare strings.</li>
	 * <li>If both values are the boolean value <tt>true</tt> or both are the boolean 
	 * value <tt>false</tt>, they are identical.</li>
	 * <li>If both values refer to the same object, array, or function, they are identical. 
	 * If they refer to different objects (or arrays or functions) they are not identical, 
	 * even if both objects have identical properties or both arrays have identical elements.</li>
	 * <li>If both values are null or both values are undefined, they are identical.</li>
	 * </ul>
	 * @param other Any value or object.
	 * @return <tt>false</tt> if the first operand is identical to the second; 
	 * <tt>true</tt>, otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p !== other</pre>
	 * where <tt>p</tt> is the current string instance of the invocation of this method.
	 */
	public final boolean neqs(Object other) {
		return Js.neqs(this, other);
	}

	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p && other</pre>
	 * where <tt>p</tt> is the current string instance of the invocation of this method.
	 */
	public final Object and(Object other) {
		return Js.and(this, other);
	}

	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p && other</pre>
	 * where <tt>p</tt> is the current string instance of the invocation of this method.
	 */
	public final String and(String other) {
		return Js.and(this, other);
	}

	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p && other</pre>
	 * where <tt>p</tt> is the current string instance of the invocation of this method.
	 */
	public final String and(Value<String> other) {
		return Js.and(this, other);
	}

	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p && other</pre>
	 * where <tt>p</tt> is the current string instance of the invocation of this method.
	 */
	public final JsObject and(Var<? extends JsObject> other) {
		return Js.and(this, other);
	}

	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p && other</pre>
	 * where <tt>p</tt> is the current string instance of the invocation of this method.
	 */
	public final JsString and(JsString other) {
		return Js.and(this, other);
	}

	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p || other</pre>
	 * where <tt>p</tt> is the current string instance of the invocation of this method.
	 */
	public final Object or(Object other) {
		return Js.or(this, other);
	}

	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p || other</pre>
	 * where <tt>p</tt> is the current string instance of the invocation of this method.
	 */
	public final JsString or(String other) {
		return Js.or(this, other);
	}

	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p || other</pre>
	 * where <tt>p</tt> is the current string instance of the invocation of this method.
	 */
	public final JsString or(Value<String> other) {
		return Js.or(this, other);
	}

	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p || other</pre>
	 * where <tt>p</tt> is the current string instance of the invocation of this method.
	 */
	public final JsObject or(Var<? extends JsObject> other) {
		return Js.or(this, other);
	}

	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p || other</pre>
	 * where <tt>p</tt> is the current string instance of the invocation of this method.
	 */
	public final JsString or(JsString other) {
		return Js.or(this, other);
	}

	/**
	 * <p>Conditional operation, resembling the ternary operator of JavaScript, returns the 
	 * second operand if the first operand evaluates to <tt>true</tt>; Returns the third 
	 * operand, otherwise.</p>
	 * <p>The first operand of the conditional operation must be (or be convertible to) a 
	 * boolean value. Usually this is the result of a comparison operation. The second and 
	 * third operands may have any value. The value returned by the conditional operation 
	 * depends on the boolean value of the first operand. If that operand is <tt>true</tt>, 
	 * the value of the conditional expression is the value of the second operand. If the 
	 * first operand is <tt>false</tt>, the value of the conditional expression is the 
	 * value of the third operand.</p>
	 * <p>To make the second and third operands really late-evaluated or not evaluated in 
	 * JS Simulation mode, resembling what happens in JavaScript, you may have to extend 
	 * {@link Var} anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the conditional operator of the 
	 * Java language like this:
	 * <pre>Js.be(test) ? var : other</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param other A value or object.
	 * @return The second operand if the first operand evaluates to <tt>true</tt>; Otherwise, 
	 * the third operand.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>test ? p : other</pre>
	 * where <tt>p</tt> is the current string instance of the invocation of this method.
	 */
	public final Object cond(Object test, Object other) {
		return Js.cond(test, this, other);
	}

	/**
	 * <p>Conditional operation, resembling the ternary operator of JavaScript, returns the 
	 * second operand if the first operand evaluates to <tt>true</tt>; Returns the third 
	 * operand, otherwise.</p>
	 * <p>The first operand of the conditional operation must be (or be convertible to) a 
	 * boolean value. Usually this is the result of a comparison operation. The second and 
	 * third operands may have any value. The value returned by the conditional operation 
	 * depends on the boolean value of the first operand. If that operand is <tt>true</tt>, 
	 * the value of the conditional expression is the value of the second operand. If the 
	 * first operand is <tt>false</tt>, the value of the conditional expression is the 
	 * value of the third operand.</p>
	 * <p>To make the second and third operands really late-evaluated or not evaluated in 
	 * JS Simulation mode, resembling what happens in JavaScript, you may have to extend 
	 * {@link Var} anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the conditional operator of the 
	 * Java language like this:
	 * <pre>Js.be(test) ? var : other</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param other A value or object.
	 * @return The second operand if the first operand evaluates to <tt>true</tt>; Otherwise, 
	 * the third operand.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>test ? p : other</pre>
	 * where <tt>p</tt> is the current string instance of the invocation of this method.
	 */
	public final JsObject cond(Object test, Var<? extends JsObject> other) {
		return Js.cond(test, this, other);
	}

	/**
	 * <p>Conditional operation, resembling the ternary operator of JavaScript, returns the 
	 * second operand if the first operand evaluates to <tt>true</tt>; Returns the third 
	 * operand, otherwise.</p>
	 * <p>The first operand of the conditional operation must be (or be convertible to) a 
	 * boolean value. Usually this is the result of a comparison operation. The second and 
	 * third operands may have any value. The value returned by the conditional operation 
	 * depends on the boolean value of the first operand. If that operand is <tt>true</tt>, 
	 * the value of the conditional expression is the value of the second operand. If the 
	 * first operand is <tt>false</tt>, the value of the conditional expression is the 
	 * value of the third operand.</p>
	 * <p>To make the second and third operands really late-evaluated or not evaluated in 
	 * JS Simulation mode, resembling what happens in JavaScript, you may have to extend 
	 * {@link Var} anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the conditional operator of the 
	 * Java language like this:
	 * <pre>Js.be(test) ? var : other</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param other A value or object.
	 * @return The second operand if the first operand evaluates to <tt>true</tt>; Otherwise, 
	 * the third operand.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>test ? p : other</pre>
	 * where <tt>p</tt> is the current string instance of the invocation of this method.
	 */
	public final JsString cond(Object test, JsString other) {
		return Js.cond(test, this, other);
	}

	/**
	 * <p>Evaluates the current primitive string instance as JavaScript code and 
	 * returns the result.</p>
	 * <p>In JavaScript, <tt>eval()</tt> is a global method that evaluates a string of 
	 * JavaScript code in the current lexical scope. If the code contains an expression, 
	 * eval evaluates the expression and returns its value. If the code contains a 
	 * JavaScript statement or statements, it executes those statements and returns the 
	 * value, if any, returned by the last statement. If the code does not return any 
	 * value, <tt>eval()</tt> returns undefined. Finally, if code throws an exception, 
	 * <tt>eval()</tt> passes that exception on to the caller.</p>
	 * <p>The global function <tt>eval()</tt> provides a very powerful capability to 
	 * the JavaScript language, but its use is infrequent in real-world programs. 
	 * Obvious uses are to write programs that act as recursive JavaScript interpreters 
	 * and to write programs that dynamically generate and evaluate JavaScript code.</p>
	 * <p>Most JavaScript functions and methods that expect string arguments accept 
	 * arguments of other types as well and simply convert those argument values to 
	 * strings before proceeding. <tt>eval()</tt> does not behave like this. If the 
	 * code argument is not a primitive string, it is simply returned unchanged. Be 
	 * careful, therefore, that you do not inadvertently pass a String object to 
	 * <tt>eval()</tt> when you intended to pass a primitive string value.</p>
	 * <p>For purposes of implementation efficiency, the ECMAScript v3 standard places 
	 * an unusual restriction on the use of <tt>eval()</tt>. An ECMAScript implementation 
	 * is allowed to throw an <tt>EvalError</tt> exception if you attempt to overwrite 
	 * the <tt>eval</tt> property or if you assign the <tt>eval()</tt> method to another 
	 * property and attempt to invoke it through that property.</p>
	 * @return The return value of the evaluated code, if any.
	 * @throws RuntimeException JavaScript throws a <tt>SyntaxError</tt> if the current 
	 * primitive instance does not contain legal JavaScript, a <tt>EvalError</tt> if 
	 * the <tt>eval</tt> function was called illegally, through an identifier other 
	 * than "eval", or other JavaScript error generated by the code passed. See 
	 * {@link Js#err(Object)}, {@link js.core.JsSyntaxError}, {@link js.core.JsEvalError}, 
	 * and {@link js.core.JsError} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>eval(p)</pre>
	 * where <tt>p</tt> is the current string instance of the invocation of this method.
	 */
	public final Object eval() {
		return Js.core().eval(this);
	}
}
