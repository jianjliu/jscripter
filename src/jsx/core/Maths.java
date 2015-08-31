
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
 * <p>A utility class providing useful mathematical functions and constants with its 
 * static methods.</p>
 * <p>Users are encouraged to use the utilities provided by this class instead of the 
 * <b>opaque</b> methods of {@link js.MathLike} or {@link js.core.JsGlobal.Math} in 
 * consideration of the reuse benefit for re-compilation results.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see js.MathLike
 * @see js.core.JsGlobal.Math
 */

public final class Maths extends Disposable
{
	private Maths() {}

	/**
	 * The constant e, the base of the natural logarithm.
	 * @see js.MathLike#E
	 * @since 1.0
	 */
	public final static double E       = MathLike.E;
	/**
	 * The natural logarithm of 2.
	 * @see js.MathLike#LN2
	 * @since 1.0
	 */
	public final static double LN2     = MathLike.LN2;
	/**
	 * The natural logarithm of 10.
	 * @see js.MathLike#LN10
	 * @since 1.0
	 */
	public final static double LN10    = MathLike.LN10;
	/**
	 * The base-2 logarithm of e.
	 * @see js.MathLike#LOG2E
	 * @since 1.0
	 */
	public final static double LOG2E   = MathLike.LOG2E;
	/**
	 * The base-10 logarithm of e.
	 * @see js.MathLike#LOG10E
	 * @since 1.0
	 */
	public final static double LOG10E  = MathLike.LOG10E;
	/**
	 * The constant pi, the ratio of the circumference of a circle to its diameter. 
	 * It has a value of approximately 3.14159265358979.
	 * @see js.MathLike#PI
	 * @since 1.0
	 */
	public final static double PI      = MathLike.PI;
	/**
	 * The square root of 2.
	 * @see js.MathLike#SQRT2
	 * @since 1.0
	 */
	public final static double SQRT2   = MathLike.SQRT2;
	/**
	 * The reciprocal of the square root of 2, that is, 
	 * the number 1 divided by the square root of 2.
	 * @see js.MathLike#SQRT1_2
	 * @since 1.0
	 */
	public final static double SQRT1_2 = MathLike.SQRT1_2;

