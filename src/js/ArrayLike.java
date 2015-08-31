
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

import js.core.JsArray;
import js.core.JsFunction;

/**
 * <p>An <b>opaque</b> interface resembling JavaScript arrays.</p>
 * <p>This interface must be implemented in JS Simulation Libraries.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see Vars#var()
 * @see Js#array()
 * @see Js#array(Object[])
 * @see Js#array(boolean[])
 * @see Js#array(byte[])
 * @see Js#array(char[])
 * @see Js#array(short[])
 * @see Js#array(int[])
 * @see Js#array(long[])
 * @see Js#array(float[])
 * @see Js#array(double[])
 * @see js.core.JsArray#JsArray()
 * @see js.core.JsArray#JsArray(js.core.JsObject)
 * @see js.core.JsArray#JsArray(Object[])
 * @see js.core.JsArray#JsArray(boolean[])
 * @see js.core.JsArray#JsArray(byte[])
 * @see js.core.JsArray#JsArray(char[])
 * @see js.core.JsArray#JsArray(short[])
 * @see js.core.JsArray#JsArray(int[])
 * @see js.core.JsArray#JsArray(long[])
 * @see js.core.JsArray#JsArray(float[])
 * @see js.core.JsArray#JsArray(double[])
 * @see js.core.JsGlobal.Array#create()
 * @see js.core.JsGlobal.Array#create(Object)
 * @see js.core.JsGlobal.Array#create(Vars)
 * @see jsx.core.ArrayLikes
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */

