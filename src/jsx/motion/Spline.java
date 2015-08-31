
/*
 *  JScripter Standard 1.0 - To Script In Java
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

package jsx.motion;

import js.ArrayLike;
import js.Vars;
import jsx.core.ArrayLikes;

/**
 * <p>Defines motions by approximating sample data with a cubic spline interpolation.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Spline extends Interpolator
{
	private final ArrayLike<Double> d = new Vars<Double>().var();

	/**
	 * <p>The typical constructor to construct a motion of this type.</p>
	 * @param values An array of sample data to be held by this object.
	 * @since 1.0
	 */
	public Spline(ArrayLike<Number> values) {
		super(values);
		int n = ArrayLikes.length(values) - 1;
		for (int i = 0; i < n; i++) {
			d.set(i, values.get(i + 1).doubleValue() - values.get(i).doubleValue());
		}
	}

	/**
	 * <p>Gets the datum of a float number for the specified step.</p>
	 * @param i The step number. It must be within the number of steps previously initialized 
	 * with the method {@link Motion#init(int)}.
	 * @return The float datum for the <tt>i</tt>th step.
	 * @since 1.0
	 */
	@Override
	public final double get(int i) {
		int n = ArrayLikes.length(values) - 1;
		double x = ((double)n * i) / steps(this);
		int j = x >= n ? n - 1 : x < 0 ? 0 : (int)x;
		x = x - j;
		double d0 = d.get(j);
		double d1 = d0;
		if (j > 0) {
			d1 = (d1 + d.get(j - 1)) / 2;
		}
		double d2 = d0;
		if (j < n - 1) {
			d2 = (d2 + d.get(j + 1)) / 2;
		}
		d2 = d2 + d1;
		double y = (d2 - 2 * d0) * x;
		y = (y + 3 * d0 - d1 - d2) * x;
		return (y + d1) * x + values.get(j).doubleValue();
	}
}
