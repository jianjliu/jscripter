
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

/**
 * <p>An <b>opaque</b> class representing JavaScript client-side objects of the global 
 * {@link JsClient#Event} class.</p>
 * <p>The {@link JsEvent} object properties, identified by the members of this class, 
 * provide details about an event. The methods of a {@link JsEvent} object can control 
 * the propagation of the event. The DOM Level 2 Events standard defines a standard 
 * event model, which is implemented by all modern browsers except Internet Explorer, 
 * which defines its own, incompatible model. The members defined in this class identify 
 * the properties of both the standard {@link JsEvent} object and also of the IE {@link JsEvent} 
 * object.</p>
 * <p>For the standard event model, the subclasses of this class define additional 
 * property members that provide details pertinent to specific types of events. The IE 
 * event model defines a completely different set of properties for an event and does 
 * not define an inheritance hierarchy for different types of events, so all property 
 * members relevant to any type of event are defined in this single class which is used 
 * for events of all types.</p>
 * <p>Note that an {@link JsEvent} object is passed to event handler functions in the 
 * {@link JsWindow#event} property of the 
 * {@link JsWindow#window}, in the IE event 
 * model.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsEvent extends JsClient.Event.Prototype
{
	/**
	 * A legal value for the {@link #eventPhase} property of a {@link JsEvent} object 
	 * indicating currently the propagation of the event is in the capturing phase.
	 * @since 1.0
	 * @see js.dom.DOM2Event.Event#CAPTURING_PHASE
	 * @see js.dom.DOM2Event.Event.Member#CAPTURING_PHASE
	 */
	public static final int CAPTURING_PHASE = 1;
	/**
	 * A legal value for the {@link #eventPhase} property of a {@link JsEvent} object 
	 * indicating currently the propagation of the event is in the normal event 
	 * dispatching phase.
	 * @since 1.0
	 * @see js.dom.DOM2Event.Event#AT_TARGET
	 * @see js.dom.DOM2Event.Event.Member#AT_TARGET
	 */
	public static final int AT_TARGET       = 2;
	/**
	 * A legal value for the {@link #eventPhase} property of a {@link JsEvent} object 
	 * indicating currently the propagation of the event is in the bubbling phase.
	 * @since 1.0
	 * @see js.dom.DOM2Event.Event#BUBBLING_PHASE
	 * @see js.dom.DOM2Event.Event.Member#BUBBLING_PHASE
	 */
	public static final int BUBBLING_PHASE  = 3;
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
	protected static abstract class Members extends JsClient.Event.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#bubbles
		 * @see JsEvent.Member#bubbles
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid bubbles       = id("bubbles"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#cancelable
		 * @see JsEvent.Member#cancelable
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid cancelable    = id("cancelable"   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#currentTarget
		 * @see JsEvent.Member#currentTarget
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid currentTarget = id("currentTarget");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#eventPhase
		 * @see JsEvent.Member#eventPhase
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid eventPhase    = id("eventPhase"   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#target
		 * @see JsEvent.Member#target
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid target        = id("target"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#timeStamp
		 * @see JsEvent.Member#timeStamp
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid timeStamp     = id("timeStamp"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#type
		 * @see JsEvent.Member#type
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid type          = id("type"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#altKey
		 * @see JsEvent.Member#altKey
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid altKey        = id("altKey"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#button
		 * @see JsEvent.Member#button
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid button        = id("button"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#cancelBubble
		 * @see JsEvent.Member#cancelBubble
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid cancelBubble  = id("cancelBubble" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#clientX
		 * @see JsEvent.Member#clientX
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid clientX       = id("clientX"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#clientY
		 * @see JsEvent.Member#clientY
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid clientY       = id("clientY"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#ctrlKey
		 * @see JsEvent.Member#ctrlKey
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid ctrlKey       = id("ctrlKey"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#fromElement
		 * @see JsEvent.Member#fromElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid fromElement   = id("fromElement"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#keyCode
		 * @see JsEvent.Member#keyCode
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid keyCode       = id("keyCode"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#offsetX
		 * @see JsEvent.Member#offsetX
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid offsetX       = id("offsetX"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#offsetY
		 * @see JsEvent.Member#offsetY
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid offsetY       = id("offsetY"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#returnValue
		 * @see JsEvent.Member#returnValue
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid returnValue   = id("returnValue"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#screenX
		 * @see JsEvent.Member#screenX
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid screenX       = id("screenX"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#screenY
		 * @see JsEvent.Member#screenY
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid screenY       = id("screenY"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#shiftKey
		 * @see JsEvent.Member#shiftKey
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid shiftKey      = id("shiftKey"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#srcElement
		 * @see JsEvent.Member#srcElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid srcElement    = id("srcElement"   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#toElement
		 * @see JsEvent.Member#toElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid toElement     = id("toElement"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#x
		 * @see JsEvent.Member#x
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid x             = id("x"            );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#y
		 * @see JsEvent.Member#y
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid y             = id("y"            );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#pageX
		 * @see JsEvent.Member#pageX
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid pageX         = id("pageX"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#pageY
		 * @see JsEvent.Member#pageY
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid pageY         = id("pageY"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#time
		 * @see JsEvent.Member#time
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid time          = id("time"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsEvent#charCode
		 * @see JsEvent.Member#charCode
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid charCode      = id("charCode"     );
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
	public static class Member extends JsClient.Event.Prototype.Member
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
		public JsEvent with(ObjectLike o) {
			return new JsEvent(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object 
		 * refers to a read-only boolean value that is <tt>true<tt>, if the event is of 
		 * a type that bubbles unless {@link JsEvent#stopPropagation()} is called on the 
		 * event, or <tt>false</tt> otherwise.</p>
		 * <p>The property is defined by the DOM Level 2 Events standard.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member bubbles    = new Value.Boolean.Member(this, Members.bubbles   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object 
		 * refers to a read-only boolean value that is <tt>true<tt>, if the the default action 
		 * associated with the event can be canceled with {@link JsEvent#preventDefault()}, 
		 * or <tt>false</tt> otherwise.</p>
		 * <p>The property is defined by the DOM Level 2 Events standard.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member cancelable = new Value.Boolean.Member(this, Members.cancelable);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * read-only reference to the {@link JsElement}, {@link JsDocument}, or {@link JsWindow} 
		 * object that is currently handling this event. During capturing and bubbling, 
		 * it is different from {@link JsEvent#target} property.</p>
		 * <p>The property is defined by the DOM Level 2 Events standard.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsObject.Member currentTarget  = new JsObject.Member(this, Members.currentTarget);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * read-only reference to the {@link JsElement}, {@link JsDocument}, or {@link JsWindow} 
		 * object that generated the event.</p>
		 * <p>The property is defined by the DOM Level 2 Events standard.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsObject.Member target         = new JsObject.Member(this, Members.target       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * read-only reference to a {@link JsDate} object representing the date and 
		 * time at which the event occurred or, more precisely, at which the {@link JsEvent} 
		 * object was created. Implementations are not required to provide valid time 
		 * data in this field, and if they do not, the {@link JsDate#getTime()} method of 
		 * the {@link JsDate} object should return 0.</p>
		 * <p>The property is defined by the DOM Level 2 Events standard.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsDate.Member timeStamp     = new JsDate.Member(this, Members.timeStamp);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object 
		 * refers to a read-only number indicating the current phase of event propagation. 
		 * The legal value of the property is {@link JsEvent#CAPTURING_PHASE}, {@link JsEvent#AT_TARGET}, 
		 * or {@link JsEvent#BUBBLING_PHASE} representing the capturing phase, normal event dispatch, 
		 * and the bubbling phase respectively.</p>
		 * <p>The property is defined by the DOM Level 2 Events standard.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member eventPhase  = new Value.Number.Member(this, Members.eventPhase);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * read-only reference to the name of the event that the {@link JsEvent} object 
		 * represents. This is the name under which the event handler was registered, or 
		 * the name of the event-handler property with the leading "on" removed.</p>
		 * <p>The property is defined by the DOM Level 2 Events standard.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member type        = new Value.String.Member(this, Members.type      );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * reference to a boolean value which tells whether the <tt>Alt</tt> key was 
		 * held down when the event occurred.</p>
		 * <p>Note that the property is IE-Specific.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member altKey       = new Value.Boolean.Member(this, Members.altKey       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * reference to a boolean value which determines whether the event must be stopped 
		 * from being propagated up to containing objects.</p> 
		 * <p>Note that the property is IE-Specific.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member cancelBubble = new Value.Boolean.Member(this, Members.cancelBubble );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * reference to a boolean value which tells whether the <tt>Ctrl</tt> key was 
		 * held down when the event occurred.</p>
		 * <p>Note that the property is IE-Specific.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member ctrlKey      = new Value.Boolean.Member(this, Members.ctrlKey      );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * reference to a boolean value. If the property is set, its value takes precedence 
		 * over the value actually returned by the event handler. Set it to <tt>false</tt> 
		 * to cancel the default action of the source element on which the event 
		 * occurred.</p>
		 * <p>Note that the property is IE-Specific.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member returnValue  = new Value.Boolean.Member(this, Members.returnValue  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * reference to a boolean value which tells whether the <tt>Shift</tt> key was 
		 * held down when the event occurred.</p>
		 * <p>Note that the property is IE-Specific.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member shiftKey     = new Value.Boolean.Member(this, Members.shiftKey     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * reference to the object from which the mouse pointer is moving for 
		 * "mouseover" and "mouseout" events.</p> 
		 * <p>Note that the property is IE-Specific.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsElement.Member fromElement  = new JsElement.Member(this, Members.fromElement  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * reference to the object into which the mouse pointer is moving for 
		 * "mouseover" and "mouseout" events.</p> 
		 * <p>Note that the property is IE-Specific.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsElement.Member toElement    = new JsElement.Member(this, Members.toElement    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * reference to an integer value. For mouse events, the bit mask value specifies 
		 * which mouse button or buttons were pressed. The 1 bit is set if the left button 
		 * was pressed; The 2 bit is set if the right button was pressed; and the 4 bit 
		 * is set if the middle button, of a three-button mouse, was pressed.</p> 
		 * <p>Note that the property is IE-Specific.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Integer.Member button  = new Value.Integer.Member(this, Members.button );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * reference to an integer value representing the X-coordinate, relative to the 
		 * web browser page, at which the event occurred.</p> 
		 * <p>Note that the property is IE-Specific.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member clientX = new Value.Number.Member(this, Members.clientX);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * reference to an integer value representing the Y-coordinate, relative to the 
		 * web browser page, at which the event occurred.</p> 
		 * <p>Note that the property is IE-Specific.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member clientY = new Value.Number.Member(this, Members.clientY);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * reference to an integer value representing the unicode character code 
		 * generated by the key that was struck for "keypress" events. For "keydown" 
		 * and "keyup" events, it represents the virtual key code of the key that was 
		 * struck. Virtual key codes may be dependent on the keyboard layout in use.</p> 
		 * <p>Note that the property is IE-Specific.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Integer.Member keyCode = new Value.Integer.Member(this, Members.keyCode);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * reference to an integer value representing the X-coordinate at which the 
		 * event occurred within the coordinate system of the event's source element.</p> 
		 * <p>Note that the property is IE-Specific.</p>
		 * @since 1.0
		 * @see #srcElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member offsetX = new Value.Number.Member(this, Members.offsetX);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * reference to an integer value representing the Y-coordinate at which the 
		 * event occurred within the coordinate system of the event's source element.</p> 
		 * <p>Note that the property is IE-Specific.</p>
		 * @since 1.0
		 * @see #srcElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member offsetY = new Value.Number.Member(this, Members.offsetY);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * reference to an integer value representing the X-coordinate at which the 
		 * event occurred relative to the document or the innermost containing element 
		 * that is dynamically positioned using CSS.</p> 
		 * <p>Note that the property is IE-Specific.</p>
		 * @since 1.0
		 * @see #x
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member pageX   = new Value.Number.Member(this, Members.pageX  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * reference to an integer value representing the Y-coordinate at which the 
		 * event occurred relative to the document or the innermost containing element 
		 * that is dynamically positioned using CSS.</p> 
		 * <p>Note that the property is IE-Specific.</p>
		 * @since 1.0
		 * @see #y
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member pageY   = new Value.Number.Member(this, Members.pageY  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * reference to an integer value representing the X-coordinate, relative to the 
		 * screen, at which the event occurred.</p> 
		 * <p>Note that the property is IE-Specific.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member screenX = new Value.Number.Member(this, Members.screenX);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * reference to an integer value representing the Y-coordinate, relative to the 
		 * screen, at which the event occurred.</p> 
		 * <p>Note that the property is IE-Specific.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member screenY = new Value.Number.Member(this, Members.screenY);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * reference to an integer value representing the X-coordinate at which the 
		 * event occurred relative to the document or the innermost containing element 
		 * that is dynamically positioned using CSS.</p> 
		 * <p>Note that the property is IE-Specific.</p>
		 * @since 1.0
		 * @see #pageX
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member x       = new Value.Number.Member(this, Members.x      );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object is 
		 * reference to an integer value representing the Y-coordinate at which the 
		 * event occurred relative to the document or the innermost containing element 
		 * that is dynamically positioned using CSS.</p> 
		 * <p>Note that the property is IE-Specific.</p>
		 * @since 1.0
		 * @see #pageY
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member y       = new Value.Number.Member(this, Members.y      );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>Note that the property is IE-Specific.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member time = new Value.Number.Member(this, Members.time   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>Note that the property is IE-Specific.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsObject.Member srcElement = new JsObject.Member(this, Members.srcElement);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsEvent} object 
		 * refers to a read-only integer value specifying the unicode encoding of the 
		 * printable character (if any) generated by a "keypress" event. This property 
		 * is 0 for non-printable function keys and is not used for "keydown" and "keyup" 
		 * events. Use {@link js.core.JsGlobal.String#fromCharCode(Object)} to convert this 
		 * property to a string.</p>
		 * <p>Note that the property is IE-Specific.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member charCode = new Value.Number.Member(this, Members.charCode);
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsEvent(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object 
	 * refers to a read-only boolean value that is <tt>true<tt>, if the event is of 
	 * a type that bubbles unless {@link #stopPropagation()} is called on the 
	 * event, or <tt>false</tt> otherwise.</p>
	 * <p>Note that the property is defined by the DOM Level 2 Events standard.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member bubbles    = new Value.Boolean.Member(Members.bubbles   );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object 
	 * refers to a read-only boolean value that is <tt>true<tt>, if the the default action 
	 * associated with the event can be canceled with {@link JsEvent#preventDefault()}, 
	 * or <tt>false</tt> otherwise.</p>
	 * <p>Note that the property is defined by the DOM Level 2 Events standard.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member cancelable = new Value.Boolean.Member(Members.cancelable);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * read-only reference to the {@link JsElement}, {@link JsDocument}, or {@link JsWindow} 
	 * object that is currently handling this event. During capturing and bubbling, 
	 * it is different from {@link JsEvent#target} property.</p>
	 * <p>Note that the property is defined by the DOM Level 2 Events standard.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsObject.Member currentTarget  = new JsObject.Member(Members.currentTarget);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * read-only reference to the {@link JsElement}, {@link JsDocument}, or {@link JsWindow} 
	 * object that generated the event.</p>
	 * <p>Note that the property is defined by the DOM Level 2 Events standard.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsObject.Member target         = new JsObject.Member(Members.target       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * read-only reference to a {@link JsDate} object representing the date and 
	 * time at which the event occurred or, more precisely, at which the {@link JsEvent} 
	 * object was created. Implementations are not required to provide valid time 
	 * data in this field, and if they do not, the {@link JsDate#getTime()} method of 
	 * the {@link JsDate} object should return 0.</p>
	 * <p>Note that the property is defined by the DOM Level 2 Events standard.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsDate.Member timeStamp     = new JsDate.Member(Members.timeStamp);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object 
	 * refers to a read-only number indicating the current phase of event propagation. 
	 * The legal value of the property is {@link #CAPTURING_PHASE}, {@link #AT_TARGET}, 
	 * or {@link #BUBBLING_PHASE} representing the capturing phase, normal event dispatch, 
	 * and the bubbling phase respectively.</p>
	 * <p>Note that the property is defined by the DOM Level 2 Events standard.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member eventPhase  = new Value.Number.Member(Members.eventPhase);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * read-only reference to the name of the event that the {@link JsEvent} object 
	 * represents. This is the name under which the event handler was registered, or 
	 * the name of the event-handler property with the leading "on" removed.</p>
	 * <p>Note that the property is defined by the DOM Level 2 Events standard.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member type        = new Value.String.Member(Members.type      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * reference to a boolean value which tells whether the <tt>Alt</tt> key was 
	 * held down when the event occurred.</p>
	 * <p>Note that the property is IE-Specific.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member altKey       = new Value.Boolean.Member(Members.altKey       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * reference to a boolean value which determines whether the event must be stopped 
	 * from being propagated up to containing objects.</p> 
	 * <p>Note that the property is IE-Specific.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member cancelBubble = new Value.Boolean.Member(Members.cancelBubble );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * reference to a boolean value which tells whether the <tt>Ctrl</tt> key was 
	 * held down when the event occurred.</p>
	 * <p>Note that the property is IE-Specific.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member ctrlKey      = new Value.Boolean.Member(Members.ctrlKey      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * reference to a boolean value. If the property is set, its value takes precedence 
	 * over the value actually returned by the event handler. Set it to <tt>false</tt> 
	 * to cancel the default action of the source element on which the event 
	 * occurred.</p>
	 * <p>Note that the property is IE-Specific.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member returnValue  = new Value.Boolean.Member(Members.returnValue  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * reference to a boolean value which tells whether the <tt>Shift</tt> key was 
	 * held down when the event occurred.</p>
	 * <p>Note that the property is IE-Specific.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member shiftKey     = new Value.Boolean.Member(Members.shiftKey     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * reference to the object from which the mouse pointer is moving for 
	 * "mouseover" and "mouseout" events.</p> 
	 * <p>Note that the property is IE-Specific.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsElement.Member fromElement  = new JsElement.Member(Members.fromElement  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * reference to the object into which the mouse pointer is moving for 
	 * "mouseover" and "mouseout" events.</p> 
	 * <p>Note that the property is IE-Specific.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsElement.Member toElement    = new JsElement.Member(Members.toElement    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>Note that the property is IE-Specific.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * reference to an integer value. For mouse events, the bit mask value specifies 
	 * which mouse button or buttons were pressed. The 1 bit is set if the left button 
	 * was pressed; The 2 bit is set if the right button was pressed; and the 4 bit 
	 * is set if the middle button, of a three-button mouse, was pressed.</p> 
	 * <p>Note that the property is IE-Specific.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Integer.Member button  = new Value.Integer.Member(Members.button );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * reference to an integer value representing the X-coordinate, relative to the 
	 * web browser page, at which the event occurred.</p> 
	 * <p>Note that the property is IE-Specific.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member clientX = new Value.Number.Member(Members.clientX);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * reference to an integer value representing the Y-coordinate, relative to the 
	 * web browser page, at which the event occurred.</p> 
	 * <p>Note that the property is IE-Specific.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member clientY = new Value.Number.Member(Members.clientY);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * reference to an integer value representing the unicode character code 
	 * generated by the key that was struck for "keypress" events. For "keydown" 
	 * and "keyup" events, it represents the virtual key code of the key that was 
	 * struck. Virtual key codes may be dependent on the keyboard layout in use.</p> 
	 * <p>Note that the property is IE-Specific.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member keyCode = new Value.Number.Member(Members.keyCode);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * reference to an integer value representing the X-coordinate at which the 
	 * event occurred within the coordinate system of the event's source element.</p> 
	 * <p>Note that the property is IE-Specific.</p>
	 * @since 1.0
	 * @see #srcElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member offsetX = new Value.Number.Member(Members.offsetX);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * reference to an integer value representing the Y-coordinate at which the 
	 * event occurred within the coordinate system of the event's source element.</p> 
	 * <p>Note that the property is IE-Specific.</p>
	 * @since 1.0
	 * @see #srcElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member offsetY = new Value.Number.Member(Members.offsetY);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * reference to an integer value representing the X-coordinate at which the 
	 * event occurred relative to the document or the innermost containing element 
	 * that is dynamically positioned using CSS.</p> 
	 * <p>Note that the property is IE-Specific.</p>
	 * @since 1.0
	 * @see #x
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member pageX   = new Value.Number.Member(Members.pageX  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * reference to an integer value representing the Y-coordinate at which the 
	 * event occurred relative to the document or the innermost containing element 
	 * that is dynamically positioned using CSS.</p> 
	 * <p>Note that the property is IE-Specific.</p>
	 * @since 1.0
	 * @see #y
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member pageY   = new Value.Number.Member(Members.pageY  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * reference to an integer value representing the X-coordinate, relative to the 
	 * screen, at which the event occurred.</p> 
	 * <p>Note that the property is IE-Specific.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member screenX = new Value.Number.Member(Members.screenX);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * reference to an integer value representing the Y-coordinate, relative to the 
	 * screen, at which the event occurred.</p> 
	 * <p>Note that the property is IE-Specific.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member screenY = new Value.Number.Member(Members.screenY);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * reference to an integer value representing the X-coordinate at which the 
	 * event occurred relative to the document or the innermost containing element 
	 * that is dynamically positioned using CSS.</p> 
	 * <p>Note that the property is IE-Specific.</p>
	 * @since 1.0
	 * @see #pageX
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member x       = new Value.Number.Member(Members.x      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object is 
	 * reference to an integer value representing the Y-coordinate at which the 
	 * event occurred relative to the document or the innermost containing element 
	 * that is dynamically positioned using CSS.</p> 
	 * <p>Note that the property is IE-Specific.</p>
	 * @since 1.0
	 * @see #pageY
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member y       = new Value.Number.Member(Members.y      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>Note that the property is IE-Specific.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member time = new Value.Number.Member(Members.time);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>Note that the property is IE-Specific.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsObject.Member srcElement = new JsObject.Member(Members.srcElement);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsEvent} object 
	 * refers to a read-only integer value specifying the unicode encoding of the 
	 * printable character (if any) generated by a "keypress" event. This property 
	 * is 0 for non-printable function keys and is not used for "keydown" and "keyup" 
	 * events. Use {@link js.core.JsGlobal.String#fromCharCode(Object)} to convert this 
	 * property to a string.</p>
	 * <p>Note that the property is IE-Specific.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member charCode = new Value.Number.Member(Members.charCode);

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
	public JsEvent valueOf() {
		return new JsEvent((JsObject)var().valueOf());
	}

	/**
	 * <p>Initializes the properties of a newly created {@link JsEvent} object.</p>
	 * <p>This method initializes the {@link #type}, {@link #bubbles}, and {@link #cancelable} 
	 * properties of a synthetic {@link JsEvent} object created by {@link JsDocument#createEvent(String)}. 
	 * This method may be called on newly created {@link JsEvent} objects only before 
	 * they have been dispatched with the {@link JsDocument#dispatchEvent(JsEvent)} or 
	 * {@link JsElement#dispatchEvent(JsEvent)} method of the {@link JsDocument} or {@link JsElement} 
	 * objects.</p>
	 * @param eventType The type of event. This may be one of the predefined event types, 
	 * such as "load" or "submit", or it may be a custom type of your own choosing. 
	 * Names that begin with "DOM" are reserved, however.
	 * @param canBubble Specifies whether the event will bubble.
	 * @param cancelable Specifies whether the event can be canceled with {@link #preventDefault()}.
	 * @since 1.0
	 * @see JsDocument#createEvent(String)
	 * @see JsMouseEvent#initMouseEvent(String, Boolean, Boolean, JsWindow, Number, Number, Number, Number, Number, Boolean, Boolean, Boolean, Boolean, Number, JsElement)
	 * @see JsUIEvent#initUIEvent(String, Boolean, Boolean, JsWindow, Long)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void initEvent(String eventType, Boolean canBubble, Boolean cancelable) {
		call(initEvent, new Vars<Object>().add(eventType).add(canBubble).add(cancelable));
	}
	/**
	 * <p>Tells the web browser not to perform the default action associated with this 
	 * event, if there is one.</p>
	 * <p>Note that if the {@link #cancelable} property of a {@link JsEvent} object is 
	 * <tt>false</tt>, either there is no default action or there is a default action 
	 * that cannot be prevented, calling this method has no effect.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void preventDefault() {
		call(preventDefault);
	}
	/**
	 * <p>Stops the event from propagating any further through the capturing, target, or 
	 * bubbling phases of event propagation.</p>
	 * <p>After this method is called, any other event handlers for the same event on 
	 * the same node are called, but the event is not dispatched to any other nodes.</p>
	 * <p>This method stops the propagation of an event and prevents it from being 
	 * dispatched to any other {@link JsDocument} nodes. It may be called during any 
	 * phase of event propagation. Note that this method does not prevent other event 
	 * handlers on the same {@link JsDocument} node from being called, but it does 
	 * prevent the event from being dispatched to any other nodes.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void stopPropagation() {
		call(stopPropagation);
	}
}
