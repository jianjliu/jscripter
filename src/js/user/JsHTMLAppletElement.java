
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
 * {@link JsClient#HTMLAppletElement} class.</p>
 * <p>This class represents an embedded Java applet 
 * in an HTML page, or a {@link JsHTMLElement} object created with the HTML 
 * <tt>&lt;applet&gt;</tt> tag that is deprecated in HTML 4.01.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see JsHTMLObjectElement
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsHTMLAppletElement extends JsClient.HTMLAppletElement.Prototype
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
	protected static abstract class Members extends JsClient.HTMLAppletElement.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAppletElement#align
		 * @see JsHTMLAppletElement.Member#align
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid align    = id("align"   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAppletElement#alt
		 * @see JsHTMLAppletElement.Member#alt
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid alt      = id("alt"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAppletElement#archive
		 * @see JsHTMLAppletElement.Member#archive
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid archive  = id("archive" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAppletElement#code
		 * @see JsHTMLAppletElement.Member#code
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid code     = id("code"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAppletElement#codeBase
		 * @see JsHTMLAppletElement.Member#codeBase
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid codeBase = id("codeBase");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAppletElement#height
		 * @see JsHTMLAppletElement.Member#height
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid height   = id("height"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAppletElement#hspace
		 * @see JsHTMLAppletElement.Member#hspace
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid hspace   = id("hspace"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAppletElement#name
		 * @see JsHTMLAppletElement.Member#name
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid name     = id("name"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAppletElement#object
		 * @see JsHTMLAppletElement.Member#object
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid object   = id("object"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAppletElement#vspace
		 * @see JsHTMLAppletElement.Member#vspace
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid vspace   = id("vspace"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAppletElement#width
		 * @see JsHTMLAppletElement.Member#width
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid width    = id("width"   );
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
	public static class Member extends JsClient.HTMLAppletElement.Prototype.Member
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
		public JsHTMLAppletElement with(ObjectLike o) {
			return new JsHTMLAppletElement(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAppletElement} 
		 * object refers to a string specifying the horizontal alignment of the element 
		 * with respect to the surrounding context. Possible values are:
		 * <ul>
		 * <li><tt>"left"</tt>: text lines are rendered flush left.</li>
		 * <li><tt>"center"</tt>: text lines are centered.</li>
		 * <li><tt>"right"</tt>: text lines are rendered flush right.</li>
		 * <li><tt>"justify"</tt>: text lines are justified to both margins.</li>
		 * </ul>
		 * The default value of this attribute depends on the base text direction. 
		 * For left to right text, the default is "left", while for right to left text, 
		 * it is "right".</p>
		 * <p>This attribute is deprecated by HTML 4.01 along with the <tt>&lt;applet&gt;</tt> tag.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member align    = new Value.String.Member(this, Members.align   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAppletElement} 
		 * object refers to a string specifying an alternate text for web browsers not 
		 * rendering the normal content of this element.</p>
		 * <p>This attribute is deprecated by HTML 4.01 along with the <tt>&lt;applet&gt;</tt> tag.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member alt      = new Value.String.Member(this, Members.alt     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAppletElement} 
		 * object refers to a string specifying a comma-separated list of URIs for archives 
		 * containing java classes and other resources that will be preloaded by the web 
		 * browser.</p>
		 * <p>This attribute is deprecated by HTML 4.01 along with the <tt>&lt;applet&gt;</tt> tag.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member archive  = new Value.String.Member(this, Members.archive );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAppletElement} 
		 * object refers to a string specifying either the name of the applet class or 
		 * the path to get the class. It is interpreted with respect to the applet's 
		 * <tt>codebase</tt> attribute or the {@link #codeBase} property of this object. 
		 * One of {@link #code} or {@link #object} must be present.</p>
		 * <p>This attribute is deprecated by HTML 4.01 along with the <tt>&lt;applet&gt;</tt> tag.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member code     = new Value.String.Member(this, Members.code    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAppletElement} 
		 * object refers to a string optionally specifying the base URI for the applet. 
		 * If this attribute is not specified, then it defaults the same base URI as 
		 * for the current document. Values for this attribute may only refer to 
		 * subdirectories of the directory containing the current document.</p>
		 * <p>This attribute is deprecated by HTML 4.01 along with the <tt>&lt;applet&gt;</tt> tag.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member codeBase = new Value.String.Member(this, Members.codeBase);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAppletElement} 
		 * object refers to a string specifying the initial height of the applet's display 
		 * area excluding any windows or dialogs that the applet creates.</p>
		 * <p>This attribute is deprecated by HTML 4.01 along with the <tt>&lt;applet&gt;</tt> tag.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member height   = new Value.String.Member(this, Members.height  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAppletElement} 
		 * object refers to a number specifying the amount of white space to be inserted 
		 * to the left and right of this object. The default value is not specified, but 
		 * is generally a small, non-zero length.</p>
		 * <p>This attribute is deprecated by HTML 4.01 along with the <tt>&lt;applet&gt;</tt> tag.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member hspace   = new Value.String.Member(this, Members.hspace  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAppletElement} 
		 * object refers to a string specifying a name for the applet instance, which 
		 * makes it possible for applets on the same page to find and/or communicate 
		 * with each other.</p>
		 * <p>This attribute is deprecated by HTML 4.01 along with the <tt>&lt;applet&gt;</tt> tag.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member name     = new Value.String.Member(this, Members.name    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAppletElement} 
		 * object refers to a string specifying a resource containing a serialized representation 
		 * of an applet's state. It is interpreted relative to the applet's <tt>codebase</tt> 
		 * attribute or the {@link #codeBase} property of this object. The serialized 
		 * data contains the applet's class name but not the implementation. The class 
		 * name is used to retrieve the implementation from a class file or archive.</p>
		 * <p>This attribute is deprecated by HTML 4.01 along with the <tt>&lt;applet&gt;</tt> tag.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member object   = new Value.String.Member(this, Members.object  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAppletElement} 
		 * object refers to a number specifying the amount of white space to be inserted 
		 * above and below this object. The default value is not specified, but is 
		 * generally a small, non-zero length.</p>
		 * <p>This attribute is deprecated by HTML 4.01 along with the <tt>&lt;applet&gt;</tt> tag.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member vspace   = new Value.String.Member(this, Members.vspace  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAppletElement} 
		 * object refers to a string specifying the initial width of the applet's display 
		 * area excluding any windows or dialogs that the applet creates.</p>
		 * <p>This attribute is deprecated by HTML 4.01 along with the <tt>&lt;applet&gt;</tt> tag.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member width    = new Value.String.Member(this, Members.width   );
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsHTMLAppletElement(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAppletElement} 
	 * object refers to a string specifying the horizontal alignment of the element 
	 * with respect to the surrounding context. Possible values are:
	 * <ul>
	 * <li><tt>"left"</tt>: text lines are rendered flush left.</li>
	 * <li><tt>"center"</tt>: text lines are centered.</li>
	 * <li><tt>"right"</tt>: text lines are rendered flush right.</li>
	 * <li><tt>"justify"</tt>: text lines are justified to both margins.</li>
	 * </ul>
	 * The default value of this attribute depends on the base text direction. 
	 * For left to right text, the default is "left", while for right to left text, 
	 * it is "right".</p>
	 * <p>This attribute is deprecated by HTML 4.01 along with the <tt>&lt;applet&gt;</tt> tag.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member align    = new Value.String.Member(Members.align   );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAppletElement} 
	 * object refers to a string specifying an alternate text for web browsers not 
	 * rendering the normal content of this element.</p>
	 * <p>This attribute is deprecated by HTML 4.01 along with the <tt>&lt;applet&gt;</tt> tag.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member alt      = new Value.String.Member(Members.alt     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAppletElement} 
	 * object refers to a string specifying a comma-separated list of URIs for archives 
	 * containing java classes and other resources that will be preloaded by the web 
	 * browser.</p>
	 * <p>This attribute is deprecated by HTML 4.01 along with the <tt>&lt;applet&gt;</tt> tag.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member archive  = new Value.String.Member(Members.archive );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAppletElement} 
	 * object refers to a string specifying either the name of the applet class or 
	 * the path to get the class. It is interpreted with respect to the applet's 
	 * <tt>codebase</tt> attribute or the {@link #codeBase} property of this object. 
	 * One of {@link #code} or {@link #object} must be present.</p>
	 * <p>This attribute is deprecated by HTML 4.01 along with the <tt>&lt;applet&gt;</tt> tag.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member code     = new Value.String.Member(Members.code    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAppletElement} 
	 * object refers to a string optionally specifying the base URI for the applet. 
	 * If this attribute is not specified, then it defaults the same base URI as 
	 * for the current document. Values for this attribute may only refer to 
	 * subdirectories of the directory containing the current document.</p>
	 * <p>This attribute is deprecated by HTML 4.01 along with the <tt>&lt;applet&gt;</tt> tag.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member codeBase = new Value.String.Member(Members.codeBase);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAppletElement} 
	 * object refers to a string specigying the initial height of the applet's display 
	 * area excluding any windows or dialogs that the applet creates.</p>
	 * <p>This attribute is deprecated by HTML 4.01 along with the <tt>&lt;applet&gt;</tt> tag.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member height   = new Value.String.Member(Members.height  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAppletElement} 
	 * object refers to a number specifying the amount of white space to be inserted 
	 * to the left and right of this object. The default value is not specified, but 
	 * is generally a small, non-zero length.</p>
	 * <p>This attribute is deprecated by HTML 4.01 along with the <tt>&lt;applet&gt;</tt> tag.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member hspace   = new Value.String.Member(Members.hspace  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAppletElement} 
	 * object refers to a string specifying a name for the applet instance, which 
	 * makes it possible for applets on the same page to find and/or communicate 
	 * with each other.</p>
	 * <p>This attribute is deprecated by HTML 4.01 along with the <tt>&lt;applet&gt;</tt> tag.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member name     = new Value.String.Member(Members.name    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAppletElement} 
	 * object refers to a string specifying a resource containing a serialized representation 
	 * of an applet's state. It is interpreted relative to the applet's <tt>codebase</tt> 
	 * attribute or the {@link #codeBase} property of this object. The serialized 
	 * data contains the applet's class name but not the implementation. The class 
	 * name is used to retrieve the implementation from a class file or archive.</p>
	 * <p>This attribute is deprecated by HTML 4.01 along with the <tt>&lt;applet&gt;</tt> tag.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member object   = new Value.String.Member(Members.object  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAppletElement} 
	 * object refers to a number specifying the amount of white space to be inserted 
	 * above and below this object. The default value is not specified, but is 
	 * generally a small, non-zero length.</p>
	 * <p>This attribute is deprecated by HTML 4.01 along with the <tt>&lt;applet&gt;</tt> tag.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member vspace   = new Value.String.Member(Members.vspace  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAppletElement} 
	 * object refers to a string specifying the initial width of the applet's display 
	 * area excluding any windows or dialogs that the applet creates.</p>
	 * <p>This attribute is deprecated by HTML 4.01 along with the <tt>&lt;applet&gt;</tt> tag.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member width    = new Value.String.Member(Members.width   );

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
	public JsHTMLAppletElement valueOf() {
		return new JsHTMLAppletElement((JsObject)var().valueOf());
	}
}
