
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

package js;

import js.core.*;

/**
 * <p>A <b>normal</b> class extended concretely to define a function object, resembling 
 * function definition in JavaScript.</p>
 * <p>Note that its enclosed classes and members except for {@link #function(Object, Call)} 
 * are all <b>opaque</b>. Its subclasses and their members must be <b>normal</b>.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */

public abstract class Function<T> extends Var<JsFunction<T>>
{
	/**
	 * <p>An <b>opaque</b> class used inside function definition resembling JavaScript 
	 * <tt>callee</tt> and <tt>caller</tt>.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 */
	protected static final class Call<T>
	{
		private final Function<T> var;
		/**
		 * <p>The <tt>arguments</tt> field of the current <tt>callee</tt> or 
		 * <tt>caller</tt> instance.</p>
		 * @since 1.0
		 * @javascript Re-compilers must convert the access of this instance field directly 
		 * into a JavaScript expression of the field access to its current instance 
		 * without changing the field name. 
		 */
		public final Arguments arguments;

		private Call(Function<T> var, Vars<?> args) {
			this.var = var;
			this.arguments = new Arguments(this, args);
		}

		/**
		 * <p>Returns the function instance.</p>
		 * @return The function instance.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the instance invocation of this method, that 
		 * is, replacing it with its current function instance.
		 */
		public final Function<T> var() {
			return var;
		}

		/**
		 * <p>Invokes the current function instance.</p>
		 * @return The return value of the invocation.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into 
		 * the JavaScript expression: 
		 * <pre>f()</pre>
		 * where <tt>f</tt> is the current instance of the invocation.
		 */
		public final T invoke() {
			return invoke(new Vars<Object>());
		}

		/**
		 * <p>Invokes the current function instance, passing the specified argument.</p>
		 * @param arg The argument value.
		 * @return The return value of the invocation.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into 
		 * the JavaScript expression: 
		 * <pre>f(arg)</pre>
		 * where <tt>f</tt> is the current instance of the invocation.
		 */
		public final T invoke(Object arg) {
			return invoke(new Vars<Object>().add(arg));
		}

		/**
		 * <p>Invokes the current function instance, passing the specified arguments.</p>
		 * @param args The list of arguments.
		 * @return The return value of the invocation.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into 
		 * the JavaScript expression: 
		 * <pre>f(args)</pre>
		 * where <tt>f</tt> is the current instance of this invocation and <tt>args</tt> 
		 * must be expanded into comma-separated arguments.
		 */
		public final T invoke(Vars<?> args) {
			return var.call(Js.core(), args);
		}

		/**
		 * <p>Invokes the current function instance as a method of a specified scope object.</p>
		 * @param thisobj The scope object.
		 * @return The return value of the invocation.
		 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
		 * is invoked with a scope object that is not a function. See {@link Js#err(Object)} 
		 * and {@link js.core.JsTypeError} for JS Simulation.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method 
		 * directly into a JavaScript invocation on its current instance without changing 
		 * the method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final T call(Object thisobj) {
			return call(thisobj, new Vars<Object>());
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
		 * @javascript Re-compilers must convert the instance invocation of this method 
		 * directly into a JavaScript invocation on its current instance without changing 
		 * the method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final T call(Object thisobj, Object arg) {
			return call(thisobj, new Vars<Object>().add(arg));
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
		 * @javascript Re-compilers must convert the instance invocation of this method 
		 * directly into a JavaScript invocation on its current instance without changing 
		 * the method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final T call(Object thisobj, Vars<?> args) {
			return var.call(thisobj, args);
		}

		/**
		 * <p>Invokes the current function instance as a method of a specified scope object.</p>
		 * @param thisobj The scope object.
		 * @return The return value of the invocation.
		 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
		 * is invoked with a scope object that is not a function. See {@link Js#err(Object)} 
		 * and {@link js.core.JsTypeError} for JS Simulation.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method 
		 * directly into a JavaScript invocation on its current instance without changing 
		 * the method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final T apply(Object thisobj) {
			return call(thisobj);
		}

		/**
		 * <p>Invokes the current function instance as a method of a specified scope object, 
		 * passing the specified array of arguments.</p>
		 * @param thisobj The scope object.
		 * @param args The array of arguments.
		 * @return The return value of the invocation.
		 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
		 * is invoked with a scope object that is not a function or if this method is invoked 
		 * with an argument that is not an array or {@link Arguments} object. See 
		 * {@link Js#err(Object)} and {@link js.core.JsTypeError} for JS Simulation.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method 
		 * directly into a JavaScript invocation on its current instance without changing 
		 * the method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		public final T apply(Object thisobj, Object args) {
			return call(thisobj, Js.s().vars(args));
		}

		/**
		 * <p>Returns the string representing the current function instance.</p>
		 * @return A string representing the current function.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method 
		 * directly into a JavaScript invocation on its current instance without changing 
		 * the method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		@Override
		public final String toString() {
			return var.toString();
		}
	}

	/**
	 * <p>An <b>opaque</b> class used inside function definition resembling JavaScript 
	 * arguments.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
	 * generated into the target codes. Re-compilers must exit with error on the operations of 
	 * accessing that kind of class objects.
	 */
	protected static final class Arguments implements ArrayObject<Object>
	{
		/**
		 * <p>A reference to the function that is currently executing.</p>
		 * @since 1.0
		 * @javascript Re-compilers must convert the access of this instance field directly 
		 * into a JavaScript expression of the field access to its current instance 
		 * without changing the field name. 
		 */
		public final Call<?> callee;
		private final Vars<?> vars;

