
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

import jsx.ui.Box;
import jsx.ui.Component;
import jsx.ui.Widget;

/**
 * <p>A class for HTML elementary division widgets.</p>
 * <p>Note that a {@link Div} widget is basically a {@link Box} and has some more features.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Div<T extends Widget> extends Box<T>
{
	/**
	 * <p>Constructs a division widget.</p>
	 * @since 1.0
	 */
	public Div() {
		super(Component.div());
	}

	/**
	 * <p>Removes the sub CSS selector "block" from the underlying component indicating 
	 * all its children will be displayed with "inline" style.</p>
	 * @since 1.0
	 */
	public final void inline() {
		Component.removeClasses(unwrap(), subs("block"));
	}

	/**
	 * <p>Appends the sub CSS selector "block" to the underlying component indicating 
	 * all its children will be displayed with "block" style.</p>
	 * @since 1.0
	 */
	public final void block() {
		Component.addClasses(unwrap(), subs("block"));
	}
}
