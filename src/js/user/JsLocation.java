
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
 * {@link JsClient#Location} class.</p>
 * {@link JsWindow#location} property of the {@link JsWindow} object refers to a 
 * {@link JsLocation} object that represents the web address (the "location") of the 
 * document currently displayed in that window. The {@link #href} property contains the 
 * complete URL of that document, and the other properties of the {@link JsLocation} 
 * object each describe a portion of that URL. These properties are much like the URL 
 * properties of the {@link JsHTMLLinkElement} object. When a {@link JsLocation} object 
 * is converted to a string, the value of the {@link #href} property is returned.</p>
 * <p>While the {@link JsHTMLLinkElement} object represents a hyperlink in a document, 
 * the {@link JsLocation} object represents the URL, or location, currently displayed 
 * by the browser. However, the {@link JsLocation} object does more than that: it also 
 * controls the location displayed by the browser. If you assign a string containing a 
 * URL to the {@link JsLocation} object or to its {@link #href} property, the web browser 
 * responds by loading the newly specified URL and displaying the document it refers to.</p>
 * <p>Instead of setting {@link #href} to replace the current URL with a completely new 
 * one, you can modify just a portion of the current URL by assigning strings to the 
 * other properties of the {@link JsLocation} object. This creates a new URL with one 
 * new portion, which the browser loads and displays. For example, if you set the {@link #hash} 
 * property of the {@link JsLocation} object, you can cause the browser to move to a 
 * named location within the current document. Similarly, if you set the {@link #search} 
 * property, you can cause the browser to reload the current URL with a new query string 
 * appended.</p>
 * <p>In addition to its URL properties, the {@link JsLocation} object also defines two 
 * methods. The {@link #reload()} method reloads the current document. The {@link #replace(Object)} 
 * method loads a new document without creating a new history entry for it; the new 
 * document replaces the current one in the browser's history list.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see JsHTMLLinkElement
 * @see JsHTMLDocument#URL
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsLocation extends JsClient.Location.Prototype
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
	protected static abstract class Members extends JsClient.Location.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsLocation#hash
		 * @see JsLocation.Member#hash
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid hash     = id("hash"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsLocation#host
		 * @see JsLocation.Member#host
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid host     = id("host"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsLocation#hostName
		 * @see JsLocation.Member#hostName
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid hostName = id("hostName");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsLocation#href
		 * @see JsLocation.Member#href
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid href     = id("href"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsLocation#pathname
		 * @see JsLocation.Member#pathname
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid pathname = id("pathname");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsLocation#port
		 * @see JsLocation.Member#port
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid port     = id("port"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsLocation#protocol
		 * @see JsLocation.Member#protocol
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid protocol = id("protocol");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsLocation#search
		 * @see JsLocation.Member#search
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid search   = id("search"  );
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
	public static class Member extends JsClient.Location.Prototype.Member
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
		public JsLocation with(ObjectLike o) {
			return new JsLocation(super.with(o));
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
		public JsLocation with() {
			return with(Js.win());
		}
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsLocation} object 
		 * refers to a read/write string that specifies the anchor portion of the URL, 
		 * including the leading hash (#) mark. This portion of the document URL 
		 * specifies the name of an anchor within the document.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member hash     = new Value.String.Member(this, Members.hash    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsLocation} object 
		 * refers to a read/write string that specifies the hostname and port portions 
		 * of the URL.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member host     = new Value.String.Member(this, Members.host    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsLocation} object 
		 * refers to a read/write string that specifies the hostname portion of the URL.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member hostName = new Value.String.Member(this, Members.hostName);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsLocation} object 
		 * refers to a read/write string that specifies the complete text of the 
		 * document's URL, unlike other {@link JsLocation} properties that specify only 
		 * portions of the URL. Setting this property to a new URL causes the browser 
		 * to read and display the contents of the new URL.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member href     = new Value.String.Member(this, Members.href    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsLocation} object 
		 * refers to a read/write string that specifies .</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member pathname = new Value.String.Member(this, Members.pathname);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsLocation} object 
		 * refers to a read/write string that specifies the port portion of the URL.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member port     = new Value.String.Member(this, Members.port    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsLocation} object 
		 * refers to a read/write string that specifies the protocol portion of a URL, 
		 * including the trailing colon.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member protocol = new Value.String.Member(this, Members.protocol);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsLocation} object 
		 * refers to a read/write string that specifies the query portion of a URL, 
		 * including the leading question mark.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member search   = new Value.String.Member(this, Members.search  );
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsLocation(JsObject var) {
		super(var);
	}
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsLocation} object 
	 * refers to a read/write string that specifies the anchor portion of the URL, 
	 * including the leading hash (#) mark. This portion of the document URL 
	 * specifies the name of an anchor within the document.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member hash     = new Value.String.Member(Members.hash    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsLocation} object 
	 * refers to a read/write string that specifies the hostname and port portions 
	 * of the URL.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member host     = new Value.String.Member(Members.host    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsLocation} object 
	 * refers to a read/write string that specifies the hostname portion of the URL.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member hostName = new Value.String.Member(Members.hostName);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsLocation} object 
	 * refers to a read/write string that specifies the complete text of the 
	 * document's URL, unlike other {@link JsLocation} properties that specify only 
	 * portions of the URL. Setting this property to a new URL causes the browser 
	 * to read and display the contents of the new URL.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member href     = new Value.String.Member(Members.href    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsLocation} object 
	 * refers to a read/write string that specifies .</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member pathname = new Value.String.Member(Members.pathname);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsLocation} object 
	 * refers to a read/write string that specifies the port portion of the URL.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member port     = new Value.String.Member(Members.port    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsLocation} object 
	 * refers to a read/write string that specifies the protocol portion of a URL, 
	 * including the trailing colon.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member protocol = new Value.String.Member(Members.protocol);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsLocation} object 
	 * refers to a read/write string that specifies the query portion of a URL, 
	 * including the leading question mark.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member search   = new Value.String.Member(Members.search  );

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
	public JsLocation valueOf() {
		return new JsLocation((JsObject)var().valueOf());
	}

	/**
	 * <p>Reloads the current document from the cache or the server.</p>
	 * <p>This method of the {@link JsLocation} object reloads the document that is 
	 * currently displayed in the window of the {@link JsLocation} object. It uses the 
	 * <tt>If-Modified-Since</tt> HTTP header to determine whether the document has 
	 * changed on the web server. If the document has changed, the method reloads the 
	 * document from the server, and if not, it reloads the document from the cache. 
	 * This is the same action that occurs when the user clicks on the browser's 
	 * <tt>Reload</tt> button.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void reload() {
		call(reload);
	}
	/**
	 * <p>Reloads the current document from the cache or the server.</p>
	 * <p>This method of the {@link JsLocation} object reloads the document that is 
	 * currently displayed in the window of the {@link JsLocation} object. When called 
	 * with no arguments or with the argument <tt>false</tt>, it uses the <tt>If-Modified-Since</tt> 
	 * HTTP header to determine whether the document has changed on the web server. If 
	 * the document has changed, the method reloads the document from the server, and 
	 * if not, it reloads the document from the cache. This is the same action that 
	 * occurs when the user clicks on the browser's <tt>Reload</tt> button.</p>
	 * <p>When this method is called with the argument <tt>true</tt>, it always bypasses 
	 * the cache and reloads the document from the server, regardless of the last-modified 
	 * time of the document. This is the same action that occurs when the user <tt>Shift-clicks</tt> 
	 * on the browser's <tt>Reload</tt> button.</p>
	 * @param force An optional boolean argument that specifies whether the document 
	 * should be reloaded even if the server reports that it has not been modified since 
	 * it was last loaded. If this argument is <tt>false</tt> or undefined, the method 
	 * reloads the full page only if it has changed since last loaded.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void reload(Object force) {
		call(reload, force);
	}
	/**
	 * <p>Replaces the current document with a new one without generating a new entry in 
	 * the browser's session history.</p>
	 * <p>This method of the {@link JsLocation} object loads and displays a new document. 
	 * Loading a document in this way is different from simply setting {@link JsLocation#href} 
	 * in one important respect: this method does not generate a new entry in the 
	 * {@link JsHistory} object. When you use this method, the new URL overwrites the 
	 * current entry in the {@link JsHistory} object. After calling the method, the 
	 * browser's <tt>Back</tt> button does not return you to the previous URL; it 
	 * returns you to the URL before that one.</p>
	 * @param url A string that specifies the URL of the new document that is to replace 
	 * the current one. 
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void replace(Object url) {
		call(replace, url);
	}
}
