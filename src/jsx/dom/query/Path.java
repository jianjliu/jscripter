
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

import js.ArrayLike;
import js.Disposable;
import js.Js;
import js.user.JsElement;
import js.user.JsNode;
import jsx.client.Win;

/**
 * <p>Defines paths that perform efficient queries over documents and elements.</p>
 * <p>A path defined by this class can extends optionally with a {@link Selector} and 
 * selects over a DOM structured node.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Path extends Disposable
{
	private final String name;
	private final Selector.Tag tagSelector;
	private final Selector selector;
	private final Path parent;

	private Path(String name, Selector selector, Path parent) {
		this.name = name;
		this.tagSelector = new Selector.Tag(name);
		this.selector = selector;
		this.parent = parent;
	}
	/**
	 * <p>Constructs a path with a tag name and a selector.</p>
	 * <p>The path will start query from the named child nodes of a document or element.</p>
	 * @param name A tag name of the nodes where this path starts query.
	 * @param selector Selects the nodes where this path starts query.
	 * @since 1.0
	 */
	public Path(String name, Selector selector) {
		this(name, selector, null);
	}
	/**
	 * <p>Constructs a path with a tag name.</p>
	 * <p>The path will start query from the named child nodes of a document or element.</p>
	 * @param name A tag name of the nodes where this path starts query.
	 * @since 1.0
	 */
	public Path(String name) {
		this(name, Selector.ANY);
	}
	/**
	 * <p>Constructs a path with a selector.</p>
	 * @param selector Selects the nodes where this path starts query.
	 * @since 1.0
	 */
	public Path(Selector selector) {
		this("", selector);
	}
	/**
	 * <p>Constructs a path without a tag name or a selector.</p>
	 * <p>The path will start query from all the child nodes of a document or element.</p>
	 * @since 1.0
	 */
	public Path() {
		this("");
	}

	/**
	 * <p>Returns a new path with a tag name and a selector appended to the current one.</p>
	 * <p>The new path will continue its query from the named child nodes of the nodes it has selected.</p>
	 * @param name A tag name of the nodes where the new path continues its query.
	 * @param selector Selects the nodes where the new path continues its query.
	 * @return The appended new path.
	 * @since 1.0
	 */
	public final Path add(String name, Selector selector) {
		return new Path(name, selector, this);
	}
	/**
	 * <p>Returns a new path with a selector appended to the current one.</p>
	 * <p>The new path will continue its query from all the child nodes of the nodes it has selected.</p>
	 * @param selector Selects the nodes where the new path continues its query.
	 * @return The appended new path.
	 * @since 1.0
	 */
	public final Path add(Selector selector) {
		return new Path("", selector, this);
	}
	/**
	 * <p>Returns a new path with a tag name appended to the current one.</p>
	 * <p>The new path will continue its query from the named child nodes of the nodes it has selected.</p>
	 * @param name A tag name of the nodes where the new path continues its query.
	 * @return The appended new path.
	 * @since 1.0
	 */
	public final Path add(String name) {
		return new Path(name, Selector.ANY, this);
	}
	/**
	 * <p>Returns a new path without a tag name or a selector appended to the current one.</p>
	 * <p>The new path will continue its query from all the child nodes of the nodes it has selected.</p>
	 * @return The appended new path.
	 * @since 1.0
	 */
	public final Path add() {
		return add("");
	}

	/**
	 * <p>Performs a query over the current document.</p>
	 * @return A list of nodes as the result.
	 * @since 1.0
	 */
	public final ArrayLike<JsNode> select() {
		return select(Win.document.var());
	}

	/**
	 * <p>Performs queries over a list of nodes.</p>
	 * @param nodes The nodes where this path starts its queries.
	 * @return A list of nodes as the result.
	 * @since 1.0
	 */
	public final ArrayLike<JsNode> select(ArrayLike<JsNode> nodes) {
		if (Js.be(parent)) {
			nodes = parent.select(nodes);
		}
		if (Js.not(name)) {
			return selector.reset().select(nodes);
		}
		ArrayLike<JsNode> ret = Js.array();
		if (Js.be(parent) && Js.not(parent.name)) {
			for (int i = 0, len = nodes.length(); i < len; i++) {
				ret = ret.concat(
						Query.getElementsByTagName(
								new JsElement(nodes.get(i)),
								name,
								selector
						)
				);
			}
		} else {
			for (int i = 0, len = nodes.length(); i < len; i++) {
				ret = ret.concat(
						Query.getChildren(
								nodes.get(i),
								tagSelector.and(selector)
						)
				);
			}
		}
		return ret; 
	}

	/**
	 * <p>Performs a query over a document or element.</p>
	 * @param ctx The node where this path starts its query.
	 * @return A list of nodes as the result.
	 * @since 1.0
	 */
	public final ArrayLike<JsNode> select(JsNode ctx) {
		ArrayLike<JsNode> nodes = Js.array();
		nodes.push(ctx);
		return select(nodes);
	}
}
