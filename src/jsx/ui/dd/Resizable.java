
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

package jsx.ui.dd;

import js.ArrayLike;
import js.Id;
import js.Initializer;
import js.Js;
import js.ObjectLike;
import js.Vars;
import jsx.Configurable;
import jsx.client.Browser;
import jsx.core.ObjectLikes;
import jsx.core.Variables;
import jsx.dom.Elements;
import jsx.dom.Styles;
import jsx.ui.Component;
import jsx.ui.Widget;
import jsx.ui.dd.event.DragMove;
import jsx.ui.dd.event.DragStart;
import jsx.ui.dd.event.DragStop;
import jsx.ui.dd.event.OnDragMove;
import jsx.ui.event.Position;
import jsx.ui.event.Style;
import jsx.ui.fx.event.Animation;

/**
 * <p>A base class for widgets that can be resized by touch handles.</p>
 * <p>A {@link Resizable} widget is a draggable wrapper that makes its underlying HTML 
 * element resizable in accordance with a {@link Mouse} wrapper widget to which it 
 * listens mouse events.</p>
 * <p>A {@link Resizable} widget is {@link Configurable} and is also an event source 
 * which fires {@link jsx.ui.Widget.Event} events.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Resizable extends Draggable implements OnDragMove
{
	private final static Id<Integer> DIR = new Id<Integer>();

	/**
	 * <p>This constant is a legal value for the second argument of the constructor 
	 * {@link #Resizable(Component, int)} and the method {@link Resizer#getResizer(Component, int)}}, 
	 * and the only argument of the method {@link Resizer#mask(int)} meaning the 
	 * resizer of the north border of a component.</p>
	 * @since 1.0
	 */
	public final static int N  = 0;
	/**
	 * <p>This constant is a legal value for the second argument of the constructor 
	 * {@link #Resizable(Component, int)} and the method {@link Resizer#getResizer(Component, int)}}, 
	 * and the only argument of the method {@link Resizer#mask(int)} meaning the 
	 * resizer of the south border of a component.</p>
	 * @since 1.0
	 */
	public final static int S  = 1;
	/**
	 * <p>This constant is a legal value for the second argument of the constructor 
	 * {@link #Resizable(Component, int)} and the method {@link Resizer#getResizer(Component, int)}}, 
	 * and the only argument of the method {@link Resizer#mask(int)} meaning the 
	 * resizer of the east border of a component.</p>
	 * @since 1.0
	 */
	public final static int E  = 2;
	/**
	 * <p>This constant is a legal value for the second argument of the constructor 
	 * {@link #Resizable(Component, int)} and the method {@link Resizer#getResizer(Component, int)}}, 
	 * and the only argument of the method {@link Resizer#mask(int)} meaning the 
	 * resizer of the west border of a component.</p>
	 * @since 1.0
	 */
	public final static int W  = 3;
	/**
	 * <p>This constant is a legal value for the second argument of the constructor 
	 * {@link #Resizable(Component, int)} and the method {@link Resizer#getResizer(Component, int)}}, 
	 * and the only argument of the method {@link Resizer#mask(int)} meaning the 
	 * resizer of the south-east corner of a component.</p>
	 * @since 1.0
	 */
	public final static int SE = 4;
	/**
	 * <p>This constant is a legal value for the second argument of the constructor 
	 * {@link #Resizable(Component, int)} and the method {@link Resizer#getResizer(Component, int)}}, 
	 * and the only argument of the method {@link Resizer#mask(int)} meaning the 
	 * resizer of the south-west corner of a component.</p>
	 * @since 1.0
	 */
	public final static int SW = 5;
	/**
	 * <p>This constant is a legal value for the second argument of the constructor 
	 * {@link #Resizable(Component, int)} and the method {@link Resizer#getResizer(Component, int)}}, 
	 * and the only argument of the method {@link Resizer#mask(int)} meaning the 
	 * resizer of the north-east corner of a component.</p>
	 * @since 1.0
	 */
	public final static int NE = 6;
	/**
	 * <p>This constant is a legal value for the second argument of the constructor 
	 * {@link #Resizable(Component, int)} and the method {@link Resizer#getResizer(Component, int)}}, 
	 * and the only argument of the method {@link Resizer#mask(int)} meaning the 
	 * resizer of the north-west corner of a component.</p>
	 * @since 1.0
	 */
	public final static int NW = 7;

	/**
	 * <p>A typical constructor that constructs a wrapper widget of this type and forces 
	 * constructors of subclasses to pass initializing data.</p>
	 * <p>This constructor invokes the typical constructor of the superclass passing 
	 * the specified initializing object as the argument. The typical constructor of the 
	 * superclass attaches the resizable widget being created to the mouse widget if 
	 * specified.</p>
	 * @param ini The initializing object.
	 * @since 1.0
	 */
	protected Resizable(ObjectLike ini) {
		super(ini);
		Integer dir = ini(this).var(DIR);
		dir = Variables.undefined(dir) ? SE : dir & 7;
		ini(this).var(DIR, dir);
	}

	/**
	 * <p>Constructs a draggable widget that wraps a specified component and makes it 
	 * resizable in the specified direction by the configured touch handle to which 
	 * the newly constructed widget are listening mouse events.</p>
	 * <p>This constructor invokes the typical constructor of this class passing 
	 * an new initializing object as the argument and setting the configurable property 
	 * {@link Widget#COMPONENT} to the argument component, {@link #DIR} to the 
	 * specified resizing direction.</p>
	 * @param e The component to be wrapped by the wrapper widget being created.
	 * @param dir Specifies in which direction this resizable widget is allowed to 
	 * resize its underlying component. Possible values for this argument are:
	 * <ul>
	 * <li>{@link #N}: Only the north border is allowed to move for resizing.</li>
	 * <li>{@link #S}: Only the south border is allowed to move for resizing.</li>
	 * <li>{@link #E}: Only the east border is allowed to move for resizing.</li>
	 * <li>{@link #W}: Only the west border is allowed to move for resizing.</li>
	 * <li>{@link #SE}: Only the south-east corner is allowed to move for resizing.</li>
	 * <li>{@link #SW}: Only the south-west corner is allowed to move for resizing.</li>
	 * <li>{@link #NE}: Only the north-east corner is allowed to move for resizing.</li>
	 * <li>{@link #NW}: Only the north-west corner is allowed to move for resizing.</li>
	 * </ul>
	 * @since 1.0
	 */
	public Resizable(Component e, int dir) {
		this(new Initializer().set(COMPONENT, e).set(DIR, dir).var());
	}

	private final static Id<Double> WI = new Id<Double>();
	private final static Id<Double> HI = new Id<Double>();

	private static final void press(Widget w) {
		Component e = w.unwrap();
		ObjectLike ini = ini(e);
		if (Browser.isIE) {
			ini.var(WI, (double)Component.offsetWidth (e));
			ini.var(HI, (double)Component.offsetHeight(e));
		} else {
			ini.var(WI, Component.contentWidth (e));
			ini.var(HI, Component.contentHeight(e));
		}
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method calls the method {@link Draggable#press(Draggable, DragStart)} to 
	 * prepare for resizing and then enters the dragging mode if it is not started.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	@Override
	public void onEvent(DragStart evt) {
		ObjectLike ini = ini(this);
		if (Js.not(ini.var(START))) {
			press(this, evt);
			press(this);
			if (delegable(this)) {
				press(ini.var(GHOST));
			}
			ini.var(START, true);
		}
	}

	private final static ArrayLike<Integer> XCOEFFS = new Vars<Integer>()
		.add( 0).add( 0).add( 1).add(-1)
		.add( 1).add(-1).add( 1).add(-1).var();

	private final static ArrayLike<Integer> YCOEFFS = new Vars<Integer>()
		.add(-1).add( 1).add( 0).add( 0)
		.add( 1).add( 1).add(-1).add(-1).var();

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method resizes the resizable widget or its ghost component accordingly 
	 * and fires a default {@link Style} event from underlying component to notify 
	 * a necessary layout.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	@Override
	public void onEvent(DragMove evt) {
		ObjectLike ini = ini(this);
		if (Js.be(ini.var(START))) {
			Component e = delegable(this) ? ini.var(GHOST) : unwrap();
			Js.apply(
					Elements.style(Component.getHTMLElement(e)),
					resize(ini.var(DIR), e, evt)
			);
			e.exec(new Style());
		}
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method ends resizing if it is in a dragging mode and resizes the 
	 * underlying component by applying a style object created with the cached position 
	 * data and the return result of a call to the method {@link #resize(double, double, int)}. 
	 * It executes an {@link Animation} event, with the style object that has just been 
	 * created, or a default {@link Style} event from the underlying component when 
	 * execution of an animation event fails.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	@Override
	public void onEvent(DragStop evt) {
		ObjectLike ini = ini(this);
		if (Js.be(ini.var(START))) {
			ObjectLikes.delete(ini, START);
			Component e = unwrap();
			if (!Component.fixed(e)) {
				ObjectLike p = resize(ini.var(DIR), e, evt);
				int anim = 0;
				if (delegable(this)) {
					anim = e.exec(new Animation(p));
				}
				if (Js.not(anim)) {
					Js.apply(
							Elements.style(Component.getHTMLElement(e)),
							p
					);
					e.exec(new Style());
				}
			}
			if (delegable(this)) {
				Component.detach(ini.var(GHOST));
			}
		}
	}

	private static final ObjectLike resize(int dir, Component e, Position<?> evt) {
		ObjectLike ini = ini(e);
		double x = abs(ini(evt).var(Position.X));
		double y = abs(ini(evt).var(Position.Y));
		double dx = x - ini.var(Position.X).doubleValue();
		double dy = y - ini.var(Position.Y).doubleValue();
		int cx = XCOEFFS.get(dir);
		int cy = YCOEFFS.get(dir);
		double w = ini.var(WI) + cx * dx;
		double h = ini.var(HI) + cy * dy;
		ObjectLike p = new Initializer().var();
		if (true) {
			if (cx < 0 && cy < 0) {
				Js.apply(
						p,
						move(
								ini.var(X) + dx,
								ini.var(Y) + dy,
								0
						)
				);
			} else if (cx < 0) {
				Js.apply(
						p,
						move(
								ini.var(X) + dx,
								0,
								LIMIT_Y
						)
				);
			} else if (cy < 0) {
				Js.apply(
						p,
						move(
								0,
								ini.var(Y) + dy,
								LIMIT_X
						)
				);
			}
			if (Js.be(cx) && Js.be(cy)) {
				Js.apply(
						p,
						resize(w, h, 0)
				);
			} else if (Js.be(cx)) {
				Js.apply(
						p,
						resize(w, 0, LIMIT_Y)
				);
			} else if (Js.be(cy)) {
				Js.apply(
						p,
						resize(0, h, LIMIT_X)
				);
			}
		}
		return p;
	}

	/**
	 * <p>Creates and returns a style object of resizing data with the specified 
	 * dimensions and limitation.</p>
	 * <p>A subclass may also call this method to meet its particular needs.</p>
	 * @param w The X dimension.
	 * @param h The Y dimension.
	 * @param limit Limits a dimension in an axis direction. See {@link Draggable#LIMIT} 
	 * for possible values.
	 * @return The created style object.
	 * @since 1.0
	 */
	protected static final ObjectLike resize(double w, double h, int limit) {
		ObjectLike p = new Initializer().var();
		if (Js.not(limit & LIMIT_X)) {
			Styles.width (p, Styles.px(w));
		}
		if (Js.not(limit & LIMIT_Y)) {
			Styles.height(p, Styles.px(h));
		}
		return p;
	}
}
