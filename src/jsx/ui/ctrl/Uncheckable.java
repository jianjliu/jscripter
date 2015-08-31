
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
import jsx.dom.Markups;
import jsx.ui.Component;
import jsx.ui.event.Click;
import jsx.ui.event.Uncheck;

/**
 * <p>A base class for uncheckable widgets resembling HTML check-boxes.</p>
 * <p>An uncheckable widget is firstly a {@link Checkable} that fires and listens to high level events.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Uncheckable extends Checkable
{
	/**
	 * <p>Constructs an uncheckable widget.</p>
	 * <p>This constructor invokes the typical constructor {@link #Uncheckable(Component)}.</p>
	 * @param label The label of the uncheckable.
	 * @since 1.0
	 */
	public Uncheckable(String label) {
		this(new Component(Markups.span(label)));
	}

	/**
	 * <p>Typically constructs an uncheckable widget.</p>
	 * <p>This constructor invokes super constructor with the component as argument.</p>
	 * @param e The underlying component for the widget.
	 * @since 1.0
	 */
	protected Uncheckable(Component e) {
		super(e);
		sub(Checkable.get(e), this, UNCHECKABLE);
	}

	private final static Id<Uncheckable> UNCHECKABLE = new Id<Uncheckable>();

	/**
	 * <p>Gets the {@link Uncheckable} widget associated with a component.</p>
	 * <p>If the specified component does not have an associated {@link Uncheckable} widget,
	 * this method will creates one based on that component and associate them.</p>
	 * @param e A component that may have a {@link Uncheckable} widget based on it.
	 * @return The {@link Uncheckable} widget associated with <tt>e</tt>.
	 * @since 1.0
	 */
	public static Uncheckable get(Component e) {
		Uncheckable c = ini(Checkable.get(e)).var(UNCHECKABLE);
		return Js.be(c) ? c : new Uncheckable(e);
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method fires {@link Uncheck} event from itself if it is checked; Otherwise, it
	 * simply invokes the super listener with the dispatched event as argument.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	@Override
	public void onEvent(Click evt) {
		if (checked()) {
			exec(new Uncheck(unwrap()));
		} else {
			super.onEvent(evt);
		}
	}
}
