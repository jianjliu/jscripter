
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

import js.*;

/**
 * <p><b>Internally</b> represents primitive long values, emulating a standard <tt>java.lang</tt> interface or 
 * class with the same simple name as this one.</p>
 * <p>This interface or class is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */
public final class Long extends Number implements Comparable<Long>
{
	/**
	 * <p>Internally stores a constant holding the minimum value a long can have, -2<sup>63</sup>.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final long MIN_VALUE = 0x8000000000000000L;
	/**
	 * <p>Internally stores a constant holding the maximum value a long can have, 2<sup>63</sup>-1.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final long MAX_VALUE = 0x7FFFFFFFFFFFFFFFL;
	/**
	 * <p>Internally stores the number of bits used to represent a long value in two's complement binary form.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final int SIZE = 64;

	/**
	 * <p>Returns the number of one-bits in the two's complement binary representation of the 
	 * specified long value.</p>
	 * @param i A long value to count population.
	 * @return The number of one-bits in the two's complement binary representation of the 
	 * specified value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final int bitCount(long i) {
		int cnt = 0;
		for (long q = MIN_VALUE; q > 0; q = q >> 1) {
			if ((q & i) != 0) {
				cnt++;
			}
		}
		return cnt;
	}

	/**
	 * <p>Decodes a string into a {@link Long}.</p>
	 * @param s A string to decode.
	 * @return A {@link Long} represented by <tt>s</tt>.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable long.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final java.lang.Long decode(java.lang.String s) throws java.lang.NumberFormatException {
		try {
			return Js.parseInt(s).longValue();
		} catch (java.lang.Exception e) {
			throw new java.lang.NumberFormatException(e.toString());
		}
	}

	/**
	 * <p>Returns a long value with at most a single one-bit, in the position of the highest-order 
	 * ("leftmost") one-bit in the specified long value.</p>
	 * <p>This method returns 0 if the specified value has no one-bits in its two's complement binary 
	 * representation, that is, if it is equal to 0.</p>
	 * @param i A long value.
	 * @return A long value with a single one-bit, in the position of the highest-order one-bit in the 
	 * specified value, or 0 if the specified value is itself equal to 0.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final long highestOneBit(long i) {
		if (i < 0) {
			return MIN_VALUE;
		} else {
			long rtn;
			for (rtn = 0x4000000000000000L; (rtn >> 1) > i; rtn = rtn >> 1);
			return rtn;
		}
	}

	/**
	 * <p>Returns a long value with at most a single one-bit, in the position of the lowest-order 
	 * ("rightmost") one-bit in the specified long value.</p>
	 * <p>This method returns 0 if the specified value has no one-bits in its two's complement binary 
	 * representation, that is, if it is equal to 0.</p>
	 * @param i A long value.
	 * @return A long value with a single one-bit, in the position of the lowest-order one-bit in 
	 * the specified value, or 0 if the specified value is itself equal to 0.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final long lowestOneBit (long i) {
		if (i == 0) {
			return SIZE;
		} else {
			long r = 1;
			while ((r & i) != 0) {
				r = r << 1;
			}
			return r;
		}
	}

	/**
	 * <p>Returns the number of zero bits preceding the highest-order ("leftmost") one-bit in the 
	 * two's complement binary representation of the specified long value.</p>
	 * <p>This method returns 64 if the specified value has no one-bits in its two's complement 
	 * representation, i.e., if it is equal to 0.</p>
	 * @param i A long value.
	 * @return The number of zero bits preceding the highest-order ("leftmost") one-bit in the 
	 * two's complement binary representation of the specified long value, or 64 if the value is 
	 * equal to 0.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final int numberOfLeadingZeros(long i) {
		if (i < 0) {
			return 0;
		} else if (i == 0) {
			return SIZE;
		} else {
			return SIZE - 1 - (int)Math.floor(Math.log((double)i) / Math.log(2.0d));
		}
	}

	/**
	 * <p>Returns the number of zero bits following the lowest-order ("rightmost") one-bit in the 
	 * two's complement binary representation of the specified long value.</p>
	 * <p>This method returns 64 if the specified value has no one-bits in its two's complement 
	 * representation, i.e., if it is equal to 0.</p>
	 * @param i A long value.
	 * @return The number of zero bits following the lowest-order ("rightmost") one-bit in the 
	 * two's complement binary representation of the specified long value, or 64 if the value is 
	 * equal to 0.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final int numberOfTrailingZeros(long i) {
		if (i < 0) {
			return 0;
		} else if (i == 0) {
			return SIZE;
		} else {
			int rtn = 0;
			for (int r = 1; (r & i) != 0; r = r * 2) {
				rtn++;
			}
			return rtn;
		}
	}

	/**
	 * <p>Parses the string argument as a signed decimal long.</p>
	 * <p>The characters in the string must all be decimal digits, except that the first character 
	 * may be an ASCII minus sign '-' ('\u002D') to indicate a negative value. The resulting long 
	 * value is returned, exactly as if the argument and the radix 10 were given as arguments to 
	 * the {@link #parseLong(String, int)} method.</p>
	 * @param s A string containing the long representation to be parsed.
	 * @return The {@link Long} represented by the string argument in decimal.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable long.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized long parseLong(java.lang.String s) throws java.lang.NumberFormatException {
		return parseLong(s, 10);
	}

	/**
	 * <p>Parses the string argument as a signed long in the radix specified by the second argument.</p>
	 * <p>The characters in the string must all be digits, of the specified radix (as determined by 
	 * whether {@link Character#digit(char, int)} returns a nonnegative value) except that the first 
	 * character may be an ASCII minus sign '-' ('\u002D') to indicate a negative value. The resulting
	 * long value is returned.</p>
	 * @param s A string containing the short representation to be parsed.
	 * @param radix The radix to be used while parsing <tt>s</tt>.
	 * @return The {@link Long} represented by the string argument in the specified radix.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable long.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final long parseLong(java.lang.String s, int radix)
			throws java.lang.NumberFormatException {
		try {
			java.lang.Number n = Js.parseInt(s);
			if (Js.llt(n, MIN_VALUE) || Js.lgt(n, MAX_VALUE)) {
				throw new java.lang.NumberFormatException("out of bounds");
			}
			return n.longValue();
		} catch (java.lang.Exception e) {
			throw new java.lang.NumberFormatException(e.toString());
		}
	}

	/**
	 * <p>Returns the value obtained by reversing the order of the bits in the two's complement 
	 * binary representation of the specified long value.</p>
	 * @param i A long to be converted.
	 * @return The value obtained by reversing order of the bits in the specified long value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final long reverse(long i) {
		long acc = 0;
		long front = MIN_VALUE;
		int back = 1;
		int swing = SIZE - 1;
		while (swing > 15) {
			acc = acc | ((i & front) >> swing) | ((i & back) << swing);
			swing--;
			front = front >> 1;
			back = back << 1;
		}
		return acc;
	}

	/**
	 * <p>Returns the value obtained by reversing the order of the bytes in the two's complement 
	 * representation of the specified long value.</p>
	 * @param i A long to be converted.
	 * @return The value obtained by reversing the bytes in the specified value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final long reverseBytes(long i) {
		return ((i & 0xffL) << 56) | ((i & 0xff00L) << 40)
		 | ((i & 0xff0000L) << 24) | ((i & 0xff000000L) << 8)
		 | ((i & 0xff00000000L) >> 8) | ((i & 0xff0000000000L) >> 24)
		 | ((i & 0xff000000000000L) >> 40) | ((i & 0xff00000000000000L) >> 56);
	}

	/**
	 * <p>Returns the value obtained by rotating the two's complement binary representation of the 
	 * specified long value left by the specified number of bits.</p>
	 * <p>Bits shifted out of the left hand, or high-order, side reenter on the right, or low-order.</p>
	 * <p>Note that left rotation with a negative distance is equivalent to right rotation: 
	 * <pre>rotateLeft(i, -distance) == rotateRight(i, distance)</pre>
	 * Note also that rotation by any multiple of 64 is a no-op, so all but the last five bits of 
	 * the rotation distance can be ignored, even if the distance is negative:
	 * <pre>rotateLeft(i, distance) == rotateLeft(i, distance & 0x3F)</pre>
	 * </p>
	 * @param i An long to be shifted.
	 * @return The value obtained by rotating the two's complement binary representation of the 
	 * specified long value left by the specified number of bits.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final long rotateLeft(long i, int distance) {
		if (distance < 0) {
			return rotateRight(i, -distance);
		}
		distance &= 0x3F;
		while (distance-- > 0) {
			i = i << 1 | ((i < 0) ? 1 : 0);
		}
		return i;
	}

	/**
	 * <p>Returns the value obtained by rotating the two's complement binary representation of the 
	 * specified long value right by the specified number of bits.</p>
	 * <p>Bits shifted out of the right hand, or low-order, side reenter on the left, or high-order.</p>
	 * <p>Note that right rotation with a negative distance is equivalent to left rotation:
	 * <pre>rotateRight(i, -distance) == rotateLeft(i, distance)</pre>
	 * Note also that rotation by any multiple of 64 is a no-op, so all but the last five bits of 
	 * the rotation distance can be ignored, even if the distance is negative:
	 * <pre>rotateRight(i, distance) == rotateRight(i, distance & 0x3F)</pre>
	 * </p>
	 * @param i A long to be shifted.
	 * @return The value obtained by rotating the two's complement binary representation of the 
	 * specified long value right by the specified number of bits.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final long rotateRight(long i, int distance) {
		if (distance < 0) {
			return rotateLeft(i, -distance);
		}
		distance &= 0x3F;
		while (distance-- > 0) {
			i = ((i & 1) == 0 ? 0 : MIN_VALUE) | i >> 1;
		}
		return i;
	}

	/**
	 * <p>Returns the signum function of the specified long value</p>
	 * @param i A long value.
	 * @return -1 if the specified value is negative; 0 if the specified value is zero; 
	 * and 1 if the specified value is positive.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final int signum(long i) {
		return ((java.lang.Integer)Js.cond(
				Js.eq(i, 0),
				0, 
				Js.cond(
						Js.lt(i, 0),
						-1, 
						1
				)
		)).intValue();
	}

	private static final java.lang.String toBinary(long x, int bm1, int bits) {
		if (x == 0) {
			return "0";
		}
		java.lang.String s = "";
		while (x != 0) {
			int digit = (int) x & bm1;
			s = Js.add(Integer.digits16.get(digit), s);
			x = x >>> bits;
		}
		return s;
	}

	/**
	 * <p>Returns a string representation of the argument as an unsigned value in base 2.</p>
	 * @param x A value to be converted to a string.
	 * @return The string representation of the unsigned value represented by the argument in 
	 * binary (base 2).
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized java.lang.String toBinaryString(long x) {
		return toBinary(x, 1, 1);
	}

	/**
	 * <p>Returns a string representation of the argument as an unsigned value in base 8.</p>
	 * @param x A value to be converted to a string.
	 * @return The string representation of the unsigned value represented by the argument in 
	 * octal (base 8).
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized java.lang.String toOctalString(long x) {
		return toBinary(x, 7, 3);
	}

	/**
	 * <p>Returns a string representation of the argument as an unsigned value in base 16.</p>
	 * @param x A value to be converted to a string.
	 * @return The string representation of the unsigned value represented by the argument in 
	 * hexadecimal (base 16).
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized java.lang.String toHexString(long x) {
		return toBinary(x, 15, 4);
	}

	/**
	 * <p>Returns a string representing the specified long. The radix is assumed to be 10.</p>
	 * @param i A long to be converted.
	 * @return The string representation of the specified long.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized java.lang.String toString(long i) {
		return ((ObjectLike)(java.lang.Object)new Long(i)).toString();
	}

	/**
	 * <p>Returns a {@link Long} representing the specified long value.</p>
	 * @param i A long value.
	 * @return A {@link Long} representing <tt>i</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized Long valueOf(long i) {
		return new Long(i);
	}

	/**
	 * <p>Returns a {@link Long} represented by the specified string value.</p>
	 * @param s A string value.
	 * @return A {@link Long} represented by <tt>s</tt>.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable long.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized Long valueOf(java.lang.String s) throws java.lang.NumberFormatException {
		return new Long(parseLong(s));
	}

	/**
	 * <p>Returns a {@link Long} represented by the specified string value when parsed with the radix 
	 * given by the second argument.</p>
	 * @param s A string value.
	 * @param radix The radix to be used in interpreting <tt>s</tt>.
	 * @return A {@link Long} represented by <tt>s</tt> in the specified radix.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable long.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized Long valueOf(java.lang.String s, int radix) throws java.lang.NumberFormatException {
		return new Long(parseLong(s, radix));
	}

	/**
	 * <p>Allocates an {@link Long} representing the long argument.</p>
	 * @param value A long value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 * A re-compiler simply replaces an invocation of this constructor with its argument.
	 */
	public Long(long value) {
	}

