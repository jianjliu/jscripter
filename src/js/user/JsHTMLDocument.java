
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
 * {@link JsClient#HTMLDocument} class.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsHTMLDocument extends JsClient.HTMLDocument.Prototype
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
	protected static abstract class Members extends JsClient.HTMLDocument.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLDocument#all
		 * @see JsHTMLDocument.Member#all
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid all          = id("all"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLDocument#anchors
		 * @see JsHTMLDocument.Member#anchors
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid anchors      = id("anchors"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLDocument#applets
		 * @see JsHTMLDocument.Member#applets
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid applets      = id("applets"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLDocument#body
		 * @see JsHTMLDocument.Member#body
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid body         = id("body"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLDocument#cookie
		 * @see JsHTMLDocument.Member#cookie
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid cookie       = id("cookie"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLDocument#domain
		 * @see JsHTMLDocument.Member#domain
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid domain       = id("domain"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLDocument#forms
		 * @see JsHTMLDocument.Member#forms
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid forms        = id("forms"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLDocument#images
		 * @see JsHTMLDocument.Member#images
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid images       = id("images"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLDocument#lastModified
		 * @see JsHTMLDocument.Member#lastModified
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid lastModified = id("lastModified");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLDocument#links
		 * @see JsHTMLDocument.Member#links
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid links        = id("links"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLDocument#referrer
		 * @see JsHTMLDocument.Member#referrer
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid referrer     = id("referrer"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLDocument#title
		 * @see JsHTMLDocument.Member#title
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid title        = id("title"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLDocument#URL
		 * @see JsHTMLDocument.Member#URL
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid URL          = id("URL"         );
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
	public static class Member extends JsClient.HTMLDocument.Prototype.Member
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
		public JsHTMLDocument with(ObjectLike o) {
			return new JsHTMLDocument(super.with(o));
		}
		@Override
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
		public JsHTMLDocument with() {
			return with(Js.win());
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
		 * refers to a string allowing cookies to be queried and set for the document.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member cookie       = new Value.String.Member(this, Members.cookie      );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
		 * refers to the domain name of the server from which the document was loaded, 
		 * or <tt>null</tt> if there is none. This property can also be used to ease the 
		 * same-origin security policy in specific circumstances.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member domain       = new Value.String.Member(this, Members.domain      );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
		 * refers to a read-only string specifying the date and time of the most recent 
		 * modification to the document. This value comes from the Last-Modified HTTP 
		 * header that is optionally sent by the web server.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member lastModified = new Value.String.Member(this, Members.lastModified);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
		 * refers to a read-only string specifying the URL of the document that linked 
		 * to this document, or <tt>null</tt> if this document was not accessed through 
		 * a hyper-link. This property allows the client-side access to the HTTP <tt>referer</tt> 
		 * header. Note the spelling difference, however: the HTTP header has three r's, 
		 * and the property has four r's.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member referrer     = new Value.String.Member(this, Members.referrer    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
		 * refers to the contents of the <tt>&lt;title&gt;</tt> tag for this document.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member title        = new Value.String.Member(this, Members.title       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
		 * refers to a read-only string specifying the URL of the document. This value 
		 * is often the same as the {@link JsLocation#href} property of the {@link JsWindow} 
		 * object that contains the document. When URL redirection occurs, however, this 
		 * property holds the actual URL of the document, and {@link JsLocation#href} 
		 * holds the URL that was requested.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member URL          = new Value.String.Member(this, Members.URL         );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
		 * refers to an array-like object that provides access to all {@link JsHTMLElement} 
		 * object in the document. The nonstandard property originated in IE4. Although 
		 * it has been superseded by methods such as {@link JsDocument#getElementById(String)} 
		 * and {@link JsDocument#getElementsByTagName(String)}, it is still used in 
		 * deployed JavaScript code.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsNodeList.Member<JsElement> all = new JsNodeList.Member<JsElement>(this, Members.all);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
		 * is a read-only reference to an array of all {@link JsHTMLAnchorElement} objects 
		 * in the document.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsHTMLCollection.Member<JsHTMLAnchorElement> anchors = new JsHTMLCollection.Member<JsHTMLAnchorElement>(this, Members.anchors);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
		 * is a read-only reference to an array of all {@link JsHTMLAppletElement} objects 
		 * in the document.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsHTMLCollection.Member<JsHTMLAppletElement> applets = new JsHTMLCollection.Member<JsHTMLAppletElement>(this, Members.applets     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
		 * refers to the {@link JsHTMLElement} that represents the <tt>&lt;body&gt;</tt> 
		 * tag of this document. For documents that define frame sets, this property 
		 * refers to the outermost <tt>&lt;frameset&gt;</tt> tag instead.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsHTMLElement.Member body = new JsHTMLElement.Member(this, Members.body);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
		 * is a read-only reference to an array of all {@link JsHTMLFormElement} objects 
		 * in the document.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsHTMLCollection.Member<JsHTMLFormElement> forms = new JsHTMLCollection.Member<JsHTMLFormElement>(this, Members.forms);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
		 * is a read-only reference to an array of all {@link JsHTMLImageElement} objects 
		 * in the document. For compatibility with the Level 0 DOM, images defined with 
		 * an <tt>&lt;object&gt;</tt> tag instead of the <tt>&lt;img&gt;</tt> tag are 
		 * not included in this collection.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsHTMLCollection.Member<JsHTMLImageElement> images = new JsHTMLCollection.Member<JsHTMLImageElement>(this, Members.images);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
		 * is a read-only reference to an array of all {@link JsHTMLLinkElement} objects 
		 * in the document.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsHTMLCollection.Member<JsHTMLLinkElement> links = new JsHTMLCollection.Member<JsHTMLLinkElement>(this, Members.links);
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsHTMLDocument(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
	 * refers to a string allowing cookies to be queried and set for the document.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member cookie       = new Value.String.Member(Members.cookie      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
	 * refers to the domain name of the server from which the document was loaded, 
	 * or <tt>null</tt> if there is none. This property can also be used to ease the 
	 * same-origin security policy in specific circumstances.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member domain       = new Value.String.Member(Members.domain      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
	 * refers to a read-only string specifying the date and time of the most recent 
	 * modification to the document. This value comes from the Last-Modified HTTP 
	 * header that is optionally sent by the web server.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member lastModified = new Value.String.Member(Members.lastModified);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
	 * refers to a read-only string specifying the URL of the document that linked 
	 * to this document, or <tt>null</tt> if this document was not accessed through 
	 * a hyper-link. This property allows the client-side access to the HTTP <tt>referer</tt> 
	 * header. Note the spelling difference, however: the HTTP header has three r's, 
	 * and the property has four r's.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member referrer     = new Value.String.Member(Members.referrer    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
	 * refers to the contents of the <tt>&lt;title&gt;</tt> tag for this document.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member title        = new Value.String.Member(Members.title       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
	 * refers to a read-only string specifying the URL of the document. This value 
	 * is often the same as the {@link JsLocation#href} property of the {@link JsWindow} 
	 * object that contains the document. When URL redirection occurs, however, this 
	 * property holds the actual URL of the document, and {@link JsLocation#href} 
	 * holds the URL that was requested.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member URL          = new Value.String.Member(Members.URL         );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
	 * refers to an array-like object that provides access to all {@link JsHTMLElement} 
	 * object in the document. The nonstandard property originated in IE4. Although 
	 * it has been superseded by methods such as {@link JsDocument#getElementById(String)} 
	 * and {@link JsDocument#getElementsByTagName(String)}, it is still used in 
	 * deployed JavaScript code.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsNodeList.Member<JsElement> all = new JsNodeList.Member<JsElement>(Members.all);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
	 * is a read-only reference to an array of all {@link JsHTMLAnchorElement} objects 
	 * in the document.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsHTMLCollection.Member<JsHTMLAnchorElement> anchors = new JsHTMLCollection.Member<JsHTMLAnchorElement>(Members.anchors);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
	 * is a read-only reference to an array of all {@link JsHTMLAppletElement} objects 
	 * in the document.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsHTMLCollection.Member<JsHTMLAppletElement> applets = new JsHTMLCollection.Member<JsHTMLAppletElement>(Members.applets     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
	 * refers to the {@link JsHTMLElement} that represents the <tt>&lt;body&gt;</tt> 
	 * tag of this document. For documents that define frame sets, this property 
	 * refers to the outermost <tt>&lt;frameset&gt;</tt> tag instead.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsHTMLElement.Member body = new JsHTMLElement.Member(Members.body);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
	 * is a read-only reference to an array of all {@link JsHTMLFormElement} objects 
	 * in the document.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsHTMLCollection.Member<JsHTMLFormElement> forms = new JsHTMLCollection.Member<JsHTMLFormElement>(Members.forms);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
	 * is a read-only reference to an array of all {@link JsHTMLImageElement} objects 
	 * in the document. For compatibility with the Level 0 DOM, images defined with 
	 * an <tt>&lt;object&gt;</tt> tag instead of the <tt>&lt;img&gt;</tt> tag are 
	 * not included in this collection.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsHTMLCollection.Member<JsHTMLImageElement> images = new JsHTMLCollection.Member<JsHTMLImageElement>(Members.images);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLDocument} object 
	 * is a read-only reference to an array of all {@link JsHTMLLinkElement} objects 
	 * in the document.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsHTMLCollection.Member<JsHTMLLinkElement> links = new JsHTMLCollection.Member<JsHTMLLinkElement>(Members.links);

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
	public JsHTMLDocument valueOf() {
		return new JsHTMLDocument((JsObject)var().valueOf());
	}
	public final JsHTMLCollection<?> var(JsHTMLCollection.Member<?> r) {
		return r.with(this);
	}

	/**
	 * <p>Closes a document stream opened with the {@link #open()} method, forcing any 
	 * buffered output to be displayed.</p>
	 * <p>This method closes a document stream that was opened with the {@link #open()} 
	 * method and forces any buffered output to be displayed. If you use the {@link #write(String)} 
	 * or {@link #writeln(String)} methods to dynamically output a document, you must 
	 * remember to call this method when it is done to ensure that all your document 
	 * content is displayed. Once you have called this method, you should not call {@link #write(String)} 
	 * or {@link #writeln(String)} again, as this implicitly calls {@link #open()} to 
	 * erase the current document and begin a new one.</p>
	 * @since 1.0
	 * @see #open()
	 * @see #write(String)
	 * @see #writeln(String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void close() {
		call(close);
	}
	/**
	 * <p>Returns an array of nodes of all elements in the document that have a 
	 * specified value for their <tt>name</tt> attribute.</p>
	 * @param name .
	 * @return The current object itself.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsNodeList<? extends JsHTMLElement> getElementsByName(String name) {
		return new JsNodeList<JsHTMLElement>(call(getElementsByName, name));
	}
	public final JsNodeList<? extends JsHTMLElement> getElementsByName(StringLike name) {
		return new JsNodeList<JsHTMLElement>(call(getElementsByName, name));
	}
	/**
	 * <p>Opens a stream to which new document contents may be written, erasing any 
	 * current document content.</p>
	 * <p>This method erases the current HTML document and begins a new one, which may 
	 * be written to with the {@link #write(String)} and {@link #writeln(String)} methods. 
	 * After calling this method to begin a new document and {@link #write(String)} or 
	 * {@link #writeln(String)} to specify document content, you must always remember to 
	 * call {@link #close()} to end the document and force its content to be displayed.</p>
	 * <p>This method should not be called by a script or event handler that is part of 
	 * the document being overwritten, because the script or handler will itself be 
	 * overwritten.</p>
	 * @since 1.0
	 * @see #close()
	 * @see #write(String)
	 * @see #writeln(String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void open() {
		call(open);
	}
	/**
	 * <p>Appends a string of HTML text to an open document.</p>
	 * <p>This method appends the specified HTML text to the document. According to the 
	 * DOM standard, this method takes a single string argument. According to common 
	 * practice, however, it may be passed any number of arguments. These arguments are 
	 * converted to strings and appended, in order, to the document.</p>
	 * <p>The method is normally used in one of two ways. First, it can be invoked on 
	 * the current document within a <tt>&lt;script&gt;</tt> tag or within a function 
	 * that is executed while the document is being parsed. In this case, this method 
	 * writes its HTML output as if that output appeared literally in the file at the 
	 * location of the code that invoked the method.</p>
	 * <p>Second, you can use this method to dynamically generate new documents in a 
	 * window, frame, or iframe other than the one in which the calling script is running. 
	 * If the target document is open, this method appends to that document. If the 
	 * document is not open, the method discards the existing document and opens a new 
	 * empty one to which it appends its arguments.</p>
	 * <p>Once a document is open, this method can append any amount of output to the 
	 * end of the document. When a new document has been completely generated by this 
	 * technique, the document must be closed by calling {@link #close()}. Note that 
	 * although the call to {@link #open()} is optional, the call to {@link #close()} is 
	 * never optional.</p>
	 * <p>The results of calling this method may not be immediately visible in the 
	 * target document. This is because a web browser may buffer up text to parse and 
	 * display in larger chunks. Calling {@link #close()} is the only way to explicitly 
	 * force all buffered output to be "flushed" and displayed.</p>
	 * @param text The HTML text to be appended to the document.
	 * @since 1.0
	 * @see #write(StringLike)
	 * @see #write(Vars)
	 * @see #writeln(String)
	 * @see #close()
	 * @see #open()
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void write(String text) {
		call(write, text);
	}
	/**
	 * <p>Appends a string of HTML text to an open document.</p>
	 * <p>This method appends the specified HTML text to the document. According to the 
	 * DOM standard, this method takes a single string argument. According to common 
	 * practice, however, it may be passed any number of arguments. These arguments are 
	 * converted to strings and appended, in order, to the document.</p>
	 * <p>The method is normally used in one of two ways. First, it can be invoked on 
	 * the current document within a <tt>&lt;script&gt;</tt> tag or within a function 
	 * that is executed while the document is being parsed. In this case, this method 
	 * writes its HTML output as if that output appeared literally in the file at the 
	 * location of the code that invoked the method.</p>
	 * <p>Second, you can use this method to dynamically generate new documents in a 
	 * window, frame, or iframe other than the one in which the calling script is running. 
	 * If the target document is open, this method appends to that document. If the 
	 * document is not open, the method discards the existing document and opens a new 
	 * empty one to which it appends its arguments.</p>
	 * <p>Once a document is open, this method can append any amount of output to the 
	 * end of the document. When a new document has been completely generated by this 
	 * technique, the document must be closed by calling {@link #close()}. Note that 
	 * although the call to {@link #open()} is optional, the call to {@link #close()} is 
	 * never optional.</p>
	 * <p>The results of calling this method may not be immediately visible in the 
	 * target document. This is because a web browser may buffer up text to parse and 
	 * display in larger chunks. Calling {@link #close()} is the only way to explicitly 
	 * force all buffered output to be "flushed" and displayed.</p>
	 * @param args The arguments to be converted to strings and appended, in order, 
	 * to the document.
	 * @since 1.0
	 * @see #write(String)
	 * @see #write(StringLike)
	 * @see #writeln(String)
	 * @see #close()
	 * @see #open()
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void write(Vars<String> args) {
		call(write, args);
	}
	/**
	 * <p>Appends a string of HTML text to an open document.</p>
	 * <p>This method appends the specified HTML text to the document. According to the 
	 * DOM standard, this method takes a single string argument. According to common 
	 * practice, however, it may be passed any number of arguments. These arguments are 
	 * converted to strings and appended, in order, to the document.</p>
	 * <p>The method is normally used in one of two ways. First, it can be invoked on 
	 * the current document within a <tt>&lt;script&gt;</tt> tag or within a function 
	 * that is executed while the document is being parsed. In this case, this method 
	 * writes its HTML output as if that output appeared literally in the file at the 
	 * location of the code that invoked the method.</p>
	 * <p>Second, you can use this method to dynamically generate new documents in a 
	 * window, frame, or iframe other than the one in which the calling script is running. 
	 * If the target document is open, this method appends to that document. If the 
	 * document is not open, the method discards the existing document and opens a new 
	 * empty one to which it appends its arguments.</p>
	 * <p>Once a document is open, this method can append any amount of output to the 
	 * end of the document. When a new document has been completely generated by this 
	 * technique, the document must be closed by calling {@link #close()}. Note that 
	 * although the call to {@link #open()} is optional, the call to {@link #close()} is 
	 * never optional.</p>
	 * <p>The results of calling this method may not be immediately visible in the 
	 * target document. This is because a web browser may buffer up text to parse and 
	 * display in larger chunks. Calling {@link #close()} is the only way to explicitly 
	 * force all buffered output to be "flushed" and displayed.</p>
	 * @param text The HTML text to be appended to the document.
	 * @since 1.0
	 * @see #write(String)
	 * @see #write(Vars)
	 * @see #writeln(StringLike)
	 * @see #close()
	 * @see #open()
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void write(StringLike text) {
		write(Js.valueOf(text));
	}
	/**
	 * <p>Appends a string of HTML text followed by a newline character to an open document.</p>
	 * <p>This method is like {@link #write(String)}, except that it follows the 
	 * appended text with a newline character, which may be useful when writing the 
	 * content of a <tt>&lt;pre&gt;</tt> tag, for example.</p>
	 * @param text The HTML text to be appended to the document.
	 * @since 1.0
	 * @see #writeln(StringLike)
	 * @see #write(String)
	 * @see #close()
	 * @see #open()
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void writeln(String text) {
		call(writeln, text);
	}
	/**
	 * <p>Appends a string of HTML text followed by a newline character to an open document.</p>
	 * <p>This method is like {@link #write(StringLike)}, except that it follows the 
	 * appended text with a newline character, which may be useful when writing the 
	 * content of a <tt>&lt;pre&gt;</tt> tag, for example.</p>
	 * @param text The HTML text to be appended to the document.
	 * @since 1.0
	 * @see #writeln(String)
	 * @see #write(StringLike)
	 * @see #close()
	 * @see #open()
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void writeln(StringLike text) {
		writeln(Js.valueOf(text));
	}
}
