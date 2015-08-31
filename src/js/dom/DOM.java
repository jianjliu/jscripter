
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
 * <p>An <b>opaque</b> interface for DOM implementors.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public interface DOM
{
	/**
	 * <p>An <b>opaque</b> class representing the global <tt>ActiveXObject</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class ActiveXObject extends JsFunction<JsObject>
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
		public static class Member extends JsFunction.Member<JsObject>
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
			public ActiveXObject with(ObjectLike o) {
				return new ActiveXObject(super.with(o));
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
			public ActiveXObject with() {
				return with(Js.win());
			}
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public ActiveXObject(JsObject var) {
			super(var);
		}

		/**
		 * <p>Creates an OLE Automation (ActiveX) object for Internet Explorer.</p>
		 * @param arg The class of the OLE Automation (ActiveX) object being created.
		 * @return The newly created OLE Automation (ActiveX) object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new ActiveXObject(arg)</pre>
		 */
		@Override
		public final JsObject create(java.lang.Object arg) {
			return create(arg.toString());
		}
		/**
		 * <p>Creates an OLE Automation (ActiveX) object for Internet Explorer.</p>
		 * @param args The variable argument.
		 * @return The newly created OLE Automation (ActiveX) object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new ActiveXObject(args)</pre>
		 * where <tt>args</tt> must be expanded to comma-separated arguments.
		 */
		@Override
		public final JsObject create(Vars<?> args) {
			return create(args.var().get(0).toString());
		}
		/**
		 * <p>Creates an OLE Automation (ActiveX) object for Internet Explorer.</p>
		 * @param cls The class of the OLE Automation (ActiveX) object being created.
		 * @return The newly created OLE Automation (ActiveX) object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new ActiveXObject(cls)</pre>
		 */
		public final JsObject create(java.lang.String cls) {
			synchronized(JsApplet.class) {
				return activeX.var().invoke(cls);
			}
		}

		private final static Var<JsFunction<JsObject>> activeX = new Static<JsFunction<JsObject>>(
				new Var<JsFunction<JsObject>>() {
					@Override
					public JsFunction<JsObject> var() {
						return Js.function(
								"x",
								"try{return new ActiveXObject(x);}catch(e){}"
						);
					}
				}
		);
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>CanvasGradient</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class CanvasGradient extends JsClass
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
			public CanvasGradient with(ObjectLike o) {
				return new CanvasGradient(super.with(o));
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
			public CanvasGradient with() {
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
		public CanvasGradient(JsObject var) {
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
				 * @see CanvasGradient.Prototype#addColorStop
				 * @see CanvasGradient.Prototype.Member#addColorStop
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid addColorStop = id("addColorStop");
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
				 * @see JsCanvasGradient#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsCanvasGradient> valueOf = new JsFunction.Member<JsCanvasGradient>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasGradient#addColorStop(Number, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> addColorStop = new JsFunction.Member<java.lang.Object>(this, Members.addColorStop);
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
				super(var);
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasGradient#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsCanvasGradient> valueOf = new JsFunction.Member<JsCanvasGradient>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasGradient#addColorStop(Number, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> addColorStop = new JsFunction.Member<java.lang.Object>(Members.addColorStop);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>CanvasPattern</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class CanvasPattern extends JsClass
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
			public CanvasPattern with(ObjectLike o) {
				return new CanvasPattern(super.with(o));
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
			public CanvasPattern with() {
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
		public CanvasPattern(JsObject var) {
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
				 * @see JsCanvasPattern#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsCanvasPattern> valueOf = new JsFunction.Member<JsCanvasPattern>(this, Members.valueOf);
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
				super(var);
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasPattern#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsCanvasPattern> valueOf = new JsFunction.Member<JsCanvasPattern>(Members.valueOf);
		}
	}

	public static class CanvasRenderingContext2D extends JsClass
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
			public CanvasRenderingContext2D with(ObjectLike o) {
				return new CanvasRenderingContext2D(super.with(o));
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
			public CanvasRenderingContext2D with() {
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

		protected CanvasRenderingContext2D(JsObject var) {
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
				 * @see DOM.CanvasRenderingContext2D.Prototype#arc
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#arc
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid arc                  = id("arc"                 );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#arcTo
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#arcTo
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid arcTo                = id("arcTo"               );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#beginPath
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#beginPath
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid beginPath            = id("beginPath"           );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#bezierCurveTo
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#bezierCurveTo
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid bezierCurveTo        = id("bezierCurveTo"       );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#clearRect
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#clearRect
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid clearRect            = id("clearRect"           );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#clip
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#clip
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid clip                 = id("clip"                );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#closePath
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#closePath
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid closePath            = id("closePath"           );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#createLinearGradient
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#createLinearGradient
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid createLinearGradient = id("createLinearGradient");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#createPattern
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#createPattern
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid createPattern        = id("createPattern"       );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#createRadialGradient
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#createRadialGradient
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid createRadialGradient = id("createRadialGradient");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#drawImage
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#drawImage
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid drawImage            = id("drawImage"           );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#fill
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#fill
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid fill                 = id("fill"                );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#fillRect
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#fillRect
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid fillRect             = id("fillRect"            );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#lineTo
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#lineTo
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid lineTo               = id("lineTo"              );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#moveTo
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#moveTo
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid moveTo               = id("moveTo"              );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#quadraticCurveTo
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#quadraticCurveTo
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid quadraticCurveTo     = id("quadraticCurveTo"    );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#rect
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#rect
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid rect                 = id("rect"                );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#restore
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#restore
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid restore              = id("restore"             );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#rotate
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#rotate
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid rotate               = id("rotate"              );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#save
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#save
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid save                 = id("save"                );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#save
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#save
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid scale                = id("scale"               );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#stroke
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#stroke
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid stroke               = id("stroke"              );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#strokeRect
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#strokeRect
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid strokeRect           = id("strokeRect"          );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.CanvasRenderingContext2D.Prototype#translate
				 * @see DOM.CanvasRenderingContext2D.Prototype.Member#translate
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid translate            = id("translate"           );
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
				 * @see JsCanvasRenderingContext2D#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsCanvasRenderingContext2D> valueOf = new JsFunction.Member<JsCanvasRenderingContext2D>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#arc(Number, Number, Number, Number, Number, Boolean)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> arc                  = new JsFunction.Member<java.lang.Object>(this, Members.arc                 );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#arcTo(Number, Number, Number, Number, Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> arcTo                = new JsFunction.Member<java.lang.Object>(this, Members.arcTo               );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#beginPath()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> beginPath            = new JsFunction.Member<java.lang.Object>(this, Members.beginPath           );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#bezierCurveTo(Number, Number, Number, Number, Number, Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> bezierCurveTo        = new JsFunction.Member<java.lang.Object>(this, Members.bezierCurveTo       );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#clearRect(Number, Number, Number, Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> clearRect            = new JsFunction.Member<java.lang.Object>(this, Members.clearRect           );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#clip()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> clip                 = new JsFunction.Member<java.lang.Object>(this, Members.clip                );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#closePath()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> closePath            = new JsFunction.Member<java.lang.Object>(this, Members.closePath           );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#drawImage(JsHTMLCanvasElement, Number, Number)
				 * @see JsCanvasRenderingContext2D#drawImage(JsHTMLImageElement, Number, Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> drawImage            = new JsFunction.Member<java.lang.Object>(this, Members.drawImage           );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#fill()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> fill                 = new JsFunction.Member<java.lang.Object>(this, Members.fill                );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#fillRect(Number, Number, Number, Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> fillRect             = new JsFunction.Member<java.lang.Object>(this, Members.fillRect            );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#lineTo(Number, Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> lineTo               = new JsFunction.Member<java.lang.Object>(this, Members.lineTo              );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#moveTo(Number, Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> moveTo               = new JsFunction.Member<java.lang.Object>(this, Members.moveTo              );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#quadraticCurveTo(Number, Number, Number, Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> quadraticCurveTo     = new JsFunction.Member<java.lang.Object>(this, Members.quadraticCurveTo    );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#rect(Number, Number, Number, Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> rect                 = new JsFunction.Member<java.lang.Object>(this, Members.rect                );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#restore()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> restore              = new JsFunction.Member<java.lang.Object>(this, Members.restore             );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#rotate(Number)
				 * @see JsCanvasRenderingContext2D#rotate(NumberLike)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> rotate               = new JsFunction.Member<java.lang.Object>(this, Members.rotate              );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#save()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> save                 = new JsFunction.Member<java.lang.Object>(this, Members.save                );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#scale(Number, Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> scale                = new JsFunction.Member<java.lang.Object>(this, Members.scale               );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#stroke()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> stroke               = new JsFunction.Member<java.lang.Object>(this, Members.stroke              );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#strokeRect(Number, Number, Number, Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> strokeRect           = new JsFunction.Member<java.lang.Object>(this, Members.strokeRect          );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#translate(Number, Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> translate            = new JsFunction.Member<java.lang.Object>(this, Members.translate           );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#createPattern(JsHTMLCanvasElement, String)
				 * @see JsCanvasRenderingContext2D#createPattern(JsHTMLImageElement, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsCanvasPattern> createPattern = new JsFunction.Member<JsCanvasPattern>(this, Members.createPattern);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#createLinearGradient(Number, Number, Number, Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsCanvasGradient> createLinearGradient = new JsFunction.Member<JsCanvasGradient>(this, Members.createLinearGradient);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsCanvasRenderingContext2D#createRadialGradient(Number, Number, Number, Number, Number, Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsCanvasGradient> createRadialGradient = new JsFunction.Member<JsCanvasGradient>(this, Members.createRadialGradient);
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
				super(var);
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsCanvasRenderingContext2D> valueOf = new JsFunction.Member<JsCanvasRenderingContext2D>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#arc(Number, Number, Number, Number, Number, Boolean)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> arc                  = new JsFunction.Member<java.lang.Object>(Members.arc                 );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#arcTo(Number, Number, Number, Number, Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> arcTo                = new JsFunction.Member<java.lang.Object>(Members.arcTo               );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#beginPath()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> beginPath            = new JsFunction.Member<java.lang.Object>(Members.beginPath           );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#bezierCurveTo(Number, Number, Number, Number, Number, Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> bezierCurveTo        = new JsFunction.Member<java.lang.Object>(Members.bezierCurveTo       );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#clearRect(Number, Number, Number, Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> clearRect            = new JsFunction.Member<java.lang.Object>(Members.clearRect           );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#clip()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> clip                 = new JsFunction.Member<java.lang.Object>(Members.clip                );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#closePath()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> closePath            = new JsFunction.Member<java.lang.Object>(Members.closePath           );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#drawImage(JsHTMLCanvasElement, Number, Number)
			 * @see JsCanvasRenderingContext2D#drawImage(JsHTMLImageElement, Number, Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> drawImage            = new JsFunction.Member<java.lang.Object>(Members.drawImage           );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#fill()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> fill                 = new JsFunction.Member<java.lang.Object>(Members.fill                );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#fillRect(Number, Number, Number, Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> fillRect             = new JsFunction.Member<java.lang.Object>(Members.fillRect            );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#lineTo(Number, Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> lineTo               = new JsFunction.Member<java.lang.Object>(Members.lineTo              );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#moveTo(Number, Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> moveTo               = new JsFunction.Member<java.lang.Object>(Members.moveTo              );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#quadraticCurveTo(Number, Number, Number, Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> quadraticCurveTo     = new JsFunction.Member<java.lang.Object>(Members.quadraticCurveTo    );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#rect(Number, Number, Number, Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> rect                 = new JsFunction.Member<java.lang.Object>(Members.rect                );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#restore()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> restore              = new JsFunction.Member<java.lang.Object>(Members.restore             );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#rotate(Number)
			 * @see JsCanvasRenderingContext2D#rotate(NumberLike)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> rotate               = new JsFunction.Member<java.lang.Object>(Members.rotate              );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#save()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> save                 = new JsFunction.Member<java.lang.Object>(Members.save                );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#scale(Number, Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> scale                = new JsFunction.Member<java.lang.Object>(Members.scale               );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#stroke()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> stroke               = new JsFunction.Member<java.lang.Object>(Members.stroke              );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#strokeRect(Number, Number, Number, Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> strokeRect           = new JsFunction.Member<java.lang.Object>(Members.strokeRect          );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#translate(Number, Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> translate            = new JsFunction.Member<java.lang.Object>(Members.translate           );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#createPattern(JsHTMLCanvasElement, String)
			 * @see JsCanvasRenderingContext2D#createPattern(JsHTMLImageElement, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsCanvasPattern> createPattern = new JsFunction.Member<JsCanvasPattern>(Members.createPattern);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#createLinearGradient(Number, Number, Number, Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsCanvasGradient> createLinearGradient = new JsFunction.Member<JsCanvasGradient>(Members.createLinearGradient);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsCanvasRenderingContext2D#createRadialGradient(Number, Number, Number, Number, Number, Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsCanvasGradient> createRadialGradient = new JsFunction.Member<JsCanvasGradient>(Members.createRadialGradient);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>DOMParser</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class DOMParser extends JsFunction<JsDOMParser>
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
		public static class Member extends JsFunction.Member<JsDOMParser>
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
			public DOMParser with(ObjectLike o) {
				return new DOMParser(super.with(o));
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
			public DOMParser with() {
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
		public DOMParser(JsObject var) {
			super(var);
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
				 * @see DOM.DOMParser.Prototype#parseFromString
				 * @see DOM.DOMParser.Prototype.Member#parseFromString
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid parseFromString = id("parseFromString");
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
				 * @see JsDOMParser#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsDOMParser> valueOf = new JsFunction.Member<JsDOMParser>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDOMParser#parseFromString(String, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsDocument> parseFromString = new JsFunction.Member<JsDocument>(this, Members.parseFromString);
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
				super(var);
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDOMParser#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsDOMParser> valueOf = new JsFunction.Member<JsDOMParser>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDOMParser#parseFromString(String, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsDocument> parseFromString = new JsFunction.Member<JsDocument>(Members.parseFromString);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>FlashPlayer</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class FlashPlayer extends JsClass
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
			public FlashPlayer with(ObjectLike o) {
				return new FlashPlayer(super.with(o));
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
			public FlashPlayer with() {
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
		public FlashPlayer(JsObject var) {
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
				 * @see DOM.FlashPlayer.Prototype#GetVariable
				 * @see DOM.FlashPlayer.Prototype.Member#GetVariable
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid GetVariable   = id("GetVariable"  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.FlashPlayer.Prototype#GotoFrame
				 * @see DOM.FlashPlayer.Prototype.Member#GotoFrame
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid GotoFrame     = id("GotoFrame"    );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.FlashPlayer.Prototype#IsPlaying
				 * @see DOM.FlashPlayer.Prototype.Member#IsPlaying
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid IsPlaying     = id("IsPlaying"    );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.FlashPlayer.Prototype#LoadMovie
				 * @see DOM.FlashPlayer.Prototype.Member#LoadMovie
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid LoadMovie     = id("LoadMovie"    );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.FlashPlayer.Prototype#Pan
				 * @see DOM.FlashPlayer.Prototype.Member#Pan
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid Pan           = id("Pan"          );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.FlashPlayer.Prototype#PercentLoaded
				 * @see DOM.FlashPlayer.Prototype.Member#PercentLoaded
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid PercentLoaded = id("PercentLoaded");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.FlashPlayer.Prototype#Play
				 * @see DOM.FlashPlayer.Prototype.Member#Play
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid Play          = id("Play"         );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.FlashPlayer.Prototype#Rewind
				 * @see DOM.FlashPlayer.Prototype.Member#Rewind
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid Rewind        = id("Rewind"       );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.FlashPlayer.Prototype#SetVariable
				 * @see DOM.FlashPlayer.Prototype.Member#SetVariable
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid SetVariable   = id("SetVariable"  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.FlashPlayer.Prototype#SetZoomRect
				 * @see DOM.FlashPlayer.Prototype.Member#SetZoomRect
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid SetZoomRect   = id("SetZoomRect"  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.FlashPlayer.Prototype#StopPlay
				 * @see DOM.FlashPlayer.Prototype.Member#StopPlay
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid StopPlay      = id("StopPlay"     );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.FlashPlayer.Prototype#TotalFrames
				 * @see DOM.FlashPlayer.Prototype.Member#TotalFrames
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid TotalFrames   = id("TotalFrames"  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.FlashPlayer.Prototype#Zoom
				 * @see DOM.FlashPlayer.Prototype.Member#Zoom
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid Zoom          = id("Zoom"         );
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
				 * @see JsFlashPlayer#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsFlashPlayer> valueOf = new JsFunction.Member<JsFlashPlayer>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsFlashPlayer#IsPlaying()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Boolean> IsPlaying = new JsFunction.Member<java.lang.Boolean>(this, Members.IsPlaying);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsFlashPlayer#GetVariable(String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String> GetVariable   = new JsFunction.Member<java.lang.String>(this, Members.GetVariable  );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsFlashPlayer#PercentLoaded()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> PercentLoaded = new JsFunction.Member<java.lang.Number>(this, Members.PercentLoaded);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsFlashPlayer#TotalFrames()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> TotalFrames   = new JsFunction.Member<java.lang.Number>(this, Members.TotalFrames  );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsFlashPlayer#GotoFrame(Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> GotoFrame   = new JsFunction.Member<java.lang.Object>(this, Members.GotoFrame  );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsFlashPlayer#LoadMovie(Number, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> LoadMovie   = new JsFunction.Member<java.lang.Object>(this, Members.LoadMovie  );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsFlashPlayer#Pan(Number, Number, Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> Pan         = new JsFunction.Member<java.lang.Object>(this, Members.Pan        );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsFlashPlayer#Play()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> Play        = new JsFunction.Member<java.lang.Object>(this, Members.Play       );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsFlashPlayer#Rewind()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> Rewind      = new JsFunction.Member<java.lang.Object>(this, Members.Rewind     );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsFlashPlayer#SetVariable(String, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> SetVariable = new JsFunction.Member<java.lang.Object>(this, Members.SetVariable);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsFlashPlayer#SetZoomRect(Number, Number, Number, Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> SetZoomRect = new JsFunction.Member<java.lang.Object>(this, Members.SetZoomRect);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsFlashPlayer#StopPlay()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> StopPlay    = new JsFunction.Member<java.lang.Object>(this, Members.StopPlay   );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsFlashPlayer#Zoom(Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> Zoom        = new JsFunction.Member<java.lang.Object>(this, Members.Zoom       );
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
				super(var);
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsFlashPlayer#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsFlashPlayer> valueOf = new JsFunction.Member<JsFlashPlayer>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsFlashPlayer#IsPlaying()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Boolean> IsPlaying = new JsFunction.Member<java.lang.Boolean>(Members.IsPlaying);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsFlashPlayer#GetVariable(String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String> GetVariable   = new JsFunction.Member<java.lang.String>(Members.GetVariable  );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsFlashPlayer#PercentLoaded()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> PercentLoaded = new JsFunction.Member<java.lang.Number>(Members.PercentLoaded);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsFlashPlayer#TotalFrames()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> TotalFrames   = new JsFunction.Member<java.lang.Number>(Members.TotalFrames  );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsFlashPlayer#GotoFrame(Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> GotoFrame   = new JsFunction.Member<java.lang.Object>(Members.GotoFrame  );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsFlashPlayer#LoadMovie(Number, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> LoadMovie   = new JsFunction.Member<java.lang.Object>(Members.LoadMovie  );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsFlashPlayer#Pan(Number, Number, Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> Pan         = new JsFunction.Member<java.lang.Object>(Members.Pan        );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsFlashPlayer#Play()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> Play        = new JsFunction.Member<java.lang.Object>(Members.Play       );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsFlashPlayer#Rewind()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> Rewind      = new JsFunction.Member<java.lang.Object>(Members.Rewind     );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsFlashPlayer#SetVariable(String, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> SetVariable = new JsFunction.Member<java.lang.Object>(Members.SetVariable);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsFlashPlayer#SetZoomRect(Number, Number, Number, Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> SetZoomRect = new JsFunction.Member<java.lang.Object>(Members.SetZoomRect);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsFlashPlayer#StopPlay()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> StopPlay    = new JsFunction.Member<java.lang.Object>(Members.StopPlay   );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsFlashPlayer#Zoom(Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> Zoom        = new JsFunction.Member<java.lang.Object>(Members.Zoom       );
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>History</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class History extends JsClass
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
			public History with(ObjectLike o) {
				return new History(super.with(o));
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
			public History with() {
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
		public History(JsObject var) {
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
				 * @see DOM.History.Prototype#back
				 * @see DOM.History.Prototype.Member#back
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid back    = id("back"   );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.History.Prototype#forward
				 * @see DOM.History.Prototype.Member#forward
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid forward = id("forward");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.History.Prototype#go
				 * @see DOM.History.Prototype.Member#go
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid go      = id("go"     );
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
				 * @see JsHistory#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHistory> valueOf = new JsFunction.Member<JsHistory>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHistory#back()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> back    = new JsFunction.Member<java.lang.Object>(this, Members.back   );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHistory#forward()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> forward = new JsFunction.Member<java.lang.Object>(this, Members.forward);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHistory#go(Number)
				 * @see JsHistory#go(String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> go      = new JsFunction.Member<java.lang.Object>(this, Members.go     );
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
				super(var);
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHistory#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHistory> valueOf = new JsFunction.Member<JsHistory>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHistory#back()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> back    = new JsFunction.Member<java.lang.Object>(Members.back   );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHistory#forward()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> forward = new JsFunction.Member<java.lang.Object>(Members.forward);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHistory#go(Number)
			 * @see JsHistory#go(String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> go      = new JsFunction.Member<java.lang.Object>(Members.go     );
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>Location</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class Location extends JsClass
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
			public Location with(ObjectLike o) {
				return new Location(super.with(o));
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
			public Location with() {
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
		public Location(JsObject var) {
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
				 * @see DOM.Location.Prototype#reload
				 * @see DOM.Location.Prototype.Member#reload
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid reload   = id("reload"  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.Location.Prototype#replace
				 * @see DOM.Location.Prototype.Member#replace
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid replace  = id("replace" );
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
				 * @see JsLocation#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsLocation> valueOf = new JsFunction.Member<JsLocation>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsLocation#reload()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> reload  = new JsFunction.Member<java.lang.Object>(this, Members.reload );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsLocation#replace(Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> replace = new JsFunction.Member<java.lang.Object>(this, Members.replace);
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
				super(var);
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsLocation#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsLocation> valueOf = new JsFunction.Member<JsLocation>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsLocation#reload()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> reload  = new JsFunction.Member<java.lang.Object>(Members.reload );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsLocation#replace(Object)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> replace = new JsFunction.Member<java.lang.Object>(Members.replace);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>MimeType</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class MimeType extends JsClass
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
			public MimeType with(ObjectLike o) {
				return new MimeType(super.with(o));
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
			public MimeType with() {
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
		public MimeType(JsObject var) {
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
				 * @see JsMimeType#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsMimeType> valueOf = new JsFunction.Member<JsMimeType>(this, Members.valueOf);
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
				super(var);
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsMimeType#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsMimeType> valueOf = new JsFunction.Member<JsMimeType>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>Navigator</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class Navigator extends JsClass
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
			public Navigator with(ObjectLike o) {
				return new Navigator(super.with(o));
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
			public Navigator with() {
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
		public Navigator(JsObject var) {
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
				 * @see DOM.Navigator.Prototype#javaEnabled
				 * @see DOM.Navigator.Prototype.Member#javaEnabled
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid javaEnabled = id("javaEnabled");
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
				 * @see JsNavigator#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsNavigator> valueOf = new JsFunction.Member<JsNavigator>(this, Members.valueOf);

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Boolean> javaEnabled = new JsFunction.Member<java.lang.Boolean>(this, Members.javaEnabled);
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
				super(var);
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNavigator#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsNavigator> valueOf = new JsFunction.Member<JsNavigator>(Members.valueOf);

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Boolean> javaEnabled = new JsFunction.Member<java.lang.Boolean>(Members.javaEnabled);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>Plugin</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class Plugin extends JsClass
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
			public Plugin with(ObjectLike o) {
				return new Plugin(super.with(o));
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
			public Plugin with() {
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
		public Plugin(JsObject var) {
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
				 * @see JsPlugin#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsPlugin> valueOf = new JsFunction.Member<JsPlugin>(this, Members.valueOf);
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
				super(var);
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsPlugin#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsPlugin> valueOf = new JsFunction.Member<JsPlugin>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>Screen</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class Screen extends JsClass
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
			public Screen with(ObjectLike o) {
				return new Screen(super.with(o));
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
			public Screen with() {
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
		public Screen(JsObject var) {
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
				 * @see JsScreen#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsScreen> valueOf = new JsFunction.Member<JsScreen>(this, Members.valueOf);
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
				super(var);
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsScreen#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsScreen> valueOf = new JsFunction.Member<JsScreen>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>Window</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class Window extends JsClass
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
			public Window with(ObjectLike o) {
				return new Window(super.with(o));
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
			public Window with() {
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
		public Window(JsObject var) {
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
		public static class Prototype extends JsClient
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
			public static class Member extends JsClient.Member
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
				 * @see JsWindow#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsWindow> valueOf = new JsFunction.Member<JsWindow>(this, Members.valueOf);
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
				super(var);
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsWindow#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsWindow> valueOf = new JsFunction.Member<JsWindow>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>XMLHttpRequest</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class XMLHttpRequest extends JsFunction<JsXMLHttpRequest>
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
		public static class Member extends JsFunction.Member<JsXMLHttpRequest>
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
			public XMLHttpRequest with(ObjectLike o) {
				return new XMLHttpRequest(super.with(o));
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
			public XMLHttpRequest with() {
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
		public XMLHttpRequest(JsObject var) {
			super(var);
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
		public final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		private final static Var<JsFunction<JsObject>> http = new Static<JsFunction<JsObject>>(
				new Var<JsFunction<JsObject>>() {
					@Override
					public JsFunction<JsObject> var() {
						return Js.function(
								"return new XMLHttpRequest();"
						);
					}
				}
		);

		/**
		 * <p>Creates an <tt>XMLHttpRequest</tt> object.</p>
		 * <p>The <tt>XMLHttpRequest</tt> object allows client-side JavaScript to issue 
		 * HTTP requests and receive responses (which need not be XML) from web servers.</p>
		 * <p><tt>XMLHttpRequest</tt> is quite portable and well supported by all modern 
		 * browsers. The only browser dependency involves the creation of an 
		 * <tt>XMLHttpRequest</tt> object. In Internet Explorer, you must use the 
		 * {@link DOM.ActiveXObject#create(String)} constructor.</p>
		 * @return The newly created <tt>XMLHttpRequest</tt> object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new XMLHttpRequest()</pre>
		 */
		@Override
		public final JsXMLHttpRequest create() {
			synchronized(JsApplet.class) {
				return new JsXMLHttpRequest(http.var().invoke());
			}
		}
		/**
		 * <p>Creates an <tt>XMLHttpRequest</tt> object.</p>
		 * <p>The <tt>XMLHttpRequest</tt> object allows client-side JavaScript to issue 
		 * HTTP requests and receive responses (which need not be XML) from web servers.</p>
		 * <p><tt>XMLHttpRequest</tt> is quite portable and well supported by all modern 
		 * browsers. The only browser dependency involves the creation of an 
		 * <tt>XMLHttpRequest</tt> object. In Internet Explorer, you must use the 
		 * {@link DOM.ActiveXObject#create(String)} constructor.</p>
		 * @param arg Ignored.
		 * @return The newly created <tt>XMLHttpRequest</tt> object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new XMLHttpRequest()</pre>
		 */
		@Override
		public final JsXMLHttpRequest create(java.lang.Object arg) {
			return create();
		}
		/**
		 * <p>Creates an <tt>XMLHttpRequest</tt> object.</p>
		 * <p>The <tt>XMLHttpRequest</tt> object allows client-side JavaScript to issue 
		 * HTTP requests and receive responses (which need not be XML) from web servers.</p>
		 * <p><tt>XMLHttpRequest</tt> is quite portable and well supported by all modern 
		 * browsers. The only browser dependency involves the creation of an 
		 * <tt>XMLHttpRequest</tt> object. In Internet Explorer, you must use the 
		 * {@link DOM.ActiveXObject#create(String)} constructor.</p>
		 * @param args Ignored.
		 * @return The newly created <tt>XMLHttpRequest</tt> object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new XMLHttpRequest()</pre>
		 */
		@Override
		public final JsXMLHttpRequest create(Vars<?> args) {
			return create();
		}

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
				 * @see DOM.XMLHttpRequest.Prototype#abort
				 * @see DOM.XMLHttpRequest.Prototype.Member#abort
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid abort                 = id("abort"                );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.XMLHttpRequest.Prototype#getAllResponseHeaders
				 * @see DOM.XMLHttpRequest.Prototype.Member#getAllResponseHeaders
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid getAllResponseHeaders = id("getAllResponseHeaders");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.XMLHttpRequest.Prototype#getResponseHeader
				 * @see DOM.XMLHttpRequest.Prototype.Member#getResponseHeader
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid getResponseHeader     = id("getResponseHeader"    );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.XMLHttpRequest.Prototype#open
				 * @see DOM.XMLHttpRequest.Prototype.Member#open
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid open                  = id("open"                 );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.XMLHttpRequest.Prototype#send
				 * @see DOM.XMLHttpRequest.Prototype.Member#send
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid send                  = id("send"                 );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.XMLHttpRequest.Prototype#setRequestHeader
				 * @see DOM.XMLHttpRequest.Prototype.Member#setRequestHeader
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid setRequestHeader      = id("setRequestHeader"     );
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
				 * @see JsXMLHttpRequest#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsXMLHttpRequest> valueOf = new JsFunction.Member<JsXMLHttpRequest>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsXMLHttpRequest#abort()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> abort            = new JsFunction.Member<java.lang.Object>(this, Members.abort           );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsXMLHttpRequest#open(String, String)
				 * @see JsXMLHttpRequest#open(String, String, Boolean)
				 * @see JsXMLHttpRequest#open(String, String, Boolean, String, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> open             = new JsFunction.Member<java.lang.Object>(this, Members.open            );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsXMLHttpRequest#send(Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> send             = new JsFunction.Member<java.lang.Object>(this, Members.send            );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsXMLHttpRequest#setRequestHeader(String, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> setRequestHeader = new JsFunction.Member<java.lang.Object>(this, Members.setRequestHeader);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsXMLHttpRequest#getAllResponseHeaders()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String> getAllResponseHeaders = new JsFunction.Member<java.lang.String>(this, Members.getAllResponseHeaders);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsXMLHttpRequest#getResponseHeader(String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String> getResponseHeader     = new JsFunction.Member<java.lang.String>(this, Members.getResponseHeader    );
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
				super(var);
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXMLHttpRequest#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsXMLHttpRequest> valueOf = new JsFunction.Member<JsXMLHttpRequest>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXMLHttpRequest#abort()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> abort            = new JsFunction.Member<java.lang.Object>(Members.abort           );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXMLHttpRequest#open(String, String)
			 * @see JsXMLHttpRequest#open(String, String, Boolean)
			 * @see JsXMLHttpRequest#open(String, String, Boolean, String, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> open             = new JsFunction.Member<java.lang.Object>(Members.open            );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXMLHttpRequest#send(Object)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> send             = new JsFunction.Member<java.lang.Object>(Members.send            );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXMLHttpRequest#setRequestHeader(String, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> setRequestHeader = new JsFunction.Member<java.lang.Object>(Members.setRequestHeader);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXMLHttpRequest#getAllResponseHeaders()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String> getAllResponseHeaders = new JsFunction.Member<java.lang.String>(Members.getAllResponseHeaders);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXMLHttpRequest#getResponseHeader(String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String> getResponseHeader     = new JsFunction.Member<java.lang.String>(Members.getResponseHeader    );
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>XMLSerializer</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class XMLSerializer extends JsFunction<JsXMLSerializer>
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
		public static class Member extends JsFunction.Member<JsXMLSerializer>
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
			public XMLSerializer with(ObjectLike o) {
				return new XMLSerializer(super.with(o));
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
			public XMLSerializer with() {
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
		public XMLSerializer(JsObject var) {
			super(var);
		}

		/**
		 * <p>Creates a {@link JsXMLSerializer} object which enables you to convert or 
		 * serialize an XML {@link JsDocument} or {@link JsNode} object to a string of 
		 * unparsed XML mark-up.</p>
		 * <p>IE does not support this constructor. Instead, it makes XML text available 
		 * through the {@link JsNode#xml} property of the {@link JsNode} object.</p>
		 * @return The newly created {@link JsXMLSerializer} object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new XMLSerializer()</pre>
		 */
		@Override
		public JsXMLSerializer create() {
			return new JsXMLSerializer(super.create());
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
				 * @see DOM.XMLSerializer.Prototype#serializeToString
				 * @see DOM.XMLSerializer.Prototype.Member#serializeToString
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid serializeToString = id("serializeToString");
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
				 * @see JsXMLSerializer#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsXMLSerializer> valueOf = new JsFunction.Member<JsXMLSerializer>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsXMLSerializer#serializeToString(JsNode)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String> serializeToString = new JsFunction.Member<java.lang.String>(this, Members.serializeToString);
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
				super(var);
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXMLSerializer#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsXMLSerializer> valueOf = new JsFunction.Member<JsXMLSerializer>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXMLSerializer#serializeToString(JsNode)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String> serializeToString = new JsFunction.Member<java.lang.String>(Members.serializeToString);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>XPathExpression</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class XPathExpression extends JsClass
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
			public XPathExpression with(ObjectLike o) {
				return new XPathExpression(super.with(o));
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
			public XPathExpression with() {
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
		public XPathExpression(JsObject var) {
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
				 * @see DOM.XPathExpression.Prototype#evaluate
				 * @see DOM.XPathExpression.Prototype.Member#evaluate
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid evaluate = id("evaluate");
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
				 * @see JsXPathExpression#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsXPathExpression> valueOf = new JsFunction.Member<JsXPathExpression>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsXPathExpression#evaluate(JsNode)
				 * @see JsXPathExpression#evaluate(JsNode, Number)
				 * @see JsXPathExpression#evaluate(JsNode, Number, JsXPathResult)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsXPathResult> evaluate = new JsFunction.Member<JsXPathResult>(this, Members.evaluate);
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
				super(var);
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXPathExpression#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsXPathExpression> valueOf = new JsFunction.Member<JsXPathExpression>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXPathExpression#evaluate(JsNode)
			 * @see JsXPathExpression#evaluate(JsNode, Number)
			 * @see JsXPathExpression#evaluate(JsNode, Number, JsXPathResult)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsXPathResult> evaluate = new JsFunction.Member<JsXPathResult>(Members.evaluate);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>XPathResult</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class XPathResult extends JsClass
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
			 * @see DOM.XPathResult#ANY_TYPE
			 * @see DOM.XPathResult.Member#ANY_TYPE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid ANY_TYPE                     = id("ANY_TYPE"                    );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM.XPathResult#NUMBER_TYPE
			 * @see DOM.XPathResult.Member#NUMBER_TYPE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid NUMBER_TYPE                  = id("NUMBER_TYPE"                 );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM.XPathResult#STRING_TYPE
			 * @see DOM.XPathResult.Member#STRING_TYPE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid STRING_TYPE                  = id("STRING_TYPE"                 );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM.XPathResult#BOOLEAN_TYPE
			 * @see DOM.XPathResult.Member#BOOLEAN_TYPE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid BOOLEAN_TYPE                 = id("BOOLEAN_TYPE"                );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM.XPathResult#UNORDERED_NODE_ITERATOR_TYPE
			 * @see DOM.XPathResult.Member#UNORDERED_NODE_ITERATOR_TYPE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid UNORDERED_NODE_ITERATOR_TYPE = id("UNORDERED_NODE_ITERATOR_TYPE");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM.XPathResult#ORDERED_NODE_ITERATOR_TYPE
			 * @see DOM.XPathResult.Member#ORDERED_NODE_ITERATOR_TYPE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid ORDERED_NODE_ITERATOR_TYPE   = id("ORDERED_NODE_ITERATOR_TYPE"  );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM.XPathResult#UNORDERED_NODE_SNAPSHOT_TYPE
			 * @see DOM.XPathResult.Member#UNORDERED_NODE_SNAPSHOT_TYPE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid UNORDERED_NODE_SNAPSHOT_TYPE = id("UNORDERED_NODE_SNAPSHOT_TYPE");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM.XPathResult#ORDERED_NODE_SNAPSHOT_TYPE
			 * @see DOM.XPathResult.Member#ORDERED_NODE_SNAPSHOT_TYPE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid ORDERED_NODE_SNAPSHOT_TYPE   = id("ORDERED_NODE_SNAPSHOT_TYPE"  );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM.XPathResult#ANY_UNORDERED_NODE_TYPE
			 * @see DOM.XPathResult.Member#ANY_UNORDERED_NODE_TYPE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid ANY_UNORDERED_NODE_TYPE      = id("ANY_UNORDERED_NODE_TYPE"     );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see DOM.XPathResult#FIRST_ORDERED_NODE_TYPE
			 * @see DOM.XPathResult.Member#FIRST_ORDERED_NODE_TYPE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
			 */
			public final static Mid FIRST_ORDERED_NODE_TYPE      = id("FIRST_ORDERED_NODE_TYPE"     );
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
			public XPathResult with(ObjectLike o) {
				return new XPathResult(super.with(o));
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
			public XPathResult with() {
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
			public final Value.Number.Member ANY_TYPE                     = new Value.Number.Member(this, Members.ANY_TYPE                    );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member NUMBER_TYPE                  = new Value.Number.Member(this, Members.NUMBER_TYPE                 );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member STRING_TYPE                  = new Value.Number.Member(this, Members.STRING_TYPE                 );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member BOOLEAN_TYPE                 = new Value.Number.Member(this, Members.BOOLEAN_TYPE                );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member UNORDERED_NODE_ITERATOR_TYPE = new Value.Number.Member(this, Members.UNORDERED_NODE_ITERATOR_TYPE);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member ORDERED_NODE_ITERATOR_TYPE   = new Value.Number.Member(this, Members.ORDERED_NODE_ITERATOR_TYPE  );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member UNORDERED_NODE_SNAPSHOT_TYPE = new Value.Number.Member(this, Members.UNORDERED_NODE_SNAPSHOT_TYPE);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member ORDERED_NODE_SNAPSHOT_TYPE   = new Value.Number.Member(this, Members.ORDERED_NODE_SNAPSHOT_TYPE  );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member ANY_UNORDERED_NODE_TYPE      = new Value.Number.Member(this, Members.ANY_UNORDERED_NODE_TYPE     );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member FIRST_ORDERED_NODE_TYPE      = new Value.Number.Member(this, Members.FIRST_ORDERED_NODE_TYPE     );

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
		public XPathResult(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member ANY_TYPE                     = new Value.Number.Member(Members.ANY_TYPE                    );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member NUMBER_TYPE                  = new Value.Number.Member(Members.NUMBER_TYPE                 );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member STRING_TYPE                  = new Value.Number.Member(Members.STRING_TYPE                 );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member BOOLEAN_TYPE                 = new Value.Number.Member(Members.BOOLEAN_TYPE                );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member UNORDERED_NODE_ITERATOR_TYPE = new Value.Number.Member(Members.UNORDERED_NODE_ITERATOR_TYPE);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member ORDERED_NODE_ITERATOR_TYPE   = new Value.Number.Member(Members.ORDERED_NODE_ITERATOR_TYPE  );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member UNORDERED_NODE_SNAPSHOT_TYPE = new Value.Number.Member(Members.UNORDERED_NODE_SNAPSHOT_TYPE);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member ORDERED_NODE_SNAPSHOT_TYPE   = new Value.Number.Member(Members.ORDERED_NODE_SNAPSHOT_TYPE  );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member ANY_UNORDERED_NODE_TYPE      = new Value.Number.Member(Members.ANY_UNORDERED_NODE_TYPE     );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Value.Number.Member FIRST_ORDERED_NODE_TYPE      = new Value.Number.Member(Members.FIRST_ORDERED_NODE_TYPE     );

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
				 * @see DOM.XPathResult.Prototype#iterateNext
				 * @see DOM.XPathResult.Prototype.Member#iterateNext
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid iterateNext  = id("iterateNext" );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.XPathResult.Prototype#snapshotItem
				 * @see DOM.XPathResult.Prototype.Member#snapshotItem
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid snapshotItem = id("snapshotItem");
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
				 * @see JsXPathResult#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsXPathResult> valueOf = new JsFunction.Member<JsXPathResult>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsXPathResult#iterateNext()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsNode> iterateNext  = new JsFunction.Member<JsNode>(this, Members.iterateNext, Generic.get(JsNode.class));
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsXPathResult#snapshotItem(Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsNode> snapshotItem = new JsFunction.Member<JsNode>(this, Members.snapshotItem);
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
				super(var);
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXPathResult#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsXPathResult> valueOf = new JsFunction.Member<JsXPathResult>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXPathResult#iterateNext()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsNode> iterateNext  = new JsFunction.Member<JsNode>(Members.iterateNext );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXPathResult#snapshotItem(Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsNode> snapshotItem = new JsFunction.Member<JsNode>(Members.snapshotItem, Generic.get(JsNode.class));
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>XSLTProcessor</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class XSLTProcessor extends JsFunction<JsXSLTProcessor>
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
		public static class Member extends JsFunction.Member<JsXSLTProcessor>
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
			public XSLTProcessor with(ObjectLike o) {
				return new XSLTProcessor(super.with(o));
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
			public XSLTProcessor with() {
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
		public XSLTProcessor(JsObject var) {
			super(var);
		}

		/**
		 * <p>Creates a {@link JsXSLTProcessor} object transforms XML document nodes 
		 * using XSLT stylesheets.</p>
		 * <p>IE does not support this constructor but does support XSLT. See IE-specific 
		 * {@link JsNode#transformNode(JsDocument)} and {@link JsNode#transformNodeToObject(JsDocument)} 
		 * methods.</p>
		 * @return The newly created {@link JsXSLTProcessor} object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new XSLTProcessor()</pre>
		 */
		@Override
		public JsXSLTProcessor create() {
			return new JsXSLTProcessor(super.create());
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
				 * @see DOM.XSLTProcessor.Prototype#clearParameters
				 * @see DOM.XSLTProcessor.Prototype.Member#clearParameters
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid clearParameters     = id("clearParameters"    );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.XSLTProcessor.Prototype#getParameter
				 * @see DOM.XSLTProcessor.Prototype.Member#getParameter
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid getParameter        = id("getParameter"       );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.XSLTProcessor.Prototype#importStyleSheet
				 * @see DOM.XSLTProcessor.Prototype.Member#importStyleSheet
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid importStyleSheet    = id("importStyleSheet"   );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.XSLTProcessor.Prototype#removeParameter
				 * @see DOM.XSLTProcessor.Prototype.Member#removeParameter
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid removeParameter     = id("removeParameter"    );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.XSLTProcessor.Prototype#reset
				 * @see DOM.XSLTProcessor.Prototype.Member#reset
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid reset               = id("reset"              );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.XSLTProcessor.Prototype#setParameter
				 * @see DOM.XSLTProcessor.Prototype.Member#setParameter
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid setParameter        = id("setParameter"       );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.XSLTProcessor.Prototype#transformToDocument
				 * @see DOM.XSLTProcessor.Prototype.Member#transformToDocument
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid transformToDocument = id("transformToDocument");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM.XSLTProcessor.Prototype#transformToFragment
				 * @see DOM.XSLTProcessor.Prototype.Member#transformToFragment
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid transformToFragment = id("transformToFragment");
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
				 * @see JsXSLTProcessor#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsXSLTProcessor> valueOf = new JsFunction.Member<JsXSLTProcessor>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsXSLTProcessor#clearParameters()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> clearParameters = new JsFunction.Member<java.lang.Object>(this, Members.clearParameters);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsXSLTProcessor#getParameter(String, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String> getParameter = new JsFunction.Member<java.lang.String>(this, Members.getParameter);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsXSLTProcessor#importStyleSheet(JsNode)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> importStyleSheet = new JsFunction.Member<java.lang.Object>(this, Members.importStyleSheet);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsXSLTProcessor#removeParameter(String, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> removeParameter = new JsFunction.Member<java.lang.Object>(this, Members.removeParameter);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsXSLTProcessor#reset()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> reset = new JsFunction.Member<java.lang.Object>(this, Members.reset);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsXSLTProcessor#setParameter(String, String, String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> setParameter = new JsFunction.Member<java.lang.Object>(this, Members.setParameter);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsXSLTProcessor#transformToDocument(JsNode)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsDocument> transformToDocument = new JsFunction.Member<JsDocument>(this, Members.transformToDocument, Generic.get(JsDocument.class));
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsXSLTProcessor#transformToFragment(JsNode, JsDocument)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsDocumentFragment> transformToFragment = new JsFunction.Member<JsDocumentFragment>(this, Members.transformToFragment, Generic.get(JsDocumentFragment.class));
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
				super(var);
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXSLTProcessor#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsXSLTProcessor> valueOf = new JsFunction.Member<JsXSLTProcessor>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXSLTProcessor#clearParameters()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> clearParameters = new JsFunction.Member<java.lang.Object>(Members.clearParameters);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXSLTProcessor#getParameter(String, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String> getParameter = new JsFunction.Member<java.lang.String>(Members.getParameter);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXSLTProcessor#importStyleSheet(JsNode)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> importStyleSheet = new JsFunction.Member<java.lang.Object>(Members.importStyleSheet);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXSLTProcessor#removeParameter(String, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> removeParameter = new JsFunction.Member<java.lang.Object>(Members.removeParameter);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXSLTProcessor#reset()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> reset = new JsFunction.Member<java.lang.Object>(Members.reset);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXSLTProcessor#setParameter(String, String, String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> setParameter = new JsFunction.Member<java.lang.Object>(Members.setParameter);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXSLTProcessor#transformToDocument(JsNode)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsDocument> transformToDocument = new JsFunction.Member<JsDocument>(Members.transformToDocument, Generic.get(JsDocument.class));
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsXSLTProcessor#transformToFragment(JsNode, JsDocument)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsDocumentFragment> transformToFragment = new JsFunction.Member<JsDocumentFragment>(Members.transformToFragment, Generic.get(JsDocumentFragment.class));
		}
	}
}
