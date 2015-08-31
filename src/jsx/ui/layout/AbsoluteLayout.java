
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
import js.Js;
import js.ObjectLike;
import jsx.core.ArrayLikes;
import jsx.ui.Component;
import jsx.ui.Container;
import jsx.ui.Widget;

/**
 * <p>Layouts children of a container in a flow.</p>
 * <p>Note, A {@link FlowLayout} layout is composed of {@link BarLayout} layouts 
 * although a {@link BarLayout} is also a {@link FlowLayout}.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class AbsoluteLayout extends Container.Layout
{
	/**
	 * <p>The default constructor that constructs a layout manager of this type.</p>
	 * <p>This constructor invokes the default constructor of the superclass.</p>
	 * @since 1.0
	 * @see #AbsoluteLayout(ObjectLike)
	 */
	public AbsoluteLayout() {
	}

	/**
	 * <p>A typical constructor that constructs a layout manager of this type and forces 
	 * constructors of subclasses to pass initializing data.</p>
	 * <p>This constructor invokes the typical constructor of the superclass passing 
	 * the specified initializing object as the argument.</p>
	 * @param ini The initializing object.
	 * @since 1.0
	 * @see #AbsoluteLayout()
	 */
	public AbsoluteLayout(ObjectLike ini) {
		super(ini);
	}

	/**
	 * <p>Lays out a container absolutely.</p>
	 * <p>This method lays out the children of a container in absolute positioning.</p>
	 * @param c The container to layout.
	 * @since 1.0
	 */
	@Override
	protected void doLayout(Container c) {
		layout(c);
	}

	/**
	 * <p>Lays out a container absolutely.</p>
	 * <p>This method lays out the children of a container in absolute positioning.</p>
	 * @param ct The container to layout.
	 * @since 1.0
	 */
	public static final void layout(Container ct) {
		ct.detach();
		Component c = ct.unwrap();
		ArrayLike<Widget> children = ini(ct).var(Container.CHILDREN);
		for (int i = 0, len = ArrayLikes.length(children); i < len; i++) {
			Widget w = children.get(i);
			if (Js.be(w)) {
				Component.absolute(w.unwrap());
				Component.appendChild(c, w.unwrap());
			}
		}
	}

	/**
	 * <p>Layouts a container when notified it has been resized.</p>
	 * <p>This method does nothing. A subclass should override this method to 
	 * perform an action if necessary.</p>
	 * @param c The container to layout on resizing.
	 * @since 1.0
	 */
	@Override
	protected void onResize(Container c) {
	}
}
