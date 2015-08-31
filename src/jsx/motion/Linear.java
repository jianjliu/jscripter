
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
import jsx.core.ArrayLikes;

/**
 * <p>Defines motions by approximating sample data with the simplest linear interpolation.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Linear extends Interpolator
{
	/**
	 * <p>The typical constructor to construct a motion of this type.</p>
	 * @param values An array of sample data to be held by this object.
	 * @since 1.0
	 */
	public Linear(ArrayLike<Number> values) {
		super(values);
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
		double y = values.get(j).doubleValue();
		return y + (values.get(j + 1).doubleValue() - y) * (x - j);
	}
}
