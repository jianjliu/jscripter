
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

package jsx.dom;

import js.*;
import js.user.JsCSS2Properties;
import js.user.JsHTMLElement;
import jsx.client.Document;
import jsx.client.Global;
import jsx.client.Browser;
import jsx.core.ArrayLikes;
import jsx.core.Maths;
import jsx.core.RegExpLikes;
import jsx.core.StringLikes;
import jsx.core.Variables;

/**
 * <p>A utility class providing CSS support with its static methods.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Styles extends Disposable
{
	private Styles() {}

	private final static RegExpLike OPACITY = Js.re("alpha\\(opacity=(.*)\\)", "i");

	/**
	 * <p>Computes the transparency value from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A number value of transparency.
	 * @since 1.0
	 */
	public static final double transparency(ObjectLike p) {
		if (Browser.isIE) {
			ArrayLike<?> opacity = OPACITY.exec(Styles.filter(p));
			if (Js.be(opacity)) {
				String s = (String)opacity.get(1);
				if (Js.be(s)) {
					return 1 - Global.parseFloat(s) / 100;
				}
			}
		} else {
			String s = Styles.opacity(p);
			if (Js.be(s)) {
				return 1 - Global.parseFloat(s);
			}
		}
		return 0;
	}

	/**
	 * <p>Stores the transparency value into a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param v A number value of transparency.
	 * @since 1.0
	 */
	public static final void transparency(ObjectLike p, double v) {
		v = 1 - v;
		if (Browser.isIE) {
			Styles.filter(p, Js.add(Js.add("alpha(opacity=", v * 100), ")"));
		} else {
			Styles.opacity(p, Js.toString(v));
		}
	}

	/**
	 * <p>A regular expression for checking existence of "border", "margin" or "padding" styles
	 * in {@link JsCSS2Properties} objects.</p>
	 * @since 1.0
	 */
	public final static RegExpLike BMP = Js.re(
			new Value.String("border" ).add("|")
			            .add("margin" ).add("|")
			            .add("padding").var()
	);

	/**
	 * <p>Tests the regular expression against each property of a {@link JsCSS2Properties} object.</p>
	 * <p>This method returns <tt>true</tt> if a test against any of the properties returns <tt>true</tt>
	 * and returns <tt>false</tt> otherwise.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param re The regular expression.
	 * @return <tt>true</tt> if a test against any of the properties returns <tt>true</tt>;
	 * <tt>false</tt>, otherwise
	 * @since 1.0
	 */
	public static final boolean relevant(ObjectLike p, RegExpLike re) {
		ArrayLike<String> keys = Js.keys(p);
		for (int i = 0, len = ArrayLikes.length(keys); i < len; i++) {
			if (RegExpLikes.test(re, keys.get(i))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <p>Converts a percentage into string.</p>
	 * @param pc A number value for percentage.
	 * @return A string representation of the percentage.
	 * @since 1.0
	 */
	public static final String pc(Number pc) {
		return Variables.undefined(pc) ? "" : Js.add(pc, "%");
	}

	/**
	 * <p>Creates a pixel style.</p>
	 * @param px A number value for pixel.
	 * @return A string representation of the pixel.
	 * @since 1.0
	 */
	public static final String px(Number px) {
		return Variables.undefined(px) ? "" : Js.add(Maths.round(px), "px");
	}

	private final static RegExpLike NONPX = Js.re(
			"cm|em|en|ex|in|mm|pc|pt", "i"
	);

	/**
	 * <p>Computes the value in pixel from a position style.</p>
	 * @param px A position style.
	 * @return A number value in pixel for the position.
	 * @since 1.0
	 */
	public static final double px(String px) {
		if (Js.not(px) || Js.eq(px, "auto")) {
			return 0;
		}
		px = StringLikes.trim(px);
		int i = px.lastIndexOf("px");
		if (i > 0) {
			px = px.substring(0, i);
		} else if (NONPX.test(px)) {
			return compute(px);
		}
		Double n = Global.parseFloat(px);
		if (Js.not(n)) {
			return 0;
		}
		return n;
	}

	private static final double compute(String v) {
		JsHTMLElement e = COMPUTER.var();
		ObjectLike s = Elements.style(e);
		width(s, v);
		return Elements.offsetWidth(e).doubleValue();
	}

	private final static Var<JsHTMLElement> COMPUTER = new Static<JsHTMLElement>(
			new Var<JsHTMLElement>() {
				@Override
				public JsHTMLElement var() {
					JsHTMLElement div = Elements.createDiv();
					Elements.absolute(div);
					Nodes.appendChild(Document.body.var(), div);
					return div;
				}
			}
	);

	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String azimuth(ObjectLike p) { return JsCSS2Properties.azimuth.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String background(ObjectLike p) { return JsCSS2Properties.background.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String backgroundAttachment(ObjectLike p) { return JsCSS2Properties.backgroundAttachment.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String backgroundColor(ObjectLike p) { return JsCSS2Properties.backgroundColor.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String backgroundImage(ObjectLike p) { return JsCSS2Properties.backgroundImage.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String backgroundPosition(ObjectLike p) { return JsCSS2Properties.backgroundPosition.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String backgroundRepeat(ObjectLike p) { return JsCSS2Properties.backgroundRepeat.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String border(ObjectLike p) { return JsCSS2Properties.border.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String borderBottom(ObjectLike p) { return JsCSS2Properties.borderBottom.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String borderBottomColor(ObjectLike p) { return JsCSS2Properties.borderBottomColor.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String borderBottomStyle(ObjectLike p) { return JsCSS2Properties.borderBottomStyle.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String borderBottomWidth(ObjectLike p) { return JsCSS2Properties.borderBottomWidth.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String borderCollapse(ObjectLike p) { return JsCSS2Properties.borderCollapse.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String borderColor(ObjectLike p) { return JsCSS2Properties.borderColor.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String borderLeft(ObjectLike p) { return JsCSS2Properties.borderLeft.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String borderLeftColor(ObjectLike p) { return JsCSS2Properties.borderLeftColor.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String borderLeftStyle(ObjectLike p) { return JsCSS2Properties.borderLeftStyle.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String borderLeftWidth(ObjectLike p) { return JsCSS2Properties.borderLeftWidth.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String borderRight(ObjectLike p) { return JsCSS2Properties.borderRight.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String borderRightColor(ObjectLike p) { return JsCSS2Properties.borderRightColor.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String borderRightStyle(ObjectLike p) { return JsCSS2Properties.borderRightStyle.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String borderRightWidth(ObjectLike p) { return JsCSS2Properties.borderRightWidth.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String borderSpacing(ObjectLike p) { return JsCSS2Properties.borderSpacing.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String borderStyle(ObjectLike p) { return JsCSS2Properties.borderStyle.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String borderTop(ObjectLike p) { return JsCSS2Properties.borderTop.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String borderTopColor(ObjectLike p) { return JsCSS2Properties.borderTopColor.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String borderTopStyle(ObjectLike p) { return JsCSS2Properties.borderTopStyle.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String borderTopWidth(ObjectLike p) { return JsCSS2Properties.borderTopWidth.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String borderWidth(ObjectLike p) { return JsCSS2Properties.borderWidth.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String bottom(ObjectLike p) { return JsCSS2Properties.bottom.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String captionSide(ObjectLike p) { return JsCSS2Properties.captionSide.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String clear(ObjectLike p) { return JsCSS2Properties.clear.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String clip(ObjectLike p) { return JsCSS2Properties.clip.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String color(ObjectLike p) { return JsCSS2Properties.color.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String content(ObjectLike p) { return JsCSS2Properties.content.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String counterIncrement(ObjectLike p) { return JsCSS2Properties.counterIncrement.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String counterReset(ObjectLike p) { return JsCSS2Properties.counterReset.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String cssFloat(ObjectLike p) { return JsCSS2Properties.cssFloat.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String cue(ObjectLike p) { return JsCSS2Properties.cue.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String cueAfter(ObjectLike p) { return JsCSS2Properties.cueAfter.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String cueBefore(ObjectLike p) { return JsCSS2Properties.cueBefore.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String cursor(ObjectLike p) { return JsCSS2Properties.cursor.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String direction(ObjectLike p) { return JsCSS2Properties.direction.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String display(ObjectLike p) { return JsCSS2Properties.display.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String elevation(ObjectLike p) { return JsCSS2Properties.elevation.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String emptyCells(ObjectLike p) { return JsCSS2Properties.emptyCells.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String filter(ObjectLike p) { return JsCSS2Properties.filter.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String font(ObjectLike p) { return JsCSS2Properties.font.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String fontFamily(ObjectLike p) { return JsCSS2Properties.fontFamily.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String fontSize(ObjectLike p) { return JsCSS2Properties.fontSize.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String fontSizeAdjust(ObjectLike p) { return JsCSS2Properties.fontSizeAdjust.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String fontStretch(ObjectLike p) { return JsCSS2Properties.fontStretch.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String fontStyle(ObjectLike p) { return JsCSS2Properties.fontStyle.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String fontVariant(ObjectLike p) { return JsCSS2Properties.fontVariant.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String fontWeight(ObjectLike p) { return JsCSS2Properties.fontWeight.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String height(ObjectLike p) { return JsCSS2Properties.height.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String left(ObjectLike p) { return JsCSS2Properties.left.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String letterSpacing(ObjectLike p) { return JsCSS2Properties.letterSpacing.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String lineHeight(ObjectLike p) { return JsCSS2Properties.lineHeight.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String listStyle(ObjectLike p) { return JsCSS2Properties.listStyle.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String listStyleImage(ObjectLike p) { return JsCSS2Properties.listStyleImage.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String listStylePosition(ObjectLike p) { return JsCSS2Properties.listStylePosition.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String listStyleType(ObjectLike p) { return JsCSS2Properties.listStyleType.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String margin(ObjectLike p) { return JsCSS2Properties.margin.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String marginBottom(ObjectLike p) { return JsCSS2Properties.marginBottom.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String marginLeft(ObjectLike p) { return JsCSS2Properties.marginLeft.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String marginRight(ObjectLike p) { return JsCSS2Properties.marginRight.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String marginTop(ObjectLike p) { return JsCSS2Properties.marginTop.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String markerOffset(ObjectLike p) { return JsCSS2Properties.markerOffset.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String marks(ObjectLike p) { return JsCSS2Properties.marks.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String maxHeight(ObjectLike p) { return JsCSS2Properties.maxHeight.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String maxWidth(ObjectLike p) { return JsCSS2Properties.maxWidth.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String minHeight(ObjectLike p) { return JsCSS2Properties.minHeight.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String minWidth(ObjectLike p) { return JsCSS2Properties.minWidth.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String opacity(ObjectLike p) { return JsCSS2Properties.opacity.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String orphans(ObjectLike p) { return JsCSS2Properties.orphans.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String outline(ObjectLike p) { return JsCSS2Properties.outline.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String outlineColor(ObjectLike p) { return JsCSS2Properties.outlineColor.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String outlineStyle(ObjectLike p) { return JsCSS2Properties.outlineStyle.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String outlineWidth(ObjectLike p) { return JsCSS2Properties.outlineWidth.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String overflow(ObjectLike p) { return JsCSS2Properties.overflow.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String overflowX(ObjectLike p) { return JsCSS2Properties.overflowX.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String overflowY(ObjectLike p) { return JsCSS2Properties.overflowY.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String padding(ObjectLike p) { return JsCSS2Properties.padding.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String paddingBottom(ObjectLike p) { return JsCSS2Properties.paddingBottom.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String paddingLeft(ObjectLike p) { return JsCSS2Properties.paddingLeft.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String paddingRight(ObjectLike p) { return JsCSS2Properties.paddingRight.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String paddingTop(ObjectLike p) { return JsCSS2Properties.paddingTop.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String page(ObjectLike p) { return JsCSS2Properties.page.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String pageBreakAfter(ObjectLike p) { return JsCSS2Properties.pageBreakAfter.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String pageBreakBefore(ObjectLike p) { return JsCSS2Properties.pageBreakBefore.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String pageBreakInside(ObjectLike p) { return JsCSS2Properties.pageBreakInside.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String pause(ObjectLike p) { return JsCSS2Properties.pause.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String pauseAfter(ObjectLike p) { return JsCSS2Properties.pauseAfter.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String pauseBefore(ObjectLike p) { return JsCSS2Properties.pauseBefore.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String pitch(ObjectLike p) { return JsCSS2Properties.pitch.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String pitchRange(ObjectLike p) { return JsCSS2Properties.pitchRange.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String playDuring(ObjectLike p) { return JsCSS2Properties.playDuring.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String position(ObjectLike p) { return JsCSS2Properties.position.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String quotes(ObjectLike p) { return JsCSS2Properties.quotes.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String richness(ObjectLike p) { return JsCSS2Properties.richness.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String right(ObjectLike p) { return JsCSS2Properties.right.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String size(ObjectLike p) { return JsCSS2Properties.size.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String speak(ObjectLike p) { return JsCSS2Properties.speak.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String speakHeader(ObjectLike p) { return JsCSS2Properties.speakHeader.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String speakNumeral(ObjectLike p) { return JsCSS2Properties.speakNumeral.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String speakPunctuation(ObjectLike p) { return JsCSS2Properties.speakPunctuation.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String speechRate(ObjectLike p) { return JsCSS2Properties.speechRate.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String stress(ObjectLike p) { return JsCSS2Properties.stress.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String styleFloat(ObjectLike p) { return JsCSS2Properties.styleFloat.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String tableLayout(ObjectLike p) { return JsCSS2Properties.tableLayout.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String textAlign(ObjectLike p) { return JsCSS2Properties.textAlign.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String textDecoration(ObjectLike p) { return JsCSS2Properties.textDecoration.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String textIndent(ObjectLike p) { return JsCSS2Properties.textIndent.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String textShadow(ObjectLike p) { return JsCSS2Properties.textShadow.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String textTransform(ObjectLike p) { return JsCSS2Properties.textTransform.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String top(ObjectLike p) { return JsCSS2Properties.top.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String unicodeBidi(ObjectLike p) { return JsCSS2Properties.unicodeBidi.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String verticalAlign(ObjectLike p) { return JsCSS2Properties.verticalAlign.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String visibility(ObjectLike p) { return JsCSS2Properties.visibility.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String voiceFamily(ObjectLike p) { return JsCSS2Properties.voiceFamily.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String volume(ObjectLike p) { return JsCSS2Properties.volume.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String whiteSpace(ObjectLike p) { return JsCSS2Properties.whiteSpace.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String widows(ObjectLike p) { return JsCSS2Properties.widows.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String width(ObjectLike p) { return JsCSS2Properties.width.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String wordSpacing(ObjectLike p) { return JsCSS2Properties.wordSpacing.with(p);}
	/**
	 * <p>Gets the string value of the property named by this method from a {@link JsCSS2Properties} object.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @return A string value of the property.
	 * @since 1.0
	 */
	public static final String zIndex(ObjectLike p) { return JsCSS2Properties.zIndex.with(p);}

	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String azimuth(ObjectLike p, String s) { return JsCSS2Properties.azimuth.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String background(ObjectLike p, String s) { return JsCSS2Properties.background.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String backgroundAttachment(ObjectLike p, String s) { return JsCSS2Properties.backgroundAttachment.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String backgroundColor(ObjectLike p, String s) { return JsCSS2Properties.backgroundColor.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String backgroundImage(ObjectLike p, String s) { return JsCSS2Properties.backgroundImage.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String backgroundPosition(ObjectLike p, String s) { return JsCSS2Properties.backgroundPosition.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String backgroundRepeat(ObjectLike p, String s) { return JsCSS2Properties.backgroundRepeat.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String border(ObjectLike p, String s) { return JsCSS2Properties.border.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String borderBottom(ObjectLike p, String s) { return JsCSS2Properties.borderBottom.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String borderBottomColor(ObjectLike p, String s) { return JsCSS2Properties.borderBottomColor.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String borderBottomStyle(ObjectLike p, String s) { return JsCSS2Properties.borderBottomStyle.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String borderBottomWidth(ObjectLike p, String s) { return JsCSS2Properties.borderBottomWidth.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String borderCollapse(ObjectLike p, String s) { return JsCSS2Properties.borderCollapse.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String borderColor(ObjectLike p, String s) { return JsCSS2Properties.borderColor.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String borderLeft(ObjectLike p, String s) { return JsCSS2Properties.borderLeft.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String borderLeftColor(ObjectLike p, String s) { return JsCSS2Properties.borderLeftColor.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String borderLeftStyle(ObjectLike p, String s) { return JsCSS2Properties.borderLeftStyle.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String borderLeftWidth(ObjectLike p, String s) { return JsCSS2Properties.borderLeftWidth.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String borderRight(ObjectLike p, String s) { return JsCSS2Properties.borderRight.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String borderRightColor(ObjectLike p, String s) { return JsCSS2Properties.borderRightColor.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String borderRightStyle(ObjectLike p, String s) { return JsCSS2Properties.borderRightStyle.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String borderRightWidth(ObjectLike p, String s) { return JsCSS2Properties.borderRightWidth.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String borderSpacing(ObjectLike p, String s) { return JsCSS2Properties.borderSpacing.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String borderStyle(ObjectLike p, String s) { return JsCSS2Properties.borderStyle.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String borderTop(ObjectLike p, String s) { return JsCSS2Properties.borderTop.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String borderTopColor(ObjectLike p, String s) { return JsCSS2Properties.borderTopColor.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String borderTopStyle(ObjectLike p, String s) { return JsCSS2Properties.borderTopStyle.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String borderTopWidth(ObjectLike p, String s) { return JsCSS2Properties.borderTopWidth.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String borderWidth(ObjectLike p, String s) { return JsCSS2Properties.borderWidth.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String bottom(ObjectLike p, String s) { return JsCSS2Properties.bottom.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String captionSide(ObjectLike p, String s) { return JsCSS2Properties.captionSide.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String clear(ObjectLike p, String s) { return JsCSS2Properties.clear.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String clip(ObjectLike p, String s) { return JsCSS2Properties.clip.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String color(ObjectLike p, String s) { return JsCSS2Properties.color.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String content(ObjectLike p, String s) { return JsCSS2Properties.content.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String counterIncrement(ObjectLike p, String s) { return JsCSS2Properties.counterIncrement.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String counterReset(ObjectLike p, String s) { return JsCSS2Properties.counterReset.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String cssFloat(ObjectLike p, String s) { return JsCSS2Properties.cssFloat.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String cue(ObjectLike p, String s) { return JsCSS2Properties.cue.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String cueAfter(ObjectLike p, String s) { return JsCSS2Properties.cueAfter.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String cueBefore(ObjectLike p, String s) { return JsCSS2Properties.cueBefore.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String cursor(ObjectLike p, String s) { return JsCSS2Properties.cursor.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String direction(ObjectLike p, String s) { return JsCSS2Properties.direction.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String display(ObjectLike p, String s) { return JsCSS2Properties.display.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String elevation(ObjectLike p, String s) { return JsCSS2Properties.elevation.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String emptyCells(ObjectLike p, String s) { return JsCSS2Properties.emptyCells.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String filter(ObjectLike p, String s) { return JsCSS2Properties.filter.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String font(ObjectLike p, String s) { return JsCSS2Properties.font.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String fontFamily(ObjectLike p, String s) { return JsCSS2Properties.fontFamily.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String fontSize(ObjectLike p, String s) { return JsCSS2Properties.fontSize.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String fontSizeAdjust(ObjectLike p, String s) { return JsCSS2Properties.fontSizeAdjust.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String fontStretch(ObjectLike p, String s) { return JsCSS2Properties.fontStretch.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String fontStyle(ObjectLike p, String s) { return JsCSS2Properties.fontStyle.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String fontVariant(ObjectLike p, String s) { return JsCSS2Properties.fontVariant.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String fontWeight(ObjectLike p, String s) { return JsCSS2Properties.fontWeight.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String height(ObjectLike p, String s) { return JsCSS2Properties.height.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String left(ObjectLike p, String s) { return JsCSS2Properties.left.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String letterSpacing(ObjectLike p, String s) { return JsCSS2Properties.letterSpacing.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String lineHeight(ObjectLike p, String s) { return JsCSS2Properties.lineHeight.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String listStyle(ObjectLike p, String s) { return JsCSS2Properties.listStyle.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String listStyleImage(ObjectLike p, String s) { return JsCSS2Properties.listStyleImage.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String listStylePosition(ObjectLike p, String s) { return JsCSS2Properties.listStylePosition.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String listStyleType(ObjectLike p, String s) { return JsCSS2Properties.listStyleType.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String margin(ObjectLike p, String s) { return JsCSS2Properties.margin.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String marginBottom(ObjectLike p, String s) { return JsCSS2Properties.marginBottom.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String marginLeft(ObjectLike p, String s) { return JsCSS2Properties.marginLeft.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String marginRight(ObjectLike p, String s) { return JsCSS2Properties.marginRight.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String marginTop(ObjectLike p, String s) { return JsCSS2Properties.marginTop.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String markerOffset(ObjectLike p, String s) { return JsCSS2Properties.markerOffset.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String marks(ObjectLike p, String s) { return JsCSS2Properties.marks.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String maxHeight(ObjectLike p, String s) { return JsCSS2Properties.maxHeight.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String maxWidth(ObjectLike p, String s) { return JsCSS2Properties.maxWidth.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String minHeight(ObjectLike p, String s) { return JsCSS2Properties.minHeight.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String minWidth(ObjectLike p, String s) { return JsCSS2Properties.minWidth.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String opacity(ObjectLike p, String s) { return JsCSS2Properties.opacity.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String orphans(ObjectLike p, String s) { return JsCSS2Properties.orphans.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String outline(ObjectLike p, String s) { return JsCSS2Properties.outline.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String outlineColor(ObjectLike p, String s) { return JsCSS2Properties.outlineColor.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String outlineStyle(ObjectLike p, String s) { return JsCSS2Properties.outlineStyle.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String outlineWidth(ObjectLike p, String s) { return JsCSS2Properties.outlineWidth.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String overflow(ObjectLike p, String s) { return JsCSS2Properties.overflow.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String overflowX(ObjectLike p, String s) { return JsCSS2Properties.overflowX.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String overflowY(ObjectLike p, String s) { return JsCSS2Properties.overflowY.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String padding(ObjectLike p, String s) { return JsCSS2Properties.padding.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String paddingBottom(ObjectLike p, String s) { return JsCSS2Properties.paddingBottom.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String paddingLeft(ObjectLike p, String s) { return JsCSS2Properties.paddingLeft.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String paddingRight(ObjectLike p, String s) { return JsCSS2Properties.paddingRight.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String paddingTop(ObjectLike p, String s) { return JsCSS2Properties.paddingTop.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String page(ObjectLike p, String s) { return JsCSS2Properties.page.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String pageBreakAfter(ObjectLike p, String s) { return JsCSS2Properties.pageBreakAfter.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String pageBreakBefore(ObjectLike p, String s) { return JsCSS2Properties.pageBreakBefore.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String pageBreakInside(ObjectLike p, String s) { return JsCSS2Properties.pageBreakInside.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String pause(ObjectLike p, String s) { return JsCSS2Properties.pause.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String pauseAfter(ObjectLike p, String s) { return JsCSS2Properties.pauseAfter.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String pauseBefore(ObjectLike p, String s) { return JsCSS2Properties.pauseBefore.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String pitch(ObjectLike p, String s) { return JsCSS2Properties.pitch.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String pitchRange(ObjectLike p, String s) { return JsCSS2Properties.pitchRange.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String playDuring(ObjectLike p, String s) { return JsCSS2Properties.playDuring.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String position(ObjectLike p, String s) { return JsCSS2Properties.position.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String quotes(ObjectLike p, String s) { return JsCSS2Properties.quotes.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String richness(ObjectLike p, String s) { return JsCSS2Properties.richness.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String right(ObjectLike p, String s) { return JsCSS2Properties.right.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String size(ObjectLike p, String s) { return JsCSS2Properties.size.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String speak(ObjectLike p, String s) { return JsCSS2Properties.speak.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String speakHeader(ObjectLike p, String s) { return JsCSS2Properties.speakHeader.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String speakNumeral(ObjectLike p, String s) { return JsCSS2Properties.speakNumeral.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String speakPunctuation(ObjectLike p, String s) { return JsCSS2Properties.speakPunctuation.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String speechRate(ObjectLike p, String s) { return JsCSS2Properties.speechRate.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String stress(ObjectLike p, String s) { return JsCSS2Properties.stress.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String styleFloat(ObjectLike p, String s) { return JsCSS2Properties.styleFloat.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String tableLayout(ObjectLike p, String s) { return JsCSS2Properties.tableLayout.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String textAlign(ObjectLike p, String s) { return JsCSS2Properties.textAlign.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String textDecoration(ObjectLike p, String s) { return JsCSS2Properties.textDecoration.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String textIndent(ObjectLike p, String s) { return JsCSS2Properties.textIndent.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String textShadow(ObjectLike p, String s) { return JsCSS2Properties.textShadow.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String textTransform(ObjectLike p, String s) { return JsCSS2Properties.textTransform.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String top(ObjectLike p, String s) { return JsCSS2Properties.top.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String unicodeBidi(ObjectLike p, String s) { return JsCSS2Properties.unicodeBidi.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String verticalAlign(ObjectLike p, String s) { return JsCSS2Properties.verticalAlign.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String visibility(ObjectLike p, String s) { return JsCSS2Properties.visibility.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String voiceFamily(ObjectLike p, String s) { return JsCSS2Properties.voiceFamily.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String volume(ObjectLike p, String s) { return JsCSS2Properties.volume.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String whiteSpace(ObjectLike p, String s) { return JsCSS2Properties.whiteSpace.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String widows(ObjectLike p, String s) { return JsCSS2Properties.widows.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String width(ObjectLike p, String s) { return JsCSS2Properties.width.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String wordSpacing(ObjectLike p, String s) { return JsCSS2Properties.wordSpacing.with(p, s);}
	/**
	 * <p>Sets the property, named by this method, of the {@link JsCSS2Properties} object to the
	 * given string value.</p>
	 * @param p The {@link JsCSS2Properties} object.
	 * @param s The new string value for the property.
	 * @since 1.0
	 */
	public static final String zIndex(ObjectLike p, String s) { return JsCSS2Properties.zIndex.with(p, s);}
}
