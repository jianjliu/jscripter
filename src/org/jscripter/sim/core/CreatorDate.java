
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

import js.DateLike;
import js.Js;
import js.Vars;
import js.core.JsDate;
import js.core.JsFunction;
import js.core.JsGlobal;
import js.core.JsObject;

final class CreatorDate extends CoreFunction<JsDate>
{
	private CreatorDate() {
		super(JsGlobal.Date.toString());
	}

	@Override
	protected JsDate function(Object jsthis, Call<JsDate> callee) {
		Object arg0 = callee.arguments.get(0);
		return arg0 instanceof JsDate ? (JsDate)arg0 :
			(JsDate)construct(new JscDate(
					arg0 instanceof Number ? Js.date((Number)arg0) :
					arg0 instanceof String ? Js.date((String)arg0) :
					Js.date()
			));
	}
	@Override
	protected final JsDate construct(Object o) {
		JsDate ret = (JsDate)o;
		JsObject.constructor.with(ret, var());
		JsFunction.prototype.with(ret, JsFunction.prototype.with(var()));
		return ret;
	}
	@Override
	public final JsDate create() {
		return invoke();
	}
	@Override
	public final JsDate create(Object arg) {
		return invoke(arg);
	}
	@Override
	public final JsDate create(Vars<?> args) {
		return invoke(args);
	}

	private static CreatorDate singleton;

