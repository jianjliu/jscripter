
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
 * <p>An <b>opaque</b> interface resembling JavaScript Math object and providing constants 
 * and interfaces of useful mathematical functions.</p>
 * <p>This interface must be implemented in JS Simulation Libraries.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see Js#math()
 * @see js.core.JsGlobal.Math
 * @see jsx.core.Maths
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */

public interface MathLike
{
	/**
	 * The constant e, the base of the natural logarithm.
	 * @see jsx.core.Maths#E
	 * @since 1.0
	 * @javascript Re-compilers must convert the static reference to this field into the 
	 * JavaScript expression: 
	 * <pre>Math.E</pre>
	 */
	public final static double E       = Math.E;
	/**
	 * The natural logarithm of 2.
	 * @see jsx.core.Maths#LN2
	 * @since 1.0
	 * @javascript Re-compilers must convert the static reference to this field into the 
	 * JavaScript expression: 
	 * <pre>Math.LN2</pre>
	 */
	public final static double LN2     = Math.log(2);
	/**
	 * The natural logarithm of 10.
	 * @see jsx.core.Maths#LN10
	 * @since 1.0
	 * @javascript Re-compilers must convert the static reference to this field into the 
	 * JavaScript expression: 
	 * <pre>Math.LN10</pre>
	 */
	public final static double LN10    = Math.log(10);
	/**
	 * The base-2 logarithm of e.
	 * @see jsx.core.Maths#LOG2E
	 * @since 1.0
	 * @javascript Re-compilers must convert the static reference to this field into the 
	 * JavaScript expression: 
	 * <pre>Math.LOG2E</pre>
	 */
	public final static double LOG2E   = 1 / LN2;
	/**
	 * The base-10 logarithm of e.
	 * @see jsx.core.Maths#LOG10E
	 * @since 1.0
	 * @javascript Re-compilers must convert the static reference to this field into the 
	 * JavaScript expression: 
	 * <pre>Math.LOG10E</pre>
	 */
	public final static double LOG10E  = 1 / LN10;
	/**
	 * The constant pi, the ratio of the circumference of a circle to its diameter. 
	 * It has a value of approximately 3.14159265358979.
	 * @see jsx.core.Maths#PI
	 * @since 1.0
	 * @javascript Re-compilers must convert the static reference to this field into the 
	 * JavaScript expression: 
	 * <pre>Math.PI</pre>
	 */
	public final static double PI      = Math.PI;
	/**
	 * The square root of 2.
	 * @see jsx.core.Maths#SQRT2
	 * @since 1.0
	 * @javascript Re-compilers must convert the static reference to this field into the 
	 * JavaScript expression: 
	 * <pre>Math.SQRT2</pre>
	 */
	public final static double SQRT2   = Math.sqrt(2);
	/**
	 * The reciprocal of the square root of 2, that is, 
	 * the number 1 divided by the square root of 2.
	 * @see jsx.core.Maths#SQRT1_2
	 * @since 1.0
	 * @javascript Re-compilers must convert the static reference to this field into the 
	 * JavaScript expression: 
	 * <pre>Math.SQRT1_2</pre>
	 */
	public final static double SQRT1_2 = 1 / SQRT2;

