
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
 * <p><b>Internally</b> represents primitive float values, emulating a standard <tt>java.lang</tt> interface or 
 * class with the same simple name as this one.</p>
 * <p>This interface or class is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */
public final class Float extends Number implements Comparable<Float>
{
	/**
	 * <p>Internally stores a constant holding the largest positive finite value of type float, (2-2<sup>-23</sup>)·2<sup>127</sup>.</p>
	 * <p>It is equal to the hexadecimal floating-point literal <tt>0x1.fffffeP+127f</tt> and 
	 * also equal to <tt>Float.intBitsToFloat(0x7f7fffff)</tt>.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final float MAX_VALUE = 3.4028234663852886E38f;
	/**
	 * <p>Internally stores a constant holding the smallest positive normal value of type float, 2<sup>-126</sup>.</p>
	 * <p>It is equal to the hexadecimal floating-point literal <tt>0x1.0P-126f</tt> and 
	 * also equal to <tt>Float.intBitsToFloat(0x00800000)</tt>.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final float MIN_NORMAL = 1.1754943508222875e-38f;
	/**
	 * <p>Internally stores a constant holding the smallest positive nonzero value of type float, 2<sup>-149</sup>.</p>
	 * <p>It is equal to the hexadecimal floating-point literal <tt>0x0.000002P-126f</tt> and 
	 * also equal to <tt>Float.intBitsToFloat(0x1)</tt>.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final float MIN_VALUE = 1.401298464324817E-45f;
	/**
	 * <p>Internally stores the maximum exponent a finite float variable may have.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final float MAX_EXPONENT = 127;
	/**
	 * <p>Internally stores the minimum exponent a normalized float variable may have.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final float MIN_EXPONENT = -126;
	/**
	 * <p>Internally stores constant holding a Not-a-Number (NaN) value of type float.</p>
	 * <p>It is equivalent to the value returned by <tt>Float.intBitsToFloat(0x7fc00000)</tt>.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final float NaN = 0f / 0f;
	/**
	 * <p>Internally stores constant holding the negative infinity of type float.</p>
	 * <p>It is equivalent to the value returned by <tt>Float.intBitsToFloat(0xff800000)</tt>.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final float NEGATIVE_INFINITY = -1f / 0f;
	/**
	 * <p>Internally stores constant holding the positive infinity of type float.</p>
	 * <p>It is equivalent to the value returned by <tt>Float.intBitsToFloat(0x7f800000)</tt>.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final float POSITIVE_INFINITY =  1f / 0f;
	/**
	 * <p>Internally stores the number of bits used to represent a float value.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final int SIZE = 32;

	/**
	 * <p>Compares the two specified floating-point numbers.</p>
	 * @param x A floating-point number.
	 * @param y A floating-point number.
	 * @return the value 0 if <tt>x</tt> is numerically equal to <tt>y</tt>; a value less than 0 
	 * if <tt>x</tt> is numerically less than <tt>y</tt>; and a value greater than 0 if <tt>x</tt> 
	 * is numerically greater than <tt>y</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final int compare(float x, float y) {
		return ((java.lang.Integer)Js.cond(
				Js.lt(x, y),
				-1, 
				Js.cond(
						Js.gt(x, y),
						1, 
						0
				)
		)).intValue();
	}

	/**
	 * <p>Determines whether the specified number is infinitely large in magnitude.</p>
	 * @param x A floating-point number to be tested.
	 * @return <tt>true</tt> if the argument is positive infinity or negative infinity; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized boolean isInfinite(float x) {
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
	public static final synchronized boolean isNaN(float x) {
		return Js.core().isNaN(x);
	}

	/**
	 * <p>Returns a new float initialized to the value represented by the specified string.</p>
	 * @param s A string to be parsed.
	 * @return The float value represented by the string argument.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable float.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final float parseFloat(java.lang.String s) throws java.lang.NumberFormatException {
		try {
			java.lang.Number n = Js.parseFloat(s);
			if (Js.lt(n, MIN_VALUE) || Js.gt(n, MAX_VALUE)) {
				throw new java.lang.NumberFormatException("out of bounds");
			}
			return n.floatValue();
		} catch (java.lang.Exception e) {
			throw new java.lang.NumberFormatException(e.toString());
		}
	}

	/**
	 * <p>Returns a string representation of the specified floating-point number.</p>
	 * @param f A floating-point number to be converted.
	 * @return A string representation of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized java.lang.String toString(float f) {
		return String.valueOf(f);
	}

	/**
	 * <p>Returns a {@link Float} representing the specified floating-point value.</p>
	 * @param f A floating-point value.
	 * @return A {@link Float} representing <tt>f</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized Float valueOf(float f) {
		return new Float(f);
	}

	/**
	 * <p>Returns a {@link Float} represented by the specified string value.</p>
	 * @param s A string value.
	 * @return A {@link Float} represented by <tt>s</tt>.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable float.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized Float valueOf(java.lang.String s) throws java.lang.NumberFormatException {
		return new Float(parseFloat(s));
	}

	/**
	 * <p>Allocates an {@link Float} representing the float argument.</p>
	 * @param value A float value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 * A re-compiler simply replaces an invocation of this constructor with its argument.
	 */
	public Float(float value) {
	}

