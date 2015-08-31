
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

package js;

import js.core.*;

/**
 * <p>An <b>opaque</b> class resembling JavaScript primitive values.</p>
 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
 * wrap primitive data types are also "primitive" to JS.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class Value<T> extends Var<T>
{
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
	public static class Member<T> extends Var.Member<T>
	{
		/**
		 * <p>Internally constructs a member based on a qualifying member.</p>
		 * <p>This constructor  is <b>internal</b> and only called inside of <b>opaque</b> 
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
		 * @param o The argument object.
		 * @return The value of the current member based on the object argument.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into 
		 * the JavaScript expression: 
		 * <pre>o.m</pre>
		 * where <tt>m</tt> is the identifier name resolved from the current member 
		 * instance of the invocation.
		 */
		@SuppressWarnings("unchecked")
		@Override
		public final T with(ObjectLike o) {
			return (T)var(o).var(mid());
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
		public final T with() {
			return with(Js.core());
		}
	}

	private T value;

	/**
	 * <p>Internally constructs a primitive instance from a primitive value.</p>
	 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
	 * wrap primitive data types are also "primitive" to JS.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
	 */
	protected Value(T value) {
		var(value);
	}
	/**
	 * <p>Internally constructs a primitive instance from another primitive instance.</p>
	 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
	 * wrap primitive data types are also "primitive" to JS.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
	 */
	protected Value(Var<? extends T> value) {
		var(value);
	}

	/**
	 * <p>Assigns a new primitive value to the current primitive instance.</p>
	 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
	 * wrap primitive data types are also "primitive" to JS.</p>
	 * @param value The new value to set
	 * @return The new value
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into 
	 * the JavaScript expression: 
	 * <pre>p = value</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final T var(T value) {
		this.value = value;
		return value;
	}
	/**
	 * <p>Assigns the primitive value of another primitive instance to the current 
	 * primitive instance.</p>
	 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
	 * wrap primitive data types are also "primitive" to JS.</p>
	 * @param value Another primitive instance
	 * @return The new value
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into 
	 * the JavaScript expression: 
	 * <pre>p = value</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final T var(Var<? extends T> value) {
		return var(value == null ? null : value.var());
	}

	/**
	 * <p>Simply returns the primitive value of the current primitive instance.</p>
	 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
	 * wrap primitive data types are also "primitive" to JS.</p>
	 * @return The primitive value of the current primitive instance.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the instance invocation of this method, that is, 
	 * replacing it with its current instance.
	 */
	@Override
	public final T var() {
		return value;
	}

	/**
	 * <p>Undefines the current primitive instance.</p>
	 * @return <tt>true</tt> if the deletion is successful; Otherwise, <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>delete p</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final boolean delete() {
		if(undefined()) {
			return false;
		}
		var((T)null);
		return true;
	}

	/**
	 * <p>Logically evaluates the current primitive instance.</p>
	 * @return The logical value of the current primitive instance.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the instance invocation of this method, that is, 
	 * replacing it with its current primitive instance.
	 */
	public final boolean be() {
		return Js.be(var());
	}

	/**
	 * <p>Inverts the boolean value of the current primitive instance, resembling the 
	 * logical NOT operator in JavaScript.</p>
	 * <p>This operation converts the current primitive instance to a boolean value using 
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
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final boolean not() {
		return Js.not(var());
	}

	/**
	 * <p>Bitwise-NOT operation, resembling that of JavaScript, operates by reversing all 
	 * bits in the current primitive instance.</p>
	 * <p>Because of the way signed integers are represented in JavaScript, applying this 
	 * operation to a value is equivalent to changing its sign and subtracting 1.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * values using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with the current primitive instance that are 
	 * not integers or are too large to fit in a 32-bit integer representation, it simply 
	 * coerces them to 32-bit integers by dropping any fractional part of the value or any 
	 * bits beyond the 32nd.</p>
	 * @return The bitwise-NOT of the current primitive instance.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>~p</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final int bnot() {
		return Js.bnot(var());
	}

	/**
	 * <p>Multiplies the current primitive instance with the operand, resembling the 
	 * multiplication operator in JavaScript.</p>
	 * <p>If used with non-numeric values, this operation attempts to convert them to 
	 * numbers.</p>
	 * @param other Any numeric value.
	 * @return The product of the current primitive instance and the operand.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p * other</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Number mul(Object other) {
		return new Number(Js.mul(var(), other));
	}

	/**
	 * <p>Divides the current primitive instance by the operand, resembling the division 
	 * operator in JavaScript.</p>
	 * <p>Used with non-numeric values, this operation attempts to convert them to 
	 * numbers. If you are used to programming languages that distinguish between integer 
	 * and floating-point numbers, you might expect to get an integer result when you 
	 * divide one integer by another. In JavaScript, however, all numbers are floating-point, 
	 * so all division operations have floating-point results. Division by zero yields positive 
	 * or negative infinity, while <tt>0/0</tt> evaluates to <tt>NaN</tt>.</p>
	 * @param other Any numeric value.
	 * @return The quotient of the current primitive instance and the operand.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p / other</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Number div(Object other) {
		return new Number(Js.div(var(), other));
	}

	/**
	 * <p>Computes the current primitive instance modulo the operand, resembling the modulo 
	 * operator in JavaScript.</p>
	 * <p>The operation returns the remainder when the current primitive instance is divided 
	 * by the operand a certain number of times. If used with non-numeric values, the 
	 * operation attempts to convert them to numbers. The sign of the result is the same 
	 * as the sign of the current primitive instance.</p>
	 * <p>This operation is typically used with integer values, it also works for 
	 * floating-point values.</p>
	 * @param other Any numeric value.
	 * @return The remainder.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p % other</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Number mod(Object other) {
		return new Number(Js.mod(var(), other));
	}

	/**
	 * <p>Subtracts the operand from the current primitive instance, resembling the 
	 * subtraction operator in JavaScript.</p>
	 * <p>If used with non-numeric values, this operation attempts to convert them to 
	 * numbers.</p>
	 * @param other Any numeric value.
	 * @return The difference between the current primitive instance and the operand.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p - other</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Number sub(Object other) {
		return new Number(Js.sub(var(), other));
	}

	/**
	 * <p>Adds the current primitive instance to a numeric operand or concatenates it with 
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
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public Object add(Object other) {
		return Js.add(var(), other);
	}

	/**
	 * <p>Adds the current primitive instance to a numeric operand or concatenates it with 
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
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final String add(java.lang.String other) {
		return new String(Js.add(var(), other));
	}

	/**
	 * <p>Adds the current primitive instance to a numeric operand or concatenates it with 
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
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final String add(Var<java.lang.String> other) {
		return new String(Js.add(var(), other));
	}

	/**
	 * <p>Shift-left operation, resembling that of JavaScript, moves all bits in the 
	 * current primitive instance to the left by the number of places specified in the 
	 * second operand, which should be an integer between 0 and 31.</p>
	 * <p>A zero is used for the new first bit, and the value of the 32nd bit is lost. 
	 * Shifting a value left by one position is equivalent to multiplying by 2, shifting 
	 * two positions is equivalent to multiplying by 4, etc.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with values that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the values to 
	 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
	 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
	 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
	 * yields a number in the appropriate range.</p>
	 * @param n The number of bits to shift.
	 * @return The shifted integer number.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p << n</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Integer shl(int n) {
		return new Integer(Js.shl(var(), n));
	}

	/**
	 * <p>Shift-right operation, resembling that of JavaScript, moves all bits in the 
	 * current primitive instance to the right by the number of places specified in the 
	 * second operand (an integer between 0 and 31). Bits that are shifted off the right 
	 * are lost. The bits filled in on the left depend on the sign bit of the original 
	 * value, in order to preserve the sign of the result. If the current primitive 
	 * instance is positive, the result has zeros placed in the high bits; if the current 
	 * primitive instance is negative, the result has ones placed in the high bits.</p>
	 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
	 * remainder), shifting right two places is equivalent to integer division by 4, and 
	 * so on.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with values that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the values to 
	 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
	 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
	 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
	 * yields a number in the appropriate range.</p>
	 * @param n The number of bits to shift.
	 * @return The shifted integer number.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p >> n</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Integer shr(int n) {
		return new Integer(Js.shr(var(), n));
	}

	/**
	 * <p>Shift-right-unsigned operation, resembling that of JavaScript, moves all bits in 
	 * the current primitive instance to the right by the number of places specified in the 
	 * second operand (an integer between 0 and 31). Bits that are shifted off the right 
	 * are lost. The result has zeros placed in the high bits.</p>
	 * <p>This operation is just like {@link #shr(int)}, except that the bits shifted 
	 * in on the left are always zero, regardless of the sign of the current primitive instance.</p>
	 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
	 * remainder), shifting right two places is equivalent to integer division by 4, and 
	 * so on.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with values that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the values to 
	 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
	 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
	 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
	 * yields a number in the appropriate range.</p>
	 * @param n The number of bits to shift.
	 * @return The shifted integer number.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p >>> n</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Integer shru(int n) {
		return new Integer(Js.shru(var(), n));
	}

	/**
	 * <p>Less-than operation, resembling that of JavaScript, evaluates to <tt>true</tt> if 
	 * the current primitive instance is less than the second operand; otherwise it 
	 * evaluates to <tt>false</tt>.</p>
	 * <p>The operands of this operation may be of any type. Comparison can be performed 
	 * only on numbers and strings, however, so operands that are not numbers or strings 
	 * are converted. Comparison and conversion occur as follows:</p>
	 * <ul>
	 * <li>If both operands are numbers, or if both convert to numbers, they are compared 
	 * numerically.</li>
	 * <li>If both operands are strings or convert to strings, they are compared as 
	 * strings.</li>
	 * <li>If one operand is or converts to a string, and one is or converts to a number, 
	 * the operation attempts to convert the string to a number and performs a numerical 
	 * comparison. If the string does not represent a number, it converts to <tt>NaN</tt>, 
	 * and the comparison is <tt>false</tt>. In JavaScript 1.1, the string-to-number 
	 * conversion causes an error instead of yielding <tt>NaN</tt>.</li>
	 * <li>If an object can be converted to either a number or a string, JavaScript performs 
	 * the numerical conversion. This means, for example, that Date objects are compared 
	 * numerically, and it is meaningful to compare two dates to see whether one is earlier 
	 * than the other.</li>
	 * <li>If the operands of the comparison operations cannot both be successfully converted 
	 * to numbers or to strings, these operations always return <tt>false</tt>.</li>
	 * <li>If either operand is or converts to <tt>NaN</tt>, the comparison operation always 
	 * yields <tt>false</tt>.</li>
	 * </ul>
	 * <p>Keep in mind that string comparison is done on a strict character-by-character 
	 * basis using the numerical value of each character from the Unicode encoding. Although 
	 * in some cases the Unicode standard allows equivalent strings to be encoded using 
	 * different sequences of characters, the JavaScript comparison operations do not 
	 * detect these encoding differences; they assume that all strings are expressed in 
	 * normalized form. Note in particular that string comparison is case-sensitive, and 
	 * in the Unicode encoding (at least for the ASCII subset), all capital letters are 
	 * "less than" all lowercase letters. This rule can cause confusing results if you do 
	 * not expect it.</p>
	 * <p>For a more robust string-comparison algorithm, see the {@link StringLike#localeCompare(Object)} 
	 * method, which also takes locale-specific definitions of alphabetical order into account. 
	 * For case-insensitive comparisons, you must first convert the strings to all lowercase or 
	 * all uppercase using {@link StringLike#toLowerCase()} or {@link StringLike#toUpperCase()}.</p>
	 * <p>The less-than-or-equal and greater-than-or-equal operations do not rely on the 
	 * equality or identity operations for determining whether two values are "equal." 
	 * Instead, the less-than-or-equal operator is simply defined as "not greater than", 
	 * and the greater-than-or-equal operator is defined as "not less than". The one 
	 * exception occurs when either operand is (or converts to) <tt>NaN</tt>, in which case 
	 * all comparison operations return <tt>false</tt>.</p>
	 * @param other A value or object.
	 * @return <tt>true</tt> if the current primitive instance is less than the second 
	 * operand; otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p < other</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Boolean lt(Object other) {
		return new Boolean(Js.lt(var(), other));
	}

	/**
	 * <p>Greater-than operation, resembling that of JavaScript, evaluates to <tt>true</tt> if 
	 * the current primitive instance is greater than the second operand; otherwise it 
	 * evaluates to <tt>false</tt>.</p>
	 * <p>The operands of this operation may be of any type. Comparison can be performed 
	 * only on numbers and strings, however, so operands that are not numbers or strings 
	 * are converted. Comparison and conversion occur as follows:</p>
	 * <ul>
	 * <li>If both operands are numbers, or if both convert to numbers, they are compared 
	 * numerically.</li>
	 * <li>If both operands are strings or convert to strings, they are compared as 
	 * strings.</li>
	 * <li>If one operand is or converts to a string, and one is or converts to a number, 
	 * the operation attempts to convert the string to a number and performs a numerical 
	 * comparison. If the string does not represent a number, it converts to <tt>NaN</tt>, 
	 * and the comparison is <tt>false</tt>. In JavaScript 1.1, the string-to-number 
	 * conversion causes an error instead of yielding <tt>NaN</tt>.</li>
	 * <li>If an object can be converted to either a number or a string, JavaScript performs 
	 * the numerical conversion. This means, for example, that Date objects are compared 
	 * numerically, and it is meaningful to compare two dates to see whether one is earlier 
	 * than the other.</li>
	 * <li>If the operands of the comparison operations cannot both be successfully converted 
	 * to numbers or to strings, these operations always return <tt>false</tt>.</li>
	 * <li>If either operand is or converts to <tt>NaN</tt>, the comparison operation always 
	 * yields <tt>false</tt>.</li>
	 * </ul>
	 * <p>Keep in mind that string comparison is done on a strict character-by-character 
	 * basis using the numerical value of each character from the Unicode encoding. Although 
	 * in some cases the Unicode standard allows equivalent strings to be encoded using 
	 * different sequences of characters, the JavaScript comparison operations do not 
	 * detect these encoding differences; they assume that all strings are expressed in 
	 * normalized form. Note in particular that string comparison is case-sensitive, and 
	 * in the Unicode encoding (at least for the ASCII subset), all capital letters are 
	 * "less than" all lowercase letters. This rule can cause confusing results if you do 
	 * not expect it.</p>
	 * <p>For a more robust string-comparison algorithm, see the {@link StringLike#localeCompare(Object)} 
	 * method, which also takes locale-specific definitions of alphabetical order into account. 
	 * For case-insensitive comparisons, you must first convert the strings to all lowercase or 
	 * all uppercase using {@link StringLike#toLowerCase()} or {@link StringLike#toUpperCase()}.</p>
	 * <p>The less-than-or-equal and greater-than-or-equal operations do not rely on the 
	 * equality or identity operations for determining whether two values are "equal." 
	 * Instead, the less-than-or-equal operator is simply defined as "not greater than", 
	 * and the greater-than-or-equal operator is defined as "not less than". The one 
	 * exception occurs when either operand is (or converts to) <tt>NaN</tt>, in which case 
	 * all comparison operations return <tt>false</tt>.</p>
	 * @param other A value or object.
	 * @return <tt>true</tt> if the current primitive instance is greater than the second 
	 * operand; otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p > other</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Boolean gt(Object other) {
		return new Boolean(Js.gt(var(), other));
	}

	/**
	 * <p>Less-than-or-equal operation, resembling that of JavaScript, evaluates to 
	 * <tt>true</tt> if the current primitive instance is less than or equal to the second 
	 * operand; otherwise it evaluates to <tt>false</tt>.</p>
	 * <p>The operands of this operation may be of any type. Comparison can be performed 
	 * only on numbers and strings, however, so operands that are not numbers or strings 
	 * are converted. Comparison and conversion occur as follows:</p>
	 * <ul>
	 * <li>If both operands are numbers, or if both convert to numbers, they are compared 
	 * numerically.</li>
	 * <li>If both operands are strings or convert to strings, they are compared as 
	 * strings.</li>
	 * <li>If one operand is or converts to a string, and one is or converts to a number, 
	 * the operation attempts to convert the string to a number and performs a numerical 
	 * comparison. If the string does not represent a number, it converts to <tt>NaN</tt>, 
	 * and the comparison is <tt>false</tt>. In JavaScript 1.1, the string-to-number 
	 * conversion causes an error instead of yielding <tt>NaN</tt>.</li>
	 * <li>If an object can be converted to either a number or a string, JavaScript performs 
	 * the numerical conversion. This means, for example, that Date objects are compared 
	 * numerically, and it is meaningful to compare two dates to see whether one is earlier 
	 * than the other.</li>
	 * <li>If the operands of the comparison operations cannot both be successfully converted 
	 * to numbers or to strings, these operations always return <tt>false</tt>.</li>
	 * <li>If either operand is or converts to <tt>NaN</tt>, the comparison operation always 
	 * yields <tt>false</tt>.</li>
	 * </ul>
	 * <p>Keep in mind that string comparison is done on a strict character-by-character 
	 * basis using the numerical value of each character from the Unicode encoding. Although 
	 * in some cases the Unicode standard allows equivalent strings to be encoded using 
	 * different sequences of characters, the JavaScript comparison operations do not 
	 * detect these encoding differences; they assume that all strings are expressed in 
	 * normalized form. Note in particular that string comparison is case-sensitive, and 
	 * in the Unicode encoding (at least for the ASCII subset), all capital letters are 
	 * "less than" all lowercase letters. This rule can cause confusing results if you do 
	 * not expect it.</p>
	 * <p>For a more robust string-comparison algorithm, see the {@link StringLike#localeCompare(Object)} 
	 * method, which also takes locale-specific definitions of alphabetical order into account. 
	 * For case-insensitive comparisons, you must first convert the strings to all lowercase or 
	 * all uppercase using {@link StringLike#toLowerCase()} or {@link StringLike#toUpperCase()}.</p>
	 * <p>The less-than-or-equal and greater-than-or-equal operations do not rely on the 
	 * equality or identity operations for determining whether two values are "equal." 
	 * Instead, the less-than-or-equal operator is simply defined as "not greater than", 
	 * and the greater-than-or-equal operator is defined as "not less than". The one 
	 * exception occurs when either operand is (or converts to) <tt>NaN</tt>, in which case 
	 * all comparison operations return <tt>false</tt>.</p>
	 * @param other A value or object.
	 * @return <tt>true</tt> if the current primitive instance is less than or equal to 
	 * the second operand; otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p <= other</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Boolean lte(Object other) {
		return new Boolean(Js.lte(var(), other));
	}

	/**
	 * <p>Greater-than-or-equal operation, resembling that of JavaScript, evaluates to 
	 * <tt>true</tt> if the current primitive instance is greater than or equal to the 
	 * second operand; otherwise it evaluates to <tt>false</tt>.</p>
	 * <p>The operands of this operation may be of any type. Comparison can be performed 
	 * only on numbers and strings, however, so operands that are not numbers or strings 
	 * are converted. Comparison and conversion occur as follows:</p>
	 * <ul>
	 * <li>If both operands are numbers, or if both convert to numbers, they are compared 
	 * numerically.</li>
	 * <li>If both operands are strings or convert to strings, they are compared as 
	 * strings.</li>
	 * <li>If one operand is or converts to a string, and one is or converts to a number, 
	 * the operation attempts to convert the string to a number and performs a numerical 
	 * comparison. If the string does not represent a number, it converts to <tt>NaN</tt>, 
	 * and the comparison is <tt>false</tt>. In JavaScript 1.1, the string-to-number 
	 * conversion causes an error instead of yielding <tt>NaN</tt>.</li>
	 * <li>If an object can be converted to either a number or a string, JavaScript performs 
	 * the numerical conversion. This means, for example, that Date objects are compared 
	 * numerically, and it is meaningful to compare two dates to see whether one is earlier 
	 * than the other.</li>
	 * <li>If the operands of the comparison operations cannot both be successfully converted 
	 * to numbers or to strings, these operations always return <tt>false</tt>.</li>
	 * <li>If either operand is or converts to <tt>NaN</tt>, the comparison operation always 
	 * yields <tt>false</tt>.</li>
	 * </ul>
	 * <p>Keep in mind that string comparison is done on a strict character-by-character 
	 * basis using the numerical value of each character from the Unicode encoding. Although 
	 * in some cases the Unicode standard allows equivalent strings to be encoded using 
	 * different sequences of characters, the JavaScript comparison operations do not 
	 * detect these encoding differences; they assume that all strings are expressed in 
	 * normalized form. Note in particular that string comparison is case-sensitive, and 
	 * in the Unicode encoding (at least for the ASCII subset), all capital letters are 
	 * "less than" all lowercase letters. This rule can cause confusing results if you do 
	 * not expect it.</p>
	 * <p>For a more robust string-comparison algorithm, see the {@link StringLike#localeCompare(Object)} 
	 * method, which also takes locale-specific definitions of alphabetical order into account. 
	 * For case-insensitive comparisons, you must first convert the strings to all lowercase or 
	 * all uppercase using {@link StringLike#toLowerCase()} or {@link StringLike#toUpperCase()}.</p>
	 * <p>The less-than-or-equal and greater-than-or-equal operations do not rely on the 
	 * equality or identity operations for determining whether two values are "equal." 
	 * Instead, the less-than-or-equal operator is simply defined as "not greater than", 
	 * and the greater-than-or-equal operator is defined as "not less than". The one 
	 * exception occurs when either operand is (or converts to) <tt>NaN</tt>, in which case 
	 * all comparison operations return <tt>false</tt>.</p>
	 * @param other A value or object.
	 * @return <tt>true</tt> if the current primitive instance is greater than or equal to 
	 * the second operand; otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p >= other</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Boolean gte(Object other) {
		return new Boolean(Js.gte(var(), other));
	}

	/**
	 * <p>Checks if the current primitive instance is the name of a property of the second 
	 * operand, resembling the <tt>in</tt> operator in JavaScript.</p>
	 * <p>This operation converts the current primitive instance to a string and expects 
	 * the second operand be an object (or array).</p>
	 * @param other Any object or array.
	 * @return <tt>true</tt> if the current primitive instance is the name of a property of 
	 * the second operand; <tt>false</tt>, otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p in other</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Boolean in(Object other) {
		return new Boolean(Js.in(var(), other));
	}

	/**
	 * <p>Checks if the current primitive instance is an instance of the second operand, 
	 * resembling the <tt>instanceof</tt> operator in JavaScript.</p>
	 * <p>This operation expects the first operand be an object and the second be a class 
	 * of objects. In JavaScript, classes of objects are defined by the constructor function 
	 * that initializes them.</p>
	 * @param other A constructor function.
	 * @return <tt>true</tt> if the current primitive instance is an instance of the second 
	 * operand; <tt>false</tt>, otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p instanceof other</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Boolean instanceOf(Object other) {
		return new Boolean(Js.instanceOf(var(), other));
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
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Boolean eq(Object other) {
		return new Boolean(Js.eq(var(), other));
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
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Boolean eqs(Object other) {
		return new Boolean(Js.eqs(var(), other));
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
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Boolean neq(Object other) {
		return new Boolean(Js.neq(var(), other));
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
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Boolean neqs(Object other) {
		return new Boolean(Js.neqs(var(), other));
	}

	/**
	 * <p>Bitwise-AND operation, resembling that of JavaScript, performs a boolean AND 
	 * operation on each bit of the integer arguments. A bit is set in the result only if 
	 * the corresponding bit is set in both operands.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with operands that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
	 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
	 * the 32nd.</p>
	 * @param other A numeric value.
	 * @return The bitwise-AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p & other</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Integer band(Object other) {
		return new Integer(Js.band(var(), other));
	}

	/**
	 * <p>Bitwise-OR operation, resembling that of JavaScript, performs a boolean OR operation 
	 * on each bit of the integer arguments. A bit is set in the result if the corresponding 
	 * bit is set in one or both of the operands.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with operands that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
	 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
	 * the 32nd.</p>
	 * @param other A numeric value.
	 * @return The bitwise-OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p | other</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Integer bor(Object other) {
		return new Integer(Js.bor(this, other));
	}

	/**
	 * <p>Bitwise-XOR operation, resembling that of JavaScript, performs a boolean exclusive 
	 * OR operation on each bit of the integer arguments. Exclusive OR means that either 
	 * operand one is <tt>true</tt> or operand two is <tt>true</tt>, but not both. A bit is 
	 * set in this operation's result if a corresponding bit is set in one (but not both) 
	 * of the two operands.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with operands that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
	 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
	 * the 32nd.</p>
	 * @param other A numeric value.
	 * @return The bitwise-exclusive-OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p ^ other</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Integer xor(Object other) {
		return new Integer(Js.xor(this, other));
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
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public Value<T> and(T other) {
		return !Js.be(var()) ? this : new Value<T>(other);
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
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public Value<T> and(Var<? extends T> other) {
		return !Js.be(var()) ? this : new Value<T>(other);
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
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public Value<T> or(T other) {
		return Js.be(var()) ? this : new Value<T>(other);
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
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public Value<T> or(Var<? extends T> other) {
		return Js.be(var()) ? this : new Value<T>(other);
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
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public Value<T> cond(Object test, T other) {
		return Js.be(test) ? this : new Value<T>(other);
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
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public Value<T> cond(Object test, Var<? extends T> other) {
		return Js.be(test) ? this : new Value<T>(other);
	}

	/**
	 * <p>Performs unary negation on a 64-bit integer.</p>
	 * <p>This operation converts a positive value to an equivalently negative value, and 
	 * vice versa. If the operand is not a 64-bit integer, it attempts to convert it to one.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision. </p>
	 * @return The negation of the 64-bit integer.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a negation operation on a long number, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>-((Number)p).longValue()</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Long lneg() {
		return new Long(Js.lneg(var()));
	}

	/**
	 * <p>The 64-bit bitwise-NOT operation, casting the operand to a <tt>long</tt> number 
	 * if it is not 64-bit, operates by reversing all bits in the 64-bit integer.</p>
	 * <p>Because of the way signed integers are represented in JavaScript, applying this 
	 * operation to a value is equivalent to changing its sign and subtracting 1.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @return The bitwise-NOT of the 64-bit integer.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a bitwise-NOT operation on a long number, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>~((Number)p).longValue()</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Long lnot() {
		return new Long(Js.lnot(var()));
	}

	/**
	 * <p>Adds two 64-bit integers, casting the operands to <tt>long</tt> numbers if any 
	 * one of them is not a 64-bit integer.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return The sum of the two 64-bit integers.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of an addition operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() + ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Long ladd(Object other) {
		return new Long(Js.ladd(var(), other));
	}

	/**
	 * <p>Subtracts the second 64-bit integer from the first 64-bit integer, casting the 
	 * operands to <tt>long</tt> numbers if any one of them is not a 64-bit integer.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return The difference between the two 64-bit integers.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a subtraction operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() - ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Long lsub(Object other) {
		return new Long(Js.lsub(var(), other));
	}

	/**
	 * <p>Multiplies the two 64-bit integer, casting the operands to <tt>long</tt> numbers 
	 * if any one of them is not a 64-bit integer.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return The product of the two 64-bit integers.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a multiplication operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() * ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Long lmul(Object other) {
		return new Long(Js.lmul(var(), other));
	}

	/**
	 * <p>Divides the first 64-bit integer by the second 64-bit integer, casting the operands 
	 * to <tt>long</tt> numbers if any one of them is not a 64-bit integer.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return The quotient of the two 64-bit integers.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of an division operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() / ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Long ldiv(Object other) {
		return new Long(Js.ldiv(var(), other));
	}

	/**
	 * <p>Computes the first operand modulo the second operand, casting the operands to 
	 * <tt>long</tt> numbers if any one of them is not a 64-bit integer.</p>
	 * <p>The operation returns the remainder when the first operand is divided by the 
	 * second operand a certain number of times. The sign of the result is the same as the 
	 * sign of the first operand.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return The remainder.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a modulo operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() % ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Long lmod(Object other) {
		return new Long(Js.lmod(var(), other));
	}

	/**
	 * <p>The 64-bit shift-left operation, casting the first operand to a <tt>long</tt> 
	 * number if it is not 64-bit, moves all bits in it to the left by the number of places 
	 * specified in the second operand, which should be an integer between 0 and 63.</p>
	 * <p>A zero is used for the new first bit, and the value of the 64th bit is lost. 
	 * Shifting a value left by one position is equivalent to multiplying by 2, shifting 
	 * two positions is equivalent to multiplying by 4, etc.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param n The number of bits to shift.
	 * @return The shifted 64-bit integer.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a shift-left operation on a long number, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() << n</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Long lshl(int n) {
		return new Long(Js.lshl(var(), n));
	}

	/**
	 * <p>The 64-bit shift-right operation, casting the first operand to a <tt>long</tt> 
	 * number if it is not 64-bit, moves all bits in it to the right by the number of 
	 * places specified in the second operand (an integer between 0 and 63). Bits that are 
	 * shifted off the right are lost. The bits filled in on the left depend on the sign 
	 * bit of the original operand, in order to preserve the sign of the result. If the 
	 * first operand is positive, the result has zeros placed in the high bits; if the 
	 * first operand is negative, the result has ones placed in the high bits.</p>
	 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
	 * remainder), shifting right two places is equivalent to integer division by 4, and 
	 * so on.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param n The number of bits to shift.
	 * @return The shifted 64-bit integer.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a shift-right operation on a long number, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() >> n</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Long lshr(int n) {
		return new Long(Js.lshr(var(), n));
	}

	/**
	 * <p>The 64-bit shift-right-unsigned operation, casting the first operand to a 
	 * <tt>long</tt> number if it is not 64-bit, moves all bits in it to the right by the 
	 * number of places specified in the second operand (an integer between 0 and 63). Bits 
	 * that are shifted off the right are lost. The result has zeros placed in the high 
	 * bits.</p>
	 * <p>This operation is just like {@link #lshr(int)}, except that the bits shifted 
	 * in on the left are always zero, regardless of the sign of the first operand.</p>
	 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
	 * remainder), shifting right two places is equivalent to integer division by 4, and 
	 * so on.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param n The number of bits to shift.
	 * @return The shifted 64-bit integer.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of an unsigned shift-right operation on a long number, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() >>> n</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Long lshru(int n) {
		return new Long(Js.lshru(var(), n));
	}

	/**
	 * <p>The 64-bit bitwise-AND operation, casting the operands to <tt>long</tt> numbers 
	 * if any one of them is not a 64-bit integer, performs a boolean AND operation on each 
	 * bit of the 64-bit integers. A bit is set in the result only if the corresponding 
	 * bit is set in both operands.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return The bitwise-AND of the two 64-bit integers.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a bitwise AND operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() & ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Long land(Object other) {
		return new Long(Js.land(var(), other));
	}

	/**
	 * <p>The 64-bit bitwise-OR operation, casting the operands to <tt>long</tt> numbers if 
	 * any one of them is not a 64-bit integer, performs a boolean OR operation on each bit 
	 * of the 64-bit integers. A bit is set in the result if the corresponding bit is set 
	 * in one or both of the operands.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return The bitwise-OR of the two 64-bit integers.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a bitwise OR operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() | ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Long lor(Object other) {
		return new Long(Js.lor(var(), other));
	}

	/**
	 * <p>The 64-bit bitwise-XOR operation, casting the operands to <tt>long</tt> numbers 
	 * if any one of them is not a 64-bit integer, performs a boolean exclusive OR operation 
	 * on each bit of the 64-bit integers. Exclusive OR means that either operand one is 
	 * <tt>true</tt> or operand two is <tt>true</tt>, but not both. A bit is set in this 
	 * operation's result if a corresponding bit is set in one (but not both) of the two 
	 * operands.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return The bitwise-exclusive-OR of the two 64-bit integers.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a bitwise exclusive OR operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() ^ ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Long lxor(Object other) {
		return new Long(Js.lxor(var(), other));
	}

	/**
	 * <p>The 64-bit less-than operation, casting the operands to <tt>long</tt> numbers if 
	 * any one of them is not a 64-bit integer, evaluates to <tt>true</tt> if the first 
	 * operand is less than the second operand; otherwise it evaluates to <tt>false</tt>.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return <tt>true</tt> if the first operand is less than the second operand; 
	 * otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a less-than operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() < ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Boolean llt(Object other) {
		return new Boolean(Js.llt(var(), other));
	}

	/**
	 * <p>The 64-bit greater-than operation, casting the operands to <tt>long</tt> numbers 
	 * if any one of them is not a 64-bit integer, evaluates to <tt>true</tt> if the first 
	 * operand is greater than the second operand; otherwise it evaluates to <tt>false</tt>.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return <tt>true</tt> if the first operand is greater than the second operand; 
	 * otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a greater-than operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() > ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Boolean lgt(Object other) {
		return new Boolean(Js.lgt(var(), other));
	}

	/**
	 * <p>The 64-bit less-than-or-equal operation, casting the operands to <tt>long</tt> 
	 * numbers if any one of them is not a 64-bit integer, evaluates to <tt>true</tt> if 
	 * the first operand is less than or equal to the second operand; otherwise it evaluates 
	 * to <tt>false</tt>.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return <tt>true</tt> if the first operand is less than or equal to the second operand; 
	 * otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a less-than-or-equal operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() <= ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Boolean llte(Object other) {
		return new Boolean(Js.llte(var(), other));
	}

	/**
	 * <p>The 64-bit greater-than-or-equal operation, casting the operands to <tt>long</tt> 
	 * numbers if any one of them is not a 64-bit integer, evaluates to <tt>true</tt> if the 
	 * first operand is greater than or equal to the second operand; otherwise it evaluates 
	 * to <tt>false</tt>.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return <tt>true</tt> if the first operand is greater than or equal to the second operand; 
	 * otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a greater-than-or-equal operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() >= ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Boolean lgte(Object other) {
		return new Boolean(Js.lgte(var(), other));
	}

	/**
	 * <p>Checks whether the two 64-bit integers are "equal", casting the operands to 
	 * <tt>long</tt> numbers if any one of them is not a 64-bit integer.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return <tt>true</tt> if the first operand equals the second; <tt>false</tt>, 
	 * otherwise;
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of an equality operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() == ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Boolean leq(Object other) {
		return new Boolean(Js.leq(var(), other));
	}

	/**
	 * <p>Checks whether the two 64-bit integers are not "equal", casting the operands to 
	 * <tt>long</tt> numbers if any one of them is not a 64-bit integer.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return <tt>false</tt> if the first operand equals the second; <tt>true</tt>, 
	 * otherwise;
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of an inequality operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() != ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
	 */
	public final Boolean lneq(Object other) {
		return new Boolean(Js.lneq(var(), other));
	}

	/**
	 * <p>An <b>opaque</b> class resembling JavaScript primitive boolean values.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 */

	public static final class Boolean extends Value<java.lang.Boolean>
	{
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
		public static final class Member extends Value.Member<java.lang.Boolean>
		{
			/**
			 * <p>Internally constructs a member based on a qualifying member.</p>
			 * <p>This constructor  is <b>internal</b> and only called inside of <b>opaque</b> 
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
			 * <p>Sets a new value to the property, represented by the current member instance, 
			 * of an object.</p>
			 * @param o The base object
			 * @param v The new value to set
			 * @return The new value
			 * @since 1.0
			 * @javascript Re-compilers must convert the instance invocation of this method into 
			 * the JavaScript expression: 
			 * <pre>o.m = v</pre>
			 * where <tt>m</tt> is the identifier name resolved from the current member 
			 * instance of the invocation.
			 */
			public java.lang.Boolean with(ObjectLike o, Var<java.lang.Boolean> v) {
				return with(o, v.var());
			}
			/**
			 * <p>Sets a new value to the property, represented by the current member instance, 
			 * of an object.</p>
			 * @param o The base object
			 * @param v The new value to set
			 * @return The new value
			 * @since 1.0
			 * @javascript Re-compilers must convert the instance invocation of this method into 
			 * the JavaScript expression: 
			 * <pre>o.m = v</pre>
			 * where <tt>m</tt> is the identifier name resolved from the current member 
			 * instance of the invocation.
			 */
			public java.lang.Boolean with(ObjectLike o, JsBoolean v) {
				return with(o, v.valueOf());
			}
		}

		/**
		 * <p>Constructs a primitive boolean instance from a primitive boolean value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Boolean(java.lang.Boolean value) {
			super(value);
		}
		/**
		 * <p>Constructs a primitive boolean instance from a primitive boolean value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Boolean(Var<java.lang.Boolean> value) {
			super(value == null ? null : value.var());
		}

		/**
		 * <p>Returns the primitive value associated with the current instance, if there is one.</p>
		 * @return The primitive value associated with the current instance.
		 * @see #toString()
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current instance without changing the method 
		 * name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		@Override
		public final java.lang.Boolean valueOf() {
			return var();
		}

		/**
		 * <p>Adds the current primitive instance to a numeric operand or concatenates it with 
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final String add(Object other) {
			return new String(Js.add(toString(), other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Boolean and(java.lang.Boolean other) {
			return new Boolean(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Boolean and(Value<java.lang.Boolean> other) {
			return new Boolean(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Boolean and(Boolean other) {
			return new Boolean(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final JsBoolean and(JsBoolean other) {
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Boolean or(java.lang.Boolean other) {
			return new Boolean(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Boolean or(Value<java.lang.Boolean> other) {
			return new Boolean(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Boolean or(Boolean other) {
			return new Boolean(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Boolean or(JsBoolean other) {
			return new Boolean(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Boolean cond(Object test, java.lang.Boolean other) {
			return new Boolean(Js.cond(test, this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Boolean cond(Object test, Value<java.lang.Boolean> other) {
			return new Boolean(Js.cond(test, this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Boolean cond(Object test, Boolean other) {
			return new Boolean(Js.cond(test, this, other));
		}
	}

	/**
	 * <p>An <b>opaque</b> class resembling JavaScript primitive string values.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 */

	public static final class String extends Value<java.lang.String> implements StringLike
	{
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
		public static final class Member extends Value.Member<java.lang.String>
		{
			/**
			 * <p>Internally constructs a member based on a qualifying member.</p>
			 * <p>This constructor  is <b>internal</b> and only called inside of <b>opaque</b> 
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
			 * <p>Sets a new value to the property, represented by the current member instance, 
			 * of an object.</p>
			 * @param o The base object
			 * @param v The new value to set
			 * @return The new value
			 * @since 1.0
			 * @javascript Re-compilers must convert the instance invocation of this method into 
			 * the JavaScript expression: 
			 * <pre>o.m = v</pre>
			 * where <tt>m</tt> is the identifier name resolved from the current member 
			 * instance of the invocation.
			 */
			public java.lang.String with(ObjectLike o, Var<java.lang.String> v) {
				return with(o, v.var());
			}
			/**
			 * <p>Sets a new value to the property, represented by the current member instance, 
			 * of an object.</p>
			 * @param o The base object
			 * @param v The new value to set
			 * @return The new value
			 * @since 1.0
			 * @javascript Re-compilers must convert the instance invocation of this method into 
			 * the JavaScript expression: 
			 * <pre>o.m = v</pre>
			 * where <tt>m</tt> is the identifier name resolved from the current member 
			 * instance of the invocation.
			 */
			public java.lang.String with(ObjectLike o, JsString v) {
				return with(o, v.valueOf());
			}
		}

		/**
		 * <p>Constructs a primitive string instance from a primitive string value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public String(java.lang.String value) {
			super(value);
		}
		/**
		 * <p>Constructs a primitive string instance from a primitive string value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public String(Var<java.lang.String> value) {
			super(value == null ? null : value.var());
		}
		/**
		 * <p>Constructs a primitive string instance from a primitive string value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public String(Object value) {
			super(Js.toString(value));
		}

		/**
		 * <p>Returns the primitive value associated with the current instance, if there is one.</p>
		 * @return The primitive value associated with the current instance.
		 * @see #toString()
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current instance without changing the method 
		 * name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		@Override
		public final java.lang.String valueOf() {
			return var();
		}

		/**
		 * <p>Adds the current primitive instance to a numeric operand or concatenates it with 
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final String add(Object other) {
			return new String(Js.add(var(), other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final String and(java.lang.String other) {
			return new String(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final String and(Value<java.lang.String> other) {
			return new String(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final String and(String other) {
			return new String(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final String or(java.lang.String other) {
			return new String(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final String or(Value<java.lang.String> other) {
			return new String(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final String or(String other) {
			return new String(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final String or(JsString other) {
			return new String(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final String cond(Object test, java.lang.String other) {
			return Js.be(test) ? this : new String(other);
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final String cond(Object test, Value<java.lang.String> other) {
			return Js.be(test) ? this : new String(other);
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final String cond(Object test, String other) {
			return Js.be(test) ? this : other;
		}

		/**
		 * <p>Concatenates a string operand to the current primitive instance and returns 
		 * the string operand, resembling the assignment-with-addition operator in 
		 * JavaScript.</p>
		 * <p>If one value is a string, the other is converted to a string, and the two 
		 * strings are then concatenated. Object operands are converted to numbers or strings 
		 * that can be added or concatenated. The conversion is performed by {@link Js#valueOf(Object)}  
		 * method and/or the {@link Js#toString(Object)} method on the object.</p>
		 * @param other A value or object.
		 * @return The string value of the argument.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>p += other</pre>
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final java.lang.String aadd(Object other) {
			return var((java.lang.String)Js.add(var(), other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Object eval() {
			return Js.core().eval(var());
		}

		/**
		 * <p>Gets the length of the current string, an integer that indicates the number of 
		 * characters in the current string. For any string <tt>s</tt>, the index of the 
		 * last character is <tt>s.length() - 1</tt>. The length property of a string may 
		 * not be deleted.</p>
		 * @return The length of the current string.
		 * @see jsx.core.StringLikes#length(StringLike)
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into the 
		 * JavaScript expression: 
		 * <pre>s.length</pre>
		 * where <tt>s</tt> is the current string instance of the invocation.
		 */
		public final int length() {
			return var().length();
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String charAt(Object index) {
			return Js.s().stringLike(var()).charAt(index);
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.Character charCodeAt(Object index) {
			return Js.s().stringLike(var()).charCodeAt(index);
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String concat(Object other) {
			return Js.s().stringLike(var()).concat(other);
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String concat(Vars<?> args) {
			return Js.s().stringLike(var()).concat(args);
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.Integer indexOf(Object other) {
			return Js.s().stringLike(var()).indexOf(other);
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.Integer indexOf(Object other, Object pos) {
			return Js.s().stringLike(var()).indexOf(other, pos);
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.Integer lastIndexOf(Object other) {
			return Js.s().stringLike(var()).lastIndexOf(other);
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.Integer lastIndexOf(Object other, Object pos) {
			return Js.s().stringLike(var()).lastIndexOf(other, pos);
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.Integer localeCompare(Object other) {
			return Js.s().stringLike(var()).localeCompare(other);
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final ArrayLike<?> match(RegExpLike regexp) {
			return Js.s().stringLike(var()).match(regexp);
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String replace(RegExpLike regexp, java.lang.String newSubStr) {
			return Js.s().stringLike(var()).replace(regexp, newSubStr);
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String replace(RegExpLike regexp, StringLike newSubStr) {
			return Js.s().stringLike(var()).replace(regexp, newSubStr);
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String replace(RegExpLike regexp, JsFunction<java.lang.String> lambda) {
			return Js.s().stringLike(var()).replace(regexp, lambda);
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.Integer search(RegExpLike regexp) {
			return Js.s().stringLike(var()).search(regexp);
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String slice(Object begin) {
			return Js.s().stringLike(var()).slice(begin);
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String slice(Object begin, Object end) {
			return Js.s().stringLike(var()).slice(begin, end);
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final ArrayLike<?> split(Object separator) {
			return Js.s().stringLike(var()).split(separator);
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final ArrayLike<?> split(Object separator, Object limit) {
			return Js.s().stringLike(var()).split(separator, limit);
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String substr(Object start) {
			return Js.s().stringLike(var()).substr(start);
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String substr(Object start, Object length) {
			return Js.s().stringLike(var()).substr(start, length);
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String substring(Object from) {
			return Js.s().stringLike(var()).substring(from);
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String substring(Object from, Object to) {
			return Js.s().stringLike(var()).substring(from, to);
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String toLowerCase() {
			return Js.s().stringLike(var()).toLowerCase();
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String toUpperCase() {
			return Js.s().stringLike(var()).toUpperCase();
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String toLocaleLowerCase() {
			return Js.s().stringLike(var()).toLocaleLowerCase();
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
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String toLocaleUpperCase() {
			return Js.s().stringLike(var()).toLocaleUpperCase();
		}
	}

	/**
	 * <p>An <b>opaque</b> class resembling JavaScript primitive number values.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 */

	public static abstract class Numerical<T> extends Value<T>
	{
		protected Numerical(T value) {
			super(value);
		}

		/**
		 * <p>Adds the current primitive instance to a numeric operand or concatenates it with 
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Number add(java.lang.Number other) {
			return new Number((java.lang.Number)Js.add(var(), other));
		}

		/**
		 * <p>Adds the current primitive instance to a numeric operand or concatenates it with 
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Number add(Value<? extends java.lang.Number> other) {
			return new Number((java.lang.Number)Js.add(var(), other.var()));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public Numerical<?> and(java.lang.Character other) {
			return !Js.be(var()) ? this : new Character(other);
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public Numerical<?> and(java.lang.Number other) {
			return !Js.be(var()) ? this : new Number(other);
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Numerical<?> and(Numerical<?> other) {
			Object v = other.var();
			return !Js.be(var()) ? this : v instanceof java.lang.Character ?
					new Character((java.lang.Character)v) : new Number((java.lang.Number)v);
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final JsNumber and(JsNumber other) {
			return Js.and(valueOf(), other);
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public Numerical<?> or(java.lang.Character other) {
			return Js.be(var()) ? this : new Character(other);
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public Numerical<?> or(java.lang.Number other) {
			return Js.be(var()) ? this : new Number(other);
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Numerical<?> or(Numerical<?> other) {
			Object v = other.var();
			return Js.be(var()) ? this : v instanceof java.lang.Character ?
					new Character((java.lang.Character)v) : new Number((java.lang.Number)v);
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Number or(JsNumber other) {
			return new Number(Js.or(valueOf(), other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public Numerical<?> cond(Object test, java.lang.Character other) {
			return Js.be(test) ? this : new Character(other);
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public Numerical<?> cond(Object test, java.lang.Number other) {
			return Js.be(test) ? this : new Number(other);
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Numerical<?> cond(Object test, Numerical<?> other) {
			Object v = other.var();
			return Js.be(test) ? this : v instanceof java.lang.Character ?
					new Character((java.lang.Character)v) : new Number((java.lang.Number)v);
		}

		/**
		 * <p>Returns the primitive value associated with the current instance, if there is one.</p>
		 * @return The primitive value associated with the current instance.
		 * @see #toString()
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current instance without changing the method 
		 * name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		@Override
		public java.lang.Number valueOf() {
			return (java.lang.Number)Js.valueOf(var());
		}
		/**
		 * <p>Converts the current number to a string using exponential notation.</p>
		 * @return A string representation of the current number, in exponential notation. The 
		 * fractional part of the number is rounded, or padded with zeros, as necessary, so that 
		 * it has the specified length.
		 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
		 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
		 * {@link js.core.JsTypeError} for JS Simulation.
		 * @see #toExponential(Object)
		 * @see #toFixed()
		 * @see #toFixed(Object)
		 * @see #toLocaleString()
		 * @see #toPrecision()
		 * @see #toPrecision(Object)
		 * @see #toString()
		 * @see #toString(Object)
		 * @see jsx.core.NumberLikes#toExponential(NumberLike)
		 * @see jsx.core.NumberLikes#toExponential(Number)
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String toExponential() {
			return Js.s().numberLike(valueOf()).toExponential();
		}
		/**
		 * <p>Converts the current number to a string using exponential notation with the 
		 * specified number of digits after the decimal place.</p>
		 * @param digits The number of digits that appears after the decimal point. This may be a 
		 * value between 0 and 20, inclusive, and implementations may optionally support a larger 
		 * range of values. If this argument is undefined, as many digits as necessary are used.
		 * @return A string representation of the current number, in exponential notation, 
		 * with one digit before the decimal place and <tt>digits</tt> digits after the 
		 * decimal place. The fractional part of the number is rounded, or padded with zeros, 
		 * as necessary, so that it has the specified length.
		 * @throws RuntimeException JavaScript throws a <tt>RangeError</tt> if 
		 * <tt>digits</tt> is too small or too large. See {@link Js#err(Object)} and 
		 * {@link js.core.JsRangeError} for JS Simulation. Values between 0 and 20, inclusive, 
		 * will not cause a <tt>RangeError</tt>. Implementations are allowed to support 
		 * larger and smaller values as well.
		 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
		 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
		 * {@link js.core.JsTypeError} for JS Simulation.
		 * @see #toExponential()
		 * @see #toFixed()
		 * @see #toFixed(Object)
		 * @see #toLocaleString()
		 * @see #toPrecision()
		 * @see #toPrecision(Object)
		 * @see #toString()
		 * @see #toString(Object)
		 * @see jsx.core.NumberLikes#toExponential(NumberLike, Object)
		 * @see jsx.core.NumberLikes#toExponential(Number, Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String toExponential(Object digits) {
			return Js.s().numberLike(valueOf()).toExponential(digits);
		}
		/**
		 * <p>Converts the current number to a string without digits after the decimal place.</p>
		 * @return A string representation of the current number that does not use exponential 
		 * notation and has no digits after the decimal place. The number is rounded if 
		 * necessary. If the current number is greater than 1e+21, this method simply calls 
		 * {@link #toString()} and returns a string in exponential notation.
		 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
		 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
		 * {@link js.core.JsTypeError} for JS Simulation.
		 * @see jsx.core.NumberLikes#toFixed(NumberLike)
		 * @see jsx.core.NumberLikes#toFixed(NumberLike, Object)
		 * @see jsx.core.NumberLikes#toFixed(Number)
		 * @see jsx.core.NumberLikes#toFixed(Number, Object)
		 * @see #toFixed(Object)
		 * @see #toExponential()
		 * @see #toExponential(Object)
		 * @see #toLocaleString()
		 * @see #toPrecision()
		 * @see #toPrecision(Object)
		 * @see #toString()
		 * @see #toString(Object)
		 * @see jsx.core.NumberLikes#toFixed(NumberLike)
		 * @see jsx.core.NumberLikes#toFixed(Number)
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String toFixed() {
			return Js.s().numberLike(valueOf()).toFixed();
		}
		/**
		 * <p>Converts the current number to a string that contains a specified number of 
		 * digits after the decimal place.</p>
		 * @param digits The number of digits to appear after the decimal point; this may be a 
		 * value between 0 and 20, inclusive, and implementations may optionally support a 
		 * larger range of values. If this argument is undefined, it is treated as 0.
		 * @return A string representation of the current number that does not use exponential 
		 * notation and has exactly <tt>digits</tt> digits after the decimal place. The number 
		 * is rounded if necessary, and the fractional part is padded with zeros if necessary so 
		 * that it has the specified length. If the current number is greater than 1e+21, this 
		 * method simply calls {@link #toString()} and returns a string in exponential 
		 * notation.
		 * @throws RuntimeException JavaScript throws a <tt>RangeError</tt> if 
		 * <tt>digits</tt> is too small or too large. See {@link Js#err(Object)} and 
		 * {@link js.core.JsRangeError} for JS Simulation. Values between 0 and 20, inclusive, 
		 * will not cause a <tt>RangeError</tt>. Implementations are allowed to support 
		 * larger and smaller values as well.
		 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
		 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
		 * {@link js.core.JsTypeError} for JS Simulation.
		 * @see #toFixed()
		 * @see #toExponential()
		 * @see #toExponential(Object)
		 * @see #toLocaleString()
		 * @see #toPrecision()
		 * @see #toPrecision(Object)
		 * @see #toString()
		 * @see #toString(Object)
		 * @see jsx.core.NumberLikes#toFixed(NumberLike, Object)
		 * @see jsx.core.NumberLikes#toFixed(Number, Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String toFixed(Object digits) {
			return Js.s().numberLike(valueOf()).toFixed(digits);
		}
		/**
		 * <p>Converts the current number to a string.</p>
		 * <p>This method simply calls {@link #toString()} to convert the number to a base-10 
		 * value.</p>
		 * @return A string representation of the current number. The number is rounded or 
		 * padded with zeros as necessary.
		 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
		 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
		 * {@link js.core.JsTypeError} for JS Simulation.
		 * @see #toPrecision(Object)
		 * @see #toExponential()
		 * @see #toExponential(Object)
		 * @see #toFixed()
		 * @see #toFixed(Object)
		 * @see #toLocaleString()
		 * @see #toString()
		 * @see #toString(Object)
		 * @see jsx.core.NumberLikes#toPrecision(NumberLike)
		 * @see jsx.core.NumberLikes#toPrecision(Number)
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String toPrecision() {
			return Js.s().numberLike(valueOf()).toPrecision();
		}
		/**
		 * <p>Converts the current number to a string using the specified number of significant 
		 * digits. Uses exponential or fixed-point notation depending on the size of the number 
		 * and the number of significant digits specified.</p>
		 * @param precision The number of significant digits to appear in the returned string. 
		 * This may be a value between 1 and 21, inclusive. Implementations are allowed to 
		 * optionally support larger and smaller values of precision. If this argument is 
		 * undefined, the {@link #toString()} method is used instead to convert the number to 
		 * a base-10 value.
		 * @return A string representation of the current number that contains 
		 * <tt>precision</tt> significant digits. If <tt>precision</tt> is large 
		 * enough to include all the digits of the integer part of the number, the returned 
		 * string uses fixed-point notation. Otherwise, exponential notation is used with one 
		 * digit before the decimal place and <tt>precision - 1</tt> digits after the 
		 * decimal place. The number is rounded or padded with zeros as necessary.
		 * @throws RuntimeException JavaScript throws a <tt>RangeError</tt> if 
		 * <tt>digits</tt> is too small or too large. See {@link Js#err(Object)} and 
		 * {@link js.core.JsRangeError} for JS Simulation. Values between 1 and 20, inclusive, 
		 * will not cause a <tt>RangeError</tt>. Implementations are allowed to support 
		 * larger and smaller values as well.
		 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
		 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
		 * {@link js.core.JsTypeError} for JS Simulation.
		 * @see #toPrecision()
		 * @see #toExponential()
		 * @see #toExponential(Object)
		 * @see #toFixed()
		 * @see #toFixed(Object)
		 * @see #toLocaleString()
		 * @see #toString()
		 * @see #toString(Object)
		 * @see jsx.core.NumberLikes#toPrecision(NumberLike, Object)
		 * @see jsx.core.NumberLikes#toPrecision(Number, Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String toPrecision(Object precision) {
			return Js.s().numberLike(valueOf()).toPrecision(precision);
		}
		/**
		 * <p>Converts the current number to a string using local number-formatting conventions.</p> 
		 * @return An implementation-dependent string representation of the current number, 
		 * formatted according to local conventions, which may affect such things as the 
		 * punctuation characters used for the decimal point and the thousands separator.
		 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
		 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
		 * {@link js.core.JsTypeError} for JS Simulation.
		 * @see #toString()
		 * @see #toString(Object)
		 * @see #toExponential()
		 * @see #toExponential(Object)
		 * @see #toFixed()
		 * @see #toFixed(Object)
		 * @see #toPrecision()
		 * @see #toPrecision(Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String toLocaleString() {
			return Js.s().numberLike(valueOf()).toLocaleString();
		}
		/**
		 * <p>Converts the current number to a string. When the <tt>radix</tt> argument is 
		 * undefined or is specified as 10, the number is converted to a base-10 string.</p> 
		 * <p>Although the ECMAScript specification does not require implementations to honor 
		 * any other values for radix, all implementations in common use accept values between 
		 * 2 and 36.</p>
		 * @param radix An optional argument that specifies the radix, or base, between 2 and 36, 
		 * in which the number should be represented. If undefined, base 10 is used. Note, 
		 * however, that the ECMAScript specification allows an implementation to return any 
		 * value if this argument is specified as any value other than 10.
		 * @return A string representation of the current number, in the specified base.
		 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
		 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
		 * {@link js.core.JsTypeError} for JS Simulation.
		 * @see #toString()
		 * @see #toExponential()
		 * @see #toExponential(Object)
		 * @see #toFixed()
		 * @see #toFixed(Object)
		 * @see #toPrecision()
		 * @see #toPrecision(Object)
		 * @see #toLocaleString()
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current primitive instance without changing the 
		 * method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final java.lang.String toString(Object radix) {
			return Js.s().numberLike(valueOf()).toString(radix);
		}
	}

	/**
	 * <p>An <b>opaque</b> class resembling JavaScript primitive unsigned short number values.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 */

	public static final class Character extends Numerical<java.lang.Character> implements NumberLike<java.lang.Number>
	{
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
		public static final class Member extends Value.Member<java.lang.Character>
		{
			/**
			 * <p>Internally constructs a member based on a qualifying member.</p>
			 * <p>This constructor  is <b>internal</b> and only called inside of <b>opaque</b> 
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
		}

		/**
		 * <p>Returns the primitive value associated with the current instance, if there is one.</p>
		 * @return The primitive value associated with the current instance.
		 * @see #toString()
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current instance without changing the method 
		 * name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		@Override
		public final java.lang.Number valueOf() {
			return Js.valueOf(var());
		}

		/**
		 * <p>Constructs a primitive character instance from a primitive character value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Character(java.lang.Character value) {
			super(value);
		}
		/**
		 * <p>Constructs a primitive character instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Character(Character value) {
			super(value == null ? null : value.var());
		}
		/**
		 * <p>Constructs a primitive character instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Character(java.lang.Byte value) {
			super(value == null ? null : (char)value.byteValue());
		}
		/**
		 * <p>Constructs a primitive character instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Character(Byte value) {
			super(Js.undefined(value) ? null : (char)value.var().byteValue());
		}
		/**
		 * <p>Constructs a primitive character instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Character(java.lang.Short value) {
			super(value == null ? null : (char)value.shortValue());
		}
		/**
		 * <p>Constructs a primitive character instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Character(Short value) {
			super(Js.undefined(value) ? null : (char)value.var().shortValue());
		}
		/**
		 * <p>Constructs a primitive character instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Character(java.lang.Number value) {
			super((char)value.shortValue());
		}
		/**
		 * <p>Constructs a primitive character instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Character(Var<? extends java.lang.Number> value) {
			super((char)value.var().shortValue());
		}

		/**
		 * <p>Performs unary negation, resembling the unary minus operator in JavaScript.</p>
		 * <p>This operation converts a positive value to an equivalently negative value, and 
		 * vice versa. If the operand is not a number, it attempts to convert it to one.</p>
		 * @return The negation of the current primitive instance.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>-p</pre>
		 * where <tt>p</tt> is the current primitive instance of the invocation of this 
		 * method.
		 */
		public final Character neg() {
			return new Character((char)Js.neg(this).shortValue());
		}

		/**
		 * <p>Increases the current primitive instance by 1 and then returns the current 
		 * primitive instance, resembling the pre-increment operator in JavaScript.</p>
		 * @return The current primitive instance increased by 1.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>++p</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Character inc() {
			var((char)Js.add(var(), 1).shortValue());
			return this;
		}

		/**
		 * <p>Decreases the current primitive instance by 1 and then returns the current 
		 * primitive instance, resembling the pre-decrement operator in JavaScript.</p>
		 * @return The current primitive instance increased by 1.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>--p</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Character dec() {
			var((char)Js.sub(var(), 1).shortValue());
			return this;
		}

		/**
		 * <p>Returns a copy of the current primitive instance and then increases the 
		 * current primitive instance by 1, resembling the post-increment operator in 
		 * JavaScript.</p>
		 * @return A copy of the original primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p++</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Character incp() {
			java.lang.Character v = var();
			var((char)Js.add(v, 1).shortValue());
			return this;
		}

		/**
		 * <p>Returns a copy of the current primitive instance and then decreases the 
		 * current primitive instance by 1, resembling the post-decrement operator in 
		 * JavaScript.</p>
		 * @return A copy of the undecremented primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p--</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Character decp() {
			java.lang.Character v = var();
			var((char)Js.sub(v, 1).shortValue());
			return this;
		}

		/**
		 * <p>Adds a numeric operand to the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-addition operator in JavaScript.</p>
		 * <p>If one value is a string, the other is converted to a string, and the two 
		 * strings are then concatenated. Object operands are converted to numbers or strings 
		 * that can be added or concatenated. The conversion is performed by {@link Js#valueOf(Object)}  
		 * method and/or the {@link Js#toString(Object)} method on the object.</p>
		 * @param value A value or object.
		 * @return The <tt>char</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p += (char)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Character aadd(Object value) {
			Object v = Js.valueOf(value);
			var(
					v instanceof java.lang.Character ?
					(char)Js.add(this.var(),  (java.lang.Character)v).shortValue() :
					(char)Js.add(this.var(),  (java.lang.Number)v).shortValue()
			);
			return this;
		}

		/**
		 * <p>Subtracts a numeric operand from the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-subtraction operator in JavaScript.</p>
		 * <p>If used with non-numeric values, this operation attempts to convert them to 
		 * numbers.</p>
		 * @param value A value or object.
		 * @return The <tt>char</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p -= (char)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Character asub(Object value) {
			Object v = Js.valueOf(value);
			var(
					v instanceof java.lang.Character ?
					(char)Js.sub(var(),  (java.lang.Character)v).shortValue() :
					(char)Js.sub(var(),  (java.lang.Number)v).shortValue()
			);
			return this;
		}

		/**
		 * <p>Multiplies a numeric operand to the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-multiplication operator in JavaScript.</p>
		 * <p>If used with non-numeric values, this operation attempts to convert them to 
		 * numbers.</p>
		 * @param value A value or object.
		 * @return The <tt>char</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p *= (char)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Character amul(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					(char)Js.mul(var(),  (java.lang.Character)v).shortValue() :
					(char)Js.mul(var(),  (java.lang.Number)v).shortValue()
			);
			return this;
		}

		/**
		 * <p>Divides, by a numeric operand, the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-division operator in JavaScript.</p>
		 * <p>Used with non-numeric values, this operation attempts to convert them to 
		 * numbers. If you are used to programming languages that distinguish between integer 
		 * and floating-point numbers, you might expect to get an integer result when you 
		 * divide one integer by another. In JavaScript, however, all numbers are floating-point, 
		 * so all division operations have floating-point results. Division by zero yields positive 
		 * or negative infinity, while <tt>0/0</tt> evaluates to <tt>NaN</tt>.</p>
		 * @param value A value or object.
		 * @return The <tt>char</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p /= (char)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Character adiv(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					(char)Js.div(var(),  (java.lang.Character)v).shortValue() :
					(char)Js.div(var(),  (java.lang.Number)v).shortValue()
			);
			return this;
		}

		/**
		 * <p>Modulo operates a numeric operand onto the current primitive instance and 
		 * returns the numeric operand, resembling the assignment-with-modulo operator in 
		 * JavaScript.</p>
		 * <p>The operation computes the remainder when the current primitive instance is 
		 * divided by the operand a certain number of times. If used with non-numeric values, 
		 * the operation attempts to convert them to numbers. The sign of the result is the 
		 * same as the sign of the current primitive instance.</p>
		 * <p>This operation is typically used with integer values, it also works for 
		 * floating-point values.</p>
		 * @param value A value or object.
		 * @return The <tt>char</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p %= (char)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Character amod(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					(char)Js.mod(var(),  (java.lang.Character)v).shortValue() :
					(char)Js.mod(var(),  (java.lang.Number)v).shortValue()
			);
			return this;
		}

		/**
		 * <p>Assignment-with-shift-left operation, resembling that of JavaScript, moves all bits in the 
		 * current primitive instance to the left by the number of places specified in the 
		 * second operand, which should be an integer between 0 and 31.</p>
		 * <p>A zero is used for the new first bit, and the value of the 32nd bit is lost. 
		 * Shifting a value left by one position is equivalent to multiplying by 2, shifting 
		 * two positions is equivalent to multiplying by 4, etc.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p <<= n & 0x3f</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Character ashl(int n) {
			var((char)Js.shl(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-shift-right operation, resembling that of JavaScript, moves all bits in the 
		 * current primitive instance to the right by the number of places specified in the 
		 * second operand (an integer between 0 and 31). Bits that are shifted off the right 
		 * are lost. The bits filled in on the left depend on the sign bit of the original 
		 * value, in order to preserve the sign of the result. If the current primitive 
		 * instance is positive, the result has zeros placed in the high bits; if the current 
		 * primitive instance is negative, the result has ones placed in the high bits.</p>
		 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
		 * remainder), shifting right two places is equivalent to integer division by 4, and 
		 * so on.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p >>= n & 0x3f</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Character ashr(int n) {
			var((char)Js.shr(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-shift-right-unsigned operation, resembling that of JavaScript, moves all bits in 
		 * the current primitive instance to the right by the number of places specified in the 
		 * second operand (an integer between 0 and 31). Bits that are shifted off the right 
		 * are lost. The result has zeros placed in the high bits.</p>
		 * <p>This operation is just like {@link #shr(int)}, except that the bits shifted 
		 * in on the left are always zero, regardless of the sign of the current primitive instance.</p>
		 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
		 * remainder), shifting right two places is equivalent to integer division by 4, and 
		 * so on.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p >>>= n & 0x3f</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Character ashru(int n) {
			var((char)Js.shru(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-AND operation, resembling that of JavaScript, performs a boolean AND 
		 * operation on each bit of the integer arguments. A bit is set in the result only if 
		 * the corresponding bit is set in both operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-AND of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p &= (char)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Character aand(Object value) {
			var((char)Js.band(this, value));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-OR operation, resembling that of JavaScript, performs a boolean OR operation 
		 * on each bit of the integer arguments. A bit is set in the result if the corresponding 
		 * bit is set in one or both of the operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-OR of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p |= (char)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Character aor(Object value) {
			var((char)Js.bor(this, value));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-XOR operation, resembling that of JavaScript, performs a boolean exclusive 
		 * OR operation on each bit of the integer arguments. Exclusive OR means that either 
		 * operand one is <tt>true</tt> or operand two is <tt>true</tt>, but not both. A bit is 
		 * set in this operation's result if a corresponding bit is set in one (but not both) 
		 * of the two operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-exclusive-OR of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p ^= (char)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Character axor(Object value) {
			var((char)Js.xor(this, value));
			return this;
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Character and(java.lang.Character other) {
			return new Character(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Character and(Value<java.lang.Character> other) {
			return new Character(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Character and(Character other) {
			return new Character(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Character or(java.lang.Character other) {
			return new Character(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Character or(Value<java.lang.Character> other) {
			return new Character(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Character or(Character other) {
			return new Character(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Character cond(Object test, java.lang.Character other) {
			return Js.be(test) ? this : new Character(other);
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Character cond(Object test, Value<java.lang.Character> other) {
			return Js.be(test) ? this : new Character(other.var());
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Character cond(Object test, Character other) {
			return Js.be(test) ? this : other;
		}
	}

	/**
	 * <p>An <b>opaque</b> class resembling JavaScript primitive number values.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 */

	public static final class Number extends Numerical<java.lang.Number> implements NumberLike<java.lang.Number>
	{
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
		public static final class Member extends Value.Member<java.lang.Number>
		{
			/**
			 * <p>Internally constructs a member based on a qualifying member.</p>
			 * <p>This constructor  is <b>internal</b> and only called inside of <b>opaque</b> 
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
			 * <p>Sets a new value to the property, represented by the current member instance, 
			 * of an object.</p>
			 * @param o The base object
			 * @param v The new value to set
			 * @return The new value
			 * @since 1.0
			 * @javascript Re-compilers must convert the instance invocation of this method into 
			 * the JavaScript expression: 
			 * <pre>o.m = v</pre>
			 * where <tt>m</tt> is the identifier name resolved from the current member 
			 * instance of the invocation.
			 */
			public java.lang.Number with(ObjectLike o, Var<? extends java.lang.Number> v) {
				return with(o, v.var());
			}
			/**
			 * <p>Sets a new value to the property, represented by the current member instance, 
			 * of an object.</p>
			 * @param o The base object
			 * @param v The new value to set
			 * @return The new value
			 * @since 1.0
			 * @javascript Re-compilers must convert the instance invocation of this method into 
			 * the JavaScript expression: 
			 * <pre>o.m = v</pre>
			 * where <tt>m</tt> is the identifier name resolved from the current member 
			 * instance of the invocation.
			 */
			public java.lang.Number with(ObjectLike o, JsNumber v) {
				return with(o, v.valueOf());
			}
		}

		/**
		 * <p>Constructs a primitive number instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Number(java.lang.Number value) {
			super(value);
		}
		/**
		 * <p>Constructs a primitive number instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Number(Var<? extends java.lang.Number> value) {
			super(value == null ? null : value.var());
		}
		/**
		 * <p>Constructs a primitive number instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Number(java.lang.Character value) {
			super(value == null ? null : (short)value.charValue());
		}
		/**
		 * <p>Constructs a primitive number instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Number(Character value) {
			super(Js.undefined(value) ? null : (short)value.var().charValue());
		}

		/**
		 * <p>Returns the primitive value associated with the current instance, if there is one.</p>
		 * @return The primitive value associated with the current instance.
		 * @see #toString()
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current instance without changing the method 
		 * name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		@Override
		public final java.lang.Number valueOf() {
			return var();
		}

		/**
		 * <p>Performs unary negation, resembling the unary minus operator in JavaScript.</p>
		 * <p>This operation converts a positive value to an equivalently negative value, and 
		 * vice versa. If the operand is not a number, it attempts to convert it to one.</p>
		 * @return The negation of the current primitive instance.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>-p</pre>
		 * where <tt>p</tt> is the current primitive instance of the invocation of this 
		 * method.
		 */
		public final Number neg() {
			return new Number(Js.neg(this));
		}

		/**
		 * <p>Increases the current primitive instance by 1 and then returns the current 
		 * primitive instance, resembling the pre-increment operator in JavaScript.</p>
		 * @return The current primitive instance increased by 1.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>++p</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Number inc() {
			var(Js.add(var(), 1));
			return this;
		}

		/**
		 * <p>Decreases the current primitive instance by 1 and then returns the current 
		 * primitive instance, resembling the pre-decrement operator in JavaScript.</p>
		 * @return The current primitive instance increased by 1.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>--p</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Number dec() {
			var(Js.sub(var(), 1));
			return this;
		}

		/**
		 * <p>Returns a copy of the current primitive instance and then increases the 
		 * current primitive instance by 1, resembling the post-increment operator in 
		 * JavaScript.</p>
		 * @return A copy of the original primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p++</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Number incp() {
			java.lang.Number v = var();
			var(Js.add(v, 1));
			return this;
		}

		/**
		 * <p>Returns a copy of the current primitive instance and then decreases the 
		 * current primitive instance by 1, resembling the post-decrement operator in 
		 * JavaScript.</p>
		 * @return A copy of the undecremented primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p--</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Number decp() {
			java.lang.Number v = var();
			var(Js.sub(v, 1));
			return this;
		}

		/**
		 * <p>Adds a numeric operand to the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-addition operator in JavaScript.</p>
		 * <p>If one value is a string, the other is converted to a string, and the two 
		 * strings are then concatenated. Object operands are converted to numbers or strings 
		 * that can be added or concatenated. The conversion is performed by {@link Js#valueOf(Object)}  
		 * method and/or the {@link Js#toString(Object)} method on the object.</p>
		 * @param value A value or object.
		 * @return The numeric value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p += value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Number aadd(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.add(var(),  (java.lang.Character)v) :
					Js.add(var(),  (java.lang.Number)v)
			);
			return this;
		}

		/**
		 * <p>Subtracts a numeric operand from the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-subtraction operator in JavaScript.</p>
		 * <p>If used with non-numeric values, this operation attempts to convert them to 
		 * numbers.</p>
		 * @param value A value or object.
		 * @return The numeric value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p -= value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Number asub(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.sub(var(),  (java.lang.Character)v) :
					Js.sub(var(),  (java.lang.Number)v)
			);
			return this;
		}

		/**
		 * <p>Multiplies a numeric operand to the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-multiplication operator in JavaScript.</p>
		 * <p>If used with non-numeric values, this operation attempts to convert them to 
		 * numbers.</p>
		 * @param value A value or object.
		 * @return The numeric value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p *= value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Number amul(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.mul(var(),  (java.lang.Character)v) :
					Js.mul(var(),  (java.lang.Number)v)
			);
			return this;
		}

		/**
		 * <p>Divides, by a numeric operand, the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-division operator in JavaScript.</p>
		 * <p>Used with non-numeric values, this operation attempts to convert them to 
		 * numbers. If you are used to programming languages that distinguish between integer 
		 * and floating-point numbers, you might expect to get an integer result when you 
		 * divide one integer by another. In JavaScript, however, all numbers are floating-point, 
		 * so all division operations have floating-point results. Division by zero yields positive 
		 * or negative infinity, while <tt>0/0</tt> evaluates to <tt>NaN</tt>.</p>
		 * @param value A value or object.
		 * @return The numeric value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p /= value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Number adiv(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.div(var(),  (java.lang.Character)v) :
					Js.div(var(),  (java.lang.Number)v)
			);
			return this;
		}

		/**
		 * <p>Modulo operates a numeric operand onto the current primitive instance and 
		 * returns the numeric operand, resembling the assignment-with-modulo operator in 
		 * JavaScript.</p>
		 * <p>The operation computes the remainder when the current primitive instance is 
		 * divided by the operand a certain number of times. If used with non-numeric values, 
		 * the operation attempts to convert them to numbers. The sign of the result is the 
		 * same as the sign of the current primitive instance.</p>
		 * <p>This operation is typically used with integer values, it also works for 
		 * floating-point values.</p>
		 * @param value A value or object.
		 * @return The numeric value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p %= value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Number amod(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.mod(var(),  (java.lang.Character)v) :
					Js.mod(var(),  (java.lang.Number)v)
			);
			return this;
		}

		/**
		 * <p>Assignment-with-shift-left operation, resembling that of JavaScript, moves all bits in the 
		 * current primitive instance to the left by the number of places specified in the 
		 * second operand, which should be an integer between 0 and 31.</p>
		 * <p>A zero is used for the new first bit, and the value of the 32nd bit is lost. 
		 * Shifting a value left by one position is equivalent to multiplying by 2, shifting 
		 * two positions is equivalent to multiplying by 4, etc.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p <<= n & 0x3f</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Number ashl(int n) {
			var(Js.shl(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-shift-right operation, resembling that of JavaScript, moves all bits in the 
		 * current primitive instance to the right by the number of places specified in the 
		 * second operand (an integer between 0 and 31). Bits that are shifted off the right 
		 * are lost. The bits filled in on the left depend on the sign bit of the original 
		 * value, in order to preserve the sign of the result. If the current primitive 
		 * instance is positive, the result has zeros placed in the high bits; if the current 
		 * primitive instance is negative, the result has ones placed in the high bits.</p>
		 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
		 * remainder), shifting right two places is equivalent to integer division by 4, and 
		 * so on.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p >>= n & 0x3f</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Number ashr(int n) {
			var(Js.shr(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-shift-right-unsigned operation, resembling that of JavaScript, moves all bits in 
		 * the current primitive instance to the right by the number of places specified in the 
		 * second operand (an integer between 0 and 31). Bits that are shifted off the right 
		 * are lost. The result has zeros placed in the high bits.</p>
		 * <p>This operation is just like {@link #shr(int)}, except that the bits shifted 
		 * in on the left are always zero, regardless of the sign of the current primitive instance.</p>
		 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
		 * remainder), shifting right two places is equivalent to integer division by 4, and 
		 * so on.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p >>>= n & 0x3f</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Number ashru(int n) {
			var(Js.shru(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-AND operation, resembling that of JavaScript, performs a boolean AND 
		 * operation on each bit of the integer arguments. A bit is set in the result only if 
		 * the corresponding bit is set in both operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-AND of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p &= (int)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Number aand(Object value) {
			var(Js.band(this, value));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-OR operation, resembling that of JavaScript, performs a boolean OR operation 
		 * on each bit of the integer arguments. A bit is set in the result if the corresponding 
		 * bit is set in one or both of the operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-OR of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p |= (int)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Number aor(Object value) {
			var(Js.bor(this, value));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-XOR operation, resembling that of JavaScript, performs a boolean exclusive 
		 * OR operation on each bit of the integer arguments. Exclusive OR means that either 
		 * operand one is <tt>true</tt> or operand two is <tt>true</tt>, but not both. A bit is 
		 * set in this operation's result if a corresponding bit is set in one (but not both) 
		 * of the two operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-exclusive-OR of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p ^= (int)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Number axor(Object value) {
			var(Js.xor(this, value));
			return this;
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Number and(java.lang.Number other) {
			return new Number(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Number and(Var<? extends java.lang.Number> other) {
			return new Number(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Number and(Number other) {
			return new Number(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Number or(java.lang.Number other) {
			return new Number(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Number or(Var<? extends java.lang.Number> other) {
			return new Number(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Number or(Number other) {
			return new Number(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Number cond(Object test, java.lang.Number other) {
			return Js.be(test) ? this : new Number(other);
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Number cond(Object test, Var<? extends java.lang.Number> other) {
			return Js.be(test) ? this : new Number(other.var());
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Number cond(Object test, Number other) {
			return Js.be(test) ? this : other;
		}
	}

	/**
	 * <p>An <b>opaque</b> class resembling JavaScript primitive byte number values.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 */

	public static final class Byte extends Numerical<java.lang.Byte> implements NumberLike<java.lang.Byte>
	{
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
		public static final class Member extends Value.Member<java.lang.Byte>
		{
			/**
			 * <p>Internally constructs a member based on a qualifying member.</p>
			 * <p>This constructor  is <b>internal</b> and only called inside of <b>opaque</b> 
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
		}

		/**
		 * <p>Constructs a primitive <tt>byte</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Byte(java.lang.Byte value) {
			super(value);
		}
		/**
		 * <p>Constructs a primitive <tt>byte</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Byte(Byte value) {
			super(value == null ? null : value.var());
		}
		/**
		 * <p>Constructs a primitive <tt>byte</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Byte(java.lang.Number value) {
			super(value.byteValue());
		}
		/**
		 * <p>Constructs a primitive <tt>byte</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Byte(Var<? extends java.lang.Number> value) {
			super(value.var().byteValue());
		}
		/**
		 * <p>Constructs a primitive <tt>byte</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Byte(java.lang.Character value) {
			super((byte)value.charValue());
		}
		/**
		 * <p>Constructs a primitive <tt>byte</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Byte(Character value) {
			super((byte)value.var().charValue());
		}

		/**
		 * <p>Returns the primitive value associated with the current instance, if there is one.</p>
		 * @return The primitive value associated with the current instance.
		 * @see #toString()
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current instance without changing the method 
		 * name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		@Override
		public final java.lang.Byte valueOf() {
			return var();
		}

		/**
		 * <p>Performs unary negation, resembling the unary minus operator in JavaScript.</p>
		 * <p>This operation converts a positive value to an equivalently negative value, and 
		 * vice versa. If the operand is not a number, it attempts to convert it to one.</p>
		 * @return The negation of the current primitive instance.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>-p</pre>
		 * where <tt>p</tt> is the current primitive instance of the invocation of this 
		 * method.
		 */
		public final Byte neg() {
			return new Byte(Js.neg(this).byteValue());
		}

		/**
		 * <p>Increases the current primitive instance by 1 and then returns the current 
		 * primitive instance, resembling the pre-increment operator in JavaScript.</p>
		 * @return The current primitive instance increased by 1.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>++p</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Byte inc() {
			var(Js.add(var(), 1).byteValue());
			return this;
		}

		/**
		 * <p>Decreases the current primitive instance by 1 and then returns the current 
		 * primitive instance, resembling the pre-decrement operator in JavaScript.</p>
		 * @return The current primitive instance increased by 1.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>--p</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Byte dec() {
			var(Js.sub(var(), 1).byteValue());
			return this;
		}

		/**
		 * <p>Returns a copy of the current primitive instance and then increases the 
		 * current primitive instance by 1, resembling the post-increment operator in 
		 * JavaScript.</p>
		 * @return A copy of the original primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p++</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Byte incp() {
			java.lang.Byte v = var();
			var(Js.add(v, 1).byteValue());
			return this;
		}

		/**
		 * <p>Returns a copy of the current primitive instance and then decreases the 
		 * current primitive instance by 1, resembling the post-decrement operator in 
		 * JavaScript.</p>
		 * @return A copy of the undecremented primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p--</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Byte decp() {
			java.lang.Byte v = var();
			var(Js.sub(v, 1).byteValue());
			return this;
		}

		/**
		 * <p>Adds a numeric operand to the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-addition operator in JavaScript.</p>
		 * <p>If one value is a string, the other is converted to a string, and the two 
		 * strings are then concatenated. Object operands are converted to numbers or strings 
		 * that can be added or concatenated. The conversion is performed by {@link Js#valueOf(Object)}  
		 * method and/or the {@link Js#toString(Object)} method on the object.</p>
		 * @param value A value or object.
		 * @return The <tt>byte</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p += (byte)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Byte aadd(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.add(var(),  (java.lang.Character)v).byteValue() :
					Js.add(var(),  (java.lang.Number)v).byteValue()
			);
			return this;
		}

		/**
		 * <p>Subtracts a numeric operand from the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-subtraction operator in JavaScript.</p>
		 * <p>If used with non-numeric values, this operation attempts to convert them to 
		 * numbers.</p>
		 * @param value A value or object.
		 * @return The <tt>byte</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p -= (byte)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Byte asub(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.sub(var(),  (java.lang.Character)v).byteValue() :
					Js.sub(var(),  (java.lang.Number)v).byteValue()
			);
			return this;
		}

		/**
		 * <p>Multiplies a numeric operand to the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-multiplication operator in JavaScript.</p>
		 * <p>If used with non-numeric values, this operation attempts to convert them to 
		 * numbers.</p>
		 * @param value A value or object.
		 * @return The <tt>byte</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p *= (byte)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Byte amul(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.mul(var(),  (java.lang.Character)v).byteValue() :
					Js.mul(var(),  (java.lang.Number)v).byteValue()
			);
			return this;
		}

		/**
		 * <p>Divides, by a numeric operand, the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-division operator in JavaScript.</p>
		 * <p>Used with non-numeric values, this operation attempts to convert them to 
		 * numbers. If you are used to programming languages that distinguish between integer 
		 * and floating-point numbers, you might expect to get an integer result when you 
		 * divide one integer by another. In JavaScript, however, all numbers are floating-point, 
		 * so all division operations have floating-point results. Division by zero yields positive 
		 * or negative infinity, while <tt>0/0</tt> evaluates to <tt>NaN</tt>.</p>
		 * @param value A value or object.
		 * @return The <tt>byte</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p /= (byte)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Byte adiv(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.div(var(),  (java.lang.Character)v).byteValue() :
					Js.div(var(),  (java.lang.Number)v).byteValue()
			);
			return this;
		}

		/**
		 * <p>Modulo operates a numeric operand onto the current primitive instance and 
		 * returns the numeric operand, resembling the assignment-with-modulo operator in 
		 * JavaScript.</p>
		 * <p>The operation computes the remainder when the current primitive instance is 
		 * divided by the operand a certain number of times. If used with non-numeric values, 
		 * the operation attempts to convert them to numbers. The sign of the result is the 
		 * same as the sign of the current primitive instance.</p>
		 * <p>This operation is typically used with integer values, it also works for 
		 * floating-point values.</p>
		 * @param value A value or object.
		 * @return The <tt>byte</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p %= (byte)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Byte amod(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.mod(var(),  (java.lang.Character)v).byteValue() :
					Js.mod(var(),  (java.lang.Number)v).byteValue()
			);
			return this;
		}

		/**
		 * <p>Assignment-with-shift-left operation, resembling that of JavaScript, moves all bits in the 
		 * current primitive instance to the left by the number of places specified in the 
		 * second operand, which should be an integer between 0 and 31.</p>
		 * <p>A zero is used for the new first bit, and the value of the 32nd bit is lost. 
		 * Shifting a value left by one position is equivalent to multiplying by 2, shifting 
		 * two positions is equivalent to multiplying by 4, etc.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p <<= n & 0x3f</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Byte ashl(int n) {
			var((byte)Js.shl(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-shift-right operation, resembling that of JavaScript, moves all bits in the 
		 * current primitive instance to the right by the number of places specified in the 
		 * second operand (an integer between 0 and 31). Bits that are shifted off the right 
		 * are lost. The bits filled in on the left depend on the sign bit of the original 
		 * value, in order to preserve the sign of the result. If the current primitive 
		 * instance is positive, the result has zeros placed in the high bits; if the current 
		 * primitive instance is negative, the result has ones placed in the high bits.</p>
		 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
		 * remainder), shifting right two places is equivalent to integer division by 4, and 
		 * so on.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p >>= n & 0x3f</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Byte ashr(int n) {
			var((byte)Js.shr(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-shift-right-unsigned operation, resembling that of JavaScript, moves all bits in 
		 * the current primitive instance to the right by the number of places specified in the 
		 * second operand (an integer between 0 and 31). Bits that are shifted off the right 
		 * are lost. The result has zeros placed in the high bits.</p>
		 * <p>This operation is just like {@link #shr(int)}, except that the bits shifted 
		 * in on the left are always zero, regardless of the sign of the current primitive instance.</p>
		 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
		 * remainder), shifting right two places is equivalent to integer division by 4, and 
		 * so on.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p >>>= n & 0x3f</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Byte ashru(int n) {
			var((byte)Js.shru(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-AND operation, resembling that of JavaScript, performs a boolean AND 
		 * operation on each bit of the integer arguments. A bit is set in the result only if 
		 * the corresponding bit is set in both operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-AND of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p &= (byte)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Byte aand(Object value) {
			var((byte)Js.band(this, value));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-OR operation, resembling that of JavaScript, performs a boolean OR operation 
		 * on each bit of the integer arguments. A bit is set in the result if the corresponding 
		 * bit is set in one or both of the operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-OR of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p |= (byte)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Byte aor(Object value) {
			var((byte)Js.bor(this, value));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-XOR operation, resembling that of JavaScript, performs a boolean exclusive 
		 * OR operation on each bit of the integer arguments. Exclusive OR means that either 
		 * operand one is <tt>true</tt> or operand two is <tt>true</tt>, but not both. A bit is 
		 * set in this operation's result if a corresponding bit is set in one (but not both) 
		 * of the two operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-exclusive-OR of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p ^= (byte)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Byte axor(Object value) {
			var((byte)Js.xor(this, value));
			return this;
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Byte and(java.lang.Byte other) {
			return new Byte(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Byte and(Value<java.lang.Byte> other) {
			return new Byte(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Byte and(Byte other) {
			return new Byte(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Byte or(java.lang.Byte other) {
			return new Byte(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Byte or(Value<java.lang.Byte> other) {
			return new Byte(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Byte or(Byte other) {
			return new Byte(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Byte cond(Object test, java.lang.Byte other) {
			return Js.be(test) ? this : new Byte(other);
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Byte cond(Object test, Value<java.lang.Byte> other) {
			return Js.be(test) ? this : new Byte(other.var());
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Byte cond(Object test, Byte other) {
			return Js.be(test) ? this : other;
		}
	}

	/**
	 * <p>An <b>opaque</b> class resembling JavaScript primitive short number values.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 */
	public static final class Short extends Numerical<java.lang.Short> implements NumberLike<java.lang.Short>
	{
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
		public static final class Member extends Value.Member<java.lang.Short>
		{
			/**
			 * <p>Internally constructs a member based on a qualifying member.</p>
			 * <p>This constructor  is <b>internal</b> and only called inside of <b>opaque</b> 
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
		}

		/**
		 * <p>Constructs a primitive <tt>short</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Short(java.lang.Short value) {
			super(value);
		}
		/**
		 * <p>Constructs a primitive <tt>short</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Short(Short value) {
			super(value == null ? null : value.var());
		}
		/**
		 * <p>Constructs a primitive <tt>short</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Short(java.lang.Byte value) {
			super(value == null ? null : value.shortValue());
		}
		/**
		 * <p>Constructs a primitive <tt>short</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Short(Byte value) {
			super(Js.undefined(value) ? null : value.var().shortValue());
		}
		/**
		 * <p>Constructs a primitive <tt>short</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Short(java.lang.Number value) {
			super(value.shortValue());
		}
		/**
		 * <p>Constructs a primitive <tt>short</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Short(Var<? extends java.lang.Number> value) {
			super(value.var().shortValue());
		}
		/**
		 * <p>Constructs a primitive <tt>short</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Short(java.lang.Character value) {
			super(value == null ? null : (short)value.charValue());
		}
		/**
		 * <p>Constructs a primitive <tt>short</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Short(Character value) {
			super(Js.undefined(value) ? null : (short)value.var().charValue());
		}

		/**
		 * <p>Returns the primitive value associated with the current instance, if there is one.</p>
		 * @return The primitive value associated with the current instance.
		 * @see #toString()
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current instance without changing the method 
		 * name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		@Override
		public final java.lang.Short valueOf() {
			return var();
		}

		/**
		 * <p>Performs unary negation, resembling the unary minus operator in JavaScript.</p>
		 * <p>This operation converts a positive value to an equivalently negative value, and 
		 * vice versa. If the operand is not a number, it attempts to convert it to one.</p>
		 * @return The negation of the current primitive instance.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>-p</pre>
		 * where <tt>p</tt> is the current primitive instance of the invocation of this 
		 * method.
		 */
		public final Short neg() {
			return new Short(Js.neg(this).shortValue());
		}

		/**
		 * <p>Increases the current primitive instance by 1 and then returns the current 
		 * primitive instance, resembling the pre-increment operator in JavaScript.</p>
		 * @return The current primitive instance increased by 1.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>++p</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Short inc() {
			var(Js.add(var(), 1).shortValue());
			return this;
		}

		/**
		 * <p>Decreases the current primitive instance by 1 and then returns the current 
		 * primitive instance, resembling the pre-decrement operator in JavaScript.</p>
		 * @return The current primitive instance increased by 1.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>--p</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Short dec() {
			var(Js.sub(var(), 1).shortValue());
			return this;
		}

		/**
		 * <p>Returns a copy of the current primitive instance and then increases the 
		 * current primitive instance by 1, resembling the post-increment operator in 
		 * JavaScript.</p>
		 * @return A copy of the original primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p++</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Short incp() {
			java.lang.Short v = var();
			var(Js.add(v, 1).shortValue());
			return this;
		}

		/**
		 * <p>Returns a copy of the current primitive instance and then decreases the 
		 * current primitive instance by 1, resembling the post-decrement operator in 
		 * JavaScript.</p>
		 * @return A copy of the undecremented primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p--</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Short decp() {
			java.lang.Short v = var();
			var(Js.sub(v, 1).shortValue());
			return this;
		}

		/**
		 * <p>Adds a numeric operand to the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-addition operator in JavaScript.</p>
		 * <p>If one value is a string, the other is converted to a string, and the two 
		 * strings are then concatenated. Object operands are converted to numbers or strings 
		 * that can be added or concatenated. The conversion is performed by {@link Js#valueOf(Object)}  
		 * method and/or the {@link Js#toString(Object)} method on the object.</p>
		 * @param value A value or object.
		 * @return The <tt>short</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p += (short)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Short aadd(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.add(var(),  (java.lang.Character)v).shortValue() :
					Js.add(var(),  (java.lang.Number)v).shortValue()
			);
			return this;
		}

		/**
		 * <p>Subtracts a numeric operand from the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-subtraction operator in JavaScript.</p>
		 * <p>If used with non-numeric values, this operation attempts to convert them to 
		 * numbers.</p>
		 * @param value A value or object.
		 * @return The <tt>short</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p -= (short)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Short asub(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.sub(var(),  (java.lang.Character)v).shortValue() :
					Js.sub(var(),  (java.lang.Number)v).shortValue()
			);
			return this;
		}

		/**
		 * <p>Multiplies a numeric operand to the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-multiplication operator in JavaScript.</p>
		 * <p>If used with non-numeric values, this operation attempts to convert them to 
		 * numbers.</p>
		 * @param value A value or object.
		 * @return The <tt>short</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p *= (short)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Short amul(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.mul(var(),  (java.lang.Character)v).shortValue() :
					Js.mul(var(),  (java.lang.Number)v).shortValue()
			);
			return this;
		}

		/**
		 * <p>Divides, by a numeric operand, the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-division operator in JavaScript.</p>
		 * <p>Used with non-numeric values, this operation attempts to convert them to 
		 * numbers. If you are used to programming languages that distinguish between integer 
		 * and floating-point numbers, you might expect to get an integer result when you 
		 * divide one integer by another. In JavaScript, however, all numbers are floating-point, 
		 * so all division operations have floating-point results. Division by zero yields positive 
		 * or negative infinity, while <tt>0/0</tt> evaluates to <tt>NaN</tt>.</p>
		 * @param value A value or object.
		 * @return The <tt>short</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p /= (short)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Short adiv(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.div(var(),  (java.lang.Character)v).shortValue() :
					Js.div(var(),  (java.lang.Number)v).shortValue()
			);
			return this;
		}

		/**
		 * <p>Modulo operates a numeric operand onto the current primitive instance and 
		 * returns the numeric operand, resembling the assignment-with-modulo operator in 
		 * JavaScript.</p>
		 * <p>The operation computes the remainder when the current primitive instance is 
		 * divided by the operand a certain number of times. If used with non-numeric values, 
		 * the operation attempts to convert them to numbers. The sign of the result is the 
		 * same as the sign of the current primitive instance.</p>
		 * <p>This operation is typically used with integer values, it also works for 
		 * floating-point values.</p>
		 * @param value A value or object.
		 * @return The <tt>short</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p %= (short)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Short amod(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.mod(var(),  (java.lang.Character)v).shortValue() :
					Js.mod(var(),  (java.lang.Number)v).shortValue()
			);
			return this;
		}

		/**
		 * <p>Assignment-with-shift-left operation, resembling that of JavaScript, moves all bits in the 
		 * current primitive instance to the left by the number of places specified in the 
		 * second operand, which should be an integer between 0 and 31.</p>
		 * <p>A zero is used for the new first bit, and the value of the 32nd bit is lost. 
		 * Shifting a value left by one position is equivalent to multiplying by 2, shifting 
		 * two positions is equivalent to multiplying by 4, etc.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p <<= n & 0x3f</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Short ashl(int n) {
			var((short)Js.shl(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-shift-right operation, resembling that of JavaScript, moves all bits in the 
		 * current primitive instance to the right by the number of places specified in the 
		 * second operand (an integer between 0 and 31). Bits that are shifted off the right 
		 * are lost. The bits filled in on the left depend on the sign bit of the original 
		 * value, in order to preserve the sign of the result. If the current primitive 
		 * instance is positive, the result has zeros placed in the high bits; if the current 
		 * primitive instance is negative, the result has ones placed in the high bits.</p>
		 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
		 * remainder), shifting right two places is equivalent to integer division by 4, and 
		 * so on.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p >>= n & 0x3f</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Short ashr(int n) {
			var((short)Js.shr(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-shift-right-unsigned operation, resembling that of JavaScript, moves all bits in 
		 * the current primitive instance to the right by the number of places specified in the 
		 * second operand (an integer between 0 and 31). Bits that are shifted off the right 
		 * are lost. The result has zeros placed in the high bits.</p>
		 * <p>This operation is just like {@link #shr(int)}, except that the bits shifted 
		 * in on the left are always zero, regardless of the sign of the current primitive instance.</p>
		 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
		 * remainder), shifting right two places is equivalent to integer division by 4, and 
		 * so on.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p >>>= n & 0x3f</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Short ashru(int n) {
			var((short)Js.shru(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-AND operation, resembling that of JavaScript, performs a boolean AND 
		 * operation on each bit of the integer arguments. A bit is set in the result only if 
		 * the corresponding bit is set in both operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-AND of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p &= (short)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Short aand(Object value) {
			var((short)Js.band(this, value));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-OR operation, resembling that of JavaScript, performs a boolean OR operation 
		 * on each bit of the integer arguments. A bit is set in the result if the corresponding 
		 * bit is set in one or both of the operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-OR of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p |= (short)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Short aor(Object value) {
			var((short)Js.bor(this, value));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-XOR operation, resembling that of JavaScript, performs a boolean exclusive 
		 * OR operation on each bit of the integer arguments. Exclusive OR means that either 
		 * operand one is <tt>true</tt> or operand two is <tt>true</tt>, but not both. A bit is 
		 * set in this operation's result if a corresponding bit is set in one (but not both) 
		 * of the two operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-exclusive-OR of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p ^= (short)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Short axor(Object value) {
			var((short)Js.xor(this, value));
			return this;
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Short and(java.lang.Short other) {
			return new Short(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Short and(Value<java.lang.Short> other) {
			return new Short(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Short and(Short other) {
			return new Short(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Short or(java.lang.Short other) {
			return new Short(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Short or(Value<java.lang.Short> other) {
			return new Short(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Short or(Short other) {
			return new Short(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Short cond(Object test, java.lang.Short other) {
			return Js.be(test) ? this : new Short(other);
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Short cond(Object test, Value<java.lang.Short> other) {
			return Js.be(test) ? this : new Short(other.var());
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Short cond(Object test, Short other) {
			return Js.be(test) ? this : other;
		}
	}

	/**
	 * <p>An <b>opaque</b> class resembling JavaScript primitive integer number values.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 */
	public static class Integer extends Numerical<java.lang.Integer> implements NumberLike<java.lang.Integer>
	{
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
		public static final class Member extends Value.Member<java.lang.Integer>
		{
			/**
			 * <p>Internally constructs a member based on a qualifying member.</p>
			 * <p>This constructor  is <b>internal</b> and only called inside of <b>opaque</b> 
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
		}

		/**
		 * <p>Constructs a primitive <tt>int</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Integer(java.lang.Integer value) {
			super(value);
		}
		/**
		 * <p>Constructs a primitive <tt>int</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Integer(Integer value) {
			super(value == null ? null : value.var());
		}

		/**
		 * <p>Constructs a primitive <tt>int</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Integer(java.lang.Byte value) {
			super(value == null ? null : value.intValue());
		}
		/**
		 * <p>Constructs a primitive <tt>int</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Integer(Byte value) {
			super(Js.undefined(value) ? null : value.var().intValue());
		}
		/**
		 * <p>Constructs a primitive <tt>int</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Integer(java.lang.Short value) {
			super(value == null ? null : value.intValue());
		}
		/**
		 * <p>Constructs a primitive <tt>int</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Integer(Short value) {
			super(Js.undefined(value) ? null : value.var().intValue());
		}
		/**
		 * <p>Constructs a primitive <tt>int</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Integer(java.lang.Number value) {
			super(value.intValue());
		}
		/**
		 * <p>Constructs a primitive <tt>int</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Integer(Var<? extends java.lang.Number> value) {
			super(value.var().intValue());
		}
		/**
		 * <p>Constructs a primitive <tt>int</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Integer(java.lang.Character value) {
			super(value == null ? null : (int)value.charValue());
		}
		/**
		 * <p>Constructs a primitive <tt>int</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Integer(Character value) {
			super((int)value.var().charValue());
		}

		/**
		 * <p>Returns the primitive value associated with the current instance, if there is one.</p>
		 * @return The primitive value associated with the current instance.
		 * @see #toString()
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current instance without changing the method 
		 * name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		@Override
		public final java.lang.Integer valueOf() {
			return var();
		}

		/**
		 * <p>Performs unary negation, resembling the unary minus operator in JavaScript.</p>
		 * <p>This operation converts a positive value to an equivalently negative value, and 
		 * vice versa. If the operand is not a number, it attempts to convert it to one.</p>
		 * @return The negation of the current primitive instance.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>-p</pre>
		 * where <tt>p</tt> is the current primitive instance of the invocation of this 
		 * method.
		 */
		public final Integer neg() {
			return new Integer(Js.neg(this).intValue());
		}

		/**
		 * <p>Increases the current primitive instance by 1 and then returns the current 
		 * primitive instance, resembling the pre-increment operator in JavaScript.</p>
		 * @return The current primitive instance increased by 1.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>++p</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Integer inc() {
			var(Js.add(var(), 1).intValue());
			return this;
		}

		/**
		 * <p>Decreases the current primitive instance by 1 and then returns the current 
		 * primitive instance, resembling the pre-decrement operator in JavaScript.</p>
		 * @return The current primitive instance increased by 1.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>--p</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Integer dec() {
			var(Js.sub(var(), 1).intValue());
			return this;
		}

		/**
		 * <p>Returns a copy of the current primitive instance and then increases the 
		 * current primitive instance by 1, resembling the post-increment operator in 
		 * JavaScript.</p>
		 * @return A copy of the original primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p++</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Integer incp() {
			java.lang.Integer v = var();
			var(Js.add(v, 1).intValue());
			return this;
		}

		/**
		 * <p>Returns a copy of the current primitive instance and then decreases the 
		 * current primitive instance by 1, resembling the post-decrement operator in 
		 * JavaScript.</p>
		 * @return A copy of the undecremented primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p--</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Integer decp() {
			java.lang.Integer v = var();
			var(Js.sub(v, 1).intValue());
			return this;
		}

		/**
		 * <p>Adds a numeric operand to the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-addition operator in JavaScript.</p>
		 * <p>If one value is a string, the other is converted to a string, and the two 
		 * strings are then concatenated. Object operands are converted to numbers or strings 
		 * that can be added or concatenated. The conversion is performed by {@link Js#valueOf(Object)}  
		 * method and/or the {@link Js#toString(Object)} method on the object.</p>
		 * @param value A value or object.
		 * @return The <tt>int</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p += (int)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Integer aadd(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.add(var(),  (java.lang.Character)v).intValue() :
					Js.add(var(),  (java.lang.Number)v).intValue()
			);
			return this;
		}

		/**
		 * <p>Subtracts a numeric operand from the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-subtraction operator in JavaScript.</p>
		 * <p>If used with non-numeric values, this operation attempts to convert them to 
		 * numbers.</p>
		 * @param value A value or object.
		 * @return The <tt>int</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p += (int)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Integer asub(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.sub(var(),  (java.lang.Character)v).intValue() :
					Js.sub(var(),  (java.lang.Number)v).intValue()
			);
			return this;
		}

		/**
		 * <p>Multiplies a numeric operand to the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-multiplication operator in JavaScript.</p>
		 * <p>If used with non-numeric values, this operation attempts to convert them to 
		 * numbers.</p>
		 * @param value A value or object.
		 * @return The <tt>int</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p *= (int)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Integer amul(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.mul(var(),  (java.lang.Character)v).intValue() :
					Js.mul(var(),  (java.lang.Number)v).intValue()
			);
			return this;
		}

		/**
		 * <p>Divides, by a numeric operand, the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-division operator in JavaScript.</p>
		 * <p>Used with non-numeric values, this operation attempts to convert them to 
		 * numbers. If you are used to programming languages that distinguish between integer 
		 * and floating-point numbers, you might expect to get an integer result when you 
		 * divide one integer by another. In JavaScript, however, all numbers are floating-point, 
		 * so all division operations have floating-point results. Division by zero yields positive 
		 * or negative infinity, while <tt>0/0</tt> evaluates to <tt>NaN</tt>.</p>
		 * @param value A value or object.
		 * @return The <tt>int</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p /= (int)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Integer adiv(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.div(var(),  (java.lang.Character)v).intValue() :
					Js.div(var(),  (java.lang.Number)v).intValue()
			);
			return this;
		}

		/**
		 * <p>Modulo operates a numeric operand onto the current primitive instance and 
		 * returns the numeric operand, resembling the assignment-with-modulo operator in 
		 * JavaScript.</p>
		 * <p>The operation computes the remainder when the current primitive instance is 
		 * divided by the operand a certain number of times. If used with non-numeric values, 
		 * the operation attempts to convert them to numbers. The sign of the result is the 
		 * same as the sign of the current primitive instance.</p>
		 * <p>This operation is typically used with integer values, it also works for 
		 * floating-point values.</p>
		 * @param value A value or object.
		 * @return The <tt>int</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p %= (int)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Integer amod(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.mod(var(),  (java.lang.Character)v).intValue() :
					Js.mod(var(),  (java.lang.Number)v).intValue()
			);
			return this;
		}

		/**
		 * <p>Assignment-with-shift-left operation, resembling that of JavaScript, moves all bits in the 
		 * current primitive instance to the left by the number of places specified in the 
		 * second operand, which should be an integer between 0 and 31.</p>
		 * <p>A zero is used for the new first bit, and the value of the 32nd bit is lost. 
		 * Shifting a value left by one position is equivalent to multiplying by 2, shifting 
		 * two positions is equivalent to multiplying by 4, etc.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p <<= n & 0x3f</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Integer ashl(int n) {
			var((int)Js.shl(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-shift-right operation, resembling that of JavaScript, moves all bits in the 
		 * current primitive instance to the right by the number of places specified in the 
		 * second operand (an integer between 0 and 31). Bits that are shifted off the right 
		 * are lost. The bits filled in on the left depend on the sign bit of the original 
		 * value, in order to preserve the sign of the result. If the current primitive 
		 * instance is positive, the result has zeros placed in the high bits; if the current 
		 * primitive instance is negative, the result has ones placed in the high bits.</p>
		 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
		 * remainder), shifting right two places is equivalent to integer division by 4, and 
		 * so on.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p >>= n & 0x3f</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Integer ashr(int n) {
			var((int)Js.shr(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-shift-right-unsigned operation, resembling that of JavaScript, moves all bits in 
		 * the current primitive instance to the right by the number of places specified in the 
		 * second operand (an integer between 0 and 31). Bits that are shifted off the right 
		 * are lost. The result has zeros placed in the high bits.</p>
		 * <p>This operation is just like {@link #shr(int)}, except that the bits shifted 
		 * in on the left are always zero, regardless of the sign of the current primitive instance.</p>
		 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
		 * remainder), shifting right two places is equivalent to integer division by 4, and 
		 * so on.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p >>>= n & 0x3f</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Integer ashru(int n) {
			var((int)Js.shru(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-AND operation, resembling that of JavaScript, performs a boolean AND 
		 * operation on each bit of the integer arguments. A bit is set in the result only if 
		 * the corresponding bit is set in both operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-AND of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p &= (int)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Integer aand(Object value) {
			var((int)Js.band(this, value));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-OR operation, resembling that of JavaScript, performs a boolean OR operation 
		 * on each bit of the integer arguments. A bit is set in the result if the corresponding 
		 * bit is set in one or both of the operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-OR of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p |= (int)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Integer aor(Object value) {
			var((int)Js.bor(this, value));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-XOR operation, resembling that of JavaScript, performs a boolean exclusive 
		 * OR operation on each bit of the integer arguments. Exclusive OR means that either 
		 * operand one is <tt>true</tt> or operand two is <tt>true</tt>, but not both. A bit is 
		 * set in this operation's result if a corresponding bit is set in one (but not both) 
		 * of the two operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-exclusive-OR of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p ^= (int)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Integer axor(Object value) {
			var((int)Js.xor(this, value));
			return this;
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Integer and(java.lang.Integer other) {
			return new Integer(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Integer and(Value<java.lang.Integer> other) {
			return new Integer(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Integer and(Integer other) {
			return new Integer(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Integer or(java.lang.Integer other) {
			return new Integer(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Integer or(Value<java.lang.Integer> other) {
			return new Integer(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Integer or(Integer other) {
			return new Integer(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Integer cond(Object test, java.lang.Integer other) {
			return Js.be(test) ? this : new Integer(other);
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Integer cond(Object test, Value<java.lang.Integer> other) {
			return Js.be(test) ? this : new Integer(other.var());
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Integer cond(Object test, Integer other) {
			return Js.be(test) ? this : other;
		}
	}

	/**
	 * <p>An <b>opaque</b> class resembling JavaScript primitive long number values.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 */
	public static class Long extends Numerical<java.lang.Long> implements NumberLike<java.lang.Long>
	{
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
		public static final class Member extends Value.Member<java.lang.Long>
		{
			/**
			 * <p>Internally constructs a member based on a qualifying member.</p>
			 * <p>This constructor  is <b>internal</b> and only called inside of <b>opaque</b> 
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
		}

		/**
		 * <p>Constructs a primitive <tt>long</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Long(java.lang.Long value) {
			super(value);
		}
		/**
		 * <p>Constructs a primitive <tt>long</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Long(Long value) {
			super(value == null ? null : value.var());
		}
		/**
		 * <p>Constructs a primitive <tt>long</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Long(java.lang.Number value) {
			super(value.longValue());
		}
		/**
		 * <p>Constructs a primitive <tt>long</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Long(Var<? extends java.lang.Number> value) {
			super(value.var().longValue());
		}
		/**
		 * <p>Constructs a primitive <tt>long</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Long(java.lang.Character value) {
			super((long)value.charValue());
		}
		/**
		 * <p>Constructs a primitive <tt>long</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Long(Character value) {
			super((long)value.var().charValue());
		}

		/**
		 * <p>Returns the primitive value associated with the current instance, if there is one.</p>
		 * @return The primitive value associated with the current instance.
		 * @see #toString()
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current instance without changing the method 
		 * name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		@Override
		public final java.lang.Long valueOf() {
			return var();
		}

		/**
		 * <p>Performs unary negation on a 64-bit integer.</p>
		 * <p>This operation converts a positive value to an equivalently negative value, and 
		 * vice versa. If the operand is not a 64-bit integer, it attempts to convert it to one.</p>
		 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
		 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
		 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
		 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
		 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
		 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
		 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
		 * naturally evaluates to a normal number without extra casting codes. That is, casting 
		 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
		 * bits involve the invocation of a predefined re-compiler dependent function while 
		 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
		 * In addition, the <tt>toString()</tt> method of that object or array must return a 
		 * string representation of the <tt>long</tt> number in full 64-bit precision. </p>
		 * @return The negation of the 64-bit integer.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this method 
		 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
		 * the same re-compiler would replace the byte codes of a negation operation on a long number, 
		 * such as the byte codes compiled from the following Java expression:  
		 * <pre>-((Number)p).longValue()</pre>
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Long neg() {
			return new Long(Js.lneg(this));
		}

		/**
		 * <p>Increases the current primitive instance by 1 and then returns the current 
		 * primitive instance, resembling the pre-increment operator in JavaScript.</p>
		 * @return The current primitive instance increased by 1.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>++p</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Long inc() {
			var(Js.ladd(var(), 1));
			return this;
		}

		/**
		 * <p>Decreases the current primitive instance by 1 and then returns the current 
		 * primitive instance, resembling the pre-decrement operator in JavaScript.</p>
		 * @return The current primitive instance increased by 1.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>--p</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Long dec() {
			var(Js.lsub(var(), 1));
			return this;
		}

		/**
		 * <p>Returns a copy of the current primitive instance and then increases the 
		 * current primitive instance by 1, resembling the post-increment operator in 
		 * JavaScript.</p>
		 * @return A copy of the original primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p++</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Long incp() {
			java.lang.Long v = var();
			var(Js.ladd(v, 1));
			return this;
		}

		/**
		 * <p>Returns a copy of the current primitive instance and then decreases the 
		 * current primitive instance by 1, resembling the post-decrement operator in 
		 * JavaScript.</p>
		 * @return A copy of the undecremented primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p--</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Long decp() {
			java.lang.Long v = var();
			var(Js.lsub(v, 1));
			return this;
		}

		/**
		 * <p>Adds a numeric operand to the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-addition operator in JavaScript.</p>
		 * <p>If one value is a string, the other is converted to a string, and the two 
		 * strings are then concatenated. Object operands are converted to numbers or strings 
		 * that can be added or concatenated. The conversion is performed by {@link Js#valueOf(Object)}  
		 * method and/or the {@link Js#toString(Object)} method on the object.</p>
		 * @param value A value or object.
		 * @return The <tt>long</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p += (long)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Long aadd(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.ladd(var(),  (java.lang.Character)v) :
					Js.ladd(var(),  (java.lang.Number)v)
			);
			return this;
		}

		/**
		 * <p>Subtracts a numeric operand from the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-subtraction operator in JavaScript.</p>
		 * <p>If used with non-numeric values, this operation attempts to convert them to 
		 * numbers.</p>
		 * @param value A value or object.
		 * @return The <tt>long</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p -= (long)value</pre>
		 * where <tt>p</tt> is the long integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Long asub(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.lsub(var(),  (java.lang.Character)v) :
					Js.lsub(var(),  (java.lang.Number)v)
			);
			return this;
		}

		/**
		 * <p>Multiplies a numeric operand to the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-multiplication operator in JavaScript.</p>
		 * <p>If used with non-numeric values, this operation attempts to convert them to 
		 * numbers.</p>
		 * @param value A value or object.
		 * @return The <tt>long</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p *= (long)value</pre>
		 * where <tt>p</tt> is the long integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Long amul(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.lmul(var(),  (java.lang.Character)v) :
					Js.lmul(var(),  (java.lang.Number)v)
			);
			return this;
		}

		/**
		 * <p>Divides, by a numeric operand, the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-division operator in JavaScript.</p>
		 * <p>Used with non-numeric values, this operation attempts to convert them to 
		 * numbers. If you are used to programming languages that distinguish between integer 
		 * and floating-point numbers, you might expect to get an integer result when you 
		 * divide one integer by another. In JavaScript, however, all numbers are floating-point, 
		 * so all division operations have floating-point results. Division by zero yields positive 
		 * or negative infinity, while <tt>0/0</tt> evaluates to <tt>NaN</tt>.</p>
		 * @param value A value or object.
		 * @return The <tt>long</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p /= (long)value</pre>
		 * where <tt>p</tt> is the long integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Long adiv(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.ldiv(var(),  (java.lang.Character)v) :
					Js.ldiv(var(),  (java.lang.Number)v)
			);
			return this;
		}

		/**
		 * <p>Modulo operates a numeric operand onto the current primitive instance and 
		 * returns the numeric operand, resembling the assignment-with-modulo operator in 
		 * JavaScript.</p>
		 * <p>The operation computes the remainder when the current primitive instance is 
		 * divided by the operand a certain number of times. If used with non-numeric values, 
		 * the operation attempts to convert them to numbers. The sign of the result is the 
		 * same as the sign of the current primitive instance.</p>
		 * <p>This operation is typically used with integer values, it also works for 
		 * floating-point values.</p>
		 * @param value A value or object.
		 * @return The <tt>long</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p %= (long)value</pre>
		 * where <tt>p</tt> is the long integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Long amod(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.lmod(var(),  (java.lang.Character)v) :
					Js.lmod(var(),  (java.lang.Number)v)
			);
			return this;
		}

		/**
		 * <p>Assignment-with-shift-left operation, resembling that of JavaScript, moves all bits in the 
		 * current primitive instance to the left by the number of places specified in the 
		 * second operand, which should be an integer between 0 and 31.</p>
		 * <p>A zero is used for the new first bit, and the value of the 32nd bit is lost. 
		 * Shifting a value left by one position is equivalent to multiplying by 2, shifting 
		 * two positions is equivalent to multiplying by 4, etc.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p <<= n & 0x7f</pre>
		 * where <tt>p</tt> is the long integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Long ashl(int n) {
			var(Js.lshl(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-shift-right operation, resembling that of JavaScript, moves all bits in the 
		 * current primitive instance to the right by the number of places specified in the 
		 * second operand (an integer between 0 and 31). Bits that are shifted off the right 
		 * are lost. The bits filled in on the left depend on the sign bit of the original 
		 * value, in order to preserve the sign of the result. If the current primitive 
		 * instance is positive, the result has zeros placed in the high bits; if the current 
		 * primitive instance is negative, the result has ones placed in the high bits.</p>
		 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
		 * remainder), shifting right two places is equivalent to integer division by 4, and 
		 * so on.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p >>= n & 0x7f</pre>
		 * where <tt>p</tt> is the long integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Long ashr(int n) {
			var(Js.lshr(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-shift-right-unsigned operation, resembling that of JavaScript, moves all bits in 
		 * the current primitive instance to the right by the number of places specified in the 
		 * second operand (an integer between 0 and 31). Bits that are shifted off the right 
		 * are lost. The result has zeros placed in the high bits.</p>
		 * <p>This operation is just like {@link #shr(int)}, except that the bits shifted 
		 * in on the left are always zero, regardless of the sign of the current primitive instance.</p>
		 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
		 * remainder), shifting right two places is equivalent to integer division by 4, and 
		 * so on.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p >>>= n & 0x3f</pre>
		 * where <tt>p</tt> is the long integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Long ashru(int n) {
			var(Js.lshru(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-AND operation, resembling that of JavaScript, performs a boolean AND 
		 * operation on each bit of the integer arguments. A bit is set in the result only if 
		 * the corresponding bit is set in both operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-AND of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p &= (long)value</pre>
		 * where <tt>p</tt> is the long integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Long aand(Object value) {
			var(Js.land(this, value));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-OR operation, resembling that of JavaScript, performs a boolean OR operation 
		 * on each bit of the integer arguments. A bit is set in the result if the corresponding 
		 * bit is set in one or both of the operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-OR of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p |= (long)value</pre>
		 * where <tt>p</tt> is the long integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Long aor(Object value) {
			var(Js.lor(this, value));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-XOR operation, resembling that of JavaScript, performs a boolean exclusive 
		 * OR operation on each bit of the integer arguments. Exclusive OR means that either 
		 * operand one is <tt>true</tt> or operand two is <tt>true</tt>, but not both. A bit is 
		 * set in this operation's result if a corresponding bit is set in one (but not both) 
		 * of the two operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-exclusive-OR of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p ^= (long)value</pre>
		 * where <tt>p</tt> is the long integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Long axor(Object value) {
			var(Js.lxor(this, value));
			return this;
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Long and(java.lang.Long other) {
			return new Long(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Long and(Value<java.lang.Long> other) {
			return new Long(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Long and(Long other) {
			return new Long(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Long or(java.lang.Long other) {
			return new Long(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Long or(Value<java.lang.Long> other) {
			return new Long(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Long or(Long other) {
			return new Long(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Long cond(Object test, java.lang.Long other) {
			return Js.be(test) ? this : new Long(other);
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Long cond(Object test, Value<java.lang.Long> other) {
			return Js.be(test) ? this : new Long(other.var());
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Long cond(Object test, Long other) {
			return Js.be(test) ? this : other;
		}
	}

	/**
	 * <p>An <b>opaque</b> class resembling JavaScript primitive float number values.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 */
	public static class Float extends Numerical<java.lang.Float> implements NumberLike<java.lang.Float>
	{
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
		public static final class Member extends Value.Member<java.lang.Float>
		{
			/**
			 * <p>Internally constructs a member based on a qualifying member.</p>
			 * <p>This constructor  is <b>internal</b> and only called inside of <b>opaque</b> 
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
		}

		/**
		 * <p>Constructs a primitive <tt>float</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Float(java.lang.Float value) {
			super(value);
		}
		/**
		 * <p>Constructs a primitive <tt>float</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Float(Float value) {
			super(value == null ? null : value.var());
		}
		/**
		 * <p>Constructs a primitive <tt>float</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Float(java.lang.Byte value) {
			super(value == null ? null : value.floatValue());
		}
		/**
		 * <p>Constructs a primitive <tt>float</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Float(Byte value) {
			super(Js.undefined(value) ? null : value.var().floatValue());
		}
		/**
		 * <p>Constructs a primitive <tt>float</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Float(java.lang.Short value) {
			super(value == null ? null : value.floatValue());
		}
		/**
		 * <p>Constructs a primitive <tt>float</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Float(Short value) {
			super(Js.undefined(value) ? null : value.var().floatValue());
		}
		/**
		 * <p>Constructs a primitive <tt>float</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Float(java.lang.Integer value) {
			super(value == null ? null : value.floatValue());
		}
		/**
		 * <p>Constructs a primitive <tt>float</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Float(Integer value) {
			super(Js.undefined(value) ? null : value.var().floatValue());
		}
		/**
		 * <p>Constructs a primitive <tt>float</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Float(java.lang.Number value) {
			super(value.floatValue());
		}
		/**
		 * <p>Constructs a primitive <tt>float</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Float(Var<? extends java.lang.Number> value) {
			super(value.var().floatValue());
		}
		/**
		 * <p>Constructs a primitive <tt>float</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Float(java.lang.Character value) {
			super(value == null ? null : (float)value.charValue());
		}
		/**
		 * <p>Constructs a primitive <tt>float</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Float(Character value) {
			super((float)value.var().charValue());
		}

		/**
		 * <p>Returns the primitive value associated with the current instance, if there is one.</p>
		 * @return The primitive value associated with the current instance.
		 * @see #toString()
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current instance without changing the method 
		 * name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		@Override
		public final java.lang.Float valueOf() {
			return var();
		}

		/**
		 * <p>Performs unary negation, resembling the unary minus operator in JavaScript.</p>
		 * <p>This operation converts a positive value to an equivalently negative value, and 
		 * vice versa. If the operand is not a number, it attempts to convert it to one.</p>
		 * @return The negation of the current primitive instance.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>-p</pre>
		 * where <tt>p</tt> is the current primitive instance of the invocation of this 
		 * method.
		 */
		public final Float neg() {
			return new Float(Js.neg(this).floatValue());
		}

		/**
		 * <p>Increases the current primitive instance by 1 and then returns the current 
		 * primitive instance, resembling the pre-increment operator in JavaScript.</p>
		 * @return The current primitive instance increased by 1.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>++p</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Float inc() {
			var(Js.add(var(), 1).floatValue());
			return this;
		}

		/**
		 * <p>Decreases the current primitive instance by 1 and then returns the current 
		 * primitive instance, resembling the pre-decrement operator in JavaScript.</p>
		 * @return The current primitive instance increased by 1.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>--p</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Float dec() {
			var(Js.sub(var(), 1).floatValue());
			return this;
		}

		/**
		 * <p>Returns a copy of the current primitive instance and then increases the 
		 * current primitive instance by 1, resembling the post-increment operator in 
		 * JavaScript.</p>
		 * @return A copy of the original primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p++</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Float incp() {
			java.lang.Float v = var();
			var(Js.add(v, 1).floatValue());
			return this;
		}

		/**
		 * <p>Returns a copy of the current primitive instance and then decreases the 
		 * current primitive instance by 1, resembling the post-decrement operator in 
		 * JavaScript.</p>
		 * @return A copy of the undecremented primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p--</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Float decp() {
			java.lang.Float v = var();
			var(Js.sub(v, 1).floatValue());
			return this;
		}

		/**
		 * <p>Adds a numeric operand to the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-addition operator in JavaScript.</p>
		 * <p>If one value is a string, the other is converted to a string, and the two 
		 * strings are then concatenated. Object operands are converted to numbers or strings 
		 * that can be added or concatenated. The conversion is performed by {@link Js#valueOf(Object)}  
		 * method and/or the {@link Js#toString(Object)} method on the object.</p>
		 * @param value A value or object.
		 * @return The <tt>float</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p += (float)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Float aadd(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.add(var(),  (java.lang.Character)v).floatValue() :
					Js.add(var(),  (java.lang.Number)v).floatValue()
			);
			return this;
		}

		/**
		 * <p>Subtracts a numeric operand from the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-subtraction operator in JavaScript.</p>
		 * <p>If used with non-numeric values, this operation attempts to convert them to 
		 * numbers.</p>
		 * @param value A value or object.
		 * @return The <tt>float</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p -= (float)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Float asub(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.sub(var(),  (java.lang.Character)v).floatValue() :
					Js.sub(var(),  (java.lang.Number)v).floatValue()
			);
			return this;
		}

		/**
		 * <p>Multiplies a numeric operand to the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-multiplication operator in JavaScript.</p>
		 * <p>If used with non-numeric values, this operation attempts to convert them to 
		 * numbers.</p>
		 * @param value A value or object.
		 * @return The <tt>float</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p *= (float)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Float amul(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.mul(var(),  (java.lang.Character)v).floatValue() :
					Js.mul(var(),  (java.lang.Number)v).floatValue()
			);
			return this;
		}

		/**
		 * <p>Divides, by a numeric operand, the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-division operator in JavaScript.</p>
		 * <p>Used with non-numeric values, this operation attempts to convert them to 
		 * numbers. If you are used to programming languages that distinguish between integer 
		 * and floating-point numbers, you might expect to get an integer result when you 
		 * divide one integer by another. In JavaScript, however, all numbers are floating-point, 
		 * so all division operations have floating-point results. Division by zero yields positive 
		 * or negative infinity, while <tt>0/0</tt> evaluates to <tt>NaN</tt>.</p>
		 * @param value A value or object.
		 * @return The <tt>float</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p /= (float)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Float adiv(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.div(var(),  (java.lang.Character)v).floatValue() :
					Js.div(var(),  (java.lang.Number)v).floatValue()
			);
			return this;
		}

		/**
		 * <p>Modulo operates a numeric operand onto the current primitive instance and 
		 * returns the numeric operand, resembling the assignment-with-modulo operator in 
		 * JavaScript.</p>
		 * <p>The operation computes the remainder when the current primitive instance is 
		 * divided by the operand a certain number of times. If used with non-numeric values, 
		 * the operation attempts to convert them to numbers. The sign of the result is the 
		 * same as the sign of the current primitive instance.</p>
		 * <p>This operation is typically used with integer values, it also works for 
		 * floating-point values.</p>
		 * @param value A value or object.
		 * @return The <tt>float</tt> value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p %= (float)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Float amod(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.mod(var(),  (java.lang.Character)v).floatValue() :
					Js.mod(var(),  (java.lang.Number)v).floatValue()
			);
			return this;
		}

		/**
		 * <p>Assignment-with-shift-left operation, resembling that of JavaScript, moves all bits in the 
		 * current primitive instance to the left by the number of places specified in the 
		 * second operand, which should be an integer between 0 and 31.</p>
		 * <p>A zero is used for the new first bit, and the value of the 32nd bit is lost. 
		 * Shifting a value left by one position is equivalent to multiplying by 2, shifting 
		 * two positions is equivalent to multiplying by 4, etc.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p <<= n & 0x3f</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Float ashl(int n) {
			var((float)Js.shl(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-shift-right operation, resembling that of JavaScript, moves all bits in the 
		 * current primitive instance to the right by the number of places specified in the 
		 * second operand (an integer between 0 and 31). Bits that are shifted off the right 
		 * are lost. The bits filled in on the left depend on the sign bit of the original 
		 * value, in order to preserve the sign of the result. If the current primitive 
		 * instance is positive, the result has zeros placed in the high bits; if the current 
		 * primitive instance is negative, the result has ones placed in the high bits.</p>
		 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
		 * remainder), shifting right two places is equivalent to integer division by 4, and 
		 * so on.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p >>= n & 0x3f</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Float ashr(int n) {
			var((float)Js.shr(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-shift-right-unsigned operation, resembling that of JavaScript, moves all bits in 
		 * the current primitive instance to the right by the number of places specified in the 
		 * second operand (an integer between 0 and 31). Bits that are shifted off the right 
		 * are lost. The result has zeros placed in the high bits.</p>
		 * <p>This operation is just like {@link #shr(int)}, except that the bits shifted 
		 * in on the left are always zero, regardless of the sign of the current primitive instance.</p>
		 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
		 * remainder), shifting right two places is equivalent to integer division by 4, and 
		 * so on.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p >>>= n & 0x3f</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Float ashru(int n) {
			var((float)Js.shru(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-AND operation, resembling that of JavaScript, performs a boolean AND 
		 * operation on each bit of the integer arguments. A bit is set in the result only if 
		 * the corresponding bit is set in both operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-AND of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p &= (int)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Float aand(Object value) {
			var((float)Js.band(this, value));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-OR operation, resembling that of JavaScript, performs a boolean OR operation 
		 * on each bit of the integer arguments. A bit is set in the result if the corresponding 
		 * bit is set in one or both of the operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-OR of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p |= (int)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Float aor(Object value) {
			var((float)Js.bor(this, value));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-XOR operation, resembling that of JavaScript, performs a boolean exclusive 
		 * OR operation on each bit of the integer arguments. Exclusive OR means that either 
		 * operand one is <tt>true</tt> or operand two is <tt>true</tt>, but not both. A bit is 
		 * set in this operation's result if a corresponding bit is set in one (but not both) 
		 * of the two operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-exclusive-OR of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p ^= (int)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Float axor(Object value) {
			var((float)Js.xor(this, value));
			return this;
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Float and(java.lang.Float other) {
			return new Float(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Float and(Value<java.lang.Float> other) {
			return new Float(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Float and(Float other) {
			return new Float(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Float or(java.lang.Float other) {
			return new Float(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Float or(Value<java.lang.Float> other) {
			return new Float(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Float or(Float other) {
			return new Float(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Float cond(Object test, java.lang.Float other) {
			return Js.be(test) ? this : new Float(other);
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Float cond(Object test, Value<java.lang.Float> other) {
			return Js.be(test) ? this : new Float(other.var());
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Float cond(Object test, Float other) {
			return Js.be(test) ? this : other;
		}
	}

	/**
	 * <p>An <b>opaque</b> class resembling JavaScript primitive double number values.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 */
	public static class Double extends Numerical<java.lang.Double> implements NumberLike<java.lang.Double>
	{
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
		public static final class Member extends Value.Member<java.lang.Double>
		{
			/**
			 * <p>Internally constructs a member based on a qualifying member.</p>
			 * <p>This constructor  is <b>internal</b> and only called inside of <b>opaque</b> 
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
		}

		/**
		 * <p>Constructs a primitive <tt>double</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Double(java.lang.Double value) {
			super(value);
		}
		/**
		 * <p>Constructs a primitive <tt>double</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Double(Double value) {
			super(value == null ? null : value.var());
		}
		/**
		 * <p>Constructs a primitive <tt>double</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Double(java.lang.Long value) {
			super(value.doubleValue());
		}
		/**
		 * <p>Constructs a primitive <tt>double</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Double(Long value) {
			super(value.var().doubleValue());
		}
		/**
		 * <p>Constructs a primitive <tt>double</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Double(java.lang.Number value) {
			super(value == null ? null : value.doubleValue());
		}
		/**
		 * <p>Constructs a primitive <tt>double</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Double(Var<? extends java.lang.Number> value) {
			super(Js.undefined(value) ? null : value.var().doubleValue());
		}
		/**
		 * <p>Constructs a primitive <tt>double</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Double(java.lang.Character value) {
			super(value == null ? null : (double)value.charValue());
		}
		/**
		 * <p>Constructs a primitive <tt>double</tt> instance from a primitive value.</p>
		 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
		 * wrap primitive data types are also "primitive" to JS.</p>
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Double(Character value) {
			super(Js.undefined(value) ? null : (double)value.var().charValue());
		}

		/**
		 * <p>Returns the primitive value associated with the current instance, if there is one.</p>
		 * @return The primitive value associated with the current instance.
		 * @see #toString()
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method directly 
		 * into a JavaScript invocation on its current instance without changing the method 
		 * name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		@Override
		public final java.lang.Double valueOf() {
			return var();
		}

		/**
		 * <p>Performs unary negation, resembling the unary minus operator in JavaScript.</p>
		 * <p>This operation converts a positive value to an equivalently negative value, and 
		 * vice versa. If the operand is not a number, it attempts to convert it to one.</p>
		 * @return The negation of the current primitive instance.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>-p</pre>
		 * where <tt>p</tt> is the current primitive instance of the invocation of this 
		 * method.
		 */
		public final Double neg() {
			return new Double(Js.neg(this).doubleValue());
		}

		/**
		 * <p>Increases the current primitive instance by 1 and then returns the current 
		 * primitive instance, resembling the pre-increment operator in JavaScript.</p>
		 * @return The current primitive instance increased by 1.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>++p</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Double inc() {
			var(Js.add(var(), 1).doubleValue());
			return this;
		}

		/**
		 * <p>Decreases the current primitive instance by 1 and then returns the current 
		 * primitive instance, resembling the pre-decrement operator in JavaScript.</p>
		 * @return The current primitive instance increased by 1.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>--p</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Double dec() {
			var(Js.sub(var(), 1).doubleValue());
			return this;
		}

		/**
		 * <p>Returns a copy of the current primitive instance and then increases the 
		 * current primitive instance by 1, resembling the post-increment operator in 
		 * JavaScript.</p>
		 * @return A copy of the original primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p++</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Double incp() {
			java.lang.Double v = var();
			var(Js.add(v, 1).doubleValue());
			return this;
		}

		/**
		 * <p>Returns a copy of the current primitive instance and then decreases the 
		 * current primitive instance by 1, resembling the post-decrement operator in 
		 * JavaScript.</p>
		 * @return A copy of the undecremented primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p--</pre>
		 * where <tt>p</tt> is the primitive value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Double decp() {
			java.lang.Double v = var();
			var(Js.sub(v, 1).doubleValue());
			return this;
		}

		/**
		 * <p>Adds a numeric operand to the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-addition operator in JavaScript.</p>
		 * <p>If one value is a string, the other is converted to a string, and the two 
		 * strings are then concatenated. Object operands are converted to numbers or strings 
		 * that can be added or concatenated. The conversion is performed by {@link Js#valueOf(Object)}  
		 * method and/or the {@link Js#toString(Object)} method on the object.</p>
		 * @param value A value or object.
		 * @return The numeric value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p += value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Double aadd(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.add(var(),  (java.lang.Character)v).doubleValue() :
					Js.add(var(),  (java.lang.Number)v).doubleValue()
			);
			return this;
		}

		/**
		 * <p>Subtracts a numeric operand from the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-subtraction operator in JavaScript.</p>
		 * <p>If used with non-numeric values, this operation attempts to convert them to 
		 * numbers.</p>
		 * @param value A value or object.
		 * @return The numeric value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p -= value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Double asub(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.sub(var(),  (java.lang.Character)v).doubleValue() :
					Js.sub(var(),  (java.lang.Number)v).doubleValue()
			);
			return this;
		}

		/**
		 * <p>Multiplies a numeric operand to the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-multiplication operator in JavaScript.</p>
		 * <p>If used with non-numeric values, this operation attempts to convert them to 
		 * numbers.</p>
		 * @param value A value or object.
		 * @return The numeric value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p *= value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Double amul(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.mul(var(),  (java.lang.Character)v).doubleValue() :
					Js.mul(var(),  (java.lang.Number)v).doubleValue()
			);
			return this;
		}

		/**
		 * <p>Divides, by a numeric operand, the current primitive instance and returns the 
		 * numeric operand, resembling the assignment-with-division operator in JavaScript.</p>
		 * <p>Used with non-numeric values, this operation attempts to convert them to 
		 * numbers. If you are used to programming languages that distinguish between integer 
		 * and floating-point numbers, you might expect to get an integer result when you 
		 * divide one integer by another. In JavaScript, however, all numbers are floating-point, 
		 * so all division operations have floating-point results. Division by zero yields positive 
		 * or negative infinity, while <tt>0/0</tt> evaluates to <tt>NaN</tt>.</p>
		 * @param value A value or object.
		 * @return The numeric value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p /= value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Double adiv(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.div(var(),  (java.lang.Character)v).doubleValue() :
					Js.div(var(),  (java.lang.Number)v).doubleValue()
			);
			return this;
		}

		/**
		 * <p>Modulo operates a numeric operand onto the current primitive instance and 
		 * returns the numeric operand, resembling the assignment-with-modulo operator in 
		 * JavaScript.</p>
		 * <p>The operation computes the remainder when the current primitive instance is 
		 * divided by the operand a certain number of times. If used with non-numeric values, 
		 * the operation attempts to convert them to numbers. The sign of the result is the 
		 * same as the sign of the current primitive instance.</p>
		 * <p>This operation is typically used with integer values, it also works for 
		 * floating-point values.</p>
		 * @param value A value or object.
		 * @return The numeric value of the argument.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p %= value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Double amod(Object value) {
			Object v = Js.valueOf(value);
			var(v instanceof java.lang.Character ?
					Js.mod(var(),  (java.lang.Character)v).doubleValue() :
					Js.mod(var(),  (java.lang.Number)v).doubleValue()
			);
			return this;
		}

		/**
		 * <p>Assignment-with-shift-left operation, resembling that of JavaScript, moves all bits in the 
		 * current primitive instance to the left by the number of places specified in the 
		 * second operand, which should be an integer between 0 and 31.</p>
		 * <p>A zero is used for the new first bit, and the value of the 32nd bit is lost. 
		 * Shifting a value left by one position is equivalent to multiplying by 2, shifting 
		 * two positions is equivalent to multiplying by 4, etc.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p <<= n & 0x3f</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Double ashl(int n) {
			var((double)Js.shl(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-shift-right operation, resembling that of JavaScript, moves all bits in the 
		 * current primitive instance to the right by the number of places specified in the 
		 * second operand (an integer between 0 and 31). Bits that are shifted off the right 
		 * are lost. The bits filled in on the left depend on the sign bit of the original 
		 * value, in order to preserve the sign of the result. If the current primitive 
		 * instance is positive, the result has zeros placed in the high bits; if the current 
		 * primitive instance is negative, the result has ones placed in the high bits.</p>
		 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
		 * remainder), shifting right two places is equivalent to integer division by 4, and 
		 * so on.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p >>= n & 0x3f</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Double ashr(int n) {
			var((double)Js.shr(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-shift-right-unsigned operation, resembling that of JavaScript, moves all bits in 
		 * the current primitive instance to the right by the number of places specified in the 
		 * second operand (an integer between 0 and 31). Bits that are shifted off the right 
		 * are lost. The result has zeros placed in the high bits.</p>
		 * <p>This operation is just like {@link #shr(int)}, except that the bits shifted 
		 * in on the left are always zero, regardless of the sign of the current primitive instance.</p>
		 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
		 * remainder), shifting right two places is equivalent to integer division by 4, and 
		 * so on.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with values that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the values to 
		 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
		 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
		 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
		 * yields a number in the appropriate range.</p>
		 * @param n The number of bits to shift.
		 * @return The shifted primitive instance.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p >>>= n & 0x3f</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Double ashru(int n) {
			var((double)Js.shru(this, n));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-AND operation, resembling that of JavaScript, performs a boolean AND 
		 * operation on each bit of the integer arguments. A bit is set in the result only if 
		 * the corresponding bit is set in both operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-AND of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p &= (int)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Double aand(Object value) {
			var((double)Js.band(this, value));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-OR operation, resembling that of JavaScript, performs a boolean OR operation 
		 * on each bit of the integer arguments. A bit is set in the result if the corresponding 
		 * bit is set in one or both of the operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-OR of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p |= (int)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Double aor(Object value) {
			var((double)Js.bor(this, value));
			return this;
		}

		/**
		 * <p>Assignment-with-bitwise-XOR operation, resembling that of JavaScript, performs a boolean exclusive 
		 * OR operation on each bit of the integer arguments. Exclusive OR means that either 
		 * operand one is <tt>true</tt> or operand two is <tt>true</tt>, but not both. A bit is 
		 * set in this operation's result if a corresponding bit is set in one (but not both) 
		 * of the two operands.</p>
		 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
		 * operation requires numeric operands that have integer values. It operate on the integer 
		 * operands using a 32-bit integer representation instead of the equivalent floating-point 
		 * representation.</p>
		 * <p>If this bitwise operation is used with operands that are not integers or are too 
		 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
		 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
		 * the 32nd.</p>
		 * @param value A numeric value.
		 * @return The bitwise-exclusive-OR of the two operands.
		 * @since 1.0
		 * @javascript A re-compiler is expected to replace the instance invocation of this 
		 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
		 * <pre>p ^= (int)value</pre>
		 * where <tt>p</tt> is the integer value of the current primitive instance of the 
		 * invocation of this method.
		 */
		public final Double axor(Object value) {
			var((double)Js.xor(this, value));
			return this;
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Double and(java.lang.Double other) {
			return new Double(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Double and(Value<java.lang.Double> other) {
			return new Double(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Double and(Double other) {
			return new Double(Js.and(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Double or(java.lang.Double other) {
			return new Double(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Double or(Value<java.lang.Double> other) {
			return new Double(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Double or(Double other) {
			return new Double(Js.or(this, other));
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		@Override
		public final Double cond(Object test, java.lang.Double other) {
			return Js.be(test) ? this : new Double(other);
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Double cond(Object test, Value<java.lang.Double> other) {
			return Js.be(test) ? this : new Double(other.var());
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
		 * where <tt>p</tt> is the current primitive instance of the invocation of this method.
		 */
		public final Double cond(Object test, Double other) {
			return Js.be(test) ? this : other;
		}
	}
}
