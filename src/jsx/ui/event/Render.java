
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

package jsx.ui.event;

import jsx.ui.Component;
import jsx.ui.Widget;

/**
 * <p>A type of high level events that may be fired from a source widget when 
 * the component or the component wrapped by the widget has just been rendered.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Render extends Widget.Event<OnRender>
{
	/**
	 * <p>Constructs an event of this type.</p>
	 * <p>Note that, this constructor does not change the {@link jsx.Source.Event#BUBBLE} and 
	 * {@link jsx.Source.Event#UPDATE} configurable properties.</p>
	 * @param target The target component where the source widget has just 
	 * been rendered into.
	 * @since 1.0
	 */
	public Render(Component target) {
		super(target);
	}

	/**
	 * <p>Dispatches this event to the specified event listener to handle, by invoking the 
	 * handler method of the listener interface passing the event itself as the argument.</p>
	 * @param on The event listener that handles this event.
	 * @since 1.0
	 */
	@Override
	protected final void execute(OnRender on) {
		on.onEvent(this);
	}
}
