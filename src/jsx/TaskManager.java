
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

import js.ArrayLike;
import js.Disposable;
import js.Js;
import js.Vars;
import jsx.core.ArrayLikes;

/**
 * <p>Facilitates multitasking features by queuing the submitted {@link Runnable} tasks 
 * and running them in the submitted order.</p>
 * <p>An instance of this class keeps a FIFO queue of {@link Runnable} objects. The task 
 * manager keeps popping a task from the head of the queue and runs it in the same thread. 
 * It falls into sleep when the queue becomes empty, taking up no CPU time and wakes up again 
 * when a new task is submitted. A call to the method {@link TaskManager#submit(Runnable)} 
 * on the task manager pushes the argument task to the tail of the queue in the calling thread.</p>
 * <p>This class provides a simple but efficient mechanism for multitasking needs, which is 
 * used by the {@link Source} class to implement a high level event model. Note that, the 
 * re-compiled JavaScript code is to be run in a single thread. However, in JS Simulation 
 * mode, the scenario is quite different: the tasks submitted to the same task manager are 
 * being run in the single thread, but the tasks submitted to different task managers are 
 * being run in different threads. This is because this class creates an {@link Interval} 
 * object for its periodic executions. {@link Interval} calls the {@link jsx.client.Global#setInterval(js.core.JsFunction, Number)} 
 * method which calls the {@link js.Js#setInterval(js.core.JsFunction, Number)} method which 
 * is simulating JavaScript in Java multi-thread environment and creates a new thread whenever 
 * called. The whole thing is designed deliberately for the efficiency for JS Simulation.</p>
 * <p>Note that, this class is <tt>final</tt> and not extensible.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see Source
 */
public final class TaskManager extends Disposable
{
	private Number interval;
	private ArrayLike<Runnable> queue = new Vars<Runnable>().var();
	private int start = 0;
	private final Interval timer;

	/**
	 * <p>The default constructor.</p>
	 * @see #TaskManager(Number)
	 * @since 1.0
	 */
	public TaskManager() {
		timer = new Interval() {
			@Override
			public void run() {
				Runnable r = poll();
				if (Js.be(r)) {
					r.run();
				}
			}
		};
	}

	/**
	 * <p>The typical constructor.</p>
	 * @param interval The interval in milliseconds to run the submitted tasks.
	 * @see #TaskManager()
	 * @since 1.0
	 */
	public TaskManager(Number interval) {
		this();
		this.interval = interval;
	}

	/**
	 * <p>Checks if the task manager is idle.</p>
	 * @return <tt>true</tt> if the task manager is idle; <tt>false</tt> otherwise.
	 * @since 1.0
	 */
	public final synchronized boolean idle() {
		return !timer.isRunning();
	}

	/**
	 * <p>Returns the number of the pending tasks for this task manager to run.</p>
	 * @return The size of the pending tasks to run.
	 * @since 1.0
	 */
	public final synchronized int size() {
		return ArrayLikes.length(queue) - start;
	}

	/**
	 * <p>Polls the first pending task.</p>
	 * <p>If there is no pending tasks, this method returns <tt>null</tt>. If there is no 
	 * pending tasks left after popping the last one, this method put the task manager 
	 * into sleep before it returns the last task.</p>
	 * @return The first pending task.
	 * @since 1.0
	 */
	public final synchronized Runnable poll() {
		if (size() > 0) {
			return queue.get(start++);
		} else {
			if (start > 0) {
				queue = new Vars<Runnable>().var();
				start = 0;
			}
			timer.clear();
		}
		return null;
	}

	/**
	 * <p>Peeks the last pending task.</p>
	 * <p>If there is no pending tasks, this method returns <tt>null</tt>.</p>
	 * @return The last pending task.
	 * @since 1.0
	 */
	public final synchronized Runnable peek() {
		return size() > 0 ? queue.get(ArrayLikes.length(queue) - 1) : null;
	}

	/**
	 * <p>Pops the last pending task.</p>
	 * <p>If there is no pending tasks, this method returns <tt>null</tt>.</p>
	 * @return The last pending task.
	 * @since 1.0
	 */
	public final synchronized Runnable pop() {
		return size() > 0 ? ArrayLikes.pop(queue) : null;
	}

	/**
	 * <p>Submits a task to this task manager.</p>
	 * <p>If the task manager is sleeping, this method wakes it up after pushing the specified 
	 * task in the end of its task queue.</p>
	 * @since 1.0
	 */
	public final synchronized void submit(Runnable r) {
		ArrayLikes.push(queue, r);
		if (idle()) {
			if (Js.be(interval)) {
				timer.set(interval);
			} else {
				timer.set();
			}
		}
	}
}