	/**
	 * <p>Allocates a {@link Long} representing the value indicated by the string parameter.</p>
	 * <p>The string is converted to a long value in exactly the manner used by the {@link #parseLong(String)}
	 * method for radix 10.</p>
	 * @param s A string to be converted to a {@link Long}.
	 * @throws NumberFormatException if the string does not contain a parsable long.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 * A re-compiler simply replaces an invocation of this constructor with an invocation of 
	 * {@link #valueOf(String)} passing the string argument.
	 */
	public Long(java.lang.String s) {
	}

	/**
	 * <p>Returns the value of this {@link Long} as a byte primitive.</p>
	 * @return The primitive byte value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Long}
	 * involving rounding or truncation necessarily.
	 */
	@Override
	public final native byte byteValue();
	/**
	 * <p>Returns the value of this {@link Long} as a short primitive.</p>
	 * @return The primitive short value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Long}
	 * involving rounding or truncation necessarily.
	 */
	@Override
	public final native short shortValue();
	/**
	 * <p>Returns the value of this {@link Long} as an int primitive.</p>
	 * @return The primitive int value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Long}.
	 * involving rounding or truncation necessarily.
	 */
	@Override
	public final native int intValue();
	/**
	 * <p>Returns the value of this {@link Long} as a long primitive.</p>
	 * @return The primitive long value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Long}.
	 */
	@Override
	public final native long longValue();
	/**
	 * <p>Returns the value of this {@link Long} as a float primitive.</p>
	 * @return The primitive float value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Long}.
	 * involving truncation necessarily.
	 */
	@Override
	public final native float floatValue();
	/**
	 * <p>Returns the value of this {@link Long} as a long primitive.</p>
	 * @return The primitive double value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Long}.
	 */
	@Override
	public final native double doubleValue();

