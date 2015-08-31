
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

import java.util.Locale;
import java.util.regex.Matcher;

import js.ArrayLike;
import js.Js;
import js.RegExpLike;
import js.StringLike;
import js.Vars;
import js.core.JsFunction;

final class SimStringLike implements StringLike
{
	private String s;

	public SimStringLike(String s) {
		this.s = s;
	}
	//@Override
	public final int length() {
		return s.length();
	}
	//@Override
	public final String charAt(Object index) {
		return new String(new char[]{s.charAt(((Number)Js.valueOf(index)).intValue())});
	}
	//@Override
	public final Character charCodeAt(Object index) {
		return s.charAt(((Number)Js.valueOf(index)).intValue());
	}
	//@Override
	public final String concat(Object other) {
		return s.concat(Js.toString(other));
	}
	//@Override
	public final String concat(Vars<?> args) {
		String str = s;
		ArrayLike<?> aa = args.var();
		for (int i = 0, len = aa.length(); i < len; i++) {
			str = str.concat(Js.toString(aa.get(i)));
		}
		return str;
	}
	//@Override
	public final Integer indexOf(Object other) {
		return s.indexOf(Js.toString(other));
	}
	//@Override
	public final Integer indexOf(Object other, Object pos) {
		return s.indexOf(Js.toString(other), SimUtil.getNumber(pos).intValue());
	}
	//@Override
	public final Integer lastIndexOf(Object other) {
		return s.lastIndexOf(Js.toString(other));
	}
	//@Override
	public final Integer lastIndexOf(Object other, Object pos) {
		return s.lastIndexOf(Js.toString(other), SimUtil.getNumber(pos).intValue());
	}
	//@Override
	public final Integer localeCompare(Object other) {
		return s.compareTo(Js.toString(other));
	}
	//@Override
	public final ArrayLike<?> match(RegExpLike regexp) {
		return regexp.exec(s);
	}
	//@Override
	public final String replace(RegExpLike regexp, String newSubStr) {
		if (regexp instanceof SimRegExpLike) {
			Matcher m = ((SimRegExpLike)regexp).pattern().matcher(s);
			return regexp.global() ?
					m.replaceAll(newSubStr) : m.replaceFirst(newSubStr);
		} else {
			return regexp.global() ?
					s.replaceAll(regexp.source(), newSubStr) :
						s.replaceFirst(regexp.source(), newSubStr);
		}
	}
	//@Override
	public final String replace(RegExpLike regexp, StringLike newSubStr) {
		return replace(regexp, newSubStr == null ? null : newSubStr.valueOf());
	}
	//@Override
	public final String replace(RegExpLike regexp, JsFunction<String> lambda) {
		return replace(regexp, lambda.invoke());
	}
	//@Override
	public final Integer search(RegExpLike regexp) {
		if (regexp instanceof SimRegExpLike) {
			Matcher m = ((SimRegExpLike)regexp).pattern().matcher(s);
			boolean res = m.find();
			return res ? m.start() : -1;
		} else {
			return search(new SimRegExpLike(regexp.source()));
		}
	}
	//@Override
	public final String slice(Object begin) {
		int from = SimUtil.getNumber(begin).intValue();
		from = from < 0 ? length() + from : from;
		return s.substring(from);
	}
	//@Override
	public final String slice(Object begin, Object end) {
		int from = SimUtil.getNumber(begin).intValue();
		from = from < 0 ? length() + from : from;
		int to = SimUtil.getNumber(end).intValue();
		return s.substring(from, to);
	}
	//@Override
	public final ArrayLike<?> split(Object separator) {
		separator = Js.valueOf(separator);
		return separator instanceof SimRegExpLike ?
				new SimArrayLike<String>(new SimArrayObject<String>(((SimRegExpLike)separator).pattern().split(s))) :
				separator instanceof RegExpLike ?
				new SimArrayLike<String>(new SimArrayObject<String>(s.split(((RegExpLike)separator).source()))) :							
				new SimArrayLike<String>(new SimArrayObject<String>(s.split(Js.toString(separator))));
	}
	//@Override
	public final ArrayLike<?> split(Object separator, Object limit) {
		int lim = SimUtil.getNumber(limit).intValue();
		separator = Js.valueOf(separator);
		return separator instanceof SimRegExpLike ?
				new SimArrayLike<String>(new SimArrayObject<String>(((SimRegExpLike)separator).pattern().split(s, lim))) :
				separator instanceof RegExpLike ?
				new SimArrayLike<String>(new SimArrayObject<String>(s.split(((RegExpLike)separator).source(), lim))) :							
				new SimArrayLike<String>(new SimArrayObject<String>(s.split(Js.toString(separator), lim)));
	}
	//@Override
	public final String substr(Object start) {
		int from = SimUtil.getNumber(start).intValue();
		from = from < 0 ? length() + from : from;
		return s.substring(from);
	}
	//@Override
	public final String substr(Object start, Object length) {
		int from = SimUtil.getNumber(start).intValue();
		from = from < 0 ? length() + from : from;
		int to = from + SimUtil.getNumber(length).intValue();
		return s.substring(from, to);
	}
	//@Override
	public final String substring(Object from) {
		return s.substring(
				SimUtil.getNumber(from).intValue()
		);
	}
	//@Override
	public final String substring(Object from, Object to) {
		return s.substring(
				SimUtil.getNumber(from).intValue(),
				SimUtil.getNumber(to  ).intValue()
		);
	}
	//@Override
	public final String toLocaleLowerCase() {
		return s.toLowerCase();
	}
	//@Override
	public final String toLocaleUpperCase() {
		return s.toUpperCase();
	}
	//@Override
	public final String toLowerCase() {
		return s.toLowerCase(Locale.ENGLISH);
	}
	//@Override
	public final String toUpperCase() {
		return s.toUpperCase(Locale.ENGLISH);
	}
	//@Override
	public final String toString() {
		return s;
	}
	//@Override
	public final String typeof() {
		return "string";
	}
	//@Override
	public final boolean undefined() {
		return false;
	}
	//@Override
	public final String valueOf() {
		return s;
	}
}
