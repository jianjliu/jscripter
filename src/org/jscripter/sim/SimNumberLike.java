
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

import java.math.RoundingMode;
import java.text.DecimalFormat;

import js.NumberLike;

final class SimNumberLike<T extends Number> implements NumberLike<T>
{
	private final T n;

	public SimNumberLike(T n) {
		this.n = n;
	}

	private static final DecimalFormat getExponentialFormat(int digits) {
		DecimalFormat df = new DecimalFormat("0.0E0");
		df.setDecimalSeparatorAlwaysShown(false);
		df.setMaximumFractionDigits(digits);
		return df;
	}

	//@Override
	public final String toExponential() {
		return getExponentialFormat(0).format(valueOf());
	}

	//@Override
	public final String toExponential(Object digits) {
		return getExponentialFormat(SimUtil.getNumber(digits).intValue()).format(valueOf());
	}

	private static final DecimalFormat getFixedFormat(int digits) {
		DecimalFormat df = new DecimalFormat("0.0");
		df.setDecimalSeparatorAlwaysShown(false);
		df.setMaximumFractionDigits(digits);
		df.setRoundingMode(RoundingMode.DOWN);
		return df;
	}

	//@Override
	public final String toFixed() {
		return getFixedFormat(0).format(valueOf());
	}

	//@Override
	public final String toFixed(Object digits) {
		return getFixedFormat(SimUtil.getNumber(digits).intValue()).format(valueOf());
	}

	//@Override
	public final String toPrecision() {
		return valueOf().toString();
	}

	private static final DecimalFormat getPrecisionFormat(int digits) {
		DecimalFormat df = new DecimalFormat("0.0E0");
		df.setMinimumIntegerDigits(digits);
		df.setMaximumFractionDigits(0);
		df.setDecimalSeparatorAlwaysShown(false);
		return df;
	}

	//@Override
	public final String toPrecision(Object precision) {
		int p = SimUtil.getNumber(precision).intValue();
		Number v = valueOf();
		double d = Double.parseDouble(getPrecisionFormat(p).format(v));
		if (v instanceof Double || v instanceof Float) {
			return Double.toString(d);
		} else {
			return Long.toString((long)d);
		}
	}

	//@Override
	public final String toLocaleString() {
		return n.toString();
	}

	//@Override
	public final String toString() {
		return n.toString();
	}

	//@Override
	public final String toString(Object radix) {
		return n.toString();
	}

	//@Override
	public final String typeof() {
		return "number";
	}

	//@Override
	public final boolean undefined() {
		return false;
	}

	//@Override
	public final T valueOf() {
		return n;
	}
}
