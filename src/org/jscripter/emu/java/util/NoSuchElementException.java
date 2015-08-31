
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

package org.jscripter.emu.java.util;

/**
 * <p>An <b>internal</b> class of an exception thrown to indicate that there are no more elements 
 * in the enumeration or iteration, emulating a standard <tt>java.util</tt> interface or class with 
 * the same simple name as this one.</p>
 * <p>This interface or class is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */
public class NoSuchElementException extends org.jscripter.emu.java.lang.RuntimeException
{
	/**
	 * <p>Internally constructs an exception of this type.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	public NoSuchElementException() {
	}

	/**
	 * <p>Internally constructs an exception of this type with detail message.</p>
	 * @param message The detail message.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	public NoSuchElementException(String message) {
		super(message);
	}
}