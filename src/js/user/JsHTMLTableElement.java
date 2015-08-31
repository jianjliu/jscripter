
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
 * {@link JsClient#HTMLTableElement} class.</p>
 * <p>This class represents a table 
 * in an HTML page, or a {@link JsHTMLElement} object created with the HTML 
 * <tt>&lt;table&gt;</tt> tag.</p>
 * <p>This class defines a number of convenience properties and methods for querying and 
 * modifying various sections of the table. These methods and properties make it easier to 
 * work with tables, but their functionality can also be duplicated with core DOM methods.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsHTMLTableElement extends JsClient.HTMLTableElement.Prototype
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
	protected static abstract class Members extends JsClient.HTMLTableElement.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableElement#caption
		 * @see JsHTMLTableElement.Member#caption
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid caption     = id("caption"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableElement#rows
		 * @see JsHTMLTableElement.Member#rows
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid rows        = id("rows"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableElement#tBodies
		 * @see JsHTMLTableElement.Member#tBodies
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid tBodies     = id("tBodies"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableElement#tFoot
		 * @see JsHTMLTableElement.Member#tFoot
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid tFoot       = id("tFoot"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableElement#tHead
		 * @see JsHTMLTableElement.Member#tHead
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid tHead       = id("tHead"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableElement#align
		 * @see JsHTMLTableElement.Member#align
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid align       = id("align"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableElement#bgColor
		 * @see JsHTMLTableElement.Member#bgColor
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid bgColor     = id("bgColor"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableElement#border
		 * @see JsHTMLTableElement.Member#border
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid border      = id("border"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableElement#cellPadding
		 * @see JsHTMLTableElement.Member#cellPadding
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid cellPadding = id("cellPadding");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableElement#cellSpacing
		 * @see JsHTMLTableElement.Member#cellSpacing
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid cellSpacing = id("cellSpacing");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableElement#frame
		 * @see JsHTMLTableElement.Member#frame
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid frame       = id("frame"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableElement#rules
		 * @see JsHTMLTableElement.Member#rules
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid rules       = id("rules"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableElement#summary
		 * @see JsHTMLTableElement.Member#summary
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid summary     = id("summary"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableElement#width
		 * @see JsHTMLTableElement.Member#width
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid width       = id("width"      );
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
	public static class Member extends JsClient.HTMLTableElement.Prototype.Member
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
		public JsHTMLTableElement with(ObjectLike o) {
			return new JsHTMLTableElement(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
		 * object is a reference to a {@link JsHTMLTableCaptionElement} element representing 
		 * the <tt>&lt;caption&gt;</tt> element for the table, or <tt>null</tt> if there 
		 * is none.</p>
		 * <p>JavaScript throws a {@link JsDOMException} object with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#HIERARCHY_REQUEST_ERR} if the element 
		 * is not an instance of {@link JsClient#HTMLTableCaptionElement} when setting the 
		 * property. See {@link Js#err(Object)} for JS Simulation.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsHTMLElement.Member caption = new JsHTMLElement.Member(this, Members.caption);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
		 * object is a read-only reference to a collection of {@link JsHTMLTableRowElement} 
		 * elements of the current table section, which represent all the rows in the 
		 * table including all rows defined within <tt>&lt;thead&gt;</tt>, <tt>&lt;tfoot&gt;</tt>, 
		 * and <tt>&lt;tbody&gt;</tt> tags.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsHTMLCollection.Member<JsHTMLTableRowElement> rows = new JsHTMLCollection.Member<JsHTMLTableRowElement>(this, Members.rows);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
		 * object is a read-only reference to a collection of {@link JsHTMLTableSectionElement} 
		 * elements that represent <tt>&lt;tbody&gt;</tt> elements in the table.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsHTMLCollection.Member<JsHTMLTableSectionElement> tBodies = new JsHTMLCollection.Member<JsHTMLTableSectionElement>(this, Members.tBodies);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
		 * object is a reference to a {@link JsHTMLTableSectionElement} element representing 
		 * the <tt>&lt;tfoot&gt;</tt> element for the table, or <tt>null</tt> if there 
		 * is none.</p>
		 * <p>JavaScript throws a {@link JsDOMException} object with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#HIERARCHY_REQUEST_ERR} if the element 
		 * is not an instance of {@link JsClient#HTMLTableSectionElement} when setting the 
		 * property. See {@link Js#err(Object)} for JS Simulation.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsHTMLTableSectionElement.Member tFoot = new JsHTMLTableSectionElement.Member(this, Members.tFoot);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
		 * object is a reference to a {@link JsHTMLTableSectionElement} element representing 
		 * the <tt>&lt;thead&gt;</tt> element for the table, or <tt>null</tt> if there 
		 * is none.</p>
		 * <p>JavaScript throws a {@link JsDOMException} object with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#HIERARCHY_REQUEST_ERR} if the element 
		 * is not an instance of {@link JsClient#HTMLTableSectionElement} when setting the 
		 * property. See {@link Js#err(Object)} for JS Simulation.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsHTMLTableSectionElement.Member tHead = new JsHTMLTableSectionElement.Member(this, Members.tHead);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
		 * object refers to a string specifying the horizontal alignment of the elements 
		 * of the table with respect to the surrounding context. Possible values 
		 * are:
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
		public final Value.String.Member align       = new Value.String.Member(this, Members.align      );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
		 * object refers to a string specifying the background color for the table cells.</p>
		 * <p>This attribute is deprecated by HTML 4.01 and should be handled by style sheets.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member bgColor     = new Value.String.Member(this, Members.bgColor    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
		 * object refers to a string specifying the width of borders around this table 
		 * in pixels.</p>
		 * <p>This attribute is deprecated by HTML 4.01 and should be handled by style sheets.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member border      = new Value.String.Member(this, Members.border     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
		 * object refers to a string specifying the horizontal and vertical space 
		 * between cell content and cell borders of the table.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member cellPadding = new Value.String.Member(this, Members.cellPadding);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
		 * object refers to a string specifying the horizontal and vertical separation 
		 * between cells of the table.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member cellSpacing = new Value.String.Member(this, Members.cellSpacing);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
		 * object refers to a string specifying which sides of the {@link #border} 
		 * surrounding a table will be visible. Possible values are:
		 * <ul>
		 * <li><tt>"void"</tt>: No sides. This is the default value.</li>
		 * <li><tt>"above"</tt>: The top side only.</li>
		 * <li><tt>"below"</tt>: The bottom side only.</li>
		 * <li><tt>"hsides"</tt>: The top and bottom sides only.</li>
		 * <li><tt>"vsides"</tt>: The right and left sides only.</li>
		 * <li><tt>"lhs"</tt>: The left-hand side only.</li>
		 * <li><tt>"rhs"</tt>: The right-hand side only.</li>
		 * <li><tt>"box"</tt>: All four sides.</li>
		 * <li><tt>"border"</tt>: All four sides.</li>
		 * </ul>
		 * </p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member frame       = new Value.String.Member(this, Members.frame      );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
		 * object refers to a string specifying which rules will appear between cells 
		 * within the table. The rendering of rules is browser dependent. Possible 
		 * values are:
		 * <ul>
		 * <li><tt>"none"</tt>: No rules. This is the default value.</li>
		 * <li><tt>"groups"</tt>: Rules appear between row groups and column groups only.</li>
		 * <li><tt>"rows"</tt>: Rules appear between rows only.</li>
		 * <li><tt>"cols"</tt>: Rules appear between columns only.</li>
		 * <li><tt>"all"</tt>: Rules appear between all rows and columns.</li>
		 * </ul>
		 * </p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member rules       = new Value.String.Member(this, Members.rules      );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
		 * object refers to a string specifying the summary description about the purpose 
		 * or structure of table.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member summary     = new Value.String.Member(this, Members.summary    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
		 * object refers to a string specifying the width the current table.</p>
		 * <p>This attribute is deprecated by HTML 4.01 and should be handled by style sheets.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member width       = new Value.String.Member(this, Members.width      );
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsHTMLTableElement(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
	 * object is a reference to a {@link JsHTMLTableCaptionElement} element representing 
	 * the <tt>&lt;caption&gt;</tt> element for the table, or <tt>null</tt> if there 
	 * is none.</p>
	 * <p>JavaScript throws a {@link JsDOMException} object with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#HIERARCHY_REQUEST_ERR} if the element 
	 * is not an instance of {@link JsClient#HTMLTableCaptionElement} when setting the 
	 * property. See {@link Js#err(Object)} for JS Simulation.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsHTMLElement.Member caption = new JsHTMLElement.Member(Members.caption);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
	 * object is a read-only reference to a collection of {@link JsHTMLTableRowElement} 
	 * elements of the current table section, which represent all the rows in the 
	 * table including all rows defined within <tt>&lt;thead&gt;</tt>, <tt>&lt;tfoot&gt;</tt>, 
	 * and <tt>&lt;tbody&gt;</tt> tags.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsHTMLCollection.Member<JsHTMLTableRowElement> rows = new JsHTMLCollection.Member<JsHTMLTableRowElement>(Members.rows);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
	 * object is a read-only reference to a collection of {@link JsHTMLTableSectionElement} 
	 * elements that represent <tt>&lt;tbody&gt;</tt> elements in the table.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsHTMLCollection.Member<JsHTMLTableSectionElement> tBodies = new JsHTMLCollection.Member<JsHTMLTableSectionElement>(Members.tBodies);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
	 * object is a reference to a {@link JsHTMLTableSectionElement} element representing 
	 * the <tt>&lt;tfoot&gt;</tt> element for the table, or <tt>null</tt> if there 
	 * is none.</p>
	 * <p>JavaScript throws a {@link JsDOMException} object with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#HIERARCHY_REQUEST_ERR} if the element 
	 * is not an instance of {@link JsClient#HTMLTableSectionElement} when setting the 
	 * property. See {@link Js#err(Object)} for JS Simulation.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsHTMLTableSectionElement.Member tFoot = new JsHTMLTableSectionElement.Member(Members.tFoot);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
	 * object is a reference to a {@link JsHTMLTableSectionElement} element representing 
	 * the <tt>&lt;thead&gt;</tt> element for the table, or <tt>null</tt> if there 
	 * is none.</p>
	 * <p>JavaScript throws a {@link JsDOMException} object with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#HIERARCHY_REQUEST_ERR} if the element 
	 * is not an instance of {@link JsClient#HTMLTableSectionElement} when setting the 
	 * property. See {@link Js#err(Object)} for JS Simulation.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsHTMLTableSectionElement.Member tHead = new JsHTMLTableSectionElement.Member(Members.tHead);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
	 * object refers to a string specifying the horizontal alignment of the elements 
	 * of the table with respect to the surrounding context. Possible values 
	 * are:
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
	public static final Value.String.Member align       = new Value.String.Member(Members.align      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
	 * object refers to a string specifying the background color for the table cells.</p>
	 * <p>This attribute is deprecated by HTML 4.01 and should be handled by style sheets.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member bgColor     = new Value.String.Member(Members.bgColor    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
	 * object refers to a string specifying the width of borders around this table 
	 * in pixels.</p>
	 * <p>This attribute is deprecated by HTML 4.01 and should be handled by style sheets.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member border      = new Value.String.Member(Members.border     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
	 * object refers to a string specifying the horizontal and vertical space 
	 * between cell content and cell borders of the table.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member cellPadding = new Value.String.Member(Members.cellPadding);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
	 * object refers to a string specifying the horizontal and vertical separation 
	 * between cells of the table.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member cellSpacing = new Value.String.Member(Members.cellSpacing);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
	 * object refers to a string specifying which sides of the {@link #border} 
	 * surrounding a table will be visible. Possible values are:
	 * <ul>
	 * <li><tt>"void"</tt>: No sides. This is the default value.</li>
	 * <li><tt>"above"</tt>: The top side only.</li>
	 * <li><tt>"below"</tt>: The bottom side only.</li>
	 * <li><tt>"hsides"</tt>: The top and bottom sides only.</li>
	 * <li><tt>"vsides"</tt>: The right and left sides only.</li>
	 * <li><tt>"lhs"</tt>: The left-hand side only.</li>
	 * <li><tt>"rhs"</tt>: The right-hand side only.</li>
	 * <li><tt>"box"</tt>: All four sides.</li>
	 * <li><tt>"border"</tt>: All four sides.</li>
	 * </ul>
	 * </p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member frame       = new Value.String.Member(Members.frame      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableElement} 
	 * object refers to a string specifying which rules will appear between cells 
	 * within the table. The rendering of rules is browser dependent. Possible 
	 * values are:
	 * <ul>
	 * <li><tt>"none"</tt>: No rules. This is the default value.</li>
	 * <li><tt>"groups"</tt>: Rules appear between row groups and column groups only.</li>
	 * <li><tt>"rows"</tt>: Rules appear between rows only.</li>
	 * <li><tt>"cols"</tt>: Rules appear between columns only.</li>
	 * <li><tt>"all"</tt>: Rules appear between all rows and columns.</li>
	 * </ul>
	 * </p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member rules       = new Value.String.Member(Members.rules      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
	 * object refers to a string specifying the summary description about the purpose 
	 * or structure of table.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member summary     = new Value.String.Member(Members.summary    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
	 * object refers to a string specifying the width the current table.</p>
	 * <p>This attribute is deprecated by HTML 4.01 and should be handled by style sheets.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member width       = new Value.String.Member(Members.width      );

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
	public JsHTMLTableElement valueOf() {
		return new JsHTMLTableElement((JsObject)var().valueOf());
	}
	/**
	 * <p>Creates a new table caption object or return an existing one.</p>
	 * @return A {@link JsHTMLTableCaptionElement} object representing the <tt>&lt;caption&gt;</tt> 
	 * element for this table. If the table already has a caption, this method simply 
	 * returns it. If the table does not have an existing <tt>&lt;caption&gt;</tt>, 
	 * this method creates a new empty one and inserts it into the table before 
	 * returning it.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsHTMLTableCaptionElement createCaption() {
		return new JsHTMLTableCaptionElement(call(createCaption));
	}
	/**
	 * <p>Creates a table footer row or returns an existing one.</p>
	 * @return A {@link JsHTMLTableSectionElement} object representing the <tt>&lt;tfoot&gt;</tt> 
	 * element for this table. If the table already has a footer, this method simply 
	 * returns it. If the table does not have an existing footer, this method creates 
	 * a new empty <tt>&lt;tfoot&gt;</tt> element and inserts it into the table before 
	 * returning it.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsHTMLTableSectionElement createTFoot() {
		return new JsHTMLTableSectionElement(call(createTFoot));
	}
	/**
	 * <p>Creates a new table header row or returns an existing one.</p>
	 * @return A {@link JsHTMLTableSectionElement} object representing the <tt>&lt;thead&gt;</tt> 
	 * element for this table. If the table already has a header, this method simply 
	 * returns it. If the table does not have an existing header, this method creates 
	 * a new empty <tt>&lt;thead&gt;</tt> element and inserts it into the table before 
	 * returning it.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsHTMLTableSectionElement createTHead() {
		return new JsHTMLTableSectionElement(call(createTHead));
	}
	/**
	 * <p>Deletes the table caption, if one exists.</p>
	 * <p>If this table has a <tt>&lt;caption&gt;</tt> element, this method removes it 
	 * from the document tree. Otherwise, it does nothing.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void deleteCaption() {
		call(deleteCaption);
	}
	/**
	 * <p>Deletes the row at the specified position in the table.</p>
	 * <p>This method deletes the row at the specified position from the table. Rows 
	 * are numbered in the order in which they appear in the document source. Rows in 
	 * tt>&lt;thead&gt;</tt> and tt>&lt;tfoot&gt;</tt> sections are numbered along with 
	 * all other rows in the table.</p>
	 * @param index Specifies the position within the table of the row to be deleted.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#INDEX_SIZE_ERR} 
	 * if the specified <tt>index</tt> is greater than or equal to the number of cells 
	 * or if the <tt>index</tt> is a negative number other than -1. See {@link Js#err(Object)} for 
	 * JS Simulation.
	 * @since 1.0
	 * @see #deleteRow(NumberLike)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void deleteRow(Number index) {
		call(deleteRow, index);
	}
	/**
	 * <p>Deletes the row at the specified position in the table.</p>
	 * <p>This method deletes the row at the specified position from the table. Rows 
	 * are numbered in the order in which they appear in the document source. Rows in 
	 * tt>&lt;thead&gt;</tt> and tt>&lt;tfoot&gt;</tt> sections are numbered along with 
	 * all other rows in the table.</p>
	 * @param index Specifies the position within the table of the row to be deleted.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#INDEX_SIZE_ERR} 
	 * if the specified <tt>index</tt> is greater than or equal to the number of cells 
	 * or if the <tt>index</tt> is a negative number other than -1. See {@link Js#err(Object)} for 
	 * JS Simulation.
	 * @since 1.0
	 * @see #deleteRow(Number)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void deleteRow(NumberLike<?> index) {
		call(deleteRow, index);
	}
	/**
	 * <p>Deletes the footer from the table, if one exists.</p>
	 * <p>If this table has a <tt>&lt;tfoot&gt;</tt> element, this method removes it from the 
	 * document tree. If the table has no footer, this method does nothing.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void deleteTFoot() {
		call(deleteTFoot);
	}
	/**
	 * <p>Deletes the header from the table, if one exists.</p>
	 * <p>If this table has a <tt>&lt;thead&gt;</tt> element, this method removes it from the 
	 * document tree. If the table has no header, this method does nothing.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void deleteTHead() {
		call(deleteTHead);
	}
	/**
	 * <p>Inserts a new empty row in the table at the specified position.</p>
	 * <p>The new row is inserted immediately before and in the same section as the 
	 * current <tt>index</tt>th row in the table. If <tt>index</tt> is -1 or equal to 
	 * the number of rows, the new row is appended. In addition, when the table is 
	 * empty the row is inserted into a <tt>&lt;tbody&gt;</tt> which is created and 
	 * inserted into the table.</p>
	 * @param index The position at which the new row is to be inserted.
	 * @return A {@link JsHTMLTableRowElement} object representing the newly inserted row.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#INDEX_SIZE_ERR} 
	 * if the specified <tt>index</tt> is greater than or equal to the number of cells 
	 * or if the <tt>index</tt> is a negative number other than -1. See {@link Js#err(Object)} for 
	 * JS Simulation.
	 * @since 1.0
	 * @see #insertRow(NumberLike)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsHTMLTableRowElement insertRow(Number index) {
		return new JsHTMLTableRowElement(call(insertRow, index));
	}
	/**
	 * <p>Inserts a new empty row in the table at the specified position.</p>
	 * <p>The new row is inserted immediately before and in the same section as the 
	 * current <tt>index</tt>th row in the table. If <tt>index</tt> is -1 or equal to 
	 * the number of rows, the new row is appended. In addition, when the table is 
	 * empty the row is inserted into a <tt>&lt;tbody&gt;</tt> which is created and 
	 * inserted into the table.</p>
	 * @param index The position at which the new row is to be inserted.
	 * @return A {@link JsHTMLTableRowElement} object representing the newly inserted row.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#INDEX_SIZE_ERR} 
	 * if the specified <tt>index</tt> is greater than or equal to the number of cells 
	 * or if the <tt>index</tt> is a negative number other than -1. See {@link Js#err(Object)} for 
	 * JS Simulation.
	 * @since 1.0
	 * @see #insertRow(Number)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsHTMLTableRowElement insertRow(NumberLike<?> index) {
		return new JsHTMLTableRowElement(call(insertRow, index));
	}
}
