
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

import js.core.JsDate;

/**
 * <p>An <b>opaque</b> interface resembling JavaScript built-in Date objects for 
 * manipulating dates and times.</p>
 * <p>This interface must be implemented in JS Simulation Libraries.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see Js#date()
 * @see Js#date(Number)
 * @see Js#date(String)
 * @see js.core.JsDate#JsDate(js.core.JsObject)
 * @see js.core.JsDate#JsDate(Number)
 * @see js.core.JsDate#JsDate(NumberLike)
 * @see js.core.JsDate#JsDate(String)
 * @see js.core.JsDate#JsDate(StringLike)
 * @see js.core.JsDate#JsDate(Object, Object)
 * @see js.core.JsDate#JsDate(Object, Object, Object)
 * @see js.core.JsDate#JsDate(Object, Object, Object, Object)
 * @see js.core.JsDate#JsDate(Object, Object, Object, Object, Object)
 * @see js.core.JsDate#JsDate(Object, Object, Object, Object, Object, Object)
 * @see js.core.JsDate#JsDate(Object, Object, Object, Object, Object, Object, Object)
 * @see js.core.JsGlobal.Date#create()
 * @see js.core.JsGlobal.Date#create(Vars)
 * @see js.core.JsGlobal.Date#create(Number)
 * @see js.core.JsGlobal.Date#create(NumberLike)
 * @see js.core.JsGlobal.Date#create(Object)
 * @see js.core.JsGlobal.Date#create(Object, Object)
 * @see js.core.JsGlobal.Date#create(Object, Object, Object)
 * @see js.core.JsGlobal.Date#create(Object, Object, Object, Object)
 * @see js.core.JsGlobal.Date#create(Object, Object, Object, Object, Object)
 * @see js.core.JsGlobal.Date#create(Object, Object, Object, Object, Object, Object)
 * @see js.core.JsGlobal.Date#create(Object, Object, Object, Object, Object, Object, Object)
 * @see jsx.core.DateLikes
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */

