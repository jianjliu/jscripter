
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
 * <p>A base class for HTML elementary radio widgets.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Radio extends Choice
{
	/**
	 * <p>Constructs a radio widget joining a group.</p>
	 * <p>A radio widget constructed by this constructor behaves exactly same as
	 * the basic HTML radio elements.</p>
	 * @param group A group to join.
	 * @since 1.0
	 */
	public Radio(Group group) {
		super(group, Markups.radio(group.getName()));
	}

	/**
	 * <p>Returns the HTML type for the input widget.</p>
	 * <p>This method simply returns the text of "radio".</p>
	 * @return The type of the input widget.
	 * @since 1.0
	 */
	@Override
	public String type() {
		return "radio";
	}

	/**
	 * <p>Synchronizes the state of the radio widget.</p>
	 * <p>This method invokes the overridden method of the super class. It may force
	 * the whole group to synchronize depending on the "checked" states.</p>
	 * @return <tt>true</tt> if the "checked" state of the underlying input element has been
	 * changed; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	@Override
	public boolean synchronize() {
		boolean changed = super.synchronize();
		if (changed) {
			ini(this).var(Radio.GROUP).synchronize();
		}
		return changed;
	}
}
