
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
import js.Id;
import js.Initializer;
import js.Js;
import js.ObjectLike;
import js.JsApplet;
import js.Static;
import js.Var;
import js.Vars;
import jsx.Configurable;
import jsx.core.ArrayLikes;
import jsx.core.ObjectLikes;
import jsx.core.Variables;

/**
 * <p>An abstract base class for event sources that fire high level events.</p>
 * <p>This class provides a simple but efficient high level event model. An event is an 
 * object of the {@link Source.Event} class. An event source is an object of the {@link Source} 
 * class. An event can be executed immediately from an event source with a call to the 
 * {@link Source#exec(Event)} method. It can also be raised from a source for general 
 * dispatching with a call to the {@link Source#fire(Event)} method, or for a specific 
 * dispatcher with a call to the {@link Source#fire(Event, TaskManager)} method. An event 
 * dispatcher is actually a task manager of the {@link TaskManager} class. A fired event 
 * is, after converted to an event task, submitted to the task manager for scheduling to 
 * get handled by the listeners registered with the type of the events.</p>
 * <p>An event listener together with the type of events it handles must be registered with 
 * an event source object for an event task manager to dispatch events of the type to the 
 * listener for handling when the source object fires the events of that type. With one 
 * event type, an arbitrary number of listeners can be registered. The listeners registered 
 * to an event source with the same event type handle a dispatched event in the order 
 * registration.</p>
 * <p>Note that, event sources are {@link Configurable}.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public abstract class Source extends Configurable
{
	/**
	 * <p>A typical constructor forcing constructors of subclasses to pass initializing data.
	 * <p>This constructor simply invokes the typical constructor of the superclass passing a 
	 * copy of the specified initializing object, or if the argument one is undefined, a newly 
	 * created {@link ObjectLike} object as the argument.</p>
	 * @param ini The initializing object that can also be created with an object literal. 
	 * @since 1.0
	 */
	protected Source(ObjectLike ini) {
		super(Js.be(ini) ? Js.apply(
				new Initializer().var(),
				ini
		) : new Initializer().var());
	}

	private final ObjectLike eventListeners = Js.object();

	/**
	 * <p>Gets all listeners of the specified event type and registered with the specified 
	 * event source.</p>
	 * @param src The event source to get listeners from.
	 * @param et The event type to get listeners of.
	 * @return An array of the event listeners of the type and registered with the source.
	 * @since 1.0
	 */
	@SuppressWarnings("unchecked")
	public static final <T> ArrayLike<T> getListeners(Source src, Class<? extends Event<T>> et) {
		String type = et.getName();
		ObjectLike eventListeners = src.eventListeners;
		synchronized(eventListeners) {
			ArrayLike<T> typed = (ArrayLike<T>)eventListeners.var(type);
			return Js.be(typed) ? ArrayLikes.slice(typed, 0) : new Vars<T>().var();
		}
	}

	/**
	 * <p>Registers an event listener, together with the event type it is allowed to handle, 
	 * to this event source.</p>
	 * <p>Note that, this method is not declared final so that subclasses can override it 
	 * to provide more flexible wrapping support.</p>
	 * @param et The event type this source allows the listener to handle.
	 * @param on The event listener this source allows to handle the type of event.
	 * @since 1.0
	 */
	public final <T> void addListener(Class<? extends Event<T>> et, T on) {
		if (Js.be(on)) {
			String type = et.getName();
			synchronized(eventListeners) {
				ArrayLike<?> listeners = (ArrayLike<?>)eventListeners.var(type);
				if (Variables.undefined(listeners)) {
					listeners = new Vars<Object>().var();
					eventListeners.var(type, listeners);
				}
				if (ArrayLikes.indexOf(listeners, on) == -1) {
					ArrayLikes.push((ArrayLike<?>)eventListeners.var(type), on);
				}
			}
		}
	}

	private static final void remove(ObjectLike eventListeners, String type, Object on) {
		ArrayLike<?> listeners = (ArrayLike<?>)eventListeners.var(type);
		if (Js.be(listeners)) {
			ArrayLikes.remove(listeners, on);
			if (Js.not(ArrayLikes.length(listeners))) {
				ObjectLikes.delete(eventListeners, type);
			}
		}
	}

	/**
	 * <p>Unregisters an event listener for all event types.</p>
	 * @param on The event listener this source allows to handle events.
	 * @since 1.0
	 */
	public final void removeListener(Object on) {
		if (Js.be(on)) {
			synchronized(eventListeners) {
				ArrayLike<String> types = Js.keys(eventListeners);
				for (int i = 0, len = ArrayLikes.length(types); i < len; i++) {
					String type = types.get(i);
					remove(eventListeners, type, on);
				}
			}
		}
	}

	/**
	 * <p>Unregisters an event listener, together with the event type it is allowed to 
	 * handle, from this event source.</p>
	 * <p>Note that, this method is not declared final so that subclasses can override it 
	 * to provide more flexible wrapping support.</p>
	 * @param et The event type this source allows the listener to handle.
	 * @param on The event listener this source allows to handle the type of event.
	 * @since 1.0
	 */
	public final <T> void removeListener(Class<? extends Event<T>> et, T on) {
		if (Js.be(on)) {
			String type = et.getName();
			synchronized(eventListeners) {
				remove(eventListeners, type, on);
			}
		}
	}

	/**
	 * <p>Stops firing a certain type of events from this event source.</p>
	 * <p>Note that, this method is not declared final so that subclasses can override it 
	 * to provide more flexible wrapping support.</p>
	 * @param et The type of events this source fires, which is to be disabled.
	 * @since 1.0
	 */
	public final <T> void removeListeners(Class<? extends Event<T>> et) {
		synchronized(eventListeners) {
			ObjectLikes.delete(eventListeners, et.getName());
		}
	}

	/**
	 * <p>Returns the wrapped source object if this one is a wrapper source.</p>
	 * <p>The high level event model supports the wrapping technology widely used in this 
	 * library. The wrapped object of an event source must also be an event source. The 
	 * event queuing and dispatching mechanism in this class tries to dispatch an event 
	 * fired from an event source also to its wrapped source by calling this method, if 
	 * this source does wrap another valid source.</p>
	 * <p>A concrete method overriding this one in a subclass may return <tt>null</tt> for 
	 * it does not wrap, the wrapped source object if it wraps one, or the current instance 
	 * itself if it is a wrapped source but does not wrap others.</p>
	 * @return The wrapped source object.
	 * @since 1.0
	 */
	protected abstract Source unwrap();
	/**
	 * <p>Returns the parent source object graphically containing the current one.</p>
	 * <p>The wrapped object of an event source must also be an event source. The event 
	 * queuing and dispatching mechanism of this class tries to dispatch an event fired 
	 * from an event source also to its containing source by calling this method, if this 
	 * source is graphically contained by another valid source and the event wants to 
	 * bubble, that is, its {@link Event#BUBBLE} configurable property is <tt>true</tt>.</p>
	 * <p>A concrete method overriding this one in a subclass may return <tt>null</tt> when 
	 * it is neither graphical nor contained, or the parent source object if it has one.</p>
	 * @return The source object graphically containing this source object.
	 * @since 1.0
	 */
	protected abstract Source getParent();

	private static final <T> int execute(Event<T> evt) {
		Source src = ini(evt).var(Event.SOURCE);
		int found = 0;
		do {
			found += execute(src, evt);
			Source e = src.unwrap();
			if (Js.be(e) && Js.neq(src, e)) {
				found += execute(e, evt);
			}
			src = src.getParent();
		} while (Js.be(ini(evt).var(Event.BUBBLE)) && Js.be(src));
		return found;
	}

	@SuppressWarnings("unchecked")
	private static final <T> int execute(Source src, Event<T> evt) {
		ArrayLike<?> listeners = getListeners(
				src,
				(Class<? extends Event<T>>)evt.getClass()
		);
		int len = ArrayLikes.length(listeners);
		for (int i = 0; i < len; i++) {
			evt.execute((T)listeners.get(i));
		}
		return len;
	}

	private static boolean setSource(Event<?> evt, Source src) {
		Source s = ini(evt).var(Event.SOURCE);
		if (Js.eq(src, s)) {
			return true;
		} else if (Js.not(s)) {
			ini(evt).var(Event.SOURCE, src);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * <p>Executes an event from the current source object immediately if the source 
	 * object fires that type of events.</p>
	 * <p>An event becomes fired when it is successfully executed with this method.</p>
	 * <p>The method does nothing if the event has been fired, or the event source does not 
	 * fire that type of events, that is, the source does not have any listeners registered 
	 * to it for the type of the event.</p>
	 * <p>Note that, the caller of this method will not return until the event task has been 
	 * finished running, and  in JS Simulation mode the event is run in the same thread as 
	 * the caller of this method does.</p>
	 * @param evt The event to execute.
	 * @return The count of listeners which are executed successfully from the event 
	 * source. The method returns <tt>0</tt> if the event has been fired, or if the 
	 * event source does not fire that type of events, that is, the source does not have 
	 * any listeners registered to it with the type of the event.
	 * @since 1.0
	 */
	public final <T> int exec(Event<T> evt) {
		if (setSource(evt, this)) {
			return execute(evt);
		}
		return 0;
	}

	private final static Var<TaskManager> DISPATCHER = new Static<TaskManager>(
			new Var<TaskManager>() {
				@Override
				public TaskManager var() {
					return new TaskManager();
				}
			}
	);

	/**
	 * <p>Raises the specified event from the current event source, to be queued for 
	 * general event dispatching.</p>
	 * <p>The method does nothing if the event has been fired, or the event source does not 
	 * fire that type of events, that is, the source does not have any listeners registered 
	 * to it for the type of the event.</p>
	 * <p>An event dispatcher is actually a task manager. The fired event is, after 
	 * converted to an event task, submitted to the task manager for dispatching.</p>
	 * <p>The general event dispatcher processes events globally in default. Submitting 
	 * events to the general event dispatcher makes sure all events are dispatched in the 
	 * sequence that they are fired. Unless you know exactly what would be happening, use 
	 * {@link #fire(Event)} instead of {@link #fire(Event, TaskManager)}.</p>
	 * <p>Note that, the caller of this method will return immediately after raising the 
	 * event without having to wait for the event task to run, and in JS Simulation mode 
	 * the event can be run in a different thread than the caller of this method does.</p>
	 * @param evt The event being fired from this source.
	 * @since 1.0
	 * @see #fire(Event, TaskManager)
	 * @see #exec(Event)
	 */
	public final <T> void fire(Event<T> evt) {
		fire(evt, DISPATCHER.var());
	}

	/**
	 * <p>Raises the specified event from the current event source, to be queued for 
	 * specific event dispatching.</p>
	 * <p>The method does nothing if the event has been fired or the event source does not 
	 * fire that type of events, that is, the source does not have any listeners registered 
	 * with the type of the event.</p>
	 * <p>An event dispatcher is actually a task manager. The fired event is, after 
	 * converted to an event task, submitted to the task manager for dispatching.</p>
	 * <p>The general event dispatcher processes events globally in default. Submitting 
	 * events to the general event dispatcher makes sure all events are dispatched in the 
	 * sequence that they are fired. Unless you know exactly what would be happening, use 
	 * {@link #fire(Event)} instead of {@link #fire(Event, TaskManager)}.</p>
	 * <p>Note that, the caller of this method will return immediately after raising the 
	 * event without having to wait for the event task to run, and in JS Simulation mode 
	 * the event can be run in a different thread as the caller of this method does.</p>
	 * @param evt The event being fired from this source.
	 * @param dispatcher The event dispatcher to dispatch the fired event. 
	 * @since 1.0
	 * @see #fire(Event)
	 * @see #exec(Event)
	 */
	public final <T> void fire(Event<T> evt, TaskManager dispatcher) {
		if (setSource(evt, this)) {
			evt = update(evt, dispatcher);
			dispatcher.submit(
					new EventTask<T>(evt)
			);
		}
	}

	private final static <T> Event<T> update(Event<T> evt, TaskManager dispatcher) {
		if (Js.be(ini(evt).var(Event.UPDATE))) {
			EventTask<?> et = (EventTask<?>)dispatcher.pop();
			if (Js.be(et)) {
				Event<T> e = et.event.update(evt);
				if (Js.be(e)) {
					evt = e;
				} else {
					dispatcher.submit(et);
				}
			}
		}
		return evt;
	}

	private static final class EventTask<T> extends Task
	{
		private final Event<T> event;

		private EventTask(Event<T> event) {
			this.event = event;
		}

		@Override
		public void run() {
			synchronized(JsApplet.class) {
				execute(event);
			}
		}
	}

	/**
	 * <p>An abstract base class for high level events.</p>
	 * <p>This class is designed generic with the type parameter being the type of its 
	 * corresponding listener type. A subclass must be concrete and final if it is to be an 
	 * event type. As an event type, the subclass must also declare the type parameter of 
	 * this class as the type of its own listener.</p>
	 * <p>An event listener is typically of an interface with a declared method to react on 
	 * the event it handles so that the class of the event can implement the {@link Event#execute(Object)} 
	 * method by simply calling that declared method passing the event itself as the argument. 
	 * A subclass of this class defines events uniquely typed by the subclass itself and 
	 * designates a listener type corresponding to that type of events.</p>
	 * <p>For an event source to fire an event, the listener of the event must have been 
	 * registered onto the source object with a call to the {@link Source#addListener(Class, Object)} 
	 * method which asks both the type of the event and the listener object for arguments.</p>
	 * <p>Note that, high level events are {@link Configurable}.</p>
	 * 
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 */
	public static abstract class Event<T> extends Configurable
	{
		/**
		 * <p>A typical constructor forcing constructors of subclasses to pass 
		 * initializing data.</p>
		 * <p>Note that, this constructor does not change the configurable properties 
		 * {@link Event#BUBBLE} and {@link Event#UPDATE} of this event object.</p>
		 * @since 1.0
		 */
		protected Event(ObjectLike ini) {
			super(ini);
		}

		/**
		 * <p>A default constructor creating the initializing object by itself.</p>
		 * <p>Note that, this constructor creates an initializing object for this 
		 * configurable object but does not change the configurable properties 
		 * {@link Event#BUBBLE} and {@link Event#UPDATE} of this event object.</p>
		 * @since 1.0
		 */
		protected Event() {
			this(new Initializer().var());
		}

		/**
		 * <p>A global identifier for a configurable property of an {@link Event} object.</p>
		 * <p>The identified configurable property of an {@link Event} object 
		 * refers to a boolean value specifying whether the event bubbles while being 
		 * dispatched.</p>
		 * <p>Note that, an event does not bubble unless specified otherwise.</p>
		 * @since 1.0
		 */
		public final static Id<Boolean> BUBBLE = new Id<Boolean>();
		/**
		 * <p>A global identifier for a configurable property of an {@link Event} object.</p>
		 * <p>The identified configurable property of an {@link Event} object 
		 * refers to a boolean value specifying whether the event updates, while being 
		 * dispatched, the one previously fired if it is still pending.</p>
		 * <p>Note that, an event does not update unless specified otherwise.</p>
		 * @since 1.0
		 */
		public final static Id<Boolean> UPDATE = new Id<Boolean>();

		/**
		 * <p>A global identifier for a configurable property of an {@link Event} object.</p>
		 * <p>The identified configurable property of an {@link Event} object 
		 * is a reference to the source object of the event.</p>
		 * <p>The property is undefined before the event is fired on a source. Fire a 
		 * fired event is meaningless.</p>
		 * @since 1.0
		 * @see Source#exec(Event)
		 * @see Source#fire(Event)
		 * @see Source#fire(Event, TaskManager)
		 */
		protected final static Id<Source> SOURCE = new Id<Source>();

		/**
		 * <p>Gets the source object of an event.</p>
		 * <p>This method simply returns the configurable property {@link #SOURCE} of the 
		 * specified event.</p>
		 * @param evt The event to get source.
		 * @return The source of the specified event. This method returns <tt>null</tt> 
		 * if the event has not been fired. Firing a fired event is meaningless.
		 * @since 1.0
		 * @see Source#exec(Event)
		 * @see Source#fire(Event)
		 * @see Source#fire(Event, TaskManager)
		 */
		public static final Source source(Event<?> evt) {
			return ini(evt).var(SOURCE);
		}

		/**
		 * <p>Determines how to update a pending event with this one.</p>
		 * <p>This method simply returns this event if the argument event has the same 
		 * event type and event source; Otherwise, it returns <tt>null</tt>. Subclasses 
		 * may override this method to provide different criteria.</p>
		 * @param evt The event to update.
		 * @return The updated event. This method returns <tt>null</tt> if the update 
		 * criteria does not meet.
		 * @since 1.0
		 * @see Source#exec(Event)
		 * @see Source#fire(Event)
		 * @see Source#fire(Event, TaskManager)
		 */
		protected <S> Event<S> update(Event<S> evt) {
			return evt.getClass() == getClass() &&
				source(this) == source(evt) ? evt : null;
		}

		/**
		 * <p>Dispatches this event to the specified event listener to handle, by invoking the 
		 * handler method of the listener interface passing the event itself as the argument.</p>
		 * <p>Concrete subclasses must implement this method making the listener handle 
		 * this event.</p>
		 * @param on The event listener.
		 * @since 1.0
		 */
		protected abstract void execute(T on);
	}
}
