
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import js.ArrayLike;
import js.Js;
import js.Vars;
import js.core.JsArray;
import js.core.JsFunction;

final class SimArrayList<T> extends ArrayList<T> implements ArrayLike<T>
{
	private static final long serialVersionUID = -7941589999600923231L;

	public SimArrayList() {}

	public SimArrayList(ArrayLike<T> a) {
		synchronized(a) {
			for (int i = 0, len = a.length(); i < len; i++) {
				push(a.get(i));
			}
		}
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
		if (Js.be(get(i))) {
			if (i == size() - 1) {
				remove(i);
			} else {
				super.set(i, null);
			}
			return true;
		}
		return false;
	}

	//@Override
	public final synchronized T get(int i) {
		return i < size() ? super.get(i) : null;
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
		return size();
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
		return isEmpty() ? null : remove(size() - 1);
	}

	@SuppressWarnings("unchecked")
	//@Override
	public final synchronized int push(Object v) {
		add((T)v);
		return size();
	}

	@SuppressWarnings("unchecked")
	//@Override
	public final synchronized int push(Vars<?> args) {
		ArrayLike<?> a = args.var();
		for (int i = 0, len = a.length(); i < len; i++) {
			add((T)a.get(i));
		}
		return size();
	}

	//@Override
	public final synchronized void reverse() {
		SimArrays.reverse(this);
	}

	//@Override
	public final synchronized T set(int i, T v) {
		if (i >= size()) {
			throw new UnsupportedOperationException();
		}
		super.set(i, v);
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
		Collections.sort(this, new Comparator<T>() {
			//@Override
			public int compare(T arg0, T arg1) {
				double a = SimUtil.getNumber(arg0).doubleValue(),
				       b = SimUtil.getNumber(arg1).doubleValue();
			return a > b ? 1 : a < b ? -1 : 0;
			}
		});
		return this;
	}

	//@Override
	public final synchronized ArrayLike<T> sort(final JsFunction<? extends Number> orderfunc) {
		Collections.sort(this, new Comparator<T>() {
			//@Override
			public int compare(T arg0, T arg1) {
				return orderfunc.invoke(new Vars<T>().add(arg0).add(arg1)).intValue();
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
