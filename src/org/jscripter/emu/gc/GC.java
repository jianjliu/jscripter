
/*
 *  JScripter Emulation 1.0 - To Script Java
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

package org.jscripter.emu.gc;

import org.jscripter.emu.java.JavaInterface;

import js.ArrayLike;
import js.Disposable;
import js.Id;
import js.Index;
import js.Js;
import js.ObjectLike;
import js.Vars;
import js.core.JsFunction;
import js.user.JsNode;
import jsx.Timeout;
import jsx.client.Document;
import jsx.client.Global;
import jsx.client.Win;
import jsx.core.ArrayLikes;
import jsx.core.ObjectLikes;
import jsx.dom.Nodes;

/**
 * <p>An <tt>internal</tt> abstract base class for DOM-enabled visitors emulating garbage collection 
 * based finalization in JavaScript.</p>
 * <p>This class is only used internally by JS re-compiler implementations.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript This class is only loaded and resolved by re-compiler implementations.
 */
public abstract class GC extends Disposable
{
	/**
	 * <p>Internally constructs an object visitor of this type.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	protected GC() {}

	/**
	 * <p>Internally traverses all children of an object.</p>
	 * @param o An object to traverse.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	protected void traverse(ObjectLike o) {
		JsNode c = Nodes.firstChild((JsNode)o, 1);
		while (isObjectLike(c)) {
			visit(c);
			c = Nodes.nextSibling(c, 1);
		}
	}

	/**
	 * <p>Internally visits an object.</p>
	 * @param o An object to visit.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	protected abstract void visit(ObjectLike o);

	/**
	 * <p>Internally checks if a variable represents an object constructed with a Java class.</p>
	 * @param o A value or object.
	 * @return <tt>true</tt> if <tt>o</tt> is Java; <tt>false</tt>, otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	protected static final boolean isJavaObject(Object o) {
		return Js.isJavaObject(o);
	}

	/**
	 * <p>Internally checks if a variable is a general object that is neither Java nor DOM.</p>
	 * @param o A value or object.
	 * @return <tt>true</tt> if <tt>o</tt> is general; <tt>false</tt>, otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	protected static final boolean isObjectLike(Object o) {
		return Js.instanceOf(o, Global.Object.var()) &&
			!(o instanceof JavaInterface);
	}

	/**
	 * <p>Internally checks if an object is relevant to the emulation of finalization.</p>
	 * @param o An object.
	 * @return <tt>true</tt> if it is relevant; <tt>false</tt>, otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	protected static final boolean isRelevant(ObjectLike o) {
		return !(o instanceof Disposable) && o != Js.win() &&
			o != Win.document.var() && o != Document.body.var();
	}

	/**
	 * <p>A global identifier for a configurable property of an object.</p>
	 * <p>The identified configurable property of an object is a reference 
	 * to an integer number that indicates how many counts the object are 
	 * currently referenced by other live objects.</p>
	 * @javascript Re-compilers must report error on end-users directly using this identifier.
	 * @since 1.0
	 */
	protected final static Index<Integer> REFS = new Index<Integer>("$GC.REFS");

