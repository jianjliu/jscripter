
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

import js.*;
import js.core.*;
import jsx.core.StringLikes;

/**
 * <p><b>Internally</b> represents character strings, emulating a standard <tt>java.lang</tt> interface or 
 * class with the same simple name as this one.</p>
 * <p>This interface or class is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */
public final class String implements Comparable<String>, java.lang.CharSequence, Serializable
{
	/**
	 * <p>Allocates a string representing an empty character sequence.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 * A re-compiler simply replaces an invocation of this empty constructor with its argument.
	 */
	public String() {
	}

	/**
	 * <p>Allocates a new string so that it represents the sequence of characters currently contained 
	 * in the character array argument.</p>
	 * @param value An array that is the source of characters.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 * A re-compiler simply replaces an invocation of this constructor with an invocation of 
	 * {@link #valueOf(char[])} passing the argument.
	 */
	public String(char value[]) {
	}

	/**
	 * <p>Allocates a {@link String} representing an empty character sequence.</p>
	 * @param value An array that is the source of characters.
	 * @param offset The initial offset.
	 * @param count The length.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 * A re-compiler simply replaces an invocation of this constructor with an invocation of 
	 * {@link #valueOf(char[], int, int)} passing the arguments.
	 */
	public String(char value[], int offset, int count) {
	}

	/**
	 * <p>Initializes a newly created string so that it represents the same sequence of characters as 
	 * the argument.</p>
	 * @param original A string.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 * A re-compiler simply replaces an invocation of this constructor with an invocation of 
	 * {@link #valueOf(Object)} passing the argument.
	 */
	public String(String original) {
	}

