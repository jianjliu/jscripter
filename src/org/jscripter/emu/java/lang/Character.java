
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

import org.jscripter.emu.java.io.Serializable;

import js.Js;
import js.core.JsGlobal;

/**
 * <p><b>Internally</b> represents primitive char values, emulating a standard <tt>java.lang</tt> interface or 
 * class with the same simple name as this one.</p>
 * <p>This interface or class is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */
public final class Character implements Comparable<Character>, Serializable
{
	/**
	 * <p>Internally stores the minimum radix available for conversion to and from strings.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final int MIN_RADIX = 2;
	/**
	 * <p>Internally stores the maximum radix available for conversion to and from strings.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final int MAX_RADIX = 36;

	/**
	 * <p>Internally stores constant the smallest value of type char, '\u0000'.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final char MIN_VALUE = '\u0000';
	/**
	 * <p>Internally stores constant the largest value of type char, '\uFFFF'.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public static final char MAX_VALUE = '\uFFFF';

	/**
	 * <p>Returns the numeric value of a character in the specified radix.</p>
	 * @param ch A character to be converted.
	 * @param radix The radix.
	 * @return The numeric value represented by the character in the specified radix.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final int digit(char ch, int radix) {
		if (radix < 2 || radix > 36) {
			return -1;
		}
		if (ch >= '0' && ch < '0' + Math.min(radix, 10)) {
			return ch - '0';
		}
		if (ch >= 'a' && ch < (radix + 'a' - 10)) {
			return ch - 'a' + 10;
		}
		if (ch >= 'A' && ch < (radix + 'A' - 10)) {
			return ch - 'A' + 10;
		}
		return -1;
	}

	/**
	 * <p>Determines the character representation for a specific digit in the specified radix.</p>
	 * <p>If the value of <tt>radix</tt> is not a valid radix, or the value of <tt>digit</tt> is not 
	 * a valid digit in the specified radix, the <tt>null</tt> character ('\u0000') is returned.</p>
	 * <p>The <tt>radix</tt> argument is valid if it is greater than or equal to {@link #MIN_RADIX} 
	 * and less than or equal to {@link #MAX_RADIX}. The <tt>digit</tt> argument is valid if 
	 * <tt>0 &lt;= digit &lt; radix.</p>
	 * <p>If the <tt>digit</tt> is less than 10, then <tt>'0' + digit</tt> is returned. Otherwise, 
	 * the value <tt>'a' + digit - 10</tt> is returned</p>
	 * <p></p>
	 * @param digit A number to convert to a character.
	 * @param radix The radix.
	 * @return The char representation of the specified digit in the specified radix.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final char forDigit(int digit, int radix) {
		if (radix < 2 || radix > 36) {
			return 0;
		}
		if (digit < 0 || digit >= radix) {
			return 0;
		}
		if (digit < 10) {
			return (char) ('0' + digit);
		} else {
			return (char) ('a' + digit - 10);
		}
	}

	/**
	 * <p>Determines if the specified character is a digit.</p>
	 * @param ch A character to be tested.
	 * @return <tt>true</tt> if the character is a digit; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final synchronized boolean isDigit(char ch) {
		return Js.neq(
				null, 
				JsGlobal.String.prototype.match.with().call(
						JsGlobal.String.with().fromCharCode(ch),
						Js.re("\\d")
				)
		);
	}

	/**
	 * <p>Determines if the specified character is a letter.</p>
	 * @param ch A character to be tested.
	 * @return <tt>true</tt> if the character is a letter; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final synchronized boolean isLetter(char ch) {
		return Js.neq(
				null, 
				JsGlobal.String.prototype.match.with().call(
						JsGlobal.String.with().fromCharCode(ch),
						Js.re("[A-Z]", "i")
				)
		);
	}

	/**
	 * <p>Determines if the specified character is a letter or digit.</p>
	 * @param ch A character to be tested.
	 * @return <tt>true</tt> if the character is a letter or digit; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final synchronized boolean isLetterOrDigit(char ch) {
		return Js.neq(
				null, 
				JsGlobal.String.prototype.match.with().call(
						JsGlobal.String.with().fromCharCode(ch),
						Js.re("[A-Z]\\d", "i")
				)
		);
	}

	/**
	 * <p>Determines if the specified character is a lower-case character.</p>
	 * @param ch A character to be tested.
	 * @return <tt>true</tt> if the character is lower-case; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final synchronized boolean isLowerCase(char ch) {
		return Js.and(java.lang.Boolean.valueOf(Js.eq(toLowerCase(ch), ch)), java.lang.Boolean.valueOf(isLetter(ch)));
	}

	/**
	 * <p>Determines if the specified character is ISO-LATIN-1 white space.</p>
	 * @param ch A character to be tested.
	 * @return <tt>true</tt> if the character is ISO-LATIN-1 white space; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final boolean isSpace(char ch) {
		switch (ch) {
			case ' ' :
			case '\n':
			case '\t':
			case '\f':
			case '\r':
				return true;
			default:
				return false;
		}
	}

	/**
	 * <p>Determines if the specified character is a upper-case character.</p>
	 * @param ch A character to be tested.
	 * @return <tt>true</tt> if the character is upper-case; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final synchronized boolean isUpperCase(char ch) {
		return Js.eq(toUpperCase(ch), ch) && isLetter(ch);
	}

	/**
	 * <p>Converts the character argument to lower-case.</p>
	 * @param ch A character to be converted.
	 * @return The lower-case equivalent of the character, if any; otherwise, the character itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final synchronized char toLowerCase(char ch) {
		return JsGlobal.String.with().fromCharCode(ch).toLowerCase().charAt(0);	
	}

	/**
	 * <p>Returns a string representing the specified char. The result is a string of length 1 
	 * consisting solely of the specified char.</p>
	 * @param c A character to be converted.
	 * @return The string representation of the specified char.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final synchronized java.lang.String toString(char c) {
		return String.valueOf(c);
	}

	/**
	 * <p>Converts the character argument to upper-case.</p>
	 * @param ch A character to be converted.
	 * @return The upper-case equivalent of the character, if any; otherwise, the character itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final synchronized char toUpperCase(char ch) {
		return JsGlobal.String.with().fromCharCode(ch).toUpperCase().charAt(0);	
	}

	/**
	 * <p>Returns a {@link Character} representing the specified char value.</p>
	 * @param c A char value.
	 * @return A {@link Character} representing <tt>c</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized Character valueOf(char c) {
		return new Character(c);
	}

	/**
	 * <p>Allocates a {@link Character} representing the char argument.</p>
	 * @param value A char value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 * A re-compiler simply replaces an invocation of this constructor with its argument.
	 */
	public Character(char value) {
	}

