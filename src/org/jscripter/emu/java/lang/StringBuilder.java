
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

import js.ArrayLike;
import js.Js;
import js.Vars;
import jsx.core.ArrayLikes;

/**
 * <p><b>Internally</b> represents a mutable sequence of characters, emulating a standard <tt>java.lang</tt> interface or 
 * class with the same simple name as this one.</p>
 * <p>This interface or class is only used internally by JS re-compiler implementations.</p>
 * <p>This class is exactly same as {@link StringBuffer} for the emulation purpose.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */
public final class StringBuilder implements java.lang.CharSequence, Serializable, java.lang.Appendable
{
	private ArrayLike<java.lang.String> arr  = new Vars<java.lang.String>().var();
	private int len = 0;
	private int capacity = 16;

	/**
	 * <p>Constructs a string builder with no characters in it and an initial capacity of 16 characters.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 * A re-compiler simply replaces an invocation of this empty constructor with its argument.
	 */
	public StringBuilder() {
	}

	/**
	 * <p>Constructs a string builder with no characters in it and an initial capacity specified by the argument.</p>
	 * @param capacity The initial capacity.
	 * @throws java.lang.NegativeArraySizeException if the <tt>capacity</tt> argument is less than 0.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 * A re-compiler simply replaces an invocation of this empty constructor with its argument.
	 */
	public StringBuilder(int capacity) {
		if (capacity < 0) {
			throw new java.lang.NegativeArraySizeException(String.valueOf(capacity));
		}
		this.capacity = capacity;
	}

	/**
	 * <p>Constructs a string builder initialized to the contents of the specified string.</p>
	 * <p>The initial capacity of the string builder is 16 plus the length of the string argument.</p>
	 * @param str The initial contents of the buffer.
	 * @throws java.lang.NullPointerException - if <tt>str</tt> is <tt>null</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 * A re-compiler simply replaces an invocation of this empty constructor with its argument.
	 */
	public StringBuilder(java.lang.String str) {
		if (Js.undefined(str)) {
			throw new java.lang.NullPointerException();
		}
		capacity += str.length();
		append(str);
	}

	/**
	 * <p>Constructs a string builder that contains the same characters as the specified {@link CharSequence}.
	 * <p>The initial capacity of the string builder is 16 plus the length of the {@link CharSequence} argument.</p>
	 * @param seq The sequence to copy.
	 * @throws java.lang.NullPointerException - if <tt>seq</tt> is <tt>null</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 * A re-compiler simply replaces an invocation of this empty constructor with its argument.
	 */
	public StringBuilder(java.lang.CharSequence seq) {
		if (Js.undefined(seq)) {
			throw new java.lang.NullPointerException();
		}
		capacity += seq.length();
		append(seq.toString());
	}