	/**
	 * <p>Internally checks if an object is allocated.</p>
	 * @param o An object.
	 * @return <tt>true</tt> if it is allocated; <tt>false</tt>, otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	protected static final boolean isAllocated(ObjectLike o) {
		return Js.gt(ObjectLikes.get(o, REFS), 0);
	}

	/**
	 * <p>Internal logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * @param a A value or object.
	 * @param b A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	protected static final boolean or(Object a, Object b) {
		return Js.be(Js.or(a, b));
	}

	/**
	 * <p>Internally inverts the boolean value of its operand, resembling the logical NOT operator 
	 * in JavaScript.</p>
	 * @param o A value or object.
	 * @return The inverted boolean value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	protected static final boolean not(Object o) {
		return or(Js.not(o), Js.eq(o, "undefined"));
	}

	private final static Index<String> DBG = new Index<String>("$GC.DBG");

	private static final String getString(ObjectLike o, Id<String> id) {
		String s = o.var(id);
		return Js.cond(
				Js.be(s),
				s,
				"none"
		);
	}

	static final void debug(String d, String s, ObjectLike o) {
		if (Js.be(o) && Js.eq(d, getString(o, DBG))) {
			debug(s, o);
		}
	}

	static final void debug(String s, ObjectLike o) {
		if (Js.be(o)) {
			ArrayLike<String> msg = new Vars<String>()
				.add(s)
				.add(":")
				.add(getString(o, DBG))
				.add(":")
				.add((String)(Object)ObjectLikes.get(o, REFS))
				.var();
			Js.alert(msg.join(""));
		}
	}

	private static ArrayLike<?> CACHE;

	private static void clear() {
		dec(CACHE);
		CACHE = inc(new Vars<Object>().var());
	}

	/**
	 * <p>Internally caches a value if it is an object relevant to the finalization emulation.</p>
	 * @param o A value or object.
	 * @return The cached object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static <T> T cache(T o) {
		if (isObjectLike(o) && isRelevant((ObjectLike)o)) {
			if (Js.not(CACHE)) {
				clear();
			}
			CACHE.push(o);
		}
		return o;
	}

	private static ObjectLike HEAD;
	private final static Index<ObjectLike> THIS = new Index<ObjectLike>("$GC.THIS");
	private final static Index<ObjectLike> NEXT = new Index<ObjectLike>("$GC.NEXT");
	private final static Index<ObjectLike> PREV = new Index<ObjectLike>("$GC.PREV");

	/**
	 * <p>Internally creates a calling context for the finalization emulation.</p>
	 * @param arguments The arguments of the invocation.
	 * @return The newly created context object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static ObjectLike context(ObjectLike arguments) {
		ObjectLike c = (ObjectLike)incElements(
				(ArrayLike<?>)arguments
		);
		c.var(THIS, (ObjectLike)inc(Js.eval("this")));
		c.var(NEXT, HEAD);
		if (Js.be(HEAD)) {
			HEAD.var(PREV, inc(c));
		}
		HEAD = inc(c);
		return HEAD;
	}

	/**
	 * <p>Internally clears and releases a calling context for the finalization emulation
	 * optionally with a return value.</p>
	 * @param c A calling context object.
	 * @param r An optional return value.
	 * @return The returned value or <tt>undefined</tt> for none.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static <T> T release(ObjectLike c, T r) {
		inc(r);
		clear();
		ObjectLike next = c.var(NEXT);
		ObjectLike prev = c.var(PREV);
		if (Js.be(next)) {
			next.var(PREV, prev);
			ObjectLikes.dec(c, REFS);
			ObjectLikes.delete(c, NEXT);
		}
		if (Js.be(prev)) {
			prev.var(NEXT, next);
			ObjectLikes.delete(c, PREV);
		} else {
			HEAD = next;
		}
		dec(c);
		return r;
	}

	private static <T> T asg(T o, T r) {
		inc(r);
		dec(o);
		return r;
	}

	/**
	 * <p>Internally assigns a value to a variable with the finalization emulation.</p>
	 * @param o A variable to assign the value.
	 * @param r A value to replace the value.
	 * @return The new value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static <T> T replace(T o, T r) {
		if (r != o) {
			asg(o, r);
		}
		clear();
		return r;
	}

	/**
	 * <p>Internally sets a property value of an object with the finalization emulation.</p>
	 * @param o An object to set property value.
	 * @param r A name of a property.
	 * @param v A new value for the property of the object.
	 * @return The new value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static Object set(ObjectLike o, String r, Object v) {
		return Js.cond(
				Js.eq(o, v),
				o.var(r, v),
				o.var(r, asg(o.var(r), v))
		);
	}

	/**
	 * <p>Internally increases the reference count of an object.</p>
	 * @param o An object to increase reference count.
	 * @return The object itself.
	 * @see #REFS
	 * @see #dec(Object)
	 * @see #inc(Object)
	 * @see #incAll(ObjectLike)
	 * @see #incElements(ArrayLike)
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static <T> T inc(T o) {
		if (isObjectLike(o) && isRelevant((ObjectLike)(o))) {
			ObjectLikes.inc((ObjectLike)o, REFS);
		}
		return o;
	}

	/**
	 * <p>Internally increases the reference counts of all elements of an array.</p>
	 * @param a An array to increase reference count for elements.
	 * @return The array itself.
	 * @see #REFS
	 * @see #dec(Object)
	 * @see #inc(Object)
	 * @see #incAll(ObjectLike)
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static <T> ArrayLike<T> incElements(ArrayLike<T> a) {
		ArrayLike<T> r = new Vars<T>().var();
		for (int i = 0, len = a.length(); i < len; i++) {
			r.set(i, inc(a.get(i)));
		}
		return r;
	}

	/**
	 * <p>Internally increases the reference counts of all elements of an object.</p>
	 * @param o An object to increase reference count for elements.
	 * @return The object itself.
	 * @see #REFS
	 * @see #dec(Object)
	 * @see #inc(Object)
	 * @see #incElements(ArrayLike)
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static ObjectLike incAll(ObjectLike o) {
		ArrayLike<String> keys = Js.keys(o);
		for (int i = 0, len = keys.length(); i < len; i++) {
			inc(o.var(keys.get(i)));
		}
		return o;
	}

	/**
	 * <p>Internally decreases the reference count of an object.</p>
	 * @param o An object to decrease reference count.
	 * @return The object itself.
	 * @see #REFS
	 * @see #inc(Object)
	 * @see #incAll(ObjectLike)
	 * @see #incElements(ArrayLike)
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	protected static <T> T dec(T o) {
		if (isObjectLike(o) && isRelevant((ObjectLike)o) &&
				isAllocated((ObjectLike)o)) {
			ObjectLikes.dec((ObjectLike)o, REFS);
			DFS.start((ObjectLike)o);
		}
		return o;
	}

	/**
	 * <p>Internally executes code at periodic intervals, with finalization support 
	 * simulating the JavaScript global function of the same name.</p>
	 * <p>Note that the specified function is executed in the context of the Window object, 
	 * that is, the Window object is the value of the <tt>this</tt> keyword of the 
	 * executing context of the function. This is <tt>true</tt> even if the call to 
	 * {@link #setTimeout(JsFunction, Number)} occurred within a function with a longer 
	 * scope chain.</p>
	 * @param f A function to be periodically invoked.
	 * @param interval The interval, in milliseconds, between invocations of the function.
	 * @return A value that can be passed to {@link #clearInterval(ArrayLike)} method to 
	 * cancel the periodic execution of the function.
	 * @see #clearInterval(ArrayLike)
	 * @see js.Js#setInterval(JsFunction)
	 * @see js.Js#setInterval(JsFunction, Number)
	 * @see jsx.client.Global#setInterval(JsFunction)
	 * @see jsx.client.Global#setInterval(JsFunction, Number)
	 * @see jsx.client.Client#setInterval(JsFunction)
	 * @see jsx.client.Client#setInterval(JsFunction, Number)
	 * @see jsx.Interval
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final ArrayLike<?> setInterval(JsFunction<?> f, Number interval) {
		ArrayLike<?> id = new Vars<Object>().add(inc(f)).var();
		ArrayLikes.push(id, Global.setInterval(f, interval));
		return id;
	}

	/**
	 * <p>Internally cancels periodic execution of code, with finalization support
	 * simulating the JavaScript global function of the same name.</p>
	 * <p>This method stops the repeated execution of code that was started by a call to 
	 * {@link #setInterval(JsFunction, Number)}. <tt>intervalId</tt> must be the value 
	 * that was returned by a call to {@link #setInterval(JsFunction, Number)}.</p>
	 * @param intervalId The value returned by the corresponding call to {@link #setInterval(JsFunction, Number)}.
	 * @see #setInterval(JsFunction, Number)
	 * @see js.Js#setInterval(JsFunction, Number)
	 * @see jsx.client.Global#clearInterval(Object)
	 * @see jsx.client.Client#clearInterval(Object)
	 * @see jsx.Interval
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final void clearInterval(ArrayLike<?> intervalId) {
		Global.clearInterval(intervalId.pop());
		dec(intervalId.pop());
	}

	/**
	 * <p>Internally executes code after a specified amount of time elapses, with finalization support 
	 * simulating the JavaScript global function of the same name.</p>
	 * <p>Note that this method executes the specified function only once. The function is 
	 * executed in the context of the Window object, that is, the Window object is the 
	 * value of the <tt>this</tt> keyword of the executing context of the function. 
	 * This is <tt>true</tt> even if the call to {@link #setTimeout(JsFunction, Number)} 
	 * occurred within a function with a longer scope chain.</p>
	 * @param f A function to be invoked after the <tt>delay</tt> has elapsed.
	 * @param delay The amount of time, in milliseconds, before the function should be executed.
	 * @return A value that can be passed to the {@link #clearTimeout(ArrayLike)} method to 
	 * cancel the execution of the function.
	 * @see #clearTimeout(ArrayLike)
	 * @see js.Js#setTimeout(JsFunction)
	 * @see js.Js#setTimeout(JsFunction, Number)
	 * @see jsx.client.Global#setTimeout(JsFunction)
	 * @see jsx.client.Global#setTimeout(JsFunction, Number)
	 * @see jsx.client.Client#setTimeout(JsFunction)
	 * @see jsx.client.Client#setTimeout(JsFunction, Number)
	 * @see jsx.Timeout
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static ArrayLike<?> setTimeout(final JsFunction<?> f, Number delay) {
		final ArrayLike<?> id = new Vars<Object>().add(inc(f)).var();
		Timeout t = new Timeout() {
			@Override
			public void run() {
				f.invoke();
				clearTimeout(id);
			}
		};
		id.push(t);
		t.set(delay);
		return id;
	}

	/**
	 * <p>Internally cancels a pending timeout operation, with finalization support
	 * simulating the JavaScript global function of the same name.</p>
	 * <p>This method cancels the execution of code that has been deferred with the 
	 * {@link #setTimeout(JsFunction, Number)} method. The <tt>timeoutId</tt> argument 
	 * is a value returned by the call to {@link #setTimeout(JsFunction, Number)} and 
	 * identifies which deferred code to cancel.</p>
	 * @param timeoutId A value returned by {@link #setTimeout(JsFunction, Number)} that 
	 * identifies the timeout to be canceled.
	 * @see #setTimeout(JsFunction, Number)
	 * @see js.Js#setTimeout(JsFunction, Number)
	 * @see js.Js#clearTimeout(Object)
	 * @see jsx.client.Global#clearTimeout(Object)
	 * @see jsx.client.Client#clearTimeout(Object)
	 * @see jsx.Timeout
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final void clearTimeout(ArrayLike<?> timeoutId) {
		((Timeout)timeoutId.pop()).clear();
		dec(timeoutId.pop());
	}
}
