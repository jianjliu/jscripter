
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
import jsx.ui.event.OnRender;
import jsx.ui.event.Render;

/**
 * <p>A base class for control widgets.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Control extends Widget implements OnRender
{
	/**
	 * <p>Constructs a control widget.</p>
	 * @param html The HTML of the control widget.
	 * @since 1.0
	 */
	public Control(String html) {
		this(new Component(html));
	}

	private final static Id<Control> CONTROL = new Id<Control>();

	/**
	 * <p>Gets the {@link Control} widget associated with a component.</p>
	 * <p>If the specified component does not have an associated {@link Control} widget,
	 * this method will creates one based on that component and associate them.</p>
	 * @param e A component that may have a {@link Control} widget based on it.
	 * @return The {@link Control} widget associated with <tt>e</tt>.
	 * @since 1.0
	 */
	public static Control get(Component e) {
		Control c = ini(e).var(CONTROL);
		return Js.be(c) ? c : new Control(e);
	}

	/**
	 * <p>Constructs a control widget.</p>
	 * @param e The underlying component for the widget.
	 * @since 1.0
	 */
	protected Control(Component e) {
		super(e);
		addClasses();
		if (Js.not(ini(e).var(CONTROL))) {
			ini(e).var(CONTROL, this);
			Component.addClass(e, ROUND_CORNER_ALL);
		}
		addClasses();
		if (Js.be(Component.getRendered(e, this))) {
			init();
		}
	}

	/**
	 * <p>Helps subclasses to cache the controls of a super type.</p>
	 * @param t A control of a subclass.
	 * @param s A control of a superclass.
	 * @param id An {@link Id} for <tt>t</tt> to cache <tt>s</tt>.
	 * @since 1.0
	 */
	protected static final <S extends Control, T extends S> void sub(S s, T t, Id<T> id) {
		if (Js.not(ini(s).var(id))) {
			ini(s).var(id, t);
		}
	}

	/**
	 * <p>Performs an action on the rendering event.</p>
	 * <p>This method creates {@link jsx.ui.css.Pseudo} widgets to associate the browser "focus" 
	 * and "blur" events to the "focus" and "blur" pseudo selectors respectively over the 
	 * underlying HTML element.</p>
	 * @since 1.0
	 */
	protected void init() {
		Component c = unwrap();
		c.pseudo(FOCUS, "focus").attach(c, "focus", "blur");
		c.pseudo(HOVER, "hover").attach(c, "mouseover", "mouseout");
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method simply {@link #init()} this widget and then stops listening to {@link Render} events.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(Render evt) {
		init();
		unwrap().removeListener(Render.class, this);
	}
}
