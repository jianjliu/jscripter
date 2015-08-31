
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

package jsx.dom.query;

import js.ArrayObject;
import js.ArrayLike;
import js.Disposable;
import js.Js;
import js.user.JsElement;
import js.user.JsNode;

/**
 * <p>An abstract base class that defines selectors to select nodes when paths perform 
 * queries.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public abstract class Selector extends Disposable
{
	/**
	 * <p>Default constructor doing nothing.</p>
	 * @since 1.0
	 */
	protected Selector() {}

	/**
	 * <p>Resets the selector and returns the new one.</p>
	 * <p>This method simply returns the current selector without doing anything else. 
	 * Overriding methods can do more as needed.</p>
	 * @return The new selector reset from the current one.
	 * @since 1.0
	 */
	public Selector reset() { return this;}

	/**
	 * <p>Determines if the specified node meets the criteria of this selector.</p>
	 * @param node A node to select.
	 * @return <tt>true</tt> if the node is to be selected; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	public abstract boolean select(JsNode node);

	/**
	 * <p>The singleton seletor that selects any nodes.</p>
	 * @since 1.0
	 */
	public static final Selector ANY = new Any();

	/**
	 * <p>Creates a logical-NOT selector based on the current one.</p>
	 * @return The newly created selector.
	 * @since 1.0
	 */
	public final Not not() {
		return new Not(this);
	}

	/**
	 * <p>Creates a logical-AND selector based on the current one and the specified one.</p>
	 * @return The newly created selector.
	 * @since 1.0
	 */
	public final And and(Selector s) {
		return new And(this, s);
	}

	/**
	 * <p>Creates a logical-OR selector based on the current one and the specified one.</p>
	 * @return The newly created selector.
	 * @since 1.0
	 */
	public final Or or(Selector s) {
		return new Or(this, s);
	}

	/**
	 * <p>Selects on a list of nodes.</p>
	 * @param nodes A list of nodes to be selected by this selector.
	 * @return A list of nodes selected by this selector.
	 * @since 1.0
	 */
	public final ArrayLike<JsNode> select(ArrayObject<JsNode> nodes) {
		final ArrayLike<JsNode> ret = Js.array();
		if (Js.not(nodes)) {
			return ret;
		}
		for (int i = 0, len = nodes.length(); i < len; i++) {
			JsNode n = nodes.get(i);
			if (Js.be(n) && select(n)) {
				ret.push(n);
			}
		}
		return ret;
	}

	/**
	 * <p>Defines selectors which select any nodes provided.</p>
	 * <p>A selector of this type does nothing except returns <tt>true</tt> from the 
	 * {@link Any#select(ArrayObject)} method.</p>
	 * 
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 */
	public final static class Any extends Selector
	{
		/**
		 * <p>Constructs a selector of this type.</p>
		 * @since 1.0
		 */
		public Any() {}

		/**
		 * <p>Determines if the specified node meets the criteria of this selector.</p>
		 * @param node A node to select.
		 * @return <tt>true</tt> if the node is to be selected; <tt>false</tt>, otherwise.
		 * @since 1.0
		 */
		@Override
		public boolean select(JsNode node) {
			return true;
		}
	}

	/**
	 * <p>Defines logical-NOT selectors based on other selectors.</p>
	 * <p>A selector of this type only selects the nodes the base selector would not.</p>
	 * 
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 */
	public final static class Not extends Selector
	{
		private final Selector s;

		/**
		 * <p>Constructs a selector of this type.</p>
		 * @param s The base selector.
		 * @since 1.0
		 */
		public Not(Selector s) {
			this.s = s;
		}

		/**
		 * <p>Determines if the specified node meets the criteria of this selector.</p>
		 * @param node A node to select.
		 * @return <tt>true</tt> if the node is to be selected; <tt>false</tt>, otherwise.
		 * @since 1.0
		 */
		@Override
		public boolean select(JsNode node) {
			return !s.select(node);
		}
	}

	/**
	 * <p>Defines logical-AND selectors based on other selectors.</p>
	 * <p>A selector of this type only selects the nodes both base selectors would.</p>
	 * 
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 */
	public final static class And extends Selector
	{
		private final Selector s1, s2;

		/**
		 * <p>Constructs a selector of this type.</p>
		 * @param s1 A base selector.
		 * @param s2 A base selector.
		 * @since 1.0
		 */
		public And(Selector s1, Selector s2) {
			this.s1 = s1;
			this.s2 = s2;
		}

		/**
		 * <p>Determines if the specified node meets the criteria of this selector.</p>
		 * @param node A node to select.
		 * @return <tt>true</tt> if the node is to be selected; <tt>false</tt>, otherwise.
		 * @since 1.0
		 */
		@Override
		public boolean select(JsNode node) {
			return s1.select(node) && s2.select(node);
		}
	}

	/**
	 * <p>Defines logical-OR selectors based on other selectors.</p>
	 * <p>A selector of this type only selects the nodes either base selectors would.</p>
	 * 
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 */
	public final static class Or extends Selector
	{
		private final Selector s1, s2;

		/**
		 * <p>Constructs a selector of this type.</p>
		 * @param s1 A base selector.
		 * @param s2 A base selector.
		 * @since 1.0
		 */
		public Or(Selector s1, Selector s2) {
			this.s1 = s1;
			this.s2 = s2;
		}

		/**
		 * <p>Determines if the specified node meets the criteria of this selector.</p>
		 * @param node A node to select.
		 * @return <tt>true</tt> if the node is to be selected; <tt>false</tt>, otherwise.
		 * @since 1.0
		 */
		@Override
		public boolean select(JsNode node) {
			return s1.select(node) || s2.select(node);
		}
	}

	/**
	 * <p>Defines tag name selectors.</p>
	 * <p>A selector of this type only selects the nodes that have the specific tag name.</p>
	 * 
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 */
	public final static class Tag extends Selector
	{
		private final String utag;

		/**
		 * <p>Constructs a selector of this type.</p>
		 * @param name The tag name a node must have to be selected by this selector.
		 * @since 1.0
		 */
		public Tag(String name) {
			this.utag = name.toUpperCase();
		}

		/**
		 * <p>Determines if the specified node meets the criteria of this selector.</p>
		 * @param node A node to select.
		 * @return <tt>true</tt> if the node is to be selected; <tt>false</tt>, otherwise.
		 * @since 1.0
		 */
		@Override
		public boolean select(JsNode node) {
			return Js.be(node) && Js.eq(utag, JsElement.tagName.with(node));
		}
	}

	/**
	 * <p>Defines selectors that only select the nodes that have the specific indices.</p>
	 * 
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 */
	public final static class Nth extends Selector
	{
		private final int index;
		private int i;

		/**
		 * <p>Constructs a selector of this type.</p>
		 * @param index The index of the node this selector selects.
		 * @since 1.0
		 */
		public Nth(int index) {
			this.index = index;
		}

		/**
		 * <p>Resets the selector and returns the new one.</p>
		 * @return The new selector reset from the current one.
		 * @since 1.0
		 */
		@Override
		public Nth reset() {
			i = 0;
			return this;
		}

		/**
		 * <p>Determines if the specified node meets the criteria of this selector.</p>
		 * @param node A node to select.
		 * @return <tt>true</tt> if the node is to be selected; <tt>false</tt>, otherwise.
		 * @since 1.0
		 */
		@Override
		public boolean select(JsNode node) {
			return index == i++;
		}
	}

	/**
	 * <p>Defines selectors that only select the nodes that have even indices.</p>
	 * 
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 */
	public final static class Even extends Selector
	{
		private int index;

		/**
		 * <p>Constructs a selector of this type.</p>
		 * @since 1.0
		 */
		public Even() {}

		/**
		 * <p>Resets the selector and returns the new one.</p>
		 * @return The new selector reset from the current one.
		 * @since 1.0
		 */
		@Override
		public Even reset() {
			index = 0;
			return this;
		}

		/**
		 * <p>Determines if the specified node meets the criteria of this selector.</p>
		 * @param node A node to select.
		 * @return <tt>true</tt> if the node is to be selected; <tt>false</tt>, otherwise.
		 * @since 1.0
		 */
		@Override
		public boolean select(JsNode node) {
			return index++ % 2 == 0;
		}
	}

	/**
	 * <p>Defines selectors that only select the nodes that have odd indices.</p>
	 * 
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 */
	public final class Odd extends Selector
	{
		private int index;

		/**
		 * <p>Constructs a selector of this type.</p>
		 * @since 1.0
		 */
		public Odd() {}

		/**
		 * <p>Resets the selector and returns the new one.</p>
		 * @return The new selector reset from the current one.
		 * @since 1.0
		 */
		@Override
		public Odd reset() {
			index = 0;
			return this;
		}

		/**
		 * <p>Determines if the specified node meets the criteria of this selector.</p>
		 * @param node A node to select.
		 * @return <tt>true</tt> if the node is to be selected; <tt>false</tt>, otherwise.
		 * @since 1.0
		 */
		@Override
		public boolean select(JsNode node) {
			return index++ % 2 != 0;
		}
	}
}
