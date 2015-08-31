
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
 * {@link JsClient#HTMLAnchorElement} class.</p>
 * <p>This class represents an anchor element 
 * in an HTML page, or a {@link JsHTMLElement} object created with the HTML 
 * <tt>&lt;a&gt;</tt> tag.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsHTMLAnchorElement extends JsClient.HTMLAnchorElement.Prototype
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
	protected static abstract class Members extends JsClient.HTMLAnchorElement.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAnchorElement#accessKey
		 * @see JsHTMLAnchorElement.Member#accessKey
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid accessKey = id("accessKey");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAnchorElement#charset
		 * @see JsHTMLAnchorElement.Member#charset
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid charset   = id("charset" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAnchorElement#coords
		 * @see JsHTMLAnchorElement.Member#coords
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid coords    = id("coords"   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAnchorElement#href
		 * @see JsHTMLAnchorElement.Member#href
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid href      = id("href"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAnchorElement#hreflang
		 * @see JsHTMLAnchorElement.Member#hreflang
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid hreflang  = id("hreflang" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAnchorElement#name
		 * @see JsHTMLAnchorElement.Member#name
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid name      = id("name"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAnchorElement#rel
		 * @see JsHTMLAnchorElement.Member#rel
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid rel       = id("rel"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAnchorElement#rev
		 * @see JsHTMLAnchorElement.Member#rev
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid rev       = id("rev"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAnchorElement#shape
		 * @see JsHTMLAnchorElement.Member#shape
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid shape     = id("shape"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAnchorElement#tabIndex
		 * @see JsHTMLAnchorElement.Member#tabIndex
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid tabIndex  = id("tabIndex" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAnchorElement#target
		 * @see JsHTMLAnchorElement.Member#target
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid target    = id("target"   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLAnchorElement#type
		 * @see JsHTMLAnchorElement.Member#type
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid type     = id("type"     );
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
	public static class Member extends JsClient.HTMLAnchorElement.Prototype.Member
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
		public JsHTMLAnchorElement with(ObjectLike o) {
			return new JsHTMLAnchorElement(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<JsHTMLAnchorElement> valueOf = new JsFunction.Member<JsHTMLAnchorElement>(this, Members.valueOf);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
		 * object refers to a string specifying single character access key to the 
		 * element. An access key is a single character from the document character set. 
		 * Pressing an access key assigned to an element gives focus to the element. 
		 * The action that occurs when an element receives focus depends on the element.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member accessKey = new Value.String.Member(this, Members.accessKey);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
		 * object refers to a string specifying the character encoding of the linked 
		 * resource.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member charset  = new Value.String.Member(this, Members.charset   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
		 * object refers to a comma-separated list of lengths, defining an active region 
		 * geometry. The lengths specify the position and shape on the screen. The number 
		 * and order of values depends on the {@link #shape} being defined. Possible 
		 * combinations are: 
		 * <ul>
		 * <li><tt>left-x, top-y, right-x, bottom-y</tt> when {@link #shape} is <tt>"rect"</tt>.</li>
		 * <li><tt>center-x, center-y, radius</tt> when {@link #shape} is <tt>"circle"</tt>. When the 
		 * radius value is a percentage value, web browsers should calculate the final 
		 * radius value based on the associated object's width and height. The radius 
		 * should be the smaller value of the two.</li>
		 * <li><tt>x1, y1, x2, y2, ..., xN, yN</tt> when {@link #shape} is <tt>"poly"</tt>. The first x 
		 * and y coordinate pair and the last should be the same to close the polygon. 
		 * When these coordinate values are not the same, web browsers should infer an 
		 * additional coordinate pair to close the polygon.</li>
		 * </ul></p> 
		 * @since 1.0
		 * @see #shape
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member coords    = new Value.String.Member(this, Members.coords   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
		 * object refers to the absolute URI of the linked resource.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member href      = new Value.String.Member(this, Members.href     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
		 * object refers to the language code of the linked resource.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member hreflang  = new Value.String.Member(this, Members.hreflang );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
		 * object refers to the name of the current anchor, which may be the destination 
		 * of another link must be a unique through out the scope of the current document.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member name      = new Value.String.Member(this, Members.name     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
		 * object refers to the forward link type which describes the relationship from 
		 * the current document to the anchor specified by the {@link #href} property. 
		 * The value may be a space-separated list of link types.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member rel       = new Value.String.Member(this, Members.rel      );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
		 * object refers to the reverse link type which describes a reverse link from 
		 * the anchor specified by the {@link #href} property to the current document. 
		 * The value may be a space-separated list of link types.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member rev       = new Value.String.Member(this, Members.rev      );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
		 * object refers to a string naming the shape of the active area. The coordinates 
		 * are given by {@link #coords}. Possible values of the property are: 
		 * <ul>
		 * <li><tt>"default"</tt>: Specifies the entire region.</li>
		 * <li><tt>"rect"</tt>: Defines a rectangular region.</li>
		 * <li><tt>"circle"</tt>: Defines a circular region.</li>
		 * <li><tt>"poly"</tt>: Defines a polygonal region.</li>
		 * </ul></p>
		 * @since 1.0
		 * @see #coords
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member shape     = new Value.String.Member(this, Members.shape    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
		 * object refers to an index number representing the element's position in the 
		 * tabbing order.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member tabIndex  = new Value.Number.Member(this, Members.tabIndex );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
		 * object refers to string specifying the {@link JsHTMLFrameElement#name} of a 
		 * target frame to render the resource in.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member target    = new Value.String.Member(this, Members.target   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
		 * object refers to string specifying the advisory content type which gives an 
		 * advisory hint as to the content type of the content available at the link 
		 * target address. It allows web browsers to opt to use a fallback mechanism 
		 * rather than fetch the content if they are advised that they will get content 
		 * in a content type they do not support. Those who use this property take 
		 * responsibility to manage the risk that it may become inconsistent with the 
		 * content available at the link target address. Please consult <a href="ftp://ftp.isi.edu/in-notes/iana/assignments/media-types/">
		 * registered content types</a> for the current list of registered content types</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member type      = new Value.String.Member(this, Members.type     );
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsHTMLAnchorElement(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<JsHTMLAnchorElement> valueOf = new JsFunction.Member<JsHTMLAnchorElement>(Members.valueOf);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
	 * object refers to a string specifying single character access key to the 
	 * element. An access key is a single character from the document character set. 
	 * Pressing an access key assigned to an element gives focus to the element. 
	 * The action that occurs when an element receives focus depends on the element.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member accessKey = new Value.String.Member(Members.accessKey);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
	 * object refers to a string specifying the character encoding of the linked 
	 * resource.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member charset   = new Value.String.Member(Members.charset  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
	 * object refers to a comma-separated list of lengths, defining an active region 
	 * geometry. The lengths specify the position and shape on the screen. The number 
	 * and order of values depends on the {@link #shape} being defined. Possible 
	 * combinations are: 
	 * <ul>
	 * <li><tt>left-x, top-y, right-x, bottom-y</tt> when {@link #shape} is <tt>"rect"</tt>.</li>
	 * <li><tt>center-x, center-y, radius</tt> when {@link #shape} is <tt>"circle"</tt>. When the 
	 * radius value is a percentage value, web browsers should calculate the final 
	 * radius value based on the associated object's width and height. The radius 
	 * should be the smaller value of the two.</li>
	 * <li><tt>x1, y1, x2, y2, ..., xN, yN</tt> when {@link #shape} is <tt>"poly"</tt>. The first x 
	 * and y coordinate pair and the last should be the same to close the polygon. 
	 * When these coordinate values are not the same, web browsers should infer an 
	 * additional coordinate pair to close the polygon.</li>
	 * </ul></p> 
	 * @since 1.0
	 * @see #shape
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member coords    = new Value.String.Member(Members.coords   );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
	 * object refers to the absolute URI of the linked resource.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member href      = new Value.String.Member(Members.href     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
	 * object refers to the language code of the linked resource.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member hreflang  = new Value.String.Member(Members.hreflang );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
	 * object refers to the name of the current anchor, which may be the destination 
	 * of another link must be a unique through out the scope of the current document.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member name      = new Value.String.Member(Members.name     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
	 * object refers to a string naming the shape of the active area. The coordinates 
	 * are given by {@link #coords}. Possible values of the property are: 
	 * <ul>
	 * <li><tt>"default"</tt>: Specifies the entire region.</li>
	 * <li><tt>"rect"</tt>: Defines a rectangular region.</li>
	 * <li><tt>"circle"</tt>: Defines a circular region.</li>
	 * <li><tt>"poly"</tt>: Defines a polygonal region.</li>
	 * </ul></p>
	 * @since 1.0
	 * @see #coords
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member shape     = new Value.String.Member(Members.shape    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
	 * object refers to the forward link type which describes the relationship from 
	 * the current document to the anchor specified by the {@link #href} property. 
	 * The value may be a space-separated list of link types.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member rel       = new Value.String.Member(Members.rel      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
	 * object refers to the reverse link type which describes a reverse link from 
	 * the anchor specified by the {@link #href} property to the current document. 
	 * The value may be a space-separated list of link types.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member rev       = new Value.String.Member(Members.rev      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
	 * object refers to an index number representing the element's position in the 
	 * tabbing order.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member tabIndex  = new Value.Number.Member(Members.tabIndex );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
	 * object refers to string specifying the {@link JsHTMLFrameElement#name} of a 
	 * target frame to render the resource in.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member target    = new Value.String.Member(Members.target   );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLAnchorElement} 
	 * object refers to string specifying the advisory content type which gives an 
	 * advisory hint as to the content type of the content available at the link 
	 * target address. It allows web browsers to opt to use a fallback mechanism 
	 * rather than fetch the content if they are advised that they will get content 
	 * in a content type they do not support. Those who use this property take 
	 * responsibility to manage the risk that it may become inconsistent with the 
	 * content available at the link target address. Please consult <a href="ftp://ftp.isi.edu/in-notes/iana/assignments/media-types/">
	 * registered content types</a> for the current list of registered content types</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member type     = new Value.Boolean.Member(Members.type    );

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
	public JsHTMLAnchorElement valueOf() {
		return new JsHTMLAnchorElement((JsObject)var().valueOf());
	}
	/**
	 * <p>Removes keyboard focus from the current element.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void blur() {
		call(blur);
	}
	/**
	 * <p>Gives keyboard focus to the current element.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void focus() {
		call(focus);
	}
}
