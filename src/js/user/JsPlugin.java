
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

package js.user;

import js.*;
import js.core.*;

/**
 * <p>An <b>opaque</b> class representing JavaScript client-side objects of the global 
 * {@link JsClient#Plugin} class.</p>
 * <p>A plug-in is a software module that can be invoked by a browser to display 
 * specialized types of embedded data within the browser window. Plug-ins are 
 * represented by {@link JsPlugin} objects, and the {@link JsNavigator#plugins} property of 
 * {@link JsWindow#navigator} is an array of 
 * {@link JsPlugin} objects representing the installed plug-ins for the browser. IE does 
 * not support {@link JsPlugin}, and the array is always empty on that browser.</p>
 * <p>The {@link JsNavigator#plugins} array may be indexed numerically when you want to 
 * loop through the complete list of installed plug-ins, looking for one that meets your 
 * needs (for example, one that supports the MIME type of the data you want to embed in 
 * your web page). This array can also be indexed by plug-in name, however. That is, if 
 * you want to check whether a specific plug-in is installed in the user's browser. The 
 * name used as an array index with this technique is the same name that appears as the 
 * value of the {@link #name} property of the {@link JsPlugin} object.</p>
 * <p>A {@link JsPlugin} object is somewhat unusual in that it has both regular object 
 * properties and array elements. The properties of a {@link JsPlugin} object provide 
 * various pieces of information about the plug-in, and its array elements are {@link JsMimeType} 
 * objects that specify the embedded data formats that the plug-in supports. Don't 
 * confuse the fact that {@link JsPlugin} objects are stored in an array of the {@link JsNavigator} 
 * object with the fact that each {@link JsPlugin} object is itself an array of {@link JsMimeType} 
 * objects.</p>
 * <p>Finally, note that while the array elements of a {@link JsPlugin} object specify 
 * the MIME types supported by that plug-in, you can also determine which plug-in 
 * supports a given MIME type with the {@link JsMimeType#enabledPlugin} property of the 
 * {@link JsMimeType} object.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see JsMimeType
 * @see JsNavigator
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsPlugin extends JsClient.Plugin.Prototype implements ArrayObject<JsMimeType>
{
	/**
	 * <p>An <b>internal</b> class containing membership data for its enclosing
	 * opaque class.</p>
	 * <p>This class is only used inside of <b>opaque</b> or <b>internal</b> classes or
	 * class members.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript Re-compilers must report error on resolving an <b>internal</b> class.
	 */
	protected static abstract class Members extends JsClient.Plugin.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsPlugin#description
		 * @see JsPlugin.Member#description
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid description = id("description");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsPlugin#filename
		 * @see JsPlugin.Member#filename
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid filename    = id("filename"   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsPlugin#length
		 * @see JsPlugin.Member#length
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid length      = id("length"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsPlugin#name
		 * @see JsPlugin.Member#name
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid name        = id("name"       );
	}
	/**
	 * <p>An <b>opaque</b> class representing members of its enclosing <b>opaque</b> type.</p>
	 * <p>Note that, this class is <b>opaque</b> but its constructors are all <b>internal</b>. 
	 * This class and the subclasses of this class are used to declare either <b>opaque</b> 
	 * <tt>public</tt> instance fields of the opaque type {@link js.Var.Member} or the 
	 * <b>opaque</b> <tt>public</tt> static fields of other <b>opaque</b> types while their 
	 * constructors are used to define the fields inside <b>opaque</b> classes. Under 
	 * either circumstance, the field names must be exactly same as the member names, as 
	 * the <b>opaque</b> fields of <b>opaque</b> types are resolved by re-compilers directly 
	 * based on the field names.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be created
	 * in the target codes. Re-compilers must exit with error on operations accessing that kind 
	 * of class objects.
	 * Re-compilers must resolve an <b>opaque</b> instance field declared by this class in
	 * {@link js.Var.Member} or its subclasses to the JavaScript identifier: 
	 * <pre>q.m</pre>
	 * where <tt>m</tt> is the identifier of the field name and <tt>q</tt> is the identifier
	 * resolved from the instance of the enclosing member. Re-compilers must resolve an 
	 * <b>opaque</b> static field declared by this class in <b>opaque</b> types other than 
	 * {@link js.Var.Member} and its subclasses to the JavaScript identifier: 
	 * <pre>m</pre>
	 * where <tt>m</tt> is the identifier of the field name. And re-compilers must report
	 * error on the access to <b>opaque</b> fields declared by this class under any other 
	 * circumstances.
	 */
	public static class Member extends JsClient.Plugin.Prototype.Member
	{
		/**
		 * <p>Internally constructs a member based on a qualifying member.</p>
		 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b>
		 * or <b>internal</b> classes or class members.</p>
		 * <p>Note that, this constructor is <b>internal</b> but its declaring class is
		 * <b>opaque</b>. This constructor is used to define <b>opaque</b> instance fields 
		 * declared in the declaring class of this constructor itself or its subclasses. 
		 * Under this circumstance, the field names must be exactly same as the member 
		 * names, as the <b>opaque</b> instance fields of the <b>opaque</b> type 
		 * {@link js.Var.Member} or its subclasses are resolved by re-compilers directly
		 * to their names appending to the name resolved from the specified qualifying 
		 * member with a dot in between.</p>
		 * @param q A qualifying member
		 * @param mid The ID of the member to construct
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor.
		 */
		public Member(JsObject.Member q, Mid mid) {
			super(q, mid);
		}
		/**
		 * <p>Internally constructs a member without a qualifying member.</p>
		 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b>
		 * or <b>internal</b> classes or class members.</p>
		 * <p>Note that, this constructor is <b>internal</b> but its declaring class is
		 * <b>opaque</b>. This constructor is used to define <b>opaque</b> static fields, 
		 * declared in <b>opaque</b> types other than the declaring class of this constructor 
		 * itself and its subclasses. Under this circumstance, the field names must be
		 * exactly same as the member names, as the <b>opaque</b> static fields of <b>opaque</b>
		 * types are generally resolved by re-compilers directly to identifiers of their names.</p>
		 * @param mid The ID of the member to construct
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor.
		 */
		public Member(Mid mid) {
			super(mid);
		}
		@Override
		/**
		 * <p>Evaluates the property, represented by the current member instance, of the
		 * argument object.</p>
		 * @param o The argument object
		 * @return The value of the current member based on the object argument.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into
		 * the JavaScript expression: 
		 * <pre>o.m</pre>
		 * where <tt>m</tt> is the identifier name resolved from the current member
		 * instance of the invocation.
		 */
		public JsPlugin with(ObjectLike o) {
			return new JsPlugin(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsPlugin} object 
		 * refers to a read-only string that contains a human-readable description of 
		 * the specified plug-in. The text of this description is provided by the 
		 * creators of the plug-in and may contain vendor and version information as 
		 * well as a brief description of the plug-in's function.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member description = new Value.String.Member(this, Members.description);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsPlugin} object 
		 * refers to a read-only string that specifies the name of the file on disk that 
		 * contains the plug-in program itself. This name may vary from platform to 
		 * platform. The {@link #name} property is more useful than this property 
		 * for identifying a plug-in.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member filename    = new Value.String.Member(this, Members.filename   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsPlugin} object
		 * specifies the number of elements in the array as with all arrays, because 
		 * a {@link JsPlugin} object is also an array of {@link JsMimeType} objects 
		 * that specify the data formats supported by the plug-in.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member length      = new Value.Number.Member(this, Members.length     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsPlugin} object 
		 * refers to a read-only string that specifies the plug-in. Each plug-in should 
		 * have a name that uniquely identifies it. The name of a plug-in can be used 
		 * as an index into the {@link JsNavigator#plugins} array. You can use this fact 
		 * to determine easily whether a particular named plug-in is installed in the 
		 * current browser.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member name        = new Value.String.Member(this, Members.name       );
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsPlugin(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsPlugin} object 
	 * refers to a read-only string that contains a human-readable description of 
	 * the specified plug-in. The text of this description is provided by the 
	 * creators of the plug-in and may contain vendor and version information as 
	 * well as a brief description of the plug-in's function.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member description = new Value.String.Member(Members.description);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsPlugin} object 
	 * refers to a read-only string that specifies the name of the file on disk that 
	 * contains the plug-in program itself. This name may vary from platform to 
	 * platform. The {@link #name} property is more useful than this property 
	 * for identifying a plug-in.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member filename    = new Value.String.Member(Members.filename   );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsPlugin} object
	 * specifies the number of elements in the array as with all arrays, because 
	 * a {@link JsPlugin} object is also an array of {@link JsMimeType} objects 
	 * that specify the data formats supported by the plug-in.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member length      = new Value.Number.Member(Members.length     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsPlugin} object 
	 * refers to a read-only string that specifies the plug-in. Each plug-in should 
	 * have a name that uniquely identifies it. The name of a plug-in can be used 
	 * as an index into the {@link JsNavigator#plugins} array. You can use this fact 
	 * to determine easily whether a particular named plug-in is installed in the 
	 * current browser.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member name        = new Value.String.Member(Members.name       );

	@Override
	/**
	 * <p>Returns the primitive value associated with the current instance, if there is one.
	 * This invocation simply returns the instance itself for the current instance is an 
	 * object and there is no primitive value for it.</p>
	 * @return The current object itself.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public JsPlugin valueOf() {
		return new JsPlugin((JsObject)var().valueOf());
	}

	/**
	 * <p>Reads an element of the current array instance.</p>
	 * @param i Array index of the element
	 * @return value of the element
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>a[i]</pre>
	 * where <tt>a</tt> is the current array instance of the invocation.
	 */
	public JsMimeType get(int i) {
		return new JsMimeType((JsObject)new JsArray(this).get(i));
	}

	/**
	 * <p>Gets the size of the current array instance.</p>
	 * @return size of the array
	 * @see jsx.core.ArrayLikes#length(ArrayObject)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>a.length</pre>
	 * where <tt>a</tt> is the current array instance of the invocation.
	 */
	public int length() {
		return length.with(this).intValue();
	}
}