	/**
	 * <p>Compares two {@link Long}s numerically.</p>
	 * @param i The {@link Long} to be compared.
	 * @return 0 if this {@link Long} is equal to the argument {@link Long}; a value less than 0 
	 * if this {@link Long} is numerically less than the argument {@link Long}; and a value greater 
	 * than 0 if this {@link Long} is numerically greater than the argument {@link Long} (signed comparison).
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public final int compareTo(Long i) {
		return ((java.lang.Integer)Js.cond(
				Js.llt(this, i),
				-1, 
				Js.cond(
						Js.lgt(this, i),
						1, 
						0
				)
		)).intValue();
	}

	/**
	 * <p>Compares this {@link Long} to the specified object.</p>
	 * <p>Returns <tt>true</tt> if and only if the argument is not <tt>null</tt> and is a {@link Long} 
	 * that represents the same value as this {@link Long}.</p>
	 * @param o The object to compare with.
	 * @return <tt>true</tt> if the {@link Long}s represent the same value; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	@Override
	public final boolean equals(java.lang.Object o) {
		return Js.eq(this, o);
	}

	/**
	 * <p>Returns a hash code for this {@link Long}.</p>
	 * @return A hash code value for this {@link Long}.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	@Override
	public final int hashCode() {
		return intValue();
	}

	/**
	 * <p>Returns a string representing this {@link Long}'s value.</p>
	 * <p>The value is converted to signed decimal representation and returned as a string, exactly 
	 * as if the long value were given as an argument to the {@link #toString(long)} method.</p>
	 * @return A string representation of this {@link Long} in base 10.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public final java.lang.String toString() {
		return toString(longValue());
	}
}
