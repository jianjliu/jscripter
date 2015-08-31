
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

import js.ArrayLike;
import js.MathLike;
import js.Vars;

final class SimMathLike implements MathLike
{
	private SimMathLike() {}

	private static SimMathLike singleton;

	public static final synchronized SimMathLike get() {
		if (singleton == null) {
			singleton = new SimMathLike();
		}
		return singleton;
	}

	//@Override
	public final double abs(Object x) {
		return Math.abs(SimUtil.getNumber(x).doubleValue());
	}

	//@Override
	public final double acos(Object x) {
		return Math.acos(SimUtil.getNumber(x).doubleValue());
	}

	//@Override
	public final double asin(Object x) {
		return Math.asin(SimUtil.getNumber(x).doubleValue());
	}

	//@Override
	public final double atan(Object x) {
		return Math.atan(SimUtil.getNumber(x).doubleValue());
	}

	//@Override
	public final double atan2(Object y, Object x) {
		return Math.atan2(
				SimUtil.getNumber(y).doubleValue(),
				SimUtil.getNumber(x).doubleValue()
		);
	}

	//@Override
	public final double ceil(Object x) {
		return Math.ceil(SimUtil.getNumber(x).doubleValue());
	}

	//@Override
	public final double cos(Object x) {
		return Math.cos(SimUtil.getNumber(x).doubleValue());
	}

	//@Override
	public final double exp(Object x) {
		return Math.exp(SimUtil.getNumber(x).doubleValue());
	}

	//@Override
	public final double floor(Object x) {
		return Math.floor(SimUtil.getNumber(x).doubleValue());
	}

	//@Override
	public final double log(Object x) {
		return Math.log(SimUtil.getNumber(x).doubleValue());
	}

	//@Override
	public final Number max(Vars<?> args) {
		Number n = null;
		ArrayLike<?> a = args.var();
		for (int i = 0, len = a.length(); i < len; i++) {
			if (n == null) {
				n = SimUtil.getNumber(a.get(i));
			} else {
				Number m = SimUtil.getNumber(a.get(i));
				if (m.doubleValue() > n.doubleValue()) {
					n = m;
				}
			}
		}
		return n;
	}

	//@Override
	public final Number max(Object x, Object y) {
		Number m = SimUtil.getNumber(x);
		Number n = SimUtil.getNumber(y);
		return m.doubleValue() < n.doubleValue() ? n : m;
	}

	//@Override
	public final Number min(Vars<?> args) {
		Number n = null;
		ArrayLike<?> a = args.var();
		for (int i = 0, len = a.length(); i < len; i++) {
			if (n == null) {
				n = SimUtil.getNumber(a.get(i));
			} else {
				Number m = SimUtil.getNumber(a.get(i));
				if (m.doubleValue() < n.doubleValue()) {
					n = m;
				}
			}
		}
		return n;
	}

	//@Override
	public final Number min(Object x, Object y) {
		Number m = SimUtil.getNumber(x);
		Number n = SimUtil.getNumber(y);
		return m.doubleValue() > n.doubleValue() ? n : m;
	}

	//@Override
	public final double pow(Object x, Object y) {
		return Math.pow(SimUtil.getNumber(x).doubleValue(), SimUtil.getNumber(y).doubleValue());
	}

	//@Override
	public final double random() {
		return Math.random();
	}

	//@Override
	public final double round(Object x) {
		return Math.round(SimUtil.getNumber(x).doubleValue());
	}

	//@Override
	public final double sin(Object x) {
		return Math.sin(SimUtil.getNumber(x).doubleValue());
	}

	//@Override
	public final double sinh(Object x) {
		return Math.sinh(SimUtil.getNumber(x).doubleValue());
	}

	//@Override
	public final double sqrt(Object x) {
		return Math.sqrt(SimUtil.getNumber(x).doubleValue());
	}

	//@Override
	public final double tan(Object x) {
		return Math.tan(SimUtil.getNumber(x).doubleValue());
	}

	//@Override
	public final double tanh(Object x) {
		return Math.tanh(SimUtil.getNumber(x).doubleValue());
	}

	//@Override
	public final String toString() {
		return "[object Object]";
	}
}
