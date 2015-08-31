
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
 * <p><b>Internally</b> represents primitive byte values, emulating a standard <tt>java.lang</tt> interface or 
 * class with the same simple name as this one.</p>
 * <p>This interface or class is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */
public final class Byte extends Number implements java.lang.Comparable<Byte>
{
	/**
	 * <p>Internally stores a constant holding the minimum value a byte can have, -2<sup>7</sup>.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final byte MIN_VALUE = (byte)0x80;
	/**
	 * <p>Internally stores a constant holding the maximum value a byte can have, 2<sup>7</sup>-1.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final byte MAX_VALUE = (byte)0x7F;
	/**
	 * <p>Internally stores the number of bits used to represent a byte value in two's complement binary form.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final int SIZE = 8;

	/**
	 * <p>Decodes a string into a {@link Byte}.</p>
	 * @param s A string to decode.
	 * @return A {@link Byte} represented by <tt>s</tt>.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable byte.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized java.lang.Byte decode(java.lang.String s) throws java.lang.NumberFormatException {
		return Integer.decode(s).byteValue();
	}

	/**
	 * <p>Parses the string argument as a signed decimal byte.</p>
	 * <p>The characters in the string must all be decimal digits, except that the first character 
	 * may be an ASCII minus sign '-' ('\u002D') to indicate a negative value. The resulting byte 
	 * value is returned, exactly as if the argument and the radix 10 were given as arguments to 
	 * the {@link #parseByte(String, int)} method.</p>
	 * @param s A string containing the byte representation to be parsed.
	 * @return The {@link Byte} represented by the string argument in decimal.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable byte.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized byte parseByte(java.lang.String s) throws java.lang.NumberFormatException {
		return parseByte(s, 10);
	}

	/**
	 * <p>Parses the string argument as a signed byte in the radix specified by the second argument.</p>
	 * <p>The characters in the string must all be digits, of the specified radix (as determined by 
	 * whether {@link Character#digit(char, int)} returns a nonnegative value) except that the first 
	 * character may be an ASCII minus sign '-' ('\u002D') to indicate a negative value. The resulting
	 * byte value is returned.</p>
	 * @param s A string containing the byte representation to be parsed.
	 * @param radix The radix to be used while parsing <tt>s</tt>.
	 * @return The {@link Byte} represented by the string argument in the specified radix.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable byte.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized byte parseByte(java.lang.String s, int radix)
			throws java.lang.NumberFormatException {
		return (byte)Integer.parseInt(s, radix);
	}

	/**
	 * <p>Returns a string representing the specified byte. The radix is assumed to be 10.</p>
	 * @param b A byte to be converted.
	 * @return The string representation of the specified byte.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized java.lang.String toString(byte b) {
		return String.valueOf(b);
	}

	/**
	 * <p>Returns a {@link Byte} representing the specified byte value.</p>
	 * @param b A byte value.
	 * @return A {@link Byte} representing <tt>b</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized Byte valueOf(byte b) {
		return new Byte(b);
	}

	/**
	 * <p>Returns a {@link Byte} represented by the specified string value.</p>
	 * @param s A string value.
	 * @return A {@link Byte} represented by <tt>s</tt>.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable byte.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized Byte valueOf(java.lang.String s) throws java.lang.NumberFormatException {
		return new Byte(parseByte(s));
	}

	/**
	 * <p>Returns a {@link Byte} represented by the specified string value when parsed with the radix 
	 * given by the second argument.</p>
	 * @param s A string value.
	 * @param radix The radix to be used in interpreting <tt>s</tt>.
	 * @return A {@link Byte} represented by <tt>s</tt> in the specified radix.
	 * @throws java.lang.NumberFormatException if the string does not contain a parsable byte.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized Byte valueOf(java.lang.String s, int radix) throws java.lang.NumberFormatException {
		return new Byte(parseByte(s, radix));
	}

	/**
	 * <p>Allocates a {@link Byte} representing the byte argument.</p>
	 * @param value A byte value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 * A re-compiler simply replaces an invocation of this empty constructor with its argument.
	 */
	public Byte(byte value) {
	}

	/**
	 * <p>Allocates a {@link Byte} representing the value indicated by the string parameter.</p>
	 * <p>The string is converted to a byte value in exactly the manner used by the {@link #parseByte(String)}
	 * method for radix 10.</p>
	 * @param s A string to be converted to a {@link Byte}.
	 * @throws NumberFormatException if the string does not contain a parsable byte.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 * A re-compiler simply replaces an invocation of this constructor with an invocation of 
	 * {@link #valueOf(String)} passing the string argument.
	 */
	public Byte(java.lang.String s) {
	}

	/**
	 * <p>Returns the value of this {@link Byte} as a byte primitive.</p>
	 * @return The primitive byte value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Byte}.
	 */
	@Override
	public final native byte byteValue();
	/**
	 * <p>Returns the value of this {@link Byte} as a short primitive.</p>
	 * @return The primitive short value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Byte}.
	 */
	@Override
	public final native short shortValue();
	/**
	 * <p>Returns the value of this {@link Byte} as an int primitive.</p>
	 * @return The primitive int value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Byte}.
	 */
	@Override
	public final native int intValue();
	/**
	 * <p>Returns the value of this {@link Byte} as a long primitive.</p>
	 * @return The primitive long value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Byte}.
	 */
	@Override
	public final native long longValue();
	/**
	 * <p>Returns the value of this {@link Byte} as a float primitive.</p>
	 * @return The primitive float value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Byte}.
	 */
	@Override
	public final native float floatValue();
	/**
	 * <p>Returns the value of this {@link Byte} as a double primitive.</p>
	 * @return The primitive byte value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Byte}.
	 */
	@Override
	public final native double doubleValue();

	/**
	 * <p>Compares two {@link Byte}s numerically.</p>
	 * @param b The {@link Byte} to be compared.
	 * @return 0 if this {@link Byte} is equal to the argument {@link Byte}; a value less than 0 
	 * if this {@link Byte} is numerically less than the argument {@link Byte}; and a value greater 
	 * than 0 if this {@link Byte} is numerically greater than the argument {@link Byte} (signed comparison).
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public int compareTo(Byte b) {
		return ((java.lang.Integer)Js.cond(
				Js.lt(this, b),
				-1, 
				Js.cond(
						Js.gt(this, b),
						1, 
						0
				)
		)).intValue();
	}

	/**
	 * <p>Compares this {@link Byte} to the specified object.</p>
	 * <p>Returns <tt>true</tt> if and only if the argument is not <tt>null</tt> and is a {@link Byte} 
	 * that represents the same value as this {@link Byte}.</p>
	 * @param o The object to compare with.
	 * @return <tt>true</tt> if the {@link Byte}s represent the same value; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	@Override
	public boolean equals(java.lang.Object o) {
		return Js.eq(this, o);
	}

	/**
	 * <p>Returns a hash code for this {@link Byte}.</p>
	 * @return A hash code value for this {@link Byte}.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	@Override
	public int hashCode() {
		return byteValue();
	}

	/**
	 * <p>Returns a string representing this {@link Byte}'s value.</p>
	 * <p>The value is converted to signed decimal representation and returned as a string, exactly 
	 * as if the byte value were given as an argument to the {@link #toString(byte)} method.</p>
	 * @return A string representation of this {@link Byte} in base 10.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public java.lang.String toString() {
		return toString(byteValue());
	}
}
