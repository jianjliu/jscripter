
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
 * {@link JsClient#CSSStyleSheet} class.</p>
 * <p>This class represents a CSS stylesheet. It has properties and methods for disabling 
 * the stylesheet, and for querying, inserting, and removing style rules. IE implements 
 * a slightly different API than the DOM standard. In IE, use the {@link JsCSSStyleSheet#rules} 
 * array instead of {@link JsCSSStyleSheet#cssRules}, and use {@link JsCSSStyleSheet#addRule(String, String, int)} 
 * and {@link JsCSSStyleSheet#removeRule(int)} instead of the DOM standard {@link JsCSSStyleSheet#insertRule(String, long)} 
 * and {@link JsCSSStyleSheet#deleteRule(long)}.</p>
 * <p>The {@link JsCSSStyleSheet} objects that apply to a document are members of the 
 * {@link JsDocument#styleSheets} array of the {@link JsDocument} object. The DOM 
 * standard also requires that any <tt>&lt;style&gt;</tt> or <tt>&lt;link&gt;</tt> 
 * element or {@link JsProcessingInstruction} node that defines or links to a stylesheet 
 * should make the {@link JsCSSStyleSheet} object available through a <tt>sheet</tt> 
 * property, but this is not widely implemented.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsCSSStyleSheet extends JsClient.CSSStyleSheet.Prototype
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
	protected static abstract class Members extends JsClient.CSSStyleSheet.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSSStyleSheet#cssRules
		 * @see JsCSSStyleSheet.Member#cssRules
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid cssRules         = id("cssRules"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSSStyleSheet#disabled
		 * @see JsCSSStyleSheet.Member#disabled
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid disabled         = id("disabled"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSSStyleSheet#href
		 * @see JsCSSStyleSheet.Member#href
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid href             = id("href"            );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSSStyleSheet#parentStyleSheet
		 * @see JsCSSStyleSheet.Member#parentStyleSheet
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid parentStyleSheet = id("parentStyleSheet");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSSStyleSheet#rules
		 * @see JsCSSStyleSheet.Member#rules
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid rules            = id("rules"           );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSSStyleSheet#title
		 * @see JsCSSStyleSheet.Member#title
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid title            = id("title"           );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSSStyleSheet#type
		 * @see JsCSSStyleSheet.Member#type
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid type             = id("type"            );
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
	public static class Member extends JsClient.CSSStyleSheet.Prototype.Member
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
		public JsCSSStyleSheet with(ObjectLike o) {
			return new JsCSSStyleSheet(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSSStyleSheet} object 
		 * refers to a read-only array holding the {@link JsCSSRule} objects that compose 
		 * the stylesheet. In DOM-compliant implementations, this array includes objects 
		 * that represent all rules in a stylesheet, including at-rules such as \\@import 
		 * directives. Rules of these sorts implement a different interface than that are 
		 * described for CSSRule. The other types of rule objects are not well supported 
		 * across browsers.</p>
		 * <p>In Internet Explorer, use the {@link #rules} property instead.</p> 
		 * @since 1.0
		 * @see #rules
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsArray.Member cssRules = new JsArray.Member(this, Members.cssRules);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSSStyleSheet} object 
		 * refers to a boolean value. If it is <tt>true</tt>, the stylesheet is disabled 
		 * and is not applied to the document. If <tt>false</tt>, the stylesheet is 
		 * enabled and is applied to the document.</p> 
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
		 * <p>The property, identified by this member, of a {@link JsCSSStyleSheet} object 
		 * is a read-only reference to the URL of a stylesheet that is linked to the 
		 * document or <tt>null</tt> for inline style-sheets.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member href = new Value.String.Member(this, Members.href);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The IE equivalent of {@link #cssRules} that is DOM-standard.</p> 
		 * @since 1.0
		 * @see #cssRules
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsArray.Member rules = new JsArray.Member(this, Members.rules);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSSStyleSheet} object 
		 * is a read-only reference to the title of the stylesheet, if specified. A 
		 * title may be specified by the <tt>title</tt> attribute of a <tt>&lt;style&gt;</tt> 
		 * or <tt>&lt;link&gt;</tt> element that refers to this stylesheet.</p> 
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
		 * <p>The property, identified by this member, of a {@link JsCSSStyleSheet} object 
		 * is a read-only reference to the type of this stylesheet, as a MIME type. CSS 
		 * style-sheets have a type of "text/css".</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member type  = new Value.String.Member(this, Members.type );
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsCSSStyleSheet(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSSStyleSheet} object 
	 * refers to a read-only array holding the {@link JsCSSRule} objects that compose 
	 * the stylesheet. In DOM-compliant implementations, this array includes objects 
	 * that represent all rules in a stylesheet, including at-rules such as &#64;import 
	 * directives.</p>
	 * <p>In Internet Explorer, use the {@link #rules} property instead.</p> 
	 * @since 1.0
	 * @see #rules
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsArray.Member cssRules = new JsArray.Member(Members.cssRules);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSSStyleSheet} object 
	 * refers to a boolean value. If it is <tt>true</tt>, the stylesheet is disabled 
	 * and is not applied to the document. If <tt>false</tt>, the stylesheet is 
	 * enabled and is applied to the document.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member disabled = new Value.Boolean.Member(Members.disabled);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSSStyleSheet} object 
	 * is a read-only reference to the URL of a stylesheet that is linked to the 
	 * document or <tt>null</tt> for inline style-sheets.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member href = new Value.String.Member(Members.href);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSSStyleSheet} object 
	 * is a read-only reference to the stylesheet that includes this one or <tt>null</tt> 
	 * if this stylesheet was included directly in the document.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsCSSStyleSheet.Member parentStyleSheet = new JsCSSStyleSheet.Member(Members.parentStyleSheet);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The IE equivalent of {@link #cssRules} that is DOM-standard.</p> 
	 * @since 1.0
	 * @see #cssRules
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsArray.Member rules = new JsArray.Member(Members.rules);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSSStyleSheet} object 
	 * is a read-only reference to the title of the stylesheet, if specified. A 
	 * title may be specified by the <tt>title</tt> attribute of a <tt>&lt;style&gt;</tt> 
	 * or <tt>&lt;link&gt;</tt> element that refers to this stylesheet.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member title = new Value.String.Member(Members.title);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSSStyleSheet} object 
	 * is a read-only reference to the type of this stylesheet, as a MIME type. CSS 
	 * style-sheets have a type of "text/css".</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member type  = new Value.String.Member(Members.type );

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
	public JsCSSStyleSheet valueOf() {
		return new JsCSSStyleSheet((JsObject)var().valueOf());
	}
	/**
	 * <p>IE-specific method to add a CSS rule to a stylesheet.</p>
	 * <p>This method inserts (or appends) a new CSS style rule at the specified <tt>index</tt> 
	 * of the {@link #rules} array of this stylesheet. This is an IE-specific alternative 
	 * to the standard {@link #insertRule(String, long)} method. Note that the arguments 
	 * to this method are different from those to {@link #insertRule(String, long)}.</p>
	 * @param selector The CSS selector for the rule.
	 * @param style The styles to be applied to elements that match the <tt>selector</tt>. 
	 * This style string is a semicolon-delimited list of attribute:value pairs. It does 
	 * NOT begin and end with curly braces.
	 * @param index The position in the {@link #rules} array at which the rule is to be 
	 * inserted or appended. If this optional argument is undefined, the new rule is 
	 * appended to the array of rules.
	 * @since 1.0
	 * @see #insertRule(String, long)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void addRule(String selector, String style, int index) {
		call(addRule, new Vars<Object>().add(selector).add(style).add(index));
	}
	/**
	 * <p>DOM-standard method to delete the rule at the specified position.</p>
	 * <p>This is a DOM-standard method that deletes the rule at the specified <tt>index</tt> 
	 * from the {@link #cssRules} array. See {@link #removeRule(int)} for an IE-specific 
	 * alternative.</p>
	 * @param index The index within the {@link #cssRules} array of the rule to be deleted.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#INDEX_SIZE_ERR} 
	 * if <tt>index</tt> is negative or greater than or equal to the length of the {@link #cssRules} 
	 * array, or the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} if this 
	 * stylesheet is read-only. See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see #removeRule(int)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void deleteRule(long index) {
		call(deleteRule, index);
	}
	/**
	 * <p>DOM-standard method to insert a new rule into the stylesheet.</p>
	 * <p>This is a DOM-standard method which inserts (or appends) a new CSS <tt>rule</tt> 
	 * at the specified <tt>index</tt> of the {@link #cssRules} array of this stylesheet. 
	 * See {@link #addRule(String, String, int)} for an IE-specific alternative.</p>
	 * @param rule The complete and parseable text representation of the rule to be 
	 * added to the stylesheet. For style rules, it includes both the element selector 
	 * and the style information.
	 * @param index The position in the {@link #cssRules} array at which the rule is to 
	 * be inserted or appended.
	 * @return The value of the <tt>index</tt> argument.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if the stylesheet is read-only, the value {@link JsDOMException#INDEX_SIZE_ERR} 
	 * if <tt>index</tt> is negative or greater then the length of the {@link #cssRules} 
	 * array, the value {@link JsDOMException#HIERARCHY_REQUEST_ERR} if CSS syntax does 
	 * not allow the specified rule at the specified location, or the value {@link JsDOMException#SYNTAX_ERR} 
	 * if the specified <tt>rule</tt> text contains a syntax error. See {@link Js#err(Object)} 
	 * for JS Simulation.
	 * @since 1.0
	 * @see #addRule(String, String, int)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number insertRule(String rule, long index) {
		return call(insertRule, new Vars<Object>().add(rule).add(index));
	}
	/**
	 * <p>IE-specific method to delete a rule.</p>
	 * <p>This method removes the CSS style rule at the specified <tt>index</tt> of the 
	 * {@link #rules} array of this stylesheet. This is an IE-specific alternative to 
	 * the DOM-standard {@link #deleteRule(long)} method.</p>
	 * @param index The index in the {@link #rules} array of the rule to be removed. If 
	 * this optional argument is undefined, the first rule in the array is removed.
	 * @since 1.0
	 * @see #deleteRule(long)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void removeRule(int index) {
		call(removeRule, index);
	}
}
