
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

package jsx.event;

import js.ArrayLike;
import js.Disposable;
import js.Id;
import js.Js;
import js.ObjectLike;
import js.Static;
import js.Value;
import js.Var;
import js.Vars;
import js.core.JsFunction;
import js.core.JsObject;
import js.dom.EventTarget;
import jsx.Code;
import jsx.client.Browser;
import jsx.core.ArrayLikes;

/**
 * <p>A class of browser event handles that handle browser events and their listening functions,
 * eliminating browser dependencies.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Handle extends Disposable
{
	private final EventTarget et;
	private final String eventtype;
	private final JsFunction<?> listener;
	private final boolean useCapture;
	private boolean attached;

	/**
	 * <p>Constructs a browser-level event handle.</p>
	 * @param et The browser event target.
	 * @param eventtype The browser event type.
	 * @param listener A browser event listening function.
	 * @param useCapture Specifies whether the <tt>listener</tt> is to be invoked only during 
	 * the capturing phase of event propagation.
	 * @see EventTarget#addEventListener(String, JsFunction, Boolean)
	 * @see EventTarget#attachEvent(String, JsFunction)
	 * @see EventTarget#removeEventListener(String, JsFunction, Boolean)
	 * @see EventTarget#detachEvent(String, JsFunction)
	 * @since 1.0
	 */
	public Handle(EventTarget et, String eventtype, JsFunction<?> listener, boolean useCapture) {
		this.et = et;
		this.eventtype = Browser.isIE ?
				new Value.String("on").add(eventtype).var() : eventtype;
		this.listener = listener;
		this.useCapture = useCapture;
		this.attached = false;
	}

	/**
	 * <p>Adds the browser event listener to the set of event handlers for the event target.</p>
	 * @see EventTarget#addEventListener(String, JsFunction, Boolean)
	 * @see EventTarget#attachEvent(String, JsFunction)
	 * @see #attach(Handle)
	 * @since 1.0
	 */
	public final void attach() {
		if (attached) return;
		attached = true;
		if (Browser.isIE) {
			et.attachEvent(
					eventtype, listener
			);
		} else {
			et.addEventListener(
					eventtype, listener, useCapture
			);
		}
	}

	/**
	 * <p>Attaches a handle if it exists.</p>
	 * @param h The handle to manipulate.
	 * @see #attach()
	 * @see EventTarget#addEventListener(String, JsFunction, Boolean)
	 * @see EventTarget#attachEvent(String, JsFunction)
	 * @since 1.0
	 */
	public static final void attach(Handle h) {
		if (Js.be(h)) {
			h.attach();
		}
	}

	/**
	 * <p>Detaches a handle if it exists.</p>
	 * @param h The handle to manipulate.
	 * @see #detach()
	 * @see #detach(ObjectLike, ArrayLike)
	 * @see EventTarget#removeEventListener(String, JsFunction, Boolean)
	 * @see EventTarget#detachEvent(String, JsFunction)
	 * @since 1.0
	 */
	public static final void detach(Handle h) {
		if (Js.be(h)) {
			h.detach();
		}
	}

	/**
	 * <p>Detaches handles in bulk.</p>
	 * @param ini An object that keeps the handles.
	 * @param hids The ids of the handles.
	 * @see #detach()
	 * @see #detach(Handle)
	 * @see EventTarget#removeEventListener(String, JsFunction, Boolean)
	 * @see EventTarget#detachEvent(String, JsFunction)
	 * @since 1.0
	 */
	public static final void detach(ObjectLike ini, ArrayLike<Id<Handle>> hids) {
		for (int i = 0, len = ArrayLikes.length(hids); i < len; i++) {
			detach(ini.var(hids.get(i)));
		}
	}

	/**
	 * <p>Removes the browser event listener from the set of event handlers for the event target.</p>
	 * @see EventTarget#removeEventListener(String, JsFunction, Boolean)
	 * @see EventTarget#detachEvent(String, JsFunction)
	 * @see #detach(Handle)
	 * @see #detach(ObjectLike, ArrayLike)
	 * @since 1.0
	 */
	public final void detach() {
		if (!attached) return;
		attached = false;
		if (Browser.isIE) {
			et.detachEvent(
					eventtype, listener
			);
		} else {
			et.removeEventListener(
					eventtype, listener, useCapture
			);
		}
	}

	/**
	 * <p>A global JavaScript function that creates browser event handlers.</p>
	 * <p>This function returns an event handler function that handles browser events more 
	 * efficiently, especially in JS Simulation mode, if invoked with the first argument 
	 * being the browser event object to handle and the second argument being a function that 
	 * performs an action.</p>
	 * @since 1.0
	 */
	public final static Var<JsFunction<JsObject>> HANDLER = new Static<JsFunction<JsObject>>(
			new Var<JsFunction<JsObject>>() {
				@Override
				public JsFunction<JsObject> var() {
					return Js.function(
							new Vars<String>().add("e").add("f"),
							Code.ret(
									Code.function(
											Code.call("f", "e")
									)
							)
					);
				}
			}
	);

	/**
	 * <p>An IE specific global JavaScript function that creates browser event handlers.</p>
	 * <p>This function returns an event handler function that handles browser events more 
	 * efficiently, especially in JS Simulation mode, if invoked with the argument being a 
	 * function that performs an action with {@link js.user.JsWindow#event} as its argument.</p>
	 * @since 1.0
	 */
	public final static Var<JsFunction<JsObject>> IE = new Static<JsFunction<JsObject>>(
			new Var<JsFunction<JsObject>>() {
				@Override
				public JsFunction<JsObject> var() {
					return Js.function(
							"f",
							Code.ret(
									Code.function(
											Code.invoke("f", "event")
									)
							)
					);
				}
			}
	);

	/**
	 * <p>A global JavaScript function that creates browser event handlers that 
	 * simply return <tt>false</tt> without doing anything else.</p>
	 * <p>This function returns an event handler function that handles browser events more 
	 * efficiently, especially in JS Simulation mode, if invoked with the argument 
	 * being a browser event object.</p>
	 * @since 1.0
	 */
	public final static Var<JsFunction<Void>> FALSE = new Static<JsFunction<Void>>(
			new Var<JsFunction<Void>>() {
				@Override
				public JsFunction<Void> var() {
					return Js.function(
							"e",
							Code.ret(
									"false"
							)
					);
				}
			}
	);

	/**
	 * <p>A global JavaScript function that creates browser event handlers that 
	 * simply set {@link js.user.JsEvent#cancelBubble} of a browser event or the current event 
	 * object for IE to <tt>true</tt> 
	 * without doing anything else.</p>
	 * <p>This function returns an event handler function that handles browser events more 
	 * efficiently, especially in JS Simulation mode, if invoked with or without the argument 
	 * being a browser event object.</p>
	 * @since 1.0
	 */
	public final static Var<JsFunction<Void>> CANCELBUBBLE = new Static<JsFunction<Void>>(
			new Var<JsFunction<Void>>() {
				@Override
				public JsFunction<Void> var() {
					return Js.function(
							"e",
							Code.join(
									Code.ifnot("e", Code.asg("e", "event")),
									";",
									Code.asg(
											Code.ref("e", "cancelBubble"),
											"true"
									)
							)
					);
				}
			}
	);

	/**
	 * <p>A IE specific global JavaScript function that creates mouse event handlers.</p>
	 * <p>This function returns an event handler function that handles mouse events more 
	 * efficiently, especially in JS Simulation mode, if invoked with the first argument 
	 * being a function that performs the action when a browser click event has happened on 
	 * the source element and the second argument meaning whether to be checking a browser 
	 * mouse out event.</p>
	 * @since 1.0
	 */
	public final static Var<JsFunction<JsObject>> IEHOVER = new Static<JsFunction<JsObject>>(
			new Var<JsFunction<JsObject>>() {
				@Override
				public JsFunction<JsObject> var() {
					return Js.function(
							new Vars<String>().add("f").add("t"),
							"return function(){var e=event,p=e.srcElement,c=t?e.toElement:e.fromElement;while(c){if(c==p)return;c=c.parentNode;}f(e);};"
					);
				}
			}
	);
}
