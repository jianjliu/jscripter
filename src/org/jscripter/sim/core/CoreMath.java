
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

import js.Function;
import js.Js;
import js.MathLike;
import js.ObjectLike;
import js.core.JsGlobal;
import js.core.JsObject;

final class CoreMath extends JscObject
{
	private CoreMath() {
		super(Js.object());
	}

	private static CoreMath singleton;

	public final static synchronized CoreMath get() {
		if (singleton == null) {
			singleton = new CoreMath();
			JsObject.constructor.with(singleton, JsGlobal.Object);
			ObjectLike o = singleton.likeObject();
			o.var(JsGlobal.Math.E       .mid(), MathLike.E      );
			o.var(JsGlobal.Math.LN2     .mid(), MathLike.LN2    );
			o.var(JsGlobal.Math.LN10    .mid(), MathLike.LN10   );
			o.var(JsGlobal.Math.LOG2E   .mid(), MathLike.LOG2E  );
			o.var(JsGlobal.Math.LOG10E  .mid(), MathLike.LOG10E );
			o.var(JsGlobal.Math.PI      .mid(), MathLike.PI     );
			o.var(JsGlobal.Math.SQRT1_2 .mid(), MathLike.SQRT1_2);
			o.var(JsGlobal.Math.SQRT2   .mid(), MathLike.SQRT2  );
			o.var(
					JsGlobal.Math.abs.mid(),
					new Function<Number>() {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return Js.math().abs(callee.arguments.get(0));
						}
					}.var()
			);
			o.var(
					JsGlobal.Math.acos.mid(),
					new Function<Number>() {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return Js.math().acos(callee.arguments.get(0));
						}
					}.var()
			);
			o.var(
					JsGlobal.Math.asin.mid(),
					new Function<Number>() {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return Js.math().asin(callee.arguments.get(0));
						}
					}.var()
			);
			o.var(
					JsGlobal.Math.atan.mid(),
					new Function<Number>() {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return Js.math().atan(callee.arguments.get(0));
						}
					}.var()
			);
			o.var(
					JsGlobal.Math.atan2.mid(),
					new Function<Number>() {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return Js.math().atan2(callee.arguments.get(0), callee.arguments.get(1));
						}
					}.var()
			);
			o.var(
					JsGlobal.Math.ceil.mid(),
					new Function<Number>() {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return Js.math().ceil(callee.arguments.get(0));
						}
					}.var()
			);
			o.var(
					JsGlobal.Math.cos.mid(),
					new Function<Number>() {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return Js.math().cos(callee.arguments.get(0));
						}
					}.var()
			);
			o.var(
					JsGlobal.Math.exp.mid(),
					new Function<Number>() {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return Js.math().exp(callee.arguments.get(0));
						}
					}.var()
			);
			o.var(
					JsGlobal.Math.floor.mid(),
					new Function<Number>() {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return Js.math().floor(callee.arguments.get(0));
						}
					}.var()
			);
			o.var(
					JsGlobal.Math.log.mid(),
					new Function<Number>() {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return Js.math().log(callee.arguments.get(0));
						}
					}.var()
			);
			o.var(
					JsGlobal.Math.max.mid(),
					new Function<Number>() {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return Js.math().max(callee.arguments.var());
						}
					}.var()
			);
			o.var(
					JsGlobal.Math.min.mid(),
					new Function<Number>() {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return Js.math().min(callee.arguments.var());
						}
					}.var()
			);
			o.var(
					JsGlobal.Math.pow.mid(),
					new Function<Number>() {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return Js.math().pow(callee.arguments.get(0), callee.arguments.get(1));
						}
					}.var()
			);
			o.var(
					JsGlobal.Math.random.mid(),
					new Function<Number>() {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return Js.math().random();
						}
					}.var()
			);
			o.var(
					JsGlobal.Math.round.mid(),
					new Function<Number>() {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return Js.math().round(callee.arguments.get(0));
						}
					}.var()
			);
			o.var(
					JsGlobal.Math.sin.mid(),
					new Function<Number>() {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return Js.math().sin(callee.arguments.get(0));
						}
					}.var()
			);
			o.var(
					JsGlobal.Math.sinh.mid(),
					new Function<Number>() {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return Js.math().sinh(callee.arguments.get(0));
						}
					}.var()
			);
			o.var(
					JsGlobal.Math.sqrt.mid(),
					new Function<Number>() {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return Js.math().sqrt(callee.arguments.get(0));
						}
					}.var()
			);
			o.var(
					JsGlobal.Math.tan.mid(),
					new Function<Number>() {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return Js.math().tan(callee.arguments.get(0));
						}
					}.var()
			);
			o.var(
					JsGlobal.Math.tanh.mid(),
					new Function<Number>() {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return Js.math().tanh(callee.arguments.get(0));
						}
					}.var()
			);
		}
		return singleton;
	}
}
