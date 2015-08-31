
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

package jsx.motion.reg;

import jsx.core.Maths;
import jsx.motion.Regular;

/**
 * <p>Defines quintic regular functions.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Quint extends Regular
{
	/**
	 * <p>Computes and returns the value, depending on a specified variable, of the 
	 * regular function defined by this class.</p>
	 * @param x The independent variable.
	 * @return The value, depending on <tt>x</tt>, of the defined regular function.
	 * @since 1.0
	 */
	@Override
	protected final double function(double x) {
		return Maths.pow(x, 5);
	}
}
