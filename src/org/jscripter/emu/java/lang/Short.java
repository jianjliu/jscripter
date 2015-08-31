
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
 * <p><b>Internally</b> represents primitive short values, emulating a standard <tt>java.lang</tt> 
 * interface or class with the same simple name as this one.</p>
 * <p>This interface or class is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */
public final class Short extends Number implements Comparable<Short>
{
	/**
	 * <p>Internally stores a constant holding the minimum value a short can have,-2<sup>15</sup>.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final short MIN_VALUE = (short) 0x8000;
	/**
	 * <p>Internally stores a constant holding the maximum value a short can have, 2<sup>15</sup>-1.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final short MAX_VALUE = (short) 0x7FFF;
	/**
	 * <p>Internally stores the number of bits used to represent a short value in two's complement binary form.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final int SIZE = 16;

	/**
	 * <p>Decodes a string into a {@link Short}.</p>
	 * @param s A string to decode.
	 * @return A {@link Short} represented by <tt>s</tt>.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable short.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized java.lang.Short decode(java.lang.String s)
			throws java.lang.NumberFormatException {
		return Integer.decode(s).shortValue();
	}

	/**
	 * <p>Parses the string argument as a signed decimal short.</p>
	 * <p>The characters in the string must all be decimal digits, except that the
	 * first character may be an ASCII minus sign '-' ('\u002D') to indicate a
	 * negative value. The resulting short value is returned, exactly as if the
	 * argument and the radix 10 were given as arguments to the
	 * {@link #parseShort(String, int)} method.</p>
	 * @param s A string containing the short representation to be parsed.
	 * @return The {@link Short} represented by the string argument in decimal.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable short.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized short parseShort(java.lang.String s)
			throws java.lang.NumberFormatException {
		return parseShort(s, 10);
	}

	/**
	 * <p>Parses the string argument as a signed short in the radix specified by the second argument.</p>
	 * <p>The characters in the string must all be digits, of the specified radix
	 * (as determined by whether {@link Character#digit(char, int)} returns a nonnegative value) 
	 * except that the first character may be an ASCII minus sign '-' ('\u002D') to indicate a 
	 * negative value. The resulting short value is returned.</p>
	 * @param s A string containing the short representation to be parsed.
	 * @param radix The radix to be used while parsing <tt>s</tt>.
	 * @return The {@link Short} represented by the string argument in the specified radix.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable short.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into 
	 * in-lined code for efficiency.
	 */
	public static final synchronized short parseShort(java.lang.String s,
			int radix) throws java.lang.NumberFormatException {
		return (short) Integer.parseInt(s, radix);
	}

	/**
	 * <p>Returns the value obtained by reversing the order of the bytes in the
	 * two's complement representation of the specified short value.</p>
	 * @param s A short to be converted.
	 * @return The value obtained by reversing (or, equivalently, swapping) the bytes in the specified value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final short reverseBytes(short s) {
		return (short) Js.bor(Js.shl(Js.band(s, 255 // 0xff
				), 8), Js.shr(Js.band(s, 65280 // 0xff00
				), 8));
	}

	/**
	 * <p>Returns a string representing the specified short. The radix is assumed to be 10.</p>
	 * @param s A short to be converted.
	 * @return The string representation of the specified short.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized java.lang.String toString(short s) {
		return String.valueOf(s);
	}

	/**
	 * <p>Returns a {@link Short} representing the specified short value.</p>
	 * @param s A short value.
	 * @return A {@link Short} representing <tt>s</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized Short valueOf(short s) {
		return new Short(s);
	}

	/**
	 * <p>Returns a {@link Short} represented by the specified string value.</p>
	 * @param s A string value.
	 * @return A {@link Short} represented by <tt>s</tt>.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable short.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized Short valueOf(java.lang.String s)
			throws java.lang.NumberFormatException {
		return new Short(parseShort(s));
	}

	/**
	 * <p>Returns a {@link Short} represented by the specified string value when
	 * parsed with the radix given by the second argument.</p>
	 * @param s A string value.
	 * @param radix The radix to be used in interpreting <tt>s</tt>.
	 * @return A {@link Short} represented by <tt>s</tt> in the specified radix.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable short.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized Short valueOf(java.lang.String s, int radix)
			throws java.lang.NumberFormatException {
		return new Short(parseShort(s, radix));
	}

	/**
	 * <p>Allocates a {@link Short} representing the short argument.</p>
	 * @param value A short value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor. 
	 * A re-compiler simply replaces an invocation of this constructor with its argument.
	 */
	public Short(short value) {}

