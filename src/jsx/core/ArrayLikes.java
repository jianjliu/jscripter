
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

import js.*;
import js.core.*;

/**
 * <p>A utility class providing basic array operations with its static methods.</p>
 * <p>Users are encouraged to use the utilities provided by this class instead of the 
 * <b>opaque</b> methods of {@link js.ArrayLike} or {@link js.core.JsArray} in 
 * consideration of the reuse benefit for re-compilation results.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class ArrayLikes extends Disposable
{
	private ArrayLikes() {}

	/**
	 * <p>Deletes the specified element of an array instance.</p>
	 * @param arr The current array instance.
	 * @param i Array index of the element
	 * @return <tt>true</tt> if the deletion is successful, <tt>false</tt> otherwise.
	 * @see js.core.JsArray#delete(int)
	 * @since 1.0
	 */
	public static final boolean delete(ArrayLike<?> arr, int i) {
		return arr.delete(i);
	}
	/**
	 * <p>Gets the size of an array instance.</p>
	 * @param arr The current array instance.
	 * @return The size of the array
	 * @see js.core.JsArray#length()
	 * @since 1.0
	 */
	public static final int length(ArrayObject<?> arr) {
		return arr.length();
	}
	/**
	 * <p>Changes the size of an array instance.</p>
	 * @param arr The current array instance.
	 * @param length New size
	 * @return New size
	 * @see js.core.JsArray#length(int)
	 * @since 1.0
	 */
	public static final int length(ArrayLike<?> arr, int length) {
		return arr.length(length);
	}
	/**
	 * <p>Gets the <tt>index</tt> field of an array instance.</p>
	 * @param arr The current array instance.
	 * @return The value of the <tt>index</tt> field of the array object
	 * @see StringLikes#match(js.StringLike, RegExpLike)
	 * @see js.ArrayLike#index()
	 * @since 1.0
	 */
	public static final Integer index(ArrayLike<?> arr) {
		return arr.index();
	}
	/**
	 * <p>Gets the <tt>input</tt> field of an array instance.</p>
	 * @param arr The current array instance.
	 * @return The value of the <tt>input</tt> field of the array object
	 * @see StringLikes#match(js.StringLike, RegExpLike)
	 * @see RegExpLikes#exec(js.RegExpLike, Object)
	 * @see js.ArrayLike#input()
	 * @since 1.0
	 */
	public static final String input(ArrayLike<?> arr) {
		return arr.input();
	}
	/**
	 * <p>Creates and returns a new array object that is the result of concatenating its
	 * argument to the current array instance. This invocation does not modify the current 
	 * array. If the argument to <tt>concat</tt> is itself an array, the elements of that array 
	 * are concatenated, rather than the array itself.</p>
	 * @param arr The current array instance.
	 * @param arg A value to be concatenated with the current array.
	 * @return A new array object, which is formed by concatenating the specified argument
	 * to the current array.
	 * @see js.ArrayLike#concat(Object)
	 * @since 1.0
	 */
	public static final <T> ArrayLike<T> concat(ArrayLike<T> arr, Object arg) {
		return arr.concat(arg);
	}
	/**
	 * <p>Converts each element of the current array instance to a string and then 
	 * concatenates those strings, inserting a comma between the elements and returns 
	 * the resulting string.</p>
	 * @param arr The current array instance.
	 * @return The string that results from converting each element of the current array
	 * to a string and then concatenating them together with a comma between elements.
	 * @see #join(js.ArrayLike, Object)
	 * @see StringLikes#split(js.StringLike, Object)
	 * @see js.ArrayLike#join()
	 * @since 1.0
	 */
	public static final String join(ArrayLike<?> arr) {
		return arr.join();
	}
	/**
	 * <p>Converts each element of the current array instance to a string and then 
	 * concatenates those strings, inserting the separator string specified by 
	 * <tt>separator</tt> between the elements and returns the resulting string.</p>
	 * @param arr The current array instance.
	 * @param separator An optional string used to separate one element of the current array
	 * from the next in the returned string. If this argument is omitted, 
	 * <tt>undefined</tt> or <tt>null</tt>, a comma is used.
	 * @return The string that results from converting each element of the current array
	 * to a string and then concatenating them together, with the <tt>separator</tt>
	 * string between elements.
	 * @see #join(js.ArrayLike)
	 * @see StringLikes#split(js.StringLike, Object)
	 * @see js.ArrayLike#join(Object)
	 * @since 1.0
	 */
	public static final String join(ArrayLike<?> arr, Object separator) {
		return arr.join(separator);
	}
	/**
	 * <p>Deletes the last element of the current array instance, decrements the length of 
	 * the current array, and returns the value of the deleted element. If the current array is 
	 * already empty, this invocation does not change the array and returns the undefined <tt>null</tt> value.</p>
	 * @param arr The current array instance.
	 * @return The last element of the current array.
	 * @see js.ArrayLike#pop()
	 * @since 1.0
	 */
	public static final <T> T pop(ArrayLike<T> arr) {
		return arr.pop();
	}
	/**
	 * <p>Appends the argument to the end of the current array instance by modifying the 
	 * array directly rather than creating a new one.</p>
	 * @param arr The current array instance.
	 * @param v A value to be appended to the end of the current array.
	 * @return The new length of the array, after the specified value are appended to it.
	 * @see #push(js.ArrayLike, Object)
	 * @see js.ArrayLike#push(Object)
	 * @since 1.0
	 */
	public static final int push(ArrayLike<?> arr, Object v) {
		return arr.push(v);
	}
	/**
	 * <p>Reverses the order of the elements of the current array instance by rearranging 
	 * them in place without creating a new array. If there are multiple references to the 
	 * array, the new order of the array elements is visible through all references after 
	 * this invocation.</p>
	 * @param arr The current array instance.
	 * @see js.ArrayLike#reverse()
	 * @since 1.0
	 */
	public static final void reverse(ArrayLike<?> arr) {
		arr.reverse();
	}
	/**
	 * <p>Removes and returns the first element of the current array instance, shifting 
	 * all subsequent elements down one place to occupy the newly vacant space at the 
	 * start of the array. If the current array is empty, this invocation does nothing 
	 * and returns the undefined value <tt>null</tt>. Note that this invocation does 
	 * not create a new array; instead, it modifies the current array directly.</p>
	 * @param arr The current array instance.
	 * @return The former first element of the current array.
	 * @see #pop(js.ArrayLike)
	 * @see js.ArrayLike#shift()
	 * @since 1.0
	 */
	public static final <T> T shift(ArrayLike<T> arr) {
		return arr.shift();
	}
	/**
	 * <p>Returns a slice, or sub-array, of the current array instance without modifying 
	 * it. The returned array contains the element positioned by <tt>start</tt> and 
	 * all subsequent elements up to the end of the current array.</p>
	 * @param arr The current array instance.
	 * @param start The array index at which the slice is to begin. If negative, this 
	 * argument specifies a position measured from the end of the current array. That is, 
	 * -1 indicates the last element, -2 indicates the next from the last element, and so on.
	 * @return A new array that contains the elements of current array instance from the 
	 * element positioned by <tt>start</tt>, up to the end of the current array.
	 * @see #slice(js.ArrayLike, Object, Object)
	 * @see #splice(js.ArrayLike, Object)
	 * @see #splice(js.ArrayLike, Object, Object)
	 * @see #splice(js.ArrayLike, Object, Object, Object)
	 * @see js.ArrayLike#slice(Object)
	 * @since 1.0
	 */
	public static final <T> ArrayLike<T> slice(ArrayLike<T> arr, Object start) {
		return arr.slice(start);
	}
	/**
	 * <p>Returns a slice, or sub-array, of the current array instance without modifying 
	 * it. The returned array contains the element positioned by <tt>start</tt> and 
	 * all subsequent elements up to, but not including, the element positioned by 
	 * <tt>end</tt>. If <tt>end</tt> is an undefined value, the returned array 
	 * contains all elements from the <tt>start</tt> to the end of the current array.</p>
	 * @param arr The current array instance.
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
	 * @see #slice(js.ArrayLike, Object)
	 * @see #splice(js.ArrayLike, Object)
	 * @see #splice(js.ArrayLike, Object, Object)
	 * @see #splice(js.ArrayLike, Object, Object, Object)
	 * @see js.ArrayLike#slice(Object, Object)
	 * @since 1.0
	 */
	public static final <T> ArrayLike<T> slice(ArrayLike<T> arr, Object start, Object end) {
		return arr.slice(start, end);
	}
	/**
	 * <p>Sorts the elements of the current array instance in place by arranging them in 
	 * alphabetical order (more precisely, the order determined by the character encoding).
	 * To do this, elements are first converted to strings, if necessary, so that they can 
	 * be compared. Note that the array is sorted in place, and no copy is made.
	 * And undefined elements are always sorted to the end of the array.</p>
	 * @param arr The current array instance.
	 * @return A reference to the current array.
	 * @see #sort(js.ArrayLike, JsFunction)
	 * @see js.ArrayLike#sort()
	 * @since 1.0
	 */
	public static final <T> ArrayLike<T> sort(ArrayLike<T> arr) {
		return arr.sort();
	}
	/**
	 * <p>Sorts the elements of the current array instance with the custom ordering function 
	 * <tt>orderfunc</tt>. Note that the array is sorted in place, and no copy is made.
	 * And undefined elements are always sorted to the end of the array because undefined 
	 * values are never passed to the ordering function you supply.</p>
	 * @param arr The current array instance.
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
	 * @see #sort(js.ArrayLike)
	 * @see js.ArrayLike#sort(JsFunction)
	 * @since 1.0
	 */
	public static final <T> ArrayLike<T> sort(ArrayLike<T> arr, JsFunction<? extends Number> orderfunc) {
		return arr.sort(orderfunc);
	}
	/**
	 * <p>Deletes zero or more array elements starting with and including the element 
	 * positioned by <tt>start</tt>.</p>
	 * <p>Note that, this invocation modifies the current array directly.</p>
	 * @param arr The current array instance.
	 * @param start The array index at which the insertion and/or deletion is to begin.
	 * @return An array containing the elements, if any, deleted from the current array.
	 * @see #slice(js.ArrayLike, Object)
	 * @see #slice(js.ArrayLike, Object, Object)
	 * @see #splice(js.ArrayLike, Object, Object)
	 * @see #splice(js.ArrayLike, Object, Object, Object)
	 * @see js.ArrayLike#splice(Object)
	 * @since 1.0
	 */
	public static final <T> ArrayLike<T> splice(ArrayLike<T> arr, Object start) {
		return arr.splice(start);
	}
	/**
	 * <p>Deletes <tt>deleteCount</tt> elements of the current array instance starting 
	 * with and including the element positioned by <tt>start</tt>. Array elements 
	 * that appear after deletion are moved as necessary so that they remain contiguous 
	 * with the rest of the array.</p> 
	 * <p>Note that, this invocation modifies the current array directly.</p>
	 * @param arr The current array instance.
	 * @param start The array index at which the deletion is to begin.
	 * @param deleteCount The number of elements, starting with and including the element 
	 * positioned by <tt>start</tt>, to be deleted from the current array. If this 
	 * argument is undefined, this invocation deletes all elements from <tt>start</tt> to the end 
	 * of the array.
	 * @return An array containing the elements, if any, deleted from the current array.
	 * @see #slice(js.ArrayLike, Object)
	 * @see #slice(js.ArrayLike, Object, Object)
	 * @see #splice(js.ArrayLike, Object)
	 * @see #splice(js.ArrayLike, Object, Object, Object)
	 * @see js.ArrayLike#splice(Object, Object)
	 * @since 1.0
	 */
	public static final <T> ArrayLike<T> splice(ArrayLike<T> arr, Object start, Object deleteCount) {
		return arr.splice(start, deleteCount);
	}
	/**
	 * <p>Deletes <tt>deleteCount</tt> elements starting with and including the 
	 * element positioned by <tt>start</tt> and replaces them with the argument 
	 * <tt>value</tt>. Array elements that appear after the insertion or deletion are 
	 * moved as necessary so that they remain contiguous with the rest of the array.</p> 
	 * <p>Note that, this invocation modifies the current array directly.</p>
	 * @param arr The current array instance.
	 * @param start The array index at which the deletion and insertion is to begin.
	 * @param deleteCount The number of elements, starting with and including the element 
	 * positioned by <tt>start</tt>, to be deleted from the current array. If this 
	 * argument is undefined, this invocation deletes all elements from <tt>start</tt> to the end 
	 * of the array.
	 * @param value The value to be inserted into the current array, beginning at the index 
	 * specified by <tt>start</tt>.
	 * @return An array containing the elements, if any, deleted from the current array.
	 * @see #slice(js.ArrayLike, Object)
	 * @see #slice(js.ArrayLike, Object, Object)
	 * @see #splice(js.ArrayLike, Object)
	 * @see #splice(js.ArrayLike, Object, Object)
	 * @see js.ArrayLike#splice(Object, Object, Object)
	 * @since 1.0
	 */
	public static final <T> ArrayLike<T> splice(ArrayLike<T> arr, Object start, Object deleteCount, Object value) {
		return arr.splice(start, deleteCount, value);
	}
	/**
	 * <p>Inserts the argument at the beginning of the current array instance, 
	 * shifting the existing elements to higher indexes to make room. The argument becomes 
	 * the new element 0 of the array. Note that this invocation does not create a new 
	 * array; it modifies the current array directly.</p>
	 * @param arr The current array instance.
	 * @param arg A value that is inserted at the start of the current array.
	 * @return The new length of the current array.
	 * @see #shift(js.ArrayLike)
	 * @see js.ArrayLike#unshift(Object)
	 * @since 1.0
	 */
	public static final int unshift(ArrayLike<?> arr, Object arg) {
		return arr.unshift(arg);
	}
	/**
	 * <p>Appends an array element to an array.</p>
	 * @param arr The current array instance.
	 * @param arg A value that is added at the end of the current array.
	 * @return The current array.
	 * @see #push(ArrayLike, Object)
	 * @since 1.0
	 */
	public static final <T> ArrayLike<T> add(ArrayLike<T> arr, T arg) {
		arr.push(arg);
		return arr;
	}
	/**
	 * <p>Removes the first element of an array and adds it to the end, shifting all the 
	 * other elements accordingly.</p>
	 * @param arr The current array instance.
	 * @return The current array.
	 * @see #shift(ArrayLike)
	 * @see #add(ArrayLike, Object)
	 * @since 1.0
	 */
	public static final <T> ArrayLike<T> circulate(ArrayLike<T> arr) {
		return add(arr, shift(arr));
	}
	/**
	 * <p>Returns the last element of an array.</p>
	 * @param arr The current array instance.
	 * @return The last element of the array.
	 * @see #length(ArrayObject)
	 * @since 1.0
	 */
	public static final <T> T getLast(ArrayLike<T> arr) {
		return arr.get(length(arr) - 1);
	}

	public static final <T> ArrayLike<T> copy(ArrayLike<T> array) {
		ArrayLike<T> ret = Js.array();
		for (int i = 0, len = length(array); i < len; i++) {
			T v = array.get(i);
			if (Variables.defined(v)) {
				ret.set(i, v);
			}
		}
		return ret;
	}
	/**
	 * <p>Inserts an element into the array immediately before the specified element 
	 * of this array. If the element being inserted is already in the array, it is 
	 * removed and reinserted at its new location.</p>
	 * @param arr The current array instance.
	 * @param arg The element to be inserted into the array.
	 * @param ref The element of this array before which <tt>arg</tt> is to be 
	 * inserted. If this argument is <tt>null</tt> or not in the array, this method 
	 * returns <tt>-1</tt>.
	 * @return The array index of the newly inserted element or <tt>-1</tt> if 
	 * <tt>ref</tt> is not found in the array.
	 * @see #indexOf(ArrayLike, Object)
	 * @see #remove(ArrayLike, Object)
	 * @since 1.0
	 */
	public static final <T> int insert(ArrayLike<T> arr, T arg, T ref) {
		remove(arr, arg);
		int i = indexOf(arr, ref);
		if (i != -1) {
			splice(arr, i, 0, arg);
		}
		return i;
	}
	public static final int indexOf(ArrayLike<?> array, Object value) {
		for (int i = 0, len = length(array); i < len; i++) {
			if(Js.eq(array.get(i), value)) {
				return i;
			}
		}
		return -1;
	}
	public static final int remove(ArrayLike<?> array, Object value) {
		int index = indexOf(array, value);
		if (index != -1) {
			splice(array, index, 1);
		}
		return index;
	}
	public static final int removeAll(ArrayLike<?> array) {
		int length = length(array);
		if (length > 0) {
			splice(array, 0, length);
		}
		return length;
	}
}
