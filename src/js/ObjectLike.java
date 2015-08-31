
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

import js.Var.Mid;
import js.core.JsObject;

/**
 * <p>An <b>opaque</b> interface resembling JavaScript objects.</p>
 * <p>This interface must be implemented in JS Simulation Libraries.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see Initializer#var()
 * @see Js#object()
 * @see Js#object(Object)
 * @see js.core.JsObject#JsObject()
 * @see js.core.JsGlobal.Object#create()
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */

public interface ObjectLike
{
	/**
	 * <p>Deletes a property of the current object instance by its ID.</p>
	 * @param id The ID of the property to delete.
	 * @return <tt>true</tt> if the deletion is successful, <tt>false</tt> otherwise.
	 * @see #delete(String)
	 * @see #delete(js.Var.Member)
	 * @see #delete(js.Var.Mid)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>delete o.id</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>id</tt> 
	 * must be resolved to a property identifier at re-compile time.
	 */
	public boolean delete(Id<?> id);
	/**
	 * <p>Deletes a property of the current object instance by its member ID.</p>
	 * @param mid Member ID of the property to delete.
	 * @return <tt>true</tt> if the deletion is successful, <tt>false</tt> otherwise.
	 * @see #delete(Id)
	 * @see #delete(String)
	 * @see #delete(js.Var.Member)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>delete o.mid</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>mid</tt> 
	 * must be resolved to the property identifier at re-compile time.
	 */
	public boolean delete(Mid mid);
	/**
	 * <p>Deletes a property of the current object instance by its opaque member.</p>
	 * @param m The opaque member of the property to delete.
	 * @return <tt>true</tt> if the deletion is successful, <tt>false</tt> otherwise.
	 * @see #delete(Id)
	 * @see #delete(js.Var.Mid)
	 * @see #delete(String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>delete o.m</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>m</tt> 
	 * must be resolved to the property identifier at re-compile time.
	 */
	public boolean delete(Var.Member<?> m);
	/**
	 * <p>Deletes a property of the current object instance by its name.</p>
	 * @param name The name of the property to delete.
	 * @return <tt>true</tt> if the deletion is successful, <tt>false</tt> otherwise.
	 * @see #delete(Id)
	 * @see #delete(js.Var.Mid)
	 * @see #delete(js.Var.Member)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>delete o[name]</pre>
	 * where <tt>o</tt> is the current object instance of the invocation.
	 */
	public boolean delete(String name);
	/**
	 * <p>Gets a property of the current object instance by its ID.</p>
	 * @param id The ID of the property to get.
	 * @return The property of the current object instance specified by its index.
	 * @see #var(js.Var.Mid)
	 * @see #var(js.Var.Member)
	 * @see #var(String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.id</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>id</tt> 
	 * must be resolved to a property identifier at re-compile time.
	 */
	public <T> T var(Id<T> id);
	/**
	 * <p>Gets a property of the current object instance by its opaque member.</p>
	 * @param m The opaque member of the property to get.
	 * @return The property of the current object instance specified by its opaque member.
	 * @see #var(Id)
	 * @see #var(js.Var.Mid)
	 * @see #var(String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.m</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>m</tt> 
	 * must be resolved to the property identifier at re-compile time.
	 */
	public <T> T var(Var.Member<T> m);
	/**
	 * <p>Gets a property of the current object instance by its name.</p>
	 * @param name The name of the property to get.
	 * @return The property of the current object instance specified by its name.
	 * @see #var(Id)
	 * @see #var(js.Var.Mid)
	 * @see #var(js.Var.Member)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o[name]</pre>
	 * where <tt>o</tt> is the current object instance of the invocation.
	 */
	public Object var(String name);
	/**
	 * <p>Gets a property of the current object instance by its member ID.</p>
	 * @param mid The member ID of the property to get
	 * @return The property of the current object instance specified by its member ID.
	 * @see #var(Id)
	 * @see #var(js.Var.Member)
	 * @see #var(String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.mid</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>mid</tt> 
	 * must be resolved to the property identifier at re-compile time.
	 */
	public Object var(Var.Mid mid);
	/**
	 * <p>Sets a value to the property of the current object instance by its ID.</p>
	 * @param id The ID of the property to set the <tt>value</tt>.
	 * @return The property of the current object instance specified by its index.
	 * @param value The new value to be set.
	 * @see #var(js.Var.Mid, Object)
	 * @see #var(js.Var.Member, Object)
	 * @see #var(String, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.id = value</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>id</tt> 
	 * must be resolved to a property identifier at re-compile time.
	 */
	public <T> T var(Id<T> id, T value);
	/**
	 * <p>Sets a value to the property of the current object instance by its opaque member.</p>
	 * @param m The opaque member of the property to set the <tt>value</tt>.
	 * @param value The new value to be set.
	 * @return The property of the current object instance specified by its opaque member.
	 * @see #var(Id, Object)
	 * @see #var(js.Var.Mid, Object)
	 * @see #var(String, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.m = value</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>m</tt> 
	 * must be resolved to the property identifier at re-compile time.
	 */
	public <T> T var(Var.Member<T> m, T value);
	/**
	 * <p>Sets a value to the property of the current object instance by its name.</p>
	 * @param name The name of the property to set the <tt>value</tt>.
	 * @param value The new value to be set.
	 * @return The property of the current object instance specified by its name.
	 * @see #var(Id, Object)
	 * @see #var(js.Var.Mid, Object)
	 * @see #var(js.Var.Member, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o[name] = value</pre>
	 * where <tt>o</tt> is the current object instance of the invocation.
	 */
	public <T> T var(String name, T value);
	/**
	 * <p>Sets a value to the property of the current object instance by its member ID.</p>
	 * @param mid The member ID of the property to set the <tt>value</tt>.
	 * @param value The new value to be set.
	 * @return The property of the current object instance specified by its member ID.
	 * @see #var(Id, Object)
	 * @see #var(js.Var.Member, Object)
	 * @see #var(String, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.mid = value</pre>
	 * where <tt>o</tt> is the current object instance of the invocation and <tt>mid</tt> 
	 * must be resolved to the property identifier at re-compile time.
	 */
	public <T> T var(Var.Mid mid, T value);
	/**
	 * <p>Checks whether the current object instance has a locally defined (non-inherited) 
	 * property with a specified name.</p>
	 * <p>JavaScript objects may have properties of their own, and they may also inherit 
	 * properties from their prototype object. This method provides a way to distinguish 
	 * between inherited properties and non-inherited local properties</p>
	 * @param propname A string that contains the name of a property of the current 
	 * object instance.
	 * @return <tt>true</tt> if the current object instance has a non-inherited 
	 * property with the name specified by <tt>propname</tt>; <tt>false</tt> if 
	 * the object does not have a property with the specified name or if it inherits that 
	 * property from its prototype object.
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Boolean hasOwnProperty(Object propname);
	/**
	 * <p>Checks whether the current object instance is the prototype object of a 
	 * specified object.</p>
	 * <p>This method provides a way to determine if one Object object is the prototype 
	 * of another</p>
	 * <p>In JavaScript, Object objects inherit properties from their prototype object. 
	 * The prototype of an Object object is referred to by the prototype property of the 
	 * constructor function that creates and initializes the object.</p>
	 * <p>Not that, in JS Embed Simulation mode, this method always returns <tt>false</tt> 
	 * on a simulated object instance of {@link ObjectLike}, unless the instance is 
	 * converted to a JavaScript object by {@link ObjectLike#var()}.</p>
	 * @param other Any object.
	 * @return <tt>true</tt> if the current object instance is the prototype of 
	 * <tt>other</tt>; <tt>false</tt> if <tt>other</tt> is not an Object 
	 * object or if the current object instance is not the prototype of <tt>other</tt>.
	 * @see js.core.JsObject.Members#constructor
	 * @see js.core.JsFunction.Members#prototype
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Boolean isPrototypeOf(Object other);
	/**
	 * <p>Checks whether a named property exists and would be enumerable in JavaScript.</p>
	 * @param propname A string that contains the name of a property of the current 
	 * object instance.
	 * @return <tt>true</tt> if the current object instance has a non-inherited 
	 * property with the name specified by <tt>propname</tt> and if that property is 
	 * enumerable, which means that it would be enumerated by a for/in loop on the current 
	 * object instance in JavaScript.
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Boolean propertyIsEnumerable(Object propname);
	/**
	 * <p>Converts the current object instance to a string.</p>
	 * @return A string representing the current object instance.
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String toString();
	/**
	 * <p>Converts the current object instance to a string, localized as appropriate 
	 * for the current locale.</p>
	 * @return A string representing the current object instance, localized as 
	 * appropriate for the current locale.
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String toLocaleString();
	/**
	 * <p>Simply returns the object of the current instance.</p>
	 * <p>This method is useful for JS Simulation to implement opaque types.</p>
	 * <p>If the current instance is a Java simulated object and the method runs in JS 
	 * Embed Simulation mode, the invocation creates and returns a JavaScript Object object 
	 * as a runtime copy of the current instance.</p>
	 * @return The object of the current instance.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the interface invocation of this method, that is, 
	 * replacing it with its current instance.
	 */
	public JsObject var();
}
