
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

import java.util.HashMap;
import java.util.Map;

import js.core.*;

/**
 * <p>An <b>opaque</b> class, resembling JavaScript variables, with subclasses being 
 * <b>normal</b> by default.</p>
 * <p>This class, its members and its enclosed classes are all <b>opaque</b>. However, 
 * without specified, its subclass and the concrete method overriding {@link Var#var()} 
 * method are <b>normal</b> to make late-evaluating expressions.
 * </p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this class must be ignored 
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */

public abstract class Var<T> extends Disposable
{
	/**
	 * <p>Default constructor.</p>
	 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
	 */
	protected Var() {}

	/**
	 * <p>Evaluates the current variable instance.</p>
	 * <p>The concrete method overriding this one and the subclass are <b>normal</b> by 
	 * default to make late-evaluating expressions.
	 * late.
	 * @return The value of the current instance itself.
	 * @since 1.0
	 * @javascript Re-compilers must replace this instance invocation with the current variable 
	 * instance of this invocation.
	 */
	public abstract T var();

	/**
	 * <p>Gets the hash code of the current variable instance.</p>
	 * @return The hash code of the current variable instance.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression converted from the Java static invocation:
	 * <pre>System.identityHashCode(v)</pre>
	 * where <tt>v</tt> is the current instance of the invocation of this method.
	 */
	@Override
	public final int hashCode() {
		return Js.s().hashCode(var());
	}

	/**
	 * <p>Checks if the current variable instance equals another object.</p>
	 * @param o Any value
	 * @return <tt>true</tt> if the current variable instance equals <tt>o</tt>; 
	 * false, otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression converted from the Java special instance invocation:
	 * <pre>super.equals(o)</pre>.
	 */
	@Override
	public final boolean equals(Object o) {
		return Js.s().equals(var(), o);
	}

