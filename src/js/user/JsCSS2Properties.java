
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
 * {@link JsClient#CSS2Properties} class.</p>
 * <p>An object of this class represents a set of CSS style attributes and their values. 
 * It defines one JavaScript property for each CSS attribute defined by the CSS2 
 * specification. The {@link JsHTMLElement#style} property of a {@link JsHTMLElement} 
 * object is a read/write object of this <b>opaque</b> class, as is the {@link JsCSSRule#style} 
 * {@link JsWindow#getComputedStyle(JsHTMLElement, String)}, 
 * however, is an object of this class whose properties are read-only.</p>
 * <p>In addition to the {@link JsCSS2Properties#cssText} property, an object of this 
 * class also has a property corresponding to each CSS attribute that the browser 
 * supports. These property names correspond closely to the CSS attribute names, with 
 * minor changes required to avoid syntax errors in JavaScript. Multi-word attributes 
 * that contain hyphens, such as "font-family", are written without hyphens in JavaScript, 
 * and each word after the first is capitalized: <tt>fontFamily</tt>. Also, the "float" 
 * attribute conflicts with the reserved word float, so it translates to the property 
 * <tt>cssFloat</tt>.</p>
 * <p>Note that some browsers do not support all CSS attributes and may not implement 
 * all of the listed properties. All of the properties are strings. Setting any of 
 * these properties may throw the same exceptions as setting the {@link JsCSS2Properties#cssText} 
 * property.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsCSS2Properties extends JsClient.CSS2Properties.Prototype
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
	protected static abstract class Members extends JsClient.CSS2Properties.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#cssText
		 * @see JsCSS2Properties.Member#cssText
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid cssText = id("cssText");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#azimuth
		 * @see JsCSS2Properties.Member#azimuth
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid azimuth = id("azimuth");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#background
		 * @see JsCSS2Properties.Member#background
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid background = id("background");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#backgroundAttachment
		 * @see JsCSS2Properties.Member#backgroundAttachment
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid backgroundAttachment = id("backgroundAttachment");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#backgroundColor
		 * @see JsCSS2Properties.Member#backgroundColor
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid backgroundColor = id("backgroundColor");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#backgroundImage
		 * @see JsCSS2Properties.Member#backgroundImage
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid backgroundImage = id("backgroundImage");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#backgroundPosition
		 * @see JsCSS2Properties.Member#backgroundPosition
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid backgroundPosition = id("backgroundPosition");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#backgroundRepeat
		 * @see JsCSS2Properties.Member#backgroundRepeat
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid backgroundRepeat = id("backgroundRepeat");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#border
		 * @see JsCSS2Properties.Member#border
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid border = id("border");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#borderBottom
		 * @see JsCSS2Properties.Member#borderBottom
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid borderBottom = id("borderBottom");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#borderBottomColor
		 * @see JsCSS2Properties.Member#borderBottomColor
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid borderBottomColor = id("borderBottomColor");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#borderBottomStyle
		 * @see JsCSS2Properties.Member#borderBottomStyle
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid borderBottomStyle = id("borderBottomStyle");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#borderBottomWidth
		 * @see JsCSS2Properties.Member#borderBottomWidth
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid borderBottomWidth = id("borderBottomWidth");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#borderCollapse
		 * @see JsCSS2Properties.Member#borderCollapse
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid borderCollapse = id("borderCollapse");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#borderColor
		 * @see JsCSS2Properties.Member#borderColor
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid borderColor = id("borderColor");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#borderLeft
		 * @see JsCSS2Properties.Member#borderLeft
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid borderLeft = id("borderLeft");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#borderLeftColor
		 * @see JsCSS2Properties.Member#borderLeftColor
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid borderLeftColor = id("borderLeftColor");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#borderLeftStyle
		 * @see JsCSS2Properties.Member#borderLeftStyle
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid borderLeftStyle = id("borderLeftStyle");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#borderLeftWidth
		 * @see JsCSS2Properties.Member#borderLeftWidth
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid borderLeftWidth = id("borderLeftWidth");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#borderRight
		 * @see JsCSS2Properties.Member#borderRight
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid borderRight = id("borderRight");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#borderRightColor
		 * @see JsCSS2Properties.Member#borderRightColor
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid borderRightColor = id("borderRightColor");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#borderRightStyle
		 * @see JsCSS2Properties.Member#borderRightStyle
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid borderRightStyle = id("borderRightStyle");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#borderRightWidth
		 * @see JsCSS2Properties.Member#borderRightWidth
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid borderRightWidth = id("borderRightWidth");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#borderSpacing
		 * @see JsCSS2Properties.Member#borderSpacing
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid borderSpacing = id("borderSpacing");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#borderStyle
		 * @see JsCSS2Properties.Member#borderStyle
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid borderStyle = id("borderStyle");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#borderTop
		 * @see JsCSS2Properties.Member#borderTop
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid borderTop = id("borderTop");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#borderTopColor
		 * @see JsCSS2Properties.Member#borderTopColor
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid borderTopColor = id("borderTopColor");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#borderTopStyle
		 * @see JsCSS2Properties.Member#borderTopStyle
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid borderTopStyle = id("borderTopStyle");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#borderTopWidth
		 * @see JsCSS2Properties.Member#borderTopWidth
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid borderTopWidth = id("borderTopWidth");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#borderWidth
		 * @see JsCSS2Properties.Member#borderWidth
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid borderWidth = id("borderWidth");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#bottom
		 * @see JsCSS2Properties.Member#bottom
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid bottom = id("bottom");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#captionSide
		 * @see JsCSS2Properties.Member#captionSide
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid captionSide = id("captionSide");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#clear
		 * @see JsCSS2Properties.Member#clear
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid clear = id("clear");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#clip
		 * @see JsCSS2Properties.Member#clip
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid clip = id("clip");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#color
		 * @see JsCSS2Properties.Member#color
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid color = id("color");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#content
		 * @see JsCSS2Properties.Member#content
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid content = id("content");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#counterIncrement
		 * @see JsCSS2Properties.Member#counterIncrement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid counterIncrement = id("counterIncrement");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#counterReset
		 * @see JsCSS2Properties.Member#counterReset
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid counterReset = id("counterReset");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#cssFloat
		 * @see JsCSS2Properties.Member#cssFloat
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid cssFloat = id("cssFloat");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#cue
		 * @see JsCSS2Properties.Member#cue
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid cue = id("cue");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#cueAfter
		 * @see JsCSS2Properties.Member#cueAfter
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid cueAfter = id("cueAfter");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#cueBefore
		 * @see JsCSS2Properties.Member#cueBefore
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid cueBefore = id("cueBefore");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#cursor
		 * @see JsCSS2Properties.Member#cursor
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid cursor = id("cursor");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#direction
		 * @see JsCSS2Properties.Member#direction
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid direction = id("direction");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#display
		 * @see JsCSS2Properties.Member#display
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid display = id("display");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#elevation
		 * @see JsCSS2Properties.Member#elevation
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid elevation = id("elevation");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#emptyCells
		 * @see JsCSS2Properties.Member#emptyCells
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid emptyCells = id("emptyCells");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#filter
		 * @see JsCSS2Properties.Member#filter
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid filter = id("filter");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#font
		 * @see JsCSS2Properties.Member#font
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid font = id("font");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#fontFamily
		 * @see JsCSS2Properties.Member#fontFamily
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid fontFamily = id("fontFamily");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#fontSize
		 * @see JsCSS2Properties.Member#fontSize
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid fontSize = id("fontSize");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#fontSizeAdjust
		 * @see JsCSS2Properties.Member#fontSizeAdjust
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid fontSizeAdjust = id("fontSizeAdjust");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#fontStretch
		 * @see JsCSS2Properties.Member#fontStretch
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid fontStretch = id("fontStretch");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#fontStyle
		 * @see JsCSS2Properties.Member#fontStyle
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid fontStyle = id("fontStyle");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#fontVariant
		 * @see JsCSS2Properties.Member#fontVariant
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid fontVariant = id("fontVariant");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#fontWeight
		 * @see JsCSS2Properties.Member#fontWeight
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid fontWeight = id("fontWeight");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#height
		 * @see JsCSS2Properties.Member#height
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid height = id("height");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#left
		 * @see JsCSS2Properties.Member#left
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid left = id("left");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#letterSpacing
		 * @see JsCSS2Properties.Member#letterSpacing
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid letterSpacing = id("letterSpacing");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#lineHeight
		 * @see JsCSS2Properties.Member#lineHeight
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid lineHeight = id("lineHeight");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#listStyle
		 * @see JsCSS2Properties.Member#listStyle
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid listStyle = id("listStyle");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#listStyleImage
		 * @see JsCSS2Properties.Member#listStyleImage
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid listStyleImage = id("listStyleImage");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#listStylePosition
		 * @see JsCSS2Properties.Member#listStylePosition
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid listStylePosition = id("listStylePosition");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#listStyleType
		 * @see JsCSS2Properties.Member#listStyleType
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid listStyleType = id("listStyleType");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#margin
		 * @see JsCSS2Properties.Member#margin
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid margin = id("margin");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#marginBottom
		 * @see JsCSS2Properties.Member#marginBottom
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid marginBottom = id("marginBottom");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#marginLeft
		 * @see JsCSS2Properties.Member#marginLeft
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid marginLeft = id("marginLeft");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#marginRight
		 * @see JsCSS2Properties.Member#marginRight
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid marginRight = id("marginRight");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#marginTop
		 * @see JsCSS2Properties.Member#marginTop
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid marginTop = id("marginTop");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#markerOffset
		 * @see JsCSS2Properties.Member#markerOffset
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid markerOffset = id("markerOffset");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#marks
		 * @see JsCSS2Properties.Member#marks
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid marks = id("marks");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#maxHeight
		 * @see JsCSS2Properties.Member#maxHeight
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid maxHeight = id("maxHeight");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#maxWidth
		 * @see JsCSS2Properties.Member#maxWidth
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid maxWidth = id("maxWidth");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#minHeight
		 * @see JsCSS2Properties.Member#minHeight
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid minHeight = id("minHeight");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#minWidth
		 * @see JsCSS2Properties.Member#minWidth
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid minWidth = id("minWidth");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#opacity
		 * @see JsCSS2Properties.Member#opacity
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid opacity = id("opacity");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#orphans
		 * @see JsCSS2Properties.Member#orphans
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid orphans = id("orphans");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#outline
		 * @see JsCSS2Properties.Member#outline
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid outline = id("outline");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#outlineColor
		 * @see JsCSS2Properties.Member#outlineColor
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid outlineColor = id("outlineColor");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#outlineStyle
		 * @see JsCSS2Properties.Member#outlineStyle
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid outlineStyle = id("outlineStyle");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#outlineWidth
		 * @see JsCSS2Properties.Member#outlineWidth
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid outlineWidth = id("outlineWidth");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#overflow
		 * @see JsCSS2Properties.Member#overflow
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid overflow = id("overflow");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#overflowX
		 * @see JsCSS2Properties.Member#overflowX
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid overflowX = id("overflowX");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#overflowY
		 * @see JsCSS2Properties.Member#overflowY
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid overflowY = id("overflowY");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#padding
		 * @see JsCSS2Properties.Member#padding
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid padding = id("padding");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#paddingBottom
		 * @see JsCSS2Properties.Member#paddingBottom
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid paddingBottom = id("paddingBottom");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#paddingLeft
		 * @see JsCSS2Properties.Member#paddingLeft
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid paddingLeft = id("paddingLeft");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#paddingRight
		 * @see JsCSS2Properties.Member#paddingRight
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid paddingRight = id("paddingRight");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#paddingTop
		 * @see JsCSS2Properties.Member#paddingTop
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid paddingTop = id("paddingTop");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#page
		 * @see JsCSS2Properties.Member#page
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid page = id("page");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#pageBreakAfter
		 * @see JsCSS2Properties.Member#pageBreakAfter
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid pageBreakAfter = id("pageBreakAfter");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#pageBreakBefore
		 * @see JsCSS2Properties.Member#pageBreakBefore
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid pageBreakBefore = id("pageBreakBefore");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#pageBreakInside
		 * @see JsCSS2Properties.Member#pageBreakInside
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid pageBreakInside = id("pageBreakInside");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#pause
		 * @see JsCSS2Properties.Member#pause
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid pause = id("pause");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#pauseAfter
		 * @see JsCSS2Properties.Member#pauseAfter
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid pauseAfter = id("pauseAfter");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#pauseBefore
		 * @see JsCSS2Properties.Member#pauseBefore
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid pauseBefore = id("pauseBefore");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#pitch
		 * @see JsCSS2Properties.Member#pitch
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid pitch = id("pitch");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#pitchRange
		 * @see JsCSS2Properties.Member#pitchRange
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid pitchRange = id("pitchRange");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#playDuring
		 * @see JsCSS2Properties.Member#playDuring
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid playDuring = id("playDuring");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#position
		 * @see JsCSS2Properties.Member#position
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid position = id("position");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#quotes
		 * @see JsCSS2Properties.Member#quotes
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid quotes = id("quotes");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#richness
		 * @see JsCSS2Properties.Member#richness
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid richness = id("richness");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#right
		 * @see JsCSS2Properties.Member#right
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid right = id("right");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#size
		 * @see JsCSS2Properties.Member#size
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid size = id("size");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#speak
		 * @see JsCSS2Properties.Member#speak
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid speak = id("speak");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#speakHeader
		 * @see JsCSS2Properties.Member#speakHeader
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid speakHeader = id("speakHeader");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#speakNumeral
		 * @see JsCSS2Properties.Member#speakNumeral
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid speakNumeral = id("speakNumeral");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#speakPunctuation
		 * @see JsCSS2Properties.Member#speakPunctuation
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid speakPunctuation = id("speakPunctuation");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#speechRate
		 * @see JsCSS2Properties.Member#speechRate
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid speechRate = id("speechRate");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#stress
		 * @see JsCSS2Properties.Member#stress
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid stress = id("stress");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#styleFloat
		 * @see JsCSS2Properties.Member#styleFloat
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid styleFloat = id("styleFloat");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#tableLayout
		 * @see JsCSS2Properties.Member#tableLayout
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid tableLayout = id("tableLayout");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#textAlign
		 * @see JsCSS2Properties.Member#textAlign
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid textAlign = id("textAlign");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#textDecoration
		 * @see JsCSS2Properties.Member#textDecoration
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid textDecoration = id("textDecoration");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#textIndent
		 * @see JsCSS2Properties.Member#textIndent
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid textIndent = id("textIndent");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#textShadow
		 * @see JsCSS2Properties.Member#textShadow
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid textShadow = id("textShadow");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#textTransform
		 * @see JsCSS2Properties.Member#textTransform
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid textTransform = id("textTransform");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#top
		 * @see JsCSS2Properties.Member#top
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid top = id("top");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#unicodeBidi
		 * @see JsCSS2Properties.Member#unicodeBidi
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid unicodeBidi = id("unicodeBidi");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#verticalAlign
		 * @see JsCSS2Properties.Member#verticalAlign
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid verticalAlign = id("verticalAlign");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#visibility
		 * @see JsCSS2Properties.Member#visibility
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid visibility = id("visibility");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#voiceFamily
		 * @see JsCSS2Properties.Member#voiceFamily
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid voiceFamily = id("voiceFamily");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#volume
		 * @see JsCSS2Properties.Member#volume
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid volume = id("volume");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#whiteSpace
		 * @see JsCSS2Properties.Member#whiteSpace
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid whiteSpace = id("whiteSpace");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#widows
		 * @see JsCSS2Properties.Member#widows
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid widows = id("widows");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#width
		 * @see JsCSS2Properties.Member#width
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid width = id("width");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#wordSpacing
		 * @see JsCSS2Properties.Member#wordSpacing
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid wordSpacing = id("wordSpacing");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCSS2Properties#zIndex
		 * @see JsCSS2Properties.Member#zIndex
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid zIndex = id("zIndex");
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
	public static class Member extends JsClient.CSS2Properties.Prototype.Member
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
		public JsCSS2Properties with(ObjectLike o) {
			return new JsCSS2Properties(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The textual representation of a set of style attributes and their values. 
		 * The text is formated as in a CSS stylesheet, minus the element selector and 
		 * the curly braces that surround the attributes and values. Setting this 
		 * property to an illegal value throws a {@link JsDOMException} with the 
		 * {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set this property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member cssText = new Value.String.Member(this, Members.cssText);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member azimuth = new Value.String.Member(this, Members.azimuth);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member background = new Value.String.Member(this, Members.background);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member backgroundAttachment = new Value.String.Member(this, Members.backgroundAttachment);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member backgroundColor = new Value.String.Member(this, Members.backgroundColor);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member backgroundImage = new Value.String.Member(this, Members.backgroundImage);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member backgroundPosition = new Value.String.Member(this, Members.backgroundPosition);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member backgroundRepeat = new Value.String.Member(this, Members.backgroundRepeat);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member border = new Value.String.Member(this, Members.border);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member borderBottom = new Value.String.Member(this, Members.borderBottom);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member borderBottomColor = new Value.String.Member(this, Members.borderBottomColor);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member borderBottomStyle = new Value.String.Member(this, Members.borderBottomStyle);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member borderBottomWidth = new Value.String.Member(this, Members.borderBottomWidth);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member borderCollapse = new Value.String.Member(this, Members.borderCollapse);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member borderColor = new Value.String.Member(this, Members.borderColor);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member borderLeft = new Value.String.Member(this, Members.borderLeft);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member borderLeftColor = new Value.String.Member(this, Members.borderLeftColor);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member borderLeftStyle = new Value.String.Member(this, Members.borderLeftStyle);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member borderLeftWidth = new Value.String.Member(this, Members.borderLeftWidth);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member borderRight = new Value.String.Member(this, Members.borderRight);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member borderRightColor = new Value.String.Member(this, Members.borderRightColor);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member borderRightStyle = new Value.String.Member(this, Members.borderRightStyle);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member borderRightWidth = new Value.String.Member(this, Members.borderRightWidth);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member borderSpacing = new Value.String.Member(this, Members.borderSpacing);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member borderStyle = new Value.String.Member(this, Members.borderStyle);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member borderTop = new Value.String.Member(this, Members.borderTop);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member borderTopColor = new Value.String.Member(this, Members.borderTopColor);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member borderTopStyle = new Value.String.Member(this, Members.borderTopStyle);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member borderTopWidth = new Value.String.Member(this, Members.borderTopWidth);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member borderWidth = new Value.String.Member(this, Members.borderWidth);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member bottom = new Value.String.Member(this, Members.bottom);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member captionSide = new Value.String.Member(this, Members.captionSide);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member clear = new Value.String.Member(this, Members.clear);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member clip = new Value.String.Member(this, Members.clip);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member color = new Value.String.Member(this, Members.color);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member content = new Value.String.Member(this, Members.content);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member counterIncrement = new Value.String.Member(this, Members.counterIncrement);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member counterReset = new Value.String.Member(this, Members.counterReset);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member cssFloat = new Value.String.Member(this, Members.cssFloat);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member cue = new Value.String.Member(this, Members.cue);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member cueAfter = new Value.String.Member(this, Members.cueAfter);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member cueBefore = new Value.String.Member(this, Members.cueBefore);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member cursor = new Value.String.Member(this, Members.cursor);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member direction = new Value.String.Member(this, Members.direction);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member display = new Value.String.Member(this, Members.display);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member elevation = new Value.String.Member(this, Members.elevation);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member emptyCells = new Value.String.Member(this, Members.emptyCells);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member filter = new Value.String.Member(this, Members.filter);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member font = new Value.String.Member(this, Members.font);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member fontFamily = new Value.String.Member(this, Members.fontFamily);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member fontSize = new Value.String.Member(this, Members.fontSize);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member fontSizeAdjust = new Value.String.Member(this, Members.fontSizeAdjust);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member fontStretch = new Value.String.Member(this, Members.fontStretch);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member fontStyle = new Value.String.Member(this, Members.fontStyle);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member fontVariant = new Value.String.Member(this, Members.fontVariant);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member fontWeight = new Value.String.Member(this, Members.fontWeight);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member height = new Value.String.Member(this, Members.height);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member left = new Value.String.Member(this, Members.left);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member letterSpacing = new Value.String.Member(this, Members.letterSpacing);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member lineHeight = new Value.String.Member(this, Members.lineHeight);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member listStyle = new Value.String.Member(this, Members.listStyle);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member listStyleImage = new Value.String.Member(this, Members.listStyleImage);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member listStylePosition = new Value.String.Member(this, Members.listStylePosition);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member listStyleType = new Value.String.Member(this, Members.listStyleType);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member margin = new Value.String.Member(this, Members.margin);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member marginBottom = new Value.String.Member(this, Members.marginBottom);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member marginLeft = new Value.String.Member(this, Members.marginLeft);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member marginRight = new Value.String.Member(this, Members.marginRight);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member marginTop = new Value.String.Member(this, Members.marginTop);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member markerOffset = new Value.String.Member(this, Members.markerOffset);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member marks = new Value.String.Member(this, Members.marks);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member maxHeight = new Value.String.Member(this, Members.maxHeight);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member maxWidth = new Value.String.Member(this, Members.maxWidth);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member minHeight = new Value.String.Member(this, Members.minHeight);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member minWidth = new Value.String.Member(this, Members.minWidth);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member opacity = new Value.String.Member(this, Members.opacity);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member orphans = new Value.String.Member(this, Members.orphans);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member outline = new Value.String.Member(this, Members.outline);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member outlineColor = new Value.String.Member(this, Members.outlineColor);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member outlineStyle = new Value.String.Member(this, Members.outlineStyle);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member outlineWidth = new Value.String.Member(this, Members.outlineWidth);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member overflow = new Value.String.Member(this, Members.overflow);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member overflowX = new Value.String.Member(this, Members.overflowX);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member overflowY = new Value.String.Member(this, Members.overflowY);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member padding = new Value.String.Member(this, Members.padding);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member paddingBottom = new Value.String.Member(this, Members.paddingBottom);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member paddingLeft = new Value.String.Member(this, Members.paddingLeft);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member paddingRight = new Value.String.Member(this, Members.paddingRight);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member paddingTop = new Value.String.Member(this, Members.paddingTop);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member page = new Value.String.Member(this, Members.page);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member pageBreakAfter = new Value.String.Member(this, Members.pageBreakAfter);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member pageBreakBefore = new Value.String.Member(this, Members.pageBreakBefore);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member pageBreakInside = new Value.String.Member(this, Members.pageBreakInside);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member pause = new Value.String.Member(this, Members.pause);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member pauseAfter = new Value.String.Member(this, Members.pauseAfter);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member pauseBefore = new Value.String.Member(this, Members.pauseBefore);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member pitch = new Value.String.Member(this, Members.pitch);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member pitchRange = new Value.String.Member(this, Members.pitchRange);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member playDuring = new Value.String.Member(this, Members.playDuring);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member position = new Value.String.Member(this, Members.position);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member quotes = new Value.String.Member(this, Members.quotes);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member richness = new Value.String.Member(this, Members.richness);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member right = new Value.String.Member(this, Members.right);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member size = new Value.String.Member(this, Members.size);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member speak = new Value.String.Member(this, Members.speak);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member speakHeader = new Value.String.Member(this, Members.speakHeader);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member speakNumeral = new Value.String.Member(this, Members.speakNumeral);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member speakPunctuation = new Value.String.Member(this, Members.speakPunctuation);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member speechRate = new Value.String.Member(this, Members.speechRate);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member stress = new Value.String.Member(this, Members.stress);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member styleFloat = new Value.String.Member(this, Members.styleFloat);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member tableLayout = new Value.String.Member(this, Members.tableLayout);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member textAlign = new Value.String.Member(this, Members.textAlign);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member textDecoration = new Value.String.Member(this, Members.textDecoration);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member textIndent = new Value.String.Member(this, Members.textIndent);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member textShadow = new Value.String.Member(this, Members.textShadow);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member textTransform = new Value.String.Member(this, Members.textTransform);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member top = new Value.String.Member(this, Members.top);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member unicodeBidi = new Value.String.Member(this, Members.unicodeBidi);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member verticalAlign = new Value.String.Member(this, Members.verticalAlign);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member visibility = new Value.String.Member(this, Members.visibility);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member voiceFamily = new Value.String.Member(this, Members.voiceFamily);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member volume = new Value.String.Member(this, Members.volume);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member whiteSpace = new Value.String.Member(this, Members.whiteSpace);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member widows = new Value.String.Member(this, Members.widows);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member width = new Value.String.Member(this, Members.width);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member wordSpacing = new Value.String.Member(this, Members.wordSpacing);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
		 * refers to the text value of a CSS attribute with its name indicated by the name of the
		 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
		 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
		 * Attempting to set the property when the current object is read-only throws 
		 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
		 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member zIndex = new Value.String.Member(this, Members.zIndex);
	}

	public JsCSS2Properties(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The textual representation of a set of style attributes and their values. 
	 * The text is formated as in a CSS stylesheet, minus the element selector and 
	 * the curly braces that surround the attributes and values. Setting this 
	 * property to an illegal value throws a {@link JsDOMException} with the 
	 * {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set this property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member cssText = new Value.String.Member(Members.cssText);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member azimuth = new Value.String.Member(Members.azimuth);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member background = new Value.String.Member(Members.background);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member backgroundAttachment = new Value.String.Member(Members.backgroundAttachment);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member backgroundColor = new Value.String.Member(Members.backgroundColor);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member backgroundImage = new Value.String.Member(Members.backgroundImage);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member backgroundPosition = new Value.String.Member(Members.backgroundPosition);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member backgroundRepeat = new Value.String.Member(Members.backgroundRepeat);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member border = new Value.String.Member(Members.border);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member borderBottom = new Value.String.Member(Members.borderBottom);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member borderBottomColor = new Value.String.Member(Members.borderBottomColor);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member borderBottomStyle = new Value.String.Member(Members.borderBottomStyle);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member borderBottomWidth = new Value.String.Member(Members.borderBottomWidth);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member borderCollapse = new Value.String.Member(Members.borderCollapse);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member borderColor = new Value.String.Member(Members.borderColor);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member borderLeft = new Value.String.Member(Members.borderLeft);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member borderLeftColor = new Value.String.Member(Members.borderLeftColor);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member borderLeftStyle = new Value.String.Member(Members.borderLeftStyle);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member borderLeftWidth = new Value.String.Member(Members.borderLeftWidth);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member borderRight = new Value.String.Member(Members.borderRight);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member borderRightColor = new Value.String.Member(Members.borderRightColor);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member borderRightStyle = new Value.String.Member(Members.borderRightStyle);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member borderRightWidth = new Value.String.Member(Members.borderRightWidth);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member borderSpacing = new Value.String.Member(Members.borderSpacing);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member borderStyle = new Value.String.Member(Members.borderStyle);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member borderTop = new Value.String.Member(Members.borderTop);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member borderTopColor = new Value.String.Member(Members.borderTopColor);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member borderTopStyle = new Value.String.Member(Members.borderTopStyle);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member borderTopWidth = new Value.String.Member(Members.borderTopWidth);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member borderWidth = new Value.String.Member(Members.borderWidth);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member bottom = new Value.String.Member(Members.bottom);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member captionSide = new Value.String.Member(Members.captionSide);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member clear = new Value.String.Member(Members.clear);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member clip = new Value.String.Member(Members.clip);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member color = new Value.String.Member(Members.color);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member content = new Value.String.Member(Members.content);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member counterIncrement = new Value.String.Member(Members.counterIncrement);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member counterReset = new Value.String.Member(Members.counterReset);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member cssFloat = new Value.String.Member(Members.cssFloat);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member cue = new Value.String.Member(Members.cue);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member cueAfter = new Value.String.Member(Members.cueAfter);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member cueBefore = new Value.String.Member(Members.cueBefore);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member cursor = new Value.String.Member(Members.cursor);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member direction = new Value.String.Member(Members.direction);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member display = new Value.String.Member(Members.display);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member elevation = new Value.String.Member(Members.elevation);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member emptyCells = new Value.String.Member(Members.emptyCells);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member filter = new Value.String.Member(Members.filter);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member font = new Value.String.Member(Members.font);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member fontFamily = new Value.String.Member(Members.fontFamily);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member fontSize = new Value.String.Member(Members.fontSize);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member fontSizeAdjust = new Value.String.Member(Members.fontSizeAdjust);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member fontStretch = new Value.String.Member(Members.fontStretch);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member fontStyle = new Value.String.Member(Members.fontStyle);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member fontVariant = new Value.String.Member(Members.fontVariant);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member fontWeight = new Value.String.Member(Members.fontWeight);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member height = new Value.String.Member(Members.height);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member left = new Value.String.Member(Members.left);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member letterSpacing = new Value.String.Member(Members.letterSpacing);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member lineHeight = new Value.String.Member(Members.lineHeight);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member listStyle = new Value.String.Member(Members.listStyle);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member listStyleImage = new Value.String.Member(Members.listStyleImage);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member listStylePosition = new Value.String.Member(Members.listStylePosition);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member listStyleType = new Value.String.Member(Members.listStyleType);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member margin = new Value.String.Member(Members.margin);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member marginBottom = new Value.String.Member(Members.marginBottom);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member marginLeft = new Value.String.Member(Members.marginLeft);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member marginRight = new Value.String.Member(Members.marginRight);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member marginTop = new Value.String.Member(Members.marginTop);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member markerOffset = new Value.String.Member(Members.markerOffset);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member marks = new Value.String.Member(Members.marks);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member maxHeight = new Value.String.Member(Members.maxHeight);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member maxWidth = new Value.String.Member(Members.maxWidth);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member minHeight = new Value.String.Member(Members.minHeight);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member minWidth = new Value.String.Member(Members.minWidth);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member opacity = new Value.String.Member(Members.opacity);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member orphans = new Value.String.Member(Members.orphans);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member outline = new Value.String.Member(Members.outline);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member outlineColor = new Value.String.Member(Members.outlineColor);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member outlineStyle = new Value.String.Member(Members.outlineStyle);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member outlineWidth = new Value.String.Member(Members.outlineWidth);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member overflow = new Value.String.Member(Members.overflow);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member overflowX = new Value.String.Member(Members.overflowX);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member overflowY = new Value.String.Member(Members.overflowY);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member padding = new Value.String.Member(Members.padding);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member paddingBottom = new Value.String.Member(Members.paddingBottom);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member paddingLeft = new Value.String.Member(Members.paddingLeft);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member paddingRight = new Value.String.Member(Members.paddingRight);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member paddingTop = new Value.String.Member(Members.paddingTop);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member page = new Value.String.Member(Members.page);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member pageBreakAfter = new Value.String.Member(Members.pageBreakAfter);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member pageBreakBefore = new Value.String.Member(Members.pageBreakBefore);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member pageBreakInside = new Value.String.Member(Members.pageBreakInside);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member pause = new Value.String.Member(Members.pause);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member pauseAfter = new Value.String.Member(Members.pauseAfter);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member pauseBefore = new Value.String.Member(Members.pauseBefore);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member pitch = new Value.String.Member(Members.pitch);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member pitchRange = new Value.String.Member(Members.pitchRange);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member playDuring = new Value.String.Member(Members.playDuring);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member position = new Value.String.Member(Members.position);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member quotes = new Value.String.Member(Members.quotes);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member richness = new Value.String.Member(Members.richness);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member right = new Value.String.Member(Members.right);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member size = new Value.String.Member(Members.size);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member speak = new Value.String.Member(Members.speak);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member speakHeader = new Value.String.Member(Members.speakHeader);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member speakNumeral = new Value.String.Member(Members.speakNumeral);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member speakPunctuation = new Value.String.Member(Members.speakPunctuation);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member speechRate = new Value.String.Member(Members.speechRate);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member stress = new Value.String.Member(Members.stress);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member styleFloat = new Value.String.Member(Members.styleFloat);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member tableLayout = new Value.String.Member(Members.tableLayout);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member textAlign = new Value.String.Member(Members.textAlign);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member textDecoration = new Value.String.Member(Members.textDecoration);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member textIndent = new Value.String.Member(Members.textIndent);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member textShadow = new Value.String.Member(Members.textShadow);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member textTransform = new Value.String.Member(Members.textTransform);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member top = new Value.String.Member(Members.top);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member unicodeBidi = new Value.String.Member(Members.unicodeBidi);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member verticalAlign = new Value.String.Member(Members.verticalAlign);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member visibility = new Value.String.Member(Members.visibility);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member voiceFamily = new Value.String.Member(Members.voiceFamily);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member volume = new Value.String.Member(Members.volume);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member whiteSpace = new Value.String.Member(Members.whiteSpace);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member widows = new Value.String.Member(Members.widows);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member width = new Value.String.Member(Members.width);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member wordSpacing = new Value.String.Member(Members.wordSpacing);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCSS2Properties} object 
	 * refers to the text value of a CSS attribute with its name indicated by the name of the
	 * member. Setting the property to an illegal value throws a {@link JsDOMException} 
	 * with the {@link JsDOMException#code} property of the value {@link JsDOMException#SYNTAX_ERR}. 
	 * Attempting to set the property when the current object is read-only throws 
	 * a {@link JsDOMException} exception with the {@link JsDOMException#code} 
	 * property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member zIndex = new Value.String.Member(Members.zIndex);

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
	@Override
	public JsCSS2Properties valueOf() {
		return new JsCSS2Properties((JsObject)var().valueOf());
	}
}
