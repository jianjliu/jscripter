
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

/**
 * <p><b>Internally</b> represents a readable sequence of char values, emulating a
 * standard <tt>java.lang</tt> interface or class with the same simple name as
 * this one.</p>
 * <p>This interface or class is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API
 * Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */
public interface CharSequence
{
	/**
	 * <p>Returns the char value at the specified index.</p>
	 * @param index The index of the char value to be returned. An index ranges from zero to 
	 * <tt>{@link #length()} - 1</tt>.
	 * @return The specified char value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	char charAt(int index);

	/**
	 * <p>Returns the length of this character sequence.</p>
	 * @return The number of chars in this sequence.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	int length();

	/**
	 * <p>Returns a new {@link CharSequence} that is a subsequence of this sequence.</p>
	 * <p>The subsequence starts with the char value at the specified <tt>index</tt> and ends with 
	 * the char value at index <tt>end - 1</tt>. The length (in chars) of the returned sequence is 
	 * <tt>end - start</tt>, so if <tt>start == end</tt> then an empty sequence is returned.</p>
	 * @param start The start index, inclusive.
	 * @param end The end index, exclusive.
	 * @return The specified subsequence.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	CharSequence subSequence(int start, int end);

	/**
	 * <p>Returns a string containing the characters in this sequence in the same
	 * order as this sequence. </p>
	 * <p>The length of the string will be the length of this sequence.</p>
	 * @return A string consisting of exactly this sequence of characters.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	java.lang.String toString();
}