	/**
	 * <p>Computes an absolute value.</p>
	 * @param x Any number.
	 * @return The absolute value of <code>x</code>.
	 * @see js.MathLike#abs(Object)
	 * @see js.core.JsGlobal.Math#abs(Object)
	 * @since 1.0
	 */
	public static final double abs(Object x) {
		return Js.math().abs(x);
	}
	/**
	 * <p>Computes an arccosine.</p>
	 * @param x A number between -1.0 and 1.0.
	 * @return The arccosine, or inverse cosine, of the specified value <code>x</code>. 
	 * This return value is between 0 and pi radians.
	 * @see js.MathLike#acos(Object)
	 * @see js.core.JsGlobal.Math#acos(Object)
	 * @since 1.0
	 */
	public static final double acos(Object x) {
		return Js.math().acos(x);
	}
	/**
	 * <p>Computes an arcsine.</p>
	 * @param x A number between -1.0 and 1.0.
	 * @return The arcsine, or inverse cosine, of the specified value <code>x</code>. 
	 * This return value is between -pi/2 and pi/2 radians.
	 * @see js.MathLike#asin(Object)
	 * @see js.core.JsGlobal.Math#asin(Object)
	 * @since 1.0
	 */
	public static final double asin(Object x) {
		return Js.math().asin(x);
	}
	/**
	 * <p>Computes an arctangent.</p>
	 * @param x Any number.
	 * @return The arc tanget of the specified value <code>x</code>. This return value is 
	 * between -pi/2 and pi/2 radians.
	 * @see js.MathLike#atan(Object)
	 * @see js.core.JsGlobal.Math#atan(Object)
	 * @since 1.0
	 */
	public static final double atan(Object x) {
		return Js.math().atan(x);
	}
	/**
	 * <p>Computes the arc tangent of the ratio <code>y/x</code>. The <code>y</code> 
	 * argument can be considered the Y coordinate (or "rise") of a point, and the 
	 * <code>x</code> argument can be considered the X coordinate (or "run") of the point. 
	 * Note the unusual order of the arguments to this function: the Y coordinate is 
	 * passed before the X coordinate.</p>
	 * @param y The Y coordinate of the point.
	 * @param x The X coordinate of the point.
	 * @return A value between -pi and pi radians that specifies the counterclockwise angle 
	 * between the positive X axis and the point <code>(x, y)</code>.
	 * @see js.MathLike#atan2(Object, Object)
	 * @see js.core.JsGlobal.Math#atan2(Object, Object)
	 * @since 1.0
	 */
	public static final double atan2(Object y, Object x) {
		return Js.math().atan2(y, x);
	}
	/**
	 * <p>Rounds a number up.</p>
	 * @param x Any numeric value or expression.
	 * @return TThe closest integer greater than or equal to <code>x</code>.
	 * @see js.MathLike#ceil(Object)
	 * @see js.core.JsGlobal.Math#ceil(Object)
	 * @since 1.0
	 */
	public static final double ceil(Object x) {
		return Js.math().ceil(x);
	}
	/**
	 * <p>Computes a cosine.</p>
	 * @param x An angle, measured in radians. 
	 * To convert degrees to radians, multiply the degree value by 0.017453293 (2pi/360).
	 * @return The cosine of the specified value <code>x</code>. This return value is 
	 * between -1.0 and 1.0.
	 * @see js.MathLike#cos(Object)
	 * @see js.core.JsGlobal.Math#cos(Object)
	 * @since 1.0
	 */
	public static final double cos(Object x) {
		return Js.math().cos(x);
	}
	/**
	 * <p>Computes a power of e.</p>
	 * @param x A numeric value or expression to be used as the exponent.
	 * @return e raised to the power of the specified exponent <code>x</code>, where e 
	 * is the base of the natural logarithm, with a value of approximately 2.71828.
	 * @see js.MathLike#exp(Object)
	 * @see js.core.JsGlobal.Math#exp(Object)
	 * @since 1.0
	 */
	public static final double exp(Object x) {
		return Js.math().exp(x);
	}
	/**
	 * <p>Rounds a number down.</p>
	 * <p>This function computes the floor function. In other words, it returns the 
	 * nearest integer value that is less than or equal to the function argument.</p>
	 * <p>This function rounds a floating-point value down to the closest integer. 
	 * This behavior differs from that of {@link #round(Object)}, which rounds up or 
	 * down to the nearest integer. Also note that this function rounds negative 
	 * numbers down (that is, to be more negative), not up (that is, closer to zero).</p>
	 * @param x Any numeric value or expression.
	 * @return The closest integer less than or equal to <code>x</code>.
	 * @see js.MathLike#floor(Object)
	 * @see js.core.JsGlobal.Math#floor(Object)
	 * @since 1.0
	 */
	public static final double floor(Object x) {
		return Js.math().floor(x);
	}
	/**
	 * <p>Computes a natural logarithm.</p>
	 * @param x Any numeric value or expression greater than zero.
	 * @return The natural logarithm of <code>x</code>.
	 * @see js.MathLike#log(Object)
	 * @see js.core.JsGlobal.Math#log(Object)
	 * @since 1.0
	 */
	public static final double log(Object x) {
		return Js.math().log(x);
	}
	public static final double log2(Object x) {
		return MathLike.LOG2E * log(x);
	}
	public static final double log10(Object x) {
		return MathLike.LOG10E * log(x);
	}
	public static final Number constrain(Object v, Object min, Object max) {
		return max(min(v, max), min);
	}
	/**
	 * <p>Returns the larger of two numbers.</p>
	 * @param x Any value.
	 * @param y Any value.
	 * @return The larger of the two arguments. Returns <code>-Infinity</code> if 
	 * the arguments are all undefined. Returns <code>NaN</code> if any of the arguments is 
	 * <code>NaN</code> or is a non-numeric value that cannot be converted to a number.
	 * @see js.MathLike#max(Object, Object)
	 * @see js.core.JsGlobal.Math#max(Object, Object)
	 * @since 1.0
	 */
	public static final Number max(Object x, Object y) {
		return Js.math().max(x, y);
	}
	/**
	 * <p>Returns the smaller of two numbers.</p>
	 * @param x Any value.
	 * @param y Any value.
	 * @return The smaller of the two arguments. Returns <code>-Infinity</code> if 
	 * the arguments are all undefined. Returns <code>NaN</code> if any of the arguments is 
	 * <code>NaN</code> or is a non-numeric value that cannot be converted to a number.
	 * @see js.MathLike#min(Object, Object)
	 * @see js.core.JsGlobal.Math#min(Object, Object)
	 * @since 1.0
	 */
	public static final Number min(Object x, Object y) {
		return Js.math().min(x, y);
	}
	/**
	 * <p>Computes <code>x</code> to the power of <code>y</code>.</p>
	 * <p>Any values of x and y may be passed to this function. However, if the result is 
	 * an imaginary or complex number, it returns <code>NaN</code>. In practice, this 
	 * means that if <code>x</code> is negative, <code>y</code> should be a positive or 
	 * negative integer. Also, bear in mind that large exponents can easily cause 
	 * floating-point overflow and return a value of <code>Infinity</code>.</p>
	 * @param x The number to be raised to a power.
	 * @param y The power that x is to be raised to.
	 * @return <code>x</code> to the power of <code>y</code>.
	 * @see js.MathLike#pow(Object, Object)
	 * @see js.core.JsGlobal.Math#pow(Object, Object)
	 * @since 1.0
	 */
	public static final double pow(Object x, Object y) {
		return Js.math().pow(x, y);
	}
	/**
	 * <p>Computes a random number.</p>
	 * @return A pseudo-random number between 0.0 and 1.0.
	 * @see js.MathLike#random()
	 * @see js.core.JsGlobal.Math#random()
	 * @since 1.0
	 */
	public static final double random() {
		return Js.math().random();
	}
	/**
	 * <p>Rounds to the nearest integer.</p>
	 * <p>This invocation rounds its argument up or down to the nearest integer. 
	 * It rounds .5 up. For example, it rounds 1.5 to 2 and rounds -1.5 to -1.</p>
	 * @param x Any number.
	 * @return The integer closest to <code>x</code>.
	 * @see js.MathLike#round(Object)
	 * @see js.core.JsGlobal.Math#round(Object)
	 * @since 1.0
	 */
	public static final double round(Object x) {
		return Js.math().round(x);
	}
	/**
	 * <p>Computes a sine.</p>
	 * @param x Any number.
	 * @return The sine of <code>x</code>. This return value is between -1.0 and 1.0.
	 * @see js.MathLike#sin(Object)
	 * @see js.core.JsGlobal.Math#sin(Object)
	 * @since 1.0
	 */
	public static final double sin(Object x) {
		return Js.math().sin(x);
	}
	/**
	 * <p>Computes a hyperbolic sine.</p>
	 * @param x Any number.
	 * @return The hyperbolic sine of <code>x</code>.
	 * @see js.MathLike#sinh(Object)
	 * @see js.core.JsGlobal.Math#sinh(Object)
	 * @since 1.0
	 */
	public static final double sinh(Object x) {
		return Js.math().sinh(x);
	}
	/**
	 * <p>Computes a square root.</p>
	 * <p>Note that you can compute arbitrary roots of a number with {@link #pow(Object, Object)}. </p>
	 * @param x A numeric value greater than or equal to zero.
	 * @return The square root of <code>x</code>. Returns <code>NaN</code> if 
	 * <code>x</code> is less than zero.
	 * @see js.MathLike#sqrt(Object)
	 * @see js.core.JsGlobal.Math#sqrt(Object)
	 * @since 1.0
	 */
	public static final double sqrt(Object x) {
		return Js.math().sqrt(x);
	}
	/**
	 * <p>Computes a tangent.</p>
	 * @param x An angle, measured in radians. To convert degrees to radians, 
	 * multiply the degree value by 0.017453293 (2pi/360).
	 * @return The tangent of the specified angle <code>x</code>.
	 * @see js.MathLike#tan(Object)
	 * @see js.core.JsGlobal.Math#tan(Object)
	 * @since 1.0
	 */
	public static final double tan(Object x) {
		return Js.math().tan(x);
	}
	/**
	 * <p>Computes a hyperbolic tangent.</p>
	 * @param x Any number.
	 * @return The hyperbolic tangent of <code>x</code>.
	 * @see js.MathLike#tanh(Object)
	 * @see js.core.JsGlobal.Math#tanh(Object)
	 * @since 1.0
	 */
	public static final double tanh(Object x) {
		return Js.math().tanh(x);
	}
}
