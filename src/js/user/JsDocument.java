
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
import js.core.*;
import js.dom.*;

/**
 * <p>An <b>opaque</b> class representing JavaScript client-side objects of the global 
 * {@link JsClient#Document} class.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsDocument extends JsClient.Document.Prototype implements EventTarget, DocumentRange
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
	protected static abstract class Members extends JsClient.Document.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsDocument#defaultView
		 * @see JsDocument.Member#defaultView
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid defaultView     = id("defaultView"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsDocument#doctype
		 * @see JsDocument.Member#doctype
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid doctype         = id("doctype"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsDocument#documentElement
		 * @see JsDocument.Member#documentElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid documentElement = id("documentElement");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsDocument#implementation
		 * @see JsDocument.Member#implementation
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid implementation  = id("implementation" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsDocument#styleSheets
		 * @see JsDocument.Member#styleSheets
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid styleSheets     = id("styleSheets"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsDocument#compatMode
		 * @see JsDocument.Member#compatMode
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid compatMode      = id("compatMode"     );
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
	public static class Member extends JsClient.Document.Prototype.Member
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
		public JsDocument with(ObjectLike o) {
			return new JsDocument(super.with(o));
		}
		/**
		 * <p>Evaluates a property, represented by the current member instance, of the
		 * JavaScript global object, that is, evaluates the member to a global identifier.</p>
		 * @return The value of the current member based on the JavaScript global object.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into
		 * the JavaScript expression: 
		 * <pre>m</pre>
		 * where <tt>m</tt> is the identifier name resolved from the current member
		 * instance of the invocation.
		 */
		public JsDocument with() {
			return with(Js.win());
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsDocument} object 
		 * specifies a {@link JsDocumentType} node that represents the document's DTD 
		 * for XML documents with a <tt>&lt;!DOCTYPE&gt;</tt> declaration. For HTML 
		 * documents and for XML documents with no <tt>&lt;!DOCTYPE&gt;</tt> declaration, 
		 * the property is <tt>null</tt>.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsDocumentType.Member doctype = new JsDocumentType.Member(this, Members.doctype);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsDocument} object 
		 * is a reference to the root element of the document. For HTML documents, the 
		 * property is always the {@link JsElement} object representing the <tt>&lt;html&gt;</tt> tag. 
		 * This root element is also available through the {@link JsNode#childNodes} 
		 * array inherited from {@link JsNode}. See also the {@link JsHTMLDocument#body} 
		 * property.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsElement.Member documentElement = new JsElement.Member(this, Members.documentElement);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsDocument} object 
		 * refers to an object of {@link JsDOMImplementation} that represents the 
		 * implementation that created the document.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsDOMImplementation.Member implementation = new JsDOMImplementation.Member(this, Members.implementation);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsDocument} object 
		 * refers to a collection of objects representing all style-sheets embedded in or 
		 * linked into a document. In HTML documents, this includes style-sheets defined 
		 * with <tt>&lt;link&gt;</tt> and <tt>&lt;style&gt;</tt> tags.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsArray.Member styleSheets = new JsArray.Member(this, Members.styleSheets);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member compatMode = new Value.String.Member(this, Members.compatMode);
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsDocument(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsDocument} object
	 * refers to the web browser's {@link JsWindow} object in which the document is 
	 * displayed. The "view" is in DOM terminology.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsWindow.Member defaultView = new JsWindow.Member(Members.defaultView);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsDocument} object 
	 * specifies a {@link JsDocumentType} node that represents the document's DTD 
	 * for XML documents with a <tt>&lt;!DOCTYPE&gt;</tt> declaration. For HTML 
	 * documents and for XML documents with no <tt>&lt;!DOCTYPE&gt;</tt> declaration, 
	 * the property is <tt>null</tt>.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsDocumentType.Member doctype = new JsDocumentType.Member(Members.doctype);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsDocument} object 
	 * is a reference to the root element of the document. For HTML documents, the 
	 * property is always the {@link JsElement} object representing the <tt>&lt;html&gt;</tt><html> tag. 
	 * This root element is also available through the {@link JsNode#childNodes} 
	 * array inherited from {@link JsNode}. See also the {@link JsHTMLDocument#body} 
	 * property.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsElement.Member documentElement = new JsElement.Member(Members.documentElement);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsDocument} object 
	 * refers to an object of {@link JsDOMImplementation} that represents the 
	 * implementation that created the document.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsDOMImplementation.Member implementation = new JsDOMImplementation.Member(Members.implementation);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsDocument} object 
	 * refers to a collection of objects representing all style-sheets embedded in or 
	 * linked into a document. In HTML documents, this includes style-sheets defined 
	 * with <tt>&lt;link&gt;</tt> and <tt>&lt;style&gt;</tt> tags.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsArray.Member styleSheets = new JsArray.Member(Members.styleSheets);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member compatMode = new Value.String.Member(Members.compatMode);

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
	public JsDocument valueOf() {
		return new JsDocument((JsObject)var().valueOf());
	}
	public final JsWindow var(JsWindow.Member r) {
		return r.with(this);
	}
	public final JsDocumentType var(JsDocumentType.Member r) {
		return r.with(this);
	}
	public final JsElement var(JsElement.Member r) {
		return r.with(this);
	}
	public final JsDOMImplementation var(JsDOMImplementation.Member r) {
		return r.with(this);
	}

	/**
	 * <p>Adds an event handler function to the set of event handlers for this document. 
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
	 * <p>The same method is also defined by, and works analogously on, the {@link JsElement} 
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
	 * @see JsElement#addEventListener(String, JsFunction, Boolean)
	 * @see JsWindow#addEventListener(String, JsFunction, Boolean)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void addEventListener(String type, JsFunction<?> listener, Boolean useCapture) {
		call(addEventListener, new Vars<Object>().add(type).add(listener).add(useCapture));
	}
	/**
	 * <p>Removes an event handler function from the set of handlers for this document. 
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
	 * <p>The same method is also defined by, and works analogously on, the {@link JsElement} 
	 * and {@link JsWindow} objects</p>
	 * @param type The type of event for which the event listener is to be deleted.
	 * @param listener The event listener function that is to be removed.
	 * @param useCapture <tt>true</tt> if a capturing event listener is to be removed; 
	 * <tt>false</tt> if a normal event listener is to be removed.
	 * @since 1.0
	 * @see #detachEvent(String, JsFunction)
	 * @see #addEventListener(String, JsFunction, Boolean)
	 * @see JsElement#removeEventListener(String, JsFunction, Boolean)
	 * @see JsWindow#removeEventListener(String, JsFunction, Boolean)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void removeEventListener(String type, JsFunction<?> listener, Boolean useCapture) {
		call(removeEventListener, new Vars<Object>().add(type).add(listener).add(useCapture));
	}
	/**
	 * <p>Adds an event handler function to the set of handlers for this document. 
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
	 * <p>The same method is also defined by, and works analogously on, the {@link JsElement} 
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
	 * @see JsElement#attachEvent(String, JsFunction)
	 * @see JsWindow#attachEvent(String, JsFunction)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void attachEvent(String type, JsFunction<?> listener) {
		call(attachEvent, new Vars<Object>().add(type).add(listener));
	}
	/**
	 * <p>Removes an event handler function from this document. This is the IE-specific 
	 * alternative to the standard {@link #removeEventListener(String, JsFunction, Boolean)} 
	 * method.</p>
	 * <p>This method undoes the event handler function registration performed by the 
	 * {@link #attachEvent(String, JsFunction)} method. It is the IE-specific analog to 
	 * the standard {@link #removeEventListener(String, JsFunction, Boolean)}. To remove 
	 * an event handler function for a node, simply invoke this method with the same 
	 * arguments you originally passed to {@link #attachEvent(String, JsFunction)}.</p>
	 * <p>The same method is also defined by, and works analogously on, the {@link JsElement} 
	 * and {@link JsWindow} objects</p>
	 * @param type The type of event for which the event listener is to be invoked, with 
	 * a leading "on" prefix.
	 * @param listener The event listener function that is to be removed.
	 * @since 1.0
	 * @see #removeEventListener(String, JsFunction, Boolean)
	 * @see #attachEvent(String, JsFunction)
	 * @see JsElement#detachEvent(String, JsFunction)
	 * @see JsWindow#detachEvent(String, JsFunction)
	 * @see jsx.client.Win#detachEvent(String, JsFunction)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void detachEvent(String type, JsFunction<?> listener) {
		call(detachEvent, new Vars<Object>().add(type).add(listener));
	}
	/**
	 * <p>Dispatches a synthetic event to this document.</p>
	 * <p>This method dispatches a synthetic event created with {@link #createEvent(String)} 
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
	 * @see #createEvent(String)
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
	 * <p>Returns a descendant {@link JsElement} element of this document that has the 
	 * specified value for its <tt>id</tt> attribute, or <tt>null</tt> if no such 
	 * element exists in the document.</p>
	 * <p>This method searches the document for an {@link JsElement} node with an <tt>id</tt> 
	 * attribute whose value is <tt>elementId</tt> and returns that element. If no such 
	 * element is found, it returns <tt>null</tt>. The value of the <tt>id</tt> attribute 
	 * is intended to be unique within a document, and if this method finds more than 
	 * one element with the specified <tt>elementId</tt>, it may return one at random, 
	 * or it may return <tt>null</tt>.</p>
	 * <p>This is an important and commonly used method because it provides a simple 
	 * way to obtain the {@link JsElement} object that represents a specific document 
	 * element.</p>
	 * <p>For HTML documents, this method searches for an element based on the value of 
	 * its <tt>id</tt> attribute. Use {@link JsHTMLDocument#getElementsByName(String)} 
	 * to search for HTML elements based on the value of their <tt>name</tt> attributes.</p>
	 * <p>For XML documents, this method performs its search using any attribute whose 
	 * type is <tt>id</tt>, regardless of what the name of that attribute is. If, for example, 
	 * because the XML parser ignored or could not locate the document's DTD, XML attribute 
	 * types are not known, this method always returns <tt>null</tt>. In JavaScript, 
	 * this method is not usually useful with XML documents. In fact, it was originally 
	 * defined as a member of the <tt>HTMLDocument</tt> interface but was then moved to 
	 * the <tt>Document</tt> interface in DOM Level 2.</p>
	 * @param elementId The value of the <tt>id</tt> attribute of the desired element.
	 * @return The {@link JsElement} node that represents the document element with the 
	 * specified <tt>id</tt> attribute or <tt>null</tt> if no such element is found.
	 * @since 1.0
	 * @see #getElementsByTagName(String)
	 * @see #getElementById(StringLike)
	 * @see JsHTMLDocument#getElementsByName(String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsElement getElementById(String elementId) {
		return new JsElement(call(getElementById, elementId));
	}
	/**
	 * <p>Returns a descendant {@link JsElement} element of this document that has the 
	 * specified value for its <tt>id</tt> attribute, or <tt>null</tt> if no such 
	 * element exists in the document.</p>
	 * <p>This method searches the document for an {@link JsElement} node with an <tt>id</tt> 
	 * attribute whose value is <tt>elementId</tt> and returns that element. If no such 
	 * element is found, it returns <tt>null</tt>. The value of the <tt>id</tt> attribute 
	 * is intended to be unique within a document, and if this method finds more than 
	 * one element with the specified <tt>elementId</tt>, it may return one at random, 
	 * or it may return <tt>null</tt>.</p>
	 * <p>This is an important and commonly used method because it provides a simple 
	 * way to obtain the {@link JsElement} object that represents a specific document 
	 * element.</p>
	 * <p>For HTML documents, this method searches for an element based on the value of 
	 * its <tt>id</tt> attribute. Use {@link JsHTMLDocument#getElementsByName(String)} 
	 * to search for HTML elements based on the value of their <tt>name</tt> attributes.</p>
	 * <p>For XML documents, this method performs its search using any attribute whose 
	 * type is <tt>id</tt>, regardless of what the name of that attribute is. If, for example, 
	 * because the XML parser ignored or could not locate the document's DTD, XML attribute 
	 * types are not known, this method always returns <tt>null</tt>. In JavaScript, 
	 * this method is not usually useful with XML documents. In fact, it was originally 
	 * defined as a member of the <tt>HTMLDocument</tt> interface but was then moved to 
	 * the <tt>Document</tt> interface in DOM Level 2.</p>
	 * @param elementId The value of the <tt>id</tt> attribute of the desired element.
	 * @return The {@link JsElement} node that represents the document element with the 
	 * specified <tt>id</tt> attribute or <tt>null</tt> if no such element is found.
	 * @since 1.0
	 * @see #getElementsByTagName(StringLike)
	 * @see #getElementById(String)
	 * @see JsHTMLDocument#getElementsByName(String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsElement getElementById(StringLike elementId) {
		return getElementById(Js.valueOf(elementId));
	}
	/**
	 * <p>Returns an array, technically a {@link JsNodeList} object, of all {@link JsElement} 
	 * nodes in this document that have the specified tag name by traversing the entire 
	 * document. The {@link JsElement} nodes appear in the returned array in the same 
	 * order in which they appear in the document source.</p>
	 * <p>Note that the {@link JsElement#getElementsByTagName(String)} method works 
	 * just like this one but that traverses just the descendants of a single element, 
	 * rather than the entire document. Do not confuse this method with {@link JsHTMLDocument#getElementsByName(String)}, 
	 * which searches for elements based on the value of their <tt>name</tt> attributes 
	 * rather than by their tag names.</p>
	 * @param name The tag name of the desired elements, or the value "*" to specify 
	 * that all descendant elements should be returned, regardless of their tag names.
	 * @return An read-only array, technically a {@link JsNodeList} object, of all 
	 * {@link JsElement} nodes in this document that have the specified tag name.
	 * @since 1.0
	 * @see #getElementsByTagName(StringLike)
	 * @see #getElementById(String)
	 * @see JsElement#getElementsByTagName(String)
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
	 * nodes in this document that have the specified tag name by traversing the entire 
	 * document. The {@link JsElement} nodes appear in the returned array in the same 
	 * order in which they appear in the document source.</p>
	 * <p>Note that the {@link JsElement#getElementsByTagName(StringLike)} method works 
	 * just like this one but that traverses just the descendants of a single element, 
	 * rather than the entire document. Do not confuse this method with {@link JsHTMLDocument#getElementsByName(StringLike)}, 
	 * which searches for elements based on the value of their <tt>name</tt> attributes 
	 * rather than by their tag names.</p>
	 * @param name The tag name of the desired elements, or the value "*" to specify 
	 * that all descendant elements should be returned, regardless of their tag names.
	 * @return A read-only array, technically a {@link JsNodeList} object, of all 
	 * {@link JsElement} nodes in this document that have the specified tag name.
	 * @since 1.0
	 * @see #getElementsByTagName(String)
	 * @see #getElementById(StringLike)
	 * @see JsElement#getElementsByTagName(StringLike)
	 * @see JsHTMLDocument#getElementsByName(StringLike)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsNodeList<? extends JsElement> getElementsByTagName(StringLike name) {
		return getElementsByTagName(Js.valueOf(name));
	}
	/**
	 * <p>Returns an array of all {@link JsElement} nodes that have the specified tag 
	 * name and name-space.</p>
	 * <p>This method works like {@link #getElementsByTagName(String)}, except that the 
	 * tag name of the desired elements is specified as a combination of a name space 
	 * URI and a local name defined within that name space. This method is useful only 
	 * with XML documents that use name spaces.</p>
	 * @param namespaceURI The URI that uniquely identifies the name space of the 
	 * desired elements.
	 * @param localName The identifier that specifies the name of the desired elements 
	 * within its name space.
	 * @return A read-only array, technically a {@link JsNodeList} object, of all {@link JsElement} 
	 * nodes in this document that have the specified name and namespace.
	 * @since 1.0
	 * @see JsElement#getElementsByTagNameNS(String, String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsNodeList<? extends JsElement> getElementsByTagNameNS(String namespaceURI, String localName) {
		return new JsNodeList<JsElement>(call(getElementsByTagNameNS, new Vars<Object>().add(namespaceURI).add(localName)));
	}
	/**
	 * <p>Creates a new {@link JsAttr} node with the specified name.</p>
	 * @param name The name for the attribute to be created. 
	 * @return A newly created {@link JsAttr} node with its {@link JsNode#nodeName} 
	 * property set to <tt>name</tt>. 
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#INVALID_CHARACTER_ERR} 
	 * if <tt>name</tt> contains an illegal character. See {@link Js#err(Object)} for 
	 * JS Simulation.
	 * @since 1.0
	 * @see #createAttribute(StringLike)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsAttr createAttribute(String name) {
		return new JsAttr(call(createAttribute, name));
	}
	/**
	 * <p>Creates a new {@link JsAttr} node with the specified name.</p>
	 * @param name The name for the attribute to be created. 
	 * @return A newly created {@link JsAttr} node with its {@link JsNode#nodeName} 
	 * property set to <tt>name</tt>. 
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#INVALID_CHARACTER_ERR} 
	 * if <tt>name</tt> contains an illegal character. See {@link Js#err(Object)} for 
	 * JS Simulation.
	 * @since 1.0
	 * @see #createAttribute(String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsAttr createAttribute(StringLike name) {
		return createAttribute(Js.valueOf(name));
	}
	/**
	 * <p>Creates a new {@link JsAttr} node with the specified name and name space.</p>
	 * <p>This method is just like {@link #createAttribute(String)}, except that the 
	 * created {@link JsAttr} node has a name and name space instead of just a name. 
	 * This method is useful only with XML documents that use name spaces.</p>
	 * @param namespaceURI The unique identifier of the name space for the {@link JsAttr} 
	 * node being created or null for no name space. 
	 * @param qualifiedName The qualified name of the attribute, which should include 
	 * a name space prefix, a colon, and a local name. 
	 * @return A newly created {@link JsAttr} node with the specified name and name 
	 * space. 
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#INVALID_CHARACTER_ERR} 
	 * if <tt>qualifiedName</tt> contains an illegal character, the value {@link JsDOMException#NAMESPACE_ERR} 
	 * if <tt>qualifiedName</tt> is malformed or there is a mismatch between <tt>qualifiedName</tt> 
	 * and <tt>namespaceURI</tt>, or the value {@link JsDOMException#NOT_SUPPORTED_ERR} 
	 * if the implementation does not support XML documents and therefore does not implement 
	 * this method. See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see #createAttribute(String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsAttr createAttributeNS(String namespaceURI, String qualifiedName) {
		return new JsAttr(call(createAttributeNS, new Vars<Object>().add(namespaceURI).add(qualifiedName)));
	}
	/**
	 * <p>Creates a new {@link JsCDATASection} node containing the specified text.</p>
	 * @param data The text of the {@link JsCDATASection} node being created. 
	 * @return A newly created {@link JsCDATASection} node with the specified <tt>data</tt> 
	 * as its contents. 
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NOT_SUPPORTED_ERR} 
	 * if HTML documents do not allow <tt>CDATASection</tt> nodes. See {@link Js#err(Object)} 
	 * for JS Simulation.
	 * @since 1.0
	 * @see #createCDATASection(StringLike)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsCDATASection createCDATASection(String data) {
		return new JsCDATASection(call(createCDATASection, data));
	}
	/**
	 * <p>Creates a new {@link JsCDATASection} node containing the specified text.</p>
	 * @param data The text of the {@link JsCDATASection} node being created. 
	 * @return A newly created {@link JsCDATASection} node with the specified <tt>data</tt> 
	 * as its contents. 
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NOT_SUPPORTED_ERR} 
	 * if HTML documents do not allow <tt>CDATASection</tt> nodes. See {@link Js#err(Object)} 
	 * for JS Simulation.
	 * @since 1.0
	 * @see #createCDATASection(String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsCDATASection createCDATASection(StringLike data) {
		return createCDATASection(Js.valueOf(data));
	}
	/**
	 * <p>Creates a new {@link JsComment} node containing the specified string.</p>
	 * @param data The text of the {@link JsComment} node being created. 
	 * @return A newly created {@link JsComment} node with the specified <tt>data</tt> 
	 * as its text. 
	 * @since 1.0
	 * @see #createComment(StringLike)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsComment createComment(String data) {
		return new JsComment(call(createComment, data));
	}
	/**
	 * <p>Creates a new {@link JsComment} node containing the specified string.</p>
	 * @param data The text of the {@link JsComment} node being created. 
	 * @return A newly created {@link JsComment} node with the specified <tt>data</tt> 
	 * as its text. 
	 * @since 1.0
	 * @see #createComment(String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsComment createComment(StringLike data) {
		return createComment(Js.valueOf(data));
	}
	/**
	 * <p>Creates a new, empty {@link JsDocumentFragment} node.</p>
	 * @return A newly created {@link JsDocumentFragment} node with no children. 
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsDocumentFragment createDocumentFragment() {
		return new JsDocumentFragment(call(createDocumentFragment));
	}
	/**
	 * <p>Creates a new {@link JsElement} node with the specified tag name.</p>
	 * @param tagName The tag name of the {@link JsElement} node being created. Since 
	 * HTML tags are case-insensitive, you may use any capitalization for HTML tag names. 
	 * XML tag names are case-sensitive. 
	 * @return A newly created {@link JsElement} node with the specified tag name. 
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#INVALID_CHARACTER_ERR} 
	 * if <tt>tagName</tt> contains an illegal character. See {@link Js#err(Object)} 
	 * for JS Simulation.
	 * @since 1.0
	 * @see #createElement(StringLike)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public JsElement createElement(String tagName) {
		return new JsElement(call(createElement, tagName));
	}
	/**
	 * <p>Creates a new {@link JsElement} node with the specified tag name.</p>
	 * @param tagName The tag name of the {@link JsElement} node being created. Since 
	 * HTML tags are case-insensitive, you may use any capitalization for HTML tag names. 
	 * XML tag names are case-sensitive. 
	 * @return A newly created {@link JsElement} node with the specified tag name. 
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#INVALID_CHARACTER_ERR} 
	 * if <tt>tagName</tt> contains an illegal character. See {@link Js#err(Object)} 
	 * for JS Simulation.
	 * @since 1.0
	 * @see #createElement(String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public JsElement createElement(StringLike tagName) {
		return createElement(Js.valueOf(tagName));
	}
	/**
	 * <p>Creates a new {@link JsElement} node with the specified tag name and name-space.</p>
	 * <p>This method is just like {@link #createElement(String)}, except that the 
	 * created {@link JsElement} node has a name and name space instead of just a name. 
	 * This method is useful only with XML documents that use name spaces.</p>
	 * @param namespaceURI The unique identifier for the name space of the new {@link JsElement} 
	 * node or <tt>null</tt> for no name space. 
	 * @param qualifiedName The qualified name of the new {@link JsElement} node. This 
	 * should include a name space prefix, a colon, and a local name. 
	 * @return A newly created {@link JsElement} node with the specified tag name and 
	 * name space. 
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#INVALID_CHARACTER_ERR} 
	 * if <tt>qualifiedName</tt> contains an illegal character, the value {@link JsDOMException#NAMESPACE_ERR} 
	 * if <tt>qualifiedName</tt> is malformed or there is a mismatch between <tt>qualifiedName</tt> 
	 * and <tt>namespaceURI</tt>, or the value {@link JsDOMException#NOT_SUPPORTED_ERR} 
	 * if the implementation does not support XML documents and therefore does not implement 
	 * this method. See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see #createElement(String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsElement createElementNS(String namespaceURI, String qualifiedName) {
		return new JsElement(call(createElementNS, new Vars<Object>().add(namespaceURI).add(qualifiedName)));
	}
	/**
	 * <p>Creates a {@link JsEntityReference} object.</p>
	 * <p>If the referenced entity is known, the child list of the {@link JsEntityReference} 
	 * node is made the same as that of the corresponding {@link JsEntity} node.</p>
	 * <p>Note that this method is not supported by main-stream web browsers.</p>
	 * @param name The name of the entity to reference. 
	 * @return A newly created {@link JsEntityReference} object. 
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#INVALID_CHARACTER_ERR} 
	 * if the specified <tt>name</tt> contains an illegal character or the value {@link JsDOMException#NOT_SUPPORTED_ERR} 
	 * if this document is an HTML document. See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsEntityReference createEntityReference(String name) {
		throw new UnsupportedOperationException();
	}
	/**
	 * <p>Creates a new synthetic {@link JsEvent} object of the named type.</p>
	 * <p>In DOM Specification, this method is actually defined not by the DOM <tt>Document</tt> 
	 * interface but by the <tt>DocumentEvent</tt> interface. If an implementation 
	 * supports the Events module, the <tt>Document</tt> object always implements the 
	 * <tt>DocumentEvent</tt> interface and supports this method. Note that Internet 
	 * Explorer does not support the DOM Events module.</p>
	 * @param eventType The name of the event module for which an {@link JsEvent} object 
	 * is desired. Note that the value of this argument should not be the (singular) name 
	 * of the DOM event interface to be created but instead should be the (plural) name of 
	 * the DOM module that defines that interface. Valid event types are listed as follows:
	 * <ul>
	 * <li>HTMLEvents: creating a {@link JsEvent} object that must be initialized with 
	 * the initialization method {@link JsEvent#initEvent(String, Boolean, Boolean)}.</li>
	 * <li>MouseEvents: creating a {@link JsMouseEvent} object that must be initialized with 
	 * the initialization method {@link JsMouseEvent#initMouseEvent(String, Boolean, Boolean, JsWindow, Number, Number, Number, Number, Number, Boolean, Boolean, Boolean, Boolean, Number, JsElement)}.</li>
	 * <li>UIEvents: creating a {@link JsUIEvent} object that must be initialized with 
	 * the initialization method {@link JsUIEvent#initUIEvent(String, Boolean, Boolean, JsWindow, Long)}.</li>
	 * </ul> 
	 * @return A newly created {@link JsEvent} object of the specified type. 
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NOT_SUPPORTED_ERR} 
	 * if the implementation does not support events of the requested type. See {@link Js#err(Object)} 
	 * for JS Simulation.
	 * @since 1.0
	 * @see #createEvent(StringLike)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsEvent createEvent(String eventType) {
		return new JsEvent(call(createEvent, eventType));
	}
	/**
	 * <p>Creates a new synthetic {@link JsEvent} object of the named type.</p>
	 * <p>In DOM Specification, this method is actually defined not by the DOM <tt>Document</tt> 
	 * interface but by the <tt>DocumentEvent</tt> interface. If an implementation 
	 * supports the Events module, the <tt>Document</tt> object always implements the 
	 * <tt>DocumentEvent</tt> interface and supports this method. Note that Internet 
	 * Explorer does not support the DOM Events module.</p>
	 * @param eventType The name of the event module for which an {@link JsEvent} object 
	 * is desired. Note that the value of this argument should not be the (singular) name 
	 * of the DOM event interface to be created but instead should be the (plural) name of 
	 * the DOM module that defines that interface. Valid event types are listed as follows:
	 * <ul>
	 * <li>HTMLEvents: creating a {@link JsEvent} object that must be initialized with 
	 * the initialization method {@link JsEvent#initEvent(String, Boolean, Boolean)}.</li>
	 * <li>MouseEvents: creating a {@link JsMouseEvent} object that must be initialized with 
	 * the initialization method {@link JsMouseEvent#initMouseEvent(String, Boolean, Boolean, JsWindow, Number, Number, Number, Number, Number, Boolean, Boolean, Boolean, Boolean, Number, JsElement)}.</li>
	 * <li>UIEvents: creating a {@link JsUIEvent} object that must be initialized with 
	 * the initialization method {@link JsUIEvent#initUIEvent(String, Boolean, Boolean, JsWindow, Long)}.</li>
	 * </ul> 
	 * @return A newly created {@link JsEvent} object of the specified type. 
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NOT_SUPPORTED_ERR} 
	 * if the implementation does not support events of the requested type. See {@link Js#err(Object)} 
	 * for JS Simulation.
	 * @since 1.0
	 * @see #createEvent(String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsEvent createEvent(StringLike eventType) {
		return createEvent(Js.valueOf(eventType));
	}
	/**
	 * <p>Creates a new {@link JsXPathExpression} object that represents a compiled 
	 * <tt>XPath</tt> query.</p>
	 * <p>Note that Internet Explorer does not support this method. See {@link JsNode#selectNodes(String)} 
	 * for an IE-specific alternative.</p>
	 * @param xpathText The string representing the XPath expression to compile.
	 * @param namespaceURLMapper A function that will map from a name space prefix to a 
	 * full name space URL, or <tt>null</tt> if no such mapping is required.
	 * @return A newly created {@link JsXPathExpression} object. 
	 * @throws RuntimeException JavaScript throws a {@link JsError} object if the <tt>xpathText</tt> 
	 * contains a syntax error or if it uses a name space prefix that cannot be resolved 
	 * by <tt>namespaceURLMapper</tt>. See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see JsNode#selectNodes(String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsXPathExpression createExpression(String xpathText, JsFunction<? extends String> namespaceURLMapper) {
		return new JsXPathExpression(call(createExpression, new Vars<Object>().add(xpathText).add(namespaceURLMapper)));
	}
	/**
	 * <p>Creates a new {@link JsXPathExpression} object that represents a compiled 
	 * <tt>XPath</tt> query.</p>
	 * <p>Note that Internet Explorer does not support this method. See {@link JsNode#selectNodes(String)} 
	 * for an IE-specific alternative.</p>
	 * @param xpathText The string representing the XPath expression to compile.
	 * @return A newly created {@link JsXPathExpression} object. 
	 * @throws RuntimeException JavaScript throws a {@link JsError} object if the <tt>xpathText</tt> 
	 * contains a syntax error. See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see #evaluate(String, JsNode, JsFunction, Number, JsXPathResult)
	 * @see JsNode#selectNodes(String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsXPathExpression createExpression(String xpathText) {
		return new JsXPathExpression(call(createExpression, new Vars<Object>().add(xpathText).add(null)));
	}
	/**
	 * <p>Creates a new {@link JsProcessingInstruction} node with the specified target 
	 * and data string.</p>
	 * @param target The target of the processing instruction.
	 * @param data The content text of the processing instruction.
	 * @return A newly created {@link JsProcessingInstruction} node. 
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#INVALID_CHARACTER_ERR} 
	 * if <tt>target</tt> contains an illegal character, the value {@link JsDOMException#NOT_SUPPORTED_ERR} 
	 * if this is an HTML document and does not support processing instructions. See 
	 * {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsProcessingInstruction createProcessingInstruction(String target, String data) {
		return new JsProcessingInstruction(call(createProcessingInstruction, new Vars<Object>().add(target).add(data)));
	}
	/**
	 * <p>Creates a new {@link JsRange} object.</p>
	 * <p>This method creates a {@link JsRange} object that can be used to represent a 
	 * region of this document or of a {@link JsDocumentFragment} associated with this 
	 * document.</p>
	 * <p>This method is technically part of the <tt>DocumentRange</tt> interface in DOM2 
	 * specification. It is implemented by the {@link JsDocument} object only in 
	 * implementations that support the {@link JsRange} module. That is in the DOM Specification 
	 * this method is actually defined not by the DOM <tt>Document</tt> interface but by 
	 * the <tt>DocumentRange</tt> interface. If an implementation supports the <tt>Range</tt> 
	 * module, the {@link JsDocument} object always implements <tt>DocumentRange</tt> and 
	 * defines this method. Internet Explorer does not support this module.</p>
	 * @return A newly created {@link JsRange} object with both boundary points set to the 
	 * beginning of the document. 
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsRange createRange() {
		return new JsRange(call(createRange));
	}
	/**
	 * <p>Creates a style sheet for the document.</p>
	 * <p>This method is IE specific.</p>
	 * @param url Specifies how to add the style sheet to the document. If a file name is 
	 * specified for the argument, the style information will be added as a {@link JsHTMLLinkElement} 
	 * object. If the argument contains style information, this information will be added 
	 * to the style object.
	 * @param index Specifies the index that indicates where the new style sheet is inserted 
	 * in the {@link #styleSheets} collection. The default is to insert the new style sheet 
	 * at the end of the collection.
	 * @return A newly created {@link JsCSSStyleSheet} object. 
	 * @since 1.0
	 * @see #createStyleSheet(String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsCSSStyleSheet createStyleSheet(String url, int index) {
		return new JsCSSStyleSheet(call(createStyleSheet, new Vars<Object>().add(url).add(index)));
	}
	/**
	 * <p>Creates a style sheet for the document.</p>
	 * <p>This method is IE specific.</p>
	 * @param url Specifies how to add the style sheet to the document. If a file name is 
	 * specified for the argument, the style information will be added as a {@link JsHTMLLinkElement} 
	 * object. If the argument contains style information, this information will be added 
	 * to the style object.
	 * @return A newly created {@link JsCSSStyleSheet} object. 
	 * @since 1.0
	 * @see #createStyleSheet(String, int)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsCSSStyleSheet createStyleSheet(String url) {
		return new JsCSSStyleSheet(call(createStyleSheet, url));
	}
	/**
	 * <p>Creates a new {@link JsText} node to represent the specified text.</p>
	 * @param data The content of the {@link JsText} node to create.
	 * @return A newly created {@link JsText} node that represents the specified <tt>data</tt> 
	 * string. 
	 * @since 1.0
	 * @see #createTextNode(StringLike)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsText createTextNode(String data) {
		return new JsText(call(createTextNode, data));
	}
	/**
	 * <p>Creates a new {@link JsText} node to represent the specified text.</p>
	 * @param data The content of the {@link JsText} node to create.
	 * @return A newly created {@link JsText} node that represents the specified <tt>data</tt> 
	 * string. 
	 * @since 1.0
	 * @see #createTextNode(String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsText createTextNode(StringLike data) {
		return createTextNode(Js.valueOf(data));
	}
	/**
	 * <p>Evaluates an XPath query against this document.</p>
	 * <p>This method evaluates the specified XPath expression against the given context 
	 * node and returns an {@link JsXPathResult} object, using <tt>resultType</tt> to 
	 * determine what the result type should be. If you want to evaluate an expression 
	 * more than once, use {@link #createExpression(String)} to compile the expression 
	 * to a {@link JsXPathExpression} object and then use the {@link JsXPathExpression#evaluate(JsNode, Number, JsXPathResult)} 
	 * method of that object.</p>
	 * <p>See {@link JsNode#selectNodes(String)} and {@link JsNode#selectSingleNode(String)} 
	 * for an IE-specific alternative.</p>
	 * @param xpathText The string representing the XPath expression to evaluate.
	 * @param contextNode The node in this document against which the expression is to 
	 * be evaluated.
	 * @param namespaceURLMapper A function that will map from a name space prefix to a 
	 * full name space URL or <tt>null</tt> if no such mapping is required.
	 * @param resultType The type of object expected as a result, using XPath conversions 
	 * to coerce the result. Possible values for the type are the constants defined by 
	 * {@link JsClient#XPathResult} object.
	 * @param result A {@link JsXPathResult} object to be reused or <tt>null</tt> if you 
	 * want a new {@link JsXPathResult} object to be created.
	 * @return A {@link JsXPathResult} object representing the evaluation of the expression 
	 * against the given context node. 
	 * @throws RuntimeException JavaScript throws a {@link JsError} object if the <tt>xpathText</tt> 
	 * contains a syntax error, if the result of the expression cannot be converted to 
	 * the desired <tt>resultType</tt>, if the expression contains a name space prefix 
	 * that cannot be resolved by <tt>namespaceURLMapper</tt>, or if <tt>contextNode</tt> is of 
	 * the wrong type or is not associated with this document. See {@link Js#err(Object)} for 
	 * JS Simulation.
	 * @since 1.0
	 * @see #createExpression(String, JsFunction)
	 * @see JsNode#selectNodes(String)
	 * @see JsNode#selectSingleNode(String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsXPathResult evaluate(String xpathText, JsNode contextNode, JsFunction<? extends String> namespaceURLMapper, Number resultType, JsXPathResult result) {
		return new JsXPathResult(call(evaluate, new Vars<Object>().add(xpathText).add(contextNode).add(namespaceURLMapper).add(resultType).add(result)));
	}
	/**
	 * <p>Makes a copy of a node from some other document that is suitable for 
	 * insertion into this document.</p>
	 * <p>This method is passed a node defined in another document and returns a copy of 
	 * the node that is suitable for insertion into this document. If <tt>deep</tt> is 
	 * <tt>true</tt>, all descendants of the node are also copied. The original node and 
	 * its descendants are not modified in any way. The returned copy has its {@link JsNode#ownerDocument} 
	 * property set to this document but has a {@link JsNode#parentNode} of <tt>null</tt> 
	 * because it has not yet been inserted into the document. Event listener functions 
	 * registered on the original node or tree are not copied.</p>
	 * <p>When an {@link JsElement} node is imported, only the attributes that are 
	 * explicitly specified in the source document are imported with it. When an {@link JsAttr} 
	 * node is imported, its {@link JsAttr#specified} property is automatically set to 
	 * <tt>true</tt>.</p>
	 * @param importedNode The node to be imported.
	 * @param deep If <tt>true</tt>, recursively copy all descendants of <tt>importedNode</tt> 
	 * as well.
	 * @return A copy of <tt>importedNode</tt>, and possibly all of its descendants if 
	 * <tt>deep</tt> is <tt>true</tt>, with its {@link JsNode#ownerDocument} set to this 
	 * document. 
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NOT_SUPPORTED_ERR} 
	 * if <tt>importedNode</tt> is a {@link JsDocument} or {@link JsDocumentType} node, 
	 * because those types of nodes cannot be imported. See {@link Js#err(Object)} for 
	 * JS Simulation.
	 * @since 1.0
	 * @see JsNode#cloneNode(Boolean)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsNode importNode(JsNode importedNode, Boolean deep) {
		return new JsNode(call(importNode, new Vars<Object>().add(importedNode).add(deep)));
	}
	/**
	 * <p>Parses a string of XML mark-up and stores the result in this document object.</p>
	 * <p>This IE-specific method parses the specified string of XML text and builds a 
	 * tree of DOM nodes in the current {@link JsDocument} object, discarding any nodes 
	 * that previously existed in the {@link JsDocument} object.</p>
	 * <p>This method does not exist on {@link JsDocument} objects that represent HTML 
	 * documents. Before calling the method, you typically create a new, empty {@link JsDocument} 
	 * object to hold the parsed content:
	 * <pre> JsDocument doc = new JsDocument(Js.activeX("MSXML2.DOMDocument"));
	 * doc.loadXML(markup);</pre>
	 * </p>
	 * <p>See {@link JsDOMParser#parseFromString(String, String)} for a non-IE 
	 * alternative.</p>
	 * @param text The XML mark-up to parse.
	 * @since 1.0
	 * @see #loadXML(StringLike)
	 * @see JsDOMParser#parseFromString(String, String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void loadXML(String text) {
		call(loadXML, text);
	}
	/**
	 * <p>Parses a string of XML mark-up and stores the result in this document object.</p>
	 * <p>This IE-specific method parses the specified string of XML text and builds a 
	 * tree of DOM nodes in the current {@link JsDocument} object, discarding any nodes 
	 * that previously existed in the {@link JsDocument} object.</p>
	 * <p>This method does not exist on {@link JsDocument} objects that represent HTML 
	 * documents. Before calling the method, you typically create a new, empty {@link JsDocument} 
	 * object to hold the parsed content:
	 * <pre> JsDocument doc = new JsDocument(Js.activeX("MSXML2.DOMDocument"));
	 * doc.loadXML(markup);</pre>
	 * </p>
	 * <p>See {@link JsDOMParser#parseFromString(String, String)} for a non-IE 
	 * alternative.</p>
	 * @param text The XML mark-up to parse.
	 * @since 1.0
	 * @see #loadXML(String)
	 * @see JsDOMParser#parseFromString(String, String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void loadXML(StringLike text) {
		loadXML(Js.valueOf(text));
	}
	/**
	 * <p>Executes a command on the current document, current selection, or the given range.</p>
	 * <p>This method is IE specific. Do not invoke the method until after the page loads.</p>
	 * @param sCommand A required string that specifies the command to execute. 
	 * This command can be any of the command identifiers that can be executed in script.
	 * @param bUserInterface Optional. <tt>false</tt> or undefined for not displaying a 
	 * user interface; <tt>true</tt> to display a user interface, if the command 
	 * supports one.
	 * @param vValue Optional. Possible values depend on <tt>sCommand</tt>.
	 * @return <tt>True</tt> if the command is successful.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final boolean execCommand(String sCommand, Boolean bUserInterface, Object vValue) {
		return call(execCommand, new Vars<Object>().add(sCommand ).add(bUserInterface).add(vValue));
	}
}
