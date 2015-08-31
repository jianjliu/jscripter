
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
import js.NumberLike;
import js.Value;
import js.Vars;
import js.core.JsFunction;
import js.core.JsGlobal;
import js.core.JsNumber;
import js.core.JsObject;

final class CreatorNumber extends CoreFunction<Number>
{
	private CreatorNumber() {
		super(JsGlobal.Number.toString());
	}

	@Override
	protected java.lang.Number function(Object jsthis, Call<Number> callee) {
		Object a0 = callee.arguments.get(0);
		a0 = a0 instanceof Value<?> ? ((Value<?>)a0).var() : a0;
		return a0 instanceof Number    ? (Number)a0 :
		       a0 instanceof Character ? (short)((Character)a0).charValue() :
		       Js.be(a0) ? 1 : 0;
	}
	@Override
	public JsNumber create() {
		return (JsNumber)construct(new JscNumber(Core.get().numberLike(invoke())));
	}
	@Override
	public JsNumber create(Object arg) {
		return (JsNumber)construct(new JscNumber(Core.get().numberLike(invoke(arg))));
	}
	@Override
	public JsNumber create(Vars<?> args) {
		return (JsNumber)construct(new JscNumber(Core.get().numberLike(invoke(args))));
	}

	private static CreatorNumber singleton;

	public final static synchronized CreatorNumber get() {
		if (singleton == null) {
			singleton = new CreatorNumber();
			JsObject p = JsFunction.prototype.with(singleton.var());
			p.var(
					JsNumber.toExponential,
					new CoreFunction<String>(JsNumber.toExponential.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							return callee.arguments.length() < 1 ?
									((NumberLike<?>)like(jsthis)).toExponential():
									((NumberLike<?>)like(jsthis)).toExponential(
											callee.arguments.get(0)
									);
						}
					}
			);
			p.var(
					JsNumber.toFixed,
					new CoreFunction<String>(JsNumber.toFixed.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							return callee.arguments.length() < 1 ?
									((NumberLike<?>)like(jsthis)).toFixed():
									((NumberLike<?>)like(jsthis)).toFixed(
											callee.arguments.get(0)
									);
						}
					}
			);
			p.var(
					JsNumber.toPrecision,
					new CoreFunction<String>(JsNumber.toPrecision.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							return callee.arguments.length() < 1 ?
									((NumberLike<?>)like(jsthis)).toPrecision():
									((NumberLike<?>)like(jsthis)).toPrecision(
											callee.arguments.get(0)
									);
						}
					}
			);
			p.var(
					JsNumber.toString,
					new CoreFunction<String>(JsNumber.toString.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							return Js.toString(like(jsthis));
						}
					}
			);
			p.var(
					JsNumber.valueOf,
					new CoreFunction<Number>(JsNumber.valueOf.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((NumberLike<?>)like(jsthis)).valueOf();
						}
					}
			);
		}
		return singleton;
	}
}