	/**
	 * <p>Returns the value of this {@link Character} as a char primitive.</p>
	 * @return The primitive char value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Boolean}.
	 */
	public final native char charValue();

	/**
	 * <p>Compares two {@link Character}s numerically.</p>
	 * @param c The {@link Character} to be compared.
	 * @return 0 if this {@link Character} is equal to the argument {@link Character}; a value less than 0 
	 * if this {@link Character} is numerically less than the argument {@link Character}; and a value greater 
	 * than 0 if this {@link Character} is numerically greater than the argument {@link Character} (unsigned comparison).
	 * Note that this is strictly a numerical comparison; it is not locale-dependent.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public final int compareTo(Character c) {
		return ((java.lang.Integer)Js.cond(
				Js.lt(this, c),
				-1, 
				Js.cond(
						Js.gt(this, c),
						1, 
						0
				)
		)).intValue();
	}

	/**
	 * <p>Compares this {@link Character} to the specified object.</p>
	 * <p>Returns <tt>true</tt> if and only if the argument is not <tt>null</tt> and is a {@link Character} 
	 * that represents the same value as this {@link Character}.</p>
	 * @param o The object to compare with.
	 * @return <tt>true</tt> if the {@link Character}s represent the same value; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	@Override
	public final boolean equals(java.lang.Object o) {
		return Js.eq(this, o);
	}

	/**
	 * <p>Returns a hash code for this {@link Character}.</p>
	 * @return A hash code value for this {@link Character}.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	@Override
	public final int hashCode() {
		return (int)((java.lang.Character)(java.lang.Object)this).charValue();
	}

	/**
	 * <p>Returns a string representing this {@link Character}'s value.</p>
	 * <p>The result is a string of length 1 whose sole component is the primitive char value 
	 * represented by this {@link Character}.</p>
	 * @return A string representation of this {@link Character}.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public final java.lang.String toString() {
		return String.valueOf(((java.lang.Character)(java.lang.Object)this).charValue());
	}
}
