
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
import js.ArrayObject;
import js.Js;
import js.Vars;

final class SimArrays
{
	private SimArrays() {}

	private final static void concat(ArrayLike<?> dst, ArrayObject<?> src) {
		for (int i = 0, len = src.length(); i < len; i++) {
			dst.push(src.get(i));
		}
	}

	public final static <T> ArrayLike<T> concat(
			ArrayLike<T> dst, ArrayLike<T> src, Vars<?> args) {
		concat(dst, src);
		ArrayLike<?> aa = args.var();
		for (int i = 0, len = aa.length(); i < len; i++) {
			Object arg = aa.get(i);
			if (arg instanceof ArrayObject<?>) {
				concat(dst, (ArrayObject<?>)arg);
			} else {
				dst.push(arg);
			}
		}
		return dst;
	}

	public final static <T> ArrayLike<T> concat(
			ArrayLike<T> dst, ArrayLike<T> src, Object arg) {
		concat(dst, src);
		if (arg instanceof ArrayObject<?>) {
			concat(dst, (ArrayObject<?>)arg);
		} else {
			dst.push(arg);
		}
		return dst;
	}

	public final static String join(ArrayLike<?> arr) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0, len = arr.length(); i < len; i++) {
			if (i > 0) {
				sb.append(',');
			}
			sb.append(Js.toString(arr.get(i)));
		}
		return sb.toString();
	}

	public final static String join(ArrayLike<?> arr, Object separator) {
		if (Js.undefined(separator)) {
			return join(arr);
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0, len = arr.length(); i < len; i++) {
			if (i > 0) {
				sb.append(Js.toString(separator));
			}
			sb.append(Js.toString(arr.get(i)));
		}
		return sb.toString();
	}

	public final static <T> void reverse(ArrayLike<T> arr) {
		for (int i = 0, len = arr.length(); i < len / 2; i++) {
			T t = arr.get(i);
			arr.set(i, arr.get(len - i));
			arr.set(len - i, t);
		}
	}

	public final static <T> ArrayLike<T> slice(ArrayLike<T> arr, Vars<?> args) {
		ArrayLike<?> a = args.var();
		if (a.length() < 2) {
			return slice(arr, a.get(0));
		} else {
			return slice(arr, a.get(0), a.get(1));
		}
	}

	public final static <T> ArrayLike<T> slice(ArrayLike<T> arr, Object start) {
		ArrayLike<T> a = new SimArrayList<T>();
		int from = SimUtil.getNumber(start).intValue();
		int len = arr.length();
		from = from < 0 ? from + len : from;
		for (int i = from; i < len; i++) {
			a.push(arr.get(i));
		}
		return a;
	}

	public final static <T> ArrayLike<T> slice(ArrayLike<T> arr, Object start, Object end) {
		ArrayLike<T> a = new SimArrayList<T>();
		int from = SimUtil.getNumber(start).intValue();
		int to   = SimUtil.getNumber(end  ).intValue();
		int len = arr.length();
		from = from < 0 ? from + len : from;
		to   = to   < 0 ? to   + len : to;
		for (int i = from; i < len; i++) {
			a.push(arr.get(i));
		}
		return a;
	}

	public final static String toString(ArrayLike<?> arr) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0, len = arr.length(); i < len; i++) {
			if (i > 0) {
				sb.append(",");
			}
			sb.append(Js.toString(arr.get(i)));
		}
		return sb.toString();
	}
}
