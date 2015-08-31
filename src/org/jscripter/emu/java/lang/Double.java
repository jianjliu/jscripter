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

/**
 * <p><b>Internally</b> represents primitive double values, emulating a standard
 * <tt>java.lang</tt> interface or class with the same simple name as this one.</p>
 * <p>This interface or class is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */
public final class Double extends Number implements Comparable<Double>
{
	/**
	 * <p>Internally stores a constant holding the largest positive finite value of
	 * type double, (2-2<sup>-52</sup>)·2<sup>1023</sup>.</p>
	 * <p>It is equal to the hexadecimal floating-point literal <tt>0x1.fffffffffffffP+1023</tt> and 
	 * also equal to <tt>Double.longBitsToDouble(0x7fefffffffffffffL)</tt>.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final double MAX_VALUE = 1.7976931348623157e+308;
	/**
	 * <p>Internally stores a constant holding the smallest positive normal value of type double, 2<sup>-1022</sup>.</p>
	 * <p>It is equal to the hexadecimal floating-point literal <tt>0x1.0P-1022</tt> and also equal to
	 * <tt>Double.longBitsToDouble(0x1L)</tt>.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final double MIN_NORMAL = 2.2250738585072014e-308;
	/**
	 * <p>Internally stores a constant holding the smallest positive nonzero value
	 * of type double, 2<sup>-1074</sup>.</p>
	 * <p>It is equal to the hexadecimal floating-point literal <tt>0x0.0000000000001P-1022</tt> and 
	 * also equal to <tt>Double.longBitsToDouble(0x7fefffffffffffffL)</tt>.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final double MIN_VALUE = 4.9e-324;
	/**
	 * <p>Internally stores the maximum exponent a finite double variable may have.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final int MAX_EXPONENT = 1023;
	/**
	 * <p>Internally stores the minimum exponent a normalized double variable may have.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final int MIN_EXPONENT = -1022;
	/**
	 * <p>Internally stores constant holding a Not-a-Number (NaN) value of type double.</p>
	 * <p>It is equivalent to the value returned by <tt>Double.longBitsToDouble(0x7fefffffffffffffL)</tt>.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final double NaN = 0d / 0d;
	/**
	 * <p>Internally stores constant holding the negative infinity of type double.</p>
	 * <p>It is equivalent to the value returned by <tt>Double.longBitsToDouble(0xfff0000000000000L)</tt>.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this
	 *          field.
	 */
	public static final double NEGATIVE_INFINITY = -1d / 0d;
	/**
	 * <p>Internally stores constant holding the positive infinity of type double.</p>
	 * <p>It is equivalent to the value returned by <tt>Double.longBitsToDouble(0x7ff0000000000000L)</tt>.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final double POSITIVE_INFINITY = 1d / 0d;
	/**
	 * <p>Internally stores the number of bits used to represent a double value.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final int SIZE = 64;

	/**
	 * <p>Compares the two specified floating-point numbers.</p>
	 * @param x A floating-point number.
	 * @param y A floating-point number.
	 * @return the value 0 if <tt>x</tt> is numerically equal to <tt>y</tt>; a value less than 0 if 
	 * <tt>x</tt> is numerically less than <tt>y</tt>; and a value greater than 0 if <tt>x</tt> is
	 * numerically greater than <tt>y</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final int compare(double x, double y) {
		return ((java.lang.Integer) Js.cond(Js.lt(x, y), -1,
				Js.cond(Js.gt(x, y), 1, 0))).intValue();
	}

	/**
	 * <p>Determines whether the specified number is infinitely large in magnitude.</p>
	 * @param x A floating-point number to be tested.
	 * @return <tt>true</tt> if the argument is positive infinity or negative infinity; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized boolean isInfinite(double x) {
		return Js.not(Js.core().isFinite(x));
	}

	/**
	 * <p>Determines whether the specified number is a Not-a-Number (NaN) value.</p>
	 * @param x A floating-point number to be tested.
	 * @return <tt>true</tt> if the argument is NaN; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized boolean isNaN(double x) {
		return Js.core().isNaN(x);
	}

	/**
	 * <p>Returns a new double initialized to the value represented by the specified string.</p>
	 * @param s A string to be parsed.
	 * @return The double value represented by the string argument.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable double.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final synchronized double parseDouble(java.lang.String s)
			throws java.lang.NumberFormatException {
		try {
			return Js.parseFloat(s);
		} catch (java.lang.Exception e) {
			throw new java.lang.NumberFormatException(e.toString());
		}
	}

	/**
	 * <p>Returns a string representation of the specified floating-point number.</p>
	 * @param d A floating-point number to be converted.
	 * @return A string representation of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized java.lang.String toString(double d) {
		return String.valueOf(d);
	}

	/**
	 * <p>Returns a {@link Double} representing the specified floating-point value.</p>
	 * @param d A floating-point value.
	 * @return A {@link Double} representing <tt>d</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized Double valueOf(double d) {
		return new Double(d);
	}

	/**
	 * <p>Returns a {@link Double} represented by the specified string value.</p>
	 * @param s A string value.
	 * @return A {@link Double} represented by <tt>s</tt>.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable float.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized Double valueOf(java.lang.String s)
			throws java.lang.NumberFormatException {
		return new Double(parseDouble(s));
	}

	/**
	 * <p>Allocates an {@link Double} representing the double argument.</p>
	 * @param value A double value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor. 
	 * A re-compiler simply replaces an invocation of this constructor with its argument.
	 */
	public Double(double value) {
	}