public interface ArrayLike<T> extends ArrayObject<T>
{
	/**
	 * <p>Writes an element of the current array instance.</p>
	 * @param i Array index of the element
	 * @param v The new value
	 * @return The new value of the element
	 * @see ArrayObject#get(int)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>(a[i]=v)</pre>
	 * where <tt>a</tt> is the current array instance of the invocation.
	 */
	public T set(int i, T v);
	/**
	 * <p>Deletes an element of the current array instance.</p>
	 * @param i Array index of the element
	 * @return <tt>true</tt> if the deletion is successful, <tt>false</tt> otherwise.
	 * @see #set(int, Object)
	 * @see jsx.core.ArrayLikes#delete(ArrayLike, int)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>(delete a[i])</pre>
	 * where <tt>a</tt> is the current array instance of the invocation.
	 */
	public boolean delete(int i);
	/**
	 * <p>Changes the size of the current array instance.</p>
	 * @param len New size
	 * @return New size
	 * @see jsx.core.ArrayLikes#length(ArrayLike, int)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>(a.length=len)</pre>
	 * where <tt>a</tt> is the current array instance of the invocation.
	 */
	public int length(int len);
	/**
	 * <p>Gets the <tt>index</tt> field of the current array instance.</p>
	 * @return The value of the <tt>index</tt> field of an array object
	 * @see StringLike#match(RegExpLike)
	 * @see jsx.core.ArrayLikes#index(ArrayLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>a.index</pre>
	 * where <tt>a</tt> is the current array instance of the invocation.
	 */
	public Integer index();
	/**
	 * <p>Gets the <tt>input</tt> field of the current array instance.</p>
	 * @return The value of the <tt>input</tt> field of an array object
	 * @see StringLike#match(RegExpLike)
	 * @see RegExpLike#exec(Object)
	 * @see jsx.core.ArrayLikes#input(ArrayLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>a.input</pre>
	 * where <tt>a</tt> is the current array instance of the invocation.
	 */
	public String input();
	/**
	 * <p>Creates and returns a new array object that is the result of concatenating its
	 * argument to the current array instance. This invocation does not modify the current 
	 * array. If the argument to <tt>concat</tt> is itself an array, the elements of that array 
	 * are concatenated, rather than the array itself.</p>
	 * @param arg A value to be concatenated with the current array.
	 * @return A new array object, which is formed by concatenating the specified argument
	 * to the current array.
	 * @see #concat(Vars)
	 * @see jsx.core.ArrayLikes#concat(ArrayLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public ArrayLike<T> concat(Object arg);
	/**
	 * <p>Creates and returns a new array object that is the result of concatenating each 
	 * of its arguments to the current array instance. This invocation does not modify the 
	 * current array. If any of the arguments to <tt>concat</tt> is itself an array, 
	 * the elements of that array are concatenated, rather than the array itself.</p>
	 * @param args A list of the argument values to be concatenated with the current array.
	 * @return A new array object, which is formed by concatenating each of the specified
	 * arguments to the current array.
	 * @see #concat(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public ArrayLike<T> concat(Vars<?> args);
	/**
	 * <p>Converts each element of the current array instance to a string and then 
	 * concatenates those strings, inserting a comma between the elements and returns 
	 * the resulting string.</p>
	 * @return The string that results from converting each element of the current array
	 * to a string and then concatenating them together with a comma between elements.
	 * @see #join(Object)
	 * @see StringLike#split(Object)
	 * @see jsx.core.ArrayLikes#join(ArrayLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String join();
	/**
	 * <p>Converts each element of the current array instance to a string and then 
	 * concatenates those strings, inserting the separator string specified by 
	 * <tt>separator</tt> between the elements and returns the resulting string.</p>
	 * @param separator An optional string used to separate one element of the current array
	 * from the next in the returned string. If this argument is omitted, 
	 * <tt>undefined</tt> or <tt>null</tt>, a comma is used.
	 * @return The string that results from converting each element of the current array
	 * to a string and then concatenating them together, with the <tt>separator</tt>
	 * string between elements.
	 * @see StringLike#split(Object)
	 * @see jsx.core.ArrayLikes#join(ArrayLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String join(Object separator);
	/**
	 * <p>Deletes the last element of the current array instance, decrements the length of 
	 * the current array, and returns the value of the deleted element. If the current array is 
	 * already empty, this invocation does not change the array and returns the undefined <tt>null</tt> value.</p>
	 * @return The last element of the current array.
	 * @see #push(Object)
	 * @see #push(Vars)
	 * @see jsx.core.ArrayLikes#pop(ArrayLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public T pop();
	/**
	 * <p>Appends the argument to the end of the current array instance by modifying the 
	 * array directly rather than creating a new one.</p>
	 * @param v A value to be appended to the end of the current array.
	 * @return The new length of the array, after the specified value are appended to it.
	 * @see #push(Vars)
	 * @see #pop()
	 * @see jsx.core.ArrayLikes#push(ArrayLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public int push(Object v);
	/**
	 * <p>Appends the arguments, in order, to the end of the current array instance by 
	 * modifying the array directly rather than creating a new one.</p>
	 * @param args A list of the values to be appended to the end of the current array.
	 * @return The new length of the array, after the specified values are appended to it.
	 * @see #push(Object)
	 * @see #pop()
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public int push(Vars<?> args);
	/**
	 * <p>Reverses the order of the elements of the current array instance by rearranging 
	 * them in place without creating a new array. If there are multiple references to the 
	 * array, the new order of the array elements is visible through all references after 
	 * this invocation.</p>
	 * @see jsx.core.ArrayLikes#reverse(ArrayLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void reverse();
	/**
	 * <p>Removes and returns the first element of the current array instance, shifting 
	 * all subsequent elements down one place to occupy the newly vacant space at the 
	 * start of the array. If the current array is empty, this invocation does nothing 
	 * and returns the undefined value <tt>null</tt>. Note that this invocation does 
	 * not create a new array; instead, it modifies the current array directly.</p>
	 * @return The former first element of the current array.
	 * @see #pop()
	 * @see jsx.core.ArrayLikes#shift(ArrayLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public T shift();
	/**
	 * <p>Returns a slice, or sub-array, of the current array instance without modifying 
	 * it. The returned array contains the element positioned by the first value of the 
	 * argument list and all subsequent elements up to, but not including, the element 
	 * positioned by the second value of the argument list. If the second value is not 
	 * specified or undefined, the returned array contains all elements from the position 
	 * specified by the first value to the end of the current array.</p>
	 * @param args A list of the argument values. The first value specifies the array 
	 * index at which the slice is to begin. If this value is negative, it specifies a 
	 * position measured from the end of the current array. That is, -1 indicates the 
	 * last element, -2 indicates the next from the last element, and so on. The second 
	 * value specifies the array index immediately after the end of the slice. If it is 
	 * undefined or not specified, the slice includes all array elements from the position 
	 * specified by the first value to the end of the array. If the second value is 
	 * negative, it specifies the array element measured from the end of the array.
	 * @return A new array that contains the elements of current array instance from the 
	 * element positioned by the first value of <tt>args</tt>, up to, but not including, 
	 * the element positioned by the second value of <tt>args</tt>.
	 * @see #slice(Object)
	 * @see #slice(Object, Object)
	 * @see #splice(Object)
	 * @see #splice(Vars)
	 * @see #splice(Object, Object)
	 * @see #splice(Object, Object, Object)
	 * @see #splice(Object, Object, Vars)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public ArrayLike<T> slice(Vars<?> args);
	/**
	 * <p>Returns a slice, or sub-array, of the current array instance without modifying 
	 * it. The returned array contains the element positioned by <tt>start</tt> and 
	 * all subsequent elements up to the end of the current array.</p>
	 * @param start The array index at which the slice is to begin. If negative, this 
	 * argument specifies a position measured from the end of the current array. That is, 
	 * -1 indicates the last element, -2 indicates the next from the last element, and so on.
	 * @return A new array that contains the elements of current array instance from the 
	 * element positioned by <tt>start</tt>, up to the end of the current array.
	 * @see #slice(Object, Object)
	 * @see #slice(Vars)
	 * @see #splice(Object)
	 * @see #splice(Vars)
	 * @see #splice(Object, Object)
	 * @see #splice(Object, Object, Object)
	 * @see #splice(Object, Object, Vars)
	 * @see jsx.core.ArrayLikes#slice(ArrayLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public ArrayLike<T> slice(Object start);
	/**
	 * <p>Returns a slice, or sub-array, of the current array instance without modifying 
	 * it. The returned array contains the element positioned by <tt>start</tt> and 
	 * all subsequent elements up to, but not including, the element positioned by 
	 * <tt>end</tt>. If <tt>end</tt> is an undefined value, the returned array 
	 * contains all elements from the <tt>start</tt> to the end of the current array.</p>
	 * @param start The array index at which the slice is to begin. If negative, this 
	 * argument specifies a position measured from the end of the current array. That is, 
	 * -1 indicates the last element, -2 indicates the next from the last element, and so on.
	 * @param end The array index immediately after the end of the slice. If undefined, 
	 * the slice includes all array elements from the <tt>start</tt> to the end 
	 * of the array. If this argument is negative, it specifies an array element measured 
	 * from the end of the array.
	 * @return A new array that contains the elements of current array instance from the 
	 * element positioned by <tt>start</tt>, up to, but not including, the element 
	 * positioned by <tt>end</tt>.
	 * @see #slice(Object)
	 * @see #slice(Vars)
	 * @see #splice(Object)
	 * @see #splice(Vars)
	 * @see #splice(Object, Object)
	 * @see #splice(Object, Object, Object)
	 * @see #splice(Object, Object, Vars)
	 * @see jsx.core.ArrayLikes#slice(ArrayLike, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public ArrayLike<T> slice(Object start, Object end);
	/**
	 * <p>Sorts the elements of the current array instance in place by arranging them in 
	 * alphabetical order (more precisely, the order determined by the character encoding).
	 * To do this, elements are first converted to strings, if necessary, so that they can 
	 * be compared. Note that the array is sorted in place, and no copy is made.
	 * And undefined elements are always sorted to the end of the array.</p>
	 * @return A reference to the current array.
	 * @see #sort(JsFunction)
	 * @see jsx.core.ArrayLikes#sort(ArrayLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public ArrayLike<T> sort();
	/**
	 * <p>Sorts the elements of the current array instance with the custom ordering function 
	 * <tt>orderfunc</tt>. Note that the array is sorted in place, and no copy is made.
	 * And undefined elements are always sorted to the end of the array because undefined 
	 * values are never passed to the ordering function you supply.</p>
	 * @param orderfunc A comparison function that compares two values and returns a 
	 * number indicating their relative order. This function should take two arguments, 
	 * <tt>a</tt> and <tt>b</tt> for instance, and should return one of the following:
	 * <ul>
	 * <li>A value less than zero, if, according to your sort criteria, <tt>a</tt> is 
	 * less than <tt>b</tt> and should appear before <tt>b</tt> in the sorted 
	 * array.</li>
	 * <li>Zero, if <tt>a</tt> and <tt>b</tt> are equivalent for the purposes of 
	 * this sort.</li>
	 * <li>A value greater than zero, if <tt>a</tt> is greater than <tt>b</tt> 
	 * for the purposes of the sort.</li>
	 * </ul>
	 * @return A reference to the current array.
	 * @see #sort()
	 * @see jsx.core.ArrayLikes#sort(ArrayLike, JsFunction)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public ArrayLike<T> sort(JsFunction<? extends Number> orderfunc);
	/**
	 * <p>Deletes elements, numbered by the second value of <tt>args</tt>, starting with and 
	 * including the element positioned by the first value of <tt>args</tt>, and replaces 
	 * them with the values listed by <tt>args</tt> from the third value. Array elements 
	 * that appear after the insertion or deletion are moved as necessary so that they 
	 * remain contiguous with the rest of the array.</p> 
	 * <p>Note that, this invocation modifies the current array directly.</p>
	 * @param args A list of the argument values. The first value specifies the array 
	 * index at which the deletion and insertion is to begin. The second value specifies 
	 * the number of elements, starting with and including the element positioned by the 
	 * first value, to be deleted from the current array. If the second value is undefined, 
	 * this invocation deletes all elements from the position specified by the first value 
	 * to the end of the array. The rest of the list provides the values to be inserted 
	 * into the current array, beginning at the position specified by the first value.
	 * @return An array containing the elements, if any, deleted from the current array.
	 * @see #slice(Vars)
	 * @see #slice(Object)
	 * @see #slice(Object, Object)
	 * @see #splice(Object)
	 * @see #splice(Object, Object)
	 * @see #splice(Object, Object, Object)
	 * @see #splice(Object, Object, Vars)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public ArrayLike<T> splice(Vars<?> args);
	/**
	 * <p>Deletes zero or more array elements starting with and including the element 
	 * positioned by <tt>start</tt>.</p>
	 * <p>Note that, this invocation modifies the current array directly.</p>
	 * @param start The array index at which the insertion and/or deletion is to begin.
	 * @return An array containing the elements, if any, deleted from the current array.
	 * @see #slice(Vars)
	 * @see #slice(Object)
	 * @see #slice(Object, Object)
	 * @see #splice(Vars)
	 * @see #splice(Object, Object)
	 * @see #splice(Object, Object, Object)
	 * @see #splice(Object, Object, Vars)
	 * @see jsx.core.ArrayLikes#splice(ArrayLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public ArrayLike<T> splice(Object start);
	/**
	 * <p>Deletes <tt>deleteCount</tt> elements of the current array instance starting 
	 * with and including the element positioned by <tt>start</tt>. Array elements 
	 * that appear after deletion are moved as necessary so that they remain contiguous 
	 * with the rest of the array.</p> 
	 * <p>Note that, this invocation modifies the current array directly.</p>
	 * @param start The array index at which the deletion is to begin.
	 * @param deleteCount The number of elements, starting with and including the element 
	 * positioned by <tt>start</tt>, to be deleted from the current array. If this 
	 * argument is undefined, this invocation deletes all elements from <tt>start</tt> to the end 
	 * of the array.
	 * @return An array containing the elements, if any, deleted from the current array.
	 * @see #slice(Vars)
	 * @see #slice(Object)
	 * @see #slice(Object, Object)
	 * @see #splice(Object)
	 * @see #splice(Vars)
	 * @see #splice(Object, Object, Object)
	 * @see #splice(Object, Object, Vars)
	 * @see jsx.core.ArrayLikes#splice(ArrayLike, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public ArrayLike<T> splice(Object start, Object deleteCount);
	/**
	 * <p>Deletes <tt>deleteCount</tt> elements starting with and including the 
	 * element positioned by <tt>start</tt> and replaces them with the argument 
	 * <tt>value</tt>. Array elements that appear after the insertion or deletion are 
	 * moved as necessary so that they remain contiguous with the rest of the array.</p> 
	 * <p>Note that, this invocation modifies the current array directly.</p>
	 * @param start The array index at which the deletion and insertion is to begin.
	 * @param deleteCount The number of elements, starting with and including the element 
	 * positioned by <tt>start</tt>, to be deleted from the current array. If this 
	 * argument is undefined, this invocation deletes all elements from <tt>start</tt> to the end 
	 * of the array.
	 * @param value The value to be inserted into the current array, beginning at the index 
	 * specified by <tt>start</tt>.
	 * @return An array containing the elements, if any, deleted from the current array.
	 * @see #slice(Vars)
	 * @see #slice(Object)
	 * @see #slice(Object, Object)
	 * @see #splice(Object)
	 * @see #splice(Vars)
	 * @see #splice(Object, Object)
	 * @see #splice(Object, Object, Vars)
	 * @see jsx.core.ArrayLikes#splice(ArrayLike, Object, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public ArrayLike<T> splice(Object start, Object deleteCount, Object value);
	/**
	 * <p>Deletes <tt>deleteCount</tt> elements starting with and including the 
	 * element positioned by <tt>start</tt> and replaces them with the values listed by 
	 * <tt>args</tt>. Array elements that appear after the insertion or deletion are 
	 * moved as necessary so that they remain contiguous with the rest of the array.</p> 
	 * <p>Note that, this invocation modifies the current array directly.</p>
	 * @param start The array index at which the deletion and insertion is to begin.
	 * @param deleteCount The number of elements, starting with and including the element 
	 * positioned by <tt>start</tt>, to be deleted from the current array. If this 
	 * argument is undefined, this invocation deletes all elements from <tt>start</tt> to the end 
	 * of the array.
	 * @param args A list of the argument values to be inserted into the current array, 
	 * beginning at the index specified by <tt>start</tt>.
	 * @return An array containing the elements, if any, deleted from the current array.
	 * @see #slice(Vars)
	 * @see #slice(Object)
	 * @see #slice(Object, Object)
	 * @see #splice(Object)
	 * @see #splice(Vars)
	 * @see #splice(Object, Object)
	 * @see #splice(Object, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public ArrayLike<T> splice(Object start, Object deleteCount, Vars<?> args);
	/**
	 * <p>Inserts a list of values at the beginning of the current array instance, 
	 * shifting the existing elements to higher indexes to make room. The first value of 
	 * the argument list becomes the new element 0 of the array; the second value, if any, 
	 * becomes the new element 1; and so on. Note that this invocation does not create a 
	 * new array; it modifies the current array directly.</p>
	 * @param args A list of the argument values that are inserted at the start of 
	 * the current array.
	 * @return The new length of the current array.
	 * @see #unshift(Object)
	 * @see #shift()
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public int unshift(Vars<?> args);
	/**
	 * <p>Inserts the argument at the beginning of the current array instance, 
	 * shifting the existing elements to higher indexes to make room. The argument becomes 
	 * the new element 0 of the array. Note that this invocation does not create a new 
	 * array; it modifies the current array directly.</p>
	 * @param arg A value that is inserted at the start of the current array.
	 * @return The new length of the current array.
	 * @see #unshift(Vars)
	 * @see #shift()
	 * @see jsx.core.ArrayLikes#unshift(ArrayLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public int unshift(Object arg);
	/**
	 * <p>Returns the primitive value associated with the current instance, if there is one. 
	 * This invocation simply returns the instance itself for the current array instance 
	 * is an object and there is no primitive value for it.</p>
	 * @return The current array itself.
	 * @see #toString()
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public ArrayLike<T> valueOf();
	/**
	 * <p>Simply returns the array object of the current array instance.</p>
	 * <p>This method is useful for JS Simulation to implement opaque types.</p>
	 * <p>If the current instance is a Java simulated array and the method runs in JS 
	 * Embed Simulation mode, the invocation creates and returns a JavaScript Array object 
	 * as a runtime copy of the current array.</p>
	 * @return The array object of the current array instance.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the interface invocation of this method, that is, 
	 * replacing it with its current instance.
	 */
	public JsArray var();
}
