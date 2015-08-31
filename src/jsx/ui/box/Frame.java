
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

import js.ArrayLike;
import jsx.ui.Box;
import jsx.ui.Component;
import jsx.ui.Widget;

/**
 * <p>A base class for frame widgets.</p>
 * <p>A frame widget is a {@link Box} that normally has two basic {@link Box}es as its 
 * children. Its first child is for the title of the frame; its second child is for 
 * the content of the frame.</p>
 * <p>The {@link Box}'s methods for {@link Frame} have been overridden and redirected 
 * to its content box.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Frame extends Box<Widget>
{
	/**
	 * <p>Constructs a default frame widget.</p>
	 * <p>This constructor invokes {@link #Frame(Component)} with a new component created by calling
	 * {@link Component#div()} as argument.</p>
	 * @since 1.0
	 */
	public Frame() {
		this(Component.div());
	}

	/**
	 * <p>Typically constructs a frame widget.</p>
	 * <p>This constructor invokes its super constructor and creates its title box with a CSS sub 
	 * selector "tbox" expended and content box with a CSS sub selector "tbox" expended.</p>
	 * @param e The underlying component for the frame.
	 * @since 1.0
	 */
	protected Frame(Component e) {
		super(e);
		Box<Widget> t = new Box<Widget>(Component.span());
		Component.addClasses(t.unwrap(), subs("tbox"));
		Box<Widget> c = new Box<Widget>(Component.span());
		Component.addClasses(c.unwrap(), subs("cbox"));
		super.add(t);
		super.add(c);
	}


	/**
	 * <p>Gets the title box of the frame.</p>
	 * @return The title box.
	 * @since 1.0
	 */
	@SuppressWarnings("unchecked")
	public final Box<Widget> getTitle() {
		return (Box<Widget>)super.children().get(0);
	}

	/**
	 * <p>Gets the content box of the frame.</p>
	 * @return The content box.
	 * @since 1.0
	 */
	@SuppressWarnings("unchecked")
	public final Box<Widget> getContent() {
		return (Box<Widget>)super.children().get(1);
	}

	/**
	 * <p>Gets an array of child widgets of frame's content.</p>
	 * <p>This overriding method redirects its invocation to that of the same method of the content box.</p>
	 * <p>{@link Box#children()} has to be used to get the real children of this box, but normally
	 * this situation is not expected.</p>
	 * @return An array of child widgets of frame's content.
	 * @since 1.0
	 */
	@Override
	public ArrayLike<Widget> children() {
		return getContent().children();
	}

	/**
	 * <p>Adds a widget to the content.</p>
	 * <p>This method will force the content to layout if its children list has been changed.</p>
	 * <p>This overriding method redirects its invocation to that of the same method of the content box.</p>
	 * <p>{@link Box#add(Widget)} has to be used to add a widget to this box, but normally
	 * this situation is not expected.</p>
	 * @param w A widget to be added to the content.
	 * @return <tt>true</tt> if the specified widget becomes a new child of the 
	 * content; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	@Override
	public boolean add(Widget w) {
		return getContent().add(w);
	}

	/**
	 * <p>Inserts a given widget to the content immediately before an existing child widget.</p>
	 * <p>This method will force the content to layout if its children list has been changed.</p>
	 * <p>This overriding method redirects its invocation to that of the same method of the content box.</p>
	 * <p>{@link Box#insert(Widget, Widget)} has to be used to insert a widget to this box, but normally
	 * this situation is not expected.</p>
	 * @param w A widget to insert.
	 * @param r An existing child widget for reference.
	 * @return <tt>true</tt> if it is successfully inserted; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	@Override
	public boolean insert(Widget w, Widget r) {
		return getContent().insert(w, r);
	}

	/**
	 * <p>Removes a widget from the content.</p>
	 * <p>This method will force the content to layout if its children list has been changed.</p>
	 * <p>This overriding method redirects its invocation to that of the same method of the content box.</p>
	 * <p>{@link Box#remove(Widget)} has to be used to remote a widget from this box, but normally
	 * this situation is not expected.</p>
	 * @param w A widget to be removed from the children list of this box.
	 * @return <tt>true</tt> if the specified widget is successfully removed; <tt>false</tt>, 
	 * otherwise.
	 * @since 1.0
	 */
	@Override
	public boolean remove(Widget w) {
		return getContent().remove(w);
	}
}
