
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

package jsx.ui;

import js.ArrayLike;
import js.Id;
import js.Js;
import js.Vars;
import jsx.Configurable;
import jsx.Template;
import jsx.core.ArrayLikes;
import jsx.dom.Markups;
import jsx.event.Handle;
import jsx.ui.event.OnRender;
import jsx.ui.event.Render;

/**
 * <p>A base class for tree widgets.</p>
 * <p>A {@link Tree} is a {@link Widget} that provides tree-structured UI 
 * representation of tree-structured data.</p>
 * <p>A {@link Tree} widget is {@link Configurable} and is also an event source which 
 * fires {@link Widget.Event} events. It is meanwhile an event listener that handles 
 * events fired from its underlying component.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Tree extends Widget implements OnRender
{
	/**
	 * <p>The default constructor.</p>
	 * <p>This constructor simply invokes the default constructor of this class.</p>
	 * @since 1.0
	 */
	public Tree() {
		super(new Component(Markups.UL));
		addClasses();
		ini(this).var(ITEMS, new Vars<Component>().var());
		unwrap().addListener(Render.class, this);
	}

	private final static Id<ArrayLike<Component>> ITEMS = new Id<ArrayLike<Component>>();
	private final static Id<Tree> SUBTREE = new Id<Tree>();

	/**
	 * <p>Appends the given HTML text as a tree node.</p>
	 * @param node The HTML text for the new node.
	 * @return The new node of component.
	 * @since 1.0
	 */
	public Component add(String node) {
		Component item = new Component(Template.apply(
				Template.LI,
				node
		));
		ArrayLikes.push(ini(this).var(ITEMS), item);
		Component.addClasses(item, subs("item"));
		return item;
	}

	/**
	 * <p>Appends the given HTML text as a tree node with a given sub tree.</p>
	 * @param node The HTML text for the new node.
	 * @param sub The sub tree attached to the new node.
	 * @return The new node of component.
	 * @since 1.0
	 */
	public Component add(String node, Tree sub) {
		Component item = add(node).unwrap();
		Component.addClasses(item, subs("node"));
		ini(item).var(SUBTREE, sub);
		return item;
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method sets up mouse event handlers for the underlying HTML element on the 
	 * browser level.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(Render evt) {
		ArrayLike<Component> items = ini(this).var(ITEMS);
		for (int i = 0, len = ArrayLikes.length(items); i < len; i++) {
			Component item = items.get(i);
			Component.appendChild(unwrap(), item);
			item.handle("click", Handle.CANCELBUBBLE.var());
			Tree sub = ini(item).var(SUBTREE);
			if (Js.be(sub)) {
				Component subc = sub.unwrap();
				Component.appendChild(item, subc);
				item.pseudo(COLLAPSE, "collapse").toggle(item, "click");
				subc.pseudo(COLLAPSE, "collapse").toggle(item, "click");
			}
		}
	}
}
