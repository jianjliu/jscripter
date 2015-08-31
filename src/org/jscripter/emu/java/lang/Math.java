
/*
 *  JScripter Emulation 1.0 - To Script Java
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

package org.jscripter.emu.java.lang;

import js.Js;
import js.core.JsGlobal;

/**
 * <p>An <b>Internally</b> utility class that contains methods for performing basic numeric 
 * operations such as the elementary exponential, logarithm, square root, and trigonometric 
 * functions, emulating a standard <tt>java.lang</tt> interface or class with the same simple 
 * name as this one.</i>.</p>
 * <p>This interface or class is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */
public final class Math
{
	/**
	 * <p>Internally stores a double value that is closer than any other to <i>e</i>, the base 
	 * of the natural logarithms.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final double E  = JsGlobal.Math.E.with(Js.core()).doubleValue();//2.7182818284590452354;
	/**
	 * <p>Internally stores a double value that is closer than any other to <i>pi</i>, the 
	 * ratio of the circumference of a circle to its diameter.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final double PI = JsGlobal.Math.PI.with(Js.core()).doubleValue();//3.14159265358979323846;

	/**
	 * <p>Returns the absolute value of a <tt>double</tt> value.</p>
	 * @param x An argument whose absolute value is to be determined.
	 * @return The absolute value of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double abs(double x) {
		return jsx.core.Maths.abs(x);
	}

	/**
	 * <p>Returns the absolute value of a <tt>float</tt> value.</p>
	 * @param x An argument whose absolute value is to be determined.
	 * @return The absolute value of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized float abs(float x) {
		return (float)jsx.core.Maths.abs(x);
	}

	/**
	 * <p>Returns the absolute value of an <tt>int</tt> value.</p>
	 * @param x An argument whose absolute value is to be determined.
	 * @return The absolute value of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized int abs(int x) {
		return (int)jsx.core.Maths.abs(x);
	}

	/**
	 * <p>Returns the absolute value of a <tt>long</tt> value.</p>
	 * @param x An argument whose absolute value is to be determined.
	 * @return The absolute value of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized long abs(long x) {
		return (long)jsx.core.Maths.abs(x);
	}

	/**
	 * <p>Returns the arc cosine of a value.</p>
	 * @param x value whose arc cosine is to be returned.
	 * @return The arc cosine of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double acos(double x) {
		return jsx.core.Maths.acos(x);
	}

	/**
	 * <p>Returns the arc sine of a value.</p>
	 * @param x value whose arc sine is to be returned.
	 * @return The arc sine of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double asin(double x) {
		return jsx.core.Maths.asin(x);
	}

	/**
	 * <p>Returns the arc tangent of a value.</p>
	 * @param x value whose arc tangent is to be returned.
	 * @return The arc tangent of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double atan(double x) {
		return jsx.core.Maths.atan(x);
	}

	/**
	 * <p>Returns the angle <i>theta</i> from the conversion of rectangular coordinates (x, y) to 
	 * polar coordinates (r, <i>theta</i>).</p>
	 * @param y The ordinate coordinate.
	 * @param x The abscissa coordinate.
	 * @return {@link #atan(double)} of <tt>y/x</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double atan2(double y, double x) {
		return jsx.core.Maths.atan2(y, x);
	}

	/**
	 * <p>Returns the smallest (closest to negative infinity) double value that is greater than 
	 * or equal to the argument and is equal to a mathematical integer.</p>
	 * @param x A value.
	 * @return The smallest (closest to negative infinity) floating-point value that is greater 
	 * than or equal to the argument and is equal to a mathematical integer.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double ceil(double x) {
		return jsx.core.Maths.ceil(x);
	}

	/**
	 * <p>Returns the first floating-point argument with the sign of the second 
	 * floating-point argument.</p>
	 * @param magnitude The parameter providing the magnitude of the result.
	 * @param sign The parameter providing the sign of the result.
	 * @return A value with the magnitude of <tt>magnitude</tt> and the sign of <tt>sign</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static double copySign (double magnitude, double sign) {
		if (sign < 0) {
			return (magnitude < 0) ? magnitude : -magnitude;
		} else {
			return (magnitude > 0) ? magnitude : -magnitude;
		}
	}

	/**
	 * <p>Returns the first floating-point argument with the sign of the second 
	 * floating-point argument.</p>
	 * @param magnitude The parameter providing the magnitude of the result.
	 * @param sign The parameter providing the sign of the result.
	 * @return A value with the magnitude of <tt>magnitude</tt> and the sign of <tt>sign</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static synchronized float copySign (float magnitude, float sign) {
		return (float)(copySign((double)magnitude, (double)sign));
	}

	/**
	 * <p>Returns the trigonometric cosine of an angle.</p>
	 * @param x An angle, in radians.
	 * @return The cosine of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double cos(double x) {
		return jsx.core.Maths.cos(x);
	}

	/**
	 * <p>Returns the hyperbolic cosine of a double value.</p>
	 * @param x The number whose hyperbolic cosine is to be returned.
	 * @return The hyperbolic cosine of <tt>x</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double cosh(double x) {
		return (jsx.core.Maths.exp(x) + jsx.core.Maths.exp(-x)) / 2.0;
	}

	/**
	 * <p>Returns Euler's number <i>e</i> raised to the power of a double value.</p>
	 * @param x The exponent to raise <i>e</i> to.
	 * @return The value <i>e</i><sup>x</sup>, where <i>e</i> is the base of the natural logarithms.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double exp(double x) {
		return jsx.core.Maths.exp(x);
	}

	/**
	 * <p>Returns <i>e</i><sup>x</sup>-1.</p>
	 * <p>Note that for values of <tt>x</tt> near 0, the exact sum of <tt>expm1(x) + 1</tt> is 
	 * much closer to the true result of <i>e</i><sup>x</sup> than <tt>exp(x)</tt>.</p>
	 * @param x The exponent to raise <i>e</i> to.
	 * @return The exponent to raise e to in the computation of <i>e</i><sup>x</sup> -1.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static double expm1(double x) {
		if (x == 0.0 || Double.isNaN(x)) {
			return x;
		} else if (!Double.isInfinite(x)) {
			if (x < 0.0d) {
				return -1.0d;
			} else {
				return Double.POSITIVE_INFINITY;
			}
		}
		return exp(x) + 1.0d;
	}

	/**
	 * <p>Returns the largest (closest to positive infinity) double value that is less than 
	 * or equal to the argument and is equal to a mathematical integer.</p>
	 * @param x A value.
	 * @return The largest (closest to positive infinity) floating-point value that less 
	 * than or equal to the argument and is equal to a mathematical integer.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double floor(double x) {
		return jsx.core.Maths.floor(x);
	}

	/**
	 * <p>Returns sqrt(x<sup>2</sup> +y<sup>2</sup>) without intermediate overflow or underflow.</p>
	 * @param x A value.
	 * @param y A value.
	 * @return sqrt(x<sup>2</sup> +y<sup>2</sup>) without intermediate overflow or underflow.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double hypot(double x, double y) {
		return sqrt(x * x + y * y);
	}

	/**
	 * <p>Returns the natural logarithm (base <i>e</i>) of a double value.</p>
	 * @param x A value.
	 * @return The value <tt>ln(x)</tt>, the natural logarithm of <tt>x</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double log(double x) {
		return jsx.core.Maths.log(x);
	}

	/**
	 * <p>Returns the base 10 logarithm of a double value.</p>
	 * @param x A value.
	 * @return The base 10 logarithm of <tt>x</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double log10(double x) {
		return jsx.core.Maths.log10(x);
	}

	/**
	 * <p>Returns the natural logarithm of the sum of the argument and 1.</p>
	 * @param x A value.
	 * @return value <tt>ln(x + 1)</tt>, the natural log of <tt>x + 1</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double log1p(double x) {
		return Math.log(x + 1.0d);
	};

	/**
	 * <p>Returns the greater of two values.</p>
	 * @param x A value.
	 * @param y A value.
	 * @return The larger of <tt>x</tt> and <tt>y</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double max(double x, double y) {
		return jsx.core.Maths.max(x, y).doubleValue();
	}

	/**
	 * <p>Returns the greater of two values.</p>
	 * @param x A value.
	 * @param y A value.
	 * @return The larger of <tt>x</tt> and <tt>y</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized float max(float x, float y) {
		return ((java.lang.Float)jsx.core.Maths.max(x, y)).floatValue();
	}

	/**
	 * <p>Returns the greater of two values.</p>
	 * @param x A value.
	 * @param y A value.
	 * @return The larger of <tt>x</tt> and <tt>y</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized int max(int x, int y) {
		return ((java.lang.Integer)jsx.core.Maths.max(x, y)).intValue();
	}

	/**
	 * <p>Returns the smaller of two values.</p>
	 * @param x A value.
	 * @param y A value.
	 * @return The smaller of <tt>x</tt> and <tt>y</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized long max(long x, long y) {
		return Js.cond(
				Js.lgt(x, y),
				x,
				y
		);
	}

	/**
	 * <p>Returns the smaller of two values.</p>
	 * @param x A value.
	 * @param y A value.
	 * @return The smaller of <tt>x</tt> and <tt>y</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double min(double x, double y) {
		return jsx.core.Maths.min(x, y).doubleValue();
	}

	/**
	 * <p>Returns the smaller of two values.</p>
	 * @param x A value.
	 * @param y A value.
	 * @return The smaller of <tt>x</tt> and <tt>y</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized float min(float x, float y) {
		return ((java.lang.Float)jsx.core.Maths.min(x, y)).floatValue();
	}

	/**
	 * <p>Returns the smaller of two values.</p>
	 * @param x A value.
	 * @param y A value.
	 * @return The smaller of <tt>x</tt> and <tt>y</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized int min(int x, int y) {
		return ((java.lang.Integer)jsx.core.Maths.min(x, y)).intValue();
	}

	/**
	 * <p>Returns the smaller of two values.</p>
	 * @param x A value.
	 * @param y A value.
	 * @return The smaller of <tt>x</tt> and <tt>y</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized long min(long x, long y) {
		return Js.cond(
				Js.llt(x, y),
				x,
				y
		);
	}

	/**
	 * <p>Returns the value of the first argument raised to the power of the second argument.</p>
	 * @param x The base.
	 * @param y The exponent.
	 * @return The value <tt>x<sup>y</sup></tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double pow(double x, double y) {
		return jsx.core.Maths.pow(x, y);
	}

	/**
	 * <p>Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.</p>
	 * <p>Returned values are chosen pseudo-randomly with (approximately) uniform distribution 
	 * from that range.</p>
	 * @return A pseudo-random double greater than or equal to 0.0 and less than 1.0.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double random() {
		return jsx.core.Maths.random();
	}

	/**
	 * <p>Returns the double value that is closest in value to the argument and is equal to a 
	 * mathematical integer.</p>
	 * @param x A double value.
	 * @return The closest floating-point value to a that is equal to a mathematical integer.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static double rint(double x) {
		if (Double.isNaN(x)) {
			return x;
		} else if (Double.isInfinite(x)) {
			return x;
		} else if (x == 0.0d) {
			return x;
		} else {
			return (double)(round(x));
		}
	};

	/**
	 * <p>Returns the closest <tt>long</tt> to the argument.</p>
	 * @param x A floating-point value to be rounded.
	 * @return The value of the argument rounded to the nearest <tt>long</tt> value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized long round(double x) {
		return (long)jsx.core.Maths.round(x);
	}

	/**
	 * <p>Returns the closest <tt>int</tt> to the argument.</p>
	 * @param x A floating-point value to be rounded.
	 * @return The value of the argument rounded to the nearest <tt>int</tt> value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized int round(float x) {
		return (int)jsx.core.Maths.round(x);
	}

	/**
	 * <p>Return <tt>d × 2<sup>scaleFactor</sup></tt> rounded as if performed by a single 
	 * correctly rounded floating-point multiply to a member of the double value set.</p>
	 * @param d A number to be scaled by a power of two.
	 * @param scaleFactor power of 2 used to scale <tt>d</tt>.
	 * @return <tt>d × 2<sup>scaleFactor</sup></tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static double scalb(double d, int scaleFactor) {
		if (scaleFactor > 0) {
			return d * (1 << scaleFactor);
		} else if (scaleFactor == 0) {
			return d;
		} else {
			return d * 1.0d / (1 << -scaleFactor);
		}
	}

	/**
	 * <p>Return <tt>f × 2<sup>scaleFactor</sup></tt> rounded as if performed by a single 
	 * correctly rounded floating-point multiply to a member of the double value set.</p>
	 * @param f A number to be scaled by a power of two.
	 * @param scaleFactor power of 2 used to scale <tt>f</tt>.
	 * @return <tt>f × 2<sup>scaleFactor</sup></tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static float scalb(float f, int scaleFactor) {
		if (scaleFactor > 0) {
			return f * (1 << scaleFactor);
		} else if (scaleFactor == 0) {
			return f;
		} else {
			return f * 1.0f / (1 << -scaleFactor);
		}
	}

	/**
	 * <p>Returns the signum function of the argument; zero if the argument is zero, 1.0 if the 
	 * argument is greater than zero, -1.0 if the argument is less than zero.</p>
	 * @param d floating-point value whose signum is to be returned.
	 * @return The signum function of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static double signum(double d) {
		if (d > 0.0d) {
			return 1.0d;
		} else if (d < 0.0d) {
			return -1.0d;
		} else {
			return 0.0d;
		}
	}

	/**
	 * <p>Returns the signum function of the argument; zero if the argument is zero, 1.0 if the 
	 * argument is greater than zero, -1.0 if the argument is less than zero.</p>
	 * @param f floating-point value whose signum is to be returned.
	 * @return The signum function of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static float signum(float f) {
		if (f > 0.0f) {
			return 1.0f;
		} else if (f < 0.0f) {
			return -1.0f;
		} else {
			return 0.0f;
		}
	}

	/**
	 * <p>Returns the trigonometric sine of an angle.</p>
	 * @param x An angle, in radians.
	 * @return The sine of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double sin(double x) {
		return jsx.core.Maths.sin(x);
	}

	/**
	 * <p>Returns the hyperbolic sine of a double value.</p>
	 * @param x The number whose hyperbolic sine is to be returned.
	 * @return The hyperbolic sine of <tt>x</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double sinh(double x) {
		return jsx.core.Maths.sinh(x);
	}

	/**
	 * <p>Returns the correctly rounded positive square root of a value.</p>
	 * @param x A value.
	 * @return The positive square root of <tt>x</tt>. If the argument is <tt>NaN</tt> or less 
	 * than zero, the result is <tt>NaN</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double sqrt(double x) {
		return jsx.core.Maths.sqrt(x);
	}

	/**
	 * <p>Returns the trigonometric tangent of an angle.</p>
	 * @param x An angle, in radians.
	 * @return The tangent of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double tan(double x) {
		return jsx.core.Maths.tan(x);
	}

	/**
	 * <p>Returns the hyperbolic tangent of a double value.</p>
	 * @param x The number whose hyperbolic tangent is to be returned.
	 * @return The hyperbolic tangent of <tt>x</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double tanh(double x) {
		return jsx.core.Maths.tanh(x);
	}

	/**
	 * <p>Converts an angle measured in radians to an approximately equivalent angle measured in degrees.</p>
	 * @param x An angle, in radians.
	 * @return The measurement of the angle in degrees.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double toDegrees(double x) {
		return x * 180 / PI;
	}

	/**
	 * <p>Converts an angle measured in degrees to an approximately equivalent angle measured in radians.</p>
	 * @param x An angle, in degrees.
	 * @return The measurement of the angle in radians.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized double toRadians(double x) {
		return x * PI / 180;
	}
}
