
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

import org.jscripter.sim.Simul;


import netscape.javascript.JSException;
import netscape.javascript.JSObject;
import js.*;
import js.core.*;
import js.user.*;

/**
 * <p>An abstract <b>internal</b> class for JS Embeded Simulation.</p>
 * <p>This <b>internal</b> class is only extended internally in JS Simulation Library.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must report error on resolving an <tt>internal</tt> class. 
 */
public abstract class Embeded extends Simul
{
	final static Object[] noargs = new Object[]{};

	/**
	 * <p>Internally creates a JS Embeded Simulation from an applet.</p>
	 * @param applet A Java applet.
	 * @return A Js Embeded Simulation.
	 * @since 1.0
	 * 
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
	 */
	public static final Embeded create(Applet applet) {
		JSObject win = (JSObject)JSObject.getWindow(applet);
//		if ((Boolean)win.eval("!XMLHttpRequest&&ActiveXObject")) {
		if ((Boolean)win.eval("/MSIE/i.test(navigator.userAgent)")) {
			return new EmbededIE(applet);
		} else {
			return new EmbededFF(applet);
		}
	}

	/**
	 * <p>Internally checks if the simulation is limited to JavaScript core features only.</p>
	 * <p>This method always returns <tt>false</tt>.</p>
	 * @return <tt>true</tt> if this is a core simulation; <tt>false</tt>, otherwise;
	 * @since 1.0
	 * 
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected final boolean isCore() {
		return false;
	}

	private final JSObject win;

	/**
	 * <p>Internally constructs a JS Embeded Simulation from an applet.</p>
	 * @param applet A Java applet.
	 * @since 1.0
	 * 
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
	 */
	protected Embeded(Applet applet) {
		win = (JSObject)JSObject.getWindow(applet);
		win.eval(
				"window.$f=function(o){var f=function(){return o.apply(this,arguments);};f.$f=o;return f;};" +
				"window.$destroy=function(o){delete o;};" +
				"window.$nhc=0;" +
				"window.$hc=function(o){return o.$$hc?o.$$hc:(o.$$hc=window.$nhc++);};" +
				"window.$eq=function(v,o){return v==o;};" +
				"window.$eqs=function(v,o){return v===o;};" +
				"window.$in=function(s,o){return s in o;};" +
				"window.$ins=function(o,f){return o instanceof f;};" +
				"window.$keys=function(o){" +
					"var r=[];" +
					"for(var p in o){" +
						"r.push(p);" +
					"}" +
					"return r;" +
				"};" +
				"window.$ap=function(o,a){" +
					"for(var p in a){" +
						"o[p]=a[p];" +
					"}" +
				"};" +
				"window.$cp=function(o){" +
					"var c={};" +
					"$apply(c,o);" +
					"return c;" +
				"};"
		);
	}

