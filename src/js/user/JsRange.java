
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
 * {@link JsClient#Range} class.</p>
 * <p>A {@link JsRange} object represents a contiguous range or region of a document, 
 * such as the region that the user might select with a mouse drag in a web browser 
 * window. If an implementation supports the <tt>Range</tt> module, the {@link JsDocument} 
 * object defines a {@link JsDocument#createRange()} method that you can call to create 
 * a new {@link JsRange} object. Be careful, however, IE defines an incompatible 
 * {@link JsDocument#createRange()} method that returns a nonstandard object similar to, 
 * but not compatible with, this class. This class defines a number of methods for 
 * specifying a selected region of a document and several more methods for implementing 
 * cut-and-paste operations on the selected region.</p>
 * <p>A range has two boundary points: a start point and an end point. Each boundary 
 * point is specified by a combination of a node and an offset within that node. The 
 * node is typically an {@link JsElement}, {@link JsDocument}, or {@link JsText} node. 
 * For {@link JsElement} and {@link JsDocument} nodes, the offset refers to the children 
 * of that node. An offset of 0 specifies a boundary point before the first child of the 
 * node. An offset of 1 specifies a boundary point after the first child and before the 
 * second child. If the boundary node is a {@link JsText} node, however, the offset 
 * specifies a position between two characters of that text.</p>
 * <p>The properties of a {@link JsRange} object provide a way to obtain boundary nodes 
 * and offsets of the range. The methods of the class provide a number of ways to set 
 * the boundaries of a range. Note that the boundaries of a range may be set to nodes 
 * within a {@link JsDocument} or a {@link JsDocumentFragment}.</p>
 * <p>Once the boundary points of a range are defined, you can use {@link #deleteContents()}, 
 * {@link #extractContents()}, {@link #cloneContents()}, and {@link #insertNode(JsNode)} 
 * to implement cut, copy, and paste operations.</p>
 * <p>When a document is altered by insertion or deletion, all {@link JsRange} objects 
 * that represent portions of that document are altered, if necessary, so that their 
 * boundary points remain valid and they represent as closely as possible the same 
 * document content.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see JsDocument#createRange()
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsRange extends JsClient.Range.Prototype
{
	/**
	 * Compares the start of the specified range to the start of this range. 
	 * This constant number is a legal value for the <tt>how</tt> argument to the 
	 * {@link #compareBoundaryPoints(Number, JsRange)} method specifying how the 
	 * boundary points of two {@link JsRange} objects are compared.
	 * @since 1.0
	 * @see js.dom.DOM2Range.Range#START_TO_START
	 * @see js.dom.DOM2Range.Range.Member#START_TO_START
	 */
	public static final int START_TO_START = 0;
	/**
	 * Compares the start of the specified range to the end of this range. 
	 * This constant number is a legal value for the <tt>how</tt> argument to the 
	 * {@link #compareBoundaryPoints(Number, JsRange)} method specifying how the 
	 * boundary points of two {@link JsRange} objects are compared.
	 * @since 1.0
	 * @see js.dom.DOM2Range.Range#START_TO_END
	 * @see js.dom.DOM2Range.Range.Member#START_TO_END
	 */
	public static final int START_TO_END = 1;
	/**
	 * Compares the end of the specified range to the end of this range. 
	 * This constant number is a legal value for the <tt>how</tt> argument to the 
	 * {@link #compareBoundaryPoints(Number, JsRange)} method specifying how the 
	 * boundary points of two {@link JsRange} objects are compared.
	 * @since 1.0
	 * @see js.dom.DOM2Range.Range#END_TO_END
	 * @see js.dom.DOM2Range.Range.Member#END_TO_END
	 */
	public static final int END_TO_END = 2;
	/**
	 * Compares the end of the specified range to the start of this range. 
	 * This constant number is a legal value for the <tt>how</tt> argument to the 
	 * {@link #compareBoundaryPoints(Number, JsRange)} method specifying how the 
	 * boundary points of two {@link JsRange} objects are compared.
	 * @since 1.0
	 * @see js.dom.DOM2Range.Range#END_TO_START
	 * @see js.dom.DOM2Range.Range.Member#END_TO_START
	 */
	public static final int END_TO_START = 3;

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
	protected static abstract class Members extends JsClient.Range.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * <p>The property, identified by this member, of a {@link JsRange} object 
		 * refers to a read-only boolean value which is <tt>true</tt> if the start and 
		 * the end of the range are at the same point in the document, that is, if the 
		 * range is empty or collapsed.</p> 
		 * @since 1.0
		 * @see JsRange#collapsed
		 * @see JsRange.Member#collapsed
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid collapsed                = id("collapsed"               );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsRange#commonAncestorContainer
		 * @see JsRange.Member#commonAncestorContainer
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid commonAncestorContainer  = id("commonAncestorContainer" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsRange#endContainer
		 * @see JsRange.Member#endContainer
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid endContainer             = id("endContainer"            );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsRange#endOffset
		 * @see JsRange.Member#endOffset
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid endOffset                = id("endOffset"               );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsRange#startContainer
		 * @see JsRange.Member#startContainer
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid startContainer           = id("startContainer"          );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsRange#startOffset
		 * @see JsRange.Member#startOffset
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid startOffset              = id("startOffset"             );
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
	public static class Member extends JsClient.Range.Prototype.Member
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
		public JsRange with(ObjectLike o) {
			return new JsRange(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsRange} object 
		 * refers to a read-only boolean value which is <tt>true</tt> if the start and 
		 * the end of the range are at the same point in the document, that is, if the 
		 * range is empty or collapsed.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member collapsed = new Value.Boolean.Member(this, Members.collapsed);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsRange} object is a 
		 * read-only reference to the most deeply nested {@link JsDocument} node that 
		 * contains, that is, is an ancestor of, both the start and end points of the 
		 * range.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsNode.Member commonAncestorContainer = new JsNode.Member(this, Members.commonAncestorContainer);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsRange} object is a 
		 * read-only reference to the {@link JsDocument} node that contains the end 
		 * point of the range.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsNode.Member endContainer = new JsNode.Member(this, Members.endContainer);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsRange} object 
		 * refers to a read-only number that specifies the position of the range's 
		 * ending point within {@link #endContainer}.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member endOffset = new Value.Number.Member(this, Members.endOffset);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsRange} object is a 
		 * read-only reference to the {@link JsDocument} node that contains the starting 
		 * point of the range.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsNode.Member startContainer = new JsNode.Member(this, Members.startContainer);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsRange} object 
		 * refers to a read-only number that specifies the position of the range's 
		 * starting point within {@link #startContainer}.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member startOffset = new Value.Number.Member(this, Members.startOffset);
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsRange(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsRange} object 
	 * refers to a read-only boolean value which is <tt>true</tt> if the start and 
	 * the end of the range are at the same point in the document, that is, if the 
	 * range is empty or collapsed.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member collapsed = new Value.Boolean.Member(Members.collapsed);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsRange} object is a 
	 * read-only reference to the most deeply nested {@link JsDocument} node that 
	 * contains, that is, is an ancestor of, both the start and end points of the 
	 * range.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsNode.Member commonAncestorContainer = new JsNode.Member(Members.commonAncestorContainer);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsRange} object is a 
	 * read-only reference to the {@link JsDocument} node that contains the end 
	 * point of the range.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsNode.Member endContainer = new JsNode.Member(Members.endContainer);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsRange} object 
	 * refers to a read-only number that specifies the position of the range's 
	 * ending point within {@link #endContainer}.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member endOffset = new Value.Number.Member(Members.endOffset);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsRange} object is a 
	 * read-only reference to the {@link JsDocument} node that contains the starting 
	 * point of the range.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsNode.Member startContainer = new JsNode.Member(Members.startContainer);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsRange} object 
	 * refers to a read-only number that specifies the position of the range's 
	 * starting point within {@link #startContainer}.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member startOffset = new Value.Number.Member(Members.startOffset);

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
	public JsRange valueOf() {
		return new JsRange((JsObject)var().valueOf());
	}
	public final JsNode var(JsNode.Member r) {
		return r.with(this);
	}

	/**
	 * <p>Gets a new {@link JsDocumentFragment} object that contains a copy of the 
	 * document content within this range.</p>
	 * <p>This method duplicates the contents of this range and returns the results in 
	 * a {@link JsDocumentFragment} object.</p>
	 * @return A new {@link JsDocumentFragment} object that contains a copy of the 
	 * region of the document represented by this range.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#HIERARCHY_REQUEST_ERR} 
	 * if this range includes a {@link JsDocumentFragment} node. See {@link Js#err(Object)} 
	 * for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsDocumentFragment cloneContents() {
		return new JsDocumentFragment(call(cloneContents));
	}
	/**
	 * <p>Creates a new {@link JsRange} object that represents the same region of the 
	 * document as this one.</p>
	 * @return A new {@link JsRange} object that has the same boundary points as this 
	 * range.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsRange cloneRange() {
		return new JsRange(call(cloneRange));
	}
	/**
	 * <p>Collapses this range so that one boundary point is the same as the other.</p>
	 * <p>This method sets one boundary point of the range to be the same as the other 
	 * point. The point to be modified is specified by the <tt>toStart</tt> argument. 
	 * After this method returns, the range is said to be collapsed: it represents a 
	 * single point within a document and has no content. When a range is collapsed like 
	 * this, its collapsed property is <tt>true</tt>.</p>
	 * @param toStart If this argument is <tt>true</tt>, the method sets the end point 
	 * of the range to the same value as the starting point. Otherwise, it sets the 
	 * starting point to the same value as the end point.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void collapse(Boolean toStart) {
		call(collapse, toStart);
	}
	/**
	 * <p>Collapses this range so that one boundary point is the same as the other.</p>
	 * <p>This method sets one boundary point of the range to be the same as the other 
	 * point. The point to be modified is specified by the <tt>toStart</tt> argument. 
	 * After this method returns, the range is said to be collapsed: it represents a 
	 * single point within a document and has no content. When a range is collapsed like 
	 * this, its collapsed property is <tt>true</tt>.</p>
	 * @param toStart If this argument is <tt>true</tt>, the method sets the end point 
	 * of the range to the same value as the starting point. Otherwise, it sets the 
	 * starting point to the same value as the end point.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void collapse(Value<Boolean> toStart) {
		collapse(Js.valueOf(toStart));
	}
	/**
	 * <p>Collapses this range so that one boundary point is the same as the other.</p>
	 * <p>This method sets one boundary point of the range to be the same as the other 
	 * point. The point to be modified is specified by the <tt>toStart</tt> argument. 
	 * After this method returns, the range is said to be collapsed: it represents a 
	 * single point within a document and has no content. When a range is collapsed like 
	 * this, its collapsed property is <tt>true</tt>.</p>
	 * @param toStart If this argument is <tt>true</tt>, the method sets the end point 
	 * of the range to the same value as the starting point. Otherwise, it sets the 
	 * starting point to the same value as the end point.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void collapse(JsBoolean toStart) {
		collapse(Js.valueOf(toStart));
	}
	/**
	 * <p>Compares a boundary point of the specified range to a boundary point of this 
	 * range and returns -1, 0, or 1 depending on their order, with the first argument, 
	 * which must be one of the static constants defined in this class, defining which 
	 * points to compare.</p>
	 * <p>This method compares a boundary point of this range to a boundary point of the 
	 * specified <tt>sourceRange</tt> and returns a value that specifies their relative 
	 * order in the document source. The <tt>how</tt> argument specifies which boundary 
	 * points of each range are to be compared. The legal values for this argument, and 
	 * their meanings, are as follows:
	 * <ul>
	 * <li>{@link #START_TO_START}: Compares the start points of the two {@link JsRange} nodes.</li>
	 * <li>{@link #END_TO_END}: Compares the end points of the two {@link JsRange} nodes.</li>
	 * <li>{@link #START_TO_END}: Compares the start point of <tt>sourceRange</tt> to the end point of this range.</li>
	 * <li>{@link #END_TO_START}: Compares the end point of <tt>sourceRange</tt> to the start point of this range.</li>
	 * </ul>
	 * </p>
	 * <p>The return value of this method is a number that specifies the relative position of this range to the specified sourceRange. Therefore, you might expect the range constants for the how argument to specify the boundary point for this range first and the boundary point for sourceRange second. Counterintuitively, however, the Range.START_TO_END constant specifies a comparison of the end point of this range with the start point of the specified sourceRange. Similarly, the Range.END_TO_START constant specifies a comparison of the start point of this range with the end point of the specified range</p>
	 * @param how Specifies how to perform the comparison, that is, which boundary points 
	 * to compare. Legal values are the static constants defined by this class. 
	 * @param sourceRange The range that is to be compared to this range. 
	 * @return The value -1 if the specified boundary point of this range is before the 
	 * specified boundary point of <tt>sourceRange</tt>, 0 if the two specified boundary 
	 * points are the same, or 1 if the specified boundary point of this range is after 
	 * the specified boundary point of <tt>sourceRange</tt>.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#WRONG_DOCUMENT_ERR} 
	 * if <tt>sourceRange</tt> represents a range of a different document than this 
	 * range does. See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number compareBoundaryPoints(Number how, JsRange sourceRange) {
		return call(compareBoundaryPoints, new Vars<Object>().add(how).add(sourceRange));
	}
	/**
	 * <p>Returns a document fragment.</p>
	 * <p>This method takes a string and uses browser's parser to convert it to a DOM 
	 * tree.</p>
	 * <p>This method is not part of a specification. It's from Gecko DOM Reference of MDC.</p>
	 * @param tagString Text that contains text and tags to be converted to a document 
	 * fragment. 
	 * @return The converted document fragment.
	 * @since 1.0
	 * @see JsNode#insertAdjacentHTML(String, String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsDocumentFragment createContextualFragment(String tagString) {
		return new JsDocumentFragment(call(createContextualFragment, tagString));
	}
	/**
	 * <p>Returns a document fragment.</p>
	 * <p>This method takes a string and uses browser's parser to convert it to a DOM 
	 * tree.</p>
	 * <p>This method is not part of a specification. It's from Gecko DOM Reference of MDC.</p>
	 * @param tagString Text that contains text and tags to be converted to a document 
	 * fragment. 
	 * @return The converted document fragment.
	 * @since 1.0
	 * @see JsNode#insertAdjacentHTML(String, String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsDocumentFragment createContextualFragment(StringLike tagString) {
		return createContextualFragment(Js.valueOf(tagString));
	}
	/**
	 * <p>Deletes the region of the document represented by this range.</p>
	 * <p>This method deletes all document content represented by this range. When it 
	 * returns, the range is collapsed with both boundary points at the start position. 
	 * Note that the deletion may result in adjacent {@link JsText} nodes that can be 
	 * merged with a call to {@link JsNode#normalize()}.</p>
	 * <p>See {@link #cloneContents()} for a way to copy document content and {@link #extractContents()} 
	 * for a way to copy and delete document content in a single operation.</p>
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if any portion of the document that is represented by this range is read-only. 
	 * See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see JsNode#normalize()
	 * @see #cloneContents()
	 * @see #extractContents()
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void deleteContents() {
		call(deleteContents);
	}
	/**
	 * <p>Tells the implementation that this range will no longer be used and that it 
	 * can stop keeping track of it.</p>
	 * <p>If you call this method for a range, subsequent method calls or property 
	 * lookups on that range throw a {@link JsDOMException} error with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#INVALID_STATE_ERR}.</p>
	 * <p>DOM implementations keep track of all {@link JsRange} objects created for a 
	 * document because they may need to change the range boundary points when the 
	 * document is modified. When you are certain that a {@link JsRange} object isn't 
	 * needed any more, call this method to tell the implementation that it no longer 
	 * needs to keep track of that range. Note that once this method has been called 
	 * for a {@link JsRange} object, any use of that range throws an exception. Calling 
	 * this method is not required but may improve performance in some circumstances 
	 * when the document is being modified. A {@link JsRange} object is not subject to 
	 * immediate garbage collection.</p>
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#INVALID_STATE_ERR} 
	 * if it is called on a {@link JsRange} object that has already been detached like 
	 * all {@link JsRange} methods. See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void detach() {
		call(detach);
	}
	/**
	 * <p>Deletes the region of the document represented by this range, but returns the 
	 * contents of that region as a {@link JsDocumentFragment} object, like a combination 
	 * of {@link #cloneContents()} and {@link #deleteContents()}.</p>
	 * <p>This method deletes the specified range of a document and returns a {@link JsDocumentFragment} 
	 * node that contains the deleted content. When this method returns, the range is 
	 * collapsed, and the document may contain adjacent {@link JsText} nodes which can 
	 * be merged with {@link JsNode#normalize()}.</p>
	 * @return A {@link JsDocumentFragment} node that contains the contents of this range.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if any part of the document content to be extracted is read-only or the value {@link JsDOMException#HIERARCHY_REQUEST_ERR} 
	 * if the range contains a {@link JsDocumentType} node. See {@link Js#err(Object)} 
	 * for JS Simulation.
	 * @since 1.0
	 * @see #cloneContents()
	 * @see #extractContents()
	 * @see JsNode#normalize()
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsDocumentFragment extractContents() {
		return new JsDocumentFragment(call(extractContents));
	}
	/**
	 * <p>Inserts the specified node into the document at the start point of the range.</p>
	 * <p>This method inserts the specified node and all its descendants into the document 
	 * at the start position of this range. When it returns, this range includes the 
	 * newly inserted node. If <tt>newNode</tt> is already part of the document, it is 
	 * removed from its current position and then reinserted at the start of the range. 
	 * If <tt>newNode</tt> is a {@link JsDocumentFragment} node, it is not inserted 
	 * itself, but all of its children are inserted, in order, at the start of the range</p>
	 * <p>If the node that contains the start of the range is a {@link JsText} node, it 
	 * is split into two adjacent nodes before the insertion takes place. If <tt>newNode</tt> 
	 * is a {@link JsText} node, it is not merged with any adjacent {@link JsText} nodes 
	 * after it is inserted. To merge adjacent {@link JsText} nodes, call {@link JsNode#normalize()}.</p>
	 * @param newNode The node to be inserted into the document.
	 * @throws RuntimeException JavaScript throws a {@link JsRangeException} object with 
	 * the {@link JsRangeException#code} property of the value {@link JsRangeException#INVALID_NODE_TYPE_ERR} 
	 * if <tt>newNode</tt> is an {@link JsAttr}, {@link JsDocument}, {@link JsEntity}, or {@link JsNotation} 
	 * node, or a {@link JsDOMException} object with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#HIERARCHY_REQUEST_ERR} if the node 
	 * that contains the start of the range does not allow children, it does not allow 
	 * children of the specified type, or <tt>newNode</tt> is an ancestor of that node, 
	 * the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} if the node that 
	 * contains the start of the range or any of its ancestors is read-only, or the 
	 * value {@link JsDOMException#WRONG_DOCUMENT_ERR} if <tt>newNode</tt> is part of a 
	 * different document than the range is. See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see JsNode#normalize()
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void insertNode(JsNode newNode) {
		call(insertNode, newNode);
	}
	/**
	 * <p>Sets the boundary points of this range so that it contains the specified node 
	 * and all of its descendants.</p>
	 * <p>This method sets the contents of this range to the specified <tt>refNode</tt>, 
	 * that is, it selects the node and its descendants.</p>
	 * @param refNode The node to be selected, that is, the node that is to become the 
	 * content of this range.
	 * @throws RuntimeException JavaScript throws a {@link JsRangeException} object with 
	 * the {@link JsRangeException#code} property of the value {@link JsRangeException#INVALID_NODE_TYPE_ERR} 
	 * if <tt>refNode</tt> is an {@link JsAttr}, {@link JsDocument}, or {@link JsDocumentFragment} 
	 * node, or a {@link JsDOMException} object with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#WRONG_DOCUMENT_ERR} if <tt>refNode</tt> 
	 * is part of a different document than the one through which this range was created. 
	 * See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see #selectNodeContents(JsNode)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void selectNode(JsNode refNode) {
		call(selectNode, refNode);
	}
	/**
	 * <p>Sets the boundary points of this range so that it contains all the descendants 
	 * of the specified node but not the node itself.</p>
	 * <p>This method sets the boundary points of this range so that the range contains 
	 * the children of <tt>refNode</tt>.</p>
	 * @param refNode The node whose children are to become the contents of this range.
	 * @throws RuntimeException JavaScript throws a {@link JsRangeException} object with 
	 * the {@link JsRangeException#code} property of the value {@link JsRangeException#INVALID_NODE_TYPE_ERR} 
	 * if <tt>refNode</tt> or one of its ancestors is a {@link JsDocumentType}, {@link JsEntity}, 
	 * or {@link JsNotation} node, or a {@link JsDOMException} object with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#WRONG_DOCUMENT_ERR} if <tt>refNode</tt> 
	 * is part of a different document than the one through which this range was created. 
	 * See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see #selectNode(JsNode)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void selectNodeContents(JsNode refNode) {
		call(selectNodeContents, refNode);
	}
	/**
	 * <p>Sets the end point of this range to immediately after the specified node.</p>
	 * <p>This method sets the end point of a range by specifying the values of the 
	 * {@link #endContainer} and {@link #endOffset} properties.</p>
	 * @param refNode The node that contains the new end point.
	 * @param offset The position of the end point within <tt>refNode</tt>.
	 * @throws RuntimeException JavaScript throws a {@link JsRangeException} object with 
	 * the {@link JsRangeException#code} property of the value {@link JsRangeException#INVALID_NODE_TYPE_ERR} 
	 * if <tt>refNode</tt> or one of its ancestors is a {@link JsDocumentType} node, or 
	 * a {@link JsDOMException} object with the {@link JsDOMException#code} property of 
	 * the value {@link JsDOMException#WRONG_DOCUMENT_ERR} if <tt>refNode</tt> is part 
	 * of a different document than the one through which this range was created or the 
	 * value {@link JsDOMException#INDEX_SIZE_ERR} if <tt>offset</tt> is negative or is 
	 * greater than the number of children or characters in <tt>refNode</tt>. 
	 * See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void setEnd(JsNode refNode, Number offset) {
		call(setEnd, new Vars<Object>().add(refNode).add(offset));
	}
	/**
	 * <p>Sets the end point of this range to immediately after the specified node.</p>
	 * <p>This method sets the end point of this range to fall immediately after the 
	 * specified <tt>refNode</tt>.</p>
	 * @param refNode The node after which the end point of the range is to be set.
	 * @throws RuntimeException JavaScript throws a {@link JsRangeException} object with 
	 * the {@link JsRangeException#code} property of the value {@link JsRangeException#INVALID_NODE_TYPE_ERR} 
	 * if <tt>refNode</tt> is a {@link JsAttr}, {@link JsDocument} or {@link JsDocumentType} 
	 * node, or the root container of <tt>refNode</tt> is not a {@link JsAttr}, {@link JsDocument} 
	 * or {@link JsDocumentType} node, or a {@link JsDOMException} object with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#WRONG_DOCUMENT_ERR} if <tt>refNode</tt> 
	 * is part of a different document than the one through which this range was created. 
	 * See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void setEndAfter(JsNode refNode) {
		call(setEndAfter, refNode);
	}
	/**
	 * <p>Sets the end point of this range to immediately before the specified node.</p>
	 * <p>This method sets the end point of this range to fall immediately before the 
	 * specified <tt>refNode</tt>.</p>
	 * @param refNode The node before which the end point of the range is to be set.
	 * @throws RuntimeException JavaScript throws a {@link JsRangeException} object with 
	 * the {@link JsRangeException#code} property of the value {@link JsRangeException#INVALID_NODE_TYPE_ERR} 
	 * if <tt>refNode</tt> is a {@link JsAttr}, {@link JsDocument} or {@link JsDocumentType} 
	 * node, or the root container of <tt>refNode</tt> is not a {@link JsAttr}, {@link JsDocument} 
	 * or {@link JsDocumentType} node, or a {@link JsDOMException} object with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#WRONG_DOCUMENT_ERR} if <tt>refNode</tt> 
	 * is part of a different document than the one through which this range was created. 
	 * See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void setEndBefore(JsNode refNode) {
		call(setEndBefore, refNode);
	}
	/**
	 * <p>Sets the start position of this range to the specified offset within the specified node.</p>
	 * <p>This method sets the end point of a range by specifying the values of the 
	 * {@link #startContainer} and {@link #startOffset} properties.</p>
	 * @param refNode The node that contains the new start point.
	 * @param offset The position of the end point within <tt>refNode</tt>.
	 * @throws RuntimeException JavaScript throws a {@link JsRangeException} object with 
	 * the {@link JsRangeException#code} property of the value {@link JsRangeException#INVALID_NODE_TYPE_ERR} 
	 * if <tt>refNode</tt> or one of its ancestors is a {@link JsDocumentType} node, or 
	 * a {@link JsDOMException} object with the {@link JsDOMException#code} property of 
	 * the value {@link JsDOMException#WRONG_DOCUMENT_ERR} if <tt>refNode</tt> is part 
	 * of a different document than the one through which this range was created or the 
	 * value {@link JsDOMException#INDEX_SIZE_ERR} if <tt>offset</tt> is negative or is 
	 * greater than the number of children or characters in <tt>refNode</tt>. 
	 * See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void setStart(JsNode refNode, Number offset) {
		call(setStart, new Vars<Object>().add(refNode).add(offset));
	}
	/**
	 * <p>Sets the start position of this range to immediately after the specified node.</p>
	 * <p>This method sets the start point of this range to fall immediately after the 
	 * specified <tt>refNode</tt>.</p>
	 * @param refNode The node after which the start point of the range is to be set.
	 * @throws RuntimeException JavaScript throws a {@link JsRangeException} object with 
	 * the {@link JsRangeException#code} property of the value {@link JsRangeException#INVALID_NODE_TYPE_ERR} 
	 * if <tt>refNode</tt> is a {@link JsAttr}, {@link JsDocument} or {@link JsDocumentType} 
	 * node, or the root container of <tt>refNode</tt> is not a {@link JsAttr}, {@link JsDocument} 
	 * or {@link JsDocumentType} node, or a {@link JsDOMException} object with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#WRONG_DOCUMENT_ERR} if <tt>refNode</tt> 
	 * is part of a different document than the one through which this range was created. 
	 * See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void setStartAfter(JsNode refNode) {
		call(setStartAfter, refNode);
	}
	/**
	 * <p>Sets the start position of this range to immediately before the specified node.</p>
	 * <p>This method sets the start point of this range to fall immediately before the 
	 * specified <tt>refNode</tt>.</p>
	 * @param refNode The node before which the start point of the range is to be set.
	 * @throws RuntimeException JavaScript throws a {@link JsRangeException} object with 
	 * the {@link JsRangeException#code} property of the value {@link JsRangeException#INVALID_NODE_TYPE_ERR} 
	 * if <tt>refNode</tt> is a {@link JsAttr}, {@link JsDocument} or {@link JsDocumentType} 
	 * node, or the root container of <tt>refNode</tt> is not a {@link JsAttr}, {@link JsDocument} 
	 * or {@link JsDocumentType} node, or a {@link JsDOMException} object with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#WRONG_DOCUMENT_ERR} if <tt>refNode</tt> 
	 * is part of a different document than the one through which this range was created. 
	 * See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void setStartBefore(JsNode refNode) {
		call(setStartBefore, refNode);
	}
	/**
	 * <p>Inserts the specified node into the document at the start position of the 
	 * range and then re-parents all the nodes within the range so that they become 
	 * descendants of the newly inserted node.</p>
	 * <p>This method re-parents the contents of this range to <tt>newParent</tt> and 
	 * then inserts <tt>newParent</tt> into the document at the start position of the 
	 * range. It is useful to place a region of document content within a <tt>&lt;div&gt;</tt> 
	 * or <tt>&lt;span&gt;</tt> element.</p>
	 * <p>If <tt>newParent</tt>  is already part of the document, it is first removed 
	 * from the document, and any children it has are discarded. When this method 
	 * returns, this range begins immediately before <tt>newParent</tt>  and ends 
	 * immediately after it.</p>
	 * @param newParent The node that is to become the new parent of the contents of 
	 * this range.
	 * @throws RuntimeException JavaScript throws a {@link JsRangeException} object with 
	 * the {@link JsRangeException#code} property of the value {@link JsRangeException#INVALID_NODE_TYPE_ERR} 
	 * if <tt>newParent</tt> is a {@link JsAttr}, {@link JsDocument}, {@link JsDocumentFragment}, 
	 * {@link JsDocumentType}, {@link JsEntity}, {@link JsNotation} node, or the value {@link JsRangeException#BAD_BOUNDARYPOINTS_ERR} 
	 * if the range partially selects a node other than a {@link JsText} node, so the 
	 * region of the document it represents cannot be surrounded, or a {@link JsDOMException} 
	 * object with the {@link JsDOMException#code} property of the value {@link JsDOMException#WRONG_DOCUMENT_ERR} 
	 * if <tt>newParent</tt> and this range were created using different {@link JsDocument} 
	 * objects, the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} if an 
	 * ancestor of a boundary point of the range is read-only and does not allow 
	 * insertions, or the value {@link JsDOMException#HIERARCHY_REQUEST_ERR} if the 
	 * container node of the start of the range does not allow children or does not 
	 * allow children of the type of <tt>newParent</tt> or <tt>newParent</tt> is an 
	 * ancestor of that container node. See {@link Js#err(Object)} for JS Simulation.
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void surroundContents(JsNode newParent) {
		call(surroundContents, newParent);
	}
}
