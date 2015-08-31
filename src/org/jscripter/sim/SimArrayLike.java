
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

import org.jscripter.sim.core.Core;

import js.ArrayLike;
import js.Vars;
import js.core.JsArray;
import js.core.JsFunction;
import js.core.JsGlobal;

class SimArrayLike<T> implements ArrayLike<T>
{
	private ArrayLike<T> arr;

	public SimArrayLike(ArrayLike<T> arr) {
		this.arr = arr;
	}

	public SimArrayLike() {
		this(new SimArrayList<T>());
	}

	//@Override
	public final synchronized ArrayLike<T> concat(Vars<?> args) {
		try {
			arr = arr.concat(args);
			return this;
		} catch (UnsupportedOperationException uoe) {
			arr = new SimArrayList<T>(arr);
			arr = arr.concat(args);
			return this;
		}
	}

	//@Override
	public final synchronized ArrayLike<T> concat(Object arg) {
		try {
			arr = arr.concat(arg);
			return this;
		} catch (UnsupportedOperationException uoe) {
			arr = new SimArrayList<T>(arr);
			arr = arr.concat(arg);
			return this;
		}
	}

	//@Override
	public final synchronized boolean delete(int i) {
		try {
			return arr.delete(i);
		} catch (UnsupportedOperationException uoe) {
			arr = new SimArray<T>(arr);
			return arr.delete(i);
		}
	}

	//@Override
	public final synchronized T get(int i) {
		return arr.get(i);
	}

	//@Override
	public final synchronized String join() {
		return arr.join();
	}

	//@Override
	public final synchronized String join(Object separator) {
		return arr.join(separator);
	}

	//@Override
	public final synchronized int length() {
		return arr.length();
	}

	//@Override
	public final synchronized int length(int len) {
		try {
			return arr.length(len);
		} catch (UnsupportedOperationException uoe) {
			arr = new SimArray<T>(arr);
			return arr.length(len);
		}
	}

	//@Override
	public Integer index() {
		return null;
	}

	//@Override
	public String input() {
		return null;
	}

	//@Override
	public final synchronized T pop() {
		try {
			return arr.pop();
		} catch (UnsupportedOperationException uoe) {
			arr = new SimArrayList<T>(arr);
			return arr.pop();
		}
	}

	//@Override
	public final synchronized int push(Object v) {
		try {
			return arr.push(v);
		} catch (UnsupportedOperationException uoe) {
			arr = new SimArrayList<T>(arr);
			return arr.push(v);
		}
	}

	//@Override
	public final synchronized int push(Vars<?> args) {
		try {
			return arr.push(args);
		} catch (UnsupportedOperationException uoe) {
			arr = new SimArrayList<T>(arr);
			return arr.push(args);
		}
	}

	//@Override
	public final synchronized void reverse() {
		arr.reverse();
	}

	//@Override
	public final synchronized T set(int i, T v) {
		try {
			return arr.set(i, v);
		} catch (UnsupportedOperationException uoe) {
			arr = new SimArray<T>(arr);
			return arr.set(i, v);
		}
	}

	//@Override
	public final synchronized T shift() {
		try {
			return arr.shift();
		} catch (UnsupportedOperationException uoe) {
			arr = new SimArray<T>(arr);
			return arr.shift();
		}
	}

	//@Override
	public final synchronized ArrayLike<T> slice(Vars<?> args) {
		return new SimArrayLike<T>(arr.slice(args));
	}

	//@Override
	public final synchronized ArrayLike<T> slice(Object start) {
		return new SimArrayLike<T>(arr.slice(start));
	}

	//@Override
	public final synchronized ArrayLike<T> slice(Object start, Object end) {
		return new SimArrayLike<T>(arr.slice(start, end));
	}

	//@Override
	public final synchronized ArrayLike<T> sort() {
		try {
			arr = arr.sort();
			return this;
		} catch (UnsupportedOperationException uoe) {
			arr = new SimArrayList<T>(arr).sort();
			return this;
		}
	}

	//@Override
	public final synchronized ArrayLike<T> sort(JsFunction<? extends Number> orderfunc) {
		try {
			arr = arr.sort(orderfunc);
			return this;
		} catch (UnsupportedOperationException uoe) {
			arr = new SimArrayList<T>(arr).sort(orderfunc);
			return this;
		}
	}

	//@Override
	public final synchronized ArrayLike<T> splice(Vars<?> args) {
		try {
			return new SimArrayLike<T>(arr.splice(args));
		} catch (UnsupportedOperationException uoe) {
			arr = new SimArray<T>(arr);
			return new SimArrayLike<T>(arr.splice(args));
		}
	}

	//@Override
	public final synchronized ArrayLike<T> splice(Object start) {
		try {
			return new SimArrayLike<T>(arr.splice(start));
		} catch (UnsupportedOperationException uoe) {
			arr = new SimArray<T>(arr);
			return new SimArrayLike<T>(arr.splice(start));
		}
	}

	//@Override
	public final synchronized ArrayLike<T> splice(Object start, Object deleteCount) {
		try {
			return new SimArrayLike<T>(arr.splice(start, deleteCount));
		} catch (UnsupportedOperationException uoe) {
			arr = new SimArray<T>(arr);
			return new SimArrayLike<T>(arr.splice(start, deleteCount));
		}
	}

	//@Override
	public final synchronized ArrayLike<T> splice(Object start, Object deleteCount, Object value) {
		try {
			return new SimArrayLike<T>(arr.splice(start, deleteCount, value));
		} catch (UnsupportedOperationException uoe) {
			arr = new SimArray<T>(arr);
			return new SimArrayLike<T>(arr.splice(start, deleteCount, value));
		}
	}

	//@Override
	public final synchronized ArrayLike<T> splice(Object start, Object deleteCount, Vars<?> args) {
		try {
			return new SimArrayLike<T>(arr.splice(start, deleteCount, args));
		} catch (UnsupportedOperationException uoe) {
			arr = new SimArray<T>(arr);
			return new SimArrayLike<T>(arr.splice(start, deleteCount, args));
		}
	}

	//@Override
	public final synchronized int unshift(Vars<?> args) {
		try {
			return arr.unshift(args);
		} catch (UnsupportedOperationException uoe) {
			arr = new SimArray<T>(arr);
			return arr.unshift(args);
		}
	}

	//@Override
	public final synchronized int unshift(Object value) {
		try {
			return arr.unshift(value);
		} catch (UnsupportedOperationException uoe) {
			arr = new SimArray<T>(arr);
			return arr.unshift(value);
		}
	}

	//@Override
	public final String toString() {
		return arr.toString();
	}

	//@Override
	public final synchronized ArrayLike<T> valueOf() {
		return this;
	}

	//@Override
	public final synchronized JsArray var() {
		if (Core.isRunning()) {
			return JsGlobal.Array.with().create(this);
		} else {
			JsArray arr = JsGlobal.Array.with().create();
			for (int i = 0, len = length(); i < len; i++) {
				arr.push(get(i));
			}
			return arr;
		}
	}
}
