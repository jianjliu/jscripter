
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

import js.ArrayLike;
import js.Js;
import js.Vars;

/**
 * <p><b>Internally</b> represents primitive int values, emulating a standard
 * <tt>java.lang</tt> interface or class with the same simple name as this one.</p>
 * <p>This interface or class is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */
public final class Integer extends Number implements Comparable<Integer>
{
	/**
	 * <p>Internally stores a constant holding the minimum value an int can have, -2<sup>31</sup>.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final int MIN_VALUE = 0x80000000;
	/**
	 * <p>Internally stores a constant holding the maximum value an int can have, 2<sup>31</sup>-1.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final int MAX_VALUE = 0x7FFFFFFF;
	/**
	 * <p>Internally stores the number of bits used to represent an int value in
	 * two's complement binary form.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final int SIZE = 32;

	/**
	 * <p>Returns the number of one-bits in the two's complement binary
	 * representation of the specified int value.</p>
	 * @param i An int value to count population.
	 * @return The number of one-bits in the two's complement binary representation of the specified value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final int bitCount(int i) {
		int cnt = 0;
		for (int q = MIN_VALUE; q > 0; q = q >> 1) {
			if ((q & i) != 0) {
				cnt++;
			}
		}
		return cnt;
	}

	/**
	 * <p>Decodes a string into a {@link Integer}.</p>
	 * @param s A string to decode.
	 * @return A {@link Integer} represented by <tt>s</tt>.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable int.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final java.lang.Integer decode(java.lang.String s)
			throws java.lang.NumberFormatException {
		try {
			return Js.parseInt(s).intValue();
		} catch (java.lang.Exception e) {
			throw new java.lang.NumberFormatException(e.toString());
		}
	}

	/**
	 * <p>Returns an int value with at most a single one-bit, in the position of
	 * the highest-order ("leftmost") one-bit in the specified int value.</p>
	 * <p>This method returns 0 if the specified value has no one-bits in its two's
	 * complement binary representation, that is, if it is equal to 0.</p>
	 * @param i An int value.
	 * @return An int value with a single one-bit, in the position of the highest-order one-bit in 
	 * the specified value, or 0 if the specified value is itself equal to 0.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final int highestOneBit(int i) {
		if (i < 0) {
			return MIN_VALUE;
		} else if (i == 0) {
			return 0;
		} else {
			int rtn;
			for (rtn = MIN_VALUE >>> 1; (rtn & i) == 0; rtn = rtn >> 1);
			return rtn;
		}
	}

	/**
	 * <p>Returns an int value with at most a single one-bit, in the position of
	 * the lowest-order ("rightmost") one-bit in the specified int value.</p>
	 * <p>This method returns 0 if the specified value has no one-bits in its two's
	 * complement binary representation, that is, if it is equal to 0.</p>
	 * @param i An int value.
	 * @return An int value with a single one-bit, in the position of the lowest-order one-bit in 
	 * the specified value, or 0 if the specified value is itself equal to 0.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final int lowestOneBit(int i) {
		if (i == 0) {
			return 0;
		} else if (i == MIN_VALUE) {
			return MIN_VALUE;
		} else {
			int r = 1;
			while ((r & i) == 0) {
				r = r * 2;
			}
			return r;
		}
	}

	/**
	 * <p>Returns the number of zero bits preceding the highest-order ("leftmost")
	 * one-bit in the two's complement binary representation of the specified int value.</p>
	 * <p>This method returns 32 if the specified value has no one-bits in its
	 * two's complement representation, i.e., if it is equal to 0.</p>
	 * @param i An int value.
	 * @return The number of zero bits preceding the highest-order ("leftmost") one-bit in the two's 
	 * complement binary representation of the specified int value, or 32 if the value is equal to 0.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final int numberOfLeadingZeros(int i) {
		if (i < 0) {
			return 0;
		} else if (i == 0) {
			return SIZE;
		} else {
			return SIZE - 1 - (int) Math.floor(Math.log(i) / Math.log(2.0d));
		}
	}

	/**
	 * <p>Returns the number of zero bits following the lowest-order ("rightmost")
	 * one-bit in the two's complement binary representation of the specified int value.</p>
	 * <p>This method returns 32 if the specified value has no one-bits in its
	 * two's complement representation, i.e., if it is equal to 0.</p>
	 * @param i An int value.
	 * @return The number of zero bits following the lowest-order ("rightmost") one-bit in the two's 
	 * complement binary representation of the specified int value, or 32 if the value is equal to 0.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final int numberOfTrailingZeros(int i) {
		if (i == 0) {
			return SIZE;
		} else {
			int rtn = 0;
			for (int r = 1; (r & i) == 0; r = r * 2) {
				rtn++;
			}
			return rtn;
		}
	}

	/**
	 * <p>Parses the string argument as a signed decimal int.</p>
	 * <p>The characters in the string must all be decimal digits, except that the
	 * first character may be an ASCII minus sign '-' ('\u002D') to indicate a negative value. 
	 * The resulting int value is returned, exactly as if the argument and the radix 10 were given 
	 * as arguments to the {@link #parseInt(String, int)} method.</p>
	 * @param s A string containing the int representation to be parsed.
	 * @return The {@link Integer} represented by the string argument in decimal.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable int.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized int parseInt(java.lang.String s)
			throws java.lang.NumberFormatException {
		return parseInt(s, 10);
	}

	/**
	 * <p>Parses the string argument as a signed int in the radix specified by the second argument.</p>
	 * <p>The characters in the string must all be digits, of the specified radix
	 * (as determined by whether {@link Character#digit(char, int)} returns a nonnegative value) 
	 * except that the first character may be an ASCII minus sign '-' ('\u002D') to indicate a 
	 * negative value. The resulting int value is returned.</p>
	 * @param s A string containing the short representation to be parsed.
	 * @param radix The radix to be used while parsing <tt>s</tt>.
	 * @return The {@link Integer} represented by the string argument in the specified radix.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable int.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final int parseInt(java.lang.String s, int radix)
			throws java.lang.NumberFormatException {
		try {
			java.lang.Number n = Js.parseInt(s);
			if (Js.lt(n, MIN_VALUE) || Js.gt(n, MAX_VALUE)) {
				throw new java.lang.NumberFormatException("out of bounds");
			}
			return n.intValue();
		} catch (java.lang.Exception e) {
			throw new java.lang.NumberFormatException(e.toString());
		}
	}

	/**
	 * <p>Returns the value obtained by reversing the order of the bits in the
	 * two's complement binary representation of the specified int value.</p>
	 * @param i An int to be converted.
	 * @return The value obtained by reversing order of the bits in the specified int value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final int reverse(int i) {
		int ui = i & MAX_VALUE; // avoid sign extension
		int acc = 0;
		int front = MIN_VALUE;
		int back = 1;
		int swing = 31;
		while (swing > 0) {
			acc = acc | ((ui & front) >> swing) | ((ui & back) << swing);
			swing -= 2;
			front = front >> 1;
			back = back << 1;
		}
		if (i < 0) {
			acc = acc | 0x1; // restore the real value of 0x80000000
		}
		return acc;
	}

	/**
	 * <p>Returns the value obtained by reversing the order of the bytes in the
	 * two's complement representation of the specified int value.</p>
	 * @param i An int to be converted.
	 * @return The value obtained by reversing the bytes in the specified value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final int reverseBytes(int i) {
		return Js.bor(
				Js.bor(Js.bor(Js.shl(Js.band(i, 0xff), 24),
						Js.shl(Js.band(i, 0xff00), 8)),
						Js.shr(Js.band(i, 0xff0000), 8)),
				Js.shr(Js.band(i, 0xff000000), 24));
	}

	/**
	 * <p>Returns the value obtained by rotating the two's complement binary representation of 
	 * the specified int value left by the specified number of bits.</p>
	 * <p>Bits shifted out of the left hand, or high-order, side reenter on the right, or low-order.</p>
	 * <p>Note that left rotation with a negative distance is equivalent to right rotation:
	 * <pre>
	 * rotateLeft(i, -distance) == rotateRight(i, distance)
	 * </pre>
	 * Note also that rotation by any multiple of 32 is a no-op, so all but the last five bits of 
	 * the rotation distance can be ignored, even if the distance is negative:
	 * <pre>
	 * rotateLeft(i, distance) == rotateLeft(i, distance &amp; 0x1F)
	 * </pre></p>
	 * @param i An int to be shifted.
	 * @return The value obtained by rotating the two's complement binary representation of the 
	 * specified int value left by the specified number of bits.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final int rotateLeft(int i, int distance) {
		if (distance < 0) {
			return rotateRight(i, -distance);
		}
		distance &= 0x1F;
		while (distance-- > 0) {
			i = i << 1 | ((i < 0) ? 1 : 0);
		}
		return i;
	}

	/**
	 * <p>Returns the value obtained by rotating the two's complement binary representation of 
	 * the specified int value right by the specified number of bits.</p>
	 * <p>Bits shifted out of the right hand, or low-order, side reenter on the left, or high-order.</p>
	 * <p>Note that right rotation with a negative distance is equivalent to left rotation:
	 * <pre>
	 * rotateRight(i, -distance) == rotateLeft(i, distance)
	 * </pre>
	 * Note also that rotation by any multiple of 32 is a no-op, so all but the last five bits of 
	 * the rotation distance can be ignored, even if the distance is negative:
	 * <pre>
	 * rotateRight(i, distance) == rotateRight(i, distance &amp; 0x1F)
	 * </pre></p>
	 * @param i An int to be shifted.
	 * @return The value obtained by rotating the two's complement binary representation of the 
	 * specified int value right by the specified number of bits.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final int rotateRight(int i, int distance) {
		if (distance < 0) {
			return rotateLeft(i, -distance);
		}
		distance &= 0x1F;
		int ui = i & MAX_VALUE; // avoid sign extension
		int carry = i < 0 ? MIN_VALUE >>> 1 : 0; // 0x40000000 = 0x80000000 >>>
													// 1
		while (distance-- > 0) {
			int nextcarry = ui & 1;
			ui = carry | (ui >> 1);
			carry = (nextcarry == 0) ? 0 : MIN_VALUE >>> 1;
		}
		if (carry != 0) {
			ui = ui | MIN_VALUE;
		}
		return ui;
	}

	/**
	 * <p>Returns the signum function of the specified int value</p>
	 * @param i An int value.
	 * @return -1 if the specified value is negative; 0 if the specified value is zero; and 1 if 
	 * the specified value is positive.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final int signum(int i) {
		return ((java.lang.Integer) Js.cond(Js.eq(i, 0), 0,
				Js.cond(Js.lt(i, 0), -1, 1))).intValue();
	}

	final static ArrayLike<java.lang.String> digits16 = new Vars<java.lang.String>()
			.add("0").add("1").add("2").add("3").add("4").add("5").add("6")
			.add("7").add("8").add("9").add("a").add("b").add("c").add("d")
			.add("e").add("f").var();

	private static final java.lang.String toBinary(int x, int bm1, int bits) {
		if (x == 0) {
			return "0";
		}
		java.lang.String s = "";
		while (x != 0) {
			int digit = x & bm1;
			s = Js.add(digits16.get(digit), s);
			x = x >>> bits;
		}
		return s;
	}

	/**
	 * <p>Returns a string representation of the argument as an unsigned value in base 2.</p>
	 * @param x A value to be converted to a string.
	 * @return The string representation of the unsigned value represented by the argument in binary (base 2).
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized java.lang.String toBinaryString(int x) {
		return toBinary(x, 1, 1);
	}

	/**
	 * <p>Returns a string representation of the argument as an unsigned value in base 8.</p>
	 * @param x A value to be converted to a string.
	 * @return The string representation of the unsigned value represented by the argument in octal (base 8).
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized java.lang.String toOctalString(int x) {
		return toBinary(x, 7, 3);
	}

	/**
	 * <p>Returns a string representation of the argument as an unsigned value in base 16.</p>
	 * @param x A value to be converted to a string.
	 * @return The string representation of the unsigned value represented by the argument in 
	 * hexadecimal (base 16).
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized java.lang.String toHexString(int x) {
		return toBinary(x, 15, 4);
	}

	/**
	 * <p>Returns a string representing the specified int. The radix is assumed to be 10.</p>
	 * @param i An int to be converted.
	 * @return The string representation of the specified int.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized java.lang.String toString(int i) {
		return String.valueOf(i);
	}

	/**
	 * <p>Returns an {@link Integer} representing the specified int value.</p>
	 * @param i An int value.
	 * @return An {@link Integer} representing <tt>i</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized Integer valueOf(int i) {
		return new Integer(i);
	}

	/**
	 * <p>Returns an {@link Integer} represented by the specified string value.</p>
	 * @param s A string value.
	 * @return An {@link Integer} represented by <tt>s</tt>.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable int.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized Integer valueOf(java.lang.String s)
			throws java.lang.NumberFormatException {
		return new Integer(parseInt(s));
	}

	/**
	 * <p>Returns an {@link Integer} represented by the specified string value when
	 * parsed with the radix given by the second argument.</p>
	 * @param s A string value.
	 * @param radix The radix to be used in interpreting <tt>s</tt>.
	 * @return An {@link Integer} represented by <tt>s</tt> in the specified radix.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable int.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized Integer valueOf(java.lang.String s,
			int radix) throws java.lang.NumberFormatException {
		return new Integer(parseInt(s, radix));
	}

	/**
	 * <p>Allocates an {@link Integer} representing the int argument.</p>
	 * @param value An int value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor. 
	 * A re-compiler simply replaces an invocation of this constructor with its argument.
	 */
	public Integer(int value) {}

