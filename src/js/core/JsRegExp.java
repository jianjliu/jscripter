
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

import js.ArrayLike;
import js.Js;
import js.ObjectLike;
import js.RegExpLike;
import js.StringLike;
import js.Value;
import js.Vars;

/**
 * <p>An <b>opaque</b> class representing JavaScript regular expression objects.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see Js#re(String)
 * @see Js#re(String, String)
 * @see js.core.JsGlobal.RegExp#create(Object, Object)
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsRegExp extends JsGlobal.RegExp.Prototype implements RegExpLike
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
	protected static abstract class Members extends JsGlobal.RegExp.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsRegExp#global
		 * @see Member#global
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid global     = id("global"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsRegExp#ignoreCase
		 * @see Member#ignoreCase
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid ignoreCase = id("ignoreCase");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsRegExp#multiline
		 * @see Member#multiline
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid multiline  = id("multiline" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsRegExp#lastIndex
		 * @see Member#lastIndex
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid lastIndex  = id("lastIndex" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsRegExp#source
		 * @see Member#source
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid source     = id("source"    );
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
	public static class Member extends JsGlobal.RegExp.Prototype.Member
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
		public JsRegExp with(ObjectLike o) {
			return new JsRegExp(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The <tt>constructor</tt> property of an object is a reference to the function 
		 * that was the constructor for that object.</p>
		 * <p>A common use of the <tt>constructor</tt> property is to determine the type of unknown 
		 * objects. Given an unknown value, you can use the {@link js.Js#typeof(Object)} operation 
		 * to determine whether it is a primitive value or an object. If it is an object, you can 
		 * use the <tt>constructor</tt> property to determine what type of object it is.</p>
		 * <p>Note, however, that while this technique works for the objects built into core 
		 * JavaScript, it is not guaranteed to work with host objects such as the <tt>window</tt> 
		 * object of client-side JavaScript. The default implementation of the <tt>toString()</tt> 
		 * method provides another way to determine the type of an unknown object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<JsRegExp> constructor = new JsFunction.Member<JsRegExp>(this, Members.constructor, Generic.get(JsRegExp.class));
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsRegExp#global()
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member global     = new Value.Boolean.Member(this, Members.global    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsRegExp#ignoreCase()
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member ignoreCase = new Value.Boolean.Member(this, Members.ignoreCase);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsRegExp#multiline()
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member multiline  = new Value.Boolean.Member(this, Members.multiline );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsRegExp#lastIndex()
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Integer.Member lastIndex  = new Value.Integer.Member(this, Members.lastIndex );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsRegExp#source()
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String .Member source     = new Value.String .Member(this, Members.source    );
	}

	/**
	 * <p>Internally constructs a regular expression object.</p>
	 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
	 */
	protected JsRegExp(Object var) {
		super((JsObject)var);
	}
	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it 
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor, 
	 * that is, replacing it with its only argument.
	 */
	public JsRegExp(JsObject var) {
		super(var(var, (JsRegExp)null));
	}
	/**
	 * <p>Constructs a regular expression object with the specified pattern.</p>
	 * @param regex A string that specifies the pattern of the regular expression.
	 * @throws RuntimeException JavaScript throws a <tt>SyntaxError</tt> If <tt>regex</tt> 
	 * is not a legal regular expression. See {@link Js#err(Object)} and {@link js.core.JsSyntaxError} 
	 * for JS Simulation.
	 * @see #JsRegExp(String, String)
	 * @see js.Js#re(String)
	 * @see js.core.JsGlobal.RegExp#create(Object)
	 * @see js.core.JsGlobal.RegExp#create(Vars)
	 * @see js.core.JsGlobal.RegExp#invoke(Object)
	 * @see js.core.JsGlobal.RegExp#invoke(Vars)
	 * @since 1.0
	 * @javascript Re-compilers must replace the construction operation of this constructor 
	 * with the JavaScript expression:
	 * <pre>new RegExp(regex)</pre>
	 */
	public JsRegExp(String regex) {
		this(JsGlobal.RegExp.with().create(regex));
	}
	/**
	 * <p>Constructs a regular expression object with the specified pattern and flags.</p>
	 * @param regex A string that specifies the pattern of the regular expression.
	 * @param flags An optional string containing any of the "g", "i", and "m" attributes 
	 * that specify global, case-insensitive, and multiline matches, respectively. The "m" 
	 * attribute is not available prior to ECMAScript standardization.
	 * @throws RuntimeException JavaScript throws a <tt>SyntaxError</tt> If <tt>regex</tt> 
	 * is not a legal regular expression, or if <tt>flags</tt> contains characters other than 
	 * "g", "i", and "m". See {@link Js#err(Object)} and {@link js.core.JsSyntaxError} for 
	 * JS Simulation.
	 * @see #JsRegExp(String)
	 * @see js.Js#re(String, String)
	 * @see js.core.JsGlobal.RegExp#create(Object, Object)
	 * @see js.core.JsGlobal.RegExp#create(Vars)
	 * @see js.core.JsGlobal.RegExp#invoke(Object, Object)
	 * @see js.core.JsGlobal.RegExp#invoke(Vars)
	 * @since 1.0
	 * @javascript Re-compilers must replace the construction operation of this constructor 
	 * with the JavaScript expression:
	 * <pre>new RegExp(regex, flags)</pre>
	 */
	public JsRegExp(String regex, String flags) {
		this(JsGlobal.RegExp.with().create(regex, flags));
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The <tt>constructor</tt> property of an object is a reference to the function 
	 * that was the constructor for that object.</p>
	 * <p>A common use of the <tt>constructor</tt> property is to determine the type of unknown 
	 * objects. Given an unknown value, you can use the {@link js.Js#typeof(Object)} operation 
	 * to determine whether it is a primitive value or an object. If it is an object, you can 
	 * use the <tt>constructor</tt> property to determine what type of object it is.</p>
	 * <p>Note, however, that while this technique works for the objects built into core 
	 * JavaScript, it is not guaranteed to work with host objects such as the <tt>window</tt> 
	 * object of client-side JavaScript. The default implementation of the <tt>toString()</tt> 
	 * method provides another way to determine the type of an unknown object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<JsRegExp> constructor = new JsFunction.Member<JsRegExp>(Members.constructor, Generic.get(JsRegExp.class));
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @see JsRegExp#global()
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member global     = new Value.Boolean.Member(Members.global    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsRegExp#ignoreCase()
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member ignoreCase = new Value.Boolean.Member(Members.ignoreCase);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsRegExp#multiline()
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member multiline  = new Value.Boolean.Member(Members.multiline );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsRegExp#lastIndex()
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final Value.Integer.Member lastIndex  = new Value.Integer.Member(Members.lastIndex );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsRegExp#source()
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final Value.String .Member source     = new Value.String .Member(Members.source    );

	/**
	 * <p>Gets the <tt>global</tt> field of the current regular expression instance.</p>
	 * <p>The <tt>global</tt> field is a read-only boolean property of regular expression
	 * instances. It specifies whether a particular regular expression performs global matching, 
	 * that is, whether it was created with the "g" attribute.</p>
	 * @return The value of the <tt>global</tt> field of the regular expression.
	 * @see Js#re(String, String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>re.global</pre>
	 * where <tt>re</tt> is the current regular expression instance of the invocation.
	 */
	public final boolean global() {
		return Js.be(global.with(this));
	}
	/**
	 * <p>Gets the <tt>ignoreCase</tt> field of the current regular expression instance.</p>
	 * <p>The <tt>ignoreCase</tt> field is a read-only boolean property of regular expression 
	 * instances. It specifies whether a particular regular expression performs case-insensitive 
	 * matching, that is, whether it was created with the "i" attribute.</p>
	 * @return The value of the <tt>ignoreCase</tt> field of the regular expression.
	 * @see Js#re(String, String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>re.ignoreCase</pre>
	 * where <tt>re</tt> is the current regular expression instance of the invocation.
	 */
	public final boolean ignoreCase() {
		return Js.be(ignoreCase.with(this));
	}
	/**
	 * <p>Gets the <tt>multiline</tt> field of the current regular expression instance.</p>
	 * <p>The <tt>multiline</tt> field is a read-only boolean property of regular expression 
	 * instances. It specifies whether a particular regular expression performs multiline 
	 * matching, that is, whether it was created with the "m" attribute.</p>
	 * @return The value of the <tt>multiline</tt> field of the regular expression.
	 * @see Js#re(String, String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>re.multiline</pre>
	 * where <tt>re</tt> is the current regular expression instance of the invocation.
	 */
	public final boolean multiline() {
		return Js.be(multiline.with(this));
	}
	/**
	 * <p>Gets the <tt>lastIndex</tt> field of the current regular expression instance.</p>
	 * <p>The <tt>lastIndex</tt> field is a read/write property of regular expression 
	 * instances. For regular expressions with the "g" attribute set, it contains an 
	 * integer that specifies the character position immediately following the last match 
	 * found by the {@link #exec(Object)} and {@link #test(Object)} methods. These methods 
	 * use this property as the starting point for the next search they conduct. This 
	 * allows you to call those methods repeatedly, to loop through all matches in a 
	 * string. Note that <tt>lastIndex</tt> is not used by regular expressions that do 
	 * not have the "g" attribute set and do not represent global patterns.</p>
	 * <p>This property is read/write, so you can set it at any time to specify where in the 
	 * target string the next search should begin. {@link #exec(Object)} and {@link #test(Object)} 
	 * automatically reset <tt>lastIndex</tt> to 0 when they fail to find a match 
	 * (or another match). If you begin to search a new string after a successful match 
	 * of some other string, you have to explicitly set this property to 0.</p>
	 * @return The value of the <tt>lastIndex</tt> field of the regular expression.
	 * @see #lastIndex(Integer)
	 * @see #exec(Object)
	 * @see #test(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>re.lastIndex</pre>
	 * where <tt>re</tt> is the current regular expression instance of the invocation.
	 */
	public final Integer lastIndex() {
		return lastIndex.with(this);
	}
	/**
	 * <p>Sets the <tt>lastIndex</tt> field of the current regular expression instance.</p>
	 * <p>The <tt>lastIndex</tt> field is a read/write property of regular expression 
	 * instances. For regular expressions with the "g" attribute set, it contains an 
	 * integer that specifies the character position immediately following the last match 
	 * found by the {@link #exec(Object)} and {@link #test(Object)} methods. These methods 
	 * use this property as the starting point for the next search they conduct. This 
	 * allows you to call those methods repeatedly, to loop through all matches in a 
	 * string. Note that <tt>lastIndex</tt> is not used by regular expressions that do 
	 * not have the "g" attribute set and do not represent global patterns.</p>
	 * <p>This property is read/write, so you can set it at any time to specify where in the 
	 * target string the next search should begin. {@link #exec(Object)} and {@link #test(Object)} 
	 * automatically reset <tt>lastIndex</tt> to 0 when they fail to find a match 
	 * (or another match). If you begin to search a new string after a successful match 
	 * of some other string, you have to explicitly set this property to 0.</p>
	 * @return The new value of the <tt>lastIndex</tt>.
	 * @see #lastIndex()
	 * @see #exec(Object)
	 * @see #test(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>(re.lastIndex=lastIndex)</pre>
	 * where <tt>re</tt> is the current regular expression instance of the invocation.
	 */
	public final Integer lastIndex(Integer lastIndex) {
		return var(JsRegExp.lastIndex, lastIndex);
	}
	/**
	 * <p>Gets the <tt>source</tt> field of the current regular expression instance.</p>
	 * <p>The <tt>source</tt> field is a read-only string property of regular expression 
	 * instances. It contains the text of the regular expression. This text does not include 
	 * the delimiting slashes used in regular-expression literals, and it does not include 
	 * the "g", "i", and "m" attributes.</p>
	 * @return The source text of the regular expression.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>re.source</pre>
	 * where <tt>re</tt> is the current regular expression instance of the invocation.
	 */
	public final String source() {
		return source.with(this);
	}
	/**
	 * <p>Performs powerful, general-purpose pattern matching with the current regular expression instance.</p>
	 * <p>This method is the most powerful of all the regular expression and string 
	 * pattern-matching methods. It is a general-purpose method that is somewhat more 
	 * complex to use than {@link #test(Object)}, {@link StringLike#search(RegExpLike)}, 
	 * {@link StringLike#replace(RegExpLike, String)}, and {@link StringLike#match(RegExpLike)}.</p>
	 * <p>This invocation searches string for text that matches the current regular expression. 
	 * If it finds a match, it returns an array of results; otherwise, it returns 
	 * <tt>null</tt>. Element 0 of the returned array is the matched text. Element 1 is 
	 * the text that matched the first parenthesized subexpression, if any, within the current 
	 * regular expression. Element 2 contains the text that matched the second subexpression, 
	 * and so on. The array length property specifies the number of elements in the array, 
	 * as usual. In addition to the array elements and the length property, the value 
	 * returned by the invocation also has two other properties. The <tt>index</tt> 
	 * property (see {@link ArrayLike#index()}) specifies the character position of the first 
	 * character of the matched text. The <tt>input</tt> property (see {@link ArrayLike#input()}) 
	 * refers to <tt>s</tt>. This returned array is the same as the array that is 
	 * returned by the {@link StringLike#match(RegExpLike)} method, when invoked on a 
	 * non-global regular expression instance.</p>
	 * <p>When this method is invoked on a non-global pattern, it performs the search and 
	 * returns the result described earlier. When the current instance is a global regular 
	 * expression, however, the invocation behaves in a slightly more complex way. It begins 
	 * searching string at the character position specified by the <tt>lastIndex</tt> 
	 * property (see {@link #lastIndex()} and {@link #lastIndex(Integer)}) of the current 
	 * regular expression. When it finds a match, it sets <tt>lastIndex</tt> to the 
	 * position of the first character after the match. This means that you can invoke 
	 * this method repeatedly in order to loop through all matches in a string. When 
	 * the invocation cannot find any more matches, it returns <tt>null</tt> and 
	 * resets <tt>lastIndex</tt> to zero. If you begin searching a new string 
	 * immediately after successfully finding a match in another string, you must be 
	 * careful to manually reset <tt>lastIndex</tt> to zero.</p>
	 * <p>Note that this invocation always includes full details of every match in the 
	 * array it returns, whether or not the current regular expression is a global pattern. 
	 * This is where this method differs from {@link StringLike#match(RegExpLike)}, which 
	 * returns much less information when used with global patterns. Calling this method 
	 * repeatedly in a loop is the only way to obtain complete pattern-matching 
	 * information for a global pattern.</p>
	 * @param s The string to be tested.
	 * @return An array containing the results of the match or undefined 
	 * <tt>null</tt> if no match was found.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked with an instance that is not a regular expression. See {@link Js#err(Object)} 
	 * and {@link js.core.JsTypeError} for JS Simulation.
	 * @see #lastIndex()
	 * @see #lastIndex(Integer)
	 * @see #test(Object)
	 * @see StringLike#match(RegExpLike)
	 * @see StringLike#replace(RegExpLike, String)
	 * @see StringLike#replace(RegExpLike, StringLike)
	 * @see StringLike#replace(RegExpLike, js.core.JsFunction)
	 * @see StringLike#search(RegExpLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current regular expression instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsArray exec(Object s) {
		return new JsArray(call(exec, s));
	}
	/**
	 * <p>Tests whether a string contains the pattern represented by the current regular 
	 * expression.</p>
	 * <p></p>
	 * @param s The string to be tested.
	 * @return <tt>true</tt> if <tt>s</tt> contains text that matches the current 
	 * regular expression; false otherwise.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked with an instance that is not a regular expression. See {@link Js#err(Object)} 
	 * and {@link js.core.JsTypeError} for JS Simulation.
	 * @see #exec(Object)
	 * @see #lastIndex()
	 * @see #lastIndex(Integer)
	 * @see StringLike#match(RegExpLike)
	 * @see StringLike#replace(RegExpLike, String)
	 * @see StringLike#replace(RegExpLike, StringLike)
	 * @see StringLike#replace(RegExpLike, js.core.JsFunction)
	 * @see StringLike#search(RegExpLike)
	 * @see StringLike#substring(Object)
	 * @see StringLike#substring(Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current regular expression instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final boolean test(Object s) {
		return call(test, s);
	}

	/**
	 * <p>Simply returns the current object instance.</p>
	 * <p>This method is useful for JS Simulation to implement opaque types.</p>
	 * @return The current regular expression instance.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the instance invocation of this method, that is, 
	 * replacing it with its current instance.
	 */
	@Override
	public JsRegExp var() {
		return (JsRegExp)super.var();
	}
	/**
	 * <p>Assigns the value of another object instance to the current object.</p>
	 * @param var The argument object instance.
	 * @return The new instance.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into 
	 * the JavaScript expression: 
	 * <pre>o = var</pre>
	 * where <tt>o</tt> is the current instance of the invocation of this method.
	 */
	@Override
	public final <S extends JsObject> S var(S var) {
		var(var, (JsRegExp)null);
		return var;
	}
	/**
	 * <p>Returns the primitive value associated with the current instance, if there is one. 
	 * This invocation simply returns the instance itself for the current instance is an 
	 * object and there is no primitive value for it.</p>
	 * @return The current regular expression itself.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current regular expression instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	@Override
	public JsRegExp valueOf() {
		return new JsRegExp((JsObject)var().valueOf());
	}
}
