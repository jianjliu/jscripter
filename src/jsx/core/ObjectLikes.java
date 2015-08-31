
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

public final class ObjectLikes extends Disposable
{
	private ObjectLikes() {}

	public static final boolean delete(ObjectLike o, String name) {
		return o.delete(name);
	}

	public static final boolean delete(ObjectLike o, Id<?> id) {
		return o.delete(id);
	}

	public static final <T> void delete(ObjectLike o, ArrayLike<Id<T>> ids) {
		for (int i = 0, len = ArrayLikes.length(ids); i < len; i++) {
			delete(o, ids.get(i));
		}
	}

	public static final int get(ObjectLike o, Id<Integer> id) {
		Integer r = o.var(id);
		if (Js.not(r)) {
			r = 0;
		}
		return r;
	}

	public static final void inc(ObjectLike o, Id<Integer> id) {
		o.var(id, get(o, id) + 1);
	}

	public static final void dec(ObjectLike o, Id<Integer> id) {
		o.var(id, get(o, id) - 1);
	}

	public static final void each(ObjectLike o, JsFunction<Boolean> f) {
		ArrayLike<String> keys = Js.keys(o);
		for (int i = 0, len = ArrayLikes.length(keys); i < len; i++) {
			String k = keys.get(i);
			if (!f.call(o, k)) {
				return;
			}
		}
	}

	public static final boolean retrieve(ObjectLike o, ObjectLike a) {
		boolean ret = false;
		ArrayLike<String> keys = Js.keys(o);
		for (int i = 0, len = ArrayLikes.length(keys); i < len; i++) {
			String k = keys.get(i);
			Object v = a.var(k);
			if (Variables.defined(v)) {
				o.var(k, v);
				ret = true;
			}
		}
		return ret;
	}
}