	/**
	 * <p>Allocates a {@link Float} representing the value indicated by the string parameter.</p>
	 * <p>The string is converted to a long value in exactly the manner used by the {@link #parseFloat(String)}
	 * method for radix 10.</p>
	 * @param s A string to be converted to a {@link Float}.
	 * @throws NumberFormatException if the string does not contain a parsable float.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 * A re-compiler simply replaces an invocation of this constructor with an invocation of 
	 * {@link #valueOf(String)} passing the string argument.
	 */
	public Float(java.lang.String s) {
	}

	/**
	 * <p>Returns the value of this {@link Float} as a byte primitive.</p>
	 * @return The primitive byte value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Float}
	 * involving rounding or truncation necessarily.
	 */
	@Override
	public final native byte byteValue();
	/**
	 * <p>Returns the value of this {@link Float} as a short primitive.</p>
	 * @return The primitive short value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Float}
	 * involving rounding or truncation necessarily.
	 */
	@Override
	public final native short shortValue();
	/**
	 * <p>Returns the value of this {@link Float} as an int primitive.</p>
	 * @return The primitive int value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Float}.
	 * involving rounding or truncation necessarily.
	 */
	@Override
	public final native int intValue();
	/**
	 * <p>Returns the value of this {@link Float} as a long primitive.</p>
	 * @return The primitive long value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Float}.
	 * involving rounding necessarily.
	 */
	@Override
	public final native long longValue();
	/**
	 * <p>Returns the value of this {@link Float} as a float primitive.</p>
	 * @return The primitive float value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Float}.
	 */
	@Override
	public final native float floatValue();
	/**
	 * <p>Returns the value of this {@link Float} as a double primitive.</p>
	 * @return The primitive double value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Float}.
	 */
	@Override
	public final native double doubleValue();

