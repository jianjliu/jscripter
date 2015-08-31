
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
 * {@link JsClient#HTMLTableCellElement} class.</p>
 * <p>This class represents a table cell 
 * in an HTML page, or a {@link JsHTMLElement} object created with the HTML 
 * <tt>&lt;th&gt;</tt> or <tt>&lt;td&gt;</tt> tag.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsHTMLTableCellElement extends JsClient.HTMLTableCellElement.Prototype
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
	protected static abstract class Members extends JsClient.HTMLTableCellElement.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableCellElement#cellIndex
		 * @see JsHTMLTableCellElement.Member#cellIndex
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid cellIndex = id("cellIndex");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableCellElement#abbr
		 * @see JsHTMLTableCellElement.Member#abbr
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid abbr      = id("abbr"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableCellElement#align
		 * @see JsHTMLTableCellElement.Member#align
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid align     = id("align"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableCellElement#axis
		 * @see JsHTMLTableCellElement.Member#axis
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid axis      = id("axis"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableCellElement#bgColor
		 * @see JsHTMLTableCellElement.Member#bgColor
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid bgColor   = id("bgColor"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableCellElement#ch
		 * @see JsHTMLTableCellElement.Member#ch
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid ch        = id("ch"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableCellElement#chOff
		 * @see JsHTMLTableCellElement.Member#chOff
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid chOff     = id("chOff"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableCellElement#colSpan
		 * @see JsHTMLTableCellElement.Member#colSpan
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid colSpan   = id("colSpan"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableCellElement#headers
		 * @see JsHTMLTableCellElement.Member#headers
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid headers   = id("headers"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableCellElement#height
		 * @see JsHTMLTableCellElement.Member#height
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid height    = id("height"   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableCellElement#noWrap
		 * @see JsHTMLTableCellElement.Member#noWrap
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid noWrap    = id("noWrap"   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableCellElement#rowSpan
		 * @see JsHTMLTableCellElement.Member#rowSpan
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid rowSpan   = id("rowSpan"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableCellElement#scope
		 * @see JsHTMLTableCellElement.Member#scope
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid scope     = id("scope"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableCellElement#vAlign
		 * @see JsHTMLTableCellElement.Member#vAlign
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid vAlign    = id("vAlign"   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHTMLTableCellElement#width
		 * @see JsHTMLTableCellElement.Member#width
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid width     = id("width"    );
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
	public static class Member extends JsClient.HTMLTableCellElement.Prototype.Member
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
		public JsHTMLTableCellElement with(ObjectLike o) {
			return new JsHTMLTableCellElement(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
		 * object refers to a read-only integer value specifying the index of this cell 
		 * in the row, starting from 0. This index is in document tree order and not 
		 * display order.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member cellIndex = new Value.Number.Member(this, Members.cellIndex);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
		 * object refers to a string specifying an abbreviated form of the cell's content, 
		 * and may be rendered by browsers when appropriate in place of the cell's 
		 * content. Abbreviated names should be short since browsers may render them 
		 * repeatedly.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member abbr      = new Value.String.Member(this, Members.abbr     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
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
		public final Value.String.Member align     = new Value.String.Member(this, Members.align    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
		 * object refers to a string specifying a comma-separated list of category names. 
		 * This attribute may be used to place a cell into conceptual categories that 
		 * can be considered to form axes in an n-dimensional space. Browsers may give 
		 * users access to these categories, e.g., the user may query the browser for 
		 * all cells that belong to certain categories, the browser may present a table 
		 * in the form of a table of contents.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member axis      = new Value.String.Member(this, Members.axis     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
		 * object refers to a string specifying the background color for the table cell.</p>
		 * <p>This attribute is deprecated by HTML 4.01 and should be handled by style sheets.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member bgColor   = new Value.String.Member(this, Members.bgColor  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
		 * object refers to a string specifying a single character within a text fragment 
		 * to act as an axis for alignment. The default value for this attribute is the 
		 * decimal point character for the current language as set by the {@link JsHTMLElement#lang} 
		 * attribute, e.g., the period (".") in English and the comma (",") in French. 
		 * Browsers are not required to support this attribute by HTML 4.01.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member ch        = new Value.String.Member(this, Members.ch       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
		 * object refers to a string specifying, if specified, the offset to the first 
		 * occurrence of the alignment character on each line. If a line doesn't include 
		 * the alignment character, it should be horizontally shifted to end at the 
		 * alignment position.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member chOff     = new Value.String.Member(this, Members.chOff    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
		 * object refers to an integer value specifying the number of columns spanned 
		 * by the current cell. The default value of this attribute is one ("1"). The 
		 * value zero ("0") means that the cell spans all columns from the current 
		 * column to the last column of the column group in which the cell is defined.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member colSpan   = new Value.Number.Member(this, Members.colSpan  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
		 * object refers to a string specifying a space-separated list of cell names that 
		 * provide header information for the current data cell.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member headers   = new Value.String.Member(this, Members.headers  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
		 * object refers to a string specifying the height the current data cell.</p>
		 * <p>This attribute is deprecated by HTML 4.01 and should be handled by style sheets.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member height    = new Value.String.Member(this, Members.height   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
		 * object refers to an integer value specifying the number of rows spanned by 
		 * the current cell. The default value of this attribute is one ("1"). The value 
		 * zero ("0") means that the cell spans all rows from the current row to the 
		 * last row of the table section in which the cell is defined.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member rowSpan   = new Value.Number.Member(this, Members.rowSpan  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
		 * object refers to a string specifying a space-separated list of cell names that 
		 * the set of data cells for which the current header cell provides header information. 
		 * This attribute may be used in place of the {@link #headers} attribute, 
		 * particularly for simple tables. When specified, this attribute must have one 
		 * of the following values:
		 * <ul>
		 * <li><tt>"row"</tt>: The current cell provides header information for the rest of the row that contains it.</li>
		 * <li><tt>"col"</tt>: The current cell provides header information for the rest of the column that contains it.</li>
		 * <li><tt>"rowgroup"</tt>: The header cell provides header information for the rest of the row group that contains it.</li>
		 * <li><tt>"colgroup"</tt>: The header cell provides header information for the rest of the column group that contains it.</li>
		 * </ul>
		 * </p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member scope     = new Value.String.Member(this, Members.scope    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
		 * object refers to a string specifying the vertical position of data within a 
		 * cell. Possible values are:
		 * <ul>
		 * <li><tt>"top"</tt>: Cell data is flush with the top of the cell.</li>
		 * <li><tt>"middle"</tt>: Cell data is centered vertically within the cell. This is the default value.</li>
		 * <li><tt>"bottom"</tt>: Cell data is flush with the bottom of the cell.</li>
		 * <li><tt>"baseline"</tt>: All cells in the same row as a cell whose {@link #vAlign} 
		 * attribute has this value should have their textual data positioned so that 
		 * the first text line occurs on a baseline common to all cells in the row. 
		 * This constraint does not apply to subsequent text lines in these cells.</li>
		 * </ul></p>
		 * <p>This attribute is deprecated by HTML 4.01 and should be handled by style sheets.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member vAlign    = new Value.String.Member(this, Members.vAlign   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
		 * object refers to a string specifying the width the current data cell.</p>
		 * <p>This attribute is deprecated by HTML 4.01 and should be handled by style sheets.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member width     = new Value.String.Member(this, Members.width    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
		 * object refers to a boolean value specifying whether to disable automatic 
		 * text wrapping for this cell. Style sheets should be used instead of this 
		 * attribute to achieve wrapping effects. Note that, if used carelessly, this 
		 * attribute may result in excessively wide cells.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member noWrap = new Value.Boolean.Member(this, Members.noWrap);
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsHTMLTableCellElement(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
	 * object refers to a read-only integer value specifying the index of this cell 
	 * in the row, starting from 0. This index is in document tree order and not 
	 * display order.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member cellIndex = new Value.Number.Member(Members.cellIndex);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
	 * object refers to a string specifying an abbreviated form of the cell's content, 
	 * and may be rendered by browsers when appropriate in place of the cell's 
	 * content. Abbreviated names should be short since browsers may render them 
	 * repeatedly.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member abbr      = new Value.String.Member(Members.abbr     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
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
	public static final Value.String.Member align     = new Value.String.Member(Members.align    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
	 * object refers to a string specifying a comma-separated list of category names. 
	 * This attribute may be used to place a cell into conceptual categories that 
	 * can be considered to form axes in an n-dimensional space. Browsers may give 
	 * users access to these categories, e.g., the user may query the browser for 
	 * all cells that belong to certain categories, the browser may present a table 
	 * in the form of a table of contents.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member axis      = new Value.String.Member(Members.axis     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
	 * object refers to a string specifying the background color for the table cell.</p>
	 * <p>This attribute is deprecated by HTML 4.01 and should be handled by style sheets.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member bgColor   = new Value.String.Member(Members.bgColor  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
	 * object refers to a string specifying a single character within a text fragment 
	 * to act as an axis for alignment. The default value for this attribute is the 
	 * decimal point character for the current language as set by the {@link JsHTMLElement#lang} 
	 * attribute, e.g., the period (".") in English and the comma (",") in French. 
	 * Browsers are not required to support this attribute by HTML 4.01.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member ch        = new Value.String.Member(Members.ch       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
	 * object refers to a string specifying, if specified, the offset to the first 
	 * occurrence of the alignment character on each line. If a line doesn't include 
	 * the alignment character, it should be horizontally shifted to end at the 
	 * alignment position.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member chOff     = new Value.String.Member(Members.chOff    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
	 * object refers to an integer value specifying the number of columns spanned 
	 * by the current cell. The default value of this attribute is one ("1"). The 
	 * value zero ("0") means that the cell spans all columns from the current 
	 * column to the last column of the column group in which the cell is defined.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member colSpan   = new Value.Number.Member(Members.colSpan  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
	 * object refers to a string specifying a space-separated list of cell names that 
	 * provide header information for the current data cell.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member headers   = new Value.String.Member(Members.headers  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
	 * object refers to a string specifying the height the current data cell.</p>
	 * <p>This attribute is deprecated by HTML 4.01 and should be handled by style sheets.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member height    = new Value.String.Member(Members.height   );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
	 * object refers to an integer value specifying the number of rows spanned by 
	 * the current cell. The default value of this attribute is one ("1"). The value 
	 * zero ("0") means that the cell spans all rows from the current row to the 
	 * last row of the table section in which the cell is defined.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member rowSpan   = new Value.Number.Member(Members.rowSpan  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
	 * object refers to a string specifying a space-separated list of cell names that 
	 * the set of data cells for which the current header cell provides header information. 
	 * This attribute may be used in place of the {@link #headers} attribute, 
	 * particularly for simple tables. When specified, this attribute must have one 
	 * of the following values:
	 * <ul>
	 * <li><tt>"row"</tt>: The current cell provides header information for the rest of the row that contains it.</li>
	 * <li><tt>"col"</tt>: The current cell provides header information for the rest of the column that contains it.</li>
	 * <li><tt>"rowgroup"</tt>: The header cell provides header information for the rest of the row group that contains it.</li>
	 * <li><tt>"colgroup"</tt>: The header cell provides header information for the rest of the column group that contains it.</li>
	 * </ul>
	 * </p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member scope     = new Value.String.Member(Members.scope    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
	 * object refers to a string specifying the vertical position of data within a 
	 * cell. Possible values are:
	 * <ul>
	 * <li><tt>"top"</tt>: Cell data is flush with the top of the cell.</li>
	 * <li><tt>"middle"</tt>: Cell data is centered vertically within the cell. This is the default value.</li>
	 * <li><tt>"bottom"</tt>: Cell data is flush with the bottom of the cell.</li>
	 * <li><tt>"baseline"</tt>: All cells in the same row as a cell whose {@link #vAlign} 
	 * attribute has this value should have their textual data positioned so that 
	 * the first text line occurs on a baseline common to all cells in the row. 
	 * This constraint does not apply to subsequent text lines in these cells.</li>
	 * </ul></p>
	 * <p>This attribute is deprecated by HTML 4.01 and should be handled by style sheets.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member vAlign    = new Value.String.Member(Members.vAlign   );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
	 * object refers to a string specifying the width the current data cell.</p>
	 * <p>This attribute is deprecated by HTML 4.01 and should be handled by style sheets.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member width     = new Value.String.Member(Members.width    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHTMLTableCellElement} 
	 * object refers to a boolean value specifying whether to disable automatic 
	 * text wrapping for this cell. Style sheets should be used instead of this 
	 * attribute to achieve wrapping effects. Note that, if used carelessly, this 
	 * attribute may result in excessively wide cells.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member noWrap = new Value.Boolean.Member(Members.noWrap);

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
	public JsHTMLTableCellElement valueOf() {
		return new JsHTMLTableCellElement((JsObject)var().valueOf());
	}
}