	/**
	 * <p>Allocates a {@link Double} representing the value indicated by the string parameter.</p>
	 * <p>The string is converted to a long value in exactly the manner used by the
	 * {@link #parseDouble(String)} method for radix 10.</p>
	 * @param s A string to be converted to a {@link Double}.
	 * @throws NumberFormatException if the string does not contain a parsable double.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor. 
	 * A re-compiler simply replaces an invocation of this constructor with an invocation of 
	 * {@link #valueOf(String)} passing the string argument.
	 */
	public Double(java.lang.String s) {
	}

	/**
	 * <p>Returns the value of this {@link Double} as a byte primitive.</p>
	 * @return The primitive byte value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Double} 
	 * involving rounding or truncation necessarily.
	 */
	@Override
	public final native byte byteValue();

	/**
	 * <p>Returns the value of this {@link Double} as a short primitive.</p>
	 * @return The primitive short value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Double} 
	 * involving rounding or truncation necessarily.
	 */
	@Override
	public final native short shortValue();

	/**
	 * <p>Returns the value of this {@link Double} as an int primitive.</p>
	 * @return The primitive int value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Double} 
	 * involving rounding or truncation necessarily.
	 */
	@Override
	public final native int intValue();

	/**
	 * <p>Returns the value of this {@link Double} as a long primitive.</p>
	 * @return The primitive long value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Double} 
	 * involving rounding or truncation necessarily.
	 */
	@Override
	public final native long longValue();

	/**
	 * <p>Returns the value of this {@link Double} as a float primitive.</p>
	 * @return The primitive float value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Double} 
	 * involving rounding necessarily.
	 */
	@Override
	public final native float floatValue();

	/**
	 * <p>Returns the value of this {@link Double} as a double primitive.</p>
	 * @return The primitive double value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Double}.
	 */
	@Override
	public final native double doubleValue();

