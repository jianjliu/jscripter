
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
 * {@link JsClient#HTMLSelectElement} class.</p>
 * <p>This class represents a select menu 
 * in an HTML page, or a {@link JsHTMLElement} object created with the HTML 
 * <tt>&lt;select&gt;</tt> tag which creates a menu allowing the selection of an option.</p>
 * <p>The options contained in an object of this class can be directly accessed through 
 * the select element as a collection of {@link JsHTMLOptionElement}. A menu of {@link JsHTMLSelectElement} 
 * must contain at least one {@link JsHTMLOptionElement} object. If {@link JsHTMLSelectElement#multiple} 
 * is <tt>true</tt>, the user may select any number of options from the list. Otherwise, 
 * the user may select only one option, and options have a radio-button behavior, that is, 
 * selecting one deselects whichever was previously selected.</p>
 * <p>The options in an element of this class may be displayed in two distinct ways. 
 * When {@link JsHTMLSelectElement#size} is greater than 1 or {@link JsHTMLSelectElement#multiple} 
 * is <tt>true</tt>, they are displayed in a list box that is {@link JsHTMLSelectElement#size} 
 * lines high in the browser window. When {@link JsHTMLSelectElement#size} is smaller than 
 * the number of options, the listbox includes a scrollbar so all the options are 
 * accessible. On the contrary, when {@link JsHTMLSelectElement#size} is specified as 1 
 * and {@link JsHTMLSelectElement#multiple} is <tt>false</tt> or not specified, the 
 * currently selected option is displayed on a single line, and the list of other options 
 * is made available through a drop-down menu. The first style displays the options 
 * clearly but requires more space in the browser window. The second requires minimal 
 * space but does not display alternative options explicitly.</p>
 * <p>If {@link JsHTMLSelectElement#multiple} is <tt>false</tt> or undefined, you can 
 * determine which option is selected with the {@link JsHTMLSelectElement#selectedIndex} 
 * property. Otherwise, {@link JsHTMLSelectElement#selectedIndex} tells you the index 
 * of only the first selected option. To determine the full set of selected options, 
 * you must iterate through the {@link JsHTMLSelectElement#options} array and check the 
 * {@link JsHTMLOptionElement#selected} property of each {@link JsHTMLOptionElement} 
 * object.</p>
 * <p>The options displayed by the element of this class may be dynamically modified. 
 * Add a new option with {@link JsHTMLSelectElement#add(JsHTMLElement, JsHTMLElement)}. 
 * Remove an option with {@link JsHTMLSelectElement#remove(Number)}. Changes can also 
 * be made by direct manipulation of the {@link JsHTMLSelectElement#options} array.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see JsHTMLOptionElement
 * @see JsHTMLOptGroupElement
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsHTMLSelectElement extends JsClient.HTMLSelectElement.Prototype
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
	protected static abstract class Members extends JsClient.HTMLSelectElement.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLSelectElement#form
		 * @see JsHTMLSelectElement.Member#form
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid form          = id("form"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLSelectElement#length
		 * @see JsHTMLSelectElement.Member#length
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid length        = id("length"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLSelectElement#options
		 * @see JsHTMLSelectElement.Member#options
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid options       = id("options"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLSelectElement#selectedIndex
		 * @see JsHTMLSelectElement.Member#selectedIndex
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid selectedIndex = id("selectedIndex");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLSelectElement#type
		 * @see JsHTMLSelectElement.Member#type
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid type          = id("type"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLSelectElement#disabled
		 * @see JsHTMLSelectElement.Member#disabled
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid disabled      = id("disabled"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLSelectElement#multiple
		 * @see JsHTMLSelectElement.Member#multiple
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid multiple      = id("multiple"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLSelectElement#name
		 * @see JsHTMLSelectElement.Member#name
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid name          = id("name"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLSelectElement#size
		 * @see JsHTMLSelectElement.Member#size
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid size          = id("size"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLSelectElement#tabIndex
		 * @see JsHTMLSelectElement.Member#tabIndex
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid tabIndex      = id("tabIndex"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLSelectElement#onchange
		 * @see JsHTMLSelectElement.Member#onchange
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onchange      = id("onchange"     );
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
	public static class Member extends JsClient.HTMLSelectElement.Prototype.Member
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
		public JsHTMLSelectElement with(ObjectLike o) {
			return new JsHTMLSelectElement(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLSelectElement} 
		 * object refers to an integer value specifying the number of options in the 
		 * select menu.</p> 
		 * @since 1.0
		 * @see JsHTMLSelectElement#length()
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member length        = new Value.Number.Member(this, Members.length       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLSelectElement} 
		 * object refers to an integer value specifying the ordinal index of the selected 
		 * option, starting from 0. The value is -1 if no element is selected and is the 
		 * index of the first selected option if {@link #multiple} options are selected.</p>
		 * <p>Setting the value of this property selects the specified option and 
		 * deselects all other options, even if the {@link JsHTMLSelectElement} object 
		 * has the {@link #multiple} attribute specified. When you're selecting an option 
		 * and when {@link #size} > 1, you can deselect all options by setting {@link #selectedIndex} 
		 * to -1. Note that changing the selection in this way does not trigger the {@link #onchange} 
		 * event handler.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member selectedIndex = new Value.Number.Member(this, Members.selectedIndex);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLSelectElement} 
		 * object refers to a read-only string specifying the type of this form control. 
		 * It is the string "select-multiple" when the {@link #multiple} attribute is 
		 * <tt>true</tt> and the string "select-one" when <tt>false</tt>.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member type          = new Value.String.Member(this, Members.type         );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLSelectElement} 
		 * object refers to a string specifying the name of the input control when 
		 * submitted with the {@link #form}.</p>
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
		 * <p>The property, identified by this member, of a {@link JsHTMLSelectElement} 
		 * object refers to an integer value specifying the number of visible rows, that 
		 * is, the number of options to display at once.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member size          = new Value.Number.Member(this, Members.size         );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLSelectElement} 
		 * object refers to an index number representing the element's position in the 
		 * tabbing order.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member tabIndex      = new Value.Number.Member(this, Members.tabIndex     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLSelectElement} 
		 * object refers to a boolean value that specifies whether the element is 
		 * disabled and is unavailable for user input.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member disabled = new Value.Boolean.Member(this, Members.disabled);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLSelectElement} 
		 * object refers to a boolean value that specifies whether multiple options may 
		 * be selected in this select menu.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member multiple = new Value.Boolean.Member(this, Members.multiple);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLSelectElement} 
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
		 * <p>The property, identified by this member, of a {@link JsHTMLSelectElement} 
		 * object is a read-only reference to the collection of {@link JsHTMLOptionElement} 
		 * objects contained in the select menu, in the order in which they appear.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsHTMLCollection.Member<JsHTMLOptionElement> options = new JsHTMLCollection.Member<JsHTMLOptionElement>(this, Members.options);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} object is a 
		 * reference to an event handler function invoked when the user selects or deselects an 
		 * item.</p> 
		 * @since 1.0
		 * @see JsElement#addEventListener(String, JsFunction, Boolean)
		 * @see JsElement#attachEvent(String, JsFunction)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onchange = new JsFunction.Member<Object>(this, Members.onchange);
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsHTMLSelectElement(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see #length()
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member length        = new Value.Number.Member(Members.length       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLSelectElement} 
	 * object refers to an integer value specifying the ordinal index of the selected 
	 * option, starting from 0. The value is -1 if no element is selected and is the 
	 * index of the first selected option if {@link #multiple} options are selected.</p> 
	 * <p>Setting the value of this property selects the specified option and 
	 * deselects all other options, even if the {@link JsHTMLSelectElement} object 
	 * has the {@link #multiple} attribute specified. When you're selecting an option 
	 * and when {@link #size} > 1, you can deselect all options by setting {@link #selectedIndex} 
	 * to -1. Note that changing the selection in this way does not trigger the {@link #onchange} 
	 * event handler.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member selectedIndex = new Value.Number.Member(Members.selectedIndex);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLSelectElement} 
	 * object refers to a read-only string specifying the type of this form control. 
	 * It is the string "select-multiple" when the {@link #multiple} attribute is 
	 * <tt>true</tt> and the string "select-one" when <tt>false</tt>.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member type          = new Value.String.Member(Members.type         );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLSelectElement} 
	 * object refers to a string specifying the name of the input control when 
	 * submitted with the {@link #form}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member name          = new Value.String.Member(Members.name         );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLSelectElement} 
	 * object refers to an integer value specifying the number of visible rows, that 
	 * is, the number of options to display at once.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member size          = new Value.Number.Member(Members.size         );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLSelectElement} 
	 * object refers to an index number representing the element's position in the 
	 * tabbing order.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member tabIndex      = new Value.Number.Member(Members.tabIndex     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLSelectElement} 
	 * object refers to a boolean value that specifies whether the element is 
	 * disabled and is unavailable for user input.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member disabled = new Value.Boolean.Member(Members.disabled);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLSelectElement} 
	 * object refers to a boolean value that specifies whether multiple options may 
	 * be selected in this select menu.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member multiple = new Value.Boolean.Member(Members.multiple);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLSelectElement} 
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
	 * <p>The property, identified by this member, of a {@link JsHTMLSelectElement} 
	 * object is a read-only reference to the collection of {@link JsHTMLOptionElement} 
	 * objects contained in the select menu, in the order in which they appear.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsHTMLCollection.Member<JsHTMLOptionElement> options = new JsHTMLCollection.Member<JsHTMLOptionElement>(Members.options);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLInputElement} object is a 
	 * reference to an event handler function invoked when the user selects or deselects an 
	 * item.</p> 
	 * @since 1.0
	 * @see JsElement#addEventListener(String, JsFunction, Boolean)
	 * @see JsElement#attachEvent(String, JsFunction)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onchange = new JsFunction.Member<Object>(Members.onchange);

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
	public JsHTMLSelectElement valueOf() {
		return new JsHTMLSelectElement((JsObject)var().valueOf());
	}

	/**
	 * <p>Gets the number of options contained in the current select menu. Same as the 
	 * length of {@link #options}.</p>
	 * @return The number of options contained in the current select element.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method into the 
	 * JavaScript expression: 
	 * <pre>a.length</pre>
	 * where <tt>a</tt> is the current array instance of the invocation.
	 */
	public int length() {
		return length.with(this).intValue();
	}
	/**
	 * <p>Inserts a new {@link JsHTMLOptionElement} object into the {@link #options} 
	 * array, either by appending it at the end of the array or by inserting it before 
	 * another specified option.</p>
	 * @param element The {@link JsHTMLOptionElement} object to be added. 
	 * @param before The element of the {@link #options} array before which the new 
	 * <tt>element</tt> should be added. If this argument is <tt>null</tt> or undefined, 
	 * the <tt>element</tt> is appended at the end of the {@link #options} array. 
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NOT_FOUND_ERR} 
	 * if <tt>before</tt> is not a member of the {@link #options} array. See {@link Js#err(Object)} for 
	 * JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void add(JsHTMLElement element, JsHTMLElement before) {
		call(add, new Vars<Object>().add(element).add(before));
	}
	/**
	 * <p>Takes keyboard focus away from the input control element.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void blur() {
		call(blur);
	}
	/**
	 * <p>Gives keyboard focus to this input control element.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void focus() {
		call(focus);
	}
	/**
	 * <p>Removes the option element at the specified position.</p>
	 * @param index The position within the {@link #options} array of the option element 
	 * to be removed.
	 * @since 1.0
	 * @see #remove(NumberLike)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void remove(Number index) {
		call(remove, index);
	}
	/**
	 * <p>Removes the option element at the specified position.</p>
	 * @param index The position within the {@link #options} array of the option element 
	 * to be removed.
	 * @since 1.0
	 * @see #remove(Number)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void remove(NumberLike<?> index) {
		call(remove, index);
	}
}