	/**
	 * <p>Allocates an {@link Integer} representing the value indicated by the string parameter.</p>
	 * <p>The string is converted to an int value in exactly the manner used by the
	 * {@link #parseInt(String)} method for radix 10.</p>
	 * @param s A string to be converted to an {@link Integer}.
	 * @throws NumberFormatException if the string does not contain a parsable int.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor. 
	 * A re-compiler simply replaces an invocation of this constructor with an invocation of {@link #valueOf(String)} passing the string argument.
	 */
	public Integer(java.lang.String s) {}

	/**
	 * <p>Returns the value of this {@link Integer} as a byte primitive.</p>
	 * @return The primitive byte value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Integer} involving rounding or truncation necessarily.
	 */
	@Override
	public final native byte byteValue();

	/**
	 * <p>Returns the value of this {@link Integer} as a short primitive.</p>
	 * @return The primitive short value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Integer} involving rounding or truncation necessarily.
	 */
	@Override
	public final native short shortValue();

	/**
	 * <p>Returns the value of this {@link Integer} as an int primitive.</p>
	 * @return The primitive int value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Integer}.
	 */
	@Override
	public final native int intValue();

	/**
	 * <p>Returns the value of this {@link Integer} as a long primitive.</p>
	 * @return The primitive long value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Integer}.
	 */
	@Override
	public final native long longValue();

