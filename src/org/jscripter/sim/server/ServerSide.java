
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

package org.jscripter.sim.server;

import org.jscripter.sim.Simul;

import js.*;
import js.core.*;
import js.user.*;

/**
 * <p>An <b>internal</b> class for JS Server-Side Simulation.</p>
 * <p>This <b>internal</b> class is only used or extended internally in JS Simulation Library.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must report error on resolving an <tt>internal</tt> class. 
 */
public class ServerSide extends Simul
{
	private static ServerSide singleton;

	/**
	 * <p>Internally determines whether a JS Server-Side Simulation is running.</p>
	 * @return <tt>true</tt> if there is a JS Core Simulation running; <tt>false</tt> otherwise.
	 * @since 1.0
	 * 
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
	 */
	public final static synchronized boolean isRunning() {
		return singleton != null;
	}

	/**
	 * <p>Internally gets a JS Server-Side Simulation.</p>
	 * @return A Js Server-Side Simulation.
	 * @since 1.0
	 * 
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
	 */
	public final static synchronized ServerSide get() {
		if (singleton == null) {
			singleton = new ServerSide();
		}
		return singleton;
	}

	/**
	 * <p>Internally constructs a JS Server-Side Simulation.</p>
	 * @since 1.0
	 * 
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
	 */
	protected ServerSide() {}

	/**
	 * <p>Internally checks if the simulation is limited to JavaScript core features only.</p>
	 * <p>This method always returns <tt>true</tt>.</p>
	 * @return <tt>true</tt> if this is a core simulation; <tt>false</tt>, otherwise;
	 * @since 1.0
	 * 
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected final boolean isCore() {
		return true;
	}

	/**
	 * <p>Internally creates function object from a function definition.</p>
	 * <p>This method simply throws an {@link UnsupportedOperationException} exception.</p>
	 * @param f A {@link Function} definition.
	 * @return The function object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected <T> JsFunction<T> var(Function<T> f) {
		throw new UnsupportedOperationException("Server Side only!");
	}

	/**
	 * <p>Returns the opaque global object with the client-side support.</p>
	 * <p>This method simply throws an {@link UnsupportedOperationException} exception.</p>
	 * @return The opaque global object with the client-side support.
	 * @see Js#win()
	 * @see jsx.client.Client
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected JsWin win() {
		throw new UnsupportedOperationException("Server Side only!");
	}

	/**
	 * <p>Returns the opaque global object with the core support only.</p>
	 * <p>This method simply throws an {@link UnsupportedOperationException} exception.</p>
	 * @return The opaque global object with the core support only.
	 * @see Js#core()
	 * @see jsx.client.Global
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected JsGlobal core() {
		throw new UnsupportedOperationException("Server Side only!");
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
	@Override
	protected JsArray toJsArray(JsObject o) {
		throw new UnsupportedOperationException("Server Side only!");
	}

	/**
	 * <p>Internally down cast an object to boolean type.</p>
	 * <p>This method simply throws an {@link UnsupportedOperationException} exception.</p>
	 * @param o The object
	 * @since 1.0
	 * @return The boolean representation of an object
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected JsBoolean toJsBoolean(JsObject o) {
		throw new UnsupportedOperationException("Server Side only!");
	}

	/**
	 * <p>Internally down cast an object to date type.</p>
	 * <p>This method simply throws an {@link UnsupportedOperationException} exception.</p>
	 * @param o The object
	 * @since 1.0
	 * @return The date representation of an object
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected JsDate toJsDate(JsObject o) {
		throw new UnsupportedOperationException("Server Side only!");
	}

	/**
	 * <p>Internally down cast an object to function type.</p>
	 * <p>This method simply throws an {@link UnsupportedOperationException} exception.</p>
	 * @param o The object
	 * @since 1.0
	 * @return The function representation of an object
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected <T> JsFunction<T> toJsFunction(JsObject o) {
		throw new UnsupportedOperationException("Server Side only!");
	}

	/**
	 * <p>Internally down cast an object to function type.</p>
	 * <p>This method simply throws an {@link UnsupportedOperationException} exception.</p>
	 * @param o The object
	 * @param w A wrapper to perform the cast
	 * @since 1.0
	 * @return The function representation of an object
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected <T> JsFunction<T> toJsFunction(JsObject o, Generic<T> w) {
		throw new UnsupportedOperationException("Server Side only!");
	}

	/**
	 * <p>Internally down cast an object to number type.</p>
	 * <p>This method simply throws an {@link UnsupportedOperationException} exception.</p>
	 * @param o The object
	 * @since 1.0
	 * @return The number representation of an object
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected JsNumber toJsNumber(JsObject o) {
		throw new UnsupportedOperationException("Server Side only!");
	}

	/**
	 * <p>Internally down cast an object to regular expression type.</p>
	 * <p>This method simply throws an {@link UnsupportedOperationException} exception.</p>
	 * @param o The object
	 * @since 1.0
	 * @return The regular expression representation of an object
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected JsRegExp toJsRegExp(JsObject o) {
		throw new UnsupportedOperationException("Server Side only!");
	}

	/**
	 * <p>Internally down cast an object to string type.</p>
	 * <p>This method simply throws an {@link UnsupportedOperationException} exception.</p>
	 * @param o The object
	 * @since 1.0
	 * @return The string representation of an object
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected JsString toJsString(JsObject o) {
		throw new UnsupportedOperationException("Server Side only!");
	}

	/**
	 * <p>Internally creates a variable list from a value or object.</p>
	 * <p>This method simply throws an {@link UnsupportedOperationException} exception.</p>
	 * @param args A value or object.
	 * @return The variable list created.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected Vars<?> vars(Object args) {
		throw new UnsupportedOperationException("Server Side only!");
	}

	/**
	 * <p>Gets the list of the property names of an object.</p>
	 * <p>This method simply throws an {@link UnsupportedOperationException} exception.</p>
	 * @param o The object.
	 * @return The list of the property names of the object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected ArrayLike<String> keys(JsObject o) {
		throw new UnsupportedOperationException("Server Side only!");
	}

	/**
	 * <p>Copies all the properties of <tt>a</tt> to <tt>o</tt>.</p>
	 * <p>This method simply throws an {@link UnsupportedOperationException} exception.</p>
	 * @param o The object that the properties being copied to.
	 * @param a The object that the properties being copied from.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected void apply(JsObject o, ObjectLike a) {
		throw new UnsupportedOperationException();
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
		throw new UnsupportedOperationException("Server Side only!");
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
		return o.hashCode();
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
			throw new UnsupportedOperationException("Server Side only!");
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
	protected boolean in(Object v, Object o) {
		v = v instanceof Var<?> ? ((Var<?>)v).var() : v;
		o = o instanceof Var<?> ? ((Var<?>)o).var() : o;
		return o instanceof JsObject && Js.be(((JsObject)o).var(v.toString()));
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
	protected boolean instanceOf(Object v, Object o) {
		v = v instanceof Var<?> ? ((Var<?>)v).var() : v;
		o = o instanceof Var<?> ? ((Var<?>)o).var() : o;
		return v instanceof JsObject && o instanceof JsFunction<?> &&
			equals(JsObject.constructor.with((JsObject)v), o);
	}

	/**
	 * <p>Gets the value or object contained in a <tt>RuntimeException</tt> object 
	 * thrown by JS Simulation.</p>
	 * @param e The <tt>RuntimeException</tt> object thrown by JS Simulation.
	 * @return The value or object contained in the <tt>RuntimeException</tt> object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected Object err(RuntimeException e) {
		return e;
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
		return true;
	}
}
