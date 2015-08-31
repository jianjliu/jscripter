
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

import netscape.javascript.JSException;
import netscape.javascript.JSObject;
import js.*;
import js.core.JsObject;

class JseObjectFF extends JseObject
{
	static class JseoFunction<T> extends JseObjectFF implements HasFun<T>
	{
		private JSObject jsof;

		public JseoFunction(Function<T> var) {
			super(var);
		}

		@SuppressWarnings("unchecked")
		public final Function<T> getFunction() {
			return (Function<T>)var;
		}

		@Override
		public final synchronized JSObject getJSObject() {
			if (jsof == null) {
				JSObject win = ((Live)((JsObject)Js.win()).var()).getJSObject();
				try {
					jsof = (JSObject)win.call("$f", new Object[]{getFunction()});
				} catch (JSException e) {
					throw e;
				}
			}
			return jsof;
		}
	}

	public JseObjectFF(Object var) {
		super(var);
	}

	public static final Object wrap(Object v) {
		return v instanceof JSObject ? new JseObjectFF((JSObject)v) : v;
	}

	@Override
	public final Object callMember(Mid mid) {
		return wrap(getJSObject().call(mid.toString(), Embeded.noargs));
	}
	@Override
	public final Object callMember(Mid mid, Object arg) {
		return wrap(getJSObject().call(
				mid.toString(),
				Js.undefined(arg) ? Embeded.noargs : new Object[]{unwrap(arg)}
		));
	}
	@Override
	public final Object callMember(Mid mid, Vars<?> args) {
		return wrap(getJSObject().call(mid.toString(), unwrap(args)));
	}

	@Override
	public final Object eval(String s) {
		return wrap(getJSObject().eval(s));
	}

	@Override
	public final Object var(Mid mid) {
		try {
			JSObject o = getJSObject();
			if (o == null) return null;
			return wrap(getJSObject().getMember(mid.toString()));
		} catch (JSException jse) {
			return null;
		}
	}
	@Override
	public final Object getSlot(int index) {
		try {
			JSObject o = getJSObject();
			if (o == null) return null;
			return wrap(getJSObject().getSlot(index));
		} catch (JSException jse) {
			return null;
		}
	}
	@Override
	public final void removeMember(Mid mid) {
		getJSObject().removeMember(mid.toString());
	}

	@Override
	public final <T> T var(Mid mid, T v) {
		getJSObject().setMember(mid.toString(), unwrap(v));
		return v;
	}
	@Override
	public final void setSlot(int index, Object v) {
		getJSObject().setSlot(index, unwrap(v));
	}
}
