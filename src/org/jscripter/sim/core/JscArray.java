
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

import org.jscripter.sim.SimUtil;


import js.*;
import js.core.*;

final class JscArray extends JsArray implements
	Iterable<JsArray.Mid>, Like<ArrayLike<Object>>, LikeObject, Unwrappable<JscObject>
{
	public JscArray(JscObject var) {
		super((Object)var);
	}
	public JscArray(ArrayLike<?> var, ObjectLike objectLike) {
		this(new JscObject(var, objectLike));
	}
	public JscArray(ArrayLike<?> var) {
		this(var, Js.object());
	}

	public final JscObject unwrap() {
		return (JscObject)var;
	}

	@SuppressWarnings("unchecked")
	public final ArrayLike<Object> like() {
		return (ArrayLike<Object>)unwrap().like();
	}

	public final ObjectLike likeObject() {
		return unwrap().likeObject();
	}

	@Override
	public final JscArray var() {
		return this;
	}

	public final Iterator<Mid> iterator() {
		return unwrap().iterator();
	}

	@Override
	public final String toString() {
		return toString.with(this).call(this);
	}

	@Override
	public final String typeof() {
		return undefined() ? "undefined" : "object";
	}

	@Override
	public final JsArray valueOf() {
		return valueOf.with(this).call(this);
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
		return unwrap().delete(mid);
	}

	@Override
	public final Object var(Mid mid) {
		if (mid == Members.length) {
			return like().length();
		} else if (mid == Members.index) {
			return like().index();
		} else if (mid == Members.input) {
			return like().input();
		}
		return unwrap().var(mid);
	}
	@Override
	public final <S> S var(Mid mid, S v) {
		if (mid == Members.length) {
			like().length(
					SimUtil.getNumber(v).intValue()
			);
			return v;
		}
		return unwrap().var(mid, v);
	}

	@Override
	public final Object get(int i) {
		return like().get(i);
	}
	@Override
	public final Object set(int i, Object v) {
		return like().set(i, v);
	}
	@Override
	public final boolean delete(int i) {
		return like().delete(i);
	}

	@Override
	protected final <T> T call(JsFunction.Member<T> member) {
		return member.with(this).call(this);
	}
	@Override
	protected final <T> T call(JsFunction.Member<T> member, Object arg) {
		return member.with(this).call(this, arg);
	}
	@Override
	protected final <T> T call(JsFunction.Member<T> member, Vars<?> args) {
		return member.with(this).call(this, args);
	}
}
