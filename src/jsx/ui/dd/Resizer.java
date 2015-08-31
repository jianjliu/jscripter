
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

package jsx.ui.dd;

import js.ArrayLike;
import js.Id;
import js.Js;
import js.Vars;
import jsx.core.Variables;
import jsx.ui.Component;
import jsx.ui.Widget;

/**
 * <p>A class for widgets of resizer to handle resizing operations of mouse.</p>
 * <p>A resizer is a mouse handle that can be added to a component with a call to method 
 * {@link Resizer#addResizers(Component, int)} to resize it in a specified direction.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Resizer extends Mouse
{
	private final static Id<ArrayLike<Resizer>> RESIZERS = new Id<ArrayLike<Resizer>>();

	/**
	 * <p>Gets an array of all the resizers added to a specified component.</p>
	 * @param e A component.
	 * @since 1.0
	 */
	public static final ArrayLike<Resizer> getAll(Component e) {
		ArrayLike<Resizer> resizers = ini(e).var(RESIZERS);
		if (Js.not(resizers)) {
			resizers = new Vars<Resizer>().var();
			ini(e).var(RESIZERS, resizers);
		}
		return resizers;
	}

	private final static Id<Integer> MASK = new Id<Integer>();

	/**
	 * <p>This constant is a legal value for the second argument of the method {@link #addResizers(Component, int)} 
	 * meaning to create resizers in all eight directions.</p>
	 * @since 1.0
	 * @see #mask(int)
	 * @see #addResizers(Component, int)
	 */
	public final static int ALL = 255;

	/**
	 * <p>Converts a resizer direction number to a bit mask number.</p>
	 * @param dir A number telling which direction a resizer resizes. Possible values 
	 * for this argument are:
	 * <ul>
	 * <li>{@link Resizable#N}: Only the north border is allowed to move for resizing.</li>
	 * <li>{@link Resizable#S}: Only the south border is allowed to move for resizing.</li>
	 * <li>{@link Resizable#E}: Only the east border is allowed to move for resizing.</li>
	 * <li>{@link Resizable#W}: Only the west border is allowed to move for resizing.</li>
	 * <li>{@link Resizable#SE}: Only the south-east corner is allowed to move for resizing.</li>
	 * <li>{@link Resizable#SW}: Only the south-west corner is allowed to move for resizing.</li>
	 * <li>{@link Resizable#NE}: Only the north-east corner is allowed to move for resizing.</li>
	 * <li>{@link Resizable#NW}: Only the north-west corner is allowed to move for resizing.</li>
	 * </ul>
	 * @return A integer number with only the <tt>dir</tt>th bit set.
	 * @since 1.0
	 * @see #addResizers(Component, int)
	 */
	public static final int mask(int dir) {
		return 1 << dir;
	}

	/**
	 * <p>Adds required resizers to a specified component.</p>
	 * @param e A component that needs resizers.
	 * @param bits An integer with each set bit adding a resizer to the component.
	 * <ul>
	 * <li>The 1st bit means a resizer in the direction of {@link Resizable#N}.</li>
	 * <li>The 2nd bit means a resizer in the direction of {@link Resizable#S}.</li>
	 * <li>The 3rd bit means a resizer in the direction of {@link Resizable#E}.</li>
	 * <li>The 4th bit means a resizer in the direction of {@link Resizable#W}.</li>
	 * <li>The 5th bit means a resizer in the direction of {@link Resizable#SE}.</li>
	 * <li>The 6th bit means a resizer in the direction of {@link Resizable#SW}.</li>
	 * <li>The 7th bit means a resizer in the direction of {@link Resizable#NE}.</li>
	 * <li>The 8th bit means a resizer in the direction of {@link Resizable#NW}.</li>
	 * </ul>
	 * @since 1.0
	 * @see #mask(int)
	 * @see #getResizer(Component, int)
	 */
	public static final void addResizers(Component e, int bits) {
		int resizers = mask(e);
		ini(e).var(MASK, resizers | bits);
		bits ^= resizers;
		for (int dir = Resizable.N; Js.be(bits); dir++, bits >>= 1) {
			if (Js.be(bits & 1)) {
				Resizable r = new Resizable(e, dir);
				ini(r).var(Resizable.DELEGABLE, true);
				r.attach(getResizer(e, dir));
			}
		}
	}

	public static final void addResizers(Widget w, int bits) {
		addResizers(w.unwrap(), bits);
		Component.addClasses(w.unwrap(), w.subs("resizable"));
		
	}

	private static final int mask(Component e) {
		Integer resizers = ini(e).var(MASK);
		return Variables.undefined(resizers) ? 0 : resizers;
	}

	/**
	 * <p>A typical constructor forcing constructors of subclasses to pass a component.</p>
	 * <p>This constructor simply invokes the constructor with the same type of argument 
	 * as this one passing the specified component.</p>
	 * @param e The underlying component.
	 * @since 1.0
	 */
	protected Resizer(Component e) {
		super(e);
	}

	private final static ArrayLike<String> DIRS = new Vars<String>()
		.add("n" ).add("s" ).add("e" ).add("w" )
		.add("se").add("sw").add("ne").add("nw").var();

	/**
	 * <p>Gets a resizer for a component in a specified direction.</p>
	 * @param e A component to get a resizer.
	 * @param dir The direction to get the resizer in.Possible values for this argument 
	 * are:
	 * <ul>
	 * <li>{@link Resizable#N}: Gets the resizer of the north border of the component.</li>
	 * <li>{@link Resizable#S}: Gets the resizer of the north border of the component.</li>
	 * <li>{@link Resizable#E}: Gets the resizer of the north border of the component.</li>
	 * <li>{@link Resizable#W}: Gets the resizer of the north border of the component.</li>
	 * <li>{@link Resizable#SE}: Gets the resizer of the south-east corner of the component.</li>
	 * <li>{@link Resizable#SW}: Gets the resizer of the south-west corner of the component.</li>
	 * <li>{@link Resizable#NE}: Gets the resizer of the north-east corner of the component.</li>
	 * <li>{@link Resizable#NW}: Gets the resizer of the north-west corner of the component.</li>
	 * </ul>
	 * @return A resizer of the component in the specified direction. If the component 
	 * does not have a resizer in that direction, this method will creates one and 
	 * returns it.
	 * @since 1.0
	 * @see #addResizers(Component, int)
	 */
	public static final Resizer getResizer(Component e, int dir) {
		ArrayLike<Resizer> all = getAll(e);
		Resizer r = all.get(dir);
		if (Js.not(r)) {
			Component.addClass(e, css(Resizable.class));
			Component me = Component.div();
			Component.appendChild(e, me);
			r = new Resizer(me);
			Component.addClass(r.unwrap(), css(r.getClass(), "handle"));
			Component.addClass(r.unwrap(), css(r.getClass(), DIRS.get(dir)));
			all.set(dir, r);
		}
		return r;
	}
}
