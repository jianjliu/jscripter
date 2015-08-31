
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

package org.jscripter.sim.client;

import netscape.javascript.JSObject;

import js.Vars;
import js.core.*;

final class JseNumber extends JsNumber implements Unwrappable<JseObject>, Live
{
	public JseNumber(JseObject var) {
		super((Object)var);
	}

	@Override
	public final Number valueOf() {
		return (Number)unwrap().valueOf();
	}
	@Override
	public final JseNumber var() {
		return this;
	}
	public final JseObject unwrap() {
		return (JseObject)var;
	}
	public final JSObject getJSObject() {
		return unwrap().getJSObject();
	}

	@Override
	public final String toString() {
		return var == null ? "undefined" : unwrap().toString();
	}

	@Override
	public final boolean undefined() {
		return var == null || unwrap().undefined();
	}

	@Override
	public final boolean delete() {
		if (undefined()) return false;
		return unwrap().delete();
	}

	@Override
	public final boolean delete(Mid mid) {
		return undefined() ? false : unwrap().delete(mid);
	}

	public final boolean in(Object o) {
		return true;
	}

	@Override
	public final Object var(Mid mid) {
		return unwrap().var(mid);
	}
	@Override
	public final <S> S var(Mid mid, S v) {
		return unwrap().var(mid, v);
	}

	@Override
	protected final <T> T call(JsFunction.Member<T> member) {
		return unwrap().call(member);
	}
	@Override
	protected final <T> T call(JsFunction.Member<T> member, Object arg) {
		return unwrap().call(member, arg);
	}
	@Override
	protected final <T> T call(JsFunction.Member<T> member, Vars<?> args) {
		return unwrap().call(member, args);
	}
}