		private Arguments(Call<?> callee, Vars<?> vars) {
			this.callee = callee;
			this.vars = vars;
		}

		/**
		 * <p>Gets the size of the current arguments instance.</p>
		 * @return size of the arguments
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into 
		 * the JavaScript expression: 
		 * <pre>a.length</pre>
		 * where <tt>a</tt> is the current instance of the invocation.
		 */
		public final int length() {
			return vars.var().length();
		}

		/**
		 * <p>Reads an element of the current arguments instance.</p>
		 * @param i Array index of the element
		 * @return value of the element
		 * @since 1.0
		 * @javascript Re-compilers must convert this instance invocation of this method into 
		 * the JavaScript expression: 
		 * <pre>a[i]</pre>
		 * where <tt>a</tt> is the current instance of the invocation.
		 */
		public final Object get(int i) {
			return vars.var().get(i);
		}

		/**
		 * <p>Internally returns the variable-list version of the current arguments instance.</p>
		 * <p>This method is <b>internal</b> and only called inside of <b>opaque</b> or 
		 * <b>internal</b> classes or class members.</p>
		 * @return The variable argument list.
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
		 */
		public final Vars<?> var() {
			return vars;
		}

		/**
		 * <p>Returns the string representing the current arguments instance.</p>
		 * @return A string representing the current arguments.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method 
		 * directly into a JavaScript invocation on its current instance without changing 
		 * the method name, but expanding variable arguments, if any, into comma-separated values. 
		 */
		@Override
		public final String toString() {
			return var().toString();
		}
	}

	private JsFunction<T> var;

	/**
	 * <p>Internally constructs a function object on an existed one.</p>
	 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * @param f A function object
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
	 */
	protected Function(Function<T> f) {
		var = f == null ? null : f.var();
	}
	/**
	 * <p>Internally constructs a function object on an existed function.</p>
	 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * @param var A function
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
	 */
	protected Function(JsFunction<T> var) {
		this.var = var;
	}
	/**
	 * <p>A default constructor to be extended to define a function object.</p>
	 * @since 1.0
	 */
	protected Function() {
	}

	/**
	 * <p>An abstract method to be concretely overridden to define the body of the function 
	 * of the current function object.</p>
	 * <p>The concrete overridden of this method is used to define the function body of 
	 * the current function object. Re-compilers use the body of the overridden method to 
	 * define the actual function of the current function object.</p>
	 * @param jsthis The scope object.
	 * @param callee The function calling this function.
	 * @return The return value of the function.
	 * @since 1.0
	 */
	protected abstract T function(final Object jsthis, final Call<T> callee);

	/**
	 * <p>An <b>opaque</b> method to return the function of the current function object.</p>
	 * @return The function of the current function object.
	 * @see #valueOf()
	 * @since 1.0
	 * @javascript Re-compilers must ignore the instance invocation of this method, that is, 
	 * replacing it with the function of the current function object instance.
	 */
	@Override
	public final JsFunction<T> var() {
		return var != null ? var : (var = Js.s().var(this));
	}

