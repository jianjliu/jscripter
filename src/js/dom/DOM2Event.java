
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

package js.dom;

import js.*;
import js.core.*;
import js.user.*;

/**
 * <p>An <b>opaque</b> interface for DOM Level 2 Event implementors.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public interface DOM2Event
{
	/**
	 * <p>An <b>opaque</b> class representing the global <tt>Event</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class Event extends JsClass
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
		protected static abstract class Members extends JsClass.Members
		{
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Event.Event#CAPTURING_PHASE
			 * @see DOM2Event.Event.Member#CAPTURING_PHASE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			protected static final Mid CAPTURING_PHASE = id("CAPTURING_PHASE");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Event.Event#AT_TARGET
			 * @see DOM2Event.Event.Member#AT_TARGET
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			protected static final Mid AT_TARGET       = id("AT_TARGET"      );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Event.Event#BUBBLING_PHASE
			 * @see DOM2Event.Event.Member#BUBBLING_PHASE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			protected static final Mid BUBBLING_PHASE  = id("BUBBLING_PHASE" );
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public Event with(ObjectLike o) {
				return new Event(super.with(o));
			}
			@Override
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
			public Event with() {
				return with(Js.win());
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
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsEvent#CAPTURING_PHASE
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member CAPTURING_PHASE = new Value.Number.Member(this, Members.CAPTURING_PHASE);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsEvent#AT_TARGET
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member AT_TARGET       = new Value.Number.Member(this, Members.AT_TARGET      );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsEvent#BUBBLING_PHASE
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member BUBBLING_PHASE  = new Value.Number.Member(this, Members.BUBBLING_PHASE );
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public Event(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsEvent#CAPTURING_PHASE
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member CAPTURING_PHASE = new Value.Number.Member(Members.CAPTURING_PHASE);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsEvent#AT_TARGET
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member AT_TARGET       = new Value.Number.Member(Members.AT_TARGET      );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsEvent#BUBBLING_PHASE
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member BUBBLING_PHASE  = new Value.Number.Member(Members.BUBBLING_PHASE );

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsObject
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
			protected static abstract class Members extends JsObject.Members
			{
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Event.Event.Prototype#initEvent
				 * @see DOM2Event.Event.Prototype.Member#initEvent
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid initEvent       = id("initEvent"      );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Event.Event.Prototype#preventDefault
				 * @see DOM2Event.Event.Prototype.Member#preventDefault
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid preventDefault  = id("preventDefault" );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Event.Event.Prototype#stopPropagation
				 * @see DOM2Event.Event.Prototype.Member#stopPropagation
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid stopPropagation = id("stopPropagation");
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
			public static class Member extends JsObject.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsEvent#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsEvent> valueOf = new JsFunction.Member<JsEvent>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsEvent#initEvent(String, Boolean, Boolean)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> initEvent = new JsFunction.Member<java.lang.Object>(this, Members.initEvent);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsEvent#preventDefault()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> preventDefault = new JsFunction.Member<java.lang.Object>(this, Members.preventDefault);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsEvent#stopPropagation()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> stopPropagation = new JsFunction.Member<java.lang.Object>(this, Members.stopPropagation);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsEvent#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsEvent> valueOf = new JsFunction.Member<JsEvent>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsEvent#initEvent(String, Boolean, Boolean)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> initEvent = new JsFunction.Member<java.lang.Object>(Members.initEvent);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsEvent#preventDefault()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> preventDefault = new JsFunction.Member<java.lang.Object>(Members.preventDefault);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsEvent#stopPropagation()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> stopPropagation = new JsFunction.Member<java.lang.Object>(Members.stopPropagation);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>UIEvent</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class UIEvent extends JsClass
	{
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public UIEvent with(ObjectLike o) {
				return new UIEvent(super.with(o));
			}
			@Override
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
			public UIEvent with() {
				return with(Js.win());
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
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public UIEvent(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsEvent
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
			protected static abstract class Members extends JsEvent.Members
			{
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Event.UIEvent.Prototype#initUIEvent
				 * @see DOM2Event.UIEvent.Prototype.Member#initUIEvent
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid initUIEvent = id("initUIEvent");
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
			public static class Member extends JsEvent.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsUIEvent#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsUIEvent> valueOf = new JsFunction.Member<JsUIEvent>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsUIEvent#initUIEvent(String, Boolean, Boolean, JsWindow, Long)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> initUIEvent = new JsFunction.Member<java.lang.Object>(this, Members.initUIEvent);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsUIEvent#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsUIEvent> valueOf = new JsFunction.Member<JsUIEvent>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsUIEvent#initUIEvent(String, Boolean, Boolean, JsWindow, Long)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> initUIEvent = new JsFunction.Member<java.lang.Object>(Members.initUIEvent);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>KeyEvent</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class KeyEvent extends JsClass
	{
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public KeyEvent with(ObjectLike o) {
				return new KeyEvent(super.with(o));
			}
			@Override
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
			public KeyEvent with() {
				return with(Js.win());
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
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public KeyEvent(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsUIEvent
		{
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
			public static class Member extends JsUIEvent.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsKeyEvent#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsKeyEvent> valueOf = new JsFunction.Member<JsKeyEvent>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsKeyEvent#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsKeyEvent> valueOf = new JsFunction.Member<JsKeyEvent>(Members.valueOf);
		}
	}
	/**
	 * <p>An <b>opaque</b> class representing the global <tt>MouseEvent</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class MouseEvent extends JsClass
	{
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public MouseEvent with(ObjectLike o) {
				return new MouseEvent(super.with(o));
			}
			@Override
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
			public MouseEvent with() {
				return with(Js.win());
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
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public MouseEvent(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsUIEvent
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
			protected static abstract class Members extends JsUIEvent.Members
			{
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Event.MouseEvent.Prototype#initMouseEvent
				 * @see DOM2Event.MouseEvent.Prototype.Member#initMouseEvent
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid initMouseEvent = id("initMouseEvent");
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
			public static class Member extends JsUIEvent.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsMouseEvent#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsMouseEvent> valueOf = new JsFunction.Member<JsMouseEvent>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsMouseEvent#initMouseEvent(String, Boolean, Boolean, JsWindow, Number, Number, Number, Number, Number, Boolean, Boolean, Boolean, Boolean, Number, JsElement)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> initMouseEvent = new JsFunction.Member<java.lang.Object>(this, Members.initMouseEvent);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsMouseEvent#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsMouseEvent> valueOf = new JsFunction.Member<JsMouseEvent>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsMouseEvent#initMouseEvent(String, Boolean, Boolean, JsWindow, Number, Number, Number, Number, Number, Boolean, Boolean, Boolean, Boolean, Number, JsElement)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> initMouseEvent = new JsFunction.Member<java.lang.Object>(Members.initMouseEvent);
		}
	}
}
