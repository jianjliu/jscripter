
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

package org.jscripter.sim;

import js.LiveClass;
import js.LiveObject;
import js.Js;
import js.Vars;

final class SimLiveObject implements LiveObject
{
	private final Object obj;
	private final LiveClass cls;

	public SimLiveObject(Object obj) {
		this.obj = Js.valueOf(obj);
		cls = new SimLiveClass(this.obj.getClass());
	}

	//@Override
	public final Object call(String met) {
		try {
			return obj.getClass().getMethod(met, (Class<?>[])null).invoke(obj, (Object[])null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	//@Override
	public final Object call(String met, String atype, Object arg) {
		try {
			return obj.getClass().getMethod(met, new Class<?>[]{Class.forName(atype)}).invoke(obj, new Object[]{Js.valueOf(arg)});
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	//@Override
	public final Object call(String met, Vars<String> atypes, Vars<?> args) {
		try {
			return obj.getClass().getMethod(met, Simul.aTypes(atypes)).invoke(obj, Simul.args(args));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	//@Override
	public final Object get(String fld) {
		try {
			return obj.getClass().getField(fld).get(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	//@Override
	public final LiveClass getJavaClass() {
		return cls;
	}

	//@Override
	public final void run(String met) {
		try {
			obj.getClass().getMethod(met, (Class<?>[])null).invoke(obj, (Object[])null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	//@Override
	public final void run(String met, String atype, Object arg) {
		try {
			obj.getClass().getMethod(met, new Class<?>[]{Class.forName(atype)}).invoke(obj, new Object[]{Js.valueOf(arg)});
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	//@Override
	public final void run(String met, Vars<String> atypes, Vars<?> args) {
		try {
			obj.getClass().getMethod(met, Simul.aTypes(atypes)).invoke(obj, Simul.args(args));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	//@Override
	public final Object set(String fld, Object val) {
		try {
			obj.getClass().getField(fld).set(obj, val);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return val;
	}

	//@Override
	public final String toString() {
		return obj.toString();
	}

	//@Override
	public final Object valueOf() {
		return obj;
	}
}
