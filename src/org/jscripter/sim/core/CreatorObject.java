
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

import js.Js;
import js.ObjectLike;
import js.Var;
import js.Vars;
import js.core.JsFunction;
import js.core.JsGlobal;
import js.core.JsObject;

final class CreatorObject extends CoreFunction<JsObject>
{
	private CreatorObject() {
		super(JsGlobal.Object.toString());
	}

	@Override
	protected final JsObject function(java.lang.Object jsthis, Call<JsObject> callee) {
		return callee.arguments.length() < 1 ? create() :
			create(callee.arguments.get(0));
	}

	@Override
	protected final JsObject construct(Object o) {
		JsObject ret = (JsObject)o;
		JsObject.constructor.with(ret, var());
		JsFunction.prototype.with(ret, JsFunction.prototype.with(var()));
		return ret;
	}
	@Override
	public final JsObject create() {
		return construct(new JscObject());
	}
	@Override
	public final JsObject create(java.lang.Object arg) {
		if (Js.undefined(arg)) {
			return create();
		} else if (arg instanceof JsObject) {
			return (JsObject)arg;
		} else if (arg instanceof ObjectLike) {
			return create((ObjectLike)arg);
		} else if (arg instanceof Var<?>) {
			return create(((Var<?>)arg).var());
		} else if (arg instanceof ObjectLike) {
			return create((ObjectLike)arg);
		} else if (arg instanceof java.lang.Boolean) {
			return JsGlobal.Boolean.with().create(arg);
		} else if (arg instanceof java.lang.Number) {
			return JsGlobal.Number.with().create(arg);
		} else if (arg instanceof java.lang.String) {
			return JsGlobal.String.with().create(arg);
		} else {
			return new JscObject(arg, create());
		}
	}
	private final JsObject create(ObjectLike arg) {
		return arg instanceof JsObject ? arg.var() : construct(new JscObject(arg));
	}
	@Override
	public final JsObject create(Vars<?> args) {
		return args != null && args.var().length() > 0 ?
				create(args.var().get(0)) : create();
	}

	private static CreatorObject singleton;

	public final static synchronized CreatorObject get() {
		if (singleton == null) {
			singleton = new CreatorObject();
		}
		return singleton;
	}
}
