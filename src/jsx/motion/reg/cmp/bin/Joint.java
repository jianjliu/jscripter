
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

package jsx.motion.reg.cmp.bin;

import jsx.motion.Regular;
import jsx.motion.reg.cmp.Binary;
import jsx.motion.reg.cmp.Mirror;
import jsx.motion.reg.cmp.Zoom;

/**
 * <p>Defines a composite regular function by joining two existing regular functions with 
 * the 1st one in charge of the 1st half of the domain and the 2nd one, the 2nd half.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Joint extends Binary
{
	/**
	 * <p>A typical constructor to construct a composite regular function of this type.</p>
	 * @param r1 The 1st regular function for constructing the composite one.
	 * @param r2 The 2nd regular function for constructing the composite one.
	 * @since 1.0
	 */
	public Joint(Regular r1, Regular r2) {
		super(new Zoom(r1, 0.5), new Mirror(new Zoom(r2, 0.5)));
	}
}
