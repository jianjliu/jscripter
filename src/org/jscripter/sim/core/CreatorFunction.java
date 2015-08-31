
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
import js.Vars;
import js.core.JsFunction;
import js.core.JsGlobal;
import js.core.JsObject;

final class CreatorFunction extends CoreFunction<JsFunction<?>>
{
	private CreatorFunction() {
		super(JsGlobal.Function.toString());
	}

	@Override
	protected JsFunction<?> function(java.lang.Object jsthis, Call<JsFunction<?>> callee) {
		return new Function<Void>() {
			@Override
			protected Void function(java.lang.Object jsthis, Call<Void> callee) {
				return null;
			}
		}.var();
	}

	@Override
	public final JsObject create(Object arg) {
		throw new UnsupportedOperationException();
	}

	@Override
	public final JsObject create(Vars<?> args) {
		throw new UnsupportedOperationException();
	}

	private static CreatorFunction singleton;

	public final static synchronized CreatorFunction get() {
		if (singleton == null) {
			singleton = new CreatorFunction();
		}
		return singleton;
	}
}
