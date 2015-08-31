
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
 * <p>An <b>opaque</b> class representing JavaScript array objects.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @see js.core.JsArray#JsArray()
 * @see js.core.JsArray#JsArray(js.core.JsObject)
 * @see js.core.JsArray#JsArray(Object[])
 * @see js.core.JsArray#JsArray(boolean[])
 * @see js.core.JsArray#JsArray(byte[])
 * @see js.core.JsArray#JsArray(char[])
 * @see js.core.JsArray#JsArray(short[])
 * @see js.core.JsArray#JsArray(int[])
 * @see js.core.JsArray#JsArray(long[])
 * @see js.core.JsArray#JsArray(float[])
 * @see js.core.JsArray#JsArray(double[])
 * @see js.core.JsGlobal.Array#create()
 * @see js.core.JsGlobal.Array#create(Object)
 * @see js.core.JsGlobal.Array#create(Vars)
 * @see jsx.core.ArrayLikes
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsArray extends JsGlobal.Array.Prototype implements ArrayLike<Object>
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
	protected static abstract class Members extends JsGlobal.Array.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsArray#index
		 * @see Member#index
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid index  = id("index" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsArray#input
		 * @see Member#input
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid input  = id("input" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and 
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsArray#length
		 * @see Member#length
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field. 
		 */
		public final static Mid length = id("length");
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
	public static class Member extends JsGlobal.Array.Prototype.Member
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
		public JsArray with(ObjectLike o) {
			return new JsArray((JsObject)var(o).var(mid()));
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
		public final JsFunction.Member<JsArray> constructor = new JsFunction.Member<JsArray>(this, Members.constructor, Generic.get(JsArray.class)); 
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsArray#index()
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Integer.Member index  = new Value.Integer.Member(this, Members.index );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsArray#input()
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String .Member input  = new Value.String .Member(this, Members.input );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the 
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @see JsArray#length()
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the 
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number .Member length = new Value.Number .Member(this, Members.length);
	}

	/**
	 * <p>Internally constructs an array object.</p>
	 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
	 * wrap primitive data types are also "primitive" to JS.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
	 */
	protected JsArray(Object var) {
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
	public JsArray(JsObject var) {
		super(var(var, (JsArray)null));
	}
	/**
	 * <p>Constructs an empty array object.</p>
	 * @since 1.0
	 * @see #JsArray(js.core.JsObject)
	 * @see #JsArray(Object[])
	 * @see #JsArray(boolean[])
	 * @see #JsArray(byte[])
	 * @see #JsArray(char[])
	 * @see #JsArray(short[])
	 * @see #JsArray(int[])
	 * @see #JsArray(long[])
	 * @see #JsArray(float[])
	 * @see #JsArray(double[])
	 * @see js.core.JsGlobal.Array#create()
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @see js.core.JsGlobal.Array#create(Vars)
	 * @see jsx.core.ArrayLikes
	 * @javascript Re-compilers must replace the construction operation of this constructor 
	 * with the JavaScript expression:
	 * <pre>new Array()</pre>
	 */
	public JsArray() {
		this(JsGlobal.Array.with().invoke());
	}
	/**
	 * <p>Casts an array to the current <b>opaque</b> type by wrapping it with the 
	 * wrapping constructor.</p>
	 * @param arr The argument of an array.
	 * @since 1.0
	 * @see #JsArray()
	 * @see #JsArray(js.core.JsObject)
	 * @see #JsArray(boolean[])
	 * @see #JsArray(byte[])
	 * @see #JsArray(char[])
	 * @see #JsArray(short[])
	 * @see #JsArray(int[])
	 * @see #JsArray(long[])
	 * @see #JsArray(float[])
	 * @see #JsArray(double[])
	 * @see js.core.JsGlobal.Array#create()
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @see js.core.JsGlobal.Array#create(Vars)
	 * @see jsx.core.ArrayLikes
	 * @javascript Re-compilers must ignore the construction operation of this constructor, 
	 * that is, replacing it with its only argument.
	 */
	public <T> JsArray(T[] arr) {
		this(JsGlobal.Array.with().invoke(arr));
	}
	/**
	 * <p>Casts an array to the current <b>opaque</b> type by wrapping it with the 
	 * wrapping constructor.</p>
	 * @param arr The argument of an array.
	 * @since 1.0
	 * @see #JsArray()
	 * @see #JsArray(js.core.JsObject)
	 * @see #JsArray(Object[])
	 * @see #JsArray(byte[])
	 * @see #JsArray(char[])
	 * @see #JsArray(short[])
	 * @see #JsArray(int[])
	 * @see #JsArray(long[])
	 * @see #JsArray(float[])
	 * @see #JsArray(double[])
	 * @see js.core.JsGlobal.Array#create()
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @see js.core.JsGlobal.Array#create(Vars)
	 * @see jsx.core.ArrayLikes
	 * @javascript Re-compilers must ignore the construction operation of this constructor, 
	 * that is, replacing it with its only argument.
	 */
	public JsArray(boolean[] arr) {
		this(JsGlobal.Array.with().invoke(arr));
	}
	/**
	 * <p>Casts an array to the current <b>opaque</b> type by wrapping it with the 
	 * wrapping constructor.</p>
	 * @param arr The argument of an array.
	 * @since 1.0
	 * @see #JsArray()
	 * @see #JsArray(js.core.JsObject)
	 * @see #JsArray(Object[])
	 * @see #JsArray(boolean[])
	 * @see #JsArray(char[])
	 * @see #JsArray(short[])
	 * @see #JsArray(int[])
	 * @see #JsArray(long[])
	 * @see #JsArray(float[])
	 * @see #JsArray(double[])
	 * @see js.core.JsGlobal.Array#create()
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @see js.core.JsGlobal.Array#create(Vars)
	 * @see jsx.core.ArrayLikes
	 * @javascript Re-compilers must ignore the construction operation of this constructor, 
	 * that is, replacing it with its only argument.
	 */
	public JsArray(byte[] arr) {
		this(JsGlobal.Array.with().invoke(arr));
	}
	/**
	 * <p>Casts an array to the current <b>opaque</b> type by wrapping it with the 
	 * wrapping constructor.</p>
	 * @param arr The argument of an array.
	 * @since 1.0
	 * @see #JsArray()
	 * @see #JsArray(js.core.JsObject)
	 * @see #JsArray(Object[])
	 * @see #JsArray(boolean[])
	 * @see #JsArray(byte[])
	 * @see #JsArray(short[])
	 * @see #JsArray(int[])
	 * @see #JsArray(long[])
	 * @see #JsArray(float[])
	 * @see #JsArray(double[])
	 * @see js.core.JsGlobal.Array#create()
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @see js.core.JsGlobal.Array#create(Vars)
	 * @see jsx.core.ArrayLikes
	 * @javascript Re-compilers must ignore the construction operation of this constructor, 
	 * that is, replacing it with its only argument.
	 */
	public JsArray(char[] arr) {
		this(JsGlobal.Array.with().invoke(arr));
	}
	/**
	 * <p>Casts an array to the current <b>opaque</b> type by wrapping it with the 
	 * wrapping constructor.</p>
	 * @param arr The argument of an array.
	 * @since 1.0
	 * @see #JsArray()
	 * @see #JsArray(js.core.JsObject)
	 * @see #JsArray(Object[])
	 * @see #JsArray(boolean[])
	 * @see #JsArray(byte[])
	 * @see #JsArray(char[])
	 * @see #JsArray(int[])
	 * @see #JsArray(long[])
	 * @see #JsArray(float[])
	 * @see #JsArray(double[])
	 * @see js.core.JsGlobal.Array#create()
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @see js.core.JsGlobal.Array#create(Vars)
	 * @see jsx.core.ArrayLikes
	 * @javascript Re-compilers must ignore the construction operation of this constructor, 
	 * that is, replacing it with its only argument.
	 */
	public JsArray(short[] arr) {
		this(JsGlobal.Array.with().invoke(arr));
	}
	/**
	 * <p>Casts an array to the current <b>opaque</b> type by wrapping it with the 
	 * wrapping constructor.</p>
	 * @param arr The argument of an array.
	 * @since 1.0
	 * @see #JsArray()
	 * @see #JsArray(js.core.JsObject)
	 * @see #JsArray(Object[])
	 * @see #JsArray(boolean[])
	 * @see #JsArray(byte[])
	 * @see #JsArray(char[])
	 * @see #JsArray(short[])
	 * @see #JsArray(long[])
	 * @see #JsArray(float[])
	 * @see #JsArray(double[])
	 * @see js.core.JsGlobal.Array#create()
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @see js.core.JsGlobal.Array#create(Vars)
	 * @see jsx.core.ArrayLikes
	 * @javascript Re-compilers must ignore the construction operation of this constructor, 
	 * that is, replacing it with its only argument.
	 */
	public JsArray(int[] arr) {
		this(JsGlobal.Array.with().invoke(arr));
	}
	/**
	 * <p>Casts an array to the current <b>opaque</b> type by wrapping it with the 
	 * wrapping constructor.</p>
	 * @param arr The argument of an array.
	 * @since 1.0
	 * @see #JsArray()
	 * @see #JsArray(js.core.JsObject)
	 * @see #JsArray(Object[])
	 * @see #JsArray(boolean[])
	 * @see #JsArray(byte[])
	 * @see #JsArray(char[])
	 * @see #JsArray(short[])
	 * @see #JsArray(int[])
	 * @see #JsArray(float[])
	 * @see #JsArray(double[])
	 * @see js.core.JsGlobal.Array#create()
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @see js.core.JsGlobal.Array#create(Vars)
	 * @see jsx.core.ArrayLikes
	 * @javascript Re-compilers must ignore the construction operation of this constructor, 
	 * that is, replacing it with its only argument.
	 */
	public JsArray(long[] arr) {
		this(JsGlobal.Array.with().invoke(arr));
	}
	/**
	 * <p>Casts an array to the current <b>opaque</b> type by wrapping it with the 
	 * wrapping constructor.</p>
	 * @param arr The argument of an array.
	 * @since 1.0
	 * @see #JsArray()
	 * @see #JsArray(js.core.JsObject)
	 * @see #JsArray(Object[])
	 * @see #JsArray(boolean[])
	 * @see #JsArray(byte[])
	 * @see #JsArray(char[])
	 * @see #JsArray(short[])
	 * @see #JsArray(int[])
	 * @see #JsArray(long[])
	 * @see #JsArray(double[])
	 * @see js.core.JsGlobal.Array#create()
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @see js.core.JsGlobal.Array#create(Vars)
	 * @see jsx.core.ArrayLikes
	 * @javascript Re-compilers must ignore the construction operation of this constructor, 
	 * that is, replacing it with its only argument.
	 */
	public JsArray(float[] arr) {
		this(JsGlobal.Array.with().invoke(arr));
	}
	/**
	 * <p>Casts an array to the current <b>opaque</b> type by wrapping it with the 
	 * wrapping constructor.</p>
	 * @param arr The argument of an array.
	 * @since 1.0
	 * @see #JsArray()
	 * @see #JsArray(js.core.JsObject)
	 * @see #JsArray(Object[])
	 * @see #JsArray(boolean[])
	 * @see #JsArray(byte[])
	 * @see #JsArray(char[])
	 * @see #JsArray(short[])
	 * @see #JsArray(int[])
	 * @see #JsArray(long[])
	 * @see #JsArray(float[])
	 * @see js.core.JsGlobal.Array#create()
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @see js.core.JsGlobal.Array#create(Vars)
	 * @see jsx.core.ArrayLikes
	 * @javascript Re-compilers must ignore the construction operation of this constructor, 
	 * that is, replacing it with its only argument.
	 */
	public JsArray(double[] arr) {
		this(JsGlobal.Array.with().invoke(arr));
	}

	/**
	 * <p>Simply returns the current array instance.</p>
	 * <p>This method is useful for JS Simulation to implement opaque types.</p>
	 * <p>If the current instance is a Java simulated array and the method runs in JS 
	 * Embed Simulation mode, the invocation creates and returns a JavaScript Array object 
	 * as a runtime copy of the current array.</p>
	 * @return The current array instance.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the instance invocation of this method, that is, 
	 * replacing it with its current instance.
	 */
	@Override
	public JsArray var() {
		return (JsArray)super.var();
	}
	/**
	 * <p>Assigns the reference of another array to the current array instance.</p>
	 * @param var The argument array instance.
	 * @return The new array.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into 
	 * the JavaScript expression: 
	 * <pre>a = var</pre>
	 * where <tt>a</tt> is the current array instance of the invocation of this method.
	 */
	@Override
	public final <S extends JsObject> S var(S var) {
		var(var, (JsArray)null);
		return var;
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
	public static final JsFunction.Member<JsArray> constructor = new JsFunction.Member<JsArray>(Members.constructor, Generic.get(JsArray.class)); 
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsArray#index()
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final Value.Integer.Member index  = new Value.Integer.Member(Members.index );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsArray#input()
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final Value.String .Member  input = new Value.String .Member(Members.input );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name 
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsArray#length()
	 * @javascript Re-compilers must resolve the member of this static field to the 
	 * identifier of the field name.
	 */
	public static final Value.Number .Member length = new Value.Number .Member(Members.length);

	/**
	 * <p>Reads an element of the current array instance.</p>
	 * @param i Array index of the element
	 * @return value of the element
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>a[i]</pre>
	 * where <tt>a</tt> is the current array instance of the invocation.
	 */
	public Object get(int i) {
		return var().get(i);
	}
	/**
	 * <p>Writes an element of the current array instance.</p>
	 * @param i Array index of the element
	 * @param v The new value
	 * @return The new value of the element
	 * @see ArrayObject#get(int)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>(a[i]=v)</pre>
	 * where <tt>a</tt> is the current array instance of the invocation.
	 */
	public Object set(int i, Object v) {
		return var().set(i, v);
	}
	/**
	 * <p>Deletes an element of the current array instance.</p>
	 * @param i Array index of the element
	 * @return <tt>true</tt> if the deletion is successful, <tt>false</tt> otherwise.
	 * @see #set(int, Object)
	 * @see jsx.core.ArrayLikes#delete(ArrayLike, int)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>(delete a[i])</pre>
	 * where <tt>a</tt> is the current array instance of the invocation.
	 */
	public boolean delete(int i) {
		return var().delete(i);
	}
	/**
	 * <p>Gets the size of the current array instance.</p>
	 * @return size of the array
	 * @see jsx.core.ArrayLikes#length(ArrayObject)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>a.length</pre>
	 * where <tt>a</tt> is the current array instance of the invocation.
	 */
	public final int length() {
		return length.with(this).intValue();
	}
	/**
	 * <p>Changes the size of the current array instance.</p>
	 * @param len New size
	 * @return New size
	 * @see jsx.core.ArrayLikes#length(ArrayLike, int)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>(a.length=len)</pre>
	 * where <tt>a</tt> is the current array instance of the invocation.
	 */
	public final int length(int len) {
		return length.with(this, len).intValue();
	}
	/**
	 * <p>Gets the <tt>index</tt> field of the current array instance.</p>
	 * @return The value of the <tt>index</tt> field of an array object
	 * @see StringLike#match(RegExpLike)
	 * @see jsx.core.ArrayLikes#index(ArrayLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>a.index</pre>
	 * where <tt>a</tt> is the current array instance of the invocation.
	 */
	public final Integer index() {
		return index.with(this);
	}
	/**
	 * <p>Gets the <tt>input</tt> field of the current array instance.</p>
	 * @return The value of the <tt>input</tt> field of an array object
	 * @see StringLike#match(RegExpLike)
	 * @see RegExpLike#exec(Object)
	 * @see jsx.core.ArrayLikes#input(ArrayLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>a.input</pre>
	 * where <tt>a</tt> is the current array instance of the invocation.
	 */
	public final String input() {
		return input.with(this);
	}

	/**
	 * <p>Creates and returns a new array object that is the result of concatenating its
	 * argument to the current array instance. This invocation does not modify the current 
	 * array. If the argument to <tt>concat</tt> is itself an array, the elements of that array 
	 * are concatenated, rather than the array itself.</p>
	 * @param arg A value to be concatenated with the current array.
	 * @return A new array object, which is formed by concatenating the specified argument
	 * to the current array.
	 * @see #concat(Vars)
	 * @see jsx.core.ArrayLikes#concat(ArrayLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsArray concat(Object arg) {
		return new JsArray(call(concat, arg));
	}
	/**
	 * <p>Creates and returns a new array object that is the result of concatenating each 
	 * of its arguments to the current array instance. This invocation does not modify the 
	 * current array. If any of the arguments to <tt>concat</tt> is itself an array, 
	 * the elements of that array are concatenated, rather than the array itself.</p>
	 * @param args A list of the argument values to be concatenated with the current array.
	 * @return A new array object, which is formed by concatenating each of the specified
	 * arguments to the current array.
	 * @see #concat(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsArray concat(Vars<?> args) {
		return new JsArray(call(concat, args));
	}
	/**
	 * <p>Converts each element of the current array instance to a string and then 
	 * concatenates those strings, inserting a comma between the elements and returns 
	 * the resulting string.</p>
	 * @return The string that results from converting each element of the current array
	 * to a string and then concatenating them together with a comma between elements.
	 * @see #join(Object)
	 * @see StringLike#split(Object)
	 * @see jsx.core.ArrayLikes#join(ArrayLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String join() {
		return call(join);
	}
	/**
	 * <p>Converts each element of the current array instance to a string and then 
	 * concatenates those strings, inserting the separator string specified by 
	 * <tt>separator</tt> between the elements and returns the resulting string.</p>
	 * @param separator An optional string used to separate one element of the current array
	 * from the next in the returned string. If this argument is omitted, 
	 * <tt>undefined</tt> or <tt>null</tt>, a comma is used.
	 * @return The string that results from converting each element of the current array
	 * to a string and then concatenating them together, with the <tt>separator</tt>
	 * string between elements.
	 * @see StringLike#split(Object)
	 * @see jsx.core.ArrayLikes#join(ArrayLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String join(Object separator) {
		return call(join, separator);
	}
	/**
	 * <p>Deletes the last element of the current array instance, decrements the length of 
	 * the current array, and returns the value of the deleted element. If the current array is 
	 * already empty, this invocation does not change the array and returns the undefined <tt>null</tt> value.</p>
	 * @return The last element of the current array.
	 * @see #push(Object)
	 * @see #push(Vars)
	 * @see jsx.core.ArrayLikes#pop(ArrayLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Object pop() {
		return call(pop);
	}
	/**
	 * <p>Appends the argument to the end of the current array instance by modifying the 
	 * array directly rather than creating a new one.</p>
	 * @param v A value to be appended to the end of the current array.
	 * @return The new length of the array, after the specified value are appended to it.
	 * @see #push(Vars)
	 * @see #pop()
	 * @see jsx.core.ArrayLikes#push(ArrayLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final int push(Object v) {
		return call(push, v).intValue();
	}
	/**
	 * <p>Appends the arguments, in order, to the end of the current array instance by 
	 * modifying the array directly rather than creating a new one.</p>
	 * @param args A list of the values to be appended to the end of the current array.
	 * @return The new length of the array, after the specified values are appended to it.
	 * @see #push(Object)
	 * @see #pop()
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final int push(Vars<?> args) {
		return call(push, args).intValue();
	}
	/**
	 * <p>Reverses the order of the elements of the current array instance by rearranging 
	 * them in place without creating a new array. If there are multiple references to the 
	 * array, the new order of the array elements is visible through all references after 
	 * this invocation.</p>
	 * @see jsx.core.ArrayLikes#reverse(ArrayLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void reverse() {
		call(reverse);
	}
	/**
	 * <p>Removes and returns the first element of the current array instance, shifting 
	 * all subsequent elements down one place to occupy the newly vacant space at the 
	 * start of the array. If the current array is empty, this invocation does nothing 
	 * and returns the undefined value <tt>null</tt>. Note that this invocation does 
	 * not create a new array; instead, it modifies the current array directly.</p>
	 * @return The former first element of the current array.
	 * @see #pop()
	 * @see jsx.core.ArrayLikes#shift(ArrayLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Object shift() {
		return call(shift);
	}
	/**
	 * <p>Returns a slice, or sub-array, of the current array instance without modifying 
	 * it. The returned array contains the element positioned by the first value of the 
	 * argument list and all subsequent elements up to, but not including, the element 
	 * positioned by the second value of the argument list. If the second value is not 
	 * specified or undefined, the returned array contains all elements from the position 
	 * specified by the first value to the end of the current array.</p>
	 * @param args A list of the argument values. The first value specifies the array 
	 * index at which the slice is to begin. If this value is negative, it specifies a 
	 * position measured from the end of the current array. That is, -1 indicates the 
	 * last element, -2 indicates the next from the last element, and so on. The second 
	 * value specifies the array index immediately after the end of the slice. If it is 
	 * undefined or not specified, the slice includes all array elements from the position 
	 * specified by the first value to the end of the array. If the second value is 
	 * negative, it specifies the array element measured from the end of the array.
	 * @return A new array that contains the elements of current array instance from the 
	 * element positioned by the first value of <tt>args</tt>, up to, but not including, 
	 * the element positioned by the second value of <tt>args</tt>.
	 * @see #slice(Object)
	 * @see #slice(Object, Object)
	 * @see #splice(Object)
	 * @see #splice(Vars)
	 * @see #splice(Object, Object)
	 * @see #splice(Object, Object, Object)
	 * @see #splice(Object, Object, Vars)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsArray slice(Vars<?> args) {
		return new JsArray(call(slice, args));
	}
	/**
	 * <p>Returns a slice, or sub-array, of the current array instance without modifying 
	 * it. The returned array contains the element positioned by <tt>start</tt> and 
	 * all subsequent elements up to the end of the current array.</p>
	 * @param start The array index at which the slice is to begin. If negative, this 
	 * argument specifies a position measured from the end of the current array. That is, 
	 * -1 indicates the last element, -2 indicates the next from the last element, and so on.
	 * @return A new array that contains the elements of current array instance from the 
	 * element positioned by <tt>start</tt>, up to the end of the current array.
	 * @see #slice(Object, Object)
	 * @see #slice(Vars)
	 * @see #splice(Object)
	 * @see #splice(Vars)
	 * @see #splice(Object, Object)
	 * @see #splice(Object, Object, Object)
	 * @see #splice(Object, Object, Vars)
	 * @see jsx.core.ArrayLikes#slice(ArrayLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsArray slice(Object start) {
		return new JsArray(call(slice, start));
	}
	/**
	 * <p>Returns a slice, or sub-array, of the current array instance without modifying 
	 * it. The returned array contains the element positioned by <tt>start</tt> and 
	 * all subsequent elements up to, but not including, the element positioned by 
	 * <tt>end</tt>. If <tt>end</tt> is an undefined value, the returned array 
	 * contains all elements from the <tt>start</tt> to the end of the current array.</p>
	 * @param start The array index at which the slice is to begin. If negative, this 
	 * argument specifies a position measured from the end of the current array. That is, 
	 * -1 indicates the last element, -2 indicates the next from the last element, and so on.
	 * @param end The array index immediately after the end of the slice. If undefined, 
	 * the slice includes all array elements from the <tt>start</tt> to the end 
	 * of the array. If this argument is negative, it specifies an array element measured 
	 * from the end of the array.
	 * @return A new array that contains the elements of current array instance from the 
	 * element positioned by <tt>start</tt>, up to, but not including, the element 
	 * positioned by <tt>end</tt>.
	 * @see #slice(Object)
	 * @see #slice(Vars)
	 * @see #splice(Object)
	 * @see #splice(Vars)
	 * @see #splice(Object, Object)
	 * @see #splice(Object, Object, Object)
	 * @see #splice(Object, Object, Vars)
	 * @see jsx.core.ArrayLikes#slice(ArrayLike, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsArray slice(Object start, Object end) {
		return new JsArray(call(slice, new Vars<Object>().add(start).add(end)));
	}
	/**
	 * <p>Sorts the elements of the current array instance in place by arranging them in 
	 * alphabetical order (more precisely, the order determined by the character encoding).
	 * To do this, elements are first converted to strings, if necessary, so that they can 
	 * be compared. Note that the array is sorted in place, and no copy is made.
	 * And undefined elements are always sorted to the end of the array.</p>
	 * @return A reference to the current array.
	 * @see #sort(JsFunction)
	 * @see jsx.core.ArrayLikes#sort(ArrayLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsArray sort() {
		return new JsArray(call(sort));
	}
	/**
	 * <p>Sorts the elements of the current array instance with the custom ordering function 
	 * <tt>orderfunc</tt>. Note that the array is sorted in place, and no copy is made.
	 * And undefined elements are always sorted to the end of the array because undefined 
	 * values are never passed to the ordering function you supply.</p>
	 * @param orderfunc A comparison function that compares two values and returns a 
	 * number indicating their relative order. This function should take two arguments, 
	 * <tt>a</tt> and <tt>b</tt> for instance, and should return one of the following:
	 * <ul>
	 * <li>A value less than zero, if, according to your sort criteria, <tt>a</tt> is 
	 * less than <tt>b</tt> and should appear before <tt>b</tt> in the sorted 
	 * array.</li>
	 * <li>Zero, if <tt>a</tt> and <tt>b</tt> are equivalent for the purposes of 
	 * this sort.</li>
	 * <li>A value greater than zero, if <tt>a</tt> is greater than <tt>b</tt> 
	 * for the purposes of the sort.</li>
	 * </ul>
	 * @return A reference to the current array.
	 * @see #sort()
	 * @see jsx.core.ArrayLikes#sort(ArrayLike, JsFunction)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsArray sort(JsFunction<? extends Number> orderfunc) {
		return new JsArray(call(sort, orderfunc));
	}
	/**
	 * <p>Deletes elements, numbered by the second value of <tt>args</tt>, starting with and 
	 * including the element positioned by the first value of <tt>args</tt>, and replaces 
	 * them with the values listed by <tt>args</tt> from the third value. Array elements 
	 * that appear after the insertion or deletion are moved as necessary so that they 
	 * remain contiguous with the rest of the array.</p> 
	 * <p>Note that, this invocation modifies the current array directly.</p>
	 * @param args A list of the argument values. The first value specifies the array 
	 * index at which the deletion and insertion is to begin. The second value specifies 
	 * the number of elements, starting with and including the element positioned by the 
	 * first value, to be deleted from the current array. If the second value is undefined, 
	 * this invocation deletes all elements from the position specified by the first value 
	 * to the end of the array. The rest of the list provides the values to be inserted 
	 * into the current array, beginning at the position specified by the first value.
	 * @return An array containing the elements, if any, deleted from the current array.
	 * @see #slice(Vars)
	 * @see #slice(Object)
	 * @see #slice(Object, Object)
	 * @see #splice(Object)
	 * @see #splice(Object, Object)
	 * @see #splice(Object, Object, Object)
	 * @see #splice(Object, Object, Vars)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsArray splice(Vars<?> args) {
		return new JsArray(call(splice, args));
	}
	/**
	 * <p>Deletes zero or more array elements starting with and including the element 
	 * positioned by <tt>start</tt>.</p>
	 * <p>Note that, this invocation modifies the current array directly.</p>
	 * @param start The array index at which the insertion and/or deletion is to begin.
	 * @return An array containing the elements, if any, deleted from the current array.
	 * @see #slice(Vars)
	 * @see #slice(Object)
	 * @see #slice(Object, Object)
	 * @see #splice(Vars)
	 * @see #splice(Object, Object)
	 * @see #splice(Object, Object, Object)
	 * @see #splice(Object, Object, Vars)
	 * @see jsx.core.ArrayLikes#splice(ArrayLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsArray splice(Object start) {
		return new JsArray(call(splice, start));
	}
	/**
	 * <p>Deletes <tt>deleteCount</tt> elements of the current array instance starting 
	 * with and including the element positioned by <tt>start</tt>. Array elements 
	 * that appear after deletion are moved as necessary so that they remain contiguous 
	 * with the rest of the array.</p> 
	 * <p>Note that, this invocation modifies the current array directly.</p>
	 * @param start The array index at which the deletion is to begin.
	 * @param deleteCount The number of elements, starting with and including the element 
	 * positioned by <tt>start</tt>, to be deleted from the current array. If this 
	 * argument is undefined, this invocation deletes all elements from <tt>start</tt> to the end 
	 * of the array.
	 * @return An array containing the elements, if any, deleted from the current array.
	 * @see #slice(Vars)
	 * @see #slice(Object)
	 * @see #slice(Object, Object)
	 * @see #splice(Object)
	 * @see #splice(Vars)
	 * @see #splice(Object, Object, Object)
	 * @see #splice(Object, Object, Vars)
	 * @see jsx.core.ArrayLikes#splice(ArrayLike, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsArray splice(Object start, Object deleteCount) {
		return new JsArray(call(splice, new Vars<Object>().add(start).add(deleteCount)));
	}
	/**
	 * <p>Deletes <tt>deleteCount</tt> elements starting with and including the 
	 * element positioned by <tt>start</tt> and replaces them with the argument 
	 * <tt>value</tt>. Array elements that appear after the insertion or deletion are 
	 * moved as necessary so that they remain contiguous with the rest of the array.</p> 
	 * <p>Note that, this invocation modifies the current array directly.</p>
	 * @param start The array index at which the deletion and insertion is to begin.
	 * @param deleteCount The number of elements, starting with and including the element 
	 * positioned by <tt>start</tt>, to be deleted from the current array. If this 
	 * argument is undefined, this invocation deletes all elements from <tt>start</tt> to the end 
	 * of the array.
	 * @param value The value to be inserted into the current array, beginning at the index 
	 * specified by <tt>start</tt>.
	 * @return An array containing the elements, if any, deleted from the current array.
	 * @see #slice(Vars)
	 * @see #slice(Object)
	 * @see #slice(Object, Object)
	 * @see #splice(Object)
	 * @see #splice(Vars)
	 * @see #splice(Object, Object)
	 * @see #splice(Object, Object, Vars)
	 * @see jsx.core.ArrayLikes#splice(ArrayLike, Object, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsArray splice(Object start, Object deleteCount, Object value) {
		return new JsArray(call(splice, new Vars<Object>().add(start).add(deleteCount).add(value)));
	}
	/**
	 * <p>Deletes <tt>deleteCount</tt> elements starting with and including the 
	 * element positioned by <tt>start</tt> and replaces them with the values listed by 
	 * <tt>args</tt>. Array elements that appear after the insertion or deletion are 
	 * moved as necessary so that they remain contiguous with the rest of the array.</p> 
	 * <p>Note that, this invocation modifies the current array directly.</p>
	 * @param start The array index at which the deletion and insertion is to begin.
	 * @param deleteCount The number of elements, starting with and including the element 
	 * positioned by <tt>start</tt>, to be deleted from the current array. If this 
	 * argument is undefined, this invocation deletes all elements from <tt>start</tt> to the end 
	 * of the array.
	 * @param args A list of the argument values to be inserted into the current array, 
	 * beginning at the index specified by <tt>start</tt>.
	 * @return An array containing the elements, if any, deleted from the current array.
	 * @see #slice(Vars)
	 * @see #slice(Object)
	 * @see #slice(Object, Object)
	 * @see #splice(Object)
	 * @see #splice(Vars)
	 * @see #splice(Object, Object)
	 * @see #splice(Object, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsArray splice(Object start, Object deleteCount, Vars<?> args) {
		return new JsArray(call(splice, new Vars<Object>().add(start).add(deleteCount).addAll(args)));
	}
	/**
	 * <p>Inserts a list of values at the beginning of the current array instance, 
	 * shifting the existing elements to higher indexes to make room. The first value of 
	 * the argument list becomes the new element 0 of the array; the second value, if any, 
	 * becomes the new element 1; and so on. Note that this invocation does not create a 
	 * new array; it modifies the current array directly.</p>
	 * @param args A list of the argument values that are inserted at the start of 
	 * the current array.
	 * @return The new length of the current array.
	 * @see #unshift(Object)
	 * @see #shift()
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final int unshift(Vars<?> args) {
		return call(unshift, args).intValue();
	}
	/**
	 * <p>Inserts the argument at the beginning of the current array instance, 
	 * shifting the existing elements to higher indexes to make room. The argument becomes 
	 * the new element 0 of the array. Note that this invocation does not create a new 
	 * array; it modifies the current array directly.</p>
	 * @param arg A value that is inserted at the start of the current array.
	 * @return The new length of the current array.
	 * @see #unshift(Vars)
	 * @see #shift()
	 * @see jsx.core.ArrayLikes#unshift(ArrayLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final int unshift(Object arg) {
		return call(unshift, arg).intValue();
	}

	/**
	 * <p>Returns the primitive value associated with the current instance, if there is one. 
	 * This invocation simply returns the instance itself for the current array instance 
	 * is an object and there is no primitive value for it.</p>
	 * @return The current array itself.
	 * @see #toString()
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	@Override
	public JsArray valueOf() {
		return var().valueOf();
	}

	/**
	 * <p>Logically evaluates the current instance.</p>
	 * @return The logical value of the current instance.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the instance invocation of this method, that is, 
	 * replacing it with its current instance.
	 */
	public final boolean be() {
		return Js.be(var());
	}

	/**
	 * <p>Inverts the boolean value of the current instance, resembling the 
	 * logical NOT operator in JavaScript.</p>
	 * <p>This operation converts the current instance to a boolean value using 
	 * the following rules if necessary before inverting the converted value.</p>
	 * <ul>
	 * <li>If a number is used where a boolean value is expected, the number is converted 
	 * to <tt>true</tt> unless the number is 0 or NaN, which are converted to <tt>false</tt>.</li>
	 * <li>If a string is used where a boolean value is expected, it is converted to <tt>true</tt> 
	 * except for the empty string, which is converted to <tt>false</tt>.</li>
	 * <li><tt>null</tt> and the undefined value convert to <tt>false</tt>, and any 
	 * non-null object, array, or function converts to <tt>true</tt>.
	 * </ul>
	 * <p>You can convert any value <tt>x</tt> to its equivalent boolean value by applying 
	 * this operation twice: <tt>Js.not(Js.not(x))</tt></p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical NOT operator of the 
	 * Java language like this:
	 * <pre>!Js.be(var)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @return The inverted boolean value.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>!a</pre>
	 * where <tt>a</tt> is the current array instance of the invocation of this method.
	 */
	public final boolean not() {
		return Js.not(this);
	}

	/**
	 * <p>Checks if the current array instance is an instance of the second operand, 
	 * resembling the <tt>instanceof</tt> operator in JavaScript.</p>
	 * <p>This operation expects the first operand be an object and the second be a class 
	 * of objects. In JavaScript, classes of objects are defined by the constructor function 
	 * that initializes them.</p>
	 * @param other A constructor function.
	 * @return <tt>true</tt> if the current primitive instance is an instance of the second 
	 * operand; <tt>false</tt>, otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>a instanceof other</pre>
	 * where <tt>a</tt> is the current array instance of the invocation of this method.
	 */
	public final boolean instanceOf(Object other) {
		return Js.instanceOf(this, other);
	}

	/**
	 * <p>Checks whether the two operands are "equal" using a more relaxed definition of 
	 * sameness that allows type conversions, resembling the equality operator in 
	 * JavaScript.</p>
	 * <p>The equality and identity operations check whether two values are the same, using 
	 * two different definitions of sameness. Both operations accept operands of any type, 
	 * and both return <tt>true</tt> if their operands are the same and <tt>false</tt> 
	 * if they are different. The identity operation checks whether its two operands are 
	 * "identical" using a strict definition of sameness. The equality operation checks 
	 * whether its two operands are "equal" using a more relaxed definition of sameness 
	 * that allows type conversions.</p>
	 * <p>The identity operation is standardized by ECMAScript v3 and implemented in 
	 * JavaScript 1.3 and later. Be sure you understand the differences between the 
	 * assignment, equality, and identity operations, and be careful to use the correct one 
	 * when coding! Although it is tempting to call all three operations "equals," it may 
	 * help to reduce confusion if you read "gets or is assigned" for assignment operation, 
	 * "is equal to" for equality operation, and "is identical to" for identity operation.</p>
	 * <p>In JavaScript, numbers, strings, and boolean values are compared by value. In this 
	 * case, two separate values are involved, and the equality and identity operations 
	 * check that these two values are identical. This means that two variables are equal 
	 * or identical only if they contain the same value. For example, two strings are equal 
	 * only if they each contain exactly the same characters.</p>
	 * <p>On the other hand, objects, arrays, and functions are compared by reference. This 
	 * means that two variables are equal only if they refer to the same object. Two 
	 * separate arrays are never equal or identical, even if they contain equal or identical 
	 * elements. Two variables that contain references to objects, arrays, or functions are 
	 * equal only if they refer to the same object, array, or function. If you want to test 
	 * that two distinct objects contain the same properties or that two distinct arrays 
	 * contain the same elements, you'll have to check the properties or elements individually 
	 * for equality or identity. And, if any of the properties or elements are themselves 
	 * objects or arrays, you'll have to decide how deep you want the comparison to go.</p>
	 * <p>The following rules determine whether two values are equal according to the 
	 * equality operation:
	 * <ul>
	 * <li>If the two values have the same type, test them for identity. If the values are 
	 * identical, they are equal; if they are not identical, they are not equal.</li>
	 * <li>If the two values do not have the same type, they may still be equal. Use the 
	 * following rules and type conversions to check for equality:</li>
	 * <ul>
	 * <li>If one value is null and the other is undefined, they are equal.</li>
	 * <li>If one value is a number and the other is a string, convert the string to a 
	 * number and try the comparison again, using the converted value.</li>
	 * <li>If either value is <tt>true</tt>, convert it to 1 and try the comparison 
	 * again. If either value is <tt>false</tt>, convert it to 0 and try the comparison 
	 * again.</li>
	 * <li>If one value is an object and the other is a number or string, convert the 
	 * object to a primitive and try the comparison again. An object is converted to a 
	 * primitive value by either its <tt>toString()</tt> method or its <tt>valueOf()</tt> 
	 * method. The built-in classes of core JavaScript attempt <tt>valueOf()</tt> 
	 * conversion before <tt>toString()</tt> conversion, except for the Date class, 
	 * which performs <tt>toString()</tt> conversion. Objects that are not part of core 
	 * JavaScript may convert themselves to primitive values in an implementation-defined 
	 * way.</li>
	 * <li>Any other combinations of values are not equal.</li>
	 * </ul>
	 * </ul>
	 * @param other Any value or object.
	 * @return <tt>true</tt> if the first operand equals the second; <tt>false</tt>, 
	 * otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>a == other</pre>
	 * where <tt>a</tt> is the current array instance of the invocation of this method.
	 */
	public final boolean eq(Object other) {
		return Js.eq(var(), other);
	}

	/**
	 * <p>Checks whether the two operands are "identical" using a strict definition of 
	 * sameness, resembling the identity operator in JavaScript.</p>
	 * <p>The equality and identity operations check whether two values are the same, using 
	 * two different definitions of sameness. Both operations accept operands of any type, 
	 * and both return <tt>true</tt> if their operands are the same and <tt>false</tt> 
	 * if they are different. The identity operation checks whether its two operands are 
	 * "identical" using a strict definition of sameness. The equality operation checks 
	 * whether its two operands are "equal" using a more relaxed definition of sameness 
	 * that allows type conversions.</p>
	 * <p>The identity operation is standardized by ECMAScript v3 and implemented in 
	 * JavaScript 1.3 and later. Be sure you understand the differences between the 
	 * assignment, equality, and identity operations, and be careful to use the correct one 
	 * when coding! Although it is tempting to call all three operations "equals," it may 
	 * help to reduce confusion if you read "gets or is assigned" for assignment operation, 
	 * "is equal to" for equality operation, and "is identical to" for identity operation.</p>
	 * <p>In JavaScript, numbers, strings, and boolean values are compared by value. In this 
	 * case, two separate values are involved, and the equality and identity operations 
	 * check that these two values are identical. This means that two variables are equal 
	 * or identical only if they contain the same value. For example, two strings are equal 
	 * only if they each contain exactly the same characters.</p>
	 * <p>On the other hand, objects, arrays, and functions are compared by reference. This 
	 * means that two variables are equal only if they refer to the same object. Two 
	 * separate arrays are never equal or identical, even if they contain equal or identical 
	 * elements. Two variables that contain references to objects, arrays, or functions are 
	 * equal only if they refer to the same object, array, or function. If you want to test 
	 * that two distinct objects contain the same properties or that two distinct arrays 
	 * contain the same elements, you'll have to check the properties or elements individually 
	 * for equality or identity. And, if any of the properties or elements are themselves 
	 * objects or arrays, you'll have to decide how deep you want the comparison to go.</p>
	 * <p>The following rules determine whether two values are identical according to the identity operation:
	 * <ul>
	 * <li>If the two values have different types, they are not identical.</li>
	 * <li>If both values are numbers and have the same value, they are identical, unless 
	 * either or both values are <tt>NaN</tt>, in which case they are not identical. 
	 * The <tt>NaN</tt> value is never identical to any other value, including itself! 
	 * To check whether a value is <tt>NaN</tt>, use the global {@link Js#isNaN(Object)} 
	 * function.</li>
	 * <li>If both values are strings and contain exactly the same characters in the same 
	 * positions, they are identical. If the strings differ in length or content, they are 
	 * not identical. Note that in some cases, the Unicode standard allows more than one 
	 * way to encode the same string. For efficiency, however, JavaScript's string 
	 * comparison compares strictly on a character-by-character basis, and it assumes that 
	 * all strings have been converted to a "normalized form" before they are compared. 
	 * See the {@link StringLike#localeCompare(Object)} for another way to compare strings.</li>
	 * <li>If both values are the boolean value <tt>true</tt> or both are the boolean 
	 * value <tt>false</tt>, they are identical.</li>
	 * <li>If both values refer to the same object, array, or function, they are identical. 
	 * If they refer to different objects (or arrays or functions) they are not identical, 
	 * even if both objects have identical properties or both arrays have identical elements.</li>
	 * <li>If both values are null or both values are undefined, they are identical.</li>
	 * </ul>
	 * @param other Any value or object.
	 * @return <tt>true</tt> if the first operand is identical to the second; 
	 * <tt>false</tt>, otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>a === other</pre>
	 * where <tt>a</tt> is the current array instance of the invocation of this method.
	 */
	public final boolean eqs(Object other) {
		return Js.eqs(this, other);
	}

	/**
	 * <p>Checks whether the two operands are not "equal" using a more relaxed definition of 
	 * sameness that allows type conversions, resembling the equality operator in 
	 * JavaScript.</p>
	 * <p>The equality and identity operations check whether two values are the same, using 
	 * two different definitions of sameness. Both operations accept operands of any type, 
	 * and both return <tt>true</tt> if their operands are the same and <tt>false</tt> 
	 * if they are different. The identity operation checks whether its two operands are 
	 * "identical" using a strict definition of sameness. The equality operation checks 
	 * whether its two operands are "equal" using a more relaxed definition of sameness 
	 * that allows type conversions.</p>
	 * <p>The identity operation is standardized by ECMAScript v3 and implemented in 
	 * JavaScript 1.3 and later. Be sure you understand the differences between the 
	 * assignment, equality, and identity operations, and be careful to use the correct one 
	 * when coding! Although it is tempting to call all three operations "equals," it may 
	 * help to reduce confusion if you read "gets or is assigned" for assignment operation, 
	 * "is equal to" for equality operation, and "is identical to" for identity operation.</p>
	 * <p>In JavaScript, numbers, strings, and boolean values are compared by value. In this 
	 * case, two separate values are involved, and the equality and identity operations 
	 * check that these two values are identical. This means that two variables are equal 
	 * or identical only if they contain the same value. For example, two strings are equal 
	 * only if they each contain exactly the same characters.</p>
	 * <p>On the other hand, objects, arrays, and functions are compared by reference. This 
	 * means that two variables are equal only if they refer to the same object. Two 
	 * separate arrays are never equal or identical, even if they contain equal or identical 
	 * elements. Two variables that contain references to objects, arrays, or functions are 
	 * equal only if they refer to the same object, array, or function. If you want to test 
	 * that two distinct objects contain the same properties or that two distinct arrays 
	 * contain the same elements, you'll have to check the properties or elements individually 
	 * for equality or identity. And, if any of the properties or elements are themselves 
	 * objects or arrays, you'll have to decide how deep you want the comparison to go.</p>
	 * <p>The following rules determine whether two values are equal according to the 
	 * equality operation:
	 * <ul>
	 * <li>If the two values have the same type, test them for identity. If the values are 
	 * identical, they are equal; if they are not identical, they are not equal.</li>
	 * <li>If the two values do not have the same type, they may still be equal. Use the 
	 * following rules and type conversions to check for equality:</li>
	 * <ul>
	 * <li>If one value is null and the other is undefined, they are equal.</li>
	 * <li>If one value is a number and the other is a string, convert the string to a 
	 * number and try the comparison again, using the converted value.</li>
	 * <li>If either value is <tt>true</tt>, convert it to 1 and try the comparison 
	 * again. If either value is <tt>false</tt>, convert it to 0 and try the comparison 
	 * again.</li>
	 * <li>If one value is an object and the other is a number or string, convert the 
	 * object to a primitive and try the comparison again. An object is converted to a 
	 * primitive value by either its <tt>toString()</tt> method or its <tt>valueOf()</tt> 
	 * method. The built-in classes of core JavaScript attempt <tt>valueOf()</tt> 
	 * conversion before <tt>toString()</tt> conversion, except for the Date class, 
	 * which performs <tt>toString()</tt> conversion. Objects that are not part of core 
	 * JavaScript may convert themselves to primitive values in an implementation-defined 
	 * way.</li>
	 * <li>Any other combinations of values are not equal.</li>
	 * </ul>
	 * </ul>
	 * @param other Any value or object.
	 * @return <tt>false</tt> if the first operand equals the second; <tt>true</tt>, 
	 * otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>a != other</pre>
	 * where <tt>a</tt> is the current array instance of the invocation of this method.
	 */
	public final boolean neq(Object other) {
		return Js.neq(var(), other);
	}

	/**
	 * <p>Checks whether the two operands are not "identical" using a strict definition of 
	 * sameness, resembling the identity operator in JavaScript.</p>
	 * <p>The equality and identity operations check whether two values are the same, using 
	 * two different definitions of sameness. Both operations accept operands of any type, 
	 * and both return <tt>true</tt> if their operands are the same and <tt>false</tt> 
	 * if they are different. The identity operation checks whether its two operands are 
	 * "identical" using a strict definition of sameness. The equality operation checks 
	 * whether its two operands are "equal" using a more relaxed definition of sameness 
	 * that allows type conversions.</p>
	 * <p>The identity operation is standardized by ECMAScript v3 and implemented in 
	 * JavaScript 1.3 and later. Be sure you understand the differences between the 
	 * assignment, equality, and identity operations, and be careful to use the correct one 
	 * when coding! Although it is tempting to call all three operations "equals," it may 
	 * help to reduce confusion if you read "gets or is assigned" for assignment operation, 
	 * "is equal to" for equality operation, and "is identical to" for identity operation.</p>
	 * <p>In JavaScript, numbers, strings, and boolean values are compared by value. In this 
	 * case, two separate values are involved, and the equality and identity operations 
	 * check that these two values are identical. This means that two variables are equal 
	 * or identical only if they contain the same value. For example, two strings are equal 
	 * only if they each contain exactly the same characters.</p>
	 * <p>On the other hand, objects, arrays, and functions are compared by reference. This 
	 * means that two variables are equal only if they refer to the same object. Two 
	 * separate arrays are never equal or identical, even if they contain equal or identical 
	 * elements. Two variables that contain references to objects, arrays, or functions are 
	 * equal only if they refer to the same object, array, or function. If you want to test 
	 * that two distinct objects contain the same properties or that two distinct arrays 
	 * contain the same elements, you'll have to check the properties or elements individually 
	 * for equality or identity. And, if any of the properties or elements are themselves 
	 * objects or arrays, you'll have to decide how deep you want the comparison to go.</p>
	 * <p>The following rules determine whether two values are identical according to the identity operation:
	 * <ul>
	 * <li>If the two values have different types, they are not identical.</li>
	 * <li>If both values are numbers and have the same value, they are identical, unless 
	 * either or both values are <tt>NaN</tt>, in which case they are not identical. 
	 * The <tt>NaN</tt> value is never identical to any other value, including itself! 
	 * To check whether a value is <tt>NaN</tt>, use the global {@link Js#isNaN(Object)} 
	 * function.</li>
	 * <li>If both values are strings and contain exactly the same characters in the same 
	 * positions, they are identical. If the strings differ in length or content, they are 
	 * not identical. Note that in some cases, the Unicode standard allows more than one 
	 * way to encode the same string. For efficiency, however, JavaScript's string 
	 * comparison compares strictly on a character-by-character basis, and it assumes that 
	 * all strings have been converted to a "normalized form" before they are compared. 
	 * See the {@link StringLike#localeCompare(Object)} for another way to compare strings.</li>
	 * <li>If both values are the boolean value <tt>true</tt> or both are the boolean 
	 * value <tt>false</tt>, they are identical.</li>
	 * <li>If both values refer to the same object, array, or function, they are identical. 
	 * If they refer to different objects (or arrays or functions) they are not identical, 
	 * even if both objects have identical properties or both arrays have identical elements.</li>
	 * <li>If both values are null or both values are undefined, they are identical.</li>
	 * </ul>
	 * @param other Any value or object.
	 * @return <tt>false</tt> if the first operand is identical to the second; 
	 * <tt>true</tt>, otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>a !== other</pre>
	 * where <tt>a</tt> is the current array instance of the invocation of this method.
	 */
	public final boolean neqs(Object other) {
		return Js.neqs(this, other);
	}

	/**
	 * <p>Adds the current instance to a numeric operand or concatenates it with 
	 * a string operand, resembling the addition operator in JavaScript.</p>
	 * <p>If one value is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link Js#valueOf(Object)}  
	 * method and/or the {@link Js#toString(Object)} method on the object.</p>
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>a + other</pre>
	 * where <tt>a</tt> is the current instance of the invocation of this method.
	 */
	public final String add(Object other) {
		return Js.add(toString(), other);
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
	 * <pre>a && other</pre>
	 * where <tt>a</tt> is the current instance of the invocation of this method.
	 */
	public final Object and(Object other) {
		return Js.and(this, other);
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
	 * <pre>a && other</pre>
	 * where <tt>a</tt> is the current instance of the invocation of this method.
	 */
	public final JsObject and(Var<? extends JsObject> other) {
		return Js.and(this, other);
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
	 * <pre>a && other</pre>
	 * where <tt>a</tt> is the current instance of the invocation of this method.
	 */
	public final JsArray and(JsArray other) {
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
	 * <pre>a || other</pre>
	 * where <tt>a</tt> is the current instance of the invocation of this method.
	 */
	public final Object or(Object other) {
		return Js.or(this, other);
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
	 * <pre>a || other</pre>
	 * where <tt>a</tt> is the current instance of the invocation of this method.
	 */
	public final JsObject or(Var<? extends JsObject> other) {
		return Js.or(this, other);
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
	 * <pre>a || other</pre>
	 * where <tt>a</tt> is the current instance of the invocation of this method.
	 */
	public final JsArray or(JsArray other) {
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
	 * <pre>test ? a : other</pre>
	 * where <tt>a</tt> is the current instance of the invocation of this method.
	 */
	public final Object cond(Object test, Object other) {
		return Js.cond(test, this, other);
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
	 * <pre>test ? a : other</pre>
	 * where <tt>a</tt> is the current instance of the invocation of this method.
	 */
	public final JsObject cond(Object test, Var<? extends JsObject> other) {
		return Js.cond(test, this, other);
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
	 * <pre>test ? a : other</pre>
	 * where <tt>a</tt> is the current instance of the invocation of this method.
	 */
	public final JsArray cond(Object test, JsArray other) {
		return Js.cond(test, this, other);
	}
}
