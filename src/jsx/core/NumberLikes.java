
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

package jsx.core;

import js.*;

/**
 * <p>A utility class providing basic number operations with its static methods.</p>
 * <p>Users are encouraged to use the utilities provided by this class instead of the 
 * <b>opaque</b> methods of {@link js.NumberLike}, {@link js.core.JsNumber} or 
 * {@link js.Value.Number} in consideration of the reuse benefit for re-compilation 
 * results.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class NumberLikes extends Disposable
{
	private NumberLikes() {}

	/**
	 * <p>Converts the current number to a string using exponential notation.</p>
	 * @param n The current number.
	 * @return A string representation of the current number, in exponential notation. The 
	 * fractional part of the number is rounded, or padded with zeros, as necessary, so that 
	 * it has the specified length.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
	 * {@link js.core.JsTypeError} for JS Simulation.
	 * @see #toExponential(js.NumberLike, Object)
	 * @see #toFixed(js.NumberLike)
	 * @see #toFixed(js.NumberLike, Object)
	 * @see #toLocaleString(js.NumberLike)
	 * @see #toPrecision(js.NumberLike)
	 * @see #toPrecision(js.NumberLike, Object)
	 * @see #toString(js.NumberLike)
	 * @see #toString(js.NumberLike, Object)
	 * @see js.NumberLike#toExponential()
	 * @since 1.0
	 */
	public static final String toExponential(NumberLike<?> n) {
		return n.toExponential();
	}
	/**
	 * <p>Converts the current number to a string using exponential notation.</p>
	 * @param n The current number.
	 * @return A string representation of the current number, in exponential notation. The 
	 * fractional part of the number is rounded, or padded with zeros, as necessary, so that 
	 * it has the specified length.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
	 * {@link js.core.JsTypeError} for JS Simulation.
	 * @see #toExponential(Number, Object)
	 * @see #toFixed(Number)
	 * @see #toFixed(Number, Object)
	 * @see #toLocaleString(Number)
	 * @see #toPrecision(Number)
	 * @see #toPrecision(Number, Object)
	 * @see #toString(Number)
	 * @see #toString(Number, Object)
	 * @see js.Value.Number#toExponential()
	 * @since 1.0
	 */
	public static final String toExponential(Number n) {
		return new Value.Number(n).toExponential();
	}
	/**
	 * <p>Converts the current number to a string using exponential notation with the 
	 * specified number of digits after the decimal place.</p>
	 * @param n The current number.
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
	 * @see #toExponential(js.NumberLike)
	 * @see #toFixed(js.NumberLike)
	 * @see #toFixed(js.NumberLike, Object)
	 * @see #toLocaleString(js.NumberLike)
	 * @see #toPrecision(js.NumberLike)
	 * @see #toPrecision(js.NumberLike, Object)
	 * @see #toString(js.NumberLike)
	 * @see #toString(js.NumberLike, Object)
	 * @see js.NumberLike#toExponential(Object)
	 * @since 1.0
	 */
	public static final String toExponential(NumberLike<?> n, Object digits) {
		return n.toExponential(digits);
	}
	/**
	 * <p>Converts the current number to a string using exponential notation with the 
	 * specified number of digits after the decimal place.</p>
	 * @param n The current number.
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
	 * @see #toExponential(Number)
	 * @see #toFixed(Number)
	 * @see #toFixed(Number, Object)
	 * @see #toLocaleString(Number)
	 * @see #toPrecision(Number)
	 * @see #toPrecision(Number, Object)
	 * @see #toString(Number)
	 * @see #toString(Number, Object)
	 * @see js.Value.Number#toExponential(Object)
	 * @since 1.0
	 */
	public static final String toExponential(Number n, Object digits) {
		return new Value.Number(n).toExponential(digits);
	}
	/**
	 * <p>Converts the current number to a string without digits after the decimal place.</p>
	 * @param n The current number.
	 * @return A string representation of the current number that does not use exponential 
	 * notation and has no digits after the decimal place. The number is rounded if 
	 * necessary. If the current number is greater than 1e+21, this method simply calls 
	 * {@link js.DateLike#toString()} and returns a string in exponential notation.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
	 * {@link js.core.JsTypeError} for JS Simulation.
	 * @see #toFixed(js.NumberLike, Object)
	 * @see #toExponential(js.NumberLike)
	 * @see #toExponential(js.NumberLike, Object)
	 * @see #toLocaleString(js.NumberLike)
	 * @see #toPrecision(js.NumberLike)
	 * @see #toPrecision(js.NumberLike, Object)
	 * @see #toString(js.NumberLike)
	 * @see #toString(js.NumberLike, Object)
	 * @see js.NumberLike#toFixed()
	 * @since 1.0
	 */
	public static final String toFixed(NumberLike<?> n) {
		return n.toFixed();
	}
	/**
	 * <p>Converts the current number to a string without digits after the decimal place.</p>
	 * @param n The current number.
	 * @return A string representation of the current number that does not use exponential 
	 * notation and has no digits after the decimal place. The number is rounded if 
	 * necessary. If the current number is greater than 1e+21, this method simply calls 
	 * {@link js.DateLike#toString()} and returns a string in exponential notation.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
	 * {@link js.core.JsTypeError} for JS Simulation.
	 * @see #toFixed(Number, Object)
	 * @see #toExponential(Number)
	 * @see #toExponential(Number, Object)
	 * @see #toLocaleString(Number)
	 * @see #toPrecision(Number)
	 * @see #toPrecision(Number, Object)
	 * @see #toString(Number)
	 * @see #toString(Number, Object)
	 * @see js.Value.Number#toFixed()
	 * @since 1.0
	 */
	public static final String toFixed(Number n) {
		return new Value.Number(n).toFixed();
	}
	/**
	 * <p>Converts the current number to a string that contains a specified number of 
	 * digits after the decimal place.</p>
	 * @param n The current number.
	 * @param digits The number of digits to appear after the decimal point; this may be a 
	 * value between 0 and 20, inclusive, and implementations may optionally support a 
	 * larger range of values. If this argument is undefined, it is treated as 0.
	 * @return A string representation of the current number that does not use exponential 
	 * notation and has exactly <tt>digits</tt> digits after the decimal place. The number 
	 * is rounded if necessary, and the fractional part is padded with zeros if necessary so 
	 * that it has the specified length. If the current number is greater than 1e+21, this 
	 * method simply calls {@link js.NumberLike#toString()} and returns a string in exponential 
	 * notation.
	 * @throws RuntimeException JavaScript throws a <tt>RangeError</tt> if 
	 * <tt>digits</tt> is too small or too large. See {@link Js#err(Object)} and 
	 * {@link js.core.JsRangeError} for JS Simulation. Values between 0 and 20, inclusive, 
	 * will not cause a <tt>RangeError</tt>. Implementations are allowed to support 
	 * larger and smaller values as well.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
	 * {@link js.core.JsTypeError} for JS Simulation.
	 * @see #toFixed(js.NumberLike)
	 * @see #toExponential(js.NumberLike)
	 * @see #toExponential(js.NumberLike, Object)
	 * @see #toLocaleString(js.NumberLike)
	 * @see #toPrecision(js.NumberLike)
	 * @see #toPrecision(js.NumberLike, Object)
	 * @see #toString(js.NumberLike)
	 * @see #toString(js.NumberLike, Object)
	 * @see js.NumberLike#toFixed(Object)
	 * @since 1.0
	 */
	public static final String toFixed(NumberLike<?> n, Object digits) {
		return n.toFixed(digits);
	}
	/**
	 * <p>Converts the current number to a string that contains a specified number of 
	 * digits after the decimal place.</p>
	 * @param n The current number.
	 * @param digits The number of digits to appear after the decimal point; this may be a 
	 * value between 0 and 20, inclusive, and implementations may optionally support a 
	 * larger range of values. If this argument is undefined, it is treated as 0.
	 * @return A string representation of the current number that does not use exponential 
	 * notation and has exactly <tt>digits</tt> digits after the decimal place. The number 
	 * is rounded if necessary, and the fractional part is padded with zeros if necessary so 
	 * that it has the specified length. If the current number is greater than 1e+21, this 
	 * method simply calls {@link js.NumberLike#toString()} and returns a string in exponential 
	 * notation.
	 * @throws RuntimeException JavaScript throws a <tt>RangeError</tt> if 
	 * <tt>digits</tt> is too small or too large. See {@link Js#err(Object)} and 
	 * {@link js.core.JsRangeError} for JS Simulation. Values between 0 and 20, inclusive, 
	 * will not cause a <tt>RangeError</tt>. Implementations are allowed to support 
	 * larger and smaller values as well.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
	 * {@link js.core.JsTypeError} for JS Simulation.
	 * @see #toFixed(Number)
	 * @see #toExponential(Number)
	 * @see #toExponential(Number, Object)
	 * @see #toLocaleString(Number)
	 * @see #toPrecision(Number)
	 * @see #toPrecision(Number, Object)
	 * @see #toString(Number)
	 * @see #toString(Number, Object)
	 * @see js.Value.Number#toFixed(Object)
	 * @since 1.0
	 */
	public static final String toFixed(Number n, Object digits) {
		return new Value.Number(n).toFixed(digits);
	}
	/**
	 * <p>Converts the current number to a string.</p>
	 * <p>This method simply calls {@link js.NumberLike#toString()} to convert the number to a base-10 
	 * value.</p>
	 * @param n The current number.
	 * @return A string representation of the current number. The number is rounded or 
	 * padded with zeros as necessary.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
	 * {@link js.core.JsTypeError} for JS Simulation.
	 * @see #toPrecision(js.NumberLike, Object)
	 * @see #toExponential(js.NumberLike)
	 * @see #toExponential(js.NumberLike, Object)
	 * @see #toFixed(js.NumberLike)
	 * @see #toFixed(js.NumberLike, Object)
	 * @see #toLocaleString(js.NumberLike)
	 * @see #toString(js.NumberLike)
	 * @see #toString(js.NumberLike, Object)
	 * @see js.NumberLike#toPrecision()
	 * @since 1.0
	 */
	public static final String toPrecision(NumberLike<?> n) {
		return n.toPrecision();
	}
	/**
	 * <p>Converts the current number to a string.</p>
	 * <p>This method simply calls {@link js.NumberLike#toString()} to convert the number to a base-10 
	 * value.</p>
	 * @param n The current number.
	 * @return A string representation of the current number. The number is rounded or 
	 * padded with zeros as necessary.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
	 * {@link js.core.JsTypeError} for JS Simulation.
	 * @see #toPrecision(Number, Object)
	 * @see #toExponential(Number)
	 * @see #toExponential(Number, Object)
	 * @see #toFixed(Number)
	 * @see #toFixed(Number, Object)
	 * @see #toLocaleString(Number)
	 * @see #toString(Number)
	 * @see #toString(Number, Object)
	 * @see js.Value.Number#toPrecision()
	 * @since 1.0
	 */
	public static final String toPrecision(Number n) {
		return new Value.Number(n).toPrecision();
	}
	/**
	 * <p>Converts the current number to a string using the specified number of significant 
	 * digits. Uses exponential or fixed-point notation depending on the size of the number 
	 * and the number of significant digits specified.</p>
	 * @param n The current number.
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
	 * @see #toPrecision(js.NumberLike)
	 * @see #toExponential(js.NumberLike)
	 * @see #toExponential(js.NumberLike, Object)
	 * @see #toFixed(js.NumberLike)
	 * @see #toFixed(js.NumberLike, Object)
	 * @see #toLocaleString(js.NumberLike)
	 * @see #toString(js.NumberLike)
	 * @see #toString(js.NumberLike, Object)
	 * @see js.NumberLike#toPrecision(Object)
	 * @since 1.0
	 */
	public static final String toPrecision(NumberLike<?> n, Object precision) {
		return n.toPrecision(precision);
	}
	/**
	 * <p>Converts the current number to a string using the specified number of significant 
	 * digits. Uses exponential or fixed-point notation depending on the size of the number 
	 * and the number of significant digits specified.</p>
	 * @param n The current number.
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
	 * @see #toPrecision(Number)
	 * @see #toExponential(Number)
	 * @see #toExponential(Number, Object)
	 * @see #toFixed(Number)
	 * @see #toFixed(Number, Object)
	 * @see #toLocaleString(Number)
	 * @see #toString(Number)
	 * @see #toString(Number, Object)
	 * @see js.Value.Number#toPrecision(Object)
	 * @since 1.0
	 */
	public static final String toPrecision(Number n, Object precision) {
		return new Value.Number(n).toPrecision(precision);
	}
	/**
	 * <p>Converts the current number to a string using local number-formatting conventions.</p> 
	 * @param n The current number.
	 * @return An implementation-dependent string representation of the current number, 
	 * formatted according to local conventions, which may affect such things as the 
	 * punctuation characters used for the decimal point and the thousands separator.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
	 * {@link js.core.JsTypeError} for JS Simulation.
	 * @see #toString(js.NumberLike)
	 * @see #toString(js.NumberLike, Object)
	 * @see #toExponential(js.NumberLike)
	 * @see #toExponential(js.NumberLike, Object)
	 * @see #toFixed(js.NumberLike)
	 * @see #toFixed(js.NumberLike, Object)
	 * @see #toPrecision(js.NumberLike)
	 * @see #toPrecision(js.NumberLike, Object)
	 * @see js.NumberLike#toLocaleString()
	 * @since 1.0
	 */
	public static final String toLocaleString(NumberLike<?> n) {
		return n.toLocaleString();
	}
	/**
	 * <p>Converts the current number to a string using local number-formatting conventions.</p> 
	 * @param n The current number.
	 * @return An implementation-dependent string representation of the current number, 
	 * formatted according to local conventions, which may affect such things as the 
	 * punctuation characters used for the decimal point and the thousands separator.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
	 * {@link js.core.JsTypeError} for JS Simulation.
	 * @see #toString(Number)
	 * @see #toString(Number, Object)
	 * @see #toExponential(Number)
	 * @see #toExponential(Number, Object)
	 * @see #toFixed(Number)
	 * @see #toFixed(Number, Object)
	 * @see #toPrecision(Number)
	 * @see #toPrecision(Number, Object)
	 * @see js.Value.Number#toLocaleString()
	 * @since 1.0
	 */
	public static final String toLocaleString(Number n) {
		return new Value.Number(n).toLocaleString();
	}
	/**
	 * <p>Converts the current number to a base-10 string.</p> 
	 * @param n The current number.
	 * @return A base-10 string representation of the current number.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
	 * {@link js.core.JsTypeError} for JS Simulation.
	 * @see #toString(js.NumberLike, Object)
	 * @see #toExponential(js.NumberLike)
	 * @see #toExponential(js.NumberLike, Object)
	 * @see #toFixed(js.NumberLike)
	 * @see #toFixed(js.NumberLike, Object)
	 * @see #toPrecision(js.NumberLike)
	 * @see #toPrecision(js.NumberLike, Object)
	 * @see #toLocaleString(js.NumberLike)
	 * @see js.NumberLike#toString()
	 * @since 1.0
	 */
	public static final String toString(NumberLike<?> n) {
		return n.toString();
	}
	/**
	 * <p>Converts the current number to a base-10 string.</p> 
	 * @param n The current number.
	 * @return A base-10 string representation of the current number.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
	 * {@link js.core.JsTypeError} for JS Simulation.
	 * @see #toString(Number, Object)
	 * @see #toExponential(Number)
	 * @see #toExponential(Number, Object)
	 * @see #toFixed(Number)
	 * @see #toFixed(Number, Object)
	 * @see #toPrecision(Number)
	 * @see #toPrecision(Number, Object)
	 * @see #toLocaleString(Number)
	 * @see js.Value.Number#toString()
	 * @since 1.0
	 */
	public static final String toString(Number n) {
		return new Value.Number(n).toString();
	}
	/**
	 * <p>Converts the current number to a string. When the <tt>radix</tt> argument is 
	 * undefined or is specified as 10, the number is converted to a base-10 string.</p> 
	 * <p>Although the ECMAScript specification does not require implementations to honor 
	 * any other values for radix, all implementations in common use accept values between 
	 * 2 and 36.</p>
	 * @param n The current number.
	 * @param radix An optional argument that specifies the radix, or base, between 2 and 36, 
	 * in which the number should be represented. If undefined, base 10 is used. Note, 
	 * however, that the ECMAScript specification allows an implementation to return any 
	 * value if this argument is specified as any value other than 10.
	 * @return A string representation of the current number, in the specified base.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
	 * {@link js.core.JsTypeError} for JS Simulation.
	 * @see #toString(js.NumberLike)
	 * @see #toExponential(js.NumberLike)
	 * @see #toExponential(js.NumberLike, Object)
	 * @see #toFixed(js.NumberLike)
	 * @see #toFixed(js.NumberLike, Object)
	 * @see #toPrecision(js.NumberLike)
	 * @see #toPrecision(js.NumberLike, Object)
	 * @see #toLocaleString(js.NumberLike)
	 * @see js.NumberLike#toString(Object)
	 * @since 1.0
	 */
	public static final String toString(NumberLike<?> n, Object radix) {
		return n.toString(radix);
	}
	/**
	 * <p>Converts the current number to a string. When the <tt>radix</tt> argument is 
	 * undefined or is specified as 10, the number is converted to a base-10 string.</p> 
	 * <p>Although the ECMAScript specification does not require implementations to honor 
	 * any other values for radix, all implementations in common use accept values between 
	 * 2 and 36.</p>
	 * @param n The current number.
	 * @param radix An optional argument that specifies the radix, or base, between 2 and 36, 
	 * in which the number should be represented. If undefined, base 10 is used. Note, 
	 * however, that the ECMAScript specification allows an implementation to return any 
	 * value if this argument is specified as any value other than 10.
	 * @return A string representation of the current number, in the specified base.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked on an instance that is not a number. See {@link Js#err(Object)} and 
	 * {@link js.core.JsTypeError} for JS Simulation.
	 * @see #toString(Number)
	 * @see #toExponential(Number)
	 * @see #toExponential(Number, Object)
	 * @see #toFixed(Number)
	 * @see #toFixed(Number, Object)
	 * @see #toPrecision(Number)
	 * @see #toPrecision(Number, Object)
	 * @see #toLocaleString(Number)
	 * @see js.Value.Number#toString(Object)
	 * @since 1.0
	 */
	public static final String toString(Number n, Object radix) {
		return new Value.Number(n).toString(radix);
	}
}
