
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

import js.ArrayLike;
import js.Id;
import js.Js;
import js.Initializer;
import js.ObjectLike;
import js.Vars;
import jsx.Configurable;
import jsx.core.ArrayLikes;
import jsx.core.ObjectLikes;

/**
 * <p>A class for choice groups with its static methods providing group management.</p>
 * <p>{@link Group} objects help {@link Choice} widgets maintain synchronized states
 * with their underlying HTML input elements.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Group extends Configurable
{
	/**
	 * <p>A global identifier for a configurable property of a {@link Group} object.</p>
	 * <p>The identified configurable property of a {@link Group} object is a reference 
	 * to an array of {@link Choice} objects that holds members of the group.</p>
	 * @since 1.0
	 */
	public static Id<ArrayLike<Choice>> CHOICES = new Id<ArrayLike<Choice>>();

	private static Id<String> NAME = new Id<String>();
	private static int NEXT = 0;

	private Group(String name) {
		super(new Initializer().var());
		ini(this).var(NAME, name);
		clear();
	}

	/**
	 * <p>Constructs a choice group.</p>
	 * @since 1.0
	 */
	public Group() {
		this(Js.add(Group.class.getName(), NEXT++));
	}

	/**
	 * <p>Clears the choice group.</p>
	 * @since 1.0
	 */
	public void clear() {
		ini(this).var(CHOICES, new Vars<Choice>().var());
		ObjectLikes.delete(GROUPS, getName());
	}

	private final static ObjectLike GROUPS = new Initializer().var();

	/**
	 * <p>Statically gets a choice group by its name.</p>
	 * @param name The name of a choice group.
	 * @return The choice group with the name.
	 * @since 1.0
	 */
	public static final Group get(String name) {
		Group g = (Group)GROUPS.var(name);
		if (Js.not(g)) {
			g = new Group(name);
			GROUPS.var(name, g);
		}
		return g;
	}

	/**
	 * <p>Gets the name of the current choice group.</p>
	 * @return The name of the current choice group.
	 * @since 1.0
	 */
	public String getName() {
		return ini(this).var(NAME);
	}

	/**
	 * <p>Synchronizes all members of the group.</p>
	 * <p>This method basically invokes {@link Choice#synchronize()} method on each
	 * choice member of the current group.</p>
	 * @since 1.0
	 */
	public void synchronize() {
		ArrayLike<Choice> choices = ini(this).var(CHOICES);
		for (int i = 0, len = ArrayLikes.length(choices); i < len; i++) {
			choices.get(i).synchronize();
		}
	}
}
