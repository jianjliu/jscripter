
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

package jsx.ui.layout;

import js.ArrayLike;
import js.Id;
import js.Initializer;
import js.Js;
import js.ObjectLike;
import js.user.JsHTMLElement;
import jsx.client.Browser;
import jsx.core.ArrayLikes;
import jsx.dom.Elements;
import jsx.dom.Styles;
import jsx.ui.Component;
import jsx.ui.Container;
import jsx.ui.Widget;
import jsx.ui.Container.Layout;
import jsx.ui.event.Style;

/**
 * <p>Lays out children of a container in a horizontal or vertical bar.</p>
 * <p>Note, A {@link BarLayout} is a {@link FlowLayout} although a {@link FlowLayout} 
 * is composed of {@link BarLayout} layouts.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class BarLayout extends FlowLayout
{
	/**
	 * <p>A global identifier for a configurable property of a {@link BarLayout} object.</p>
	 * <p>The identified configurable property of a {@link BarLayout} object refers to 
	 * a boolean value specifying whether the layout manager align the children of the 
	 * container for which it is doing layout.</p>
	 * @since 1.0
	 */
	public final static Id<Boolean> ALIGN = new Id<Boolean>();
	/**
	 * <p>A global identifier for a configurable property of a {@link BarLayout} object.</p>
	 * <p>The identified configurable property of a {@link BarLayout} object refers to 
	 * a boolean value specifying whether the layout manager fit the last children of the 
	 * container for which it is doing layout.</p>
	 * @since 1.0
	 */
	public final static Id<Boolean> FIT = new Id<Boolean>();

	/**
	 * <p>The default constructor that constructs a layout manager of this type.</p>
	 * <p>This constructor invokes the default constructor of the superclass.</p>
	 * @since 1.0
	 * @see #BarLayout(ObjectLike)
	 */
	public BarLayout() {}

	/**
	 * <p>A typical constructor that constructs a layout manager of this type and forces 
	 * constructors of subclasses to pass initializing data.</p>
	 * <p>This constructor invokes the typical constructor of the superclass passing 
	 * the specified initializing object as the argument.</p>
	 * @param ini The initializing object.
	 * @since 1.0
	 * @see #BarLayout()
	 */
	public BarLayout(ObjectLike ini) {
		super(ini);
	}

	/**
	 * <p>Layouts a container.</p>
	 * <p>This method layouts children of a container in a horizontal or vertical bar.</p>
	 * @param c The container to layout.
	 * @since 1.0
	 */
	@Override
	protected void doLayout(Container c) {
		layout(c);
		updateContentWidth (c);
		updateContentHeight(c);
		align(c, 0);
		fit(c);
		if (Js.be(ini(this).var(ALIGN))) {
			align(c, 2);
		} else {
			boolean v = Js.be(ini(this).var(VERTICAL));
			int r = ini(this).var(ORIGIN);
			r = Js.cond(v, r & RIGHTTOP, r & LEFTBOTTOM);
			if (Js.be(r)) {
				align(c, 1);
			}
		}
	}

	private static final double pad(boolean v, Component c) {
		return v ? Component.padding(c, Component.PADDINGTOP ) : 
		           Component.padding(c, Component.PADDINGLEFT);
	}

	private static final double margins(boolean v, Component c) {
		return v ? Component.margin(c, Component.MARGINTOP   ) +
			       Component.margin(c, Component.MARGINBOTTOM) :
		           Component.margin(c, Component.MARGINLEFT ) +
		           Component.margin(c, Component.MARGINRIGHT);
	}

	private static final double wi(Component c) {
		return Component.offsetWidth(c) + margins(false, c);
	}

	private static final double hi(Component c) {
		return Component.offsetHeight(c) + margins(true, c);
	}

	private static final void align(Container ct, int d) {
		Component c = ct.unwrap();
		Layout u = Container.getLayout(ct);
		boolean v = Js.be(ini(u).var(VERTICAL));
		int r = ini(u).var(ORIGIN);
		double x = Js.cond(v ^ Js.be(d), ini(ct).var(CONTENT_HEIGHT), ini(ct).var(CONTENT_WIDTH));
		if (Js.not(d)) {
			r = Js.cond(v, (r & LEFTBOTTOM) / LEFTBOTTOM, (r & RIGHTTOP) / RIGHTTOP);
			x = pad(v, c) + r * x;
		}
		ArrayLike<Widget> children = ini(ct).var(Container.CHILDREN);
		for (int i = 0, len = ArrayLikes.length(children); i < len; i++) {
			Component we = children.get(i).unwrap();
			if (Js.be(we)) {
				JsHTMLElement e = Component.getHTMLElement(we);
				switch (d) {
					case 0:
						double w = v ? hi(we) : wi(we);
						Elements.applyStyle(
								e,
								Js.apply(
										position(Js.not(v), pad(Js.not(v), c)),
										position(v, x - w * r)
								)
						);
						x += w * (1 - 2 * r);
						break;
					case 1:
						double h = v ? wi(we) : hi(we);
						Elements.applyStyle(
								e,
								position(Js.not(v), x - h)
						);	
						break;
					case 2:
						Elements.applyStyle(
								e,
								size(Js.not(v), we, x)
						);
						we.exec(new Style());
				}
			}
		}
	}

	private static final void fit(Container ct) {
		Layout u = Container.getLayout(ct);
		ArrayLike<Widget> children = ini(ct).var(Container.CHILDREN);
		int len = ArrayLikes.length(children);
		if (Js.be(ini(u).var(FIT)) && len > 0) {
			Component c = children.get(len - 1).unwrap();
			if (Js.be(c)) {
				boolean v = Js.be(ini(u).var(VERTICAL));
				int r = ini(u).var(ORIGIN);
				r = Js.cond(v, (r & LEFTBOTTOM) / LEFTBOTTOM, (r & RIGHTTOP) / RIGHTTOP);
				double cw = Js.cond(v, ini(ct).var(CONTENT_HEIGHT), ini(ct).var(CONTENT_WIDTH));
				double x = v ? Component.top (c) : Component.left(c);
				double w = v ? hi(c) : wi(c);
				w = r * (w + x) + (1 - r) * (cw - x);
				x = x * (1 - r) + r * pad(v, ct.unwrap());
				JsHTMLElement e = Component.getHTMLElement(c);
				Elements.applyStyle(
						e,
						position(v, x)
				);
				Elements.applyStyle(
						e,
						size(v, c, w)
				);
				c.exec(new Style());
			}
		}
	}

	private static final ObjectLike position(boolean v, double x) {
		String s = Styles.px(x);
		ObjectLike p = new Initializer().var();
		if (v) {
			Styles.top (p, s);
		} else {
			Styles.left(p, s);
		}
		return p;
	}

	private static final ObjectLike size(boolean v, Component c, double w) {
		w -= margins(v, c);
	    if (!Browser.isIE && (Component.div(c) || Component.span(c))) {
	    	w = v ? Component.contentHeight(c, w) :  Component.contentWidth(c, w);
	    }
		String s = Styles.px(w);
		ObjectLike p = new Initializer().var();
		if (v) {
			Styles.height(p, s);
		} else {
			Styles.width (p, s);
		}
		return p;
	}

	/**
	 * <p>Layouts a container when notified it has been resized.</p>
	 * <p>This method layouts children of a container in a horizontal or vertical bar.</p>
	 * @param c The container to layout on resizing.
	 * @since 1.0
	 */
	@Override
	protected void onResize(Container c) {
		Layout u = Container.getLayout(c);
		boolean align = Js.be(ini(u).var(ALIGN));
		boolean v = Js.be(ini(u).var(VERTICAL));
		int r = ini(u).var(ORIGIN);
		boolean vw = Js.be(Js.cond(v, r & LEFTBOTTOM, r & RIGHTTOP  ));
		boolean vh = Js.be(Js.cond(v, r & RIGHTTOP  , r & LEFTBOTTOM));
		boolean cw = updateContentWidth (c);
		boolean ch = updateContentHeight(c);
		boolean w = Js.cond(v, ch, cw);
		boolean h = Js.cond(v, cw, ch);
		if (w && vw) {
			align(c, 0);
		}
		if (h) {
			if (align) {
				align(c, 2);
			} else if (vh) {
				align(c, 1);
			}
		}
		if (w) {
			fit(c);
		}
	}
}
