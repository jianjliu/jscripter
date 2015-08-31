
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
 * <p>An <b>opaque</b> class representing JavaScript function.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see JsGlobal.Function#create()
 * @see JsGlobal.Function#create(String)
 * @see JsGlobal.Function#create(String, String)
 * @see JsGlobal.Function#create(Vars, String)
 * @see js.Function
 * @see js.Js#function()
 * @see js.Js#function(String)
 * @see js.Js#function(String, String)
 * @see js.Js#function(Vars, String)
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsFunction<T> extends JsClass
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
		 * @see JsFunction#length
		 * @see Member#length
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid length    = id("length"   );
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
	public static class Member<T> extends JsClass.Member
	{
		private final Generic<?> rWrapper;

		/**
		 * <p>Internally constructs a member based on a qualifying member with a generic 
		 * wrapper.</p>
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
		 * @param rWrapper The generic wrapper
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
		 */
		public Member(JsObject.Member q, Mid mid, Generic<?> rWrapper) {
			super(q, mid);
			this.rWrapper = rWrapper;
		}
		/**
		 * <p>Internally constructs a member without a qualifying member but a generic 
		 * wrapper.</p>
		 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b> 
		 * or <b>internal</b> classes or class members.</p>
		 * <p>Note that, this constructor is <b>internal</b> but its declaring class is 
		 * <b>opaque</b>. This constructor is used to define <b>opaque</b> static fields, 
		 * declared in <b>opaque</b> types other than the declaring class of this constructor 
		 * itself and its subclasses. Under this circumstance, the field names must be 
		 * exactly same as the member names, as the <b>opaque</b> static fields of <b>opaque</b> 
		 * types are generally resolved by re-compilers directly to identifiers of their names.</p>
		 * @param mid The ID of the member to construct
		 * @param rWrapper The generic wrapper
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
		 */
		public Member(Mid mid, Generic<?> rWrapper) {
			super(mid);
			this.rWrapper = rWrapper;
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
		public JsFunction<T> with(ObjectLike o) {
			return new JsFunction<T>((JsObject)var(o).var(mid()), rWrapper);
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
		public JsFunction<T> with() {
			return with(Js.core());
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The <tt>length</tt> property of a function specifies the number of named 
		 * arguments declared when the function was defined. The function may actually 
		 * be invoked with more than or fewer than this number of arguments. Don't 
		 * confuse this property of a Function object with the <tt>length</tt> property 
		 * of the Arguments object (see {@link js.Function.Arguments#length()}), which 
		 * specifies the number of arguments actually passed to the function.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Integer.Member length = new Value.Integer.Member(this, Members.length);
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
	public static final JsFunction.Member<JsFunction<?>> constructor = new JsFunction.Member<JsFunction<?>>(Members.constructor, Generic.get(JsFunction.class));
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsFunction#valueOf()
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<JsFunction<?>> valueOf = new JsFunction.Member<JsFunction<?>>(Members.valueOf, Generic.get(JsFunction.class));
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The <tt>length</tt> property of a function specifies the number of named 
	 * arguments declared when the function was defined. The function may actually 
	 * be invoked with more than or fewer than this number of arguments. Don't 
	 * confuse this property of a Function object with the <tt>length</tt> property 
	 * of the Arguments object (see {@link js.Function.Arguments#length()}), which 
	 * specifies the number of arguments actually passed to the function.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final Value.Integer.Member length = new Value.Integer.Member(Members.length);

	/**
	 * <p>Internally constructs a function object.</p>
	 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
	 */
	protected JsFunction(Object var) {
		super((JsObject)var);
	}
	/**
	 * <p>Internally casts an <b>opaque</b> object to the current <b>opaque</b> type by 
	 * wrapping it with the wrapping constructor that uses a generic wrapper.</p>
	 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @param rWrapper The generic wrapper.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
	 */
	public JsFunction(JsObject var, Generic<?> rWrapper) {
		super(var(var, rWrapper));
	}
	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it 
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor, 
	 * that is, replacing it with its only argument.
	 */
	public JsFunction(JsObject var) {
		super(var(var, (JsFunction<T>)null));
	}

	/**
	 * <p>Simply returns the current boolean instance.</p>
	 * <p>This method is useful for JS Simulation to implement opaque types.</p>
	 * <p>If the current instance is a Java simulated array and the method runs in JS 
	 * Embed Simulation mode, the invocation creates and returns a JavaScript Array object 
	 * as a runtime copy of the current array.</p>
	 * @return The current boolean instance.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the instance invocation of this method, that is, 
	 * replacing it with its current instance.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public JsFunction<T> var() {
		return (JsFunction<T>)super.var();
	}
	/**
	 * <p>Assigns the value of another function instance to the current function object.</p>
	 * @param var The argument function instance.
	 * @return The new instance.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into 
	 * the JavaScript expression: 
	 * <pre>o = var</pre>
	 * where <tt>o</tt> is the current instance of the invocation of this method.
	 */
	@Override
	public final <S extends JsObject> S var(S var) {
		var(var, (Generic<S>)null);
		return var;
	}

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
	@Override
	public JsFunction<T> valueOf() {
		return var().valueOf();
	}

	/**
	 * <p>Construct an object with the current function instance.</p>
	 * @return The newly constructed object.
	 * @since 1.0
	 * @javascript Re-compilers must convert this instance invocation into the JavaScript expression: 
	 * <pre>new f()</pre>
	 * where <tt>f</tt> is the current function instance of the invocation of this method.
	 */
	public JsObject create() {
		return var().create();
	}
	/**
	 * <p>Constructs an object with the current function object, passing the specified 
	 * argument.</p>
	 * @param arg The argument value.
	 * @return The newly constructed object.
	 * @since 1.0
	 * @javascript Re-compilers must convert this instance invocation into the JavaScript expression: 
	 * <pre>new f(arg)</pre>
	 * where <tt>f</tt> is the current function instance of the invocation of this method.
	 */
	public JsObject create(Object arg) {
		return var().create(arg);
	}
	/**
	 * <p>Construct an object with the current function instance, passing the specified 
	 * arguments.</p>
	 * @param args The list of arguments.
	 * @return The newly constructed object.
	 * @since 1.0
	 * @javascript Re-compilers must convert this instance invocation into the JavaScript expression: 
	 * <pre>new f(args)</pre>
	 * where <tt>f</tt> is the current function instance of the invocation of this method 
	 * and <tt>args</tt> must be expanded into comma-separated arguments.
	 */
	public JsObject create(Vars<?> args) {
		return var().create(args);
	}
	/**
	 * <p>Invokes the current function instance.</p>
	 * @return The return value of the invocation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into 
	 * the JavaScript expression: 
	 * <pre>f()</pre>
	 * where <tt>f</tt> is the current function instance of the invocation of this method.
	 */
	public T invoke() {
		return var().invoke();
	}
	/**
	 * <p>Invokes the current function instance, passing the specified argument.</p>
	 * @param arg The argument value.
	 * @return The return value of the invocation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into 
	 * the JavaScript expression: 
	 * <pre>f(arg)</pre>
	 * where <tt>f</tt> is the current function instance of the invocation of this method.
	 */
	public T invoke(Object arg) {
		return var().invoke(arg);
	}
	/**
	 * <p>Invokes the current function instance, passing the specified arguments.</p>
	 * @param args The list of arguments.
	 * @return The return value of the invocation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into 
	 * the JavaScript expression: 
	 * <pre>f(args)</pre>
	 * where <tt>f</tt> is the current function instance of the invocation of this method 
	 * and <tt>args</tt> must be expanded into comma-separated arguments.
	 */
	public T invoke(Vars<?> args) {
		return var().invoke(args);
	}
	/**
	 * <p>Invokes the current function instance as a method of a specified scope object.</p>
	 * @param thisobj The scope object.
	 * @return The return value of the invocation.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked with a scope object that is not a function. See {@link Js#err(Object)} 
	 * and {@link js.core.JsTypeError} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current instance without changing the method 
	 * name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public T call(Object thisobj) {
		return var().call(thisobj);
	}
	/**
	 * <p>Invokes the current function instance as a method of a specified scope object, 
	 * passing the specified argument.</p>
	 * @param thisobj The scope object.
	 * @param arg The argument value.
	 * @return The return value of the invocation.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked with a scope object that is not a function. See {@link Js#err(Object)} 
	 * and {@link js.core.JsTypeError} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current instance without changing the method 
	 * name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public T call(Object thisobj, Object arg) {
		return var().call(thisobj, arg);
	}
	/**
	 * <p>Invokes the current function instance as a method of a specified scope object, 
	 * passing the specified arguments.</p>
	 * @param thisobj The scope object.
	 * @param args The list of arguments.
	 * @return The return value of the invocation.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked with a scope object that is not a function. See {@link Js#err(Object)} 
	 * and {@link js.core.JsTypeError} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current instance without changing the method 
	 * name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public T call(Object thisobj, Vars<?> args) {
		return var().call(thisobj, args);
	}
	/**
	 * <p>Invokes the current function instance as a method of a specified scope object.</p>
	 * @param thisobj The scope object.
	 * @return The return value of the invocation.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked with a scope object that is not a function. See {@link Js#err(Object)} 
	 * and {@link js.core.JsTypeError} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current instance without changing the method 
	 * name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public T apply(Object thisobj) {
		return var().apply(thisobj);
	}
	/**
	 * <p>Invokes the current function instance as a method of a specified scope object, 
	 * passing the specified array of arguments.</p>
	 * @param thisobj The scope object.
	 * @param args The array of arguments.
	 * @return The return value of the invocation.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked with a scope object that is not a function or if this method is invoked 
	 * with an argument that is not an array or {@link js.Function.Arguments} object. See 
	 * {@link Js#err(Object)} and {@link js.core.JsTypeError} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current instance without changing the method 
	 * name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public T apply(Object thisobj, Object args) {
		return var().apply(thisobj, args);
	}

	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p && other</pre>
	 * where <tt>p</tt> is the current function instance of the invocation of this method.
	 */
	public final JsFunction<T> and(JsFunction<T> other) {
		return Js.and(this, other);
	}

	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p || other</pre>
	 * where <tt>p</tt> is the current function instance of the invocation of this method.
	 */
	public final JsFunction<T> or(JsFunction<T> other) {
		return Js.or(this, other);
	}

	/**
	 * <p>Conditional operation, resembling the ternary operator of JavaScript, returns the 
	 * second operand if the first operand evaluates to <tt>true</tt>; Returns the third 
	 * operand, otherwise.</p>
	 * <p>The first operand of the conditional operation must be (or be convertible to) a 
	 * boolean value. Usually this is the result of a comparison operation. The second and 
	 * third operands may have any value. The value returned by the conditional operation 
	 * depends on the boolean value of the first operand. If that operand is <tt>true</tt>, 
	 * the value of the conditional expression is the value of the second operand. If the 
	 * first operand is <tt>false</tt>, the value of the conditional expression is the 
	 * value of the third operand.</p>
	 * <p>To make the second and third operands really late-evaluated or not evaluated in 
	 * JS Simulation mode, resembling what happens in JavaScript, you may have to extend 
	 * {@link Var} anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the conditional operator of the 
	 * Java language like this:
	 * <pre>Js.be(test) ? var : other</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param other A value or object.
	 * @return The second operand if the first operand evaluates to <tt>true</tt>; Otherwise, 
	 * the third operand.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>test ? p : other</pre>
	 * where <tt>p</tt> is the current function instance of the invocation of this method.
	 */
	public final JsFunction<T> cond(Object test, JsFunction<T> other) {
		return Js.cond(test, this, other);
	}
}
