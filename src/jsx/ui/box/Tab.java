
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

import js.Js;
import jsx.ui.Box;
import jsx.ui.Component;
import jsx.ui.ctrl.Checkable;

/**
 * <p>A base class for tab-panel widgets.</p>
 * <p>A {@link Tab} is a {@link Box} of a group of {@link Checkable}s.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Tab extends Box<Checkable>
{
	/**
	 * <p>Constructs a default tab-panel.</p>
	 * <p>This constructor invokes {@link #Tab(Component)} with a new component created by calling
	 * {@link Component#div()} as argument.</p>
	 * @since 1.0
	 */
	public Tab() {
		super(Component.div());
	}

	/**
	 * <p>Typically constructs a frame widget.</p>
	 * <p>This constructor simply invokes its super constructor with the given component as argument.</p>
	 * @param e The underlying component for the tab-panel.
	 * @since 1.0
	 */
	protected Tab(Component e) {
		super(e);
	}

	/**
	 * <p>Adds a checkable to this tab-panel.</p>
	 * <p>The {@link Checkable} is automatically grouped with other children after added.</p>
	 * <p>This method will force a layout for the current box if the children list has been changed.</p>
	 * @param c A {@link Checkable} to be added to the tab-panel.
	 * @return <tt>true</tt> if the specified @link Checkable} becomes a new child of the 
	 * tab-panel; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	@Override
	public boolean add(Checkable c) {
		boolean ret = super.add(c);
		if (ret) {
			Checkable c0 = children().get(0);
			if (Js.be(c0)) {
				c.group(c0);
			}
		}
		return ret;
	}

	/**
	 * <p>Inserts a given checkable to this tab-panel immediately before an existing child.</p>
	 * <p>The {@link Checkable} is automatically grouped with other children after added.</p>
	 * <p>This method will force a layout for the current box if the children list has been changed.</p>
	 * @param c A {@link Checkable} to be inserted to the tab-panel.
	 * @param r An existing {@link Checkable} for reference.
	 * @return <tt>true</tt> if it is successfully inserted; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	@Override
	public boolean insert(Checkable c, Checkable r) {
		boolean ret = super.insert(c, r);
		if (ret) {
			c.group(r);
		}
		return ret;
	}

	/**
	 * <p>Removes a checkable from the current tab-panel.</p>
	 * <p>The {@link Checkable} is automatically ungrouped from other children after removed.</p>
	 * <p>This method will force a layout for the current box if the children list has been changed.</p>
	 * @param c A {@link Checkable} to be removed from the tab-panel.
	 * @return <tt>true</tt> if the specified widget is successfully removed; <tt>false</tt>, 
	 * otherwise.
	 * @since 1.0
	 */
	@Override
	public boolean remove(Checkable c) {
		boolean removed = super.remove(c);
		if (removed) {
			c.ungroup();
		}
		return removed;
	}
}