	public final static synchronized CreatorDate get() {
		if (singleton == null) {
			singleton = new CreatorDate();
			JsObject p = JsFunction.prototype.with(singleton.var());
			p.var(
					JsDate.getTime,
					new CoreFunction<Number>(JsDate.getTime.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).getTime();
						}
					}
			);
			p.var(
					JsDate.getFullYear,
					new CoreFunction<Number>(JsDate.getFullYear.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).getFullYear();
						}
					}
			);
			p.var(
					JsDate.getUTCFullYear,
					new CoreFunction<Number>(JsDate.getUTCFullYear.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).getUTCFullYear();
						}
					}
			);
			p.var(
					JsDate.getMonth,
					new CoreFunction<Number>(JsDate.getMonth.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).getMonth();
						}
					}
			);
			p.var(
					JsDate.getUTCMonth,
					new CoreFunction<Number>(JsDate.getUTCMonth.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).getUTCMonth();
						}
					}
			);
			p.var(
					JsDate.getDate,
					new CoreFunction<Number>(JsDate.getDate.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).getDate();
						}
					}
			);
			p.var(
					JsDate.getUTCDate,
					new CoreFunction<Number>(JsDate.getUTCDate.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).getUTCDate();
						}
					}
			);
			p.var(
					JsDate.getDay,
					new CoreFunction<Number>(JsDate.getDay.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).getDay();
						}
					}
			);
			p.var(
					JsDate.getUTCDay,
					new CoreFunction<Number>(JsDate.getUTCDay.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).getUTCDay();
						}
					}
			);
			p.var(
					JsDate.getHours,
					new CoreFunction<Number>(JsDate.getHours.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).getHours();
						}
					}
			);
			p.var(
					JsDate.getUTCHours,
					new CoreFunction<Number>(JsDate.getUTCHours.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).getUTCHours();
						}
					}
			);
			p.var(
					JsDate.getMinutes,
					new CoreFunction<Number>(JsDate.getMinutes.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).getMinutes();
						}
					}
			);
			p.var(
					JsDate.getUTCMinutes,
					new CoreFunction<Number>(JsDate.getUTCMinutes.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).getUTCMinutes();
						}
					}
			);
			p.var(
					JsDate.getSeconds,
					new CoreFunction<Number>(JsDate.getSeconds.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).getSeconds();
						}
					}
			);
			p.var(
					JsDate.getUTCSeconds,
					new CoreFunction<Number>(JsDate.getUTCSeconds.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).getUTCSeconds();
						}
					}
			);
			p.var(
					JsDate.getMilliseconds,
					new CoreFunction<Number>(JsDate.getMilliseconds.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).getMilliseconds();
						}
					}
			);
			p.var(
					JsDate.getUTCMilliseconds,
					new CoreFunction<Number>(JsDate.getUTCMilliseconds.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).getUTCMilliseconds();
						}
					}
			);
			p.var(
					JsDate.getTimezoneOffset,
					new CoreFunction<Number>(JsDate.getTimezoneOffset.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).getTimezoneOffset();
						}
					}
			);
			p.var(
					JsDate.setTime,
					new CoreFunction<Number>(JsDate.setTime.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).setTime(
									callee.arguments.get(0)
							);
						}
					}
			);
			p.var(
					JsDate.setMilliseconds,
					new CoreFunction<Number>(JsDate.setMilliseconds.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).setMilliseconds(
									callee.arguments.get(0)
							);
						}
					}
			);
			p.var(
					JsDate.setUTCMilliseconds,
					new CoreFunction<Number>(JsDate.setUTCMilliseconds.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).setUTCMilliseconds(
									callee.arguments.get(0)
							);
						}
					}
			);
			p.var(
					JsDate.setSeconds,
					new CoreFunction<Number>(JsDate.setSeconds.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return callee.arguments.length() < 2 ?
									((DateLike)like(jsthis)).setSeconds(
											callee.arguments.get(0)
									) : ((DateLike)like(jsthis)).setSeconds(
											callee.arguments.get(0),
											callee.arguments.get(1)
									);
						}
					}
			);
			p.var(
					JsDate.setUTCSeconds,
					new CoreFunction<Number>(JsDate.setUTCSeconds.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return callee.arguments.length() < 2 ?
									((DateLike)like(jsthis)).setUTCSeconds(
											callee.arguments.get(0)
									) : ((DateLike)like(jsthis)).setUTCSeconds(
											callee.arguments.get(0),
											callee.arguments.get(1)
									);
						}
					}
			);
			p.var(
					JsDate.setMinutes,
					new CoreFunction<Number>(JsDate.setMinutes.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return callee.arguments.length() < 2 ? ((DateLike)like(jsthis)).setMinutes(
											callee.arguments.get(0)
									) : callee.arguments.length() < 3 ? ((DateLike)like(jsthis)).setMinutes(
											callee.arguments.get(0),
											callee.arguments.get(1)
									) : ((DateLike)like(jsthis)).setMinutes(
											callee.arguments.get(0),
											callee.arguments.get(1),
											callee.arguments.get(2)
									);
						}
					}
			);
			p.var(
					JsDate.setUTCMinutes,
					new CoreFunction<Number>(JsDate.setUTCMinutes.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return callee.arguments.length() < 2 ? ((DateLike)like(jsthis)).setUTCMinutes(
											callee.arguments.get(0)
									) : callee.arguments.length() < 3 ? ((DateLike)like(jsthis)).setUTCMinutes(
											callee.arguments.get(0),
											callee.arguments.get(1)
									) : ((DateLike)like(jsthis)).setUTCMinutes(
											callee.arguments.get(0),
											callee.arguments.get(1),
											callee.arguments.get(2)
									);
						}
					}
			);
			p.var(
					JsDate.setHours,
					new CoreFunction<Number>(JsDate.setHours.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return callee.arguments.length() < 2 ? ((DateLike)like(jsthis)).setHours(
											callee.arguments.get(0)
									) : callee.arguments.length() < 3 ? ((DateLike)like(jsthis)).setHours(
											callee.arguments.get(0),
											callee.arguments.get(1)
									) : callee.arguments.length() < 4 ? ((DateLike)like(jsthis)).setHours(
											callee.arguments.get(0),
											callee.arguments.get(1),
											callee.arguments.get(2)
									) : ((DateLike)like(jsthis)).setHours(
											callee.arguments.get(0),
											callee.arguments.get(1),
											callee.arguments.get(2),
											callee.arguments.get(3)
									);
						}
					}
			);
			p.var(
					JsDate.setUTCHours,
					new CoreFunction<Number>(JsDate.setUTCHours.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return callee.arguments.length() < 2 ? ((DateLike)like(jsthis)).setUTCHours(
											callee.arguments.get(0)
									) : callee.arguments.length() < 3 ? ((DateLike)like(jsthis)).setUTCHours(
											callee.arguments.get(0),
											callee.arguments.get(1)
									) : callee.arguments.length() < 4 ? ((DateLike)like(jsthis)).setUTCHours(
											callee.arguments.get(0),
											callee.arguments.get(1),
											callee.arguments.get(2)
									) : ((DateLike)like(jsthis)).setUTCHours(
											callee.arguments.get(0),
											callee.arguments.get(1),
											callee.arguments.get(2),
											callee.arguments.get(3)
									);
						}
					}
			);
			p.var(
					JsDate.setDate,
					new CoreFunction<Number>(JsDate.setDate.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).setDate(
									callee.arguments.get(0)
							);
						}
					}
			);
			p.var(
					JsDate.setUTCDate,
					new CoreFunction<Number>(JsDate.setUTCDate.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).setUTCDate(
									callee.arguments.get(0)
							);
						}
					}
			);
			p.var(
					JsDate.setMonth,
					new CoreFunction<Number>(JsDate.setMonth.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return callee.arguments.length() < 2 ?
									((DateLike)like(jsthis)).setMonth(
											callee.arguments.get(0)
									) : ((DateLike)like(jsthis)).setMonth(
											callee.arguments.get(0),
											callee.arguments.get(1)
									);
						}
					}
			);
			p.var(
					JsDate.setUTCMonth,
					new CoreFunction<Number>(JsDate.setUTCMonth.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return callee.arguments.length() < 2 ?
									((DateLike)like(jsthis)).setUTCMonth(
											callee.arguments.get(0)
									) : ((DateLike)like(jsthis)).setUTCMonth(
											callee.arguments.get(0),
											callee.arguments.get(1)
									);
						}
					}
			);
			p.var(
					JsDate.setFullYear,
					new CoreFunction<Number>(JsDate.setFullYear.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return callee.arguments.length() < 2 ? ((DateLike)like(jsthis)).setFullYear(
											callee.arguments.get(0)
									) : callee.arguments.length() < 3 ? ((DateLike)like(jsthis)).setFullYear(
											callee.arguments.get(0),
											callee.arguments.get(1)
									) : ((DateLike)like(jsthis)).setFullYear(
											callee.arguments.get(0),
											callee.arguments.get(1),
											callee.arguments.get(2)
									);
						}
					}
			);
			p.var(
					JsDate.setUTCFullYear,
					new CoreFunction<Number>(JsDate.setUTCFullYear.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return callee.arguments.length() < 2 ? ((DateLike)like(jsthis)).setUTCFullYear(
											callee.arguments.get(0)
									) : callee.arguments.length() < 3 ? ((DateLike)like(jsthis)).setUTCFullYear(
											callee.arguments.get(0),
											callee.arguments.get(1)
									) : ((DateLike)like(jsthis)).setUTCFullYear(
											callee.arguments.get(0),
											callee.arguments.get(1),
											callee.arguments.get(2)
									);
						}
					}
			);
			p.var(
					JsDate.toDateString,
					new CoreFunction<String>(JsDate.toDateString.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							return ((DateLike)like(jsthis)).toDateString();
						}
					}
			);
			p.var(
					JsDate.toTimeString,
					new CoreFunction<String>(JsDate.toTimeString.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							return ((DateLike)like(jsthis)).toTimeString();
						}
					}
			);
			p.var(
					JsDate.toLocaleDateString,
					new CoreFunction<String>(JsDate.toLocaleDateString.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							return ((DateLike)like(jsthis)).toLocaleDateString();
						}
					}
			);
			p.var(
					JsDate.toLocaleTimeString,
					new CoreFunction<String>(JsDate.toLocaleTimeString.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							return ((DateLike)like(jsthis)).toLocaleTimeString();
						}
					}
			);
			p.var(
					JsDate.toUTCString,
					new CoreFunction<String>(JsDate.toUTCString.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							return ((DateLike)like(jsthis)).toUTCString();
						}
					}
			);
			p.var(
					JsDate.toString,
					new CoreFunction<String>(JsDate.toString.toString()) {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							return Js.toString(like(jsthis));
						}
					}
			);
			p.var(
					JsDate.valueOf,
					new CoreFunction<Number>(JsDate.valueOf.toString()) {
						@Override
						protected Number function(Object jsthis, Call<Number> callee) {
							return ((DateLike)like(jsthis)).valueOf();
						}
					}
			);
		}
		return singleton;
	}
}
