
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

package jsx.ui.layout;

import js.ArrayLike;
import js.Initializer;
import js.Js;
import js.ObjectLike;
import jsx.core.ArrayLikes;
import jsx.ui.Container;
import jsx.ui.Widget;

/**
 * <p>Fits the last child of a container.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class CardLayout extends AbsoluteLayout
{
	/**
	 * <p>The default constructor that constructs a layout manager of this type.</p>
	 * <p>This constructor invokes the default constructor of the superclass.</p>
	 * @since 1.0
	 * @see #CardLayout(ObjectLike)
	 */
	public CardLayout() {
	}

	/**
	 * <p>A typical constructor that constructs a layout manager of this type and forces 
	 * constructors of subclasses to pass initializing data.</p>
	 * <p>This constructor invokes the typical constructor of the superclass passing 
	 * the specified initializing object as the argument.</p>
	 * @param ini The initializing object.
	 * @since 1.0
	 * @see #CardLayout()
	 */
	public CardLayout(ObjectLike ini) {
		super(ini);
	}

	/**
	 * <p>Layouts a container.</p>
	 * <p>This method fits the last child of the container it is laying out 
	 * and ignores the rest of the children the container may have.</p>
	 * @param c The container to layout.
	 * @since 1.0
	 */
	@Override
	protected void doLayout(Container c) {
		c.detach();
		ArrayLike<Widget> children = ini(c).var(Container.CHILDREN);
		Container n = new Container(c.unwrap());
		Widget w = ArrayLikes.getLast(children);
		if (Js.be(w)) {
			n.setLayout(new BarLayout(new Initializer().set(
					BarLayout.ALIGN, true
			).set(
					BarLayout.FIT, true
			).var()));
			n.add(new Widget(w.unwrap()));
		}
	}
}