	/**
	 * <p>Appends the string representation of the value argument to the sequence.</p>
	 * @param x A value.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder append(boolean x) {
		return append(java.lang.String.valueOf(x));
	}

	/**
	 * <p>Appends the string representation of the value argument to the sequence.</p>
	 * @param x A value.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder append(char x) {
		return append(java.lang.String.valueOf(x));
	}

	/**
	 * <p>Appends the string representation of the char array argument to this sequence.</p>
	 * @param x A char array.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder append(char[] x) {
		return append(java.lang.String.valueOf(x));
	}

	/**
	 * <p>Appends the string representation of a subarray of the char array argument to this sequence.</p>
	 * @param x A char array.
	 * @param offset The index of the first char to append.
	 * @param len The number of chars to append.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder append(char[] x, int offset, int len) {
		return append(java.lang.String.valueOf(x, offset, len));
	}

	/**
	 * <p>Appends the specified character sequence to this sequence.</p>
	 * @param q A char sequence.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder append(java.lang.CharSequence q) {
		return append(q.toString());
	}

	/**
	 * <p>Appends a subsequence of the specified char sequence to this sequence.</p>
	 * @param q A char sequence.
	 * @param start The starting index of the subsequence to be appended.
	 * @param end The end index of the subsequence to be appended.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder append(java.lang.CharSequence q, int start, int end) {
		return append(q.subSequence(start, end));
	}

	/**
	 * <p>Appends the string representation of the value argument to the sequence.</p>
	 * @param x A value.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder append(double x) {
		return append(java.lang.String.valueOf(x));
	}

	/**
	 * <p>Appends the string representation of the value argument to the sequence.</p>
	 * @param x A value.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder append(float x) {
		return append(java.lang.String.valueOf(x));
	}

	/**
	 * <p>Appends the string representation of the value argument to the sequence.</p>
	 * @param x A value.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder append(int x) {
		return append(java.lang.String.valueOf(x));
	}

	/**
	 * <p>Appends the string representation of the value argument to the sequence.</p>
	 * @param x A value.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder append(long x) {
		return append(java.lang.String.valueOf(x));
	}

	/**
	 * <p>Appends the string representation of the value argument to the sequence.</p>
	 * @param x A value.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder append(Object x) {
		return append(java.lang.String.valueOf(x));
	}

	/**
	 * <p>Appends the specified string to this character sequence.</p>
	 * @param str A string.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder append(java.lang.String str) {
		if (Js.undefined(str)) {
			str = "null";
		}
		int appendLength = str.length();
		if (appendLength > 0) {
			ArrayLikes.push(arr, str);
			len += appendLength;
			capacity();
		}
		return this;
	};

	/**
	 * <p>Appends the specified string buffer to this sequence.</p>
	 * @param x A {@link java.lang.StringBuffer}.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder append(java.lang.StringBuffer x) {
		return append(java.lang.String.valueOf(x));
	}

	/**
	 * <p>Returns the current capacity.</p>
	 * @return The current capacity.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public int capacity() {
		int arrlen = ArrayLikes.length(arr);
		if (arrlen > capacity) {
			toString();
			ensureCapacity(arrlen);
		}
		return capacity;
	}

	/**
	 * <p>Returns the char value in this sequence at the specified index.</p>
	 * @param index The index of the desired char value.
	 * @return The char value at the specified index.
	 * @throws java.lang.IndexOutOfBoundsException - if <tt>index</tt> is negative or greater than or 
	 * equal to {@link #length()}.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public char charAt(int index) {
		return toString().charAt(index);
	}

	/**
	 * <p>Removes the characters in a substring of this sequence.</p>
	 * @param start The beginning index, inclusive.
	 * @param end The ending index, exclusive.
	 * @return This object itself.
	 * @throws java.lang.StringIndexOutOfBoundsException - if <tt>start</tt> is negative or greater than 
	 * {@link #length()}, or greater than <tt>end</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder delete(int start, int end) {
		return replace(start, end, "");
	}

	/**
	 * <p>Removes the char at the specified position in this sequence.</p>
	 * @param start The index of char to remove.
	 * @return This object itself.
	 * @throws java.lang.StringIndexOutOfBoundsException - if <tt>index</tt> is negative or greater than or 
	 * equal to {@link #length()}.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder deleteCharAt(int start) {
		return delete(start, start + 1);
	}

	/**
	 * <p>Ensures that the capacity is at least equal to the specified minimum.</p>
	 * @param minimumCapacity The minimum desired capacity.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public void ensureCapacity(int minimumCapacity) {
		if (minimumCapacity > capacity()) {
			capacity = minimumCapacity * 2 + 2;
			ArrayLikes.length(arr, capacity);
		}
	}

	/**
	 * <p>Characters are copied from this sequence into the destination character array.</p>
	 * @param srcStart Start copying at this offset.
	 * @param srcEnd Stop copying at this offset.
	 * @param dst The array to copy the data into.
	 * @param dstStart The offset into <tt>dst</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public void getChars(int srcStart, int srcEnd, char[] dst, int dstStart) {
		String.checkBounds(srcStart, srcEnd, len);
		String.checkBounds(dstStart, dstStart + (srcEnd - srcStart), dst.length);
		java.lang.String s = toString();
		while (srcStart < srcEnd) {
			dst[dstStart++] = s.charAt(srcStart++);
		}
	}

	/**
	 * <p>Returns the index within this string of the first occurrence of the specified substring.</p>
	 * @param x A string.
	 * @return The index of the first character of the first such substring if the string argument occurs 
	 * as a substring within this object; -1 otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public int indexOf(java.lang.String x) {
		return toString().indexOf(x);
	}

	/**
	 * <p>Returns the index within this string of the first occurrence of the specified substring, 
	 * starting at the specified index.</p>
	 * @param x A string.
	 * @param start The index from which to start the search.
	 * @return The index within this string of the first occurrence of the specified substring, 
	 * starting at the specified index.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public int indexOf(java.lang.String x, int start) {
		return toString().indexOf(x, start);
	}

	/**
	 * <p>Inserts the string representation of the argument into this sequence.</p>
	 * @param index The offset index.
	 * @param x A value.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder insert(int index, boolean x) {
		return insert(index, java.lang.String.valueOf(x));
	}

	/**
	 * <p>Inserts the string representation of the argument into this sequence.</p>
	 * @param index The offset index.
	 * @param x A value.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder insert(int index, char x) {
		return insert(index, java.lang.String.valueOf(x));
	}

	/**
	 * <p>Inserts the string representation of the char array argument into this sequence.</p>
	 * @param index The offset index.
	 * @param x A char array.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder insert(int index, char[] x) {
		return insert(index, java.lang.String.valueOf(x));
	}

	/**
	 * <p>Inserts the string representation of a subarray of the char array argument to this sequence.</p>
	 * @param index The index at which to insert subarray.
	 * @param x A char array.
	 * @param offset The index of the first char in subarray to be inserted.
	 * @param len The number of chars in the subarray to be inserted.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder insert(int index, char[] x, int offset, int len) {
		return insert(index, java.lang.String.valueOf(x, offset, len));
	}

	/**
	 * <p>Inserts the string representation of the char sequence argument into this sequence.</p>
	 * @param index The offset index.
	 * @param x A char sequence.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder insert(int index, CharSequence x) {
		return insert(index, x.toString());
	}

	/**
	 * <p>Inserts the string representation of the char sequence argument into this sequence.</p>
	 * @param index The offset index.
	 * @param x A char sequence.
	 * @param start The starting index of the subsequence to be inserted.
	 * @param end The end index of the subsequence to be inserted.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder insert(int index, CharSequence x, int start, int end) {
		return insert(index, x.subSequence(start, end).toString());
	}

	/**
	 * <p>Inserts the string representation of the argument into this sequence.</p>
	 * @param index The offset index.
	 * @param x A value.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder insert(int index, double x) {
		return insert(index, java.lang.String.valueOf(x));
	}

	/**
	 * <p>Inserts the string representation of the argument into this sequence.</p>
	 * @param index The offset index.
	 * @param x A value.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder insert(int index, float x) {
		return insert(index, java.lang.String.valueOf(x));
	}

	/**
	 * <p>Inserts the string representation of the argument into this sequence.</p>
	 * @param index The offset index.
	 * @param x A value.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder insert(int index, int x) {
		return insert(index, java.lang.String.valueOf(x));
	}

	/**
	 * <p>Inserts the string representation of the argument into this sequence.</p>
	 * @param index The offset index.
	 * @param x A value.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder insert(int index, long x) {
		return insert(index, java.lang.String.valueOf(x));
	}

	/**
	 * <p>Inserts the string representation of the argument into this sequence.</p>
	 * @param index The offset index.
	 * @param x A value.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder insert(int index, Object x) {
		return insert(index, java.lang.String.valueOf(x));
	}

	/**
	 * <p>Inserts a string into this sequence.</p>
	 * @param index The offset index.
	 * @param x A string.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder insert(int index, java.lang.String x) {
		return replace(index, index, x);
	}

	/**
	 * <p>Returns the index within this string of the last occurrence of the specified substring.</p>
	 * @param x A string.
	 * @return The index within this string of the last occurrence of the specified substring.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public int lastIndexOf(java.lang.String x) {
		return toString().lastIndexOf(x);
	}

	/**
	 * <p>Returns the index within this string of the last occurrence of the specified substring, 
	 * starting at the specified index.</p>
	 * @param x A string.
	 * @param start The index from which to start the search.
	 * @return The index within this string of the last occurrence of the specified substring, 
	 * starting at the specified index.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public int lastIndexOf(java.lang.String x, int start) {
		return toString().lastIndexOf(x, start);
	}

	/**
	 * <p>Returns the length (character count).</p>
	 * @return The length of the sequence of characters currently represented by this object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public int length() {
		return len;
	}

	/**
	 * <p>Replaces the characters in a substring of this sequence with characters in the specified String.</p>
	 * @param start The beginning index, inclusive.
	 * @param end The ending index, exclusive.
	 * @param str A string.
	 * @return This object itself.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public StringBuilder replace(int start, int end, java.lang.String str) {
		java.lang.String s = toString();
		arr = new Vars<java.lang.String>()
				.add(s.substring(0, start))
				.add(str)
				.add(s.substring(end)).var();
		len += str.length() - (end - start);
		return this;
	}

	/**
	 * <p>Modifies a character at the specified index.</p>
	 * @param index The index of the character to modify.
	 * @param x A char.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public void setCharAt(int index, char x) {
		replace(index, index + 1, java.lang.String.valueOf(x));
	}

	/**
	 * <p>Sets the length of the character sequence.</p>
	 * @param newLength The new length.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public void setLength(int newLength) {
		if (newLength < len) {
			delete(newLength, len);
		} else if (newLength > len) {
			append(new char[newLength - len]);
		}
	}

	/**
	 * <p>Returns a new character sequence that is a subsequence of this sequence.</p>
	 * @param start The start index, inclusive.
	 * @param end The end index, exclusive.
	 * @return The specified subsequence.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public java.lang.CharSequence subSequence(int start, int end) {
		return this.substring(start, end);
	}

	/**
	 * <p>Returns a new string that contains a subsequence of characters currently 
	 * contained in this sequence.</p>
	 * @param start The start index, inclusive.
	 * @return The new string.
	 * @throws java.lang.StringIndexOutOfBoundsException - if <tt>index</tt> is negative or greater than or 
	 * equal to {@link #length()}.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public java.lang.String substring(int start) {
		return toString().substring(start);
	}

	/**
	 * <p>Returns a new string that contains a subsequence of characters currently 
	 * contained in this sequence.</p>
	 * @param start The start index, inclusive.
	 * @param end The end index, exclusive.
	 * @return The new string.
	 * @throws java.lang.StringIndexOutOfBoundsException - if <tt>start</tt> is negative or greater than 
	 * {@link #length()}, or greater than <tt>end</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public java.lang.String substring(int start, int end) {
		return toString().substring(start, end);
	}

	/**
	 * <p>Returns a string representing this sequence.</p>
	 * @return A string representation of this sequence.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public java.lang.String toString() {
		if (ArrayLikes.length(arr) > 1) {
			java.lang.String s = ArrayLikes.join(arr);
			arr = new Vars<java.lang.String>().add(s).var();
		}
		return arr.get(0);
	}
}
