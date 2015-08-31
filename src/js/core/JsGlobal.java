
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

package js.core;

import js.*;

/**
 * <p>An <b>opaque</b> class representing the JavaScript <tt>Global</tt> object 
 * without the client-side support.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsGlobal extends JsObject
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
		 * @see JsGlobal#Infinity
		 * @see Member#Infinity
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid Infinity            = id("Infinity"           );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#NaN
		 * @see Member#NaN
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid NaN                 = id("NaN"                );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#decodeURI
		 * @see Member#decodeURI
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid decodeURI           = id("decodeURI"          );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#decodeURIComponent
		 * @see Member#decodeURIComponent
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid decodeURIComponent  = id("decodeURIComponent" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#encodeURI
		 * @see Member#encodeURI
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid encodeURI           = id("encodeURI"          );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#encodeURIComponent
		 * @see Member#encodeURIComponent
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid encodeURIComponent  = id("encodeURIComponent" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#escape
		 * @see Member#escape
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid escape              = id("escape"             );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#eval
		 * @see Member#eval
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid eval                = id("eval"               );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#isFinite
		 * @see Member#isFinite
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid isFinite            = id("isFinite"           );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#isNaN
		 * @see Member#isNaN
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid isNaN               = id("isNaN"              );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#parseFloat
		 * @see Member#parseFloat
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid parseFloat          = id("parseFloat"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#parseInt
		 * @see Member#parseInt
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid parseInt            = id("parseInt"           );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#unescape
		 * @see Member#unescape
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid unescape            = id("unescape"           );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#Array
		 * @see Member#Array
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid Array               = id("Array"              );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#Boolean
		 * @see Member#Boolean
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid Boolean             = id("Boolean"            );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#Date
		 * @see Member#Date
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid Date                = id("Date"               );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#Error
		 * @see Member#Error
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid Error               = id("Error"              );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#EvalError
		 * @see Member#EvalError
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid EvalError           = id("EvalError"          );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#Function
		 * @see Member#Function
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid Function            = id("Function"           );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#Math
		 * @see Member#Math
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid Math                = id("Math"               );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#Number
		 * @see Member#Number
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid Number              = id("Number"             );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#Object
		 * @see Member#Object
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid Object              = id("Object"             );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#RangeError
		 * @see Member#RangeError
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid RangeError          = id("RangeError"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#ReferenceError
		 * @see Member#ReferenceError
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid ReferenceError      = id("ReferenceError"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#RegExp
		 * @see Member#RegExp
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid RegExp              = id("RegExp"             );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#String
		 * @see Member#String
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid String              = id("String"             );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#SyntaxError
		 * @see Member#SyntaxError
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid SyntaxError         = id("SyntaxError"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#TypeError
		 * @see Member#TypeError
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid TypeError           = id("TypeError"          );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsGlobal#URIError
		 * @see Member#URIError
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid URIError            = id("URIError"           );
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
	protected static class Member extends JsObject.Member
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
		protected Member(JsObject.Member q, Mid mid) {
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
		protected Member(Mid mid) {
			super(mid);
		}
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
		@Override
		public JsGlobal with(ObjectLike o) {
			return new JsGlobal(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The global <tt>Infinity</tt> property contains the special numeric value 
		 * representing positive infinity.</p>
		 * <p>Note that <tt>Infinity</tt> is not a constant and can be set to any other value, 
		 * something that you should take care not to do. {@link JsGlobal.Number#POSITIVE_INFINITY} is 
		 * a constant, however.</p>
		 * <p>In JavaScript, the <tt>Infinity</tt> property is not enumerated by <tt>for/in</tt> 
		 * loops and cannot be deleted with the <tt>delete</tt> operator.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member Infinity = new Value.Number.Member(this, Members.Infinity);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The global <tt>NaN</tt> property is a reference to the special numeric 
		 * not-a-number value.</p>
		 * <p>Note that <tt>NaN</tt> is not a constant and can be set to any other value, 
		 * something that you should take care not to do.</p>
		 * <p>In JavaScript, the <tt>NaN</tt> property is not enumerated by <tt>for/in</tt> 
		 * loops and cannot be deleted with the <tt>delete</tt> operator.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member NaN      = new Value.Number.Member(this, Members.NaN     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal#decodeURI(Object)
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<java.lang.String> decodeURI          = new JsFunction.Member<java.lang.String>(this, Members.decodeURI         );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @see JsGlobal#decodeURIComponent(Object)
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<java.lang.String> decodeURIComponent = new JsFunction.Member<java.lang.String>(this, Members.decodeURIComponent);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal#encodeURI(Object)
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<java.lang.String> encodeURI          = new JsFunction.Member<java.lang.String>(this, Members.encodeURI         );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal#encodeURIComponent(Object)
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<java.lang.String> encodeURIComponent = new JsFunction.Member<java.lang.String>(this, Members.encodeURIComponent);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal#escape(Object)
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<java.lang.String> escape   = new JsFunction.Member<java.lang.String>(this, Members.escape  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal#unescape(Object)
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<java.lang.String> unescape = new JsFunction.Member<java.lang.String>(this, Members.unescape);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal#eval(Object)
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> eval = new JsFunction.Member<java.lang.Object>(this, Members.eval);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal#isFinite(Object)
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<java.lang.Boolean> isFinite = new JsFunction.Member<java.lang.Boolean>(this, Members.isFinite);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal#isNaN(Object)
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<java.lang.Boolean> isNaN    = new JsFunction.Member<java.lang.Boolean>(this, Members.isNaN   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal#parseFloat(Object)
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<java.lang.Number> parseFloat = new JsFunction.Member<java.lang.Number>(this, Members.parseFloat);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal#parseInt(Object)
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<java.lang.Number> parseInt   = new JsFunction.Member<java.lang.Number>(this, Members.parseInt  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Array
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsGlobal.Array         .Member Array          = new JsGlobal.Array         .Member(this, Members.Array         );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Function
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsGlobal.Function.Member<JsObject> Function = new JsGlobal.Function.Member<JsObject>(this, Members.Function    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Boolean
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsGlobal.Boolean       .Member Boolean        = new JsGlobal.Boolean       .Member(this, Members.Boolean       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Date
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsGlobal.Date          .Member Date           = new JsGlobal.Date          .Member(this, Members.Date          );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Error
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsGlobal.Error         .Member Error          = new JsGlobal.Error         .Member(this, Members.Error         );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.EvalError
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsGlobal.EvalError     .Member EvalError      = new JsGlobal.EvalError     .Member(this, Members.EvalError     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Math
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsGlobal.Math          .Member Math           = new JsGlobal.Math          .Member(this, Members.Math          );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Number
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsGlobal.Number        .Member Number         = new JsGlobal.Number        .Member(this, Members.Number        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Object
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsGlobal.Object        .Member Object         = new JsGlobal.Object        .Member(this, Members.Object        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.RangeError
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsGlobal.RangeError    .Member RangeError     = new JsGlobal.RangeError    .Member(this, Members.RangeError    );;
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.ReferenceError
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsGlobal.ReferenceError.Member ReferenceError = new JsGlobal.ReferenceError.Member(this, Members.ReferenceError);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.RegExp
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsGlobal.RegExp        .Member RegExp         = new JsGlobal.RegExp        .Member(this, Members.RegExp        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.String
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsGlobal.String        .Member String         = new JsGlobal.String        .Member(this, Members.String        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.SyntaxError
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsGlobal.SyntaxError   .Member SyntaxError    = new JsGlobal.SyntaxError   .Member(this, Members.SyntaxError   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.TypeError
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsGlobal.TypeError     .Member TypeError      = new JsGlobal.TypeError     .Member(this, Members.TypeError     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.URIError
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsGlobal.URIError      .Member URIError       = new JsGlobal.URIError      .Member(this, Members.URIError      );
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it 
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor, 
	 * that is, replacing it with its only argument.
	 */
	public JsGlobal(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The global <tt>Infinity</tt> property contains the special numeric value 
	 * representing positive infinity.</p>
	 * <p>Note that <tt>Infinity</tt> is not a constant and can be set to any other value, 
	 * something that you should take care not to do. {@link JsGlobal.Number#POSITIVE_INFINITY} is 
	 * a constant, however.</p>
	 * <p>In JavaScript, the <tt>Infinity</tt> property is not enumerated by <tt>for/in</tt> 
	 * loops and cannot be deleted with the <tt>delete</tt> operator.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final Value.Number.Member Infinity = new Value.Number.Member(Members.Infinity);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The global <tt>NaN</tt> property is a reference to the special numeric 
	 * not-a-number value.</p>
	 * <p>Note that <tt>NaN</tt> is not a constant and can be set to any other value, 
	 * something that you should take care not to do.</p>
	 * <p>In JavaScript, the <tt>NaN</tt> property is not enumerated by <tt>for/in</tt> 
	 * loops and cannot be deleted with the <tt>delete</tt> operator.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final Value.Number.Member NaN      = new Value.Number.Member(Members.NaN     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal#decodeURI(Object)
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<java.lang.String> decodeURI          = new JsFunction.Member<java.lang.String>(Members.decodeURI         );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal#decodeURIComponent(Object)
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<java.lang.String> decodeURIComponent = new JsFunction.Member<java.lang.String>(Members.decodeURIComponent);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal#encodeURI(Object)
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<java.lang.String> encodeURI          = new JsFunction.Member<java.lang.String>(Members.encodeURI         );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal#encodeURIComponent(Object)
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<java.lang.String> encodeURIComponent = new JsFunction.Member<java.lang.String>(Members.encodeURIComponent);
	/**
	 * <p>Decodes a string escaped with {@link #encodeURI(Object)}.</p>
	 * @param s A string that contains an encoded URI or other text to be decoded.
	 * @return A copy of <tt>s</tt>, with any hexadecimal escape sequences replaced with 
	 * the characters they represent.
	 * @throws RuntimeException JavaScript throws a <tt>URIError</tt> if one or more of the 
	 * escape sequences in <tt>s</tt> is malformed and cannot be correctly decoded. See 
	 * {@link Js#err(Object)} and {@link js.core.JsURIError} for JS Simulation.
	 * @see #encodeURI(Object)
	 * @see js.Js#decodeURI(Object)
	 * @see jsx.client.Global#decodeURI(Object)
	 * @see jsx.client.Client#decodeURI(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final java.lang.String decodeURI(java.lang.Object s) {
		return call(decodeURI, s);
	}
	/**
	 * <p>Decodes a string escaped with {@link #encodeURIComponent(Object)}.</p>
	 * @param s A string that contains an encoded URI component or other text to be decoded.
	 * @return A copy of <tt>s</tt>, with any hexadecimal escape sequences replaced 
	 * with the characters they represent.
	 * @throws RuntimeException JavaScript throws a <tt>URIError</tt> if one or more of the 
	 * escape sequences in <tt>s</tt> is malformed and cannot be correctly decoded. See 
	 * {@link Js#err(Object)} and {@link js.core.JsURIError} for JS Simulation.
	 * @see #encodeURIComponent(Object)
	 * @see js.Js#decodeURIComponent(Object)
	 * @see jsx.client.Global#decodeURIComponent(Object)
	 * @see jsx.client.Client#decodeURIComponent(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final java.lang.String decodeURIComponent(java.lang.Object s) {
		return call(decodeURIComponent, s);
	}
	/**
	 * <p>Encodes a URI by escaping certain characters.</p>
	 * @param uri A string that contains the URI or other text to be encoded.
	 * @return A copy of <tt>uri</tt>, with any hexadecimal escape sequences replaced 
	 * with the characters they represent..
	 * @throws RuntimeException JavaScript throws a <tt>URIError</tt> if <tt>s</tt> 
	 * contains malformed unicode surrogate pairs and cannot be encoded. See 
	 * {@link Js#err(Object)} and {@link js.core.JsURIError} for JS Simulation.
	 * @see #decodeURI(Object)
	 * @see js.Js#encodeURI(Object)
	 * @see jsx.client.Global#encodeURI(Object)
	 * @see jsx.client.Client#encodeURI(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final java.lang.String encodeURI(java.lang.Object uri) {
		return call(encodeURI, uri);
	}
	/**
	 * <p>Encodes a URI component by escaping certain characters.</p>
	 * @param uri A string that contains a portion of a URI or other text to be encoded.
	 * @return A copy of <tt>uri</tt>, with certain characters replaced by hexadecimal escape sequences.
	 * @throws RuntimeException JavaScript throws a <tt>URIError</tt> if <tt>s</tt> 
	 * contains malformed unicode surrogate pairs and cannot be encoded. See 
	 * {@link Js#err(Object)} and {@link js.core.JsURIError} for JS Simulation.
	 * @see #decodeURIComponent(Object)
	 * @see js.Js#encodeURIComponent(Object)
	 * @see jsx.client.Global#encodeURIComponent(Object)
	 * @see jsx.client.Client#encodeURIComponent(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final java.lang.String encodeURIComponent(java.lang.Object uri) {
		return call(encodeURIComponent, uri);
	}
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal#escape(Object)
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<java.lang.String> escape   = new JsFunction.Member<java.lang.String>(Members.escape  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal#unescape(Object)
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<java.lang.String> unescape = new JsFunction.Member<java.lang.String>(Members.unescape);
	/**
	 * <p>Encodes a string by replacing certain characters with escape sequences.</p>
	 * @param s The string that is to be "escaped" or encoded.
	 * @return An encoded copy of <tt>s</tt> in which certain characters have been 
	 * replaced by hexadecimal escape sequences.
	 * @see #unescape(Object)
	 * @see js.Js#escape(Object)
	 * @see jsx.client.Global#escape(Object)
	 * @see jsx.client.Client#escape(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final java.lang.String escape(java.lang.Object s) {
		return call(escape, s);
	}
	/**
	 * <p>Decodes a string encoded with {@link #escape(Object)}.</p>
	 * @param s The string that is to be decoded or "unescaped".
	 * @return A decoded copy of <tt>s</tt>.
	 * @see #escape(Object)
	 * @see js.Js#unescape(Object)
	 * @see jsx.client.Global#unescape(Object)
	 * @see jsx.client.Client#unescape(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final java.lang.String unescape(java.lang.Object s) {
		return call(unescape, s);
	}
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal#eval(Object)
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> eval = new JsFunction.Member<java.lang.Object>(Members.eval);
	/**
	 * <p>Evaluates the argument string as JavaScript code and returns the result.</p>
	 * <p>In JavaScript, <tt>eval()</tt> is a global method that evaluates a string of 
	 * JavaScript code in the current lexical scope. If the code contains an expression, 
	 * eval evaluates the expression and returns its value. If the code contains a 
	 * JavaScript statement or statements, it executes those statements and returns the 
	 * value, if any, returned by the last statement. If the code does not return any 
	 * value, <tt>eval()</tt> returns undefined. Finally, if code throws an exception, 
	 * <tt>eval()</tt> passes that exception on to the caller.</p>
	 * <p>The global function <tt>eval()</tt> provides a very powerful capability to 
	 * the JavaScript language, but its use is infrequent in real-world programs. 
	 * Obvious uses are to write programs that act as recursive JavaScript interpreters 
	 * and to write programs that dynamically generate and evaluate JavaScript code.</p>
	 * <p>Most JavaScript functions and methods that expect string arguments accept 
	 * arguments of other types as well and simply convert those argument values to 
	 * strings before proceeding. <tt>eval()</tt> does not behave like this. If the 
	 * code argument is not a primitive string, it is simply returned unchanged. Be 
	 * careful, therefore, that you do not inadvertently pass a String object to 
	 * <tt>eval()</tt> when you intended to pass a primitive string value.</p>
	 * <p>For purposes of implementation efficiency, the ECMAScript v3 standard places 
	 * an unusual restriction on the use of <tt>eval()</tt>. An ECMAScript implementation 
	 * is allowed to throw an <tt>EvalError</tt> exception if you attempt to overwrite 
	 * the <tt>eval</tt> property or if you assign the <tt>eval()</tt> method to another 
	 * property and attempt to invoke it through that property.</p>
	 * @param s A string of JavaScript code.
	 * @return The return value of the evaluated code, if any.
	 * @throws RuntimeException JavaScript throws a <tt>SyntaxError</tt> if the argument string 
	 * does not contain legal JavaScript, a <tt>EvalError</tt> if the <tt>eval</tt> function 
	 * was called illegally, through an identifier other than "eval", or other JavaScript error 
	 * generated by the code passed. See {@link Js#err(Object)}, {@link js.core.JsSyntaxError}, 
	 * {@link js.core.JsEvalError}, and {@link js.core.JsError} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final java.lang.Object eval(java.lang.Object s) {
		return call(eval, s);
	}
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal#isFinite(Object)
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<java.lang.Boolean> isFinite = new JsFunction.Member<java.lang.Boolean>(Members.isFinite);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal#isNaN(Object)
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<java.lang.Boolean> isNaN    = new JsFunction.Member<java.lang.Boolean>(Members.isNaN   );
	/**
	 * <p>Tests whether a value is a finite number.</p>
	 * @param v The number to be tested.
	 * @return <tt>true</tt> if <tt>v</tt> is (or can be converted to) a finite 
	 * number, or <tt>false</tt> if <tt>v</tt> is <tt>NaN</tt> (not a number) 
	 * or positive or negative infinity.
	 * @see js.Js#isFinite(Object)
	 * @see jsx.client.Global#isFinite(Object)
	 * @see jsx.client.Client#isFinite(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final boolean isFinite(java.lang.Object v) {
		return call(isFinite, v);
	}
	/**
	 * <p>Tests whether a value is the not-a-number value.</p>
	 * <p>In JavaScript, This function tests its argument to determine whether it is the 
	 * value <tt>NaN</tt>, which represents an illegal number (such as the result of 
	 * division by zero). This function is required because comparing a <tt>NaN</tt> 
	 * with any value, including itself, always returns <tt>false</tt>, so it is not 
	 * possible to test for <tt>NaN</tt> with the == or === operators.</p>
	 * <p>A common use in JavaScript of this function is to test the results of {@link #parseFloat(Object)} 
	 * and {@link #parseInt(Object)} to determine if they represent legal numbers. You can 
	 * also use {@link #isNaN(Object)} to check for arithmetic errors, such as division by 
	 * zero</p>
	 * @param v The value to be tested.
	 * @return <tt>true</tt> if <tt>v</tt> is (or can be converted to) the special 
	 * not-a-number value; <tt>false</tt> if <tt>v</tt> is any other value.
	 * @see js.Js#isNaN(Object)
	 * @see jsx.client.Global#isNaN(Object)
	 * @see jsx.client.Client#isNaN(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final boolean isNaN(java.lang.Object v) {
		return call(isNaN, v);
	}
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal#parseFloat(Object)
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<java.lang.Number> parseFloat = new JsFunction.Member<java.lang.Number>(Members.parseFloat);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal#parseInt(Object)
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<java.lang.Number> parseInt   = new JsFunction.Member<java.lang.Number>(Members.parseInt  );
	/**
	 * <p>Parses a number from a string.</p>
	 * <p>In JavaScript, this function parses and returns the first number that occurs in 
	 * <tt>value</tt>. Parsing stops, and the value is returned, when it encounters a 
	 * character in <tt>value</tt> that is not a valid part of the number. If <tt>value</tt> 
	 * does not begin with a number that it can parse, the function returns the not-a-number 
	 * value <tt>NaN</tt>. Test for this return value with the {@link #isNaN(Object)} 
	 * function. If you want to parse only the integer portion of a number, use {@link #parseInt(Object)} 
	 * or {@link #parseInt(Object, Object)} instead of this one.</p>
	 * @param value The string to be parsed and converted to a number.
	 * @return The parsed number, or <tt>NaN</tt> if <tt>value</tt> does not begin 
	 * with a valid number. In JavaScript 1.0, this function returns 0 instead of <tt>NaN</tt> 
	 * when <tt>value</tt> cannot be parsed as a number.
	 * @see #parseInt(Object)
	 * @see js.Js#parseFloat(Object)
	 * @see jsx.client.Global#parseFloat(Object)
	 * @see jsx.client.Client#parseFloat(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final java.lang.Number parseFloat(java.lang.Object value) {
		return call(parseFloat, value);
	}
	/**
	 * <p>Parses an integer from a string.</p>
	 * <p>In JavaScript, this function parses and returns the first number (with an 
	 * optional leading minus sign) that occurs in <tt>value</tt>. Parsing stops, and 
	 * the value is returned, when it encounters a character in <tt>value</tt> that is 
	 * not a valid digit for the specified radix. If <tt>value</tt> does not begin with 
	 * a number that it can parse, the function returns the not-a-number value <tt>NaN</tt>. 
	 * Use the {@link #isNaN(Object)} function to test for this return value.</p>
	 * @param value The string to be parsed.
	 * @return The parsed number, or <tt>NaN</tt> if <tt>value</tt> does not begin with 
	 * a valid integer. In JavaScript 1.0, this function returns 0 instead of <tt>NaN</tt> 
	 * when it cannot parse <tt>value</tt>.
	 * @see #parseFloat(Object)
	 * @see #parseInt(Object, Object)
	 * @see js.Js#parseInt(Object)
	 * @see jsx.client.Global#parseInt(Object)
	 * @see jsx.client.Client#parseInt(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final java.lang.Number parseInt(java.lang.Object value) {
		return call(parseInt, value);
	}
	/**
	 * <p>Parses an integer from a string in a base specified.</p>
	 * <p>In JavaScript, this function parses and returns the first number (with an 
	 * optional leading minus sign) that occurs in <tt>value</tt>. Parsing stops, and 
	 * the value is returned, when it encounters a character in <tt>value</tt> that is 
	 * not a valid digit for the specified radix. If <tt>value</tt> does not begin with 
	 * a number that it can parse, the function returns the not-a-number value <tt>NaN</tt>. 
	 * Use the {@link #isNaN(Object)} function to test for this return value.</p>
	 * <p>The <tt>radix</tt> argument specifies the base of the number to be parsed. 
	 * Specifying 10 makes this function parse a decimal number. The value 8 specifies that 
	 * an octal number (using digits 0 through 7) is to be parsed. The value 16 specifies 
	 * a hexadecimal value, using digits 0 through 9 and letters A through F. <tt>radix</tt> 
	 * can be any value between 2 and 36.</p>
	 * <p>If <tt>radix</tt> is 0 or is undefined, this function tries to determine the 
	 * radix of the number from <tt>value</tt>. If <tt>value</tt> begins (after an 
	 * optional minus sign) with 0x, it parses the remainder of <tt>value</tt> as a 
	 * hexadecimal number. If <tt>value</tt> begins with a 0, the ECMAScript v3 standard 
	 * allows an implementation of this function to interpret the following characters as 
	 * an octal number or as a decimal number. Otherwise, if <tt>value</tt> begins with 
	 * a digit from 1 through 9, it parses it as a decimal number</p>
	 * @param value The string to be parsed.
	 * @param radix An optional integer argument that represents the radix (or base) of the 
	 * number to be parsed. If this argument is undefined or is 0, the number is parsed in 
	 * base 10 or in base 16 if it begins with 0x or 0X. If this argument is less than 2 or 
	 * greater than 36, <tt>NaN</tt> is returned.
	 * @return The parsed number, or <tt>NaN</tt> if <tt>value</tt> does not begin with 
	 * a valid integer. In JavaScript 1.0, this function returns 0 instead of <tt>NaN</tt> 
	 * when it cannot parse <tt>value</tt>.
	 * @see #parseInt(Object)
	 * @see js.Js#parseInt(Object, int)
	 * @see jsx.client.Global#parseInt(Object, int)
	 * @see jsx.client.Client#parseInt(Object, int)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final java.lang.Number parseInt(java.lang.Object value, java.lang.Object radix) {
		return call(parseInt, new Vars<java.lang.Object>().add(value).add(radix));
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal.Array
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsGlobal.Array.Member Array = new JsGlobal.Array.Member(Members.Array);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal.Function
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsGlobal.Function.Member<JsObject> Function = new JsGlobal.Function.Member<JsObject>(Members.Function      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal.Boolean
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsGlobal.Boolean       .Member Boolean        = new JsGlobal.Boolean       .Member(Members.Boolean       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal.Date
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsGlobal.Date          .Member Date           = new JsGlobal.Date          .Member(Members.Date          );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal.Error
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsGlobal.Error         .Member Error          = new JsGlobal.Error         .Member(Members.Error         );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal.EvalError
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsGlobal.EvalError     .Member EvalError      = new JsGlobal.EvalError     .Member(Members.EvalError     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal.Math
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsGlobal.Math          .Member Math           = new JsGlobal.Math          .Member(Members.Math          );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal.Number
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsGlobal.Number        .Member Number         = new JsGlobal.Number        .Member(Members.Number        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal.Object
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsGlobal.Object        .Member Object         = new JsGlobal.Object        .Member(Members.Object        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal.RangeError
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsGlobal.RangeError    .Member RangeError     = new JsGlobal.RangeError    .Member(Members.RangeError    );;
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal.ReferenceError
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsGlobal.ReferenceError.Member ReferenceError = new JsGlobal.ReferenceError.Member(Members.ReferenceError);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal.RegExp
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsGlobal.RegExp        .Member RegExp         = new JsGlobal.RegExp        .Member(Members.RegExp        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal.String
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsGlobal.String        .Member String         = new JsGlobal.String        .Member(Members.String        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal.SyntaxError
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsGlobal.SyntaxError   .Member SyntaxError    = new JsGlobal.SyntaxError   .Member(Members.SyntaxError   );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal.TypeError
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsGlobal.TypeError     .Member TypeError      = new JsGlobal.TypeError     .Member(Members.TypeError     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsGlobal.URIError
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsGlobal.URIError      .Member URIError       = new JsGlobal.URIError      .Member(Members.URIError      );

	/**
	 * <p>An <b>opaque</b> class representing the global Array class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class Array extends JsFunction<JsArray>
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
		public static class Member extends JsFunction.Member<JsArray>
		{
			private Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
			private Member(Mid mid) {
				super(mid);
			}
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
			@Override
			public Array with(ObjectLike o) {
				return new Array(super.with(o));
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
			@Override
			public Array with() {
				return with(Js.core());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * <p>The <tt>prototype</tt> property is used when a function is used as a 
			 * constructor. It refers to an object that serves as the prototype for an entire 
			 * class of objects. Any object created by the constructor inherits all properties 
			 * of the object referred to by the <tt>prototype</tt> property.</p>
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
		public Array(JsObject var) {
			super(var);
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * <p>The <tt>prototype</tt> property is used when a function is used as a 
		 * constructor. It refers to an object that serves as the prototype for an entire 
		 * class of objects. Any object created by the constructor inherits all properties 
		 * of the object referred to by the <tt>prototype</tt> property.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>Creates an empty array.</p>
		 * <p>In JavaScript, When the <tt>Array()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * @return The empty array.
		 * @see #invoke()
		 * @see JsArray#JsArray()
		 * @see Vars#var()
		 * @see js.Js#array()
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new Array()</pre>
		 */
		@Override
		public final JsArray create() {
			return new JsArray(super.create());
		}
		/**
		 * <p>Creates an empty array.</p>
		 * <p>In JavaScript, When the <tt>Array()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * @return The empty array.
		 * @see #create()
		 * @see JsArray#JsArray()
		 * @see Vars#var()
		 * @see js.Js#array()
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>Array()</pre>
		 */
		@Override
		public final JsArray invoke() {
			return new JsArray(super.create());
		}
		/**
		 * <p>Constructs a JavaScript array object with its <tt>length</tt> field set to the 
		 * number value of the argument.</p>
		 * <p>In JavaScript, When the <tt>Array()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * @param size The desired number of elements in the array. The constructed array has its 
		 * <tt>length</tt> field set to number value of this argument.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into 
		 * the JavaScript expression: 
		 * <pre>new Array(size)</pre>
		 */
		@Override
		public final JsArray create(java.lang.Object size) {
			return new JsArray(super.create(size));
		}
		/**
		 * <p>Constructs a JavaScript array object with its <tt>length</tt> field set to the 
		 * number value of the argument.</p>
		 * <p>In JavaScript, When the <tt>Array()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * @param size The desired number of elements in the array. The constructed array has its 
		 * <tt>length</tt> field set to number value of this argument.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into 
		 * the JavaScript expression: 
		 * <pre>Array(size)</pre>
		 */
		@Override
		public final JsArray invoke(java.lang.Object size) {
			return new JsArray(super.create(size));
		}
		/**
		 * <p>Constructs a JavaScript array object with its <tt>length</tt> field set to the 
		 * number value of the argument, with the specified argument values as its elements and 
		 * its <tt>length</tt> field set to the number of arguments.</p>
		 * <p>When this constructor is invoked with a single argument value, the newly created 
		 * array is initialized with its <tt>length</tt> field set to the number value of the 
		 * argument.</p>
		 * <p>When this constructor is invoked with an argument list of two or more arbitrary 
		 * values, the newly created array is initialized with the specified argument values as 
		 * its elements and its <tt>length</tt> field set to the number of arguments.</p>
		 * <p>In JavaScript, When the <tt>Array()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * @param args The variable argument.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into 
		 * the JavaScript expression: 
		 * <pre>new Array(args)</pre>
		 * where <tt>args</tt> must be expanded to comma-separated argument values at 
		 * re-compile time.
		 */
		@Override
		public final JsArray create(Vars<?> args) {
			return new JsArray(super.create(args));
		}
		/**
		 * <p>Constructs a JavaScript array object with its <tt>length</tt> field set to the 
		 * number value of the argument, with the specified argument values as its elements and 
		 * its <tt>length</tt> field set to the number of arguments.</p>
		 * <p>When this constructor is invoked with a single argument value, the newly created 
		 * array is initialized with its <tt>length</tt> field set to the number value of the 
		 * argument.</p>
		 * <p>When this constructor is invoked with an argument list of two or more arbitrary 
		 * values, the newly created array is initialized with the specified argument values as 
		 * its elements and its <tt>length</tt> field set to the number of arguments.</p>
		 * <p>In JavaScript, When the <tt>Array()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * @param args The variable argument.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into 
		 * the JavaScript expression: 
		 * <pre>Array(args)</pre>
		 * where <tt>args</tt> must be expanded to comma-separated argument values at 
		 * re-compile time.
		 */
		@Override
		public final JsArray invoke(Vars<?> args) {
			return new JsArray(super.create(args));
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
				 * @see JsGlobal.Array.Prototype#concat
				 * @see JsGlobal.Array.Prototype.Member#concat
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid concat  = id("concat" );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Array.Prototype#join
				 * @see JsGlobal.Array.Prototype.Member#join
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid join    = id("join"   );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Array.Prototype#pop
				 * @see JsGlobal.Array.Prototype.Member#pop
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid pop     = id("pop"    );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Array.Prototype#push
				 * @see JsGlobal.Array.Prototype.Member#push
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid push    = id("push"   );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Array.Prototype#reverse
				 * @see JsGlobal.Array.Prototype.Member#reverse
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid reverse = id("reverse");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Array.Prototype#shift
				 * @see JsGlobal.Array.Prototype.Member#shift
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid shift   = id("shift"  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Array.Prototype#slice
				 * @see JsGlobal.Array.Prototype.Member#slice
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid slice   = id("slice"  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Array.Prototype#sort
				 * @see JsGlobal.Array.Prototype.Member#sort
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid sort    = id("sort"   );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Array.Prototype#splice
				 * @see JsGlobal.Array.Prototype.Member#splice
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid splice  = id("splice" );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Array.Prototype#unshift
				 * @see JsGlobal.Array.Prototype.Member#unshift
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid unshift = id("unshift");
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
				protected Member(JsObject.Member q, Mid mid) {
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
				protected Member(Mid mid) {
					super(mid);
				}
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
				@Override
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsArray#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsArray>          valueOf = new JsFunction.Member<JsArray>         (this, Members.valueOf, Generic.get(JsArray.class));
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsArray#concat(Object)
				 * @see JsArray#concat(Vars)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsArray>          concat  = new JsFunction.Member<JsArray>         (this, Members.concat , Generic.get(JsArray.class));
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsArray#join()
				 * @see JsArray#join(Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String> join    = new JsFunction.Member<java.lang.String>(this, Members.join   );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsArray#pop()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?>                pop     = new JsFunction.Member<java.lang.Object>(this, Members.pop    );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsArray#push(Object)
				 * @see JsArray#push(Vars)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> push    = new JsFunction.Member<java.lang.Number>(this, Members.push   );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsArray#reverse()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<Void>             reverse = new JsFunction.Member<Void>            (this, Members.reverse);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsArray#shift()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?>                shift   = new JsFunction.Member<java.lang.Object>(this, Members.shift  );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsArray#slice(Object)
				 * @see JsArray#slice(Object, Object)
				 * @see JsArray#slice(Vars)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsArray>          slice   = new JsFunction.Member<JsArray>         (this, Members.slice  , Generic.get(JsArray.class));
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsArray#sort()
				 * @see JsArray#sort(JsFunction)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsArray>          sort    = new JsFunction.Member<JsArray>         (this, Members.sort   , Generic.get(JsArray.class));
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsArray#splice(Object)
				 * @see JsArray#splice(Object, Object)
				 * @see JsArray#splice(Object, Object, Object)
				 * @see JsArray#splice(Object, Object, Vars)
				 * @see JsArray#splice(Vars)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsArray>          splice  = new JsFunction.Member<JsArray>         (this, Members.splice , Generic.get(JsArray.class));
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsArray#unshift(Object)
				 * @see JsArray#unshift(Vars)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> unshift = new JsFunction.Member<java.lang.Number>(this, Members.unshift);
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
			 * @see JsArray#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsArray>          valueOf = new JsFunction.Member<JsArray>         (Members.valueOf, Generic.get(JsArray.class));
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsArray#concat(Object)
			 * @see JsArray#concat(Vars)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsArray>          concat  = new JsFunction.Member<JsArray>         (Members.concat , Generic.get(JsArray.class));
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsArray#join()
			 * @see JsArray#join(Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String> join    = new JsFunction.Member<java.lang.String>(Members.join   );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsArray#pop()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?>                pop     = new JsFunction.Member<java.lang.Object>(Members.pop    );;
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsArray#push(Object)
			 * @see JsArray#push(Vars)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> push    = new JsFunction.Member<java.lang.Number>(Members.push   );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsArray#reverse()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<Void>             reverse = new JsFunction.Member<Void>            (Members.reverse);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsArray#shift()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?>                shift   = new JsFunction.Member<java.lang.Object>(Members.shift  );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsArray#slice(Object)
			 * @see JsArray#slice(Object, Object)
			 * @see JsArray#slice(Vars)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsArray>          slice   = new JsFunction.Member<JsArray>         (Members.slice  , Generic.get(JsArray.class));
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsArray#sort()
			 * @see JsArray#sort(JsFunction)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsArray>          sort    = new JsFunction.Member<JsArray>         (Members.sort   , Generic.get(JsArray.class));
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsArray#splice(Object)
			 * @see JsArray#splice(Object, Object)
			 * @see JsArray#splice(Object, Object, Object)
			 * @see JsArray#splice(Object, Object, Vars)
			 * @see JsArray#splice(Vars)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsArray>          splice  = new JsFunction.Member<JsArray>         (Members.splice , Generic.get(JsArray.class));
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsArray#unshift(Object)
			 * @see JsArray#unshift(Vars)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> unshift = new JsFunction.Member<java.lang.Number>(Members.unshift);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global Boolean class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class Boolean extends JsFunction<java.lang.Boolean>
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
		public static class Member extends JsFunction.Member<java.lang.Boolean>
		{
			private Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
			private Member(Mid mid) {
				super(mid);
			}
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
			@Override
			public Boolean with(ObjectLike o) {
				return new Boolean(super.with(o));
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
			@Override
			public Boolean with() {
				return with(Js.core());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * <p>The <tt>prototype</tt> property is used when a function is used as a 
			 * constructor. It refers to an object that serves as the prototype for an entire 
			 * class of objects. Any object created by the constructor inherits all properties 
			 * of the object referred to by the <tt>prototype</tt> property.</p>
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
		public Boolean(JsObject var) {
			super(var);
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * <p>The <tt>prototype</tt> property is used when a function is used as a 
		 * constructor. It refers to an object that serves as the prototype for an entire 
		 * class of objects. Any object created by the constructor inherits all properties 
		 * of the object referred to by the <tt>prototype</tt> property.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>Constructs a JavaScript boolean object with the boolean value <tt>false</tt>.</p>
		 * <p>Boolean values are a fundamental data type in JavaScript. The Boolean object is 
		 * an object wrapper around the boolean value. This Boolean object type exists primarily 
		 * to provide a <tt>toString()</tt> method to convert boolean values to strings. When the 
		 * <tt>toString()</tt> method is invoked to convert a boolean value to a string (and it 
		 * is often invoked implicitly by JavaScript), JavaScript internally converts the 
		 * boolean value to a transient Boolean object, on which the method can be invoked.</p>
		 * <p>The values 0, <tt>NaN</tt>, <tt>null</tt>, the empty string "", and the undefined 
		 * value are all converted to <tt>false</tt>. All other primitive values, except 
		 * <tt>false</tt> (but including the string "false"), and all objects and arrays are 
		 * converted to <tt>true</tt>.</p>
		 * <p>In JavaScript, when invoked as a constructor with the <tt>new</tt> operator, 
		 * <tt>Boolean()</tt> converts its argument to a boolean value and returns a Boolean 
		 * object that contains that value. When invoked as a function, without the <tt>new</tt> 
		 * operator, <tt>Boolean()</tt> simply converts its argument to a primitive boolean 
		 * value and returns that value.</p>
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into 
		 * the JavaScript expression: 
		 * <pre>new Boolean()</pre>
		 */
		@Override
		public final JsBoolean create() {
			return new JsBoolean(super.create());
		}
		/**
		 * <p>Simply returns the boolean value <tt>false</tt>.</p>
		 * <p>Boolean values are a fundamental data type in JavaScript. The Boolean object is 
		 * an object wrapper around the boolean value. This Boolean object type exists primarily 
		 * to provide a <tt>toString()</tt> method to convert boolean values to strings. When the 
		 * <tt>toString()</tt> method is invoked to convert a boolean value to a string (and it 
		 * is often invoked implicitly by JavaScript), JavaScript internally converts the 
		 * boolean value to a transient Boolean object, on which the method can be invoked.</p>
		 * <p>The values 0, <tt>NaN</tt>, <tt>null</tt>, the empty string "", and the undefined 
		 * value are all converted to <tt>false</tt>. All other primitive values, except 
		 * <tt>false</tt> (but including the string "false"), and all objects and arrays are 
		 * converted to <tt>true</tt>.</p>
		 * <p>In JavaScript, when invoked as a constructor with the <tt>new</tt> operator, 
		 * <tt>Boolean()</tt> converts its argument to a boolean value and returns a Boolean 
		 * object that contains that value. When invoked as a function, without the <tt>new</tt> 
		 * operator, <tt>Boolean()</tt> simply converts its argument to a primitive boolean 
		 * value and returns that value.</p>
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into 
		 * the JavaScript expression: 
		 * <pre>Boolean()</pre>
		 */
		@Override
		public final java.lang.Boolean invoke() {
			return false;
		}
		/**
		 * <p>Constructs a JavaScript boolean object with the specified argument converted to a 
		 * boolean value.</p>
		 * <p>The values 0, <tt>NaN</tt>, <tt>null</tt>, the empty string "", and the undefined 
		 * value are all converted to <tt>false</tt>. All other primitive values, except 
		 * <tt>false</tt> (but including the string "false"), and all objects and arrays are 
		 * converted to <tt>true</tt>.</p>
		 * <p>Boolean values are a fundamental data type in JavaScript. The Boolean object is 
		 * an object wrapper around the boolean value. This Boolean object type exists primarily 
		 * to provide a <tt>toString()</tt> method to convert boolean values to strings. When the 
		 * <tt>toString()</tt> method is invoked to convert a boolean value to a string (and it 
		 * is often invoked implicitly by JavaScript), JavaScript internally converts the 
		 * boolean value to a transient Boolean object, on which the method can be invoked.</p>
		 * <p>In JavaScript, when invoked as a constructor with the <tt>new</tt> operator, 
		 * <tt>Boolean()</tt> converts its argument to a boolean value and returns a Boolean 
		 * object that contains that value. When invoked as a function, without the <tt>new</tt> 
		 * operator, <tt>Boolean()</tt> simply converts its argument to a primitive boolean 
		 * value and returns that value.</p>
		 * @param arg The value argument.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into 
		 * the JavaScript expression: 
		 * <pre>new Boolean(arg)</pre>
		 */
		@Override
		public final JsBoolean create(java.lang.Object arg) {
			return new JsBoolean(super.create(arg));
		}
		/**
		 * <p>Converts the specified argument to a boolean value.</p>
		 * <p>The values 0, <tt>NaN</tt>, <tt>null</tt>, the empty string "", and the undefined 
		 * value are all converted to <tt>false</tt>. All other primitive values, except 
		 * <tt>false</tt> (but including the string "false"), and all objects and arrays are 
		 * converted to <tt>true</tt>.</p>
		 * <p>Boolean values are a fundamental data type in JavaScript. The Boolean object is 
		 * an object wrapper around the boolean value. This Boolean object type exists primarily 
		 * to provide a <tt>toString()</tt> method to convert boolean values to strings. When the 
		 * <tt>toString()</tt> method is invoked to convert a boolean value to a string (and it 
		 * is often invoked implicitly by JavaScript), JavaScript internally converts the 
		 * boolean value to a transient Boolean object, on which the method can be invoked.</p>
		 * <p>In JavaScript, when invoked as a constructor with the <tt>new</tt> operator, 
		 * <tt>Boolean()</tt> converts its argument to a boolean value and returns a Boolean 
		 * object that contains that value. When invoked as a function, without the <tt>new</tt> 
		 * operator, <tt>Boolean()</tt> simply converts its argument to a primitive boolean 
		 * value and returns that value.</p>
		 * @param arg The value argument.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into 
		 * the JavaScript expression: 
		 * <pre>Boolean(arg)</pre>
		 */
		@Override
		public final java.lang.Boolean invoke(java.lang.Object arg) {
			return Js.be(arg);
		}
		/**
		 * <p>Constructs a JavaScript boolean object with the specified argument converted to a 
		 * boolean value.</p>
		 * <p>The values 0, <tt>NaN</tt>, <tt>null</tt>, the empty string "", and the undefined 
		 * value are all converted to <tt>false</tt>. All other primitive values, except 
		 * <tt>false</tt> (but including the string "false"), and all objects and arrays are 
		 * converted to <tt>true</tt>.</p>
		 * <p>Boolean values are a fundamental data type in JavaScript. The Boolean object is 
		 * an object wrapper around the boolean value. This Boolean object type exists primarily 
		 * to provide a <tt>toString()</tt> method to convert boolean values to strings. When the 
		 * <tt>toString()</tt> method is invoked to convert a boolean value to a string (and it 
		 * is often invoked implicitly by JavaScript), JavaScript internally converts the 
		 * boolean value to a transient Boolean object, on which the method can be invoked.</p>
		 * <p>In JavaScript, when invoked as a constructor with the <tt>new</tt> operator, 
		 * <tt>Boolean()</tt> converts its argument to a boolean value and returns a Boolean 
		 * object that contains that value. When invoked as a function, without the <tt>new</tt> 
		 * operator, <tt>Boolean()</tt> simply converts its argument to a primitive boolean 
		 * value and returns that value.</p>
		 * @param args The variable argument.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into 
		 * the JavaScript expression: 
		 * <pre>new Boolean(args)</pre>
		 * where <tt>args</tt> must be expanded to comma-separated argument values at 
		 * re-compile time.
		 */
		@Override
		public final JsBoolean create(Vars<?> args) {
			return new JsBoolean(super.create(args));
		}
		/**
		 * <p>Constructs a JavaScript boolean object with the specified argument converted to a 
		 * boolean value.</p>
		 * <p>The values 0, <tt>NaN</tt>, <tt>null</tt>, the empty string "", and the undefined 
		 * value are all converted to <tt>false</tt>. All other primitive values, except 
		 * <tt>false</tt> (but including the string "false"), and all objects and arrays are 
		 * converted to <tt>true</tt>.</p>
		 * <p>Boolean values are a fundamental data type in JavaScript. The Boolean object is 
		 * an object wrapper around the boolean value. This Boolean object type exists primarily 
		 * to provide a <tt>toString()</tt> method to convert boolean values to strings. When the 
		 * <tt>toString()</tt> method is invoked to convert a boolean value to a string (and it 
		 * is often invoked implicitly by JavaScript), JavaScript internally converts the 
		 * boolean value to a transient Boolean object, on which the method can be invoked.</p>
		 * <p>In JavaScript, when invoked as a constructor with the <tt>new</tt> operator, 
		 * <tt>Boolean()</tt> converts its argument to a boolean value and returns a Boolean 
		 * object that contains that value. When invoked as a function, without the <tt>new</tt> 
		 * operator, <tt>Boolean()</tt> simply converts its argument to a primitive boolean 
		 * value and returns that value.</p>
		 * @param args The variable argument.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into 
		 * the JavaScript expression: 
		 * <pre>Boolean(args)</pre>
		 * where <tt>args</tt> must be expanded to comma-separated argument values at 
		 * re-compile time.
		 */
		@Override
		public final java.lang.Boolean invoke(Vars<?> args) {
			return Js.be(args.var().get(0));
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
				protected Member(JsObject.Member q, Mid mid) {
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
				protected Member(Mid mid) {
					super(mid);
				}
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
				@Override
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsBoolean#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Boolean> valueOf = new JsFunction.Member<java.lang.Boolean>(this, Members.valueOf);
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
			 * @see JsBoolean#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Boolean> valueOf = new JsFunction.Member<java.lang.Boolean>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global Date class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class Date extends JsFunction<java.lang.String>
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
		protected static abstract class Members extends JsFunction.Members
		{
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see Date#parse
			 * @see Date.Member#parse
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid parse = id("parse");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see Date#UTC
			 * @see Date.Member#UTC
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid UTC   = id("UTC"  );
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
		public static class Member extends JsFunction.Member<java.lang.String>
		{
			private Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
			private Member(Mid mid) {
				super(mid);
			}
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
			@Override
			public Date with(ObjectLike o) {
				return new Date(super.with(o));
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
			@Override
			public Date with() {
				return with(Js.core());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see Date#parse(Object)
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final JsFunction.Member<java.lang.Number> parse = new JsFunction.Member<java.lang.Number>(this, Members.parse);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see Date#UTC(Object, Object)
			 * @see Date#UTC(Object, Object, Object)
			 * @see Date#UTC(Object, Object, Object, Object)
			 * @see Date#UTC(Object, Object, Object, Object, Object)
			 * @see Date#UTC(Object, Object, Object, Object, Object, Object)
			 * @see Date#UTC(Object, Object, Object, Object, Object, Object, Object)
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final JsFunction.Member<java.lang.Number> UTC = new JsFunction.Member<java.lang.Number>(this, Members.UTC);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * <p>The <tt>prototype</tt> property is used when a function is used as a 
			 * constructor. It refers to an object that serves as the prototype for an entire 
			 * class of objects. Any object created by the constructor inherits all properties 
			 * of the object referred to by the <tt>prototype</tt> property.</p>
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
		public Date(JsObject var) {
			super(var);
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.Number> parse = new JsFunction.Member<java.lang.Number>(Members.parse);

		/**
		 * <p>Parses a string representation of a date and time and returns the internal 
		 * millisecond representation of that date.</p>
		 * <p>Note that, in JavaScript <tt>Date.parse()</tt> is "static" method of the 
		 * global class <tt>Date</tt>, but in JS this method is of an instance.</p>
		 * <p><tt>Date.parse()</tt> is a static method of <tt>Date</tt>. It is always invoked 
		 * through the <tt>Date</tt> constructor as <tt>Date.parse()</tt>, not through a 
		 * <tt>Date</tt> object as <tt>date.parse()</tt>. <tt>Date.parse()</tt> takes a 
		 * single string argument. It parses the date contained in this string and returns it 
		 * in millisecond format, which can be used directly, used to create a new <tt>Date</tt> 
		 * object, or used to set the date in an existing <tt>Date</tt> object with 
		 * {@link JsDate#setTime(Object)}.</p>
		 * <p>The ECMAScript standard does not specify the format of the strings that can be 
		 * parsed by this method except to say that this method can parse the strings returned 
		 * by the {@link JsDate#toString()} and {@link JsDate#toUTCString()} methods. 
		 * Unfortunately, these functions format dates in an implementation-dependent way, 
		 * so it is not, in general, possible to write dates in a way that is guaranteed to 
		 * be understood by all JavaScript implementations.</p>
		 * @param v A string containing the date and time to be parsed.
		 * @return The number of milliseconds between the specified date and time and 
		 * midnight GMT on January 1, 1970.
		 * @since 1.0
		 * @see Date#parse(Object)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>Date.parse(v)</pre>
		 */
		public final java.lang.Number parse(java.lang.Object v) {
			return call(parse, v);
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see Date#UTC(Object, Object)
		 * @see Date#UTC(Object, Object, Object)
		 * @see Date#UTC(Object, Object, Object, Object)
		 * @see Date#UTC(Object, Object, Object, Object, Object)
		 * @see Date#UTC(Object, Object, Object, Object, Object, Object)
		 * @see Date#UTC(Object, Object, Object, Object, Object, Object, Object)
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.Number> UTC = new JsFunction.Member<java.lang.Number>(Members.UTC);

		/**
		 * <p>Returns the millisecond representation of the specified UTC date and time.</p>
		 * <p>Note that, in JavaScript <tt>Date.UTC()</tt> is "static" method of the 
		 * global class <tt>Date</tt>;  it is invoked through the <tt>Date()</tt> constructor, 
		 * not through an individual Date object. However, in JS this method is of an 
		 * instance.</p>
		 * <p>The arguments to this method specify a date and time and are understood 
		 * to be in UTC; they are in the GMT time zone. The specified UTC time is converted 
		 * to the millisecond format, which can be used by the {@link JsDate} constructor 
		 * methods and by the {@link JsDate#setTime(Object)} method.</p
		 * <p>The {@link JsDate} constructor methods can accept date and time arguments 
		 * identical to those that this method accepts. The difference is that {@link JsDate} 
		 * constructors assume local time, while this method assumes universal time (GMT).</p
		 * @param yr The year in four-digit format. If this argument is between 0 and 99, 
		 * inclusive, 1900 is added to it and it is treated as a year between 1900 and 1999.
		 * @param mo The month, specified as an integer from 0 (January) to 11 (December).
		 * @return The millisecond representation of the specified universal time. That is, 
		 * this method returns the number of milliseconds between midnight GMT on January 1, 
		 * 1970 and the specified time.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>Date.UTC(yr, mo)</pre>
		 */
		public final java.lang.Number UTC(java.lang.Object yr, java.lang.Object mo) {
			return call(UTC, new Vars<java.lang.Object>().add(yr).add(mo));
		}
		/**
		 * <p>Returns the millisecond representation of the specified UTC date and time.</p>
		 * <p>Note that, in JavaScript <tt>Date.UTC()</tt> is "static" method of the 
		 * global class <tt>Date</tt>;  it is invoked through the <tt>Date()</tt> constructor, 
		 * not through an individual Date object. However, in JS this method is of an 
		 * instance.</p>
		 * <p>The arguments to this method specify a date and time and are understood 
		 * to be in UTC; they are in the GMT time zone. The specified UTC time is converted 
		 * to the millisecond format, which can be used by the {@link JsDate} constructor 
		 * methods and by the {@link JsDate#setTime(Object)} method.</p
		 * <p>The {@link JsDate} constructor methods can accept date and time arguments 
		 * identical to those that this method accepts. The difference is that {@link JsDate} 
		 * constructors assume local time, while this method assumes universal time (GMT).</p
		 * @param yr The year in four-digit format. If this argument is between 0 and 99, 
		 * inclusive, 1900 is added to it and it is treated as a year between 1900 and 1999.
		 * @param mo The month, specified as an integer from 0 (January) to 11 (December).
		 * @param day The day of the month, specified as an integer from 1 to 31. Note that 
		 * this argument uses 1 as its lowest value, while other arguments use 0 as their 
		 * lowest value. This argument is optional.
		 * @return The millisecond representation of the specified universal time. That is, 
		 * this method returns the number of milliseconds between midnight GMT on January 1, 
		 * 1970 and the specified time.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>Date.UTC(yr, mo, day)</pre>
		 */
		public final java.lang.Number UTC(java.lang.Object yr, java.lang.Object mo, java.lang.Object day) {
			return call(UTC, new Vars<java.lang.Object>().add(yr).add(mo).add(day));
		}
		/**
		 * <p>Returns the millisecond representation of the specified UTC date and time.</p>
		 * <p>Note that, in JavaScript <tt>Date.UTC()</tt> is "static" method of the 
		 * global class <tt>Date</tt>;  it is invoked through the <tt>Date()</tt> constructor, 
		 * not through an individual Date object. However, in JS this method is of an 
		 * instance.</p>
		 * <p>The arguments to this method specify a date and time and are understood 
		 * to be in UTC; they are in the GMT time zone. The specified UTC time is converted 
		 * to the millisecond format, which can be used by the {@link JsDate} constructor 
		 * methods and by the {@link JsDate#setTime(Object)} method.</p
		 * <p>The {@link JsDate} constructor methods can accept date and time arguments 
		 * identical to those that this method accepts. The difference is that {@link JsDate} 
		 * constructors assume local time, while this method assumes universal time (GMT).</p
		 * @param yr The year in four-digit format. If this argument is between 0 and 99, 
		 * inclusive, 1900 is added to it and it is treated as a year between 1900 and 1999.
		 * @param mo The month, specified as an integer from 0 (January) to 11 (December).
		 * @param day The day of the month, specified as an integer from 1 to 31. Note that 
		 * this argument uses 1 as its lowest value, while other arguments use 0 as their 
		 * lowest value. This argument is optional.
		 * @param hr The hour, specified as an integer from 0 (midnight) to 23 (11 p.m.). 
		 * This argument is optional.
		 * @return The millisecond representation of the specified universal time. That is, 
		 * this method returns the number of milliseconds between midnight GMT on January 1, 
		 * 1970 and the specified time.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>Date.UTC(yr, mo, day, hr)</pre>
		 */
		public final java.lang.Number UTC(java.lang.Object yr, java.lang.Object mo, java.lang.Object day, java.lang.Object hr) {
			return call(UTC, new Vars<java.lang.Object>().add(yr).add(mo).add(day).add(hr));
		}
		/**
		 * <p>Returns the millisecond representation of the specified UTC date and time.</p>
		 * <p>Note that, in JavaScript <tt>Date.UTC()</tt> is "static" method of the 
		 * global class <tt>Date</tt>;  it is invoked through the <tt>Date()</tt> constructor, 
		 * not through an individual Date object. However, in JS this method is of an 
		 * instance.</p>
		 * <p>The arguments to this method specify a date and time and are understood 
		 * to be in UTC; they are in the GMT time zone. The specified UTC time is converted 
		 * to the millisecond format, which can be used by the {@link JsDate} constructor 
		 * methods and by the {@link JsDate#setTime(Object)} method.</p
		 * <p>The {@link JsDate} constructor methods can accept date and time arguments 
		 * identical to those that this method accepts. The difference is that {@link JsDate} 
		 * constructors assume local time, while this method assumes universal time (GMT).</p
		 * @param yr The year in four-digit format. If this argument is between 0 and 99, 
		 * inclusive, 1900 is added to it and it is treated as a year between 1900 and 1999.
		 * @param mo The month, specified as an integer from 0 (January) to 11 (December).
		 * @param day The day of the month, specified as an integer from 1 to 31. Note that 
		 * this argument uses 1 as its lowest value, while other arguments use 0 as their 
		 * lowest value. This argument is optional.
		 * @param hr The hour, specified as an integer from 0 (midnight) to 23 (11 p.m.). 
		 * This argument is optional.
		 * @param min The minutes in the hour, specified as an integer from 0 to 59. 
		 * This argument is optional.
		 * @return The millisecond representation of the specified universal time. That is, 
		 * this method returns the number of milliseconds between midnight GMT on January 1, 
		 * 1970 and the specified time.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>Date.UTC(yr, mo, day, hr, min)</pre>
		 */
		public final java.lang.Number UTC(java.lang.Object yr, java.lang.Object mo, java.lang.Object day, java.lang.Object hr, java.lang.Object min) {
			return call(UTC, new Vars<java.lang.Object>().add(yr).add(mo).add(day).add(hr).add(min));
		}
		/**
		 * <p>Returns the millisecond representation of the specified UTC date and time.</p>
		 * <p>Note that, in JavaScript <tt>Date.UTC()</tt> is "static" method of the 
		 * global class <tt>Date</tt>;  it is invoked through the <tt>Date()</tt> constructor, 
		 * not through an individual Date object. However, in JS this method is of an 
		 * instance.</p>
		 * <p>The arguments to this method specify a date and time and are understood 
		 * to be in UTC; they are in the GMT time zone. The specified UTC time is converted 
		 * to the millisecond format, which can be used by the {@link JsDate} constructor 
		 * methods and by the {@link JsDate#setTime(Object)} method.</p
		 * <p>The {@link JsDate} constructor methods can accept date and time arguments 
		 * identical to those that this method accepts. The difference is that {@link JsDate} 
		 * constructors assume local time, while this method assumes universal time (GMT).</p
		 * @param yr The year in four-digit format. If this argument is between 0 and 99, 
		 * inclusive, 1900 is added to it and it is treated as a year between 1900 and 1999.
		 * @param mo The month, specified as an integer from 0 (January) to 11 (December).
		 * @param day The day of the month, specified as an integer from 1 to 31. Note that 
		 * this argument uses 1 as its lowest value, while other arguments use 0 as their 
		 * lowest value. This argument is optional.
		 * @param hr The hour, specified as an integer from 0 (midnight) to 23 (11 p.m.). 
		 * This argument is optional.
		 * @param min The minutes in the hour, specified as an integer from 0 to 59. 
		 * This argument is optional.
		 * @param sec The seconds in the minute, specified as an integer from 0 to 59. 
		 * This argument is optional.
		 * @return The millisecond representation of the specified universal time. That is, 
		 * this method returns the number of milliseconds between midnight GMT on January 1, 
		 * 1970 and the specified time.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>Date.UTC(yr, mo, day, hr, min, sec)</pre>
		 */
		public final java.lang.Number UTC(java.lang.Object yr, java.lang.Object mo, java.lang.Object day, java.lang.Object hr, java.lang.Object min, java.lang.Object sec) {
			return call(UTC, new Vars<java.lang.Object>().add(yr).add(mo).add(day).add(hr).add(min).add(sec));
		}
		/**
		 * <p>Returns the millisecond representation of the specified UTC date and time.</p>
		 * <p>Note that, in JavaScript <tt>Date.UTC()</tt> is "static" method of the 
		 * global class <tt>Date</tt>;  it is invoked through the <tt>Date()</tt> constructor, 
		 * not through an individual Date object. However, in JS this method is of an 
		 * instance.</p>
		 * <p>The arguments to this method specify a date and time and are understood 
		 * to be in UTC; they are in the GMT time zone. The specified UTC time is converted 
		 * to the millisecond format, which can be used by the {@link JsDate} constructor 
		 * methods and by the {@link JsDate#setTime(Object)} method.</p
		 * <p>The {@link JsDate} constructor methods can accept date and time arguments 
		 * identical to those that this method accepts. The difference is that {@link JsDate} 
		 * constructors assume local time, while this method assumes universal time (GMT).</p
		 * @param yr The year in four-digit format. If this argument is between 0 and 99, 
		 * inclusive, 1900 is added to it and it is treated as a year between 1900 and 1999.
		 * @param mo The month, specified as an integer from 0 (January) to 11 (December).
		 * @param day The day of the month, specified as an integer from 1 to 31. Note that 
		 * this argument uses 1 as its lowest value, while other arguments use 0 as their 
		 * lowest value. This argument is optional.
		 * @param hr The hour, specified as an integer from 0 (midnight) to 23 (11 p.m.). 
		 * This argument is optional.
		 * @param min The minutes in the hour, specified as an integer from 0 to 59. 
		 * This argument is optional.
		 * @param sec The seconds in the minute, specified as an integer from 0 to 59. 
		 * This argument is optional.
		 * @param ms The number of milliseconds, specified as an integer from 0 to 999. 
		 * This argument is optional and is ignored prior to ECMAScript standardization.
		 * @return The millisecond representation of the specified universal time. That is, 
		 * this method returns the number of milliseconds between midnight GMT on January 1, 
		 * 1970 and the specified time.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>Date.UTC(yr, mo, day, hr, min, sec, ms)</pre>
		 */
		public final java.lang.Number UTC(java.lang.Object yr, java.lang.Object mo, java.lang.Object day, java.lang.Object hr, java.lang.Object min, java.lang.Object sec, java.lang.Object ms) {
			return call(UTC, new Vars<java.lang.Object>().add(yr).add(mo).add(day).add(hr).add(min).add(sec).add(ms));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * <p>The <tt>prototype</tt> property is used when a function is used as a 
		 * constructor. It refers to an object that serves as the prototype for an entire 
		 * class of objects. Any object created by the constructor inherits all properties 
		 * of the object referred to by the <tt>prototype</tt> property.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>Returns the string representation of the current date and time.</p>
		 * <p>In JavaScript, <tt>Date()</tt> may also be called as a function, without the 
		 * <tt>new</tt> operator. When invoked in this way, <tt>Date()</tt> ignores any 
		 * arguments passed to it and returns a string representation of the current date 
		 * and time.</p>
		 * @return The string representation of the current date and time.
		 * @since 1.0
		 * @see #create()
		 * @see Js#date()
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>Date()</pre>
		 */
		@Override
		public final java.lang.String invoke() {return Js.date().toString();}
		/**
		 * <p>Returns the string representation of the current date and time.</p>
		 * <p>In JavaScript, <tt>Date()</tt> may also be called as a function, without the 
		 * <tt>new</tt> operator. When invoked in this way, <tt>Date()</tt> ignores any 
		 * arguments passed to it and returns a string representation of the current date 
		 * and time.</p>
		 * @param arg The argument being ignored.
		 * @return The string representation of the current date and time.
		 * @since 1.0
		 * @see #create()
		 * @see Js#date()
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>Date()</pre>
		 */
		@Override
		public final java.lang.String invoke(java.lang.Object arg) {return Js.date().toString();}
		/**
		 * <p>Returns the string representation of the current date and time.</p>
		 * <p>In JavaScript, <tt>Date()</tt> may also be called as a function, without the 
		 * <tt>new</tt> operator. When invoked in this way, <tt>Date()</tt> ignores any 
		 * arguments passed to it and returns a string representation of the current date 
		 * and time.</p>
		 * @param args The arguments being ignored.
		 * @return The string representation of the current date and time.
		 * @since 1.0
		 * @see #create()
		 * @see Js#date()
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>Date()</pre>
		 */
		@Override
		public final java.lang.String invoke(Vars<?> args) {return Js.date().toString();}
		/**
		 * <p>Constructs a date object set to the current date and time.</p>
		 * <p>In JavaScript, <tt>Date()</tt> may also be called as a function, without the 
		 * <tt>new</tt> operator. When invoked in this way, <tt>Date()</tt> ignores any 
		 * arguments passed to it and returns a string representation of the current date 
		 * and time.</p>
		 * @return The newly constructed date object.
		 * @since 1.0
		 * @see #invoke()
		 * @see Js#date()
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new Date()</pre>
		 */
		@Override
		public final JsDate create() {return new JsDate(super.create());}
		/**
		 * <p>Constructs a date object taking <tt>milliseconds</tt> as the internal numeric 
		 * representation as returned by {@link JsDate#getTime()}.</p>
		 * <p>In JavaScript, <tt>Date()</tt> may also be called as a function, without the 
		 * <tt>new</tt> operator. When invoked in this way, <tt>Date()</tt> ignores any 
		 * arguments passed to it and returns a string representation of the current date 
		 * and time.</p>
		 * @param milliseconds The numeric representation of the date in milliseconds.
		 * @return The newly constructed date object.
		 * @since 1.0
		 * @see Js#date(Number)
		 * @see JsDate#JsDate(Number)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new Date(milliseconds)</pre>
		 */
		public final JsDate create(java.lang.Number milliseconds) {return new JsDate(super.create(milliseconds));}
		/**
		 * <p>Constructs a date object taking <tt>milliseconds</tt> as the internal numeric 
		 * representation as returned by {@link JsDate#getTime()}.</p>
		 * <p>In JavaScript, <tt>Date()</tt> may also be called as a function, without the 
		 * <tt>new</tt> operator. When invoked in this way, <tt>Date()</tt> ignores any 
		 * arguments passed to it and returns a string representation of the current date 
		 * and time.</p>
		 * @param milliseconds The numeric representation of the date in milliseconds.
		 * @return The newly constructed date object.
		 * @since 1.0
		 * @see Js#date(Number)
		 * @see JsDate#JsDate(NumberLike)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new Date(milliseconds)</pre>
		 */
		public final JsDate create(NumberLike<?> milliseconds) {return new JsDate(super.create(milliseconds));}
		/**
		 * <p>Constructs a date object taking <tt>datestring</tt> as the string representation, 
		 * in the format accepted by the {@link #parse(Object)} method.</p>
		 * <p>In JavaScript, <tt>Date()</tt> may also be called as a function, without the 
		 * <tt>new</tt> operator. When invoked in this way, <tt>Date()</tt> ignores any 
		 * arguments passed to it and returns a string representation of the current date 
		 * and time.</p>
		 * <p>In JavaScript, <tt>Date()</tt> may also be called as a function, without the 
		 * <tt>new</tt> operator. When invoked in this way, <tt>Date()</tt> ignores any 
		 * arguments passed to it and returns a string representation of the current date 
		 * and time.</p>
		 * @param datestring The string representation of the date to construct.
		 * @return The newly constructed date object.
		 * @since 1.0
		 * @see Js#date(String)
		 * @see JsDate#JsDate(String)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new Date(datestring)</pre>
		 */
		@Override
		public final JsDate create(java.lang.Object datestring) {return new JsDate(super.create(datestring));}
		/**
		 * <p>Constructs a date object with two to seven numeric arguments that specify the 
		 * individual fields of the date and time. All but the first two arguments, the year 
		 * and month fields, are optional.</p>
		 * <p>Note that these date and time fields are specified using local time, not 
		 * Coordinated Universal Time (UTC) (which is similar to Greenwich Mean Time [GMT]). 
		 * See the static {@link #UTC(Object, Object)}method for an alternative.</p>
		 * <p>In JavaScript, <tt>Date()</tt> may also be called as a function, without the 
		 * <tt>new</tt> operator. When invoked in this way, <tt>Date()</tt> ignores any 
		 * arguments passed to it and returns a string representation of the current date 
		 * and time.</p>
		 * @param yr The year, in four-digit format. For compatibility with early implementations 
		 * of JavaScript, if this argument is between 0 and 99, 1900 is added to it.
		 * @param mo The month, specified as an integer from 0 (January) to 11 (December).
		 * @return The newly constructed date object.
		 * @since 1.0
		 * @see JsDate#JsDate(Object, Object)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new Date(yr, mo)</pre>
		 */
		public final JsDate create(java.lang.Object yr, java.lang.Object mo) {return new JsDate(super.create(new Vars<java.lang.Object>().add(yr).add(mo)));}
		/**
		 * <p>Constructs a date object with two to seven numeric arguments that specify the 
		 * individual fields of the date and time. All but the first two arguments, the year 
		 * and month fields, are optional.</p>
		 * <p>Note that these date and time fields are specified using local time, not 
		 * Coordinated Universal Time (UTC) (which is similar to Greenwich Mean Time [GMT]). 
		 * See the static {@link #UTC(Object, Object)}method for an alternative.</p>
		 * <p>In JavaScript, <tt>Date()</tt> may also be called as a function, without the 
		 * <tt>new</tt> operator. When invoked in this way, <tt>Date()</tt> ignores any 
		 * arguments passed to it and returns a string representation of the current date 
		 * and time.</p>
		 * @param yr The year, in four-digit format. For compatibility with early implementations 
		 * of JavaScript, if this argument is between 0 and 99, 1900 is added to it.
		 * @param mo The month, specified as an integer from 0 (January) to 11 (December).
		 * @param day The day of the month, specified as an integer from 1 to 31. Note that 
		 * this argument uses 1 as its lowest value, while other arguments use 0 as their 
		 * lowest value. Optional.
		 * @return The newly constructed date object.
		 * @since 1.0
		 * @see JsDate#JsDate(Object, Object, Object)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new Date(yr, mo, day)</pre>
		 */
		public final JsDate create(java.lang.Object yr, java.lang.Object mo, java.lang.Object day) {return new JsDate(super.create(new Vars<java.lang.Object>().add(yr).add(mo).add(day)));}
		/**
		 * <p>Constructs a date object with two to seven numeric arguments that specify the 
		 * individual fields of the date and time. All but the first two arguments, the year 
		 * and month fields, are optional.</p>
		 * <p>Note that these date and time fields are specified using local time, not 
		 * Coordinated Universal Time (UTC) (which is similar to Greenwich Mean Time [GMT]). 
		 * See the static {@link #UTC(Object, Object)}method for an alternative.</p>
		 * <p>In JavaScript, <tt>Date()</tt> may also be called as a function, without the 
		 * <tt>new</tt> operator. When invoked in this way, <tt>Date()</tt> ignores any 
		 * arguments passed to it and returns a string representation of the current date 
		 * and time.</p>
		 * @param yr The year, in four-digit format. For compatibility with early implementations 
		 * of JavaScript, if this argument is between 0 and 99, 1900 is added to it.
		 * @param mo The month, specified as an integer from 0 (January) to 11 (December).
		 * @param day The day of the month, specified as an integer from 1 to 31. Note that 
		 * this argument uses 1 as its lowest value, while other arguments use 0 as their 
		 * lowest value. Optional.
		 * @param hr The hour, specified as an integer from 0 (midnight) to 23 (11 p.m.). 
		 * Optional.
		 * @return The newly constructed date object.
		 * @since 1.0
		 * @see JsDate#JsDate(Object, Object, Object, Object)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new Date(yr, mo, day, hr)</pre>
		 */
		public final JsDate create(java.lang.Object yr, java.lang.Object mo, java.lang.Object day, java.lang.Object hr) {return new JsDate(super.create(new Vars<java.lang.Object>().add(yr).add(mo).add(day).add(hr)));}
		/**
		 * <p>Constructs a date object with two to seven numeric arguments that specify the 
		 * individual fields of the date and time. All but the first two arguments, the year 
		 * and month fields, are optional.</p>
		 * <p>Note that these date and time fields are specified using local time, not 
		 * Coordinated Universal Time (UTC) (which is similar to Greenwich Mean Time [GMT]). 
		 * See the static {@link #UTC(Object, Object)}method for an alternative.</p>
		 * <p>In JavaScript, <tt>Date()</tt> may also be called as a function, without the 
		 * <tt>new</tt> operator. When invoked in this way, <tt>Date()</tt> ignores any 
		 * arguments passed to it and returns a string representation of the current date 
		 * and time.</p>
		 * @param yr The year, in four-digit format. For compatibility with early implementations 
		 * of JavaScript, if this argument is between 0 and 99, 1900 is added to it.
		 * @param mo The month, specified as an integer from 0 (January) to 11 (December).
		 * @param day The day of the month, specified as an integer from 1 to 31. Note that 
		 * this argument uses 1 as its lowest value, while other arguments use 0 as their 
		 * lowest value. Optional.
		 * @param hr The hour, specified as an integer from 0 (midnight) to 23 (11 p.m.). 
		 * Optional.
		 * @param min The minutes in the hour, specified as an integer from 0 to 59. Optional.
		 * @return The newly constructed date object.
		 * @since 1.0
		 * @see JsDate#JsDate(Object, Object, Object, Object, Object)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new Date(yr, mo, day, hr, min)</pre>
		 */
		public final JsDate create(java.lang.Object yr, java.lang.Object mo, java.lang.Object day, java.lang.Object hr, java.lang.Object min) {return new JsDate(super.create(new Vars<java.lang.Object>().add(yr).add(mo).add(day).add(hr).add(min)));}
		/**
		 * <p>Constructs a date object with two to seven numeric arguments that specify the 
		 * individual fields of the date and time. All but the first two arguments, the year 
		 * and month fields, are optional.</p>
		 * <p>Note that these date and time fields are specified using local time, not 
		 * Coordinated Universal Time (UTC) (which is similar to Greenwich Mean Time [GMT]). 
		 * See the static {@link #UTC(Object, Object)}method for an alternative.</p>
		 * <p>In JavaScript, <tt>Date()</tt> may also be called as a function, without the 
		 * <tt>new</tt> operator. When invoked in this way, <tt>Date()</tt> ignores any 
		 * arguments passed to it and returns a string representation of the current date 
		 * and time.</p>
		 * @param yr The year, in four-digit format. For compatibility with early implementations 
		 * of JavaScript, if this argument is between 0 and 99, 1900 is added to it.
		 * @param mo The month, specified as an integer from 0 (January) to 11 (December).
		 * @param day The day of the month, specified as an integer from 1 to 31. Note that 
		 * this argument uses 1 as its lowest value, while other arguments use 0 as their 
		 * lowest value. Optional.
		 * @param hr The hour, specified as an integer from 0 (midnight) to 23 (11 p.m.). 
		 * Optional.
		 * @param min The minutes in the hour, specified as an integer from 0 to 59. Optional.
		 * @param sec The seconds in the minute, specified as an integer from 0 to 59. Optional.
		 * @return The newly constructed date object.
		 * @since 1.0
		 * @see JsDate#JsDate(Object, Object, Object, Object, Object, Object)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new Date(yr, mo, day, hr, min, sec)</pre>
		 */
		public final JsDate create(java.lang.Object yr, java.lang.Object mo, java.lang.Object day, java.lang.Object hr, java.lang.Object min, java.lang.Object sec) {return new JsDate(super.create(new Vars<java.lang.Object>().add(yr).add(mo).add(day).add(hr).add(min).add(sec)));}
		/**
		 * <p>Constructs a date object with two to seven numeric arguments that specify the 
		 * individual fields of the date and time. All but the first two arguments, the year 
		 * and month fields, are optional.</p>
		 * <p>Note that these date and time fields are specified using local time, not 
		 * Coordinated Universal Time (UTC) (which is similar to Greenwich Mean Time [GMT]). 
		 * See the static {@link #UTC(Object, Object)}method for an alternative.</p>
		 * <p>In JavaScript, <tt>Date()</tt> may also be called as a function, without the 
		 * <tt>new</tt> operator. When invoked in this way, <tt>Date()</tt> ignores any 
		 * arguments passed to it and returns a string representation of the current date 
		 * and time.</p>
		 * @param yr The year, in four-digit format. For compatibility with early implementations 
		 * of JavaScript, if this argument is between 0 and 99, 1900 is added to it.
		 * @param mo The month, specified as an integer from 0 (January) to 11 (December).
		 * @param day The day of the month, specified as an integer from 1 to 31. Note that 
		 * this argument uses 1 as its lowest value, while other arguments use 0 as their 
		 * lowest value. Optional.
		 * @param hr The hour, specified as an integer from 0 (midnight) to 23 (11 p.m.). 
		 * Optional.
		 * @param min The minutes in the hour, specified as an integer from 0 to 59. Optional.
		 * @param sec The seconds in the minute, specified as an integer from 0 to 59. Optional.
		 * @param ms The milliseconds in the second, specified as an integer from 0 to 999. 
		 * Optional.
		 * @return The newly constructed date object.
		 * @since 1.0
		 * @see JsDate#JsDate(Object, Object, Object, Object, Object, Object, Object)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new Date(yr, mo, day, hr, min, sec, ms)</pre>
		 */
		public final JsDate create(java.lang.Object yr, java.lang.Object mo, java.lang.Object day, java.lang.Object hr, java.lang.Object min, java.lang.Object sec, java.lang.Object ms) {return new JsDate(super.create(new Vars<java.lang.Object>().add(yr).add(mo).add(day).add(hr).add(min).add(sec).add(ms)));}
		/**
		 * <p>Constructs a date object with two to seven numeric arguments that specify the 
		 * individual fields of the date and time. All but the first two arguments, the year 
		 * and month fields, are optional.</p>
		 * <p>Note that these date and time fields are specified using local time, not 
		 * Coordinated Universal Time (UTC) (which is similar to Greenwich Mean Time [GMT]). 
		 * See the static {@link #UTC(Object, Object)}method for an alternative.</p>
		 * <p>In JavaScript, <tt>Date()</tt> may also be called as a function, without the 
		 * <tt>new</tt> operator. When invoked in this way, <tt>Date()</tt> ignores any 
		 * arguments passed to it and returns a string representation of the current date 
		 * and time.</p>
		 * @param args The variable argument with two to seven numeric values that specify the 
		 * individual fields of the date and time.
		 * @return The newly constructed date object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new Date(args)</pre>
		 * where <tt>args</tt> must be expanded to comma-separated argument values.
		 */
		@Override
		public final JsDate create(Vars<?> args) {return new JsDate(super.create(args));}

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
				 * @see JsGlobal.Date.Prototype#getTime
				 * @see JsGlobal.Date.Prototype.Member#getTime
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid getTime            = id("getTime"           );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#getFullYear
				 * @see JsGlobal.Date.Prototype.Member#getFullYear
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid getFullYear        = id("getFullYear"       );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#getUTCFullYear
				 * @see JsGlobal.Date.Prototype.Member#getUTCFullYear
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid getUTCFullYear     = id("getUTCFullYear"    );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#getMonth
				 * @see JsGlobal.Date.Prototype.Member#getMonth
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid getMonth           = id("getMonth"          );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#getUTCMonth
				 * @see JsGlobal.Date.Prototype.Member#getUTCMonth
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid getUTCMonth        = id("getUTCMonth"       );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#getDate
				 * @see JsGlobal.Date.Prototype.Member#getDate
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid getDate            = id("getDate"           );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#getUTCDate
				 * @see JsGlobal.Date.Prototype.Member#getUTCDate
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid getUTCDate         = id("getUTCDate"        );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#getDay
				 * @see JsGlobal.Date.Prototype.Member#getDay
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid getDay             = id("getDay"            );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#getUTCDay
				 * @see JsGlobal.Date.Prototype.Member#getUTCDay
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid getUTCDay          = id("getUTCDay"         );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#getHours
				 * @see JsGlobal.Date.Prototype.Member#getHours
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid getHours           = id("getHours"          );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#getUTCHours
				 * @see JsGlobal.Date.Prototype.Member#getUTCHours
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid getUTCHours        = id("getUTCHours"       );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#getMinutes
				 * @see JsGlobal.Date.Prototype.Member#getMinutes
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid getMinutes         = id("getMinutes"        );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#getUTCMinutes
				 * @see JsGlobal.Date.Prototype.Member#getUTCMinutes
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid getUTCMinutes      = id("getUTCMinutes"     );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#getSeconds
				 * @see JsGlobal.Date.Prototype.Member#getSeconds
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid getSeconds         = id("getSeconds"        );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#getUTCSeconds
				 * @see JsGlobal.Date.Prototype.Member#getUTCSeconds
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid getUTCSeconds      = id("getUTCSeconds"     );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#getMilliseconds
				 * @see JsGlobal.Date.Prototype.Member#getMilliseconds
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid getMilliseconds    = id("getMilliseconds"   );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#getUTCMilliseconds
				 * @see JsGlobal.Date.Prototype.Member#getUTCMilliseconds
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid getUTCMilliseconds = id("getUTCMilliseconds");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#getTimezoneOffset
				 * @see JsGlobal.Date.Prototype.Member#getTimezoneOffset
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid getTimezoneOffset  = id("getTimezoneOffset" );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#setTime
				 * @see JsGlobal.Date.Prototype.Member#setTime
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid setTime            = id("setTime"           );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#setMilliseconds
				 * @see JsGlobal.Date.Prototype.Member#setMilliseconds
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid setMilliseconds    = id("setMilliseconds"   );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#setUTCMilliseconds
				 * @see JsGlobal.Date.Prototype.Member#setUTCMilliseconds
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid setUTCMilliseconds = id("setUTCMilliseconds");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#setSeconds
				 * @see JsGlobal.Date.Prototype.Member#setSeconds
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid setSeconds         = id("setSeconds"        );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#setUTCSeconds
				 * @see JsGlobal.Date.Prototype.Member#setUTCSeconds
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid setUTCSeconds      = id("setUTCSeconds"     );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#setMinutes
				 * @see JsGlobal.Date.Prototype.Member#setMinutes
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid setMinutes         = id("setMinutes"        );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#setUTCMinutes
				 * @see JsGlobal.Date.Prototype.Member#setUTCMinutes
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid setUTCMinutes      = id("setUTCMinutes"     );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#setHours
				 * @see JsGlobal.Date.Prototype.Member#setHours
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid setHours           = id("setHours"          );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#setUTCHours
				 * @see JsGlobal.Date.Prototype.Member#setUTCHours
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid setUTCHours        = id("setUTCHours"       );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#setDate
				 * @see JsGlobal.Date.Prototype.Member#setDate
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid setDate            = id("setDate"           );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#setUTCDate
				 * @see JsGlobal.Date.Prototype.Member#setUTCDate
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid setUTCDate         = id("setUTCDate"        );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#setMonth
				 * @see JsGlobal.Date.Prototype.Member#setMonth
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid setMonth           = id("setMonth"          );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#setUTCMonth
				 * @see JsGlobal.Date.Prototype.Member#setUTCMonth
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid setUTCMonth        = id("setUTCMonth"       );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#setFullYear
				 * @see JsGlobal.Date.Prototype.Member#setFullYear
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid setFullYear        = id("setFullYear"       );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#setUTCFullYear
				 * @see JsGlobal.Date.Prototype.Member#setUTCFullYear
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid setUTCFullYear     = id("setUTCFullYear"    );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#toDateString
				 * @see JsGlobal.Date.Prototype.Member#toDateString
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid toDateString       = id("toDateString"      );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#toTimeString
				 * @see JsGlobal.Date.Prototype.Member#toTimeString
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid toTimeString       = id("toTimeString"      );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#toLocaleDateString
				 * @see JsGlobal.Date.Prototype.Member#toLocaleDateString
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid toLocaleDateString = id("toLocaleDateString");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#toLocaleTimeString
				 * @see JsGlobal.Date.Prototype.Member#toLocaleTimeString
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid toLocaleTimeString = id("toLocaleTimeString");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Date.Prototype#toUTCString
				 * @see JsGlobal.Date.Prototype.Member#toUTCString
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid toUTCString        = id("toUTCString"       );
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
				protected Member(JsObject.Member q, Mid mid) {
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
				protected Member(Mid mid) {
					super(mid);
				}
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
				@Override
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> valueOf            = new JsFunction.Member<java.lang.Number>(this, Members.valueOf           );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#getTime()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> getTime            = new JsFunction.Member<java.lang.Number>(this, Members.getTime           );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#getFullYear()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> getFullYear        = new JsFunction.Member<java.lang.Number>(this, Members.getFullYear       );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#getUTCFullYear()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> getUTCFullYear     = new JsFunction.Member<java.lang.Number>(this, Members.getUTCFullYear    );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#getMonth()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> getMonth           = new JsFunction.Member<java.lang.Number>(this, Members.getMonth          );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#getUTCMonth()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> getUTCMonth        = new JsFunction.Member<java.lang.Number>(this, Members.getUTCMonth       );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#getDate()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> getDate            = new JsFunction.Member<java.lang.Number>(this, Members.getDate           );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#getUTCDate()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> getUTCDate         = new JsFunction.Member<java.lang.Number>(this, Members.getUTCDate        );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#getDay()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> getDay             = new JsFunction.Member<java.lang.Number>(this, Members.getDay            );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#getUTCDay()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> getUTCDay          = new JsFunction.Member<java.lang.Number>(this, Members.getUTCDay         );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#getHours()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> getHours           = new JsFunction.Member<java.lang.Number>(this, Members.getHours          );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#getUTCHours()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> getUTCHours        = new JsFunction.Member<java.lang.Number>(this, Members.getUTCHours       );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#getMinutes()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> getMinutes         = new JsFunction.Member<java.lang.Number>(this, Members.getMinutes        );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#getUTCMinutes()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> getUTCMinutes      = new JsFunction.Member<java.lang.Number>(this, Members.getUTCMinutes     );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#getSeconds()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> getSeconds         = new JsFunction.Member<java.lang.Number>(this, Members.getSeconds        );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#getUTCSeconds()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> getUTCSeconds      = new JsFunction.Member<java.lang.Number>(this, Members.getUTCSeconds     );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#getMilliseconds()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> getMilliseconds    = new JsFunction.Member<java.lang.Number>(this, Members.getMilliseconds   );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#getUTCMilliseconds()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> getUTCMilliseconds = new JsFunction.Member<java.lang.Number>(this, Members.getUTCMilliseconds);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#getTimezoneOffset()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> getTimezoneOffset  = new JsFunction.Member<java.lang.Number>(this, Members.getTimezoneOffset );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#setTime(Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> setTime            = new JsFunction.Member<java.lang.Number>(this, Members.setTime           );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#setMilliseconds(Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> setMilliseconds    = new JsFunction.Member<java.lang.Number>(this, Members.setMilliseconds   );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#setUTCMilliseconds(Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> setUTCMilliseconds = new JsFunction.Member<java.lang.Number>(this, Members.setUTCMilliseconds);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#setSeconds(Object)
				 * @see JsDate#setSeconds(Object, Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> setSeconds         = new JsFunction.Member<java.lang.Number>(this, Members.setSeconds        );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#setUTCSeconds(Object)
				 * @see JsDate#setUTCSeconds(Object, Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> setUTCSeconds      = new JsFunction.Member<java.lang.Number>(this, Members.setUTCSeconds     );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#setMinutes(Object)
				 * @see JsDate#setMinutes(Object, Object)
				 * @see JsDate#setMinutes(Object, Object, Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> setMinutes         = new JsFunction.Member<java.lang.Number>(this, Members.setMinutes        );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#setUTCMinutes(Object)
				 * @see JsDate#setUTCMinutes(Object, Object)
				 * @see JsDate#setUTCMinutes(Object, Object, Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> setUTCMinutes      = new JsFunction.Member<java.lang.Number>(this, Members.setUTCMinutes     );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#setHours(Object)
				 * @see JsDate#setHours(Object, Object)
				 * @see JsDate#setHours(Object, Object, Object)
				 * @see JsDate#setHours(Object, Object, Object, Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> setHours           = new JsFunction.Member<java.lang.Number>(this, Members.setHours          );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#setUTCHours(Object)
				 * @see JsDate#setUTCHours(Object, Object)
				 * @see JsDate#setUTCHours(Object, Object, Object)
				 * @see JsDate#setUTCHours(Object, Object, Object, Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> setUTCHours        = new JsFunction.Member<java.lang.Number>(this, Members.setUTCHours       );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#setDate(Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> setDate            = new JsFunction.Member<java.lang.Number>(this, Members.setDate           );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#setUTCDate(Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> setUTCDate         = new JsFunction.Member<java.lang.Number>(this, Members.setUTCDate        );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#setMonth(Object)
				 * @see JsDate#setMonth(Object, Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> setMonth           = new JsFunction.Member<java.lang.Number>(this, Members.setMonth          );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#setUTCMonth(Object)
				 * @see JsDate#setUTCMonth(Object, Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> setUTCMonth        = new JsFunction.Member<java.lang.Number>(this, Members.setUTCMonth       );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#setFullYear(Object)
				 * @see JsDate#setFullYear(Object, Object)
				 * @see JsDate#setFullYear(Object, Object, Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> setFullYear        = new JsFunction.Member<java.lang.Number>(this, Members.setFullYear       );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#setUTCFullYear(Object)
				 * @see JsDate#setUTCFullYear(Object, Object)
				 * @see JsDate#setUTCFullYear(Object, Object, Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> setUTCFullYear     = new JsFunction.Member<java.lang.Number>(this, Members.setUTCFullYear    );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#toDateString()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String> toDateString       = new JsFunction.Member<java.lang.String>(this, Members.toDateString      );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#toTimeString()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String> toTimeString       = new JsFunction.Member<java.lang.String>(this, Members.toTimeString      );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#toLocaleDateString()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String> toLocaleDateString = new JsFunction.Member<java.lang.String>(this, Members.toLocaleDateString);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#toLocaleTimeString()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String> toLocaleString     = new JsFunction.Member<java.lang.String>(this, Members.toLocaleString    );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsDate#toUTCString()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String> toLocaleTimeString = new JsFunction.Member<java.lang.String>(this, Members.toLocaleTimeString);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String> toUTCString        = new JsFunction.Member<java.lang.String>(this, Members.toUTCString       );
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
			 * @see JsDate#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> valueOf            = new JsFunction.Member<java.lang.Number>(Members.valueOf           );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#getTime()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> getTime            = new JsFunction.Member<java.lang.Number>(Members.getTime           );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#getFullYear()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> getFullYear        = new JsFunction.Member<java.lang.Number>(Members.getFullYear       );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#getUTCFullYear()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> getUTCFullYear     = new JsFunction.Member<java.lang.Number>(Members.getUTCFullYear    );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#getMonth()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> getMonth           = new JsFunction.Member<java.lang.Number>(Members.getMonth          );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#getUTCMonth()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> getUTCMonth        = new JsFunction.Member<java.lang.Number>(Members.getUTCMonth       );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#getDate()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> getDate            = new JsFunction.Member<java.lang.Number>(Members.getDate           );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#getUTCDate()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> getUTCDate         = new JsFunction.Member<java.lang.Number>(Members.getUTCDate        );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#getDay()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> getDay             = new JsFunction.Member<java.lang.Number>(Members.getDay            );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#getUTCDay()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> getUTCDay          = new JsFunction.Member<java.lang.Number>(Members.getUTCDay         );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#getHours()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> getHours           = new JsFunction.Member<java.lang.Number>(Members.getHours          );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#getUTCHours()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> getUTCHours        = new JsFunction.Member<java.lang.Number>(Members.getUTCHours       );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#getMinutes()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> getMinutes         = new JsFunction.Member<java.lang.Number>(Members.getMinutes        );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#getUTCMinutes()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> getUTCMinutes      = new JsFunction.Member<java.lang.Number>(Members.getUTCMinutes     );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#getSeconds()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> getSeconds         = new JsFunction.Member<java.lang.Number>(Members.getSeconds        );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#getUTCSeconds()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> getUTCSeconds      = new JsFunction.Member<java.lang.Number>(Members.getUTCSeconds     );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#getMilliseconds()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> getMilliseconds    = new JsFunction.Member<java.lang.Number>(Members.getMilliseconds   );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#getUTCMilliseconds()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> getUTCMilliseconds = new JsFunction.Member<java.lang.Number>(Members.getUTCMilliseconds);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#getTimezoneOffset()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> getTimezoneOffset  = new JsFunction.Member<java.lang.Number>(Members.getTimezoneOffset );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#setTime(Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> setTime            = new JsFunction.Member<java.lang.Number>(Members.setTime           );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#setMilliseconds(Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> setMilliseconds    = new JsFunction.Member<java.lang.Number>(Members.setMilliseconds   );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#setUTCMilliseconds(Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> setUTCMilliseconds = new JsFunction.Member<java.lang.Number>(Members.setUTCMilliseconds);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#setSeconds(Object)
			 * @see JsDate#setSeconds(Object, Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> setSeconds         = new JsFunction.Member<java.lang.Number>(Members.setSeconds        );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#setUTCSeconds(Object)
			 * @see JsDate#setUTCSeconds(Object, Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> setUTCSeconds      = new JsFunction.Member<java.lang.Number>(Members.setUTCSeconds     );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#setMinutes(Object)
			 * @see JsDate#setMinutes(Object, Object)
			 * @see JsDate#setMinutes(Object, Object, Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> setMinutes         = new JsFunction.Member<java.lang.Number>(Members.setMinutes        );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#setUTCMinutes(Object)
			 * @see JsDate#setUTCMinutes(Object, Object)
			 * @see JsDate#setUTCMinutes(Object, Object, Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> setUTCMinutes      = new JsFunction.Member<java.lang.Number>(Members.setUTCMinutes     );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#setHours(Object)
			 * @see JsDate#setHours(Object, Object)
			 * @see JsDate#setHours(Object, Object, Object)
			 * @see JsDate#setHours(Object, Object, Object, Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> setHours           = new JsFunction.Member<java.lang.Number>(Members.setHours          );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#setUTCHours(Object)
			 * @see JsDate#setUTCHours(Object, Object)
			 * @see JsDate#setUTCHours(Object, Object, Object)
			 * @see JsDate#setUTCHours(Object, Object, Object, Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> setUTCHours        = new JsFunction.Member<java.lang.Number>(Members.setUTCHours       );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#setDate(Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> setDate            = new JsFunction.Member<java.lang.Number>(Members.setDate           );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#setUTCDate(Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> setUTCDate         = new JsFunction.Member<java.lang.Number>(Members.setUTCDate        );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#setMonth(Object)
			 * @see JsDate#setMonth(Object, Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> setMonth           = new JsFunction.Member<java.lang.Number>(Members.setMonth          );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#setUTCMonth(Object)
			 * @see JsDate#setUTCMonth(Object, Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> setUTCMonth        = new JsFunction.Member<java.lang.Number>(Members.setUTCMonth       );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#setFullYear(Object)
			 * @see JsDate#setFullYear(Object, Object)
			 * @see JsDate#setFullYear(Object, Object, Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> setFullYear        = new JsFunction.Member<java.lang.Number>(Members.setFullYear       );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#setUTCFullYear(Object)
			 * @see JsDate#setUTCFullYear(Object, Object)
			 * @see JsDate#setUTCFullYear(Object, Object, Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> setUTCFullYear     = new JsFunction.Member<java.lang.Number>(Members.setUTCFullYear    );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#toDateString()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String> toDateString       = new JsFunction.Member<java.lang.String>(Members.toDateString      );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#toTimeString()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String> toTimeString       = new JsFunction.Member<java.lang.String>(Members.toTimeString      );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#toLocaleDateString()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String> toLocaleDateString = new JsFunction.Member<java.lang.String>(Members.toLocaleDateString);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#toLocaleString()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String> toLocaleString     = new JsFunction.Member<java.lang.String>(Members.toLocaleString    );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#toLocaleTimeString()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String> toLocaleTimeString = new JsFunction.Member<java.lang.String>(Members.toLocaleTimeString);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsDate#toUTCString()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String> toUTCString        = new JsFunction.Member<java.lang.String>(Members.toUTCString       );
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global Function class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class Function<T> extends JsFunction<JsFunction<T>>
	{
		public static class Member<T> extends JsFunction.Member<JsFunction<T>>
		{
			private Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
			private Member(Mid mid) {
				super(mid);
			}
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
			@Override
			public Function<T> with(ObjectLike o) {
				return new Function<T>(super.with(o));
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
			@Override
			public Function<T> with() {
				return with(Js.core());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * <p>The <tt>prototype</tt> property is used when a function is used as a 
			 * constructor. It refers to an object that serves as the prototype for an entire 
			 * class of objects. Any object created by the constructor inherits all properties 
			 * of the object referred to by the <tt>prototype</tt> property.</p>
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
		public Function(JsObject var) {
			super(var);
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * <p>The <tt>prototype</tt> property is used when a function is used as a 
		 * constructor. It refers to an object that serves as the prototype for an entire 
		 * class of objects. Any object created by the constructor inherits all properties 
		 * of the object referred to by the <tt>prototype</tt> property.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>Creates an empty JavaScript function.</p>
		 * <p>A function is a fundamental data-type in JavaScript. Note that although functions 
		 * may be created with this method, this is not efficient, and the preferred way to 
		 * define functions, in most cases, is to extend {@link js.Function}.</p>
		 * @return A newly created empty function. 
		 * @see #create(String)
		 * @see #create(String, String)
		 * @see #create(Vars, String)
		 * @see js.Function
		 * @see js.Js#function()
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new Function()</pre>
		 */
		@Override
		public final JsFunction<T> create() {
			return new JsFunction<T>(Js.function());
		}
		/**
		 * <p>Creates a JavaScript function that has no argument names.</p>
		 * <p>A function is a fundamental data-type in JavaScript. Note that although functions 
		 * may be created with this method, this is not efficient, and the preferred way to 
		 * define functions, in most cases, is to extend {@link js.Function}.</p>
		 * @param body A string that specifies the body of the function.
		 * @return A newly created function. Invoking it executes the JavaScript code specified 
		 * by <tt>body</tt>.
		 * @throws RuntimeException JavaScript throws a <tt>SyntaxError</tt> if there was a 
		 * JavaScript syntax error in one of the value of <tt>body</tt>. See {@link js.Js#err(Object)} 
		 * and {@link js.core.JsSyntaxError} for JS Simulation.
		 * @see #create()
		 * @see #create(String)
		 * @see #create(String, String)
		 * @see js.Function
		 * @see js.Js#function(String)
		 * @see js.Js#function(Vars, String)
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new Function(body)</pre>
		 */
		public final JsFunction<T> create(java.lang.String body) {
			return new JsFunction<T>(Js.function(body));
		}
		/**
		 * <p>Creates a JavaScript function with an argument name.</p>
		 * <p>A function is a fundamental data-type in JavaScript. Note that although functions 
		 * may be created with this method, this is not efficient, and the preferred way to 
		 * define functions, in most cases, is to extend {@link js.Function}.</p>
		 * @param argname A string literal, naming an argument of the function being created.
		 * @param body A string that specifies the body of the function.
		 * @return A newly created function. Invoking it executes the JavaScript code specified 
		 * by <tt>body</tt>.
		 * @throws RuntimeException JavaScript throws a <tt>SyntaxError</tt> if there was a 
		 * JavaScript syntax error in one of the value of the variable arguments or <tt>body</tt>. 
		 * See {@link js.Js#err(Object)} and {@link js.core.JsSyntaxError} for JS Simulation.
		 * @see #create()
		 * @see #create(String)
		 * @see #create(Vars, String)
		 * @see js.Function
		 * @see js.Js#function(String, String)
		 * @see js.Js#function(Vars, String)
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new Function(argname, body)</pre>
		 * where <tt>argname</tt> must be a string literal and converted into an argument name.
		 */
		public final JsFunction<T> create(java.lang.String argname, java.lang.String body) {
			return new JsFunction<T>(Js.function(argname, body));
		}
		/**
		 * <p>Creates a JavaScript function.</p>
		 * <p>A function is a fundamental data-type in JavaScript. Note that although functions 
		 * may be created with this method, this is not efficient, and the preferred way to 
		 * define functions, in most cases, is to extend {@link js.Function}.</p>
		 * @param argnames A list of the argument values, each naming one or more arguments of the 
		 * function being created.
		 * @param body A string that specifies the body of the function.
		 * @return A newly created function. Invoking it executes the JavaScript code specified 
		 * by <tt>body</tt>.
		 * @throws RuntimeException JavaScript throws a <tt>SyntaxError</tt> if there was a 
		 * JavaScript syntax error in one of the value of the variable arguments and <tt>body</tt>. 
		 * See {@link js.Js#err(Object)} and {@link js.core.JsSyntaxError} for JS Simulation.
		 * @see #create()
		 * @see #create(String)
		 * @see #create(String, String)
		 * @see js.Function
		 * @see js.Js#function(Vars, String)
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new Function(argnames, body)</pre>
		 * where <tt>argnames</tt> must be a list of string literals and expanded into 
		 * comma-separated argument names.
		 */
		public final JsFunction<T> create(Vars<java.lang.String> argnames, java.lang.String body) {
			return new JsFunction<T>(Js.function(argnames, body));
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
				protected Member(JsObject.Member q, Mid mid) {
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
				protected Member(Mid mid) {
					super(mid);
				}
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
				@Override
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
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
			public Prototype(JsObject var) {
				super(var);
			}
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global Error class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class Error extends JsFunction<JsError>
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
		public static class Member extends JsFunction.Member<JsError>
		{
			private Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
			private Member(Mid mid) {
				super(mid);
			}
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
			@Override
			public Error with(ObjectLike o) {
				return new Error(super.with(o));
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
			@Override
			public Error with() {
				return with(Js.core());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * <p>The <tt>prototype</tt> property is used when a function is used as a 
			 * constructor. It refers to an object that serves as the prototype for an entire 
			 * class of objects. Any object created by the constructor inherits all properties 
			 * of the object referred to by the <tt>prototype</tt> property.</p>
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
		public Error(JsObject var) {
			super(var);
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * <p>The <tt>prototype</tt> property is used when a function is used as a 
		 * constructor. It refers to an object that serves as the prototype for an entire 
		 * class of objects. Any object created by the constructor inherits all properties 
		 * of the object referred to by the <tt>prototype</tt> property.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>Constructs a JavaScript Error object with its <tt>message</tt> property being an 
		 * implementation-defined default string.</p>
		 * <p>In JavaScript, When the <tt>Error()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>Instances of the <tt>Error</tt> represent errors or exceptions and are typically used 
		 * with the <tt>throw</tt> and <tt>try/catch</tt> statements in JavaScript. The <tt>name</tt> 
		 * property specifies the type of the exception, and the <tt>message</tt> property can 
		 * provide human-readable details about the exception.</p>
		 * <p>The JavaScript interpreter never throws <tt>Error</tt> objects directly; instead, it 
		 * throws instances of one of the <tt>Error</tt> subclasses, such as <tt>SyntaxError</tt> 
		 * or <tt>RangeError</tt>. In your own JavaScript code, you may find it convenient to 
		 * throw <tt>Error</tt> objects to signal exceptions, or you may prefer to simply throw an 
		 * error message or error code as a primitive string or number value.</p>
		 * <p>Note that the ECMAScript specification defines a <tt>toString()</tt> method for the 
		 * <tt>Error</tt> class (it is inherited by each of the subclasses of <tt>Error</tt>) but 
		 * that it does not require this <tt>toString()</tt> method to return a string that contains 
		 * the contents of the <tt>message</tt> property. Therefore, you should not expect the 
		 * <tt>toString()</tt> method to convert an <tt>Error</tt> object to a meaningful, 
		 * human-readable string. To display an error message to a user, you should explicitly use 
		 * the <tt>name</tt> and <tt>message</tt> properties of the <tt>Error</tt> object.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @return A newly constructed <tt>Error</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new Error()</pre>
		 */
		@Override
		public final JsError create() {
			return new JsError(super.create());
		}
		/**
		 * <p>Constructs a JavaScript Error object with its <tt>message</tt> property being an 
		 * implementation-defined default string.</p>
		 * <p>In JavaScript, When the <tt>Error()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>Instances of the <tt>Error</tt> represent errors or exceptions and are typically used 
		 * with the <tt>throw</tt> and <tt>try/catch</tt> statements in JavaScript. The <tt>name</tt> 
		 * property specifies the type of the exception, and the <tt>message</tt> property can 
		 * provide human-readable details about the exception.</p>
		 * <p>The JavaScript interpreter never throws <tt>Error</tt> objects directly; instead, it 
		 * throws instances of one of the <tt>Error</tt> subclasses, such as <tt>SyntaxError</tt> 
		 * or <tt>RangeError</tt>. In your own JavaScript code, you may find it convenient to 
		 * throw <tt>Error</tt> objects to signal exceptions, or you may prefer to simply throw an 
		 * error message or error code as a primitive string or number value.</p>
		 * <p>Note that the ECMAScript specification defines a <tt>toString()</tt> method for the 
		 * <tt>Error</tt> class (it is inherited by each of the subclasses of <tt>Error</tt>) but 
		 * that it does not require this <tt>toString()</tt> method to return a string that contains 
		 * the contents of the <tt>message</tt> property. Therefore, you should not expect the 
		 * <tt>toString()</tt> method to convert an <tt>Error</tt> object to a meaningful, 
		 * human-readable string. To display an error message to a user, you should explicitly use 
		 * the <tt>name</tt> and <tt>message</tt> properties of the <tt>Error</tt> object.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @return A newly constructed <tt>Error</tt> object.
		 * @since 1.0
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>Error()</pre>
		 */
		@Override
		public final JsError invoke() {
			return new JsError(super.create());
		}
		/**
		 * <p>Constructs a JavaScript Error object.</p>
		 * <p>In JavaScript, When the <tt>Error()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>Instances of the <tt>Error</tt> represent errors or exceptions and are typically used 
		 * with the <tt>throw</tt> and <tt>try/catch</tt> statements in JavaScript. The <tt>name</tt> 
		 * property specifies the type of the exception, and the <tt>message</tt> property can 
		 * provide human-readable details about the exception.</p>
		 * <p>The JavaScript interpreter never throws <tt>Error</tt> objects directly; instead, it 
		 * throws instances of one of the <tt>Error</tt> subclasses, such as <tt>SyntaxError</tt> 
		 * or <tt>RangeError</tt>. In your own JavaScript code, you may find it convenient to 
		 * throw <tt>Error</tt> objects to signal exceptions, or you may prefer to simply throw an 
		 * error message or error code as a primitive string or number value.</p>
		 * <p>Note that the ECMAScript specification defines a <tt>toString()</tt> method for the 
		 * <tt>Error</tt> class (it is inherited by each of the subclasses of <tt>Error</tt>) but 
		 * that it does not require this <tt>toString()</tt> method to return a string that contains 
		 * the contents of the <tt>message</tt> property. Therefore, you should not expect the 
		 * <tt>toString()</tt> method to convert an <tt>Error</tt> object to a meaningful, 
		 * human-readable string. To display an error message to a user, you should explicitly use 
		 * the <tt>name</tt> and <tt>message</tt> properties of the <tt>Error</tt> object.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param message An optional error message that provides details about the exception.
		 * @return A newly constructed <tt>Error</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new Error(message)</pre>
		 */
		@Override
		public final JsError create(java.lang.Object message) {
			return new JsError(super.create(message));
		}
		/**
		 * <p>Constructs a JavaScript Error object.</p>
		 * <p>In JavaScript, When the <tt>Error()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>Instances of the <tt>Error</tt> represent errors or exceptions and are typically used 
		 * with the <tt>throw</tt> and <tt>try/catch</tt> statements in JavaScript. The <tt>name</tt> 
		 * property specifies the type of the exception, and the <tt>message</tt> property can 
		 * provide human-readable details about the exception.</p>
		 * <p>The JavaScript interpreter never throws <tt>Error</tt> objects directly; instead, it 
		 * throws instances of one of the <tt>Error</tt> subclasses, such as <tt>SyntaxError</tt> 
		 * or <tt>RangeError</tt>. In your own JavaScript code, you may find it convenient to 
		 * throw <tt>Error</tt> objects to signal exceptions, or you may prefer to simply throw an 
		 * error message or error code as a primitive string or number value.</p>
		 * <p>Note that the ECMAScript specification defines a <tt>toString()</tt> method for the 
		 * <tt>Error</tt> class (it is inherited by each of the subclasses of <tt>Error</tt>) but 
		 * that it does not require this <tt>toString()</tt> method to return a string that contains 
		 * the contents of the <tt>message</tt> property. Therefore, you should not expect the 
		 * <tt>toString()</tt> method to convert an <tt>Error</tt> object to a meaningful, 
		 * human-readable string. To display an error message to a user, you should explicitly use 
		 * the <tt>name</tt> and <tt>message</tt> properties of the <tt>Error</tt> object.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param message An optional error message that provides details about the exception.
		 * @return A newly constructed <tt>Error</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>Error(message)</pre>
		 */
		@Override
		public final JsError invoke(java.lang.Object message) {
			return new JsError(super.create(message));
		}
		/**
		 * <p>Constructs a JavaScript Error object.</p>
		 * <p>In JavaScript, When the <tt>Error()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>Instances of the <tt>Error</tt> represent errors or exceptions and are typically used 
		 * with the <tt>throw</tt> and <tt>try/catch</tt> statements in JavaScript. The <tt>name</tt> 
		 * property specifies the type of the exception, and the <tt>message</tt> property can 
		 * provide human-readable details about the exception.</p>
		 * <p>The JavaScript interpreter never throws <tt>Error</tt> objects directly; instead, it 
		 * throws instances of one of the <tt>Error</tt> subclasses, such as <tt>SyntaxError</tt> 
		 * or <tt>RangeError</tt>. In your own JavaScript code, you may find it convenient to 
		 * throw <tt>Error</tt> objects to signal exceptions, or you may prefer to simply throw an 
		 * error message or error code as a primitive string or number value.</p>
		 * <p>Note that the ECMAScript specification defines a <tt>toString()</tt> method for the 
		 * <tt>Error</tt> class (it is inherited by each of the subclasses of <tt>Error</tt>) but 
		 * that it does not require this <tt>toString()</tt> method to return a string that contains 
		 * the contents of the <tt>message</tt> property. Therefore, you should not expect the 
		 * <tt>toString()</tt> method to convert an <tt>Error</tt> object to a meaningful, 
		 * human-readable string. To display an error message to a user, you should explicitly use 
		 * the <tt>name</tt> and <tt>message</tt> properties of the <tt>Error</tt> object.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param args The variable argument.
		 * @return A newly constructed <tt>Error</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Object)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new Error(args)</pre>
		 * where <tt>args</tt> must be expanded into comma-separated argument values.
		 */
		@Override
		public final JsError create(Vars<?> args) {
			return new JsError(super.create(args));
		}
		/**
		 * <p>Constructs a JavaScript Error object.</p>
		 * <p>In JavaScript, When the <tt>Error()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>Instances of the <tt>Error</tt> represent errors or exceptions and are typically used 
		 * with the <tt>throw</tt> and <tt>try/catch</tt> statements in JavaScript. The <tt>name</tt> 
		 * property specifies the type of the exception, and the <tt>message</tt> property can 
		 * provide human-readable details about the exception.</p>
		 * <p>The JavaScript interpreter never throws <tt>Error</tt> objects directly; instead, it 
		 * throws instances of one of the <tt>Error</tt> subclasses, such as <tt>SyntaxError</tt> 
		 * or <tt>RangeError</tt>. In your own JavaScript code, you may find it convenient to 
		 * throw <tt>Error</tt> objects to signal exceptions, or you may prefer to simply throw an 
		 * error message or error code as a primitive string or number value.</p>
		 * <p>Note that the ECMAScript specification defines a <tt>toString()</tt> method for the 
		 * <tt>Error</tt> class (it is inherited by each of the subclasses of <tt>Error</tt>) but 
		 * that it does not require this <tt>toString()</tt> method to return a string that contains 
		 * the contents of the <tt>message</tt> property. Therefore, you should not expect the 
		 * <tt>toString()</tt> method to convert an <tt>Error</tt> object to a meaningful, 
		 * human-readable string. To display an error message to a user, you should explicitly use 
		 * the <tt>name</tt> and <tt>message</tt> properties of the <tt>Error</tt> object.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param args The variable argument.
		 * @return A newly constructed <tt>Error</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #create()
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>Error(args)</pre>
		 * where <tt>args</tt> must be expanded into comma-separated argument values.
		 */
		@Override
		public final JsError invoke(Vars<?> args) {
			return new JsError(super.create(args));
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
				protected Member(JsObject.Member q, Mid mid) {
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
				protected Member(Mid mid) {
					super(mid);
				}
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
				@Override
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
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
				public final JsFunction.Member<JsError> valueOf = new JsFunction.Member<JsError>(this, Members.valueOf);
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
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsError> valueOf = new JsFunction.Member<JsError>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global EvalError class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class EvalError extends JsFunction<JsEvalError>
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
		public static class Member extends JsFunction.Member<JsEvalError>
		{
			private Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
			private Member(Mid mid) {
				super(mid);
			}
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
			@Override
			public EvalError with(ObjectLike o) {
				return new EvalError(super.with(o));
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
			@Override
			public EvalError with() {
				return with(Js.core());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * <p>The <tt>prototype</tt> property is used when a function is used as a 
			 * constructor. It refers to an object that serves as the prototype for an entire 
			 * class of objects. Any object created by the constructor inherits all properties 
			 * of the object referred to by the <tt>prototype</tt> property.</p>
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
		public EvalError(JsObject var) {
			super(var);
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * <p>The <tt>prototype</tt> property is used when a function is used as a 
		 * constructor. It refers to an object that serves as the prototype for an entire 
		 * class of objects. Any object created by the constructor inherits all properties 
		 * of the object referred to by the <tt>prototype</tt> property.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>Constructs a JavaScript EvalError object with its <tt>message</tt> property being an 
		 * implementation-defined default string.</p>
		 * <p>In JavaScript, When the <tt>EvalError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>In JavaScript, an instance of the <tt>EvalError</tt> class may be thrown when the 
		 * global function <tt>eval()</tt> is invoked under any other name. See {@link js.Value.String#eval()} 
		 * or {@link JsGlobal#eval(Object)} for an explanation of the restrictions on how this 
		 * function may be invoked.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @return A newly constructed <tt>EvalError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new EvalError()</pre>
		 */
		@Override
		public final JsEvalError create() {
			return new JsEvalError(super.create());
		}
		/**
		 * <p>Constructs a JavaScript EvalError object with its <tt>message</tt> property being an 
		 * implementation-defined default string.</p>
		 * <p>In JavaScript, When the <tt>EvalError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>In JavaScript, an instance of the <tt>EvalError</tt> class may be thrown when the 
		 * global function <tt>eval()</tt> is invoked under any other name. See {@link js.Value.String#eval()} 
		 * or {@link JsGlobal#eval(Object)} for an explanation of the restrictions on how this 
		 * function may be invoked.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @return A newly constructed <tt>EvalError</tt> object.
		 * @since 1.0
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>EvalError()</pre>
		 */
		@Override
		public final JsEvalError invoke() {
			return new JsEvalError(super.create());
		}
		/**
		 * <p>Constructs a JavaScript EvalError object.</p>
		 * <p>In JavaScript, When the <tt>EvalError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>In JavaScript, an instance of the <tt>EvalError</tt> class may be thrown when the 
		 * global function <tt>eval()</tt> is invoked under any other name. See {@link js.Value.String#eval()} 
		 * or {@link JsGlobal#eval(Object)} for an explanation of the restrictions on how this 
		 * function may be invoked.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param message An optional error message that provides details about the exception.
		 * @return A newly constructed <tt>EvalError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new EvalError(message)</pre>
		 */
		@Override
		public final JsEvalError create(java.lang.Object message) {
			return new JsEvalError(super.create(message));
		}
		/**
		 * <p>Constructs a JavaScript EvalError object.</p>
		 * <p>In JavaScript, When the <tt>EvalError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>In JavaScript, an instance of the <tt>EvalError</tt> class may be thrown when the 
		 * global function <tt>eval()</tt> is invoked under any other name. See {@link js.Value.String#eval()} 
		 * or {@link JsGlobal#eval(Object)} for an explanation of the restrictions on how this 
		 * function may be invoked.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param message An optional error message that provides details about the exception.
		 * @return A newly constructed <tt>EvalError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>EvalError(message)</pre>
		 */
		@Override
		public final JsEvalError invoke(java.lang.Object message) {
			return new JsEvalError(super.create(message));
		}
		/**
		 * <p>Constructs a JavaScript EvalError object.</p>
		 * <p>In JavaScript, When the <tt>EvalError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>In JavaScript, an instance of the <tt>EvalError</tt> class may be thrown when the 
		 * global function <tt>eval()</tt> is invoked under any other name. See {@link js.Value.String#eval()} 
		 * or {@link JsGlobal#eval(Object)} for an explanation of the restrictions on how this 
		 * function may be invoked.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param args The variable argument.
		 * @return A newly constructed <tt>EvalError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Object)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new EvalError(args)</pre>
		 * where <tt>args</tt> must be expanded into comma-separated argument values.
		 */
		@Override
		public final JsEvalError create(Vars<?> args) {
			return new JsEvalError(super.create(args));
		}
		/**
		 * <p>Constructs a JavaScript EvalError object.</p>
		 * <p>In JavaScript, When the <tt>EvalError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>In JavaScript, an instance of the <tt>EvalError</tt> class may be thrown when the 
		 * global function <tt>eval()</tt> is invoked under any other name. See {@link js.Value.String#eval()} 
		 * or {@link JsGlobal#eval(Object)} for an explanation of the restrictions on how this 
		 * function may be invoked.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param args The variable argument.
		 * @return A newly constructed <tt>EvalError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #create()
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>EvalError(args)</pre>
		 * where <tt>args</tt> must be expanded into comma-separated argument values.
		 */
		@Override
		public final JsEvalError invoke(Vars<?> args) {
			return new JsEvalError(super.create(args));
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
		public static class Prototype extends JsError
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
			public static class Member extends JsError.Member
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
				protected Member(JsObject.Member q, Mid mid) {
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
				protected Member(Mid mid) {
					super(mid);
				}
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
				@Override
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
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
				public final JsFunction.Member<JsEvalError> valueOf = new JsFunction.Member<JsEvalError>(this, Members.valueOf);
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
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsEvalError> valueOf = new JsFunction.Member<JsEvalError>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global RangeError class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class RangeError extends JsFunction<JsRangeError>
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
		public static class Member extends JsFunction.Member<JsRangeError>
		{
			private Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
			private Member(Mid mid) {
				super(mid);
			}
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
			@Override
			public RangeError with(ObjectLike o) {
				return new RangeError(super.with(o));
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
			@Override
			public RangeError with() {
				return with(Js.core());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * <p>The <tt>prototype</tt> property is used when a function is used as a 
			 * constructor. It refers to an object that serves as the prototype for an entire 
			 * class of objects. Any object created by the constructor inherits all properties 
			 * of the object referred to by the <tt>prototype</tt> property.</p>
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
		public RangeError(JsObject var) {
			super(var);
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * <p>The <tt>prototype</tt> property is used when a function is used as a 
		 * constructor. It refers to an object that serves as the prototype for an entire 
		 * class of objects. Any object created by the constructor inherits all properties 
		 * of the object referred to by the <tt>prototype</tt> property.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>Constructs a JavaScript RangeError object with its <tt>message</tt> property being an 
		 * implementation-defined default string.</p>
		 * <p>In JavaScript, When the <tt>RangeError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of the this class is thrown when a numeric value is not in its legal 
		 * range. For example, setting the length of an array to a negative number causes a 
		 * <tt>RangeError</tt> to be thrown.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @return A newly constructed <tt>RangeError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new RangeError()</pre>
		 */
		@Override
		public final JsRangeError create() {
			return new JsRangeError(super.create());
		}
		/**
		 * <p>Constructs a JavaScript RangeError object with its <tt>message</tt> property being an 
		 * implementation-defined default string.</p>
		 * <p>In JavaScript, When the <tt>RangeError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of the this class is thrown when a numeric value is not in its legal 
		 * range. For example, setting the length of an array to a negative number causes a 
		 * <tt>RangeError</tt> to be thrown.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @return A newly constructed <tt>RangeError</tt> object.
		 * @since 1.0
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>RangeError()</pre>
		 */
		@Override
		public final JsRangeError invoke() {
			return new JsRangeError(super.create());
		}
		/**
		 * <p>Constructs a JavaScript RangeError object.</p>
		 * <p>In JavaScript, When the <tt>RangeError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of the this class is thrown when a numeric value is not in its legal 
		 * range. For example, setting the length of an array to a negative number causes a 
		 * <tt>RangeError</tt> to be thrown.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param message An optional error message that provides details about the exception.
		 * @return A newly constructed <tt>RangeError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new RangeError(message)</pre>
		 */
		@Override
		public final JsRangeError create(java.lang.Object message) {
			return new JsRangeError(super.create(message));
		}
		/**
		 * <p>Constructs a JavaScript RangeError object.</p>
		 * <p>In JavaScript, When the <tt>RangeError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of the this class is thrown when a numeric value is not in its legal 
		 * range. For example, setting the length of an array to a negative number causes a 
		 * <tt>RangeError</tt> to be thrown.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param message An optional error message that provides details about the exception.
		 * @return A newly constructed <tt>RangeError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>RangeError(message)</pre>
		 */
		@Override
		public final JsRangeError invoke(java.lang.Object message) {
			return new JsRangeError(super.create(message));
		}
		/**
		 * <p>Constructs a JavaScript RangeError object.</p>
		 * <p>In JavaScript, When the <tt>RangeError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of the this class is thrown when a numeric value is not in its legal 
		 * range. For example, setting the length of an array to a negative number causes a 
		 * <tt>RangeError</tt> to be thrown.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param args The variable argument.
		 * @return A newly constructed <tt>RangeError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Object)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new RangeError(args)</pre>
		 * where <tt>args</tt> must be expanded into comma-separated argument values.
		 */
		@Override
		public final JsRangeError create(Vars<?> args) {
			return new JsRangeError(super.create(args));
		}
		/**
		 * <p>Constructs a JavaScript RangeError object.</p>
		 * <p>In JavaScript, When the <tt>RangeError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of the this class is thrown when a numeric value is not in its legal 
		 * range. For example, setting the length of an array to a negative number causes a 
		 * <tt>RangeError</tt> to be thrown.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param args The variable argument.
		 * @return A newly constructed <tt>RangeError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #create()
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>RangeError(args)</pre>
		 * where <tt>args</tt> must be expanded into comma-separated argument values.
		 */
		@Override
		public final JsRangeError invoke(Vars<?> args) {
			return new JsRangeError(super.create(args));
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
		public static class Prototype extends JsError
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
			public static class Member extends JsError.Member
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
				protected Member(JsObject.Member q, Mid mid) {
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
				protected Member(Mid mid) {
					super(mid);
				}
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
				@Override
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
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
				public final JsFunction.Member<JsRangeError> valueOf = new JsFunction.Member<JsRangeError>(this, Members.valueOf);
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
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsRangeError> valueOf = new JsFunction.Member<JsRangeError>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global RangeError class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class ReferenceError extends JsFunction<JsReferenceError>
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
		public static class Member extends JsFunction.Member<JsReferenceError>
		{
			private Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
			private Member(Mid mid) {
				super(mid);
			}
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
			@Override
			public ReferenceError with(ObjectLike o) {
				return new ReferenceError(super.with(o));
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
			@Override
			public ReferenceError with() {
				return with(Js.core());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * <p>The <tt>prototype</tt> property is used when a function is used as a 
			 * constructor. It refers to an object that serves as the prototype for an entire 
			 * class of objects. Any object created by the constructor inherits all properties 
			 * of the object referred to by the <tt>prototype</tt> property.</p>
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
		public ReferenceError(JsObject var) {
			super(var);
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * <p>The <tt>prototype</tt> property is used when a function is used as a 
		 * constructor. It refers to an object that serves as the prototype for an entire 
		 * class of objects. Any object created by the constructor inherits all properties 
		 * of the object referred to by the <tt>prototype</tt> property.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>Constructs a JavaScript ReferenceError object with its <tt>message</tt> property being an 
		 * implementation-defined default string.</p>
		 * <p>In JavaScript, When the <tt>ReferenceError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of this class is thrown when you attempt to read the value of a variable 
		 * that does not exist.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @return A newly constructed <tt>ReferenceError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new ReferenceError()</pre>
		 */
		@Override
		public final JsReferenceError create() {
			return new JsReferenceError(super.create());
		}
		/**
		 * <p>Constructs a JavaScript ReferenceError object with its <tt>message</tt> property being an 
		 * implementation-defined default string.</p>
		 * <p>In JavaScript, When the <tt>ReferenceError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of this class is thrown when you attempt to read the value of a variable 
		 * that does not exist.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @return A newly constructed <tt>ReferenceError</tt> object.
		 * @since 1.0
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>ReferenceError()</pre>
		 */
		@Override
		public final JsReferenceError invoke() {
			return new JsReferenceError(super.create());
		}
		/**
		 * <p>Constructs a JavaScript ReferenceError object.</p>
		 * <p>In JavaScript, When the <tt>ReferenceError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of this class is thrown when you attempt to read the value of a variable 
		 * that does not exist.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param message An optional error message that provides details about the exception.
		 * @return A newly constructed <tt>ReferenceError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new ReferenceError(message)</pre>
		 */
		@Override
		public final JsReferenceError create(java.lang.Object message) {
			return new JsReferenceError(super.create(message));
		}
		/**
		 * <p>Constructs a JavaScript ReferenceError object.</p>
		 * <p>In JavaScript, When the <tt>ReferenceError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of this class is thrown when you attempt to read the value of a variable 
		 * that does not exist.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param message An optional error message that provides details about the exception.
		 * @return A newly constructed <tt>ReferenceError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>ReferenceError(message)</pre>
		 */
		@Override
		public final JsReferenceError invoke(java.lang.Object message) {
			return new JsReferenceError(super.create(message));
		}
		/**
		 * <p>Constructs a JavaScript ReferenceError object.</p>
		 * <p>In JavaScript, When the <tt>ReferenceError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of this class is thrown when you attempt to read the value of a variable 
		 * that does not exist.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param args The variable argument.
		 * @return A newly constructed <tt>ReferenceError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Object)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new ReferenceError(args)</pre>
		 * where <tt>args</tt> must be expanded into comma-separated argument values.
		 */
		@Override
		public final JsReferenceError create(Vars<?> args) {
			return new JsReferenceError(super.create(args));
		}
		/**
		 * <p>Constructs a JavaScript ReferenceError object.</p>
		 * <p>In JavaScript, When the <tt>ReferenceError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of this class is thrown when you attempt to read the value of a variable 
		 * that does not exist.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param args The variable argument.
		 * @return A newly constructed <tt>ReferenceError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #create()
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>ReferenceError(args)</pre>
		 * where <tt>args</tt> must be expanded into comma-separated argument values.
		 */
		@Override
		public final JsReferenceError invoke(Vars<?> args) {
			return new JsReferenceError(super.create(args));
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
		public static class Prototype extends JsError
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
			public static class Member extends JsError.Member
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
				protected Member(JsObject.Member q, Mid mid) {
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
				protected Member(Mid mid) {
					super(mid);
				}
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
				@Override
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
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
				public final JsFunction.Member<JsReferenceError> valueOf = new JsFunction.Member<JsReferenceError>(this, Members.valueOf);
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
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsReferenceError> valueOf = new JsFunction.Member<JsReferenceError>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global SyntaxError class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class SyntaxError extends JsFunction<JsSyntaxError>
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
		public static class Member extends JsFunction.Member<JsSyntaxError>
		{
			private Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
			private Member(Mid mid) {
				super(mid);
			}
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
			@Override
			public SyntaxError with(ObjectLike o) {
				return new SyntaxError(super.with(o));
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
			@Override
			public SyntaxError with() {
				return with(Js.core());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * <p>The <tt>prototype</tt> property is used when a function is used as a 
			 * constructor. It refers to an object that serves as the prototype for an entire 
			 * class of objects. Any object created by the constructor inherits all properties 
			 * of the object referred to by the <tt>prototype</tt> property.</p>
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
		public SyntaxError(JsObject var) {
			super(var);
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * <p>The <tt>prototype</tt> property is used when a function is used as a 
		 * constructor. It refers to an object that serves as the prototype for an entire 
		 * class of objects. Any object created by the constructor inherits all properties 
		 * of the object referred to by the <tt>prototype</tt> property.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>Constructs a JavaScript SyntaxError object with its <tt>message</tt> property being an 
		 * implementation-defined default string.</p>
		 * <p>In JavaScript, When the <tt>SyntaxError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of this class is thrown to signal a syntax error in JavaScript code. The 
		 * {@link js.Value.String#eval()}, {@link JsGlobal#eval(Object)}, {@link JsString#eval()}, 
		 * {@link js.Js#function(String)}, {@link js.Js#function(String, String)}, 
		 * {@link js.Js#function(js.Vars, String)}, {@link js.Js#re(String, String)}, 
		 * {@link js.Js#re(String)}, {@link JsRegExp#JsRegExp(String, String)}, and 
		 * {@link JsRegExp#JsRegExp(String)} may all throw exceptions of this type.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @return A newly constructed <tt>SyntaxError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new SyntaxError()</pre>
		 */
		@Override
		public final JsSyntaxError create() {
			return new JsSyntaxError(super.create());
		}
		/**
		 * <p>Constructs a JavaScript SyntaxError object with its <tt>message</tt> property being an 
		 * implementation-defined default string.</p>
		 * <p>In JavaScript, When the <tt>SyntaxError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of this class is thrown to signal a syntax error in JavaScript code. The 
		 * {@link js.Value.String#eval()}, {@link JsGlobal#eval(Object)}, {@link JsString#eval()}, 
		 * {@link js.Js#function(String)}, {@link js.Js#function(String, String)}, 
		 * {@link js.Js#function(js.Vars, String)}, {@link js.Js#re(String, String)}, 
		 * {@link js.Js#re(String)}, {@link JsRegExp#JsRegExp(String, String)}, and 
		 * {@link JsRegExp#JsRegExp(String)} may all throw exceptions of this type.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @return A newly constructed <tt>SyntaxError</tt> object.
		 * @since 1.0
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>SyntaxError()</pre>
		 */
		@Override
		public final JsSyntaxError invoke() {
			return new JsSyntaxError(super.create());
		}
		/**
		 * <p>Constructs a JavaScript SyntaxError object.</p>
		 * <p>In JavaScript, When the <tt>SyntaxError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of this class is thrown to signal a syntax error in JavaScript code. The 
		 * {@link js.Value.String#eval()}, {@link JsGlobal#eval(Object)}, {@link JsString#eval()}, 
		 * {@link js.Js#function(String)}, {@link js.Js#function(String, String)}, 
		 * {@link js.Js#function(js.Vars, String)}, {@link js.Js#re(String, String)}, 
		 * {@link js.Js#re(String)}, {@link JsRegExp#JsRegExp(String, String)}, and 
		 * {@link JsRegExp#JsRegExp(String)} may all throw exceptions of this type.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param message An optional error message that provides details about the exception.
		 * @return A newly constructed <tt>SyntaxError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new SyntaxError(message)</pre>
		 */
		@Override
		public final JsSyntaxError create(java.lang.Object message) {
			return new JsSyntaxError(super.create(message));
		}
		/**
		 * <p>Constructs a JavaScript SyntaxError object.</p>
		 * <p>In JavaScript, When the <tt>SyntaxError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of this class is thrown to signal a syntax error in JavaScript code. The 
		 * {@link js.Value.String#eval()}, {@link JsGlobal#eval(Object)}, {@link JsString#eval()}, 
		 * {@link js.Js#function(String)}, {@link js.Js#function(String, String)}, 
		 * {@link js.Js#function(js.Vars, String)}, {@link js.Js#re(String, String)}, 
		 * {@link js.Js#re(String)}, {@link JsRegExp#JsRegExp(String, String)}, and 
		 * {@link JsRegExp#JsRegExp(String)} may all throw exceptions of this type.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param message An optional error message that provides details about the exception.
		 * @return A newly constructed <tt>SyntaxError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>SyntaxError(message)</pre>
		 */
		@Override
		public final JsSyntaxError invoke(java.lang.Object message) {
			return new JsSyntaxError(super.create(message));
		}
		/**
		 * <p>Constructs a JavaScript SyntaxError object.</p>
		 * <p>In JavaScript, When the <tt>SyntaxError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of this class is thrown to signal a syntax error in JavaScript code. The 
		 * {@link js.Value.String#eval()}, {@link JsGlobal#eval(Object)}, {@link JsString#eval()}, 
		 * {@link js.Js#function(String)}, {@link js.Js#function(String, String)}, 
		 * {@link js.Js#function(js.Vars, String)}, {@link js.Js#re(String, String)}, 
		 * {@link js.Js#re(String)}, {@link JsRegExp#JsRegExp(String, String)}, and 
		 * {@link JsRegExp#JsRegExp(String)} may all throw exceptions of this type.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param args The variable argument.
		 * @return A newly constructed <tt>SyntaxError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Object)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new SyntaxError(args)</pre>
		 * where <tt>args</tt> must be expanded into comma-separated argument values.
		 */
		@Override
		public final JsSyntaxError create(Vars<?> args) {
			return new JsSyntaxError(super.create(args));
		}
		/**
		 * <p>Constructs a JavaScript SyntaxError object.</p>
		 * <p>In JavaScript, When the <tt>SyntaxError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of this class is thrown to signal a syntax error in JavaScript code. The 
		 * {@link js.Value.String#eval()}, {@link JsGlobal#eval(Object)}, {@link JsString#eval()}, 
		 * {@link js.Js#function(String)}, {@link js.Js#function(String, String)}, 
		 * {@link js.Js#function(js.Vars, String)}, {@link js.Js#re(String, String)}, 
		 * {@link js.Js#re(String)}, {@link JsRegExp#JsRegExp(String, String)}, and 
		 * {@link JsRegExp#JsRegExp(String)} may all throw exceptions of this type.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param args The variable argument.
		 * @return A newly constructed <tt>SyntaxError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #create()
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>SyntaxError(args)</pre>
		 * where <tt>args</tt> must be expanded into comma-separated argument values.
		 */
		@Override
		public final JsSyntaxError invoke(Vars<?> args) {
			return new JsSyntaxError(super.create(args));
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
		public static class Prototype extends JsError
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
			public static class Member extends JsError.Member
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
				protected Member(JsObject.Member q, Mid mid) {
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
				protected Member(Mid mid) {
					super(mid);
				}
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
				@Override
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
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
				public final JsFunction.Member<JsSyntaxError> valueOf = new JsFunction.Member<JsSyntaxError>(this, Members.valueOf);
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
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsSyntaxError> valueOf = new JsFunction.Member<JsSyntaxError>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global TypeError class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class TypeError extends JsFunction<JsTypeError>
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
		public static class Member extends JsFunction.Member<JsTypeError>
		{
			private Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
			private Member(Mid mid) {
				super(mid);
			}
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
			@Override
			public TypeError with(ObjectLike o) {
				return new TypeError(super.with(o));
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
			@Override
			public TypeError with() {
				return with(Js.core());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * <p>The <tt>prototype</tt> property is used when a function is used as a 
			 * constructor. It refers to an object that serves as the prototype for an entire 
			 * class of objects. Any object created by the constructor inherits all properties 
			 * of the object referred to by the <tt>prototype</tt> property.</p>
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
		public TypeError(JsObject var) {
			super(var);
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * <p>The <tt>prototype</tt> property is used when a function is used as a 
		 * constructor. It refers to an object that serves as the prototype for an entire 
		 * class of objects. Any object created by the constructor inherits all properties 
		 * of the object referred to by the <tt>prototype</tt> property.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>Constructs a JavaScript TypeError object with its <tt>message</tt> property being an 
		 * implementation-defined default string.</p>
		 * <p>In JavaScript, When the <tt>TypeError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>In JavaScript, an instance of the <tt>TypeError</tt> class is thrown when a value is not 
		 * of the type expected. This happens most often when you attempt to access a property of a 
		 * <tt>null</tt> or <tt>undefined</tt> value. It can also occur if you invoke a method defined 
		 * by one class on an object that is an instance of some other class, or if you use the <tt>new</tt> 
		 * operator with a value that is not a constructor function, for example. JavaScript implementations 
		 * are also permitted to throw <tt>TypeError</tt> objects when a built-in function or method 
		 * is called with more arguments than expected.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @return A newly constructed <tt>TypeError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new TypeError()</pre>
		 */
		@Override
		public final JsTypeError create() {
			return new JsTypeError(super.create());
		}
		/**
		 * <p>Constructs a JavaScript TypeError object with its <tt>message</tt> property being an 
		 * implementation-defined default string.</p>
		 * <p>In JavaScript, When the <tt>TypeError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>In JavaScript, an instance of the <tt>TypeError</tt> class is thrown when a value is not 
		 * of the type expected. This happens most often when you attempt to access a property of a 
		 * <tt>null</tt> or <tt>undefined</tt> value. It can also occur if you invoke a method defined 
		 * by one class on an object that is an instance of some other class, or if you use the <tt>new</tt> 
		 * operator with a value that is not a constructor function, for example. JavaScript implementations 
		 * are also permitted to throw <tt>TypeError</tt> objects when a built-in function or method 
		 * is called with more arguments than expected.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @return A newly constructed <tt>TypeError</tt> object.
		 * @since 1.0
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>TypeError()</pre>
		 */
		@Override
		public final JsTypeError invoke() {
			return new JsTypeError(super.create());
		}
		/**
		 * <p>Constructs a JavaScript TypeError object.</p>
		 * <p>In JavaScript, When the <tt>TypeError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>In JavaScript, an instance of the <tt>TypeError</tt> class is thrown when a value is not 
		 * of the type expected. This happens most often when you attempt to access a property of a 
		 * <tt>null</tt> or <tt>undefined</tt> value. It can also occur if you invoke a method defined 
		 * by one class on an object that is an instance of some other class, or if you use the <tt>new</tt> 
		 * operator with a value that is not a constructor function, for example. JavaScript implementations 
		 * are also permitted to throw <tt>TypeError</tt> objects when a built-in function or method 
		 * is called with more arguments than expected.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param message An optional error message that provides details about the exception.
		 * @return A newly constructed <tt>TypeError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new TypeError(message)</pre>
		 */
		@Override
		public final JsTypeError create(java.lang.Object message) {
			return new JsTypeError(super.create(message));
		}
		/**
		 * <p>Constructs a JavaScript TypeError object.</p>
		 * <p>In JavaScript, When the <tt>TypeError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>In JavaScript, an instance of the <tt>TypeError</tt> class is thrown when a value is not 
		 * of the type expected. This happens most often when you attempt to access a property of a 
		 * <tt>null</tt> or <tt>undefined</tt> value. It can also occur if you invoke a method defined 
		 * by one class on an object that is an instance of some other class, or if you use the <tt>new</tt> 
		 * operator with a value that is not a constructor function, for example. JavaScript implementations 
		 * are also permitted to throw <tt>TypeError</tt> objects when a built-in function or method 
		 * is called with more arguments than expected.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param message An optional error message that provides details about the exception.
		 * @return A newly constructed <tt>TypeError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>TypeError(message)</pre>
		 */
		@Override
		public final JsTypeError invoke(java.lang.Object message) {
			return new JsTypeError(super.create(message));
		}
		/**
		 * <p>Constructs a JavaScript TypeError object.</p>
		 * <p>In JavaScript, When the <tt>TypeError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>In JavaScript, an instance of the <tt>TypeError</tt> class is thrown when a value is not 
		 * of the type expected. This happens most often when you attempt to access a property of a 
		 * <tt>null</tt> or <tt>undefined</tt> value. It can also occur if you invoke a method defined 
		 * by one class on an object that is an instance of some other class, or if you use the <tt>new</tt> 
		 * operator with a value that is not a constructor function, for example. JavaScript implementations 
		 * are also permitted to throw <tt>TypeError</tt> objects when a built-in function or method 
		 * is called with more arguments than expected.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param args The variable argument.
		 * @return A newly constructed <tt>TypeError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Object)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new TypeError(args)</pre>
		 * where <tt>args</tt> must be expanded into comma-separated argument values.
		 */
		@Override
		public final JsTypeError create(Vars<?> args) {
			return new JsTypeError(super.create(args));
		}
		/**
		 * <p>Constructs a JavaScript TypeError object.</p>
		 * <p>In JavaScript, When the <tt>TypeError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>In JavaScript, an instance of the <tt>TypeError</tt> class is thrown when a value is not 
		 * of the type expected. This happens most often when you attempt to access a property of a 
		 * <tt>null</tt> or <tt>undefined</tt> value. It can also occur if you invoke a method defined 
		 * by one class on an object that is an instance of some other class, or if you use the <tt>new</tt> 
		 * operator with a value that is not a constructor function, for example. JavaScript implementations 
		 * are also permitted to throw <tt>TypeError</tt> objects when a built-in function or method 
		 * is called with more arguments than expected.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param args The variable argument.
		 * @return A newly constructed <tt>TypeError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #create()
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>TypeError(args)</pre>
		 * where <tt>args</tt> must be expanded into comma-separated argument values.
		 */
		@Override
		public final JsTypeError invoke(Vars<?> args) {
			return new JsTypeError(super.create(args));
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
		public static class Prototype extends JsError
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
			public static class Member extends JsError.Member
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
				protected Member(JsObject.Member q, Mid mid) {
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
				protected Member(Mid mid) {
					super(mid);
				}
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
				@Override
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
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
				public final JsFunction.Member<JsTypeError> valueOf = new JsFunction.Member<JsTypeError>(this, Members.valueOf);
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
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsTypeError> valueOf = new JsFunction.Member<JsTypeError>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global URIError class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class URIError extends JsFunction<JsURIError>
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
		public static class Member extends JsFunction.Member<JsURIError>
		{
			private Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
			private Member(Mid mid) {
				super(mid);
			}
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
			@Override
			public URIError with(ObjectLike o) {
				return new URIError(super.with(o));
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
			@Override
			public URIError with() {
				return with(Js.core());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * <p>The <tt>prototype</tt> property is used when a function is used as a 
			 * constructor. It refers to an object that serves as the prototype for an entire 
			 * class of objects. Any object created by the constructor inherits all properties 
			 * of the object referred to by the <tt>prototype</tt> property.</p>
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
		public URIError(JsObject var) {
			super(var);
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * <p>The <tt>prototype</tt> property is used when a function is used as a 
		 * constructor. It refers to an object that serves as the prototype for an entire 
		 * class of objects. Any object created by the constructor inherits all properties 
		 * of the object referred to by the <tt>prototype</tt> property.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>Constructs a JavaScript URIError object with its <tt>message</tt> property being an 
		 * implementation-defined default string.</p>
		 * <p>In JavaScript, When the <tt>URIError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of <tt>URIError</tt> is thrown by {@link js.Js#decodeURI(Object)} and 
		 * {@link js.Js#decodeURIComponent(Object)} if the specified string contains illegal 
		 * hexadecimal escapes. It can also be thrown by {@link js.Js#encodeURI(Object)} and 
		 * {@link js.Js#encodeURIComponent(Object)} if the specified string contains illegal 
		 * unicode surrogate pairs.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @return A newly constructed <tt>EvalError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new URIError()</pre>
		 */
		@Override
		public final JsURIError create() {
			return new JsURIError(super.create());
		}
		/**
		 * <p>Constructs a JavaScript URIError object with its <tt>message</tt> property being an 
		 * implementation-defined default string.</p>
		 * <p>In JavaScript, When the <tt>URIError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of <tt>URIError</tt> is thrown by {@link js.Js#decodeURI(Object)} and 
		 * {@link js.Js#decodeURIComponent(Object)} if the specified string contains illegal 
		 * hexadecimal escapes. It can also be thrown by {@link js.Js#encodeURI(Object)} and 
		 * {@link js.Js#encodeURIComponent(Object)} if the specified string contains illegal 
		 * unicode surrogate pairs.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @return A newly constructed <tt>EvalError</tt> object.
		 * @since 1.0
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>URIError()</pre>
		 */
		@Override
		public final JsURIError invoke() {
			return new JsURIError(super.create());
		}
		/**
		 * <p>Constructs a JavaScript URIError object.</p>
		 * <p>In JavaScript, When the <tt>URIError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of <tt>URIError</tt> is thrown by {@link js.Js#decodeURI(Object)} and 
		 * {@link js.Js#decodeURIComponent(Object)} if the specified string contains illegal 
		 * hexadecimal escapes. It can also be thrown by {@link js.Js#encodeURI(Object)} and 
		 * {@link js.Js#encodeURIComponent(Object)} if the specified string contains illegal 
		 * unicode surrogate pairs.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param message An optional error message that provides details about the exception.
		 * @return A newly constructed <tt>URIError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new URIError(message)</pre>
		 */
		@Override
		public final JsURIError create(java.lang.Object message) {
			return new JsURIError(super.create(message));
		}
		/**
		 * <p>Constructs a JavaScript URIError object.</p>
		 * <p>In JavaScript, When the <tt>URIError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of <tt>URIError</tt> is thrown by {@link js.Js#decodeURI(Object)} and 
		 * {@link js.Js#decodeURIComponent(Object)} if the specified string contains illegal 
		 * hexadecimal escapes. It can also be thrown by {@link js.Js#encodeURI(Object)} and 
		 * {@link js.Js#encodeURIComponent(Object)} if the specified string contains illegal 
		 * unicode surrogate pairs.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param message An optional error message that provides details about the exception.
		 * @return A newly constructed <tt>URIError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>URIError(message)</pre>
		 */
		@Override
		public final JsURIError invoke(java.lang.Object message) {
			return new JsURIError(super.create(message));
		}
		/**
		 * <p>Constructs a JavaScript URIError object.</p>
		 * <p>In JavaScript, When the <tt>URIError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of <tt>URIError</tt> is thrown by {@link js.Js#decodeURI(Object)} and 
		 * {@link js.Js#decodeURIComponent(Object)} if the specified string contains illegal 
		 * hexadecimal escapes. It can also be thrown by {@link js.Js#encodeURI(Object)} and 
		 * {@link js.Js#encodeURIComponent(Object)} if the specified string contains illegal 
		 * unicode surrogate pairs.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param args The variable argument.
		 * @return A newly constructed <tt>URIError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #invoke(Vars)
		 * @see #create()
		 * @see #create(Object)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new URIError(args)</pre>
		 * where <tt>args</tt> must be expanded into comma-separated argument values.
		 */
		@Override
		public final JsURIError create(Vars<?> args) {
			return new JsURIError(super.create(args));
		}
		/**
		 * <p>Constructs a JavaScript URIError object.</p>
		 * <p>In JavaScript, When the <tt>URIError()</tt> constructor is called as a function, 
		 * without the <tt>new</tt> operator, it behaves exactly as it does when called with 
		 * the <tt>new</tt> operator.</p>
		 * <p>An instance of <tt>URIError</tt> is thrown by {@link js.Js#decodeURI(Object)} and 
		 * {@link js.Js#decodeURIComponent(Object)} if the specified string contains illegal 
		 * hexadecimal escapes. It can also be thrown by {@link js.Js#encodeURI(Object)} and 
		 * {@link js.Js#encodeURIComponent(Object)} if the specified string contains illegal 
		 * unicode surrogate pairs.</p>
		 * <p>In JS, to throw a value or object as a <tt>RuntimeException</tt>, see {@link js.Js#err(Object)}.</p>
		 * @param args The variable argument.
		 * @return A newly constructed <tt>URIError</tt> object.
		 * @since 1.0
		 * @see #invoke()
		 * @see #invoke(Object)
		 * @see #create()
		 * @see #create(Object)
		 * @see #create(Vars)
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>URIError(args)</pre>
		 * where <tt>args</tt> must be expanded into comma-separated argument values.
		 */
		@Override
		public final JsURIError invoke(Vars<?> args) {
			return new JsURIError(super.create(args));
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
		public static class Prototype extends JsError
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
			public static class Member extends JsError.Member
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
				protected Member(JsObject.Member q, Mid mid) {
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
				protected Member(Mid mid) {
					super(mid);
				}
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
				@Override
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
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
				public final JsFunction.Member<JsURIError> valueOf = new JsFunction.Member<JsURIError>(this, Members.valueOf);
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
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsURIError> valueOf = new JsFunction.Member<JsURIError>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global Math object of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class Math extends JsObject
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
			 * @see JsGlobal.Math#E
			 * @see JsGlobal.Math.Member#E
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid E       = id("E"      );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#LN2
			 * @see JsGlobal.Math.Member#LN2
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid LN2     = id("LN2"    );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#LN10
			 * @see JsGlobal.Math.Member#LN10
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid LN10    = id("LN10"   );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#LOG2E
			 * @see JsGlobal.Math.Member#LOG2E
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid LOG2E   = id("LOG2E"  );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#LOG10E
			 * @see JsGlobal.Math.Member#LOG10E
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid LOG10E  = id("LOG10E" );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#PI
			 * @see JsGlobal.Math.Member#PI
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid PI      = id("PI"     );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#SQRT1_2
			 * @see JsGlobal.Math.Member#SQRT1_2
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid SQRT1_2 = id("SQRT1_2");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#SQRT2
			 * @see JsGlobal.Math.Member#SQRT2
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid SQRT2   = id("SQRT2"  );

			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#abs
			 * @see JsGlobal.Math.Member#abs
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid abs     = id("abs"    );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#acos
			 * @see JsGlobal.Math.Member#acos
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid acos    = id("acos"   );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#asin
			 * @see JsGlobal.Math.Member#asin
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid asin    = id("asin"   );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#atan
			 * @see JsGlobal.Math.Member#atan
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid atan    = id("atan"   );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#atan2
			 * @see JsGlobal.Math.Member#atan2
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid atan2   = id("atan2"  );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#ceil
			 * @see JsGlobal.Math.Member#ceil
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid ceil    = id("ceil"   );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#cos
			 * @see JsGlobal.Math.Member#cos
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid cos     = id("cos"    );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#exp
			 * @see JsGlobal.Math.Member#exp
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid exp     = id("exp"    );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#floor
			 * @see JsGlobal.Math.Member#floor
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid floor   = id("floor"  );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#log
			 * @see JsGlobal.Math.Member#log
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid log     = id("log"    );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#max
			 * @see JsGlobal.Math.Member#max
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid max     = id("max"    );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#min
			 * @see JsGlobal.Math.Member#min
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid min     = id("min"    );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#pow
			 * @see JsGlobal.Math.Member#pow
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid pow     = id("pow"    );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#random
			 * @see JsGlobal.Math.Member#random
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid random  = id("random" );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#round
			 * @see JsGlobal.Math.Member#round
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid round   = id("round"  );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#sin
			 * @see JsGlobal.Math.Member#sin
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid sin     = id("sin"    );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#sinh
			 * @see JsGlobal.Math.Member#sinh
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid sinh    = id("sinh"   );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#sqrt
			 * @see JsGlobal.Math.Member#sqrt
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid sqrt    = id("sqrt"   );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#tan
			 * @see JsGlobal.Math.Member#tan
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid tan     = id("tan"    );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#tanh
			 * @see JsGlobal.Math.Member#tanh
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid tanh    = id("tanh"   );
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
			private Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
			private Member(Mid mid) {
				super(mid);
			}
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
			@Override
			public Math with(ObjectLike o) {
				return new Math(super.with(o));
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
			public Math with() {
				return with(Js.core());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see js.MathLike#E
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member E       = new Value.Number.Member(this, Members.E      );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see js.MathLike#LN2
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member LN2     = new Value.Number.Member(this, Members.LN2    );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see js.MathLike#LN10
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member LN10    = new Value.Number.Member(this, Members.LN10   );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see js.MathLike#LOG2E
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member LOG2E   = new Value.Number.Member(this, Members.LOG2E  );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see js.MathLike#LOG10E
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member LOG10E  = new Value.Number.Member(this, Members.LOG10E );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see js.MathLike#PI
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member PI      = new Value.Number.Member(this, Members.PI     );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see js.MathLike#SQRT1_2
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member SQRT1_2 = new Value.Number.Member(this, Members.SQRT1_2);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see js.MathLike#SQRT2
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member SQRT2   = new Value.Number.Member(this, Members.SQRT2  );

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#abs(Object)
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final JsFunction.Member<java.lang.Number>   abs    = new JsFunction.Member<java.lang.Number>(this, Members.abs   );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#acos(Object)
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final JsFunction.Member<java.lang.Number>   acos   = new JsFunction.Member<java.lang.Number>(this, Members.acos  );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#asin(Object)
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final JsFunction.Member<java.lang.Number>   asin   = new JsFunction.Member<java.lang.Number>(this, Members.asin  );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#atan(Object)
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final JsFunction.Member<java.lang.Number>   atan   = new JsFunction.Member<java.lang.Number>(this, Members.atan  );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#atan2(Object, Object)
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final JsFunction.Member<java.lang.Number>   atan2  = new JsFunction.Member<java.lang.Number>(this, Members.atan2 );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#ceil(Object)
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final JsFunction.Member<java.lang.Number>   ceil   = new JsFunction.Member<java.lang.Number>(this, Members.ceil  );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#cos(Object)
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final JsFunction.Member<java.lang.Number>   cos    = new JsFunction.Member<java.lang.Number>(this, Members.cos   );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#exp(Object)
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final JsFunction.Member<java.lang.Number>   exp    = new JsFunction.Member<java.lang.Number>(this, Members.exp   );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#floor(Object)
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final JsFunction.Member<java.lang.Number>   floor  = new JsFunction.Member<java.lang.Number>(this, Members.floor );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#log(Object)
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final JsFunction.Member<java.lang.Number>   log    = new JsFunction.Member<java.lang.Number>(this, Members.log   );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#max(Object, Object)
			 * @see JsGlobal.Math#max(Vars)
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final JsFunction.Member<java.lang.Number>   max    = new JsFunction.Member<java.lang.Number>(this, Members.max   );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#min(Object, Object)
			 * @see JsGlobal.Math#min(Vars)
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final JsFunction.Member<java.lang.Number>   min    = new JsFunction.Member<java.lang.Number>(this, Members.min   );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#pow(Object, Object)
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final JsFunction.Member<java.lang.Number>   pow    = new JsFunction.Member<java.lang.Number>(this, Members.pow   );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#random()
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final JsFunction.Member<java.lang.Number>   random = new JsFunction.Member<java.lang.Number>(this, Members.random);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#round(Object)
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final JsFunction.Member<java.lang.Number>   round  = new JsFunction.Member<java.lang.Number>(this, Members.round );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#sin(Object)
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final JsFunction.Member<java.lang.Number>   sin    = new JsFunction.Member<java.lang.Number>(this, Members.sin   );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#sinh(Object)
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final JsFunction.Member<java.lang.Number>   sinh   = new JsFunction.Member<java.lang.Number>(this, Members.sinh  );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#sqrt(Object)
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final JsFunction.Member<java.lang.Number>   sqrt   = new JsFunction.Member<java.lang.Number>(this, Members.sqrt  );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#tan(Object)
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final JsFunction.Member<java.lang.Number>   tan    = new JsFunction.Member<java.lang.Number>(this, Members.tan   );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsGlobal.Math#tanh(Object)
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final JsFunction.Member<java.lang.Number>   tanh   = new JsFunction.Member<java.lang.Number>(this, Members.tanh  );
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it 
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor, 
		 * that is, replacing it with its only argument.
		 */
		public Math(JsObject var) {
			super(var);
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.MathLike#E
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Value.Number.Member E       = new Value.Number.Member(Members.E      );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.MathLike#LN2
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Value.Number.Member LN2     = new Value.Number.Member(Members.LN2    );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.MathLike#LN10
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Value.Number.Member LN10    = new Value.Number.Member(Members.LN10   );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.MathLike#LOG2E
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Value.Number.Member LOG2E   = new Value.Number.Member(Members.LOG2E  );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.MathLike#LOG10E
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Value.Number.Member LOG10E  = new Value.Number.Member(Members.LOG10E );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.MathLike#PI
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Value.Number.Member PI      = new Value.Number.Member(Members.PI     );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.MathLike#SQRT1_2
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Value.Number.Member SQRT1_2 = new Value.Number.Member(Members.SQRT1_2);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.MathLike#SQRT2
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Value.Number.Member SQRT2   = new Value.Number.Member(Members.SQRT2  );

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Math#abs(Object)
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.Number>   abs    = new JsFunction.Member<java.lang.Number>(Members.abs   );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Math#acos(Object)
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.Number>   acos   = new JsFunction.Member<java.lang.Number>(Members.acos  );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Math#asin(Object)
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.Number>   asin   = new JsFunction.Member<java.lang.Number>(Members.asin  );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Math#atan(Object)
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.Number>   atan   = new JsFunction.Member<java.lang.Number>(Members.atan  );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Math#atan2(Object, Object)
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.Number>   atan2  = new JsFunction.Member<java.lang.Number>(Members.atan2 );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Math#ceil(Object)
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.Number>   ceil   = new JsFunction.Member<java.lang.Number>(Members.ceil  );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Math#cos(Object)
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.Number>   cos    = new JsFunction.Member<java.lang.Number>(Members.cos   );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Math#exp(Object)
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.Number>   exp    = new JsFunction.Member<java.lang.Number>(Members.exp   );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Math#floor(Object)
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.Number>   floor  = new JsFunction.Member<java.lang.Number>(Members.floor );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Math#log(Object)
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.Number>   log    = new JsFunction.Member<java.lang.Number>(Members.log   );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Math#max(Object, Object)
		 * @see JsGlobal.Math#max(Vars)
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.Number>   max    = new JsFunction.Member<java.lang.Number>(Members.max   );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Math#min(Object, Object)
		 * @see JsGlobal.Math#min(Vars)
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.Number>   min    = new JsFunction.Member<java.lang.Number>(Members.min   );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Math#pow(Object, Object)
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.Number>   pow    = new JsFunction.Member<java.lang.Number>(Members.pow   );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Math#random()
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.Number>   random = new JsFunction.Member<java.lang.Number>(Members.random);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Math#round(Object)
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.Number>   round  = new JsFunction.Member<java.lang.Number>(Members.round );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Math#sin(Object)
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.Number>   sin    = new JsFunction.Member<java.lang.Number>(Members.sin   );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Math#sinh(Object)
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.Number>   sinh   = new JsFunction.Member<java.lang.Number>(Members.sinh  );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Math#sqrt(Object)
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.Number>   sqrt   = new JsFunction.Member<java.lang.Number>(Members.sqrt  );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Math#tan(Object)
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.Number>   tan    = new JsFunction.Member<java.lang.Number>(Members.tan   );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.Math#tanh(Object)
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.Number>   tanh   = new JsFunction.Member<java.lang.Number>(Members.tanh  );

		/**
		 * <p>Computes an absolute value.</p>
		 * @param x Any number.
		 * @return The absolute value of <tt>x</tt>.
		 * @see jsx.core.Maths#abs(Object)
		 * @see js.MathLike#abs(Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert this virtual invocation into the JavaScript expression: 
		 * <tt>Math.abs(x)</tt>.
		 */
		public final java.lang.Number abs(java.lang.Object x) {
			return call(abs, x);
		}
		/**
		 * <p>Computes an arccosine.</p>
		 * @param x A number between -1.0 and 1.0.
		 * @return The arccosine, or inverse cosine, of the specified value <tt>x</tt>. 
		 * This return value is between 0 and pi radians.
		 * @see jsx.core.Maths#acos(Object)
		 * @see js.MathLike#acos(Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert this virtual invocation into the JavaScript expression: 
		 * <tt>Math.acos(x)</tt>.
		 */
		public final java.lang.Number acos(java.lang.Object x) {
			return call(acos, x);
		}
		/**
		 * <p>Computes an arcsine.</p>
		 * @param x A number between -1.0 and 1.0.
		 * @return The arcsine, or inverse cosine, of the specified value <tt>x</tt>. 
		 * This return value is between -pi/2 and pi/2 radians.
		 * @see jsx.core.Maths#asin(Object)
		 * @see js.MathLike#asin(Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert this virtual invocation into the JavaScript expression: 
		 * <tt>Math.asin(x)</tt>.
		 */
		public final java.lang.Number asin(java.lang.Object x) {
			return call(asin, x);
		}
		/**
		 * <p>Computes an arctangent.</p>
		 * @param x Any number.
		 * @return The arc tanget of the specified value <tt>x</tt>. This return value is 
		 * between -pi/2 and pi/2 radians.
		 * @see jsx.core.Maths#atan(Object)
		 * @see js.MathLike#atan(Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert this virtual invocation into the JavaScript expression: 
		 * <tt>Math.atan(x)</tt>.
		 */
		public final java.lang.Number atan(java.lang.Object x) {
			return call(atan, x);
		}
		/**
		 * <p>Computes the arc tangent of the ratio <tt>y/x</tt>. The <tt>y</tt> 
		 * argument can be considered the Y coordinate (or "rise") of a point, and the 
		 * <tt>x</tt> argument can be considered the X coordinate (or "run") of the point. 
		 * Note the unusual order of the arguments to this function: the Y coordinate is 
		 * passed before the X coordinate.</p>
		 * @param y The Y coordinate of the point.
		 * @param x The X coordinate of the point.
		 * @return A value between -pi and pi radians that specifies the counterclockwise angle 
		 * between the positive X axis and the point <tt>(x, y)</tt>.
		 * @see jsx.core.Maths#atan2(Object, Object)
		 * @see js.MathLike#atan2(Object, Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert this virtual invocation into the JavaScript expression: 
		 * <tt>Math.atan2(y, x)</tt>.
		 */
		public final java.lang.Number atan2(java.lang.Object y, java.lang.Object x) {
			return call(atan2, new Vars<java.lang.Object>().add(y).add(x));
		}
		/**
		 * <p>Rounds a number up.</p>
		 * @param x Any numeric value or expression.
		 * @return TThe closest integer greater than or equal to <tt>x</tt>.
		 * @see jsx.core.Maths#ceil(Object)
		 * @see js.MathLike#ceil(Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert this virtual invocation into the JavaScript expression: 
		 * <tt>Math.ceil(x)</tt>.
		 */
		public final java.lang.Number ceil(java.lang.Object x) {
			return call(ceil, x);
		}
		/**
		 * <p>Computes a cosine.</p>
		 * @param x An angle, measured in radians. 
		 * To convert degrees to radians, multiply the degree value by 0.017453293 (2pi/360).
		 * @return The cosine of the specified value <tt>x</tt>. This return value is 
		 * between -1.0 and 1.0.
		 * @see jsx.core.Maths#cos(Object)
		 * @see js.MathLike#cos(Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert this virtual invocation into the JavaScript expression: 
		 * <tt>Math.cos(x)</tt>.
		 */
		public final java.lang.Number cos(java.lang.Object x) {
			return call(cos, x);
		}
		/**
		 * <p>Computes a power of e.</p>
		 * @param x A numeric value or expression to be used as the exponent.
		 * @return e raised to the power of the specified exponent <tt>x</tt>, where e 
		 * is the base of the natural logarithm, with a value of approximately 2.71828.
		 * @see jsx.core.Maths#exp(Object)
		 * @see js.MathLike#exp(Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert this virtual invocation into the JavaScript expression: 
		 * <tt>Math.exp(x)</tt>.
		 */
		public final java.lang.Number exp(java.lang.Object x) {
			return call(exp, x);
		}
		/**
		 * <p>Rounds a number down.</p>
		 * <p>This function computes the floor function. In other words, it returns the 
		 * nearest integer value that is less than or equal to the function argument.</p>
		 * <p>This function rounds a floating-point value down to the closest integer. 
		 * This behavior differs from that of {@link #round(Object)}, which rounds up or 
		 * down to the nearest integer. Also note that this function rounds negative 
		 * numbers down (that is, to be more negative), not up (that is, closer to zero).</p>
		 * @param x Any numeric value or expression.
		 * @return The closest integer less than or equal to <tt>x</tt>.
		 * @see jsx.core.Maths#floor(Object)
		 * @see js.MathLike#floor(Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert this virtual invocation into the JavaScript expression: 
		 * <tt>Math.floor(x)</tt>.
		 */
		public final java.lang.Number floor(java.lang.Object x) {
			return call(floor, x);
		}
		/**
		 * <p>Computes a natural logarithm.</p>
		 * @param x Any numeric value or expression greater than zero.
		 * @return The natural logarithm of <tt>x</tt>.
		 * @see jsx.core.Maths#log(Object)
		 * @see js.MathLike#log(Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert this virtual invocation into the JavaScript expression: 
		 * <tt>Math.log(x)</tt>.
		 */
		public final java.lang.Number log(java.lang.Object x) {
			return call(log, x);
		}
		/**
		 * <p>Returns the largest of the numbers.</p>
		 * @param args A list of zero or more values..
		 * @return The largest of the list of arguments. Returns <tt>-Infinity</tt> if 
		 * there are no arguments. Returns <tt>NaN</tt> if any of the arguments is 
		 * <tt>NaN</tt> or is a non-numeric value that cannot be converted to a number.
		 * @since 1.0
		 * @javascript Re-compilers must convert this virtual invocation into the JavaScript expression: 
		 * <tt>Math.max(args)</tt>, where <tt>args</tt> is converted into comma-separated arguments.
		 */
		public final java.lang.Number max(Vars<?> args) {
			return call(max, args);
		}
		/**
		 * <p>Returns the larger of two numbers.</p>
		 * @param x Any value.
		 * @param y Any value.
		 * @return The larger of the two arguments. Returns <tt>-Infinity</tt> if 
		 * the arguments are all undefined. Returns <tt>NaN</tt> if any of the arguments is 
		 * <tt>NaN</tt> or is a non-numeric value that cannot be converted to a number.
		 * @see jsx.core.Maths#max(Object, Object)
		 * @see js.MathLike#max(Object, Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert this virtual invocation into the JavaScript expression: 
		 * <tt>Math.max(x, y)</tt>.
		 */
		public final java.lang.Number max(java.lang.Object x, java.lang.Object y) {
			return max(new Vars<java.lang.Object>().add(x).add(y));
		}
		/**
		 * <p>Returns the smallest of the numbers.</p>
		 * @param args A list of zero or more values..
		 * @return The smallest of the list of arguments. Returns <tt>-Infinity</tt> if 
		 * there are no arguments. Returns <tt>NaN</tt> if any of the arguments is 
		 * <tt>NaN</tt> or is a non-numeric value that cannot be converted to a number.
		 * @since 1.0
		 * @javascript Re-compilers must convert this virtual invocation into the JavaScript expression: 
		 * <tt>Math.min(args)</tt>, where <tt>args</tt> is converted into comma-separated arguments.
		 */
		public final java.lang.Number min(Vars<?> args) {
			return call(min, args);
		}
		/**
		 * <p>Returns the smaller of two numbers.</p>
		 * @param x Any value.
		 * @param y Any value.
		 * @return The smaller of the two arguments. Returns <tt>-Infinity</tt> if 
		 * the arguments are all undefined. Returns <tt>NaN</tt> if any of the arguments is 
		 * <tt>NaN</tt> or is a non-numeric value that cannot be converted to a number.
		 * @see jsx.core.Maths#min(Object, Object)
		 * @see js.MathLike#min(Object, Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert this virtual invocation into the JavaScript expression: 
		 * <tt>Math.min(x, y)</tt>.
		 */
		public final java.lang.Number min(java.lang.Object x, java.lang.Object y) {
			return min(new Vars<java.lang.Object>().add(x).add(y));
		}
		/**
		 * <p>Computes <tt>x</tt> to the power of <tt>y</tt>.</p>
		 * <p>Any values of x and y may be passed to this function. However, if the result is 
		 * an imaginary or complex number, it returns <tt>NaN</tt>. In practice, this 
		 * means that if <tt>x</tt> is negative, <tt>y</tt> should be a positive or 
		 * negative integer. Also, bear in mind that large exponents can easily cause 
		 * floating-point overflow and return a value of <tt>Infinity</tt>.</p>
		 * @param x The number to be raised to a power.
		 * @param y The power that x is to be raised to.
		 * @return <tt>x</tt> to the power of <tt>y</tt>.
		 * @see jsx.core.Maths#pow(Object, Object)
		 * @see js.MathLike#pow(Object, Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert this virtual invocation into the JavaScript expression: 
		 * <tt>Math.pow(x, y)</tt>.
		 */
		public final java.lang.Number pow(java.lang.Object x, java.lang.Object y) {
			return call(pow, new Vars<java.lang.Object>().add(x).add(y));
		}
		/**
		 * <p>Computes a random number.</p>
		 * @return A pseudo-random number between 0.0 and 1.0.
		 * @see jsx.core.Maths#random()
		 * @see js.MathLike#random()
		 * @since 1.0
		 * @javascript Re-compilers must convert this virtual invocation into the JavaScript expression: 
		 * <tt>Math.random()</tt>.
		 */
		public final java.lang.Number random() {
			return call(random);
		}
		/**
		 * <p>Rounds to the nearest integer.</p>
		 * <p>This invocation rounds its argument up or down to the nearest integer. 
		 * It rounds .5 up. For example, it rounds 1.5 to 2 and rounds -1.5 to -1.</p>
		 * @param x Any number.
		 * @return The integer closest to <tt>x</tt>.
		 * @see jsx.core.Maths#round(Object)
		 * @see js.MathLike#round(Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert this virtual invocation into the JavaScript expression: 
		 * <tt>Math.round(x)</tt>.
		 */
		public final java.lang.Number round(java.lang.Object x) {
			return call(round, x);
		}
		/**
		 * <p>Computes a sine.</p>
		 * @param x Any number.
		 * @return The sine of <tt>x</tt>. This return value is between -1.0 and 1.0.
		 * @see jsx.core.Maths#sin(Object)
		 * @see js.MathLike#sin(Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert this virtual invocation into the JavaScript expression: 
		 * <tt>Math.sin(x)</tt>.
		 */
		public final java.lang.Number sin(java.lang.Object x) {
			return call(sin, x);
		}
		/**
		 * <p>Computes a hyperbolic sine.</p>
		 * @param x Any number.
		 * @return The hyperbolic sine of <tt>x</tt>.
		 * @see jsx.core.Maths#sinh(Object)
		 * @see js.MathLike#sinh(Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert this virtual invocation into the JavaScript expression: 
		 * <tt>Math.sinh(x)</tt>.
		 */
		public final java.lang.Number sinh(java.lang.Object x) {
			return call(sinh, x);
		}
		/**
		 * <p>Computes a square root.</p>
		 * <p>Note that you can compute arbitrary roots of a number with {@link #pow(Object, Object)}. </p>
		 * @param x A numeric value greater than or equal to zero.
		 * @return The square root of <tt>x</tt>. Returns <tt>NaN</tt> if 
		 * <tt>x</tt> is less than zero.
		 * @see jsx.core.Maths#sqrt(Object)
		 * @see js.MathLike#sqrt(Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert this virtual invocation into the JavaScript expression: 
		 * <tt>Math.sqrt(x)</tt>.
		 */
		public final java.lang.Number sqrt(java.lang.Object x) {
			return call(sqrt, x);
		}
		/**
		 * <p>Computes a tangent.</p>
		 * @param x An angle, measured in radians. To convert degrees to radians, 
		 * multiply the degree value by 0.017453293 (2pi/360).
		 * @return The tangent of the specified angle <tt>x</tt>.
		 * @see jsx.core.Maths#tan(Object)
		 * @see js.MathLike#tan(Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert this virtual invocation into the JavaScript expression: 
		 * <tt>Math.tan(x)</tt>.
		 */
		public final java.lang.Number tan(java.lang.Object x) {
			return call(tan, x);
		}
		/**
		 * <p>Computes a hyperbolic tangent.</p>
		 * @param x Any number.
		 * @return The hyperbolic tangent of <tt>x</tt>.
		 * @see jsx.core.Maths#tanh(Object)
		 * @see js.MathLike#tanh(Object)
		 * @since 1.0
		 * @javascript Re-compilers must convert this virtual invocation into the JavaScript expression: 
		 * <tt>Math.tanh(x)</tt>.
		 */
		public final java.lang.Number tanh(java.lang.Object x) {
			return call(tanh, x);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global Number class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class Number extends JsFunction<java.lang.Number>
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
		protected static abstract class Members extends JsFunction.Members
		{
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Number#MAX_VALUE
			 * @see JsGlobal.Number.Member#MAX_VALUE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid MAX_VALUE         = id("MAX_VALUE"        );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Number#MIN_VALUE
			 * @see JsGlobal.Number.Member#MIN_VALUE
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid MIN_VALUE         = id("MIN_VALUE"        );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Number#NaN
			 * @see JsGlobal.Number.Member#NaN
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid NaN               = id("NaN"              );
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Number#NEGATIVE_INFINITY
			 * @see JsGlobal.Number.Member#NEGATIVE_INFINITY
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid NEGATIVE_INFINITY = id("NEGATIVE_INFINITY");
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @see JsGlobal.Number#POSITIVE_INFINITY
			 * @see JsGlobal.Number.Member#POSITIVE_INFINITY
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid POSITIVE_INFINITY = id("POSITIVE_INFINITY");
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
		public static class Member extends JsFunction.Member<java.lang.Number>
		{
			private Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
			private Member(Mid mid) {
				super(mid);
			}
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
			@Override
			public Number with(ObjectLike o) {
				return new Number(super.with(o));
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
			@Override
			public Number with() {
				return with(Js.core());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * <p>The property of this member is the largest number representable in 
			 * JavaScript. Its value is approximately 1.79E+308.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member MAX_VALUE         = new Value.Number.Member(this, Members.MAX_VALUE        );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * <p>The property of this member is the smallest (closest to zero, not most 
			 * negative) number representable in JavaScript. Its value is approximately 
			 * 5E-324.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member MIN_VALUE         = new Value.Number.Member(this, Members.MIN_VALUE        );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * <p>The property of this member is a special value that indicates that the 
			 * result of some mathematical operation (such as taking the square root of 
			 * a negative number) is not a number. {@link JsGlobal#parseInt} and {@link JsGlobal#parseFloat} 
			 * return this value when they cannot parse the specified string, and you 
			 * might use {@link JsGlobal.Number#NaN} in a similar way to indicate an 
			 * error condition for some function that normally returns a valid number.</p>
			 * <p>JavaScript prints the <tt>Number.NaN</tt> value as <tt>NaN</tt>. Note 
			 * that the <tt>NaN</tt> value always compares as unequal to any other 
			 * number, including <tt>NaN</tt> itself. Thus, you cannot check for the 
			 * not-a-number value by comparing to <tt>Number.NaN</tt>; use the {@link JsGlobal#isNaN(Object)} 
			 * function instead. In ECMAScript v1 and later, you can also use the predefined global 
			 * property <tt>NaN</tt> instead of <tt>Number.NaN</tt>.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member NaN               = new Value.Number.Member(this, Members.NaN              );
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * <p>The property of this member is a special numeric value that is returned 
			 * when an arithmetic operation or mathematical function generates a negative 
			 * value greater than the largest representable number in JavaScript (i.e., 
			 * more negative than <tt>-Number.MAX_VALUE</tt>).</p>
			 * <p>JavaScript displays the <tt>NEGATIVE_INFINITY</tt> value as <tt>-Infinity</tt>. 
			 * This value behaves mathematically like infinity; for example, anything multiplied 
			 * by infinity is infinity, and anything divided by infinity is zero. In 
			 * ECMAScript v1 and later, you can also use <tt>-Infinity</tt> instead of 
			 * <tt>Number.NEGATIVE_INFINITY</tt>.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member NEGATIVE_INFINITY = new Value.Number.Member(this, Members.NEGATIVE_INFINITY);
			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * <p>The property of this member is a special numeric value returned when 
			 * an arithmetic operation or mathematical function overflows or generates 
			 * a value greater than the largest representable number in JavaScript (i.e., 
			 * greater than <tt>Number.MAX_VALUE</tt>). Note that when numbers "underflow", 
			 * or become less than <tt>Number.MIN_VALUE</tt>, JavaScript converts them 
			 * to zero.</p>
			 * <p>JavaScript displays the <tt>POSITIVE_INFINITY</tt> value as <tt>Infinity</tt>. 
			 * This value behaves mathematically like infinity; for example, anything 
			 * multiplied by infinity is infinity, and anything divided by infinity is z
			 * ero. In ECMAScript v1 and later, you can also use the predefined global 
			 * property Infinity instead of <tt>Number.POSITIVE_INFINITY</tt>.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the 
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Value.Number.Member POSITIVE_INFINITY = new Value.Number.Member(this, Members.POSITIVE_INFINITY);

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * <p>The <tt>prototype</tt> property is used when a function is used as a 
			 * constructor. It refers to an object that serves as the prototype for an entire 
			 * class of objects. Any object created by the constructor inherits all properties 
			 * of the object referred to by the <tt>prototype</tt> property.</p>
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
		public Number(JsObject var) {
			super(var);
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * <p>The property of this member is the largest number representable in 
		 * JavaScript. Its value is approximately 1.79E+308.</p>
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Value.Number.Member MAX_VALUE         = new Value.Number.Member(Members.MAX_VALUE        );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * <p>The property of this member is the smallest (closest to zero, not most 
		 * negative) number representable in JavaScript. Its value is approximately 
		 * 5E-324.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Value.Number.Member MIN_VALUE         = new Value.Number.Member(Members.MIN_VALUE        );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * <p>The property of this member is a special value that indicates that the 
		 * result of some mathematical operation (such as taking the square root of 
		 * a negative number) is not a number. {@link JsGlobal#parseInt} and {@link JsGlobal#parseFloat} 
		 * return this value when they cannot parse the specified string, and you 
		 * might use {@link JsGlobal.Number#NaN} in a similar way to indicate an 
		 * error condition for some function that normally returns a valid number.</p>
		 * <p>JavaScript prints the <tt>Number.NaN</tt> value as <tt>NaN</tt>. Note 
		 * that the <tt>NaN</tt> value always compares as unequal to any other 
		 * number, including <tt>NaN</tt> itself. Thus, you cannot check for the 
		 * not-a-number value by comparing to <tt>Number.NaN</tt>; use the {@link JsGlobal#isNaN(Object)} 
		 * function instead. In ECMAScript v1 and later, you can also use the predefined global 
		 * property <tt>NaN</tt> instead of <tt>Number.NaN</tt>.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Value.Number.Member NaN               = new Value.Number.Member(Members.NaN              );
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Value.Number.Member NEGATIVE_INFINITY = new Value.Number.Member(Members.NEGATIVE_INFINITY);
		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * <p>The property of this member is a special numeric value returned when 
		 * an arithmetic operation or mathematical function overflows or generates 
		 * a value greater than the largest representable number in JavaScript (i.e., 
		 * greater than <tt>Number.MAX_VALUE</tt>). Note that when numbers "underflow", 
		 * or become less than <tt>Number.MIN_VALUE</tt>, JavaScript converts them 
		 * to zero.</p>
		 * <p>JavaScript displays the <tt>POSITIVE_INFINITY</tt> value as <tt>Infinity</tt>. 
		 * This value behaves mathematically like infinity; for example, anything 
		 * multiplied by infinity is infinity, and anything divided by infinity is z
		 * ero. In ECMAScript v1 and later, you can also use the predefined global 
		 * property Infinity instead of <tt>Number.POSITIVE_INFINITY</tt>.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Value.Number.Member POSITIVE_INFINITY = new Value.Number.Member(Members.POSITIVE_INFINITY);

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * <p>The <tt>prototype</tt> property is used when a function is used as a 
		 * constructor. It refers to an object that serves as the prototype for an entire 
		 * class of objects. Any object created by the constructor inherits all properties 
		 * of the object referred to by the <tt>prototype</tt> property.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>Constructs a JavaScript <tt>Number</tt> object with value of 0.</p>
		 * @return A newly constructed <tt>Number</tt> object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new Number()</pre>
		 */
		@Override
		public final JsNumber create() {
			return new JsNumber(super.create());
		}
		/**
		 * <p>Constructs a JavaScript <tt>Number</tt> object.</p>
		 * @param value The numeric value of the Number object being created or a value to 
		 * be converted to a number.
		 * @return A newly constructed <tt>Number</tt> object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new Number(value)</pre>
		 */
		@Override
		public final JsNumber create(java.lang.Object value) {
			return new JsNumber(super.create(value));
		}
		/**
		 * <p>Constructs a JavaScript <tt>Number</tt> object.</p>
		 * @param args The variable argument.
		 * @return A newly constructed <tt>Number</tt> object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new Number(args)</pre>
		 * where <tt>args</tt> must be expanded into comma-separated argument values.
		 */
		@Override
		public final JsNumber create(Vars<?> args) {
			return new JsNumber(super.create(args));
		}
		/**
		 * <p>Converts a value to primitive number.</p>
		 * @param value The numeric value of the Number object being created or a value to 
		 * be converted to a number.
		 * @return The primitive number.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>Number(value)</pre>
		 */
		@Override
		public final java.lang.Number invoke(java.lang.Object value) {
			return (java.lang.Number)Js.valueOf(value);
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
				 * @see JsGlobal.Number.Prototype#toExponential
				 * @see JsGlobal.Number.Prototype.Member#toExponential
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid toExponential = id("toExponential");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Number.Prototype#toFixed
				 * @see JsGlobal.Number.Prototype.Member#toFixed
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid toFixed       = id("toFixed"      );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.Number.Prototype#toPrecision
				 * @see JsGlobal.Number.Prototype.Member#toPrecision
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid toPrecision   = id("toPrecision"  );
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
				protected Member(JsObject.Member q, Mid mid) {
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
				protected Member(Mid mid) {
					super(mid);
				}
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
				@Override
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNumber#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Number> valueOf       = new JsFunction.Member<java.lang.Number>(this, Members.valueOf      );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNumber#toExponential()
				 * @see JsNumber#toExponential(Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String> toExponential = new JsFunction.Member<java.lang.String>(this, Members.toExponential);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNumber#toFixed()
				 * @see JsNumber#toFixed(Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String> toFixed       = new JsFunction.Member<java.lang.String>(this, Members.toFixed      );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsNumber#toPrecision()
				 * @see JsNumber#toPrecision(Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String> toPrecision   = new JsFunction.Member<java.lang.String>(this, Members.toPrecision  );
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
			 * @see JsNumber#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Number> valueOf       = new JsFunction.Member<java.lang.Number>(Members.valueOf      );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNumber#toExponential()
			 * @see JsNumber#toExponential(Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String> toExponential = new JsFunction.Member<java.lang.String>(Members.toExponential);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNumber#toFixed()
			 * @see JsNumber#toFixed(Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String> toFixed       = new JsFunction.Member<java.lang.String>(Members.toFixed      );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsNumber#toPrecision()
			 * @see JsNumber#toPrecision(Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String> toPrecision   = new JsFunction.Member<java.lang.String>(Members.toPrecision  );
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global Object class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class Object extends JsFunction<JsObject>
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
			private Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
			private Member(Mid mid) {
				super(mid);
			}
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
			@Override
			public Object with(ObjectLike o) {
				return new Object(super.with(o));
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
			@Override
			public Object with() {
				return with(Js.core());
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
		public Object(JsObject var) {
			super(var);
		}

		/**
		 * <p>Constructs a JavaScript object.</p>
		 * <p>In JavaScript, If no argument is passed, this constructor returns a newly 
		 * created Object instance. If a primitive value argument is specified, the 
		 * constructor creates and returns a Number, Boolean, or String object wrapper for 
		 * the primitive value. When the <tt>Object()</tt> constructor is called as a 
		 * function, without the <tt>new</tt> operator, it behaves just as it does when used 
		 * with the <tt>new</tt> operator.</p>
		 * @return The newly constructed JavaScript object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new Object()</pre>
		 */
		public final JsObject create() {
			return Js.object().var();
		}
		/**
		 * <p>Constructs a JavaScript object.</p>
		 * <p>In JavaScript, If no argument is passed, this constructor returns a newly 
		 * created Object instance. If a primitive value argument is specified, the 
		 * constructor creates and returns a Number, Boolean, or String object wrapper for 
		 * the primitive value. When the <tt>Object()</tt> constructor is called as a 
		 * function, without the <tt>new</tt> operator, it behaves just as it does when used 
		 * with the <tt>new</tt> operator.</p>
		 * @return The newly constructed JavaScript object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new Object()</pre>
		 */
		public final JsObject invoke() {
			return Js.object().var();
		}
		/**
		 * <p>Constructs a JavaScript object.</p>
		 * <p>In JavaScript, If no argument is passed, this constructor returns a newly 
		 * created Object instance. If a primitive value argument is specified, the 
		 * constructor creates and returns a Number, Boolean, or String object wrapper for 
		 * the primitive value. When the <tt>Object()</tt> constructor is called as a 
		 * function, without the <tt>new</tt> operator, it behaves just as it does when used 
		 * with the <tt>new</tt> operator.</p>
		 * @param value The argument value.
		 * @return The newly constructed JavaScript object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new Object(value)</pre>
		 */
		public final JsBoolean create(java.lang.Boolean value) {
			return new JsBoolean(super.create(value));
		}
		/**
		 * <p>Constructs a JavaScript object.</p>
		 * <p>In JavaScript, If no argument is passed, this constructor returns a newly 
		 * created Object instance. If a primitive value argument is specified, the 
		 * constructor creates and returns a Number, Boolean, or String object wrapper for 
		 * the primitive value. When the <tt>Object()</tt> constructor is called as a 
		 * function, without the <tt>new</tt> operator, it behaves just as it does when used 
		 * with the <tt>new</tt> operator.</p>
		 * @param value The argument value.
		 * @return The newly constructed JavaScript object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>Object(value)</pre>
		 */
		public final JsBoolean invoke(java.lang.Boolean value) {
			return new JsBoolean(super.invoke(value));
		}
		/**
		 * <p>Constructs a JavaScript object.</p>
		 * <p>In JavaScript, If no argument is passed, this constructor returns a newly 
		 * created Object instance. If a primitive value argument is specified, the 
		 * constructor creates and returns a Number, Boolean, or String object wrapper for 
		 * the primitive value. When the <tt>Object()</tt> constructor is called as a 
		 * function, without the <tt>new</tt> operator, it behaves just as it does when used 
		 * with the <tt>new</tt> operator.</p>
		 * @param value The argument value.
		 * @return The newly constructed JavaScript object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new Object(value)</pre>
		 */
		public final JsBoolean create(Value<java.lang.Boolean> value) {
			return new JsBoolean(super.create(value));
		}
		/**
		 * <p>Constructs a JavaScript object.</p>
		 * <p>In JavaScript, If no argument is passed, this constructor returns a newly 
		 * created Object instance. If a primitive value argument is specified, the 
		 * constructor creates and returns a Number, Boolean, or String object wrapper for 
		 * the primitive value. When the <tt>Object()</tt> constructor is called as a 
		 * function, without the <tt>new</tt> operator, it behaves just as it does when used 
		 * with the <tt>new</tt> operator.</p>
		 * @param value The argument value.
		 * @return The newly constructed JavaScript object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>Object(value)</pre>
		 */
		public final JsBoolean invoke(Value<java.lang.Boolean> value) {
			return new JsBoolean(super.invoke(value));
		}
		/**
		 * <p>Constructs a JavaScript object.</p>
		 * <p>In JavaScript, If no argument is passed, this constructor returns a newly 
		 * created Object instance. If a primitive value argument is specified, the 
		 * constructor creates and returns a Number, Boolean, or String object wrapper for 
		 * the primitive value. When the <tt>Object()</tt> constructor is called as a 
		 * function, without the <tt>new</tt> operator, it behaves just as it does when used 
		 * with the <tt>new</tt> operator.</p>
		 * @param value The argument value.
		 * @return The newly constructed JavaScript object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new Object(value)</pre>
		 */
		public final JsBoolean create(JsBoolean value) {
			return new JsBoolean(super.create(value));
		}
		/**
		 * <p>Constructs a JavaScript object.</p>
		 * <p>In JavaScript, If no argument is passed, this constructor returns a newly 
		 * created Object instance. If a primitive value argument is specified, the 
		 * constructor creates and returns a Number, Boolean, or String object wrapper for 
		 * the primitive value. When the <tt>Object()</tt> constructor is called as a 
		 * function, without the <tt>new</tt> operator, it behaves just as it does when used 
		 * with the <tt>new</tt> operator.</p>
		 * @param value The argument value.
		 * @return The newly constructed JavaScript object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>Object(value)</pre>
		 */
		public final JsBoolean invoke(JsBoolean value) {
			return new JsBoolean(super.invoke(value));
		}
		/**
		 * <p>Constructs a JavaScript object.</p>
		 * <p>In JavaScript, If no argument is passed, this constructor returns a newly 
		 * created Object instance. If a primitive value argument is specified, the 
		 * constructor creates and returns a Number, Boolean, or String object wrapper for 
		 * the primitive value. When the <tt>Object()</tt> constructor is called as a 
		 * function, without the <tt>new</tt> operator, it behaves just as it does when used 
		 * with the <tt>new</tt> operator.</p>
		 * @param value The argument value.
		 * @return The newly constructed JavaScript object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new Object(value)</pre>
		 */
		public final JsNumber create(java.lang.Number value) {
			return new JsNumber(super.create(value));
		}
		/**
		 * <p>Constructs a JavaScript object.</p>
		 * <p>In JavaScript, If no argument is passed, this constructor returns a newly 
		 * created Object instance. If a primitive value argument is specified, the 
		 * constructor creates and returns a Number, Boolean, or String object wrapper for 
		 * the primitive value. When the <tt>Object()</tt> constructor is called as a 
		 * function, without the <tt>new</tt> operator, it behaves just as it does when used 
		 * with the <tt>new</tt> operator.</p>
		 * @param value The argument value.
		 * @return The newly constructed JavaScript object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>Object(value)</pre>
		 */
		public final JsNumber invoke(java.lang.Number value) {
			return new JsNumber(super.invoke(value));
		}
		/**
		 * <p>Constructs a JavaScript object.</p>
		 * <p>In JavaScript, If no argument is passed, this constructor returns a newly 
		 * created Object instance. If a primitive value argument is specified, the 
		 * constructor creates and returns a Number, Boolean, or String object wrapper for 
		 * the primitive value. When the <tt>Object()</tt> constructor is called as a 
		 * function, without the <tt>new</tt> operator, it behaves just as it does when used 
		 * with the <tt>new</tt> operator.</p>
		 * @param value The argument value.
		 * @return The newly constructed JavaScript object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new Object(value)</pre>
		 */
		public final JsNumber create(NumberLike<? extends java.lang.Number> value) {
			return new JsNumber(super.create(value));
		}
		/**
		 * <p>Constructs a JavaScript object.</p>
		 * <p>In JavaScript, If no argument is passed, this constructor returns a newly 
		 * created Object instance. If a primitive value argument is specified, the 
		 * constructor creates and returns a Number, Boolean, or String object wrapper for 
		 * the primitive value. When the <tt>Object()</tt> constructor is called as a 
		 * function, without the <tt>new</tt> operator, it behaves just as it does when used 
		 * with the <tt>new</tt> operator.</p>
		 * @param value The argument value.
		 * @return The newly constructed JavaScript object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>Object(value)</pre>
		 */
		public final JsNumber invoke(NumberLike<? extends java.lang.Number> value) {
			return new JsNumber(super.invoke(value));
		}
		/**
		 * <p>Constructs a JavaScript object.</p>
		 * <p>In JavaScript, If no argument is passed, this constructor returns a newly 
		 * created Object instance. If a primitive value argument is specified, the 
		 * constructor creates and returns a Number, Boolean, or String object wrapper for 
		 * the primitive value. When the <tt>Object()</tt> constructor is called as a 
		 * function, without the <tt>new</tt> operator, it behaves just as it does when used 
		 * with the <tt>new</tt> operator.</p>
		 * @param value The argument value.
		 * @return The newly constructed JavaScript object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new Object(value)</pre>
		 */
		public final JsString create(java.lang.String value) {
			return new JsString(super.create(value));
		}
		/**
		 * <p>Constructs a JavaScript object.</p>
		 * <p>In JavaScript, If no argument is passed, this constructor returns a newly 
		 * created Object instance. If a primitive value argument is specified, the 
		 * constructor creates and returns a Number, Boolean, or String object wrapper for 
		 * the primitive value. When the <tt>Object()</tt> constructor is called as a 
		 * function, without the <tt>new</tt> operator, it behaves just as it does when used 
		 * with the <tt>new</tt> operator.</p>
		 * @param value The argument value.
		 * @return The newly constructed JavaScript object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>Object(value)</pre>
		 */
		public final JsString invoke(java.lang.String value) {
			return new JsString(super.invoke(value));
		}
		/**
		 * <p>Constructs a JavaScript object.</p>
		 * <p>In JavaScript, If no argument is passed, this constructor returns a newly 
		 * created Object instance. If a primitive value argument is specified, the 
		 * constructor creates and returns a Number, Boolean, or String object wrapper for 
		 * the primitive value. When the <tt>Object()</tt> constructor is called as a 
		 * function, without the <tt>new</tt> operator, it behaves just as it does when used 
		 * with the <tt>new</tt> operator.</p>
		 * @param value The argument value.
		 * @return The newly constructed JavaScript object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new Object(value)</pre>
		 */
		public final JsString create(StringLike value) {
			return new JsString(super.create(value));
		}
		/**
		 * <p>Constructs a JavaScript object.</p>
		 * <p>In JavaScript, If no argument is passed, this constructor returns a newly 
		 * created Object instance. If a primitive value argument is specified, the 
		 * constructor creates and returns a Number, Boolean, or String object wrapper for 
		 * the primitive value. When the <tt>Object()</tt> constructor is called as a 
		 * function, without the <tt>new</tt> operator, it behaves just as it does when used 
		 * with the <tt>new</tt> operator.</p>
		 * @param value The argument value.
		 * @return The newly constructed JavaScript object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>Object(value)</pre>
		 */
		public final JsString invoke(StringLike value) {
			return new JsString(super.invoke(value));
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global RegExp class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class RegExp extends JsFunction<JsRegExp>
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
		public static class Member extends JsFunction.Member<JsRegExp>
		{
			private Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
			private Member(Mid mid) {
				super(mid);
			}
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
			@Override
			public RegExp with(ObjectLike o) {
				return new RegExp(super.with(o));
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
			@Override
			public RegExp with() {
				return with(Js.core());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * <p>The <tt>prototype</tt> property is used when a function is used as a 
			 * constructor. It refers to an object that serves as the prototype for an entire 
			 * class of objects. Any object created by the constructor inherits all properties 
			 * of the object referred to by the <tt>prototype</tt> property.</p>
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
		public RegExp(JsObject var) {
			super(var);
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * <p>The <tt>prototype</tt> property is used when a function is used as a 
		 * constructor. It refers to an object that serves as the prototype for an entire 
		 * class of objects. Any object created by the constructor inherits all properties 
		 * of the object referred to by the <tt>prototype</tt> property.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>Constructs a regular expression object or simply returns an existing one.</p>
		 * <p>In JavaScript, if <tt>RegExp()</tt> is called as a function without the <tt>new</tt> 
		 * operator, it behaves just as it would with the <tt>new</tt> operator, except when 
		 * the first argument is a regular expression; in that case, it simply returns 
		 * the argument instead of creating a new <tt>RegExp</tt> object.</p>
		 * @param pattern A string that specifies the pattern of the regular expression or 
		 * another regular expression.
		 * @param flags An optional string containing any of the "g", "i", and "m" attributes 
		 * that specify global, case-insensitive, and multiline matches, respectively. The 
		 * "m" attribute is not available prior to ECMAScript standardization. If the 
		 * <tt>pattern</tt> argument is a regular expression instead of a string, this 
		 * argument must be omitted.
		 * @return The newly constructed regular expression object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>RegExp(pattern, flags)</pre>
		 */
		public final JsRegExp invoke(java.lang.Object pattern, java.lang.Object flags) {
			return invoke(new Vars<java.lang.Object>().add(pattern).add(flags));
		}
		/**
		 * <p>Constructs a regular expression object or simply returns an existing one.</p>
		 * <p>In JavaScript, if <tt>RegExp()</tt> is called as a function without the <tt>new</tt> 
		 * operator, it behaves just as it would with the <tt>new</tt> operator, except when 
		 * the first argument is a regular expression; in that case, it simply returns 
		 * the argument instead of creating a new <tt>RegExp</tt> object.</p>
		 * @param pattern A string that specifies the pattern of the regular expression or 
		 * another regular expression.
		 * @return The newly constructed regular expression object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>RegExp(pattern)</pre>
		 */
		@Override
		public final JsRegExp invoke(java.lang.Object pattern) {
			return new JsRegExp(super.invoke(pattern));
		}
		/**
		 * <p>Constructs a regular expression object or simply returns an existing one.</p>
		 * <p>In JavaScript, if <tt>RegExp()</tt> is called as a function without the <tt>new</tt> 
		 * operator, it behaves just as it would with the <tt>new</tt> operator, except when 
		 * the first argument is a regular expression; in that case, it simply returns 
		 * the argument instead of creating a new <tt>RegExp</tt> object.</p>
		 * @param args The variable argument.
		 * @return The newly constructed regular expression object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>RegExp(args)</pre>
		 * where <tt>args</tt> must be expanded to comma-separated argument values.
		 */
		@Override
		public final JsRegExp invoke(Vars<?> args) {
			return new JsRegExp(super.invoke(args));
		}
		/**
		 * <p>Constructs a regular expression object.</p>
		 * <p>In JavaScript, if <tt>RegExp()</tt> is called as a function without the <tt>new</tt> 
		 * operator, it behaves just as it would with the <tt>new</tt> operator, except when 
		 * the first argument is a regular expression; in that case, it simply returns 
		 * the argument instead of creating a new <tt>RegExp</tt> object.</p>
		 * @param pattern A string that specifies the pattern of the regular expression or 
		 * another regular expression.
		 * @param flags An optional string containing any of the "g", "i", and "m" attributes 
		 * that specify global, case-insensitive, and multiline matches, respectively. The 
		 * "m" attribute is not available prior to ECMAScript standardization. If the 
		 * <tt>pattern</tt> argument is a regular expression instead of a string, this 
		 * argument must be omitted.
		 * @return The newly constructed regular expression object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new RegExp(pattern, flags)</pre>
		 */
		public final JsRegExp create(java.lang.Object pattern, java.lang.Object flags) {
			return create(new Vars<java.lang.Object>().add(pattern).add(flags));
		}
		/**
		 * <p>Constructs a regular expression object.</p>
		 * <p>In JavaScript, if <tt>RegExp()</tt> is called as a function without the <tt>new</tt> 
		 * operator, it behaves just as it would with the <tt>new</tt> operator, except when 
		 * the first argument is a regular expression; in that case, it simply returns 
		 * the argument instead of creating a new <tt>RegExp</tt> object.</p>
		 * @param pattern A string that specifies the pattern of the regular expression or 
		 * another regular expression.
		 * @return The newly constructed regular expression object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new RegExp(pattern)</pre>
		 */
		@Override
		public final JsRegExp create(java.lang.Object pattern) {
			return new JsRegExp(super.create(pattern));
		}
		/**
		 * <p>Constructs a regular expression object.</p>
		 * <p>In JavaScript, if <tt>RegExp()</tt> is called as a function without the <tt>new</tt> 
		 * operator, it behaves just as it would with the <tt>new</tt> operator, except when 
		 * the first argument is a regular expression; in that case, it simply returns 
		 * the argument instead of creating a new <tt>RegExp</tt> object.</p>
		 * @param args The variable argument.
		 * @return The newly constructed regular expression object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new RegExp(args)</pre>
		 * where <tt>args</tt> must be expanded to comma-separated argument values.
		 */
		@Override
		public final JsRegExp create(Vars<?> args) {
			return new JsRegExp(super.create(args));
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
				 * @see JsGlobal.RegExp.Prototype#exec
				 * @see JsGlobal.RegExp.Prototype.Member#exec
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid exec = id("exec");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.RegExp.Prototype#test
				 * @see JsGlobal.RegExp.Prototype.Member#test
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid test = id("test");
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
				protected Member(JsObject.Member q, Mid mid) {
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
				protected Member(Mid mid) {
					super(mid);
				}
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
				@Override
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsRegExp#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsRegExp> valueOf = new JsFunction.Member<JsRegExp>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsRegExp#exec(Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsArray> exec = new JsFunction.Member<JsArray>(this, Members.exec);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsRegExp#test(Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Boolean>         test = new JsFunction.Member<java.lang.Boolean>        (this, Members.test);
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
			 * @see JsRegExp#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsRegExp> valueOf = new JsFunction.Member<JsRegExp>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsRegExp#exec(Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsArray> exec = new JsFunction.Member<JsArray>(Members.exec);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsRegExp#test(Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Boolean> test = new JsFunction.Member<java.lang.Boolean>(Members.test);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global String class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class String extends JsFunction<java.lang.String>
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
		protected static abstract class Members extends JsFunction.Members
		{
			/**
			 * <p>An <b>internal</b> static field defining a member ID of the field name and 
			 * used internally to define a member of the same name.</p>
			 * @since 1.0
			 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
			 */
			public final static Mid fromCharCode = id("fromCharCode");
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
		public static class Member extends JsFunction.Member<java.lang.String>
		{
			private Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
			private Member(Mid mid) {
				super(mid);
			}
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
			@Override
			public String with(ObjectLike o) {
				return new String(super.with(o));
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
			@Override
			public String with() {
				return with(Js.core());
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
			public final JsFunction.Member<java.lang.String> fromCharCode = new JsFunction.Member<java.lang.String>(this, Members.fromCharCode);

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * <p>The <tt>prototype</tt> property is used when a function is used as a 
			 * constructor. It refers to an object that serves as the prototype for an entire 
			 * class of objects. Any object created by the constructor inherits all properties 
			 * of the object referred to by the <tt>prototype</tt> property.</p>
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
		public String(JsObject var) {
			super(var);
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsGlobal.String#fromCharCode(Object)
		 * @see JsGlobal.String#fromCharCode(Var)
		 * @javascript Re-compilers must resolve the member of this static field to the 
		 * identifier of the field name.
		 */
		public static final JsFunction.Member<java.lang.String> fromCharCode = new JsFunction.Member<java.lang.String>(Members.fromCharCode);

		/**
		 * <p>Creates a new string using the character codes passed as arguments.</p>
		 * <p>{@link JsString#charCodeAt(Object)} is a companion instance method that provides 
		 * a way to obtain the encodings of the individual characters of a string.</p>
		 * <p>Note that, in JavaScript <tt>String.fromCharCode</tt> is "static" method of the 
		 * global class <tt>String</tt>, but in JS this method is of an instance.</p>
		 * @param c An integer that specifies the Unicode encodings of the characters in 
		 * the string to be created.
		 * @return A new string containing characters with the specified encodings.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>String.fromCharCode(c)</pre>
		 */
		public final java.lang.String fromCharCode(java.lang.Object c) {
			return call(fromCharCode, c);
		}
		/**
		 * <p>Creates a new string using the character codes passed as arguments.</p>
		 * <p>{@link JsString#charCodeAt(Object)} is a companion instance method that provides 
		 * a way to obtain the encodings of the individual characters of a string.</p>
		 * <p>Note that, in JavaScript <tt>String.fromCharCode</tt> is "static" method of the 
		 * global class <tt>String</tt>, but in JS this method is of an instance.</p>
		 * @param args The variable argument containing zero or more integers that specify 
		 * the Unicode encodings of the characters in the string to be created.
		 * @return A new string containing characters with the specified encodings.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>String.fromCharCode(args)</pre>
		 * where <tt>args</tt> must be expanded to comma-separated argument values.
		 */
		public final java.lang.String fromCharCode(Var<?> args) {
			return call(fromCharCode, args);
		}

		/**
		 * <p>Constructs a string object holding an empty string value.</p>
		 * <p>In JavaScript, <tt>String()</tt> may also be called as a function, without the 
		 * <tt>new</tt> operator. When invoked in this way, <tt>String()</tt> simply converts 
		 * the argument to a primitive string value and returns it.</p>
		 * @return The newly constructed string object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new String()</pre>
		 */
		@Override
		public final JsString create() {
			return new JsString(super.create());
		}
		/**
		 * <p>Returns an empty string value.</p>
		 * <p>In JavaScript, <tt>String()</tt> may also be called as a function, without the 
		 * <tt>new</tt> operator. When invoked in this way, <tt>String()</tt> simply converts 
		 * the argument to a primitive string value and returns it.</p>
		 * @return An empty string.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>String()</pre>
		 */
		@Override
		public final java.lang.String invoke() {
			return "";
		}
		/**
		 * <p>Constructs a string object holding a string value.</p>
		 * <p>In JavaScript, <tt>String()</tt> may also be called as a function, without the 
		 * <tt>new</tt> operator. When invoked in this way, <tt>String()</tt> simply converts 
		 * the argument to a primitive string value and returns it.</p>
		 * @param value The argument value.
		 * @return The newly constructed string object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new String(value)</pre>
		 */
		@Override
		public final JsString create(java.lang.Object value) {
			return new JsString(super.create(value));
		}
		/**
		 * <p>Converts the argument to a primitive string value and returns it.</p>
		 * <p>In JavaScript, <tt>String()</tt> may also be called as a function, without the 
		 * <tt>new</tt> operator. When invoked in this way, <tt>String()</tt> simply converts 
		 * the argument to a primitive string value and returns it.</p>
		 * @param value The argument value.
		 * @return The converted string value.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>String(value)</pre>
		 */
		@Override
		public final java.lang.String invoke(java.lang.Object value) {
			return Js.toString(value);
		}
		/**
		 * <p>Constructs a string object holding a string value.</p>
		 * <p>In JavaScript, <tt>String()</tt> may also be called as a function, without the 
		 * <tt>new</tt> operator. When invoked in this way, <tt>String()</tt> simply converts 
		 * the argument to a primitive string value and returns it.</p>
		 * @param args The variable argument.
		 * @return The newly constructed string object.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>new String(args)</pre>
		 * where <tt>args</tt> must be expanded to comma-separated argument values.
		 */
		@Override
		public final JsString create(Vars<?> args) {
			return new JsString(super.create(args));
		}
		/**
		 * <p>Converts the argument to a primitive string value and returns it.</p>
		 * <p>In JavaScript, <tt>String()</tt> may also be called as a function, without the 
		 * <tt>new</tt> operator. When invoked in this way, <tt>String()</tt> simply converts 
		 * the argument to a primitive string value and returns it.</p>
		 * @param args The variable argument.
		 * @return The converted string value.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript expression:
		 * <pre>String(args)</pre>
		 * where <tt>args</tt> must be expanded to comma-separated argument values.
		 */
		@Override
		public final java.lang.String invoke(Vars<?> args) {
			return Js.toString(args.var().get(0));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * <p>The <tt>prototype</tt> property is used when a function is used as a 
		 * constructor. It refers to an object that serves as the prototype for an entire 
		 * class of objects. Any object created by the constructor inherits all properties 
		 * of the object referred to by the <tt>prototype</tt> property.</p>
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
				 * @see JsGlobal.String.Prototype#charAt
				 * @see JsGlobal.String.Prototype.Member#charAt
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid charAt            = id("charAt"           );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.String.Prototype#charCodeAt
				 * @see JsGlobal.String.Prototype.Member#charCodeAt
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid charCodeAt        = id("charCodeAt"       );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.String.Prototype#concat
				 * @see JsGlobal.String.Prototype.Member#concat
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid concat            = id("concat"           );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.String.Prototype#indexOf
				 * @see JsGlobal.String.Prototype.Member#indexOf
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid indexOf           = id("indexOf"          );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.String.Prototype#lastIndexOf
				 * @see JsGlobal.String.Prototype.Member#lastIndexOf
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid lastIndexOf       = id("lastIndexOf"      );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.String.Prototype#localeCompare
				 * @see JsGlobal.String.Prototype.Member#localeCompare
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid localeCompare     = id("localeCompare"    );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.String.Prototype#match
				 * @see JsGlobal.String.Prototype.Member#match
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid match             = id("match"            );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.String.Prototype#replace
				 * @see JsGlobal.String.Prototype.Member#replace
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid replace           = id("replace"          );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.String.Prototype#search
				 * @see JsGlobal.String.Prototype.Member#search
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid search            = id("search"           );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.String.Prototype#slice
				 * @see JsGlobal.String.Prototype.Member#slice
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid slice             = id("slice"            );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.String.Prototype#split
				 * @see JsGlobal.String.Prototype.Member#split
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid split             = id("split"            );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.String.Prototype#substr
				 * @see JsGlobal.String.Prototype.Member#substr
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid substr            = id("substr"           );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.String.Prototype#substring
				 * @see JsGlobal.String.Prototype.Member#substring
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid substring         = id("substring"        );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.String.Prototype#toLowerCase
				 * @see JsGlobal.String.Prototype.Member#toLowerCase
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid toLowerCase       = id("toLowerCase"      );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.String.Prototype#toUpperCase
				 * @see JsGlobal.String.Prototype.Member#toUpperCase
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid toUpperCase       = id("toUpperCase"      );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.String.Prototype#toLocaleLowerCase
				 * @see JsGlobal.String.Prototype.Member#toLocaleLowerCase
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid toLocaleLowerCase = id("toLocaleLowerCase");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and 
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see JsGlobal.String.Prototype#toLocaleUpperCase
				 * @see JsGlobal.String.Prototype.Member#toLocaleUpperCase
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
				 */
				public final static Mid toLocaleUpperCase = id("toLocaleUpperCase");
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
				protected Member(JsObject.Member q, Mid mid) {
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
				protected Member(Mid mid) {
					super(mid);
				}
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
				@Override
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsString#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String>          valueOf           = new JsFunction.Member<java.lang.String>         (this, Members.valueOf          );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsString#charAt(Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String>          charAt            = new JsFunction.Member<java.lang.String>         (this, Members.charAt           );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsString#charCodeAt(Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Character>       charCodeAt        = new JsFunction.Member<java.lang.Character>      (this, Members.charCodeAt       , Generic.CHARACTER);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsString#concat(Object)
				 * @see JsString#concat(Vars)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String>          concat            = new JsFunction.Member<java.lang.String>         (this, Members.concat           );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsString#indexOf(Object)
				 * @see JsString#indexOf(Object, Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Integer>         indexOf           = new JsFunction.Member<java.lang.Integer>        (this, Members.indexOf          );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsString#lastIndexOf(Object)
				 * @see JsString#lastIndexOf(Object, Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Integer>         lastIndexOf       = new JsFunction.Member<java.lang.Integer>        (this, Members.lastIndexOf      );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsString#localeCompare(Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Integer>         localeCompare     = new JsFunction.Member<java.lang.Integer>        (this, Members.localeCompare    );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsString#match(RegExpLike)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsArray>                   match             = new JsFunction.Member<JsArray>                  (this, Members.match            );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsString#replace(RegExpLike, String)
				 * @see JsString#replace(RegExpLike, StringLike)
				 * @see JsString#replace(RegExpLike, JsFunction)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String>          replace           = new JsFunction.Member<java.lang.String>         (this, Members.replace          );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsString#search(RegExpLike)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.Integer>         search            = new JsFunction.Member<java.lang.Integer>        (this, Members.search           );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsString#slice(Object)
				 * @see JsString#slice(Object, Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String>          slice             = new JsFunction.Member<java.lang.String>         (this, Members.valueOf          );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsString#split(Object)
				 * @see JsString#split(Object, Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsArray>                   split             = new JsFunction.Member<JsArray>                  (this, Members.split            );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsString#substr(Object)
				 * @see JsString#substr(Object, Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String>          substr            = new JsFunction.Member<java.lang.String>         (this, Members.substr           );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsString#substring(Object)
				 * @see JsString#substring(Object, Object)
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String>          substring         = new JsFunction.Member<java.lang.String>         (this, Members.substring        );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsString#toLowerCase()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String>          toLowerCase       = new JsFunction.Member<java.lang.String>         (this, Members.toLowerCase      );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsString#toUpperCase()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String>          toUpperCase       = new JsFunction.Member<java.lang.String>         (this, Members.toUpperCase      );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsString#toLocaleLowerCase()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String>          toLocaleLowerCase = new JsFunction.Member<java.lang.String>         (this, Members.toLocaleLowerCase);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsString#toLocaleUpperCase()
				 * @javascript Re-compilers must resolve the member of this instance field to the 
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<java.lang.String>          toLocaleUpperCase = new JsFunction.Member<java.lang.String>         (this, Members.toLocaleUpperCase);
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
			 * @see JsString#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String>          valueOf           = new JsFunction.Member<java.lang.String>         (Members.valueOf          );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsString#charAt(Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String>          charAt            = new JsFunction.Member<java.lang.String>         (Members.charAt           );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsString#charCodeAt(Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Character>       charCodeAt        = new JsFunction.Member<java.lang.Character>      (Members.charCodeAt       , Generic.CHARACTER);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsString#concat(Object)
			 * @see JsString#concat(Vars)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String>          concat            = new JsFunction.Member<java.lang.String>         (Members.concat           );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsString#indexOf(Object)
			 * @see JsString#indexOf(Object, Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Integer>         indexOf           = new JsFunction.Member<java.lang.Integer>        (Members.indexOf          );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsString#lastIndexOf(Object)
			 * @see JsString#lastIndexOf(Object, Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Integer>         lastIndexOf       = new JsFunction.Member<java.lang.Integer>        (Members.lastIndexOf      );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsString#localeCompare(Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Integer>         localeCompare     = new JsFunction.Member<java.lang.Integer>        (Members.localeCompare    );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsString#match(RegExpLike)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsArray>                   match             = new JsFunction.Member<JsArray>                  (Members.match            );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsString#replace(RegExpLike, String)
			 * @see JsString#replace(RegExpLike, StringLike)
			 * @see JsString#replace(RegExpLike, JsFunction)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String>          replace           = new JsFunction.Member<java.lang.String>         (Members.replace          );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsString#search(RegExpLike)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.Integer>         search            = new JsFunction.Member<java.lang.Integer>        (Members.search           );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsString#slice(Object)
			 * @see JsString#slice(Object, Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String>          slice             = new JsFunction.Member<java.lang.String>         (Members.valueOf          );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsString#split(Object)
			 * @see JsString#split(Object, Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsArray>                   split             = new JsFunction.Member<JsArray>                  (Members.split            );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsString#substr(Object)
			 * @see JsString#substr(Object, Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String>          substr            = new JsFunction.Member<java.lang.String>         (Members.substr           );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsString#substring(Object)
			 * @see JsString#substring(Object, Object)
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String>          substring         = new JsFunction.Member<java.lang.String>         (Members.substring        );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsString#toLowerCase()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String>          toLowerCase       = new JsFunction.Member<java.lang.String>         (Members.toLowerCase      );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsString#toUpperCase()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String>          toUpperCase       = new JsFunction.Member<java.lang.String>         (Members.toUpperCase      );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsString#toLocaleLowerCase()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String>          toLocaleLowerCase = new JsFunction.Member<java.lang.String>         (Members.toLocaleLowerCase);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsString#toLocaleUpperCase()
			 * @javascript Re-compilers must resolve the member of this static field to the 
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<java.lang.String>          toLocaleUpperCase = new JsFunction.Member<java.lang.String>         (Members.toLocaleUpperCase);
		}
	}
}
