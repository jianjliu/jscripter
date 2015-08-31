
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
 * <p>Defines a mirror function of the specified existing regular function.</p>
 * <p>The domain and value range of a mirror function mirror that of another regular 
 * function respectively.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Mirror extends Composite
{
	/**
	 * <p>Constructs a composite regular function by mirroring the domain and value range 
	 * of the argument regular function.</p>
	 * @param m A regular function to construct the mirror function from.
	 * @since 1.0
	 */
	public Mirror(final Regular m) {
		super(new Regular() {
			@Override
			protected double function(double x) {
				return 1 - call(m, 1 - x);
			}
		});
	}
}