	/**
	 * <p>Internally returns the global {@link JSObject} object for the current browser.</p>
	 * @return The global {@link JSObject} object for the current browser.
	 * @since 1.0
	 * 
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	protected final JSObject getWindow() {
		return win;
	}

	/**
	 * <p>Returns the opaque global object with the client-side support.</p>
	 * @return The opaque global object with the client-side support.
	 * @see Js#win()
	 * @see jsx.client.Client
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected abstract JsWin win();

	/**
	 * <p>Returns the opaque global object with the core support only.</p>
	 * <p>This method returns exactly the same as {@link #win()}.</p>
	 * @return The opaque global object with the core support only.
	 * @see Js#core()
	 * @see jsx.client.Global
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected final JsGlobal core() {
		return win();
	}

	/**
	 * <p>Internally down cast an object to array type.</p>
	 * <p>This method is internal and only called inside of opaque or internal classes 
	 * or class members.</p>
	 * @param o The object
	 * @since 1.0
	 * @return The array representation of an object
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected final JsArray toJsArray(JsObject o) {
		Unwrappable<JseObject> u = o == null ? null : (Unwrappable<JseObject>)o.var();
		return u == null ? null : new JseArray(u.unwrap());
	}

	/**
	 * <p>Internally down cast an object to boolean type.</p>
	 * <p>This method is internal and only called inside of opaque or internal classes 
	 * or class members.</p>
	 * @param o The object
	 * @since 1.0
	 * @return The boolean representation of an object
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected final JsBoolean toJsBoolean(JsObject o) {
		Unwrappable<JseObject> u = o == null ? null : (Unwrappable<JseObject>)o.var();
		return u == null ? null : new JseBoolean(u.unwrap());
	}

	/**
	 * <p>Internally down cast an object to date type.</p>
	 * <p>This method is internal and only called inside of opaque or internal classes 
	 * or class members.</p>
	 * @param o The object
	 * @since 1.0
	 * @return The date representation of an object
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected final JsDate toJsDate(JsObject o) {
		Unwrappable<JseObject> u = o == null ? null : (Unwrappable<JseObject>)o.var();
		return u == null ? null : new JseDate(u.unwrap());
	}

	/**
	 * <p>Internally down cast an object to function type.</p>
	 * <p>This method is internal and only called inside of opaque or internal classes 
	 * or class members.</p>
	 * @param o The object
	 * @since 1.0
	 * @return The function representation of an object
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected final <T> JsFunction<T> toJsFunction(JsObject o) {
		Unwrappable<JseObject> u = o == null ? null : (Unwrappable<JseObject>)o.var();
		return u == null ? null : new JseFunction<T>(u.unwrap());
	}

	/**
	 * <p>Internally down cast an object to function type.</p>
	 * <p>This method is internal and only called inside of opaque or internal classes 
	 * or class members.</p>
	 * @param o The object
	 * @param w A wrapper to perform the cast
	 * @since 1.0
	 * @return The function representation of an object
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected final <T> JsFunction<T> toJsFunction(JsObject o, Generic<T> w) {
		if (o == null) {
			return null;
		}
		Unwrappable<JseObject> u = (Unwrappable<JseObject>)o.var();
		if (u == null) {
			return null;
		}
		return u == null ? null :
			u instanceof JseFunctionW<?> ? new JseFunctionW<T>(u.unwrap(), (JseFunctionW<T>)u) :
				new JseFunctionW<T>(u.unwrap(), w);
	}

	/**
	 * <p>Internally down cast an object to number type.</p>
	 * <p>This method is internal and only called inside of opaque or internal classes 
	 * or class members.</p>
	 * @param o The object
	 * @since 1.0
	 * @return The number representation of an object
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected final JsNumber toJsNumber(JsObject o) {
		Unwrappable<JseObject> u = o == null ? null : (Unwrappable<JseObject>)o.var();
		return u == null ? null : new JseNumber(u.unwrap());
	}

	/**
	 * <p>Internally down cast an object to regular expression type.</p>
	 * <p>This method is internal and only called inside of opaque or internal classes 
	 * or class members.</p>
	 * @param o The object
	 * @since 1.0
	 * @return The regular expression representation of an object
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected final JsRegExp toJsRegExp(JsObject o) {
		Unwrappable<JseObject> u = o == null ? null : (Unwrappable<JseObject>)o.var();
		return u == null ? null : new JseRegExp(u.unwrap());
	}

	/**
	 * <p>Internally down cast an object to string type.</p>
	 * <p>This method is internal and only called inside of opaque or internal classes 
	 * or class members.</p>
	 * @param o The object
	 * @since 1.0
	 * @return The string representation of an object
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected final JsString toJsString(JsObject o) {
		Unwrappable<JseObject> u = o == null ? null : (Unwrappable<JseObject>)o.var();
		return u == null ? null : new JseString(u.unwrap());
	}

	/**
	 * <p>Gets the hash code of a value.</p>
	 * @param o Any value.
	 * @return The hash code of a value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected final int hashCode(Object o) {
		o = o instanceof Var<?> ? ((Var<?>)o).var() : o;
		return o instanceof Live ? (Integer)getWindow().call(
				"$hc",
				new Object[]{((Live)o).getJSObject()}
		) : o.hashCode();
	}

	/**
	 * <p>Copies all the properties of <tt>a</tt> to <tt>o</tt>.</p>
	 * @param o The object that the properties being copied to.
	 * @param a The object that the properties being copied from.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected void apply(JsObject o, ObjectLike a) {
		JSObject jso = ((Live)o.var()).getJSObject();
		JSObject obj = (JSObject)getWindow().call("Object", noargs);
		ArrayLike<String> keys = Js.keys(a);
		for (int i = 0, len = keys.length(); i < len; i++) {
			String k = keys.get(i);
			try {
				obj.setMember(k, a.var(k));
			} catch (JSException jse) {
				throw new RuntimeException(k + ':' + a.var(k), jse);
			}
		}
		getWindow().call(
				"$ap",
				new Object[] {jso, obj}
		);
	}

	/**
	 * <p>Checks if a value equals another object.</p>
	 * @param v Any value
	 * @param o Any value
	 * @return <tt>true</tt> if <tt>v</tt> equals <tt>o</tt>; false, otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected final boolean equals(Object v, Object o) {
		return eqs(v, o);
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
	 * @param v Any value or object.
	 * @param o Any value or object.
	 * @return <tt>true</tt> if the first operand equals the second; <tt>false</tt>, 
	 * otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected final boolean eq(Object v, Object o) {
		v = v instanceof Var<?> ? ((Var<?>)v).var() : v;
		o = o instanceof Var<?> ? ((Var<?>)o).var() : o;
		boolean nv = Js.undefined(v);
		boolean no = Js.undefined(o);
		if (nv && no) {
			return true;
		} else if (nv || no) {
			return false;
		}
		if (v instanceof Var<?> && o instanceof Var<?>) {
			return (Boolean)getWindow().call(
					"$eq",
					new Object[]{
							((Live)v).getJSObject(),
							((Live)o).getJSObject()
					}
			);
		}
		return eqv(Js.valueOf(v), Js.valueOf(o));
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
	 * @param v Any value or object.
	 * @param o Any value or object.
	 * @return <tt>true</tt> if the first operand is identical to the second; 
	 * <tt>false</tt>, otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected final boolean eqs(Object v, Object o) {
		v = v instanceof Var<?> ? ((Var<?>)v).var() : v;
		o = o instanceof Var<?> ? ((Var<?>)o).var() : o;
		boolean nv = Js.undefined(v);
		boolean no = Js.undefined(o);
		if (nv && no) {
			return true;
		} else if (nv || no) {
			return false;
		}
		boolean lv = v instanceof Var<?>;
		boolean lo = o instanceof Var<?>;
		if (lv && lo) {
			return (Boolean)getWindow().call(
					"$eqs",
					new Object[]{
							((Live)v).getJSObject(),
							((Live)o).getJSObject()
					}
			);
		}
		return !lv && !lo && v.equals(o);
	}

	/**
	 * <p>Checks if the first operand is the name of a property of the second, resembling 
	 * the <tt>in</tt> operator in JavaScript.</p>
	 * <p>This operation converts the first operand to a string and expects the second 
	 * operand be an object (or array).</p>
	 * @param v Any value that is or can be converted to a string.
	 * @param o Any object or array.
	 * @return <tt>true</tt> if the first operand is the name of a property of the 
	 * second operand; <tt>false</tt>, otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected final boolean in(Object v, Object o) {
		v = v instanceof Var<?> ? ((Var<?>)v).var() : v;
		o = o instanceof Var<?> ? ((Var<?>)o).var() : o;
		return o instanceof Live && (Boolean)getWindow().call(
				"$in",
				new Object[]{
						v instanceof Live ? ((Live)v).getJSObject() : Js.toString(v),
						((Live)o).getJSObject()
				}
		);
	}

	/**
	 * <p>Checks if the first operand is an instance of the second, resembling the 
	 * <tt>instanceof</tt> operator in JavaScript.</p>
	 * <p>This operation expects the first operand be an object and the second be a class 
	 * of objects. In JavaScript, classes of objects are defined by the constructor function 
	 * that initializes them.</p>
	 * @param v Any value or object.
	 * @param o A constructor function.
	 * @return <tt>true</tt> if the first operand is an instance of the second; 
	 * <tt>false</tt>, otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected final boolean instanceOf(Object v, Object o) {
		v = v instanceof Var<?> ? ((Var<?>)v).var() : v;
		o = o instanceof Var<?> ? ((Var<?>)o).var() : o;
		return v instanceof Live && o instanceof Live && (Boolean)getWindow().call(
				"$ins",
				new Object[]{
						((Live)v).getJSObject(),
						((Live)o).getJSObject()
				}
		);
	}

	/**
	 * <p>Gets the value or object contained in a <tt>RuntimeException</tt> object 
	 * thrown by JS Simulation.</p>
	 * @param e The <tt>RuntimeException</tt> object thrown by JS Simulation.
	 * @return The value or object contained in the <tt>RuntimeException</tt> object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@SuppressWarnings("deprecation")
	@Override
	protected final Object err(RuntimeException e) {
		return e instanceof JSException ? ((JSException)e).getWrappedException() : e;
	}

	/**
	 * <p>Checks if a variable represents a Java object.</p>
	 * @param v Any value or object.
	 * @return <tt>true</tt> if <tt>v</tt> is Java; <tt>false</tt>, otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected boolean isJavaObject(Object v) {
		return !(v instanceof JseObject) && !v.getClass().isPrimitive();
	}
}
