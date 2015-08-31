
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

package jsx.graphic;

import js.ArrayLike;
import js.Id;
import js.Js;
import js.ObjectLike;
import js.Vars;
import jsx.Configurable;
import jsx.core.ArrayLikes;
import jsx.dom.Styles;
import jsx.ui.Component;

/**
 * <p>A utility class providing static methods to create basic VML components.</p>
 * <p>A VML component wraps a VML element and is {@link Configurable}.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class VML extends Configurable
{
	private VML() {
		super(null);
	}

	/**
	 * <p>Creates a VML group component that wraps a <tt>&lt;v:group&gt;</tt> element.</p>
	 * @return The newly created VML component.
	 * @since 1.0
	 */
	public static final Component group() {
		return Component.createElement(GROUP);
	}

	private static final String droppx(String s) {
		return s.endsWith("px") ? s.substring(0, s.length() - 2) : s;
	}

	/**
	 * <p>Appends a specified VML component to the VML group component.</p>
	 * @param g A VML group component.
	 * @param v A VML component to append to the group component.
	 * @since 1.0
	 */
	public static final void appendChild(Component g, Component v) {
		if (!isStyled(v)) {
			ObjectLike gs = Component.style(g);
			ObjectLike vs = Component.style(v);
			Styles.width (vs, droppx(Styles.width (gs)));
			Styles.height(vs, droppx(Styles.height(gs)));
		}
		Component.appendChild(g, v);
	}

	/**
	 * <p>Sets the dimensions of the user coordination system of a VML component by 
	 * setting "coordsize" attribute of its underlying VML element.</p>
	 * @param w A string or number value of the X dimension.
	 * @param h A string or number value of the Y dimension.
	 * @since 1.0
	 * @see #coordSize(Component, Object, Object)
	 */
	public static final void coordSize(Component v, Object w, Object h) {
		Component.setAttribute(v, COORDSIZE, ArrayLikes.join(
				new Vars<Object>().add(w).add(h).var(),
				SPACE
		));
	}

	/**
	 * <p>Sets the origin of the user coordination system of a VML component by 
	 * setting "coordorigin" attribute of its underlying VML element.</p>
	 * @param x A string or number value of the X coordinate of the base point.
	 * @param y A string or number value of the Y coordinate of the base point.
	 * @since 1.0
	 * @see #coordOrigin(Component, Object, Object)
	 */
	public static final void coordOrigin(Component v, Object x, Object y) {
		Component.setAttribute(v, COORDORIGIN, ArrayLikes.join(
				new Vars<Object>().add(x).add(y).var(),
				SPACE
		));
	}

	/**
	 * <p>A constant string of a space.</p>
	 * @since 1.0
	 */
	public final static String SPACE = " ";
	/**
	 * <p>The name of the path attribute of a VML element.</p>
	 * @since 1.0
	 */
	public final static String PATH  = "path";
	/**
	 * <p>The name of the attribute of a VML element to specify the origin of 
	 * the user coordination system.</p>
	 * @since 1.0
	 */
	public final static String COORDORIGIN = "coordorigin";
	/**
	 * <p>The name of the attribute of a VML element to specify the dimensions of 
	 * the user coordination system.</p>
	 * @since 1.0
	 */
	public final static String COORDSIZE = "coordsize";
	/**
	 * <p>The name of the HTML tag of a VML group element.</p>
	 * @since 1.0
	 */
	public final static String GROUP = "v:group";
	/**
	 * <p>The name of the HTML tag of a VML shape element.</p>
	 * @since 1.0
	 */
	public final static String SHAPE = "v:shape";
	/**
	 * <p>The name of the HTML tag of a VML line element.</p>
	 * @since 1.0
	 */
	public final static String LINE = "v:line";
	/**
	 * <p>The name of the HTML tag of a VML polyline element.</p>
	 * @since 1.0
	 */
	public final static String POLYLINE = "v:polyline";
	/**
	 * <p>The name of the HTML tag of a VML curve element.</p>
	 * @since 1.0
	 */
	public final static String CURVE = "v:curve";
	/**
	 * <p>The name of the HTML tag of a VML rectangle element.</p>
	 * @since 1.0
	 */
	public final static String RECT = "v:rect";
	/**
	 * <p>The name of the HTML tag of a VML rounded rectangle element.</p>
	 * @since 1.0
	 */
	public final static String ROUNDRECT = "v:roundrect";
	/**
	 * <p>The name of the HTML tag of a VML ellipse element.</p>
	 * @since 1.0
	 */
	public final static String OVAL = "v:oval";

	/**
	 * <p>Creates VML component that wraps a VML line element.</p>
	 * @return The newly created VML component.
	 * @since 1.0
	 * @see #lineFrom(Component, String)
	 * @see #lineFrom(Component, int, int)
	 * @see #lineTo(Component, String)
	 * @see #lineTo(Component, int, int)
	 */
	public static final Component line() {
		return Component.createElement(LINE);
	}

	/**
	 * <p>Defines the starting point of a line by setting attributes to the VML 
	 * element wrapped by the specified component.</p>
	 * @param v The current VML component.
	 * @param p The start point of the line.
	 * @since 1.0
	 * @see #line()
	 * @see #lineFrom(Component, int, int)
	 * @see #lineTo(Component, String)
	 */
	public static final void lineFrom(Component v, String p) {
		Component.setAttribute(v, "from", p);
	}

	/**
	 * <p>Defines the ending point of a line by setting attributes to the VML 
	 * element wrapped by the specified component.</p>
	 * @param v The current VML component.
	 * @param p The end point of the line.
	 * @since 1.0
	 * @see #line()
	 * @see #lineTo(Component, int, int)
	 * @see #lineFrom(Component, String)
	 */
	public static final void lineTo(Component v, String p) {
		Component.setAttribute(v, "to", p);
	}

	/**
	 * <p>Defines the starting point of a line by setting attributes to the VML 
	 * element wrapped by the specified component.</p>
	 * @param v The current VML component.
	 * @param x The X coordinate of the start point of the line.
	 * @param y The Y coordinate of the start point of the line.
	 * @since 1.0
	 * @see #line()
	 * @see #lineFrom(Component, String)
	 * @see #lineTo(Component, int, int)
	 */
	public static final void lineFrom(Component v, int x, int y) {
		lineFrom(v, coord(x, y));
	}

	/**
	 * <p>Defines the ending point of a line by setting attributes to the VML 
	 * element wrapped by the specified component.</p>
	 * @param v The current VML component.
	 * @param x The X coordinate of the end point of the line.
	 * @param y The Y coordinate of the end point of the line.
	 * @since 1.0
	 * @see #line()
	 * @see #lineTo(Component, String)
	 * @see #lineFrom(Component, int, int)
	 */
	public static final void lineTo(Component v, int x, int y) {
		lineTo(v, coord(x, y));
	}

	/**
	 * <p>Creates VML component that wraps a VML line element.</p>
	 * @param x1 The X coordinate of the start point of the line.
	 * @param y1 The Y coordinate of the start point of the line.
	 * @param x2 The X coordinate of the end point of the line.
	 * @param y2 The Y coordinate of the end point of the line.
	 * @return The newly created VML component.
	 * @since 1.0
	 * @see #line()
	 */
	public static final Component line(int x1, int y1, int x2, int y2) {
		Component v = line();
		lineFrom(v, x1, y1);
		lineTo(v, x2, y2);
		return v;
	}

	/**
	 * <p>Creates VML component that wraps a VML polyline element.</p>
	 * @return The newly created VML component.
	 * @since 1.0
	 * @see #polyline(Component, ArrayLike)
	 * @see #polyline(ArrayLike)
	 */
	public static final Component polyline() {
		return Component.createElement(POLYLINE);
	}

	/**
	 * <p>Defines the points of a polyline by setting attributes to the VML 
	 * element wrapped by the specified component.</p>
	 * @param v The current VML component.
	 * @param points The points that make up the polyline.
	 * @since 1.0
	 * @see #polyline()
	 * @see #polyline(ArrayLike)
	 */
	public static final void polyline(Component v, ArrayLike<String> points) {
		Component.setAttribute(v, "points", ArrayLikes.join(points, SPACE));
	}

	/**
	 * <p>Creates VML component that wraps a VML polyline element.</p>
	 * @param points A list of pairs of points that define a set of straight line 
	 * segments. Points are specified in the coordinate system of the parent element, 
	 * either a group or the document.
	 * @return The newly created VML component.
	 * @since 1.0
	 * @see #polyline()
	 */
	public static final Component polyline(ArrayLike<String> points) {
		Component v = polyline();
		polyline(v, points);
		return v;
	}

	private final static Id<Boolean> ISSTYLED = new Id<Boolean>();

	/**
	 * <p>Is the shape of a VML component specified in the CSS2 properties.</p>
	 * @param v The current VML component.
	 * @return <tt>true</true> if the shape of the underlying VML element of the current 
	 * component is also specified in the CSS2 properties. Otherwise, if the shape of the 
	 * underlying VML element of the current component is only defined by its attributes, 
	 * this method returns <tt>false</tt>.
	 * @since 1.0
	 */
	public static final boolean isStyled(Component v) {
		return Js.be(ini(v).var(ISSTYLED));
	}

	private static final void border(Component v, String b) {
		ObjectLike s = Component.style(v);
		Styles.borderLeftWidth  (s, b);
		Styles.borderTopWidth   (s, b);
		Styles.borderRightWidth (s, b);
		Styles.borderBottomWidth(s, b);
	}

	/**
	 * <p>Creates VML component that wraps a VML rectangle element.</p>
	 * @return The newly created VML component.
	 * @since 1.0
	 */
	public static final Component rect() {
		Component v = Component.createElement(RECT);
		border(v, "0px");
		Component.setAttribute(v, "stroke", false);
		ini(v).var(ISSTYLED, true);
		return v;
	}

	/**
	 * <p>Creates VML component that wraps a VML rounded rectangle element.</p>
	 * @return The newly created VML component.
	 * @since 1.0
	 * @see #roundrect(Component, double)
	 * @see #roundrect(double)
	 */
	public static final Component roundrect() {
		Component v = Component.createElement(ROUNDRECT);
		border(v, "0px");
		Component.setAttribute(v, "stroke", false);
		ini(v).var(ISSTYLED, true);
		return v;
	}

	/**
	 * <p>Defines rounded corners for a rounded rectangle by setting attributes to the 
	 * VML element wrapped by the specified component.</p>
	 * @param v The current VML component.
	 * @param arcsize Defines rounded corners as a percentage of half the smaller 
	 * dimension of the rectangle. 0.0 (or "0%") for square corners, 1.0 (or "100%") for 
	 * smaller dimension forms a semi-circle.
	 * @since 1.0
	 * @see #roundrect()
	 */
	public static final void roundrect(Component v, double arcsize) {
		Component.setAttribute(v, "arcsize", arcsize);
	}

	/**
	 * <p>Creates VML component that wraps a VML rounded rectangle element.</p>
	 * @param arcsize Defines rounded corners as a percentage of half the smaller 
	 * dimension of the rectangle. 0.0 (or "0%") for square corners, 1.0 (or "100%") for 
	 * smaller dimension forms a semi-circle.
	 * @return The newly created VML component.
	 * @since 1.0
	 * @see #roundrect()
	 */
	public static final Component roundrect(double arcsize) {
		Component v = roundrect();
		roundrect(v, arcsize);
		return v;
	}

	/**
	 * <p>Creates VML component that wraps a VML oval element.</p>
	 * @return The newly created VML component.
	 * @since 1.0
	 * @see #ovalPosition(Component, String)
	 * @see #ovalPosition(Component, int, int)
	 * @see #ovalSize(Component, String)
	 * @see #ovalSize(Component, int, int)
	 * @see #oval(int, int, int, int)
	 */
	public static final Component oval() {
		Component v = Component.createElement(OVAL);
		border(v, "0px");
		Component.setAttribute(v, "stroke", false);
		ini(v).var(ISSTYLED, true);
		return v;
	}

	/**
	 * <p>Defines the position of an oval by setting attributes to the VML 
	 * element wrapped by the specified component.</p>
	 * @param v The current VML component.
	 * @param p The position of the oval.
	 * @since 1.0
	 * @see #oval()
	 * @see #ovalPosition(Component, int, int)
	 * @see #oval(int, int, int, int)
	 */
	public static final void ovalPosition(Component v, String p) {
		Component.setAttribute(v, "position", p);
	}

	/**
	 * <p>Defines the size of an oval by setting attributes to the VML 
	 * element wrapped by the specified component.</p>
	 * @param v The current VML component.
	 * @param s The size of the oval.
	 * @since 1.0
	 * @see #oval()
	 * @see #ovalSize(Component, int, int)
	 * @see #oval(int, int, int, int)
	 */
	public static final void ovalSize(Component v, String s) {
		Component.setAttribute(v, "size", s);
	}

	/**
	 * <p>Defines the position of an oval by setting attributes to the VML 
	 * element wrapped by the specified component.</p>
	 * @param v The current VML component.
	 * @param x The X coordinate of the position of the oval.
	 * @param y The Y coordinate of the position of the oval.
	 * @since 1.0
	 * @see #ovalPosition(Component, String)
	 * @see #oval()
	 * @see #oval(int, int, int, int)
	 */
	public static final void ovalPosition(Component v, int x, int y) {
		ovalPosition(v, coord(x, y));
	}

	/**
	 * <p>Defines the size of an oval by setting attributes to the VML 
	 * element wrapped by the specified component.</p>
	 * @param v The current VML component.
	 * @param w The X dimension of the oval.
	 * @param h The Y dimension of the oval.
	 * @since 1.0
	 * @see #ovalSize(Component, String)
	 * @see #oval()
	 * @see #oval(int, int, int, int)
	 */
	public static final void ovalSize(Component v, int w, int h) {
		ovalSize(v, coord(w, h));
	}

	/**
	 * <p>Creates VML component that wraps a VML oval element.</p>
	 * @param x The X coordinate of the position of the oval.
	 * @param y The Y coordinate of the position of the oval.
	 * @param w The X dimension of the oval.
	 * @param h The Y dimension of the oval.
	 * @return The newly created VML component.
	 * @since 1.0
	 * @see #oval()
	 */
	public static final Component oval(int x, int y, int w, int h) {
		Component v = oval();
		ovalPosition(v, x, y);
		ovalSize(v, w, h);
		return v;
	}

	/**
	 * <p>Creates VML component that wraps a VML shape element.</p>
	 * @return The newly created VML component.
	 * @since 1.0
	 * @see #path(Component, ArrayLike)
	 * @see #path(ArrayLike)
	 */
	public static final Component shape() {
		return Component.createElement(SHAPE);
	}

	/**
	 * <p>Defines path of an shape by setting a path created from the specified array of 
	 * commands to the VML element wrapped by the specified shape component.</p>
	 * @param v The current VML component.
	 * @param commands An array of path commands.
	 * @since 1.0
	 * @see #shape()
	 */
	public static final void path(Component v, ArrayLike<String> commands) {
		Component.setAttribute(v, PATH, ArrayLikes.join(commands, SPACE));
	}

	/**
	 * <p>Creates VML component that wraps a VML shape element.</p>
	 * @param commands An array of path commands.
	 * @return The newly created VML component.
	 * @since 1.0
	 * @see #shape()
	 */
	public static final Component path(ArrayLike<String> commands) {
		Component v = shape();
		path(v, commands);
		return v;
	}

	/**
	 * <p>Represents the specified coordinates in a string.</p>
	 * @param x The X coordinate.
	 * @param y The Y coordinate.
	 * @return A string representation for the coordinates.
	 * @since 1.0
	 */
	public static final String coord(int x, int y) {
		return ArrayLikes.join(
				new Vars<Object>().add(x).add(y).var(),
				SPACE
		);
	}

	/**
	 * <p>Creates an absolute move-to path command.</p>
	 * @param x The X coordinate of the point to move to.
	 * @param y The Y coordinate of the point to move to.
	 * @return A string value of the newly created path command.
	 * @since 1.0
	 */
	public static final String moveTo(int x, int y) {
		return Js.add("m", coord(x, y));
	}

	/**
	 * <p>Creates a absolute line-to path command.</p>
	 * @param x The X coordinate of the point to line to.
	 * @param y The Y coordinate of the point to line to.
	 * @return A string value of the newly created path command.
	 * @since 1.0
	 */
	public static final String lineTo(int x, int y) {
		return Js.add("l", coord(x, y));
	}

	/**
	 * <p>Creates a close path command.</p>
	 * @return A string value of the newly created path command.
	 * @since 1.0
	 */
	public static final String close() {
		return "x";
	}

	/**
	 * <p>Creates an end path command.</p>
	 * @return A string value of the newly created path command.
	 * @since 1.0
	 */
	public static final String end() {
		return "e";
	}

	/**
	 * <p>Creates a relative move-to path command.</p>
	 * @param x The relative X coordinate of the point to move to.
	 * @param y The relative Y coordinate of the point to move to.
	 * @return A string value of the newly created path command.
	 * @since 1.0
	 */
	public static final String moveto(int x, int y) {
		return Js.add("t", coord(x, y));
	}

	/**
	 * <p>Creates a relative line-to path command.</p>
	 * @param x The relative X coordinate of the point to line to.
	 * @param y The relative Y coordinate of the point to line to.
	 * @return A string value of the newly created path command.
	 * @since 1.0
	 */
	public static final String lineto(int x, int y) {
		return Js.add("r", coord(x, y));
	}

	/**
	 * <p>Fills with a CSS color by setting attributes to the VML element wrapped by 
	 * the specified component.</p>
	 * @param v The current VML component.
	 * @param color A string of CSS color value.
	 * @since 1.0
	 * @see #strokeColor(Component, String)
	 * @see #strokeWeight(Component, Object)
	 */
	public static final void fillColor(Component v, String color) {
		Component.setAttribute(v, "fillcolor", color);
	}

	/**
	 * <p>Defines a stroke color by setting attributes to the VML element wrapped by 
	 * the specified component.</p>
	 * @param v The current VML component.
	 * @param color A string of CSS color value.
	 * @since 1.0
	 * @see #fillColor(Component, String)
	 * @see #strokeWeight(Component, Object)
	 */
	public static final void strokeColor(Component v, String color) {
		if (isStyled(v)) {
			ObjectLike s = Component.style(v);
			Styles.borderLeftColor  (s, color);
			Styles.borderTopColor   (s, color);
			Styles.borderRightColor (s, color);
			Styles.borderBottomColor(s, color);
		} else {
			Component.setAttribute(v, "strokecolor", color);
		}
	}

	/**
	 * <p>Defines stroke weight by setting attributes to the VML element wrapped by 
	 * the specified component.</p>
	 * @param v The current VML component.
	 * @param w A number or string value of stroke weight.
	 * @since 1.0
	 * @see #fillColor(Component, String)
	 * @see #strokeColor(Component, String)
	 */
	public static final void strokeWeight(Component v, Object w) {
		if (isStyled(v)) {
			border(v, Js.toString(w));
		} else {
			Component.setAttribute(v, "strokeweight", w);
		}
	}
}