	/**
	 * <p>Returns the value of this {@link Integer} as a float primitive.</p>
	 * @return The primitive float value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Integer}.
	 */
	@Override
	public final native float floatValue();

	/**
	 * <p>Returns the value of this {@link Integer} as a long primitive.</p>
	 * @return The primitive double value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Integer}.
	 */
	@Override
	public final native double doubleValue();

	/**
	 * <p>Compares two {@link Integer}s numerically.</p>
	 * @param i The {@link Integer} to be compared.
	 * @return 0 if this {@link Integer} is equal to the argument {@link Integer}; a value less 
	 * than 0 if this {@link Integer} is numerically less than the argument {@link Integer}; and 
	 * a value greater than 0 if this {@link Integer} is numerically greater than the argument 
	 * {@link Integer} (signed comparison).
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public final int compareTo(Integer i) {
		return ((java.lang.Integer) Js.cond(Js.lt(this, i), -1,
				Js.cond(Js.gt(this, i), 1, 0))).intValue();
	}

	/**
	 * <p>Compares this {@link Integer} to the specified object.</p>
	 * <p>Returns <tt>true</tt> if and only if the argument is not <tt>null</tt>
	 * and is an {@link Integer} that represents the same value as this {@link Integer}.</p>
	 * @param o The object to compare with.
	 * @return <tt>true</tt> if the {@link Integer}s represent the same value; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	@Override
	public final boolean equals(java.lang.Object o) {
		return Js.eq(this, o);
	}

	/**
	 * <p>Returns a hash code for this {@link Integer}.</p>
	 * @return A hash code value for this {@link Integer}.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	@Override
	public final int hashCode() {
		return intValue();
	}

	/**
	 * <p>Returns a string representing this {@link Integer}'s value.</p>
	 * <p>The value is converted to signed decimal representation and returned as a
	 * string, exactly as if the int value were given as an argument to the
	 * {@link #toString(int)} method.</p>
	 * @return A string representation of this {@link Integer} in base 10.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public final java.lang.String toString() {
		return toString(intValue());
	}
}
