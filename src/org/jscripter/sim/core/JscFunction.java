
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

package org.jscripter.sim.core;

import java.util.Iterator;

import js.*;
import js.core.*;

final class JscFunction<T> extends JsFunction<T> implements
	Iterable<JsFunction.Mid>, Like<Function<T>>, LikeObject, Unwrappable<JscObject>
{
	public JscFunction(JscObject var) {
		super((Object)var);
	}
	public JscFunction(Function<T> var) {
		this(
				new JscObject(
						var,
						Js.object()
				)
		);
		JsFunction<?> go = JsGlobal.Object.with();
		if (Js.be(go)) {
			JsFunction.prototype.with(this, go.create());
		}
		JsFunction<?> gf = JsGlobal.Function.with();
		if (Js.be(gf)) {
			JsObject.constructor.with(this, gf);
		}
	}

	public final JscObject unwrap() {
		return (JscObject)var;
	}

	@SuppressWarnings("unchecked")
	public final Function<T> like() {
		return (Function<T>)unwrap().like();
	}

	public final ObjectLike likeObject() {
		return unwrap().likeObject();
	}

	@Override
	public final JscFunction<T> var() {
		return this;
	}

	public final Iterator<Mid> iterator() {
		return unwrap().iterator();
	}

	@Override
	public final String typeof() {
		return undefined() ? "undefined" : "object";
	}

	@Override
	public final String toString() {
		return toString.with(this).call(this);
	}

	@SuppressWarnings("unchecked")
	@Override
	public final JsFunction<T> valueOf() {
		return (JsFunction<T>)valueOf.with(this).call(this);
	}

	@Override
	public final boolean undefined() {
		return unwrap().undefined();
	}

	@Override
	public final boolean delete() {
		return unwrap().delete();
	}

	@Override
	public final boolean delete(Mid mid) {
		return unwrap().delete();
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
	public final JsObject create() {
		return like().create();
	}
	@Override
	public final JsObject create(Object arg) {
		return like().create(arg);
	}
	@Override
	public final JsObject create(Vars<?> args) {
		return like().create(args);
	}
	@Override
	public final T invoke() {
		return like().invoke();
	}
	@Override
	public final T invoke(Object arg) {
		return like().invoke(arg);
	}
	@Override
	public final T invoke(Vars<?> args) {
		return like().invoke(args);
	}
	@Override
	public final T call(Object thisobj) {
		return like().call(thisobj);
	}
	@Override
	public final T call(Object thisobj, Object arg) {
		return like().call(thisobj, arg);
	}
	@Override
	public final T call(Object thisobj, Vars<?> args) {
		return like().call(thisobj, args);
	}
	@Override
	public final T apply(Object thisobj) {
		return like().apply(thisobj);
	}
	@Override
	public final T apply(Object thisobj, Object args) {
		return like().call(thisobj, args);
	}

	@Override
	protected final <S> S call(JsFunction.Member<S> member) {
		return member.with(this).call(this);
	}
	@Override
	protected final <S> S call(JsFunction.Member<S> member, Object arg) {
		return member.with(this).call(this, arg);
	}
	@Override
	protected final <S> S call(JsFunction.Member<S> member, Vars<?> args) {
		return member.with(this).call(this, args);
	}
}
