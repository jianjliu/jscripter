
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


/**
 * <p>Defines motions with various regular mathematical functions.</p>
 * <p>A regular function is a unitary mathematical function whose domain is between 0 and 1 
 * inclusive, and value range is from -1 to 1. A regular function can be a combination of 
 * other regular functions.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public abstract class Regular extends Motion
{
	/**
	 * <p>The default constructor doing nothing but being invoked from a subclass and 
	 * invoking the default constructor of the superclass.</p>
	 * @since 1.0
	 */
	protected Regular() {}

	/**
	 * <p>Gets the datum of a float number for the specified step.</p>
	 * @param i The step number. It must be within the number of steps previously initialized 
	 * with the method {@link Motion#init(int)}.
	 * @return The float datum for the <tt>i</tt>th step.
	 * @since 1.0
	 */
	@Override
	public final double get(int i) {
		return call(this, ((double)i) / steps(this));
	}

	/**
	 * <p>Computes and returns the value, depending on a specified variable, of a 
	 * specified regular function.</p>
	 * <p>This method simply calls {@link #function(double)} on the specified regular 
	 * function and returns the result. This static method exists only for the {@link #function(double)} 
	 * body of a defined regular function to be callable in any subclasses of this one 
	 * regardless of its visibility.</p>
	 * @param r The regular function.
	 * @param x The independent variable.
	 * @return The value, depending on the variable <tt>x</tt>, of the regular function 
	 * <tt>r</tt>.
	 * @since 1.0
	 */
	protected static final double call(Regular r, double x) {
		return r.function(x);
	}

	/**
	 * <p>Computes and returns the value, depending on a specified variable, of the 
	 * regular function defined by this class.</p>
	 * @param x The independent variable.
	 * @return The value, depending on <tt>x</tt>, of the defined regular function.
	 * @since 1.0
	 */
	protected abstract double function(double x);
}
