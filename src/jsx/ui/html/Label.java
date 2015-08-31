
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

import jsx.dom.Markups;
import jsx.ui.Component;
import jsx.ui.Control;

/**
 * <p>A base class for HTML elementary label widgets.</p>
 * <p>Note that a label widget is a {@link Control} and must be associated with
 * a {@link Choice} widget.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Label extends Control
{
	/**
	 * <p>Constructs a label to a choice.</p>
	 * @param choice A choice widget to have the label being constructed.
	 * @param label The HTML text for the label.
	 * @since 1.0
	 */
	public Label(Choice choice, String label) {
		super(Markups.LABEL);
		Component.appendChild(unwrap(), choice.unwrap());
		Component.appendChild(unwrap(), new Component(Markups.span(label)));
	}
}
