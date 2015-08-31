
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
import jsx.ui.dd.event.DragStop;
import jsx.ui.vect.Canvas;

/**
 * <p>Defines a drawing wrapper that interactively sketches on the wrapped canvas.</p>
 * <p>A drawing tool of this class wraps a {@link Canvas} component and sketches in 
 * accordance with the {@link Mouse} handle to which it listens mouse events.</p>
 * <p>A {@link CanvasSketch} widget is {@link Configurable} and is also an event source 
 * which may fire high level events.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class CanvasSketch extends CanvasDraw
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
	public CanvasSketch(Canvas c) {
		super(c);
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>If the current canvas drawing tool is in a drawing mode this method draws 
	 * a line on the draft canvas from the current position to the specified mouse move 
	 * event.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(DragMove evt) {
		if (Js.be(ini(this).var(START))) {
			lineTo(this, canvas(), evt);
		}
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>If the current canvas drawing tool is in a drawing mode this method draws 
	 * a line on the draft canvas from the current position to the specified mouse release 
	 * event, closes the current drawing path and exits the drawing mode.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(DragStop evt) {
		if (Js.be(ini(this).var(START))) {
			ObjectLikes.delete(ini(this), START);
			Canvas c = canvas();
			lineTo(this, c, evt);
			Canvas.closePath(c);
		}
	}
}