	/**
	 * <p>Compares two {@link Float}s numerically.</p>
	 * @param f The {@link Float} to be compared.
	 * @return 0 if this {@link Float} is equal to the argument {@link Float}; a value less than 0 
	 * if this {@link Float} is numerically less than the argument {@link Float}; and a value greater 
	 * than 0 if this {@link Float} is numerically greater than the argument {@link Float}.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public final int compareTo(Float f) {
		return ((java.lang.Integer)Js.cond(
				Js.lt(this, f),
				-1, 
				Js.cond(
						Js.gt(this, f),
						1, 
						0
				)
		)).intValue();
	}

	/**
	 * <p>Compares this {@link Float} to the specified object.</p>
	 * <p>Returns <tt>true</tt> if and only if the argument is not <tt>null</tt> and is a {@link Float} 
	 * that represents the same value as this {@link Float}.</p>
	 * @param o The object to compare with.
	 * @return <tt>true</tt> if the {@link Float}s represent the same value; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	@Override
	public final boolean equals(java.lang.Object o) {
		return Js.eqs(this, o);
	}

	/**
	 * <p>Returns a hash code for this {@link Float}.</p>
	 * @return A hash code value for this {@link Float}.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	@Override
	public final int hashCode() {
		return floatToIntBits(floatValue());
	}

	/**
	 * <p>Determines whether this {@link Float} is infinitely large in magnitude.</p>
	 * @return <tt>true</tt> if this {@link Float} is positive infinity or negative infinity; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public final synchronized boolean isInfinite() {
		return isInfinite(floatValue());
	}

	/**
	 * <p>Determines whether {@link Float} is a Not-a-Number (NaN) value.</p>
	 * @return <tt>true</tt> if {@link Float} is NaN; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public final synchronized boolean isNaN() {
		return isNaN(floatValue());
	}

	/**
	 * <p>Returns a string representing this {@link Float}'s value.</p>
	 * <p>The value is converted to signed decimal representation and returned as a string, exactly 
	 * as if the float value were given as an argument to the {@link #toString(float)} method.</p>
	 * @return A string representation of this {@link Float}.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public final java.lang.String toString() {
		return toString(floatValue());
	}

	/**
	 * <p>Returns the floating-point value corresponding to a given bit representation.</p>
	 *  The argument is considered to be a representation of a floating-point value according to the IEEE 754 floating-point "single format" bit layout.</p>
	 * @param bits A representation of a floating-point value according to the IEEE 754 
	 * floating-point "single format" bit layout.
	 * @return The floating-point value with the same bit pattern.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public final static float intBitsToFloat(int bits) {
		if (Js.integer("0x7f800000") == bits) return POSITIVE_INFINITY;
		if (Js.integer("0xff800000") == bits) return NEGATIVE_INFINITY;
		int s = ((bits >> 31) == 0) ? 1 : -1;
		int e = ((bits >> 23) & Js.integer("0xff"));
		int m = (e == 0) ? (bits & Js.integer("0x7fffff")) << 1 :
		                   (bits & Js.integer("0x7fffff")) | Js.integer("0x800000");
		return (float)(s * m * ((java.lang.Double)JsGlobal.Math.with().pow(2, e - 150)).doubleValue());
	}

	/**
	 * <p>Returns a representation of the specified floating-point value according to 
	 * the IEEE 754 floating-point "single format" bit layout.</p>
	 * @param value A floating-point number.
	 * @return The bits that represent the floating-point number.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public final static int floatToIntBits(float value) {
		return Js.cond(
				Js.core().isNaN(value),
				Js.integer("0x7fc00000"),
				floatToRawIntBits(value)
		).intValue();
	}

	/**
	 * <p>Returns a representation of the specified floating-point value according to the 
	 * IEEE 754 floating-point "single format" bit layout, preserving Not-a-Number (NaN) values.</p>
	 * @param value A floating-point number.
	 * @return The bits that represent the floating-point number.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public final static int floatToRawIntBits(float value) {
		if (value == POSITIVE_INFINITY) return Js.integer("0x7f800000");
		if (value == NEGATIVE_INFINITY) return Js.integer("0xff800000");
		int s = Js.cond(
				value < 0,
				1,
				0
		).intValue();
		value = Js.cond(value < 0, -value, value).floatValue();
		int e = (int)jsx.core.Maths.log2(value) + 127;
		int m = Js.div(value, JsGlobal.Math.with().pow(2, e - 150)).intValue();
		if (e == 0) {
			m >>>= 1;
		} else {
			m &= Js.integer("0x7fffff");
		}
		return m | (e << 23) | (s << 31);
	}
}
