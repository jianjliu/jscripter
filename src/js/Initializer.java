
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

/**
 * <p>An <b>opaque</b> class resembling JavaScript object initializers (also known 
 * as object literals).</p>
 * <p>JavaScript defines an object literal syntax that allows you to create an object 
 * and specify its properties. An object literal (also called an object initializer) 
 * consists of a comma-separated list of colon-separated property/value pairs, all 
 * enclosed within curly braces.</p>
 * <p>In JavaScript, the property values used in object literals need not be constants; 
 * they can be arbitrary expressions. Also, the property names in object literals may 
 * be string literal rather than identifiers.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see Js#object()
 * @see Js#object(Object)
 * @see js.core.JsObject#JsObject()
 * @see js.core.JsGlobal.Object#create()
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 * Re-compilers should convert Java expressions like:
 * <pre>new Initializer().set("label1", v1).set("label2", v2).set("label3", v3).var()</pre>
 * or
 * <pre>new Initializer().set("label1", v1).set("label2", v2).set("label3", v3)</pre>
 * into JavaScript expressions as:
 * <pre>{"label1":v1,"label2":v2,"label3":v3}</pre>
 */

public final class Initializer extends Var<ObjectLike>
{
	private final ObjectLike o;

	/**
	 * <p>Creates an <tt>Initializer</tt> cache.</p>
	 * @since 1.0
	 * @javascript Re-compilers must create a re-compile time <tt>Initializer</tt> cache 
	 * without generating any JavaScript statements or expressions for this constructor.
	 */
	public Initializer() {
		o = Js.object();
	}

	/**
	 * <p>Converts the current <tt>Initializer</tt> cache instance to an object.</p>
	 * @return The object represented by the current <tt>Initializer</tt> cache itself.
	 * @since 1.0
	 * @javascript Re-compilers must replace the virtual invocation of this method with the 
	 * JavaScript object literal represented by the current <tt>Initializer</tt> cache 
	 * instance they have kept.
	 */
	@Override
	public final ObjectLike var() {
		return o;
	}

	/**
	 * <p>Appends a property-value pair to the current <tt>Initializer</tt> cache 
	 * instance.</p>
	 * @param label The member ID of the property to set <tt>value</tt> to the current 
	 * <tt>Initializer</tt> cache instance.
	 * @param value The value to be set to the <tt>label</tt> of the current 
	 * <tt>Initializer</tt> cache instance.
	 * @return The current <tt>Initializer</tt> cache instance itself.
	 * @since 1.0
	 * @javascript Re-compilers must append the property-value pair, that is <tt>label:value</tt>, 
	 * to the current re-compile time <tt>Initializer</tt> cache they have kept, without 
	 * generating any JavaScript statements or expressions for the virtual invocation of 
	 * this method, where <tt>label</tt> must be resolved to the property identifier.
	 */
	private final <T> Initializer set(Mid label, T value) {
		o.var(label, value);
		return this;
	}
	/**
	 * <p>Appends a property-value pair to the current <tt>Initializer</tt> cache 
	 * instance.</p>
	 * @param label The member ID of the property to set <tt>value</tt> on the current 
	 * <tt>Initializer</tt> cache instance. This argument must be a string literal. 
	 * Otherwise, JS compilers shall report an error.
	 * @param value The value to be set to the <tt>label</tt> of the current 
	 * <tt>Initializer</tt> cache instance.
	 * @return The current <tt>Initializer</tt> cache instance itself.
	 * @since 1.0
	 * @javascript Re-compilers must append the property-value pair, that is <tt>label:value</tt>, 
	 * to the current re-compile time <tt>Initializer</tt> cache they have kept without 
	 * generating any JavaScript statements or expressions for the virtual invocation of 
	 * this method and report error if <tt>label</tt> can not be resolved to a string 
	 * literal.
	 */
	public final Initializer set(String label, Object value) {
		return set(Members.id(label), value);
	}
	/**
	 * <p>Appends a property-value pair to the current <tt>Initializer</tt> cache 
	 * instance.</p>
	 * @param label The member ID of the property to set the <tt>value</tt> on the current 
	 * <tt>Initializer</tt> cache instance. This argument must be an integer literal. 
	 * Otherwise, JS compilers shall report an error.
	 * @param value The value to be set to the <tt>label</tt> of the current 
	 * <tt>Initializer</tt> cache instance.
	 * @return The current <tt>Initializer</tt> cache instance itself.
	 * @since 1.0
	 * @javascript Re-compilers must append the property-value pair, that is <tt>label:value</tt>, 
	 * to the current re-compile time <tt>Initializer</tt> cache they have kept without 
	 * generating any JavaScript statements or expressions for the virtual invocation of 
	 * this method and report error if <tt>label</tt> can not be resolved to a number 
	 * literal as the property identifier.
	 */
	public final Initializer set(int label, Object value) {
		return set(Integer.toString(label), value);
	}
	/**
	 * <p>Appends a property-value pair to the current <tt>Initializer</tt> cache 
	 * instance.</p>
	 * @param label The ID of the property to set the <tt>value</tt> on the current 
	 * <tt>Initializer</tt> cache instance.
	 * @param value The value to be set to the <tt>label</tt> of the current 
	 * <tt>Initializer</tt> cache instance.
	 * @return The current <tt>Initializer</tt> cache instance itself.
	 * @since 1.0
	 * @javascript Re-compilers must append the property-value pair, that is <tt>label:value</tt>, 
	 * to the current re-compile time <tt>Initializer</tt> cache they have kept without 
	 * generating any JavaScript statements or expressions for the virtual invocation of 
	 * this method, where <tt>label</tt> must be resolved to a globally unique numerical 
	 * property identifier.
	 */
	public final <T> Initializer set(Id<T> label, T value) {
		return set(label.mid(), value);
	}
	/**
	 * <p>Appends a property-value pair to the current <tt>Initializer</tt> cache 
	 * instance.</p>
	 * @param label The member ID of the property to set the <tt>value</tt> to the current 
	 * <tt>Initializer</tt> cache instance.
	 * @param value The value to be set to the <tt>label</tt> of the current 
	 * <tt>Initializer</tt> cache instance.
	 * @return The current <tt>Initializer</tt> cache instance itself.
	 * @since 1.0
	 * @javascript Re-compilers must append the property-value pair, that is <tt>label:value</tt>, 
	 * to the current re-compile time <tt>Initializer</tt> cache they have kept without 
	 * generating any JavaScript statements or expressions for the virtual invocation of 
	 * the method, where <tt>label</tt> must be resolved to the property identifier.
	 */
	public final <T> Initializer set(Member<T> label, T value) {
		return set(label.mid(), value);
	}
}
