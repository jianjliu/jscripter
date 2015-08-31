
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

package jsx.ui.box;

import js.Id;
import js.Initializer;
import js.Js;
import js.ObjectLike;
import jsx.dom.Styles;
import jsx.ui.Box;
import jsx.ui.Component;
import jsx.ui.Widget;
import jsx.ui.dd.Draggable;
import jsx.ui.dd.Mouse;
import jsx.ui.dd.Resizer;
import jsx.ui.event.OnPopup;
import jsx.ui.event.Popup;
import jsx.ui.event.Render;

/**
 * <p>A base class for dialog widgets.</p>
 * <p>A dialog widget is a pop-up window which is movable and resizable.</p>
 * <p>A {@link Dialog} is a {@link Frame} that has a title {@link Box} and a content {@link Box}.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Dialog extends Frame implements OnPopup
{
	/**
	 * <p>Constructs an untitled dialog by default.</p>
	 * <p>This constructor invokes {@link #Dialog(Component)} with a new component created by calling
	 * {@link Component#untitled()} as argument.</p>
	 * @since 1.0
	 */
	public Dialog() {
		this(Component.untitled());
	}

	/**
	 * <p>Typically constructs a dialog with the specified HTML text as title.</p>
	 * <p>This constructor invokes {@link Dialog#Dialog(Component)} with the component created by calling
	 * {@link Component#title(String)} as argument.</p>
	 * @param title The title text for the dialog.
	 * @since 1.0
	 */
	public Dialog(String title) {
		this(Component.title(title));
	}

	/**
	 * <p>Typically constructs a dialog with a specified title component.</p>
	 * <p>This constructor invokes the default constructor of the superclass.</p>
	 * <p>It creates necessary {@link Mouse} and {@link Draggable} widgets with the underlying 
	 * component, adds {@link Resizer}s, and makes itself listen to event of {@link Popup} from itself.</p>
	 * @param title The title component for the dialog.
	 * @since 1.0
	 */
	protected Dialog(Component title) {
		Box<Widget> tb = getTitle();
		tb.add(title);
		Mouse m = Mouse.getMouse(tb.unwrap());
		Draggable d = new Draggable(unwrap());
		ini(d).var(Draggable.DELEGABLE, true);
		d.attach(m);
		Resizer.addResizers(unwrap(), Resizer.ALL);
		unwrap().addListener(Popup.class, this);
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method invokes the super handler for rendering, sets up mouse event handlers for the 
	 * underlying HTML element on the browser level and pops-up the newly rendered dialog window by
	 * executing a created {@link Popup} event from itself.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	@Override
	public void onEvent(Render evt) {
		super.onEvent(evt);
		attachEvent("mousedown", new Popup());
		exec(new Popup());
	}

	private final static Id<Integer> ZINDEX = new Id<Integer>();
	private static int zIndexTopMost = 999;

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method pops up the dialog window.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(Popup evt) {
		Component e = unwrap();
		if (Js.neq(ini(e).var(ZINDEX), zIndexTopMost)) {
			int zIndex = ++zIndexTopMost;
			ini(e).var(ZINDEX, zIndex);
			ObjectLike p = new Initializer().var();
			Styles.zIndex(p, Js.toString(zIndex));
			Component.applyStyle(e, p);
		}
	}
}
