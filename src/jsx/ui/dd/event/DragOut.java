
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
import jsx.ui.Widget;

/**
 * <p>A type of high level events that may be fired from a dragged widget when 
 * the mouse moves out a related component while dragging the source widget.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class DragOut extends Widget.Event<OnDragOut>
{
	/**
	 * <p>Constructs an event of this type.</p>
	 * <p>This constructor simply invokes the default constructor of the superclass and 
	 * sets its configurable property {@link jsx.ui.Widget.Event#TARGET} to the argument 
	 * component.</p>
	 * <p>Note that, this constructor does not change the configurable properties 
	 * {@link jsx.Source.Event#BUBBLE} and {@link jsx.Source.Event#UPDATE} of this event object.</p>
	 * @param target The component where the mouse has just moved out. It may be different 
	 * from the source width which is firing the event.
	 * @since 1.0
	 */
	public DragOut(Component target) {
		super(target);
	}

	/**
	 * <p>Dispatches this event to the specified event listener to handle, by invoking the 
	 * handler method of the listener interface passing the event itself as the argument.</p>
	 * @param on The event listener that handles this event.
	 * @since 1.0
	 */
	@Override
	protected final void execute(OnDragOut on) {
		on.onEvent(this);
	}
}
