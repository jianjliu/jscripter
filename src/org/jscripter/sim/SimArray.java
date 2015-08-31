
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

import java.util.TreeMap;

import js.ArrayLike;
import js.Vars;
import js.core.JsArray;
import js.core.JsFunction;

final class SimArray<T> extends TreeMap<Integer, T> implements ArrayLike<T>
{
	private static final long serialVersionUID = 1L;

	public SimArray() {}

	public SimArray(ArrayLike<T> a) {
		synchronized(a) {
			for (int i = 0, len = a.length(); i < len; i++) {
				push(a.get(i));
			}
		}
	}

	//@Override
	public final synchronized boolean delete(int i) {
		if (isEmpty()) {
			return false;
		}
		return remove(i + firstKey()) != null;
	}

	//@Override
	public final synchronized T get(int i) {
		if (isEmpty()) {
			return null;
		}
		return super.get(i + firstKey());
	}

	//@Override
	public final synchronized T set(int i, T v) {
		if (isEmpty()) {
			put(0, null);
		}
		put(i + firstKey(), v);
		return v;
	}

	private final void relength() {
		if (isEmpty()) {
			return;
		}
		int last = lastKey();
		while(super.get(last) == null)  {
			remove(last);
			if (isEmpty()) {
				return;
			}
			last = lastKey();
		}
	}

	//@Override
	public final synchronized int length() {
		relength();
		return isEmpty() ? 0 : lastKey() - firstKey() + 1;
	}

	//@Override
	public final synchronized int length(int len) {
		return len;
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
		relength();
		return isEmpty() ? null : remove(lastKey());
	}

	@SuppressWarnings("unchecked")
	//@Override
	public final synchronized int push(Object v) {
		relength();
		if (isEmpty()) {
			put(0, (T)v);
		} else {
			put(lastKey() + 1, (T)v);
		}
		return length();
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
	public final synchronized String join() {
		return SimArrays.join(this);
	}

	//@Override
	public final synchronized String join(Object separator) {
		return SimArrays.join(this, separator);
	}

	@SuppressWarnings("unchecked")
	//@Override
	public final synchronized int push(Vars<?> args) {
		relength();
		ArrayLike<?> a = args.var();
		for (int i = 0, len = a.length(); i < len; i++) {
			if (isEmpty()) {
				put(0, (T)a.get(i));
			} else {
				put(lastKey() + 1, (T)a.get(i));
			}
		}
		return length();
	}

	//@Override
	public final synchronized void reverse() {
		SimArrays.reverse(this);
	}

	//@Override
	public final synchronized T shift() {
		relength();
		return isEmpty() ? null : remove(firstKey());
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
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized ArrayLike<T> sort(JsFunction<? extends Number> orderfunc) {
		throw new UnsupportedOperationException();
	}

	//@Override
	public final synchronized ArrayLike<T> splice(Vars<?> args) {
		ArrayLike<?> a = args.var();
		int len = a.length();
		if (len < 2) {
			return splice(a.get(0));
		} else if (len < 3) {
			return splice(a.get(0), a.get(1));
		} else if (len < 4) {
			return splice(a.get(0), a.get(1), a.get(2));
		} else {
			Vars<Object> vars = new Vars<Object>();
			for (int i = 3; i < len; i++) {
				vars.add(a.get(i));
			}
			return splice(a.get(0), a.get(1), vars);
		}
	}

	//@Override
	public final synchronized ArrayLike<T> splice(Object start) {
		relength();
		SimArray<T> a = new SimArray<T>();
		if (!isEmpty()) {
			int i = SimUtil.getNumber(start).intValue() + firstKey();
			int last = lastKey();
			for (int j = 0; i <= last; i++, j++) {
				T v = remove(i);
				if (v != null) {
					a.put(j, v);
				}
			}
		}
		return a;
	}

	//@Override
	public final synchronized ArrayLike<T> splice(Object start, Object deleteCount) {
		relength();
		SimArray<T> a = new SimArray<T>();
		if (!isEmpty()) {
			int i = SimUtil.getNumber(start).intValue() + firstKey();
			int n = SimUtil.getNumber(deleteCount).intValue();
			for (int j = 0; j < n; i++, j++) {
				T v = remove(i);
				if (v != null) {
					a.put(j, v);
				}
			}
		}
		return a;
	}

	@SuppressWarnings("unchecked")
	//@Override
	public final synchronized ArrayLike<T> splice(Object start, Object deleteCount, Object arg) {
		relength();
		SimArray<T> a = new SimArray<T>();
		if (!isEmpty()) {
			int i = SimUtil.getNumber(start).intValue() + firstKey();
			int n = SimUtil.getNumber(deleteCount).intValue();
			for (int j = 0; j < n; i++, j++) {
				T v = remove(i);
				if (v != null) {
					a.put(j, v);
				}
			}
			put(i, (T)arg);
		}
		return a;
	}

	@SuppressWarnings("unchecked")
	//@Override
	public final synchronized ArrayLike<T> splice(Object start, Object deleteCount, Vars<?> args) {
		relength();
		SimArray<T> a = new SimArray<T>();
		if (!isEmpty()) {
			int i = SimUtil.getNumber(start).intValue() + firstKey();
			int n = SimUtil.getNumber(deleteCount).intValue();
			for (int j = 0; j < n; i++, j++) {
				T v = remove(i);
				if (v != null) {
					a.put(j, v);
				}
			}
			ArrayLike<?> va = args.var();
			for (int j = 0, len = va.length(); j < len; j++) {
				put(i++, (T)va.get(i));
			}
		}
		return a;
	}

	@SuppressWarnings("unchecked")
	//@Override
	public final synchronized int unshift(Object arg) {
		relength();
		put(firstKey() - 1, (T)arg);
		return length();
	}

	@SuppressWarnings("unchecked")
	//@Override
	public final synchronized int unshift(Vars<?> args) {
		relength();
		ArrayLike<?> a = args.var();
		for (int i = 0, len = a.length(); i < len; i++) {
			put(firstKey() - 1, (T)a.get(i));
		}
		return length();
	}

	//@Override
	public final String toString() {
		return SimArrays.toString(this);
	}

	//@Override
	public final SimArray<T> valueOf() {
		return this;
	}

	//@Override
	public final JsArray var() {
		throw new UnsupportedOperationException();
	}
}
