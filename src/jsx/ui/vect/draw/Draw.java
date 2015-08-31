
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

package jsx.ui.vect.draw;

import js.Id;
import js.Js;
import jsx.Configurable;
import jsx.core.ObjectLikes;
import jsx.ui.Component;
import jsx.ui.dd.Mouse;
import jsx.ui.dd.event.DragMove;
import jsx.ui.dd.event.DragStart;
import jsx.ui.dd.event.DragStop;
import jsx.ui.dd.event.OnDragMove;
import jsx.ui.dd.event.OnDragStart;
import jsx.ui.dd.event.OnDragStop;
import jsx.ui.event.Position;
import jsx.ui.vect.Graphic;

/**
 * <p>An abstract base class for drawing tools that can interactively draw vector graphics.</p>
 * <p>A vector graphics drawing tool wraps either a VML component for IE or a SVG 
 * component for other browsers and draws a specific type of shapes in accordance with 
 * the {@link Mouse} handle to which it listens mouse events, eliminating the browser 
 * dependencies.</p>
 * <p>A {@link Draw} widget is {@link Configurable} and is also an event source which 
 * may fire high level events.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public abstract class Draw extends Graphic implements OnDragStart, OnDragMove, OnDragStop
{
	/**
	 * <p>A global identifier for a configurable property of a {@link Draw} object.</p>
	 * <p>The identified configurable property of a {@link Draw} widget refers to 
	 * its {@link Mouse} handle to which the widget listens mouse events.</p>
	 * @since 1.0
	 */
	protected final static Id<Mouse> MOUSE = new Id<Mouse>();
	/**
	 * <p>A global identifier for a configurable property of a {@link Draw} object.</p>
	 * <p>The identified configurable property of a {@link Draw} widget caches the 
	 * latest mouse press event that occurs on the canvas. This property also tells 
	 * whether the vector graphic widget is in a drawing mode.</p>
	 * @since 1.0
	 */
	protected final static Id<Position<?>> START = new Id<Position<?>>();
	/**
	 * <p>A global identifier for a configurable property of a {@link Draw} object.</p>
	 * <p>The identified configurable property of a {@link Draw} widget caches the 
	 * X coordinate of the left-corner of its underlying graphic component.</p>
	 * @since 1.0
	 */
	protected final static Id<Integer> X = new Id<Integer>();
	/**
	 * <p>A global identifier for a configurable property of a {@link Draw} object.</p>
	 * <p>The identified configurable property of a {@link Draw} widget caches the 
	 * Y coordinate of the left-corner of its underlying graphic component.</p>
	 * @since 1.0
	 */
	protected final static Id<Integer> Y = new Id<Integer>();

	/**
	 * <p>The default constructor that constructs a wrapper widget of this type.</p>
	 * <p>This constructor invokes the default constructor of the superclass to create 
	 * a default underlying graphic component.</p>
	 * @since 1.0
	 */
	protected Draw() {}

	/**
	 * <p>Gets the mouse handle currently attached to this vector drawing wrapper.</p>
	 * <p>This method simply returns the configurable property {@link #MOUSE} of this 
	 * wrapper widget.</p>
	 * @return The mouse widget attached to this vector drawing tool.
	 * @since 1.0
	 */
	public final Mouse getMouse() {
		return ini(this).var(MOUSE);
	}

	/**
	 * <p>Attaches a specified mouse handle to the vector drawing widget.</p>
	 * <p>This method detaches the old mouse handle if there is one and attaches the 
	 * specified one to the current drawing widget enabling it to listen the necessary 
	 * types of mouse events from the mouse handle. Call this method from event listeners 
	 * with caution.</p>
	 * @param h The new mouse widget to be attached to the vector drawing tool.
	 * @since 1.0
	 * @see #detach()
	 */
	public final void attach(Mouse h) {
		if (Js.be(getMouse())) {
			detach();
		}
		ini(this).var(MOUSE, h);
		h.addListener(DragStart.class, this);
		h.addListener(DragMove .class, this);
		h.addListener(DragStop .class, this);
	}

	/**
	 * <p>Detaches the current mouse handle from the vector drawing widget.</p>
	 * <p>This method removes the mouse handle currently attached to the drawing 
	 * widget and unregisters it as an event listener from the mouse widget with all 
	 * event types. Call the method from event listeners with caution.</p>
	 * @since 1.0
	 * @see #attach(Mouse)
	 */
	public final void detach() {
		Mouse h = getMouse();
		if (Js.be(h)) {
			h.removeListener(DragStart.class, this);
			h.removeListener(DragMove .class, this);
			h.removeListener(DragStop .class, this);
			ObjectLikes.delete(ini(this), MOUSE);
		}
	}

	/**
	 * <p>Draws a line with the two specified positions.</p>
	 * <p>This method draws a line from a position computed with the first specified 
	 * mouse {@link Position} data and the position data cached by the specified vector 
	 * drawing tool to that computed with the second argument position.</p>
	 * <p>A subclass may also call this method to meet its particular needs.</p>
	 * @param d A vector drawing wrapper.
	 * @param p1 A mouse position event.
	 * @param p2 A mouse position event.
	 * @since 1.0
	 */
	protected static final Component line(Draw d, Position<?> p1, Position<?> p2) {
		Component e = Graphic.line(
				ini(p1).var(Position.X).doubleValue() - ini(d).var(X),
				ini(p1).var(Position.Y).doubleValue() - ini(d).var(Y),
				ini(p2).var(Position.X).doubleValue() - ini(d).var(X),
				ini(p2).var(Position.Y).doubleValue() - ini(d).var(Y)
		);
		Graphic.stroke(e, "red");
		Graphic.strokeWidth(e, "3");
		Graphic.add(d, e);
		return e;
	}

	/**
	 * <p>Draws a line with the specified position.</p>
	 * <p>This method draws a line from the current position of a specified graphic 
	 * {@link Component} to a new position computed with the specified mouse 
	 * {@link Position} data and the position data cached by the specified vector 
	 * drawing tool.</p>
	 * <p>A subclass may also call this method to meet its particular needs.</p>
	 * @param d A vector drawing wrapper.
	 * @param v The graphic component wrapped by the specified vector drawing tool.
	 * @param p A mouse position event.
	 * @since 1.0
	 */
	protected static final void lineTo(Draw d, Component v, Position<?> p) {
		Graphic.lineTo(
				v,
				ini(p).var(Position.X).doubleValue() - ini(d).var(X),
				ini(p).var(Position.Y).doubleValue() - ini(d).var(Y)
		);
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method enters the drawing mode and initializes the vector drawing tool 
	 * and the internal caches.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(DragStart evt) {
		if (Js.not(ini(this).var(START))) {
			ini(this).var(START, evt);
			Component e = unwrap();
			ini(this).var(X, (int)e.pageLeft());
			ini(this).var(Y, (int)e.pageTop ());
		}
	}
}