	/**
	 * <p>Internally construct an object.</p>
	 * <p>This method is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * @param o The object argument
	 * @return The constructed object
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	protected JsObject construct(Object o) {
		JsObject ret = JsGlobal.Object.with().create(o);
		JsObject.constructor.with(ret, var());
		JsFunction.prototype.with(ret, JsFunction.prototype.with(var()));
		return ret;
	}

	/**
	 * <p>An <b>opaque</b> method to construct an object with the function of the current 
	 * function object.</p>
	 * @return The newly constructed object.
	 * @since 1.0
	 * @javascript Re-compilers must convert this instance invocation into the JavaScript expression: 
	 * <pre>new f()</pre>
	 * where <tt>f</tt> is the function of the current function object instance of the 
	 * invocation.
	 */
	public JsObject create() {
		return construct(invoke());
	}

	/**
	 * <p>An <b>opaque</b> method to construct an object with the function of the current 
	 * function object, passing the specified argument.</p>
	 * @param arg The argument value.
	 * @return The newly constructed object.
	 * @since 1.0
	 * @javascript Re-compilers must convert this instance invocation into the JavaScript expression: 
	 * <pre>new f(arg)</pre>
	 * where <tt>f</tt> is the function of the current function object instance of the 
	 * invocation.
	 */
	public JsObject create(Object arg) {
		return construct(invoke(arg));
	}

	/**
	 * <p>An <b>opaque</b> method to construct an object with the function of the current 
	 * function object, passing the specified arguments.</p>
	 * @param args The list of arguments.
	 * @return The newly constructed object.
	 * @since 1.0
	 * @javascript Re-compilers must convert this instance invocation into the JavaScript expression: 
	 * <pre>new f(args)</pre>
	 * where <tt>f</tt> is the function of the current function object instance of the 
	 * invocation and <tt>args</tt> must be expanded into comma-separated arguments.
	 */
	public JsObject create(Vars<?> args) {
		return construct(invoke(args));
	}

	/**
	 * <p>An <b>opaque</b> method to invoke the function of the current function object.</p>
	 * @return The return value of the invocation.
	 * @since 1.0
	 * @javascript Re-compilers must convert this instance invocation into the JavaScript expression: 
	 * <pre>f()</pre>
	 * where <tt>f</tt> is the function of the current function object instance of the 
	 * invocation.
	 */
	public final T invoke() {
		return invoke(new Vars<Object>());
	}

	/**
	 * <p>An <b>opaque</b> method to invoke the function of the current function object, 
	 * passing the specified argument.</p>
	 * @param arg The argument value.
	 * @return The return value of the invocation.
	 * @since 1.0
	 * @javascript Re-compilers must convert this instance invocation into the JavaScript expression: 
	 * <pre>f(arg)</pre>
	 * where <tt>f</tt> is the function of the current function object instance of the 
	 * invocation.
	 */
	public final T invoke(Object arg) {
		return invoke(new Vars<Object>().add(arg));
	}

	/**
	 * <p>An <b>opaque</b> method to invoke the function of the current function object, 
	 * passing the specified arguments.</p>
	 * @param args The list of arguments.
	 * @return The return value of the invocation.
	 * @since 1.0
	 * @javascript Re-compilers must convert this instance invocation into the JavaScript expression: 
	 * <pre>f(args)</pre>
	 * where <tt>f</tt> is the function of the current function object instance of the 
	 * invocation and <tt>args</tt> must be expanded into comma-separated arguments.
	 */
	public final T invoke(Vars<?> args) {
		return call(Js.core(), args);
	}