	/**
	 * <p>Computes an absolute value.</p>
	 * @param x Any number.
	 * @return The absolute value of <tt>x</pre>
	 * @see js.core.JsGlobal.Math#abs(Object)
	 * @see jsx.core.Maths#abs(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript invocation: 
	 * <pre>Math.abs(x)</pre>
	 */
	public double abs(Object x);
	/**
	 * <p>Computes an arccosine.</p>
	 * @param x A number between -1.0 and 1.0.
	 * @return The arccosine, or inverse cosine, of the specified value <tt>x</pre> 
	 * This return value is between 0 and pi radians.
	 * @see js.core.JsGlobal.Math#acos(Object)
	 * @see jsx.core.Maths#acos(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript invocation: 
	 * <pre>Math.acos(x)</pre>
	 */
	public double acos(Object x);
	/**
	 * <p>Computes an arcsine.</p>
	 * @param x A number between -1.0 and 1.0.
	 * @return The arcsine, or inverse cosine, of the specified value <tt>x</pre> 
	 * This return value is between -pi/2 and pi/2 radians.
	 * @see js.core.JsGlobal.Math#asin(Object)
	 * @see jsx.core.Maths#asin(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript invocation: 
	 * <pre>Math.asin(x)</pre>
	 */
	public double asin(Object x);
	/**
	 * <p>Computes an arctangent.</p>
	 * @param x Any number.
	 * @return The arc tanget of the specified value <tt>x</pre> This return value is 
	 * between -pi/2 and pi/2 radians.
	 * @see js.core.JsGlobal.Math#atan(Object)
	 * @see jsx.core.Maths#atan(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript invocation: 
	 * <pre>Math.atan(x)</pre>
	 */
	public double atan(Object x);
	/**
	 * <p>Computes the arc tangent of the ratio <tt>y/x</pre> The <tt>y</tt> 
	 * argument can be considered the Y coordinate (or "rise") of a point, and the 
	 * <tt>x</tt> argument can be considered the X coordinate (or "run") of the point. 
	 * Note the unusual order of the arguments to this function: the Y coordinate is 
	 * passed before the X coordinate.</p>
	 * @param y The Y coordinate of the point.
	 * @param x The X coordinate of the point.
	 * @return A value between -pi and pi radians that specifies the counterclockwise angle 
	 * between the positive X axis and the point <tt>(x, y)</pre>
	 * @see js.core.JsGlobal.Math#atan2(Object, Object)
	 * @see jsx.core.Maths#atan2(Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript invocation: 
	 * <pre>Math.atan2(y, x)</pre>
	 */
	public double atan2(Object y, Object x);
	/**
	 * <p>Rounds a number up.</p>
	 * @param x Any numeric value or expression.
	 * @return TThe closest integer greater than or equal to <tt>x</pre>
	 * @see js.core.JsGlobal.Math#ceil(Object)
	 * @see jsx.core.Maths#ceil(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript invocation: 
	 * <pre>Math.ceil(x)</pre>
	 */
	public double ceil(Object x);
	/**
	 * <p>Computes a cosine.</p>
	 * @param x An angle, measured in radians. 
	 * To convert degrees to radians, multiply the degree value by 0.017453293 (2pi/360).
	 * @return The cosine of the specified value <tt>x</pre> This return value is 
	 * between -1.0 and 1.0.
	 * @see js.core.JsGlobal.Math#cos(Object)
	 * @see jsx.core.Maths#cos(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript invocation: 
	 * <pre>Math.cos(x)</pre>
	 */
	public double cos(Object x);
	/**
	 * <p>Computes a power of e.</p>
	 * @param x A numeric value or expression to be used as the exponent.
	 * @return e raised to the power of the specified exponent <tt>x</tt>, where e 
	 * is the base of the natural logarithm, with a value of approximately 2.71828.
	 * @see js.core.JsGlobal.Math#exp(Object)
	 * @see jsx.core.Maths#exp(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript invocation: 
	 * <pre>Math.exp(x)</pre>
	 */
	public double exp(Object x);
	/**
	 * <p>Rounds a number down.</p>
	 * <p>This function computes the floor function. In other words, it returns the 
	 * nearest integer value that is less than or equal to the function argument.</p>
	 * <p>This function rounds a floating-point value down to the closest integer. 
	 * This behavior differs from that of {@link #round(Object)}, which rounds up or 
	 * down to the nearest integer. Also note that this function rounds negative 
	 * numbers down (that is, to be more negative), not up (that is, closer to zero).</p>
	 * @param x Any numeric value or expression.
	 * @return The closest integer less than or equal to <tt>x</pre>
	 * @see js.core.JsGlobal.Math#floor(Object)
	 * @see jsx.core.Maths#floor(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript invocation: 
	 * <pre>Math.floor(x)</pre>
	 */
	public double floor(Object x);
	/**
	 * <p>Computes a natural logarithm.</p>
	 * @param x Any numeric value or expression greater than zero.
	 * @return The natural logarithm of <tt>x</pre>
	 * @see js.core.JsGlobal.Math#log(Object)
	 * @see jsx.core.Maths#log(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript invocation: 
	 * <pre>Math.log(x)</pre>
	 */
	public double log(Object x);
	/**
	 * <p>Returns the largest of the numbers.</p>
	 * @param args A list of zero or more values..
	 * @return The largest of the list of arguments. Returns <tt>-Infinity</tt> if 
	 * there are no arguments. Returns <tt>NaN</tt> if any of the arguments is 
	 * <tt>NaN</tt> or is a non-numeric value that cannot be converted to a number.
	 * @see js.core.JsGlobal.Math#max(Vars)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript invocation: 
	 * <pre>Math.max(args)</tt>
	 * where <tt>args</tt> must be expanded into comma-separated arguments.
	 */
	public Number max(Vars<?> args);
	/**
	 * <p>Returns the larger of two numbers.</p>
	 * @param x Any value.
	 * @param y Any value.
	 * @return The larger of the two arguments. Returns <tt>-Infinity</tt> if 
	 * the arguments are all undefined. Returns <tt>NaN</tt> if any of the arguments is 
	 * <tt>NaN</tt> or is a non-numeric value that cannot be converted to a number.
	 * @see js.core.JsGlobal.Math#max(Object, Object)
	 * @see jsx.core.Maths#max(Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript invocation: 
	 * <pre>Math.max(x, y)</pre>
	 */
	public Number max(Object x, Object y);
	/**
	 * <p>Returns the smallest of the numbers.</p>
	 * @param args A list of zero or more values..
	 * @return The smallest of the list of arguments. Returns <tt>-Infinity</tt> if 
	 * there are no arguments. Returns <tt>NaN</tt> if any of the arguments is 
	 * <tt>NaN</tt> or is a non-numeric value that cannot be converted to a number.
	 * @see js.core.JsGlobal.Math#min(Vars)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript invocation: 
	 * <pre>Math.min(args)</tt>
	 * where <tt>args</tt> must be expanded into comma-separated arguments.
	 */
	public Number min(Vars<?> args);
	/**
	 * <p>Returns the smaller of two numbers.</p>
	 * @param x Any value.
	 * @param y Any value.
	 * @return The smaller of the two arguments. Returns <tt>-Infinity</tt> if 
	 * the arguments are all undefined. Returns <tt>NaN</tt> if any of the arguments is 
	 * <tt>NaN</tt> or is a non-numeric value that cannot be converted to a number.
	 * @see js.core.JsGlobal.Math#min(Object, Object)
	 * @see jsx.core.Maths#min(Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript invocation: 
	 * <pre>Math.min(x, y)</pre>
	 */
	public Number min(Object x, Object y);
	/**
	 * <p>Computes <tt>x</tt> to the power of <tt>y</pre></p>
	 * <p>Any values of x and y may be passed to this function. However, if the result is 
	 * an imaginary or complex number, it returns <tt>NaN</pre> In practice, this 
	 * means that if <tt>x</tt> is negative, <tt>y</tt> should be a positive or 
	 * negative integer. Also, bear in mind that large exponents can easily cause 
	 * floating-point overflow and return a value of <tt>Infinity</pre></p>
	 * @param x The number to be raised to a power.
	 * @param y The power that x is to be raised to.
	 * @return <tt>x</tt> to the power of <tt>y</pre>
	 * @see js.core.JsGlobal.Math#pow(Object, Object)
	 * @see jsx.core.Maths#pow(Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript invocation: 
	 * <pre>Math.pow(x, y)</pre>
	 */
	public double pow(Object x, Object y);
	/**
	 * <p>Computes a random number.</p>
	 * @return A pseudo-random number between 0.0 and 1.0.
	 * @see js.core.JsGlobal.Math#random()
	 * @see jsx.core.Maths#random()
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript invocation: 
	 * <pre>Math.random()</pre>
	 */
	public double random();
	/**
	 * <p>Rounds to the nearest integer.</p>
	 * <p>This invocation rounds its argument up or down to the nearest integer. 
	 * It rounds .5 up. For example, it rounds 1.5 to 2 and rounds -1.5 to -1.</p>
	 * @param x Any number.
	 * @return The integer closest to <tt>x</pre>
	 * @see js.core.JsGlobal.Math#round(Object)
	 * @see jsx.core.Maths#round(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript invocation: 
	 * <pre>Math.round(x)</pre>
	 */
	public double round(Object x);
	/**
	 * <p>Computes a sine.</p>
	 * @param x Any number.
	 * @return The sine of <tt>x</pre> This return value is between -1.0 and 1.0.
	 * @see js.core.JsGlobal.Math#sin(Object)
	 * @see jsx.core.Maths#sin(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript invocation: 
	 * <pre>Math.sin(x)</pre>
	 */
	public double sin(Object x);
	/**
	 * <p>Computes a hyperbolic sine.</p>
	 * @param x Any number.
	 * @return The hyperbolic sine of <tt>x</pre>
	 * @see js.core.JsGlobal.Math#sinh(Object)
	 * @see jsx.core.Maths#sinh(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript invocation: 
	 * <pre>Math.sinh(x)</pre>
	 */
	public double sinh(Object x);
	/**
	 * <p>Computes a square root.</p>
	 * <p>Note that you can compute arbitrary roots of a number with {@link #pow(Object, Object)}. </p>
	 * @param x A numeric value greater than or equal to zero.
	 * @return The square root of <tt>x</pre> Returns <tt>NaN</tt> if 
	 * <tt>x</tt> is less than zero.
	 * @see js.core.JsGlobal.Math#sqrt(Object)
	 * @see jsx.core.Maths#sqrt(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript invocation: 
	 * <pre>Math.sqrt(x)</pre>
	 */
	public double sqrt(Object x);
	/**
	 * <p>Computes a tangent.</p>
	 * @param x An angle, measured in radians. To convert degrees to radians, 
	 * multiply the degree value by 0.017453293 (2pi/360).
	 * @return The tangent of the specified angle <tt>x</pre>
	 * @see js.core.JsGlobal.Math#tan(Object)
	 * @see jsx.core.Maths#tan(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript invocation: 
	 * <pre>Math.tan(x)</pre>
	 */
	public double tan(Object x);
	/**
	 * <p>Computes a hyperbolic tangent.</p>
	 * @param x Any number.
	 * @return The hyperbolic tangent of <tt>x</pre>
	 * @see js.core.JsGlobal.Math#tanh(Object)
	 * @see jsx.core.Maths#tanh(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript invocation: 
	 * <pre>Math.tanh(x)</pre>
	 */
	public double tanh(Object x);
}
