
/*
 *  JScripter Simulation 1.0 - For Java To Script
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

package org.jscripter.sim;

import java.util.Arrays;
import java.util.Comparator;

import js.ArrayLike;
import js.Js;
import js.Vars;
import js.core.JsArray;
import js.core.JsFunction;

final class SimArrayObject<T> implements ArrayLike<T>
{
	private final T[] arr;

	public SimArrayObject(T[] arr) {
		this.arr = arr;
	}

	//@Override
	public final synchronized ArrayLike<T> concat(Vars<?> args) {
		return SimArrays.concat(new SimArrayList<T>(), this, args);
	}

	//@Override
	public final synchronized ArrayLike<T> concat(Object arg) {
		return SimArrays.concat(new SimArrayList<T>(), this, arg);
	}

	//@Override
	public final synchronized boolean delete(int i) {
		if (arr != null && i < arr.length && i >= 0 && Js.be(arr[i])) {
			arr[i] = null;
			return true;
		}
		return false;
	}

	//@Override
	public final synchronized T get(int i) {
		return i < arr.length ? arr[i] : null;
	}

	//@Override
	public final synchronized String join() {
		return SimArrays.join(this);
	}

	//@Override
	public final synchronized String join(Object separator) {
		return SimArrays.join(this, separator);
	}

	//@Override
	public final synchronized int length() {
		return arr.length;
	}

	//@Override
	public final synchronized int length(int len) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final Integer index() {
		return null;
	}

	//@Override
	public final String input() {
		return null;
	}

	//@Override
	public final synchronized T pop() {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized int push(Object v) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized int push(Vars<?> args) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized void reverse() {
		SimArrays.reverse(this);
	}

	//@Override
	public final synchronized T set(int i, T v) {
		if (i >= length()) {
			throw new UnsupportedOperationException();
		}
		arr[i] = v;
		return v;
	}

	//@Override
	public final synchronized T shift() {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized ArrayLike<T> slice(Vars<?> args) {
		return SimArrays.slice(this, args);
	}

	//@Override
	public final synchronized ArrayLike<T> slice(Object start) {
		return SimArrays.slice(this, start);
	}

	//@Override
	public final synchronized ArrayLike<T> slice(Object start, Object end) {
		return SimArrays.slice(this, start, end);
	}

	//@Override
	public final synchronized ArrayLike<T> sort() {
		Arrays.sort(arr);
		return this;
	}

	//@Override
	public final synchronized ArrayLike<T> sort(final JsFunction<? extends Number> orderfunc) {
		Arrays.sort(arr, new Comparator<T>() {
			//@Override
			public final synchronized int compare(T arg0, T arg1) {
				return orderfunc.invoke(
						new Vars<T>().add(arg0).add(arg1)
				).intValue();
			}
		});
		return this;
	}

	//@Override
	public final synchronized ArrayLike<T> splice(Vars<?> args) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized ArrayLike<T> splice(Object start) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized ArrayLike<T> splice(Object start, Object deleteCount) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized ArrayLike<T> splice(Object start, Object deleteCount, Object value) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized ArrayLike<T> splice(Object start, Object deleteCount, Vars<?> args) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized int unshift(Vars<?> args) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized int unshift(Object value) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final String toString() {
		return SimArrays.toString(this);
	}

	//@Override
	public final synchronized ArrayLike<T> valueOf() {
		return this;
	}

	//@Override
	public final JsArray var() {
		throw new UnsupportedOperationException();
	}
}
