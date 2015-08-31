
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

class JseFunction<T> extends JsFunction<T> implements Unwrappable<JseObject>, Live
{
	protected static abstract class Members extends JsFunction.Members
	{
		public final static Mid function = id("$f"    );
		public final static Mid apply    = id("apply" );
		public final static Mid call     = id("call"  );
		public final static Mid Object   = id("Object");
	}

	public JseFunction(JseObject var) {
		super((Object)var);
	}

	@Override
	public JseFunction<T> valueOf() {
		return new JseFunction<T>((JseObject)unwrap().valueOf());
	}
	@Override
	public final JseFunction<T> var() {
		return this;
	}
	public final JseObject unwrap() {
		return (JseObject)var;
	}
	public final JSObject getJSObject() {
		return unwrap().getJSObject();
	}

	@Override
	public final String toString() {
		return var == null ? "undefined" : unwrap().toString();
	}

	@SuppressWarnings("unchecked")
	protected T cast(Object o) {
		return (T)o;
	}
	@Override
	public final JsObject create() {
		return unwrap() instanceof HasFun<?> ?
			((HasFun<?>)unwrap()).getFunction().create() :
			(JseObject)((JseObject)Js.core().var()).callMember(Members.Object, invoke());
	}
	@Override
	public final JsObject create(Object arg) {
		return unwrap() instanceof HasFun<?> ?
			((HasFun<?>)unwrap()).getFunction().create(arg) :
			(JseObject)((JseObject)Js.core().var()).callMember(Members.Object, invoke(arg));
	}
	@Override
	public final JsObject create(Vars<?> args) {
		return unwrap() instanceof HasFun<?> ?
			((HasFun<?>)unwrap()).getFunction().create(args) :
			(JseObject)((JseObject)Js.core().var()).callMember(Members.Object, invoke(args));
	}

	@SuppressWarnings("unchecked")
	@Override
	public final T call(Object jsthis) {
		if (unwrap() instanceof HasFun<?>) {
			return ((HasFun<T>)unwrap()).getFunction().call(jsthis);
		}
		Object f = unwrap().var(Members.function);
		return f instanceof Function<?> ?  ((Function<T>)f).call(jsthis) : cast(unwrap().callMember(Members.call, jsthis));
	}
	@SuppressWarnings("unchecked")
	@Override
	public final T call(Object jsthis, Object arg) {
		if (unwrap() instanceof HasFun<?>) {
			return ((HasFun<T>)unwrap()).getFunction().call(jsthis, arg);
		}
		Object f = unwrap().var(Members.function);
		return f instanceof Function<?> ?  ((Function<T>)f).call(jsthis, arg) : cast(unwrap().callMember(Members.call, new Vars<Object>().add(jsthis).add(arg)));
	}
	@SuppressWarnings("unchecked")
	@Override
	public final T call(Object jsthis, Vars<?> args) {
		if (unwrap() instanceof HasFun<?>) {
			return ((HasFun<T>)unwrap()).getFunction().call(jsthis, args);
		}
		Object f = unwrap().var(Members.function);
		return f instanceof Function<?> ? ((Function<T>)f).call(jsthis, args) : cast(unwrap().callMember(Members.call, new Vars<Object>().add(jsthis).addAll(args)));
	}
	@SuppressWarnings("unchecked")
	@Override
	public final T invoke() {
		if (unwrap() instanceof HasFun<?>) {
			return ((HasFun<T>)unwrap()).getFunction().invoke();
		}
		Object f = unwrap().var(Members.function);
		return f instanceof Function<?> ? ((Function<T>)f).invoke() : cast(unwrap().callMember(Members.call, Js.core()));
	}
	@SuppressWarnings("unchecked")
	@Override
	public final T invoke(Object arg) {
		if (unwrap() instanceof HasFun<?>) {
			return ((HasFun<T>)unwrap()).getFunction().invoke(arg);
		}
		Object f = unwrap().var(Members.function);
		return f instanceof Function<?> ? ((Function<T>)f).invoke(arg) : cast(unwrap().callMember(Members.call, new Vars<Object>().add(Js.core()).add(arg)));
	}
	@SuppressWarnings("unchecked")
	@Override
	public final T invoke(Vars<?> args) {
		if (unwrap() instanceof HasFun<?>) {
			return ((HasFun<T>)unwrap()).getFunction().invoke(args);
		}
		Object f = unwrap().var(Members.function);
		return f instanceof Function<?> ? ((Function<T>)f).invoke(args) : cast(unwrap().callMember(Members.call, new Vars<Object>().add(Js.core()).addAll(args)));
	}
	@SuppressWarnings("unchecked")
	@Override
	public final T apply(Object jsthis) {
		if (unwrap() instanceof HasFun<?>) {
			return ((HasFun<T>)unwrap()).getFunction().apply(jsthis);
		}
		Object f = unwrap().var(Members.function);
		return f instanceof Function<?> ? ((Function<T>)f).apply(jsthis) : cast(unwrap().callMember(Members.apply, jsthis));
	}
	@SuppressWarnings("unchecked")
	@Override
	public final T apply(Object jsthis, Object arg) {
		if (unwrap() instanceof HasFun<?>) {
			return ((HasFun<T>)unwrap()).getFunction().apply(jsthis, arg);
		}
		Object f = unwrap().var(Members.function);
		return f instanceof Function<?> ? ((Function<T>)f).apply(jsthis, arg) : cast(unwrap().callMember(Members.apply, new Vars<Object>().add(jsthis).add(arg)));
	}

	@Override
	public final boolean undefined() {
		return var == null || unwrap().undefined();
	}

	@Override
	public final boolean delete() {
		if (undefined()) return false;
		return unwrap().delete();
	}

	@Override
	public final boolean delete(Mid mid) {
		return undefined() ? false : unwrap().delete(mid);
	}

	public final boolean in(Object o) {
		return true;
	}

	@Override
	public final Object var(Mid mid) {
		return unwrap().var(mid);
	}
	@Override
	public final <S> S var(Mid mid, S v) {
		return unwrap().var(mid, v);
	}

	@Override
	protected final <S> S call(JsFunction.Member<S> member) {
		return unwrap().call(member);
	}
	@Override
	protected final <S> S call(JsFunction.Member<S> member, Object arg) {
		return unwrap().call(member, arg);
	}
	@Override
	protected final <S> S call(JsFunction.Member<S> member, Vars<?> args) {
		return unwrap().call(member, args);
	}
}
