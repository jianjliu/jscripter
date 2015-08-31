
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

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.jscripter.sim.SimUtil;


import js.*;
import js.core.*;

class JscObject extends JsObject implements
	Iterable<JsObject.Mid>, Like<Object>, LikeObject, Unwrappable<JscObject>
{
	private ObjectLike objectLike;

	public JscObject(Object var, ObjectLike objectLike) {
		super(var);
		this.objectLike = objectLike;
	}
	public JscObject(ObjectLike like) {
		this("[object Object]", like);
	}
	public JscObject() {
		this(Js.object());
	}

	public final JscObject unwrap() {
		return this;
	}

	public final Object like() {
		return var;
	}

	public final ObjectLike likeObject() {
		return objectLike;
	}

	@Override
	public final JscObject var() {
		return this;
	}

	public final Iterator<Mid> iterator() {
		Set<Mid> mids = new HashSet<Mid>();
		Iterator<Mid> it = Core.get().iterator(likeObject());
		while (it.hasNext()) {
			mids.add(it.next());
		}
		JsObject p = JsFunction.prototype.with(this);
		if (Js.be(p)) {
			it = ((JscObject)((Unwrappable<?>)p.var()).unwrap()).iterator();
			while (it.hasNext()) {
				mids.add(it.next());
			}
		}
		return mids.iterator();
	}

	@Override
	public final String typeof() {
		return undefined() ? "undefined" : "object";
	}

	@Override
	public final boolean undefined() {
		return var == null;
	}

	@Override
	public final String toString() {
		return toString.with(this).call(this);
	}

	@Override
	public final Object valueOf() {
		return valueOf.with(this).call(this);
	}

	@Override
	public final boolean delete() {
		if (undefined()) return false;
		var = null;
		objectLike = null;
		return true;
	}

	@Override
	public final boolean delete(Mid mid) {
		if (undefined()) {
			return false;
		}
		if (likeObject().delete(mid)) {
			return true;
		}
		JsObject p = JsFunction.prototype.with(this);
		if (Js.be(p) && Js.be(p.var(mid))) {
			likeObject().var(mid, null);
			return true;
		}
		return false;
	}

	@Override
	public final Object var(Mid mid) {
		if (mid == JsArray.length.mid()) {
			Object like = like();
			return like instanceof StringLike ?
					((StringLike)like).length() : ((ArrayLike<?>)like).length();
		} else if (mid == JsArray.index.mid()) {
			return ((ArrayLike<?>)like()).index();
		} else if (mid == JsArray.input.mid()) {
			return ((ArrayLike<?>)like()).input();
		} else if (mid == JsRegExp.global.mid()) {
			return ((RegExpLike)like()).global();
		} else if (mid == JsRegExp.ignoreCase.mid()) {
			return ((RegExpLike)like()).ignoreCase();
		} else if (mid == JsRegExp.multiline.mid()) {
			return ((RegExpLike)like()).multiline();
		} else if (mid == JsRegExp.lastIndex.mid()) {
			return ((RegExpLike)like()).lastIndex();
		} else if (mid == JsRegExp.source.mid()) {
			return ((RegExpLike)like()).source();
		}
		Object o = likeObject().var(mid);
		if (o != null) {
			return o;
		}
		JsObject p = (JsObject)likeObject().var(JsFunction.prototype.mid());
		return Js.be(p) ? p.var(mid) : null;
	}

	public final <T> T var(Mid mid, T v) {
		if (mid == JsArray.length.mid()) {
			((ArrayLike<?>)like()).length(
					SimUtil.getNumber(v).intValue()
			);
			return v;
		} else if (mid == JsRegExp.lastIndex.mid()) {
			((RegExpLike)like()).lastIndex(
					SimUtil.getNumber(v).intValue()
			);
			return v;
		}
		likeObject().var(mid, v instanceof JsObject       ? ((JsObject      )v).var() :
		                      v instanceof Function<?>    ? ((Function<?>   )v).var() :
		                      v instanceof Var<?>         ? ((Var<?>        )v).var() : v);
		return v;
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
