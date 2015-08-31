
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

import js.ArrayLike;
import js.Id;
import js.Initializer;
import js.Js;
import js.ObjectLike;
import js.Vars;
import jsx.Configurable;
import jsx.client.Browser;
import jsx.core.ObjectLikes;
import jsx.dom.Styles;
import jsx.graphic.SVG;
import jsx.graphic.VML;
import jsx.motion.Motion;
import jsx.motion.reg.Uniform;
import jsx.ui.Component;
import jsx.ui.Widget;
import jsx.ui.event.OnRender;
import jsx.ui.event.OnStyle;
import jsx.ui.event.Render;
import jsx.ui.event.Style;

/**
 * <p>A base class for widgets that wrap HTML vector graphics elements.</p>
 * <p>This class provides basic functionalities to manipulate the underlying vector 
 * graphics element, which is either a VML element for IE or a SVG element for other 
 * browsers, eliminating the browser dependencies.</p>
 * <p>A {@link Graphic} widget is {@link Configurable} and is also an event source 
 * which fires {@link jsx.ui.Widget.Event} events.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see SVG
 * @see VML
 */
public class Graphic extends Widget implements OnRender, OnStyle
{
	private final static Id<Component> GRAPHIC = new Id<Component>();

	/**
	 * <p>The default constructor to create widgets of this type.</p>
	 * <p>This constructor simply invokes the typical constructor of this class passing 
	 * a newly created graphic component, which wraps a HTML <tt>&lt;div&gt</tt> element, 
	 * as argument.</p>
	 * @since 1.0
	 */
	public Graphic() {
		this(Component.div());
	}

	/**
	 * <p>A typical constructor that constructs widgets of this type and forces 
	 * constructors of subclasses to pass a graphic component.</p>
	 * <p>This constructor invokes the typical constructor of the superclass passing 
	 * the specified graphic component as argument and registers the wrapper widget being 
	 * constructed as an event listener to listen {@link Render} and {@link Style} events 
	 * fired from the underlying graphic component.</p>
	 * @param e The underlying graphic component which is a component that wraps an HTML 
	 * <tt>&lt;div&gt</tt> element that is containing either a VML element for IE or a 
	 * SVG element for other browsers.
	 * @since 1.0
	 */
	public Graphic(Component e) {
		super(e);
		init(this);
		e.addListener(Render.class, this);
		e.addListener(Style.class, this);
	}

	/**
	 * <p>Gets the graphic component currently wrapped by the wrapper widget.</p>
	 * @return The graphic component currently wrapped by the wrapper widget.
	 * @since 1.0
	 */
	public final Component getGraphic() {
		return ini(this).var(GRAPHIC);
	}

	/**
	 * <p>Deletes the graphic component wrapped by the specified graphic widget.</p>
	 * @param g The current graphic widget.
	 * @since 1.0
	 */
	public static final void removeGraphic(Graphic g) {
		if (g.isRendered()) {
			Component ge = g.getGraphic();
			if (Js.be(ge)) {
				Component.detach(ge);
			}
		}
		ObjectLikes.delete(ini(g), GRAPHIC);
	}

	/**
	 * <p>Sets the graphic component of the specified graphic widget.</p>
	 * @param g The current graphic widget.
	 * @param ge The graphic component is to be wrapped by the specified graphic wrapper.
	 * @since 1.0
	 */
	public static final void setGraphic(Graphic g, Component ge) {
		removeGraphic(g);
		Component.appendChild(g.unwrap(), ge);
		ini(g).var(GRAPHIC, ge);
		init(g);
	}

