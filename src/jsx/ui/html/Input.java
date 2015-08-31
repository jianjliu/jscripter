
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

import jsx.ui.ctrl.Clickable;

/**
 * <p>An abstract base class for HTML elementary input widgets.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public abstract class Input extends Clickable
{
	/**
	 * <p>Typically constructs an input widget.</p>
	 * @param html The HTML text of the input widget.
	 * @since 1.0
	 */
	protected Input(String html) {
		super(html);
	}

	/**
	 * <p>Returns the HTML type for the input widget.</p>
	 * @return The type of the input widget.
	 * @since 1.0
	 */
	public abstract String type();
}
