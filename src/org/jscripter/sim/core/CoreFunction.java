
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
import js.Var;

abstract class CoreFunction<T> extends Function<T>
{
	protected final String name;

	public CoreFunction(String name) {
		super();
		this.name = name;
	}

	@Override
	public final String toString() {
		return "function " + name + "() {\r\n    [native code]\r\n}";
	}

	public final static Object like(Object o) {
		return o instanceof Like<?> ? ((Like<?>)o).like() :
		       o instanceof Var <?> ? ((Like<?>)((Var<?>)o).var()).like() : o;
	}
}
