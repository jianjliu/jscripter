
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

package js.user;

import js.*;
import js.dom.*;
import js.core.*;

/**
 * <p>An <b>opaque</b> class representing JavaScript client-side objects of the global 
 * {@link JsClient#Element} class.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this class must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsElement extends JsClient.Element.Prototype implements EventTarget
{
	/**
	 * <p>An <b>internal</b> class containing membership data for its enclosing
	 * opaque class.</p>
	 * <p>This class is only used inside of <b>opaque</b> or <b>internal</b> classes or
	 * class members.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript Re-compilers must report error on resolving an <b>internal</b> class.
	 */
	protected static abstract class Members extends JsClient.Element.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid tagName = id("tagName");
	}

	/**
	 * <p>An <b>opaque</b> class representing members of its enclosing <b>opaque</b> type.</p>
	 * <p>Note that, this class is <b>opaque</b> but its constructors are all <b>internal</b>. 
	 * This class and the subclasses of this class are used to declare either <b>opaque</b> 
	 * <tt>public</tt> instance fields of the opaque type {@link js.Var.Member} or the 
	 * <b>opaque</b> <tt>public</tt> static fields of other <b>opaque</b> types while their 
	 * constructors are used to define the fields inside <b>opaque</b> classes. Under 
	 * either circumstance, the field names must be exactly same as the member names, as 
	 * the <b>opaque</b> fields of <b>opaque</b> types are resolved by re-compilers directly 
	 * based on the field names.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be created
	 * in the target codes. Re-compilers must exit with error on operations accessing that kind 
	 * of class objects.
	 * Re-compilers must resolve an <b>opaque</b> instance field declared by this class in
	 * {@link js.Var.Member} or its subclasses to the JavaScript identifier: 
	 * <pre>q.m</pre>
	 * where <tt>m</tt> is the identifier of the field name and <tt>q</tt> is the identifier
	 * resolved from the instance of the enclosing member. Re-compilers must resolve an 
	 * <b>opaque</b> static field declared by this class in <b>opaque</b> types other than 
	 * {@link js.Var.Member} and its subclasses to the JavaScript identifier: 
	 * <pre>m</pre>
	 * where <tt>m</tt> is the identifier of the field name. And re-compilers must report
	 * error on the access to <b>opaque</b> fields declared by this class under any other 
	 * circumstances.
	 */
	public static class Member extends JsClient.Element.Prototype.Member
	{
		/**
		 * <p>Internally constructs a member based on a qualifying member.</p>
		 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b>
		 * or <b>internal</b> classes or class members.</p>
		 * <p>Note that, this constructor is <b>internal</b> but its declaring class is
		 * <b>opaque</b>. This constructor is used to define <b>opaque</b> instance fields 
		 * declared in the declaring class of this constructor itself or its subclasses. 
		 * Under this circumstance, the field names must be exactly same as the member 
		 * names, as the <b>opaque</b> instance fields of the <b>opaque</b> type 
		 * {@link js.Var.Member} or its subclasses are resolved by re-compilers directly
		 * to their names appending to the name resolved from the specified qualifying 
		 * member with a dot in between.</p>
		 * @param q A qualifying member
		 * @param mid The ID of the member to construct
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor.
		 */
		public Member(JsObject.Member q, Mid mid) {
			super(q, mid);
		}
		/**
		 * <p>Internally constructs a member without a qualifying member.</p>
		 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b>
		 * or <b>internal</b> classes or class members.</p>
		 * <p>Note that, this constructor is <b>internal</b> but its declaring class is
		 * <b>opaque</b>. This constructor is used to define <b>opaque</b> static fields, 
		 * declared in <b>opaque</b> types other than the declaring class of this constructor 
		 * itself and its subclasses. Under this circumstance, the field names must be
		 * exactly same as the member names, as the <b>opaque</b> static fields of <b>opaque</b>
		 * types are generally resolved by re-compilers directly to identifiers of their names.</p>
		 * @param mid The ID of the member to construct
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor.
		 */
		public Member(Mid mid) {
			super(mid);
		}
		@Override
		/**
		 * <p>Evaluates the property, represented by the current member instance, of the
		 * argument object.</p>
		 * @param o The argument object
		 * @return The value of the current member based on the object argument.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into
		 * the JavaScript expression: 
		 * <pre>o.m</pre>
		 * where <tt>m</tt> is the identifier name resolved from the current member
		 * instance of the invocation.
		 */
		public JsElement with(ObjectLike o) {
			return new JsElement(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member tagName = new Value.String.Member(this, Members.tagName);
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsElement(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member tagName = new Value.String.Member(Members.tagName);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsElement.Member firstChild      = new JsElement.Member(Members.firstChild     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsElement.Member lastChild       = new JsElement.Member(Members.lastChild      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsElement.Member nextSibling     = new JsElement.Member(Members.nextSibling    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsElement.Member parentNode      = new JsElement.Member(Members.parentNode     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsElement.Member previousSibling = new JsElement.Member(Members.previousSibling);

	@Override
	/**
	 * <p>Returns the primitive value associated with the current instance, if there is one.
	 * This invocation simply returns the instance itself for the current instance is an 
	 * object and there is no primitive value for it.</p>
	 * @return The current object itself.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public JsElement valueOf() {
		return new JsElement((JsObject)var().valueOf());
	}
	public final JsElement var(JsElement.Member r) {
		return r.with(this);
	}
	/**
	 * <p>Adds an event handler function to the set of event handlers for this element. 
	 * This is a DOM-standard method supported by all modern browsers except IE.</p>
	 * <p>This method adds the specified event <tt>listener</tt> function to the set of 
	 * listeners registered on this node to handle events of the specified <tt>type</tt>. 
	 * If <tt>useCapture</tt> is <tt>true</tt>, the <tt>listener</tt> is registered as 
	 * a capturing event listener. If <tt>useCapture</tt> is <tt>false</tt>, it is 
	 * registered as a normal event listener.</p>
	 * <p>This method may be called multiple times to register multiple event handlers 
	 * for the same type of event on the same node. Note, however, that the DOM 
	 * Specification makes no guarantees about the order in which multiple event handlers 
	 * are invoked.</p>
	 * <p>If the same event listener function is registered twice on the same node with 
	 * the same <tt>type</tt> and <tt>useCapture</tt> arguments, the second registration 
	 * is simply ignored. If a new event listener is registered on this node while an 
	 * event is being handled at this node, the new event listener is not invoked for 
	 * that event.</p>
	 * <p>When a node is duplicated with {@link JsNode#cloneNode(Boolean)} or {@link JsDocument#importNode(JsNode, Boolean)}, 
	 * the event listeners registered for the original node are not copied.</p>
	 * <p>The same method is also defined by, and works analogously on, the {@link JsDocument} 
	 * and {@link JsWindow} objects</p>
	 * @param type The type of event for which the event listener is to be invoked.
	 * @param listener The event listener function that is invoked when an event of the 
	 * specified type is dispatched to this node. When invoked, the listener function 
	 * is passed an {@link JsEvent} object and is invoked as a method of the node on 
	 * which it is registered.
	 * @param useCapture If <tt>true</tt>, the specified <tt>listener</tt> is to be 
	 * invoked only during the capturing phase of event propagation. The more common 
	 * value of <tt>false</tt> means that the <tt>listener</tt> is not invoked during 
	 * the capturing phase but instead is invoked when this node is the actual event 
	 * target or when the event bubbles up to this node from its original target.
	 * @since 1.0
	 * @see #attachEvent(String, JsFunction)
	 * @see #removeEventListener(String, JsFunction, Boolean)
	 * @see JsDocument#addEventListener(String, JsFunction, Boolean)
	 * @see JsWindow#addEventListener(String, JsFunction, Boolean)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void addEventListener(String type, JsFunction<?> listener, Boolean useCapture) {
		call(addEventListener, new Vars<Object>().add(type).add(listener).add(useCapture));
	}
	/**
	 * <p>Removes an event handler function from the set of handlers for this element. 
	 * This is a standard DOM method implemented by all modern browsers except IE.</p>
	 * <p>This method removes the specified event <tt>listener</tt> function. The <tt>type</tt> 
	 * and <tt>useCapture</tt> arguments must be the same as they are in the 
	 * corresponding call to {@link #addEventListener(String, JsFunction, Boolean)}. If 
	 * no event listener is found that matches the specified arguments, this method does 
	 * nothing.</p>
	 * <p>Once an event <tt>listener</tt> function has been removed by this method, it 
	 * will no longer be invoked for the specified <tt>type</tt> of event on this node. 
	 * This is true even if the event <tt>listener</tt> is removed by another event 
	 * listener registered for the same type of event on the same node.</p>
	 * <p>The same method is also defined by, and works analogously on, the {@link JsDocument} 
	 * and {@link JsWindow} objects</p>
	 * @param type The type of event for which the event listener is to be deleted.
	 * @param listener The event listener function that is to be removed.
	 * @param useCapture <tt>true</tt> if a capturing event listener is to be removed; 
	 * <tt>false</tt> if a normal event listener is to be removed.
	 * @since 1.0
	 * @see #detachEvent(String, JsFunction)
	 * @see #addEventListener(String, JsFunction, Boolean)
	 * @see JsDocument#removeEventListener(String, JsFunction, Boolean)
	 * @see JsWindow#removeEventListener(String, JsFunction, Boolean)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void removeEventListener(String type, JsFunction<?> listener, Boolean useCapture) {
		call(removeEventListener, new Vars<Object>().add(type).add(listener).add(useCapture));
	}
	/**
	 * <p>Dispatches a synthetic event to this element.</p>
	 * <p>This method dispatches a synthetic event created with {@link JsDocument#createEvent(String)} 
	 * and initialized with the initialization method defined by the {@link JsEvent} 
	 * or one of its subclasses. The node on which this method is called becomes the 
	 * target of the event, but the event first propagates down the document tree 
	 * during the capturing phase, and then, if the {@link JsEvent#bubbles} property of 
	 * the event is <tt>true</tt>, it bubbles up the document tree after being handled 
	 * at the event target itself.</p>
	 * @param evt The {@link JsEvent} object to be dispatched.
	 * @return <tt>false</tt> if the {@link JsEvent#preventDefault()} method of <tt>evt</tt> 
	 * is called at any time during the propagation of the event, or <tt>true</tt> 
	 * otherwise.
	 * @throws RuntimeException JavaScript throws a {@link JsError} object if <tt>evt</tt> 
	 * is not initialized, or if its {@link JsEvent#type} property is <tt>null</tt> or 
	 * the empty string. See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see JsDocument#createEvent(String)
	 * @see JsEvent#initEvent(String, Boolean, Boolean)
	 * @see JsMouseEvent#initMouseEvent(String, Boolean, Boolean, JsWindow, Number, Number, Number, Number, Number, Boolean, Boolean, Boolean, Boolean, Number, JsElement)
	 * @see JsElement#dispatchEvent(JsEvent)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Boolean dispatchEvent(JsEvent evt) {
		return call(dispatchEvent, evt);
	}
	/**
	 * <p>Adds an event handler function to the set of handlers for this element. 
	 * This is the IE-specific alternative to {@link #addEventListener(String, JsFunction, Boolean)}.</p>
	 * <p>This method is an IE-specific event registration method. It serves the same 
	 * purpose as the standard {@link #addEventListener(String, JsFunction, Boolean)} 
	 * method, which IE does not support, but is different from that function in several 
	 * important ways:
	 * <ul>
	 * <li>Since the IE event model does not support event capturing, this method and 
	 * {@link #detachEvent(String, JsFunction)} expect only two arguments: the event 
	 * type and the handler function.</li>
	 * <li>The event handler names passed to the IE methods should include the "on" 
	 * prefix.</li>
	 * <li>Functions registered with this method are invoked with no {@link JsEvent} 
	 * {@link JsWindow#event} property of 
	 * {@link JsWindow#window} object.</li>
	 * <li>Functions registered with this method are invoked as global functions, rather 
	 * than as methods of the node on which the event occurred. That is, when an event 
	 * handler registered with this method executes, the <tt>this</tt> keyword refers to 
	 * {@link JsWindow#window} object, not to the event's target node.</li>
	 * <li>This method allows the same event handler function to be registered more than 
	 * once. When an event of the specified type occurs, the registered function is 
	 * invoked as many times as it is registered.</li>
	 * </ul>
	 * </p>
	 * <p>The same method is also defined by, and works analogously on, the {@link JsDocument} 
	 * and {@link JsWindow} objects</p>
	 * @param type The type of event for which the event listener is to be invoked, with 
	 * a leading "on" prefix.
	 * @param listener The event listener function that is invoked when an event of the 
	 * specified type is dispatched to this node. This function is not passed any 
	 * {@link JsWindow#event} 
	 * property of the {@link JsWindow} object.
	 * @since 1.0
	 * @see #addEventListener(String, JsFunction, Boolean)
	 * @see #detachEvent(String, JsFunction)
	 * @see JsDocument#attachEvent(String, JsFunction)
	 * @see JsWindow#attachEvent(String, JsFunction)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void attachEvent(String type, JsFunction<?> listener) {
		call(attachEvent, new Vars<Object>().add(type).add(listener));
	}
	/**
	 * <p>Removes an event handler function from this element. This is the IE-specific 
	 * alternative to the standard {@link #removeEventListener(String, JsFunction, Boolean)} 
	 * method.</p>
	 * <p>This method undoes the event handler function registration performed by the 
	 * {@link #attachEvent(String, JsFunction)} method. It is the IE-specific analog to 
	 * the standard {@link #removeEventListener(String, JsFunction, Boolean)}. To remove 
	 * an event handler function for a node, simply invoke this method with the same 
	 * arguments you originally passed to {@link #attachEvent(String, JsFunction)}.</p>
	 * <p>The same method is also defined by, and works analogously on, the {@link JsDocument} 
	 * and {@link JsWindow} objects</p>
	 * @param type The type of event for which the event listener is to be invoked, with 
	 * a leading "on" prefix.
	 * @param listener The event listener function that is to be removed.
	 * @since 1.0
	 * @see #removeEventListener(String, JsFunction, Boolean)
	 * @see #attachEvent(String, JsFunction)
	 * @see JsDocument#detachEvent(String, JsFunction)
	 * @see JsWindow#detachEvent(String, JsFunction)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void detachEvent(String type, JsFunction<?> listener) {
		call(detachEvent, new Vars<Object>().add(type).add(listener));
	}
	/**
	 * <p>Fires a specified event on the object.</p>
	 * <p>This method is IE-specific.</p>
	 * @param evt The {@link JsEvent} object to be dispatched.
	 * @return <tt>false</tt> if the {@link JsEvent#preventDefault()} method of <tt>evt</tt> 
	 * is called at any time during the propagation of the event, or <tt>true</tt> 
	 * otherwise.
	 * @throws RuntimeException JavaScript throws a {@link JsError} object if <tt>evt</tt> 
	 * is not initialized, or if its {@link JsEvent#type} property is <tt>null</tt> or 
	 * the empty string. See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see JsDocument#createEvent(String)
	 * @see JsEvent#initEvent(String, Boolean, Boolean)
	 * @see JsMouseEvent#initMouseEvent(String, Boolean, Boolean, JsWindow, Number, Number, Number, Number, Number, Boolean, Boolean, Boolean, Boolean, Number, JsElement)
	 * @see JsElement#dispatchEvent(JsEvent)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Boolean fireEvent(JsEvent evt) {
		return call(fireEvent, evt);
	}
	/**
	 * <p>Returns the value of a named attribute as a string.</p>
	 * <p>This method returns the value of a named attribute of an element. Note that 
	 * the {@link JsHTMLElement} objects have JavaScript properties that match each of 
	 * the standard HTML attributes, so you need to use this method with HTML documents 
	 * only if you are querying the value of nonstandard attributes.</p>
	 * <p>In XML documents, attribute values are not available directly as element 
	 * properties and must be looked up by calling this method. For XML documents that 
	 * use name spaces, use {@link #getAttributeNS(String, String)}.</p>
	 * @param name The name of the attribute whose value is to be returned.
	 * @return The value of the named attribute as a string. If the attribute is not 
	 * defined, this method is supposed to return an empty string. Some implementations 
	 * return <tt>null</tt> in this case, however.
	 * @since 1.0
	 * @see #getAttribute(StringLike)
	 * @see #getAttributeNS(String, String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String getAttribute(String name) {
		return call(getAttribute, name);
	}
	/**
	 * <p>Returns the value of a named attribute as a string.</p>
	 * <p>This method returns the value of a named attribute of an element. Note that 
	 * the {@link JsHTMLElement} objects have JavaScript properties that match each of 
	 * the standard HTML attributes, so you need to use this method with HTML documents 
	 * only if you are querying the value of nonstandard attributes.</p>
	 * <p>In XML documents, attribute values are not available directly as element 
	 * properties and must be looked up by calling this method. For XML documents that 
	 * use name spaces, use {@link #getAttributeNS(String, String)}.</p>
	 * @param name The name of the attribute whose value is to be returned.
	 * @return The value of the named attribute as a string. If the attribute is not 
	 * defined, this method is supposed to return an empty string. Some implementations 
	 * return <tt>null</tt> in this case, however.
	 * @since 1.0
	 * @see #getAttribute(String)
	 * @see #getAttributeNS(String, String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String getAttribute(StringLike name) {
		return getAttribute(Js.valueOf(name));
	}
	/**
	 * <p>Returns the value of a named attribute as a {@link JsAttr} node.</p>
	 * <p>Note that this {@link JsAttr} node can also be obtained through the 
	 * {@link JsNode#attributes} property inherited from {@link JsNode}.</p>
	 * @param name The name of the desired attribute.
	 * @return A {@link JsAttr} node that represents the value of the named attribute, 
	 * or <tt>null</tt> if this element has no such attribute.
	 * @since 1.0
	 * @see #getAttributeNode(StringLike)
	 * @see #getAttributeNodeNS(String, String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsAttr getAttributeNode(String name) {
		return new JsAttr(call(getAttributeNode, name));
	}
	/**
	 * <p>Returns the value of a named attribute as a {@link JsAttr} node.</p>
	 * <p>Note that this {@link JsAttr} node can also be obtained through the 
	 * {@link JsNode#attributes} property inherited from {@link JsNode}.</p>
	 * @param name The name of the desired attribute.
	 * @return A {@link JsAttr} node that represents the value of the named attribute, 
	 * or <tt>null</tt> if this element has no such attribute.
	 * @since 1.0
	 * @see #getAttributeNode(String)
	 * @see #getAttributeNodeNS(String, String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsAttr getAttributeNode(StringLike name) {
		return getAttributeNode(Js.valueOf(name));
	}
	/**
	 * <p>Returns the string value of an attribute specified by local name and name space URI.</p> 
	 * <p>This method is useful only with XML documents that use name spaces and works 
	 * just like the {@link #getAttribute(String)} method, except that the attribute is 
	 * specified by a combination of name space URI and local name within that name 
	 * space.</p>
	 * @param namespaceURI The URI that uniquely identifies the name space of this 
	 * attribute or <tt>null</tt> for no name space.
	 * @param localName The identifier that specifies the name of the attribute within 
	 * its name space.
	 * @return The value of the named attribute, as a string. If the attribute is not 
	 * defined, this method is supposed to return an empty string, but some implementations 
	 * return <tt>null</tt> instead.
	 * @since 1.0
	 * @see #getAttribute(String)
	 * @see #getAttributeNodeNS(String, String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String getAttributeNS(String namespaceURI, String localName) {
		return call(getAttributeNS, new Vars<Object>().add(namespaceURI).add(localName));
	}
	/**
	 * <p>Returns the {@link JsAttr} node of an attribute specified by local name and 
	 * name space URI.</p>
	 * <p>This method is useful only with XML documents that use name spaces and works 
	 * just like {@link #getAttributeNode(String)} method, except that the attribute is 
	 * specified by the combination of a name space URI and a local name defined within 
	 * that name space.</p>
	 * @param namespaceURI The URI that uniquely identifies the name space of this 
	 * attribute or <tt>null</tt> for no name space.
	 * @param localName The identifier that specifies the name of the attribute within 
	 * its name space.
	 * @return The {@link JsAttr} node that represents the value of the specified 
	 * attribute, or <tt>null</tt> if this element has no such attribute.
	 * @since 1.0
	 * @see #getAttributeNode(String)
	 * @see #getAttributeNS(String, String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsAttr getAttributeNodeNS(String namespaceURI, String localName) {
		return new JsAttr(call(getAttributeNodeNS, new Vars<Object>().add(namespaceURI).add(localName)));
	}
	/**
	 * <p>Returns an array, technically a {@link JsNodeList} object, of all {@link JsElement} 
	 * nodes in the current document that have the specified tag name by traversing all 
	 * descendants of this element. The {@link JsElement} nodes appear in the returned 
	 * array in the same order in which they appear in the document source.</p>
	 * <p>Note that the {@link JsDocument#getElementsByTagName(String)} method works 
	 * just like this one but that traverses the entire document, rather than just the 
	 * descendants of a single element. Do not confuse this method with {@link JsHTMLDocument#getElementsByName(String)}, 
	 * which searches for elements based on the value of their <tt>name</tt> attributes 
	 * rather than by their tag names.</p>
	 * @param name The tag name of the desired elements, or the value "*" to specify 
	 * that all descendant elements should be returned, regardless of their tag names.
	 * @return An read-only array, technically a {@link JsNodeList} object, of 
	 * {@link JsElement} nodes that are descendants of this element and have the 
	 * specified tag name.
	 * @since 1.0
	 * @see #getElementsByTagName(StringLike)
	 * @see JsDocument#getElementsByTagName(String)
	 * @see JsDocument#getElementById(String)
	 * @see JsHTMLDocument#getElementsByName(String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsNodeList<? extends JsElement> getElementsByTagName(String name) {
		return new JsNodeList<JsElement>(call(getElementsByTagName, name));
	}
	/**
	 * <p>Returns an array, technically a {@link JsNodeList} object, of all {@link JsElement} 
	 * nodes in the current document that have the specified tag name by traversing all 
	 * descendants of this element. The {@link JsElement} nodes appear in the returned 
	 * array in the same order in which they appear in the document source.</p>
	 * <p>Note that the {@link JsDocument#getElementsByTagName(StringLike)} method works 
	 * just like this one but that traverses the entire document, rather than just the 
	 * descendants of a single element. Do not confuse this method with {@link JsHTMLDocument#getElementsByName(StringLike)}, 
	 * which searches for elements based on the value of their <tt>name</tt> attributes 
	 * rather than by their tag names.</p>
	 * @param name The tag name of the desired elements, or the value "*" to specify 
	 * that all descendant elements should be returned, regardless of their tag names.
	 * @return An read-only array, technically a {@link JsNodeList} object, of 
	 * {@link JsElement} nodes that are descendants of this element and have the 
	 * specified tag name.
	 * @since 1.0
	 * @see #getElementsByTagName(String)
	 * @see JsDocument#getElementsByTagName(StringLike)
	 * @see JsDocument#getElementById(StringLike)
	 * @see JsHTMLDocument#getElementsByName(StringLike)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsNodeList<? extends JsElement> getElementsByTagName(StringLike name) {
		return getElementsByTagName(Js.valueOf(name));
	}
	/**
	 * <p>Returns an array of all {@link JsElement} nodes in the current document that 
	 * have the specified tag name and name-space by traversing all descendants of this 
	 * element.</p>
	 * <p>This method works like {@link #getElementsByTagName(String)}, except that the 
	 * tag name of the desired elements is specified as a combination of a name space 
	 * URI and a local name defined within that name space. This method is useful only 
	 * with XML documents that use name spaces.</p>
	 * @param namespaceURI The URI that uniquely identifies the name space of the 
	 * desired elements.
	 * @param localName The identifier that specifies the name of the desired elements 
	 * within its name space.
	 * @return A read-only array, technically a {@link JsNodeList} object, of all {@link JsElement} 
	 * nodes in the current document that have the specified name and name space.
	 * @since 1.0
	 * @see JsDocument#getElementsByTagNameNS(String, String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsNodeList<? extends JsElement> getElementsByTagNameNS(String namespaceURI, String localName) {
		return new JsNodeList<JsElement>(call(getElementsByTagNameNS, new Vars<Object>().add(namespaceURI).add(localName)));
	}
	/**
	 * <p>Determines whether this element has an attribute with the specified name.</p>
	 * <p>Note that this method does not return the value of that attribute but returns 
	 * <tt>true</tt> if the named attribute is explicitly specified in the document and 
	 * also if the named attribute has a default value specified by the internal subset 
	 * of the document type.</p>
	 * @param name The name of the desired attribute.
	 * @return <tt>true</tt> if this element has a specified or default value for the 
	 * named attribute, or <tt>false</tt> otherwise.
	 * @since 1.0
	 * @see #hasAttribute(StringLike)
	 * @see #getAttribute(String)
	 * @see #setAttribute(String, Object)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Boolean hasAttribute(String name) {
		return call(hasAttribute, name);
	}
	/**
	 * <p>Determines whether this element has an attribute with the specified name.</p>
	 * <p>Note that this method does not return the value of that attribute but returns 
	 * <tt>true</tt> if the named attribute is explicitly specified in the document and 
	 * also if the named attribute has a default value specified by the internal subset 
	 * of the document type.</p>
	 * @param name The name of the desired attribute.
	 * @return <tt>true</tt> if this element has a specified or default value for the 
	 * named attribute, or <tt>false</tt> otherwise.
	 * @since 1.0
	 * @see #hasAttribute(String)
	 * @see #getAttribute(StringLike)
	 * @see #setAttribute(String, Object)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Boolean hasAttribute(StringLike name) {
		return hasAttribute(Js.valueOf(name));
	}
	/**
	 * <p>Determines whether this element has an attribute with the specified a combination of 
	 * local name and name space URI.</p>
	 * <p>This method is useful only with XML documents that use name spaces and works 
	 * just like {@link #hasAttribute(String)} method, except that the attribute to 
	 * be checked for is specified by the combination of a name space URI and a local 
	 * name defined within that name space.</p>
	 * @param namespaceURI The unique name space identifier for the attribute, or <tt>null</tt> 
	 * for no name space.
	 * @param localName The name of the attribute within the specified name space. 
	 * @return <tt>true</tt> if this element has a specified or default value for the 
	 * named attribute, or <tt>false</tt> otherwise.
	 * @since 1.0
	 * @see #hasAttribute(String)
	 * @see #getAttributeNS(String, String)
	 * @see #setAttributeNS(String, String, String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Boolean hasAttributeNS(String namespaceURI, String localName) {
		return call(hasAttributeNS, new Vars<Object>().add(namespaceURI).add(localName));
	}
	/**
	 * <p>Removes the named attribute from this element.</p>
	 * <p>This method deletes a named attribute from this element. If the named attribute 
	 * has a default value specified by the document type, subsequent calls to this method 
	 * return that default value. Attempts to remove nonexistent attributes or attributes 
	 * that are not specified but have a default value are silently ignored.</p>
	 * @param name The name of the desired attribute.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if this element is read-only and does not allow its attributes to be removed. See 
	 * {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see #removeAttribute(StringLike)
	 * @see #getAttribute(String)
	 * @see #setAttribute(String, Object)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void removeAttribute(String name) {
		call(removeAttribute, name);
	}
	/**
	 * <p>Removes the named attribute from this element.</p>
	 * <p>This method deletes a named attribute from this element. If the named attribute 
	 * has a default value specified by the document type, subsequent calls to this method 
	 * return that default value. Attempts to remove nonexistent attributes or attributes 
	 * that are not specified but have a default value are silently ignored.</p>
	 * @param name The name of the desired attribute.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if this element is read-only and does not allow its attributes to be removed. See 
	 * {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see #removeAttribute(String)
	 * @see #getAttribute(StringLike)
	 * @see #setAttribute(String, Object)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void removeAttribute(StringLike name) {
		removeAttribute(Js.valueOf(name));
	}
	/**
	 * <p>Removes the specified {@link JsAttr} node from the list of attributes for 
	 * this element.</p>
	 * <p>This method removes and returns a {@link JsAttr} node from the set of attributes 
	 * of an element. If the removed attribute has a default value specified by the DTD, 
	 * a new {@link JsAttr} node is added representing this default value. It is often 
	 * simpler to use {@link #removeAttribute(String)} instead of this method.</p>
	 * @param attr The {@link JsAttr} node to be removed from the element.
	 * @return The {@link JsAttr} node that was removed.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if this element is read-only and does not allow its attributes to be removed or the value 
	 * {@link JsDOMException#NOT_FOUND_ERR} if <tt>attr</tt>is not an attribute of this 
	 * element. See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see #removeAttribute(String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsAttr removeAttributeNode(JsAttr attr) {
		return new JsAttr(call(removeAttributeNode, attr));
	}
	/**
	 * <p>Removes, from this element, an attribute with the specified a combination of 
	 * local name and name space URI.</p>
	 * <p>This method is useful only with XML documents that use name spaces and works 
	 * just like {@link #removeAttribute(String)} method, except that the attribute to 
	 * be removed is specified by the combination of a name space URI and a local name 
	 * defined within that name space.</p>
	 * @param namespaceURI The URI that uniquely identifies the name space of this 
	 * attribute or <tt>null</tt> for no name space.
	 * @param localName The identifier that specifies the name of the attribute within 
	 * its name space.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if this element is read-only and does not allow its attributes to be removed. See 
	 * {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see #getAttributeNS(String, String)
	 * @see #removeAttribute(String)
	 * @see #setAttributeNS(String, String, String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void removeAttributeNS(String namespaceURI, String localName) {
		call(removeAttributeNS, new Vars<Object>().add(namespaceURI).add(localName));
	}
	/**
	 * <p>Sets or adds the named attribute to the specified string value.</p>
	 * <p>This method sets the specified attribute to the specified value. If no 
	 * attribute by that name already exists, a new one is created.</p>
	 * <p>Note that {@link JsHTMLElement} objects of an HTML document define JavaScript 
	 * properties that correspond to all standard HTML attributes. Thus, you need to use 
	 * this method only if you want to set a nonstandard attribute.</p>
	 * @param name The name of the attribute to be created or modified.
	 * @param value The string value of the attribute.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if this element is read-only and does not allow its attributes to be removed or 
	 * the value {@link JsDOMException#INVALID_CHARACTER_ERR} if the <tt>name</tt> argument 
	 * contains a character that is not allowed in HTML or XML attribute names. See 
	 * {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see #getAttribute(String)
	 * @see #removeAttribute(String)
	 * @see #setAttributeNode(JsAttr)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void setAttribute(String name, Object value) {
		call(setAttribute, new Vars<Object>().add(name).add(value));
	}
	/**
	 * <p>Sets or adds the specified {@link JsAttr} node to the list of attributes for 
	 * this element.</p>
	 * <p>If an attribute with the same name already exists for this element, <tt>attr</tt> 
	 * replaces that attribute, and the replaced {@link JsAttr} node is returned. If no 
	 * such attribute already exists, this method defines a new attribute for the 
	 * element.</p>
	 * <p>It is usually easier to use {@link #setAttribute(String, Object)} instead of 
	 * this method.</p>
	 * @param attr The {@link JsAttr} node that represents the attribute to be added or 
	 * whose value is to be modified.
	 * @return The {@link JsAttr} node that was replaced by <tt>attr</tt>, or <tt>null</tt> 
	 * if no attribute was replaced.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if this element is read-only and does not allow its attributes to be removed, 
	 * the value {@link JsDOMException#INUSE_ATTRIBUTE_ERR} if <tt>attr</tt> is already 
	 * a member of the attribute set of some other {@link JsElement} node, or the value 
	 * {@link JsDOMException#WRONG_DOCUMENT_ERR} if <tt>attr</tt> has a different {@link JsNode#ownerDocument} 
	 * property than the {@link JsElement} node on which it is being set. See 
	 * {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see #getAttribute(StringLike)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsAttr setAttributeNode(JsAttr attr) {
		return new JsAttr(call(setAttributeNode, attr));
	}
	/**
	 * <p>Sets or adds the specified {@link JsAttr} node to the list of attributes for 
	 * this element.</p>
	 * <p>This method is useful only with XML documents that use name spaces and works 
	 * just like {@link #setAttributeNodeNS(JsAttr)} method, except that it is designed 
	 * for use with {@link JsAttr} nodes that represent attributes specified by name 
	 * space and name.</p>
	 * @param attr The {@link JsAttr} node that represents the attribute to be added or 
	 * whose value is to be modified.
	 * @return The {@link JsAttr} node that was replaced by <tt>attr</tt>, or <tt>null</tt> 
	 * if no attribute was replaced.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if this element is read-only and does not allow its attributes to be removed, 
	 * the value {@link JsDOMException#INUSE_ATTRIBUTE_ERR} if <tt>attr</tt> is already 
	 * a member of the attribute set of some other {@link JsElement} node, the value 
	 * {@link JsDOMException#WRONG_DOCUMENT_ERR} if <tt>attr</tt> has a different {@link JsNode#ownerDocument} 
	 * property than the {@link JsElement} node on which it is being set, or the value 
	 * {@link JsDOMException#NOT_SUPPORTED_ERR} if the DOM implementation of the browser 
	 * does not support XML documents. See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see JsDocument#createAttributeNS(String, String)
	 * @see #setAttributeNS(String, String, String)
	 * @see #setAttributeNode(JsAttr)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsAttr setAttributeNodeNS(JsAttr attr) {
		return new JsAttr(call(setAttributeNodeNS, attr));
	}
	/**
	 * <p>Sets or adds, to the list of attributes for this element, an attribute with 
	 * the specified a combination of local name and name space URI.</p>
	 * <p>This method is useful only with XML documents that use name spaces and works 
	 * just like {@link #setAttribute(String, Object)} method, except that the attribute 
	 * is specified by the combination of a name space URI and a local name defined 
	 * within that name space.</p>
	 * @param namespaceURI The URI that uniquely identifies the name space of the 
	 * attribute to be set or created, or <tt>null</tt> for no name space.
	 * @param qualifiedName The name of the attribute, specified as an optional name 
	 * space prefix and colon followed by the local name within the name space.
	 * @param value The new value of the attribute.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if this element is read-only and does not allow its attributes to be removed, 
	 * the value {@link JsDOMException#INVALID_CHARACTER_ERR} if <tt>qualifiedName</tt> 
	 * argument contains a character that is not allowed in HTML or XML attribute names, 
	 * the value {@link JsDOMException#NAMESPACE_ERR} if <tt>qualifiedName</tt> is 
	 * malformed, or there is a mismatch between the name space prefix of <tt>qualifiedName</tt> 
	 * and the <tt>namespaceURI</tt> argument, or the value {@link JsDOMException#NOT_SUPPORTED_ERR} 
	 * if the DOM implementation of the browser does not support XML documents. See 
	 * {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see #setAttribute(String, Object)
	 * @see #setAttributeNode(JsAttr)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void setAttributeNS(String namespaceURI, String qualifiedName, String value) {
		call(setAttributeNS, new Vars<Object>().add(namespaceURI).add(qualifiedName).add(value));
	}
}
