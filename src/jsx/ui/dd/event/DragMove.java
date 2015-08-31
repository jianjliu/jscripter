
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

package jsx.ui.dd.event;

import jsx.ui.Component;
import jsx.ui.event.Position;

/**
 * <p>A type of high level events that may be fired from a source widget when 
 * the browser mouse dragging-move event occurs on the element wrapped by the widget.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class DragMove extends Position<OnDragMove>
{
	/**
	 * <p>Constructs an event of this type.</p>
	 * <p>This constructor invokes the constructor of the superclass, which asks for the 
	 * same number of arguments as this one, passing all the arguments.</p>
	 * <p>Note that, this constructor sets the configurable property {@link jsx.Source.Event#BUBBLE} 
	 * of this event object to <tt>true</tt> but does not change {@link jsx.Source.Event#UPDATE}.</p>
	 * @param target The component where the mouse moves. It may be different from 
	 * the source widget which is firing the event.
	 * @param x The X coordinate, in pixels,  of the mouse position.
	 * @param y The y coordinate, in pixels,  of the mouse position.
	 * @since 1.0
	 */
	public DragMove(Component target, Number x, Number y) {
		super(target, x, y);
		ini(this).var(UPDATE, true);
	}

	/**
	 * <p>Dispatches this event to the specified event listener to handle, by invoking the 
	 * handler method of the listener interface passing the event itself as the argument.</p>
	 * @param on The event listener that handles this event.
	 * @since 1.0
	 */
	@Override
	protected final void execute(OnDragMove on) {
		on.onEvent(this);
	}
}
