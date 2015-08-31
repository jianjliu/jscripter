
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

package jsx.ui.html;

import jsx.client.Browser;
import jsx.dom.Markups;
import jsx.ui.Component;
import jsx.ui.css.Pseudo;
import jsx.ui.ctrl.Clickable;

/**
 * <p>A base class for HTML elementary button widgets.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Button extends Clickable
{
	/**
	 * <p>Constructs a button widget with a value text and a title text.</p>
	 * @param value The value text for the button.
	 * @param title The title text for the button.
	 * @since 1.0
	 */
	public Button(String value, String title) {
		super(Markups.button(value, title));
	}

	/**
	 * <p>Constructs a button widget with a value text.</p>
	 * @param value The value text for the button.
	 * @since 1.0
	 */
	public Button(String value) {
		super(Markups.button(value));
	}

	/**
	 * <p>Initializes the current widget for the newly rendered underlying HTML element.</p>
	 * <p>This method firstly invokes the overridden method of super class for it to behave like a
	 * clickable widget. It then sets up necessary {@link Pseudo} widgets for "active" and
	 * "hover" behaviors for the button.</p>
	 * @since 1.0
	 */
	@Override
	protected void init() {
		super.init();
		Component e = unwrap();
		e.pseudo(ACTIVE, "active").attach(e, "mousedown", "mouseup");
		if (Browser.isIE) {
			e.handle("losecapture", e.pseudo(ACTIVE, "active").getRemover());
		}
	}
}
