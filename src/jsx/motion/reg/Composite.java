
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

import jsx.motion.Regular;

/**
 * <p>An abstract class to define a composite regular function.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public abstract class Composite extends Regular
{
	private final Regular composite;

	/**
	 * <p>Constructs a regular function of this type with the composite regular function 
	 * predefined for an argument.</p>
	 * <p>Interestingly, the actual composite function is defined and passed as an 
	 * argument of this constructor.</p>
	 * @param composite An actually expected composite function normally defined with a 
	 * anonymous class extending the base abstract class {@link Regular}.
	 * @since 1.0
	 */
	protected Composite(Regular composite) {
		this.composite = composite;
	}

	/**
	 * <p>Computes and returns the value, depending on a specified variable, of the 
	 * regular function defined by this class.</p>
	 * <p>Interestingly, this method is modified as <tt>final</tt> and simply passes the 
	 * invocation to the regular function that has been passed to the typical constructor 
	 * of this class as argument when the current object is created.</p>
	 * @param x The independent variable.
	 * @return The value, depending on <tt>x</tt>, of the defined regular function.
	 * @since 1.0
	 */
	@Override
	protected final double function(double x) {
		return call(composite, x);
	}
}
