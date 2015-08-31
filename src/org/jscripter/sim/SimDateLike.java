
/*
 *  JScripter Simulation 1.0 - For Java To Script
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

package org.jscripter.sim;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.jscripter.sim.core.Core;


import js.DateLike;
import js.core.JsDate;
import js.core.JsGlobal;

final class SimDateLike implements DateLike
{
	private final Calendar cal;

	public SimDateLike() {
		cal = new GregorianCalendar();
		cal.setTime(new Date());
	}
	public SimDateLike(Number n) {
		cal = new GregorianCalendar();
		cal.setTime(new Date(n.longValue()));
	}
	public SimDateLike(String s) {
		cal = new GregorianCalendar();
		try {
			cal.setTime(DateFormat.getInstance().parse(s));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	//@Override
	public final Number getDate() {
		return cal.get(Calendar.DATE);
	}

	//@Override
	public final Number getDay() {
		return cal.get(Calendar.DAY_OF_WEEK);
	}

	//@Override
	public final Number getFullYear() {
		return cal.get(Calendar.YEAR);
	}

	//@Override
	public final Number getHours() {
		return cal.get(Calendar.HOUR_OF_DAY);
	}

	//@Override
	public final Number getMilliseconds() {
		return cal.get(Calendar.MILLISECOND);
	}

	//@Override
	public final Number getMinutes() {
		return cal.get(Calendar.MINUTE);
	}

	//@Override
	public final Number getMonth() {
		return cal.get(Calendar.MONTH);
	}

	//@Override
	public final Number getSeconds() {
		return cal.get(Calendar.SECOND);
	}

	//@Override
	public final Number getTime() {
		return cal.getTimeInMillis();
	}

	//@Override
	public final Number getTimezoneOffset() {
		return cal.get(Calendar.ZONE_OFFSET);
	}

	//@Override
	public final Number getUTCDate() {
		return null;
	}

	//@Override
	public final Number getUTCDay() {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final Number getUTCFullYear() {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final Number getUTCHours() {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final Number getUTCMilliseconds() {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final Number getUTCMinutes() {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final Number getUTCMonth() {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final Number getUTCSeconds() {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final Number setDate(Object day) {
		cal.set(Calendar.DATE, SimUtil.getNumber(day).intValue());
		return getTime();
	}

	//@Override
	public final Number setFullYear(Object yr) {
		cal.set(Calendar.YEAR, SimUtil.getNumber(yr).intValue());
		return getTime();
	}

	//@Override
	public final Number setFullYear(Object yr, Object mo) {
		cal.set(Calendar.YEAR , SimUtil.getNumber(yr).intValue());
		cal.set(Calendar.MONTH, SimUtil.getNumber(mo).intValue());
		return getTime();
	}

	//@Override
	public final Number setFullYear(Object yr, Object mo, Object day) {
		cal.set(
				SimUtil.getNumber(yr ).intValue(),
				SimUtil.getNumber(mo ).intValue(),
				SimUtil.getNumber(day).intValue()
		);
		return getTime();
	}

	//@Override
	public final Number setHours(Object hr) {
		cal.set(Calendar.HOUR, SimUtil.getNumber(hr).intValue());
		return getTime();
	}

	//@Override
	public final Number setHours(Object hr, Object min) {
		cal.set(Calendar.HOUR  , SimUtil.getNumber(hr ).intValue());
		cal.set(Calendar.MINUTE, SimUtil.getNumber(min).intValue());
		return getTime();
	}

	//@Override
	public final Number setHours(Object hr, Object min, Object sec) {
		cal.set(Calendar.HOUR  , SimUtil.getNumber(hr ).intValue());
		cal.set(Calendar.MINUTE, SimUtil.getNumber(min).intValue());
		cal.set(Calendar.SECOND, SimUtil.getNumber(sec).intValue());
		return getTime();
	}

	//@Override
	public final Number setHours(Object hr, Object min, Object sec, Object ms) {
		cal.set(Calendar.HOUR       , SimUtil.getNumber(hr ).intValue());
		cal.set(Calendar.MINUTE     , SimUtil.getNumber(min).intValue());
		cal.set(Calendar.SECOND     , SimUtil.getNumber(sec).intValue());
		cal.set(Calendar.MILLISECOND, SimUtil.getNumber(ms).intValue());
		return getTime();
	}

	//@Override
	public final Number setMilliseconds(Object ms) {
		cal.set(Calendar.MILLISECOND, SimUtil.getNumber(ms).intValue());
		return getTime();
	}

	//@Override
	public final Number setMinutes(Object min) {
		cal.set(Calendar.MINUTE, SimUtil.getNumber(min).intValue());
		return getTime();
	}

	//@Override
	public final Number setMinutes(Object min, Object sec) {
		cal.set(Calendar.MINUTE, SimUtil.getNumber(min).intValue());
		cal.set(Calendar.SECOND, SimUtil.getNumber(sec).intValue());
		return getTime();
	}

	//@Override
	public final Number setMinutes(Object min, Object sec, Object ms) {
		cal.set(Calendar.MINUTE     , SimUtil.getNumber(min).intValue());
		cal.set(Calendar.SECOND     , SimUtil.getNumber(sec).intValue());
		cal.set(Calendar.MILLISECOND, SimUtil.getNumber(ms).intValue());
		return getTime();
	}

	//@Override
	public final Number setMonth(Object mo) {
		cal.set(Calendar.MONTH, SimUtil.getNumber(mo).intValue());
		return getTime();
	}

	//@Override
	public final Number setMonth(Object mo, Object day) {
		cal.set(Calendar.MONTH, SimUtil.getNumber(mo ).intValue());
		cal.set(Calendar.DATE , SimUtil.getNumber(day).intValue());
		return getTime();
	}

	//@Override
	public final Number setSeconds(Object sec) {
		cal.set(Calendar.SECOND     , SimUtil.getNumber(sec).intValue());
		return getTime();
	}

	//@Override
	public final Number setSeconds(Object sec, Object ms) {
		cal.set(Calendar.SECOND     , SimUtil.getNumber(sec).intValue());
		cal.set(Calendar.MILLISECOND, SimUtil.getNumber(ms).intValue());
		return getTime();
	}

	//@Override
	public final Number setTime(Object time) {
		cal.setTimeInMillis(SimUtil.getNumber(time).longValue());
		return getTime();
	}

	//@Override
	public final Number setUTCDate(Object day) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final Number setUTCFullYear(Object yr) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final Number setUTCFullYear(Object yr, Object mo) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final Number setUTCFullYear(Object yr, Object mo, Object day) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final Number setUTCHours(Object hr) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final Number setUTCHours(Object hr, Object min) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final Number setUTCHours(Object hr, Object min, Object sec) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final Number setUTCHours(Object hr, Object min, Object sec, Object ms) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final Number setUTCMilliseconds(Object ms) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final Number setUTCMinutes(Object min) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final Number setUTCMinutes(Object min, Object sec) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final Number setUTCMinutes(Object min, Object sec, Object ms) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final Number setUTCMonth(Object mo) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final Number setUTCMonth(Object mo, Object day) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final Number setUTCSeconds(Object sec) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final Number setUTCSeconds(Object sec, Object ms) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public final String toDateString() {
		return cal.getTime().toString();
	}

	//@Override
	public final String toLocaleDateString() {
		return cal.getTime().toString();
	}

	//@Override
	public final String toLocaleString() {
		return cal.getTime().toString();
	}

	//@Override
	public final String toLocaleTimeString() {
		return cal.getTime().toString();
	}

	//@Override
	public final String toTimeString() {
		return cal.getTime().toString();
	}

	//@Override
	public final String toString() {
		return cal.getTime().toString();
	}

	//@Override
	public final String toUTCString() {
		return cal.getTime().toString();
	}

	//@Override
	public final Number valueOf() {
		return cal.getTime().getTime();
	}

	//@Override
	public final JsDate var() {
		if (Core.isRunning()) {
			return JsGlobal.Date.with().create(this);
		} else {
			return JsGlobal.Date.with().create(getTime());
		}
	}
}