public interface DateLike
{
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number getTime();
	/**
	 * <p>Returns the year of the current date instance in full four-digit form, in local 
	 * time.</p>
	 * @return The year that results when the current date instance is expressed in local 
	 * time. The return value is a full four-digit year, including the century, not a 
	 * two-digit abbreviation..
	 * @see #getUTCFullYear()
	 * @see jsx.core.DateLikes#getFullYear(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number getFullYear();
	/**
	 * <p>Returns the year of the current date instance in full four-digit form, in 
	 * universal time.</p>
	 * @return The year that results when the current date instance is expressed in 
	 * universal time. The return value is a full four-digit year, not a two-digit 
	 * abbreviation.
	 * @see #getFullYear()
	 * @see jsx.core.DateLikes#getUTCFullYear(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number getUTCFullYear();
	/**
	 * <p>Returns the month field of the current date instance, in local time.</p>
	 * @return The month of the year that results when the current date instance is 
	 * expressed in local time. The return value is an integer between 0 (January) 
	 * and 11 (December). Note that the date represents the first day of the month as 1 
	 * but represents the first month of the year as 0.
	 * @see #getUTCMonth()
	 * @see jsx.core.DateLikes#getMonth(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number getMonth();
	/**
	 * <p>Returns the month field of the current date instance, in universal time.</p>
	 * @return The month of the year that results when the current date instance is 
	 * expressed in universal time. The return value is an integer between 0 (January) 
	 * and 11 (December). Note that the date represents the first day of the month as 1 
	 * but represents the first month of the year as 0.
	 * @see #getMonth()
	 * @see jsx.core.DateLikes#getUTCMonth(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number getUTCMonth();
	/**
	 * <p>Returns the day of the month of the current date instance, in local time.</p>
	 * @return The day of the month of the current date instance, using local time. 
	 * Return values are between 1 and 31.
	 * @see #getUTCDate()
	 * @see jsx.core.DateLikes#getDate(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number getDate();
	/**
	 * <p>Returns the day of the month of the current date instance, in universal time.</p>
	 * @return The day of the month (a value between 1 and 31) that results when the 
	 * current date instance is expressed in universal time.
	 * @see #getDate()
	 * @see jsx.core.DateLikes#getUTCDate(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number getUTCDate();
	/**
	 * <p>Returns the day of the week of the current date instance, in local time.</p>
	 * @return The day of the week of the current date instance, using local time. Return values 
	 * are between 0 (Sunday) and 6 (Saturday).
	 * @see #getUTCDay()
	 * @see jsx.core.DateLikes#getDay(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number getDay();
	/**
	 * <p>Returns the day of the week of current date instance, in universal time.</p>
	 * @return The day of the week that results when the current date instance is expressed 
	 * in universal time. Return values are between 0 (Sunday) and 6 (Saturday).
	 * @see #getDay()
	 * @see jsx.core.DateLikes#getUTCDay(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number getUTCDay();
	/**
	 * <p>Returns the hours field of the current date instance, in local time.</p>
	 * @return The hours field, expressed in local time, of the current date instance. 
	 * Return values are between 0 (midnight) and 23 (11 p.m.).
	 * @see #getUTCHours()
	 * @see jsx.core.DateLikes#getHours(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number getHours();
	/**
	 * <p>Returns the hours field of the current date instance, in universal time.</p>
	 * @return The hours field, expressed in universal time, of the current date instance. 
	 * The return value is an integer between 0 (midnight) and 23 (11 p.m.).
	 * @see #getHours()
	 * @see jsx.core.DateLikes#getUTCHours(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number getUTCHours();
	/**
	 * <p>Returns the minutes field of a Date object, in local or universal time.</p>
	 * @return The minutes field, expressed in local time, of the current date instance. 
	 * Return values are between 0 and 59.
	 * @see #getUTCMinutes()
	 * @see jsx.core.DateLikes#getMinutes(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number getMinutes();
	/**
	 * <p>Returns the minutes field of the current date instance, in universal time.</p>
	 * @return The minutes field, expressed in universal time, of the current date instance. 
	 * The return value is an integer between 0 and 59.
	 * @see #getMinutes()
	 * @see jsx.core.DateLikes#getUTCMinutes(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number getUTCMinutes();
	/**
	 * <p>Returns the seconds field of the current date instance, in local time.</p>
	 * @return The seconds field, expressed in local time, of the current date instance. 
	 * Return values are between 0 and 59.
	 * @see #getUTCSeconds()
	 * @see jsx.core.DateLikes#getSeconds(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number getSeconds();
	/**
	 * <p>Returns the seconds field of the current date instance, in universal time.</p>
	 * @return The seconds field, expressed in universal time, of the current date instance. 
	 * The return value is an integer between 0 and 59.
	 * @see #getSeconds()
	 * @see jsx.core.DateLikes#getUTCSeconds(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number getUTCSeconds();
	/**
	 * <p>Returns the milliseconds field of the current date instance, in local time.</p>
	 * @return The milliseconds field, expressed in local time, of the current date instance.
	 * @see #getUTCMilliseconds()
	 * @see jsx.core.DateLikes#getMilliseconds(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number getMilliseconds();
	/**
	 * <p>Returns the milliseconds field of current date instance, in universal time.</p>
	 * @return The milliseconds field, expressed in universal time, of the current date instance.
	 * @see #getMilliseconds()
	 * @see jsx.core.DateLikes#getUTCMilliseconds(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number getUTCMilliseconds();
	/**
	 * <p>Returns the difference, in minutes, between the local and UTC representations of 
	 * the current date instance. Note that the value returned depends on whether daylight 
	 * saving time is or would be in effect at the specific date.</p>
	 * <p>The return value is measured in minutes, rather than hours, because some 
	 * countries have time zones that are not at even one-hour intervals.</p>
	 * @return The difference, in minutes, between GMT and local time.
	 * @see jsx.core.DateLikes#getTimezoneOffset(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number getTimezoneOffset();
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setTime(Object time);
	/**
	 * <p>Sets the milliseconds field of a date, using local time.</p>
	 * @param ms The milliseconds field, expressed in local time, to be set in the current 
	 * date instance. This argument should be an integer between 0 and 999.
	 * @return The millisecond representation of the adjusted date.
	 * @see #setUTCMilliseconds(Object)
	 * @see jsx.core.DateLikes#setMilliseconds(DateLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setMilliseconds(Object ms);
	/**
	 * <p>Sets the milliseconds field of the current date instance, using universal time.</p>
	 * @param ms The milliseconds field, expressed in universal time, to be set in the 
	 * current date instance. This argument should be an integer between 0 and 999.
	 * @return The millisecond representation of the adjusted date.
	 * @see #setMilliseconds(Object)
	 * @see jsx.core.DateLikes#setUTCMilliseconds(DateLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setUTCMilliseconds(Object ms);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setSeconds(Object sec);
	/**
	 * <p>Sets the seconds field of the current date instance, using universal time.</p>
	 * @param sec The seconds field, expressed in universal time, to be set in the current 
	 * date instance. This argument should be an integer between 0 and 59.
	 * @return The millisecond representation of the adjusted date.
	 * @see #setSeconds(Object)
	 * @see #setUTCSeconds(Object, Object)
	 * @see jsx.core.DateLikes#setUTCSeconds(DateLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setUTCSeconds(Object sec);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setSeconds(Object sec, Object ms);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setUTCSeconds(Object sec, Object ms);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setMinutes(Object min);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setUTCMinutes(Object min);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setMinutes(Object min, Object sec);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setUTCMinutes(Object min, Object sec);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setMinutes(Object min, Object sec, Object ms);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setUTCMinutes(Object min, Object sec, Object ms);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setHours(Object hr);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setUTCHours(Object hr);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setHours(Object hr, Object min);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setUTCHours(Object hr, Object min);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setHours(Object hr, Object min, Object sec);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setUTCHours(Object hr, Object min, Object sec);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setHours(Object hr, Object min, Object sec, Object ms);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setUTCHours(Object hr, Object min, Object sec, Object ms);
	/**
	 * <p>Sets the day of the month field of the current date instance, using local time.</p>
	 * @param day An integer between 1 and 31 that is used as the new value in local time 
	 * of the day-of-the-month field of the current date instance.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setUTCDate(Object)
	 * @see jsx.core.DateLikes#setDate(DateLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setDate(Object day);
	/**
	 * <p>Sets the day of the month field of the current date instance, using universal 
	 * time.</p>
	 * @param day The day of the month, expressed in universal time, to be set in the 
	 * current date instance. This argument should be an integer between 1 and 31.
	 * @return The millisecond representation of the adjusted date. 
	 * @see #setDate(Object)
	 * @see jsx.core.DateLikes#setUTCDate(DateLike, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setUTCDate(Object day);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setMonth(Object mo);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setUTCMonth(Object mo);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setMonth(Object mo, Object day);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setUTCMonth(Object mo, Object day);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setFullYear(Object yr);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setUTCFullYear(Object yr);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setFullYear(Object yr, Object mo);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setUTCFullYear(Object yr, Object mo);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setFullYear(Object yr, Object mo, Object day);
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number setUTCFullYear(Object yr, Object mo, Object day);
	/**
	 * <p>Converts a date to a string, using the local time zone and the local date 
	 * formatting conventions.</p>
	 * <p>This method also uses local conventions for date and time formatting, so the 
	 * format may vary from platform to platform and from country to country. It returns 
	 * a string formatted in what is likely the user's preferred date and time format.</p>
	 * @return A string representation of the date and time specified by the current date 
	 * instance. The date and time are represented in the local time zone and formatted 
	 * using locally appropriate conventions.
	 * @see #toLocaleDateString()
	 * @see #toLocaleTimeString()
	 * @see #toString()
	 * @see #toUTCString()
	 * @see jsx.core.DateLikes#toLocaleString(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String toLocaleString();
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String toDateString();
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String toTimeString();
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String toLocaleDateString();
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
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String toLocaleTimeString();
	/**
	 * <p>Converts the current date instance to a string, using universal time.</p>
	 * @return A human-readable string representation, expressed in universal time, of the 
	 * current date instance.
	 * @see #toLocaleString()
	 * @see #toString()
	 * @see jsx.core.DateLikes#toUTCString(DateLike)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String toUTCString();
	/**
	 * <p>Converts the current date instance to a string using the local time zone.</p>
	 * @return A human-readable string representation of the current date instance, 
	 * expressed in the local time zone.
	 * @see #toDateString()
	 * @see #toLocaleString()
	 * @see #toTimeString()
	 * @see #toUTCString()
	 * @see js.core.JsGlobal.Date#parse(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String toString();
	/**
	 * <p>Returns the primitive value associated with the current instance, if there is one. 
	 * This invocation returns the primitive number value associated with the current instance.</p>
	 * @return The millisecond representation of the current date instance. The value 
	 * returned is the same as that returned by {@link #getTime()}.
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current date instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Number valueOf();
	/**
	 * <p>Simply returns the date object of the current date instance.</p>
	 * <p>This method is useful for JS Simulation to implement opaque types.</p>
	 * <p>If the current instance is a Java simulated date and the method runs in JS 
	 * Embed Simulation mode, the invocation creates and returns a JavaScript Date object 
	 * as a runtime copy of the current instance.</p>
	 * @return The date object of the current instance.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the interface invocation of this method, that is, 
	 * replacing it with its current instance.
	 */
	public JsDate var();
}
