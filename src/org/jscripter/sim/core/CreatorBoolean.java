
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
import js.Vars;
import js.core.JsBoolean;
import js.core.JsFunction;
import js.core.JsGlobal;
import js.core.JsObject;

final class CreatorBoolean extends CoreFunction<Boolean>
{
	private CreatorBoolean() {
		super(JsGlobal.Boolean.toString());
	}

	@Override
	protected Boolean function(Object jsthis, Call<Boolean> callee) {
		return Js.be(callee.arguments.get(0));
	}
	@Override
	public final JsBoolean create() {
		return (JsBoolean)construct(new JscBoolean(invoke()));
	}
	@Override
	public final JsBoolean create(Object arg) {
		return (JsBoolean)construct(new JscBoolean(invoke(arg)));
	}
	@Override
	public final JsBoolean create(Vars<?> args) {
		return (JsBoolean)construct(new JscBoolean(invoke(args)));
	}

	private static CreatorBoolean singleton;

	public final static synchronized CreatorBoolean get() {
		if (singleton == null) {
			singleton = new CreatorBoolean();
			JsObject p = JsFunction.prototype.with(singleton.var());
			p.var(
					JsBoolean.toString,
					new CoreFunction<String>(JsBoolean.toString.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							return Js.toString(like(jsthis));
						}
					}
			);
			p.var(
					JsBoolean.valueOf,
					new CoreFunction<Boolean>(JsBoolean.valueOf.toString()) {
						@Override
						protected Boolean function(Object jsthis, Call<Boolean> callee) {
							return (Boolean)like(jsthis);
						}
					}
			);
		}
		return singleton;
	}
}
