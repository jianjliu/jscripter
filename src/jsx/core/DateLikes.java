
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

package jsx.core;

import js.*;

/**
 * <p>A utility class providing basic date operations with its static methods.</p>
 * <p>Users are encouraged to use the utilities provided by this class instead of the 
 * <b>opaque</b> methods of {@link js.DateLike} or {@link js.core.JsDate} in 
 * consideration of the reuse benefit for re-compilation results.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class DateLikes extends Disposable
{
	private DateLikes() {}

	/**
	 * <p>Returns the internal, millisecond representation of the current date instance.</p>
	 * <p>It converts the current date instance to a single integer. This is useful when 
	 * you want to compare two date instances or to determine the time elapsed between two 
	 * dates. Note that the millisecond representation of a date is independent of the 
	 * time zone, so there is no <tt>getUTCTime()</tt> method in addition to this one. 
	 * Don't confuse this method with the {@link #getDay(js.DateLike)} and {@link #getDate(js.DateLike)} methods, 
	 * which return the day of the week and the day of the month, respectively</p>
	 * <p>{@link js.core.JsGlobal.Date#parse(Object)} and {@link js.core.JsGlobal.Date#UTC(Object, Object)} 
	 * allow you to convert a date and time specification to a millisecond representation without 
	 * going through the overhead of first creating a date object.</p>
	 * @param d The current date instance.
	 * @return The millisecond representation of the current date instance, that is, the 
	 * number of milliseconds between midnight (GMT) on 1/1/1970 and the date and time 
	 * specified by the date.
	 * @see #setTime(js.DateLike, Object)
	 * @see js.core.JsGlobal.Date#parse(Object)
	 * @see js.core.JsGlobal.Date#UTC(Object, Object)
	 * @see js.core.JsGlobal.Date#UTC(Object, Object, Object)
	 * @see js.core.JsGlobal.Date#UTC(Object, Object, Object, Object)
	 * @see js.core.JsGlobal.Date#UTC(Object, Object, Object, Object, Object)
	 * @see js.core.JsGlobal.Date#UTC(Object, Object, Object, Object, Object, Object)
	 * @see js.core.JsGlobal.Date#UTC(Object, Object, Object, Object, Object, Object, Object)
	 * @see js.DateLike#getTime()
	 * @since 1.0
	 */
	public static final Number getTime(DateLike d) {
		return d.getTime();
	}
	/**
	 * <p>Returns the year of the current date instance in full four-digit form, in local 
	 * time.</p>
	 * @param d The current date instance.
	 * @return The year that results when the current date instance is expressed in local 
	 * time. The return value is a full four-digit year, including the century, not a 
	 * two-digit abbreviation..
	 * @see #getUTCFullYear(js.DateLike)
	 * @see js.DateLike#getFullYear()
	 * @since 1.0
	 */
	public static final Number getFullYear(DateLike d) {
		return d.getFullYear();
	}
	/**
	 * <p>Returns the year of the current date instance in full four-digit form, in 
	 * universal time.</p>
	 * @param d The current date instance.
	 * @return The year that results when the current date instance is expressed in 
	 * universal time. The return value is a full four-digit year, not a two-digit 
	 * abbreviation.
	 * @see #getFullYear(js.DateLike)
	 * @see js.DateLike#getUTCFullYear()
	 * @since 1.0
	 */
	public static final Number getUTCFullYear(DateLike d) {
		return d.getUTCFullYear();
	}
	/**
	 * <p>Returns the month field of the current date instance, in local time.</p>
	 * @param d The current date instance.
	 * @return The month of the year that results when the current date instance is 
	 * expressed in local time. The return value is an integer between 0 (January) 
	 * and 11 (December). Note that the date represents the first day of the month as 1 
	 * but represents the first month of the year as 0.
	 * @see #getUTCMonth(js.DateLike)
	 * @see js.DateLike#getMonth()
	 * @since 1.0
	 */
	public static final Number getMonth(DateLike d) {
		return d.getMonth();
	}
	/**
	 * <p>Returns the month field of the current date instance, in universal time.</p>
	 * @param d The current date instance.
	 * @return The month of the year that results when the current date instance is 
	 * expressed in universal time. The return value is an integer between 0 (January) 
	 * and 11 (December). Note that the date represents the first day of the month as 1 
	 * but represents the first month of the year as 0.
	 * @see #getMonth(js.DateLike)
	 * @see js.DateLike#getUTCMonth()
	 * @since 1.0
	 */
	public static final Number getUTCMonth(DateLike d) {
		return d.getUTCMonth();
	}
	/**
	 * <p>Returns the day of the month of the current date instance, in local time.</p>
	 * @param d The current date instance.
	 * @return The day of the month of the current date instance, using local time. 
	 * Return values are between 1 and 31.
	 * @see #getUTCDate(js.DateLike)
	 * @see js.DateLike#getDate()
	 * @since 1.0
	 */
	public static final Number getDate(DateLike d) {
		return d.getDate();
	}
	/**
	 * <p>Returns the day of the month of the current date instance, in universal time.</p>
	 * @param d The current date instance.
	 * @return The day of the month (a value between 1 and 31) that results when the 
	 * current date instance is expressed in universal time.
	 * @see #getDate(js.DateLike)
	 * @see js.DateLike#getUTCDate()
	 * @since 1.0
	 */
	public static final Number getUTCDate(DateLike d) {
		return d.getUTCDate();
	}
	/**
	 * <p>Returns the day of the week of the current date instance, in local time.</p>
	 * @param d The current date instance.
	 * @return The day of the week of the current date instance, using local time. Return values 
	 * are between 0 (Sunday) and 6 (Saturday).
	 * @see #getUTCDay(js.DateLike)
	 * @see js.DateLike#getDay()
	 * @since 1.0
	 */
	public static final Number getDay(DateLike d) {
		return d.getDay();
	}
	/**
	 * <p>Returns the day of the week of current date instance, in universal time.</p>
	 * @param d The current date instance.
	 * @return The day of the week that results when the current date instance is expressed 
	 * in universal time. Return values are between 0 (Sunday) and 6 (Saturday).
	 * @see #getDay(js.DateLike)
	 * @see js.DateLike#getUTCDay()
	 * @since 1.0
	 */
	public static final Number getUTCDay(DateLike d) {
		return d.getUTCDay();
	}
	/**
	 * <p>Returns the hours field of the current date instance, in local time.</p>
	 * @param d The current date instance.
	 * @return The hours field, expressed in local time, of the current date instance. 
	 * Return values are between 0 (midnight) and 23 (11 p.m.).
	 * @see #getUTCHours(js.DateLike)
	 * @see js.DateLike#getHours()
	 * @since 1.0
	 */
	public static final Number getHours(DateLike d) {
		return d.getHours();
	}
	/**
	 * <p>Returns the hours field of the current date instance, in universal time.</p>
	 * @param d The current date instance.
	 * @return The hours field, expressed in universal time, of the current date instance. 
	 * The return value is an integer between 0 (midnight) and 23 (11 p.m.).
	 * @see #getHours(js.DateLike)
	 * @see js.DateLike#getUTCHours()
	 * @since 1.0
	 */
	public static final Number getUTCHours(DateLike d) {
		return d.getUTCHours();
	}
	/**
	 * <p>Returns the minutes field of a Date object, in local or universal time.</p>
	 * @param d The current date instance.
	 * @return The minutes field, expressed in local time, of the current date instance. 
	 * Return values are between 0 and 59.
	 * @see #getUTCMinutes(js.DateLike)
	 * @see js.DateLike#getMinutes()
	 * @since 1.0
	 */
	public static final Number getMinutes(DateLike d) {
		return d.getMinutes();
	}
	/**
	 * <p>Returns the minutes field of the current date instance, in universal time.</p>
	 * @param d The current date instance.
	 * @return The minutes field, expressed in universal time, of the current date instance. 
	 * The return value is an integer between 0 and 59.
	 * @see #getMinutes(js.DateLike)
	 * @see js.DateLike#getUTCMinutes()
	 * @since 1.0
	 */
	public static final Number getUTCMinutes(DateLike d) {
		return d.getUTCMinutes();
	}
	/**
	 * <p>Returns the seconds field of the current date instance, in local time.</p>
	 * @param d The current date instance.
	 * @return The seconds field, expressed in local time, of the current date instance. 
	 * Return values are between 0 and 59.
	 * @see #getUTCSeconds(js.DateLike)
	 * @see js.DateLike#getSeconds()
	 * @since 1.0
	 */
	public static final Number getSeconds(DateLike d) {
		return d.getSeconds();
	}
	/**
	 * <p>Returns the seconds field of the current date instance, in universal time.</p>
	 * @param d The current date instance.
	 * @return The seconds field, expressed in universal time, of the current date instance. 
	 * The return value is an integer between 0 and 59.
	 * @see #getSeconds(js.DateLike)
	 * @see js.DateLike#getUTCSeconds()
	 * @since 1.0
	 */
	public static final Number getUTCSeconds(DateLike d) {
		return d.getUTCSeconds();
	}
	/**
	 * <p>Returns the milliseconds field of the current date instance, in local time.</p>
	 * @param d The current date instance.
	 * @return The milliseconds field, expressed in local time, of the current date instance.
	 * @see #getUTCMilliseconds(js.DateLike)
	 * @see js.DateLike#getMilliseconds()
	 * @since 1.0
	 */
	public static final Number getMilliseconds(DateLike d) {
		return d.getMilliseconds();
	}
	/**
	 * <p>Returns the milliseconds field of current date instance, in universal time.</p>
	 * @param d The current date instance.
	 * @return The milliseconds field, expressed in universal time, of the current date instance.
	 * @see #getMilliseconds(js.DateLike)
	 * @see js.DateLike#getUTCMilliseconds()
	 * @since 1.0
	 */
	public static final Number getUTCMilliseconds(DateLike d) {
		return d.getUTCMilliseconds();
	}
	/**
	 * <p>Returns the difference, in minutes, between the local and UTC representations of 
	 * the current date instance. Note that the value returned depends on whether daylight 
	 * saving time is or would be in effect at the specific date.</p>
	 * <p>The return value is measured in minutes, rather than hours, because some 
	 * countries have time zones that are not at even one-hour intervals.</p>
	 * @param d The current date instance.
	 * @return The difference, in minutes, between GMT and local time.
	 * @see js.DateLike#getTimezoneOffset()
	 * @since 1.0
	 */
	public static final Number getTimezoneOffset(DateLike d) {
		return d.getTimezoneOffset();
	}
	/**
	 * <p>Sets the fields of the current date instance using the millisecond format.</p>
	 * @param d The current date instance.
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
	 * @see js.DateLike#setTime(Object)
	 * @since 1.0
	 */
	public static final Number setTime(DateLike d, Object time) {
		return d.setTime(time);
	}
	/**
	 * <p>Sets the milliseconds field of a date, using local time.</p>
	 * @param d The current date instance.
	 * @param ms The milliseconds field, expressed in local time, to be set in the current 
	 * date instance. This argument should be an integer between 0 and 999.
	 * @return The millisecond representation of the adjusted date.
	 * @see #setUTCMilliseconds(js.DateLike, Object)
	 * @see js.DateLike#setMilliseconds(Object)
	 * @since 1.0
	 */
	public static final Number setMilliseconds(DateLike d, Object ms) {
		return d.setMilliseconds(ms);
	}
	/**
	 * <p>Sets the milliseconds field of the current date instance, using universal time.</p>
	 * @param d The current date instance.
	 * @param ms The milliseconds field, expressed in universal time, to be set in the 
	 * current date instance. This argument should be an integer between 0 and 999.
	 * @return The millisecond representation of the adjusted date.
	 * @see #setMilliseconds(js.DateLike, Object)
	 * @see js.DateLike#setUTCMilliseconds(Object)
	 * @since 1.0
	 */
	public static final Number setUTCMilliseconds(DateLike d, Object ms) {
		return d.setUTCMilliseconds(ms);
	}
	/**
	 * <p>Sets the seconds field of the current date instance, using local time.</p>
	 * @param d The current date instance.
	 * @param sec An integer between 0 and 59 that is set as the seconds value for the 
	 * current date instance.
	 * @return The millisecond representation of the adjusted date. Prior to ECMAScript 
	 * standardization, this method returns nothing.
	 * @see #setUTCSeconds(js.DateLike, Object)
	 * @see #setSeconds(js.DateLike, Object, Object)
	 * @see js.DateLike#setSeconds(Object)
	 * @since 1.0
	 */
	public static final Number setSeconds(DateLike d, Object sec) {
		return d.setSeconds(sec);
	}
	/**
	 * <p>Sets the seconds field of the current date instance, using universal time.</p>
	 * @param d The current date instance.
	 * @param sec The seconds field, expressed in universal time, to be set in the current 
	 * date instance. This argument should be an integer between 0 and 59.
	 * @return The millisecond representation of the adjusted date.
	 * @see #setSeconds(js.DateLike, Object)
	 * @see #setUTCSeconds(js.DateLike, Object, Object)
	 * @see js.DateLike#setUTCSeconds(Object)
	 * @since 1.0
	 */
	public static final Number setUTCSeconds(DateLike d, Object sec) {
		return d.setUTCSeconds(sec);
	}
	/**
	 * <p>Sets the seconds field and optionally the milliseconds field of the current date 
	 * instance, using local .</p>
	 * @param d The current date instance.
	 * @param sec An integer between 0 and 59 that is set as the seconds value for the 
	 * current date instance.
	 * @param ms An optional integer, between 0 and 999, that is used as the new value 
	 * in local time of the milliseconds field of the current date instance. This argument 
	 * is not supported prior to ECMAScript standardization.
	 * @return The millisecond representation of the adjusted date. Prior to ECMAScript 
	 * standardization, this method returns nothing.
	 * @see #setUTCSeconds(js.DateLike, Object, Object)
	 * @see #setSeconds(js.DateLike, Object)
	 * @see js.DateLike#setSeconds(Object, Object)
	 * @since 1.0
	 */
	public static final Number setSeconds(DateLike d, Object sec, Object ms) {
		return d.setSeconds(sec, ms);
	}
	/**
	 * <p>Sets the seconds field and optionally the milliseconds field of the current date 
	 * instance, using universal time.</p>
	 * @param d The current date instance.
	 * @param sec The seconds field, expressed in universal time, to be set in the current 
	 * date instance. This argument should be an integer between 0 and 59.
	 * @param ms An optional integer, between 0 and 999, that is used as the new value 
	 * in universal time of the milliseconds field of the current date instance.
	 * @return The millisecond representation of the adjusted date.
	 * @see #setSeconds(js.DateLike, Object, Object)
	 * @see #setUTCSeconds(js.DateLike, Object)
	 * @see js.DateLike#setUTCSeconds(Object, Object)
	 * @since 1.0
	 */
	public static final Number setUTCSeconds(DateLike d, Object sec, Object ms) {
		return d.setUTCSeconds(sec, ms);
	}
	/**
	 * <p>Sets the minutes field of the current date instance, using local time.</p>
	 * @param d The current date instance.
	 * @param min An optional integer, between 0 and 59, that is used as the new value 
	 * in local time of the minutes field of the current date instance.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setUTCMinutes(js.DateLike, Object)
	 * @see #setMinutes(js.DateLike, Object, Object)
	 * @see #setMinutes(js.DateLike, Object, Object, Object)
	 * @see js.DateLike#setMinutes(Object)
	 * @since 1.0
	 */
	public static final Number setMinutes(DateLike d, Object min) {
		return d.setMinutes(min);
	}
	/**
	 * <p>Sets the minutes field of the current date instance, using universal time.</p>
	 * @param d The current date instance.
	 * @param min An optional integer, between 0 and 59, that is used as the new value 
	 * in universal time of the minutes field of the current date instance.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setMinutes(js.DateLike, Object)
	 * @see #setUTCMinutes(js.DateLike, Object, Object)
	 * @see #setUTCMinutes(js.DateLike, Object, Object, Object)
	 * @see js.DateLike#setUTCMinutes(Object)
	 * @since 1.0
	 */
	public static final Number setUTCMinutes(DateLike d, Object min) {
		return d.setUTCMinutes(min);
	}
	/**
	 * <p>Sets the minutes field and optionally the seconds field of the current date 
	 * instance, using local time.</p>
	 * @param d The current date instance.
	 * @param min An optional integer, between 0 and 59, that is used as the new value 
	 * in local time of the minutes field of the current date instance. This argument is 
	 * not supported prior to ECMAScript standardization.
	 * @param sec An optional integer, between 0 and 59, that is used as the new value 
	 * in local time of the seconds field of the current date instance. This argument is 
	 * not supported prior to ECMAScript standardization.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setUTCMinutes(js.DateLike, Object, Object)
	 * @see #setMinutes(js.DateLike, Object)
	 * @see #setMinutes(js.DateLike, Object, Object, Object)
	 * @see js.DateLike#setMinutes(Object, Object)
	 * @since 1.0
	 */
	public static final Number setMinutes(DateLike d, Object min, Object sec) {
		return d.setMinutes(min, sec);
	}
	/**
	 * <p>Sets the minutes field and optionally the seconds field of the current date 
	 * instance, using universal time.</p>
	 * @param d The current date instance.
	 * @param min An optional integer, between 0 and 59, that is used as the new value 
	 * in universal time of the minutes field of the current date instance.
	 * @param sec An optional integer, between 0 and 59, that is used as the new value 
	 * in universal time of the seconds field of the current date instance.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setMinutes(js.DateLike, Object, Object)
	 * @see #setUTCMinutes(js.DateLike, Object)
	 * @see #setUTCMinutes(js.DateLike, Object, Object, Object)
	 * @see js.DateLike#setUTCMinutes(Object, Object)
	 * @since 1.0
	 */
	public static final Number setUTCMinutes(DateLike d, Object min, Object sec) {
		return d.setUTCMinutes(min, sec);
	}
	/**
	 * <p>Sets the minutes field and optionally the seconds and milliseconds fields of the 
	 * current date instance, using local time.</p>
	 * @param d The current date instance.
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
	 * @see #setUTCMinutes(js.DateLike, Object, Object, Object)
	 * @see #setMinutes(js.DateLike, Object)
	 * @see #setMinutes(js.DateLike, Object, Object)
	 * @see js.DateLike#setMinutes(Object, Object, Object)
	 * @since 1.0
	 */
	public static final Number setMinutes(DateLike d, Object min, Object sec, Object ms) {
		return d.setMinutes(min, sec, ms);
	}
	/**
	 * <p>Sets the minutes field and optionally the seconds and milliseconds fields of the 
	 * current date instance, using universal time.</p>
	 * @param d The current date instance.
	 * @param min An optional integer, between 0 and 59, that is used as the new value 
	 * in universal time of the minutes field of the current date instance.
	 * @param sec An optional integer, between 0 and 59, that is used as the new value 
	 * in universal time of the seconds field of the current date instance.
	 * @param ms An optional integer, between 0 and 999, that is used as the new value 
	 * in universal time of the milliseconds field of the current date instance.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setMinutes(js.DateLike, Object, Object, Object)
	 * @see #setUTCMinutes(js.DateLike, Object)
	 * @see #setUTCMinutes(js.DateLike, Object, Object)
	 * @see js.DateLike#setUTCMinutes(Object, Object, Object)
	 * @since 1.0
	 */
	public static final Number setUTCMinutes(DateLike d, Object min, Object sec, Object ms) {
		return d.setUTCMinutes(min, sec, ms);
	}
	/**
	 * <p>Sets the hour field of the current date instance, using local time.</p>
	 * @param d The current date instance.
	 * @param hr An integer between 0 (midnight) and 23 (11 p.m.) local time that is set 
	 * as the new hours value of the current date instance.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setUTCHours(js.DateLike, Object)
	 * @see #setHours(js.DateLike, Object, Object)
	 * @see #setHours(js.DateLike, Object, Object, Object)
	 * @see #setHours(js.DateLike, Object, Object, Object, Object)
	 * @see js.DateLike#setHours(Object)
	 * @since 1.0
	 */
	public static final Number setHours(DateLike d, Object hr) {
		return d.setHours(hr);
	}
	/**
	 * <p>Sets the hour field of the current date instance, using universal time.</p>
	 * @param d The current date instance.
	 * @param hr The hours field, expressed in universal time, to be set in the current 
	 * date instance. This argument should be an integer between 0 (midnight) and 23 
	 * (11 p.m.).
	 * @return The millisecond representation of the adjusted date. 
	 * @see #setHours(js.DateLike, Object)
	 * @see #setUTCHours(js.DateLike, Object, Object)
	 * @see #setUTCHours(js.DateLike, Object, Object, Object)
	 * @see #setUTCHours(js.DateLike, Object, Object, Object, Object)
	 * @see js.DateLike#setUTCHours(Object)
	 * @since 1.0
	 */
	public static final Number setUTCHours(DateLike d, Object hr) {
		return d.setUTCHours(hr);
	}
	/**
	 * <p>Sets the hour field and optionally the minutes field of the current date 
	 * instance, using local time.</p>
	 * @param d The current date instance.
	 * @param hr An integer between 0 (midnight) and 23 (11 p.m.) local time that is set 
	 * as the new hours value of the current date instance.
	 * @param min An optional integer, between 0 and 59, that is used as the new value 
	 * in local time of the minutes field of the current date instance. This argument is 
	 * not supported prior to ECMAScript standardization.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setUTCHours(js.DateLike, Object, Object)
	 * @see #setHours(js.DateLike, Object)
	 * @see #setHours(js.DateLike, Object, Object, Object)
	 * @see #setHours(js.DateLike, Object, Object, Object, Object)
	 * @see js.DateLike#setHours(Object, Object)
	 * @since 1.0
	 */
	public static final Number setHours(DateLike d, Object hr, Object min) {
		return d.setHours(hr, min);
	}
	/**
	 * <p>Sets the hour field and optionally the minutes field of the current date 
	 * instance, using universal time.</p>
	 * @param d The current date instance.
	 * @param hr The hours field, expressed in universal time, to be set in the current 
	 * date instance. This argument should be an integer between 0 (midnight) and 23 
	 * (11 p.m.).
	 * @param min An optional integer, between 0 and 59, that is used as the new value 
	 * in universal time of the minutes field of the current date instance.
	 * @return The millisecond representation of the adjusted date. 
	 * @see #setHours(js.DateLike, Object, Object)
	 * @see #setUTCHours(js.DateLike, Object)
	 * @see #setUTCHours(js.DateLike, Object, Object, Object)
	 * @see #setUTCHours(js.DateLike, Object, Object, Object, Object)
	 * @see js.DateLike#setUTCHours(Object, Object)
	 * @since 1.0
	 */
	public static final Number setUTCHours(DateLike d, Object hr, Object min) {
		return d.setUTCHours(hr, min);
	}
	/**
	 * <p>Sets the hour field and optionally the minutes and seconds fields of the current 
	 * date instance, using local time.</p>
	 * @param d The current date instance.
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
	 * @see #setUTCHours(js.DateLike, Object, Object, Object)
	 * @see #setHours(js.DateLike, Object)
	 * @see #setHours(js.DateLike, Object, Object)
	 * @see #setHours(js.DateLike, Object, Object, Object, Object)
	 * @see js.DateLike#setHours(Object, Object, Object)
	 * @since 1.0
	 */
	public static final Number setHours(DateLike d, Object hr, Object min, Object sec) {
		return d.setHours(hr, min, sec);
	}
	/**
	 * <p>Sets the hour field and optionally the minutes and seconds fields of the current 
	 * date instance, using universal time.</p>
	 * @param d The current date instance.
	 * @param hr The hours field, expressed in universal time, to be set in the current 
	 * date instance. This argument should be an integer between 0 (midnight) and 23 
	 * (11 p.m.).
	 * @param min An optional integer, between 0 and 59, that is used as the new value 
	 * in universal time of the minutes field of the current date instance.
	 * @param sec An optional integer, between 0 and 59, that is used as the new value 
	 * in universal time of the seconds field of the current date instance.
	 * @return The millisecond representation of the adjusted date.
	 * @see #setHours(js.DateLike, Object, Object, Object)
	 * @see #setUTCHours(js.DateLike, Object)
	 * @see #setUTCHours(js.DateLike, Object, Object)
	 * @see #setUTCHours(js.DateLike, Object, Object, Object, Object)
	 * @see js.DateLike#setUTCHours(Object, Object, Object)
	 * @since 1.0
	 */
	public static final Number setUTCHours(DateLike d, Object hr, Object min, Object sec) {
		return d.setUTCHours(hr, min, sec);
	}
	/**
	 * <p>Sets the hour field and optionally the minutes, seconds, and milliseconds fields 
	 * of the current date instance, using local time.</p>
	 * @param d The current date instance.
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
	 * @see #setUTCHours(js.DateLike, Object, Object, Object, Object)
	 * @see #setHours(js.DateLike, Object)
	 * @see #setHours(js.DateLike, Object, Object)
	 * @see #setHours(js.DateLike, Object, Object, Object)
	 * @see js.DateLike#setHours(Object, Object, Object, Object)
	 * @since 1.0
	 */
	public static final Number setHours(DateLike d, Object hr, Object min, Object sec, Object ms) {
		return d.setHours(hr, min, sec, ms);
	}
	/**
	 * <p>Sets the hour field and optionally the minutes, seconds, and milliseconds fields 
	 * of the current date instance, using universal time.</p>
	 * @param d The current date instance.
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
	 * @see #setHours(js.DateLike, Object, Object, Object, Object)
	 * @see #setUTCHours(js.DateLike, Object)
	 * @see #setUTCHours(js.DateLike, Object, Object)
	 * @see #setUTCHours(js.DateLike, Object, Object, Object)
	 * @see js.DateLike#setUTCHours(Object, Object, Object, Object)
	 * @since 1.0
	 */
	public static final Number setUTCHours(DateLike d, Object hr, Object min, Object sec, Object ms) {
		return d.setUTCHours(hr, min, sec, ms);
	}
	/**
	 * <p>Sets the day of the month field of the current date instance, using local time.</p>
	 * @param d The current date instance.
	 * @param day An integer between 1 and 31 that is used as the new value in local time 
	 * of the day-of-the-month field of the current date instance.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setUTCDate(js.DateLike, Object)
	 * @see js.DateLike#setDate(Object)
	 * @since 1.0
	 */
	public static final Number setDate(DateLike d, Object day) {
		return d.setDate(day);
	}
	/**
	 * <p>Sets the day of the month field of the current date instance, using universal 
	 * time.</p>
	 * @param d The current date instance.
	 * @param day The day of the month, expressed in universal time, to be set in the 
	 * current date instance. This argument should be an integer between 1 and 31.
	 * @return The millisecond representation of the adjusted date. 
	 * @see #setDate(js.DateLike, Object)
	 * @see js.DateLike#setUTCDate(Object)
	 * @since 1.0
	 */
	public static final Number setUTCDate(DateLike d, Object day) {
		return d.setUTCDate(day);
	}
	/**
	 * <p>Sets the month field of the current date instance, using local time.</p>
	 * @param d The current date instance.
	 * @param mo An integer between 0 ( January) and 11 (December) that is set as the month 
	 * value in local time for the current date instance. Note that months are numbered 
	 * beginning with 0, while days within the month are numbered beginning with 1.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setUTCMonth(js.DateLike, Object)
	 * @see #setMonth(js.DateLike, Object, Object)
	 * @see js.DateLike#setMonth(Object)
	 * @since 1.0
	 */
	public static final Number setMonth(DateLike d, Object mo) {
		return d.setMonth(mo);
	}
	/**
	 * <p>Sets the month field of the current date instance, using universal time.</p>
	 * @param d The current date instance.
	 * @param mo The month, expressed in universal time, to be set in the current date
	 * instance. This argument should be an integer between 0 (January) and 11 (December). 
	 * Note that months are numbered beginning with 0, while days within the month are 
	 * numbered beginning with 1.
	 * @return The millisecond representation of the adjusted date. 
	 * @see #setMonth(js.DateLike, Object)
	 * @see #setUTCMonth(js.DateLike, Object, Object)
	 * @see js.DateLike#setUTCMonth(Object)
	 * @since 1.0
	 */
	public static final Number setUTCMonth(DateLike d, Object mo) {
		return d.setUTCMonth(mo);
	}
	/**
	 * <p>Sets the month field and optionally the day of the month of the current date 
	 * instance, using local time.</p>
	 * @param d The current date instance.
	 * @param mo An integer between 0 ( January) and 11 (December) that is set as the month 
	 * value in local time for the current date instance. Note that months are numbered 
	 * beginning with 0, while days within the month are numbered beginning with 1.
	 * @param day An optional integer between 1 and 31 that is used as the new value in 
	 * local time of the day-of-the-month field of the current date instance. This argument 
	 * is not supported prior to ECMAScript standardization.
	 * @return The millisecond representation of the adjusted date. 
	 * Prior to ECMAScript standardization, this method returns nothing.
	 * @see #setUTCMonth(js.DateLike, Object, Object)
	 * @see #setMonth(js.DateLike, Object)
	 * @see js.DateLike#setMonth(Object, Object)
	 * @since 1.0
	 */
	public static final Number setMonth(DateLike d, Object mo, Object day) {
		return d.setMonth(mo, day);
	}
	/**
	 * <p>Sets the month field and optionally the day of the month of the current date 
	 * instance, using universal time.</p>
	 * @param d The current date instance.
	 * @param mo The month, expressed in universal time, to be set in the current date
	 * instance. This argument should be an integer between 0 (January) and 11 (December). 
	 * Note that months are numbered beginning with 0, while days within the month are 
	 * numbered beginning with 1.
	 * @param day An optional integer between 1 and 31 that is used as the new value in 
	 * universal time of the day-of-the-month field of the current date instance.
	 * @return The millisecond representation of the adjusted date. 
	 * @see #setMonth(js.DateLike, Object, Object)
	 * @see #setUTCMonth(js.DateLike, Object)
	 * @see js.DateLike#setUTCMonth(Object, Object)
	 * @since 1.0
	 */
	public static final Number setUTCMonth(DateLike d, Object mo, Object day) {
		return d.setUTCMonth(mo, day);
	}
	/**
	 * <p>Sets the year field of the current date instance, using local time.</p>
	 * @param d The current date instance.
	 * @param yr The year, expressed in local time, to be set in the current date instance. 
	 * This argument should be an integer that includes the century, such as 1999; it 
	 * should not be an abbreviation, such as 99.
	 * @return The millisecond representation of the adjusted date. 
	 * @see #setUTCFullYear(js.DateLike, Object)
	 * @see #setFullYear(js.DateLike, Object, Object)
	 * @see #setFullYear(js.DateLike, Object, Object, Object)
	 * @see js.DateLike#setFullYear(Object)
	 * @since 1.0
	 */
	public static final Number setFullYear(DateLike d, Object yr) {
		return d.setFullYear(yr);
	}
	/**
	 * <p>Sets the year field of the current date instance, using universal time.</p>
	 * @param d The current date instance.
	 * @param yr The year, expressed in universal time, to be set in the current date 
	 * instance. This argument should be an integer that includes the century, such as 
	 * 1999, not an abbreviation, such as 99.
	 * @return The millisecond representation of the adjusted date. 
	 * @see #setFullYear(js.DateLike, Object)
	 * @see #setUTCFullYear(js.DateLike, Object, Object)
	 * @see #setUTCFullYear(js.DateLike, Object, Object, Object)
	 * @see js.DateLike#setUTCFullYear(Object)
	 * @since 1.0
	 */
	public static final Number setUTCFullYear(DateLike d, Object yr) {
		return d.setUTCFullYear(yr);
	}
	/**
	 * <p>Sets the year and optionally month fields of the current date instance, using 
	 * local time.</p>
	 * @param d The current date instance.
	 * @param yr The year, expressed in local time, to be set in the current date instance. 
	 * This argument should be an integer that includes the century, such as 1999; it 
	 * should not be an abbreviation, such as 99.
	 * @param mo An optional integer between 0 and 11 that is used as the new value in 
	 * local time of the month field of the current date instance.
	 * @return The millisecond representation of the adjusted date. 
	 * @see #setUTCFullYear(js.DateLike, Object, Object)
	 * @see #setFullYear(js.DateLike, Object)
	 * @see #setFullYear(js.DateLike, Object, Object, Object)
	 * @see js.DateLike#setFullYear(Object, Object)
	 * @since 1.0
	 */
	public static final Number setFullYear(DateLike d, Object yr, Object mo) {
		return d.setFullYear(yr, mo);
	}
	/**
	 * <p>Sets the year and optionally month fields of the current date instance, using 
	 * universal time.</p>
	 * @param d The current date instance.
	 * @param yr The year, expressed in universal time, to be set in the current date 
	 * instance. This argument should be an integer that includes the century, such as 
	 * 1999, not an abbreviation, such as 99.
	 * @param mo An optional integer between 0 and 11 that is used as the new value in 
	 * universal time of the month field of the current date instance. Note that months 
	 * are numbered beginning with 0, while days within the month are numbered beginning 
	 * with 1.
	 * @return The millisecond representation of the adjusted date. 
	 * @see #setFullYear(js.DateLike, Object, Object)
	 * @see #setUTCFullYear(js.DateLike, Object)
	 * @see #setUTCFullYear(js.DateLike, Object, Object, Object)
	 * @see js.DateLike#setUTCFullYear(Object, Object)
	 * @since 1.0
	 */
	public static final Number setUTCFullYear(DateLike d, Object yr, Object mo) {
		return d.setUTCFullYear(yr, mo);
	}
	/**
	 * <p>Sets the year and optionally month and day fields of the current date instance, 
	 * using local time.</p>
	 * @param d The current date instance.
	 * @param yr The year, expressed in local time, to be set in the current date instance. 
	 * This argument should be an integer that includes the century, such as 1999; it 
	 * should not be an abbreviation, such as 99.
	 * @param mo An optional integer between 0 and 11 that is used as the new value in 
	 * local time of the month field of the current date instance.
	 * @param day An optional integer between 1 and 31 that is used as the new value in 
	 * local time of the day-of-the-month field of the current date instance.
	 * @return The millisecond representation of the adjusted date. 
	 * @see #setUTCFullYear(js.DateLike, Object, Object, Object)
	 * @see #setFullYear(js.DateLike, Object)
	 * @see #setFullYear(js.DateLike, Object, Object)
	 * @see js.DateLike#setFullYear(Object, Object, Object)
	 * @since 1.0
	 */
	public static final Number setFullYear(DateLike d, Object yr, Object mo, Object day) {
		return d.setFullYear(yr, mo, day);
	}
	/**
	 * <p>Sets the year and optionally month and day fields of the current date instance, 
	 * using universal time.</p>
	 * @param d The current date instance.
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
	 * @see #setFullYear(js.DateLike, Object, Object, Object)
	 * @see #setUTCFullYear(js.DateLike, Object)
	 * @see #setUTCFullYear(js.DateLike, Object, Object)
	 * @see js.DateLike#setUTCFullYear(Object, Object, Object)
	 * @since 1.0
	 */
	public static final Number setUTCFullYear(DateLike d, Object yr, Object mo, Object day) {
		return d.setUTCFullYear(yr, mo, day);
	}
	/**
	 * <p>Converts a date to a string, using the local time zone and the local date 
	 * formatting conventions.</p>
	 * <p>This method also uses local conventions for date and time formatting, so the 
	 * format may vary from platform to platform and from country to country. It returns 
	 * a string formatted in what is likely the user's preferred date and time format.</p>
	 * @param d The current date instance.
	 * @return A string representation of the date and time specified by the current date 
	 * instance. The date and time are represented in the local time zone and formatted 
	 * using locally appropriate conventions.
	 * @see #toLocaleDateString(js.DateLike)
	 * @see #toLocaleTimeString(js.DateLike)
	 * @see #toString(js.DateLike)
	 * @see #toUTCString(js.DateLike)
	 * @see js.DateLike#toLocaleString()
	 * @since 1.0
	 */
	public static final String toLocaleString(DateLike d) {
		return d.toLocaleString();
	}
	/**
	 * <p>Returns a string that represents the date portion of the current date instance, 
	 * expressed in the local time zone.</p>
	 * @param d The current date instance.
	 * @return An implementation-dependent, human-readable string representation of the 
	 * date portion of the current date instance, expressed in the local time zone.
	 * @see #toLocaleDateString(js.DateLike)
	 * @see #toLocaleString(js.DateLike)
	 * @see #toLocaleTimeString(js.DateLike)
	 * @see #toString(js.DateLike)
	 * @see #toTimeString(js.DateLike)
	 * @see js.DateLike#toDateString()
	 * @since 1.0
	 */
	public static final String toDateString(DateLike d) {
		return d.toDateString();
	}
	/**
	 * <p>Returns a string that represents the time portion of the current date instance, 
	 * expressed in the local time zone.</p>
	 * @param d The current date instance.
	 * @return An implementation-dependent, human-readable string representation of the 
	 * time portion of the current date instance, expressed in the local time zone.
	 * @see #toDateString(js.DateLike)
	 * @see #toLocaleDateString(js.DateLike)
	 * @see #toLocaleString(js.DateLike)
	 * @see #toLocaleTimeString(js.DateLike)
	 * @see #toString(js.DateLike)
	 * @see js.DateLike#toTimeString()
	 * @since 1.0
	 */
	public static final String toTimeString(DateLike d) {
		return d.toTimeString();
	}
	/**
	 * <p>Returns a string that represents the date portion of the current date instance, 
	 * expressed in the local time zone, using the local date formatting conventions.</p>
	 * @param d The current date instance.
	 * @return An implementation-dependent, human-readable string representation of the 
	 * date portion of the current date instance, expressed in the local time zone and 
	 * formatted according to local conventions.
	 * @see #toDateString(js.DateLike)
	 * @see #toLocaleString(js.DateLike)
	 * @see #toLocaleTimeString(js.DateLike)
	 * @see #toString(js.DateLike)
	 * @see #toTimeString(js.DateLike)
	 * @see js.DateLike#toLocaleDateString()
	 * @since 1.0
	 */
	public static final String toLocaleDateString(DateLike d) {
		return d.toLocaleDateString();
	}
	/**
	 * <p>Returns a string that represents the time portion of the current date instance, 
	 * expressed in the local time zone, using the local time formatting conventions.</p>
	 * @param d The current date instance.
	 * @return An implementation-dependent, human-readable string representation of the 
	 * time portion of the current date instance, expressed in the local time zone and 
	 * formatted according to local conventions.
	 * @see #toDateString(js.DateLike)
	 * @see #toLocaleDateString(js.DateLike)
	 * @see #toLocaleString(js.DateLike)
	 * @see #toString(js.DateLike)
	 * @see #toTimeString(js.DateLike)
	 * @see js.DateLike#toLocaleTimeString()
	 * @since 1.0
	 */
	public static final String toLocaleTimeString(DateLike d) {
		return d.toLocaleTimeString();
	}
	/**
	 * <p>Converts the current date instance to a string, using universal time.</p>
	 * @param d The current date instance.
	 * @return A human-readable string representation, expressed in universal time, of the 
	 * current date instance.
	 * @see #toLocaleString(js.DateLike)
	 * @see #toString(js.DateLike)
	 * @see js.DateLike#toUTCString()
	 * @since 1.0
	 */
	public static final String toUTCString(DateLike d) {
		return d.toUTCString();
	}
	/**
	 * <p>Converts the current date instance to a string using the local time zone.</p>
	 * @param d The current date instance.
	 * @return A human-readable string representation of the current date instance, 
	 * expressed in the local time zone.
	 * @see #toDateString(js.DateLike)
	 * @see #toLocaleString(js.DateLike)
	 * @see #toTimeString(js.DateLike)
	 * @see #toUTCString(js.DateLike)
	 * @see js.core.JsGlobal.Date#parse(Object)
	 * @since 1.0
	 */
	public static final String toString(DateLike d) {
		return d.toString();
	}
	/**
	 * <p>Computes milliseconds that has elapsed since the argument date and time.</p>
	 * @param d The date and time that the calculation starts with.
	 * @return The elapsed time in milliseconds, 
	 * @since 1.0
	 */
	public static final Number elapse(DateLike d) {
		return elapse(d, Js.date());
	}
	/**
	 * <p>Computes the difference in milliseconds between the two date and time arguments.</p>
	 * @param d1 The date and time that the calculation starts with.
	 * @param d2 The date and time that the calculation ends with.
	 * @return The elapsed time in milliseconds, 
	 * @since 1.0
	 */
	public static final Number elapse(DateLike d2, DateLike d1) {
		return Js.sub(d2.valueOf(), d1.valueOf());
	}
}