	/**
	 * <p>Gets the string representation of the current variable instance.</p>
	 * @return The string representation of the current variable instance.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current instance without changing the method 
	 * name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	@Override
	public String toString() {
		return Js.toString(var());
	}

	/**
	 * <p>Returns a string indicating the data-type of the current variable instance.</p>
	 * <p>Simulating the JavaScript <tt>typeof</tt> operator and <tt>typeof()</tt> 
	 * function, this invocation evaluates to "number", "string", or "boolean" if the current 
	 * instance is a number, string, or boolean value. It evaluates to "object" for objects, 
	 * arrays. It evaluates to "function" for function instance and to "undefined" if the 
	 * current instance is undefined.</p>
	 * @return A string indicating the data-type of the instance.
	 * @see #valueOf()
	 * @see #undefined()
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>typeof v</pre>
	 * where <tt>v</tt> is the current variable instance of the invocation.
	 */
	public String typeof() {
		return Js.typeof(var());
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
	public boolean undefined() {
		return Js.undefined(var());
	}

	/**
	 * <p>Returns the primitive value associated with the current instance, if there is one.</p>
	 * @return The primitive value associated with the current instance.
	 * @see #toString()
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current instance without changing the method 
	 * name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Object valueOf() {
		return Js.valueOf(var());
	}

	/**
	 * <p>An <b>opaque</b> class representing member IDs.</p>
	 * <p>Note that, this class is <b>opaque</b> but its members are private or <b>internal</b>.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript Re-compilers must report error on resolving an <tt>internal</tt> class. 
	 */
	public static final class Mid
	{
		private final String name;

		private Mid(String name) {
			this.name = name;
		}

		/**
		 * <p>Returns the name of the member as a string.</p>
		 * <p>This method is <b>internal</b> and only called inside of <b>opaque</b> or 
		 * <b>internal</b> classes or class members.</p>
		 *
		 * @return The name of the member.
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
		 */
		@Override
		public final String toString() {
			return name;
		}
	}

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
	protected static abstract class Members
	{
		private final static Map<String, Mid> members = new HashMap<String, Mid>();

		/**
		 * <p>Construct membership data for the enclosing <b>opaque</b> class.</p>
		 * 
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
		 */
		protected Members() {
			throw new Error("No instance allowed.");
		}

		/**
		 * <p>Gets a member ID by the specified member name.</p>
		 * 
		 * @param name The name of the member
		 * @return The member ID
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
		 */
		public final static Mid id(String name) {
			if (!members.containsKey(name)) {
				members.put(name, new Mid(name));
			}
			return members.get(name);
		}
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
	protected static abstract class Member<T>
	{
		private final JsObject.Member q;
		private final Mid mid;

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
			this.q = q;
			this.mid = mid;
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
			this(null, mid);
		}

		/**
		 * <p>Gets the ID of a member.</p>
		 * @return The member ID
		 * @since 1.0
		 * @javascript Re-compilers must ignore the instance invocation of this method, that is, 
		 * replacing it with its current instance.
		 */
		public final Mid mid() {
			return mid;
		}

		/**
		 * <p>Gets the string representation of a member.</p>
		 * <p>This method is <b>internal</b> and only called inside of <b>opaque</b> or 
		 * <b>internal</b> classes or class members.</p>
		 * @return The string representation of the member.
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
		 */
		@Override
		public final String toString() {
			return q == null ? mid.toString() : q.toString() + "." + mid.toString();
		}

		/**
		 * <p>Evaluates the qualifier of the member based on an object.</p>
		 * <p>If the current member instance does not have a qualifying member, this method 
		 * simply returns the argument object; Otherwise, the method evaluates the qualifying 
		 * member based on the argument object and returns the result value.</p>
		 * <p>This method is scarcely used as a <tt>public</tt> <b>opaque</b> method but 
		 * definitely used inside other <b>opaque</b> types, somewhat like an <b>internal</b> 
		 * method.</p>
		 * @param o The base object instance
		 * @return The qualifier of the current member based on the object.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into 
		 * the JavaScript expression: 
		 * <pre>o.q</pre>
		 * where <tt>q</tt> is the qualifying identifier of the member identifier resolved 
		 * from the current member instance, or:
		 * <pre>o</pre>
		 * if the member identifier resolved from the current member instance does not have 
		 * the qualifying identifier, that is it does not have a dot in between.
		 */
		public final ObjectLike var(ObjectLike o) {
			return q == null ? o : q.with(o);
		}
		/**
		 * <p>Sets a new value to the property, represented by the current member instance, 
		 * of an object.</p>
		 * @param o The base object
		 * @param v The new value to set
		 * @return The new value
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into 
		 * the JavaScript expression: 
		 * <pre>o.m = v</pre>
		 * where <tt>m</tt> is the identifier name resolved from the current member 
		 * instance of the invocation.
		 */
		public final T with(ObjectLike o, T v) {
			return o.var(this, v);
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
		public abstract T with(ObjectLike o);
	}

	/**
	 * <p>Internally casts an object to array type.</p>
	 * <p>This method is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * @param o The object
	 * @param dummy A dummy object to tell the type being down cast to
	 * @return The array representation of an object
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	protected static final JsArray var(JsObject o, JsArray dummy) {
		return Js.s().toJsArray(o);
	}
	/**
	 * <p>Internally casts an object to boolean type.</p>
	 * <p>This method is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * @param o The object
	 * @param dummy A dummy object to tell the type being down cast to
	 * @return The boolean representation of an object
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	protected static final JsBoolean var(JsObject o, JsBoolean dummy) {
		return Js.s().toJsBoolean(o);
	}
	/**
	 * <p>Internally casts an object to date type.</p>
	 * <p>This method is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * @param o The object
	 * @param dummy A dummy object to tell the type being down cast to
	 * @return The date representation of an object
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	protected static final JsDate var(JsObject o, JsDate dummy) {
		return Js.s().toJsDate(o);
	}
	/**
	 * <p>Internally casts an object to function type.</p>
	 * <p>This method is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * @param o The object
	 * @param dummy A dummy object to tell the type being down cast to
	 * @return The function representation of an object
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	protected static final <S> JsFunction<S> var(JsObject o, JsFunction<S> dummy) {
		return Js.s().toJsFunction(o);
	}
	/**
	 * <p>Internally casts an object to function type.</p>
	 * <p>This method is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * @param o The object
	 * @param w A wrapper to perform the cast
	 * @return The function representation of an object
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	protected static final <S> JsFunction<S> var(JsObject o, Generic<S> w) {
		return Js.s().toJsFunction(o, w);
	}
	/**
	 * <p>Internally casts an object to number type.</p>
	 * <p>This method is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * @param o The object
	 * @param dummy A dummy object to tell the type being down cast to
	 * @return The number representation of an object
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	protected static final JsNumber var(JsObject o, JsNumber dummy) {
		return Js.s().toJsNumber(o);
	}
	/**
	 * <p>Internally casts an object to regular expression type.</p>
	 * <p>This method is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * @param o The object
	 * @param dummy A dummy object to tell the type being down cast to
	 * @return The regular expression representation of an object
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	protected static final JsRegExp var(JsObject o, JsRegExp dummy) {
		return Js.s().toJsRegExp(o);
	}
	/**
	 * <p>Internally casts an object to string type.</p>
	 * <p>This method is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * @param o The object
	 * @param dummy A dummy object to tell the type being down cast to
	 * @return The string representation of an object
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	protected static final JsString var(JsObject o, JsString dummy) {
		return Js.s().toJsString(o);
	}

	/**
	 * <p>An <b>internal</b> class providing the facilities of arbitrary <b>opaque</b> 
	 * type casting, especially over JavaScript objects in JS Embed Simulation mode, with 
	 * the help of the opaque wrapping technology.</p>
	 * <p>This class is only used inside of <b>opaque</b> or <b>internal</b> classes or 
	 * class members.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript Re-compilers must report error on resolving an <b>internal</b> class. 
	 */

	protected static abstract class Generic<T extends Object>
	{
		private Generic() {}

		/**
		 * <p>Wraps an object.</p>
		 * @param o The object
		 * @return The new representation of an object
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
		 */
		public abstract T wrap(Object o);

		private final static Map<Class<? extends JsObject>, Generic<? extends JsObject>> objWrappers =
		             new HashMap<Class<? extends JsObject>, Generic<? extends JsObject>>();

		/**
		 * <p>Gets an object wrapper for a type.</p>
		 * @param cls The type to get an object wrapper for.
		 * @return The object wrapper that can down cast an object to the specified type.
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
		 */
		@SuppressWarnings("unchecked")
		public final static synchronized <T extends JsObject> Generic<T> get(final Class<T> cls) {
			if (!objWrappers.containsKey(cls)) {
				objWrappers.put(
						cls,
						new Generic<T>() {
							@Override
							public T wrap(Object o) {
								if (o != null) {
									Class<?> c = o.getClass();
									if (JsObject.class.isAssignableFrom(cls) &&
											!cls.isAssignableFrom(c)) {
										try {
											o = cls.getConstructor(
													JsObject.class
											).newInstance(o);
										} catch (Exception e) {
											e.printStackTrace();
										}
									}
								}
								return (T)o;
							}
						}
				);
			}
			return (Generic<T>)objWrappers.get(cls);
		}

		private final static Map<Class<? extends JsObject>, Map<Generic<?>, Generic<? extends JsObject>>> genWrappers =
		             new HashMap<Class<? extends JsObject>, Map<Generic<?>, Generic<? extends JsObject>>>();

		/**
		 * <p>Gets a generic wrapper for a type with a wrapper for generic wrapping.</p>
		 * @param cls The type to get a wrapper for.
		 * @param eWrapper The wrapper for generic.
		 * @return The wrapper that can down cast a generic object to the specified type.
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
		 */
		@SuppressWarnings("unchecked")
		public final static synchronized <T extends JsObject> Generic<T> get(
				final Class<T> cls, final Generic<?> eWrapper) {
			if (!genWrappers.containsKey(cls)) {
				genWrappers.put(cls, new HashMap<Generic<?>, Generic<? extends JsObject>>());
			}
			Map<Generic<?>, Generic<? extends JsObject>> wrappers = genWrappers.get(cls);
			if (!wrappers.containsKey(eWrapper)) {
				wrappers.put(
						eWrapper,
						new Generic<T>() {
							@Override
							public T wrap(Object o) {
								if (o != null) {
									if (JsObject.class.isAssignableFrom(cls)) {
										try {
											o = cls.getConstructor(
													JsObject.class, Generic.class
											).newInstance(o, eWrapper);
										} catch (Exception e) {
											e.printStackTrace();
										}
									}
								}
								return (T)o;
							}
						}
				);
			}
			return (Generic<T>)wrappers.get(eWrapper);
		}

		/**
		 * <p>The character wrapper.</p>
		 * @since 1.0
		 * @javascript Re-compilers must report error on the access to an <b>internal</b> field. 
		 */
		public final static Generic<Character> CHARACTER = new Generic<Character>() {
			@Override
			public Character wrap(Object o) {
				return (char)((Number)o).shortValue();
			}
		};
		/**
		 * <p>The byte wrapper.</p>
		 * @since 1.0
		 * @javascript Re-compilers must report error on the access to an <b>internal</b> field. 
		 */
		public final static Generic<Byte> BYTE = new Generic<Byte>() {
			@Override
			public Byte wrap(Object o) {
				return ((Number)o).byteValue();
			}
		};
		/**
		 * <p>The short wrapper.</p>
		 * @since 1.0
		 * @javascript Re-compilers must report error on the access to an <b>internal</b> field. 
		 */
		public final static Generic<Short> SHORT = new Generic<Short>() {
			@Override
			public Short wrap(Object o) {
				return ((Number)o).shortValue();
			}
		};
		/**
		 * <p>The long wrapper.</p>
		 * @since 1.0
		 * @javascript Re-compilers must report error on the access to an <b>internal</b> field. 
		 */
		public final static Generic<Long> LONG = new Generic<Long>() {
			@Override
			public Long wrap(Object o) {
				return ((Number)o).longValue();
			}
		};
		/**
		 * <p>The float wrapper.</p>
		 * @since 1.0
		 * @javascript Re-compilers must report error on the access to an <b>internal</b> field. 
		 */
		public final static Generic<Float> FLOAT = new Generic<Float>() {
			@Override
			public Float wrap(Object o) {
				return ((Number)o).floatValue();
			}
		};
		/**
		 * <p>The boolean value wrapper.</p>
		 * @since 1.0
		 * @javascript Re-compilers must report error on the access to an <b>internal</b> field. 
		 */
		public final static Generic<Value.Boolean> VALUE_BOOLEAN = new Generic<Value.Boolean>() {
			@Override
			public Value.Boolean wrap(Object o) {
				return new Value.Boolean((Boolean)o);
			}
		};
		/**
		 * <p>The character value wrapper.</p>
		 * @since 1.0
		 * @javascript Re-compilers must report error on the access to an <b>internal</b> field. 
		 */
		public final static Generic<Value.Character> VALUE_CHARACTER = new Generic<Value.Character>() {
			@Override
			public Value.Character wrap(Object o) {
				return new Value.Character(((Number)o));
			}
		};
		/**
		 * <p>The number value wrapper.</p>
		 * @since 1.0
		 * @javascript Re-compilers must report error on the access to an <b>internal</b> field. 
		 */
		public final static Generic<Value.Number> VALUE_NUMBER = new Generic<Value.Number>() {
			@Override
			public Value.Number wrap(Object o) {
				return new Value.Number(((Number)o));
			}
		};
		/**
		 * <p>The byte value wrapper.</p>
		 * @since 1.0
		 * @javascript Re-compilers must report error on the access to an <b>internal</b> field. 
		 */
		public final static Generic<Value.Byte> VALUE_BYTE = new Generic<Value.Byte>() {
			@Override
			public Value.Byte wrap(Object o) {
				return new Value.Byte(((Number)o));
			}
		};
		/**
		 * <p>The short value wrapper.</p>
		 * @since 1.0
		 * @javascript Re-compilers must report error on the access to an <b>internal</b> field. 
		 */
		public final static Generic<Value.Short> VALUE_SHORT = new Generic<Value.Short>() {
			@Override
			public Value.Short wrap(Object o) {
				return new Value.Short(((Number)o));
			}
		};
		/**
		 * <p>The integer value wrapper.</p>
		 * @since 1.0
		 * @javascript Re-compilers must report error on the access to an <b>internal</b> field. 
		 */
		public final static Generic<Value.Integer> VALUE_INTEGER = new Generic<Value.Integer>() {
			@Override
			public Value.Integer wrap(Object o) {
				return new Value.Integer(((Number)o));
			}
		};
		/**
		 * <p>The long value wrapper.</p>
		 * @since 1.0
		 * @javascript Re-compilers must report error on the access to an <b>internal</b> field. 
		 */
		public final static Generic<Value.Long> VALUE_LONG = new Generic<Value.Long>() {
			@Override
			public Value.Long wrap(Object o) {
				return new Value.Long(((Number)o));
			}
		};
		/**
		 * <p>The float value wrapper.</p>
		 * @since 1.0
		 * @javascript Re-compilers must report error on the access to an <b>internal</b> field. 
		 */
		public final static Generic<Value.Float> VALUE_FLOAT = new Generic<Value.Float>() {
			@Override
			public Value.Float wrap(Object o) {
				return new Value.Float(((Number)o));
			}
		};
		/**
		 * <p>The double value wrapper.</p>
		 * @since 1.0
		 * @javascript Re-compilers must report error on the access to an <b>internal</b> field. 
		 */
		public final static Generic<Value.Double> VALUE_DOUBLE = new Generic<Value.Double>() {
			@Override
			public Value.Double wrap(Object o) {
				return new Value.Double(((Number)o));
			}
		};
	}
}
