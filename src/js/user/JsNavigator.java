
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
 * {@link JsClient#Navigator} class.</p>
 * <p>An object of this class contains properties that describe the web browser in use. 
 * You can use its properties to perform platform-specific customization. The name of 
 * this object obviously refers to the Netscape Navigator browser, but all browsers that 
 * implement JavaScript support this object as well. There is only a single instance of 
 * {@link JsWindow#navigator} 
 * property of any {@link JsWindow} object.</p>
 * <p>Historically, the {@link JsNavigator} object has been used for "client sniffing" 
 * to run different code depending on what browser was in use.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see JsMimeType
 * @see JsPlugin
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsNavigator extends JsClient.Navigator.Prototype
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
	protected static abstract class Members extends JsClient.Navigator.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNavigator#appCodeName
		 * @see JsNavigator.Member#appCodeName
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid appCodeName   = id("appCodeName"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNavigator#appName
		 * @see JsNavigator.Member#appName
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid appName       = id("appName"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNavigator#appVersion
		 * @see JsNavigator.Member#appVersion
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid appVersion    = id("appVersion"   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNavigator#cookieEnabled
		 * @see JsNavigator.Member#cookieEnabled
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid cookieEnabled = id("cookieEnabled");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNavigator#mimeTypes
		 * @see JsNavigator.Member#mimeTypes
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid mimeTypes     = id("mimeTypes"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNavigator#platform
		 * @see JsNavigator.Member#platform
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid platform      = id("platform"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNavigator#plugins
		 * @see JsNavigator.Member#plugins
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid plugins       = id("plugins"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsNavigator#userAgent
		 * @see JsNavigator.Member#userAgent
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid userAgent     = id("userAgent"    );
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
	public static class Member extends JsClient.Navigator.Prototype.Member
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
		public JsNavigator with(ObjectLike o) {
			return new JsNavigator(super.with(o));
		}
		/**
		 * <p>Evaluates a property, represented by the current member instance, of the
		 * JavaScript global object, that is, evaluates the member to a global identifier.</p>
		 * @return The value of the current member based on the JavaScript global object.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into
		 * the JavaScript expression: 
		 * <pre>m</pre>
		 * where <tt>m</tt> is the identifier name resolved from the current member
		 * instance of the invocation.
		 */
		public JsNavigator with() {
			return with(Js.win());
		}
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsNavigator} object 
		 * refers to a read-only string that specifies the code name of the browser. 
		 * In all browsers based on the Netscape code base (Netscape, Mozilla, Firefox), 
		 * this is "Mozilla". For compatibility, this property is "Mozilla" in Microsoft 
		 * browsers as well.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member appCodeName = new Value.String.Member(this, Members.appCodeName);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsNavigator} object 
		 * refers to a read-only string that specifies the name of the browser. For 
		 * Netscape-based browsers, the value of the property is "Netscape". In IE, 
		 * the value of the property is "Microsoft Internet Explorer". Other browsers 
		 * may identify themselves correctly or spoof another browser for compatibility.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member appName     = new Value.String.Member(this, Members.appName    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsNavigator} object 
		 * refers to a read-only string that specifies version and platform information 
		 * for the browser. The first part of this string is a version number. Pass the 
		 * string to {@link Js#parseInt(Object)} to obtain only the major version number 
		 * or to {@link Js#parseFloat(Object)} to obtain the major and minor version 
		 * numbers as a floating-point value. The remainder of the string value of the 
		 * property provides other details about the browser version, including the 
		 * operating system it is running on. Unfortunately, however, the format of this 
		 * information varies widely from browser to browser.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member appVersion  = new Value.String.Member(this, Members.appVersion );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsNavigator} object 
		 * refers to a read-only string that specifies the operating system and/or 
		 * hardware platform on which the browser is running. Although there is no 
		 * standard set of values for this property, some typical values are "Win32", 
		 * "MacPPC", and "Linux i586".</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member platform    = new Value.String.Member(this, Members.platform   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsNavigator} object 
		 * refers to an array of {@link JsPlugin} objects, each of which represents one 
		 * plug-in that is installed in the browser. A {@link JsPlugin} object provides 
		 * information about the plug-in, including a list of MIME types it supports. 
		 * The array is defined by IE but is always empty because IE does not support 
		 * the {@link JsPlugin}.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsPlugin.Member plugins     = new JsPlugin.Member(this, Members.plugins);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsNavigator} object 
		 * refers to a read-only string that specifies the value the browser uses for 
		 * the user-agent header in HTTP requests. Typically, this is the value of 
		 * {@link #appCodeName} followed by a slash and the value of {@link #appVersion}.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member userAgent   = new Value.String.Member(this, Members.userAgent  );

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsNavigator} object 
		 * refers to a read-only boolean value which is <tt>true</tt> if the browser 
		 * has cookies enabled and <tt>false</tt> if they are disabled.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member cookieEnabled = new Value.Boolean.Member(this, Members.cookieEnabled);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsNavigator} object 
		 * refers to an array of {@link JsMimeType} objects, each of which represents 
		 * one of the MIME types (e.g., "text/html" and "image/gif") supported by the 
		 * browser. This array may be indexed numerically or by the name of the MIME 
		 * type. The array is defined by IEr but is always empty because IE does not 
		 * support {@link JsMimeType}.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsArray.Member mimeTypes = new JsArray.Member(this, Members.mimeTypes);

	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsNavigator(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsNavigator} object 
	 * refers to a read-only string that specifies the code name of the browser. 
	 * In all browsers based on the Netscape code base (Netscape, Mozilla, Firefox), 
	 * this is "Mozilla". For compatibility, this property is "Mozilla" in Microsoft 
	 * browsers as well.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member appCodeName = new Value.String.Member(Members.appCodeName);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsNavigator} object 
	 * refers to a read-only string that specifies the name of the browser. For 
	 * Netscape-based browsers, the value of the property is "Netscape". In IE, 
	 * the value of the property is "Microsoft Internet Explorer". Other browsers 
	 * may identify themselves correctly or spoof another browser for compatibility.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member appName     = new Value.String.Member(Members.appName    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsNavigator} object 
	 * refers to a read-only string that specifies version and platform information 
	 * for the browser. The first part of this string is a version number. Pass the 
	 * string to {@link Js#parseInt(Object)} to obtain only the major version number 
	 * or to {@link Js#parseFloat(Object)} to obtain the major and minor version 
	 * numbers as a floating-point value. The remainder of the string value of the 
	 * property provides other details about the browser version, including the 
	 * operating system it is running on. Unfortunately, however, the format of this 
	 * information varies widely from browser to browser.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member appVersion  = new Value.String.Member(Members.appVersion );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsNavigator} object 
	 * refers to a read-only string that specifies the operating system and/or 
	 * hardware platform on which the browser is running. Although there is no 
	 * standard set of values for this property, some typical values are "Win32", 
	 * "MacPPC", and "Linux i586".</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member platform    = new Value.String.Member(Members.platform   );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsNavigator} object 
	 * refers to an array of {@link JsPlugin} objects, each of which represents one 
	 * plug-in that is installed in the browser. A {@link JsPlugin} object provides 
	 * information about the plug-in, including a list of MIME types it supports. 
	 * The array is defined by IE but is always empty because IE does not support 
	 * the {@link JsPlugin}.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsPlugin.Member plugins     = new JsPlugin.Member(Members.plugins);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsNavigator} object 
	 * refers to a read-only boolean value which is <tt>true</tt> if the browser 
	 * has cookies enabled and <tt>false</tt> if they are disabled.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member userAgent   = new Value.String.Member(Members.userAgent  );

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsNavigator} object 
	 * refers to a read-only boolean value which is <tt>true</tt> if the browser 
	 * has cookies enabled and <tt>false</tt> if they are disabled.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member cookieEnabled = new Value.Boolean.Member(Members.cookieEnabled);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsNavigator} object 
	 * refers to an array of {@link JsMimeType} objects, each of which represents 
	 * one of the MIME types (e.g., "text/html" and "image/gif") supported by the 
	 * browser. This array may be indexed numerically or by the name of the MIME 
	 * type. The array is defined by IEr but is always empty because IE does not 
	 * support {@link JsMimeType}.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsArray.Member mimeTypes = new JsArray.Member(Members.mimeTypes);

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
	public JsNavigator valueOf() {
		return new JsNavigator((JsObject)var().valueOf());
	}

	/**
	 * <p>Tests whether Java is supported and enabled in the current browser and can 
	 * therefore display applets.</p>
	 * @return <tt>true</tt> if Java is supported by and enabled on the current browser; 
	 * <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Boolean javaEnabled() {
		return call(javaEnabled);
	}
}
