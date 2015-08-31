
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

package org.jscripter.sim.client;

import java.applet.Applet;

import netscape.javascript.JSObject;
import js.*;
import js.core.*;
import js.user.*;

/**
 * <p>An <b>internal</b> class for JS Embeded Simulation on FireFox-compatible browsers.</p>
 * <p>This <b>internal</b> class is only extended internally in JS Simulation Library.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must report error on resolving an <tt>internal</tt> class. 
 */
public final class EmbededFF extends Embeded
{
	/**
	 * <p>Internally constructs a JS Embeded Simulation from an applet on a FireFox-compatible browser.</p>
	 * @param applet A Java applet.
	 * @since 1.0
	 * 
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
	 */
	protected EmbededFF(Applet applet) {
		super(applet);
	}

	/**
	 * <p>Internally creates function object from a function definition.</p>
	 * @param f A {@link Function} definition.
	 * @return The function object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected <T> JsFunction<T> var(Function<T> f) {
		return new JseFunction<T>(
				new JseObjectFF.JseoFunction<T>(
						f
				)
		);
	}

	private JsWin win;

	/**
	 * <p>Returns the opaque global object with the client-side support.</p>
	 * @return The opaque global object with the client-side support.
	 * @see Js#win()
	 * @see jsx.client.Client
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected JsWin win() {
		if (win == null) {
			win = new JsWin(new JseObjectFF(getWindow()));;
		}
		return win;
	}

	/**
	 * <p>Internally creates a variable list from a value or object.</p>
	 * @param args A value or object.
	 * @return The variable list created.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected Vars<?> vars(Object args) {
		if (args instanceof Var<?>) {
			args = ((Var<?>)args).var();
		}
		Vars<Object> vars = new Vars<Object>();
		if (args instanceof JsObject) {
			args = ((Live)((JsObject)args).var()).getJSObject();
		}
		if (args instanceof JSObject) {
			if (((JSObject)args).getMember("length") != null) {
				args = new JseArray(new JseObjectFF(args));
			}
		}
		if (args instanceof ArrayObject<?>) {
			ArrayObject<?> a = (ArrayObject<?>)args;
			for (int l = a.length(), i = 0; i < l; i++) {
				vars.add(JseObjectFF.wrap(a.get(i)));
			}
		} else if (args.getClass().isArray()) {
			Object[] a = (Object[])args;
			for (int l = a.length, i = 0; i < l; i++) {
				vars.add(JseObjectFF.wrap(a[i]));
			}
		} else if (args != null) {
			vars.add(JseObjectFF.wrap(args));
		}
		return vars;
	}

	/**
	 * <p>Creates a JavaScript function.</p>
	 * <p>A function is a fundamental data-type in JavaScript. Note that although functions 
	 * may be created with this method, this is not efficient, and the preferred way to 
	 * define functions, in most cases, is to extend {@link Function}.</p>
	 * @param args A list of the argument values, each naming one or more arguments of the 
	 * function being created, ended with a string that specifies the body of the function.
	 * @return A newly created function. Invoking it executes the JavaScript code specified 
	 * by last string value of the variable argument <tt>args</tt>.
	 * @throws RuntimeException JavaScript throws a <tt>SyntaxError</tt> if there was a 
	 * JavaScript syntax error in one of the value of the variable arguments. See {@link Js#err(Object)} 
	 * and {@link js.core.JsSyntaxError} for JS Simulation.
	 * @see Function
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected <T> JsFunction<T> function(Vars<String> args) {
		ArrayLike<String> a = args.var();
		int alen = a.length();
		StringBuilder sb = new StringBuilder("Object(function(");
		if (alen < 1) {
			sb.append("){})");
		} else {
			for (int i = 0; i < alen - 1; i++) {
				if (i > 0) {
					sb.append(',');
				}
				sb.append(a.get(i));
			}
			sb.append("){").append(a.get(alen - 1)).append("})");
		}
		return new JseFunction<T>(
				new JseObjectFF(
						getWindow().eval(sb.toString())
				)
		);
	}

	/**
	 * <p>Gets the list of the property names of an object.</p>
	 * @param o The object.
	 * @return The list of the property names of the object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected final ArrayLike<String> keys(JsObject o) {
		return (ArrayLike<String>)(ArrayLike<?>)new JseArray(new JseObjectFF(
				getWindow().call(
						"$keys",
						new Object[]{JseObject.unwrap(o)}
				)
		));
	}
}
