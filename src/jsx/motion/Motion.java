
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

import js.Disposable;

/**
 * <p>An abstract base class for motion definitions.</p>
 * <p>A motion object provides stepping data after a total number of steps is initialized.</p> 
 * <p>An object of this abstract class comes more specifically from several quite different 
 * sources. Subclasses of the abstract {@link Regular} class are used to define a motion 
 * object based on a basic and regular mathematical function or a combination of the regular 
 * functions; Subclasses of the abstract {@link Interpolator} class defines a motion on a 
 * series of sample data provided manually, with a certain interpolation method; The {@link Speed} 
 * class defines a motion by treating an existing motion as speeds.</p>
 * <p>The motion model is intuitive and conceptual. Its uses are not limited in animation 
 * or visual effects. For example, using it in drawing curves of mathematics function could 
 * be very handy.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see jsx.ui.fx.Effects
 */
public abstract class Motion extends Disposable
{
	private int steps;

	/**
	 * <p>The default constructor doing nothing but being invoked from a subclass.</p>
	 * @since 1.0
	 */
	protected Motion() {}

	/**
	 * <p>Gets the datum of a float number for the specified step.</p>
	 * @param i The step number. It must be within the number of steps previously initialized 
	 * with the method {@link #init(int)}.
	 * @return The float datum for the <tt>i</tt>th step.
	 * @since 1.0
	 */
	public abstract double get(int i);

	/**
	 * <p>Resets the motion object to provide data for a specified number of steps.</p>
	 * @param steps The total number of steps in which this motion object will provide 
	 * stepping data.
	 * @since 1.0
	 */
	public void init(int steps) {
		this.steps = steps;
	}

	/**
	 * <p>Gets the total number of steps in which the specified motion object is providing 
	 * stepping data.</p>
	 * @param m The current motion object. 
	 * @return The total number of steps in which this motion object is providing data.
	 * @since 1.0
	 */
	protected static final int steps(Motion m) {
		return m.steps;
	}
}
