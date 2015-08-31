
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
 * <p>An <b>opaque</b> class representing JavaScript class.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsClass extends JsObject
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
	protected static abstract class Members extends JsObject.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClass#prototype
		 * @see Member#prototype
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid prototype = id("prototype");
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
	public static class Member extends JsObject.Member
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
		public JsClass with(ObjectLike o) {
			return new JsClass((JsObject)var(o).var(mid()));
		}
		/**
		 * <p>Evaluates a property, represented by the current member instance, of the 
		 * JavaScript global object, that is, evaluates the member to a global identifier.</p>
		 * @return The value of the current member based on the JavaScript global object.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into 
		 * the JavaScript expression: 
		 * <pre>m</pre>
		 * where <tt>m</tt> is the identifier name resolved from the current member 
		 * instance of the invocation.
		 */
		public JsClass with() {
			return with(Js.core());
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The <tt>prototype</tt> property is used when a function is used as a 
		 * constructor. It refers to an object that serves as the prototype for an entire 
		 * class of objects. Any object created by the constructor inherits all properties 
		 * of the object referred to by the <tt>prototype</tt> property.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsObject.Member prototype = new JsObject.Member(this, Members.prototype);
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
	public static final JsFunction.Member<JsClass> constructor = new JsFunction.Member<JsClass>(Members.constructor, Generic.get(JsClass.class));
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsFunction#valueOf()
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<JsClass> valueOf = new JsFunction.Member<JsClass>(Members.valueOf, Generic.get(JsClass.class));
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The <tt>prototype</tt> property is used when a function is used as a 
	 * constructor. It refers to an object that serves as the prototype for an entire 
	 * class of objects. Any object created by the constructor inherits all properties 
	 * of the object referred to by the <tt>prototype</tt> property.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsObject.Member prototype = new JsObject.Member(Members.prototype);

	/**
	 * <p>Internally constructs a function object.</p>
	 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
	 */
	protected JsClass(Object var) {
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
	protected JsClass(JsObject var) {
		super(var);
	}

	/**
	 * <p>Simply returns the current boolean instance.</p>
	 * <p>This method is useful for JS Simulation to implement opaque types.</p>
	 * <p>If the current instance is a Java simulated array and the method runs in JS 
	 * Embed Simulation mode, the invocation creates and returns a JavaScript Array object 
	 * as a runtime copy of the current array.</p>
	 * @return The current boolean instance.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the instance invocation of this method, that is, 
	 * replacing it with its current instance.
	 */
	@Override
	public JsClass var() {
		return (JsClass)super.var();
	}

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
	@Override
	public JsClass valueOf() {
		return var().valueOf();
	}

	/**
	 * <p>Logically evaluates the current function instance.</p>
	 * @return The logical value of the current function instance.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the instance invocation of this method, that is, 
	 * replacing it with its current date instance.
	 */
	public final boolean be() {
		return Js.be(var());
	}

	/**
	 * <p>Inverts the boolean value of the current function instance, resembling the logical 
	 * NOT operator in JavaScript.</p>
	 * <p>This operation converts the current function instance to a boolean value using 
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
	 * <pre>!d</pre>
	 * where <tt>d</tt> is the current function instance of the invocation of this method.
	 */
	public final boolean not() {
		return Js.not(var());
	}

	/**
	 * <p>Checks if the current function instance is an instance of the second operand, 
	 * resembling the <tt>instanceof</tt> operator in JavaScript.</p>
	 * <p>This operation expects the first operand be an object and the second be a class 
	 * of objects. In JavaScript, classes of objects are defined by the constructor function 
	 * that initializes them.</p>
	 * @param other A constructor function.
	 * @return <tt>true</tt> if the current function instance is an instance of the second 
	 * operand; <tt>false</tt>, otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p instanceof other</pre>
	 * where <tt>p</tt> is the current function instance of the invocation of this method.
	 */
	public final boolean instanceOf(Object other) {
		return Js.instanceOf(this, other);
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
	 * where <tt>p</tt> is the current function instance of the invocation of this method.
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
	 * where <tt>p</tt> is the current function instance of the invocation of this method.
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
	 * where <tt>p</tt> is the current function instance of the invocation of this method.
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
	 * where <tt>p</tt> is the current function instance of the invocation of this method.
	 */
	public final boolean neqs(Object other) {
		return Js.neqs(this, other);
	}

	/**
	 * <p>Adds the current function instance to a numeric operand or concatenates it with 
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
	 * <pre>d + other</pre>
	 * where <tt>d</tt> is the current function instance of the invocation of this method.
	 */
	public final String add(Object other) {
		return Js.add(toString(), other);
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
	 * where <tt>p</tt> is the current function instance of the invocation of this method.
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
	 * where <tt>p</tt> is the current function instance of the invocation of this method.
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
	 * where <tt>p</tt> is the current function instance of the invocation of this method.
	 */
	public final JsClass and(JsClass other) {
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
	 * where <tt>p</tt> is the current function instance of the invocation of this method.
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
	 * where <tt>p</tt> is the current function instance of the invocation of this method.
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
	 * where <tt>p</tt> is the current function instance of the invocation of this method.
	 */
	public final JsClass or(JsClass other) {
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
	 * where <tt>p</tt> is the current function instance of the invocation of this method.
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
	 * where <tt>p</tt> is the current function instance of the invocation of this method.
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
	 * where <tt>p</tt> is the current function instance of the invocation of this method.
	 */
	public final JsClass cond(Object test, JsClass other) {
		return Js.cond(test, this, other);
	}
}
