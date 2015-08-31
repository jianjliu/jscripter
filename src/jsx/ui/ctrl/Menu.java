
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
import js.core.JsFunction;
import jsx.dom.Markups;
import jsx.ui.Component;
import jsx.ui.Control;
import jsx.ui.css.Pseudo;
import jsx.ui.html.Div;

/**
 * <p>A base class for menu widgets.</p>
 * <p>A menu widget is basically a menu-item that has a menu-list that may hold other controls.</p>
 * <p>A menu widget is firstly a {@link Clickable} that listens to high level events.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Menu extends Clickable
{
	/**
	 * <p>Constructs a menu widget.</p>
	 * <p>This constructor invokes the super constructor. It sets up the menu as just a menu-item 
	 * by expanding the CSS sub selector "item" to the underlying component.</p>
	 * @param title The title text for the menu.
	 * @since 1.0
	 */
	public Menu(String title) {
		super(Markups.span(title));
		Div<Component> d = new Div<Component>();
		d.block();
		ini(this).var(DIV, d);
		Component.addClass(unwrap(), NOSELECT);
		Component.addClasses(unwrap(), subs("item"));
	}

	private final static Id<Div<Component>> DIV = new Id<Div<Component>>();

	/**
	 * <p>Appends a control to this menu.</p>
	 * <p>This method makes the menu to have a menu-list by removing the CSS sub selector "item" 
	 * from the underlying component.</p>
	 * @param c A control widget to append.
	 * @return The menu widget itself.
	 * @since 1.0
	 */
	public Menu add(Control c) {
		ini(this).var(DIV).add(c.unwrap());
		Component.removeClasses(unwrap(), subs("item"));
		return this;
	}

	/**
	 * <p>Initializes the current widget for the newly rendered underlying HTML element.</p>
	 * <p>This method firstly invokes the overridden method of super class for it to behave like a
	 * clickable widget. It then renders the menu-list if existed and sets up necessary 
	 * {@link Pseudo} widgets for the menu behaviors.</p>
	 * @since 1.0
	 */
	@Override
	protected void init() {
		super.init();
		Component b = ini(this).var(DIV).unwrap();
		Pseudo hide = b.pseudo(HIDE, "hide");
		Component c = unwrap();
		Component.appendChild(c, b);
		hide.attach(c, "mouseout", "mouseover");
		JsFunction<?> hider = hide.getAdder();
		hider.invoke();
		b.handle("click", hider);
		c.handle("click", hider);
	}
}
