
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

import js.Id;
import js.ObjectLike;
import jsx.core.Variables;
import jsx.ui.Container;

/**
 * <p>Layouts children of a container in a flow.</p>
 * <p>Note, A {@link FlowLayout} layout is composed of {@link BarLayout} layouts 
 * although a {@link BarLayout} is also a {@link FlowLayout}.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class FlowLayout extends AbsoluteLayout
{
	/**
	 * <p>A global identifier for a configurable property of a {@link FlowLayout} object.</p>
	 * <p>The identified configurable property of a {@link FlowLayout} object refers to 
	 * a boolean value specifying whether the layout manager flows vertically the 
	 * children of the container for which it is doing layout.</p>
	 * @since 1.0
	 */
	public final static Id<Boolean> VERTICAL = new Id<Boolean>();
	/**
	 * <p>A global identifier for a configurable property of a {@link FlowLayout} object.</p>
	 * <p>The identified configurable property of a {@link FlowLayout} object refers to 
	 * an integer number specifying where the layout manager starts to arrange the 
	 * children of the container for which it is doing layout. Possible values are:
	 * <ul>
	 * <li>{@link #LEFTTOP}: Starts from top for a vertical flow and from left for a 
	 * horizontal flow. Aligns the children to left for a vertical flow and to top for 
	 * a horizontal flow. This is the default value.</li>
	 * <li>{@link #RIGHTTOP}: Starts from top for a vertical flow and from right for a 
	 * horizontal flow. Aligns the children to right for a vertical flow and to top for 
	 * a horizontal flow.</li>
	 * <li>{@link #LEFTBOTTOM}: Starts from bottom for a vertical flow and from left for a 
	 * horizontal flow. Aligns the children to left for a vertical flow and to bottom for 
	 * a horizontal flow.</li>
	 * <li>{@link #RIGHTBOTTOM}: Starts from bottom for a vertical flow and from right for a 
	 * horizontal flow. Aligns the children to right for a vertical flow and to bottom for 
	 * a horizontal flow.</li>
	 * </ul>
	 * </p>
	 * @since 1.0
	 */
	public final static Id<Integer> ORIGIN = new Id<Integer>();

	/**
	 * <p>This constant is a legal value for the {@link #ORIGIN} configurable property 
	 * of a {@link FlowLayout} object. This is the default value.</p>
	 * @since 1.0
	 */
	public final static int LEFTTOP = 0;
	/**
	 * <p>This constant is a legal value for the {@link #ORIGIN} configurable property 
	 * of a {@link FlowLayout} object.</p>
	 * @since 1.0
	 */
	public final static int RIGHTTOP = 1;
	/**
	 * <p>This constant is a legal value for the {@link #ORIGIN} configurable property 
	 * of a {@link FlowLayout} object.</p>
	 * @since 1.0
	 */
	public final static int LEFTBOTTOM = 2;
	/**
	 * <p>This constant is a legal value for the {@link #ORIGIN} configurable property 
	 * of a {@link FlowLayout} object.</p>
	 * @since 1.0
	 */
	public final static int RIGHTBOTTOM = 3;

	/**
	 * <p>The default constructor that constructs a layout manager of this type.</p>
	 * <p>This constructor invokes the default constructor of the superclass.</p>
	 * @since 1.0
	 * @see #FlowLayout(ObjectLike)
	 */
	public FlowLayout() {
	}

	/**
	 * <p>A typical constructor that constructs a layout manager of this type and forces 
	 * constructors of subclasses to pass initializing data.</p>
	 * <p>This constructor invokes the typical constructor of the superclass passing 
	 * the specified initializing object as the argument.</p>
	 * @param ini The initializing object.
	 * @since 1.0
	 * @see #FlowLayout()
	 */
	public FlowLayout(ObjectLike ini) {
		super(ini);
		if (Variables.undefined(ini(this).var(ORIGIN))) {
			ini(this).var(ORIGIN, LEFTTOP);
		}
	}

	/**
	 * <p>Layouts a container.</p>
	 * <p>This method layouts children of a container in a flow.</p>
	 * @param c The container to layout.
	 * @since 1.0
	 */
	@Override
	protected void doLayout(Container c) {
	}
}