	/**
	 * <p>Returns the string representation of the primitive argument.</p>
	 * @param x A primitive value.
	 * @return "true" if the argument is <tt>true</tt>; "false" otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized java.lang.String valueOf(boolean x) {
		return Boolean.toString(x);
	}

	/**
	 * <p>Returns the string representation of the primitive argument.</p>
	 * @param x A primitive value.
	 * @return A string of length 1 containing the argument as its single character.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized java.lang.String valueOf(char x) {
		return JsGlobal.String.with().fromCharCode(x);
	}

	static void checkBounds(int start, int end, int count) {
		if (start < 0) {
			throw new java.lang.StringIndexOutOfBoundsException(start);
		}
		if (end < start) {
			throw new java.lang.StringIndexOutOfBoundsException(end - start);
		}
		if (end > count) {
			throw new java.lang.StringIndexOutOfBoundsException(end);
		}
	}

	/**
	 * <p>Returns the string representation of a specific subarray of the char array argument.</p>
	 * @param x A char array.
	 * @param offset The initial offset into the string.
	 * @param count The length of the string.
	 * @return A string representing the sequence of characters contained in the subarray of the 
	 * character array argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static java.lang.String valueOf(char x[], int offset, int count) {
		int end = offset + count;
		checkBounds(offset, end, x.length);
		ArrayLike<?> a = Js.array(x).slice(offset, end);
	    return JsGlobal.String.fromCharCode.with().apply(null, a);
	}

	/**
	 * <p>Returns the string representation of the char array argument.</p>
	 * @param x A char array.
	 * @return A newly allocated string representing the same sequence of characters contained in the 
	 * character array argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized java.lang.String valueOf(char[] x) {
	    return JsGlobal.String.fromCharCode.with().apply(null, x);
	}

	/**
	 * <p>Returns the string representation of the primitive argument.</p>
	 * @param x A primitive value.
	 * @return A string representation of the primitive argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized java.lang.String valueOf(double x) {
		return Js.add("", x);
	}

	/**
	 * <p>Returns the string representation of the primitive argument.</p>
	 * @param x A primitive value.
	 * @return A string representation of the primitive argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized java.lang.String valueOf(float x) {
		return Js.add("", x);
	}

	/**
	 * <p>Returns the string representation of the primitive argument.</p>
	 * @param x A primitive value.
	 * @return A string representation of the primitive argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized java.lang.String valueOf(int x) {
		return Js.add("", x);
	}

	/**
	 * <p>Returns the string representation of the primitive argument.</p>
	 * @param x A primitive value.
	 * @return A string representation of the primitive argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized java.lang.String valueOf(long x) {
		return Js.add("", x);
	}

	/**
	 * <p>Returns the string representation of the argument object.</p>
	 * @param x An object.
	 * @return A string representation of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static synchronized java.lang.String valueOf(Object x) {
		return Js.add("", x);
	}

	/**
	 * <p>Returns the char value at the specified index.</p>
	 * @param index The index of the char value.
	 * @return The char value at the specified index of this string.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public synchronized char charAt(int index) {
		return StringLikes.charCodeAt(
				(StringLike)(java.lang.Object)this,
				index
		).charValue();
	}

	/**
	 * <p>Compares two strings lexicographically.</p>
	 * @param s A string to be compared.
	 * @return 0 if this {@link String} is equal to the argument {@link String}; a value less than 0 
	 * if this {@link String} is lexicographically  less than the argument {@link String}; and a value greater 
	 * than 0 if this {@link String} is lexicographically  greater than the argument {@link String}.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public int compareTo(String s) {
		return ((java.lang.Integer)Js.cond(
				Js.lt(this, s),
				-1, 
				Js.cond(
						Js.gt(this, s),
						1, 
						0
				)
		)).intValue();
	}

	/**
	 * <p>Compares two strings lexicographically, ignoring case differences.</p>
	 * @param s A string to be compared.
	 * @return  negative integer, zero, or a positive integer as the specified string is greater than, 
	 * equal to, or less than this String, ignoring case considerations.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public int compareToIgnoreCase(String s) {
		return toUpperCase().compareTo(s.toUpperCase());
	}

	/**
	 * <p>Concatenates the specified string to the end of this string.</p>
	 * @param s A string that is concatenated to the end of this string.
	 * @return A new string that represents the concatenation of the two.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public java.lang.String concat(java.lang.String s) {
		return Js.add(this, s);
	}

	/**
	 * <p>Tests if this string contains the specified sequence of char values.</p>
	 * @param q A sequence to search for.
	 * @return <tt>true</tt> if this string contains the specified char sequence; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public boolean contains(java.lang.CharSequence q) {
		return matches(q.toString());
	}

	/**
	 * <p>Tests if this string ends with the specified suffix.</p>
	 * @param suffix A suffix to be tested.
	 * @return <tt>true</tt> if the character sequence represented by the argument is a suffix of the 
	 * character sequence represented by this object; <tt>false</tt> otherwise. Note that the result will 
	 * be <tt>true</tt> if the argument is the empty string or is equal to this string as determined by 
	 * the {@link #equals(Object)} method.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public boolean endsWith(java.lang.String suffix) {
		return Js.eq(
				StringLikes.lastIndexOf(
						(StringLike)(java.lang.Object)this,
						suffix
				),
				length() - suffix.length()
		);
	}

	/**
	 * <p>Compares this string to the specified object.</p>
	 * @param o An object to compare this string against.
	 * @return <tt>true</tt> if the given object represents a string equivalent to this string; 
	 * <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	@Override
	public boolean equals(java.lang.Object o) {
		return Js.eq(this, o);
	}

	/**
	 * <p>Compares the two strings, ignoring case considerations.</p>
	 * @param s Another string to compare this string against.
	 * @return <tt>true</tt> if the argument is not <tt>null</tt> and it represents an equivalent string ignoring case; 
	 * <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public boolean equalsIgnoreCase(String s) {
		return Js.eq(this, s) || Js.eq(toLowerCase(), s.toLowerCase());
	}

	private static final ObjectLike hashCache = new Initializer().var();
	private static int hashNext = 1;

	/**
	 * <p>Returns a hash code for this string.</p>
	 * @return A hash code value for this string.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public int hashCode() {
		java.lang.Integer hc = (java.lang.Integer)hashCache.var(toString());
		if (Js.not(hc)) {
			hc = hashCache.var(toString(), hashNext++);
		}
		return hc.intValue();
	}

	/**
	 * <p>Returns the index within this string of the first occurrence of the specified character.</p>
	 * @param ch A character.
	 * @return The index of the first occurrence of the character in the character sequence.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public int indexOf(int ch) {
		return StringLikes.indexOf(
				(StringLike)(java.lang.Object)this,
				StringLikes.fromCharCode(ch)
		);
	}

	/**
	 * <p>Returns the index within this string of the first occurrence of the specified character, 
	 * starting the search at the specified index.</p>
	 * @param ch A character.
	 * @param from The index to start the search from.
	 * @return The index of the first occurrence of the character in the character sequence.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public int indexOf(int ch, int from) {
		return StringLikes.indexOf(
				(StringLike)(java.lang.Object)this,
				StringLikes.fromCharCode(ch),
				from
		);
	}

	/**
	 * <p>Returns the index within this string of the first occurrence of the specified string.</p>
	 * @param str A string.
	 * @return The index of the first occurrence of the string in the character sequence.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public int indexOf(String str) {
		return StringLikes.indexOf(
				(StringLike)(java.lang.Object)this,
				str
		);
	}

	/**
	 * <p>Returns the index within this string of the first occurrence of the specified string, 
	 * starting the search at the specified index.</p>
	 * @param str A string.
	 * @param from The index to start the search from.
	 * @return The index of the first occurrence of the character in the character sequence.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public int indexOf(String str, int from) {
		return StringLikes.indexOf(
				(StringLike)(java.lang.Object)this,
				str,
				from
		);
	}

	/**
	 * <p>Determines whether this is an empty string.</p>
	 * @return <tt>true</tt> if {@link #length()} is 0, otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public boolean isEmpty() {
		return Js.not(this);
	}

	private final static ObjectLike pool = new Initializer().var();

	/**
	 * <p>Returns a canonical representation for the string object.</p>
	 * @return A string that has the same contents as this string, but is guaranteed to be from a 
	 * pool of unique strings.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public java.lang.String intern() {
		java.lang.String s = (java.lang.String)pool.var(toString());
		return Js.cond(
				Js.be(s), s, pool.var(toString(), toString())
		);
	}

	/**
	 * <p>Returns the index within this string of the last occurrence of the specified character.</p>
	 * @param ch A character.
	 * @return The index of the last occurrence of the character in the character sequence.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public int lastIndexOf(int ch) {
		return StringLikes.lastIndexOf(
				(StringLike)(java.lang.Object)this,
				StringLikes.fromCharCode(ch)
		);
	}

	/**
	 * <p>Returns the index within this string of the last occurrence of the specified character, 
	 * starting the search at the specified index.</p>
	 * @param ch A character.
	 * @param from The index to start the search from.
	 * @return The index of the last occurrence of the character in the character sequence.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public int lastIndexOf(int ch, int from) {
		return StringLikes.lastIndexOf(
				(StringLike)(java.lang.Object)this,
				StringLikes.fromCharCode(ch),
				from
		);
	}

	/**
	 * <p>Returns the index within this string of the last occurrence of the specified string.</p>
	 * @param str A string.
	 * @return The index of the last occurrence of the string in the character sequence.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public int lastIndexOf(String str) {
		return StringLikes.lastIndexOf(
				(StringLike)(java.lang.Object)this,
				str
		);
	}

	/**
	 * <p>Returns the index within this string of the last occurrence of the specified string, 
	 * starting the search at the specified index.</p>
	 * @param str A string.
	 * @param from The index to start the search from.
	 * @return The index of the last occurrence of the character in the character sequence.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public int lastIndexOf(String str, int from) {
		return StringLikes.lastIndexOf(
				(StringLike)(java.lang.Object)this,
				str,
				from
		);
	}

	/**
	 * <p>Returns the length of this string.</p>
	 * @return The length of this string.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public int length() {
		return StringLikes.length((StringLike)(java.lang.Object)this);
	}

	/**
	 * <p>Tells whether or not this string matches the given regular expression.</p>
	 * @return <tt>true</tt> iff this string matches the given regular expression.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public boolean matches(java.lang.String regex) {
		return Js.re(regex).test(toString());
	}

	/**
	 * <p>Returns a new string resulting from replacing all occurrences of <tt>oldChar</tt> in this 
	 * string with <tt>newChar</tt>.</p>
	 * @return A string derived from this string by replacing every occurrence of <tt>oldChar</tt> 
	 * with <tt>newChar</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public java.lang.String replace(char oldChar, char newChar) {
		return replaceAll(
				StringLikes.fromCharCode(oldChar),
				StringLikes.fromCharCode(newChar)
		);
	}

	/*
	 * This method converts Java-escaped dollar signs "\$" into JavaScript-escaped
	 * dollar signs "$$", and removes all other lone backslashes, which serve as
	 * escapes in Java but are passed through literally in JavaScript.
	 * 
	 * @skip
	 */
	static java.lang.String translateReplaceString(java.lang.String replaceStr) {
		int pos = 0;
		while (0 <= (pos = replaceStr.indexOf("\\", pos))) {
			if (replaceStr.charAt(pos + 1) == '$') {
				replaceStr = Js.add(
						Js.add(
								replaceStr.substring(0, pos),
								"$"
						),
						replaceStr.substring(++pos)
				);
			} else {
				replaceStr = Js.add(
						replaceStr.substring(0, pos),
						replaceStr.substring(++pos)
				);
			}
		}
		return replaceStr;
	}

