
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
 * {@link JsClient#HTMLFormElement} class.</p>
 * <p>This class represents a form 
 * in an HTML page, or a {@link JsHTMLElement} object created with the HTML 
 * <tt>&lt;form&gt;</tt> tag.</p> 
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsHTMLFormElement extends JsClient.HTMLFormElement.Prototype
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
	protected static abstract class Members extends JsClient.HTMLFormElement.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLFormElement#elements
		 * @see JsHTMLFormElement.Member#elements
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid elements      = id("elements"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLFormElement#length
		 * @see JsHTMLFormElement.Member#length
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid length        = id("length"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLFormElement#acceptCharset
		 * @see JsHTMLFormElement.Member#acceptCharset
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid acceptCharset = id("acceptCharset");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLFormElement#action
		 * @see JsHTMLFormElement.Member#action
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid action        = id("action"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLFormElement#enctype
		 * @see JsHTMLFormElement.Member#enctype
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid enctype       = id("enctype"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLFormElement#method
		 * @see JsHTMLFormElement.Member#method
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid method        = id("method"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLFormElement#name
		 * @see JsHTMLFormElement.Member#name
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid name          = id("name"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLFormElement#target
		 * @see JsHTMLFormElement.Member#target
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid target        = id("target"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLFormElement#onreset
		 * @see JsHTMLFormElement.Member#onreset
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onreset       = id("onreset"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLFormElement#onsubmit
		 * @see JsHTMLFormElement.Member#onsubmit
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onsubmit      = id("onsubmit"     );
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
	public static class Member extends JsClient.HTMLFormElement.Prototype.Member
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
		public JsHTMLFormElement with(ObjectLike o) {
			return new JsHTMLFormElement(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLFormElement} 
		 * object is a read-only reference to an array of form elements, such as objects 
		 * of {@link JsHTMLInputElement}, {@link JsHTMLSelectElement} or {@link JsHTMLTextAreaElement}, 
		 * that appear in the HTML form. The elements of the array are in the same order 
		 * they appear in the HTML source code for the form.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsHTMLCollection.Member<?> elements = new JsHTMLCollection.Member<JsHTMLElement>(this, Members.elements);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLFormElement} 
		 * object refers to a read-only integer value specifying the number of form 
		 * controls in the form, which is the same value as the length of {@link #elements}.</p> 
		 * @since 1.0
		 * @see JsHTMLFormElement#length()
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member length        = new Value.Number.Member(this, Members.length       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLFormElement} 
		 * object refers to a string specifying a list of character sets supported 
		 * by the server.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member acceptCharset = new Value.String.Member(this, Members.acceptCharset);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLFormElement} 
		 * object refers to a string specifying the URL of the server-side form handler.</p>
		 * @since 1.0
		 * @see #onsubmit
		 * @see JsHTMLFormElement#submit()
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member action        = new Value.String.Member(this, Members.action       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLFormElement} 
		 * object refers to a string specifying the encoding of the form which is the 
		 * content type of the submitted form, generally "application/x-www-form-urlencoded".</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member enctype       = new Value.String.Member(this, Members.enctype      );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLFormElement} 
		 * object refers to a string specifying the HTTP method used for form submission.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member method        = new Value.String.Member(this, Members.method       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLFormElement} 
		 * object refers to a string specifying the URL of the form handler.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member name          = new Value.String.Member(this, Members.name         );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLFormElement} 
		 * object refers to string specifying the {@link JsHTMLFrameElement#name} of a 
		 * target frame to render the resource in.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member target        = new Value.String.Member(this, Members.target       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLFormElement} 
		 * object is a reference to an event handler function invoked just before the 
		 * elements of the form are reset when the user clicks on a {@link JsHTMLResetElement} 
		 * button in the form. Note that this handler is not invoked in response to the 
		 * {@link JsHTMLFormElement#reset()} method. If this handler returns <tt>false</tt>, 
		 * the elements of the form are not reset. See {@link JsElement#addEventListener(String, JsFunction, Boolean)} 
		 * for another way to register event handlers.</p> 
		 * @since 1.0
		 * @see JsHTMLFormElement#reset()
		 * @see JsElement#addEventListener(String, JsFunction, Boolean)
		 * @see JsElement#attachEvent(String, JsFunction)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onreset  = new JsFunction.Member<Object>(this, Members.onreset );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLFormElement} 
		 * object is a reference to an event handler function invoked just before the form 
		 * is submitted when the user clicks on a {@link JsHTMLSubmitElement} button in 
		 * the form. It allows form entries to be validated before being submitted. Note 
		 * that this handler is not invoked in response to the {@link JsHTMLFormElement#submit()} 
		 * method. If it returns <tt>false</tt>, the elements of the form are not submitted. 
		 * If it returns any other value or returns nothing, the form is submitted normally. 
		 * Because this handler can cancel form submission, it is ideal for performing 
		 * form data validation. See {@link JsElement#addEventListener(String, JsFunction, Boolean)} 
		 * for another way to register event handlers.</p> 
		 * @since 1.0
		 * @see JsElement#addEventListener(String, JsFunction, Boolean)
		 * @see JsElement#attachEvent(String, JsFunction)
		 * @see JsHTMLFormElement#submit()
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onsubmit = new JsFunction.Member<Object>(this, Members.onsubmit);
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsHTMLFormElement(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLFormElement} 
	 * object is a read-only reference to an array of form elements, such as objects 
	 * of {@link JsHTMLInputElement}, {@link JsHTMLSelectElement} or {@link JsHTMLTextAreaElement}, 
	 * that appear in the HTML form. The elements of the array are in the same order 
	 * they appear in the HTML source code for the form.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsHTMLCollection.Member<?> elements = new JsHTMLCollection.Member<JsHTMLElement>(Members.elements);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLFormElement} 
	 * object refers to a read-only integer value specifying the number of form 
	 * controls in the form, which is the same value as the length of {@link #elements}.</p> 
	 * @since 1.0
	 * @see #length()
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member length        = new Value.Number.Member(Members.length       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLFormElement} 
	 * object refers to a string specifying a list of character sets supported 
	 * by the server.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member acceptCharset = new Value.String.Member(Members.acceptCharset);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLFormElement} 
	 * object refers to a string specifying the URL of the server-side form handler.</p>
	 * @since 1.0
	 * @see #onsubmit
	 * @see #submit()
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member action        = new Value.String.Member(Members.action       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLFormElement} 
	 * object refers to a string specifying the encoding of the form which is the 
	 * content type of the submitted form, generally "application/x-www-form-urlencoded".</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member enctype       = new Value.String.Member(Members.enctype      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLFormElement} 
	 * object refers to a string specifying the HTTP method used for form submission.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member method        = new Value.String.Member(Members.method       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLFormElement} 
	 * object refers to a string specifying the URL of the form handler.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member name          = new Value.String.Member(Members.name         );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLFormElement} 
	 * object refers to string specifying the {@link JsHTMLFrameElement#name} of a 
	 * target frame to render the resource in.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member target        = new Value.String.Member(Members.target       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLFormElement} 
	 * object is a reference to an event handler function invoked just before the 
	 * elements of the form are reset when the user clicks on a {@link JsHTMLResetElement} 
	 * button in the form. Note that this handler is not invoked in response to the 
	 * {@link #reset()} method. If this handler returns <tt>false</tt>, 
	 * the elements of the form are not reset. See {@link JsElement#addEventListener(String, JsFunction, Boolean)} 
	 * for another way to register event handlers.</p> 
	 * @since 1.0
	 * @see #reset()
	 * @see JsElement#addEventListener(String, JsFunction, Boolean)
	 * @see JsElement#attachEvent(String, JsFunction)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onreset  = new JsFunction.Member<Object>(Members.onreset );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLFormElement} 
	 * object is a reference to an event handler function invoked just before the form 
	 * is submitted when the user clicks on a {@link JsHTMLSubmitElement} button in 
	 * the form. It allows form entries to be validated before being submitted. Note 
	 * that this handler is not invoked in response to the {@link #submit()} 
	 * method. If it returns <tt>false</tt>, the elements of the form are not submitted. 
	 * If it returns any other value or returns nothing, the form is submitted normally. 
	 * Because this handler can cancel form submission, it is ideal for performing 
	 * form data validation. See {@link JsElement#addEventListener(String, JsFunction, Boolean)} 
	 * for another way to register event handlers.</p> 
	 * @since 1.0
	 * @see #submit()
	 * @see JsElement#addEventListener(String, JsFunction, Boolean)
	 * @see JsElement#attachEvent(String, JsFunction)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onsubmit = new JsFunction.Member<Object>(Members.onsubmit);

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
	public JsHTMLFormElement valueOf() {
		return new JsHTMLFormElement((JsObject)var().valueOf());
	}

	/**
	 * <p>Returns The number of form elements in the form, which is the same value as 
	 * the length of {@link #elements}.</p>
	 * @return The number of form elements in the form.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public int length() {
		return length.with(this).intValue();
	}
	/**
	 * <p>Resets all form elements to their default values.</p>
	 * <p>This method resets each element of the current form to its default value. The 
	 * results of calling it are like the results of a user clicking on a {@link JsHTMLResetElement} 
	 * button, except that the {@link #onreset} event handler of the form is not invoked.</p>
	 * @since 1.0
	 * @see #onreset
	 * @see #submit()
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void reset() {
		call(reset);
	}
	/**
	 * <p>Submits the form to a web server.</p>
	 * <p>This method submits the values of the form elements to the server specified 
	 * by the form's {@link #action} property. It submits a form in the same way that a 
	 * user's clicking on a {@link JsHTMLResetElement} button, except that the {@link #onsubmit} 
	 * event handler of the form is not invoked.</p>
	 * @since 1.0
	 * @see #onsubmit
	 * @see #reset()
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void submit() {
		call(submit);
	}
}
