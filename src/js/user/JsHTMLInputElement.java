
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
 * {@link JsClient#HTMLInputElement} class.</p>
 * <p>This class represents a form control 
 * in an HTML page, or a {@link JsHTMLElement} object created with the HTML 
 * <tt>&lt;input&gt;</tt> tag.</p>
 * <p>The three most important properties of a {@link JsHTMLInputElement} object are 
 * {@link JsHTMLInputElement#type}, {@link JsHTMLInputElement#value}, and {@link JsHTMLInputElement#name}.</p>
 * <p>The legal values of {@link JsHTMLInputElement#type} and the corresponding 
 * <b>opaque</b> subclass of {@link JsHTMLInputElement} are:
 * <ul>
 * <li>"button": {@link JsHTMLButtonElement}</li>
 * <li>"checkbox": {@link JsHTMLCheckBoxElement}</li>
 * <li>"file": {@link JsHTMLFileUploadElement}</li>
 * <li>"hidden": {@link JsHTMLHiddenElement}</li>
 * <li>"image": {@link JsHTMLImageElement}</li>
 * <li>"password": {@link JsHTMLPasswordElement}</li>
 * <li>"radio": {@link JsHTMLRadioElement}</li>
 * <li>"reset": {@link JsHTMLResetElement}</li>
 * <li>"submit": {@link JsHTMLSubmitElement}</li>
 * <li>"text": {@link JsHTMLTextFieldElement}</li>
 * </ul></p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsHTMLInputElement extends JsClient.HTMLInputElement.Prototype
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
	protected static abstract class Members extends JsClient.HTMLInputElement.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLInputElement#accept
		 * @see JsHTMLInputElement.Member#accept
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid accept         = id("accept"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLInputElement#accessKey
		 * @see JsHTMLInputElement.Member#accessKey
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid accessKey      = id("accessKey"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLInputElement#align
		 * @see JsHTMLInputElement.Member#align
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid align          = id("align"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLInputElement#alt
		 * @see JsHTMLInputElement.Member#alt
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid alt            = id("alt"           );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLInputElement#checked
		 * @see JsHTMLInputElement.Member#checked
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid checked        = id("checked"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLInputElement#defaultChecked
		 * @see JsHTMLInputElement.Member#defaultChecked
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid defaultChecked = id("defaultChecked");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLInputElement#defaultValue
		 * @see JsHTMLInputElement.Member#defaultValue
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid defaultValue   = id("defaultValue"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLInputElement#disabled
		 * @see JsHTMLInputElement.Member#disabled
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid disabled       = id("disabled"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLInputElement#form
		 * @see JsHTMLInputElement.Member#form
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid form           = id("form"          );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLInputElement#maxLength
		 * @see JsHTMLInputElement.Member#maxLength
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid maxLength      = id("maxLength"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLInputElement#name
		 * @see JsHTMLInputElement.Member#name
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid name           = id("name"          );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLInputElement#readOnly
		 * @see JsHTMLInputElement.Member#readOnly
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid readOnly       = id("readOnly"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLInputElement#size
		 * @see JsHTMLInputElement.Member#size
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid size           = id("size"          );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLInputElement#src
		 * @see JsHTMLInputElement.Member#src
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid src            = id("src"           );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLInputElement#tabIndex
		 * @see JsHTMLInputElement.Member#tabIndex
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid tabIndex       = id("tabIndex"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLInputElement#type
		 * @see JsHTMLInputElement.Member#type
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid type           = id("type"          );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLInputElement#useMap
		 * @see JsHTMLInputElement.Member#useMap
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid useMap         = id("useMap"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLInputElement#value
		 * @see JsHTMLInputElement.Member#value
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid value          = id("value"         );

		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLInputElement#onblur
		 * @see JsHTMLInputElement.Member#onblur
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onblur   = id("onblur"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLInputElement#onchange
		 * @see JsHTMLInputElement.Member#onchange
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onchange = id("onchange");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLInputElement#onclick
		 * @see JsHTMLInputElement.Member#onclick
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onclick  = id("onclick" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLInputElement#onfocus
		 * @see JsHTMLInputElement.Member#onfocus
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onfocus  = id("onfocus" );
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
	public static class Member extends JsClient.HTMLInputElement.Prototype.Member
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
		public JsHTMLInputElement with(ObjectLike o) {
			return new JsHTMLInputElement(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
		 * object is a read-only reference to the {@link JsHTMLFormElement} object 
		 * containing the control. It is <tt>null</tt> if the control is not within the 
		 * context of a form.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsHTMLFormElement.Member form = new JsHTMLFormElement.Member(this, Members.form);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
		 * object refers to a string that mirrors the <tt>accept</tt> attribute of the 
		 * image element. When {@link #type} is "file", the property is a comma-separated 
		 * list of MIME types specifying the types of files that may be uploaded to and 
		 * handled correctly by the server processing the {@link #form}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member accept       = new Value.String.Member(this, Members.accept      );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
		 * object refers to a string specifying single character access key to the 
		 * element. An access key is a single character from the document character set. 
		 * Pressing an access key assigned to an element gives focus to the element. 
		 * The action that occurs when an element receives focus depends on the element.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member accessKey    = new Value.String.Member(this, Members.accessKey   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
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
		public final Value.String.Member align        = new Value.String.Member(this, Members.align       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
		 * object refers to a string specifying an alternate text for web browsers not 
		 * rendering the normal content of this element.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member alt          = new Value.String.Member(this, Members.alt         );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
		 * object refers to a string that holds the initial value displayed by the 
		 * element when {@link #type} is "text", "password" or "file". When the {@link #form} 
		 * is reset, the element is restored to this value. Changing the value of this 
		 * property also changes the {@link #value} property and the currently displayed 
		 * value. The value of the property does not change if the contents of the corresponding 
		 * form control, in an interactive browser, changes.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member defaultValue = new Value.String.Member(this, Members.defaultValue);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
		 * object refers to a numeric value that specifies the maximum number of characters 
		 * that the user is allowed to enter in the text field when {@link #type} is 
		 * "text" or "password".</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member maxLength    = new Value.Number.Member(this, Members.maxLength   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
		 * object refers to a string specifying the name of the input control when 
		 * submitted with the {@link #form}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member name         = new Value.String.Member(this, Members.name        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
		 * object refers to an integer value that designates the initial width of the 
		 * control. The width is given in pixels except when {@link #type} attribute has 
		 * the value "text" or "password". In that case, its value refers to the number 
		 * of characters.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member size         = new Value.Number.Member(this, Members.size        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
		 * object refers to a string specifying the URL of the image to be used to 
		 * decorate the graphical submit button when {@link #type} is "image".</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member src          = new Value.String.Member(this, Members.src         );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
		 * object refers to an index number representing the element's position in the 
		 * tabbing order.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member tabIndex     = new Value.Number.Member(this, Members.tabIndex    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
		 * object refers to a string specifying the type of the input element. Possible 
		 * values are: "text", "password", "checkbox", "radio", "submit", "reset", 
		 * "file", "hidden", "image" or "button". The default value is "text".</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member type         = new Value.String.Member(this, Members.type        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
		 * object refers to a string specifying a client-side image map for the image 
		 * when {@link #type} is "image".</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member useMap       = new Value.String.Member(this, Members.useMap      );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
		 * object refers to a string value that is passed to the web server when the 
		 * {@link #form} is submitted. If {@link #type} is "text", "password", or "file", 
		 * the property is the editable text contents contained by the input element. 
		 * If {@link #type} is "button", "submit", or "reset", the property is the 
		 * non-editable label that appears in the button. For security reasons, the 
		 * {@link #value} property of {@link JsHTMLFileUploadElement} may be read-only. 
		 * Similarly, this property for {@link JsHTMLPasswordElement} may not contain 
		 * the user's actual input.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member value        = new Value.String.Member(this, Members.value       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
		 * object refers to a boolean value that specifies whether the element is 
		 * "checked" or not, mirroring the "checked" attribute of the HTML input element, 
		 * if {@link #type} is "radio" or "checkbox". Setting this property changes the 
		 * visual appearance of the element.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member checked        = new Value.Boolean.Member(this, Members.checked       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
		 * object refers to a string that holds the initial value of the <tt>checked</tt> 
		 * attribute as it appears in the document source, when {@link #type} is "radio" 
		 * or "checkbox". When the {@link #form} is reset, the {@link #checked} property 
		 * is restored to this value. Changing the value of this property also changes 
		 * the {@link #checked} property and the current checked state of the control 
		 * element. The value of this property does not change if the state of the 
		 * corresponding form control, in an interactive browser, changes.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member defaultChecked = new Value.Boolean.Member(this, Members.defaultChecked);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
		 * object refers to a boolean value that specifies whether the element is 
		 * disabled and is unavailable for user input.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member disabled       = new Value.Boolean.Member(this, Members.disabled      );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
		 * object refers to a boolean value that specifies whether the input control is 
		 * read-only. Relevant only when {@link #type} has the value "text" or "password".</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member readOnly       = new Value.Boolean.Member(this, Members.readOnly      );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} object is a 
		 * reference to an event handler function invoked when the user takes keyboard focus away 
		 * from the input control element. Calling {@link JsHTMLInputElement#blur()} to 
		 * remove focus from an element does not invoke {@link #onblur} for that object. 
		 * Note, however, that calling {@link JsHTMLInputElement#focus()} to transfer 
		 * focus to some other element causes the {@link #onblur} to be invoked for 
		 * whichever element currently has the focus.</p> 
		 * @since 1.0
		 * @see JsElement#addEventListener(String, JsFunction, Boolean)
		 * @see JsElement#attachEvent(String, JsFunction)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onblur   = new JsFunction.Member<Object>(this, Members.onblur  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} object is a 
		 * reference to an event handler function invoked for text-entry elements when the 
		 * user changes the displayed text and then commits those changes by tabbing or 
		 * clicking to transfer keyboard focus to another element. This event handler is 
		 * not invoked for every keystroke in the input control but only when the user 
		 * completes an edit. Toggle button elements of {@link #type} "checkbox" and 
		 * "radio" may also fire this event in addition to the {@link #onclick} event 
		 * when the user toggles them.</p> 
		 * @since 1.0
		 * @see JsElement#addEventListener(String, JsFunction, Boolean)
		 * @see JsElement#attachEvent(String, JsFunction)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onchange = new JsFunction.Member<Object>(this, Members.onchange);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} object is a 
		 * reference to an event handler function invoked for push button and toggle 
		 * button elements when the user activates the button with a mouse click or by 
		 * keyboard traversal. The handler is NOT invoked when the {@link JsHTMLInputElement#click()} 
		 * method is called for the element. When {@link #type} is "reset" and "submit", 
		 * this handler is performed in addition to the default actions of resetting 
		 * and submitting respectively the {@link #form} that contains the element. You 
		 * can also prevent the default actions by returning <tt>false</tt> from this 
		 * handler or from {@link JsHTMLFormElement#onreset} and {@link JsHTMLFormElement#onsubmit} 
		 * of the {@link #form}.</p> 
		 * @since 1.0
		 * @see JsElement#addEventListener(String, JsFunction, Boolean)
		 * @see JsElement#attachEvent(String, JsFunction)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onclick  = new JsFunction.Member<Object>(this, Members.onclick );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} object is a 
		 * reference to an event handler function invoked when the user gives keyboard 
		 * focus to the input control element. Calling {@link JsHTMLInputElement#focus()} to 
		 * set focus to an element does not invoke {@link #onfocus} for that object. 
		 * Note, however, that calling {@link JsHTMLInputElement#focus()} to transfer 
		 * focus to some other element causes the {@link #onblur} to be invoked for 
		 * whichever element currently has the focus.</p> 
		 * @since 1.0
		 * @see JsElement#addEventListener(String, JsFunction, Boolean)
		 * @see JsElement#attachEvent(String, JsFunction)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onfocus  = new JsFunction.Member<Object>(this, Members.onfocus );
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsHTMLInputElement(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
	 * object is a read-only reference to the {@link JsHTMLFormElement} object 
	 * containing the control. It is <tt>null</tt> if the control is not within the 
	 * context of a form.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsHTMLFormElement.Member form = new JsHTMLFormElement.Member(Members.form);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
	 * object refers to a string that mirrors the <tt>accept</tt> attribute of the 
	 * image element. When {@link #type} is "file", the property is a comma-separated 
	 * list of MIME types specifying the types of files that may be uploaded to and 
	 * handled correctly by the server processing the {@link #form}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member accept       = new Value.String.Member(Members.accept      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
	 * object refers to a string specifying single character access key to the 
	 * element. An access key is a single character from the document character set. 
	 * Pressing an access key assigned to an element gives focus to the element. 
	 * The action that occurs when an element receives focus depends on the element.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member accessKey    = new Value.String.Member(Members.accessKey   );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
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
	public static final Value.String.Member align        = new Value.String.Member(Members.align       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
	 * object refers to a string specifying an alternate text for web browsers not 
	 * rendering the normal content of this element.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member alt          = new Value.String.Member(Members.alt         );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
	 * object refers to a string that holds the initial value displayed by the 
	 * element when {@link #type} is "text", "password" or "file". When the {@link #form} 
	 * is reset, the element is restored to this value. Changing the value of this 
	 * property also changes the {@link #value} property and the currently displayed 
	 * value. The value of the property does not change if the contents of the corresponding 
	 * form control, in an interactive browser, changes.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member defaultValue = new Value.String.Member(Members.defaultValue);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
	 * object refers to a numeric value that specifies the maximum number of characters 
	 * that the user is allowed to enter in the text field when {@link #type} is 
	 * "text" or "password".</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member maxLength    = new Value.Number.Member(Members.maxLength   );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
	 * object refers to a string specifying the name of the input control when 
	 * submitted with the {@link #form}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member name         = new Value.String.Member(Members.name        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
	 * object refers to an integer value that designates the initial width of the 
	 * control. The width is given in pixels except when {@link #type} attribute has 
	 * the value "text" or "password". In that case, its value refers to the number 
	 * of characters.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member size         = new Value.Number.Member(Members.size        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
	 * object refers to a string specifying the URL of the image to be used to 
	 * decorate the graphical submit button when {@link #type} is "image".</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member src          = new Value.String.Member(Members.src         );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
	 * object refers to an index number representing the element's position in the 
	 * tabbing order.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member tabIndex     = new Value.Number.Member(Members.tabIndex    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
	 * object refers to a string specifying the type of the input element. Possible 
	 * values are: "text", "password", "checkbox", "radio", "submit", "reset", 
	 * "file", "hidden", "image" or "button". The default value is "text".</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member type         = new Value.String.Member(Members.type        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
	 * object refers to a string specifying a client-side image map for the image 
	 * when {@link #type} is "image".</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member useMap       = new Value.String.Member(Members.useMap      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
	 * object refers to a string value that is passed to the web server when the 
	 * {@link #form} is submitted. If {@link #type} is "text", "password", or "file", 
	 * the property is the editable text contents contained by the input element. 
	 * If {@link #type} is "button", "submit", or "reset", the property is the 
	 * non-editable label that appears in the button. For security reasons, the 
	 * {@link #value} property of {@link JsHTMLFileUploadElement} may be read-only. 
	 * Similarly, this property for {@link JsHTMLPasswordElement} may not contain 
	 * the user's actual input.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member value        = new Value.String.Member(Members.value       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
	 * object refers to a boolean value that specifies whether the element is 
	 * "checked" or not, mirroring the "checked" attribute of the HTML input element, 
	 * if {@link #type} is "radio" or "checkbox". Setting this property changes the 
	 * visual appearance of the element.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member checked        = new Value.Boolean.Member(Members.checked       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
	 * object refers to a string that holds the initial value of the <tt>checked</tt> 
	 * attribute as it appears in the document source, when {@link #type} is "radio" 
	 * or "checkbox". When the {@link #form} is reset, the {@link #checked} property 
	 * is restored to this value. Changing the value of this property also changes 
	 * the {@link #checked} property and the current checked state of the control 
	 * element. The value of this property does not change if the state of the 
	 * corresponding form control, in an interactive browser, changes.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member defaultChecked = new Value.Boolean.Member(Members.defaultChecked);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
	 * object refers to a boolean value that specifies whether the element is 
	 * disabled and is unavailable for user input.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member disabled       = new Value.Boolean.Member(Members.disabled      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} 
	 * object refers to a boolean value that specifies whether the input control is 
	 * read-only. Relevant only when {@link #type} has the value "text" or "password".</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member readOnly       = new Value.Boolean.Member(Members.readOnly      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} object is a 
	 * reference to an event handler function invoked when the user takes keyboard focus away 
	 * from the input control element. Calling {@link #blur()} to 
	 * remove focus from an element does not invoke {@link #onblur} for that object. 
	 * Note, however, that calling {@link #focus()} to transfer 
	 * focus to some other element causes the {@link #onblur} to be invoked for 
	 * whichever element currently has the focus.</p> 
	 * @since 1.0
	 * @see JsElement#addEventListener(String, JsFunction, Boolean)
	 * @see JsElement#attachEvent(String, JsFunction)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onblur   = new JsFunction.Member<Object>(Members.onblur  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} object is a 
	 * reference to an event handler function invoked for text-entry elements when the 
	 * user changes the displayed text and then commits those changes by tabbing or 
	 * clicking to transfer keyboard focus to another element. This event handler is 
	 * not invoked for every keystroke in the input control but only when the user 
	 * completes an edit. Toggle button elements of {@link #type} "checkbox" and 
	 * "radio" may also fire this event in addition to the {@link #onclick} event 
	 * when the user toggles them.</p> 
	 * @since 1.0
	 * @see JsElement#addEventListener(String, JsFunction, Boolean)
	 * @see JsElement#attachEvent(String, JsFunction)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onchange = new JsFunction.Member<Object>(Members.onchange);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} object is a 
	 * reference to an event handler function invoked for push button and toggle 
	 * button elements when the user activates the button with a mouse click or by 
	 * keyboard traversal. The handler is NOT invoked when the {@link JsHTMLInputElement#click()} 
	 * method is called for the element. When {@link #type} is "reset" and "submit", 
	 * this handler is performed in addition to the default actions of resetting 
	 * and submitting respectively the {@link #form} that contains the element. You 
	 * can also prevent the default actions by returning <tt>false</tt> from this 
	 * handler or from {@link JsHTMLFormElement#onreset} and {@link JsHTMLFormElement#onsubmit} 
	 * of the {@link #form}.</p> 
	 * @since 1.0
	 * @see JsElement#addEventListener(String, JsFunction, Boolean)
	 * @see JsElement#attachEvent(String, JsFunction)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onclick  = new JsFunction.Member<Object>(Members.onclick );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} object is a 
	 * reference to an event handler function invoked when the user gives keyboard 
	 * focus to the input control element. Calling {@link #focus()} to 
	 * set focus to an element does not invoke {@link #onfocus} for that object. 
	 * Note, however, that calling {@link #focus()} to transfer 
	 * focus to some other element causes the {@link #onblur} to be invoked for 
	 * whichever element currently has the focus.</p> 
	 * @since 1.0
	 * @see JsElement#addEventListener(String, JsFunction, Boolean)
	 * @see JsElement#attachEvent(String, JsFunction)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onfocus  = new JsFunction.Member<Object>(Members.onfocus );

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
	public JsHTMLInputElement valueOf() {
		return new JsHTMLInputElement((JsObject)var().valueOf());
	}
	/**
	 * <p>Takes keyboard focus away from the input control element.</p>
	 * <p>This method does not transfer keyboard focus anywhere, however, so the only 
	 * time that it is actually useful to call this method is right before you transfer 
	 * keyboard focus elsewhere with the {@link #focus()} method, when you don't want to 
	 * trigger the {@link #onblur} event handler. That is, by removing focus explicitly 
	 * from the element, you won't be notified when it is removed implicitly by a {@link #focus()} 
	 * call on another element.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void blur() {
		call(blur);
	}
	/**
	 * <p>Simulates a mouse-click on the element if {@link #type} is "button", 
	 * "checkbox", "radio", "reset", or "submit".</p>
	 * <p>This method is not often useful. Because it does not invoke the {@link #onclick} 
	 * event handler. When called on elements of {@link #type} "button", they don't have 
	 * any behavior other than that defined by the {@link #onclick} handler. Calling the 
	 * method on elements of {@link #type} "submit" or "reset" submits or resets the 
	 * {@link #form}, but this can be more directly achieved with the {@link JsHTMLFormElement#submit()} 
	 * and {@link JsHTMLFormElement#reset()} method of the {@link #form} itself.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void click() {
		call(click);
	}
	/**
	 * <p>Gives keyboard focus to this input control element.</p>
	 * <p>This method makes the control element active with respect to keyboard navigation 
	 * and keyboard input. If it is called for an input element of {@link #type} "text", 
	 * any text the user subsequently types appears in that text element. Or, if it is 
	 * called for an element of {@link #type} "button", the user can then invoke that 
	 * button from the keyboard.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void focus() {
		call(focus);
	}
	/**
	 * <p>Selects the text displayed by the input element if {@link #type} is "file", 
	 * "password", or "text".</p>
	 * <p>Typically, this means that the text is highlighted and that new text entered 
	 * by the user replaces the highlighted text instead of being appended or inserted 
	 * to it.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void select() {
		call(select);
	}
}
