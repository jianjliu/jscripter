
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
import js.Vars;
import jsx.ui.Component;
import jsx.ui.Container;
import jsx.ui.Widget;

/**
 * <p>Defines border layout managers.</p>
 * <p>A {@link BorderLayout} is composed of {@link BarLayout} layouts. It arranges and 
 * resizes the first two children to fit into the north and south borders of the 
 * container and then fits the third and fourth children to the west and east borders 
 * of the rest area. Finally it fits the fifth child to the rest area and ignores any 
 * other children the container may have. An undefined child is silently ignored and 
 * leaves that region for others to fill.</p>
 * <p>The widgets are laid out according to their preferred sizes and the constraints of 
 * the container's size. The north and south widgets may be stretched horizontally; the 
 * west and east widgets may be stretched vertically; the center widget may stretch both 
 * horizontally and vertically to fill any space left over.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class BorderLayout extends AbsoluteLayout
{
	/**
	 * <p>An integer constant that indicates an array index of the "north" widget in 
	 * the children list of the container a {@link BorderLayout} is laying out.</p>
	 * @since 1.0
	 */
	public final static int NORTH  = 0;
	/**
	 * <p>An integer constant that indicates an array index of the "south" widget in 
	 * the children list of the container a {@link BorderLayout} is laying out.</p>
	 * @since 1.0
	 */
	public final static int SOUTH  = 1;
	/**
	 * <p>An integer constant that indicates an array index of the "west" widget in 
	 * the children list of the container a {@link BorderLayout} is laying out.</p>
	 * @since 1.0
	 */
	public final static int WEST   = 2;
	/**
	 * <p>An integer constant that indicates an array index of the "east" widget in 
	 * the children list of the container a {@link BorderLayout} is laying out.</p>
	 * @since 1.0
	 */
	public final static int EAST   = 3;
	/**
	 * <p>An integer constant that indicates an array index of the "center" widget in 
	 * the children list of the container a {@link BorderLayout} is laying out.</p>
	 * @since 1.0
	 */
	public final static int CENTER = 4;

	/**
	 * <p>The default constructor that constructs a layout manager of this type.</p>
	 * <p>This constructor invokes the default constructor of the superclass.</p>
	 * @since 1.0
	 * @see #BorderLayout(ObjectLike)
	 */
	public BorderLayout() {}

	/**
	 * <p>A typical constructor that constructs a layout manager of this type and forces 
	 * constructors of subclasses to pass initializing data.</p>
	 * <p>This constructor invokes the typical constructor of the superclass passing 
	 * the specified initializing object as the argument.</p>
	 * @param ini The initializing object.
	 * @since 1.0
	 * @see #BorderLayout()
	 */
	public BorderLayout(ObjectLike ini) {
		super(ini);
	}

	/**
	 * <p>Layouts a container.</p>
	 * <p>This method is implemented with {@link BarLayout}. It fits the first five 
	 * children to the north, south, west and east regions around the border of the 
	 * container and then fits the fifth child to the rest area ignoring any other 
	 * children the container may have. A <tt>null</tt> child is silently ignored but 
	 * leaves that region for others to fill.</p>
	 * <p>It lays out the child widgets according to their preferred sizes and the 
	 * constraints of the size of the container. The north and south widgets may be 
	 * stretched horizontally while the west and east widgets may be stretched 
	 * vertically. The center widget may stretch both dimensions to fill any space 
	 * left over.</p>
	 * @param c The container to layout.
	 * @since 1.0
	 */
	@Override
	protected void doLayout(Container c) {
		c.detach();
		Container n = new Container(c.unwrap());
		ArrayLike<Widget> children = ini(c).var(Container.CHILDREN);
		n = addBorder(
				n,
				children.get(NORTH),
				new BarLayout(new Initializer().set(
						BarLayout.VERTICAL, true
				).set(
						BarLayout.ALIGN, true
				).set(
						BarLayout.FIT, true
				).var())
		);
		n = addBorder(
				n,
				children.get(SOUTH),
				new BarLayout(new Initializer().set(
						BarLayout.VERTICAL, true
				).set(
						BarLayout.ALIGN, true
				).set(
						BarLayout.FIT, true
				).set(
						BarLayout.ORIGIN, BarLayout.LEFTBOTTOM
				).var())
		);
		n = addBorder(
				n,
				children.get(WEST),
				new BarLayout(new Initializer().set(
						BarLayout.ALIGN, true
				).set(
						BarLayout.FIT, true
				).var())
		);
		n = addBorder(
				n,
				children.get(EAST),
				new BarLayout(new Initializer().set(
						BarLayout.ALIGN, true
				).set(
						BarLayout.FIT, true
				).set(
						BarLayout.ORIGIN, BarLayout.RIGHTTOP
				).var())
		);
		Widget w = children.get(CENTER);
		if (Js.be(w)) {
			n.setLayout(
					new BarLayout(new Initializer().set(
							BarLayout.ALIGN, true
					).set(
							BarLayout.FIT, true
					).var())
			);
			n.add(new Widget(w.unwrap()));
		}
	} 

	private static final Container addBorder(Container p, Widget w, Container.Layout u) {
		if (Js.be(w)) {
			p.setLayout(u);
			Container n = new Container();
			Component c = w.unwrap();
			p.add(new Vars<Widget>().add(new Widget(c)).add(n).var());
			return n;
		}
		return p;
	}
}
