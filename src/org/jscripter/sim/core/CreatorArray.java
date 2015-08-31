
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

import js.ArrayLike;
import js.Js;
import js.Vars;
import js.core.JsArray;
import js.core.JsFunction;
import js.core.JsGlobal;
import js.core.JsObject;

final class CreatorArray extends CoreFunction<JsArray>
{
	private CreatorArray() {
		super(JsGlobal.Array.toString());
	}

	@Override
	protected JsArray function(Object jsthis, Call<JsArray> callee) {
		Object arg0 = callee.arguments.get(0);
		return arg0 instanceof JsArray ? (JsArray)arg0 :
			(JsArray)construct(new JscArray(Js.array()));
	}
	@Override
	protected final JsArray construct(Object o) {
		JsArray ret = (JsArray)o;
		JsObject.constructor.with(ret, var());
		JsFunction.prototype.with(ret, JsFunction.prototype.with(var()));
		return ret;
	}
	@Override
	public final JsArray create() {
		return (JsArray)invoke();
	}
	@Override
	public final JsArray create(Object arg) {
		return (JsArray)invoke(arg);
	}
	@Override
	public final JsArray create(Vars<?> args) {
		return (JsArray)invoke(args);
	}

	private static CreatorArray singleton;

	public final static synchronized CreatorArray get() {
		if (singleton == null) {
			singleton = new CreatorArray();
			JsObject p = JsFunction.prototype.with(singleton.var());
			p.var(
					JsArray.concat,
					new CoreFunction<JsArray>(JsArray.concat.toString()) {
						@Override
						protected JsArray function(Object jsthis, Call<JsArray> callee) {
							return JsGlobal.Array.with().create(
									((ArrayLike<?>)like(jsthis)).concat(
											callee.arguments.var()
									)
							);
						}
					}
			);
			p.var(
					JsArray.join,
					new CoreFunction<String>(JsArray.join.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							return callee.arguments.length() < 1 ?
									((ArrayLike<?>)like(jsthis)).join() :
									((ArrayLike<?>)like(jsthis)).join(
											callee.arguments.get(0)
									);
						}
					}
			);
			p.var(
					JsArray.pop,
					new CoreFunction<Object>(JsArray.pop.toString()) {
						@Override
						protected Object function(Object jsthis, Call<Object> callee) {
							return ((ArrayLike<?>)like(jsthis)).pop();
						}
					}
			);
			p.var(
					JsArray.push,
					new CoreFunction<Integer>(JsArray.push.toString()) {
						@SuppressWarnings("unchecked")
						@Override
						protected Integer function(Object jsthis, Call<Integer> callee) {
							return ((ArrayLike<Object>)like(jsthis)).push(
									callee.arguments.var()
							);
						}
					}
			);
			p.var(
					JsArray.reverse,
					new CoreFunction<Void>(JsArray.reverse.toString()) {
						@Override
						protected Void function(Object jsthis, Call<Void> callee) {
							((ArrayLike<?>)like(jsthis)).reverse();
							return (Void)null;
						}
					}
			);
			p.var(
					JsArray.shift,
					new CoreFunction<Object>(JsArray.shift.toString()) {
						@Override
						protected Object function(Object jsthis, Call<Object> callee) {
							return ((ArrayLike<?>)like(jsthis)).shift();
						}
					}
			);
			p.var(
					JsArray.slice,
					new CoreFunction<JsArray>(JsArray.slice.toString()) {
						@Override
						protected JsArray function(Object jsthis, Call<JsArray> callee) {
							return JsGlobal.Array.with().create(
									((ArrayLike<?>)like(jsthis)).slice(
											callee.arguments.var()
									)
							);
						}
					}
			);
			p.var(
					JsArray.sort,
					new CoreFunction<Object>(JsArray.sort.toString()) {
						@SuppressWarnings("unchecked")
						@Override
						protected Object function(Object jsthis, Call<Object> callee) {
							return callee.arguments.length() < 1 ?
									((ArrayLike<?>)like(jsthis)).sort() :
									((ArrayLike<?>)like(jsthis)).sort(
											(JsFunction<? extends Number>)like(
													callee.arguments.get(0)
											)
									);
						}
					}
			);
			p.var(
					JsArray.splice,
					new CoreFunction<JsArray>(JsArray.splice.toString()) {
						@Override
						protected JsArray function(Object jsthis, Call<JsArray> callee) {
							return JsGlobal.Array.with().create(
									((ArrayLike<?>)like(jsthis)).splice(
											callee.arguments.var()
									)
							);
						}
					}
			);
			p.var(
					JsArray.unshift,
					new CoreFunction<Integer>(JsArray.unshift.toString()) {
						@Override
						protected Integer function(Object jsthis, Call<Integer> callee) {
							return ((ArrayLike<?>)like(jsthis)).unshift(
									callee.arguments.var()
							);
						}
					}
			);
			p.var(
					JsArray.toString,
					new CoreFunction<String>(JsArray.toString.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							return Js.toString(like(jsthis));
						}
					}
			);
			p.var(
					JsObject.valueOf,
					new CoreFunction<JsArray>(JsArray.valueOf.toString()) {
						@Override
						protected JsArray function(Object jsthis, Call<JsArray> callee) {
							return JsGlobal.Array.with().create((ArrayLike<?>)like(jsthis));
						}
					}
			);
		}
		return singleton;
	}
}
