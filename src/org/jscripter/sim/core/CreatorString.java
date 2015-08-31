
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
import js.StringLike;
import js.Vars;
import js.core.JsArray;
import js.core.JsFunction;
import js.core.JsGlobal;
import js.core.JsObject;
import js.core.JsString;

final class CreatorString extends CoreFunction<String>
{
	private CreatorString() {
		super(JsGlobal.String.toString());
	}

	@Override
	protected String function(Object jsthis, Call<String> callee) {
		if (callee.arguments.length() < 1) return "";
		return Js.toString(callee.arguments.get(0));
	}
	@Override
	public JsString create() {
		return (JsString)construct(new JscString(Core.get().stringLike(invoke())));
	}
	@Override
	public JsString create(Object arg) {
		return (JsString)construct(new JscString(Core.get().stringLike(invoke(arg))));
	}
	@Override
	public JsString create(Vars<?> args) {
		return (JsString)construct(new JscString(Core.get().stringLike(invoke(args))));
	}

	private static CreatorString singleton;

	public final static synchronized CreatorString get() {
		if (singleton == null) {
			singleton = new CreatorString();
			JsObject p = JsFunction.prototype.with(singleton.var());
			p.var(
					JsString.charAt,
					new CoreFunction<String>(JsString.charAt.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							if (!(jsthis instanceof StringLike)) {
								jsthis = Core.get().stringLike(Js.toString(jsthis));
							}
							return ((StringLike)like(jsthis)).charAt(
									callee.arguments.get(0)
							);
						}
					}
			);
			p.var(
					JsString.charCodeAt,
					new CoreFunction<Character>(JsString.charCodeAt.toString()) {
						@Override
						protected Character function(Object jsthis, Call<Character> callee) {
							if (!(jsthis instanceof StringLike)) {
								jsthis = Core.get().stringLike(Js.toString(jsthis));
							}
							return ((StringLike)like(jsthis)).charCodeAt(
									callee.arguments.get(0)
							);
						}
					}
			);
			p.var(
					JsString.concat,
					new CoreFunction<String>(JsString.concat.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							if (!(jsthis instanceof StringLike)) {
								jsthis = Core.get().stringLike(Js.toString(jsthis));
							}
							return ((StringLike)like(jsthis)).concat(callee.arguments.get(0));
						}
					}
			);
			p.var(
					JsString.indexOf,
					new CoreFunction<Integer>(JsString.indexOf.toString()) {
						@Override
						protected Integer function(Object jsthis, Call<Integer> callee) {
							if (!(jsthis instanceof StringLike)) {
								jsthis = Core.get().stringLike(Js.toString(jsthis));
							}
							return callee.arguments.length() < 2 ?
									((StringLike)like(jsthis)).indexOf(
											callee.arguments.get(0)
									) : ((StringLike)like(jsthis)).indexOf(
											callee.arguments.get(0),
											callee.arguments.get(1)
									);
						}
					}
			);
			p.var(
					JsString.lastIndexOf,
					new CoreFunction<Integer>(JsString.lastIndexOf.toString()) {
						@Override
						protected Integer function(Object jsthis, Call<Integer> callee) {
							if (!(jsthis instanceof StringLike)) {
								jsthis = Core.get().stringLike(Js.toString(jsthis));
							}
							return callee.arguments.length() < 2 ?
									((StringLike)like(jsthis)).lastIndexOf(
											callee.arguments.get(0)
									) : ((StringLike)like(jsthis)).lastIndexOf(
											callee.arguments.get(0),
											callee.arguments.get(1)
									);
						}
					}
			);
			p.var(
					JsString.localeCompare,
					new CoreFunction<Integer>(JsString.localeCompare.toString()) {
						@Override
						protected Integer function(Object jsthis, Call<Integer> callee) {
							if (!(jsthis instanceof StringLike)) {
								jsthis = Core.get().stringLike(Js.toString(jsthis));
							}
							return ((StringLike)like(jsthis)).localeCompare(
									callee.arguments.get(0)
							);
						}
					}
			);
			p.var(
					JsString.match,
					new CoreFunction<JsArray>(JsString.match.toString()) {
						@Override
						protected JsArray function(Object jsthis, Call<JsArray> callee) {
							if (!(jsthis instanceof StringLike)) {
								jsthis = Core.get().stringLike(Js.toString(jsthis));
							}
							return JsGlobal.Array.with().create(
									((StringLike)like(jsthis)).match(
											(RegExpLike)like(callee.arguments.get(0))
									)
							);
						}
					}
			);
			p.var(
					JsString.replace,
					new CoreFunction<String>(JsString.replace.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							if (!(jsthis instanceof StringLike)) {
								jsthis = Core.get().stringLike(Js.toString(jsthis));
							}
							return ((StringLike)like(jsthis)).replace(
									(RegExpLike)like(callee.arguments.get(0)),
									callee.arguments.get(1).toString()
							);
						}
					}
			);
			p.var(
					JsString.search,
					new CoreFunction<Integer>(JsString.search.toString()) {
						@Override
						protected Integer function(Object jsthis, Call<Integer> callee) {
							if (!(jsthis instanceof StringLike)) {
								jsthis = Core.get().stringLike(Js.toString(jsthis));
							}
							return ((StringLike)like(jsthis)).search(
									(RegExpLike)like(callee.arguments.get(0))
							);
						}
					}
			);
			p.var(
					JsString.slice,
					new CoreFunction<String>(JsString.slice.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							if (!(jsthis instanceof StringLike)) {
								jsthis = Core.get().stringLike(Js.toString(jsthis));
							}
							return callee.arguments.length() < 2 ?
									((StringLike)like(jsthis)).slice(
											callee.arguments.get(0)
									) : ((StringLike)like(jsthis)).slice(
											callee.arguments.get(0),
											callee.arguments.get(1)
									);
						}
					}
			);
			p.var(
					JsString.split,
					new CoreFunction<JsArray>(JsString.split.toString()) {
						@Override
						protected JsArray function(Object jsthis, Call<JsArray> callee) {
							if (!(jsthis instanceof StringLike)) {
								jsthis = Core.get().stringLike(Js.toString(jsthis));
							}
							return callee.arguments.length() < 2 ?
									JsGlobal.Array.with().create(
											((StringLike)like(jsthis)).split(
													callee.arguments.get(0)
											)
									) : JsGlobal.Array.with().create(
											((StringLike)like(jsthis)).split(
													callee.arguments.get(0),
													callee.arguments.get(1)
											)
									);
						}
					}
			);
			p.var(
					JsString.substr,
					new CoreFunction<String>(JsString.substr.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							if (!(jsthis instanceof StringLike)) {
								jsthis = Core.get().stringLike(Js.toString(jsthis));
							}
							return callee.arguments.length() < 2 ?
									((StringLike)like(jsthis)).substr(
											callee.arguments.get(0)
									) : ((StringLike)like(jsthis)).substr(
											callee.arguments.get(0),
											callee.arguments.get(1)
									);
						}
					}
			);
			p.var(
					JsString.substring,
					new CoreFunction<String>(JsString.substring.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							if (!(jsthis instanceof StringLike)) {
								jsthis = Core.get().stringLike(Js.toString(jsthis));
							}
							return ((StringLike)like(jsthis)).substring(
									callee.arguments.get(0),
									callee.arguments.get(1)
							);
						}
					}
			);
			p.var(
					JsString.toLowerCase,
					new CoreFunction<String>(JsString.toLowerCase.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							if (!(jsthis instanceof StringLike)) {
								jsthis = Core.get().stringLike(Js.toString(jsthis));
							}
							return ((StringLike)like(jsthis)).toLowerCase();
						}
					}
			);
			p.var(
					JsString.toUpperCase,
					new CoreFunction<String>(JsString.toUpperCase.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							if (!(jsthis instanceof StringLike)) {
								jsthis = Core.get().stringLike(Js.toString(jsthis));
							}
							return ((StringLike)like(jsthis)).toUpperCase();
						}
					}
			);
			p.var(
					JsString.toLocaleLowerCase,
					new CoreFunction<String>(JsString.toLocaleLowerCase.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							if (!(jsthis instanceof StringLike)) {
								jsthis = Core.get().stringLike(Js.toString(jsthis));
							}
							return ((StringLike)like(jsthis)).toLocaleLowerCase();
						}
					}
			);
			p.var(
					JsString.toLocaleUpperCase,
					new CoreFunction<String>(JsString.toLocaleUpperCase.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							if (!(jsthis instanceof StringLike)) {
								jsthis = Core.get().stringLike(Js.toString(jsthis));
							}
							return ((StringLike)like(jsthis)).toLocaleUpperCase();
						}
					}
			);
			p.var(
					JsString.toString,
					new CoreFunction<String>(JsString.toString.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							return Js.toString(like(jsthis));
						}
					}
			);
			p.var(
					JsString.valueOf,
					new CoreFunction<String>(JsString.valueOf.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							return ((StringLike)like(jsthis)).valueOf();
						}
					}
			);
		}
		return singleton;
	}
}
