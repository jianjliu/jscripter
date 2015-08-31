
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
 * <p>An <b>opaque</b> interface for DOM Level 2 Core implementors.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public interface DOM2Core
{
	/**
	 * <p>An <b>opaque</b> class representing the global <tt>Attr</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class Attr extends JsClass
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
			public Attr with(ObjectLike o) {
				return new Attr(super.with(o));
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
			public Attr with() {
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
		public Attr(JsObject var) {
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
		public static class Prototype extends JsNode
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
			public static class Member extends JsNode.Member
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
				 * @see JsAttr#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsAttr> valueOf = new JsFunction.Member<JsAttr>(this, Members.valueOf);
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
			 * @see JsAttr#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsAttr> valueOf = new JsFunction.Member<JsAttr>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>CDATASection</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class CDATASection extends JsClass
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
			public CDATASection with(ObjectLike o) {
				return new CDATASection(super.with(o));
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
			public CDATASection with() {
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
		public CDATASection(JsObject var) {
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
		public static class Prototype extends JsText
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
			public static class Member extends JsText.Member
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
				 * @see JsCDATASection#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsCDATASection> valueOf = new JsFunction.Member<JsCDATASection>(this, Members.valueOf);
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
			 * @see JsCDATASection#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsCDATASection> valueOf = new JsFunction.Member<JsCDATASection>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>CharacterData</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class CharacterData extends JsClass
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
			public CharacterData with(ObjectLike o) {
				return new CharacterData(super.with(o));
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
			public CharacterData with() {
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
		public CharacterData(JsObject var) {
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
		public static class Prototype extends JsNode
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
			protected static abstract class Members extends JsNode.Members
			{
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.CharacterData.Prototype#appendData
				 * @see DOM2Core.CharacterData.Prototype.Member#appendData
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid appendData    = id("appendData"   );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.CharacterData.Prototype#deleteData
				 * @see DOM2Core.CharacterData.Prototype.Member#deleteData
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid deleteData    = id("deleteData"   );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.CharacterData.Prototype#insertData
				 * @see DOM2Core.CharacterData.Prototype.Member#insertData
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid insertData    = id("insertData"   );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.CharacterData.Prototype#replaceData
				 * @see DOM2Core.CharacterData.Prototype.Member#replaceData
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid replaceData   = id("replaceData"  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.CharacterData.Prototype#substringData
				 * @see DOM2Core.CharacterData.Prototype.Member#substringData
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid substringData = id("substringData");
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
			public static class Member extends JsNode.Member
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
				 * @see JsCharacterData#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsCharacterData> valueOf = new JsFunction.Member<JsCharacterData>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCharacterData#appendData(String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> appendData  = new JsFunction.Member<java.lang.Object>(this, Members.appendData );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCharacterData#deleteData(Number, Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> deleteData  = new JsFunction.Member<java.lang.Object>(this, Members.deleteData );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCharacterData#insertData(Number, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> insertData  = new JsFunction.Member<java.lang.Object>(this, Members.insertData );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCharacterData#replaceData(Number, Number, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> replaceData = new JsFunction.Member<java.lang.Object>(this, Members.replaceData);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCharacterData#substringData(Number, Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String> substringData = new JsFunction.Member<java.lang.String>(this, Members.substringData);
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
			 * @see JsCharacterData#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsCharacterData> valueOf = new JsFunction.Member<JsCharacterData>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCharacterData#appendData(String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> appendData  = new JsFunction.Member<java.lang.Object>(Members.appendData );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCharacterData#deleteData(Number, Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> deleteData  = new JsFunction.Member<java.lang.Object>(Members.deleteData );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCharacterData#insertData(Number, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> insertData  = new JsFunction.Member<java.lang.Object>(Members.insertData );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCharacterData#replaceData(Number, Number, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> replaceData = new JsFunction.Member<java.lang.Object>(Members.replaceData);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCharacterData#substringData(Number, Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String> substringData = new JsFunction.Member<java.lang.String>(Members.substringData);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>Comment</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class Comment extends JsClass
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
			public Comment with(ObjectLike o) {
				return new Comment(super.with(o));
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
			public Comment with() {
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
		public Comment(JsObject var) {
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
		public static class Prototype extends JsCharacterData
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
			public static class Member extends JsCharacterData.Member
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
				 * @see JsComment#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsComment> valueOf = new JsFunction.Member<JsComment>(this, Members.valueOf);
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
			 * @see JsComment#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsComment> valueOf = new JsFunction.Member<JsComment>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>Document</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class Document extends JsClass
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
			public Document with(ObjectLike o) {
				return new Document(super.with(o));
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
			public Document with() {
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
		public Document(JsObject var) {
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
		public static class Prototype extends JsNode
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
			protected static abstract class Members extends JsNode.Members
			{
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#addEventListener
				 * @see DOM2Core.Document.Prototype.Member#addEventListener
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid addEventListener            = id("addEventListener"           );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#attachEvent
				 * @see DOM2Core.Document.Prototype.Member#attachEvent
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid attachEvent                 = id("attachEvent"                );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#createAttribute
				 * @see DOM2Core.Document.Prototype.Member#createAttribute
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid createAttribute             = id("createAttribute"            );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#createAttributeNS
				 * @see DOM2Core.Document.Prototype.Member#createAttributeNS
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid createAttributeNS           = id("createAttributeNS"          );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#createCDATASection
				 * @see DOM2Core.Document.Prototype.Member#createCDATASection
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid createCDATASection          = id("createCDATASection"         );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#createComment
				 * @see DOM2Core.Document.Prototype.Member#createComment
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid createComment               = id("createComment"              );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#createDocumentFragment
				 * @see DOM2Core.Document.Prototype.Member#createDocumentFragment
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid createDocumentFragment      = id("createDocumentFragment"     );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#createElement
				 * @see DOM2Core.Document.Prototype.Member#createElement
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid createElement               = id("createElement"              );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#createElementNS
				 * @see DOM2Core.Document.Prototype.Member#createElementNS
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid createElementNS             = id("createElementNS"            );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#createEvent
				 * @see DOM2Core.Document.Prototype.Member#createEvent
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid createEvent                 = id("createEvent"                );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#createExpression
				 * @see DOM2Core.Document.Prototype.Member#createExpression
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid createExpression            = id("createExpression"           );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#createProcessingInstruction
				 * @see DOM2Core.Document.Prototype.Member#createProcessingInstruction
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid createProcessingInstruction = id("createProcessingInstruction");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#createRange
				 * @see DOM2Core.Document.Prototype.Member#createRange
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid createRange                 = id("createRange"                );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#createStyleSheet
				 * @see DOM2Core.Document.Prototype.Member#createStyleSheet
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid createStyleSheet            = id("createStyleSheet"           );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#createTextNode
				 * @see DOM2Core.Document.Prototype.Member#createTextNode
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid createTextNode              = id("createTextNode"             );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#detachEvent
				 * @see DOM2Core.Document.Prototype.Member#detachEvent
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid detachEvent                 = id("detachEvent"                );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#dispatchEvent
				 * @see DOM2Core.Document.Prototype.Member#dispatchEvent
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid dispatchEvent               = id("dispatchEvent"              );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#evaluate
				 * @see DOM2Core.Document.Prototype.Member#evaluate
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid evaluate                    = id("evaluate"                   );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#execCommand
				 * @see DOM2Core.Document.Prototype.Member#execCommand
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid execCommand                 = id("execCommand"                );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#fireEvent
				 * @see DOM2Core.Document.Prototype.Member#fireEvent
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid fireEvent                   = id("fireEvent"                  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#getElementById
				 * @see DOM2Core.Document.Prototype.Member#getElementById
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid getElementById              = id("getElementById"             );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#getElementsByTagName
				 * @see DOM2Core.Document.Prototype.Member#getElementsByTagName
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid getElementsByTagName        = id("getElementsByTagName"       );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#getElementsByTagNameNS
				 * @see DOM2Core.Document.Prototype.Member#getElementsByTagNameNS
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid getElementsByTagNameNS      = id("getElementsByTagNameNS"     );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#importNode
				 * @see DOM2Core.Document.Prototype.Member#importNode
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid importNode                  = id("importNode"                 );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#loadXML
				 * @see DOM2Core.Document.Prototype.Member#loadXML
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid loadXML                     = id("loadXML"                    );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Document.Prototype#removeEventListener
				 * @see DOM2Core.Document.Prototype.Member#removeEventListener
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid removeEventListener         = id("removeEventListener"        );
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
			public static class Member extends JsNode.Member
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
				 * @see JsDocument#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsDocument> valueOf = new JsFunction.Member<JsDocument>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#addEventListener(String, JsFunction, Boolean)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> addEventListener    = new JsFunction.Member<java.lang.Object>(this, Members.addEventListener   );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#attachEvent(String, JsFunction)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> attachEvent         = new JsFunction.Member<java.lang.Object>(this, Members.attachEvent        );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#detachEvent(String, JsFunction)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> detachEvent         = new JsFunction.Member<java.lang.Object>(this, Members.detachEvent        );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#loadXML(String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> loadXML             = new JsFunction.Member<java.lang.Object>(this, Members.loadXML            );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#removeEventListener(String, JsFunction, Boolean)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> removeEventListener = new JsFunction.Member<java.lang.Object>(this, Members.removeEventListener);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#execCommand(String, Boolean, Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Boolean> execCommand   = new JsFunction.Member<java.lang.Boolean>(this, Members.execCommand  );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#dispatchEvent(JsEvent)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Boolean> dispatchEvent = new JsFunction.Member<java.lang.Boolean>(this, Members.dispatchEvent);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#createAttribute(String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsAttr> createAttribute   = new JsFunction.Member<JsAttr>(this, Members.createAttribute  );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#createAttributeNS(String, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsAttr> createAttributeNS = new JsFunction.Member<JsAttr>(this, Members.createAttributeNS);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#createCDATASection(String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsCDATASection> createCDATASection = new JsFunction.Member<JsCDATASection>(this, Members.createCDATASection);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#createComment(String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsComment> createComment = new JsFunction.Member<JsComment>(this, Members.createComment);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#createDocumentFragment()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsDocumentFragment> createDocumentFragment = new JsFunction.Member<JsDocumentFragment>(this, Members.createDocumentFragment);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#createElement(String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsElement> createElement   = new JsFunction.Member<JsElement>(this, Members.createElement  );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#createElementNS(String, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsElement> createElementNS = new JsFunction.Member<JsElement>(this, Members.createElementNS);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#createEvent(String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsEvent> createEvent = new JsFunction.Member<JsEvent>(this, Members.createEvent);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#createExpression(String, JsFunction)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsXPathExpression> createExpression = new JsFunction.Member<JsXPathExpression>(this, Members.createExpression);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#createProcessingInstruction(String, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsProcessingInstruction> createProcessingInstruction = new JsFunction.Member<JsProcessingInstruction>(this, Members.createProcessingInstruction);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#createRange()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsRange> createRange = new JsFunction.Member<JsRange>(this, Members.createRange);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#createStyleSheet(String)
				 * @see JsDocument#createStyleSheet(String, int)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsCSSStyleSheet> createStyleSheet = new JsFunction.Member<JsCSSStyleSheet>(this, Members.createStyleSheet, Generic.get(JsCSSStyleSheet.class));
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#createTextNode(String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsText> createTextNode = new JsFunction.Member<JsText>(this, Members.createTextNode);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#evaluate(String, JsNode, JsFunction, Number, JsXPathResult)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsXPathResult> evaluate = new JsFunction.Member<JsXPathResult>(this, Members.evaluate);
				/**
				 * <p>An <b>opaque</b> static field defining a member that is named by the field name
				 * without a qualifying member and to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsElement#fireEvent(JsEvent)
				 * @javascript Re-compilers must resolve the member of this static field to the
				 * identifier of the field name.
				 */
				public static final JsFunction.Member<java.lang.Boolean> fireEvent              = new JsFunction.Member<java.lang.Boolean>(Members.fireEvent             );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#getElementById(String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsElement> getElementById = new JsFunction.Member<JsElement>(this, Members.getElementById);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#getElementsByTagName(String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsNodeList<? extends JsElement>> getElementsByTagName   = new JsFunction.Member<JsNodeList<? extends JsElement>>(this, Members.getElementsByTagName  );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#getElementsByTagNameNS(String, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsNodeList<? extends JsElement>> getElementsByTagNameNS = new JsFunction.Member<JsNodeList<? extends JsElement>>(this, Members.getElementsByTagNameNS);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDocument#importNode(JsNode, Boolean)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsNode> importNode = new JsFunction.Member<JsNode>(this, Members.importNode);
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
			 * @see JsDocument#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsDocument> valueOf = new JsFunction.Member<JsDocument>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#addEventListener(String, JsFunction, Boolean)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> addEventListener    = new JsFunction.Member<java.lang.Object>(Members.addEventListener   );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#attachEvent(String, JsFunction)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> attachEvent         = new JsFunction.Member<java.lang.Object>(Members.attachEvent        );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#detachEvent(String, JsFunction)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> detachEvent         = new JsFunction.Member<java.lang.Object>(Members.detachEvent        );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#loadXML(String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> loadXML             = new JsFunction.Member<java.lang.Object>(Members.loadXML            );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#removeEventListener(String, JsFunction, Boolean)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> removeEventListener = new JsFunction.Member<java.lang.Object>(Members.removeEventListener);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#execCommand(String, Boolean, Object)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Boolean> execCommand   = new JsFunction.Member<java.lang.Boolean>(Members.execCommand  );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#dispatchEvent(JsEvent)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Boolean> dispatchEvent = new JsFunction.Member<java.lang.Boolean>(Members.dispatchEvent);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#createAttribute(String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsAttr> createAttribute   = new JsFunction.Member<JsAttr>(Members.createAttribute  );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#createAttributeNS(String, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsAttr> createAttributeNS = new JsFunction.Member<JsAttr>(Members.createAttributeNS);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#createCDATASection(String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsCDATASection> createCDATASection = new JsFunction.Member<JsCDATASection>(Members.createCDATASection);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#createComment(String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsComment> createComment = new JsFunction.Member<JsComment>(Members.createComment);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#createDocumentFragment()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsDocumentFragment> createDocumentFragment = new JsFunction.Member<JsDocumentFragment>(Members.createDocumentFragment);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#createElement(String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsElement> createElement   = new JsFunction.Member<JsElement>(Members.createElement  );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#createElementNS(String, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsElement> createElementNS = new JsFunction.Member<JsElement>(Members.createElementNS);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#createEvent(String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsEvent> createEvent = new JsFunction.Member<JsEvent>(Members.createEvent);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#createExpression(String)
			 * @see JsDocument#createExpression(String, JsFunction)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsXPathExpression> createExpression = new JsFunction.Member<JsXPathExpression>(Members.createExpression);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#createProcessingInstruction(String, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsProcessingInstruction> createProcessingInstruction = new JsFunction.Member<JsProcessingInstruction>(Members.createProcessingInstruction);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#createRange()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsRange> createRange = new JsFunction.Member<JsRange>(Members.createRange);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#createStyleSheet(String)
			 * @see JsDocument#createStyleSheet(String, int)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsCSSStyleSheet> createStyleSheet = new JsFunction.Member<JsCSSStyleSheet>(Members.createStyleSheet, Generic.get(JsCSSStyleSheet.class));
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#createTextNode(String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsText> createTextNode = new JsFunction.Member<JsText>(Members.createTextNode);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#evaluate(String, JsNode, JsFunction, Number, JsXPathResult)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsXPathResult> evaluate = new JsFunction.Member<JsXPathResult>(Members.evaluate);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsElement#fireEvent(JsEvent)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Boolean> fireEvent              = new JsFunction.Member<java.lang.Boolean>(Members.fireEvent             );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#getElementById(String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsElement> getElementById = new JsFunction.Member<JsElement>(Members.getElementById);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#getElementsByTagName(String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsNodeList<? extends JsElement>> getElementsByTagName   = new JsFunction.Member<JsNodeList<? extends JsElement>>(Members.getElementsByTagName  );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#getElementsByTagNameNS(String, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsNodeList<? extends JsElement>> getElementsByTagNameNS = new JsFunction.Member<JsNodeList<? extends JsElement>>(Members.getElementsByTagNameNS);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDocument#importNode(JsNode, Boolean)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsNode> importNode = new JsFunction.Member<JsNode>(Members.importNode);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>DocumentFragment</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class DocumentFragment extends JsClass
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
			public DocumentFragment with(ObjectLike o) {
				return new DocumentFragment(super.with(o));
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
			public DocumentFragment with() {
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
		public DocumentFragment(JsObject var) {
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
		public static class Prototype extends JsNode
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
			public static class Member extends JsNode.Member
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
				 * @see JsDocumentFragment#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsDocumentFragment> valueOf = new JsFunction.Member<JsDocumentFragment>(this, Members.valueOf);
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
			 * @see JsDocumentFragment#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsDocumentFragment> valueOf = new JsFunction.Member<JsDocumentFragment>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>DocumentType</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class DocumentType extends JsClass
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
			public DocumentType with(ObjectLike o) {
				return new DocumentType(super.with(o));
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
			public DocumentType with() {
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
		public DocumentType(JsObject var) {
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
				public final JsFunction.Member<JsDocumentType> valueOf = new JsFunction.Member<JsDocumentType>(this, Members.valueOf);
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
			public static final JsFunction.Member<JsDocumentType> valueOf = new JsFunction.Member<JsDocumentType>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>DOMException</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class DOMException extends JsClass
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
			 * @see DOM2Core.DOMException#INDEX_SIZE_ERR
			 * @see DOM2Core.DOMException.Member#INDEX_SIZE_ERR
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid INDEX_SIZE_ERR = id("INDEX_SIZE_ERR");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Core.DOMException#DOMSTRING_SIZE_ERR
			 * @see DOM2Core.DOMException.Member#DOMSTRING_SIZE_ERR
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid DOMSTRING_SIZE_ERR = id("DOMSTRING_SIZE_ERR");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Core.DOMException#HIERARCHY_REQUEST_ERR
			 * @see DOM2Core.DOMException.Member#HIERARCHY_REQUEST_ERR
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid HIERARCHY_REQUEST_ERR = id("HIERARCHY_REQUEST_ERR");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Core.DOMException#WRONG_DOCUMENT_ERR
			 * @see DOM2Core.DOMException.Member#WRONG_DOCUMENT_ERR
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid WRONG_DOCUMENT_ERR = id("WRONG_DOCUMENT_ERR");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Core.DOMException#INVALID_CHARACTER_ERR
			 * @see DOM2Core.DOMException.Member#INVALID_CHARACTER_ERR
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid INVALID_CHARACTER_ERR = id("INVALID_CHARACTER_ERR");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Core.DOMException#NO_DATA_ALLOWED_ERR
			 * @see DOM2Core.DOMException.Member#NO_DATA_ALLOWED_ERR
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid NO_DATA_ALLOWED_ERR = id("NO_DATA_ALLOWED_ERR");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Core.DOMException#NO_MODIFICATION_ALLOWED_ERR
			 * @see DOM2Core.DOMException.Member#NO_MODIFICATION_ALLOWED_ERR
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid NO_MODIFICATION_ALLOWED_ERR = id("NO_MODIFICATION_ALLOWED_ERR");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Core.DOMException#NOT_FOUND_ERR
			 * @see DOM2Core.DOMException.Member#NOT_FOUND_ERR
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid NOT_FOUND_ERR = id("NOT_FOUND_ERR");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Core.DOMException#NOT_SUPPORTED_ERR
			 * @see DOM2Core.DOMException.Member#NOT_SUPPORTED_ERR
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid NOT_SUPPORTED_ERR = id("NOT_SUPPORTED_ERR");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Core.DOMException#INUSE_ATTRIBUTE_ERR
			 * @see DOM2Core.DOMException.Member#INUSE_ATTRIBUTE_ERR
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid INUSE_ATTRIBUTE_ERR = id("INUSE_ATTRIBUTE_ERR");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Core.DOMException#INVALID_STATE_ERR
			 * @see DOM2Core.DOMException.Member#INVALID_STATE_ERR
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid INVALID_STATE_ERR = id("INVALID_STATE_ERR");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Core.DOMException#SYNTAX_ERR
			 * @see DOM2Core.DOMException.Member#SYNTAX_ERR
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid SYNTAX_ERR = id("SYNTAX_ERR");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Core.DOMException#INVALID_MODIFICATION_ERR
			 * @see DOM2Core.DOMException.Member#INVALID_MODIFICATION_ERR
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid INVALID_MODIFICATION_ERR = id("INVALID_MODIFICATION_ERR");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Core.DOMException#NAMESPACE_ERR
			 * @see DOM2Core.DOMException.Member#NAMESPACE_ERR
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid NAMESPACE_ERR = id("NAMESPACE_ERR");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Core.DOMException#INVALID_ACCESS_ERR
			 * @see DOM2Core.DOMException.Member#INVALID_ACCESS_ERR
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid INVALID_ACCESS_ERR = id("INVALID_ACCESS_ERR");
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
			public DOMException with(ObjectLike o) {
				return new DOMException(super.with(o));
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
			public DOMException with() {
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
			 * @see JsDOMException#INDEX_SIZE_ERR
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Short.Member INDEX_SIZE_ERR = new Value.Short.Member(this, Members.INDEX_SIZE_ERR);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDOMException#DOMSTRING_SIZE_ERR
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Short.Member DOMSTRING_SIZE_ERR = new Value.Short.Member(this, Members.DOMSTRING_SIZE_ERR);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDOMException#HIERARCHY_REQUEST_ERR
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Short.Member HIERARCHY_REQUEST_ERR = new Value.Short.Member(this, Members.HIERARCHY_REQUEST_ERR);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDOMException#WRONG_DOCUMENT_ERR
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Short.Member WRONG_DOCUMENT_ERR = new Value.Short.Member(this, Members.WRONG_DOCUMENT_ERR);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDOMException#INVALID_CHARACTER_ERR
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Short.Member INVALID_CHARACTER_ERR = new Value.Short.Member(this, Members.INVALID_CHARACTER_ERR);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDOMException#NO_DATA_ALLOWED_ERR
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Short.Member NO_DATA_ALLOWED_ERR = new Value.Short.Member(this, Members.NO_DATA_ALLOWED_ERR);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDOMException#NO_MODIFICATION_ALLOWED_ERR
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Short.Member NO_MODIFICATION_ALLOWED_ERR = new Value.Short.Member(this, Members.NO_MODIFICATION_ALLOWED_ERR);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDOMException#NOT_FOUND_ERR
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Short.Member NOT_FOUND_ERR = new Value.Short.Member(this, Members.NOT_FOUND_ERR);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDOMException#NOT_SUPPORTED_ERR
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Short.Member NOT_SUPPORTED_ERR = new Value.Short.Member(this, Members.NOT_SUPPORTED_ERR);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDOMException#INUSE_ATTRIBUTE_ERR
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Short.Member INUSE_ATTRIBUTE_ERR = new Value.Short.Member(this, Members.INUSE_ATTRIBUTE_ERR);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDOMException#INVALID_STATE_ERR
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Short.Member INVALID_STATE_ERR = new Value.Short.Member(this, Members.INVALID_STATE_ERR);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDOMException#SYNTAX_ERR
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Short.Member SYNTAX_ERR = new Value.Short.Member(this, Members.SYNTAX_ERR);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDOMException#INVALID_MODIFICATION_ERR
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Short.Member INVALID_MODIFICATION_ERR = new Value.Short.Member(this, Members.INVALID_MODIFICATION_ERR);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDOMException#NAMESPACE_ERR
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Short.Member NAMESPACE_ERR = new Value.Short.Member(this, Members.NAMESPACE_ERR);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDOMException#INVALID_ACCESS_ERR
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Short.Member INVALID_ACCESS_ERR = new Value.Short.Member(this, Members.INVALID_ACCESS_ERR);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public DOMException(JsObject var) {
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
		 * @see JsDOMException#INDEX_SIZE_ERR
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Short.Member INDEX_SIZE_ERR = new Value.Short.Member(Members.INDEX_SIZE_ERR);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsDOMException#DOMSTRING_SIZE_ERR
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Short.Member DOMSTRING_SIZE_ERR = new Value.Short.Member(Members.DOMSTRING_SIZE_ERR);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsDOMException#HIERARCHY_REQUEST_ERR
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Short.Member HIERARCHY_REQUEST_ERR = new Value.Short.Member(Members.HIERARCHY_REQUEST_ERR);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsDOMException#WRONG_DOCUMENT_ERR
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Short.Member WRONG_DOCUMENT_ERR = new Value.Short.Member(Members.WRONG_DOCUMENT_ERR);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsDOMException#INVALID_CHARACTER_ERR
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Short.Member INVALID_CHARACTER_ERR = new Value.Short.Member(Members.INVALID_CHARACTER_ERR);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsDOMException#NO_DATA_ALLOWED_ERR
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Short.Member NO_DATA_ALLOWED_ERR = new Value.Short.Member(Members.NO_DATA_ALLOWED_ERR);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsDOMException#NO_MODIFICATION_ALLOWED_ERR
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Short.Member NO_MODIFICATION_ALLOWED_ERR = new Value.Short.Member(Members.NO_MODIFICATION_ALLOWED_ERR);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsDOMException#NOT_FOUND_ERR
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Short.Member NOT_FOUND_ERR = new Value.Short.Member(Members.NOT_FOUND_ERR);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsDOMException#NOT_SUPPORTED_ERR
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Short.Member NOT_SUPPORTED_ERR = new Value.Short.Member(Members.NOT_SUPPORTED_ERR);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsDOMException#INUSE_ATTRIBUTE_ERR
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Short.Member INUSE_ATTRIBUTE_ERR = new Value.Short.Member(Members.INUSE_ATTRIBUTE_ERR);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsDOMException#INVALID_STATE_ERR
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Short.Member INVALID_STATE_ERR = new Value.Short.Member(Members.INVALID_STATE_ERR);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsDOMException#SYNTAX_ERR
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Short.Member SYNTAX_ERR = new Value.Short.Member(Members.SYNTAX_ERR);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsDOMException#INVALID_MODIFICATION_ERR
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Short.Member INVALID_MODIFICATION_ERR = new Value.Short.Member(Members.INVALID_MODIFICATION_ERR);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsDOMException#NAMESPACE_ERR
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Short.Member NAMESPACE_ERR = new Value.Short.Member(Members.NAMESPACE_ERR);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsDOMException#INVALID_ACCESS_ERR
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Short.Member INVALID_ACCESS_ERR = new Value.Short.Member(Members.INVALID_ACCESS_ERR);

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
				public final JsFunction.Member<JsDOMException> valueOf = new JsFunction.Member<JsDOMException>(this, Members.valueOf);
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
			public static final JsFunction.Member<JsDOMException> valueOf = new JsFunction.Member<JsDOMException>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>DOMImplementation</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class DOMImplementation extends JsClass
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
			public DOMImplementation with(ObjectLike o) {
				return new DOMImplementation(super.with(o));
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
			public DOMImplementation with() {
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
		public DOMImplementation(JsObject var) {
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
				 * @see DOM2Core.DOMImplementation.Prototype#createDocument
				 * @see DOM2Core.DOMImplementation.Prototype.Member#createDocument
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid createDocument     = id("createDocument"    );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.DOMImplementation.Prototype#createDocumentType
				 * @see DOM2Core.DOMImplementation.Prototype.Member#createDocumentType
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid createDocumentType = id("createDocumentType");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.DOMImplementation.Prototype#hasFeature
				 * @see DOM2Core.DOMImplementation.Prototype.Member#hasFeature
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid hasFeature         = id("hasFeature"        );
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
				 * @see JsDOMImplementation#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsDOMImplementation> valueOf = new JsFunction.Member<JsDOMImplementation>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDOMImplementation#createDocument(String, String, JsDocumentType)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsDocument> createDocument = new JsFunction.Member<JsDocument>(this, Members.createDocument);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDOMImplementation#createDocumentType(String, String, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsDocumentType> createDocumentType = new JsFunction.Member<JsDocumentType>(this, Members.createDocumentType);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDOMImplementation#hasFeature(String, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Boolean> hasFeature = new JsFunction.Member<java.lang.Boolean>(this, Members.hasFeature);
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
			 * @see JsDOMImplementation#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsDOMImplementation> valueOf = new JsFunction.Member<JsDOMImplementation>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDOMImplementation#createDocument(String, String, JsDocumentType)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsDocument> createDocument = new JsFunction.Member<JsDocument>(Members.createDocument);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDOMImplementation#createDocumentType(String, String, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsDocumentType> createDocumentType = new JsFunction.Member<JsDocumentType>(Members.createDocumentType);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDOMImplementation#hasFeature(String, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Boolean> hasFeature = new JsFunction.Member<java.lang.Boolean>(Members.hasFeature);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>Element</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class Element extends JsClass
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
			public Element with(ObjectLike o) {
				return new Element(super.with(o));
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
			public Element with() {
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
		public Element(JsObject var) {
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
		public static class Prototype extends JsNode
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
			protected static abstract class Members extends JsNode.Members
			{
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Element.Prototype#addEventListener
				 * @see DOM2Core.Element.Prototype.Member#addEventListener
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid addEventListener       = id("addEventListener"      );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Element.Prototype#attachEvent
				 * @see DOM2Core.Element.Prototype.Member#attachEvent
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid attachEvent            = id("attachEvent"           );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Element.Prototype#detachEvent
				 * @see DOM2Core.Element.Prototype.Member#detachEvent
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid detachEvent            = id("detachEvent"           );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Element.Prototype#dispatchEvent
				 * @see DOM2Core.Element.Prototype.Member#dispatchEvent
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid dispatchEvent          = id("dispatchEvent"         );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Element.Prototype#fireEvent
				 * @see DOM2Core.Element.Prototype.Member#fireEvent
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid fireEvent              = id("fireEvent"             );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Element.Prototype#getAttribute
				 * @see DOM2Core.Element.Prototype.Member#getAttribute
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid getAttribute           = id("getAttribute"          );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Element.Prototype#getAttributeNS
				 * @see DOM2Core.Element.Prototype.Member#getAttributeNS
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid getAttributeNS         = id("getAttributeNS"        );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Element.Prototype#getAttributeNode
				 * @see DOM2Core.Element.Prototype.Member#getAttributeNode
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid getAttributeNode       = id("getAttributeNode"      );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Element.Prototype#getAttributeNodeNS
				 * @see DOM2Core.Element.Prototype.Member#getAttributeNodeNS
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid getAttributeNodeNS     = id("getAttributeNodeNS"    );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Element.Prototype#getElementsByTagName
				 * @see DOM2Core.Element.Prototype.Member#getElementsByTagName
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid getElementsByTagName   = id("getElementsByTagName"  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Element.Prototype#getElementsByTagNameNS
				 * @see DOM2Core.Element.Prototype.Member#getElementsByTagNameNS
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid getElementsByTagNameNS = id("getElementsByTagNameNS");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Element.Prototype#hasAttribute
				 * @see DOM2Core.Element.Prototype.Member#hasAttribute
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid hasAttribute           = id("hasAttribute"          );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Element.Prototype#hasAttributeNS
				 * @see DOM2Core.Element.Prototype.Member#hasAttributeNS
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid hasAttributeNS         = id("hasAttributeNS"        );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Element.Prototype#removeAttribute
				 * @see DOM2Core.Element.Prototype.Member#removeAttribute
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid removeAttribute        = id("removeAttribute"       );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Element.Prototype#removeAttributeNode
				 * @see DOM2Core.Element.Prototype.Member#removeAttributeNode
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid removeAttributeNode    = id("removeAttributeNode"   );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Element.Prototype#removeAttributeNS
				 * @see DOM2Core.Element.Prototype.Member#removeAttributeNS
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid removeAttributeNS      = id("removeAttributeNS"     );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Element.Prototype#removeEventListener
				 * @see DOM2Core.Element.Prototype.Member#removeEventListener
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid removeEventListener    = id("removeEventListener"   );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Element.Prototype#removeEventListener
				 * @see DOM2Core.Element.Prototype.Member#removeEventListener
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid setAttribute           = id("setAttribute"          );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Element.Prototype#setAttributeNode
				 * @see DOM2Core.Element.Prototype.Member#setAttributeNode
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid setAttributeNode       = id("setAttributeNode"      );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Element.Prototype#setAttributeNodeNS
				 * @see DOM2Core.Element.Prototype.Member#setAttributeNodeNS
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid setAttributeNodeNS     = id("setAttributeNodeNS"    );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Element.Prototype#setAttributeNS
				 * @see DOM2Core.Element.Prototype.Member#setAttributeNS
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid setAttributeNS         = id("setAttributeNS"        );
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
			public static class Member extends JsNode.Member
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
				 * @see JsElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsElement> valueOf                = new JsFunction.Member<JsElement>(this, Members.valueOf               );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsElement#addEventListener(String, JsFunction, Boolean)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> addEventListener       = new JsFunction.Member<java.lang.Object>    (this, Members.addEventListener      );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsElement#attachEvent(String, JsFunction)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> attachEvent = new JsFunction.Member<java.lang.Object>(this, Members.attachEvent);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsElement#detachEvent(String, JsFunction)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> detachEvent = new JsFunction.Member<java.lang.Object>(this, Members.detachEvent);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsElement#dispatchEvent(JsEvent)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Boolean> dispatchEvent          = new JsFunction.Member<java.lang.Boolean>(this, Members.dispatchEvent         );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsElement#fireEvent(JsEvent)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Boolean> fireEvent              = new JsFunction.Member<java.lang.Boolean>(this, Members.fireEvent             );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsElement#getAttribute(String)
				 * @see JsElement#getAttribute(StringLike)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String>  getAttribute           = new JsFunction.Member<java.lang.String> (this, Members.getAttribute          );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsElement#getAttributeNS(String, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String>  getAttributeNS         = new JsFunction.Member<java.lang.String> (this, Members.getAttributeNS        );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsElement#getAttributeNode(String)
				 * @see JsElement#getAttributeNode(StringLike)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsAttr>    getAttributeNode       = new JsFunction.Member<JsAttr>   (this, Members.getAttributeNode      );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsElement#getAttributeNodeNS(String, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsAttr>    getAttributeNodeNS     = new JsFunction.Member<JsAttr>   (this, Members.getAttributeNodeNS    );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsElement#getElementsByTagName(String)
				 * @see JsElement#getElementsByTagName(StringLike)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsNodeList<? extends JsElement>> getElementsByTagName   = new JsFunction.Member<JsNodeList<? extends JsElement>>(this, Members.getElementsByTagName  );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsElement#getElementsByTagNameNS(String, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsNodeList<? extends JsElement>> getElementsByTagNameNS = new JsFunction.Member<JsNodeList<? extends JsElement>>(this, Members.getElementsByTagNameNS);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsElement#hasAttribute(String)
				 * @see JsElement#hasAttribute(StringLike)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Boolean> hasAttribute           = new JsFunction.Member<java.lang.Boolean>(this, Members.hasAttribute          );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsElement#hasAttributeNS(String, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Boolean> hasAttributeNS         = new JsFunction.Member<java.lang.Boolean>(this, Members.hasAttributeNS        );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsElement#removeAttribute(String)
				 * @see JsElement#removeAttribute(StringLike)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?>         removeAttribute        = new JsFunction.Member<java.lang.Object>    (this, Members.removeAttribute       );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsElement#removeAttributeNode(JsAttr)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsAttr>    removeAttributeNode    = new JsFunction.Member<JsAttr>   (this, Members.removeAttributeNode   );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsElement#removeAttributeNS(String, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?>         removeAttributeNS      = new JsFunction.Member<java.lang.Object>    (this, Members.removeAttributeNS     );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsElement#removeEventListener(String, JsFunction, Boolean)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?>         removeEventListener    = new JsFunction.Member<java.lang.Object>    (this, Members.removeEventListener   );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsElement#setAttribute(String, Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?>         setAttribute           = new JsFunction.Member<java.lang.Object>    (this, Members.setAttribute          );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsElement#setAttributeNode(JsAttr)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsAttr>    setAttributeNode       = new JsFunction.Member<JsAttr>   (this, Members.setAttributeNode      );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsElement#setAttributeNodeNS(JsAttr)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsAttr>    setAttributeNodeNS     = new JsFunction.Member<JsAttr>   (this, Members.setAttributeNodeNS    );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsElement#setAttributeNS(String, String, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?>         setAttributeNS         = new JsFunction.Member<java.lang.Object>    (this, Members.setAttributeNS        );
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
			 * @see JsElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsElement> valueOf                = new JsFunction.Member<JsElement>(Members.valueOf               );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsElement#addEventListener(String, JsFunction, Boolean)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?>         addEventListener       = new JsFunction.Member<java.lang.Object>    (Members.addEventListener      );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsElement#attachEvent(String, JsFunction)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> attachEvent         = new JsFunction.Member<java.lang.Object>(Members.attachEvent        );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsElement#detachEvent(String, JsFunction)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> detachEvent         = new JsFunction.Member<java.lang.Object>(Members.detachEvent        );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsElement#dispatchEvent(JsEvent)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Boolean> dispatchEvent          = new JsFunction.Member<java.lang.Boolean>(Members.dispatchEvent         );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsElement#fireEvent(JsEvent)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Boolean> fireEvent              = new JsFunction.Member<java.lang.Boolean>(Members.fireEvent             );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsElement#getAttribute(String)
			 * @see JsElement#getAttribute(StringLike)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String>  getAttribute           = new JsFunction.Member<java.lang.String> (Members.getAttribute          );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsElement#getAttributeNS(String, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String>  getAttributeNS         = new JsFunction.Member<java.lang.String> (Members.getAttributeNS        );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsElement#getAttributeNode(String)
			 * @see JsElement#getAttributeNode(StringLike)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsAttr>    getAttributeNode       = new JsFunction.Member<JsAttr>   (Members.getAttributeNode      );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsElement#getAttributeNodeNS(String, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsAttr>    getAttributeNodeNS     = new JsFunction.Member<JsAttr>   (Members.getAttributeNodeNS    );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsElement#getElementsByTagName(String)
			 * @see JsElement#getElementsByTagName(StringLike)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsNodeList<? extends JsElement>> getElementsByTagName   = new JsFunction.Member<JsNodeList<? extends JsElement>>(Members.getElementsByTagName  );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsElement#getElementsByTagNameNS(String, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsNodeList<? extends JsElement>> getElementsByTagNameNS = new JsFunction.Member<JsNodeList<? extends JsElement>>(Members.getElementsByTagNameNS);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsElement#hasAttribute(String)
			 * @see JsElement#hasAttribute(StringLike)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Boolean> hasAttribute           = new JsFunction.Member<java.lang.Boolean>(Members.hasAttribute          );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsElement#hasAttributeNS(String, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Boolean> hasAttributeNS         = new JsFunction.Member<java.lang.Boolean>(Members.hasAttributeNS        );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsElement#removeAttribute(String)
			 * @see JsElement#removeAttribute(StringLike)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?>         removeAttribute        = new JsFunction.Member<java.lang.Object>    (Members.removeAttribute       );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsElement#removeAttributeNode(JsAttr)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsAttr>    removeAttributeNode    = new JsFunction.Member<JsAttr>   (Members.removeAttributeNode   );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsElement#removeAttributeNS(String, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?>         removeAttributeNS      = new JsFunction.Member<java.lang.Object>    (Members.removeAttributeNS     );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsElement#removeEventListener(String, JsFunction, Boolean)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?>         removeEventListener    = new JsFunction.Member<java.lang.Object>    (Members.removeEventListener   );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsElement#setAttribute(String, Object)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?>         setAttribute           = new JsFunction.Member<java.lang.Object>    (Members.setAttribute          );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsElement#setAttributeNode(JsAttr)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsAttr>    setAttributeNode       = new JsFunction.Member<JsAttr>   (Members.setAttributeNode      );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsElement#setAttributeNodeNS(JsAttr)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsAttr>    setAttributeNodeNS     = new JsFunction.Member<JsAttr>   (Members.setAttributeNodeNS    );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsElement#setAttributeNS(String, String, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?>         setAttributeNS         = new JsFunction.Member<java.lang.Object>    (Members.setAttributeNS        );
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>Node</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class Node extends JsClass
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
			 * @see DOM2Core.Node#ELEMENT_NODE
			 * @see DOM2Core.Node.Member#ELEMENT_NODE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid ELEMENT_NODE                = id("ELEMENT_NODE"               );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Core.Node#ATTRIBUTE_NODE
			 * @see DOM2Core.Node.Member#ATTRIBUTE_NODE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid ATTRIBUTE_NODE              = id("ATTRIBUTE_NODE"             );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Core.Node#TEXT_NODE
			 * @see DOM2Core.Node.Member#TEXT_NODE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid TEXT_NODE                   = id("TEXT_NODE"                  );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Core.Node#CDATA_SECTION_NODE
			 * @see DOM2Core.Node.Member#CDATA_SECTION_NODE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid CDATA_SECTION_NODE          = id("CDATA_SECTION_NODE"         );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Core.Node#PROCESSING_INSTRUCTION_NODE
			 * @see DOM2Core.Node.Member#PROCESSING_INSTRUCTION_NODE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid PROCESSING_INSTRUCTION_NODE = id("PROCESSING_INSTRUCTION_NODE");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Core.Node#COMMENT_NODE
			 * @see DOM2Core.Node.Member#COMMENT_NODE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid COMMENT_NODE                = id("COMMENT_NODE"               );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Core.Node#DOCUMENT_NODE
			 * @see DOM2Core.Node.Member#DOCUMENT_NODE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid DOCUMENT_NODE               = id("DOCUMENT_NODE"              );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Core.Node#DOCUMENT_TYPE_NODE
			 * @see DOM2Core.Node.Member#DOCUMENT_TYPE_NODE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid DOCUMENT_TYPE_NODE          = id("DOCUMENT_TYPE_NODE"         );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM2Core.Node#DOCUMENT_FRAGMENT_NODE
			 * @see DOM2Core.Node.Member#DOCUMENT_FRAGMENT_NODE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid DOCUMENT_FRAGMENT_NODE      = id("DOCUMENT_FRAGMENT_NODE"     );
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member ELEMENT_NODE                = new Value.Number.Member(Members.ELEMENT_NODE               );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member ATTRIBUTE_NODE              = new Value.Number.Member(Members.ATTRIBUTE_NODE             );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member TEXT_NODE                   = new Value.Number.Member(Members.TEXT_NODE                  );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member CDATA_SECTION_NODE          = new Value.Number.Member(Members.CDATA_SECTION_NODE         );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member PROCESSING_INSTRUCTION_NODE = new Value.Number.Member(Members.PROCESSING_INSTRUCTION_NODE);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member COMMENT_NODE                = new Value.Number.Member(Members.COMMENT_NODE               );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member DOCUMENT_NODE               = new Value.Number.Member(Members.DOCUMENT_NODE              );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member DOCUMENT_TYPE_NODE          = new Value.Number.Member(Members.DOCUMENT_TYPE_NODE         );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member DOCUMENT_FRAGMENT_NODE      = new Value.Number.Member(Members.DOCUMENT_FRAGMENT_NODE     );

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
			public Node with(ObjectLike o) {
				return new Node(super.with(o));
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
			public Node with() {
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
			public final Value.Number.Member ELEMENT_NODE                = new Value.Number.Member(this, Members.ELEMENT_NODE               );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member ATTRIBUTE_NODE              = new Value.Number.Member(this, Members.ATTRIBUTE_NODE             );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member TEXT_NODE                   = new Value.Number.Member(this, Members.TEXT_NODE                  );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member CDATA_SECTION_NODE          = new Value.Number.Member(this, Members.CDATA_SECTION_NODE         );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member PROCESSING_INSTRUCTION_NODE = new Value.Number.Member(this, Members.PROCESSING_INSTRUCTION_NODE);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member COMMENT_NODE                = new Value.Number.Member(this, Members.COMMENT_NODE               );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member DOCUMENT_NODE               = new Value.Number.Member(this, Members.DOCUMENT_NODE              );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member DOCUMENT_TYPE_NODE          = new Value.Number.Member(this, Members.DOCUMENT_TYPE_NODE         );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member DOCUMENT_FRAGMENT_NODE      = new Value.Number.Member(this, Members.DOCUMENT_FRAGMENT_NODE     );

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
		public Node(JsObject var) {
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
				 * @see DOM2Core.Node.Prototype#appendChild
				 * @see DOM2Core.Node.Prototype.Member#appendChild
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid appendChild             = id("appendChild"            );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Node.Prototype#cloneNode
				 * @see DOM2Core.Node.Prototype.Member#cloneNode
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid cloneNode               = id("cloneNode"              );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Node.Prototype#hasAttributes
				 * @see DOM2Core.Node.Prototype.Member#hasAttributes
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid hasAttributes           = id("hasAttributes"          );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Node.Prototype#hasChildNodes
				 * @see DOM2Core.Node.Prototype.Member#hasChildNodes
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid hasChildNodes           = id("hasChildNodes"          );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Node.Prototype#insertAdjacentElement
				 * @see DOM2Core.Node.Prototype.Member#insertAdjacentElement
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid insertAdjacentElement   = id("insertAdjacentElement"  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Node.Prototype#insertAdjacentHTML
				 * @see DOM2Core.Node.Prototype.Member#insertAdjacentHTML
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid insertAdjacentHTML      = id("insertAdjacentHTML"     );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Node.Prototype#insertAdjacentText
				 * @see DOM2Core.Node.Prototype.Member#insertAdjacentText
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid insertAdjacentText      = id("insertAdjacentText"     );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Node.Prototype#insertBefore
				 * @see DOM2Core.Node.Prototype.Member#insertBefore
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid insertBefore            = id("insertBefore"           );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Node.Prototype#isSupported
				 * @see DOM2Core.Node.Prototype.Member#isSupported
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid isSupported             = id("isSupported"            );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Node.Prototype#normalize
				 * @see DOM2Core.Node.Prototype.Member#normalize
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid normalize               = id("normalize"              );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Node.Prototype#releaseCapture
				 * @see DOM2Core.Node.Prototype.Member#releaseCapture
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid releaseCapture          = id("releaseCapture"         );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Node.Prototype#removeChild
				 * @see DOM2Core.Node.Prototype.Member#removeChild
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid removeChild             = id("removeChild"            );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Node.Prototype#replaceChild
				 * @see DOM2Core.Node.Prototype.Member#replaceChild
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid replaceChild            = id("replaceChild"           );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Node.Prototype#selectNodes
				 * @see DOM2Core.Node.Prototype.Member#selectNodes
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid selectNodes             = id("selectNodes"            );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Node.Prototype#selectSingleNode
				 * @see DOM2Core.Node.Prototype.Member#selectSingleNode
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid selectSingleNode        = id("selectSingleNode"       );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Node.Prototype#setCapture
				 * @see DOM2Core.Node.Prototype.Member#setCapture
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid setCapture              = id("setCapture"             );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Node.Prototype#transformNode
				 * @see DOM2Core.Node.Prototype.Member#transformNode
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid transformNode           = id("transformNode"          );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Node.Prototype#transformNodeToObject
				 * @see DOM2Core.Node.Prototype.Member#transformNodeToObject
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid transformNodeToObject   = id("transformNodeToObject"  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Node.Prototype#contains
				 * @see DOM2Core.Node.Prototype.Member#contains
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid contains                = id("contains"               );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Node.Prototype#compareDocumentPosition
				 * @see DOM2Core.Node.Prototype.Member#compareDocumentPosition
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid compareDocumentPosition = id("compareDocumentPosition");
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
				 * @see JsNode#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsNode> valueOf = new JsFunction.Member<JsNode>(this, Members.valueOf, Generic.get(JsNode.class));
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNode#appendChild(JsNode)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsNode> appendChild      = new JsFunction.Member<JsNode>(this, Members.appendChild, Generic.get(JsNode.class));
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNode#cloneNode(Boolean)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsNode> cloneNode        = new JsFunction.Member<JsNode>(this, Members.cloneNode       , Generic.get(JsNode.class));
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNode#insertAdjacentElement(String, JsNode)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> insertAdjacentElement = new JsFunction.Member<JsObject>(this, Members.insertAdjacentElement);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNode#insertAdjacentHTML(String, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> insertAdjacentHTML    = new JsFunction.Member<JsObject>(this, Members.insertAdjacentHTML   );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNode#insertAdjacentText(String, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> insertAdjacentText    = new JsFunction.Member<JsObject>(this, Members.insertAdjacentText   );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNode#insertBefore(JsNode, JsNode)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsNode> insertBefore     = new JsFunction.Member<JsNode>(this, Members.insertBefore    , Generic.get(JsNode.class));
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNode#releaseCapture()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<Void> releaseCapture = new JsFunction.Member<Void>(this, Members.releaseCapture);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNode#removeChild(JsNode)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsNode> removeChild      = new JsFunction.Member<JsNode>(this, Members.removeChild     , Generic.get(JsNode.class));
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNode#replaceChild(JsNode, JsNode)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsNode> replaceChild     = new JsFunction.Member<JsNode>(this, Members.replaceChild    , Generic.get(JsNode.class));
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNode
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsNode> selectSingleNode = new JsFunction.Member<JsNode>(this, Members.selectSingleNode, Generic.get(JsNode.class));
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNode#selectNodes(String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsNodeList<?>> selectNodes = new JsFunction.Member<JsNodeList<?>>(this, Members.selectNodes);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNode#setCapture()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<Void> setCapture = new JsFunction.Member<Void>(this, Members.setCapture);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNode#hasAttributes()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Boolean> hasAttributes = new JsFunction.Member<java.lang.Boolean>(this, Members.hasAttributes);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNode#hasChildNodes()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Boolean> hasChildNodes = new JsFunction.Member<java.lang.Boolean>(this, Members.hasChildNodes);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNode#isSupported(Object, Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Boolean> isSupported   = new JsFunction.Member<java.lang.Boolean>(this, Members.isSupported  );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNode#normalize()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> normalize = new JsFunction.Member<java.lang.Object>(this, Members.normalize);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNode#transformNode(JsDocument)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String> transformNode = new JsFunction.Member<java.lang.String>(this, Members.transformNode);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNode#transformNodeToObject(JsDocument)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsDocument> transformNodeToObject = new JsFunction.Member<JsDocument>(this, Members.transformNodeToObject);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNode#contains(JsNode)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Boolean> contains = new JsFunction.Member<java.lang.Boolean>(this, Members.contains);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNode#compareDocumentPosition(JsNode)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> compareDocumentPosition = new JsFunction.Member<java.lang.Number>(this, Members.compareDocumentPosition);
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
			 * @see JsNode#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsNode> valueOf = new JsFunction.Member<JsNode>(Members.valueOf, Generic.get(JsNode.class));
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNode#appendChild(JsNode)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsNode> appendChild      = new JsFunction.Member<JsNode>(Members.appendChild     , Generic.get(JsNode.class));
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNode#cloneNode(Boolean)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsNode> cloneNode        = new JsFunction.Member<JsNode>(Members.cloneNode       );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNode#insertAdjacentElement(String, JsNode)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> insertAdjacentElement = new JsFunction.Member<JsObject>(Members.insertAdjacentElement);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNode#insertAdjacentHTML(String, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> insertAdjacentHTML    = new JsFunction.Member<JsObject>(Members.insertAdjacentHTML   );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNode#insertAdjacentText(String, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> insertAdjacentText    = new JsFunction.Member<JsObject>(Members.insertAdjacentText   );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNode#insertBefore(JsNode, JsNode)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsNode> insertBefore     = new JsFunction.Member<JsNode>(Members.insertBefore    );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNode#releaseCapture()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<Void> releaseCapture = new JsFunction.Member<Void>(Members.releaseCapture);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNode#removeChild(JsNode)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsNode> removeChild      = new JsFunction.Member<JsNode>(Members.removeChild     );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNode#replaceChild(JsNode, JsNode)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsNode> replaceChild     = new JsFunction.Member<JsNode>(Members.replaceChild    );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNode
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsNode> selectSingleNode = new JsFunction.Member<JsNode>(Members.selectSingleNode);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNode#selectNodes(String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsNodeList<?>> selectNodes = new JsFunction.Member<JsNodeList<?>>(Members.selectNodes);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNode#setCapture()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<Void> setCapture = new JsFunction.Member<Void>(Members.setCapture);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNode#hasAttributes()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Boolean> hasAttributes = new JsFunction.Member<java.lang.Boolean>(Members.hasAttributes);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNode#hasChildNodes()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Boolean> hasChildNodes = new JsFunction.Member<java.lang.Boolean>(Members.hasChildNodes);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNode#isSupported(Object, Object)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Boolean> isSupported   = new JsFunction.Member<java.lang.Boolean>(Members.isSupported  );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNode#normalize()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> normalize = new JsFunction.Member<java.lang.Object>(Members.normalize);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNode#transformNode(JsDocument)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String> transformNode = new JsFunction.Member<java.lang.String>(Members.transformNode);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNode#transformNodeToObject(JsDocument)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsDocument> transformNodeToObject = new JsFunction.Member<JsDocument>(Members.transformNodeToObject);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNode#contains(JsNode)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Boolean> contains = new JsFunction.Member<java.lang.Boolean>(Members.contains);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNode#compareDocumentPosition(JsNode)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> compareDocumentPosition = new JsFunction.Member<java.lang.Number>(Members.compareDocumentPosition);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>NodeList</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class NodeList extends JsFunction<JsNodeList<?>>
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
		public static class Member extends JsFunction.Member<JsNodeList<?>>
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
			public NodeList with(ObjectLike o) {
				return new NodeList(super.with(o));
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
			public NodeList with() {
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
			public final Prototype.Member<?> prototype = new Prototype.Member<JsNode>(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public NodeList(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member<?> prototype = new Prototype.Member<JsNode>(Members.prototype);

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static class Prototype<T extends JsNode> extends JsObject
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
				 * @see DOM2Core.NodeList.Prototype#item
				 * @see DOM2Core.NodeList.Prototype.Member#item
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid item = id("item");
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
			public static class Member<T extends JsNode> extends JsObject.Member
			{
				private final Generic<?> eWrapper;

				public Member(JsObject.Member q, Mid mid, Generic<?> eWrapper) {
					super(q, mid);
					this.eWrapper = eWrapper;
				}
				public Member(Mid mid, Generic<?> eWrapper) {
					super(mid);
					this.eWrapper = eWrapper;
				}
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
					this(q, mid, null);
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
					this(mid, null);
				}
				protected final Generic<?> getElementWrapper() {
					return eWrapper;
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
				public Prototype<T> with(ObjectLike o) {
					return new Prototype<T>(super.with(o), getElementWrapper());
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNodeList#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsNodeList<T>> valueOf = new JsFunction.Member<JsNodeList<T>>(this, Members.valueOf, Generic.get(JsNodeList.class, getElementWrapper()));
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNodeList#item(Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<T> item = new JsFunction.Member<T>(this, Members.item, getElementWrapper());
			}

			private final Generic<?> eWrapper;

			protected Prototype(JsObject var, Generic<?> eWrapper) {
				super(var(var, (JsFunction<?>)null));
				this.eWrapper = eWrapper;
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
				this(var, Generic.get(JsNode.class));
			}
			public final Generic<?> getElementWrapper() {
				return eWrapper;
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNodeList#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsNodeList<?>> valueOf = new JsFunction.Member<JsNodeList<?>>(Members.valueOf, Generic.get(JsNodeList.class));
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNodeList#item(Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsNode> item = new JsFunction.Member<JsNode>(Members.item, Generic.get(JsNode.class));
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>ProcessingInstruction</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class ProcessingInstruction extends JsClass
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
			public ProcessingInstruction with(ObjectLike o) {
				return new ProcessingInstruction(super.with(o));
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
			public ProcessingInstruction with() {
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
		public ProcessingInstruction(JsObject var) {
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
		public static class Prototype extends JsNode
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
			public static class Member extends JsNode.Member
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
				 * @see JsProcessingInstruction#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsProcessingInstruction> valueOf = new JsFunction.Member<JsProcessingInstruction>(this, Members.valueOf);
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
			 * @see JsProcessingInstruction#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsProcessingInstruction> valueOf = new JsFunction.Member<JsProcessingInstruction>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>Text</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class Text extends JsClass
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
			public Text with(ObjectLike o) {
				return new Text(super.with(o));
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
			public Text with() {
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
		public Text(JsObject var) {
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
		public static class Prototype extends JsCharacterData
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
			protected static abstract class Members extends JsCharacterData.Members
			{
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2Core.Text.Prototype#splitText
				 * @see DOM2Core.Text.Prototype.Member#splitText
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid splitText = id("splitText");
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
			public static class Member extends JsCharacterData.Member
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
				 * @see JsText#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsText> valueOf = new JsFunction.Member<JsText>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsText#splitText(Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsText> splitText = new JsFunction.Member<JsText>(this, Members.splitText);
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
			 * @see JsText#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsText> valueOf = new JsFunction.Member<JsText>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsText#splitText(Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsText> splitText = new JsFunction.Member<JsText>(Members.splitText);
		}
	}
}
