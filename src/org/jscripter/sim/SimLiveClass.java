
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

final class SimLiveClass implements LiveClass
{
	private final Class<?> cls;

	public SimLiveClass(Class<?> cls) {
		this.cls = cls;
	}
	public SimLiveClass(String cls) throws ClassNotFoundException {
		this(Class.forName(cls));
	}

	//@Override
	public final Object call(String met) {
		try {
			return cls.getMethod(met, (Class<?>[])null).invoke(null, (Object[])null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	//@Override
	public final Object call(String met, String atype, Object arg) {
		try {
			return cls.getMethod(met, new Class<?>[]{Class.forName(atype)}).invoke(null, new Object[]{Js.valueOf(arg)});
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	//@Override
	public final Object call(String met, Vars<String> atypes, Vars<?> args) {
		try {
			return cls.getMethod(met, Simul.aTypes(atypes)).invoke(null, Simul.args(args));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	//@Override
	public final LiveObject create() {
		try {
			return Js.connect(cls.newInstance());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	//@Override
	public final LiveObject create(String atype, Object arg) {
		try {
			return Js.connect(cls.getConstructor(new Class<?>[]{Class.forName(atype)}).newInstance(new Object[]{Js.valueOf(arg)}));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	//@Override
	public final LiveObject create(Vars<String> atypes, Vars<?> args) {
		try {
			return Js.connect(cls.getConstructor(Simul.aTypes(atypes)).newInstance(Simul.args(args)));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	//@Override
	public final Object get(String fld) {
		try {
			return cls.getField(fld).get(null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	//@Override
	public final void run(String met) {
		try {
			cls.getMethod(met, (Class<?>[])null).invoke(null, (Object[])null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	//@Override
	public final void run(String met, String atype, Object arg) {
		try {
			cls.getMethod(met, new Class<?>[]{Class.forName(atype)}).invoke(null, new Object[]{Js.valueOf(arg)});
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	//@Override
	public final void run(String met, Vars<String> atypes, Vars<?> args) {
		try {
			cls.getMethod(met, Simul.aTypes(atypes)).invoke(null, Simul.args(args));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	//@Override
	public final Object set(String fld, Object val) {
		try {
			cls.getField(fld).set(null, val);
			return val;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	//@Override
	public final String toString() {
		return cls.toString();
	}

	//@Override
	public final Class<?> valueOf() {
		return cls;
	}
}
