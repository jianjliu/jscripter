
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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jscripter.sim.core.Core;


import js.ArrayLike;
import js.Js;
import js.RegExpLike;
import js.core.JsGlobal;
import js.core.JsRegExp;

class SimRegExpLike implements RegExpLike
{
	private final String regex;
	private final String flags;
	private final boolean global;
	private final boolean ignoreCase;
	private final boolean multiline;
	private Integer lastIndex = 0;
	private Pattern pattern = null;

	public SimRegExpLike(String regex, String flags) {
		this.regex = regex;
		this.flags = flags;
		boolean g = false, i = false, m = false;
		for (char c : flags.toCharArray()) {
			switch (c)
			{
				case 'g':
				case 'G':
					g = true;
					break;
				case 'i':
				case 'I':
					i = true;
					break;
				case 'm':
				case 'M':
					m = true;
					break;
				default:
			}
		}
		global = g;
		ignoreCase = i;
		multiline = m;
	}
	public SimRegExpLike(String regex) {
		this.regex = regex;
		this.flags = null;
		global     = false;
		ignoreCase = false;
		multiline  = false;
	}

	public final Pattern pattern() {
		if (pattern == null) {
			int flags = 0;
			if (ignoreCase) {
				flags = Pattern.CASE_INSENSITIVE;
			}
			if (multiline) {
				flags |= Pattern.MULTILINE;
			}
			pattern = Pattern.compile(regex, flags);
		}
		return pattern;
	}
	//@Override
	public final synchronized ArrayLike<?> exec(Object s) {
		Matcher m = pattern().matcher(Js.toString(s));
		boolean ret = false;
		if (global()) {
			ret = m.find(lastIndex);
			lastIndex = ret ? m.end() : 0;
		} else {
			ret = m.find();
		}
		if (ret) {
			SimArrayMatched a = new SimArrayMatched();
			a.index(m.start());
			a.input(Js.toString(s));
			for (int i = 0, n = m.groupCount(); i < n; i++) {
				a.push(m.group(i));
			}
			return a;
		} else {
			return null;
		}
	}
	//@Override
	public final boolean global() {
		return global;
	}
	//@Override
	public final boolean ignoreCase() {
		return ignoreCase;
	}
	//@Override
	public final Integer lastIndex() {
		return lastIndex;
	}
	//@Override
	public final synchronized Integer lastIndex(Integer lastIndex) {
		return this.lastIndex = lastIndex;
	}
	//@Override
	public final boolean multiline() {
		return multiline;
	}
	//@Override
	public final String source() {
		return regex;
	}
	//@Override
	public final synchronized boolean test(Object s) {
		Matcher m = pattern().matcher(Js.toString(s));
		if (global()) {
			boolean ret = m.find(lastIndex);
			lastIndex = ret ? m.end() : 0;
			return ret;
		} else {
			return m.find();
		}
	}
	//@Override
	public final String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\\/");
		sb.append(regex);
		sb.append("\\/");
		if (global) {
			sb.append('g');
		}
		if (ignoreCase) {
			sb.append('i');
		}
		if (multiline) {
			sb.append('m');
		}
		return sb.toString();
	}

	//@Override
	public final RegExpLike valueOf() {
		return this;
	}

	//@Override
	public final JsRegExp var() {
		if (Core.isRunning()) {
			return JsGlobal.RegExp.with().create(this);
		} else {
			if (flags == null) {
				return JsGlobal.RegExp.with().create(regex);
			} else {
				return JsGlobal.RegExp.with().create(regex, flags);
			}
		}
	}
}
