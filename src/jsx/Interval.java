
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

import js.Js;
import js.core.JsFunction;
import jsx.client.Global;

/**
 * <p>Represents tasks that may be run periodically when set intervals.</p>
 * <p>A task of this class, as a runnable task, can be run by either its function version 
 * returned from its {@link Task#getFunction()} method or a call to its {@link Interval#run()} 
 * method. Besides, it can also get its function run in an interval periodic like what {@link Js#setInterval(JsFunction, Number)} 
 * does with a simple call to its {@link Interval#set(Number)} method, or cancel the periodic 
 * execution with a call to its {@link Interval#clear()} method like what {@link Js#clearInterval(Object)} 
 * does.</p>
 * <p>A subclass of this class must make sure that its function version, method {@link Interval#run()} 
 * and function being periodically run are all executing the same code.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see Js#setInterval(JsFunction)
 * @see Js#setInterval(JsFunction, Number)
 * @see Js#clearInterval(Object)
 * @see Timeout
 */
public class Interval extends Task
{
	private Object id;

	/**
	 * <p>The default constructor.</p>
	 * <p>A subclass must override {@link #run()} to make the task runnable when its 
	 * constructor invokes this one, because this constructor sets the {@link Task#funct} 
	 * field to a function that invokes the {@link #run()} method.</p>
	 * @since 1.0
	 * @see #run()
	 */
	protected Interval() {
		funct = getFunction();
	}

	/**
	 * <p>Constructs from an existing runnable object.</p>
	 * <p>This constructor sets the {@link Task#funct} field of this task to the function 
	 * of the argument task. Note that, the {@link #run()} method has been designed to 
	 * simply invoke the {@link Task#funct} function. Override it with caution in a subclass 
	 * where this constructor is invoked.</p> 
	 * @since 1.0
	 * @see #run()
	 */
	public Interval(Runnable r) {
		funct = makeFunction(r);
	}

	/**
	 * <p>Checks if the current task is running periodically.</p>
	 * @return <tt>true</tt> if the current task has been set to run periodically; <tt>false</tt> otherwise.
	 * @since 1.0
	 */
	public final synchronized boolean isRunning() {
		return Js.be(id);
	}

	/**
	 * <p>Simply runs the function version of this task.</p> 
	 * @since 1.0
	 * @see #Interval()
	 */
	@Override
	public void run() {
		funct.invoke();
	};

	/**
	 * <p>Sets this interval task to run periodically.</p>.
	 * @param interval The interval, in milliseconds, between running of this task.
	 * @since 1.0
	 * @see #set()
	 * @see #clear()
	 * @see #clear(Interval)
	 */
	public final synchronized void set(Number interval) {
		clear();
		id = Global.setInterval(getFunction(), interval);
	}

	/**
	 * <p>Sets this task to run periodically in the minimum interval system allowed.</p>.
	 * @since 1.0
	 * @see #set(Number)
	 * @see #clear()
	 * @see #clear(Interval)
	 */
	public final synchronized void set() {
		clear();
		id = Global.setInterval(getFunction());
	}

	/**
	 * <p>Cancels the periodic execution of this task.</p>
	 * @since 1.0
	 * @see #set(Number)
	 * @see #set()
	 * @see #clear(Interval)
	 */
	public final synchronized void clear() {
		if (Js.be(id)) {
			Global.clearInterval(id);
			id = 0;
		}
	}

	/**
	 * <p>Cancels the periodic execution of the specified task but does nothing when 
	 * <tt>t<tt> is <tt>null</tt> or undefined.</p>
	 * @param t The interval task to stop.
	 * @since 1.0
	 * @see #set(Number)
	 * @see #set()
	 * @see #clear()
	 */
	public static final void clear(Interval t) {
		if (Js.be(t)) {
			t.clear();
		}
	}
}
