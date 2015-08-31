
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
import jsx.core.Maths;

/**
 * <p>An abstract base class to define motions by approximating sample data with 
 * various interpolation methodologies.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public abstract class Interpolator extends Motion
{
	/**
	 * <p>An array of sample data held by this object.</p>
	 * @since 1.0
	 */
	protected final ArrayLike<Number> values;

	/**
	 * <p>The typical constructor to construct a motion of this type.</p>
	 * @param values An array of sample data to be held by this object.
	 * @since 1.0
	 */
	protected Interpolator(ArrayLike<Number> values) {
		this.values = values;
		normalize(this.values);
	}

	/**
	 * <p>Normalize an array of sample data to be held by an approximation motion.</p>
	 * <p>A series of sample data is said to be normalized if and only if they are all 
	 * between -1 and 1. This method simply divides each of the sample data by their 
	 * absolute maximum value.</p>
	 * @param values An array of sample data to be normalized and held by an approximation 
	 * motion.
	 * @since 1.0
	 */
	protected static final void normalize(ArrayLike<Number> values) {
		double max = max(values);
		if (max > 0) {
			for (int i = 0, len = ArrayLikes.length(values); i < len; i++) {
				values.set(i, values.get(i).doubleValue() / max);
			}
		}
	}

	private static final double max(ArrayLike<Number> values) {
		double max = 0;
		for (int i = 0, len = ArrayLikes.length(values); i < len; i++) {
			double abs = Maths.abs(values.get(i));
			max = Maths.max(max, abs).doubleValue();
		}
		return max;
	}
}
