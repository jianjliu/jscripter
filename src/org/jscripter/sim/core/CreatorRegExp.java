
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
import js.RegExpLike;
import js.Var;
import js.Vars;
import js.core.JsArray;
import js.core.JsFunction;
import js.core.JsGlobal;
import js.core.JsObject;
import js.core.JsRegExp;

final class CreatorRegExp extends CoreFunction<JsRegExp>
{
	private CreatorRegExp() {
		super(JsGlobal.RegExp.toString());
	}

	@Override
	protected JsRegExp function(Object jsthis, Call<JsRegExp> callee) {
		Object arg0 = callee.arguments.get(0);
		Object arg1 = callee.arguments.get(1);
		return arg0 instanceof JsRegExp ? (JsRegExp)arg0 :
			(JsRegExp)construct(new JscRegExp(
					arg0 instanceof String ? arg1 instanceof String ?
					Js.re((String)arg0, (String)arg1) : 
					Js.re((String)arg0) : null
			));
	}
	@Override
	protected final JsRegExp construct(Object o) {
		JsRegExp ret = (JsRegExp)o;
		JsObject.constructor.with(ret, var());
		JsFunction.prototype.with(ret, JsFunction.prototype.with(var()));
		return ret;
	}
	@Override
	public final JsRegExp create() {
		return invoke();
	}
	@Override
	public final JsRegExp create(Object arg) {
		return invoke(arg);
	}
	@Override
	public final JsRegExp create(Vars<?> args) {
		return invoke(args);
	}

	private static CreatorRegExp singleton;

	public final static synchronized CreatorRegExp get() {
		if (singleton == null) {
			singleton = new CreatorRegExp();
			JsObject p = JsFunction.prototype.with(singleton.var());
			p.var(
					JsRegExp.exec,
					new CoreFunction<JsArray>(JsRegExp.exec.toString()) {
						@Override
						protected JsArray function(Object jsthis, Call<JsArray> callee) {
							return jsthis instanceof RegExpLike ?
							       new JscArray(
							      		((RegExpLike)jsthis).exec(callee.arguments.get(0))
					               ) :
							       new JscArray(
							       		((RegExpLike)((Var<?>)jsthis).var()).exec(callee.arguments.get(0))
							       );
						}
					}
			);
			p.var(
					JsRegExp.test,
					new CoreFunction<Boolean>(JsRegExp.test.toString()) {
						@Override
						protected Boolean function(Object jsthis, Call<Boolean> callee) {
							return jsthis instanceof RegExpLike ?
							       ((RegExpLike)jsthis).test(callee.arguments.get(0)) :
							       ((RegExpLike)((Var<?>)jsthis).var()).test(callee.arguments.get(0));
						}
					}
			);
			p.var(
					JsRegExp.toString,
					new CoreFunction<String>(JsRegExp.toString.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							return Js.toString(like(jsthis));
						}
					}
			);
			p.var(
					JsRegExp.valueOf,
					new CoreFunction<JsRegExp>(JsRegExp.valueOf.toString()) {
						@Override
						protected JsRegExp function(Object jsthis, Call<JsRegExp> callee) {
							return new JscRegExp(((RegExpLike)like(jsthis)).valueOf());
						}
					}
			);
		}
		return singleton;
	}
}
