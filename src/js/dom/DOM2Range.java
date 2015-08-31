
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
 * <p>An <b>opaque</b> interface for DOM Level 2 Range implementors.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public interface DOM2Range
{
	/**
	 * <p>An <b>opaque</b> class representing the global <tt>Range</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class Range extends JsClass
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
			 * @see DOM2Range.Range#START_TO_START
			 * @see DOM2Range.Range.Member#START_TO_START
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid START_TO_START = id("START_TO_START");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Range.Range#START_TO_END
			 * @see DOM2Range.Range.Member#START_TO_END
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid START_TO_END   = id("START_TO_END"  );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Range.Range#END_TO_END
			 * @see DOM2Range.Range.Member#END_TO_END
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid END_TO_END     = id("END_TO_END"    );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Range.Range#END_TO_START
			 * @see DOM2Range.Range.Member#END_TO_START
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid END_TO_START   = id("END_TO_START"  );
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
			public Range with(ObjectLike o) {
				return new Range(super.with(o));
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
			public Range with() {
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
			public final Value.Number.Member START_TO_START = new Value.Number.Member(this, Members.START_TO_START);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member START_TO_END   = new Value.Number.Member(this, Members.START_TO_END  );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member END_TO_END     = new Value.Number.Member(this, Members.END_TO_END    );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member END_TO_START   = new Value.Number.Member(this, Members.END_TO_START  );

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
		public Range(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member START_TO_START = new Value.Number.Member(Members.START_TO_START);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member START_TO_END   = new Value.Number.Member(Members.START_TO_END  );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member END_TO_END     = new Value.Number.Member(Members.END_TO_END    );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member END_TO_START   = new Value.Number.Member(Members.END_TO_START  );

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
				 * @see DOM2Range.Range.Prototype#cloneContents
				 * @see DOM2Range.Range.Prototype.Member#cloneContents
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid cloneContents            = id("cloneContents"           );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Range.Range.Prototype#cloneRange
				 * @see DOM2Range.Range.Prototype.Member#cloneRange
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid cloneRange               = id("cloneRange"              );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Range.Range.Prototype#collapse
				 * @see DOM2Range.Range.Prototype.Member#collapse
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid collapse                 = id("collapse"                );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Range.Range.Prototype#createContextualFragment
				 * @see DOM2Range.Range.Prototype.Member#createContextualFragment
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid createContextualFragment = id("createContextualFragment");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Range.Range.Prototype#compareBoundaryPoints
				 * @see DOM2Range.Range.Prototype.Member#compareBoundaryPoints
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid compareBoundaryPoints    = id("compareBoundaryPoints"   );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Range.Range.Prototype#deleteContents
				 * @see DOM2Range.Range.Prototype.Member#deleteContents
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid deleteContents           = id("deleteContents"          );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Range.Range.Prototype#detach
				 * @see DOM2Range.Range.Prototype.Member#detach
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid detach                   = id("detach"                  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Range.Range.Prototype#extractContents
				 * @see DOM2Range.Range.Prototype.Member#extractContents
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid extractContents          = id("extractContents"         );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Range.Range.Prototype#insertNode
				 * @see DOM2Range.Range.Prototype.Member#insertNode
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid insertNode               = id("insertNode"              );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Range.Range.Prototype#selectNode
				 * @see DOM2Range.Range.Prototype.Member#selectNode
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid selectNode               = id("selectNode"              );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Range.Range.Prototype#selectNodeContents
				 * @see DOM2Range.Range.Prototype.Member#selectNodeContents
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid selectNodeContents       = id("selectNodeContents"      );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Range.Range.Prototype#setEnd
				 * @see DOM2Range.Range.Prototype.Member#setEnd
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid setEnd                   = id("setEnd"                  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Range.Range.Prototype#setEndAfter
				 * @see DOM2Range.Range.Prototype.Member#setEndAfter
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid setEndAfter              = id("setEndAfter"             );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Range.Range.Prototype#setEndBefore
				 * @see DOM2Range.Range.Prototype.Member#setEndBefore
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid setEndBefore             = id("setEndBefore"            );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Range.Range.Prototype#setStart
				 * @see DOM2Range.Range.Prototype.Member#setStart
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid setStart                 = id("setStart"                );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Range.Range.Prototype#setStartAfter
				 * @see DOM2Range.Range.Prototype.Member#setStartAfter
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid setStartAfter            = id("setStartAfter"           );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Range.Range.Prototype#setStartBefore
				 * @see DOM2Range.Range.Prototype.Member#setStartBefore
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid setStartBefore           = id("setStartBefore"          );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Range.Range.Prototype#surroundContents
				 * @see DOM2Range.Range.Prototype.Member#surroundContents
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid surroundContents         = id("surroundContents"        );
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
				 * @see JsRange#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsRange> valueOf = new JsFunction.Member<JsRange>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsRange#collapse(Boolean)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> collapse           = new JsFunction.Member<java.lang.Object>(this, Members.collapse          );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsRange#deleteContents()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> deleteContents     = new JsFunction.Member<java.lang.Object>(this, Members.deleteContents    );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsRange#detach()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> detach             = new JsFunction.Member<java.lang.Object>(this, Members.detach            );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsRange#insertNode(JsNode)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> insertNode         = new JsFunction.Member<java.lang.Object>(this, Members.insertNode        );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsRange#selectNode(JsNode)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> selectNode         = new JsFunction.Member<java.lang.Object>(this, Members.selectNode        );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsRange#selectNodeContents(JsNode)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> selectNodeContents = new JsFunction.Member<java.lang.Object>(this, Members.selectNodeContents);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsRange#setEnd(JsNode, Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> setEnd             = new JsFunction.Member<java.lang.Object>(this, Members.setEnd            );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsRange#setEndAfter(JsNode)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> setEndAfter        = new JsFunction.Member<java.lang.Object>(this, Members.setEndAfter       );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsRange#setEndBefore(JsNode)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> setEndBefore       = new JsFunction.Member<java.lang.Object>(this, Members.setEndBefore      );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsRange#setStart(JsNode, Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> setStart           = new JsFunction.Member<java.lang.Object>(this, Members.setStart          );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsRange#setStartAfter(JsNode)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> setStartAfter      = new JsFunction.Member<java.lang.Object>(this, Members.setStartAfter     );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsRange#setStartBefore(JsNode)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> setStartBefore     = new JsFunction.Member<java.lang.Object>(this, Members.setStartBefore    );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsRange#surroundContents(JsNode)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> surroundContents   = new JsFunction.Member<java.lang.Object>(this, Members.surroundContents  );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsRange#cloneRange()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsRange> cloneRange = new JsFunction.Member<JsRange>(this, Members.cloneRange);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsRange#compareBoundaryPoints(Number, JsRange)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> compareBoundaryPoints = new JsFunction.Member<java.lang.Number>(this, Members.compareBoundaryPoints);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsRange#createContextualFragment(String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsNode> createContextualFragment = new JsFunction.Member<JsNode>(this, Members.createContextualFragment);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsRange#cloneContents()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsDocumentFragment> cloneContents   = new JsFunction.Member<JsDocumentFragment>(this, Members.cloneContents  );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsRange#extractContents()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsDocumentFragment> extractContents = new JsFunction.Member<JsDocumentFragment>(this, Members.extractContents);
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
			 * @see JsRange#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsRange> valueOf = new JsFunction.Member<JsRange>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsRange#collapse(Boolean)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> collapse           = new JsFunction.Member<java.lang.Object>(Members.collapse          );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsRange#deleteContents()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> deleteContents     = new JsFunction.Member<java.lang.Object>(Members.deleteContents    );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsRange#detach()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> detach             = new JsFunction.Member<java.lang.Object>(Members.detach            );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsRange#insertNode(JsNode)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> insertNode         = new JsFunction.Member<java.lang.Object>(Members.insertNode        );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsRange#selectNode(JsNode)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> selectNode         = new JsFunction.Member<java.lang.Object>(Members.selectNode        );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsRange#selectNodeContents(JsNode)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> selectNodeContents = new JsFunction.Member<java.lang.Object>(Members.selectNodeContents);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsRange#setEnd(JsNode, Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> setEnd             = new JsFunction.Member<java.lang.Object>(Members.setEnd            );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsRange#setEndAfter(JsNode)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> setEndAfter        = new JsFunction.Member<java.lang.Object>(Members.setEndAfter       );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsRange#setEndBefore(JsNode)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> setEndBefore       = new JsFunction.Member<java.lang.Object>(Members.setEndBefore      );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsRange#setStart(JsNode, Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> setStart           = new JsFunction.Member<java.lang.Object>(Members.setStart          );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsRange#setStartAfter(JsNode)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> setStartAfter      = new JsFunction.Member<java.lang.Object>(Members.setStartAfter     );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsRange#setStartBefore(JsNode)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> setStartBefore     = new JsFunction.Member<java.lang.Object>(Members.setStartBefore    );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsRange#surroundContents(JsNode)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> surroundContents   = new JsFunction.Member<java.lang.Object>(Members.surroundContents  );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsRange#cloneRange()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsRange> cloneRange = new JsFunction.Member<JsRange>(Members.cloneRange);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsRange#compareBoundaryPoints(Number, JsRange)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> compareBoundaryPoints = new JsFunction.Member<java.lang.Number>(Members.compareBoundaryPoints);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsRange#createContextualFragment(String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsNode> createContextualFragment = new JsFunction.Member<JsNode>(Members.createContextualFragment);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsRange#cloneContents()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsDocumentFragment> cloneContents   = new JsFunction.Member<JsDocumentFragment>(Members.cloneContents  );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsRange#extractContents()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsDocumentFragment> extractContents = new JsFunction.Member<JsDocumentFragment>(Members.extractContents);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>RangeException</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class RangeException extends JsClass
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
			 * @see DOM2Range.RangeException#BAD_BOUNDARYPOINTS_ERR
			 * @see DOM2Range.RangeException.Member#BAD_BOUNDARYPOINTS_ERR
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid BAD_BOUNDARYPOINTS_ERR = id("BAD_BOUNDARYPOINTS_ERR");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Range.RangeException#INVALID_NODE_TYPE_ERR
			 * @see DOM2Range.RangeException.Member#INVALID_NODE_TYPE_ERR
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid INVALID_NODE_TYPE_ERR = id("INVALID_NODE_TYPE_ERR");
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
			public RangeException with(ObjectLike o) {
				return new RangeException(super.with(o));
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
			public RangeException with() {
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
			 * @see JsRangeException#BAD_BOUNDARYPOINTS_ERR
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Short.Member BAD_BOUNDARYPOINTS_ERR = new Value.Short.Member(this, Members.BAD_BOUNDARYPOINTS_ERR);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsRangeException#INVALID_NODE_TYPE_ERR
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Short.Member INVALID_NODE_TYPE_ERR = new Value.Short.Member(this, Members.INVALID_NODE_TYPE_ERR);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public RangeException(JsObject var) {
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
		 * @see JsRangeException#BAD_BOUNDARYPOINTS_ERR
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Short.Member BAD_BOUNDARYPOINTS_ERR = new Value.Short.Member(Members.BAD_BOUNDARYPOINTS_ERR);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsRangeException#INVALID_NODE_TYPE_ERR
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Short.Member INVALID_NODE_TYPE_ERR = new Value.Short.Member(Members.INVALID_NODE_TYPE_ERR);

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
				 * @see JsDocumentType#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsRangeException> valueOf = new JsFunction.Member<JsRangeException>(this, Members.valueOf);
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
			 * @see JsDocumentType#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsRangeException> valueOf = new JsFunction.Member<JsRangeException>(Members.valueOf);
		}
	}
}
