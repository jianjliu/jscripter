
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
 * {@link JsClient#MouseEvent} class.</p>
 * <p>The class represents the events of types "click", "mousedown", "mousemove", "mouseout", 
 * "mouseover", and "mouseup". Note that in addition to the property members defined 
 * in this class, it also inherits the properties of {@link JsUIEvent} and {@link JsEvent}.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsMouseEvent extends JsClient.MouseEvent.Prototype
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
	protected static abstract class Members extends JsClient.MouseEvent.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsMouseEvent#altKey
		 * @see JsMouseEvent.Member#altKey
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid altKey        = id("altKey"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsMouseEvent#button
		 * @see JsMouseEvent.Member#button
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid button        = id("button"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsMouseEvent#clientX
		 * @see JsMouseEvent.Member#clientX
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid clientX       = id("clientX"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsMouseEvent#clientY
		 * @see JsMouseEvent.Member#clientY
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid clientY       = id("clientY"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsMouseEvent#ctrlKey
		 * @see JsMouseEvent.Member#ctrlKey
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid ctrlKey       = id("ctrlKey"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsMouseEvent#metaKey
		 * @see JsMouseEvent.Member#metaKey
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid metaKey       = id("metaKey"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsMouseEvent#relatedTarget
		 * @see JsMouseEvent.Member#relatedTarget
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid relatedTarget = id("relatedTarget");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsMouseEvent#screenX
		 * @see JsMouseEvent.Member#screenX
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid screenX       = id("screenX"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsMouseEvent#screenY
		 * @see JsMouseEvent.Member#screenY
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid screenY       = id("screenY"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsMouseEvent#shiftKey
		 * @see JsMouseEvent.Member#shiftKey
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid shiftKey      = id("shiftKey"     );
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
	public static class Member extends JsClient.MouseEvent.Prototype.Member
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
		public JsMouseEvent with(ObjectLike o) {
			return new JsMouseEvent(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsMouseEvent} object 
		 * refers to a read-only boolean value which tells whether the <tt>Alt</tt> key 
		 * was held down when the event occurred.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member altKey   = new Value.Boolean.Member(this, Members.altKey );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsMouseEvent} object 
		 * refers to a read-only boolean value which tells whether the <tt>Ctrl</tt> key 
		 * was held down when the event occurred.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member ctrlKey  = new Value.Boolean.Member(this, Members.ctrlKey);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsMouseEvent} object 
		 * refers to a read-only boolean value which tells whether the <tt>Meta</tt> key 
		 * was held down when the event occurred.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member metaKey  = new Value.Boolean.Member(this, Members.ctrlKey);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsMouseEvent} object 
		 * refers to a read-only boolean value which tells whether the <tt>Shift</tt> key 
		 * was held down when the event occurred.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member shiftKey = new Value.Boolean.Member(this, Members.metaKey);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsMouseEvent} object 
		 * refers to a read-only integer value which tells which mouse button changed 
		 * state during a "mousedown", "mouseup", or "click" event. A value of 0 indicates 
		 * the left button, a value of 2 indicates the right button, and a value of 1 
		 * indicates the middle mouse button. Note that this property is defined when 
		 * a button changes state; it is not used to report whether a button is held 
		 * down during a "mousemove" event. Also, this property is not a bitmap, that is, 
		 * it cannot tell you if more than one button is held down.</p>
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
		 * <p>The property, identified by this member, of a {@link JsMouseEvent} object 
		 * refers to a read-only integer value representing the X-coordinate of the 
		 * mouse pointer relative to the "client area", or browser window. Note that 
		 * this value does not take document scrolling into account; if an event occurs 
		 * at the very top of the window, the value is 0 regardless of how far down the 
		 * document has been scrolled.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Integer.Member clientX = new Value.Integer.Member(this, Members.clientX);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsMouseEvent} object 
		 * refers to a read-only integer value representing the Y-coordinate of the 
		 * mouse pointer relative to the "client area", or browser window. Note that 
		 * this value does not take document scrolling into account; if an event occurs 
		 * at the very top of the window, the value is 0 regardless of how far down the 
		 * document has been scrolled.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Integer.Member clientY = new Value.Integer.Member(this, Members.clientY);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsMouseEvent} object 
		 * refers to a read-only integer value representing the X-coordinate of the 
		 * mouse pointer relative to the upper-left corner of the user's monitor.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Integer.Member screenX = new Value.Integer.Member(this, Members.screenX);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsMouseEvent} object 
		 * refers to a read-only integer value representing the Y-coordinate of the 
		 * mouse pointer relative to the upper-left corner of the user's monitor.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Integer.Member screenY = new Value.Integer.Member(this, Members.screenY);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsMouseEvent} object is 
		 * a read-only reference to a {@link JsElement} node that is related to the 
		 * {@link JsEvent#target} node of the event. For "mouseover" events, it is the 
		 * {@link JsElement} object that the mouse left when it moved over the target. 
		 * For "mouseout" events, it is the {@link JsElement} object that the mouse 
		 * entered when leaving the target.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsElement.Member relatedTarget = new JsElement.Member(this, Members.relatedTarget);
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsMouseEvent(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsMouseEvent} object 
	 * refers to a read-only boolean value which tells whether the <tt>Alt</tt> key 
	 * was held down when the event occurred.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member altKey   = new Value.Boolean.Member(Members.altKey );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsMouseEvent} object 
	 * refers to a read-only boolean value which tells whether the <tt>Ctrl</tt> key 
	 * was held down when the event occurred.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member ctrlKey  = new Value.Boolean.Member(Members.ctrlKey);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsMouseEvent} object 
	 * refers to a read-only boolean value which tells whether the <tt>Meta</tt> key 
	 * was held down when the event occurred.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member metaKey  = new Value.Boolean.Member(Members.ctrlKey);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsMouseEvent} object 
	 * refers to a read-only boolean value which tells whether the <tt>Shift</tt> key 
	 * was held down when the event occurred.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member shiftKey = new Value.Boolean.Member(Members.metaKey);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsMouseEvent} object 
	 * refers to a read-only integer value which tells which mouse button changed 
	 * state during a "mousedown", "mouseup", or "click" event. A value of 0 indicates 
	 * the left button, a value of 2 indicates the right button, and a value of 1 
	 * indicates the middle mouse button. Note that this property is defined when 
	 * a button changes state; it is not used to report whether a button is held 
	 * down during a "mousemove" event. Also, this property is not a bitmap, that is, 
	 * it cannot tell you if more than one button is held down.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Integer.Member button  = new Value.Integer.Member(Members.button );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsMouseEvent} object 
	 * refers to a read-only integer value representing the X-coordinate of the 
	 * mouse pointer relative to the "client area", or browser window. Note that 
	 * this value does not take document scrolling into account; if an event occurs 
	 * at the very top of the window, the value is 0 regardless of how far down the 
	 * document has been scrolled.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Integer.Member clientX = new Value.Integer.Member(Members.clientX);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsMouseEvent} object 
	 * refers to a read-only integer value representing the Y-coordinate of the 
	 * mouse pointer relative to the "client area", or browser window. Note that 
	 * this value does not take document scrolling into account; if an event occurs 
	 * at the very top of the window, the value is 0 regardless of how far down the 
	 * document has been scrolled.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Integer.Member clientY = new Value.Integer.Member(Members.clientY);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsMouseEvent} object 
	 * refers to a read-only integer value representing the X-coordinate of the 
	 * mouse pointer relative to the upper-left corner of the user's monitor.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Integer.Member screenX = new Value.Integer.Member(Members.screenX);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsMouseEvent} object 
	 * refers to a read-only integer value representing the Y-coordinate of the 
	 * mouse pointer relative to the upper-left corner of the user's monitor.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Integer.Member screenY = new Value.Integer.Member(Members.screenY);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsMouseEvent} object is 
	 * a read-only reference to a {@link JsElement} node that is related to the 
	 * {@link JsEvent#target} node of the event. For "mouseover" events, it is the 
	 * {@link JsElement} object that the mouse left when it moved over the target. 
	 * For "mouseout" events, it is the {@link JsElement} object that the mouse 
	 * entered when leaving the target.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsElement.Member relatedTarget = new JsElement.Member(Members.relatedTarget);

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
	public JsMouseEvent valueOf() {
		return new JsMouseEvent((JsObject)var().valueOf());
	}

	/**
	 * <p>Initializes the properties of a newly created {@link JsMouseEvent} object.</p>
	 * <p>This method initializes the various properties of the {@link JsMouseEvent} 
	 * object and may be called only before it is passed to {@link JsElement#dispatchEvent(JsEvent)}.</p>
	 * @param eventType The type of event.
	 * @param canBubble Specifies whether the event will bubble.
	 * @param cancelable Specifies whether the event can be canceled with {@link JsEvent#preventDefault()}.
	 * @param view The {@link JsWindow} object in which the event occurred.
	 * @param detail The {@link JsUIEvent#detail} property for the event.
	 * @param screenX Specifies the initial value of the {@link #screenX} property of this {@link JsMouseEvent} object.
	 * @param screenY Specifies the initial value of the {@link #screenY} property of this {@link JsMouseEvent} object.
	 * @param clientX Specifies the initial value of the {@link #clientX} property of this {@link JsMouseEvent} object.
	 * @param clientY Specifies the initial value of the {@link #clientY} property of this {@link JsMouseEvent} object.
	 * @param ctrlKey Specifies the initial value of the {@link #ctrlKey} property of this {@link JsMouseEvent} object.
	 * @param altKey Specifies the initial value of the {@link #altKey} property of this {@link JsMouseEvent} object.
	 * @param shiftKey Specifies the initial value of the {@link #shiftKey} property of this {@link JsMouseEvent} object.
	 * @param metaKey Specifies the initial value of the {@link #metaKey} property of this {@link JsMouseEvent} object.
	 * @param button Specifies the initial value of the {@link #button} property of this {@link JsMouseEvent} object.
	 * @param relatedTarget Specifies the initial value of the {@link #relatedTarget} property of this {@link JsMouseEvent} object.
	 * @since 1.0
	 * @see JsDocument#createEvent(String)
	 * @see JsEvent#initEvent(String, Boolean, Boolean)
	 * @see JsUIEvent#initEvent(String, Boolean, Boolean)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void initMouseEvent(String eventType,
	                                 Boolean canBubble,
	                                 Boolean cancelable,
	                                 JsWindow view,
	                                 Number detail,
	                                 Number screenX,
	                                 Number screenY,
	                                 Number clientX,
	                                 Number clientY,
	                                 Boolean ctrlKey,
	                                 Boolean altKey,
	                                 Boolean shiftKey,
	                                 Boolean metaKey,
	                                 Number button,
	                                 JsElement relatedTarget) {
		call(initMouseEvent, new Vars<Object>().add(eventType)
	                                           .add(canBubble)
	                                           .add(cancelable)
	                                           .add(view)
	                                           .add(detail)
	                                           .add(screenX)
	                                           .add(screenY)
	                                           .add(clientX)
	                                           .add(clientY)
	                                           .add(ctrlKey)
	                                           .add(altKey)
	                                           .add(shiftKey)
	                                           .add(metaKey)
	                                           .add(button)
	                                           .add(relatedTarget)
		);
	}
}
