
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

package js;

/**
 * <p>An <b>opaque</b> class resembling JavaScript array literals (also known as 
 * array literals) and variable arguments.</p>
 * <p>This class can only be used to construct a variable-length argument at the last 
 * parameter position of the invocation on a method of <b>opaque</b> interfaces or classes. 
 * Otherwise, JS re-compilers shall report errors.</P>
 * <p>JavaScript defines a literal syntax for creating and initializing arrays. An 
 * array literal (or array initializer) is a comma-separated list of values contained 
 * within square brackets. The values within the brackets are assigned sequentially 
 * to array indexes starting with zero.</p>
 * <p>Like object literals, array literals can be nested.</p>
 * <p>Also, as with object literals, the elements in array literals can be arbitrary 
 * expressions and need not be restricted to constants.</p>
 * <p>Undefined elements can be included in an array literal by simply omitting a 
 * value between commas.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see Js#array()
 * @see Js#array(boolean[])
 * @see Js#array(byte[])
 * @see Js#array(char[])
 * @see Js#array(short[])
 * @see Js#array(int[])
 * @see Js#array(long[])
 * @see Js#array(float[])
 * @see Js#array(double[])
 * @see Js#array(Object[])
 * @see js.core.JsArray#JsArray()
 * @see js.core.JsArray#JsArray(js.core.JsObject)
 * @see js.core.JsArray#JsArray(boolean[])
 * @see js.core.JsArray#JsArray(byte[])
 * @see js.core.JsArray#JsArray(char[])
 * @see js.core.JsArray#JsArray(short[])
 * @see js.core.JsArray#JsArray(int[])
 * @see js.core.JsArray#JsArray(long[])
 * @see js.core.JsArray#JsArray(double[])
 * @see js.core.JsArray#JsArray(float[])
 * @see js.core.JsArray#JsArray(Object[])
 * @see js.core.JsGlobal.Array#create(Object)
 * @see jsx.core.ArrayLikes
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 * Re-compilers should convert Java expressions like:
 * <pre>new Vars().add(v1).add(v2).add(null).add(v3).var()</pre>
 * into JavaScript expressions as:
 * <pre>[v1,v2,,v3]</pre>
 * and convert Java invocations on the methods of <tt>opaque</tt> interfaces or classes 
 * like:
 * <pre>a.concat(new Vars().add(arg1).add(arg2).add(arg3))</pre>
 * into JavaScript expressions as:
 * <pre>a.concat(arg1, arg2, arg3)</pre>
 * and report error if <tt>a</tt> is not an instance of an <tt>opaque</tt> interface and 
 * class.
 */

public final class Vars<T> extends Var<ArrayLike<T>>
{
	private final ArrayLike<T> a;

	/**
	 * <p>Creates an <tt>Vars</tt> list.</p>
	 * @since 1.0
	 * @javascript Re-compilers must create a re-compile time <tt>Vars</tt> list without 
	 * generating any JavaScript statements or expressions for this constructor.
	 */
	public Vars() {
		a = Js.array();
	}

	/**
	 * <p>Converts the current <tt>Vars</tt> list instance to an array.</p>
	 * @return The array represented by the current <tt>Vars</tt> list itself.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript array literal represented by the current <tt>Vars</tt> list instance 
	 * they have kept.
	 */
	@Override
	public final ArrayLike<T> var() {
		return a;
	}

	/**
	 * <p>Appends a value to the current <tt>Vars</tt> list instance.</p>
	 * @param arg The value to be append to the current <tt>Vars</tt> list instance.
	 * @return The current <tt>Vars</tt> list instance itself.
	 * @since 1.0
	 * @javascript Re-compilers must append <tt>arg</tt> to the current re-compile time 
	 * <tt>Vars</tt> list they have kept without generating any JavaScript statements 
	 * or expressions for the instance invocation of this method.
	 */
	public final Vars<T> add(T arg) {
		a.push(arg);
		return this;
	}

	/**
	 * <p>Appends all values of <tt>other</tt> <tt>Vars</tt> list to the current 
	 * <tt>Vars</tt> list instance.</p>
	 * @param other Any other <tt>Vars</tt> list.
	 * @return The current <tt>Vars</tt> list instance itself.
	 * @since 1.0
	 * @javascript Re-compilers must append all values of <tt>other</tt> <tt>Vars</tt> 
	 * list to the current re-compile time <tt>Vars</tt> list they have kept without 
	 * generating any JavaScript statements or expressions for the instance invocation of 
	 * this method.
	 */
	public final Vars<T> addAll(Vars<? extends T> other) {
		a.push(other);
		return this;
	}
}
