
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
 * <p>An <b>opaque</b> class representing JavaScript date objects.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsDate extends JsGlobal.Date.Prototype implements DateLike
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
	public static class Member extends JsGlobal.Date.Prototype.Member
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
		public JsDate with(ObjectLike o) {
			return new JsDate((JsObject)var(o).var(mid()));
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
		public final JsFunction.Member<JsDate> constructor = new JsFunction.Member<JsDate>(this, Members.constructor, Generic.get(JsDate.class));
	}

	/**
	 * <p>Internally constructs a date object.</p>
	 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * <p>Note that, The Java class <tt>java.lang.String</tt> and Java basic classes that 
	 * wrap primitive data types are also "primitive" to JS.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
	 */
	protected JsDate(Object var) {
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
	public JsDate(JsObject var) {
		super(var(var, (JsDate)null));
	}
	/**
	 * <p>Constructs a date object set to the current date and time.</p>
	 * @since 1.0
	 * @see Js#date()
	 * @see #JsDate(js.core.JsObject)
	 * @see #JsDate(NumberLike)
	 * @see #JsDate(String)
	 * @see #JsDate(StringLike)
	 * @see #JsDate(Object, Object)
	 * @see #JsDate(Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object, Object, Object)
	 * @see js.core.JsGlobal.Date#create()
	 * @see js.core.JsGlobal.Date#create(Vars)
	 * @javascript Re-compilers must replace the construction operation of this constructor 
	 * with the JavaScript expression:
	 * <pre>new Date(milliseconds)</pre>
	 */
	public JsDate() {
		this(JsGlobal.Date.with().create());
	}
	/**
	 * <p>Constructs a date object taking <tt>milliseconds</tt> as the internal numeric 
	 * representation as returned by {@link #getTime()}.</p>
	 * @param milliseconds The numeric representation of the date in milliseconds.
	 * @since 1.0
	 * @see Js#date(Number)
	 * @see #JsDate(js.core.JsObject)
	 * @see #JsDate(NumberLike)
	 * @see #JsDate(String)
	 * @see #JsDate(StringLike)
	 * @see #JsDate(Object, Object)
	 * @see #JsDate(Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object, Object, Object)
	 * @see js.core.JsGlobal.Date#create()
	 * @see js.core.JsGlobal.Date#create(Vars)
	 * @see js.core.JsGlobal.Date#create(Number)
	 * @see js.core.JsGlobal.Date#create(NumberLike)
	 * @see js.core.JsGlobal.Date#create(Object)
	 * @javascript Re-compilers must replace the construction operation of this constructor 
	 * with the JavaScript expression:
	 * <pre>new Date(milliseconds)</pre>
	 */
	public JsDate(Number milliseconds) {
		this(JsGlobal.Date.with().create(milliseconds));
	}
	/**
	 * <p>Constructs a date object taking <tt>milliseconds</tt> as the internal numeric 
	 * representation as returned by {@link #getTime()}.</p>
	 * @param milliseconds The numeric representation of the date in milliseconds.
	 * @since 1.0
	 * @see Js#date(Number)
	 * @see #JsDate(js.core.JsObject)
	 * @see #JsDate(Number)
	 * @see #JsDate(String)
	 * @see #JsDate(StringLike)
	 * @see #JsDate(Object, Object)
	 * @see #JsDate(Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object, Object, Object)
	 * @see js.core.JsGlobal.Date#create(Vars)
	 * @see js.core.JsGlobal.Date#create(Number)
	 * @see js.core.JsGlobal.Date#create(NumberLike)
	 * @see js.core.JsGlobal.Date#create(Object)
	 * @javascript Re-compilers must replace the construction operation of this constructor 
	 * with the JavaScript expression:
	 * <pre>new Date(milliseconds)</pre>
	 */
	public JsDate(NumberLike<?> milliseconds) {
		this(JsGlobal.Date.with().create(milliseconds));
	}
	/**
	 * <p>Constructs a date object taking <tt>datestring</tt> as the string representation, 
	 * in the format accepted by the {@link js.core.JsGlobal.Date#parse(Object)} method.</p>
	 * @param datestring The string representation of the date to construct.
	 * @since 1.0
	 * @see Js#date(String)
	 * @see #JsDate(js.core.JsObject)
	 * @see #JsDate(Number)
	 * @see #JsDate(NumberLike)
	 * @see #JsDate(StringLike)
	 * @see #JsDate(Object, Object)
	 * @see #JsDate(Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object, Object, Object)
	 * @see js.core.JsGlobal.Date#create(Vars)
	 * @see js.core.JsGlobal.Date#create(Object)
	 * @javascript Re-compilers must replace the construction operation of this constructor 
	 * with the JavaScript expression:
	 * <pre>new Date(datestring)</pre>
	 */
	public JsDate(String datestring) {
		this(JsGlobal.Date.with().create(datestring));
	}
	/**
	 * <p>Constructs a date object taking <tt>datestring</tt> as the string representation, 
	 * in the format accepted by the {@link js.core.JsGlobal.Date#parse(Object)} method.</p>
	 * @param datestring The string representation of the date to construct.
	 * @since 1.0
	 * @see Js#date(String)
	 * @see #JsDate(js.core.JsObject)
	 * @see #JsDate(Number)
	 * @see #JsDate(NumberLike)
	 * @see #JsDate(String)
	 * @see #JsDate(Object, Object)
	 * @see #JsDate(Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object, Object, Object)
	 * @see js.core.JsGlobal.Date#create(Vars)
	 * @see js.core.JsGlobal.Date#create(Object)
	 * @javascript Re-compilers must replace the construction operation of this constructor 
	 * with the JavaScript expression:
	 * <pre>new Date(datestring)</pre>
	 */
	public JsDate(StringLike datestring) {
		this(JsGlobal.Date.with().create(datestring));
	}
	/**
	 * <p>Constructs a date object with two to seven numeric arguments that specify the 
	 * individual fields of the date and time. All but the first two arguments, the year 
	 * and month fields, are optional.</p>
	 * <p>Note that these date and time fields are specified using local time, not 
	 * Coordinated Universal Time (UTC) (which is similar to Greenwich Mean Time [GMT]). 
	 * See the static {@link js.core.JsGlobal.Date#UTC(Object, Object)}
	 * method for an alternative.</p>
	 * @param yr The year, in four-digit format. For compatibility with early implementations 
	 * of JavaScript, if this argument is between 0 and 99, 1900 is added to it.
	 * @param mo The month, specified as an integer from 0 (January) to 11 (December).
	 * @since 1.0
	 * @see #JsDate(js.core.JsObject)
	 * @see #JsDate(Number)
	 * @see #JsDate(NumberLike)
	 * @see #JsDate(String)
	 * @see #JsDate(StringLike)
	 * @see #JsDate(Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object, Object, Object)
	 * @see js.core.JsGlobal.Date#create(Object, Object)
	 * @javascript Re-compilers must replace the construction operation of this constructor 
	 * with the JavaScript expression:
	 * <pre>new Date(yr, mo)</pre>
	 */
	public JsDate(Object yr, Object mo) {
		this(JsGlobal.Date.with().create(new Vars<Object>().add(yr).add(mo)));
	}
	/**
	 * <p>Constructs a date object with two to seven numeric arguments that specify the 
	 * individual fields of the date and time. All but the first two arguments, the year 
	 * and month fields, are optional.</p>
	 * <p>Note that these date and time fields are specified using local time, not 
	 * Coordinated Universal Time (UTC) (which is similar to Greenwich Mean Time [GMT]). 
	 * See the static {@link js.core.JsGlobal.Date#UTC(Object, Object, Object)}
	 * method for an alternative.</p>
	 * @param yr The year, in four-digit format. For compatibility with early implementations 
	 * of JavaScript, if this argument is between 0 and 99, 1900 is added to it.
	 * @param mo The month, specified as an integer from 0 (January) to 11 (December).
	 * @param day The day of the month, specified as an integer from 1 to 31. Note that 
	 * this argument uses 1 as its lowest value, while other arguments use 0 as their 
	 * lowest value. Optional.
	 * @since 1.0
	 * @see #JsDate(js.core.JsObject)
	 * @see #JsDate(Number)
	 * @see #JsDate(NumberLike)
	 * @see #JsDate(String)
	 * @see #JsDate(StringLike)
	 * @see #JsDate(Object, Object)
	 * @see #JsDate(Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object, Object, Object)
	 * @see js.core.JsGlobal.Date#create(Object, Object, Object)
	 * @javascript Re-compilers must replace the construction operation of this constructor 
	 * with the JavaScript expression:
	 * <pre>new Date(yr, mo, day)</pre>
	 */
	public JsDate(Object yr, Object mo, Object day) {
		this(JsGlobal.Date.with().create(new Vars<Object>().add(yr).add(mo).add(day)));
	}
	/**
	 * <p>Constructs a date object with two to seven numeric arguments that specify the 
	 * individual fields of the date and time. All but the first two arguments, the year 
	 * and month fields, are optional.</p>
	 * <p>Note that these date and time fields are specified using local time, not 
	 * Coordinated Universal Time (UTC) (which is similar to Greenwich Mean Time [GMT]). 
	 * See the static {@link js.core.JsGlobal.Date#UTC(Object, Object, Object, Object)}
	 * method for an alternative.</p>
	 * @param yr The year, in four-digit format. For compatibility with early implementations 
	 * of JavaScript, if this argument is between 0 and 99, 1900 is added to it.
	 * @param mo The month, specified as an integer from 0 (January) to 11 (December).
	 * @param day The day of the month, specified as an integer from 1 to 31. Note that 
	 * this argument uses 1 as its lowest value, while other arguments use 0 as their 
	 * lowest value. Optional.
	 * @param hr The hour, specified as an integer from 0 (midnight) to 23 (11 p.m.). 
	 * Optional.
	 * @see #JsDate(js.core.JsObject)
	 * @see #JsDate(Number)
	 * @see #JsDate(NumberLike)
	 * @see #JsDate(String)
	 * @see #JsDate(StringLike)
	 * @see #JsDate(Object, Object)
	 * @see #JsDate(Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object, Object, Object)
	 * @see js.core.JsGlobal.Date#create(Object, Object, Object, Object)
	 * @javascript Re-compilers must replace the construction operation of this constructor 
	 * with the JavaScript expression:
	 * <pre>new Date(yr, mo, day, hr)</pre>
	 */
	public JsDate(Object yr, Object mo, Object day, Object hr) {
		this(JsGlobal.Date.with().create(new Vars<Object>().add(yr).add(mo).add(day).add(hr)));
	}
	/**
	 * <p>Constructs a date object with two to seven numeric arguments that specify the 
	 * individual fields of the date and time. All but the first two arguments, the year 
	 * and month fields, are optional.</p>
	 * <p>Note that these date and time fields are specified using local time, not 
	 * Coordinated Universal Time (UTC) (which is similar to Greenwich Mean Time [GMT]). 
	 * See the static {@link js.core.JsGlobal.Date#UTC(Object, Object, Object, Object, Object)}
	 * method for an alternative.</p>
	 * @param yr The year, in four-digit format. For compatibility with early implementations 
	 * of JavaScript, if this argument is between 0 and 99, 1900 is added to it.
	 * @param mo The month, specified as an integer from 0 (January) to 11 (December).
	 * @param day The day of the month, specified as an integer from 1 to 31. Note that 
	 * this argument uses 1 as its lowest value, while other arguments use 0 as their 
	 * lowest value. Optional.
	 * @param hr The hour, specified as an integer from 0 (midnight) to 23 (11 p.m.). 
	 * Optional.
	 * @param min The minutes in the hour, specified as an integer from 0 to 59. Optional.
	 * @since 1.0
	 * @see #JsDate(js.core.JsObject)
	 * @see #JsDate(Number)
	 * @see #JsDate(NumberLike)
	 * @see #JsDate(String)
	 * @see #JsDate(StringLike)
	 * @see #JsDate(Object, Object)
	 * @see #JsDate(Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object, Object, Object)
	 * @see js.core.JsGlobal.Date#create(Object, Object, Object, Object, Object)
	 * @javascript Re-compilers must replace the construction operation of this constructor 
	 * with the JavaScript expression:
	 * <pre>new Date(yr, mo, day, hr, min)</pre>
	 */
	public JsDate(Object yr, Object mo, Object day, Object hr, Object min) {
		this(JsGlobal.Date.with().create(new Vars<Object>().add(yr).add(mo).add(day).add(hr).add(min)));
	}
	/**
	 * <p>Constructs a date object with two to seven numeric arguments that specify the 
	 * individual fields of the date and time. All but the first two arguments, the year 
	 * and month fields, are optional.</p>
	 * <p>Note that these date and time fields are specified using local time, not 
	 * Coordinated Universal Time (UTC) (which is similar to Greenwich Mean Time [GMT]). 
	 * See the static {@link js.core.JsGlobal.Date#UTC(Object, Object, Object, Object, Object, Object)}
	 * method for an alternative.</p>
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
	 * @since 1.0
	 * @see #JsDate(js.core.JsObject)
	 * @see #JsDate(Number)
	 * @see #JsDate(NumberLike)
	 * @see #JsDate(String)
	 * @see #JsDate(StringLike)
	 * @see #JsDate(Object, Object)
	 * @see #JsDate(Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object, Object, Object)
	 * @see js.core.JsGlobal.Date#create(Object, Object, Object, Object, Object, Object)
	 * @javascript Re-compilers must replace the construction operation of this constructor 
	 * with the JavaScript expression:
	 * <pre>new Date(yr, mo, day, hr, min, sec)</pre>
	 */
	public JsDate(Object yr, Object mo, Object day, Object hr, Object min, Object sec) {
		this(JsGlobal.Date.with().create(new Vars<Object>().add(yr).add(mo).add(day).add(hr).add(min).add(sec)));
	}
	/**
	 * <p>Constructs a date object with two to seven numeric arguments that specify the 
	 * individual fields of the date and time. All but the first two arguments, the year 
	 * and month fields, are optional.</p>
	 * <p>Note that these date and time fields are specified using local time, not 
	 * Coordinated Universal Time (UTC) (which is similar to Greenwich Mean Time [GMT]). 
	 * See the static {@link js.core.JsGlobal.Date#UTC(Object, Object, Object, Object, Object, Object, Object)}
	 * method for an alternative.</p>
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
	 * @since 1.0
	 * @see #JsDate(js.core.JsObject)
	 * @see #JsDate(Number)
	 * @see #JsDate(NumberLike)
	 * @see #JsDate(String)
	 * @see #JsDate(StringLike)
	 * @see #JsDate(Object, Object)
	 * @see #JsDate(Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object)
	 * @see #JsDate(Object, Object, Object, Object, Object, Object)
	 * @see js.core.JsGlobal.Date#create(Object, Object, Object, Object, Object, Object, Object)
	 * @javascript Re-compilers must replace the construction operation of this constructor 
	 * with the JavaScript expression:
	 * <pre>new Date(yr, mo, day, hr, min, sec, ms)</pre>
	 */
	public JsDate(Object yr, Object mo, Object day, Object hr, Object min, Object sec, Object ms) {
		this(JsGlobal.Date.with().create(new Vars<Object>().add(yr).add(mo).add(day).add(hr).add(min).add(sec).add(ms)));
	}

	/**
	 * <p>Simply returns the current date instance.</p>
	 * <p>This method is useful for JS Simulation to implement opaque types.</p>
	 * @return The current boolean instance.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the instance invocation of this method, that is, 
	 * replacing it with its current instance.
	 */
	@Override
	public JsDate var() {
		return (JsDate)super.var();
	}
	/**
	 * <p>Assigns the value of another date instance to the current date object.</p>
	 * @param var The argument date instance.
	 * @return The new instance.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into 
	 * the JavaScript expression: 
	 * <pre>o = var</pre>
	 * where <tt>o</tt> is the current instance of the invocation of this method.
	 */
	@Override
	public final <S extends JsObject> S var(S var) {
		var(var, (JsDate)null);
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
	public static final JsFunction.Member<JsDate> constructor = new JsFunction.Member<JsDate>(Members.constructor, Generic.get(JsDate.class));

	/**
	 * <p>Returns the internal, millisecond representation of the current date instance.</p>
	 * <p>It converts the current date instance to a single integer. This is useful when 
	 * you want to compare two date instances or to determine the time elapsed between two 
	 * dates. Note that the millisecond representation of a date is independent of the 
	 * time zone, so there is no <tt>getUTCTime()</tt> method in addition to this one. 
	 * Don't confuse this method with the {@link #getDay()} and {@link #getDate()} methods, 
	 * which return the day of the week and the day of the month, respectively</p>
	 * <p>{@link js.core.JsGlobal.Date#parse(Object)} and {@link js.core.JsGlobal.Date#UTC(Object, Object)} 
	 * allow you to convert a date and time specification to a millisecond representation without 
	 * going through the overhead of first creating a date object.</p>
	 * @return The millisecond representation of the current date instance, that is, the 
	 * number of milliseconds between midnight (GMT) on 1/1/1970 and the date and time 
	 * specified by the date.
	 * @see #setTime(Object)
	 * @see js.core.JsGlobal.Date#parse(Object)
	 * @see js.core.JsGlobal.Date#UTC(Object, Object)
	 * @see js.core.JsGlobal.Date#UTC(Object, Object, Object)
	 * @see js.core.JsGlobal.Date#UTC(Object, Object, Object, Object)
	 * @see js.core.JsGlobal.Date#UTC(Object, Object, Object, Object, Object)
	 * @see js.core.JsGlobal.Date#UTC(Object, Object, Object, Object, Object, Object)
	 * @see js.core.JsGlobal.Date#UTC(Object, Object, Object, Object, Object, Object, Object)
	 * @see jsx.core.DateLikes#getTime(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number getTime() {
		return call(getTime);
	}
	/**
	 * <p>Returns the year of the current date instance in full four-digit form, in local 
	 * time.</p>
	 * @return The year that results when the current date instance is expressed in local 
	 * time. The return value is a full four-digit year, including the century, not a 
	 * two-digit abbreviation..
	 * @see #getUTCFullYear()
	 * @see jsx.core.DateLikes#getFullYear(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number getFullYear() {
		return call(getFullYear);
	}
	/**
	 * <p>Returns the year of the current date instance in full four-digit form, in 
	 * universal time.</p>
	 * @return The year that results when the current date instance is expressed in 
	 * universal time. The return value is a full four-digit year, not a two-digit 
	 * abbreviation.
	 * @see #getFullYear()
	 * @see jsx.core.DateLikes#getUTCFullYear(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number getUTCFullYear() {
		return call(getUTCFullYear);
	}
	/**
	 * <p>Returns the month field of the current date instance, in local time.</p>
	 * @return The month of the year that results when the current date instance is 
	 * expressed in local time. The return value is an integer between 0 (January) 
	 * and 11 (December). Note that the date represents the first day of the month as 1 
	 * but represents the first month of the year as 0.
	 * @see #getUTCMonth()
	 * @see jsx.core.DateLikes#getMonth(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number getMonth() {
		return call(getMonth);
	}
	/**
	 * <p>Returns the month field of the current date instance, in universal time.</p>
	 * @return The month of the year that results when the current date instance is 
	 * expressed in universal time. The return value is an integer between 0 (January) 
	 * and 11 (December). Note that the date represents the first day of the month as 1 
	 * but represents the first month of the year as 0.
	 * @see #getMonth()
	 * @see jsx.core.DateLikes#getUTCMonth(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number getUTCMonth() {
		return call(getUTCMonth);
	}
	/**
	 * <p>Returns the day of the month of the current date instance, in local time.</p>
	 * @return The day of the month of the current date instance, using local time. 
	 * Return values are between 1 and 31.
	 * @see #getUTCDate()
	 * @see jsx.core.DateLikes#getDate(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number getDate() {
		return call(getDate);
	}
	/**
	 * <p>Returns the day of the month of the current date instance, in universal time.</p>
	 * @return The day of the month (a value between 1 and 31) that results when the 
	 * current date instance is expressed in universal time.
	 * @see jsx.core.DateLikes#getUTCDate(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number getUTCDate() {
		return call(getUTCDate);
	}
	/**
	 * <p>Returns the day of the week of the current date instance, in local time.</p>
	 * @return The day of the week of the current date instance, using local time. Return values 
	 * are between 0 (Sunday) and 6 (Saturday).
	 * @see #getUTCDay()
	 * @see jsx.core.DateLikes#getDay(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number getDay() {
		return call(getDay);
	}
	/**
	 * <p>Returns the day of the week of current date instance, in universal time.</p>
	 * @return The day of the week that results when the current date instance is expressed 
	 * in universal time. Return values are between 0 (Sunday) and 6 (Saturday).
	 * @see #getDay()
	 * @see jsx.core.DateLikes#getUTCDay(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number getUTCDay() {
		return call(getUTCDay);
	}
	/**
	 * <p>Returns the hours field of the current date instance, in local time.</p>
	 * @return The hours field, expressed in local time, of the current date instance. 
	 * Return values are between 0 (midnight) and 23 (11 p.m.).
	 * @see #getUTCHours()
	 * @see jsx.core.DateLikes#getHours(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number getHours() {
		return call(getHours);
	}
	/**
	 * <p>Returns the hours field of the current date instance, in universal time.</p>
	 * @return The hours field, expressed in universal time, of the current date instance. 
	 * The return value is an integer between 0 (midnight) and 23 (11 p.m.).
	 * @see #getHours()
	 * @see jsx.core.DateLikes#getUTCHours(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number getUTCHours() {
		return call(getUTCHours);
	}
	/**
	 * <p>Returns the minutes field of a Date object, in local or universal time.</p>
	 * @return The minutes field, expressed in local time, of the current date instance. 
	 * Return values are between 0 and 59.
	 * @see #getUTCMinutes()
	 * @see jsx.core.DateLikes#getMinutes(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number getMinutes() {
		return call(getMinutes);
	}
	/**
	 * <p>Returns the minutes field of the current date instance, in universal time.</p>
	 * @return The minutes field, expressed in universal time, of the current date instance. 
	 * The return value is an integer between 0 and 59.
	 * @see #getMinutes()
	 * @see jsx.core.DateLikes#getUTCMinutes(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number getUTCMinutes() {
		return call(getUTCMinutes);
	}
	/**
	 * <p>Returns the seconds field of the current date instance, in local time.</p>
	 * @return The seconds field, expressed in local time, of the current date instance. 
	 * Return values are between 0 and 59.
	 * @see #getUTCSeconds()
	 * @see jsx.core.DateLikes#getSeconds(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number getSeconds() {
		return call(getSeconds);
	}
	/**
	 * <p>Returns the seconds field of the current date instance, in universal time.</p>
	 * @return The seconds field, expressed in universal time, of the current date instance. 
	 * The return value is an integer between 0 and 59.
	 * @see #getSeconds()
	 * @see jsx.core.DateLikes#getUTCSeconds(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number getUTCSeconds() {
		return call(getUTCSeconds);
	}
	/**
	 * <p>Returns the milliseconds field of the current date instance, in local time.</p>
	 * @return The milliseconds field, expressed in local time, of the current date instance.
	 * @see #getUTCMilliseconds()
	 * @see jsx.core.DateLikes#getMilliseconds(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number getMilliseconds() {
		return call(getMilliseconds);
	}
	/**
	 * <p>Returns the milliseconds field of current date instance, in universal time.</p>
	 * @return The milliseconds field, expressed in universal time, of the current date instance.
	 * @see #getMilliseconds()
	 * @see jsx.core.DateLikes#getUTCMilliseconds(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number getUTCMilliseconds() {
		return call(getUTCMilliseconds);
	}
	/**
	 * <p>Returns the difference, in minutes, between the local and UTC representations of 
	 * the current date instance. Note that the value returned depends on whether daylight 
	 * saving time is or would be in effect at the specific date.</p>
	 * <p>The return value is measured in minutes, rather than hours, because some 
	 * countries have time zones that are not at even one-hour intervals.</p>
	 * @return The difference, in minutes, between GMT and local time.
	 * @see jsx.core.DateLikes#getTimezoneOffset(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number getTimezoneOffset() {
		return call(getTimezoneOffset);
	}
	/**
	 * <p>Sets the fields of the current date instance using the millisecond format.</p>
	 * @param time The number of milliseconds between the desired date and time and 
	 * midnight GMT on January 1, 1970. A millisecond value of this type may also be 
	 * passed to the {@link Js#date(Number)}, {@link js.core.JsDate#JsDate(Number)}, 
	 * {@link js.core.JsDate#JsDate(NumberLike)}, {@link js.core.JsDate#JsDate(String)}, 
	 * {@link js.core.JsDate#JsDate(StringLike)}, {@link js.core.JsGlobal.Date#create(Number)} 
	 * or {@link js.core.JsGlobal.Date#create(Number)} and may be obtained by calling the 
	 * {@link js.core.JsGlobal.Date#UTC(Object, Object)} and {@link js.core.JsGlobal.Date#parse(Object)} 
	 * methods. Representing a date in this millisecond format makes it independent of 
	 * time zone.
	 * @return The <tt>time</tt> argument. Prior to ECMAScript standardization, 
	 * this method returns nothing.
	 * @see jsx.core.DateLikes#setTime(DateLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setTime(Object time) {
		return call(setTime, time);
	}
	/**
	 * <p>Sets the milliseconds field of a date, using local time.</p>
	 * @param ms The milliseconds field, expressed in local time, to be set in the current 
	 * date instance. This argument should be an integer between 0 and 999.
	 * @return The millisecond representation of the adjusted date.
	 * @see #setUTCMilliseconds(Object)
	 * @see jsx.core.DateLikes#setMilliseconds(DateLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setMilliseconds(Object ms) {
		return call(setMilliseconds, ms);
	}
	/**
	 * <p>Sets the milliseconds field of the current date instance, using universal time.</p>
	 * @param ms The milliseconds field, expressed in universal time, to be set in the 
	 * current date instance. This argument should be an integer between 0 and 999.
	 * @return The millisecond representation of the adjusted date.
	 * @see #setMilliseconds(Object)
	 * @see jsx.core.DateLikes#setUTCMilliseconds(DateLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setUTCMilliseconds(Object ms) {
		return call(setUTCMilliseconds, ms);
	}
	/**
	 * <p>Sets the seconds field of the current date instance, using local time.</p>
	 * @param sec An integer between 0 and 59 that is set as the seconds value for the 
	 * current date instance.
	 * @return The millisecond representation of the adjusted date. Prior to ECMAScript 
	 * standardization, this method returns nothing.
	 * @see #setUTCSeconds(Object)
	 * @see #setSeconds(Object, Object)
	 * @see jsx.core.DateLikes#setSeconds(DateLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setSeconds(Object sec) {
		return call(setSeconds, sec);
	}
	/**
	 * <p>Sets the seconds field of the current date instance, using universal time.</p>
	 * @param sec The seconds field, expressed in universal time, to be set in the current 
	 * date instance. This argument should be an integer between 0 and 59.
	 * @return The millisecond representation of the adjusted date.
	 * @see #setSeconds(Object)
	 * @see #setUTCSeconds(Object, Object)
	 * @see jsx.core.DateLikes#setUTCSeconds(DateLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setUTCSeconds(Object sec) {
		return call(setUTCSeconds, sec);
	}
	/**
	 * <p>Sets the seconds field and optionally the milliseconds field of the current date 
	 * instance, using local .</p>
	 * @param sec An integer between 0 and 59 that is set as the seconds value for the 
	 * current date instance.
	 * @param ms An optional integer, between 0 and 999, that is used as the new value 
	 * in local time of the milliseconds field of the current date instance. This argument 
	 * is not supported prior to ECMAScript standardization.
	 * @return The millisecond representation of the adjusted date. Prior to ECMAScript 
	 * standardization, this method returns nothing.
	 * @see #setUTCSeconds(Object, Object)
	 * @see #setSeconds(Object)
	 * @see jsx.core.DateLikes#setSeconds(DateLike, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setSeconds(Object sec, Object ms) {
		return call(setSeconds, new Vars<Object>().add(sec).add(ms));
	}
	/**
	 * <p>Sets the seconds field and optionally the milliseconds field of the current date 
	 * instance, using universal time.</p>
	 * @param sec The seconds field, expressed in universal time, to be set in the current 
	 * date instance. This argument should be an integer between 0 and 59.
	 * @param ms An optional integer, between 0 and 999, that is used as the new value 
	 * in universal time of the milliseconds field of the current date instance.
	 * @return The millisecond representation of the adjusted date.
	 * @see #setSeconds(Object, Object)
	 * @see #setUTCSeconds(Object)
	 * @see jsx.core.DateLikes#setUTCSeconds(DateLike, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setUTCSeconds(Object sec, Object ms) {
		return call(setUTCSeconds, new Vars<Object>().add(sec).add(ms));
	}
	/**
	 * <p>Sets the minutes field of the current date instance, using local time.</p>
	 * @param min An optional integer, between 0 and 59, that is used as the new value 
	 * in local time of the minutes field of the current date instance.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setUTCMinutes(Object)
	 * @see #setMinutes(Object, Object)
	 * @see #setMinutes(Object, Object, Object)
	 * @see jsx.core.DateLikes#setMinutes(DateLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setMinutes(Object min) {
		return call(setMinutes, min);
	}
	/**
	 * <p>Sets the minutes field of the current date instance, using universal time.</p>
	 * @param min An optional integer, between 0 and 59, that is used as the new value 
	 * in universal time of the minutes field of the current date instance.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setMinutes(Object)
	 * @see #setUTCMinutes(Object, Object)
	 * @see #setUTCMinutes(Object, Object, Object)
	 * @see jsx.core.DateLikes#setUTCMinutes(DateLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setUTCMinutes(Object min) {
		return call(setUTCMinutes, min);
	}
	/**
	 * <p>Sets the minutes field and optionally the seconds field of the current date 
	 * instance, using local time.</p>
	 * @param min An optional integer, between 0 and 59, that is used as the new value 
	 * in local time of the minutes field of the current date instance. This argument is 
	 * not supported prior to ECMAScript standardization.
	 * @param sec An optional integer, between 0 and 59, that is used as the new value 
	 * in local time of the seconds field of the current date instance. This argument is 
	 * not supported prior to ECMAScript standardization.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setUTCMinutes(Object, Object)
	 * @see #setMinutes(Object)
	 * @see #setMinutes(Object, Object, Object)
	 * @see jsx.core.DateLikes#setMinutes(DateLike, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setMinutes(Object min, Object sec) {
		return call(setMinutes, new Vars<Object>().add(min).add(sec));
	}
	/**
	 * <p>Sets the minutes field and optionally the seconds field of the current date 
	 * instance, using universal time.</p>
	 * @param min An optional integer, between 0 and 59, that is used as the new value 
	 * in universal time of the minutes field of the current date instance.
	 * @param sec An optional integer, between 0 and 59, that is used as the new value 
	 * in universal time of the seconds field of the current date instance.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setMinutes(Object, Object)
	 * @see #setUTCMinutes(Object)
	 * @see #setUTCMinutes(Object, Object, Object)
	 * @see jsx.core.DateLikes#setUTCMinutes(DateLike, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setUTCMinutes(Object min, Object sec) {
		return call(setUTCMinutes, new Vars<Object>().add(min).add(sec));
	}
	/**
	 * <p>Sets the minutes field and optionally the seconds and milliseconds fields of the 
	 * current date instance, using local time.</p>
	 * @param min An optional integer, between 0 and 59, that is used as the new value 
	 * in local time of the minutes field of the current date instance. This argument is 
	 * not supported prior to ECMAScript standardization.
	 * @param sec An optional integer, between 0 and 59, that is used as the new value 
	 * in local time of the seconds field of the current date instance. This argument is 
	 * not supported prior to ECMAScript standardization.
	 * @param ms An optional integer, between 0 and 999, that is used as the new value 
	 * in local time of the milliseconds field of the current date instance. This argument 
	 * is not supported prior to ECMAScript standardization.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setUTCMinutes(Object, Object, Object)
	 * @see #setMinutes(Object)
	 * @see #setMinutes(Object, Object)
	 * @see jsx.core.DateLikes#setMinutes(DateLike, Object, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setMinutes(Object min, Object sec, Object ms) {
		return call(setMinutes, new Vars<Object>().add(min).add(sec).add(ms));
	}
	/**
	 * <p>Sets the minutes field and optionally the seconds and milliseconds fields of the 
	 * current date instance, using universal time.</p>
	 * @param min An optional integer, between 0 and 59, that is used as the new value 
	 * in universal time of the minutes field of the current date instance.
	 * @param sec An optional integer, between 0 and 59, that is used as the new value 
	 * in universal time of the seconds field of the current date instance.
	 * @param ms An optional integer, between 0 and 999, that is used as the new value 
	 * in universal time of the milliseconds field of the current date instance.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setMinutes(Object, Object, Object)
	 * @see #setUTCMinutes(Object)
	 * @see #setUTCMinutes(Object, Object)
	 * @see jsx.core.DateLikes#setUTCMinutes(DateLike, Object, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setUTCMinutes(Object min, Object sec, Object ms) {
		return call(setUTCMinutes, new Vars<Object>().add(min).add(sec).add(ms));
	}
	/**
	 * <p>Sets the hour field of the current date instance, using local time.</p>
	 * @param hr An integer between 0 (midnight) and 23 (11 p.m.) local time that is set 
	 * as the new hours value of the current date instance.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setUTCHours(Object)
	 * @see #setHours(Object, Object)
	 * @see #setHours(Object, Object, Object)
	 * @see #setHours(Object, Object, Object, Object)
	 * @see jsx.core.DateLikes#setHours(DateLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setHours(Object hr) {
		return call(setHours, hr);
	}
	/**
	 * <p>Sets the hour field of the current date instance, using universal time.</p>
	 * @param hr The hours field, expressed in universal time, to be set in the current 
	 * date instance. This argument should be an integer between 0 (midnight) and 23 
	 * (11 p.m.).
	 * @return The millisecond representation of the adjusted date. 
	 * @see #setHours(Object)
	 * @see #setUTCHours(Object, Object)
	 * @see #setUTCHours(Object, Object, Object)
	 * @see #setUTCHours(Object, Object, Object, Object)
	 * @see jsx.core.DateLikes#setUTCHours(DateLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setUTCHours(Object hr) {
		return call(setUTCHours, hr);
	}
	/**
	 * <p>Sets the hour field and optionally the minutes field of the current date 
	 * instance, using local time.</p>
	 * @param hr An integer between 0 (midnight) and 23 (11 p.m.) local time that is set 
	 * as the new hours value of the current date instance.
	 * @param min An optional integer, between 0 and 59, that is used as the new value 
	 * in local time of the minutes field of the current date instance. This argument is 
	 * not supported prior to ECMAScript standardization.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setUTCHours(Object, Object)
	 * @see #setHours(Object)
	 * @see #setHours(Object, Object, Object)
	 * @see #setHours(Object, Object, Object, Object)
	 * @see jsx.core.DateLikes#setHours(DateLike, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setHours(Object hr, Object min) {
		return call(setHours, new Vars<Object>().add(hr).add(min));
	}
	/**
	 * <p>Sets the hour field and optionally the minutes field of the current date 
	 * instance, using universal time.</p>
	 * @param hr The hours field, expressed in universal time, to be set in the current 
	 * date instance. This argument should be an integer between 0 (midnight) and 23 
	 * (11 p.m.).
	 * @param min An optional integer, between 0 and 59, that is used as the new value 
	 * in universal time of the minutes field of the current date instance.
	 * @return The millisecond representation of the adjusted date. 
	 * @see #setHours(Object, Object)
	 * @see #setUTCHours(Object)
	 * @see #setUTCHours(Object, Object, Object)
	 * @see #setUTCHours(Object, Object, Object, Object)
	 * @see jsx.core.DateLikes#setUTCHours(DateLike, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setUTCHours(Object hr, Object min) {
		return call(setUTCHours, new Vars<Object>().add(hr).add(min));
	}
	/**
	 * <p>Sets the hour field and optionally the minutes and seconds fields of the current 
	 * date instance, using local time.</p>
	 * @param hr An integer between 0 (midnight) and 23 (11 p.m.) local time that is set 
	 * as the new hours value of the current date instance.
	 * @param min An optional integer, between 0 and 59, that is used as the new value 
	 * in local time of the minutes field of the current date instance. This argument is 
	 * not supported prior to ECMAScript standardization.
	 * @param sec An optional integer, between 0 and 59, that is used as the new value 
	 * in local time of the seconds field of the current date instance. This argument is 
	 * not supported prior to ECMAScript standardization.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setUTCHours(Object, Object, Object)
	 * @see #setHours(Object)
	 * @see #setHours(Object, Object)
	 * @see #setHours(Object, Object, Object, Object)
	 * @see jsx.core.DateLikes#setHours(DateLike, Object, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setHours(Object hr, Object min, Object sec) {
		return call(setHours, new Vars<Object>().add(hr).add(min).add(sec));
	}
	/**
	 * <p>Sets the hour field and optionally the minutes and seconds fields of the current 
	 * date instance, using universal time.</p>
	 * @param hr The hours field, expressed in universal time, to be set in the current 
	 * date instance. This argument should be an integer between 0 (midnight) and 23 
	 * (11 p.m.).
	 * @param min An optional integer, between 0 and 59, that is used as the new value 
	 * in universal time of the minutes field of the current date instance.
	 * @param sec An optional integer, between 0 and 59, that is used as the new value 
	 * in universal time of the seconds field of the current date instance.
	 * @return The millisecond representation of the adjusted date.
	 * @see #setHours(Object, Object, Object)
	 * @see #setUTCHours(Object)
	 * @see #setUTCHours(Object, Object)
	 * @see #setUTCHours(Object, Object, Object, Object)
	 * @see jsx.core.DateLikes#setUTCHours(DateLike, Object, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setUTCHours(Object hr, Object min, Object sec) {
		return call(setUTCHours, new Vars<Object>().add(hr).add(min).add(sec));
	}
	/**
	 * <p>Sets the hour field and optionally the minutes, seconds, and milliseconds fields 
	 * of the current date instance, using local time.</p>
	 * @param hr An integer between 0 (midnight) and 23 (11 p.m.) local time that is set 
	 * as the new hours value of the current date instance.
	 * @param min An optional integer, between 0 and 59, that is used as the new value 
	 * in local time of the minutes field of the current date instance. This argument is 
	 * not supported prior to ECMAScript standardization.
	 * @param sec An optional integer, between 0 and 59, that is used as the new value 
	 * in local time of the seconds field of the current date instance. This argument is 
	 * not supported prior to ECMAScript standardization.
	 * @param ms An optional integer, between 0 and 999, that is used as the new value 
	 * in local time of the milliseconds field of the current date instance. This argument 
	 * is not supported prior to ECMAScript standardization.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setUTCHours(Object, Object, Object, Object)
	 * @see #setHours(Object)
	 * @see #setHours(Object, Object)
	 * @see #setHours(Object, Object, Object)
	 * @see jsx.core.DateLikes#setHours(DateLike, Object, Object, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setHours(Object hr, Object min, Object sec, Object ms) {
		return call(setHours, new Vars<Object>().add(hr).add(min).add(sec).add(ms));
	}
	/**
	 * <p>Sets the hour field and optionally the minutes, seconds, and milliseconds fields 
	 * of the current date instance, using universal time.</p>
	 * @param hr The hours field, expressed in universal time, to be set in the current 
	 * date instance. This argument should be an integer between 0 (midnight) and 23 
	 * (11 p.m.).
	 * @param min An optional integer, between 0 and 59, that is used as the new value 
	 * in universal time of the minutes field of the current date instance.
	 * @param sec An optional integer, between 0 and 59, that is used as the new value 
	 * in universal time of the seconds field of the current date instance.
	 * @param ms An optional integer, between 0 and 999, that is used as the new value 
	 * in universal time of the milliseconds field of the current date instance.
	 * @return The millisecond representation of the adjusted date.
	 * @see #setHours(Object, Object, Object, Object)
	 * @see #setUTCHours(Object)
	 * @see #setUTCHours(Object, Object)
	 * @see #setUTCHours(Object, Object, Object)
	 * @see jsx.core.DateLikes#setUTCHours(DateLike, Object, Object, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setUTCHours(Object hr, Object min, Object sec, Object ms) {
		return call(setUTCHours, new Vars<Object>().add(hr).add(min).add(sec).add(ms));
	}
	/**
	 * <p>Sets the day of the month field of the current date instance, using local time.</p>
	 * @param day An integer between 1 and 31 that is used as the new value in local time 
	 * of the day-of-the-month field of the current date instance.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setUTCDate(Object)
	 * @see jsx.core.DateLikes#setDate(DateLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setDate(Object day) {
		return call(setDate, day);
	}
	/**
	 * <p>Sets the day of the month field of the current date instance, using universal 
	 * time.</p>
	 * @param day The day of the month, expressed in universal time, to be set in the 
	 * current date instance. This argument should be an integer between 1 and 31.
	 * @return The millisecond representation of the adjusted date. 
	 * @see #setDate(Object)
	 * @see jsx.core.DateLikes#setUTCDate(DateLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setUTCDate(Object day) {
		return call(setUTCDate, day);
	}
	/**
	 * <p>Sets the month field of the current date instance, using local time.</p>
	 * @param mo An integer between 0 ( January) and 11 (December) that is set as the month 
	 * value in local time for the current date instance. Note that months are numbered 
	 * beginning with 0, while days within the month are numbered beginning with 1.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setUTCMonth(Object)
	 * @see #setMonth(Object, Object)
	 * @see jsx.core.DateLikes#setMonth(DateLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setMonth(Object mo) {
		return call(setMonth, mo);
	}
	/**
	 * <p>Sets the month field of the current date instance, using universal time.</p>
	 * @param mo The month, expressed in universal time, to be set in the current date
	 * instance. This argument should be an integer between 0 (January) and 11 (December). 
	 * Note that months are numbered beginning with 0, while days within the month are 
	 * numbered beginning with 1.
	 * @return The millisecond representation of the adjusted date. 
	 * @see #setMonth(Object)
	 * @see #setUTCMonth(Object, Object)
	 * @see jsx.core.DateLikes#setUTCMonth(DateLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setUTCMonth(Object mo) {
		return call(setUTCMonth, mo);
	}
	/**
	 * <p>Sets the month field and optionally the day of the month of the current date 
	 * instance, using local time.</p>
	 * @param mo An integer between 0 ( January) and 11 (December) that is set as the month 
	 * value in local time for the current date instance. Note that months are numbered 
	 * beginning with 0, while days within the month are numbered beginning with 1.
	 * @param day An optional integer between 1 and 31 that is used as the new value in 
	 * local time of the day-of-the-month field of the current date instance. This argument 
	 * is not supported prior to ECMAScript standardization.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setUTCMonth(Object, Object)
	 * @see #setMonth(Object)
	 * @see jsx.core.DateLikes#setMonth(DateLike, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setMonth(Object mo, Object day) {
		return call(setMonth, new Vars<Object>().add(mo).add(day));
	}
	/**
	 * <p>Sets the month field and optionally the day of the month of the current date 
	 * instance, using universal time.</p>
	 * @param mo The month, expressed in universal time, to be set in the current date
	 * instance. This argument should be an integer between 0 (January) and 11 (December). 
	 * Note that months are numbered beginning with 0, while days within the month are 
	 * numbered beginning with 1.
	 * @param day An optional integer between 1 and 31 that is used as the new value in 
	 * universal time of the day-of-the-month field of the current date instance.
	 * @return The millisecond representation of the adjusted date. 
	 * @see #setMonth(Object, Object)
	 * @see #setUTCMonth(Object)
	 * @see jsx.core.DateLikes#setUTCMonth(DateLike, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setUTCMonth(Object mo, Object day) {
		return call(setUTCMonth, new Vars<Object>().add(mo).add(day));
	}
	/**
	 * <p>Sets the year field of the current date instance, using local time.</p>
	 * @param yr The year, expressed in local time, to be set in the current date instance. 
	 * This argument should be an integer that includes the century, such as 1999; it 
	 * should not be an abbreviation, such as 99.
	 * @return The millisecond representation of the adjusted date. 
	 * @see #setUTCFullYear(Object)
	 * @see #setFullYear(Object, Object)
	 * @see #setFullYear(Object, Object, Object)
	 * @see jsx.core.DateLikes#setFullYear(DateLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setFullYear(Object yr) {
		return call(setFullYear, yr);
	}
	/**
	 * <p>Sets the year field of the current date instance, using universal time.</p>
	 * @param yr The year, expressed in universal time, to be set in the current date 
	 * instance. This argument should be an integer that includes the century, such as 
	 * 1999, not an abbreviation, such as 99.
	 * @return The millisecond representation of the adjusted date. 
	 * @see #setFullYear(Object)
	 * @see #setUTCFullYear(Object, Object)
	 * @see #setUTCFullYear(Object, Object, Object)
	 * @see jsx.core.DateLikes#setUTCFullYear(DateLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setUTCFullYear(Object yr) {
		return call(setUTCFullYear, yr);
	}
	/**
	 * <p>Sets the year and optionally month fields of the current date instance, using 
	 * local time.</p>
	 * @param yr The year, expressed in local time, to be set in the current date instance. 
	 * This argument should be an integer that includes the century, such as 1999; it 
	 * should not be an abbreviation, such as 99.
	 * @param mo An optional integer between 0 and 11 that is used as the new value in 
	 * local time of the month field of the current date instance.
	 * @return The millisecond representation of the adjusted date. 
	 * @see #setUTCFullYear(Object, Object)
	 * @see #setFullYear(Object)
	 * @see #setFullYear(Object, Object, Object)
	 * @see jsx.core.DateLikes#setFullYear(DateLike, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setFullYear(Object yr, Object mo) {
		return call(setFullYear, new Vars<Object>().add(yr).add(mo));
	}
	/**
	 * <p>Sets the year and optionally month fields of the current date instance, using 
	 * universal time.</p>
	 * @param yr The year, expressed in universal time, to be set in the current date 
	 * instance. This argument should be an integer that includes the century, such as 
	 * 1999, not an abbreviation, such as 99.
	 * @param mo An optional integer between 0 and 11 that is used as the new value in 
	 * universal time of the month field of the current date instance. Note that months 
	 * are numbered beginning with 0, while days within the month are numbered beginning 
	 * with 1.
	 * @return The millisecond representation of the adjusted date. 
	 * @see #setFullYear(Object, Object)
	 * @see #setUTCFullYear(Object)
	 * @see #setUTCFullYear(Object, Object, Object)
	 * @see jsx.core.DateLikes#setUTCFullYear(DateLike, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setUTCFullYear(Object yr, Object mo) {
		return call(setUTCFullYear, new Vars<Object>().add(yr).add(mo));
	}
	/**
	 * <p>Sets the year and optionally month and day fields of the current date instance, 
	 * using local time.</p>
	 * @param yr The year, expressed in local time, to be set in the current date instance. 
	 * This argument should be an integer that includes the century, such as 1999; it 
	 * should not be an abbreviation, such as 99.
	 * @param mo An optional integer between 0 and 11 that is used as the new value in 
	 * local time of the month field of the current date instance.
	 * @param day An optional integer between 1 and 31 that is used as the new value in 
	 * local time of the day-of-the-month field of the current date instance.
	 * @return The millisecond representation of the adjusted date. 
	 * @see #setUTCFullYear(Object, Object, Object)
	 * @see #setFullYear(Object)
	 * @see #setFullYear(Object, Object)
	 * @see jsx.core.DateLikes#setFullYear(DateLike, Object, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setFullYear(Object yr, Object mo, Object day) {
		return call(setFullYear, new Vars<Object>().add(yr).add(mo).add(day));
	}
	/**
	 * <p>Sets the year and optionally month and day fields of the current date instance, 
	 * using universal time.</p>
	 * @param yr The year, expressed in universal time, to be set in the current date 
	 * instance. This argument should be an integer that includes the century, such as 
	 * 1999, not an abbreviation, such as 99.
	 * @param mo An optional integer between 0 and 11 that is used as the new value in 
	 * universal time of the month field of the current date instance. Note that months 
	 * are numbered beginning with 0, while days within the month are numbered beginning 
	 * with 1.
	 * @param day An optional integer between 1 and 31 that is used as the new value in 
	 * universal time of the day-of-the-month field of the current date instance.
	 * @return The millisecond representation of the adjusted date. 
	 * @see #setFullYear(Object, Object, Object)
	 * @see #setUTCFullYear(Object)
	 * @see #setUTCFullYear(Object, Object)
	 * @see jsx.core.DateLikes#setUTCFullYear(DateLike, Object, Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number setUTCFullYear(Object yr, Object mo, Object day) {
		return call(setUTCFullYear, new Vars<Object>().add(yr).add(mo).add(day));
	}
	/**
	 * <p>Returns a string that represents the date portion of the current date instance, 
	 * expressed in the local time zone.</p>
	 * @return An implementation-dependent, human-readable string representation of the 
	 * date portion of the current date instance, expressed in the local time zone.
	 * @see #toLocaleDateString()
	 * @see #toLocaleString()
	 * @see #toLocaleTimeString()
	 * @see #toString()
	 * @see #toTimeString()
	 * @see jsx.core.DateLikes#toDateString(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String toDateString() {
		return call(toDateString);
	}
	/**
	 * <p>Returns a string that represents the time portion of the current date instance, 
	 * expressed in the local time zone.</p>
	 * @return An implementation-dependent, human-readable string representation of the 
	 * time portion of the current date instance, expressed in the local time zone.
	 * @see #toDateString()
	 * @see #toLocaleDateString()
	 * @see #toLocaleString()
	 * @see #toLocaleTimeString()
	 * @see #toString()
	 * @see jsx.core.DateLikes#toTimeString(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String toTimeString() {
		return call(toTimeString);
	}
	/**
	 * <p>Returns a string that represents the date portion of the current date instance, 
	 * expressed in the local time zone, using the local date formatting conventions.</p>
	 * @return An implementation-dependent, human-readable string representation of the 
	 * date portion of the current date instance, expressed in the local time zone and 
	 * formatted according to local conventions.
	 * @see #toDateString()
	 * @see #toLocaleString()
	 * @see #toLocaleTimeString()
	 * @see #toString()
	 * @see #toTimeString()
	 * @see jsx.core.DateLikes#toLocaleDateString(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String toLocaleDateString() {
		return call(toLocaleDateString);
	}
	/**
	 * <p>Returns a string that represents the time portion of the current date instance, 
	 * expressed in the local time zone, using the local time formatting conventions.</p>
	 * @return An implementation-dependent, human-readable string representation of the 
	 * time portion of the current date instance, expressed in the local time zone and 
	 * formatted according to local conventions.
	 * @see #toDateString()
	 * @see #toLocaleDateString()
	 * @see #toLocaleString()
	 * @see #toString()
	 * @see #toTimeString()
	 * @see jsx.core.DateLikes#toLocaleTimeString(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String toLocaleTimeString() {
		return call(toLocaleTimeString);
	}
	/**
	 * <p>Converts the current date instance to a string, using universal time.</p>
	 * @return A human-readable string representation, expressed in universal time, of the 
	 * current date instance.
	 * @see #toLocaleString()
	 * @see #toString()
	 * @see jsx.core.DateLikes#toUTCString(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String toUTCString() {
		return call(toUTCString);
	}

	/**
	 * <p>Returns the primitive value associated with the current instance, if there is one. 
	 * This invocation returns the primitive number value associated with the current instance.</p>
	 * @return The millisecond representation of the current date instance. The value 
	 * returned is the same as that returned by {@link #getTime()}.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	@Override
	public Number valueOf() {
		return var().valueOf();
	}

	/**
	 * <p>Increases the current date instance by 1 and then returns the value of the 
	 * current date instance, resembling the pre-increment operator in JavaScript.</p>
	 * @return The value of the current date instance increased by 1.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this 
	 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
	 * <pre>++d</pre>
	 * where <tt>d</tt> is the primitive value of the current date instance of the 
	 * invocation of this method.
	 */
	public Number inc() {
		return var().inc();
	}

	/**
	 * <p>Decreases the current date instance by 1 and then returns the value of the 
	 * current date instance, resembling the pre-decrement operator in JavaScript.</p>
	 * @return The value of the current date instance decreased by 1.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this 
	 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
	 * <pre>--d</pre>
	 * where <tt>d</tt> is the primitive value of the current date instance of the 
	 * invocation of this method.
	 */
	public Number dec() {
		return var().dec();
	}

	/**
	 * <p>Returns the primitive value of the current date instance and then increases the 
	 * current date instance by 1, resembling the post-increment operator in JavaScript.</p>
	 * @return The value of the original date instance.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this 
	 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
	 * <pre>d++</pre>
	 * where <tt>d</tt> is the primitive value of the current date instance of the 
	 * invocation of this method.
	 */
	public Number incp() {
		return var().incp();
	}

	/**
	 * <p>Returns the primitive value of the current date instance and then decreases the 
	 * current date instance by 1, resembling the post-decrement operator in JavaScript.</p>
	 * @return The value of the original date instance.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this 
	 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
	 * <pre>d--</pre>
	 * where <tt>d</tt> is the primitive value of the current date instance of the 
	 * invocation of this method.
	 */
	public Number decp() {
		return var().decp();
	}

	/**
	 * <p>Adds a numeric operand to the current date instance and returns the numeric 
	 * operand, resembling the assignment-with-addition operator in JavaScript.</p>
	 * @param value A numeric value.
	 * @return The numeric value of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>d += value</pre>
	 * where <tt>d</tt> is the primitive value of the current date instance of the 
	 * invocation of this method.
	 */
	public Number aadd(Character value) {
		return var().aadd(value);
	}

	/**
	 * <p>Adds a numeric operand to the current date instance and returns the numeric 
	 * operand, resembling the assignment-with-addition operator in JavaScript.</p>
	 * @param value A numeric value.
	 * @return The numeric value of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>d += value</pre>
	 * where <tt>d</tt> is the primitive value of the current date instance of the 
	 * invocation of this method.
	 */
	public Number aadd(Value.Character value) {
		return var().aadd(value);
	}

	/**
	 * <p>Adds a numeric operand to the current date instance and returns the numeric 
	 * operand, resembling the assignment-with-addition operator in JavaScript.</p>
	 * @param value A numeric value.
	 * @return The numeric value of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>d += value</pre>
	 * where <tt>d</tt> is the primitive value of the current date instance of the 
	 * invocation of this method.
	 */
	public Number aadd(Number value) {
		return var().aadd(value);
	}

	/**
	 * <p>Adds a numeric operand to the current date instance and returns the numeric 
	 * operand, resembling the assignment-with-addition operator in JavaScript.</p>
	 * @param value A numeric value.
	 * @return The numeric value of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>d += value</pre>
	 * where <tt>d</tt> is the primitive value of the current date instance of the 
	 * invocation of this method.
	 */
	public Number aadd(Value<? extends Number> value) {
		return var().aadd(value);
	}

	/**
	 * <p>Adds a numeric operand to the current date instance and returns the numeric 
	 * operand, resembling the assignment-with-addition operator in JavaScript.</p>
	 * @param value A numeric value.
	 * @return The numeric value of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>d += value</pre>
	 * where <tt>d</tt> is the primitive value of the current date instance of the 
	 * invocation of this method.
	 */
	public Number aadd(JsNumber value) {
		return var().aadd(value);
	}

	/**
	 * <p>Subtracts a numeric operand from the current date instance and returns the numeric 
	 * operand, resembling the assignment-with-subtraction operator in JavaScript.</p>
	 * @param value A numeric value.
	 * @return The numeric value of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>d -= value</pre>
	 * where <tt>d</tt> is the primitive value of the current date instance of the 
	 * invocation of this method.
	 */
	public Number asub(Object value) {
		return var().asub(value);
	}

	/**
	 * <p>Multiplies a numeric operand to the current date instance and returns the numeric 
	 * operand, resembling the assignment-with-multiplication operator in JavaScript.</p>
	 * @param value A numeric value.
	 * @return The numeric value of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>d *= value</pre>
	 * where <tt>d</tt> is the primitive value of the current date instance of the 
	 * invocation of this method.
	 */
	public Number amul(Object value) {
		return var().amul(value);
	}

	/**
	 * <p>Divides, by a numeric operand, the current date instance and returns the numeric 
	 * operand, resembling the assignment-with-division operator in JavaScript.</p>
	 * @param value A numeric value.
	 * @return The numeric value of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>d /= value</pre>
	 * where <tt>d</tt> is the primitive value of the current date instance of the 
	 * invocation of this method.
	 */
	public Number adiv(Object value) {
		return var().adiv(value);
	}

	/**
	 * <p>Modulo operates a numeric operand onto the current date instance and returns the 
	 * numeric operand, resembling the assignment-with-multiplication operator in 
	 * JavaScript.</p>
	 * @param value A numeric value.
	 * @return The numeric value of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>d %= value</pre>
	 * where <tt>d</tt> is the primitive value of the current date instance of the 
	 * invocation of this method.
	 */
	public Number amod(Object value) {
		return var().amod(value);
	}

	/**
	 * <p>Assignment-with-shift-left operation, resembling that of JavaScript, moves all bits in the 
	 * current primitive instance to the left by the number of places specified in the 
	 * second operand, which should be an integer between 0 and 31.</p>
	 * <p>A zero is used for the new first bit, and the value of the 32nd bit is lost. 
	 * Shifting a value left by one position is equivalent to multiplying by 2, shifting 
	 * two positions is equivalent to multiplying by 4, etc.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with values that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the values to 
	 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
	 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
	 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
	 * yields a number in the appropriate range.</p>
	 * @param n The number of bits to shift.
	 * @return The shifted primitive instance.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this 
	 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
	 * <pre>d <<= n & 0x3f</pre>
	 * where <tt>d</tt> is the integer value of the current date instance of the 
	 * invocation of this method.
	 */
	public Number ashl(int n) {
		return var().ashl(n);
	}

	/**
	 * <p>Assignment-with-shift-right operation, resembling that of JavaScript, moves all bits in the 
	 * current primitive instance to the right by the number of places specified in the 
	 * second operand (an integer between 0 and 31). Bits that are shifted off the right 
	 * are lost. The bits filled in on the left depend on the sign bit of the original 
	 * value, in order to preserve the sign of the result. If the current primitive 
	 * instance is positive, the result has zeros placed in the high bits; if the current 
	 * primitive instance is negative, the result has ones placed in the high bits.</p>
	 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
	 * remainder), shifting right two places is equivalent to integer division by 4, and 
	 * so on.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with values that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the values to 
	 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
	 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
	 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
	 * yields a number in the appropriate range.</p>
	 * @param n The number of bits to shift.
	 * @return The shifted primitive instance.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this 
	 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
	 * <pre>d >>= n & 0x3f</pre>
	 * where <tt>d</tt> is the integer value of the current date instance of the 
	 * invocation of this method.
	 */
	public Number ashr(int n) {
		return var().ashr(n);
	}

	/**
	 * <p>Assignment-with-shift-right-unsigned operation, resembling that of JavaScript, moves all bits in 
	 * the current date instance to the right by the number of places specified in the 
	 * second operand (an integer between 0 and 31). Bits that are shifted off the right 
	 * are lost. The result has zeros placed in the high bits.</p>
	 * <p>This operation is just like {@link #shr(int)}, except that the bits shifted 
	 * in on the left are always zero, regardless of the sign of the current date instance.</p>
	 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
	 * remainder), shifting right two places is equivalent to integer division by 4, and 
	 * so on.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with values that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the values to 
	 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
	 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
	 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
	 * yields a number in the appropriate range.</p>
	 * @param n The number of bits to shift.
	 * @return The shifted primitive instance.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this 
	 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
	 * <pre>d >>>= n & 0x3f</pre>
	 * where <tt>d</tt> is the integer value of the current date instance of the 
	 * invocation of this method.
	 */
	public Number ashru(int n) {
		return var().ashru(n);
	}

	/**
	 * <p>Assignment-with-bitwise-AND operation, resembling that of JavaScript, performs a boolean AND 
	 * operation on each bit of the integer arguments. A bit is set in the result only if 
	 * the corresponding bit is set in both operands.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with operands that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
	 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
	 * the 32nd.</p>
	 * @param value A numeric value.
	 * @return The bitwise-AND of the two operands.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this 
	 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
	 * <pre>d &= (char)value</pre>
	 * where <tt>d</tt> is the integer value of the current date instance of the 
	 * invocation of this method.
	 */
	public Number aand(Object value) {
		return var().aand(value);
	}

	/**
	 * <p>Assignment-with-bitwise-OR operation, resembling that of JavaScript, performs a boolean OR operation 
	 * on each bit of the integer arguments. A bit is set in the result if the corresponding 
	 * bit is set in one or both of the operands.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with operands that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
	 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
	 * the 32nd.</p>
	 * @param value A numeric value.
	 * @return The bitwise-OR of the two operands.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this 
	 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
	 * <pre>d |= (char)value</pre>
	 * where <tt>d</tt> is the integer value of the current date instance of the 
	 * invocation of this method.
	 */
	public Number aor(Object value) {
		return var().aor(value);
	}

	/**
	 * <p>Assignment-with-bitwise-XOR operation, resembling that of JavaScript, performs a boolean exclusive 
	 * OR operation on each bit of the integer arguments. Exclusive OR means that either 
	 * operand one is <tt>true</tt> or operand two is <tt>true</tt>, but not both. A bit is 
	 * set in this operation's result if a corresponding bit is set in one (but not both) 
	 * of the two operands.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with operands that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
	 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
	 * the 32nd.</p>
	 * @param value A numeric value.
	 * @return The bitwise-exclusive-OR of the two operands.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this 
	 * method with the equivalent JavaScript expression as re-compiled from the Java expression:  
	 * <pre>d ^= (char)value</pre>
	 * where <tt>d</tt> is the integer value of the current date instance of the 
	 * invocation of this method.
	 */
	public Number axor(Object value) {
		return var().aand(value);
	}

	/**
	 * <p>Logically evaluates the current date instance.</p>
	 * @return The logical value of the current date instance.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the instance invocation of this method, that is, 
	 * replacing it with its current date instance.
	 */
	public final boolean be() {
		return Js.be(this);
	}

	/**
	 * <p>Performs unary negation, resembling the unary minus operator in JavaScript.</p>
	 * <p>This operation converts a positive value to an equivalently negative value, and 
	 * vice versa. If the operand is not a number, it attempts to convert it to one.</p>
	 * @return The negation of the current date instance.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>-d</pre>
	 * where <tt>d</tt> is the current date instance of the invocation of this 
	 * method.
	 */
	public final Number neg() {
		return Js.neg(this);
	}

	/**
	 * <p>Inverts the boolean value of the current date instance, resembling the logical 
	 * NOT operator in JavaScript.</p>
	 * <p>This operation converts the current date instance to a boolean value using 
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
	 * <pre>!d</pre>
	 * where <tt>d</tt> is the current date instance of the invocation of this method.
	 */
	public final boolean not() {
		return Js.not(this);
	}

	/**
	 * <p>Bitwise-NOT operation, resembling that of JavaScript, operates by reversing all 
	 * bits in the current date instance.</p>
	 * <p>Because of the way signed integers are represented in JavaScript, applying this 
	 * operation to a value is equivalent to changing its sign and subtracting 1.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * values using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with the current date instance that are 
	 * not integers or are too large to fit in a 32-bit integer representation, it simply 
	 * coerces them to 32-bit integers by dropping any fractional part of the value or any 
	 * bits beyond the 32nd.</p>
	 * @return The bitwise-NOT of the current date instance.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>~d</pre>
	 * where <tt>d</tt> is the current date instance of the invocation of this method.
	 */
	public final int bnot() {
		return Js.bnot(valueOf());
	}

	/**
	 * <p>Multiplies the value of the current date instance with the operand, resembling 
	 * the multiplication operator in JavaScript.</p>
	 * <p>If used with non-numeric values, this operation attempts to convert them to 
	 * numbers.</p>
	 * @param other Any numeric value.
	 * @return The product of the current date instance and the operand.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>d * other</pre>
	 * where <tt>d</tt> is the current date instance of the invocation of this method.
	 */
	public final Number mul(Object other) {
		return Js.mul(this, other);
	}

	/**
	 * <p>Divides the value of the current date instance by the operand, resembling the 
	 * division operator in JavaScript.</p>
	 * <p>Used with non-numeric values, this operation attempts to convert them to 
	 * numbers. If you are used to programming languages that distinguish between integer 
	 * and floating-point numbers, you might expect to get an integer result when you 
	 * divide one integer by another. In JavaScript, however, all numbers are floating-point, 
	 * so all division operations have floating-point results. Division by zero yields positive 
	 * or negative infinity, while <tt>0/0</tt> evaluates to <tt>NaN</tt>.</p>
	 * @param other Any numeric value.
	 * @return The quotient of the current date instance and the operand.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>d / other</pre>
	 * where <tt>d</tt> is the current date instance of the invocation of this method.
	 */
	public final Number div(Object other) {
		return Js.div(this, other);
	}

	/**
	 * <p>Computes the value of the current date instance modulo the operand, resembling 
	 * the modulo operator in JavaScript.</p>
	 * <p>The operation returns the remainder when the current date instance is divided 
	 * by the operand a certain number of times. If used with non-numeric values, the 
	 * operation attempts to convert them to numbers. The sign of the result is the same 
	 * as the sign of the current date instance.</p>
	 * <p>This operation is typically used with integer values, it also works for 
	 * floating-point values.</p>
	 * @param other Any numeric value.
	 * @return The remainder.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>d % other</pre>
	 * where <tt>d</tt> is the current date instance of the invocation of this method.
	 */
	public final Number mod(Object other) {
		return Js.mod(this, other);
	}

	/**
	 * <p>Subtracts the operand from the value of the current date instance, resembling 
	 * the subtraction operator in JavaScript.</p>
	 * <p>If used with non-numeric values, this operation attempts to convert them to 
	 * numbers.</p>
	 * @param other Any numeric value.
	 * @return The difference between the current date instance and the operand.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>d - other</pre>
	 * where <tt>d</tt> is the current date instance of the invocation of this method.
	 */
	public final Number sub(Object other) {
		return Js.sub(this, other);
	}

	/**
	 * <p>Adds the current date instance to a numeric operand or concatenates it with 
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
	 * <pre>d + other</pre>
	 * where <tt>d</tt> is the current date instance of the invocation of this method.
	 */
	public Object add(Object other) {
		return Js.add(this, other);
	}

	/**
	 * <p>Adds the current date instance to a numeric operand or concatenates it with 
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
	 * <pre>d + other</pre>
	 * where <tt>d</tt> is the current date instance of the invocation of this method.
	 */
	public final String add(String other) {
		return Js.add(this, other);
	}

	/**
	 * <p>Adds the current date instance to a numeric operand or concatenates it with 
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
	 * <pre>d + other</pre>
	 * where <tt>d</tt> is the current date instance of the invocation of this method.
	 */
	public final String add(Value<String> other) {
		return Js.add(this, other.var());
	}

	/**
	 * <p>Less-than operation, resembling that of JavaScript, evaluates to <tt>true</tt> if 
	 * the current date instance is less than the second operand; otherwise it 
	 * evaluates to <tt>false</tt>.</p>
	 * <p>The operands of this operation may be of any type. Comparison can be performed 
	 * only on numbers and strings, however, so operands that are not numbers or strings 
	 * are converted. Comparison and conversion occur as follows:</p>
	 * <ul>
	 * <li>If both operands are numbers, or if both convert to numbers, they are compared 
	 * numerically.</li>
	 * <li>If both operands are strings or convert to strings, they are compared as 
	 * strings.</li>
	 * <li>If one operand is or converts to a string, and one is or converts to a number, 
	 * the operation attempts to convert the string to a number and performs a numerical 
	 * comparison. If the string does not represent a number, it converts to <tt>NaN</tt>, 
	 * and the comparison is <tt>false</tt>. In JavaScript 1.1, the string-to-number 
	 * conversion causes an error instead of yielding <tt>NaN</tt>.</li>
	 * <li>If an object can be converted to either a number or a string, JavaScript performs 
	 * the numerical conversion. This means, for example, that Date objects are compared 
	 * numerically, and it is meaningful to compare two dates to see whether one is earlier 
	 * than the other.</li>
	 * <li>If the operands of the comparison operations cannot both be successfully converted 
	 * to numbers or to strings, these operations always return <tt>false</tt>.</li>
	 * <li>If either operand is or converts to <tt>NaN</tt>, the comparison operation always 
	 * yields <tt>false</tt>.</li>
	 * </ul>
	 * <p>Keep in mind that string comparison is done on a strict character-by-character 
	 * basis using the numerical value of each character from the Unicode encoding. Although 
	 * in some cases the Unicode standard allows equivalent strings to be encoded using 
	 * different sequences of characters, the JavaScript comparison operations do not 
	 * detect these encoding differences; they assume that all strings are expressed in 
	 * normalized form. Note in particular that string comparison is case-sensitive, and 
	 * in the Unicode encoding (at least for the ASCII subset), all capital letters are 
	 * "less than" all lowercase letters. This rule can cause confusing results if you do 
	 * not expect it.</p>
	 * <p>For a more robust string-comparison algorithm, see the {@link StringLike#localeCompare(Object)} 
	 * method, which also takes locale-specific definitions of alphabetical order into account. 
	 * For case-insensitive comparisons, you must first convert the strings to all lowercase or 
	 * all uppercase using {@link StringLike#toLowerCase()} or {@link StringLike#toUpperCase()}.</p>
	 * <p>The less-than-or-equal and greater-than-or-equal operations do not rely on the 
	 * equality or identity operations for determining whether two values are "equal." 
	 * Instead, the less-than-or-equal operator is simply defined as "not greater than", 
	 * and the greater-than-or-equal operator is defined as "not less than". The one 
	 * exception occurs when either operand is (or converts to) <tt>NaN</tt>, in which case 
	 * all comparison operations return <tt>false</tt>.</p>
	 * @param other A value or object.
	 * @return <tt>true</tt> if the current date instance is less than the second 
	 * operand; otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>d < other</pre>
	 * where <tt>d</tt> is the current date instance of the invocation of this method.
	 */
	public final boolean lt(Object other) {
		return Js.lt(valueOf(), other);
	}

	/**
	 * <p>Greater-than operation, resembling that of JavaScript, evaluates to <tt>true</tt> if 
	 * the current date instance is greater than the second operand; otherwise it 
	 * evaluates to <tt>false</tt>.</p>
	 * <p>The operands of this operation may be of any type. Comparison can be performed 
	 * only on numbers and strings, however, so operands that are not numbers or strings 
	 * are converted. Comparison and conversion occur as follows:</p>
	 * <ul>
	 * <li>If both operands are numbers, or if both convert to numbers, they are compared 
	 * numerically.</li>
	 * <li>If both operands are strings or convert to strings, they are compared as 
	 * strings.</li>
	 * <li>If one operand is or converts to a string, and one is or converts to a number, 
	 * the operation attempts to convert the string to a number and performs a numerical 
	 * comparison. If the string does not represent a number, it converts to <tt>NaN</tt>, 
	 * and the comparison is <tt>false</tt>. In JavaScript 1.1, the string-to-number 
	 * conversion causes an error instead of yielding <tt>NaN</tt>.</li>
	 * <li>If an object can be converted to either a number or a string, JavaScript performs 
	 * the numerical conversion. This means, for example, that Date objects are compared 
	 * numerically, and it is meaningful to compare two dates to see whether one is earlier 
	 * than the other.</li>
	 * <li>If the operands of the comparison operations cannot both be successfully converted 
	 * to numbers or to strings, these operations always return <tt>false</tt>.</li>
	 * <li>If either operand is or converts to <tt>NaN</tt>, the comparison operation always 
	 * yields <tt>false</tt>.</li>
	 * </ul>
	 * <p>Keep in mind that string comparison is done on a strict character-by-character 
	 * basis using the numerical value of each character from the Unicode encoding. Although 
	 * in some cases the Unicode standard allows equivalent strings to be encoded using 
	 * different sequences of characters, the JavaScript comparison operations do not 
	 * detect these encoding differences; they assume that all strings are expressed in 
	 * normalized form. Note in particular that string comparison is case-sensitive, and 
	 * in the Unicode encoding (at least for the ASCII subset), all capital letters are 
	 * "less than" all lowercase letters. This rule can cause confusing results if you do 
	 * not expect it.</p>
	 * <p>For a more robust string-comparison algorithm, see the {@link StringLike#localeCompare(Object)} 
	 * method, which also takes locale-specific definitions of alphabetical order into account. 
	 * For case-insensitive comparisons, you must first convert the strings to all lowercase or 
	 * all uppercase using {@link StringLike#toLowerCase()} or {@link StringLike#toUpperCase()}.</p>
	 * <p>The less-than-or-equal and greater-than-or-equal operations do not rely on the 
	 * equality or identity operations for determining whether two values are "equal." 
	 * Instead, the less-than-or-equal operator is simply defined as "not greater than", 
	 * and the greater-than-or-equal operator is defined as "not less than". The one 
	 * exception occurs when either operand is (or converts to) <tt>NaN</tt>, in which case 
	 * all comparison operations return <tt>false</tt>.</p>
	 * @param other A value or object.
	 * @return <tt>true</tt> if the current date instance is greater than the second 
	 * operand; otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p > other</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final boolean gt(Object other) {
		return Js.gt(valueOf(), other);
	}

	/**
	 * <p>Less-than-or-equal operation, resembling that of JavaScript, evaluates to 
	 * <tt>true</tt> if the current date instance is less than or equal to the second 
	 * operand; otherwise it evaluates to <tt>false</tt>.</p>
	 * <p>The operands of this operation may be of any type. Comparison can be performed 
	 * only on numbers and strings, however, so operands that are not numbers or strings 
	 * are converted. Comparison and conversion occur as follows:</p>
	 * <ul>
	 * <li>If both operands are numbers, or if both convert to numbers, they are compared 
	 * numerically.</li>
	 * <li>If both operands are strings or convert to strings, they are compared as 
	 * strings.</li>
	 * <li>If one operand is or converts to a string, and one is or converts to a number, 
	 * the operation attempts to convert the string to a number and performs a numerical 
	 * comparison. If the string does not represent a number, it converts to <tt>NaN</tt>, 
	 * and the comparison is <tt>false</tt>. In JavaScript 1.1, the string-to-number 
	 * conversion causes an error instead of yielding <tt>NaN</tt>.</li>
	 * <li>If an object can be converted to either a number or a string, JavaScript performs 
	 * the numerical conversion. This means, for example, that Date objects are compared 
	 * numerically, and it is meaningful to compare two dates to see whether one is earlier 
	 * than the other.</li>
	 * <li>If the operands of the comparison operations cannot both be successfully converted 
	 * to numbers or to strings, these operations always return <tt>false</tt>.</li>
	 * <li>If either operand is or converts to <tt>NaN</tt>, the comparison operation always 
	 * yields <tt>false</tt>.</li>
	 * </ul>
	 * <p>Keep in mind that string comparison is done on a strict character-by-character 
	 * basis using the numerical value of each character from the Unicode encoding. Although 
	 * in some cases the Unicode standard allows equivalent strings to be encoded using 
	 * different sequences of characters, the JavaScript comparison operations do not 
	 * detect these encoding differences; they assume that all strings are expressed in 
	 * normalized form. Note in particular that string comparison is case-sensitive, and 
	 * in the Unicode encoding (at least for the ASCII subset), all capital letters are 
	 * "less than" all lowercase letters. This rule can cause confusing results if you do 
	 * not expect it.</p>
	 * <p>For a more robust string-comparison algorithm, see the {@link StringLike#localeCompare(Object)} 
	 * method, which also takes locale-specific definitions of alphabetical order into account. 
	 * For case-insensitive comparisons, you must first convert the strings to all lowercase or 
	 * all uppercase using {@link StringLike#toLowerCase()} or {@link StringLike#toUpperCase()}.</p>
	 * <p>The less-than-or-equal and greater-than-or-equal operations do not rely on the 
	 * equality or identity operations for determining whether two values are "equal." 
	 * Instead, the less-than-or-equal operator is simply defined as "not greater than", 
	 * and the greater-than-or-equal operator is defined as "not less than". The one 
	 * exception occurs when either operand is (or converts to) <tt>NaN</tt>, in which case 
	 * all comparison operations return <tt>false</tt>.</p>
	 * @param other A value or object.
	 * @return <tt>true</tt> if the current date instance is less than or equal to 
	 * the second operand; otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p <= other</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final boolean lte(Object other) {
		return Js.lte(valueOf(), other);
	}

	/**
	 * <p>Greater-than-or-equal operation, resembling that of JavaScript, evaluates to 
	 * <tt>true</tt> if the current date instance is greater than or equal to the 
	 * second operand; otherwise it evaluates to <tt>false</tt>.</p>
	 * <p>The operands of this operation may be of any type. Comparison can be performed 
	 * only on numbers and strings, however, so operands that are not numbers or strings 
	 * are converted. Comparison and conversion occur as follows:</p>
	 * <ul>
	 * <li>If both operands are numbers, or if both convert to numbers, they are compared 
	 * numerically.</li>
	 * <li>If both operands are strings or convert to strings, they are compared as 
	 * strings.</li>
	 * <li>If one operand is or converts to a string, and one is or converts to a number, 
	 * the operation attempts to convert the string to a number and performs a numerical 
	 * comparison. If the string does not represent a number, it converts to <tt>NaN</tt>, 
	 * and the comparison is <tt>false</tt>. In JavaScript 1.1, the string-to-number 
	 * conversion causes an error instead of yielding <tt>NaN</tt>.</li>
	 * <li>If an object can be converted to either a number or a string, JavaScript performs 
	 * the numerical conversion. This means, for example, that Date objects are compared 
	 * numerically, and it is meaningful to compare two dates to see whether one is earlier 
	 * than the other.</li>
	 * <li>If the operands of the comparison operations cannot both be successfully converted 
	 * to numbers or to strings, these operations always return <tt>false</tt>.</li>
	 * <li>If either operand is or converts to <tt>NaN</tt>, the comparison operation always 
	 * yields <tt>false</tt>.</li>
	 * </ul>
	 * <p>Keep in mind that string comparison is done on a strict character-by-character 
	 * basis using the numerical value of each character from the Unicode encoding. Although 
	 * in some cases the Unicode standard allows equivalent strings to be encoded using 
	 * different sequences of characters, the JavaScript comparison operations do not 
	 * detect these encoding differences; they assume that all strings are expressed in 
	 * normalized form. Note in particular that string comparison is case-sensitive, and 
	 * in the Unicode encoding (at least for the ASCII subset), all capital letters are 
	 * "less than" all lowercase letters. This rule can cause confusing results if you do 
	 * not expect it.</p>
	 * <p>For a more robust string-comparison algorithm, see the {@link StringLike#localeCompare(Object)} 
	 * method, which also takes locale-specific definitions of alphabetical order into account. 
	 * For case-insensitive comparisons, you must first convert the strings to all lowercase or 
	 * all uppercase using {@link StringLike#toLowerCase()} or {@link StringLike#toUpperCase()}.</p>
	 * <p>The less-than-or-equal and greater-than-or-equal operations do not rely on the 
	 * equality or identity operations for determining whether two values are "equal." 
	 * Instead, the less-than-or-equal operator is simply defined as "not greater than", 
	 * and the greater-than-or-equal operator is defined as "not less than". The one 
	 * exception occurs when either operand is (or converts to) <tt>NaN</tt>, in which case 
	 * all comparison operations return <tt>false</tt>.</p>
	 * @param other A value or object.
	 * @return <tt>true</tt> if the current date instance is greater than or equal to 
	 * the second operand; otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p >= other</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final boolean gte(Object other) {
		return Js.gte(valueOf(), other);
	}

	/**
	 * <p>Checks if the current date instance is an instance of the second operand, 
	 * resembling the <tt>instanceof</tt> operator in JavaScript.</p>
	 * <p>This operation expects the first operand be an object and the second be a class 
	 * of objects. In JavaScript, classes of objects are defined by the constructor function 
	 * that initializes them.</p>
	 * @param other A constructor function.
	 * @return <tt>true</tt> if the current date instance is an instance of the second 
	 * operand; <tt>false</tt>, otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p instanceof other</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
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
	 * <pre>p == other</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final boolean eq(Object other) {
		return Js.eq(this, other);
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
	 * <pre>p === other</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
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
	 * <pre>p != other</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final boolean neq(Object other) {
		return Js.neq(this, other);
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
	 * <pre>p !== other</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final boolean neqs(Object other) {
		return Js.neqs(this, other);
	}

	/**
	 * <p>Bitwise-AND operation, resembling that of JavaScript, performs a boolean AND 
	 * operation on each bit of the integer arguments. A bit is set in the result only if 
	 * the corresponding bit is set in both operands.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with operands that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
	 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
	 * the 32nd.</p>
	 * @param other A numeric value.
	 * @return The bitwise-AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p & other</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final int band(Object other) {
		return Js.band(valueOf(), other);
	}

	/**
	 * <p>Bitwise-OR operation, resembling that of JavaScript, performs a boolean OR operation 
	 * on each bit of the integer arguments. A bit is set in the result if the corresponding 
	 * bit is set in one or both of the operands.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with operands that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
	 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
	 * the 32nd.</p>
	 * @param other A numeric value.
	 * @return The bitwise-OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p | other</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final int bor(Object other) {
		return Js.bor(valueOf(), other);
	}

	/**
	 * <p>Bitwise-XOR operation, resembling that of JavaScript, performs a boolean exclusive 
	 * OR operation on each bit of the integer arguments. Exclusive OR means that either 
	 * operand one is <tt>true</tt> or operand two is <tt>true</tt>, but not both. A bit is 
	 * set in this operation's result if a corresponding bit is set in one (but not both) 
	 * of the two operands.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with operands that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
	 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
	 * the 32nd.</p>
	 * @param other A numeric value.
	 * @return The bitwise-exclusive-OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p ^ other</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final int xor(Object other) {
		return Js.xor(valueOf(), other);
	}

	/**
	 * <p>Shift-left operation, resembling that of JavaScript, moves all bits in the 
	 * current primitive instance to the left by the number of places specified in the 
	 * second operand, which should be an integer between 0 and 31.</p>
	 * <p>A zero is used for the new first bit, and the value of the 32nd bit is lost. 
	 * Shifting a value left by one position is equivalent to multiplying by 2, shifting 
	 * two positions is equivalent to multiplying by 4, etc.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with values that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the values to 
	 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
	 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
	 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
	 * yields a number in the appropriate range.</p>
	 * @param n The number of bits to shift.
	 * @return The shifted integer number.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p << n</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final int shl(int n) {
		return Js.shl(valueOf(), n);
	}

	/**
	 * <p>Shift-right operation, resembling that of JavaScript, moves all bits in the 
	 * current primitive instance to the right by the number of places specified in the 
	 * second operand (an integer between 0 and 31). Bits that are shifted off the right 
	 * are lost. The bits filled in on the left depend on the sign bit of the original 
	 * value, in order to preserve the sign of the result. If the current primitive 
	 * instance is positive, the result has zeros placed in the high bits; if the current 
	 * primitive instance is negative, the result has ones placed in the high bits.</p>
	 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
	 * remainder), shifting right two places is equivalent to integer division by 4, and 
	 * so on.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with values that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the values to 
	 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
	 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
	 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
	 * yields a number in the appropriate range.</p>
	 * @param n The number of bits to shift.
	 * @return The shifted integer number.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p >> n</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final int shr(int n) {
		return Js.shr(valueOf(), n);
	}

	/**
	 * <p>Shift-right-unsigned operation, resembling that of JavaScript, moves all bits in 
	 * the current date instance to the right by the number of places specified in the 
	 * second operand (an integer between 0 and 31). Bits that are shifted off the right 
	 * are lost. The result has zeros placed in the high bits.</p>
	 * <p>This operation is just like {@link #shr(int)}, except that the bits shifted 
	 * in on the left are always zero, regardless of the sign of the current date instance.</p>
	 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
	 * remainder), shifting right two places is equivalent to integer division by 4, and 
	 * so on.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with values that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the values to 
	 * 32-bit integers by dropping any fractional part of the value or any bits beyond 
	 * the 32nd. The shift operation requires a (right-side) operand between 0 and 31. After 
	 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
	 * yields a number in the appropriate range.</p>
	 * @param n The number of bits to shift.
	 * @return The shifted integer number.
	 * @since 1.0
	 * @javascript Re-compilers must replace the instance invocation of this method with the 
	 * JavaScript expression:
	 * <pre>p >>> n</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final int shru(int n) {
		return Js.shru(valueOf(), n);
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
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
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
	 * <pre>p && other</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
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
	 * <pre>p && other</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final JsDate and(JsDate other) {
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
	 * <pre>p && other</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final DateLike and(DateLike other) {
		return (DateLike)Js.and(this, other);
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
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
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
	 * <pre>p || other</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
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
	 * <pre>p || other</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final JsDate or(JsDate other) {
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
	 * <pre>p || other</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final DateLike or(DateLike other) {
		return (DateLike)Js.or(this, other);
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
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
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
	 * <pre>test ? p : other</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final Number cond(Object test, Number other) {
		return Js.cond(test, valueOf(), other);
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
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final Number cond(Object test, Character other) {
		return Js.cond(test, valueOf(), Js.valueOf(other));
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
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final Number cond(Object test, Value<? extends Number> other) {
		return Js.cond(test, valueOf(), other);
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
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
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
	 * <pre>test ? p : other</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final JsDate cond(Object test, JsDate other) {
		return Js.cond(test, this, other);
	}

	/**
	 * <p>Performs unary negation on a 64-bit integer.</p>
	 * <p>This operation converts a positive value to an equivalently negative value, and 
	 * vice versa. If the operand is not a 64-bit integer, it attempts to convert it to one.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision. </p>
	 * @return The negation of the 64-bit integer.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a negation operation on a long number, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>-((Number)p).longValue()</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final long lneg() {
		return Js.lneg(this);
	}

	/**
	 * <p>The 64-bit bitwise-NOT operation, casting the operand to a <tt>long</tt> number 
	 * if it is not 64-bit, operates by reversing all bits in the 64-bit integer.</p>
	 * <p>Because of the way signed integers are represented in JavaScript, applying this 
	 * operation to a value is equivalent to changing its sign and subtracting 1.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @return The bitwise-NOT of the 64-bit integer.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a bitwise-NOT operation on a long number, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>~((Number)p).longValue()</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final long lnot() {
		return Js.lnot(this);
	}

	/**
	 * <p>Adds two 64-bit integers, casting the operands to <tt>long</tt> numbers if any 
	 * one of them is not a 64-bit integer.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return The sum of the two 64-bit integers.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of an addition operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() + ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final long ladd(Object other) {
		return Js.ladd(this, other);
	}

	/**
	 * <p>Subtracts the second 64-bit integer from the first 64-bit integer, casting the 
	 * operands to <tt>long</tt> numbers if any one of them is not a 64-bit integer.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return The difference between the two 64-bit integers.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a subtraction operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() - ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final long lsub(Object other) {
		return Js.lsub(this, other);
	}

	/**
	 * <p>Multiplies the two 64-bit integer, casting the operands to <tt>long</tt> numbers 
	 * if any one of them is not a 64-bit integer.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return The product of the two 64-bit integers.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a multiplication operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() * ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final long lmul(Object other) {
		return Js.lmul(this, other);
	}

	/**
	 * <p>Divides the first 64-bit integer by the second 64-bit integer, casting the operands 
	 * to <tt>long</tt> numbers if any one of them is not a 64-bit integer.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return The quotient of the two 64-bit integers.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of an division operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() / ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final long ldiv(Object other) {
		return Js.ldiv(this, other);
	}

	/**
	 * <p>Computes the first operand modulo the second operand, casting the operands to 
	 * <tt>long</tt> numbers if any one of them is not a 64-bit integer.</p>
	 * <p>The operation returns the remainder when the first operand is divided by the 
	 * second operand a certain number of times. The sign of the result is the same as the 
	 * sign of the first operand.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return The remainder.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a modulo operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() % ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final long lmod(Object other) {
		return Js.lmod(this, other);
	}

	/**
	 * <p>The 64-bit shift-left operation, casting the first operand to a <tt>long</tt> 
	 * number if it is not 64-bit, moves all bits in it to the left by the number of places 
	 * specified in the second operand, which should be an integer between 0 and 63.</p>
	 * <p>A zero is used for the new first bit, and the value of the 64th bit is lost. 
	 * Shifting a value left by one position is equivalent to multiplying by 2, shifting 
	 * two positions is equivalent to multiplying by 4, etc.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param n The number of bits to shift.
	 * @return The shifted 64-bit integer.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a shift-left operation on a long number, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() << n</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final long lshl(int n) {
		return Js.lshl(this, n);
	}

	/**
	 * <p>The 64-bit shift-right operation, casting the first operand to a <tt>long</tt> 
	 * number if it is not 64-bit, moves all bits in it to the right by the number of 
	 * places specified in the second operand (an integer between 0 and 63). Bits that are 
	 * shifted off the right are lost. The bits filled in on the left depend on the sign 
	 * bit of the original operand, in order to preserve the sign of the result. If the 
	 * first operand is positive, the result has zeros placed in the high bits; if the 
	 * first operand is negative, the result has ones placed in the high bits.</p>
	 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
	 * remainder), shifting right two places is equivalent to integer division by 4, and 
	 * so on.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param n The number of bits to shift.
	 * @return The shifted 64-bit integer.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a shift-right operation on a long number, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() >> n</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final long lshr(int n) {
		return Js.lshr(this, n);
	}

	/**
	 * <p>The 64-bit shift-right-unsigned operation, casting the first operand to a 
	 * <tt>long</tt> number if it is not 64-bit, moves all bits in it to the right by the 
	 * number of places specified in the second operand (an integer between 0 and 63). Bits 
	 * that are shifted off the right are lost. The result has zeros placed in the high 
	 * bits.</p>
	 * <p>This operation is just like {@link #lshr(int)}, except that the bits shifted 
	 * in on the left are always zero, regardless of the sign of the first operand.</p>
	 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
	 * remainder), shifting right two places is equivalent to integer division by 4, and 
	 * so on.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param n The number of bits to shift.
	 * @return The shifted 64-bit integer.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of an unsigned shift-right operation on a long number, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() >>> n</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final long lshru(int n) {
		return Js.lshru(this, n);
	}

	/**
	 * <p>The 64-bit bitwise-AND operation, casting the operands to <tt>long</tt> numbers 
	 * if any one of them is not a 64-bit integer, performs a boolean AND operation on each 
	 * bit of the 64-bit integers. A bit is set in the result only if the corresponding 
	 * bit is set in both operands.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return The bitwise-AND of the two 64-bit integers.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a bitwise AND operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() & ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final long land(Object other) {
		return Js.land(valueOf(), other);
	}

	/**
	 * <p>The 64-bit bitwise-OR operation, casting the operands to <tt>long</tt> numbers if 
	 * any one of them is not a 64-bit integer, performs a boolean OR operation on each bit 
	 * of the 64-bit integers. A bit is set in the result if the corresponding bit is set 
	 * in one or both of the operands.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return The bitwise-OR of the two 64-bit integers.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a bitwise OR operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() | ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final long lor(Object other) {
		return Js.lor(valueOf(), other);
	}

	/**
	 * <p>The 64-bit bitwise-XOR operation, casting the operands to <tt>long</tt> numbers 
	 * if any one of them is not a 64-bit integer, performs a boolean exclusive OR operation 
	 * on each bit of the 64-bit integers. Exclusive OR means that either operand one is 
	 * <tt>true</tt> or operand two is <tt>true</tt>, but not both. A bit is set in this 
	 * operation's result if a corresponding bit is set in one (but not both) of the two 
	 * operands.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return The bitwise-exclusive-OR of the two 64-bit integers.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a bitwise exclusive OR operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() ^ ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final long lxor(Object other) {
		return Js.lxor(valueOf(), other);
	}

	/**
	 * <p>The 64-bit less-than operation, casting the operands to <tt>long</tt> numbers if 
	 * any one of them is not a 64-bit integer, evaluates to <tt>true</tt> if the first 
	 * operand is less than the second operand; otherwise it evaluates to <tt>false</tt>.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return <tt>true</tt> if the first operand is less than the second operand; 
	 * otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a less-than operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() < ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final boolean llt(Object other) {
		return Js.llt(valueOf(), other);
	}

	/**
	 * <p>The 64-bit greater-than operation, casting the operands to <tt>long</tt> numbers 
	 * if any one of them is not a 64-bit integer, evaluates to <tt>true</tt> if the first 
	 * operand is greater than the second operand; otherwise it evaluates to <tt>false</tt>.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return <tt>true</tt> if the first operand is greater than the second operand; 
	 * otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a greater-than operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() > ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final boolean lgt(Object other) {
		return Js.lgt(valueOf(), other);
	}

	/**
	 * <p>The 64-bit less-than-or-equal operation, casting the operands to <tt>long</tt> 
	 * numbers if any one of them is not a 64-bit integer, evaluates to <tt>true</tt> if 
	 * the first operand is less than or equal to the second operand; otherwise it evaluates 
	 * to <tt>false</tt>.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return <tt>true</tt> if the first operand is less than or equal to the second operand; 
	 * otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a less-than-or-equal operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() <= ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final boolean llte(Object other) {
		return Js.llte(valueOf(), other);
	}

	/**
	 * <p>The 64-bit greater-than-or-equal operation, casting the operands to <tt>long</tt> 
	 * numbers if any one of them is not a 64-bit integer, evaluates to <tt>true</tt> if the 
	 * first operand is greater than or equal to the second operand; otherwise it evaluates 
	 * to <tt>false</tt>.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return <tt>true</tt> if the first operand is greater than or equal to the second operand; 
	 * otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a greater-than-or-equal operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() >= ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final boolean lgte(Object other) {
		return Js.lgte(valueOf(), other);
	}

	/**
	 * <p>Checks whether the two 64-bit integers are "equal", casting the operands to 
	 * <tt>long</tt> numbers if any one of them is not a 64-bit integer.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return <tt>true</tt> if the first operand equals the second; <tt>false</tt>, 
	 * otherwise;
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of an equality operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() == ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final boolean leq(Object other) {
		return Js.leq(valueOf(), other);
	}

	/**
	 * <p>Checks whether the two 64-bit integers are not "equal", casting the operands to 
	 * <tt>long</tt> numbers if any one of them is not a 64-bit integer.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param other Any numeric value.
	 * @return <tt>false</tt> if the first operand equals the second; <tt>true</tt>, 
	 * otherwise;
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the instance invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of an inequality operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)p).longValue() != ((Number)other).longValue()</pre>
	 * where <tt>p</tt> is the current date instance of the invocation of this method.
	 */
	public final boolean lneq(Object other) {
		return Js.lneq(valueOf(), other);
	}
}
