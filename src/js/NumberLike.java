
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

/**
 * <p>An <b>opaque</b> interface representing JavaScript numbers.</p>
 * <p>This interface must be implemented in JS Simulation Libraries.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see Js#number(String)
 * @see js.core.JsNumber#JsNumber(js.core.JsObject)
 * @see js.core.JsNumber#JsNumber(Number)
 * @see js.core.JsNumber#JsNumber(Value)
 * @see js.core.JsGlobal.Number#create(Object)
 * @see jsx.core.NumberLikes
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public interface NumberLike<T extends Number>
{
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current number instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String toExponential();
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current number instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String toExponential(Object digits);
	/**
	 * <p>Converts the current number to a string without digits after the decimal place.</p>
	 * @return A string representation of the current number that does not use exponential 
	 * notation and has no digits after the decimal place. The number is rounded if 
	 * necessary. If the current number is greater than 1e+21, this method simply calls 
	 * {@link #toString()} and returns a string in exponential notation.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
	 * {@link js.core.JsTypeError} for JS Simulation.
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current number instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String toFixed();
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current number instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String toFixed(Object digits);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current number instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String toPrecision();
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current number instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String toPrecision(Object precision);
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
	 * @see jsx.core.NumberLikes#toLocaleString(NumberLike)
	 * @see jsx.core.NumberLikes#toLocaleString(Number)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current number instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String toLocaleString();
	/**
	 * <p>Converts the current number to a base-10 string.</p> 
	 * @return A base-10 string representation of the current number.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
	 * {@link js.core.JsTypeError} for JS Simulation.
	 * @see #toString(Object)
	 * @see #toExponential()
	 * @see #toExponential(Object)
	 * @see #toFixed()
	 * @see #toFixed(Object)
	 * @see #toPrecision()
	 * @see #toPrecision(Object)
	 * @see #toLocaleString()
	 * @see jsx.core.NumberLikes#toString(NumberLike)
	 * @see jsx.core.NumberLikes#toString(Number)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current number instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String toString();
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
	 * @see jsx.core.NumberLikes#toString(NumberLike, Object)
	 * @see jsx.core.NumberLikes#toString(Number, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current number instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String toString(Object radix);
	/**
	 * <p>Returns a string indicating the data-type of the current instance.</p>
	 * <p>Simulating the JavaScript <tt>typeof</tt> operator and <tt>typeof()</tt> 
	 * function, this invocation evaluates to "number", "string", or "boolean" if the current 
	 * instance is a number, string, or boolean value. It evaluates to "object" for objects, 
	 * arrays. It evaluates to "function" for function instance and to "undefined" if the 
	 * current instance is undefined.</p>
	 * @return A string indicating the data-type of the instance.
	 * @see #valueOf()
	 * @see #undefined()
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>typeof n</pre>
	 * where <tt>n</tt> is the current number instance of this invocation.
	 */
	public String typeof();
	/**
	 * <p>Checks if the current instance is undefined.</p>
	 * @return <tt>true</tt> if the current instance is undefined; <tt>false</tt> otherwise.
	 * @see #valueOf()
	 * @see #undefined()
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>(n === undefined)</pre>
	 * where <tt>n</tt> is the current number instance of this invocation.
	 */
	public boolean undefined();
	/**
	 * <p>Returns the primitive value associated with the current instance, if there is one. 
	 * This invocation returns the primitive number value associated with the current instance.</p>
	 * @return The primitive number value associated with the current instance.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
	 * {@link js.core.JsTypeError} for JS Simulation.
	 * @see #toString()
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current number instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public T valueOf();
}
