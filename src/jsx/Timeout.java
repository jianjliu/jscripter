
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
 * <p>Represents tasks that may be set to run after a specified amount of time.</p>
 * <p>A task of this class, as a runnable task, can be run by either its function version 
 * returned from its {@link Task#getFunction()} method or a call to its {@link Interval#run()} 
 * method. Besides, it can also get its function run after a specified amount of time like 
 * what {@link Js#setTimeout(JsFunction, Number)} does, by a simple call to its {@link Timeout#set(Number)} 
 * method, or cancel the pending execution by a call to its {@link Timeout#clear()} method 
 * like what {@link Js#clearTimeout(Object)} does.</p>
 * <p>A subclass of this class must make sure that its function version, method {@link Timeout#run()} 
 * and pending function are all executing the same code.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see Js#setTimeout(JsFunction)
 * @see Js#setTimeout(JsFunction, Number)
 * @see Js#clearTimeout(Object)
 * @see Interval
 */
public class Timeout extends Task
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
	protected Timeout() {
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
	public Timeout(Runnable r) {
		funct = makeFunction(r);
	}

	/**
	 * <p>Simply runs the function version of this task.</p> 
	 * @since 1.0
	 * @see #Timeout()
	 */
	@Override
	public void run() {
		funct.invoke();
	}

	/**
	 * <p>Sets this task to run after the specified amount of time.</p>.
	 * @param delay The amount of time, in milliseconds, before the task should be executed.
	 * @since 1.0
	 * @see #set()
	 * @see #clear()
	 * @see #clear(Timeout)
	 */
	public final void set(Number delay) {
		clear();
		id = Global.setTimeout(getFunction(), delay);
	}

	/**
	 * <p>Sets this task to run after a minimum delay system allowed.</p>.
	 * @since 1.0
	 * @see #set(Number)
	 * @see #clear()
	 * @see #clear(Timeout)
	 */
	public final void set() {
		clear();
		id = Global.setTimeout(getFunction());
	}

	/**
	 * <p>Cancels the pending execution of this task.</p>
	 * @since 1.0
	 * @see #set(Number)
	 * @see #set()
	 * @see #clear(Timeout)
	 */
	public final void clear() {
		if (Js.be(id)) {
			Global.clearTimeout(id);
			id = 0;
		}
	}

	/**
	 * <p>Cancels the pending execution of the specified task but does nothing when 
	 * <tt>t<tt> is <tt>null</tt> or undefined.</p>
	 * @param t The pending task to cancel.
	 * @since 1.0
	 * @see #set(Number)
	 * @see #set()
	 * @see #clear()
	 */
	public static final void clear(Timeout t) {
		if (Js.be(t)) {
			t.clear();
		}
	}
}
