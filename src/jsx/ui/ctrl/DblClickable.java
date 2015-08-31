
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
import js.ObjectLike;
import jsx.Timeout;
import jsx.core.ObjectLikes;
import jsx.ui.Component;
import jsx.ui.event.DblClick;
import jsx.ui.event.MouseUp;
import jsx.ui.event.OnMouseUp;

/**
 * <p>A base class for double-clickable widgets.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class DblClickable extends Clickable implements OnMouseUp
{
	/**
	 * <p>Constructs a double-clickable widget.</p>
	 * @param html The HTML of the control widget.
	 * @since 1.0
	 */
	public DblClickable(String html) {
		this(new Component(html));
	}

	private final static Id<DblClickable> DBLCLICKABLE = new Id<DblClickable>();

	/**
	 * <p>Gets the {@link DblClickable} widget associated with a component.</p>
	 * <p>If the specified component does not have an associated {@link DblClickable} widget,
	 * this method will creates one based on that component and associate them.</p>
	 * @param e A component that may have a {@link DblClickable} widget based on it.
	 * @return The {@link DblClickable} widget associated with <tt>e</tt>.
	 * @since 1.0
	 */
	public static DblClickable get(Component e) {
		DblClickable d = ini(Clickable.get(e)).var(DBLCLICKABLE);
		return Js.be(d) ? d : new DblClickable(e);
	}

	/**
	 * <p>Typically Constructs a double-clickable widget.</p>
	 * <p>This constructor makes the widget listen to event {@link MouseUp} and sets up a {@link Timeout}
	 * timer to expire a double-click.</p>
	 * @param e The underlying component for the widget.
	 * @since 1.0
	 */
	protected DblClickable(Component e) {
		super(e);
		if (Js.not(ini(Clickable.get(e)).var(DBLCLICKABLE))) {
			ini(Clickable.get(e)).var(DBLCLICKABLE, this);
		}
		timer = new Timeout() {
			@Override
			public void run() {
				ObjectLikes.delete(ini(DblClickable.this), MOUSEUP);
			}
		};
		addListener(MouseUp.class, this);
	}

	private final Timeout timer;

	private final static Id<Boolean> MOUSEUP = new Id<Boolean>();

	/**
	 * <p>Performs an action on the rendering event.</p>
	 * <p>This method invokes the overridden method of super class and makes the widget 
	 * fires {@link MouseUp} event from itself on a browser "mouseup" event over the 
	 * underlying HTML element.</p>
	 * @since 1.0
	 */
	@Override
	protected void init() {
		super.init();
		attachEvent("mouseup", new MouseUp(unwrap()));
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method fires {@link DblClick} event from itself on double-clicks.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(MouseUp evt) {
		ObjectLike ini = ini(this);
		if (ini.var(MOUSEUP)) {
			timer.clear();
			ObjectLikes.delete(ini, MOUSEUP);
			exec(new DblClick(unwrap()));
		} else {
			ini.var(MOUSEUP, true);
			timer.set(1000);
		}
	}
}
