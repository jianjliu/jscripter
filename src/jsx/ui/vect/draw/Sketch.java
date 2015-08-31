
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
import js.ObjectLike;
import jsx.Configurable;
import jsx.core.ObjectLikes;
import jsx.ui.dd.Mouse;
import jsx.ui.dd.event.DragMove;
import jsx.ui.dd.event.DragStop;

/**
 * <p>Defines a drawing wrapper that sketches interactively.</p>
 * <p>A drawing tool of this class wraps either a VML component for IE or a SVG component 
 * for other browsers and sketches in accordance with the {@link Mouse} handle to which it 
 * listens mouse events.</p>
 * <p>A {@link Sketch} widget is {@link Configurable} and is also an event source which 
 * may fire high level events.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Sketch extends Draw
{
	private final static Id<DragMove> LAST = new Id<DragMove>();

	/**
	 * <p>The default constructor that constructs a wrapper widget of this type.</p>
	 * <p>This constructor invokes the default constructor of the superclass to create 
	 * a default underlying graphic component.</p>
	 * @since 1.0
	 */
	public Sketch() {}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method sketches to the argument mouse position if the current drawing 
	 * widget is in a drawing mode.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(DragMove evt) {
		ObjectLike ini = ini(this);
		if (Js.be(ini.var(START))) {
			DragMove last = ini.var(LAST);
			if (Js.be(last)) {
				line(this, last, evt);
			} else {
				line(this, ini.var(START), evt);
			}
			ini.var(LAST, evt);
		}
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method sketches to the argument mouse position if the current drawing 
	 * widget is in a drawing mode and then exits the drawing mode.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(DragStop evt) {
		ObjectLike ini = ini(this);
		if (Js.be(ini.var(START))) {
			DragMove last = ini.var(LAST);
			if (Js.be(last)) {
				line(this, last, evt);
			} else {
				line(this, ini.var(START), evt);
			}
			ObjectLikes.delete(ini, START);
			ObjectLikes.delete(ini, LAST);
		}
	}
}
