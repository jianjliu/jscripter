
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

import js.ArrayLike;
import js.Vars;
import js.core.JsArray;
import js.core.JsFunction;

final class SimArrayShort implements ArrayLike<Short>
{
	private final short[] arr;

	public SimArrayShort(short[] arr) {
		this.arr = arr;
	}

	//@Override
	public final synchronized ArrayLike<Short> concat(Vars<?> args) {
		return SimArrays.concat(new SimArrayList<Short>(), this, args);
	}

	//@Override
	public final synchronized ArrayLike<Short> concat(Object arg) {
		return SimArrays.concat(new SimArrayList<Short>(), this, arg);
	}

	//@Override
	public final synchronized boolean delete(int i) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized Short get(int i) {
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
	public final synchronized Short pop() {
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
	public final synchronized Short set(int i, Short v) {
		if (i >= length()) {
			throw new UnsupportedOperationException();
		}
		arr[i] = v;
		return v;
	}

	//@Override
	public final synchronized Short shift() {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized ArrayLike<Short> slice(Vars<?> args) {
		return SimArrays.slice(this, args);
	}

	//@Override
	public final synchronized ArrayLike<Short> slice(Object start) {
		return SimArrays.slice(this, start);
	}

	//@Override
	public final synchronized ArrayLike<Short> slice(Object start, Object end) {
		return SimArrays.slice(this, start, end);
	}

	//@Override
	public final synchronized ArrayLike<Short> sort() {
		Arrays.sort(arr);
		return this;
	}

	//@Override
	public final synchronized ArrayLike<Short> sort(final JsFunction<? extends Number> orderfunc) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized ArrayLike<Short> splice(Vars<?> args) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized ArrayLike<Short> splice(Object start) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized ArrayLike<Short> splice(Object start, Object deleteCount) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized ArrayLike<Short> splice(Object start, Object deleteCount, Object value) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized ArrayLike<Short> splice(Object start, Object deleteCount, Vars<?> args) {
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
	public final synchronized ArrayLike<Short> valueOf() {
		return this;
	}

	//@Override
	public final JsArray var() {
		throw new UnsupportedOperationException();
	}
}
