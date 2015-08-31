
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

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.jscripter.sim.core.Core;


import js.Id;
import js.Js;
import js.ObjectLike;
import js.Var;
import js.core.JsGlobal;
import js.core.JsObject;

final class SimObjectLike extends Var<Object> implements ObjectLike
{
	private final Map<Mid, Object> map = new HashMap<Mid, Object>();

	final boolean has(Mid mid) {
		return map.containsKey(mid);
	}

	//@Override
	public final String typeof() {
		return "object";
	}

	//@Override
	public final boolean undefined() {
		return false;
	}

	//@Override
	public final Object valueOf() {
		return map;
	}

	//@Override
	public final boolean delete(Id<?> id) {
		return delete(id.mid());
	}

	//@Override
	public final boolean delete(Member<?> m) {
		return delete(m.mid());
	}

	//@Override
	public final boolean delete(String name) {
		return delete(Members.id(name));
	}

	//@Override
	public final synchronized boolean delete(Mid mid) {
		if (!map.containsKey(mid)) {
			return false;
		}
		map.remove(mid);
		return true;
	}

	@SuppressWarnings("unchecked")
	//@Override
	public final <T> T var(Id<T> id) {
		return (T)var(id.mid());
	}

	@SuppressWarnings("unchecked")
	//@Override
	public final <T> T var(Var.Member<T> m) {
		return (T)var(m.mid());
	}

	//@Override
	public final Object var(String name) {
		return var(Members.id(name));
	}

	//@Override
	public final synchronized Object var(Mid mid) {
		return map.get(mid);
	}

	//@Override
	public final <T> T var(Id<T> id, T value) {
		return var(id.mid(), value);
	}

	//@Override
	public final <T> T var(Var.Member<T> m, T value) {
		return var(m.mid(), value);
	}

	//@Override
	public final <T> T var(String name, T value) {
		return var(Members.id(name), value);
	}

	//@Override
	public final synchronized <T> T var(Mid mid, T value) {
		map.put(mid, value);
		return value;
	}

	//@Override
	public Boolean hasOwnProperty(Object propname) {
		return has(Members.id(Js.toString(propname)));
	}

	//@Override
	public Boolean isPrototypeOf(Object o) {
		return false;
	}

	//@Override
	public Boolean propertyIsEnumerable(Object propname) {
		return hasOwnProperty(propname);
	}

	//@Override
	public String toLocaleString() {
		return toString();
	}

	//@Override
	public final String toString() {
		return "[object Object]";
	}

	//@Override
	public final synchronized JsObject var() {
		if (Core.isRunning()) {
			return JsGlobal.Object.with().create(this);
		} else {
			JsObject o = JsGlobal.Object.with().create();
			for (Mid mid : map.keySet()) {
				o.var(mid, var(mid));
			}
			return o;
		}
	}

	final Iterator<Mid> iterator() {
		return map.keySet().iterator();
		
	}
}
