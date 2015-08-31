
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

import js.Vars;
import jsx.core.ArrayLikes;

/**
 * <p>Defines motions with the specified speed motion.</p>
 * <p>A speed motion is a motion that provides speed data for other motions.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Speed extends Interpolator
{
	private final Motion m;

	/**
	 * <p>The typical constructor to construct a motion of this type.</p>
	 * @param m Specifies a motion that has speeds for the motion being created.
	 * @since 1.0
	 */
	public Speed(Motion m) {
		super(new Vars<Number>().var());
		this.m = m;
	}

	/**
	 * <p>Resets the motion object to provide data for a specified number of steps.</p>
	 * @param steps The total number of steps in which this motion object will provide 
	 * stepping data.
	 * @since 1.0
	 */
	@Override
	public final void init(int steps) {
		if (steps == ArrayLikes.length(values)) {
			return;
		}
		m.init(steps);
		ArrayLikes.splice(values, 0);
		double x = 0;
		for (int i = 0; i < steps; i++) {
			x = x + m.get(i);
			values.set(i, x);
		}
		normalize(values);
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
		return values.get(i).doubleValue();
	}
}
