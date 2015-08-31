
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

import js.Js;
import jsx.Configurable;
import jsx.core.ObjectLikes;
import jsx.ui.dd.Mouse;
import jsx.ui.dd.event.DragMove;
import jsx.ui.dd.event.DragStart;
import jsx.ui.dd.event.DragStop;
import jsx.ui.event.Position;
import jsx.ui.vect.Canvas;

/**
 * <p>Defines a drawing wrapper that interactively paints on the wrapped canvas.</p>
 * <p>A drawing tool of this class wraps a {@link Canvas} component and paints in 
 * accordance with the {@link Mouse} handle to which it listens mouse events.</p>
 * <p>A {@link CanvasSketch} widget is {@link Configurable} and is also an event source 
 * which may fire high level events.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class CanvasPaint extends CanvasDraw
{
	/**
	 * <p>A typical constructor that constructs a wrapper widget of this type and forces 
	 * constructors of subclasses to pass a {@link Canvas} widget.</p>
	 * <p>This constructor invokes the typical constructor of the superclass passing 
	 * the component wrapped by the specified {@link Canvas} widget that is set to the 
	 * configurable property {@link CanvasDraw#CANVAS} of the widget to be constructed.</p>
	 * @param c A canvas widget.
	 * @since 1.0
	 */
	public CanvasPaint(Canvas c) {
		super(c);
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method invokes the overridden method of the superclass to initialize the 
	 * drawing tool.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	@Override
	public void onEvent(DragStart evt) {
		super.onEvent(evt);
		Canvas c = canvas();
		Canvas.fillStyle(c, Canvas.strokeStyle(c));
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>If the current canvas drawing tool is in a drawing mode this method paints at 
	 * the position specified by the mouse move event.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(DragMove evt) {
		if (Js.be(ini(this).var(START))) {
			paint(this, evt);
		}
	}

	/**
	 * <p>Paints a specified canvas drawing wrapper at a specified mouse position.</p>
	 * <p>This method moves the current position of a specified {@link Canvas} widget 
	 * and paints there in accordance with the specified mouse {@link Position} data, 
	 * the position data cached by the specified canvas drawing tool and the specified 
	 * argument mouse position.</p>
	 * <p>A subclass may also call this method to meet its particular needs.</p>
	 * @param d A canvas drawing wrapper.
	 * @param evt A mouse position event.
	 * @since 1.0
	 */
	protected static final void paint(CanvasDraw d, Position<?> evt) {
		Canvas c = d.canvas();
		double w = Canvas.lineWidth(c);
		Canvas.fillRect(
				c,
				x(c, w, ini(evt).var(Position.X).doubleValue() - ini(d).var(X) - w / 2),
				y(c, w, ini(evt).var(Position.Y).doubleValue() - ini(d).var(Y) - w / 2),
				w,
				w
		);
		Canvas.closePath(c);
		Canvas.beginPath(c);
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>If the current canvas drawing tool is in a drawing mode this method paints at 
	 * the position specified by the mouse release event, closes the current drawing 
	 * path and exits the drawing mode.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(DragStop evt) {
		if (Js.be(ini(this).var(START))) {
			ObjectLikes.delete(ini(this), START);
			paint(this, evt);
			Canvas.closePath(canvas());
		}
	}
}
