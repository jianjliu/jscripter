
/*
 *  JScripter Standard 1.0 - To Script In Java
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

package jsx.core;

import js.Disposable;
import js.Js;

/**
 * <p>A utility class providing general operations with its static methods.</p>
 * <p>Users are encouraged to use the utilities provided by this class instead of the 
 * <b>opaque</b> methods of {@link js.Js} in consideration of the reuse benefit for 
 * re-compilation results.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Variables extends Disposable
{
	private Variables() {}

	/**
	 * <p>Checks if a variable is undefined.</p>
	 * @param v Any value or object.
	 * @return <tt>true</tt> if <tt>v</tt> is undefined; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	public static final boolean undefined(Object v) {
		return Js.undefined(v);
	}

	/**
	 * <p>Checks if a variable is defined.</p>
	 * @param v Any value or object.
	 * @return <tt>true</tt> if <tt>v</tt> is defined; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	public static final boolean defined(Object v) {
		return Js.defined(v);
	}

	/**
	 * <p>Returns a string representation of a variable.</p>
	 * @param v Any value or object.
	 * @return The string representation of the value or object.
	 * @since 1.0
	 */
	public static final String toString(Object v) {
		return Js.toString(v);
	}

	/**
	 * <p>Returns a string indicating the data-type of the argument.</p>
	 * <p>Simulating the JavaScript <tt>typeof</tt> operator and <tt>typeof()</tt> 
	 * function, this invocation evaluates to "number", "string", or "boolean" if the  
	 * argument is a number, string, or boolean value. It evaluates to "object" for objects 
	 * and arrays. It evaluates to "function" for function instance and to "undefined" if 
	 * the argument is undefined.</p>
	 * @param v Any value or object.
	 * @return A string indicating the data-type of the argument.
	 * @since 1.0
	 */
	public static final String typeof(Object v) {
		return Js.typeof(v);
	}
}