	/**
	 * <p>Allocates a {@link Short} representing the value indicated by the string parameter.</p>
	 * <p>The string is converted to a short value in exactly the manner used by
	 * the {@link #parseShort(String)} method for radix 10.</p>
	 * @param s A string to be converted to a {@link Short}.
	 * @throws NumberFormatException if the string does not contain a parsable short.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor. 
	 * A re-compiler simply replaces an invocation of this constructor with an invocation of {@link #valueOf(String)} passing the string argument.
	 */
	public Short(java.lang.String s) {}

	/**
	 * <p>Returns the value of this {@link Short} as a byte primitive.</p>
	 * @return The primitive byte value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Short} involving rounding or truncation necessarily.
	 */
	@Override
	public final native byte byteValue();

	/**
	 * <p>Returns the value of this {@link Short} as a short primitive.</p>
	 * @return The primitive short value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Short}.
	 */
	@Override
	public final native short shortValue();

	/**
	 * <p>Returns the value of this {@link Short} as an int primitive.</p>
	 * @return The primitive int value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Short}.
	 */
	@Override
	public final native int intValue();

	/**
	 * <p>Returns the value of this {@link Short} as a long primitive.</p>
	 * @return The primitive long value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Short}.
	 */
	@Override
	public final native long longValue();

	/**
	 * <p>Returns the value of this {@link Short} as a float primitive.</p>
	 * @return The primitive float value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Short}.
	 */
	@Override
	public final native float floatValue();

	/**
	 * <p>Returns the value of this {@link Short} as a double primitive.</p>
	 * @return The primitive double value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Short}.
	 */
	@Override
	public final native double doubleValue();

	/**
	 * <p>Compares two {@link Short}s numerically.</p>
	 * @param s The {@link Short} to be compared.
	 * @return 0 if this {@link Short} is equal to the argument {@link Short}; a value less than 0 
	 * if this {@link Short} is numerically less than the argument {@link Short}; and a value 
	 * greater than 0 if this {@link Short} is numerically greater than the argument
	 * {@link Short} (signed comparison).
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public final int compareTo(Short s) {
		return ((java.lang.Integer) Js.cond(Js.lt(this, s), -1,
				Js.cond(Js.gt(this, s), 1, 0))).intValue();
	}

	/**
	 * <p>Compares this {@link Short} to the specified object.</p>
	 * <p>Returns <tt>true</tt> if and only if the argument is not <tt>null</tt> and is a 
	 * {@link Short} that represents the same value as this {@link Short}.</p>
	 * @param o The object to compare with.
	 * @return <tt>true</tt> if the {@link Short}s represent the same value; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	@Override
	public final boolean equals(java.lang.Object o) {
		return Js.eq(this, o);
	}

	/**
	 * <p>Returns a hash code for this {@link Short}.</p>
	 * @return A hash code value for this {@link Short}.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method. 
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	@Override
	public final int hashCode() {
		return shortValue();
	}

	/**
	 * <p>Returns a string representing this {@link Short}'s value.</p>
	 * <p>The value is converted to signed decimal representation and returned as a string, 
	 * exactly as if the short value were given as an argument to the {@link #toString(short)} method.</p>
	 * @return A string representation of this {@link Short} in base 10.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public final java.lang.String toString() {
		return toString(shortValue());
	}
}
