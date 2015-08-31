
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
 * <p>An <b>opaque</b> interface representing LiveConnet Java objects of JavaScript.</p>
 * <p>This interface must be implemented in JS Simulation Libraries.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see Js#connect(Object)
 * @see Js#connect(String, String)
 * @see LiveClass
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 */

public interface LiveObject
{
	/**
	 * <p>Gets a instance field of the current LiveConnect Java object.</p>
	 * @param fld The name of the field to get.
	 * @return The value of the field.
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.fld</pre>
	 * where <tt>o</tt> is the current instance of the invocation of this method and 
	 * <tt>fld</tt> must be resolved to the property identifier at the re-compile time.
	 */
	public Object get(String fld);
	/**
	 * <p>Sets value to an instance field of the current LiveConnect Java object.</p>
	 * @param fld The name of the field to set value to.
	 * @param val The new value to be set to the field.
	 * @return The new value set to the field.
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>(o.fld = val)</pre> 
	 * where <tt>o</tt> is the current instance of the invocation of this method and 
	 * <tt>fld</tt> must be resolved to the property identifier at the re-compile time.
	 */
	public Object set(String fld, Object val);
	/**
	 * <p>Returns the string representation of the current LiveConnect Java object.</p>
	 * @return The string representation of the current LiveConnect Java object.
	 * @see #valueOf()
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String toString();
	/**
	 * <p>Returns the primitive value associated with the current instance, if there is one.</p>
	 * @return The current LiveConnect Java object itself.
	 * @see #toString()
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly 
	 * into a JavaScript invocation on its current array instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public Object valueOf();
	/**
	 * <p>Invokes an instance method of the current LiveConnect Java object.</p>
	 * @param met The name of the instance method to invoke.
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.met()</pre> 
	 * where <tt>o</tt> is the current instance of the invocation of this method and 
	 * <tt>met</tt> must be resolved to the method identifier at the re-compile time.
	 */
	public void run(String met);
	/**
	 * <p>Invokes an instance method of the current LiveConnect Java object with an argument.</p>
	 * @param met The name of the instance method to invoke.
	 * @param atype The type descriptor of the argument <tt>arg</tt>. This argument 
	 * is ignored by JS Re-compilers.
	 * @param arg The argument for the invocation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.met(arg)</pre> 
	 * where <tt>o</tt> is the current instance of the invocation of this method and 
	 * <tt>met</tt> must be resolved to the method identifier at the re-compile time.
	 */
	public void run(String met, String atype, Object arg);
	/**
	 * <p>Invokes an instance method of the current LiveConnect Java class with a variable 
	 * arguments list.</p>
	 * @param met The name of the instance method to invoke.
	 * @param atypes The type descriptors of the variable argument list <tt>args</tt>. This 
	 * argument is ignored by JS Re-compilers.
	 * @param args The variable argument list for the invocation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.met(args)</pre> 
	 * where <tt>o</tt> is the current instance of the invocation of this method and 
	 * <tt>met</tt> must be resolved to the method identifier at the re-compile time and 
	 * <tt>args</tt> must be expanded into comma-separated arguments at the re-compile 
	 * time .
	 */
	public void run(String met, Vars<String> atypes, Vars<?> args);
	/**
	 * <p>Calls an instance method of the current LiveConnect Java object.</p>
	 * @param met The name of the instance method to call.
	 * @return The return value of the invocation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.met()</pre> 
	 * where <tt>o</tt> is the current instance of the invocation of this method and 
	 * <tt>met</tt> must be resolved to the method identifier at the re-compile time.
	 */
	public Object call(String met);
	/**
	 * <p>Calls an instance method of the current LiveConnect Java object with an argument.</p>
	 * @param met The name of the instance method to call.
	 * @param atype The type descriptor of the argument <tt>arg</tt>. This argument is 
	 * ignored by JS Re-compilers.
	 * @param arg The argument for the invocation.
	 * @return The return value of the invocation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.met()</pre> 
	 * where <tt>o</tt> is the current instance of the invocation of this method and 
	 * <tt>met</tt> must be resolved to the method identifier at the re-compile time.
	 */
	public Object call(String met, String atype, Object arg);
	/**
	 * <p>Calls an instance method of the current LiveConnect Java object with a variable 
	 * arguments list.</p>
	 * @param met The name of the instance method to call.
	 * @param atypes The type descriptors of the variable argument list <tt>args</tt>.
	 * This argument is ignored by JS Re-compilers.
	 * @param args The variable argument list for the invocation.
	 * @return The return value of the invocation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.met(args)</pre> 
	 * where <tt>o</tt> is the current instance of the invocation of this method and 
	 * <tt>met</tt> must be resolved to the method identifier at the re-compile time and 
	 * <tt>args</tt> must be expanded into comma-separated arguments at the re-compile 
	 * time.
	 */
	public Object call(String met, Vars<String> atypes, Vars<?> args);
	/**
	 * <p>Gets the LiveConnect Java class of the current LiveConnect Java object.</p>
	 * @return The LiveConnect Java class of the current LiveConnect Java object.
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>o.getClass()</pre> 
	 * where <tt>o</tt> is the current instance of the invocation of this method.
	 */
	public LiveClass getJavaClass();
}
