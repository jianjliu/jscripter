
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
 * {@link JsClient#HTMLImageElement} class.</p>
 * <p>This class represents an image embedded 
 * in an HTML page, or a {@link JsHTMLElement} object created with the HTML 
 * <tt>&lt;img&gt;</tt> tag.</p>
 * <p>An input element of this class created with the HTML <tt>&lt;input&gt;</tt> tag 
 * with {@link JsHTMLInputElement#type} of "image" is a form submit button that displays 
 * an image, specified by the {@link JsHTMLInputElement#src} property, instead of displaying 
 * a textual label. The {@link JsHTMLInputElement#value} property is unused. See the 
 * {@link JsHTMLSubmitElement} for further details.</p> 
 * <p>An object of this class created with the HTML <tt>&lt;img&gt;</tt> tag represents 
 * an image embedded in an HTML document. The images that appear in a document are 
 * collected in the {@link JsHTMLDocument#images} array. Images that have {@link JsHTMLImageElement#name} 
 * attributes can also be accessed through named properties of the {@link JsHTMLDocument} 
 * object.</p>
 * <p>When you set the {@link JsHTMLImageElement#src} property of a {@link JsHTMLImageElement} 
 * object, the browser loads and displays the image specified by the new value. This 
 * allows visual effects such as image roll-overs and animations.</p>
 * <p>You can create offscreen {@link JsHTMLImageElement} objects dynamically using the 
 * constructor function of {@link JsWindow#Image}. Note that this constructor method 
 * does not have an argument to specify the image to be loaded. As with images created 
 * from HTML, you tell the browser to load an image by setting the <tt>src</tt> property 
 * of any images you create explicitly. There is no way to display a {@link JsHTMLImageElement} 
 * object created in this way. All you can do is force the {@link JsHTMLImageElement} 
 * object to download an image by setting the {@link JsHTMLImageElement#src} property. 
 * This is useful, however, because it loads an image into the browser's cache; if that 
 * same image URL is used later with an actual <tt>&lt;img&gt;</tt> tag, it will display 
 * quickly since it has already been loaded.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsHTMLImageElement extends JsClient.HTMLImageElement.Prototype
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
	protected static abstract class Members extends JsClient.HTMLImageElement.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLImageElement#name
		 * @see JsHTMLImageElement.Member#name
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid name     = id("name"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLImageElement#src
		 * @see JsHTMLImageElement.Member#src
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid src      = id("src"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLImageElement#align
		 * @see JsHTMLImageElement.Member#align
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid align    = id("align"   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLImageElement#alt
		 * @see JsHTMLImageElement.Member#alt
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid alt      = id("alt"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLImageElement#border
		 * @see JsHTMLImageElement.Member#border
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid border   = id("border"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLImageElement#height
		 * @see JsHTMLImageElement.Member#height
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid height   = id("height"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLImageElement#hspace
		 * @see JsHTMLImageElement.Member#hspace
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid hspace   = id("hspace"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLImageElement#isMap
		 * @see JsHTMLImageElement.Member#isMap
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid isMap    = id("isMap"   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLImageElement#longDesc
		 * @see JsHTMLImageElement.Member#longDesc
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid longDesc = id("longDesc");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLImageElement#useMap
		 * @see JsHTMLImageElement.Member#useMap
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid useMap   = id("useMap"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLImageElement#vspace
		 * @see JsHTMLImageElement.Member#vspace
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid vspace   = id("vspace"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLImageElement#width
		 * @see JsHTMLImageElement.Member#width
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid width    = id("width"   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLImageElement#onabort
		 * @see JsHTMLImageElement.Member#onabort
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onabort  = id("onabort" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLImageElement#onerror
		 * @see JsHTMLImageElement.Member#onerror
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onerror  = id("onerror" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLImageElement#onload
		 * @see JsHTMLImageElement.Member#onload
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onload   = id("onload"  );
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
	public static class Member extends JsClient.HTMLImageElement.Prototype.Member
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
		public JsHTMLImageElement with(ObjectLike o) {
			return new JsHTMLImageElement(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
		 * object refers to a string that names the current image for backwards compatibility. 
		 * Applications should use the {@link JsHTMLElement#id} attribute to identify 
		 * elements.</p> 
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
		 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
		 * object refers to a URL string designating the location of this image. When 
		 * you set this property to the URL of a new image, the browser loads and displays 
		 * that new image. This is useful for updating the graphical appearance of your 
		 * web pages in response to user actions and can also be used to perform simple 
		 * animation.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member src      = new Value.String.Member(this, Members.src     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
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
		 * <p>This attribute is deprecated by HTML 4.01 and should be handled by style sheets.</p> 
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
		 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
		 * object refers to a string specifying an alternate text for web browsers not 
		 * rendering the normal content of this element.</p>
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
		 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
		 * object refers to a string specifying the border width of this element, in 
		 * pixels. The default value for this attribute depends on the web browser.</p>
		 * <p>This attribute is deprecated by HTML 4.01 and should be handled by style sheets.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member border   = new Value.String.Member(this, Members.border  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
		 * object refers to a number value specifying the height of the image. Note that 
		 * the type of this attribute was string in DOM Level 1 HTML.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member height   = new Value.Number.Member(this, Members.height  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
		 * object refers to a number value specifying horizontal space to the left and 
		 * right of this image in pixels. Note that the type of this attribute was 
		 * string in DOM Level 1 HTML.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member hspace   = new Value.Number.Member(this, Members.hspace  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
		 * object refers to a string designating a long description of this image. The 
		 * description should supplement the short description provided by the {@link JsHTMLElement#title} 
		 * attribute, and may be particularly useful for non-visual web browsers.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member longDesc = new Value.String.Member(this, Members.longDesc);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
		 * object refers to a string specifying a client-side image map for this image.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member useMap   = new Value.String.Member(this, Members.useMap  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
		 * object refers to a number value specifying vertical space above and below 
		 * this image in pixels. Note that the type of this attribute was string in DOM 
		 * Level 1 HTML.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member vspace   = new Value.Number.Member(this, Members.vspace  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
		 * object refers to a number value specifying the width of the image. Note that 
		 * the type of this attribute was string in DOM Level 1 HTML.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member width    = new Value.Number.Member(this, Members.width   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
		 * object refers to a boolean value specifying whether to use a server-side 
		 * image map.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member isMap = new Value.Boolean.Member(this, Members.isMap);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
		 * object is a reference to an event handler function invoked if page loading 
		 * is stopped before the image is fully downloaded.</p> 
		 * @since 1.0
		 * @see JsElement#addEventListener(String, JsFunction, Boolean)
		 * @see JsElement#attachEvent(String, JsFunction)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onabort  = new JsFunction.Member<Object>(this, Members.onabort );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
		 * object is a reference to an event handler function invoked if an error occurs 
		 * while downloading the image.</p> 
		 * @since 1.0
		 * @see JsElement#addEventListener(String, JsFunction, Boolean)
		 * @see JsElement#attachEvent(String, JsFunction)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onerror  = new JsFunction.Member<Object>(this, Members.onerror );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
		 * object is a reference to an event handler function invoked when the image 
		 * successfully finishes loading.</p> 
		 * @since 1.0
		 * @see JsElement#addEventListener(String, JsFunction, Boolean)
		 * @see JsElement#attachEvent(String, JsFunction)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onload   = new JsFunction.Member<Object>(this, Members.onload  );
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsHTMLImageElement(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
	 * object refers to a string that names the current image for backwards compatibility. 
	 * Applications should use the {@link JsHTMLElement#id} attribute to identify 
	 * elements.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member name     = new Value.String.Member(Members.name    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
	 * object refers to a URL string designating the location of this image. When 
	 * you set this property to the URL of a new image, the browser loads and displays 
	 * that new image. This is useful for updating the graphical appearance of your 
	 * web pages in response to user actions and can also be used to perform simple 
	 * animation.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member src      = new Value.String.Member(Members.src     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
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
	 * <p>This attribute is deprecated by HTML 4.01 and should be handled by style sheets.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member align    = new Value.String.Member(Members.align   );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
	 * object refers to a string specifying an alternate text for web browsers not 
	 * rendering the normal content of this element.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member alt      = new Value.String.Member(Members.alt     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
	 * object refers to a string specifying the border width of this element, in 
	 * pixels. The default value for this attribute depends on the web browser.</p>
	 * <p>This attribute is deprecated by HTML 4.01 and should be handled by style sheets.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member border   = new Value.String.Member(Members.border  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
	 * object refers to a number value specifying the height of the image. Note that 
	 * the type of this attribute was string in DOM Level 1 HTML.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member height   = new Value.Number.Member(Members.height  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
	 * object refers to a number value specifying horizontal space to the left and 
	 * right of this image in pixels. Note that the type of this attribute was 
	 * string in DOM Level 1 HTML.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member hspace   = new Value.Number.Member(Members.hspace  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
	 * object refers to a string designating a long description of this image. The 
	 * description should supplement the short description provided by the {@link JsHTMLElement#title} 
	 * attribute, and may be particularly useful for non-visual web browsers.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member longDesc = new Value.String.Member(Members.longDesc);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
	 * object refers to a string specifying a client-side image map for this image.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member useMap   = new Value.String.Member(Members.useMap  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
	 * object refers to a number value specifying vertical space above and below 
	 * this image in pixels. Note that the type of this attribute was string in DOM 
	 * Level 1 HTML.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member vspace   = new Value.Number.Member(Members.vspace  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
	 * object refers to a number value specifying the width of the image. Note that 
	 * the type of this attribute was string in DOM Level 1 HTML.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member width    = new Value.Number.Member(Members.width   );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
	 * object refers to a boolean value specifying whether to use a server-side 
	 * image map.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member isMap = new Value.Boolean.Member(Members.isMap);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
	 * object is a reference to an event handler function invoked if page loading 
	 * is stopped before the image is fully downloaded.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onabort  = new JsFunction.Member<Object>(Members.onabort );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
	 * object is a reference to an event handler function invoked if an error occurs 
	 * while downloading the image.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onerror  = new JsFunction.Member<Object>(Members.onerror );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLImageElement} 
	 * object is a reference to an event handler function invoked when the image 
	 * successfully finishes loading.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onload   = new JsFunction.Member<Object>(Members.onload  );

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
	public JsHTMLImageElement valueOf() {
		return new JsHTMLImageElement((JsObject)var().valueOf());
	}
}
