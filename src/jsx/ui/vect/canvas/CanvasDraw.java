
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

package jsx.ui.vect.canvas;

import js.Id;
import js.Js;
import jsx.Configurable;
import jsx.core.ObjectLikes;
import jsx.ui.Component;
import jsx.ui.Widget;
import jsx.ui.dd.Mouse;
import jsx.ui.dd.event.DragMove;
import jsx.ui.dd.event.DragStart;
import jsx.ui.dd.event.DragStop;
import jsx.ui.dd.event.OnDragMove;
import jsx.ui.dd.event.OnDragStart;
import jsx.ui.dd.event.OnDragStop;
import jsx.ui.event.Position;
import jsx.ui.vect.Canvas;

/**
 * <p>An abstract base class for drawing tools that can interactively draw on a wrapped canvas.</p>
 * <p>A drawing tool of a subclass of this one wraps a {@link Canvas} component and 
 * draws a specific type of shapes in accordance with the {@link Mouse} handle to which 
 * it listens mouse events.</p>
 * <p>A {@link CanvasDraw} widget is {@link Configurable} and is also an event source 
 * which may fire high level events.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public abstract class CanvasDraw extends Widget implements OnDragStart, OnDragMove, OnDragStop
{
	/**
	 * <p>A global identifier for a configurable property of a {@link CanvasDraw} object.</p>
	 * <p>The identified configurable property of a {@link CanvasDraw} widget refers to 
	 * a {@link Canvas} widget that wraps the same component as the {@link CanvasDraw} 
	 * widget does.</p>
	 * @since 1.0
	 */
	protected final static Id<Canvas> CANVAS = new Id<Canvas>();
	/**
	 * <p>A global identifier for a configurable property of a {@link CanvasDraw} object.</p>
	 * <p>The identified configurable property of a {@link CanvasDraw} widget refers to 
	 * its {@link Mouse} handle to which the widget listens mouse events.</p>
	 * @since 1.0
	 */
	protected final static Id<Mouse> MOUSE = new Id<Mouse>();
	/**
	 * <p>A global identifier for a configurable property of a {@link CanvasDraw} object.</p>
	 * <p>The identified configurable property of a {@link CanvasDraw} widget refers to 
	 * a boolean value specifying whether the canvas drawing widget is in the drawing 
	 * mode.</p>
	 * @since 1.0
	 */
	protected final static Id<Boolean> START = new Id<Boolean>();
	/**
	 * <p>A global identifier for a configurable property of a {@link CanvasDraw} object.</p>
	 * <p>The identified configurable property of a {@link CanvasDraw} widget caches the 
	 * X coordinate of the left-corner of the canvas.</p>
	 * @since 1.0
	 */
	protected final static Id<Double> X = new Id<Double>();
	/**
	 * <p>A global identifier for a configurable property of a {@link CanvasDraw} object.</p>
	 * <p>The identified configurable property of a {@link CanvasDraw} widget caches the 
	 * Y coordinate of the left-corner of the canvas.</p>
	 * @since 1.0
	 */
	protected final static Id<Double> Y = new Id<Double>();
	/**
	 * <p>A global identifier for a configurable property of a {@link CanvasDraw} object.</p>
	 * <p>The identified configurable property of a {@link CanvasDraw} widget caches the 
	 * X dimension of the canvas.</p>
	 * @since 1.0
	 */
	protected final static Id<Double> W = new Id<Double>();
	/**
	 * <p>A global identifier for a configurable property of a {@link CanvasDraw} object.</p>
	 * <p>The identified configurable property of a {@link CanvasDraw} widget caches the 
	 * Y dimension of the canvas.</p>
	 * @since 1.0
	 */
	protected final static Id<Double> H = new Id<Double>();

	/**
	 * <p>A typical constructor that constructs a wrapper widget of this type and forces 
	 * constructors of subclasses to pass a {@link Canvas} widget.</p>
	 * <p>This constructor invokes the typical constructor of the superclass passing 
	 * the component wrapped by the specified {@link Canvas} widget that is set to the 
	 * configurable property {@link #CANVAS} of the widget to be constructed.</p>
	 * @param c A canvas widget.
	 * @since 1.0
	 */
	protected CanvasDraw(Canvas c) {
		super(c.unwrap());
		ini(this).var(CANVAS, c);
	}

	/**
	 * <p>Gets the canvas widget of this canvas drawing wrapper.</p>
	 * <p>This method simply returns the configurable property {@link #CANVAS} of this 
	 * wrapper widget.</p>
	 * @return The canvas widget of this canvas drawing tool.
	 * @since 1.0
	 */
	public final Canvas canvas() {
		return ini(this).var(CANVAS);
	}

	/**
	 * <p>Gets the mouse handle currently attached to this canvas drawing wrapper.</p>
	 * <p>This method simply returns the configurable property {@link #MOUSE} of this 
	 * wrapper widget.</p>
	 * @return The mouse widget attached to this canvas drawing tool.
	 * @since 1.0
	 */
	public final Mouse getMouse() {
		return ini(this).var(MOUSE);
	}

	/**
	 * <p>Attaches a specified mouse handle to the canvas drawing widget.</p>
	 * <p>This method detaches the old mouse handle if there is one and attaches the 
	 * specified one to the current drawing widget enabling it to listen the necessary 
	 * types of mouse events from the mouse handle. Call this method from event listeners 
	 * with caution.</p>
	 * @param h The new mouse widget to be attached to the canvas drawing tool.
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
	 * <p>Detaches the current mouse handle from the canvas drawing widget.</p>
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
	 * <p>Limits a numerical value in a range exclusive.</p>
	 * <p>A subclass may also call this method to meet its particular needs.</p>
	 * @param x A value to be limited.
	 * @param min The start value of a range.
	 * @param max The end value of the range.
	 * @return The value limited with the specified range.
	 * @since 1.0
	 */
	protected static final double limit(double x, double min, double max) {
		return x < min ? min : x > max ? max : x;
	}

	/**
	 * <p>Limits an X coordinate in a {@link Canvas} widget with a padding.</p>
	 * <p>A subclass may also call this method to meet its particular needs.</p>
	 * @param c A canvas widget limiting coordinates.
	 * @param w A padding the specified canvas has to leave when it limits coordinates.
	 * @param x An X coordinate to be limited.
	 * @return The X coordinate limited with the specified canvas and padding.
	 * @since 1.0
	 */
	protected static final double x(Canvas c, double w, double x) {
		return limit(x, w, Canvas.width(c) - w);
	}

	/**
	 * <p>Limits an YX coordinate in a {@link Canvas} widget with a padding.</p>
	 * <p>A subclass may also call this method to meet its particular needs.</p>
	 * @param c A canvas widget limiting coordinates.
	 * @param w A padding the specified canvas has to leave when it limits coordinates.
	 * @param y A Y coordinate to be limited.
	 * @return The Y coordinate limited with the specified canvas and padding.
	 * @since 1.0
	 */
	protected static final double y(Canvas c, double w, double y) {
		return limit(y, w, Canvas.height(c) - w);
	}

	/**
	 * <p>Moves the current position of a canvas.</p>
	 * <p>This method moves the current position of a specified {@link Canvas} widget 
	 * in accordance with the specified mouse {@link Position} data and the position data 
	 * cached by the specified canvas drawing tool.</p>
	 * <p>A subclass may also call this method to meet its particular needs.</p>
	 * @param d A canvas drawing wrapper.
	 * @param c The canvas widget wrapped by the specified canvas drawing tool.
	 * @param evt A mouse position event.
	 * @since 1.0
	 */
	protected static final void moveTo(CanvasDraw d, Canvas c, Position<?> evt) {
		double w = Canvas.lineWidth(c);
		Canvas.moveTo(
				c,
				x(c, w, ini(evt).var(Position.X).doubleValue() - ini(d).var(X)),
				y(c, w, ini(evt).var(Position.Y).doubleValue() - ini(d).var(Y))
		);
	}

	/**
	 * <p>Draws a line from the current position of a canvas.</p>
	 * <p>This method draws a line from the current position of a specified {@link Canvas} 
	 * widget to a new position computed with the specified mouse {@link Position} data 
	 * and the position data cached by the specified canvas drawing tool.</p>
	 * <p>A subclass may also call this method to meet its particular needs.</p>
	 * @param d A canvas drawing wrapper.
	 * @param c The canvas widget wrapped by the specified canvas drawing tool.
	 * @param evt A mouse position event.
	 * @since 1.0
	 */
	protected static final void lineTo(CanvasDraw d, Canvas c, Position<?> evt) {
		double w = Canvas.lineWidth(c);
		Canvas.lineTo(
				c,
				x(c, w, ini(evt).var(Position.X).doubleValue() - ini(d).var(X)),
				y(c, w, ini(evt).var(Position.Y).doubleValue() - ini(d).var(Y))
		);
		Canvas.stroke(c);
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method enters the drawing mode and initializes the canvas and the 
	 * internal caches.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(DragStart evt) {
		if (Js.not(ini(this).var(START))) {
			ini(this).var(START, true);
			Component e = unwrap();
			ini(this).var(X, e.pageLeft());
			ini(this).var(Y, e.pageTop ());
			Canvas c = canvas();
			Canvas.beginPath(c);
			moveTo(this, c, evt);
		}
	}
}
