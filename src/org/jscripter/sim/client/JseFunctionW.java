
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

final class JseFunctionW<T> extends JseFunction<T>
{
	private final Generic<T> rWrapper;

	public JseFunctionW(JseObject var, Generic<T> rWrapper) {
		super(var);
		this.rWrapper = rWrapper;
	}
	public JseFunctionW(JseObject var, JseFunctionW<T> other) {
		this(var, other.rWrapper);
	}

	@Override
	public final JseFunctionW<T> valueOf() {
		return new JseFunctionW<T>((JseObject)unwrap().valueOf(), rWrapper);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected final T cast(Object o) {
		return rWrapper != null ? rWrapper.wrap(o) : (T)o;
	}
}
