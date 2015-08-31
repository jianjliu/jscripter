
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

package jsx.ui.ctrl;

import js.Id;
import js.Js;
import jsx.ui.Component;
import jsx.ui.Control;
import jsx.ui.event.Click;

/**
 * <p>A base class for clickable widgets.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Clickable extends Control
{
	/**
	 * <p>Typically constructs a clickable widget.</p>
	 * @param html The HTML text of the control widget.
	 * @since 1.0
	 */
	public Clickable(String html) {
		this(new Component(html));
	}

	private final static Id<Clickable> CLICKABLE = new Id<Clickable>();

	/**
	 * <p>Gets the {@link Clickable} widget associated with a component.</p>
	 * <p>If the specified component does not have an associated {@link Clickable} widget,
	 * this method will creates one based on that component and associate them.</p>
	 * @param e A component that may have a {@link Clickable} widget based on it.
	 * @return The {@link Clickable} widget associated with <tt>e</tt>.
	 * @since 1.0
	 */
	public static Clickable get(Component e) {
		Clickable c = ini(Control.get(e)).var(CLICKABLE);
		return Js.be(c) ? c : new Clickable(e);
	}

	/**
	 * <p>Constructs a clickable widget.</p>
	 * @param e The underlying component for the widget.
	 * @since 1.0
	 */
	protected Clickable(Component e) {
		super(e);
		sub(Control.get(e), this, CLICKABLE);
	}

	/**
	 * <p>Initializes the current widget for the newly rendered underlying HTML element.</p>
	 * <p>This method firstly invokes the overridden method of super class for the "focus" and "blur"
	 * to work and then makes the widget fires {@link Click} event from itself on a browser
	 * "click" event over the underlying HTML element.</p>
	 * @since 1.0
	 */
	@Override
	protected void init() {
		super.init();
		attachEvent("click", new Click(unwrap()), PREVENTCLICK);
	}
}
