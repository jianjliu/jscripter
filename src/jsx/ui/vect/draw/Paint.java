
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

import js.Js;
import jsx.Configurable;
import jsx.core.ObjectLikes;
import jsx.ui.Component;
import jsx.ui.dd.Mouse;
import jsx.ui.dd.event.DragMove;
import jsx.ui.dd.event.DragStart;
import jsx.ui.dd.event.DragStop;
import jsx.ui.event.Position;
import jsx.ui.vect.Graphic;

/**
 * <p>Defines a drawing wrapper that paints interactively.</p>
 * <p>A drawing tool of this class wraps either a VML component for IE or a SVG component 
 * for other browsers and paints in accordance with the {@link Mouse} handle to which it 
 * listens mouse events.</p>
 * <p>A {@link Paint} widget is {@link Configurable} and is also an event source which 
 * may fire high level events.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Paint extends Draw
{
	/**
	 * <p>The default constructor that constructs a wrapper widget of this type.</p>
	 * <p>This constructor invokes the default constructor of the superclass to create 
	 * a default underlying graphic component.</p>
	 * @since 1.0
	 */
	public Paint() {}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method invokes the overridden method of the superclass to initialize the 
	 * drawing tool and paints at the argument mouse position with a call to the method 
	 * {@link #paint(Paint, Position)} if the current drawing widget is in a drawing mode.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	@Override
	public void onEvent(DragStart evt) {
		super.onEvent(evt);
		if (Js.be(ini(this).var(START))) {
			paint(this, evt);
		}
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method paints at the argument mouse position with a call to the method 
	 * {@link #paint(Paint, Position)} if the current drawing widget is in a drawing mode.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(DragMove evt) {
		if (Js.be(ini(this).var(START))) {
			paint(this, evt);
		}
	}

	/**
	 * <p>Paints a specified painting wrapper at a specified mouse position.</p>
	 * <p>A subclass may also call this method to meet its particular needs.</p>
	 * @param p A painting tool.
	 * @param evt A mouse position event.
	 * @since 1.0
	 */
	protected static final void paint(Paint p, Position<?> evt) {
		double x = ini(evt).var(Position.X).doubleValue() - ini(p).var(X);
		double y = ini(evt).var(Position.Y).doubleValue() - ini(p).var(Y);
		int r = 4;
		Component e = Graphic.rect(
				x - 2,
				y - 2,
				r,
				r
		);
		Graphic.fill(e, "red");
		Graphic.add(p, e);
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method paints at the argument mouse position with a call to the method 
	 * {@link #paint(Paint, Position)} if the current drawing widget is in a drawing 
	 * mode and exits the drawing mode.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(DragStop evt) {
		if (Js.be(ini(this).var(START))) {
			ObjectLikes.delete(ini(this), START);
			paint(this, evt);
		}
	}
}
