
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
import js.Var;
import js.core.JsFunction;
import js.core.JsGlobal;
import js.core.JsObject;

final class JscGlobal extends JsGlobal
{
	JscGlobal() {
		super(new JscObject());
	}

	void init() {
		var(Object  , CreatorObject  .get());
		var(Function, CreatorFunction.get());
		JsGlobal.Object go = JsGlobal.Object.with();
		JsObject gop = new JscObject();
		JsFunction.prototype.with(go, gop);
		JsFunction<?> gf = JsGlobal.Function.with();
		JsObject.constructor.with(go, gf);
		JsObject.constructor.with(gf, go);
		JsObject gfp = new CoreFunction<Void>(JsFunction.prototype.toString()) {
			@Override
			protected Void function(java.lang.Object jsthis, Call<Void> callee) {
				return null;
			}
		}.var();
//		JsFunction.prototype.with(gop, gfp);
		JsFunction.prototype.with(gf, gfp);
		JsFunction.prototype.with(Js.core(), go.create());
		gop.var(
				JsObject.toString,
				new CoreFunction<java.lang.String>(JsObject.toString.toString()) {
					@Override
					protected java.lang.String function(java.lang.Object jsthis, Call<java.lang.String> callee) {
						return Js.toString(CoreFunction.like(jsthis));
					}
				}
		);
		gop.var(
				JsObject.valueOf,
				new CoreFunction<java.lang.Object>(JsObject.valueOf.toString()) {
					@Override
					protected java.lang.Object function(java.lang.Object jsthis, Call<java.lang.Object> callee) {
						return jsthis instanceof JsObject ? jsthis : ((Var<?>)jsthis).var();
					}
				}
		);
		gfp.var(
				JsFunction.toString,
				new CoreFunction<java.lang.String>(JsFunction.toString.toString()) {
					@Override
					protected java.lang.String function(java.lang.Object jsthis, Call<java.lang.String> callee) {
						return Js.toString((js.Function<?>)CoreFunction.like(jsthis));
					}
				}
		);
		gfp.var(
				JsFunction.valueOf,
				new CoreFunction<JsFunction<?>>(JsFunction.valueOf.toString()) {
					@Override
					protected JsFunction<?> function(java.lang.Object jsthis, Call<JsFunction<?>> callee) {
						return ((js.Function<?>)CoreFunction.like(jsthis)).valueOf();
					}
				}
		);
		var(Array   , CreatorArray   .get());
		var(Boolean , CreatorBoolean .get());
		var(Date    , CreatorDate    .get());
		var(Math    , CoreMath       .get());
		var(Number  , CreatorNumber  .get());
		var(RegExp  , CreatorRegExp  .get());
		var(String  , CreatorString  .get());
	}
}
