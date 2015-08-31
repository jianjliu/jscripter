
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

package org.jscripter.emu.java.io;

import js.Js;

/**
 * <p>A character stream of a string.</p>
 * <p>This is an <tt>internal</tt> general class emulating <tt>java.io.*</tt> class with the same 
 * simple name as this one and is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */
public class StringReader extends Reader
{
	private final String str;
	private int next = 0;
	private int mark = 0;

	/**
	 * <p>Internally constructs a new string reader.</p>
	 * @param s The string providing the character-stream.
	 * @throws java.io.IOException 
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	public StringReader(String s) throws java.io.IOException {
		this.str = s;
		if (Js.undefined(str)) {
			throw new java.io.IOException("Stream closed");
		}
	}

	/**
	 * <p>Internally reads a single character.</p>
	 * @return The character read, or -1 if the end of the stream has been reached
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public int read() {
		if (next >= str.length()) {
			return -1;
		}
		return str.charAt(next++);
	}

	/**
	 * Reads characters into a portion of an array.
	 * @param cbuf A char buffer
	 * @param off Where to start writing characters
	 * @param len Maximum number of characters to read
	 * @return The number of characters read, or -1 if the end of the stream has been reached
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public int read(char cbuf[], int off, int len) {
		if ((off < 0) || (off > cbuf.length) || (len < 0) ||
			((off + len) > cbuf.length) || ((off + len) < 0)) {
			throw new IndexOutOfBoundsException();
		} else if (len == 0) {
			return 0;
		}
		if (next >= str.length()) {
			return -1;
		}
		int n = Math.min(str.length() - next, len);
		str.getChars(next, next + n, cbuf, off);
		next += n;
		return n;
	}

	/**
	 * <p>Internally skips the specified number of characters in the stream and returns
	 * the number of characters that were skipped.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public long skip(long ns) {
		if (next >= str.length()) {
			return 0;
		}
		int n = min(ns, str.length() - next);
		n = Math.max(-next, n);
		next += n;
		return n;
	}

	private static final int min(long l, int i) {
		return Js.cond(
				Js.lgte(l, (long)i),
				i,
				(int)l
		);
	}

	/**
	 * <p>Internally tells whether this stream is ready to be read.</p>
	 * @return <tt>true</tt> if the next read() is guaranteed not to block for input
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public boolean ready() {
		return true;
	}

	/**
	 * <p>Internally tells whether this stream supports the mark() operation.</p>
	 * @return <tt>true</tt>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public boolean markSupported() {
		return true;
	}

	/**
	 * <p>Internally marks the present position in the stream.</p>
	 * @param limit Limit on the number of characters that may be read while still preserving the mark.
	 * Because the stream's input comes from a string, there is no actual limit, so this argument must 
	 * not be negative, but is otherwise ignored.
	 * @throws IllegalArgumentException If <tt>limit</tt> < 0
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public void mark(int limit) {
		if (limit < 0){
			throw new IllegalArgumentException("limit < 0");
		}
		mark = next;
	}

	/**
	 * <p>Internally resets the stream to the most recent mark, or to the beginning of the
	 * string if it has never been marked.</p>
	 * @throws IOException If an I/O error occurs.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public void reset() throws java.io.IOException {
		next = mark;
	}

	/**
	 * <p>Internally closes the stream and releases any system resources associated with it.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public void close() {
	}
}
