
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

import js.ArrayLike;
import js.Vars;
import js.core.JsArray;
import js.core.JsFunction;

final class SimArrayBoolean implements ArrayLike<Boolean>
{
	private final boolean[] arr;

	public SimArrayBoolean(boolean[] arr) {
		this.arr = arr;
	}

	//@Override
	public final synchronized ArrayLike<Boolean> concat(Vars<?> args) {
		return SimArrays.concat(new SimArrayList<Boolean>(), this, args);
	}

	//@Override
	public final synchronized ArrayLike<Boolean> concat(Object arg) {
		return SimArrays.concat(new SimArrayList<Boolean>(), this, arg);
	}

	//@Override
	public final synchronized boolean delete(int i) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized Boolean get(int i) {
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
	public final synchronized Boolean pop() {
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
	public final synchronized Boolean set(int i, Boolean v) {
		if (i >= length()) {
			throw new UnsupportedOperationException();
		}
		arr[i] = v;
		return v;
	}

	//@Override
	public final synchronized Boolean shift() {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized ArrayLike<Boolean> slice(Vars<?> args) {
		return SimArrays.slice(this, args);
	}

	//@Override
	public final synchronized ArrayLike<Boolean> slice(Object start) {
		return SimArrays.slice(this, start);
	}

	//@Override
	public final synchronized ArrayLike<Boolean> slice(Object start, Object end) {
		return SimArrays.slice(this, start, end);
	}

	//@Override
	public final synchronized ArrayLike<Boolean> sort() {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized ArrayLike<Boolean> sort(final JsFunction<? extends Number> orderfunc) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized ArrayLike<Boolean> splice(Vars<?> args) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized ArrayLike<Boolean> splice(Object start) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized ArrayLike<Boolean> splice(Object start, Object deleteCount) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized ArrayLike<Boolean> splice(Object start, Object deleteCount, Object value) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized ArrayLike<Boolean> splice(Object start, Object deleteCount, Vars<?> args) {
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
	public final synchronized ArrayLike<Boolean> valueOf() {
		return this;
	}

	//@Override
	public final synchronized JsArray var() {
		throw new UnsupportedOperationException();
	}
}
