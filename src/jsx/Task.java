
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

package jsx;

import js.Disposable;
import js.Function;
import js.Js;
import js.core.JsFunction;

/**
 * <p>An abstract base class for runnable tasks.</p>
 * <p>As a runnable object, a runnable task can be run by a call to its {@link Task#run()} 
 * method. In addition, you can get its function version with a simple call to its 
 * {@link Task#getFunction()} method.</p>
 * <p>To make a task concretely runnable, a subclass of this one must decide to either 
 * override the {@link Task#run()} method, and in its constructor, with a call to the 
 * {@link Task#getFunction()} method, set the {@link Task#funct} field to a function running the 
 * {@link Task#run()} method , or set the {@link Task#funct} field directly in its constructor 
 * to an existed function and run the {@link Task#funct} function in the method overriding 
 * the {@link Task#run()} method of this class.</p>
 * <p>A subclass of this class must follow the above rule to make sure that its function 
 * version and method {@link Task#run()} are both running the same execution code.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see TaskManager
 */
public abstract class Task extends Disposable implements Runnable
{
	/**
	 * <p>The function version of this runnable task.</p>
	 * <p>If a subclass sets this field to a desired existing function in its constructor, 
	 * it must override the {@link Task#run()} method and run this function in that method. 
	 * On the contrary, if a subclass chooses to override the {@link Task#run()} method to 
	 * provide the task functionality, then it must, in its constructor, set this field to 
	 * a function returned by calling the {@link Task#getFunction()} method.</p>
	 * 
	 * @since 1.0
	 */
	protected JsFunction<Void> funct;

	/**
	 * <p>The default constructor.</p>
	 * <p>This constructor does not set the {@link Task#funct} field. A call to the {@link Task#getFunction()} 
	 * method will set it up anyway. A subclass, in its need, may choose to set the {@link Task#funct} 
	 * field in any of its constructors including the default one.</p>
	 * @since 1.0
	 */
	protected Task() {}

	/**
	 * <p>Runs the runnable task.</p>
	 * <p>If a subclass chooses to override this method to provide the task functionality, then 
	 * it must, in its constructor, set the {@link Task#funct} field to a function returned by 
	 * calling the {@link Task#getFunction()} method. On the contrary, if a subclass sets the {@link Task#getFunction()} 
	 * field to a desired existing function in its constructor, then it must override this 
	 * method and run that function in the overriding method.</p>
	 * @since 1.0
	 */
	public abstract void run();

	/**
	 * <p>Gets the function version of this runnable task.</p>
	 * <p>This method returns the function if it already exists. Otherwise, it creates one that 
	 * simply runs the {@link #run()} method.</p>
	 * @return The function for the current runnable task if it exists. Otherwise the method 
	 * creates one and returns it.
	 * @since 1.0
	 */
	public final JsFunction<Void> getFunction() {
		if (Js.not(funct)) {
			funct = makeFunction(this);
		}
		return funct;
	}

	/**
	 * <p>A utility to create a function from a runnable object.</p>
	 * <p>The function simply runs the {@link Runnable#run()} method of the runnable object 
	 * and returns nothing (<tt>null</tt> for undefined).</p>
	 * @param r A runnable object.
	 * @return The function for the runnable object.
	 * @since 1.0
	 */
	public static final JsFunction<Void> makeFunction(final Runnable r) {
		return new Function<Void>() {
			@Override
			protected Void function(Object jsthis, Call<Void> callee) {
				r.run();
				return null;
			}
		}.var();
	}
}
