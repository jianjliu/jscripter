
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

/**
 * <p>An abstract base class of character-stream readers.</p>
 * <p>This is an <tt>internal</tt> general class emulating <tt>java.io.*</tt> class with the same 
 * simple name as this one and is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */

public abstract class Reader implements Closeable
{
	/**
	 * <p>Internally constructs a new character-stream reader</p>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	protected Reader() {
	}

	/**
	 * <p>Internally reads a single character.</p>
	 * @return The character read, or -1 if the end of the stream has been reached.
	 * @throws IOException If an I/O error occurs.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public abstract int read() throws java.io.IOException;

	/**
	 * <p>Internally reads characters into an array.</p>
	 * @param cbuf A char buffer
	 * @return The number of characters read, or -1 if the end of the stream has been reached.
	 * @throws IOException If an I/O error occurs.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public int read(char cbuf[]) throws java.io.IOException {
		return read(cbuf, 0, cbuf.length);
	}

	/**
	 * <p>Internally reads characters into a portion of an array.</p>
	 * @param cbuf A char buffer
	 * @param off Where to start storing characters
	 * @param len Maximum number of characters to read
	 * @return The number of characters read, or -1 if the end of the stream has been reached.
	 * @throws IOException If an I/O error occurs.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public abstract int read(char cbuf[], int off, int len) throws java.io.IOException;

	/**
	 * <p>Internally skips characters</p>.
	 * @param  n  The number of characters to skip
	 * @return	The number of characters actually skipped
	 * @throws IllegalArgumentException If <tt>n</tt> is negative.
	 * @throws IOException If an I/O error occurs.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public abstract long skip(long n) throws java.io.IOException;

	/**
	 * <p>Internally tells whether this stream is ready to be read.</p>
	 * @return <tt>true</tt> if the next read() is guaranteed not to block for input; <tt>false</tt>, otherwise.
	 *  Note that returning <tt>false</tt> does not guarantee that the next read will block.
	 * @throws IOException If an I/O error occurs.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public abstract boolean ready() throws java.io.IOException;

	/**
	 * <p>Internally tells whether this stream supports the mark operation.</p>
	 * <p>The default implementation always returns <tt>false</tt>.</p>
	 * <p>Subclasses should override this method.</p>
	 * @return <tt>true</tt> if and only if this stream supports the mark operation.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public abstract boolean markSupported();

	/**
	 * <p>Internally marks the present position in the stream.</p>
	 * @param limit Limit on the number of characters that may be read while still preserving 
	 * the mark.  After reading this many characters, attempting to reset the stream may fail.
	 * @throws IOException If the stream does not support mar(), or if some other I/O error occurs.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public abstract void mark(int limit) throws java.io.IOException;

	/**
	 * <p>Internally resets the stream.</p>
	 * @throws IOException If the stream has not been marked, or if the mark has been invalidated,
	 * or if the stream does not support reset(), or if some other I/O error occurs.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public abstract void reset() throws java.io.IOException;

	/**
	 * <p>Internally closes the stream and releases any system resources associated with it.</p>
	 * @throws IOException If an I/O error occurs.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	 public abstract void close() throws java.io.IOException;

}