	private static final void init(Graphic g) {
		if (g.isRendered()) {
			Component e = g.unwrap();
			Component ge = g.getGraphic();
			if (Js.not(ge)) {
				ge = graphic();
				ini(g).var(GRAPHIC, ge);
				Component.appendChild(e, ge);
			}
			int cl = (int)Component.contentLeft  (e);
			int ct = (int)Component.contentTop   (e);
			int cw = (int)Component.contentWidth (e);
			int ch = (int)Component.contentHeight(e);
			ObjectLike s = Component.style(ge);
			Styles.position(s, "absolute");
			Styles.left(s, Styles.px(cl));
			Styles.top (s, Styles.px(ct));
			if (Browser.isIE) {
				VML.coordSize(ge, cw, ch);
				Styles.width (s, Styles.px(cw));
				Styles.height(s, Styles.px(ch));
			} else {
				SVG.viewBox(ge, 0, 0, cw, ch);
				Component.setAttribute(ge, SVG.WIDTH , cw);
				Component.setAttribute(ge, SVG.HEIGHT, ch);
			}
		}
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method initializes the current graphic widget.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(Render evt) {
		init(this);
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method initializes the current graphic widget.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(Style evt) {
		init(this);
	}

	/**
	 * <p>Sets the size of the specified graphic widget, eliminating the browser 
	 * dependencies.</p>
	 * @param g The current graphic wrapper.
	 * @param w The X dimension of the graphic widget.
	 * @param h The Y dimension of the graphic widget.
	 * @since 1.0
	 */
	public static final void setSize(Graphic g, double w, double h) {
		ObjectLike s = new Initializer().var();
		Styles.position(s, "absolute");
		Styles.left(s, "100px");
		Styles.top(s, "100px");
		Styles.width (s, Styles.px(w));
		Styles.height(s, Styles.px(h));
		Component.applyStyle(g.unwrap(), s);
	}

	/**
	 * <p>Appends a graphic component to the underlying graphic element of the specified 
	 * graphic widget, eliminating the browser dependencies.</p>
	 * @param g The current graphic wrapper.
	 * @param ge The graphic component to be appended which is either a VML component 
	 * for IE or a SVG component for other browsers.
	 * @since 1.0
	 */
	public static final void add(Graphic g, Component ge) {
		if (Browser.isIE) {
			Component e = g.unwrap();
			ObjectLike s = Component.style(ge);
			Styles.position(s, "absolute");
			if (!VML.isStyled(ge)) {
				int cl = (int)Component.contentLeft(e);
				int ct = (int)Component.contentTop (e);
				Styles.left(s, Js.toString(cl));
				Styles.top (s, Js.toString(ct));
			}
			VML.appendChild(g.getGraphic(), ge);
		} else {
			Component.appendChild(g.getGraphic(), ge);
		}
	}

	/**
	 * <p>Creates and returns a root graphic component, eliminating the browser dependencies.</p>
	 * @return The newly created root graphic component which is either a VML group 
	 * component for IE or a SVG component wrapping an HTML <tt>&lt;svg:svg&gt;</tt> 
	 * element for other browsers.
	 * @since 1.0
	 * @see SVG#svg()
	 * @see VML#group()
	 */
	public static final Component graphic() {
		return Browser.isIE ? VML.group() : SVG.svg();
	}

	/**
	 * <p>Defines the outline data of a path component, eliminating the browser dependencies.</p>
	 * @param v A path component which is either a VML shape component for IE or a SVG 
	 * path component for other browsers.
	 * @param commands An array of path commands.
	 * @since 1.0
	 * @see #path()
	 * @see SVG#path(Component, ArrayLike)
	 * @see VML#path(Component, ArrayLike)
	 */
	public static final void path(Component v, ArrayLike<String> commands) {
		if (Browser.isIE) {
			VML.path(v, commands);
		} else {
			SVG.path(v, commands);
		}
	}

	/**
	 * <p>Creates a path component, eliminating the browser dependencies.</p>
	 * @param commands An array of path commands.
	 * @return The newly created path component which is either a VML shape component 
	 * for IE or a SVG path component for other browsers.
	 * @since 1.0
	 * @see SVG#path(ArrayLike)
	 * @see VML#path(ArrayLike)
	 */
	public static final Component path(ArrayLike<String> commands) {
		return Browser.isIE ? VML.path(commands) : SVG.path(commands);
	}

	/**
	 * <p>Creates a path component, eliminating the browser dependencies.</p>
	 * @return The newly created path component which is either a VML shape component 
	 * for IE or a SVG path component for other browsers.
	 * @since 1.0
	 * @see SVG#path()
	 * @see VML#shape()
	 */
	public static final Component path() {
		return Browser.isIE ? VML.shape() : SVG.path();
	}

	/**
	 * <p>Creates an absolute move-to path command, eliminating the browser dependencies.</p>
	 * @param x The X coordinate of the point to move to.
	 * @param y The Y coordinate of the point to move to.
	 * @return A string value of the newly created path command.
	 * @since 1.0
	 * @see SVG#moveTo(double, double)
	 * @see VML#moveTo(int, int)
	 */
	public static final String moveTo(Number x, Number y) {
		return Browser.isIE ? VML.moveTo(x.intValue(), y.intValue()) : SVG.moveTo(x.doubleValue(), y.doubleValue());
	}

	/**
	 * <p>Creates an absolute line-to path command, eliminating the browser dependencies.</p>
	 * @param x The X coordinate of the point to line to.
	 * @param y The Y coordinate of the point to line to.
	 * @return A string value of the newly created path command.
	 * @since 1.0
	 * @see SVG#lineTo(double, double)
	 * @see VML#lineTo(int, int)
	 */
	public static final String lineTo(Number x, Number y) {
		return Browser.isIE ? VML.lineTo(x.intValue(), y.intValue()) : SVG.lineTo(x.doubleValue(), y.doubleValue());
	}

	/**
	 * <p>Creates an relative move-to path command, eliminating the browser dependencies.</p>
	 * @param x The relative X coordinate of the point to move to.
	 * @param y The relative Y coordinate of the point to move to.
	 * @return A string value of the newly created path command.
	 * @since 1.0
	 * @see SVG#moveto(double, double)
	 * @see VML#moveto(int, int)
	 */
	public static final String moveto(Number x, Number y) {
		return Browser.isIE ? VML.moveTo(x.intValue(), y.intValue()) : SVG.moveTo(x.doubleValue(), y.doubleValue());
	}

	/**
	 * <p>Creates an relative line-to path command, eliminating the browser dependencies.</p>
	 * @param x The relative X coordinate of the point to line to.
	 * @param y The relative Y coordinate of the point to line to.
	 * @return A string value of the newly created path command.
	 * @since 1.0
	 * @see SVG#lineto(double, double)
	 * @see VML#lineto(int, int)
	 */
	public static final String lineto(Number x, Number y) {
		return Browser.isIE ? VML.lineTo(x.intValue(), y.intValue()) : SVG.lineTo(x.doubleValue(), y.doubleValue());
	}

	/**
	 * <p>Creates a close-path command, eliminating the browser dependencies.</p>
	 * @return A string value of the newly created path command.
	 * @since 1.0
	 * @see SVG#closePath()
	 * @see VML#close()
	 */
	public static final String close() {
		return Browser.isIE ? VML.close() : SVG.closePath();
	}

	/**
	 * <p>Fills a specified graphic component with a CSS color, eliminating the browser dependencies.</p>
	 * @param v A graphic component which is either a VML component for IE or a SVG 
	 * component for other browsers.
	 * @param color A string of CSS color value.
	 * @since 1.0
	 * @see SVG#fill(Component, String)
	 * @see VML#fillColor(Component, String)
	 */
	public static final void fill(Component v, String color) {
		if (Browser.isIE) {
			VML.fillColor(v, color);
		} else {
			SVG.fill(v, color);
		}
	}

	/**
	 * <p>Defines stroke color of a specified graphic component, eliminating the browser dependencies.</p>
	 * @param v A graphic component which is either a VML component for IE or a SVG 
	 * component for other browsers.
	 * @param color A string of CSS color value.
	 * @since 1.0
	 * @see SVG#stroke(Component, String)
	 * @see VML#strokeColor(Component, String)
	 */
	public static final void stroke(Component v, String color) {
		if (Browser.isIE) {
			VML.strokeColor(v, color);
		} else {
			SVG.stroke(v, color);
		}
	}

	/**
	 * <p>Defines stroke width of a specified graphic component, eliminating the browser dependencies.</p>
	 * @param v A graphic component which is either a VML component for IE or a SVG 
	 * component for other browsers.
	 * @param w A number or string value of stroke width.
	 * @since 1.0
	 * @see SVG#strokeWidth(Component, Object)
	 * @see VML#strokeWeight(Component, Object)
	 */
	public static final void strokeWidth(Component v, Object w) {
		if (Browser.isIE) {
			VML.strokeWeight(v, w);
		} else {
			SVG.strokeWidth(v, w);
		}
	}

	/**
	 * <p>Creates graphic rectangle component, eliminating the browser dependencies.</p>
	 * @return The newly created rectangle component which is either a VML rounded 
	 * rectangle component for IE or a SVG rectangle component for other browsers.
	 * @since 1.0
	 * @see SVG#rect()
	 * @see VML#roundrect()
	 * @see #rectFrom(Component, double, double)
	 * @see #rectSize(Component, double, double)
	 * @see #rectRound(Component, double)
	 */
	public static final Component rect() {
		return Browser.isIE ? VML.roundrect() : SVG.rect();
	}

	/**
	 * <p>Defines the base point of a rectangle component, eliminating the browser dependencies.</p>
	 * @param v The current rectangle component which is either a VML rounded rectangle 
	 * component for IE or a SVG rectangle component for other browsers.
	 * @param x The X coordinate of the base point.
	 * @param y The Y coordinate of the base point.
	 * @since 1.0
	 * @see SVG#rectFrom(Component, double, double)
	 * @see VML#roundrect()
	 * @see #rect()
	 * @see #rectSize(Component, double, double)
	 * @see #rectRound(Component, double)
	 */
	public static final void rectFrom(Component v, double x, double y) {
		if (Browser.isIE) {
			ObjectLike s = Component.style(v);
			Styles.left(s, Js.toString(x));
			Styles.top (s, Js.toString(y));
		} else {
			SVG.rectFrom(v, x, y);
		}
	}

	/**
	 * <p>Defines the size of a rectangle component, eliminating the browser dependencies.</p>
	 * @param v The current rectangle component which is either a VML rounded rectangle 
	 * component for IE or a SVG rectangle component for other browsers.
	 * @param w The X dimension.
	 * @param h The Y dimension.
	 * @since 1.0
	 * @see SVG#rectSize(Component, double, double)
	 * @see VML#roundrect()
	 * @see #rect()
	 * @see #rectFrom(Component, double, double)
	 * @see #rectRound(Component, double)
	 */
	public static final void rectSize(Component v, double w, double h) {
		if (Browser.isIE) {
			ObjectLike s = Component.style(v);
			Styles.width (s, Js.toString(w));
			Styles.height(s, Js.toString(h));
		} else {
			SVG.rectSize(v, w, h);
		}
	}

	/**
	 * <p>Rounds off the corners of a rectangle component, eliminating the browser dependencies.</p>
	 * @param v The current rectangle component which is either a VML rounded rectangle 
	 * component for IE or a SVG rectangle component for other browsers.
	 * @param r The of the circle used to round off the corners of the rectangle.
	 * @since 1.0
	 * @see SVG#rectRound(Component, double, double)
	 * @see VML#roundrect(Component, double)
	 * @see #rect()
	 * @see #rectFrom(Component, double, double)
	 * @see #rectSize(Component, double, double)
	 */
	public static final void rectRound(Component v, double r) {
		if (Browser.isIE) {
			VML.roundrect(v, r);
		} else {
			SVG.rectRound(v, r, r);
		}
	}

	/**
	 * <p>Creates a rectangle component, eliminating the browser dependencies.</p>
	 * @param x The X coordinate of the base point.
	 * @param y The Y coordinate of the base point.
	 * @param w The X dimension.
	 * @param h The Y dimension.
	 * @return The newly created rectangle component which is either a VML rounded 
	 * rectangle component for IE or a SVG rectangle component for other browsers.
	 * @since 1.0
	 * @see SVG#rect(double, double, double, double)
	 * @see VML#roundrect()
	 * @see #rect()
	 * @see #rect(double, double, double, double, double)
	 */
	public static final Component rect(double x, double y, double w, double h) {
		Component v = rect();
		rectFrom(v, x, y);
		rectSize(v, w, h);
		return v;
	}

	/**
	 * <p>Creates a rectangle component, eliminating the browser dependencies.</p>
	 * @param x The X coordinate of the base point.
	 * @param y The Y coordinate of the base point.
	 * @param w The X dimension.
	 * @param h The Y dimension.
	 * @param r The of the circle used to round off the corners of the rectangle.
	 * @return The newly created rectangle component which is either a VML rounded 
	 * rectangle component for IE or a SVG rectangle component for other browsers.
	 * @since 1.0
	 * @see SVG#rect(double, double, double, double, double, double)
	 * @see VML#roundrect(double)
	 * @see #rect()
	 * @see #rect(double, double, double, double)
	 */
	public static final Component rect(double x, double y, double w, double h, double r) {
		Component v = rect(x, y, w, h);
		rectRound(v, r);
		return v;
	}

	/**
	 * <p>Creates a circle component, eliminating the browser dependencies.</p>
	 * @return The newly created circle component which is either a VML oval component 
	 * for IE or a SVG circle component for other browsers.
	 * @since 1.0
	 * @see SVG#circle()
	 * @see VML#oval()
	 * @see #circle(double, double, double)
	 */
	public static final Component circle() {
		return Browser.isIE ? VML.oval() : SVG.circle();
	}

	/**
	 * <p>Creates a circle component, eliminating the browser dependencies.</p>
	 * @param cx The X coordinate of the center of the circle.
	 * @param cy The Y coordinate of the center of the circle.
	 * @param r The radius of the circle.
	 * @return The newly created circle component which is either a VML oval component 
	 * for IE or a SVG circle component for other browsers.
	 * @since 1.0
	 * @see #circle()
	 */
	public static final Component circle(double cx, double cy, double r) {
		if (Browser.isIE) {
			Component v = VML.oval();
			ObjectLike s = Component.style(v);
			Styles.left  (s, Js.toString(cx - r));
			Styles.top   (s, Js.toString(cy - r));
			Styles.width (s, Js.toString(r * 2));
			Styles.height(s, Js.toString(r * 2));
			return v;
		} else {
			Component v = SVG.circle();
			SVG.circleRadius(v, r);
			return v;
		}
	}

	/**
	 * <p>Creates a circle component, eliminating the browser dependencies.</p>
	 * @param cx The X coordinate of the center of the ellipse.
	 * @param cy The Y coordinate of the center of the ellipse.
	 * @param rx The X-axis radius of the ellipse.
	 * @param ry The Y-axis radius of the ellipse.
	 * @return The newly created ellipse component which is either a VML oval component 
	 * for IE or a SVG ellipse component for other browsers.
	 * @since 1.0
	 * @see #circle()
	 */
	public static final Component ellipse(double cx, double cy, double rx, double ry) {
		if (Browser.isIE) {
			Component v = VML.oval();
			ObjectLike s = Component.style(v);
			Styles.left  (s, Js.toString(cx - rx));
			Styles.top   (s, Js.toString(cy - ry));
			Styles.width (s, Js.toString(rx * 2));
			Styles.height(s, Js.toString(ry * 2));
			return v;
		} else {
			Component v = SVG.ellipse();
			SVG.ellipseRadius(v, rx, ry);
			return v;
		}
	}

	/**
	 * <p>Creates a line component, eliminating the browser dependencies.</p>
	 * @return The newly created line component which is either a VML line component 
	 * for IE or a SVG line component for other browsers.
	 * @since 1.0
	 * @see #lineFrom(Component, Number, Number)
	 * @see #lineTo(Component, Number, Number)
	 * @see #line(Number, Number, Number, Number)
	 */
	public static final Component line() {
		return Browser.isIE ? VML.line() : SVG.line();
	}

	/**
	 * <p>Defines the starting point of a specified line component, eliminating the 
	 * browser dependencies.</p>
	 * @param v The current rectangle component which is either a VML line component 
	 * for IE or a SVG line component for other browsers.
	 * @param x The X coordinate of the start point of the line.
	 * @param y The Y coordinate of the start point of the line.
	 * @since 1.0
	 * @see #line()
	 * @see #lineTo(Component, Number, Number)
	 */
	public static final void lineFrom(Component v, Number x, Number y) {
		if (Browser.isIE) {
			VML.lineFrom(v, x.intValue(), y.intValue());
		} else {
			SVG.lineFrom(v, x.doubleValue(), y.doubleValue());
		}
	}

	/**
	 * <p>Defines the ending point of a specified line component, eliminating the 
	 * browser dependencies.</p>
	 * @param v The current rectangle component which is either a VML line component 
	 * for IE or a SVG line component for other browsers.
	 * @param x The X coordinate of the end point of the line.
	 * @param y The Y coordinate of the end point of the line.
	 * @since 1.0
	 * @see #line()
	 * @see #lineFrom(Component, Number, Number)
	 */
	public static final void lineTo(Component v, Number x, Number y) {
		if (Browser.isIE) {
			VML.lineTo(v, x.intValue(), y.intValue());
		} else {
			SVG.lineTo(v, x.doubleValue(), y.doubleValue());
		}
	}

	/**
	 * <p>Creates a line component, eliminating the browser dependencies.</p>
	 * @param x1 The X coordinate of the start point of the line.
	 * @param y1 The Y coordinate of the start point of the line.
	 * @param x2 The X coordinate of the end point of the line.
	 * @param y2 The Y coordinate of the end point of the line.
	 * @return The newly created line component which is either a VML line component 
	 * for IE or a SVG line component for other browsers.
	 * @since 1.0
	 * @see #line()
	 */
	public static final Component line(Number x1, Number y1, Number x2, Number y2) {
		return Browser.isIE ? VML.line(x1.intValue   (), y1.intValue   (), x2.intValue   (), y2.intValue   ()) :
		                        SVG.line(x1.doubleValue(), y1.doubleValue(), x2.doubleValue(), y2.doubleValue());
	}

	/**
	 * <p>Draws a curve specified by a motion on a graphic widget.</p>
	 * @param g The current graphic wrapper.
	 * @param m The motion definition.
	 * @param n The number of steps used to draw the curve. The larger this number, the 
	 * more precise the curve but the more time it takes to draw the curve.
	 * @return The path component of the curve which is either a VML shape component 
	 * for IE or a SVG path component for other browsers.
	 * @since 1.0
	 */
	public static final Component curve(Graphic g, Motion m, int n) {
		Component v = g.unwrap();
		int w = (int)(Component.contentWidth (v));
		int h = (int)(Component.contentHeight(v) / 2);
		ArrayLike<String> c = new Vars<String>().add(Graphic.moveTo(0, h)).var();
		Uniform un = new Uniform();
		un.init(n);
		m.init(n);
		for (int i = 0; i < n; i++) {
			c.push(Graphic.lineTo((int)(w * un.get(i) * 0.75), (int)(h - h * m.get(i) * 0.75)));
		}
		Component path = Graphic.path(c);
		Graphic.add(g, path);
		return path;
	}
}
