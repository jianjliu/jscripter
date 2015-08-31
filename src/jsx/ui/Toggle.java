
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

package jsx.ui;

import js.Id;
import js.Js;
import jsx.Configurable;
import jsx.ui.Component;
import jsx.ui.ctrl.Checkable;
import jsx.ui.event.Check;
import jsx.ui.event.OnCheck;
import jsx.ui.event.OnUncheck;
import jsx.ui.event.Uncheck;

/**
 * <p>A base class for toggle widgets.</p>
 * <p>A toggle widget is a {@link Widget} that toggles its display state by listening to a 
 * {@link Checkable} for {@link Check} and {@link Uncheck} events.</p>
 * <p>A {@link Toggle} widget is {@link Configurable} and is also an event source which 
 * fires {@link Widget.Event} events. It is meanwhile an event listener that handles 
 * events fired from its underlying component.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Toggle extends Widget implements OnCheck, OnUncheck
{
	private final static Id<Toggle> TOGGLE = new Id<Toggle>();

	/**
	 * <p>Gets the toggle widget from a component.</p>
	 * @param e A component to toggle.
	 * @return The toggle widget associate with the component.
	 * @since 1.0
	 */
	public static final Toggle get(Component e) {
		Toggle toggle = ini(e).var(TOGGLE);
		if (Js.not(toggle)) {
			toggle = new Toggle(e);
			ini(e).var(TOGGLE, toggle);
		}
		return toggle;
	}

	/**
	 * <p>Typically constructs a toggle widget.</p>
	 * <p>This constructor associates this widget with the component.</p>
	 * @param e A component to toggle.
	 * @since 1.0
	 */
	protected Toggle(Component e) {
		super(e);
		ini(e).var(TOGGLE, this);
	}

	/**
	 * <p>Listens to a checkable widget.</p>
	 * <p>This adds listeners to listen to the checkable widget for {@link Check} 
	 * and {@link Uncheck} events.</p>
	 * @param c A checkable widget.
	 * @since 1.0
	 */
	public void listen(Checkable c) {
		c.addListener(Check.class, this);
		c.addListener(Uncheck.class, this);
	}

	/**
	 * <p>Stops listening to a checkable widget.</p>
	 * <p>This removes listeners for listening to the checkable widget for {@link Check} 
	 * and {@link Uncheck} events.</p>
	 * @param c A checkable widget.
	 * @since 1.0
	 */
	public void unlisten(Checkable c) {
		c.removeListener(Check.class, this);
		c.removeListener(Uncheck.class, this);
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method sets up mouse event handlers for the underlying HTML element on the 
	 * browser level.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(Uncheck evt) {
		unwrap().pseudo(HIDE, "hide").getAdder().invoke();
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method sets up mouse event handlers for the underlying HTML element on the 
	 * browser level.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(Check evt) {
		unwrap().pseudo(HIDE, "hide").getRemover().invoke();
	}
}
