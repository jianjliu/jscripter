
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
import js.Disposable;
import js.Js;
import js.Vars;
import jsx.core.ArrayLikes;
import jsx.ui.Component;

/**
 * <p>A utility class providing static methods to create basic SVG components.</p>
 * <p>A SVG component wraps an HTML <tt>&lt;svg:svg&gt;</tt> element, a SVG path element 
 * or a SVG shape element.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class SVG extends Disposable
{
	private SVG() {}

	/**
	 * <p>Creates a SVG component that wraps an HTML <tt>&lt;svg:svg&gt;</tt> element.</p>
	 * @return The newly created SVG component.
	 * @since 1.0
	 */
	public static final Component svg() {
		return Component.createElementNS(SVG_NS, SVG);
	}

	/**
	 * <p>Sets view box attributes to a SVG component.</p>
	 * @param v The current SVG component.
	 * @param x The X coordinate of the base point.
	 * @param y The Y coordinate of the base point.
	 * @param w The X dimension.
	 * @param h The Y dimension.
	 * @since 1.0
	 */
	public static final void viewBox(Component v, double x, double y, double w, double h) {
		Component.setAttribute(v, VIEWBOX, ArrayLikes.join(
				new Vars<Object>().add(x).add(y).add(w).add(h).var(),
				SPACE
		));
	}

	/**
	 * <p>Sets view box attributes to a SVG component.</p>
	 * @param v The current SVG component.
	 * @param s A string of the attribute value to set.
	 * @since 1.0
	 */
	public static final void viewBox(Component v, String s) {
		Component.setAttribute(v, VIEWBOX, s);
	}

	/**
	 * <p>Defines the XLink name space that SVG uses.</p>
	 * @param v The current SVG component.
	 * @since 1.0
	 */
	public static final void xlink(Component v) {
		Component.setAttributeNS(v, XML_NS, "xmlns:xlink", XLINKNS);
	}

	/**
	 * <p>A constant string of a space.</p>
	 * @since 1.0
	 */
	public final static String SPACE = " ";

	/**
	 * <p>The name of a SVG element.</p>
	 * @since 1.0
	 */
	public final static String RECT     = "rect";
	/**
	 * <p>The name of a SVG element.</p>
	 * @since 1.0
	 */
	public final static String CIRCLE   = "circle";
	/**
	 * <p>The name of a SVG element.</p>
	 * @since 1.0
	 */
	public final static String ELLIPSE  = "ellipse";
	/**
	 * <p>The name of a SVG element.</p>
	 * @since 1.0
	 */
	public final static String LINE     = "line";
	/**
	 * <p>The name of a SVG element.</p>
	 * @since 1.0
	 */
	public final static String PATH     = "path";
	/**
	 * <p>The name of a SVG element.</p>
	 * @since 1.0
	 */
	public final static String POLYLINE = "polyline";
	/**
	 * <p>The name of a SVG element.</p>
	 * @since 1.0
	 */
	public final static String POLYGON  = "polygon";

	/**
	 * <p>The XML name space.</p>
	 * @since 1.0
	 */
	public final static String XML_NS  = "http://www.w3.org/2000/xmlns";
	/**
	 * <p>The SVG name space.</p>
	 * @since 1.0
	 */
	public final static String SVG_NS  = "http://www.w3.org/2000/svg";
	/**
	 * <p>The XLink name space.</p>
	 * @since 1.0
	 */
	public final static String XLINKNS = "http://www.w3.org/1999/xlink";

	/**
	 * <p>The HTML tag name for a root SVG element.</p>
	 * @since 1.0
	 */
	public final static String SVG = "svg:svg";
	/**
	 * <p>The name of an attribute for a path element to define itself.</p>
	 * @since 1.0
	 */
	public final static String DEF = "d";

	/**
	 * <p>The name of a <tt>width</tt> attribute.</p>
	 * @since 1.0
	 */
	public final static String WIDTH   = "width";
	/**
	 * <p>The name of a <tt>height</tt> attribute.</p>
	 * @since 1.0
	 */
	public final static String HEIGHT  = "height";
	/**
	 * <p>The name of a <tt>viewBox</tt> attribute.</p>
	 * @since 1.0
	 */
	public final static String VIEWBOX = "viewBox";

	/**
	 * <p>Represents the specified coordinates in a string.</p>
	 * @param x The X coordinate.
	 * @param y The Y coordinate.
	 * @return A string representation for the coordinates.
	 * @since 1.0
	 */
	public static final String coord(double x, double y) {
		return ArrayLikes.join(
				new Vars<Object>().add(x).add(y).var()
		);
	}

	/**
	 * <p>Creates SVG component that wraps a "rect" element.</p>
	 * @return A SVG component wrapping a basic shape element.
	 * @since 1.0
	 * @see #rectFrom(Component, double, double)
	 * @see #rectSize(Component, double, double)
	 * @see #rectRound(Component, double, double)
	 */
	public static final Component rect() {
		return Component.createElementNS(SVG_NS, RECT);
	}

	/**
	 * <p>Defines the base point of a rectangle by setting attributes to the SVG 
	 * element wrapped by the specified component.</p>
	 * @param v The current SVG component.
	 * @param x The X coordinate of the base point.
	 * @param y The Y coordinate of the base point.
	 * @since 1.0
	 * @see #rect()
	 * @see #rectSize(Component, double, double)
	 * @see #rectRound(Component, double, double)
	 */
	public static final void rectFrom(Component v, double x, double y) {
		Component.setAttribute(v, "x", x);
		Component.setAttribute(v, "y", y);
	}

	/**
	 * <p>Defines the size of a rectangle by setting attributes to the SVG 
	 * element wrapped by the specified component.</p>
	 * @param v The current SVG component.
	 * @param w The X dimension.
	 * @param h The Y dimension.
	 * @since 1.0
	 * @see #rect()
	 * @see #rectFrom(Component, double, double)
	 * @see #rectRound(Component, double, double)
	 */
	public static final void rectSize(Component v, double w, double h) {
		Component.setAttribute(v, WIDTH , w);
		Component.setAttribute(v, HEIGHT, h);
	}

	/**
	 * <p>Rounds off the corners of a rectangle by setting attributes to the SVG 
	 * element wrapped by the specified component.</p>
	 * @param v The current SVG component.
	 * @param rx The X-axis radius of the ellipse used to round off the corners of 
	 * the rectangle.
	 * @param ry The Y-axis radius of the ellipse used to round off the corners of 
	 * the rectangle.
	 * @since 1.0
	 * @see #rect()
	 * @see #rectFrom(Component, double, double)
	 * @see #rectSize(Component, double, double)
	 */
	public static final void rectRound(Component v, double rx, double ry) {
		Component.setAttribute(v, "rx", rx);
		Component.setAttribute(v, "ry", ry);
	}

	/**
	 * <p>Creates SVG component that wraps a "rect" element.</p>
	 * @param x The X coordinate of the base point.
	 * @param y The Y coordinate of the base point.
	 * @param w The X dimension.
	 * @param h The Y dimension.
	 * @return A SVG component wrapping a basic shape element.
	 * @since 1.0
	 * @see #rect()
	 * @see #rect(double, double, double, double, double, double)
	 */
	public static final Component rect(double x, double y, double w, double h) {
		Component v = rect();
		rectFrom(v, x, y);
		rectSize(v, w, h);
		return v;
	}

	/**
	 * <p>Creates SVG component that wraps a "rect" element.</p>
	 * @param x The X coordinate of the base point.
	 * @param y The Y coordinate of the base point.
	 * @param w The X dimension.
	 * @param h The Y dimension.
	 * @param rx The X-axis radius of the ellipse used to round off the corners of 
	 * the rectangle.
	 * @param ry The Y-axis radius of the ellipse used to round off the corners of 
	 * the rectangle.
	 * @return A SVG component wrapping a basic shape element.
	 * @since 1.0
	 * @see #rect()
	 * @see #rect(double, double, double, double)
	 */
	public static final Component rect(double x, double y, double w, double h, double rx, double ry) {
		Component v = rect(x, y, w, h);
		rectRound(v, rx, ry);
		return v;
	}

	/**
	 * <p>Creates SVG component that wraps a "circle" element.</p>
	 * @return A SVG component wrapping a basic shape element.
	 * @since 1.0
	 * @see #circle(double, double, double)
	 * @see #circleCenter(Component, double, double)
	 * @see #circleRadius(Component, double)
	 */
	public static final Component circle() {
		return Component.createElementNS(SVG_NS, CIRCLE);
	}

	/**
	 * <p>Defines the center of a circle by setting attributes to the SVG 
	 * element wrapped by the specified component.</p>
	 * @param v The current SVG component.
	 * @param cx The X coordinate of the center of the circle.
	 * @param cy The Y coordinate of the center of the circle.
	 * @since 1.0
	 * @see #circle()
	 * @see #circleRadius(Component, double)
	 */
	public static final void circleCenter(Component v, double cx, double cy) {
		Component.setAttribute(v, "cx", cx);
		Component.setAttribute(v, "cy", cy);
	}

	/**
	 * <p>Defines the radius of a circle by setting attributes to the SVG 
	 * element wrapped by the specified component.</p>
	 * @param v The current SVG component.
	 * @param r The radius of the circle.
	 * @since 1.0
	 * @see #circle()
	 * @see #circleCenter(Component, double, double)
	 */
	public static final void circleRadius(Component v, double r) {
		Component.setAttribute(v, "r", r);
	}

	/**
	 * <p>Creates SVG component that wraps a "circle" element.</p>
	 * @param cx The X coordinate of the center of the circle.
	 * @param cy The Y coordinate of the center of the circle.
	 * @param r The radius of the circle.
	 * @return A SVG component wrapping a basic shape element.
	 * @since 1.0
	 * @see #circle()
	 */
	public static final Component circle(double cx, double cy, double r) {
		Component v = circle();
		circleCenter(v, cx, cy);
		circleRadius(v, r);
		return v;
	}

	/**
	 * <p>Creates SVG component that wraps an "ellipse" element.</p>
	 * @return A SVG component wrapping a basic shape element.
	 * @since 1.0
	 */
	public static final Component ellipse() {
		return Component.createElementNS(SVG_NS, ELLIPSE);
	}

	/**
	 * <p>Defines the center of an ellipse by setting attributes to the SVG 
	 * element wrapped by the specified component.</p>
	 * @param v The current SVG component.
	 * @param cx The X coordinate of the center of the ellipse.
	 * @param cy The Y coordinate of the center of the ellipse.
	 * @since 1.0
	 * @see #ellipse()
	 * @see #ellipseRadius(Component, double, double)
	 */
	public static final void ellipseCenter(Component v, double cx, double cy) {
		Component.setAttribute(v, "cx", cx);
		Component.setAttribute(v, "cy", cy);
	}

	/**
	 * <p>Defines the radiuses of an ellipse by setting attributes to the SVG 
	 * element wrapped by the specified component.</p>
	 * @param v The current SVG component.
	 * @param rx The X-axis radius of the ellipse.
	 * @param ry The Y-axis radius of the ellipse.
	 * @since 1.0
	 * @see #ellipse()
	 * @see #ellipseCenter(Component, double, double)
	 */
	public static final void ellipseRadius(Component v, double rx, double ry) {
		Component.setAttribute(v, "rx", rx);
		Component.setAttribute(v, "ry", ry);
	}

	/**
	 * <p>Creates SVG component that wraps an "ellipse" element.</p>
	 * @param cx The X coordinate of the center of the ellipse.
	 * @param cy The Y coordinate of the center of the ellipse.
	 * @param rx The X-axis radius of the ellipse.
	 * @param ry The Y-axis radius of the ellipse.
	 * @return A SVG component wrapping a basic shape element.
	 * @since 1.0
	 * @see #ellipse()
	 */
	public static final Component ellipse(double cx, double cy, double rx, double ry) {
		Component v = ellipse();
		ellipseCenter(v, cx, cy);
		ellipseRadius(v, rx, ry);
		return v;
	}

	/**
	 * <p>Creates SVG component that wraps a "line" element.</p>
	 * @return A SVG component wrapping a basic shape element.
	 * @since 1.0
	 * @see #lineFrom(Component, double, double)
	 * @see #lineTo(Component, double, double)
	 * @see #line(double, double, double, double)
	 */
	public static final Component line() {
		return Component.createElementNS(SVG_NS, LINE);
	}

	/**
	 * <p>Defines the starting point of a line by setting attributes to the SVG 
	 * element wrapped by the specified component.</p>
	 * @param v The current SVG component.
	 * @param x The X coordinate of the start point of the line.
	 * @param y The Y coordinate of the start point of the line.
	 * @since 1.0
	 * @see #line()
	 * @see #lineTo(Component, double, double)
	 */
	public static final void lineFrom(Component v, double x, double y) {
		Component.setAttribute(v, "x1", x);
		Component.setAttribute(v, "y1", y);
	}

	/**
	 * <p>Defines the ending point of a line by setting attributes to the SVG 
	 * element wrapped by the specified component.</p>
	 * @param v The current SVG component.
	 * @param x The X coordinate of the end point of the line.
	 * @param y The Y coordinate of the end point of the line.
	 * @since 1.0
	 * @see #line()
	 * @see #lineFrom(Component, double, double)
	 */
	public static final void lineTo(Component v, double x, double y) {
		Component.setAttribute(v, "x2", x);
		Component.setAttribute(v, "y2", y);
	}

	/**
	 * <p>Creates SVG component that wraps a "line" element.</p>
	 * @param x1 The X coordinate of the start point of the line.
	 * @param y1 The Y coordinate of the start point of the line.
	 * @param x2 The X coordinate of the end point of the line.
	 * @param y2 The Y coordinate of the end point of the line.
	 * @return A SVG component wrapping a basic shape element.
	 * @since 1.0
	 * @see #line()
	 */
	public static final Component line(double x1, double y1, double x2, double y2) {
		Component v = line();
		lineFrom(v, x1, y1);
		lineTo(v, x2, y2);
		return v;
	}

	/**
	 * <p>Creates SVG component that wraps a "polyline" element.</p>
	 * @return A SVG component wrapping a basic shape element.
	 * @since 1.0
	 */
	public static final Component polyline() {
		return Component.createElementNS(SVG_NS, POLYLINE);
	}

	/**
	 * <p>Defines the points of a polyline by setting attributes to the SVG 
	 * element wrapped by the specified component.</p>
	 * @param v The current SVG component.
	 * @param points The points that make up the polyline.
	 * @since 1.0
	 * @see #polyline()
	 */
	public static final void polyline(Component v, ArrayLike<String> points) {
		Component.setAttribute(v, "points", ArrayLikes.join(points, SPACE));
	}

	/**
	 * <p>Creates SVG component that wraps a "polyline" element.</p>
	 * @param points The points that make up the polyline.
	 * @return A SVG component wrapping a basic shape element.
	 * @since 1.0
	 * @see #polyline()
	 */
	public static final Component polyline(ArrayLike<String> points) {
		Component v = polyline();
		polyline(v, points);
		return v;
	}

	/**
	 * <p>Creates SVG component that wraps a "polygon" element.</p>
	 * @return A SVG component wrapping a basic shape element.
	 * @since 1.0
	 */
	public static final Component polygon() {
		return Component.createElementNS(SVG_NS, POLYGON);
	}

	/**
	 * <p>Defines the points of a polygon by setting attributes to the SVG 
	 * element wrapped by the specified component.</p>
	 * @param v The current SVG component.
	 * @param points The points that make up the polygon.
	 * @since 1.0
	 * @see #polygon()
	 */
	public static final void polygon(Component v, ArrayLike<String> points) {
		Component.setAttribute(v, "points", ArrayLikes.join(points, SPACE));
	}

	/**
	 * <p>Creates SVG component that wraps a "polygon" element.</p>
	 * @param points The points that make up the polygon.
	 * @return A SVG component wrapping a basic shape element.
	 * @since 1.0
	 * @see #polygon()
	 */
	public static final Component polygon(ArrayLike<String> points) {
		Component v = polygon();
		polygon(v, points);
		return v;
	}

	/**
	 * <p>Defines the outline data of a path by setting attributes to the SVG 
	 * element wrapped by the specified component.</p>
	 * @param v The current SVG component.
	 * @param commands An array of path commands.
	 * @since 1.0
	 * @see #path()
	 */
	public static final void path(Component v, ArrayLike<String> commands) {
		Component.setAttribute(v, DEF, ArrayLikes.join(commands, SPACE));
	}

	/**
	 * <p>Creates SVG component that wraps a "path" element.</p>
	 * @return A SVG component wrapping a basic shape element.
	 * @since 1.0
	 */
	public static final Component path() {
		return Component.createElementNS(SVG_NS, PATH);
	}

	/**
	 * <p>Creates SVG component that wraps a "path" element.</p>
	 * @param commands An array of path commands used to define the outline shape of 
	 * the specified path.
	 * @return A SVG component wrapping a basic shape element.
	 * @since 1.0
	 */
	public static final Component path(ArrayLike<String> commands) {
		Component v = path();
		path(v, commands);
		return v;
	}

	/**
	 * <p>Creates an absolute move-to path command.</p>
	 * @param x The X coordinate of the point to move to.
	 * @param y The Y coordinate of the point to move to.
	 * @return A string value of the newly created path command.
	 * @since 1.0
	 */
	public static final String moveTo(double x, double y) {
		return Js.add("M ", coord(x, y));
	}

	/**
	 * <p>Creates an absolute line-to path command.</p>
	 * @param x The X coordinate of the point to line to.
	 * @param y The Y coordinate of the point to line to.
	 * @return A string value of the newly created path command.
	 * @since 1.0
	 */
	public static final String lineTo(double x, double y) {
		return Js.add("L ", coord(x, y));
	}

	/**
	 * <p>Creates a close-path command.</p>
	 * @return A string value of the newly created path command.
	 * @since 1.0
	 */
	public static final String closePath() {
		return "Z";
	}

	/**
	 * <p>Creates a relative move-to path command.</p>
	 * @param x The relative X coordinate of the point to move to.
	 * @param y The relative Y coordinate of the point to move to.
	 * @return A string value of the newly created path command.
	 * @since 1.0
	 */
	public static final String moveto(double x, double y) {
		return Js.add("m", coord(x, y));
	}

	/**
	 * <p>Creates a relative line-to path command.</p>
	 * @param x The relative X coordinate of the point to line to.
	 * @param y The relative Y coordinate of the point to line to.
	 * @return A string value of the newly created path command.
	 * @since 1.0
	 */
	public static final String lineto(double x, double y) {
		return Js.add("l", coord(x, y));
	}

	/**
	 * <p>Fills with a CSS color by setting attributes to the SVG element wrapped by 
	 * the specified component.</p>
	 * @param v The current SVG component.
	 * @param color A string of CSS color value.
	 * @since 1.0
	 * @see #stroke(Component, String)
	 * @see #strokeWidth(Component, Object)
	 */
	public static final void fill(Component v, String color) {
		Component.setAttribute(v, "fill", color);
	}

	/**
	 * <p>Defines a stroke color by setting attributes to the SVG element wrapped by 
	 * the specified component.</p>
	 * @param v The current SVG component.
	 * @param color A string of CSS color value.
	 * @since 1.0
	 * @see #fill(Component, String)
	 * @see #strokeWidth(Component, Object)
	 */
	public static final void stroke(Component v, String color) {
		Component.setAttribute(v, "stroke", color);
	}

	/**
	 * <p>Defines stroke width by setting attributes to the SVG element wrapped by 
	 * the specified component.</p>
	 * @param v The current SVG component.
	 * @param w A number or string value of stroke width.
	 * @since 1.0
	 * @see #fill(Component, String)
	 * @see #stroke(Component, String)
	 */
	public static final void strokeWidth(Component v, Object w) {
		Component.setAttribute(v, "stroke-width", w);
	}
}
