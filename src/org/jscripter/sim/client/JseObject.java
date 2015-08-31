
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

package org.jscripter.sim.client;

import netscape.javascript.JSObject;
import js.*;
import js.core.*;

abstract class JseObject extends JsObject implements Unwrappable<JseObject>, Live
{
	protected JseObject(Object var) {
		super(var);
	}

	@Override
	public final JseObject var() {
		return this;
	}
	public final JseObject unwrap() {
		return this;
	}
	public JSObject getJSObject() {
		return (JSObject)var;
	}

	public static final Object unwrap(Object v) {
		v = v instanceof Var<?> ? ((Var<?>)v).var() : v;
		return v instanceof JsObject ?
				((Live)((JsObject)v).var()).getJSObject() : v;
	}
	public static final Object[] unwrap(Vars<?> args) {
		ArrayLike<?> a = args.var();
		if (a == null) return Embeded.noargs;
		int len = a.length();
		while(len > 0 && Js.undefined(a.get(len - 1))) len--;
		if (len < 1) return Embeded.noargs;
		Object[] arr = new Object[len];
		for (int i = 0; i < len; i++) {
			arr[i] = unwrap(a.get(i));
		}
		return arr;
	}

	public abstract Object callMember(Mid mid);
	public abstract Object callMember(Mid mid, Object arg);
	public abstract Object callMember(Mid mid, Vars<?> args);
	public abstract Object eval(String s);
	@Override
	public abstract Object var(Mid mid);
	public abstract Object getSlot(int index);
	public abstract void removeMember(Mid mid);
	@Override
	public abstract <T> T var(Mid mid, T v);
	public abstract void setSlot(int index, Object v);

	@Override
	public final String toString() {
		return var == null ? "undefined" : getJSObject().toString();
	}

	@Override
	public final Object valueOf() {
		return this;
	}

	@Override
	public final String typeof() {
		return var == null ? "undefined" : (String)getJSObject().eval("typeof this");
	}

	@Override
	public final boolean undefined() {
		return var == null;
	}

	@Override
	public final boolean delete() {
		if (undefined()) return false;
		var = null;
		return true;
	}

	@Override
	public final boolean delete(Mid mid) {
		return undefined() ? false : (Boolean)getJSObject().eval("");
	}

	public final boolean in(Object o) {
		return undefined() ? false : (Boolean)getJSObject().eval("");
	}

	@SuppressWarnings("unchecked")
	@Override
	protected final <T> T call(JsFunction.Member<T> member) {
		return (T)callMember(member.mid());
	}
	@SuppressWarnings("unchecked")
	@Override
	protected final <T> T call(JsFunction.Member<T> member, Object arg) {
		return (T)callMember(member.mid(), arg);
	}
	@SuppressWarnings("unchecked")
	@Override
	protected final <T> T call(JsFunction.Member<T> member, Vars<?> args) {
		return (T)callMember(member.mid(), args);
	}
}
