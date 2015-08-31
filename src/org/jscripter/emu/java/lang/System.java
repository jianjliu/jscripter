
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

import org.jscripter.emu.java.JavaObject;

import js.*;
import js.core.JsDate;
import js.core.JsGlobal;

/**
 * <p>An <b>Internal</b> utility class containing several useful fields and methods
 * about the underlying system, emulating a standard <tt>java.lang</tt>
 * interface or class with the same simple name as this one.</p>
 * <p>This interface or class is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */
public final class System
{
	/**
	 * <p>Copies an array from the specified source array, beginning at the
	 * specified position, to the specified position of the destination array.</p>
	 * @param src The source array.
	 * @param srcPos Starting position in the source array.
	 * @param dest The destination array.
	 * @param destPos Starting position in the destination data.
	 * @param length The number of array elements to be copied.
	 * @throws java.lang.IndexOutOfBoundsException if copying would cause access of data 
	 * outside array bounds.
	 * @throws java.lang.ArrayStoreException if an element in the <tt>src</tt> array could not 
	 * be storedinto the <tt>dest</tt> array because of a type mismatch.
	 * @throws java.lang.NullPointerException if either <tt>src</tt> or <tt>dest</tt> is <tt>null</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@SuppressWarnings("unchecked")
	public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) {
		for (int i = 0; i < length; i++) {
			((ArrayLike<Object>)dest).set(destPos + i, ((ArrayLike<Object>)src).get(srcPos + i));
		}
	}

	/**
	 * <p>Terminates the current execution.</p>
	 * <p>This method just closes the current window in for emulation.</p>
	 * @param status The exit status. This argument is simply ignored in the emulation mode.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static void exit(int status) {
		Js.win().close();
	}

	private final static int booleanHashCode(java.lang.Object o) {
		return ((Boolean) o).hashCode();
	}

	private final static int numberHashCode(java.lang.Object o) {
		return ((Double) o).hashCode();
	}

	private final static int stringHashCode(java.lang.Object o) {
		return ((String) o).hashCode();
	}

	/**
	 * <p>Returns the same hash code for the given object as would be returned by the default method 
	 * <tt>hashCode()</tt>, whether or not the given object's class overrides {@link Object#hashCode()}.
	 * The hash code for the <tt>null</tt> reference is zero.</p>
	 * @param o An object for which the hash code is to be calculated.
	 * @return The hash code.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public final static int identityHashCode(java.lang.Object o) {
		switch (Js.cases().add("boolean").add("number").add("string")
				.add("object").indexOf(Js.typeof(o))) {
		case 0:
			return booleanHashCode(o);
		case 1:
			return numberHashCode(o);
		case 2:
			return stringHashCode(o);
		case 3:
			if (Js.instanceOf(o, JsGlobal.Date.with())) {
				return ((JsDate) o).valueOf().hashCode();
			} else {
				return JavaObject.hashCode(o);
			}
		default:
			return 0;
		}
	}

	/**
	 * <p>Returns the current time in milliseconds.</p>
	 * @return The difference, measured in milliseconds, between the current time and 
	 * midnight, January 1, 1970 UTC.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public final static long currentTimeMillis() {
		return JsGlobal.Date.with().create().valueOf().longValue();
	}

	/**
	 * <p>Runs the garbage collector.</p>
	 * <p>This method does nothing in emulation.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static void gc() {}

	/**
	 * <p>Runs the finalization methods of any objects pending finalization.</p>
	 * <p>This method does nothing in emulation.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static void runFinalization() {}
}