	/**
	 * <p>Replaces each substring of this string that matches the given regular expression with the 
	 * given replacement.</p>
	 * @param regex A regular expression to which this string is to be matched.
	 * @param replacement A string to be substituted for each match.
	 * @return The resulting string.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public java.lang.String replaceAll(java.lang.String regex, java.lang.String replacement) {
		return StringLikes.replace(
				(StringLike)(java.lang.Object)this,
				Js.re(regex, "g"),
				replacement
		);
	}

	/**
	 * <p>Replaces the first substring of this string that matches the given regular expression with 
	 * the given replacement.</p>
	 * @param regex A regular expression to which this string is to be matched.
	 * @param replacement A string to be substituted for the first match.
	 * @return The resulting string.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public java.lang.String replaceFirst(java.lang.String regex, java.lang.String replacement) {
		return StringLikes.replace(
				(StringLike)(java.lang.Object)this,
				Js.re(regex),
				replacement
		);
	}

	/**
	 * <p>Splits this string around matches of the given regular expression.</p>
	 * @param regex The delimiting  regular expression.
	 * @return An array of strings computed by splitting this string around matches of the given 
	 * regular expression.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public java.lang.String[] split(java.lang.String regex) {
		return (java.lang.String[])(java.lang.Object)StringLikes.split(toString(), regex);
	}

	/**
	 * <p>Splits this string around matches of the given regular expression.</p>
	 * @param regex The delimiting  regular expression.
	 * @param limit Controls the number of times the pattern is applied and therefore affects the 
	 * length of the resulting array.
	 * @return An array of strings computed by splitting this string around matches of the given 
	 * regular expression.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public java.lang.String[] split(java.lang.String regex, int limit) {
		return (java.lang.String[])(java.lang.Object)StringLikes.split(toString(), regex, limit);
	}

	/**
	 * <p>Tests if this string starts with the specified prefix.</p>
	 * @param prefix A prefix to be tested.
	 * @return <tt>true</tt> if the character sequence represented by the argument is a prefix of the 
	 * character sequence represented by this object; <tt>false</tt> otherwise. Note that the result will 
	 * be <tt>true</tt> if the argument is the empty string or is equal to this string as determined by 
	 * the {@link #equals(Object)} method.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public boolean startsWith(String prefix) {
		return indexOf(prefix) == 0;
	}

	/**
	 * <p>Tests if the substring of this string beginning at the specified index starts with the 
	 * specified prefix.</p>
	 * @param prefix A prefix to be tested.
	 * @param offset The offset index to begin looking in this string.
	 * @return <tt>true</tt> if the character sequence represented by the argument is a prefix of the 
	 * character sequence represented by this object starting at index offset; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public boolean startsWith(String prefix, int offset) {
		return indexOf(prefix, offset) == offset;
	}

	/**
	 * <p>Returns a new character sequence that is a subsequence of this sequence.</p>
	 * @param beginIndex The begin index, inclusive.
	 * @param endIndex The end index, exclusive.
	 * @return The specified subsequence.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public java.lang.CharSequence subSequence(int beginIndex, int endIndex) {
		return substring(beginIndex, endIndex);
	}

	/**
	 * <p>Returns a new string that is a substring of this string.</p>
	 * @param beginIndex The begin index, inclusive.
	 * @return The specified substring.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public synchronized java.lang.String substring(int beginIndex) {
		return StringLikes.slice(
				(StringLike)(java.lang.Object)this,
				beginIndex
		);
	}

	/**
	 * <p>Returns a new string that is a substring of this string.</p>
	 * @param beginIndex The begin index, inclusive.
	 * @param endIndex The end index, exclusive.
	 * @return The specified substring.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public synchronized java.lang.String substring(int beginIndex, int endIndex) {
		return StringLikes.slice(
				(StringLike)(java.lang.Object)this,
				beginIndex,
				endIndex
		);
	}

	/**
	 * <p>Converts this string to a new character array.</p>
	 * @return A newly allocated character array whose length is the length of this string and whose
	 * contents are initialized to contain the character sequence represented by this string.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public char[] toCharArray() {
		int n = length();
		char[] arr = new char[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = charAt(i);
		}
		return arr;
	}

	/**
	 * <p>Converts all of the characters in this string to lower case.</p>
	 * @return The string, converted to lower case.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public java.lang.String toLowerCase() {
		return StringLikes.toLowerCase((StringLike)(java.lang.Object)this);
	}

	/**
	 * <p>Returns this string itself.</p>
	 * @return This string itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this native method with the current {@link String}.
	 */
	@Override
	public native java.lang.String toString();

	/**
	 * <p>Converts all of the characters in this string to upper case.</p>
	 * @return The string, converted to upper case.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public java.lang.String toUpperCase() {
		return StringLikes.toUpperCase((StringLike)(java.lang.Object)this);
	}

	/**
	 * <p>Returns a copy of the string, with leading and trailing whitespace omitted.</p>
	 * @return A copy of this string with leading and trailing white space removed, or this string if 
	 * it has no leading or trailing white space.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public synchronized java.lang.String trim() {
		return StringLikes.trim(this);
	}
}
