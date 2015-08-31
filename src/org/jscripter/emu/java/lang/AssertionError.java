
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
 * <p>An <b>internal</b> class of an error thrown to indicate that an assertion has failed, emulating a standard 
 * <tt>java.lang</tt> interface or class with the same simple name as this one.</p>
 * <p>This interface or class is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */
public class AssertionError extends Error
{
	/**
	 * <p>Internally constructs an error of this type with no detail message.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	public AssertionError() {
	}

	private AssertionError(java.lang.String message) {
		super(message);
	}

	/**
	 * <p>Internally constructs an error of this type with its detail message derived from the 
	 * specified object, which is converted to a string.</p>
	 * <p>If the specified object is an instance of {@link Throwable}, it becomes the cause of the 
	 * newly constructed assertion error.</p>
	 * @param message A value to be used in constructing detail message.
	 * @since 1.0
	 * @see Throwable#getCause()
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	public AssertionError(java.lang.Object message) {
		super(String.valueOf((Object)message), message instanceof Throwable ? (Throwable) message : null);
	}

	/**
	 * <p>Internally constructs an error of this type with its detail message derived from the 
	 * specified <tt>boolean</tt> value, which is converted to a string.</p>
	 * @param message A value to be used in constructing detail message.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	public AssertionError(boolean message) {
		this(String.valueOf(message));
	}

	/**
	 * <p>Internally constructs an error of this type with its detail message derived from the 
	 * specified <tt>char</tt> value, which is converted to a string.</p>
	 * @param message A value to be used in constructing detail message.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	public AssertionError(char message) {
		this(String.valueOf(message));
	}

	/**
	 * <p>Internally constructs an error of this type with its detail message derived from the 
	 * specified <tt>int</tt> value, which is converted to a string.</p>
	 * @param message A value to be used in constructing detail message.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	public AssertionError(int message) {
		this(String.valueOf(message));
	}

	/**
	 * <p>Internally constructs an error of this type with its detail message derived from the 
	 * specified <tt>long</tt> value, which is converted to a string.</p>
	 * @param message A value to be used in constructing detail message.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	public AssertionError(long message) {
		this(String.valueOf(message));
	}

	/**
	 * <p>Internally constructs an error of this type with its detail message derived from the 
	 * specified <tt>float</tt> value, which is converted to a string.</p>
	 * @param message A value to be used in constructing detail message.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	public AssertionError(float message) {
		this(String.valueOf(message));
	}

	/**
	 * <p>Internally constructs an error of this type with its detail message derived from the 
	 * specified <tt>double</tt> value, which is converted to a string.</p>
	 * @param message A value to be used in constructing detail message.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	public AssertionError(double message) {
		this(String.valueOf(message));
	}
}
