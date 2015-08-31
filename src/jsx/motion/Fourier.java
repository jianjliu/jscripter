
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
import jsx.core.Maths;

/**
 * <p>Defines motions by approximating sample data with a Fourier interpolation.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Fourier extends Interpolator
{
	private final static double PI2 = Maths.PI * 2;
	private final ArrayLike<Double> a = new Vars<Double>().var();
	private final ArrayLike<Double> b = new Vars<Double>().var();
	private int n, m;

	/**
	 * <p>The typical constructor to construct a motion of this type.</p>
	 * @param values An array of sample data to be held by this object.
	 * @since 1.0
	 */
	public Fourier(ArrayLike<Number> values) {
		super(values);
		n = (ArrayLikes.length(values) - 1) / 2;
		m = 2 * n + 1;
		double t = PI2 / m;
		for (int j = 0; j <= n; j++) {
			a.set(j, (double)0);
			b.set(j, (double)0);
			for (int k = 0; k < m; k++) {
				double jtk = j * t * k;
				double vk = values.get(k).doubleValue();
				a.set(j, a.get(j) + vk * Maths.cos(jtk));
				b.set(j, b.get(j) + vk * Maths.sin(jtk));
			}
			a.set(j, a.get(j) * 2 / m);
			b.set(j, b.get(j) * 2 / m);
		}
	}

	/**
	 * <p>Gets the datum of a float number for the specified step.</p>
	 * @param i The step number. It must be within the number of steps previously initialized 
	 * with the method {@link #init(int)}.
	 * @return The float datum for the <tt>i</tt>th step.
	 * @since 1.0
	 */
	@Override
	public final double get(int i) {
		double t = PI2 / steps(this) * i;
		double p = a.get(0) / 2;
		for (int j = 1; j <= n; j++) {
			double jt = j * t;
			p = p + a.get(j) * Maths.cos(jt)
			      + b.get(j) * Maths.sin(jt);
		}
		return p;
	}

	/**
	 * <p>Resets the motion object to provide data for a specified number of steps.</p>
	 * @param steps The total number of steps in which this motion object will provide 
	 * stepping data.
	 * @since 1.0
	 */
	@Override
	public final void init(int steps) {
		super.init(steps * (m + 1) / m);
	}
}
