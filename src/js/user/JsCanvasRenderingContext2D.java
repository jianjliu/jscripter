
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
 * <p>An <b>opaque</b> class representing client-side objects of the JavaScript global 
 * {@link JsClient#CanvasRenderingContext2D} class.</p>
 * <p>An object of this type provides a set of graphics functions to draw on a canvas.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsCanvasRenderingContext2D extends JsClient.CanvasRenderingContext2D.Prototype
{
	/**
	 * <p>Draws only the new shape, removing everything else.</p>
	 * <p>This constant is a legal value for the {@link #globalCompositeOperation} property 
	 * of a {@link JsCanvasRenderingContext2D} object indicating how colors being drawn 
	 * are combined with colors that already exist on the canvas.</p>
	 * @since 1.0
	 */
	public final static String COMPOSITE_COPY             = "copy";
	/**
	 * <p>Where both shapes overlap, the color is determined by subtracting color values.</p>
	 * <p>This constant is a legal value for the {@link #globalCompositeOperation} property 
	 * of a {@link JsCanvasRenderingContext2D} object indicating how colors being drawn 
	 * are combined with colors that already exist on the canvas.</p>
	 * @since 1.0
	 */
	public final static String COMPOSITE_DARKER           = "darker";
	/**
	 * <p>Existing content is kept only where it overlaps the new shape. The new shape is drawn behind the content.</p>
	 * <p>This constant is a legal value for the {@link #globalCompositeOperation} property 
	 * of a {@link JsCanvasRenderingContext2D} object indicating how colors being drawn 
	 * are combined with colors that already exist on the canvas.</p>
	 * @since 1.0
	 */
	public final static String COMPOSITE_DESTINATION_ATOP = "destination-atop";
	/**
	 * <p>Existing content is kept where both the new shape and existing canvas content overlap. Everything else is made transparent.</p>
	 * <p>This constant is a legal value for the {@link #globalCompositeOperation} property 
	 * of a {@link JsCanvasRenderingContext2D} object indicating how colors being drawn 
	 * are combined with colors that already exist on the canvas.</p>
	 * @since 1.0
	 */
	public final static String COMPOSITE_DESTINATION_IN   = "destination-in";
	/**
	 * <p>Existing content is kept where it doesn't overlap the new shape. Everything else is made transparent.</p>
	 * <p>This constant is a legal value for the {@link #globalCompositeOperation} property 
	 * of a {@link JsCanvasRenderingContext2D} object indicating how colors being drawn 
	 * are combined with colors that already exist on the canvas.</p>
	 * @since 1.0
	 */
	public final static String COMPOSITE_DESTINATION_OUT  = "destination-out";
	/**
	 * <p>The new shape is drawn behind existing content.</p>
	 * <p>This constant is a legal value for the {@link #globalCompositeOperation} property 
	 * of a {@link JsCanvasRenderingContext2D} object indicating how colors being drawn 
	 * are combined with colors that already exist on the canvas.</p>
	 * @since 1.0
	 */
	public final static String COMPOSITE_DESTINATION_OVER = "destination-over";
	/**
	 * <p>Where both shapes overlap, the color is determined by adding the two color values.</p>
	 * <p>This constant is a legal value for the {@link #globalCompositeOperation} property 
	 * of a {@link JsCanvasRenderingContext2D} object indicating how colors being drawn 
	 * are combined with colors that already exist on the canvas.</p>
	 * @since 1.0
	 */
	public final static String COMPOSITE_LIGHTER          = "lighter";
	/**
	 * <p>The new shape is drawn only where it overlaps existing content.</p>
	 * <p>This constant is a legal value for the {@link #globalCompositeOperation} property 
	 * of a {@link JsCanvasRenderingContext2D} object indicating how colors being drawn 
	 * are combined with colors that already exist on the canvas.</p>
	 * @since 1.0
	 */
	public final static String COMPOSITE_SOURCE_ATOP      = "source-atop";
	/**
	 * <p>The new shape is drawn only where both the new shape and existing content overlap. Everything else is made transparent.</p>
	 * <p>This constant is a legal value for the {@link #globalCompositeOperation} property 
	 * of a {@link JsCanvasRenderingContext2D} object indicating how colors being drawn 
	 * are combined with colors that already exist on the canvas.</p>
	 * @since 1.0
	 */
	public final static String COMPOSITE_SOURCE_IN        = "source-in";
	/**
	 * <p>The new shape is drawn where it doesn't overlap existing content.</p>
	 * <p>This constant is a legal value for the {@link #globalCompositeOperation} property 
	 * of a {@link JsCanvasRenderingContext2D} object indicating how colors being drawn 
	 * are combined with colors that already exist on the canvas.</p>
	 * @since 1.0
	 */
	public final static String COMPOSITE_SOURCE_OUT       = "source-out";
	/**
	 * <p>The new shape is drawn on top of existing content. This is the default behavior.</p>
	 * <p>This constant is a legal value for the {@link #globalCompositeOperation} property 
	 * of a {@link JsCanvasRenderingContext2D} object indicating how colors being drawn 
	 * are combined with colors that already exist on the canvas.</p>
	 * @since 1.0
	 */
	public final static String COMPOSITE_SOURCE_OVER      = "source-over";
	/**
	 * <p>Shapes are made transparent where both overlap and drawn normal everywhere else.</p>
	 * <p>This constant is a legal value for the {@link #globalCompositeOperation} property 
	 * of a {@link JsCanvasRenderingContext2D} object indicating how colors being drawn 
	 * are combined with colors that already exist on the canvas.</p>
	 * @since 1.0
	 */
	public final static String COMPOSITE_XOR              = "xor";

	/**
	 * <p>This default value specifies that the line should have no cap. The end of the line is straight and is perpendicular to the direction of the line. The line is not extended beyond its end-point.</p>
	 * <p>This constant is a legal value for the {@link #lineCap} property of a {@link JsCanvasRenderingContext2D} 
	 * object indicating how how lines should be terminated.</p>
	 * @since 1.0
	 */
	public final static String LINECAP_BUTT   = "butt";
	/**
	 * <p>Specifies that lines should be capped with a semi-circle whose diameter is equal to the width of the line and which extends beyond the end of the line by one half the width of the line.</p>
	 * <p>This constant is a legal value for the {@link #lineCap} property of a {@link JsCanvasRenderingContext2D} 
	 * object indicating how how lines should be terminated.</p>
	 * @since 1.0
	 */
	public final static String LINECAP_ROUND  = "round";
	/**
	 * <p>Specifies that lines should be capped with a rectangle. This value is like "butt", but the line is extended by half of its width.</p>
	 * <p>This constant is a legal value for the {@link #lineCap} property of a {@link JsCanvasRenderingContext2D} 
	 * object indicating how how lines should be terminated.</p>
	 * @since 1.0
	 */
	public final static String LINECAP_SQUARE = "square";

	/**
	 * <p>A legal value for the {@link #lineJoin} property of a {@link JsCanvasRenderingContext2D} 
	 * object indicating how vertices are drawn when a path includes the vertices where 
	 * line segments and/or curves meet.</p>
	 * @since 1.0
	 */
	public final static String LINEJOIN_MITER = "miter";
	/**
	 * <p>A legal value for the {@link #lineJoin} property of a {@link JsCanvasRenderingContext2D} 
	 * object indicating how vertices are drawn when a path includes the vertices where 
	 * line segments and/or curves meet.</p>
	 * @since 1.0
	 */
	public final static String LINEJOIN_ROUND = "round";
	/**
	 * <p>A legal value for the {@link #lineJoin} property of a {@link JsCanvasRenderingContext2D} 
	 * object indicating how vertices are drawn when a path includes the vertices where 
	 * line segments and/or curves meet.</p>
	 * @since 1.0
	 */
	public final static String LINEJOIN_BEVEL = "bevel";

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
	protected static abstract class Members extends JsClient.CanvasRenderingContext2D.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCanvasRenderingContext2D#canvas
		 * @see JsCanvasRenderingContext2D.Member#canvas
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid canvas                   = id("canvas"                  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCanvasRenderingContext2D#fillStyle
		 * @see JsCanvasRenderingContext2D.Member#fillStyle
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid fillStyle                = id("fillStyle"               );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCanvasRenderingContext2D#globalAlpha
		 * @see JsCanvasRenderingContext2D.Member#globalAlpha
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid globalAlpha              = id("globalAlpha"             );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCanvasRenderingContext2D#globalCompositeOperation
		 * @see JsCanvasRenderingContext2D.Member#globalCompositeOperation
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid globalCompositeOperation = id("globalCompositeOperation");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCanvasRenderingContext2D#lineCap
		 * @see JsCanvasRenderingContext2D.Member#lineCap
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid lineCap                  = id("lineCap"                 );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCanvasRenderingContext2D#lineJoin
		 * @see JsCanvasRenderingContext2D.Member#lineJoin
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid lineJoin                 = id("lineJoin"                );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCanvasRenderingContext2D#lineWidth
		 * @see JsCanvasRenderingContext2D.Member#lineWidth
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid lineWidth                = id("lineWidth"               );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCanvasRenderingContext2D#miterLimit
		 * @see JsCanvasRenderingContext2D.Member#miterLimit
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid miterLimit               = id("miterLimit"              );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCanvasRenderingContext2D#shadowBlur
		 * @see JsCanvasRenderingContext2D.Member#shadowBlur
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid shadowBlur               = id("shadowBlur"              );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCanvasRenderingContext2D#shadowColor
		 * @see JsCanvasRenderingContext2D.Member#shadowColor
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid shadowColor              = id("shadowColor"             );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCanvasRenderingContext2D#shadowOffsetX
		 * @see JsCanvasRenderingContext2D.Member#shadowOffsetX
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid shadowOffsetX            = id("shadowOffsetX"           );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCanvasRenderingContext2D#shadowOffsetY
		 * @see JsCanvasRenderingContext2D.Member#shadowOffsetY
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid shadowOffsetY            = id("shadowOffsetY"           );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCanvasRenderingContext2D#strokeStyle
		 * @see JsCanvasRenderingContext2D.Member#strokeStyle
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid strokeStyle              = id("strokeStyle"             );
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
	public static class Member extends JsClient.CanvasRenderingContext2D.Prototype.Member
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
		public JsCanvasRenderingContext2D with(ObjectLike o) {
			return new JsCanvasRenderingContext2D(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
		 * object refers to a float value specifying the opacity of content drawn on the canvas. 
		 * The range of values is between 0.0 (fully transparent) and 1.0 (no additional 
		 * transparency). The default value for the property is 1.0.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member globalAlpha              = new Value.Number.Member(this, Members.globalAlpha             );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
		 * object refers to a string specifying how colors being drawn are combined (or 
		 * "composited") with colors that already exist on the canvas. The following are the 
		 * possible values and their meanings. The word source in the these values refers to 
		 * the colors being drawn onto the canvas, and the word destination refers to the 
		 * existing colors on the canvas. The default is {@link JsCanvasRenderingContext2D#COMPOSITE_SOURCE_OVER}.
		 * <ul>
		 * <li>{@link JsCanvasRenderingContext2D#COMPOSITE_COPY}</li>
		 * <li>{@link JsCanvasRenderingContext2D#COMPOSITE_DARKER}</li>
		 * <li>{@link JsCanvasRenderingContext2D#COMPOSITE_DESTINATION_ATOP}</li>
		 * <li>{@link JsCanvasRenderingContext2D#COMPOSITE_DESTINATION_IN}</li>
		 * <li>{@link JsCanvasRenderingContext2D#COMPOSITE_DESTINATION_OUT}</li>
		 * <li>{@link JsCanvasRenderingContext2D#COMPOSITE_DESTINATION_OVER}</li>
		 * <li>{@link JsCanvasRenderingContext2D#COMPOSITE_LIGHTER}</li>
		 * <li>{@link JsCanvasRenderingContext2D#COMPOSITE_SOURCE_ATOP}</li>
		 * <li>{@link JsCanvasRenderingContext2D#COMPOSITE_SOURCE_IN}</li>
		 * <li>{@link JsCanvasRenderingContext2D#COMPOSITE_SOURCE_OUT}</li>
		 * <li>{@link JsCanvasRenderingContext2D#COMPOSITE_SOURCE_OVER}</li>
		 * <li>{@link JsCanvasRenderingContext2D#COMPOSITE_XOR}</li>
		 * </ul>
		 * </p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member globalCompositeOperation = new Value.String.Member(this, Members.globalCompositeOperation);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
		 * object refers to a string value specifying how lines should be terminated. It matters 
		 * only when drawing wide lines. Legal values for the property are listed as follows. 
		 * The default value is {@link JsCanvasRenderingContext2D#LINECAP_BUTT}.
		 * <ul>
		 * <li>{@link JsCanvasRenderingContext2D#LINECAP_BUTT}</li>
		 * <li>{@link JsCanvasRenderingContext2D#LINECAP_ROUND}</li>
		 * <li>{@link JsCanvasRenderingContext2D#LINECAP_SQUARE}</li>
		 * </ul>
		 * </p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member lineCap                  = new Value.String.Member(this, Members.lineCap                 );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
		 * object refers to a string value specifying how two lines are joined. Legal values 
		 * are {@link JsCanvasRenderingContext2D#LINEJOIN_ROUND}, {@link JsCanvasRenderingContext2D#LINEJOIN_BEVEL}, 
		 * and {@link JsCanvasRenderingContext2D#LINEJOIN_MITER}. The default is 
		 * {@link JsCanvasRenderingContext2D#LINEJOIN_MITER}.</p>
		 * <p>When a path includes vertices where line segments and/or curves meet, this 
		 * property specifies how those vertices are drawn. The effect of this property 
		 * is apparent only when drawing with wide lines.</p> 
		 * <p>The default value of the property is {@link JsCanvasRenderingContext2D#LINEJOIN_MITER}, 
		 * which specifies that the outside edges of the two line segments are extended 
		 * until they intersect. When two lines meet at an acute angle, mitered joins can 
		 * become quite long. The {@link JsCanvasRenderingContext2D#miterLimit} property 
		 * places an upper bound on the length of a miter. Beyond this limit, the miter 
		 * is beveled off.</p> 
		 * <p>The value {@link JsCanvasRenderingContext2D#LINEJOIN_ROUND} specifies that 
		 * the outside edges of the vertex should be joined with a filled arc whose diameter 
		 * is equal to the width of the line.</p> 
		 * <p>The value {@link JsCanvasRenderingContext2D#LINEJOIN_BEVEL} specifies that 
		 * the outside edges of the vertex should be joined with a filled triangle.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member lineJoin                 = new Value.String.Member(this, Members.lineJoin                );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
		 * object refers to a float value specifying the line width for stroking (line 
		 * drawing) operations. The default is 1.0, and this property must be greater 
		 * than 0.0. Wide lines are centered over the path, with half of the line width 
		 * on each side.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member lineWidth                = new Value.Number.Member(this, Members.lineWidth               );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
		 * object refers to a float value specifying the maximum ratio of miter length 
		 * to line width when the {@link JsCanvasRenderingContext2D#lineJoin} property 
		 * is {@link JsCanvasRenderingContext2D#LINEJOIN_MITER}.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member miterLimit               = new Value.Number.Member(this, Members.miterLimit              );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
		 * object refers to a float value specifying how much feathering shadows should 
		 * have. The default is 0.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member shadowBlur               = new Value.Number.Member(this, Members.shadowBlur              );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
		 * object refers to a string value specifying the color of shadows as a CSS or 
		 * web style string and may include an alpha component for transparency. The 
		 * default is black.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member shadowColor              = new Value.String.Member(this, Members.shadowColor             );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
		 * object refers to a float value specifying the horizontal offset of the 
		 * shadows. Larger values make the shadowed object appear to float higher above 
		 * the background. The default is 0.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member shadowOffsetX            = new Value.Number.Member(this, Members.shadowOffsetX           );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
		 * object refers to a float value specifying the vertical offset of the 
		 * shadows. Larger values make the shadowed object appear to float higher above 
		 * the background. The default is 0.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member shadowOffsetY            = new Value.Number.Member(this, Members.shadowOffsetY           );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
		 * object is a read-only reference to the {@link JsHTMLCanvasElement} element 
		 * upon which this context will draw.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsHTMLCanvasElement.Member canvas = new JsHTMLCanvasElement.Member(this, Members.canvas);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
		 * object refers to the current color, pattern, or gradient used for filling paths. 
		 * The property may be set to a string or to a {@link JsCanvasGradient} or 
		 * {@link JsCanvasPattern} object. When set to a string, it is parsed as a CSS 
		 * color value and used for solid fills. When set to a {@link JsCanvasGradient} 
		 * or {@link JsCanvasPattern} object, fills are done using the specified 
		 * gradient or pattern.</p>
		 * @since 1.0
		 * @see JsCanvasRenderingContext2D#createLinearGradient(Number, Number, Number, Number)
		 * @see JsCanvasRenderingContext2D#createPattern(JsHTMLCanvasElement, String)
		 * @see JsCanvasRenderingContext2D#createPattern(JsHTMLImageElement, String)
		 * @see JsCanvasRenderingContext2D#createRadialGradient(Number, Number, Number, Number, Number, Number)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Member<Object> fillStyle   = new Value.Member<Object>(this, Members.fillStyle  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
		 * object refers to the color, pattern, or gradient used for stroking (drawing) paths. 
		 * The property may be set to a string or to a {@link JsCanvasGradient} or 
		 * {@link JsCanvasPattern} object. When set to a string, it is parsed as a CSS 
		 * color value and used for solid fills. When set to a {@link JsCanvasGradient} 
		 * or {@link JsCanvasPattern} object, fills are done using the specified 
		 * gradient or pattern.</p>
		 * @since 1.0
		 * @see JsCanvasRenderingContext2D#createLinearGradient(Number, Number, Number, Number)
		 * @see JsCanvasRenderingContext2D#createPattern(JsHTMLCanvasElement, String)
		 * @see JsCanvasRenderingContext2D#createPattern(JsHTMLImageElement, String)
		 * @see JsCanvasRenderingContext2D#createRadialGradient(Number, Number, Number, Number, Number, Number)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Member<Object> strokeStyle = new Value.Member<Object>(this, Members.strokeStyle);
	}

	public JsCanvasRenderingContext2D(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
	 * object refers to a float value specifying the opacity of content drawn on the canvas. 
	 * The range of values is between 0.0 (fully transparent) and 1.0 (no additional 
	 * transparency). The default value for the property is 1.0.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member globalAlpha              = new Value.Number.Member(Members.globalAlpha             );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
	 * object refers to a string specifying how colors being drawn are combined (or 
	 * "composited") with colors that already exist on the canvas. The following are the 
	 * possible values and their meanings. The word source in the these values refers to 
	 * the colors being drawn onto the canvas, and the word destination refers to the 
	 * existing colors on the canvas. The default is {@link #COMPOSITE_SOURCE_OVER}.
	 * <ul>
	 * <li>{@link #COMPOSITE_COPY}</li>
	 * <li>{@link #COMPOSITE_DARKER}</li>
	 * <li>{@link #COMPOSITE_DESTINATION_ATOP}</li>
	 * <li>{@link #COMPOSITE_DESTINATION_IN}</li>
	 * <li>{@link #COMPOSITE_DESTINATION_OUT}</li>
	 * <li>{@link #COMPOSITE_DESTINATION_OVER}</li>
	 * <li>{@link #COMPOSITE_LIGHTER}</li>
	 * <li>{@link #COMPOSITE_SOURCE_ATOP}</li>
	 * <li>{@link #COMPOSITE_SOURCE_IN}</li>
	 * <li>{@link #COMPOSITE_SOURCE_OUT}</li>
	 * <li>{@link #COMPOSITE_SOURCE_OVER}</li>
	 * <li>{@link #COMPOSITE_XOR}</li>
	 * </ul>
	 * </p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member globalCompositeOperation = new Value.String.Member(Members.globalCompositeOperation);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
	 * object refers to a string value specifying how lines should be terminated. It matters 
	 * only when drawing wide lines. Legal values for the property are listed as follows. 
	 * The default value is {@link #LINECAP_BUTT}.
	 * <ul>
	 * <li>{@link #LINECAP_BUTT}</li>
	 * <li>{@link #LINECAP_ROUND}</li>
	 * <li>{@link #LINECAP_SQUARE}</li>
	 * </ul>
	 * </p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member lineCap                  = new Value.String.Member(Members.lineCap                 );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
	 * object refers to a string value specifying how two lines are joined. Legal values 
	 * are {@link #LINEJOIN_MITER}, {@link #LINEJOIN_MITER}, and {@link #LINEJOIN_MITER}. 
	 * The default is {@link #LINEJOIN_MITER}.</p>
	 * <p>When a path includes vertices where line segments and/or curves meet, this 
	 * property specifies how those vertices are drawn. The effect of this property 
	 * is apparent only when drawing with wide lines.</p> 
	 * <p>The default value of the property is {@link #LINEJOIN_MITER}, which specifies 
	 * that the outside edges of the two line segments are extended until they intersect. 
	 * When two lines meet at an acute angle, mitered joins can become quite long. 
	 * The {@link #miterLimit} property places an upper bound on the length of a miter. 
	 * Beyond this limit, the miter is beveled off.</p> 
	 * <p>The value {@link #LINEJOIN_ROUND} specifies that the outside edges of the 
	 * vertex should be joined with a filled arc whose diameter is equal to the width of 
	 * the line.</p> 
	 * <p>The value {@link #LINEJOIN_BEVEL} specifies that the outside edges of the 
	 * vertex should be joined with a filled triangle.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member lineJoin                 = new Value.String.Member(Members.lineJoin                );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
	 * object refers to a float value specifying the line width for stroking (line 
	 * drawing) operations. The default is 1.0, and this property must be greater 
	 * than 0.0. Wide lines are centered over the path, with half of the line width 
	 * on each side.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member lineWidth                = new Value.Number.Member(Members.lineWidth               );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
	 * object refers to a float value specifying the maximum ratio of miter length 
	 * to line width when the {@link #lineJoin} property 
	 * is {@link #LINEJOIN_MITER}.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member miterLimit               = new Value.Number.Member(Members.miterLimit              );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
	 * object refers to a float value specifying how much feathering shadows should 
	 * have. The default is 0.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member shadowBlur               = new Value.Number.Member(Members.shadowBlur              );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
	 * object refers to a string value specifying the color of shadows as a CSS or 
	 * web style string and may include an alpha component for transparency. The 
	 * default is black.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member shadowColor              = new Value.String.Member(Members.shadowColor             );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
	 * object refers to a float value specifying the horizontal offset of the 
	 * shadows. Larger values make the shadowed object appear to float higher above 
	 * the background. The default is 0.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member shadowOffsetX            = new Value.Number.Member(Members.shadowOffsetX           );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
	 * object refers to a float value specifying the vertical offset of the 
	 * shadows. Larger values make the shadowed object appear to float higher above 
	 * the background. The default is 0.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member shadowOffsetY            = new Value.Number.Member(Members.shadowOffsetY           );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
	 * object is a read-only reference to the {@link JsHTMLCanvasElement} element 
	 * upon which this context will draw.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsHTMLCanvasElement.Member canvas = new JsHTMLCanvasElement.Member(Members.canvas);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
	 * object refers to the current color, pattern, or gradient used for filling paths. 
	 * The property may be set to a string or to a {@link JsCanvasGradient} or 
	 * {@link JsCanvasPattern} object. When set to a string, it is parsed as a CSS 
	 * color value and used for solid fills. When set to a {@link JsCanvasGradient} 
	 * or {@link JsCanvasPattern} object, fills are done using the specified 
	 * gradient or pattern.</p>
	 * @since 1.0
	 * @see #createLinearGradient(Number, Number, Number, Number)
	 * @see #createPattern(JsHTMLCanvasElement, String)
	 * @see #createPattern(JsHTMLImageElement, String)
	 * @see #createRadialGradient(Number, Number, Number, Number, Number, Number)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Member<Object> fillStyle   = new Value.Member<Object>(Members.fillStyle  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCanvasRenderingContext2D} 
	 * object refers to the color, pattern, or gradient used for stroking (drawing) paths. 
	 * The property may be set to a string or to a {@link JsCanvasGradient} or 
	 * {@link JsCanvasPattern} object. When set to a string, it is parsed as a CSS 
	 * color value and used for solid fills. When set to a {@link JsCanvasGradient} 
	 * or {@link JsCanvasPattern} object, fills are done using the specified 
	 * gradient or pattern.</p>
	 * @since 1.0
	 * @see #createLinearGradient(Number, Number, Number, Number)
	 * @see #createPattern(JsHTMLCanvasElement, String)
	 * @see #createPattern(JsHTMLImageElement, String)
	 * @see #createRadialGradient(Number, Number, Number, Number, Number, Number)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Member<Object> strokeStyle = new Value.Member<Object>(Members.strokeStyle);

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
	public JsCanvasRenderingContext2D valueOf() {
		return new JsCanvasRenderingContext2D((JsObject)var().valueOf());
	}
	public final JsHTMLCanvasElement var(JsHTMLCanvasElement.Member r) {
		return r.with(this);
	}

	/**
	 * <p>Adds an arc to the current sub-path of a canvas, using a center point and radius.</p>
	 * <p>The first five arguments to this method specify a start point and an end point 
	 * on the circumference of a circle. Invoking this method adds a straight line 
	 * between the current point and the start point to the current sub-path. Next it 
	 * adds the arc along the circumference of the circle between the start and end 
	 * points to the sub-path. The final argument specifies the direction in which the 
	 * circle should be traversed to connect the start and end points. This method 
	 * leaves the current point set to the end point of the arc.</p>
	 * @param x The X coordinate of the center of the circle describing the arc.
	 * @param y The Y coordinate of the center of the circle describing the arc.
	 * @param r The radius of the circle that defines the arc.
	 * @param a1 Specifies the start point of the arc along the circle. The angles is 
	 * measured in radians. The three o'clock position along the positive X axis is an 
	 * angle of 0, and angles increase in the clockwise direction.
	 * @param a2 Specifies the end point of the arc along the circle. The angle is 
	 * measured in radians. The three o'clock position along the positive X axis is an 
	 * angle of 0, and angles increase in the clockwise direction.
	 * @param c Whether the arc is traversed counterclockwise (<tt>true</tt>) 
	 * or clockwise (<tt>false</tt>) along the circle's circumference.
	 * @since 1.0
	 * @see #arcTo(Number, Number, Number, Number, Number)
	 * @see #beginPath()
	 * @see #closePath()
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void arc(Number x, Number y, Number r, Number a1, Number a2, Boolean c) {
		call(arc, new Vars<Object>().add(x).add(y).add(r).add(a1).add(a2).add(c));
	}
	/**
	 * <p>Adds an arc to the current sub-path, using tangent points and a radius.</p>
	 * <p>This method adds an arc to the current sub-path but describes that arc much 
	 * differently than the {@link #arc(Number, Number, Number, Number, Number, Boolean)} 
	 * method does. The arc that is added to the path by this method is a portion of a 
	 * circle with the specified radius. The arc has one point tangent to the line from 
	 * the current position to the point <tt>(x1, y1)</tt> and one point that is tangent 
	 * to the line from the point <tt>(x1, y1)</tt> to the point <tt>(x2, y2)</tt>. The 
	 * arc begins and ends at these two tangent points and is drawn in the direction 
	 * that connects those two points with the shortest arc.</p>
	 * <p>In many common uses, the arc begins at the current position and ends at 
	 * the point <tt>(x2, y2)</tt>, but this is not always the case. If the current 
	 * position is not the same as the starting point of the arc, this method adds a 
	 * straight line from the current position to the start position of the arc. This 
	 * method always leaves the current position set to the end point of the arc.</p>
	 * @param x1 The X coordinate of the control point associated with the arc's start point.
	 * @param y1 The Y coordinate of the control point associated with the arc's start point.
	 * @param x2 The X coordinate of the control point associated with the arc's end point.
	 * @param y2 The Y coordinate of the control point associated with the arc's end point.
	 * @param r The radius of the circle that defines the arc.
	 * @since 1.0
	 * @see #arc(Number, Number, Number, Number, Number, Boolean)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void arcTo(Number x1, Number y1, Number x2, Number y2, Number r) {
		call(arcTo, new Vars<Object>().add(x1).add(y1).add(x2).add(y2).add(r));
	}
	/**
	 * <p>Starts a new path (or a collection of sub-paths) in a canvas.</p>
	 * <p>This method discards any currently defined path and begins a new one. It sets 
	 * the current point to (0,0).</p>
	 * <p>When the context for a canvas is first created, this method is implicitly 
	 * called.</p>
	 * @since 1.0
	 * @see #closePath()
	 * @see #fill()
	 * @see #stroke()
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void beginPath() {
		call(beginPath);
	}
	/**
	 * <p>Adds a cubic Bézier curve to the current sub-path.</p>
	 * <p>The start point of the curve is the current point of the canvas, and the end 
	 * point is <tt>(x,y)</tt>. The two Bezier control points <tt>(x1, y1)</tt> and 
	 * <tt>(x2, y2)</tt> define the shape of the curve. When this method returns, the 
	 * current position is <tt>(x,y)</tt>.</p>
	 * @param x1 The X coordinate of the control point associated with the curve's 
	 * start point (the current position).
	 * @param y1 The Y coordinate of the control point associated with the curve's 
	 * start point (the current position).
	 * @param x2 The X coordinate of the control point associated with the curve's end point.
	 * @param y2 The Y coordinate of the control point associated with the curve's end point.
	 * @param x The X coordinate of the curve's end point.
	 * @param y The Y coordinate of the curve's end point.
	 * @since 1.0
	 * @see #quadraticCurveTo(Number, Number, Number, Number)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void bezierCurveTo(Number x1, Number y1, Number x2, Number y2, Number x, Number y) {
		call(bezierCurveTo, new Vars<Object>().add(x1).add(y1).add(x2).add(y2).add(x).add(y));
	}
	/**
	 * <p>Erases the pixels in a rectangular area of a canvas.</p>
	 * <p>This method erases the specified rectangle, filling it with a transparent color.</p>
	 * @param x The X coordinate of the upper-left corner of the rectangle.
	 * @param y The Y coordinate of the upper-left corner of the rectangle.
	 * @param w The X dimension of the rectangle.
	 * @param h The Y dimension of the rectangle.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void clearRect(Number x, Number y, Number w, Number h) {
		call(clearRect, new Vars<Object>().add(x).add(y).add(w).add(h));
	}
	/**
	 * <p>Uses the current path as the clipping region for subsequent drawing operations.</p>
	 * <p>This method clips the current path using the current clipping path and then 
	 * uses the clipped path as the new clipping path. Note that there is no way to 
	 * enlarge the clipping path. If you want a temporary clipping path, you should 
	 * first call {@link #save()} in order to use {@link #restore()} to restore the 
	 * original clipping path. The default clipping path for a canvas is the canvas 
	 * rectangle itself.</p>
	 * <p>This method resets the current path so that it is empty.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void clip() {
		call(clip);
	}
	/**
	 * <p>Closes the current sub-path if it's open.</p>
	 * <p>If the current sub-path of the canvas is open, this method closes it by adding 
	 * a line connecting the current point to the sub-path's starting point. If the 
	 * sub-path is already closed, this method does nothing. Once a sub-path is closed, 
	 * no more lines or curves can be added to it. To continue adding to the path, 
	 * you must begin a new sub-path by calling {@link #moveTo(Number, Number)}.</p>
	 * <p>You do not need to call {@link #closePath()} before stroking or filling a path. 
	 * Paths are implicitly closed when filled (and also when you call {@link #clip()}).</p>
	 * @since 1.0
	 * @see #beginPath()
	 * @see #moveTo(Number, Number)
	 * @see #stroke()
	 * @see #fill()
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void closePath() {
		call(closePath);
	}
	/**
	 * <p>Returns a {@link JsCanvasGradient} object that represents a linear color 
	 * gradient.</p>
	 * <p>This method creates and returns a new {@link JsCanvasGradient} object that 
	 * linearly interpolates colors between the specified start point and end point. 
	 * Note that this method does not specify any colors for the gradient. Use the 
	 * {@link JsCanvasGradient#addColorStop(Number, String)} method of the returned 
	 * object to do that. To stroke lines or fill areas using a gradient, assign a 
	 * {@link JsCanvasGradient} object to the {@link #strokeStyle} or {@link #fillStyle} 
	 * properties.</p>
	 * @param x1 The X coordinate of the gradient's start point.
	 * @param y1 The Y coordinate of the gradient's start point.
	 * @param x2 The X coordinate of the gradient's end point.
	 * @param y2 The Y coordinate of the gradient's end point.
	 * @return A {@link JsCanvasGradient} object representing the linear color gradient.
	 * @since 1.0
	 * @see #createRadialGradient(Number, Number, Number, Number, Number, Number)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsCanvasGradient createLinearGradient(Number x1, Number y1, Number x2, Number y2) {
		return new JsCanvasGradient(call(createLinearGradient, new Vars<Object>().add(x1).add(y1).add(x2).add(y2)));
	}
	/**
	 * <p>Returns a {@link JsCanvasGradient} object that represents a radial color 
	 * gradient.</p>
	 * <p>This method creates and returns a new {@link JsCanvasGradient} object that 
	 * radially interpolates colors between the circumferences of the two specified 
	 * circles. Note that this method does not specify any colors for the gradient. 
	 * Use the {@link JsCanvasGradient#addColorStop(Number, String)} method of the 
	 * returned object to do that. To stroke lines or fill areas using a gradient, 
	 * assign a {@link JsCanvasGradient} object to the {@link #strokeStyle} or 
	 * {@link #fillStyle} properties.</p>
	 * @param x1 The X coordinate of the center of the starting circle.
	 * @param y1 The Y coordinate of the center of the starting circle.
	 * @param r1 The radius of the starting circle.
	 * @param x2 The X coordinate of the center of the ending circle.
	 * @param y2 The Y coordinate of the center of the starting circle.
	 * @param r2 The radius of the ending circle.
	 * @return A {@link JsCanvasGradient} object representing the radial color gradient.
	 * @since 1.0
	 * @see #createLinearGradient(Number, Number, Number, Number)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsCanvasGradient createRadialGradient(Number x1, Number y1, Number r1, Number x2, Number y2, Number r2) {
		return new JsCanvasGradient(call(createRadialGradient, new Vars<Object>().add(x1).add(y1).add(r1).add(x2).add(y2).add(r2)));
	}
	/**
	 * <p>Returns a {@link JsCanvasPattern} object that represents a tiled image.</p>
	 * <p>This method creates and returns a new {@link JsCanvasPattern} object that 
	 * represents the pattern defined by a tiled image. To use a pattern for stroking 
	 * lines or filling areas, use a {@link JsCanvasPattern} object as the value of the 
	 * {@link #strokeStyle} or {@link #fillStyle} properties.</p>
	 * @param image The image to be tiled. This argument is typically 
	 * {@link JsHTMLImageElement} object, but you may also use a {@link JsHTMLCanvasElement} 
	 * element (see {@link #createPattern(JsHTMLCanvasElement, String)}).
	 * @param repeat Specifies how the image is tiled. The possible values are the following:
	 * <ul>
	 * <li>"repeat": Tile the image in both directions. This is the default.</li>
	 * <li>"repeat-x": Tile the image in the X dimension only.</li>
	 * <li>"repeat-y": Tile the image in the Y dimension only.</li>
	 * <li>"no-repeat": Do not tile the image; use it a single time only.</li>
	 * </ul>
	 * @return A {@link JsCanvasPattern} object representing the pattern.
	 * @since 1.0
	 * @see #createPattern(JsHTMLCanvasElement, String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsCanvasPattern createPattern(JsHTMLImageElement image, String repeat) {
		return new JsCanvasPattern(call(createPattern, new Vars<Object>().add(image).add(repeat)));
	}
	/**
	 * <p>Returns a {@link JsCanvasPattern} object that represents a tiled image.</p>
	 * <p>This method creates and returns a new {@link JsCanvasPattern} object that 
	 * represents the pattern defined by a tiled image. To use a pattern for stroking 
	 * lines or filling areas, use a {@link JsCanvasPattern} object as the value of the 
	 * {@link #strokeStyle} or {@link #fillStyle} properties.</p>
	 * @param image The image to be tiled. Note that this argument is typically a 
	 * {@link JsHTMLImageElement} object (see {@link #createPattern(JsHTMLImageElement, String)}).
	 * @param repeat Specifies how the image is tiled. The possible values are the following:
	 * <ul>
	 * <li>"repeat": Tile the image in both directions. This is the default.</li>
	 * <li>"repeat-x": Tile the image in the X dimension only.</li>
	 * <li>"repeat-y": Tile the image in the Y dimension only.</li>
	 * <li>"no-repeat": Do not tile the image; use it a single time only.</li>
	 * </ul>
	 * @return A {@link JsCanvasPattern} object representing the pattern.
	 * @see #createPattern(JsHTMLImageElement, String)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsCanvasPattern createPattern(JsHTMLCanvasElement image, String repeat) {
		return new JsCanvasPattern(call(createPattern, new Vars<Object>().add(image).add(repeat)));
	}
	/**
	 * <p>Draws an image.</p>
	 * <p>This method copies the entire image to the canvas, placing its upper-left 
	 * corner at the specified point and mapping each image pixel to one unit in the 
	 * canvas coordinate system.</p>
	 * @param image The image to be drawn. This argument may also be a 
	 * {@link JsHTMLCanvasElement} object.
	 * @param x The X coordinate of the point at which the upper-left corner of the 
	 * image is drawn.
	 * @param y The Y coordinate of the point at which the upper-left corner of the 
	 * image is drawn.
	 * @see #drawImage(JsHTMLCanvasElement, Number, Number)
	 * @see #drawImage(JsHTMLImageElement, Number, Number, Number, Number)
	 * @see #drawImage(JsHTMLImageElement, Number, Number, Number, Number, Number, Number, Number, Number)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void drawImage(JsHTMLImageElement image, Number x, Number y) {
		call(drawImage, new Vars<Object>().add(image).add(x).add(y));
	}
	/**
	 * <p>Draws an image.</p>
	 * <p>This method copies the entire image to the canvas and allows you to specify 
	 * the desired width and height of the image in canvas units.</p>
	 * @param image The image to be drawn. This argument may also be an 
	 * {@link JsHTMLCanvasElement} object.
	 * @param x The X coordinate of the point at which the upper-left corner of the 
	 * image is drawn.
	 * @param y The Y coordinate of the point at which the upper-left corner of the 
	 * image is drawn.
	 * @param w The width at which the image should be drawn. Specifying this argument 
	 * causes the image to be scaled.
	 * @param h The height at which the image should be drawn. Specifying this argument 
	 * causes the image to be scaled.
	 * @see #drawImage(JsHTMLCanvasElement, Number, Number, Number, Number)
	 * @see #drawImage(JsHTMLImageElement, Number, Number)
	 * @see #drawImage(JsHTMLImageElement, Number, Number, Number, Number, Number, Number, Number, Number)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void drawImage(
			JsHTMLImageElement image, Number x, Number y, Number w, Number h) {
		call(drawImage, new Vars<Object>().add(image).add(x).add(y).add(w).add(h));
	}
	/**
	 * <p>Draws an image.</p>
	 * <p>This method allows you to specify any rectangular region of the image and 
	 * copy it, with arbitrary scaling to any position within the canvas.</p>
	 * @param image The image to be drawn. This argument may also be an 
	 * {@link JsHTMLCanvasElement} object.
	 * @param x1 The X coordinate of the upper-left corner of the region of the image 
	 * that is to be drawn. This argument must be an integer measured in image pixels.
	 * @param y1 The X coordinate of the upper-left corner of the region of the image 
	 * that is to be drawn. This argument must be an integer measured in image pixels.
	 * @param w1 The X dimension, in image pixels, of the region of the image that is 
	 * to be drawn.
	 * @param h1 The Y dimension, in image pixels, of the region of the image that is 
	 * to be drawn.
	 * @param x2 The canvas X coordinate at which the upper-left corner of the image 
	 * region is to be drawn.
	 * @param y2 The canvas Y coordinate at which the upper-left corner of the image 
	 * region is to be drawn.
	 * @param w2 The canvas X dimension at which the image region should be drawn.
	 * @param h2 The canvas Y dimension at which the image region should be drawn.
	 * @see #drawImage(JsHTMLCanvasElement, Number, Number, Number, Number, Number, Number, Number, Number)
	 * @see #drawImage(JsHTMLImageElement, Number, Number)
	 * @see #drawImage(JsHTMLImageElement, Number, Number, Number, Number)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void drawImage(JsHTMLImageElement image, 
			Number x1, Number y1, Number w1, Number h1,
			Number x2, Number y2, Number w2, Number h2) {
		call(drawImage, new Vars<Object>().add(image)
				.add(x1).add(y1).add(w1).add(h1)
				.add(x2).add(y2).add(w2).add(h2));
	}
	/**
	 * <p>Draws an image.</p>
	 * <p>This method copies the entire image to the canvas, placing its upper-left 
	 * corner at the specified point and mapping each image pixel to one unit in the 
	 * canvas coordinate system.</p>
	 * @param image The image to be drawn. This argument may also be an {@link JsHTMLImageElement} 
	 * object representing an <tt>&lt;img&gt;</tt> tag, or an offscreen image.
	 * @param x The X coordinate of the point at which the upper-left corner of the 
	 * image is drawn.
	 * @param y The Y coordinate of the point at which the upper-left corner of the 
	 * image is drawn.
	 * @see #drawImage(JsHTMLImageElement, Number, Number)
	 * @see #drawImage(JsHTMLCanvasElement, Number, Number, Number, Number)
	 * @see #drawImage(JsHTMLCanvasElement, Number, Number, Number, Number, Number, Number, Number, Number)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void drawImage(JsHTMLCanvasElement image, Number x, Number y) {
		call(drawImage, new Vars<Object>().add(image).add(x).add(y));
	}
	/**
	 * <p>Draws an image.</p>
	 * <p>This method copies the entire image to the canvas and allows you to specify 
	 * the desired width and height of the image in canvas units.</p>
	 * @param image The image to be drawn. This argument may also be an {@link JsHTMLImageElement} 
	 * object representing an <tt>&lt;img&gt;</tt> tag, or an offscreen image.
	 * @param x The X coordinate of the point at which the upper-left corner of the 
	 * image is drawn.
	 * @param y The Y coordinate of the point at which the upper-left corner of the 
	 * image is drawn.
	 * @param w The width at which the image should be drawn. Specifying this argument 
	 * causes the image to be scaled.
	 * @param h The height at which the image should be drawn. Specifying this argument 
	 * causes the image to be scaled.
	 * @see #drawImage(JsHTMLImageElement, Number, Number, Number, Number)
	 * @see #drawImage(JsHTMLCanvasElement, Number, Number)
	 * @see #drawImage(JsHTMLCanvasElement, Number, Number, Number, Number, Number, Number, Number, Number)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void drawImage(
			JsHTMLCanvasElement image, Number x, Number y, Number w, Number h) {
		call(drawImage, new Vars<Object>().add(image).add(x).add(y).add(w).add(h));
	}
	/**
	 * <p>Draws an image.</p>
	 * <p>This method allows you to specify any rectangular region of the image and 
	 * copy it, with arbitrary scaling to any position within the canvas.</p>
	 * @param image The image to be drawn. This argument may also be an {@link JsHTMLImageElement} 
	 * object representing an <tt>&lt;img&gt;</tt> tag, or an offscreen image.
	 * @param x1 The X coordinate of the upper-left corner of the region of the image 
	 * that is to be drawn. This argument must be an integer measured in image pixels.
	 * @param y1 The X coordinate of the upper-left corner of the region of the image 
	 * that is to be drawn. This argument must be an integer measured in image pixels.
	 * @param w1 The X dimension, in image pixels, of the region of the image that is 
	 * to be drawn.
	 * @param h1 The Y dimension, in image pixels, of the region of the image that is 
	 * to be drawn.
	 * @param x2 The canvas X coordinate at which the upper-left corner of the image 
	 * region is to be drawn.
	 * @param y2 The canvas Y coordinate at which the upper-left corner of the image 
	 * region is to be drawn.
	 * @param w2 The canvas X dimension at which the image region should be drawn.
	 * @param h2 The canvas Y dimension at which the image region should be drawn.
	 * @see #drawImage(JsHTMLImageElement, Number, Number, Number, Number, Number, Number, Number, Number)
	 * @see #drawImage(JsHTMLCanvasElement, Number, Number)
	 * @see #drawImage(JsHTMLCanvasElement, Number, Number, Number, Number)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void drawImage(JsHTMLCanvasElement image, 
			Number x1, Number y1, Number w1, Number h1,
			Number x2, Number y2, Number w2, Number h2) {
		call(drawImage, new Vars<Object>().add(image)
				.add(x1).add(y1).add(w1).add(h1)
				.add(x2).add(y2).add(w2).add(h2));
	}
	/**
	 * <p>Fills the interior of the current path with the color, gradient, or pattern 
	 * specified by the {@link #fillStyle} property.</p>
	 * @since 1.0
	 * @see #fillRect(Number, Number, Number, Number)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void fill() {
		call(fill);
	}
	/**
	 * <p>Paints or fills a rectangle.</p>
	 * <p>This method fills the specified rectangle with the color, gradient, or pattern 
	 * specified by the {@link #fillStyle} property.</p>
	 * <p>Current implementations of this method also clear the path as if 
	 * {@link #beginPath()} had been called. This surprising behavior may not be 
	 * standardized and should not be relied on.</p>
	 * @param x The X coordinate of the upper-left corner of the rectangle.
	 * @param y The Y coordinate of the upper-left corner of the rectangle.
	 * @param w The X dimension of the rectangle.
	 * @param h The Y dimension of the rectangle.
	 * @since 1.0
	 * @see #fill()
	 * @see #rect(Number, Number, Number, Number)
	 * @see #strokeRect(Number, Number, Number, Number)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void fillRect(Number x, Number y, Number w, Number h) {
		call(fillRect, new Vars<Object>().add(x).add(y).add(w).add(h));
	}
	/**
	 * <p>Adds a straight line segment to the current sub-path.</p>
	 * <p>This method adds a straight line to the current sub-path. The line begins at 
	 * the current point and ends at <tt>(x,y)</tt>.</p>
	 * <p>When this method returns, the current position is <tt>(x,y)</tt>.</p>
	 * @param x The X coordinate of the end point of the line.
	 * @param y The Y coordinate of the end point of the line.
	 * @since 1.0
	 * @see #beginPath()
	 * @see #moveTo(Number, Number)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void lineTo(Number x, Number y) {
		call(lineTo, new Vars<Object>().add(x).add(y));
	}
	/**
	 * <p>Sets the current position and begins a new sub-path.</p>
	 * <p>This method sets the current position to <tt>(x,y)</tt> and creates a new 
	 * sub-path with this as its first point. If there was a previous sub-path and it 
	 * consisted of just one point, that sub-path is removed from the path.</p>
	 * @param x The X coordinate of the new current point.
	 * @param y The Y coordinate of the new current point.
	 * @since 1.0
	 * @see #beginPath()
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void moveTo(Number x, Number y) {
		call(moveTo, new Vars<Object>().add(x).add(y));
	}
	/**
	 * <p>Adds a quadratic Bézier curve to the current sub-path.</p>
	 * <p>This method adds a quadratic Bézier curve segment to the current sub-path. 
	 * The curve starts at the current point and ends at <tt>(x,y)</tt>. The control 
	 * point <tt>(cx, cy)</tt> specifies the shape of the curve between these two points.</p>
	 * <p>When this method returns, the current position is <tt>(x,y)</tt>.</p>
	 * @param cx The X coordinate of the control point.
	 * @param cy The Y coordinate of the control point.
	 * @param x The X coordinate of the end point.
	 * @param y The Y coordinate of the end point.
	 * @since 1.0
	 * @see #bezierCurveTo(Number, Number, Number, Number, Number, Number)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void quadraticCurveTo(Number cx, Number cy, Number x, Number y) {
		call(quadraticCurveTo, new Vars<Object>().add(cx).add(cy).add(x).add(y));
	}
	/**
	 * <p>Adds a rectangle sub-path to the current path.</p>
	 * <p>This method adds a rectangle to the path. This rectangle is in a sub-path of 
	 * its own and is not connected to any other sub-paths in the path.</p>
	 * <p>When this method returns, the current position is (0,0).</p>
	 * @param x The X coordinate of the upper-left corner of the rectangle.
	 * @param y The Y coordinate of the upper-left corner of the rectangle.
	 * @param w The X dimension of the rectangle.
	 * @param h The Y dimension of the rectangle.
	 * @since 1.0
	 * @see #fillRect(Number, Number, Number, Number)
	 * @see #strokeRect(Number, Number, Number, Number)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void rect(Number x, Number y, Number w, Number h) {
		call(rect, new Vars<Object>().add(x).add(y).add(w).add(h));
	}
	/**
	 * <p>Resets the canvas to the graphics state most recently saved.</p>
	 * <p>This method pops the stack of saved graphics states and restores the values of 
	 * the {@link JsCanvasRenderingContext2D} properties, the clipping path, and the 
	 * transformation matrix.</p>
	 * @since 1.0
	 * @see #save()
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void restore() {
		call(restore);
	}
	/**
	 * <p>Rotates the canvas.</p>
	 * <p>This method alters the mapping between canvas coordinates and the pixels of 
	 * the <tt>&lt;canvas&gt;</tt> element in the web browser so that any subsequent 
	 * drawing appears rotated within the canvas by the specified angle. It does not 
	 * rotate the <tt>&lt;canvas&gt;</tt> element itself.</p>
	 * <p>Note that the angle is specified in radians. To convert degrees to radians, 
	 * multiply by {@link js.MathLike#PI} and divide by 180.</p>
	 * @param a The amount of rotation, in radians. Positive values result in clockwise 
	 * rotation, and negative values result in counterclockwise rotation.
	 * @since 1.0
	 * @see #rotate(NumberLike)
	 * @see #scale(Number, Number)
	 * @see #translate(Number, Number)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void rotate(Number a) {
		call(rotate, a);
	}
	/**
	 * <p>Rotates the canvas.</p>
	 * <p>This method alters the mapping between canvas coordinates and the pixels of 
	 * the <tt>&lt;canvas&gt;</tt> element in the web browser so that any subsequent 
	 * drawing appears rotated within the canvas by the specified angle. It does not 
	 * rotate the <tt>&lt;canvas&gt;</tt> element itself.</p>
	 * <p>Note that the angle is specified in radians. To convert degrees to radians, 
	 * multiply by {@link js.MathLike#PI} and divide by 180.</p>
	 * @param a The amount of rotation, in radians. Positive values result in clockwise 
	 * rotation, and negative values result in counterclockwise rotation.
	 * @since 1.0
	 * @see #rotate(Number)
	 * @see #scale(Number, Number)
	 * @see #translate(Number, Number)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void rotate(NumberLike<?> a) {
		rotate(Js.valueOf(a));
	}
	/**
	 * <p>Saves the properties, clipping region, and transformation matrix of the 
	 * {@link JsCanvasRenderingContext2D} object.</p>
	 * @since 1.0
	 * @see #restore()
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void save() {
		call(save);
	}
	/**
	 * <p>Scales the user coordinate system of the canvas.</p>
	 * <p>This method adds a scale transformation to the current transformation matrix 
	 * of the canvas. Scaling is done with independent horizontal and vertical scaling 
	 * factors.</p>
	 * <p>Specifying a negative value for <tt>sx</tt> causes X coordinates to be flipped 
	 * across the Y axis, and a negative value of <tt>sy</tt> causes Y coordinates to 
	 * be flipped across the X axis.</p>
	 * @param sx The horizontal scaling factor.
	 * @param sy The vertical scaling factor.
	 * @since 1.0
	 * @see #rotate(Number)
	 * @see #rotate(NumberLike)
	 * @see #translate(Number, Number)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void scale(Number sx, Number sy) {
		call(scale, new Vars<Object>().add(sx).add(sy));
	}
	/**
	 * <p>Draws, or strokes, a line following the current path.</p>
	 * <p>The line is drawn according to the {@link #lineWidth}, {@link #lineJoin}, 
	 * {@link #lineCap}, and {@link #strokeStyle} properties, among others.</p>
	 * @since 1.0
	 * @see #fill()
	 * @see #strokeRect(Number, Number, Number, Number)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void stroke() {
		call(stroke);
	}
	/**
	 * <p>Draws a rectangle without filling it.</p>
	 * <p>This method draws the outline, but does not fill the interior, of a rectangle 
	 * with the specified position and size. Line color and line width are specified by 
	 * the {@link #strokeStyle} and {@link #lineWidth} properties. The appearance of the 
	 * rectangle corners are specified by the {@link #lineJoin} property.</p>
	 * <p>Current implementations of this method clear the path as if {@link #beginPath()} 
	 * had been called. This surprising behavior may not be standardized and should not 
	 * be relied on.</p>
	 * @param x The X coordinate of the upper-left corner of the rectangle.
	 * @param y The Y coordinate of the upper-left corner of the rectangle.
	 * @param w The X dimension of the rectangle.
	 * @param h The Y dimension of the rectangle.
	 * @since 1.0
	 * @see #fillRect(Number, Number, Number, Number)
	 * @see #rect(Number, Number, Number, Number)
	 * @see #stroke()
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void strokeRect(Number x, Number y, Number w, Number h) {
		call(strokeRect, new Vars<Object>().add(x).add(y).add(w).add(h));
	}
	/**
	 * <p>Translates the user coordinate system of the canvas.</p>
	 * <p>This method adds horizontal and vertical offsets to the transformation matrix 
	 * of the canvas. The arguments <tt>dx</tt> and <tt>dy</tt> are added to all points 
	 * in any subsequently defined paths.</p>
	 * @param dx The amount to translate in the X dimension.
	 * @param dy The amount to translate in the Y dimension.
	 * @since 1.0
	 * @see #rotate(Number)
	 * @see #rotate(NumberLike)
	 * @see #scale(Number, Number)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void translate(Number dx, Number dy) {
		call(translate, new Vars<Object>().add(dx).add(dy));
	}
}
