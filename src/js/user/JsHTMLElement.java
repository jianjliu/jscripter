
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
 * {@link JsClient#HTMLElement} class.</p>
 * <p>Each tag in an HTML document is represented by a {@link JsHTMLElement} object. 
 * This class defines properties that represent the attributes shared by all HTML elements.</p>
 * <p>following HTML tags do not have any properties other than those defined and fully 
 * described by {@link JsHTMLElement}: <tt>&lt;abbr&gt;</tt>, <tt>&lt;acronym&gt;</tt>, 
 * <tt>&lt;address&gt;</tt>, <tt>&lt;b&gt;</tt>, <tt>&lt;bdo&gt;</tt>, <tt>&lt;big&gt;</tt>, 
 * <tt>&lt;center&gt;</tt>, <tt>&lt;cite&gt;</tt>, <tt>&lt;code&gt;</tt>, <tt>&lt;dd&gt;</tt>, 
 * <tt>&lt;dfn&gt;</tt>, <tt>&lt;dt&gt;</tt>, <tt>&lt;em&gt;</tt>, <tt>&lt;i&gt;</tt>, 
 * <tt>&lt;kbd&gt;</tt>, <tt>&lt;noframes&gt;</tt>, <tt>&lt;noscript&gt;</tt>, <tt>&lt;s&gt;</tt>, 
 * <tt>&lt;samp&gt;</tt>, <tt>&lt;small&gt;</tt>, <tt>&lt;span&gt;</tt>, <tt>&lt;strike&gt;</tt>, 
 * <tt>&lt;strong&gt;</tt>, <tt>&lt;sub&gt;</tt>, <tt>&lt;sup&gt;</tt>, <tt>&lt;tt&gt;</tt>, 
 * <tt>&lt;u&gt;</tt>, <tt>&lt;var&gt;</tt>.</p>
 * <p>Most HTML tags define properties other than those explicitly defined in this class. 
 * The DOM Level 2 HTML specification defines tag-specific interfaces for these tags, 
 * so that all standard HTML attributes have a corresponding standard JavaScript property. 
 * Typically, a tag named <i>Tag</i> has a tag-specific <b>opaque</b> class named 
 * JsHTML<i>Tag</i>Element. In a few cases, two or more related tags share a single class, 
 * as in the case of the <tt>&lt;h1&gt;</tt> through <tt>&lt;h6&gt;</tt> tags, which are 
 * all represented by the {@link JsHTMLHeadingElement} class.</p>
 * <p>Most of these tag-specific classes do nothing more than define a JavaScript property 
 * for each attribute of the HTML tag. The JavaScript properties have the same names as 
 * the attributes and use lower-case or, when the attribute name consists of multiple 
 * words, mixed case. When an HTML attribute name is a reserved word in Java or JavaScript, 
 * the property name is changed slightly.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsHTMLElement extends JsClient.HTMLElement.Prototype
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
	protected static abstract class Members extends JsClient.HTMLElement.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#className
		 * @see JsHTMLElement.Member#className
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid className    = id("className"   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#currentStyle
		 * @see JsHTMLElement.Member#currentStyle
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid currentStyle = id("currentStyle");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#dir
		 * @see JsHTMLElement.Member#dir
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid dir          = id("dir"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#id
		 * @see JsHTMLElement.Member#id
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid id           = id("id"          );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#innerHTML
		 * @see JsHTMLElement.Member#innerHTML
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid innerHTML    = id("innerHTML"   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#lang
		 * @see JsHTMLElement.Member#lang
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid lang         = id("lang"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#clientHeight
		 * @see JsHTMLElement.Member#clientHeight
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid clientHeight = id("clientHeight");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#clientWidth
		 * @see JsHTMLElement.Member#clientWidth
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid clientWidth  = id("clientWidth" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#offsetHeight
		 * @see JsHTMLElement.Member#offsetHeight
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid offsetHeight = id("offsetHeight");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#offsetWidth
		 * @see JsHTMLElement.Member#offsetWidth
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid offsetWidth  = id("offsetWidth" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#offsetLeft
		 * @see JsHTMLElement.Member#offsetLeft
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid offsetLeft   = id("offsetLeft"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#offsetTop
		 * @see JsHTMLElement.Member#offsetTop
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid offsetTop    = id("offsetTop"   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#offsetParent
		 * @see JsHTMLElement.Member#offsetParent
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid offsetParent = id("offsetParent");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#scrollHeight
		 * @see JsHTMLElement.Member#scrollHeight
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid scrollHeight = id("scrollHeight");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#scrollWidth
		 * @see JsHTMLElement.Member#scrollWidth
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid scrollWidth  = id("scrollWidth" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#scrollLeft
		 * @see JsHTMLElement.Member#scrollLeft
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid scrollLeft   = id("scrollLeft"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#scrollTop
		 * @see JsHTMLElement.Member#scrollTop
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid scrollTop    = id("scrollTop"   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#style
		 * @see JsHTMLElement.Member#style
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid style        = id("style"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#title
		 * @see JsHTMLElement.Member#title
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid title        = id("title"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#onclick
		 * @see JsHTMLElement.Member#onclick
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onclick      = id("onclick"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#ondblclick
		 * @see JsHTMLElement.Member#ondblclick
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid ondblclick   = id("ondblclick"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#onkeydown
		 * @see JsHTMLElement.Member#onkeydown
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onkeydown    = id("onkeydown"   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#onkeypress
		 * @see JsHTMLElement.Member#onkeypress
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onkeypress   = id("onkeypress"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#onkeyup
		 * @see JsHTMLElement.Member#onkeyup
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onkeyup      = id("onkeyup"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#onmousedown
		 * @see JsHTMLElement.Member#onmousedown
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onmousedown  = id("onmousedown" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#onmousemove
		 * @see JsHTMLElement.Member#onmousemove
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onmousemove  = id("onmousemove" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#onmouseout
		 * @see JsHTMLElement.Member#onmouseout
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onmouseout   = id("onmouseout"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#onmouseover
		 * @see JsHTMLElement.Member#onmouseover
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onmouseover  = id("onmouseover" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLElement#onmouseup
		 * @see JsHTMLElement.Member#onmouseup
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onmouseup    = id("onmouseup"   );
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
	public static class Member extends JsClient.HTMLElement.Prototype.Member
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
		public JsHTMLElement with(ObjectLike o) {
			return new JsHTMLElement(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
		 * refers to the value of the <tt>class</tt> attribute of the element, which 
		 * specifies zero or more space-separated CSS class names. Note that this property 
		 * is not named "class" because that name is a reserved word in Java and JavaScript.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member className = new Value.String.Member(this, Members.className);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
		 * refers to the value of the <tt>dir</tt> attribute of the element, which 
		 * specifies the text direction for the document.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member dir       = new Value.String.Member(this, Members.dir      );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
		 * refers to the value of the <tt>id</tt> attribute. No two elements within the 
		 * same document should have the same value for <tt>id</tt>.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member id        = new Value.String.Member(this, Members.id       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
		 * refers to a read/write string that specifies the HTML text that is contained 
		 * within the element, not including the opening and closing tags of the element 
		 * itself. Querying this property returns the content of the element as a string 
		 * of HTML text. Setting this property to a string of HTML text replaces the 
		 * content of the element with the parsed representation of the HTML. You cannot 
		 * set this property while the document is loading (see {@link JsHTMLDocument#write(String)} 
		 * for this ability). This is a nonstandard property that originated in IE 4. 
		 * It has been implemented by all modern browsers.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member innerHTML = new Value.String.Member(this, Members.innerHTML);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
		 * refers to the value of the <tt>lang</tt> attribute, which specifies the 
		 * language code for the element's content.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member lang      = new Value.String.Member(this, Members.lang     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member clientHeight = new Value.Number.Member(this, Members.clientHeight);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member clientWidth  = new Value.Number.Member(this, Members.clientWidth );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
		 * refers to the height, in pixels, of the element and all its content, including 
		 * the element's CSS padding and border, but not its margin. This is a nonstandard 
		 * but well-supported property.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Integer.Member offsetHeight = new Value.Integer.Member(this, Members.offsetHeight);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
		 * refers to the width, in pixels, of the element and all its content, including 
		 * the element's CSS padding and border, but not its margin. This is a nonstandard 
		 * but well-supported property.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member offsetWidth  = new Value.Number.Member(this, Members.offsetWidth );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
		 * refers to The X coordinate of the upper-left corner of the CSS border of the 
		 * element relative to the {@link #offsetParent} container element. This is a 
		 * nonstandard but well-supported property.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member offsetLeft   = new Value.Number.Member(this, Members.offsetLeft  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
		 * refers to The Y coordinate of the upper-left corner of the CSS border of the 
		 * element relative to the {@link #offsetParent} container element. This is a 
		 * nonstandard but well-supported property.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member offsetTop    = new Value.Number.Member(this, Members.offsetTop   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
		 * refers to the overall height, in pixels, of an element. When an element has 
		 * scrollbars (because of the CSS <tt>overflow</tt> attribute, for example) the 
		 * property differs from {@link #offsetHeight}, which simply reports the height 
		 * of the visible portion of the element. This is non-standard but well-supported 
		 * property.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member scrollHeight = new Value.Number.Member(this, Members.scrollHeight);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
		 * refers to the overall width, in pixels, of an element. When an element has 
		 * scrollbars (because of the CSS <tt>overflow</tt> attribute, for example) the 
		 * property differs from {@link #offsetWidth}, which simply reports the width 
		 * of the visible portion of the element. This is non-standard but well-supported 
		 * property.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member scrollWidth  = new Value.Number.Member(this, Members.scrollWidth );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
		 * refers to the number of pixels that have scrolled off the left edge of the 
		 * element. The property is useful only for elements with scrollbars, such as 
		 * elements with the CSS <tt>overflow</tt> attribute set to <tt>auto</tt>. This 
		 * property is also defined on the <tt>&lt;body&gt;</tt> or <tt>&lt;html&gt;</tt> 
		 * tag of the document (this is browser-dependent) and specifies the amount of 
		 * scrolling for the document as a whole. Note that this property does not 
		 * specify the amount of scrolling in an <tt>&lt;iframe&gt;</tt> tag. This is a 
		 * non-standard but well-supported property.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member scrollLeft   = new Value.Number.Member(this, Members.scrollLeft  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
		 * refers to the number of pixels that have scrolled off the top edge of the 
		 * element. The property is useful only for elements with scrollbars, such as 
		 * elements with the CSS <tt>overflow</tt> attribute set to <tt>auto</tt>. This 
		 * property is also defined on the <tt>&lt;body&gt;</tt> or <tt>&lt;html&gt;</tt> 
		 * tag of the document (this is browser-dependent) and specifies the amount of 
		 * scrolling for the document as a whole. Note that this property does not 
		 * specify the amount of scrolling in an <tt>&lt;iframe&gt;</tt> tag. This is a 
		 * non-standard but well-supported property.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member scrollTop    = new Value.Number.Member(this, Members.scrollTop   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
		 * refers to the value of the <tt>title</tt> attribute of the element. Many 
		 * browsers display the value of this attribute in a tool tip when the mouse 
		 * hovers over the element.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member title = new Value.String.Member(this, Members.title);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
		 * refers a {@link JsCSS2Properties} object representing the cascaded set of all 
		 * CSS properties that apply to the element. It is an IE-only alternative to 
		 * {@link JsWindow#getComputedStyle}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsCSS2Properties.Member currentStyle = new JsCSS2Properties.Member(this, Members.currentStyle);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
		 * refers to the value of the <tt>style</tt> attribute that specifies inline CSS 
		 * styles for this element. Note that the value of this property is not a string.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsCSS2Properties.Member style        = new JsCSS2Properties.Member(this, Members.style       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
		 * refers a node object specifying the container element that defines the coordinate 
		 * system in which {@link #offsetLeft} and {@link #offsetTop} are measured. For most 
		 * elements, {@link #offsetParent} is the {@link JsHTMLDocument} object that contains 
		 * them. However, if an element has a dynamically positioned container, the dynamically 
		 * positioned element is the {@link #offsetParent}. In some browsers, table cells 
		 * are positioned relative to the row in which they are contained, rather than 
		 * relative to the containing document. This is a nonstandard but well-supported 
		 * property.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsElement.Member offsetParent = new JsElement.Member(this, Members.offsetParent);

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object is a 
		 * reference to an event handler function invoked when the user clicks on the element.</p> 
		 * @since 1.0
		 * @see JsElement#addEventListener(String, JsFunction, Boolean)
		 * @see JsElement#attachEvent(String, JsFunction)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onclick      = new JsFunction.Member<Object>(this, Members.onclick    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object is a 
		 * reference to an event handler function invoked when the user double-clicks on the 
		 * element.</p> 
		 * @since 1.0
		 * @see JsElement#addEventListener(String, JsFunction, Boolean)
		 * @see JsElement#attachEvent(String, JsFunction)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> ondblclick   = new JsFunction.Member<Object>(this, Members.ondblclick );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object is a 
		 * reference to an event handler function invoked when the user presses a key.</p> 
		 * @since 1.0
		 * @see JsElement#addEventListener(String, JsFunction, Boolean)
		 * @see JsElement#attachEvent(String, JsFunction)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onkeydown    = new JsFunction.Member<Object>(this, Members.onkeydown  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object is a 
		 * reference to an event handler function invoked when the user presses and releases a key.</p> 
		 * @since 1.0
		 * @see JsElement#addEventListener(String, JsFunction, Boolean)
		 * @see JsElement#attachEvent(String, JsFunction)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onkeypress   = new JsFunction.Member<Object>(this, Members.onkeypress );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object is a 
		 * reference to an event handler function invoked when the user releases a key.</p> 
		 * @since 1.0
		 * @see JsElement#addEventListener(String, JsFunction, Boolean)
		 * @see JsElement#attachEvent(String, JsFunction)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onkeyup      = new JsFunction.Member<Object>(this, Members.onkeyup    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object is a 
		 * reference to an event handler function invoked when the user presses a mouse button.</p> 
		 * @since 1.0
		 * @see JsElement#addEventListener(String, JsFunction, Boolean)
		 * @see JsElement#attachEvent(String, JsFunction)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onmousedown  = new JsFunction.Member<Object>(this, Members.onmousedown);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object is a 
		 * reference to an event handler function invoked when the user moves the mouse.</p> 
		 * @since 1.0
		 * @see JsElement#addEventListener(String, JsFunction, Boolean)
		 * @see JsElement#attachEvent(String, JsFunction)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onmousemove  = new JsFunction.Member<Object>(this, Members.onmousemove);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object is a 
		 * reference to an event handler function invoked when the user moves the mouse off the element.</p> 
		 * @since 1.0
		 * @see JsElement#addEventListener(String, JsFunction, Boolean)
		 * @see JsElement#attachEvent(String, JsFunction)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onmouseout   = new JsFunction.Member<Object>(this, Members.onmouseout );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object is a 
		 * reference to an event handler function invoked when the user moves the mouse over the element.</p> 
		 * @since 1.0
		 * @see JsElement#addEventListener(String, JsFunction, Boolean)
		 * @see JsElement#attachEvent(String, JsFunction)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onmouseover  = new JsFunction.Member<Object>(this, Members.onmouseover);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLElement} object is a 
		 * reference to an event handler function invoked when the user releases a mouse button.</p> 
		 * @since 1.0
		 * @see JsElement#addEventListener(String, JsFunction, Boolean)
		 * @see JsElement#attachEvent(String, JsFunction)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onmouseup    = new JsFunction.Member<Object>(this, Members.onmouseup  );
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsHTMLElement(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
	 * refers to the value of the <tt>class</tt> attribute of the element, which 
	 * specifies zero or more space-separated CSS class names. Note that this property 
	 * is not named "class" because that name is a reserved word in Java and JavaScript.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member className = new Value.String.Member(Members.className);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
	 * refers to the value of the <tt>dir</tt> attribute of the element, which 
	 * specifies the text direction for the document.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member dir       = new Value.String.Member(Members.dir      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
	 * refers to the value of the <tt>id</tt> attribute. No two elements within the 
	 * same document should have the same value for <tt>id</tt>.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member id        = new Value.String.Member(Members.id       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
	 * refers to a read/write string that specifies the HTML text that is contained 
	 * within the element, not including the opening and closing tags of the element 
	 * itself. Querying this property returns the content of the element as a string 
	 * of HTML text. Setting this property to a string of HTML text replaces the 
	 * content of the element with the parsed representation of the HTML. You cannot 
	 * set this property while the document is loading (see {@link JsHTMLDocument#write(String)} 
	 * for this ability). This is a nonstandard property that originated in IE 4. 
	 * It has been implemented by all modern browsers.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member innerHTML = new Value.String.Member(Members.innerHTML);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
	 * refers to the value of the <tt>lang</tt> attribute, which specifies the 
	 * language code for the element's content.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member lang      = new Value.String.Member(Members.lang     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member clientHeight = new Value.Number.Member(Members.clientHeight);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member clientWidth  = new Value.Number.Member(Members.clientWidth );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
	 * refers to the height, in pixels, of the element and all its content, including 
	 * the element's CSS padding and border, but not its margin. This is a nonstandard 
	 * but well-supported property.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member offsetHeight = new Value.Number.Member(Members.offsetHeight);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
	 * refers to the width, in pixels, of the element and all its content, including 
	 * the element's CSS padding and border, but not its margin. This is a nonstandard 
	 * but well-supported property.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member offsetWidth  = new Value.Number.Member(Members.offsetWidth );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
	 * refers to The X coordinate of the upper-left corner of the CSS border of the 
	 * element relative to the {@link #offsetParent} container element. This is a 
	 * nonstandard but well-supported property.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member offsetLeft   = new Value.Number.Member(Members.offsetLeft  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
	 * refers to The Y coordinate of the upper-left corner of the CSS border of the 
	 * element relative to the {@link #offsetParent} container element. This is a 
	 * nonstandard but well-supported property.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member offsetTop    = new Value.Number.Member(Members.offsetTop   );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
	 * refers to the overall height, in pixels, of an element. When an element has 
	 * scrollbars (because of the CSS <tt>overflow</tt> attribute, for example) the 
	 * property differs from {@link #offsetHeight}, which simply reports the height 
	 * of the visible portion of the element. This is non-standard but well-supported 
	 * property.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member scrollHeight = new Value.Number.Member(Members.scrollHeight);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
	 * refers to the overall width, in pixels, of an element. When an element has 
	 * scrollbars (because of the CSS <tt>overflow</tt> attribute, for example) the 
	 * property differs from {@link #offsetWidth}, which simply reports the width 
	 * of the visible portion of the element. This is non-standard but well-supported 
	 * property.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member scrollWidth  = new Value.Number.Member(Members.scrollWidth );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
	 * refers to the number of pixels that have scrolled off the left edge of the 
	 * element. The property is useful only for elements with scrollbars, such as 
	 * elements with the CSS <tt>overflow</tt> attribute set to <tt>auto</tt>. This 
	 * property is also defined on the <tt>&lt;body&gt;</tt> or <tt>&lt;html&gt;</tt> 
	 * tag of the document (this is browser-dependent) and specifies the amount of 
	 * scrolling for the document as a whole. Note that this property does not 
	 * specify the amount of scrolling in an <tt>&lt;iframe&gt;</tt> tag. This is a 
	 * non-standard but well-supported property.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member scrollLeft   = new Value.Number.Member(Members.scrollLeft  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
	 * refers to the number of pixels that have scrolled off the top edge of the 
	 * element. The property is useful only for elements with scrollbars, such as 
	 * elements with the CSS <tt>overflow</tt> attribute set to <tt>auto</tt>. This 
	 * property is also defined on the <tt>&lt;body&gt;</tt> or <tt>&lt;html&gt;</tt> 
	 * tag of the document (this is browser-dependent) and specifies the amount of 
	 * scrolling for the document as a whole. Note that this property does not 
	 * specify the amount of scrolling in an <tt>&lt;iframe&gt;</tt> tag. This is a 
	 * non-standard but well-supported property.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member scrollTop    = new Value.Number.Member(Members.scrollTop   );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
	 * refers to the value of the <tt>title</tt> attribute of the element. Many 
	 * browsers display the value of this attribute in a tool tip when the mouse 
	 * hovers over the element.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member title = new Value.String.Member(Members.title);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
	 * refers a {@link JsCSS2Properties} object representing the cascaded set of all 
	 * CSS properties that apply to the element. It is an IE-only alternative to 
	 * {@link JsWindow#getComputedStyle}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsCSS2Properties.Member currentStyle = new JsCSS2Properties.Member(Members.currentStyle);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
	 * refers to the value of the <tt>style</tt> attribute that specifies inline CSS 
	 * styles for this element. Note that the value of this property is not a string.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsCSS2Properties.Member style        = new JsCSS2Properties.Member(Members.style       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object 
	 * refers a node object specifying the container element that defines the coordinate 
	 * system in which {@link #offsetLeft} and {@link #offsetTop} are measured. For most 
	 * elements, {@link #offsetParent} is the {@link JsHTMLDocument} object that contains 
	 * them. However, if an element has a dynamically positioned container, the dynamically 
	 * positioned element is the {@link #offsetParent}. In some browsers, table cells 
	 * are positioned relative to the row in which they are contained, rather than 
	 * relative to the containing document. This is a nonstandard but well-supported 
	 * property.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsHTMLElement.Member offsetParent = new JsHTMLElement.Member(Members.offsetParent);

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object is a 
	 * reference to an event handler function invoked when the user clicks on the element.</p> 
	 * @since 1.0
	 * @see JsElement#addEventListener(String, JsFunction, Boolean)
	 * @see JsElement#attachEvent(String, JsFunction)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onclick      = new JsFunction.Member<Object>(Members.onclick    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object is a 
	 * reference to an event handler function invoked when the user double-clicks on the element.</p> 
	 * @since 1.0
	 * @see JsElement#addEventListener(String, JsFunction, Boolean)
	 * @see JsElement#attachEvent(String, JsFunction)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> ondblclick   = new JsFunction.Member<Object>(Members.ondblclick );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object is a 
	 * reference to an event handler function invoked when the user presses a key.</p> 
	 * @since 1.0
	 * @see JsElement#addEventListener(String, JsFunction, Boolean)
	 * @see JsElement#attachEvent(String, JsFunction)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onkeydown    = new JsFunction.Member<Object>(Members.onkeydown  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object is a 
	 * reference to an event handler function invoked when the user presses and releases a key.</p> 
	 * @since 1.0
	 * @see JsElement#addEventListener(String, JsFunction, Boolean)
	 * @see JsElement#attachEvent(String, JsFunction)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onkeypress   = new JsFunction.Member<Object>(Members.onkeypress );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object is a 
	 * reference to an event handler function invoked when the user releases a key.</p> 
	 * @since 1.0
	 * @see JsElement#addEventListener(String, JsFunction, Boolean)
	 * @see JsElement#attachEvent(String, JsFunction)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onkeyup      = new JsFunction.Member<Object>(Members.onkeyup    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object is a 
	 * reference to an event handler function invoked when the user presses a mouse button.</p> 
	 * @since 1.0
	 * @see JsElement#addEventListener(String, JsFunction, Boolean)
	 * @see JsElement#attachEvent(String, JsFunction)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onmousedown  = new JsFunction.Member<Object>(Members.onmousedown);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object is a 
	 * reference to an event handler function invoked when the user moves the mouse.</p> 
	 * @since 1.0
	 * @see JsElement#addEventListener(String, JsFunction, Boolean)
	 * @see JsElement#attachEvent(String, JsFunction)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onmousemove  = new JsFunction.Member<Object>(Members.onmousemove);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object is a 
	 * reference to an event handler function invoked when the user moves the mouse off the element.</p> 
	 * @since 1.0
	 * @see JsElement#addEventListener(String, JsFunction, Boolean)
	 * @see JsElement#attachEvent(String, JsFunction)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onmouseout   = new JsFunction.Member<Object>(Members.onmouseout );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object is a 
	 * reference to an event handler function invoked when the user moves the mouse over the element.</p> 
	 * @since 1.0
	 * @see JsElement#addEventListener(String, JsFunction, Boolean)
	 * @see JsElement#attachEvent(String, JsFunction)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onmouseover  = new JsFunction.Member<Object>(Members.onmouseover);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLElement} object is a 
	 * reference to an event handler function invoked when the user releases a mouse button.</p> 
	 * @since 1.0
	 * @see JsElement#addEventListener(String, JsFunction, Boolean)
	 * @see JsElement#attachEvent(String, JsFunction)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onmouseup    = new JsFunction.Member<Object>(Members.onmouseup  );

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
	public JsHTMLElement valueOf() {
		return new JsHTMLElement((JsObject)var().valueOf());
	}
	public final JsCSS2Properties var(JsCSS2Properties.Member r) {
		return r.with(this);
	}
	public final JsHTMLElement var(JsHTMLElement.Member r) {
		return r.with(this);
	}

	/**
	 * <p>Scrolls the document so the element is visible at the top or bottom of the window.</p>
	 * <p>If an HTML element is not currently visible in the window, this method scrolls 
	 * the document so that it becomes visible. 
	 * For elements that accept the keyboard focus, such as the {@link JsHTMLInputElement} 
	 * elements, the {@link JsHTMLInputElement#focus()} method implicitly performs this 
	 * same scroll-into-view operation.
	 * </p>
	 * @since 1.0
	 * @see #scrollIntoView(Boolean)
	 * @see #scrollIntoView(JsBoolean)
	 * @see #scrollIntoView(Value)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void scrollIntoView() {
		call(scrollIntoView);
	}
	/**
	 * <p>Scrolls the document so the element is visible at the top or bottom of the window.</p>
	 * <p>If an HTML element is not currently visible in the window, this method scrolls 
	 * the document so that it becomes visible. 
	 * For elements that accept the keyboard focus, such as the {@link JsHTMLInputElement} 
	 * elements, the {@link JsHTMLInputElement#focus()} method implicitly performs this 
	 * same scroll-into-view operation.
	 * The <tt>top</tt> argument is an optional hint about whether the element should be 
	 * scrolled to the top or bottom of the window.
	 * </p>
	 * @param top An optional boolean argument specifying whether the element should be 
	 * scrolled to the top (<tt>true</tt>) or bottom (<tt>false</tt>) of the screen. 
	 * This argument is not supported by all browsers, and elements near the top or 
	 * bottom of a document cannot usually be scrolled to the opposite edge of the 
	 * window, so this argument should be considered only a hint.
	 * @since 1.0
	 * @see #scrollIntoView()
	 * @see #scrollIntoView(JsBoolean)
	 * @see #scrollIntoView(Value)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void scrollIntoView(Boolean top) {
		call(scrollIntoView, top);
	}
	/**
	 * <p>Scrolls the document so the element is visible at the top or bottom of the window.</p>
	 * <p>If an HTML element is not currently visible in the window, this method scrolls 
	 * the document so that it becomes visible. 
	 * For elements that accept the keyboard focus, such as the {@link JsHTMLInputElement} 
	 * elements, the {@link JsHTMLInputElement#focus()} method implicitly performs this 
	 * same scroll-into-view operation.
	 * The <tt>top</tt> argument is an optional hint about whether the element should be 
	 * scrolled to the top or bottom of the window.
	 * </p>
	 * @param top An optional boolean argument specifying whether the element should be 
	 * scrolled to the top (<tt>true</tt>) or bottom (<tt>false</tt>) of the screen. 
	 * This argument is not supported by all browsers, and elements near the top or 
	 * bottom of a document cannot usually be scrolled to the opposite edge of the 
	 * window, so this argument should be considered only a hint.
	 * @since 1.0
	 * @see #scrollIntoView()
	 * @see #scrollIntoView(Boolean)
	 * @see #scrollIntoView(JsBoolean)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void scrollIntoView(Value<Boolean> top) {
		scrollIntoView(Js.valueOf(top));
	}
	/**
	 * <p>Scrolls the document so the element is visible at the top or bottom of the window.</p>
	 * <p>If an HTML element is not currently visible in the window, this method scrolls 
	 * the document so that it becomes visible. 
	 * For elements that accept the keyboard focus, such as the {@link JsHTMLInputElement} 
	 * elements, the {@link JsHTMLInputElement#focus()} method implicitly performs this 
	 * same scroll-into-view operation.
	 * The <tt>top</tt> argument is an optional hint about whether the element should be 
	 * scrolled to the top or bottom of the window.
	 * </p>
	 * @param top An optional boolean argument specifying whether the element should be 
	 * scrolled to the top (<tt>true</tt>) or bottom (<tt>false</tt>) of the screen. 
	 * This argument is not supported by all browsers, and elements near the top or 
	 * bottom of a document cannot usually be scrolled to the opposite edge of the 
	 * window, so this argument should be considered only a hint.
	 * @since 1.0
	 * @see #scrollIntoView()
	 * @see #scrollIntoView(Boolean)
	 * @see #scrollIntoView(Value)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void scrollIntoView(JsBoolean top) {
		scrollIntoView(Js.valueOf(top));
	}
}