	/**
	 * <p>Compares two {@link Double}s numerically.</p>
	 * @param d The {@link Double} to be compared.
	 * @return 0 if this {@link Double} is equal to the argument {@link Double}; a value less than 0 
	 * if this {@link Double} is numerically less than the argument {@link Double}; and a value 
	 * greater than 0 if this {@link Double} is numerically greater than the argument {@link Double}.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public final int compareTo(Double d) {
		return ((java.lang.Integer) Js.cond(Js.lt(this, d), -1,
				Js.cond(Js.gt(this, d), 1, 0))).intValue();
	}

	/**
	 * <p>Compares this {@link Double} to the specified object.</p>
	 * <p>Returns <tt>true</tt> if and only if the argument is not <tt>null</tt> and is a {@link Double} 
	 * that represents the same value as this {@link Double}.</p>
	 * @param o The object to compare with.
	 * @return <tt>true</tt> if the {@link Double}s represent the same value; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	@Override
	public final boolean equals(java.lang.Object o) {
		return Js.eqs(this, o);
	}

	/**
	 * <p>Returns a hash code for this {@link Double}.</p>
	 * @return A hash code value for this {@link Double}.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	@Override
	public final int hashCode() {
		return intValue();
	}

	/**
	 * <p>Determines whether this {@link Double} is infinitely large in magnitude.</p>
	 * @return <tt>true</tt> if this {@link Double} is positive infinity or negative infinity; 
	 * <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public final synchronized boolean isInfinite() {
		return isInfinite(doubleValue());
	}

	/**
	 * <p>Determines whether {@link Double} is a Not-a-Number (NaN) value.</p>
	 * @return <tt>true</tt> if {@link Double} is NaN; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public final synchronized boolean isNaN() {
		return isNaN(doubleValue());
	}

	/**
	 * <p>Returns a string representing this {@link Double}'s value.</p>
	 * <p>The value is converted to signed decimal representation and returned as a string, exactly 
	 * as if the double value were given as an argument to the {@link #toString(double)} method.</p>
	 * @return A string representation of this {@link Double}.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public final java.lang.String toString() {
		return toString(doubleValue());
	}

	private static final double MANTISSA = Math.pow(2, 52);

	/**
	 * <p>Returns the floating-point value corresponding to a given bit representation.</p>
	 * <p>The argument is considered to be a representation of a floating-point value according to 
	 * the IEEE 754 floating-point "single format" bit layout.</p>
	 * @param bits A representation of a floating-point value according to the IEEE 754 floating-point 
	 * "double format" bit layout.
	 * @return The floating-point value with the same bit pattern.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public final static double longBitsToDouble(long bits) {
		int e = ((int) Js.lshr(bits, 52)) & 0x7ff;
		int d = e == 0 ? 1 : 0;
		e = e - 1023 + d;
		long m = mantissa(bits);
		int s = Js.lshr(bits, 63) == 0L ? 1 : -1;
		if (e == 1024) {
			if (m != 0) {
				return Double.NaN;
			} else {
				return s < 0 ? Double.NEGATIVE_INFINITY
						: Double.POSITIVE_INFINITY;
			}
		}
		return s * ((m / MANTISSA + 1 - d) * Math.pow(2, e));
	}

	private static long mantissa(long bits) {
		return Js.land(bits, 0xfffffffffffffL);
	}

	/**
	 * <p>Returns a representation of the specified floating-point value according to the IEEE 754 
	 * floating-point "double format" bit layout.</p>
	 * @param value A floating-point number.
	 * @return The bits that represent the floating-point number.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public final static long doubleToLongBits(double value) {
		long result = doubleToRawLongBits(value);
		// Check for NaN based on values of bit fields, maximum
		// exponent and nonzero significand.
		if (Js.leq(Js.land(result, 0x7ff0000000000000L), 0x7ff0000000000000L)
				&& Js.leq(Js.land(result, 0x000fffffffffffffL), 0L))
			result = 0x7ff8000000000000L;
		return result;
	}

	/**
	 * <p>Returns a representation of the specified floating-point value according to the IEEE 754 
	 * floating-point "double format" bit layout, preserving Not-a-Number (NaN) values.</p>
	 * @param value A floating-point number.
	 * @return The bits that represent the floating-point number.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public final static long doubleToRawLongBits(double value) {
		if (value == POSITIVE_INFINITY)
			return 0x7ff0000000000000L;
		if (value == NEGATIVE_INFINITY)
			return 0xfff0000000000000L;
		long s = Js.cond(value < 0, 1L, 0L).longValue();
		value = Math.abs(value);
		long e = (long) (jsx.core.Maths.log2(value) + 1023);
		long m = (long) (value / Math.pow(2, e - 1075));
		if (e == 0L) {
			m = Js.lshru(m, 1);
		} else {
			m = mantissa(m);
		}
		return m | Js.lshl(e, 52) | Js.lshl(s, 63);
	}
}
