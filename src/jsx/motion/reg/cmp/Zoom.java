
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

package jsx.motion.reg.cmp;

import jsx.motion.Regular;
import jsx.motion.reg.Composite;

/**
 * <p>Defines a composite regular function with an existing regular function scaled.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Zoom extends Composite
{
	/**
	 * <p>A typical constructor to construct a composite regular function of this type.</p>
	 * @param r The regular function for constructing the composite one.
	 * @param scale The scale.
	 * @since 1.0
	 */
	public Zoom(final Regular r, final double scale) {
		super(new Regular() {
			@Override
			protected double function(double x) {
				return call(r, x / scale) * scale;
			}
		});
	}
}
