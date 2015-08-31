
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
 * <p>An <b>opaque</b> class representing JavaScript objects.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see js.core.JsGlobal.Number#create(Object)
 * @see jsx.core.NumberLikes
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsObject extends Var<JsObject> implements ObjectLike
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
	protected static abstract class Members extends Var.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see js.Js#undefined(Object)
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid undefined   = id("undefined"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsObject#constructor
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid constructor = id("constructor");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsObject#valueOf
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid valueOf     = id("valueOf"    );

		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsObject#hasOwnProperty
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid hasOwnProperty       = id("hasOwnProperty"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsObject#isPrototypeOf
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid isPrototypeOf        = id("isPrototypeOf"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsObject#propertyIsEnumerable
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid propertyIsEnumerable = id("propertyIsEnumerable");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsObject#toString
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid toString             = id("toString"            );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsObject#toSource
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid toSource             = id("toSource"            );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsObject#toLocaleString
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid toLocaleString       = id("toLocaleString"      );
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
	public static class Member extends Var.Member<Object>
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
		public Member(Member q, Mid mid) {
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
			this(null, mid);
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
		public JsObject with(ObjectLike o) {
			return (JsObject)var(o).var(mid());
		}
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
	public final static JsFunction.Member<JsObject> constructor = new JsFunction.Member<JsObject>(Members.constructor);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsObject#valueOf()
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public final static JsFunction.Member<JsObject> valueOf = new JsFunction.Member<JsObject>(Members.valueOf);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsObject#hasOwnProperty(Object)
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public final static JsFunction.Member<Boolean> hasOwnProperty       = new JsFunction.Member<Boolean>(Members.hasOwnProperty      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsObject#isPrototypeOf(Object)
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public final static JsFunction.Member<Boolean> isPrototypeOf        = new JsFunction.Member<Boolean>(Members.isPrototypeOf       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsObject#propertyIsEnumerable(Object)
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public final static JsFunction.Member<Boolean> propertyIsEnumerable = new JsFunction.Member<Boolean>(Members.propertyIsEnumerable);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsObject#toString()
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public final static JsFunction.Member<String>  toString       = new JsFunction.Member<String> (Members.toString      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public final static JsFunction.Member<String>  toSource       = new JsFunction.Member<String> (Members.toSource      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsObject#toLocaleString()
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public final static JsFunction.Member<String>  toLocaleString = new JsFunction.Member<String> (Members.toLocaleString);

	/**
	 * <p>An <b>internal</b> instance field keeping the actual object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
	 */
	protected Object var;

	/**
	 * <p>Internally constructs an object.</p>
	 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
	 */
	protected JsObject(Object var) {
		this.var = var;
	}
	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it 
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor, 
	 * that is, replacing it with its only argument.
	 */
	public JsObject(JsObject var) {
		this.var = var != null ? var.var() : var;
	}
	/**
	 * <p>Constructs a new object.</p>
	 * @see #JsObject(JsObject)
	 * @see js.Js#object()
	 * @see js.Initializer#var()
	 * @see js.core.JsGlobal.Object#create()
	 * @see js.core.JsGlobal.Object#invoke()
	 * @since 1.0
	 * @javascript Re-compilers must replace the construction operation of this constructor 
	 * with the JavaScript expression:
	 * <pre>new Object()</pre>
	 */
	public JsObject() {
		this(JsGlobal.Object.with().invoke());
	}

	/**
	 * <p>Simply returns the current object instance.</p>
	 * <p>This method is useful for JS Simulation to implement opaque types.</p>
	 * @return The current number instance.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the instance invocation of this method, that is, 
	 * replacing it with its current instance.
	 */
	@Override
	public JsObject var() {
		return var == null ? null : ((JsObject)var).var();
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
	public <T extends JsObject> T var(T var) {
		this.var = var != null ? var.var() : var;
		return var;
	}

	/**
	 * <p>Converts the current object instance to a string.</p>
	 * @return A string representing the current object instance.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	@Override
	public String toString() {
		return Js.toString(var());
	}

	/**
	 * <p>Internally calls a function member on the current object instance.</p>
	 * <p>This method is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * @param member A member of function.
	 * @return The value returned from the invocation of the function.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	protected <T> T call(JsFunction.Member<T> member) {
		return var().call(member);
	}
	/**
	 * <p>Internally calls a function member on the current object instance, passing an 
	 * argument.</p>
	 * <p>This method is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * @param member A member of function.
	 * @param arg An argument being passed to the function to call.
	 * @return The value returned from the invocation of the function.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	protected <T> T call(JsFunction.Member<T> member, Object arg) {
		return var().call(member, arg);
	}
	/**
	 * <p>Internally calls a function member on the current object instance, passing arguments.</p>
	 * <p>This method is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * @param member A member of function.
	 * @param args The arguments being passed to the function to call.
	 * @return The value returned from the invocation of the function.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	protected <T> T call(JsFunction.Member<T> member, Vars<?> args) {
		return var().call(member, args);
	}

	/**
	 * <p>Checks whether the current object instance has a locally defined (non-inherited) 
	 * property with a specified name.</p>
	 * <p>JavaScript objects may have properties of their own, and they may also inherit 
	 * properties from their prototype object. This method provides a way to distinguish 
	 * between inherited properties and non-inherited local properties</p>
	 * @param propname A string that contains the name of a property of the current 
	 * object instance.
	 * @return <tt>true</tt> if the current object instance has a non-inherited 
	 * property with the name specified by <tt>propname</tt>; <tt>false</tt> if 
	 * the object does not have a property with the specified name or if it inherits that 
	 * property from its prototype object.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Boolean hasOwnProperty(Object propname) {
		return call(hasOwnProperty, propname);
	}
	/**
	 * <p>Checks whether the current object instance is the prototype object of a 
	 * specified object.</p>
	 * <p>This method provides a way to determine if one Object object is the prototype 
	 * of another</p>
	 * <p>In JavaScript, Object objects inherit properties from their prototype object. 
	 * The prototype of an Object object is referred to by the prototype property of the 
	 * constructor function that creates and initializes the object.</p>
	 * <p>Not that, in JS Embed Simulation mode, this method always returns <tt>false</tt> 
	 * on a simulated object instance of {@link ObjectLike}, unless the instance is 
	 * converted to a JavaScript object by {@link ObjectLike#var()}.</p>
	 * @param other Any object.
	 * @return <tt>true</tt> if the current object instance is the prototype of 
	 * <tt>other</tt>; <tt>false</tt> if <tt>other</tt> is not an Object 
	 * object or if the current object instance is not the prototype of <tt>other</tt>.
	 * @see js.core.JsObject.Members#constructor
	 * @see js.core.JsFunction.Members#prototype
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Boolean isPrototypeOf(Object other) {
		return call(isPrototypeOf, other);
	}
	/**
	 * <p>Checks whether a named property exists and would be enumerable in JavaScript.</p>
	 * @param propname A string that contains the name of a property of the current 
	 * object instance.
	 * @return <tt>true</tt> if the current object instance has a non-inherited 
	 * property with the name specified by <tt>propname</tt> and if that property is 
	 * enumerable, which means that it would be enumerated by a for/in loop on the current 
	 * object instance in JavaScript.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Boolean propertyIsEnumerable(Object propname) {
		return call(propertyIsEnumerable, propname);
	}
	/**
	 * <p>Converts the current object instance to a string, localized as appropriate 
	 * for the current locale.</p>
	 * @return A string representing the current object instance, localized as 
	 * appropriate for the current locale.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String toLocaleString() {
		return call(toLocaleString);
	}

	/**
	 * <p>Checks if the current variable instance is undefined.</p>
	 * @return <tt>true</tt> if the current instance is undefined; <tt>false</tt> otherwise.
	 * @see #valueOf()
	 * @see #undefined()
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>(v === undefined)</pre>
	 * where <tt>v</tt> is the current variable instance of the invocation.
	 */
	@Override
	public boolean undefined() {
		return var() == null || var().undefined();
	}

	/**
	 * <p>Undefines the current object instance.</p>
	 * @return <tt>true</tt> if the deletion is successful; Otherwise, <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>delete p</pre>
	 * where <tt>p</tt> is the current object instance of the invocation of this method.
	 */
	public boolean delete() {
		return var().delete();
	}
	/**
	 * <p>Deletes a property of the current object instance by its ID.</p>
	 * @param id The ID of the property to delete.
	 * @return <tt>true</tt> if the deletion is successful, <tt>false</tt> otherwise.
	 * @see #delete(String)
	 * @see #delete(js.Var.Member)
	 * @see #delete(js.Var.Mid)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>delete o.id</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>id</tt> 
	 * must be resolved to a globally unique numerical property identifier at re-compile 
	 * time.
	 */
	public boolean delete(Id<?> id) {
		return var().delete(id);
	}
	/**
	 * <p>Deletes a property of the current object instance by its member ID.</p>
	 * @param mid Member ID of the property to delete.
	 * @return <tt>true</tt> if the deletion is successful, <tt>false</tt> otherwise.
	 * @see #delete(Id)
	 * @see #delete(String)
	 * @see #delete(js.Var.Member)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>delete o.mid</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>mid</tt> 
	 * must be resolved to the property identifier at re-compile time.
	 */
	public boolean delete(Mid mid) {
		return var().delete(mid);
	}
	/**
	 * <p>Deletes a property of the current object instance by its opaque member.</p>
	 * @param m The opaque member of the property to delete.
	 * @return <tt>true</tt> if the deletion is successful, <tt>false</tt> otherwise.
	 * @see #delete(Id)
	 * @see #delete(js.Var.Mid)
	 * @see #delete(String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>delete o.m</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>m</tt> 
	 * must be resolved to the property identifier at re-compile time.
	 */
	public final boolean delete(Var.Member<?> m) {
		return delete(m.mid());
	}
	/**
	 * <p>Deletes a property of the current object instance by its name.</p>
	 * @param name The name of the property to delete.
	 * @return <tt>true</tt> if the deletion is successful, <tt>false</tt> otherwise.
	 * @see #delete(Id)
	 * @see #delete(js.Var.Mid)
	 * @see #delete(js.Var.Member)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>delete o[name]</pre>
	 * where <tt>o</tt> is the current object instance of the invocation.
	 */
	public final boolean delete(String name) {
		return delete(Members.id(name));
	}

	/**
	 * <p>Gets a property of the current object instance by its ID.</p>
	 * @param id The ID of the property to get.
	 * @return The property of the current object instance specified by its ID.
	 * @see #var(js.Var.Mid)
	 * @see #var(js.Var.Member)
	 * @see #var(String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.id</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>id</tt> 
	 * must be resolved to a globally unique numerical property identifier at re-compile 
	 * time.
	 */
	public <T> T var(Id<T> id) {
		return var().var(id);
	}
	/**
	 * <p>Gets a property of the current object instance by its member ID.</p>
	 * @param mid The member ID of the property to get
	 * @return The property of the current object instance specified by its member ID.
	 * @see #var(Id)
	 * @see #var(js.Var.Member)
	 * @see #var(String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.mid</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>mid</tt> 
	 * must be resolved to the property identifier at re-compile time.
	 */
	public Object var(Mid mid) {
		return var().var(mid);
	}
	/**
	 * <p>Sets a value to the property of the current object instance by its ID.</p>
	 * @param id The ID of the property to set the <tt>value</tt>.
	 * @return The property of the current object instance specified by its ID.
	 * @param value The new value to be set.
	 * @see #var(js.Var.Mid, Object)
	 * @see #var(js.Var.Member, Object)
	 * @see #var(String, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.id = value</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>id</tt> 
	 * must be resolved to a globally unique numerical property identifier at re-compile 
	 * time.
	 */
	public <T> T var(Id<T> id, T value) {
		return var().var(id, value);
	}
	/**
	 * <p>Sets a value to the property of the current object instance by its member ID.</p>
	 * @param mid The member ID of the property to set the <tt>value</tt>.
	 * @param value The new value to be set.
	 * @return The property of the current object instance specified by its member ID.
	 * @see #var(Id, Object)
	 * @see #var(js.Var.Member, Object)
	 * @see #var(String, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.mid = value</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>mid</tt> 
	 * must be resolved to the property identifier at re-compile time.
	 */
	public <T> T var(Mid mid, T value) {
		return var().var(mid, value);
	}
	/**
	 * <p>Gets a property of the current object instance by its opaque member.</p>
	 * @param m The opaque member of the property to get.
	 * @return The property of the current object instance specified by its opaque member.
	 * @see #var(Id)
	 * @see #var(js.Var.Mid)
	 * @see #var(String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.m</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>m</tt> 
	 * must be resolved to the property identifier at re-compile time.
	 */
	public final <T> T var(Var.Member<T> m) {
		return m.with(this);
	}
	/**
	 * <p>Gets a property of the current object instance by its opaque member.</p>
	 * @param m The opaque member of the property to get.
	 * @return The property of the current object instance specified by its opaque member.
	 * @see #var(Id)
	 * @see #var(js.Var.Mid)
	 * @see #var(String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.m</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>m</tt> 
	 * must be resolved to the property identifier at re-compile time.
	 */
	public final JsArray var(JsArray.Member m) {
		return m.with(this);
	}
	/**
	 * <p>Gets a property of the current object instance by its opaque member.</p>
	 * @param m The opaque member of the property to get.
	 * @return The property of the current object instance specified by its opaque member.
	 * @see #var(Id)
	 * @see #var(js.Var.Mid)
	 * @see #var(String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.m</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>m</tt> 
	 * must be resolved to the property identifier at re-compile time.
	 */
	public final JsBoolean var(JsBoolean.Member m) {
		return m.with(this);
	}
	/**
	 * <p>Gets a property of the current object instance by its opaque member.</p>
	 * @param m The opaque member of the property to get.
	 * @return The property of the current object instance specified by its opaque member.
	 * @see #var(Id)
	 * @see #var(js.Var.Mid)
	 * @see #var(String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.m</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>m</tt> 
	 * must be resolved to the property identifier at re-compile time.
	 */
	public final JsDate var(JsDate.Member m) {
		return m.with(this);
	}
	/**
	 * <p>Gets a property of the current object instance by its opaque member.</p>
	 * @param m The opaque member of the property to get.
	 * @return The property of the current object instance specified by its opaque member.
	 * @see #var(Id)
	 * @see #var(js.Var.Mid)
	 * @see #var(String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.m</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>m</tt> 
	 * must be resolved to the property identifier at re-compile time.
	 */
	public final <T> JsFunction<T> var(JsFunction.Member<T> m) {
		return m.with(this);
	}
	/**
	 * <p>Gets a property of the current object instance by its opaque member.</p>
	 * @param m The opaque member of the property to get.
	 * @return The property of the current object instance specified by its opaque member.
	 * @see #var(Id)
	 * @see #var(js.Var.Mid)
	 * @see #var(String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.m</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>m</tt> 
	 * must be resolved to the property identifier at re-compile time.
	 */
	public final JsNumber var(JsNumber.Member m) {
		return m.with(this);
	}
	/**
	 * <p>Gets a property of the current object instance by its opaque member.</p>
	 * @param m The opaque member of the property to get.
	 * @return The property of the current object instance specified by its opaque member.
	 * @see #var(Id)
	 * @see #var(js.Var.Mid)
	 * @see #var(String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.m</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>m</tt> 
	 * must be resolved to the property identifier at re-compile time.
	 */
	public final JsObject var(Member m) {
		return m.with(this);
	}
	/**
	 * <p>Gets a property of the current object instance by its opaque member.</p>
	 * @param m The opaque member of the property to get.
	 * @return The property of the current object instance specified by its opaque member.
	 * @see #var(Id)
	 * @see #var(js.Var.Mid)
	 * @see #var(String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.m</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>m</tt> 
	 * must be resolved to the property identifier at re-compile time.
	 */
	public final JsString var(JsString.Member m) {
		return m.with(this);
	}
	/**
	 * <p>Sets a value to the property of the current object instance by its opaque member.</p>
	 * @param m The opaque member of the property to set the <tt>value</tt>.
	 * @param value The new value to be set.
	 * @return The property of the current object instance specified by its opaque member.
	 * @see #var(Id, Object)
	 * @see #var(js.Var.Mid, Object)
	 * @see #var(String, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.m = value</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>m</tt> 
	 * must be resolved to the property identifier at re-compile time.
	 */
	public final <T> T var(Var.Member<T> m, T value) {
		return m.var(this).var(m.mid(), value);
	}
	/**
	 * <p>Gets a property of the current object instance by its name.</p>
	 * @param name The name of the property to get.
	 * @return The property of the current object instance specified by its name.
	 * @see #var(Id)
	 * @see #var(js.Var.Mid)
	 * @see #var(js.Var.Member)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o[name]</pre>
	 * where <tt>o</tt> is the current object instance of the invocation.
	 */
	public final Object var(String name) {
		return var(Members.id(name));
	}
	/**
	 * <p>Sets a value to the property of the current object instance by its name.</p>
	 * @param name The name of the property to set the <tt>value</tt>.
	 * @param value The new value to be set.
	 * @return The property of the current object instance specified by its name.
	 * @see #var(Id, Object)
	 * @see #var(js.Var.Mid, Object)
	 * @see #var(js.Var.Member, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o[name] = value</pre>
	 * where <tt>o</tt> is the current object instance of the invocation.
	 */
	public final <T> T var(String name, T value) {
		return var(Members.id(name), value);
	}
}
