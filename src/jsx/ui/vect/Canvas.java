
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

package jsx.ui.vect;

import js.NumberLike;
import js.user.JsCanvasGradient;
import js.user.JsCanvasPattern;
import js.user.JsCanvasRenderingContext2D;
import js.user.JsHTMLCanvasElement;
import js.user.JsHTMLElement;
import js.user.JsHTMLImageElement;
import jsx.client.Document;
import jsx.client.Win;
import jsx.ui.Component;
import jsx.ui.Widget;

/**
 * <p>Defines a canvas widget.</p>
 * <p>A {@link Canvas} is a {@link Widget} that wraps a {@link Component} that 
 * wraps an HTML <tt>&lt;canvas&gt;</tt> element.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Canvas extends Widget
{
	private final JsCanvasRenderingContext2D context;

	/**
	 * <p>A typical constructor forcing constructors of subclasses to pass a component.</p>
	 * @param e The underlying component that must wrap an HTML <tt>&lt;canvas&gt;</tt> 
	 * element.
	 * @since 1.0
	 */
	protected Canvas(Component e) {
		super(e);
		context = new JsHTMLCanvasElement(
				Component.getHTMLElement(e)
		).getContext("2d");
	}

	/**
	 * <p>Gets a canvas widget from an HTML <tt>&lt;canvas&gt;</tt> element.</p>
	 * @param e An HTML <tt>&lt;canvas&gt;</tt> element.
	 * @return A canvas widget that wraps a component that wraps the HTML 
	 * <tt>&lt;canvas&gt;</tt> element.
	 * @since 1.0
	 */
	public static final Canvas get(JsHTMLElement e) {
		Component c = Component.get(e);
		if (!Component.tagName(c, "canvas")) {
			return null;
		}
		return new Canvas(c);
	}

	/**
	 * <p>Creates a canvas widget the HTML <tt>&lt;body&gt;</tt> element of the current 
	 * HTML document.</p>
	 * @return A canvas widget that wraps a component that wraps the newly created HTML 
	 * <tt>&lt;canvas&gt;</tt> element.
	 * @since 1.0
	 */
	public static final Canvas create() {
		return create(Document.body.var());
	}

	/**
	 * <p>Creates a canvas widget whose HTML <tt>&lt;canvas&gt;</tt> element is a child of 
	 * an existing HTML element.</p>
	 * @return A canvas widget that wraps a component that wraps the newly created HTML 
	 * <tt>&lt;canvas&gt;</tt> element.
	 * @since 1.0
	 */
	public static final Canvas create(JsHTMLElement parent) {
		JsHTMLElement e = new JsHTMLElement(
				Win.document.var().createElement("canvas")
		);
		parent.appendChild(e);
		return get(e);
	}

	/**
	 * <p>Gets the content width of a canvas widget.</p>
	 * <p>This method simply calls the {@link Component#contentWidth(Component)} method with 
	 * the underlying HTML <tt>&lt;canvas&gt;</tt> element of the current canvas widget </p>
	 * @param c The current canvas widget.
	 * @return The content width of the underlying HTML <tt>&lt;canvas&gt;</tt> element of 
	 * the current canvas widget.
	 * @since 1.0
	 */
	public static final double width(Canvas c) {
		return Component.contentWidth(c.unwrap());
	}

	/**
	 * <p>Gets the content height of a canvas widget.</p>
	 * <p>This method simply calls the {@link Component#contentHeight(Component)} method with 
	 * the underlying HTML <tt>&lt;canvas&gt;</tt> element of the current canvas widget </p>
	 * @param c The current canvas height.
	 * @return The content height of the underlying HTML <tt>&lt;canvas&gt;</tt> element of 
	 * the current canvas widget.
	 * @since 1.0
	 */
	public static final double height(Canvas c) {
		return Component.contentHeight(c.unwrap());
	}

	/**
	 * <p>Sets the width of a canvas widget.</p>
	 * <p>This method sets the {@link JsHTMLCanvasElement#width} property of the underlying 
	 * HTML <tt>&lt;canvas&gt;</tt> element of the current canvas widget to the specified 
	 * style value.</p>
	 * @param c The current canvas widget.
	 * @param w The <tt>width</tt> style to set.
	 * @since 1.0
	 */
	public static final void width(Canvas c, Object w) {
		JsHTMLCanvasElement.width.with(Component.getHTMLElement(c.unwrap()), w);
	}

	/**
	 * <p>Sets the height of a canvas widget.</p>
	 * <p>This method sets the {@link JsHTMLCanvasElement#height} property of the underlying 
	 * HTML <tt>&lt;canvas&gt;</tt> element of the current canvas widget to the specified 
	 * style value.</p>
	 * @param c The current canvas widget.
	 * @param h The <tt>height</tt> style to set.
	 * @since 1.0
	 */
	public static final void height(Canvas c, Object h) {
		JsHTMLCanvasElement.height.with(Component.getHTMLElement(c.unwrap()), h);
	}

	/**
	 * <p>Gets the {@link JsCanvasRenderingContext2D#fillStyle} property of a canvas widget.</p>
	 * @param c The current canvas widget.
	 * @return The {@link JsCanvasRenderingContext2D#fillStyle} property of the underlying 
	 * {@link JsCanvasRenderingContext2D} object created from the wrapped HTML 
	 * <tt>&lt;canvas&gt;</tt> element.
	 * @since 1.0
	 */
	public static final Object fillStyle(Canvas c) {
		return JsCanvasRenderingContext2D.fillStyle.with(c.context);
	}

	/**
	 * <p>Sets the {@link JsCanvasRenderingContext2D#fillStyle} property of a canvas widget.</p>
	 * <p>This method sets the {@link JsCanvasRenderingContext2D#fillStyle} property of the 
	 * underlying {@link JsCanvasRenderingContext2D} object created from the wrapped HTML 
	 * <tt>&lt;canvas&gt;</tt> element to the specified value.</p>
	 * @param c The current canvas widget.
	 * @param o The new property value.
	 * @since 1.0
	 */
	public static final void fillStyle(Canvas c, Object o) {
		JsCanvasRenderingContext2D.fillStyle.with(c.context, o);
	}

	/**
	 * <p>Sets the {@link JsCanvasRenderingContext2D#globalAlpha} property of a canvas widget.</p>
	 * <p>This method sets the {@link JsCanvasRenderingContext2D#globalAlpha} property of the 
	 * underlying {@link JsCanvasRenderingContext2D} object created from the wrapped HTML 
	 * <tt>&lt;canvas&gt;</tt> element to the specified value.</p>
	 * @param c The current canvas widget.
	 * @param a The new property value.
	 * @since 1.0
	 */
	public static final void globalAlpha(Canvas c, Number a) {
		JsCanvasRenderingContext2D.globalAlpha.with(c.context, a);
	}

	/**
	 * <p>Gets the {@link JsCanvasRenderingContext2D#globalCompositeOperation} property of a canvas widget.</p>
	 * @param c The current canvas widget.
	 * @return The {@link JsCanvasRenderingContext2D#globalCompositeOperation} property of the underlying 
	 * {@link JsCanvasRenderingContext2D} object created from the wrapped HTML 
	 * <tt>&lt;canvas&gt;</tt> element.
	 * @since 1.0
	 */
	public static final String globalCompositeOperation(Canvas c) {
		return JsCanvasRenderingContext2D.globalCompositeOperation.with(c.context);
	}

	/**
	 * <p>Sets the {@link JsCanvasRenderingContext2D#globalCompositeOperation} property of a canvas widget.</p>
	 * <p>This method sets the {@link JsCanvasRenderingContext2D#globalCompositeOperation} property of the 
	 * underlying {@link JsCanvasRenderingContext2D} object created from the wrapped HTML 
	 * <tt>&lt;canvas&gt;</tt> element to the specified value.</p>
	 * @param c The current canvas widget.
	 * @param co The new property value.
	 * @since 1.0
	 */
	public static final void globalCompositeOperation(Canvas c, String co) {
		JsCanvasRenderingContext2D.globalCompositeOperation.with(c.context, co);
	}

	/**
	 * <p>Sets the {@link JsCanvasRenderingContext2D#lineCap} property of a canvas widget.</p>
	 * <p>This method sets the {@link JsCanvasRenderingContext2D#lineCap} property of the 
	 * underlying {@link JsCanvasRenderingContext2D} object created from the wrapped HTML 
	 * <tt>&lt;canvas&gt;</tt> element to the specified value.</p>
	 * @param c The current canvas widget.
	 * @param lc The new property value.
	 * @since 1.0
	 */
	public static final void lineCap(Canvas c, String lc) {
		JsCanvasRenderingContext2D.lineCap.with(c.context, lc);
	}

	/**
	 * <p>Sets the {@link JsCanvasRenderingContext2D#lineJoin} property of a canvas widget.</p>
	 * <p>This method sets the {@link JsCanvasRenderingContext2D#lineJoin} property of the 
	 * underlying {@link JsCanvasRenderingContext2D} object created from the wrapped HTML 
	 * <tt>&lt;canvas&gt;</tt> element to the specified value.</p>
	 * @param c The current canvas widget.
	 * @param lj The new property value.
	 * @since 1.0
	 */
	public static final void lineJoin(Canvas c, String lj) {
		JsCanvasRenderingContext2D.lineJoin.with(c.context, lj);
	}

	/**
	 * <p>Gets the {@link JsCanvasRenderingContext2D#lineWidth} property of a canvas widget.</p>
	 * @param c The current canvas widget.
	 * @return The {@link JsCanvasRenderingContext2D#lineWidth} property of the underlying 
	 * {@link JsCanvasRenderingContext2D} object created from the wrapped HTML 
	 * <tt>&lt;canvas&gt;</tt> element.
	 * @since 1.0
	 */
	public static final double lineWidth(Canvas c) {
		return JsCanvasRenderingContext2D.lineWidth.with(c.context).doubleValue();
	}

	/**
	 * <p>Sets the {@link JsCanvasRenderingContext2D#lineWidth} property of a canvas widget.</p>
	 * <p>This method sets the {@link JsCanvasRenderingContext2D#lineWidth} property of the 
	 * underlying {@link JsCanvasRenderingContext2D} object created from the wrapped HTML 
	 * <tt>&lt;canvas&gt;</tt> element to the specified value.</p>
	 * @param c The current canvas widget.
	 * @param w The new property value.
	 * @since 1.0
	 */
	public static final void lineWidth(Canvas c, Number w) {
		JsCanvasRenderingContext2D.lineWidth.with(c.context, w);
	}

	/**
	 * <p>Sets the {@link JsCanvasRenderingContext2D#miterLimit} property of a canvas widget.</p>
	 * <p>This method sets the {@link JsCanvasRenderingContext2D#miterLimit} property of the 
	 * underlying {@link JsCanvasRenderingContext2D} object created from the wrapped HTML 
	 * <tt>&lt;canvas&gt;</tt> element to the specified value.</p>
	 * @param c The current canvas widget.
	 * @param m The new property value.
	 * @since 1.0
	 */
	public static final void miterLimit(Canvas c, Number m) {
		JsCanvasRenderingContext2D.miterLimit.with(c.context, m);
	}

	/**
	 * <p>Sets the {@link JsCanvasRenderingContext2D#shadowBlur} property of a canvas widget.</p>
	 * <p>This method sets the {@link JsCanvasRenderingContext2D#shadowBlur} property of the 
	 * underlying {@link JsCanvasRenderingContext2D} object created from the wrapped HTML 
	 * <tt>&lt;canvas&gt;</tt> element to the specified value.</p>
	 * @param c The current canvas widget.
	 * @param b The new property value.
	 * @since 1.0
	 */
	public static final void shadowBlur(Canvas c, Number b) {
		JsCanvasRenderingContext2D.shadowBlur.with(c.context, b);
	}

	/**
	 * <p>Sets the {@link JsCanvasRenderingContext2D#shadowColor} property of a canvas widget.</p>
	 * <p>This method sets the {@link JsCanvasRenderingContext2D#shadowColor} property of the 
	 * underlying {@link JsCanvasRenderingContext2D} object created from the wrapped HTML 
	 * <tt>&lt;canvas&gt;</tt> element to the specified value.</p>
	 * @param c The current canvas widget.
	 * @param cssColor The new property value.
	 * @since 1.0
	 */
	public static final void shadowColor(Canvas c, String cssColor) {
		JsCanvasRenderingContext2D.shadowColor.with(c.context, cssColor);
	}

	/**
	 * <p>Sets the {@link JsCanvasRenderingContext2D#shadowOffsetX} property of a canvas widget.</p>
	 * <p>This method sets the {@link JsCanvasRenderingContext2D#shadowOffsetX} property of the 
	 * underlying {@link JsCanvasRenderingContext2D} object created from the wrapped HTML 
	 * <tt>&lt;canvas&gt;</tt> element to the specified value.</p>
	 * @param c The current canvas widget.
	 * @param x The new property value.
	 * @since 1.0
	 */
	public static final void shadowOffsetX(Canvas c, Number x) {
		JsCanvasRenderingContext2D.shadowOffsetX.with(c.context, x);
	}

	/**
	 * <p>Sets the {@link JsCanvasRenderingContext2D#shadowOffsetY} property of a canvas widget.</p>
	 * <p>This method sets the {@link JsCanvasRenderingContext2D#shadowOffsetY} property of the 
	 * underlying {@link JsCanvasRenderingContext2D} object created from the wrapped HTML 
	 * <tt>&lt;canvas&gt;</tt> element to the specified value.</p>
	 * @param c The current canvas widget.
	 * @param y The new property value.
	 * @since 1.0
	 */
	public static final void shadowOffsetY(Canvas c, Number y) {
		JsCanvasRenderingContext2D.shadowOffsetY.with(c.context, y);
	}

	/**
	 * <p>Gets the {@link JsCanvasRenderingContext2D#strokeStyle} property of a canvas widget.</p>
	 * @param c The current canvas widget.
	 * @return The {@link JsCanvasRenderingContext2D#strokeStyle} property of the underlying 
	 * {@link JsCanvasRenderingContext2D} object created from the wrapped HTML 
	 * <tt>&lt;canvas&gt;</tt> element.
	 * @since 1.0
	 */
	public static final Object strokeStyle(Canvas c) {
		return JsCanvasRenderingContext2D.strokeStyle.with(c.context);
	}

	/**
	 * <p>Sets the {@link JsCanvasRenderingContext2D#strokeStyle} property of a canvas widget.</p>
	 * <p>This method sets the {@link JsCanvasRenderingContext2D#strokeStyle} property of the 
	 * underlying {@link JsCanvasRenderingContext2D} object created from the wrapped HTML 
	 * <tt>&lt;canvas&gt;</tt> element to the specified value.</p>
	 * @param c The current canvas widget.
	 * @param o The new property value.
	 * @since 1.0
	 */
	public static final void strokeStyle(Canvas c, Object o) {
		JsCanvasRenderingContext2D.strokeStyle.with(c.context, o);
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
	 * @param c The current canvas widget.
	 * @param x The X coordinate of the center of the circle describing the arc.
	 * @param y The Y coordinate of the center of the circle describing the arc.
	 * @param r The radius of the circle that defines the arc.
	 * @param a1 Specifies the start point of the arc along the circle. The angles is 
	 * measured in radians. The three o'clock position along the positive X axis is an 
	 * angle of 0, and angles increase in the clockwise direction.
	 * @param a2 Specifies the end point of the arc along the circle. The angle is 
	 * measured in radians. The three o'clock position along the positive X axis is an 
	 * angle of 0, and angles increase in the clockwise direction.
	 * @param ccw Whether the arc is traversed counterclockwise (<tt>true</tt>) 
	 * or clockwise (<tt>false</tt>) along the circle's circumference.
	 * @since 1.0
	 * @see #arcTo(Canvas, Number, Number, Number, Number, Number)
	 * @see #beginPath(Canvas)
	 * @see #closePath(Canvas)
	 */
	public static final void arc(Canvas c, Number x, Number y, Number r, Number a1, Number a2, Boolean ccw) {
		c.context.arc(x, y, r, a1, a2, ccw);
	}

	/**
	 * <p>Adds an arc to the current sub-path, using tangent points and a radius.</p>
	 * <p>This method adds an arc to the current sub-path but describes that arc much 
	 * differently than the {@link #arc(Canvas, Number, Number, Number, Number, Number, Boolean)} 
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
	 * @param c The current canvas widget.
	 * @param x1 The X coordinate of the control point associated with the arc's start point.
	 * @param y1 The Y coordinate of the control point associated with the arc's start point.
	 * @param x2 The X coordinate of the control point associated with the arc's end point.
	 * @param y2 The Y coordinate of the control point associated with the arc's end point.
	 * @param r The radius of the circle that defines the arc.
	 * @since 1.0
	 * @see #arc(Canvas, Number, Number, Number, Number, Number, Boolean)
	 */
	public static final void arcTo(Canvas c, Number x1, Number y1, Number x2, Number y2, Number r) {
		c.context.arcTo(x1, y1, x2, y2, r);
	}

	/**
	 * <p>Starts a new path (or a collection of sub-paths) in a canvas.</p>
	 * <p>This method discards any currently defined path and begins a new one. It sets 
	 * the current point to (0,0).</p>
	 * <p>When the context for a canvas is first created, this method is implicitly 
	 * called.</p>
	 * @param c The current canvas widget.
	 * @since 1.0
	 * @see #closePath(Canvas)
	 * @see #fill(Canvas)
	 * @see #stroke(Canvas)
	 */
	public static final void beginPath(Canvas c) {
		c.context.beginPath();
	}

	/**
	 * <p>Adds a cubic Bézier curve to the current sub-path.</p>
	 * <p>The start point of the curve is the current point of the canvas, and the end 
	 * point is <tt>(x,y)</tt>. The two Bezier control points <tt>(x1, y1)</tt> and 
	 * <tt>(x2, y2)</tt> define the shape of the curve. When this method returns, the 
	 * current position is <tt>(x,y)</tt>.</p>
	 * @param c The current canvas widget.
	 * @param x1 The X coordinate of the control point associated with the curve's 
	 * start point (the current position).
	 * @param y1 The Y coordinate of the control point associated with the curve's 
	 * start point (the current position).
	 * @param x2 The X coordinate of the control point associated with the curve's end point.
	 * @param y2 The Y coordinate of the control point associated with the curve's end point.
	 * @param x The X coordinate of the curve's end point.
	 * @param y The Y coordinate of the curve's end point.
	 * @since 1.0
	 * @see #quadraticCurveTo(Canvas, Number, Number, Number, Number)
	 */
	public static final void bezierCurveTo(Canvas c, Number x1, Number y1, Number x2, Number y2, Number x, Number y) {
		c.context.bezierCurveTo(x1, y1, x2, y2, x, y);
	}

	/**
	 * <p>Erases the pixels in a rectangular area of a canvas.</p>
	 * <p>This method erases the specified rectangle, filling it with a transparent color.</p>
	 * @param c The current canvas widget.
	 * @param x The X coordinate of the upper-left corner of the rectangle.
	 * @param y The Y coordinate of the upper-left corner of the rectangle.
	 * @param w The X dimension of the rectangle.
	 * @param h The Y dimension of the rectangle.
	 * @since 1.0
	 */
	public static final void clearRect(Canvas c, Number x, Number y, Number w, Number h) {
		c.context.clearRect(x, y, w, h);
	}

	/**
	 * <p>Uses the current path as the clipping region for subsequent drawing operations.</p>
	 * <p>This method clips the current path using the current clipping path and then 
	 * uses the clipped path as the new clipping path. Note that there is no way to 
	 * enlarge the clipping path. If you want a temporary clipping path, you should 
	 * first call {@link #save(Canvas)} in order to use {@link #restore(Canvas)} to restore the 
	 * original clipping path. The default clipping path for a canvas is the canvas 
	 * rectangle itself.</p>
	 * <p>This method resets the current path so that it is empty.</p>
	 * @param c The current canvas widget.
	 * @since 1.0
	 */
	public static final void clip(Canvas c) {
		c.context.clip();
	}

	/**
	 * <p>Closes the current sub-path if it's open.</p>
	 * <p>If the current sub-path of the canvas is open, this method closes it by adding 
	 * a line connecting the current point to the sub-path's starting point. If the 
	 * sub-path is already closed, this method does nothing. Once a sub-path is closed, 
	 * no more lines or curves can be added to it. To continue adding to the path, 
	 * you must begin a new sub-path by calling {@link #moveTo(Canvas, Number, Number)}.</p>
	 * <p>You do not need to call {@link #closePath(Canvas)} before stroking or filling a path. 
	 * Paths are implicitly closed when filled (and also when you call {@link #clip(Canvas)}).</p>
	 * @param c The current canvas widget.
	 * @since 1.0
	 * @see #beginPath(Canvas)
	 * @see #moveTo(Canvas, Number, Number)
	 * @see #stroke(Canvas)
	 * @see #fill(Canvas)
	 */
	public static final void closePath(Canvas c) {
		c.context.closePath();
	}

	/**
	 * <p>Returns a {@link JsCanvasGradient} object that represents a linear color 
	 * gradient.</p>
	 * <p>This method creates and returns a new {@link JsCanvasGradient} object that 
	 * linearly interpolates colors between the specified start point and end point. 
	 * Note that this method does not specify any colors for the gradient. Use the 
	 * {@link JsCanvasGradient#addColorStop(Number, String)} method of the returned 
	 * object to do that. To stroke lines or fill areas using a gradient, assign a 
	 * {@link JsCanvasGradient} object to the {@link JsCanvasRenderingContext2D#strokeStyle} 
	 * or {@link JsCanvasRenderingContext2D#fillStyle} properties.</p>
	 * @param c The current canvas widget.
	 * @param x1 The X coordinate of the gradient's start point.
	 * @param y1 The Y coordinate of the gradient's start point.
	 * @param x2 The X coordinate of the gradient's end point.
	 * @param y2 The Y coordinate of the gradient's end point.
	 * @return A {@link JsCanvasGradient} object representing the linear color gradient.
	 * @since 1.0
	 * @see #createRadialGradient(Canvas, Number, Number, Number, Number, Number, Number)
	 */
	public static final JsCanvasGradient createLinearGradient(Canvas c, Number x1, Number y1,
			Number x2, Number y2) {
		return c.context.createLinearGradient(x1, y1, x2, y2);
	}

	/**
	 * <p>Returns a {@link JsCanvasPattern} object that represents a tiled image.</p>
	 * <p>This method creates and returns a new {@link JsCanvasPattern} object that 
	 * represents the pattern defined by a tiled image. To use a pattern for stroking 
	 * lines or filling areas, use a {@link JsCanvasPattern} object as the value of the 
	 * {@link JsCanvasRenderingContext2D#strokeStyle} or {@link JsCanvasRenderingContext2D#fillStyle} 
	 * properties.</p>
	 * @param c The current canvas widget.
	 * @param image The image to be tiled. This argument is typically 
	 * {@link JsHTMLImageElement} object, but you may also use a {@link JsHTMLCanvasElement} 
	 * element (see {@link #createPattern(Canvas, JsHTMLCanvasElement, String)}).
	 * @param repeat Specifies how the image is tiled. The possible values are the following:
	 * <ul>
	 * <li>"repeat": Tile the image in both directions. This is the default.</li>
	 * <li>"repeat-x": Tile the image in the X dimension only.</li>
	 * <li>"repeat-y": Tile the image in the Y dimension only.</li>
	 * <li>"no-repeat": Do not tile the image; use it a single time only.</li>
	 * </ul>
	 * @return A {@link JsCanvasPattern} object representing the pattern.
	 * @since 1.0
	 * @see #createPattern(Canvas, JsHTMLCanvasElement, String)
	 */
	public static final JsCanvasPattern createPattern(Canvas c, JsHTMLImageElement image, String repeat) {
		return c.context.createPattern(image, repeat);
	}

	/**
	 * <p>Returns a {@link JsCanvasPattern} object that represents a tiled image.</p>
	 * <p>This method creates and returns a new {@link JsCanvasPattern} object that 
	 * represents the pattern defined by a tiled image. To use a pattern for stroking 
	 * lines or filling areas, use a {@link JsCanvasPattern} object as the value of the 
	 * {@link JsCanvasRenderingContext2D#strokeStyle} or {@link JsCanvasRenderingContext2D#fillStyle} 
	 * properties.</p>
	 * @param c The current canvas widget.
	 * @param image The image to be tiled. This argument is typically 
	 * {@link JsHTMLImageElement} object, but you may also use a {@link JsHTMLCanvasElement} 
	 * element (see {@link #createPattern(Canvas, JsHTMLCanvasElement, String)}).
	 * @param repeat Specifies how the image is tiled. The possible values are the following:
	 * <ul>
	 * <li>"repeat": Tile the image in both directions. This is the default.</li>
	 * <li>"repeat-x": Tile the image in the X dimension only.</li>
	 * <li>"repeat-y": Tile the image in the Y dimension only.</li>
	 * <li>"no-repeat": Do not tile the image; use it a single time only.</li>
	 * </ul>
	 * @return A {@link JsCanvasPattern} object representing the pattern.
	 * @since 1.0
	 * @see #createPattern(Canvas, JsHTMLCanvasElement, String)
	 */
	public static final JsCanvasPattern createPattern(Canvas c, JsHTMLCanvasElement image, String repeat) {
		return c.context.createPattern(image, repeat);
	}

	/**
	 * <p>Returns a {@link JsCanvasGradient} object that represents a radial color 
	 * gradient.</p>
	 * <p>This method creates and returns a new {@link JsCanvasGradient} object that 
	 * radially interpolates colors between the circumferences of the two specified 
	 * circles. Note that this method does not specify any colors for the gradient. 
	 * Use the {@link JsCanvasGradient#addColorStop(Number, String)} method of the 
	 * returned object to do that. To stroke lines or fill areas using a gradient, 
	 * assign a {@link JsCanvasGradient} object to the {@link JsCanvasRenderingContext2D#strokeStyle} 
	 * or {@link JsCanvasRenderingContext2D#fillStyle} properties.</p>
	 * @param c The current canvas widget.
	 * @param x1 The X coordinate of the center of the starting circle.
	 * @param y1 The Y coordinate of the center of the starting circle.
	 * @param r1 The radius of the starting circle.
	 * @param x2 The X coordinate of the center of the ending circle.
	 * @param y2 The Y coordinate of the center of the starting circle.
	 * @param r2 The radius of the ending circle.
	 * @return A {@link JsCanvasGradient} object representing the radial color gradient.
	 * @since 1.0
	 * @see #createLinearGradient(Canvas, Number, Number, Number, Number)
	 */
	public static final JsCanvasGradient createRadialGradient(Canvas c, Number x1, Number y1, Number r1, Number x2, Number y2, Number r2) {
		return c.context.createRadialGradient(x1, y1, r1, x2, y2, r2);
	}

	/**
	 * <p>Draws an image.</p>
	 * <p>This method copies the entire image to the canvas, placing its upper-left 
	 * corner at the specified point and mapping each image pixel to one unit in the 
	 * canvas coordinate system.</p>
	 * @param c The current canvas widget.
	 * @param image The image to be drawn. This argument may also be a 
	 * {@link JsHTMLCanvasElement} object.
	 * @param x The X coordinate of the point at which the upper-left corner of the 
	 * image is drawn.
	 * @param y The Y coordinate of the point at which the upper-left corner of the 
	 * image is drawn.
	 * @see #drawImage(Canvas, JsHTMLCanvasElement, Number, Number)
	 * @see #drawImage(Canvas, JsHTMLImageElement, Number, Number, Number, Number)
	 * @see #drawImage(Canvas, JsHTMLImageElement, Number, Number, Number, Number, Number, Number, Number, Number)
	 * @since 1.0
	 */
	public static final void drawImage(Canvas c, JsHTMLImageElement image, Number x, Number y) {
		c.context.drawImage(image, x, y);
	}

	/**
	 * <p>Draws an image.</p>
	 * <p>This method copies the entire image to the canvas, placing its upper-left 
	 * corner at the specified point and mapping each image pixel to one unit in the 
	 * canvas coordinate system.</p>
	 * @param c The current canvas widget.
	 * @param image The image to be drawn. This argument may also be an {@link JsHTMLImageElement} 
	 * object representing an <tt>&lt;img&gt;</tt> tag, or an offscreen image.
	 * @param x The X coordinate of the point at which the upper-left corner of the 
	 * image is drawn.
	 * @param y The Y coordinate of the point at which the upper-left corner of the 
	 * image is drawn.
	 * @see #drawImage(Canvas, JsHTMLImageElement, Number, Number)
	 * @see #drawImage(Canvas, JsHTMLCanvasElement, Number, Number, Number, Number)
	 * @see #drawImage(Canvas, JsHTMLCanvasElement, Number, Number, Number, Number, Number, Number, Number, Number)
	 * @since 1.0
	 */
	public static final void drawImage(Canvas c, JsHTMLCanvasElement image, Number x, Number y) {
		c.context.drawImage(image, x, y);
	}

	/**
	 * <p>Draws an image.</p>
	 * <p>This method copies the entire image to the canvas and allows you to specify 
	 * the desired width and height of the image in canvas units.</p>
	 * @param c The current canvas widget.
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
	 * @see #drawImage(Canvas, JsHTMLCanvasElement, Number, Number, Number, Number)
	 * @see #drawImage(Canvas, JsHTMLImageElement, Number, Number)
	 * @see #drawImage(Canvas, JsHTMLImageElement, Number, Number, Number, Number, Number, Number, Number, Number)
	 * @since 1.0
	 */
	public static final void drawImage(
			Canvas c, JsHTMLImageElement image, Number x, Number y, Number w, Number h) {
		c.context.drawImage(image, x, y, w, h);
	}
	/**
	 * <p>Draws an image.</p>
	 * <p>This method allows you to specify any rectangular region of the image and 
	 * copy it, with arbitrary scaling to any position within the canvas.</p>
	 * @param c The current canvas widget.
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
	 * @see #drawImage(Canvas, JsHTMLCanvasElement, Number, Number, Number, Number, Number, Number, Number, Number)
	 * @see #drawImage(Canvas, JsHTMLImageElement, Number, Number)
	 * @see #drawImage(Canvas, JsHTMLImageElement, Number, Number, Number, Number)
	 * @since 1.0
	 */
	public static final void drawImage(Canvas c, JsHTMLImageElement image, 
			Number x1, Number y1, Number w1, Number h1,
			Number x2, Number y2, Number w2, Number h2) {
		c.context.drawImage(image, x1, y1, w1, h1, x2, y2, w2, h2);
	}
	/**
	 * <p>Draws an image.</p>
	 * <p>This method copies the entire image to the canvas and allows you to specify 
	 * the desired width and height of the image in canvas units.</p>
	 * @param c The current canvas widget.
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
	 * @see #drawImage(Canvas, JsHTMLImageElement, Number, Number, Number, Number)
	 * @see #drawImage(Canvas, JsHTMLCanvasElement, Number, Number)
	 * @see #drawImage(Canvas, JsHTMLCanvasElement, Number, Number, Number, Number, Number, Number, Number, Number)
	 * @since 1.0
	 */
	public static final void drawImage(
			Canvas c, JsHTMLCanvasElement image, Number x, Number y, Number w, Number h) {
		c.context.drawImage(image, x, y, w, h);
	}
	/**
	 * <p>Draws an image.</p>
	 * <p>This method allows you to specify any rectangular region of the image and 
	 * copy it, with arbitrary scaling to any position within the canvas.</p>
	 * @param c The current canvas widget.
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
	 * @see #drawImage(Canvas, JsHTMLImageElement, Number, Number, Number, Number, Number, Number, Number, Number)
	 * @see #drawImage(Canvas, JsHTMLCanvasElement, Number, Number)
	 * @see #drawImage(Canvas, JsHTMLCanvasElement, Number, Number, Number, Number)
	 * @since 1.0
	 */
	public static final void drawImage(Canvas c, JsHTMLCanvasElement image, 
			Number x1, Number y1, Number w1, Number h1,
			Number x2, Number y2, Number w2, Number h2) {
		c.context.drawImage(image, x1, y1, w1, h1, x2, y2, w2, h2);
	}

	/**
	 * <p>Fills the interior of the current path with the color, gradient, or pattern 
	 * specified by the {@link #fillStyle} property.</p>
	 * @param c The current canvas widget.
	 * @since 1.0
	 * @see #fillRect(Canvas, Number, Number, Number, Number)
	 */
	public static final void fill(Canvas c) {
		c.context.fill();
	}

	/**
	 * <p>Paints or fills a rectangle.</p>
	 * <p>This method fills the specified rectangle with the color, gradient, or pattern 
	 * specified by the {@link JsCanvasRenderingContext2D#fillStyle} property.</p>
	 * <p>Current implementations of this method also clear the path as if 
	 * {@link #beginPath(Canvas)} had been called. This surprising behavior may not be 
	 * standardized and should not be relied on.</p>
	 * @param c The current canvas widget.
	 * @param x The X coordinate of the upper-left corner of the rectangle.
	 * @param y The Y coordinate of the upper-left corner of the rectangle.
	 * @param w The X dimension of the rectangle.
	 * @param h The Y dimension of the rectangle.
	 * @since 1.0
	 * @see #fill(Canvas)
	 * @see #rect(Canvas, Number, Number, Number, Number)
	 * @see #strokeRect(Canvas, Number, Number, Number, Number)
	 */
	public static final void fillRect(Canvas c, Number x, Number y, Number w, Number h) {
		c.context.fillRect(x, y, w, h);
	}

	/**
	 * <p>Adds a straight line segment to the current sub-path.</p>
	 * <p>This method adds a straight line to the current sub-path. The line begins at 
	 * the current point and ends at <tt>(x,y)</tt>.</p>
	 * <p>When this method returns, the current position is <tt>(x,y)</tt>.</p>
	 * @param x The X coordinate of the end point of the line.
	 * @param y The Y coordinate of the end point of the line.
	 * @since 1.0
	 * @see #beginPath(Canvas)
	 * @see #moveTo(Canvas, Number, Number)
	 */
	public static final void lineTo(Canvas c, Number x, Number y) {
		c.context.lineTo(x, y);
	}

	/**
	 * <p>Sets the current position and begins a new sub-path.</p>
	 * <p>This method sets the current position to <tt>(x,y)</tt> and creates a new 
	 * sub-path with this as its first point. If there was a previous sub-path and it 
	 * consisted of just one point, that sub-path is removed from the path.</p>
	 * @param c The current canvas widget.
	 * @param x The X coordinate of the new current point.
	 * @param y The Y coordinate of the new current point.
	 * @since 1.0
	 * @see #beginPath(Canvas)
	 */
	public static final void moveTo(Canvas c, Number x, Number y) {
		c.context.moveTo(x, y);
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
	 * @see #bezierCurveTo(Canvas, Number, Number, Number, Number, Number, Number)
	 */
	public static final void quadraticCurveTo(Canvas c, Number cx, Number cy, Number x, Number y) {
		c.context.quadraticCurveTo(cx, cy, x, y);
	}

	/**
	 * <p>Adds a rectangle sub-path to the current path.</p>
	 * <p>This method adds a rectangle to the path. This rectangle is in a sub-path of 
	 * its own and is not connected to any other sub-paths in the path.</p>
	 * <p>When this method returns, the current position is (0,0).</p>
	 * @param c The current canvas widget.
	 * @param x The X coordinate of the upper-left corner of the rectangle.
	 * @param y The Y coordinate of the upper-left corner of the rectangle.
	 * @param w The X dimension of the rectangle.
	 * @param h The Y dimension of the rectangle.
	 * @since 1.0
	 * @see #fillRect(Canvas, Number, Number, Number, Number)
	 * @see #strokeRect(Canvas, Number, Number, Number, Number)
	 */
	public static final void rect(Canvas c, Number x, Number y, Number w, Number h) {
		c.context.rect(x, y, w, h);
	}

	/**
	 * <p>Resets the canvas to the graphics state most recently saved.</p>
	 * <p>This method pops the stack of saved graphics states and restores the values of 
	 * the {@link JsCanvasRenderingContext2D} properties, the clipping path, and the 
	 * transformation matrix.</p>
	 * @param c The current canvas widget.
	 * @since 1.0
	 * @see #save(Canvas)
	 */
	public static final void restore(Canvas c) {
		c.context.restore();
	}

	/**
	 * <p>Rotates the canvas.</p>
	 * <p>This method alters the mapping between canvas coordinates and the pixels of 
	 * the <tt>&lt;canvas&gt;</tt> element in the web browser so that any subsequent 
	 * drawing appears rotated within the canvas by the specified angle. It does not 
	 * rotate the <tt>&lt;canvas&gt;</tt> element itself.</p>
	 * <p>Note that the angle is specified in radians. To convert degrees to radians, 
	 * multiply by {@link js.MathLike#PI} and divide by 180.</p>
	 * @param c The current canvas widget.
	 * @param a The amount of rotation, in radians. Positive values result in clockwise 
	 * rotation, and negative values result in counterclockwise rotation.
	 * @since 1.0
	 * @see #rotate(Canvas, NumberLike)
	 * @see #scale(Canvas, Number, Number)
	 * @see #translate(Canvas, Number, Number)
	 */
	public static final void rotate(Canvas c, Number a) {
		c.context.rotate(a);
	}

	/**
	 * <p>Rotates the canvas.</p>
	 * <p>This method alters the mapping between canvas coordinates and the pixels of 
	 * the <tt>&lt;canvas&gt;</tt> element in the web browser so that any subsequent 
	 * drawing appears rotated within the canvas by the specified angle. It does not 
	 * rotate the <tt>&lt;canvas&gt;</tt> element itself.</p>
	 * <p>Note that the angle is specified in radians. To convert degrees to radians, 
	 * multiply by {@link js.MathLike#PI} and divide by 180.</p>
	 * @param c The current canvas widget.
	 * @param a The amount of rotation, in radians. Positive values result in clockwise 
	 * rotation, and negative values result in counterclockwise rotation.
	 * @since 1.0
	 * @see #rotate(Canvas, Number)
	 * @see #scale(Canvas, Number, Number)
	 * @see #translate(Canvas, Number, Number)
	 */
	public static final void rotate(Canvas c, NumberLike<?> a) {
		c.context.rotate(a);
	}

	/**
	 * <p>Saves the properties, clipping region, and transformation matrix of the 
	 * {@link JsCanvasRenderingContext2D} object.</p>
	 * @param c The current canvas widget.
	 * @since 1.0
	 * @see #restore(Canvas)
	 */
	public static final void save(Canvas c) {
		c.context.save();
	}

	/**
	 * <p>Scales the user coordinate system of the canvas.</p>
	 * <p>This method adds a scale transformation to the current transformation matrix 
	 * of the canvas. Scaling is done with independent horizontal and vertical scaling 
	 * factors.</p>
	 * <p>Specifying a negative value for <tt>sx</tt> causes X coordinates to be flipped 
	 * across the Y axis, and a negative value of <tt>sy</tt> causes Y coordinates to 
	 * be flipped across the X axis.</p>
	 * @param c The current canvas widget.
	 * @param sx The horizontal scaling factor.
	 * @param sy The vertical scaling factor.
	 * @since 1.0
	 * @see #rotate(Canvas, Number)
	 * @see #rotate(Canvas, NumberLike)
	 * @see #translate(Canvas, Number, Number)
	 */
	public static final void scale(Canvas c, Number sx, Number sy) {
		c.context.scale(sx, sy);
	}

	/**
	 * <p>Draws, or strokes, a line following the current path.</p>
	 * <p>The line is drawn according to the {@link JsCanvasRenderingContext2D#lineWidth}, 
	 * {@link JsCanvasRenderingContext2D#lineJoin}, {@link JsCanvasRenderingContext2D#lineCap}, 
	 * and {@link JsCanvasRenderingContext2D#strokeStyle} properties, among others.</p>
	 * @param c The current canvas widget.
	 * @since 1.0
	 * @see #fill(Canvas)
	 * @see #strokeRect(Canvas, Number, Number, Number, Number)
	 */
	public static final void stroke(Canvas c) {
		c.context.stroke();
	}

	/**
	 * <p>Draws a rectangle without filling it.</p>
	 * <p>This method draws the outline, but does not fill the interior, of a rectangle 
	 * with the specified position and size. Line color and line width are specified by 
	 * the {@link JsCanvasRenderingContext2D#strokeStyle} and {@link JsCanvasRenderingContext2D#lineWidth} 
	 * properties. The appearance of the rectangle corners are specified by the 
	 * {@link JsCanvasRenderingContext2D#lineJoin} property.</p>
	 * <p>Current implementations of this method clear the path as if {@link #beginPath(Canvas)} 
	 * had been called. This surprising behavior may not be standardized and should not 
	 * be relied on.</p>
	 * @param c The current canvas widget.
	 * @param x The X coordinate of the upper-left corner of the rectangle.
	 * @param y The Y coordinate of the upper-left corner of the rectangle.
	 * @param w The X dimension of the rectangle.
	 * @param h The Y dimension of the rectangle.
	 * @since 1.0
	 * @see #fillRect(Canvas, Number, Number, Number, Number)
	 * @see #rect(Canvas, Number, Number, Number, Number)
	 * @see #stroke(Canvas)
	 */
	public static final void strokeRect(Canvas c, Number x, Number y, Number w, Number h) {
		c.context.strokeRect(x, y, w, h);
	}

	/**
	 * <p>Translates the user coordinate system of the canvas.</p>
	 * <p>This method adds horizontal and vertical offsets to the transformation matrix 
	 * of the canvas. The arguments <tt>dx</tt> and <tt>dy</tt> are added to all points 
	 * in any subsequently defined paths.</p>
	 * @param c The current canvas widget.
	 * @param dx The amount to translate in the X dimension.
	 * @param dy The amount to translate in the Y dimension.
	 * @since 1.0
	 * @see #rotate(Canvas, Number)
	 * @see #rotate(Canvas, NumberLike)
	 * @see #scale(Canvas, Number, Number)
	 */
	public static final void translate(Canvas c, Number dx, Number dy) {
		c.context.translate(dx, dy);
	}
}
