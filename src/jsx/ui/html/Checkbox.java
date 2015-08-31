
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

/**
 * <p>A base class for HTML elementary check-box widgets.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Checkbox extends Choice
{
	/**
	 * <p>Constructs a check-box widget without joining a group.</p>
	 * <p>A check-box constructed by this constructor behaves exactly same as
	 * the basic HTML check-box elements.</p>
	 * @since 1.0
	 */
	public Checkbox() {
		super(Markups.input("checkbox"));
	}

	/**
	 * <p>Constructs a check-box widget joining a group.</p>
	 * <p>A check-box constructed by this constructor behaves differently from the
	 * basic HTML check-box elements.</p>
	 * @param group A group to join.
	 * @since 1.0
	 */
	public Checkbox(Group group) {
		super(group, Markups.input("checkbox"));
	}

	/**
	 * <p>Returns the HTML type for the input widget.</p>
	 * <p>This method simply returns the text of "checkbox".</p>
	 * @return The type of the input widget.
	 * @since 1.0
	 */
	@Override
	public String type() {
		return "checkbox";
	}
}
