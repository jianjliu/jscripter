
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

import java.util.HashSet;
import java.util.Set;

import netscape.javascript.JSException;
import netscape.javascript.JSObject;
import js.*;
import js.core.*;

class JseObjectIE extends JseObject
{
	static class JseoFunction<T> extends JseObjectIE implements HasFun<T>
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

	final static class IEMembers extends JsObject.Members
	{
		final static Mid attachEvent = id("attachEvent");
		final static Mid detachEvent = id("detachEvent");
		final static Mid selectNodes = id("selectNodes");

		private final static Set<Mid> ienats = new HashSet<Mid>();

		static {
			ienats.add(attachEvent);
			ienats.add(detachEvent);
			ienats.add(selectNodes);
		}

		private final static boolean isWin(JSObject o) {
			JSObject win = ((Live)((JsObject)Js.win()).var()).getJSObject();
			return (Boolean)win.call(
					"$eqs",
					new Object[]{o, win}
			);
		}

		private final static String delegate(Mid mid) {
			JSObject win = ((Live)((JsObject)Js.win()).var()).getJSObject();
			String delegator = "$$" + mid.toString();
			synchronized(IEMembers.class) {
				try {
					win.getMember(delegator);
				} catch(JSException e) {
					win.eval("this." + delegator + "=function(o,a){return o." + mid.toString() + ".apply(o,a);}");
				}
			}
			return delegator;
		}
		final static Object callMember(JSObject jso, Mid mid) {
			if (!ienats.contains(mid) || isWin(jso)) {
				return jso.call(mid.toString(), Embeded.noargs);
			}
			JSObject win = ((Live)((JsObject)Js.win()).var()).getJSObject();
			return win.call(delegate(mid), new Object[]{jso});
		}
		final static Object callMember(JSObject jso, Mid mid, Object arg) {
			if (Js.undefined(arg)) {
				return callMember(jso, mid);
			}
			if (!ienats.contains(mid) || isWin(jso)) {
				return jso.call(mid.toString(), new Object[]{unwrap(arg)});
			}
			JSObject win = ((Live)((JsObject)Js.win()).var()).getJSObject();
			return win.call(delegate(mid), new Object[]{jso, new Object[]{unwrap(arg)}});
		}
		final static Object callMember(JSObject jso, Mid mid, Vars<?> args) {
			if (!ienats.contains(mid) || isWin(jso)) {
				return jso.call(mid.toString(), unwrap(args));
			}
			JSObject win = ((Live)((JsObject)Js.win()).var()).getJSObject();
			try {
				return win.call(delegate(mid), new Object[]{jso, unwrap(args.var().var())});
			} catch (JSException e) {
				throw e;
			}
		}

		private final static <T> T set(JSObject jso, Object p, T v) {
			JSObject win = ((Live)((JsObject)Js.win()).var()).getJSObject();
			win.call("$$set", new Object[]{jso, p, unwrap(v)});
			return v;
		}
		final static <T> T setMember(JSObject jso, Mid mid, T v) {
			return set(jso, mid.toString(), v);
		}
		final static <T> T setSlot(JSObject jso, int i, T v) {
			return set(jso, i, v);
		}
	}

	public JseObjectIE(Object var) {
		super(var);
	}

	public static final Object wrap(Object v) {
		return v instanceof JSObject ? new JseObjectIE((JSObject)v) : v;
	}

	@Override
	public final Object callMember(Mid mid) {
		return wrap(IEMembers.callMember(getJSObject(), mid));
	}
	@Override
	public final Object callMember(Mid mid, Object arg) {
		return wrap(IEMembers.callMember(getJSObject(), mid, arg));
	}
	@Override
	public final Object callMember(Mid mid, Vars<?> args) {
		return wrap(IEMembers.callMember(getJSObject(), mid, args));
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
		return IEMembers.setMember(getJSObject(), mid, v);
	}
	@Override
	public final void setSlot(int index, Object v) {
		IEMembers.setSlot(getJSObject(), index, v);
	}
}
