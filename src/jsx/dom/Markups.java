
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

package jsx.dom;

import js.ArrayLike;
import js.Disposable;
import js.Js;
import js.user.JsHTMLElement;
import js.user.JsNode;
import js.user.JsRange;
import jsx.Code;
import jsx.Template;
import jsx.client.Browser;

/**
 * <p>A utility class manipulating DOM in HTML with its static methods.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Markups extends Disposable
{
	private Markups() {}

	/**
	 * <p>Inserts the given HTML text immediately before the node.</p>
	 * @param node An HTML element node.
	 * @param html A string that specifies the HTML text to insert. The string can be a 
	 * combination of text and HTML tags. This must be well-formed, valid HTML or this 
	 * method will fail.
	 * @return An HTML element node.
	 * @since 1.0
	 */
	public static final JsHTMLElement insertBeforeBegin(JsNode node, String html) {
		if (Browser.canInsertHTML) {
			Nodes.insertAdjacentHTML(node, "BeforeBegin", html);
		} else {
			JsRange range = node.var(JsNode.ownerDocument).createRange();
			range.setStartBefore(node);
			JsNode n = range.createContextualFragment(html);
			Nodes.parentNode(node).insertBefore(n, node);
		}
		return new JsHTMLElement(Nodes.previousSibling(node));
	}

	/**
	 * <p>Inserts the given HTML text immediately after the end of the node.</p>
	 * @param node An HTML element node.
	 * @param html A string that specifies the HTML text to insert. The string can be a 
	 * combination of text and HTML tags. This must be well-formed, valid HTML or this 
	 * method will fail.
	 * @return An HTML element node.
	 * @since 1.0
	 */
	public static final JsHTMLElement insertAfterEnd(JsNode node, String html) {
		if (Browser.canInsertHTML) {
			Nodes.insertAdjacentHTML(node, "AfterEnd", html);
		} else {
			JsRange range = node.var(JsNode.ownerDocument).createRange();
			range.setStartAfter(node);
			JsNode n = range.createContextualFragment(html);
			Nodes.parentNode(node).insertBefore(n, Nodes.nextSibling(node));
		}
		return new JsHTMLElement(Nodes.nextSibling(node));
	}

	/**
	 * <p>Inserts the given HTML text immediately after the start of the node.</p>
	 * @param node An HTML element node.
	 * @param html A string that specifies the HTML text to insert. The string can be a 
	 * combination of text and HTML tags. This must be well-formed, valid HTML or this 
	 * method will fail.
	 * @return An HTML element node.
	 * @since 1.0
	 */
	public static final JsHTMLElement insertAfterBegin(JsNode node, String html) {
		if (Browser.canInsertHTML) {
			Nodes.insertAdjacentHTML(node, "AfterBegin", html);
		} else {
			JsNode first = Nodes.firstChild(node);
			if (Js.be(first)) {
				JsRange range = node.var(JsNode.ownerDocument).createRange();
				range.setStartBefore(first);
				JsNode n = range.createContextualFragment(html);
				node.insertBefore(n, first);
			} else {
				Nodes.innerHTML(node, html);
			}
		}
		return new JsHTMLElement(Nodes.firstChild(node));
	}

	/**
	 * <p>Inserts the given HTML text immediately before the end of the node.</p>
	 * @param node An HTML element node.
	 * @param html A string that specifies the HTML text to insert. The string can be a 
	 * combination of text and HTML tags. This must be well-formed, valid HTML or this 
	 * method will fail.
	 * @return An HTML element node.
	 * @since 1.0
	 */
	public static final JsHTMLElement insertBeforeEnd(JsNode node, String html) {
		if (Browser.canInsertHTML) {
			Nodes.insertAdjacentHTML(node, "BeforeEnd", html);
		} else {
			JsNode last = Nodes.lastChild(node);
			if (Js.be(last)) {
				JsRange range = node.var(JsNode.ownerDocument).createRange();
				range.setStartAfter(last);
				JsNode n = range.createContextualFragment(html);
				node.appendChild(n);
			} else {
				Nodes.innerHTML(node, html);
			}
		}
		return new JsHTMLElement(Nodes.lastChild(node));
	}

	/**
	 * <p>Creates HTML text from the given template and template parameters and inserts it
	 * immediately before the node.</p>
	 * <p>The created HTML can be a combination of text and HTML tags. It must be 
	 * well-formed, valid HTML or this method will fail.</p>
	 * @param node An HTML element node.
	 * @param tmplt A template for creating the HTML text.
	 * @param paras An array of template parameter strings.
	 * @return An HTML element node.
	 * @since 1.0
	 */
	public static final JsHTMLElement insertBeforeBegin(JsNode node, ArrayLike<String> tmplt, ArrayLike<String> paras) {
		return insertBeforeBegin(node, Template.apply(tmplt, paras));
	}

	/**
	 * <p>Creates HTML text from the given template and template parameters and inserts it
	 * immediately after the end of the node.</p>
	 * <p>The created HTML can be a combination of text and HTML tags. It must be 
	 * well-formed, valid HTML or this method will fail.</p>
	 * @param node An HTML element node.
	 * @param tmplt A template for creating the HTML text.
	 * @param paras An array of template parameter strings.
	 * @return An HTML element node.
	 * @since 1.0
	 */
	public static final JsHTMLElement insertAfterEnd(JsNode node, ArrayLike<String> tmplt, ArrayLike<String> paras) {
		return insertAfterEnd(node, Template.apply(tmplt, paras));
	}

	/**
	 * <p>Creates HTML text from the given template and template parameters and inserts it
	 * immediately after the start of the node.</p>
	 * <p>The created HTML can be a combination of text and HTML tags. It must be 
	 * well-formed, valid HTML or this method will fail.</p>
	 * @param node An HTML element node.
	 * @param tmplt A template for creating the HTML text.
	 * @param paras An array of template parameter strings.
	 * @return An HTML element node.
	 * @since 1.0
	 */
	public static final JsHTMLElement insertAfterBegin(JsNode node, ArrayLike<String> tmplt, ArrayLike<String> paras) {
		return insertAfterBegin(node, Template.apply(tmplt, paras));
	}

	/**
	 * <p>Creates HTML text from the given template and template parameters and inserts it
	 * immediately before the end of the node.</p>
	 * <p>The created HTML can be a combination of text and HTML tags. It must be 
	 * well-formed, valid HTML or this method will fail.</p>
	 * @param node An HTML element node.
	 * @param tmplt A template for creating the HTML text.
	 * @param paras An array of template parameter strings.
	 * @return An HTML element node.
	 * @since 1.0
	 */
	public static final JsHTMLElement insertBeforeEnd(JsNode node, ArrayLike<String> tmplt, ArrayLike<String> paras) {
		return insertBeforeEnd(node, Template.apply(tmplt, paras));
	}

	/**
	 * <p>Creates HTML text from the given template and template parameters and replace the
	 * innerHTML of the node with it.</p>
	 * <p>The created HTML can be a combination of text and HTML tags. It must be 
	 * well-formed, valid HTML or this method will fail.</p>
	 * @param node An HTML element node.
	 * @param tmplt A template for creating the HTML text.
	 * @param paras An array of template parameter strings.
	 * @return An HTML element node.
	 * @since 1.0
	 */
	public static final JsHTMLElement replaceHtml(JsNode node, ArrayLike<String> tmplt, ArrayLike<String> paras) {
		String html = Template.apply(tmplt, paras);
		Nodes.innerHTML(node, html);
		return new JsHTMLElement(Nodes.firstChild(node));
	}

	/**
	 * <p>The HTML string of &lt;div&gt;&lt;/div&gt;.</p>
	 * @since 1.0
	 */
	public final static String DIV   = Template.apply(Template.DIV  );
	/**
	 * <p>The HTML string of &lt;label&gt;&lt;/label&gt;.</p>
	 * @since 1.0
	 */
	public final static String LABEL = Template.apply(Template.LABEL);
	/**
	 * <p>The HTML string of &lt;li&gt;&lt;/li&gt;.</p>
	 * @since 1.0
	 */
	public final static String LI    = Template.apply(Template.LI   );
	/**
	 * <p>The HTML string of &lt;ul&gt;&lt;/ul&gt;.</p>
	 * @since 1.0
	 */
	public final static String UL    = Template.apply(Template.UL   );
	/**
	 * <p>The HTML string of &lt;span&gt;&lt;/span&gt;.</p>
	 * @since 1.0
	 */
	public final static String SPAN  = Template.apply(Template.SPAN );

	/**
	 * <p>Creates a starting HTML tag.</p>
	 * @param tag The tag name.
	 * @return The text of the created HTML tag.
	 * @since 1.0
	 */
	public static final String start(String tag) {
		return Template.apply(Template.START, tag);
	}

	/**
	 * <p>Creates HTML text for an attribute.</p>
	 * @param attr The attribute name.
	 * @param value The attribute value.
	 * @return The text of the created HTML piece.
	 * @since 1.0
	 */
	public static final String attr(String attr, String value) {
		return Template.apply(Template.attr(attr), Code.qt(value));
	}

	/**
	 * <p>Creates HTML text for a button element.</p>
	 * @param value The name of the button.
	 * @return The text of the created HTML piece.
	 * @since 1.0
	 */
	public static final String button(String value) {
		return Template.apply(Template.BUTTON, value);
	}

	/**
	 * <p>Creates HTML text for a button element.</p>
	 * @param value The name of the button.
	 * @param title The title of the button.
	 * @return The text of the created HTML piece.
	 * @since 1.0
	 */
	public static final String button(String value, String title) {
		return Template.apply(
				Template.element(
						Js.add(
								"button",
								Template.apply(
										Template.attr("title"),
										Code.qt(title)
								)
						),
						"button"
				),
				value
		);
	}

	/**
	 * <p>Creates HTML text for an input element.</p>
	 * @param type The type of the input element to create.
	 * @return The text of the created HTML piece.
	 * @since 1.0
	 */
	public static final String input(String type) {
		return start(Js.add("input", attr("type", type)));
	}

	/**
	 * <p>Creates an HTML radio element.</p>
	 * @param name The name for the radio element.
	 * @return The text of the created HTML piece.
	 * @since 1.0
	 */
	public static final String radio(String name) {
		return start(Code.join("input", attr("type", "radio"), attr("name", name)));
	}

	/**
	 * <p>Creates an HTML &lt;span&gt;&lt;/span&gt; element.</p>
	 * @param html The HTML text to span.
	 * @return The text of the created HTML piece.
	 * @since 1.0
	 */
	public static final String span(String html) {
		return Template.apply(Template.SPAN, html);
	}

	/**
	 * <p>Creates HTML tags for an element with value and title.</p>
	 * @param tag The tag name for the element.
	 * @param value The value for the element.
	 * @param title The text of the title.
	 * @return The text of the created HTML piece.
	 * @since 1.0
	 */
	public static final String title(String tag, String value, String title) {
		return Template.apply(
				Template.element(
						Js.add(
								tag,
								Template.apply(
										Template.attr("title"),
										Code.qt(title)
								)
						),
						tag
				),
				value
		);
	}
}
