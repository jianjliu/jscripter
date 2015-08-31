
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

final class JscBoolean extends JsBoolean implements
	Iterable<JsBoolean.Mid>, Like<Boolean>, LikeObject, Unwrappable<JscObject>
{
	public JscBoolean(JscObject var) {
		super((Object)var);
	}
	public JscBoolean(Boolean var, ObjectLike objectLike) {
		this(new JscObject(var, objectLike));
	}
	public JscBoolean(Boolean var) {
		this(var, Js.object());
	}

	public final JscObject unwrap() {
		return (JscObject)var;
	}

	public final Boolean like() {
		return (Boolean)unwrap().like();
	}

	public final ObjectLike likeObject() {
		return unwrap().likeObject();
	}

	@Override
	public final JscBoolean var() {
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

	@Override
	public final Boolean valueOf() {
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