	/**
	 * <p>An <b>opaque</b> method to invoke the function of the current function object as 
	 * a method of a specified scope object.</p>
	 * @param thisobj The scope object.
	 * @return The return value of the invocation.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked with a scope object that is not a function or if this method is invoked 
	 * with an argument that is not an array or {@link Arguments} object. See 
	 * {@link Js#err(Object)} and {@link js.core.JsTypeError} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on the function of the current function object instance 
	 * without changing the method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final T call(Object thisobj) {
		return call(thisobj, new Vars<Object>());
	}

	/**
	 * <p>An <b>opaque</b> method to invoke the function of the current function object as 
	 * a method of a specified scope object, passing the specified argument.</p>
	 * @param thisobj The scope object.
	 * @param arg The argument value.
	 * @return The return value of the invocation.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked with a scope object that is not a function or if this method is invoked 
	 * with an argument that is not an array or {@link Arguments} object. See 
	 * {@link Js#err(Object)} and {@link js.core.JsTypeError} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on the function of the current function object instance 
	 * without changing the method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final T call(Object thisobj, Object arg) {
		return call(thisobj, new Vars<Object>().add(arg));
	}

	/**
	 * <p>An <b>opaque</b> method to invoke the function of the current function object as 
	 * a method of a specified scope object, passing the specified arguments.</p>
	 * @param thisobj The scope object.
	 * @param args The list of arguments.
	 * @return The return value of the invocation.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked with a scope object that is not a function or if this method is invoked 
	 * with an argument that is not an array or {@link Arguments} object. See 
	 * {@link Js#err(Object)} and {@link js.core.JsTypeError} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on the function of the current function object instance 
	 * without changing the method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final T call(Object thisobj, Vars<?> args) {
		Call<T> callee = new Call<T>(this, args);
		T r = function(thisobj, callee);
		return r;
	}

	/**
	 * <p>An <b>opaque</b> method to invoke the function of the current function object as 
	 * a method of a specified scope object.</p>
	 * @param thisobj The scope object.
	 * @return The return value of the invocation.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked with a scope object that is not a function. See {@link Js#err(Object)} 
	 * and {@link js.core.JsTypeError} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on the function of the current function object instance 
	 * without changing the method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final T apply(Object thisobj) {
		return call(thisobj);
	}

	/**
	 * <p>An <b>opaque</b> method to invoke the function of the current function object as 
	 * a method of a specified scope object, passing the specified array of arguments.</p>
	 * @param thisobj The scope object.
	 * @param args The array of arguments.
	 * @return The return value of the invocation.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked with a scope object that is not a function or if this method is invoked 
	 * with an argument that is not an array or {@link Arguments} object. See 
	 * {@link Js#err(Object)} and {@link js.core.JsTypeError} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on the function of the current function object instance 
	 * without changing the method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final T apply(Object thisobj, Object args) {
		return call(thisobj, Js.s().vars(args));
	}

	/**
	 * <p>An <b>opaque</b> method to return the string representing the function of the 
	 * current function object.</p>
	 * @return A string representing the function of the current function object.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on the function of the current function object instance 
	 * without changing the method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	@Override
	public String toString() {
		return "function() {\r\n    [native code]\r\n}";
	}

	/**
	 * <p>An <b>opaque</b> method to return a string indicating the data-type of the 
	 * function of the current function object.</p>
	 * <p>Simulating the JavaScript <tt>typeof</tt> operator and <tt>typeof()</tt> 
	 * function, this invocation evaluates to "number", "string", or "boolean" if the current 
	 * instance is a number, string, or boolean value. It evaluates to "object" for objects, 
	 * arrays. It evaluates to "function" for function instance and to "undefined" if the 
	 * current instance is undefined.</p>
	 * @return A string indicating the data-type of the function of the current function object.
	 * @see #valueOf()
	 * @see #undefined()
	 * @since 1.0
	 * @javascript Re-compilers must convert this instance invocation into the JavaScript expression: 
	 * <pre>typeof f</pre>
	 * where <tt>f</tt> is the function of the current function object instance of the 
	 * invocation.
	 */
	@Override
	public final String typeof() {
		return "function";
	}

	/**
	 * <p>An <b>opaque</b> method to check if the function of the current function object 
	 * is undefined.</p>
	 * @return <tt>true</tt> if the function of the current function object is 
	 * undefined; <tt>false</tt> otherwise.
	 * @see #valueOf()
	 * @see #undefined()
	 * @since 1.0
	 * @javascript Re-compilers must convert this instance invocation into the JavaScript expression: 
	 * <pre>f===undefined</pre>
	 * where <tt>f</tt> is the function of the current function object instance of the 
	 * invocation.
	 */
	@Override
	public final boolean undefined() {
		return false;
	}

	/**
	 * <p>An <b>opaque</b> method to return the primitive value associated with the function 
	 * of the current function object, if there is one.</p>
	 * <p>This invocation simply returns the function of the current function object, since 
	 * there is no primitive value for a function.</p>
	 * @return The function of the current function object.
	 * @see #toString()
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on the function of the current function object instance 
	 * without changing the method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	@Override
	public final JsFunction<T> valueOf() {
		return var();
	}
}
