
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

import js.*;
import js.core.*;
import js.user.*;
import jsx.client.Browser;
import jsx.client.Win;
import jsx.dom.query.Selector;

/**
 * <p>A utility class supporting DOM query with its static methods.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Query extends Disposable
{
	private Query() {}

	/**
	 * <p>Returns an array of all {@link JsElement} nodes in the current document that have the
	 * specified tag name by traversing all descendants of this element and are selected against
	 * the given {@link Selector} object.</p>
	 * @param ctx The current element.
	 * @param name The tag name of the desired elements.
	 * @param sel A {@link Selector} object.
	 * @return An array of result nodes.
	 * @see #getElementsByTagName(String)
	 * @see #getElementsByTagName(JsElement, String)
	 * @see #getElementsByTagName(String, Selector)
	 * @see jsx.dom.Nodes#getElementsByTagName(JsNode, String)
	 * @since 1.0
	 */
	public static final ArrayLike<JsNode> getElementsByTagName(JsElement ctx, String name, Selector sel) {
		return sel.reset().select(ctx.getElementsByTagName(name));
	}

	/**
	 * <p>Returns an array of all {@link JsElement} nodes in the current document that have the
	 * specified tag name by traversing all descendants of this element.</p>
	 * @param ctx The current element.
	 * @param name The tag name of the desired elements.
	 * @return An array of result nodes.
	 * @see #getElementsByTagName(String)
	 * @see #getElementsByTagName(String, Selector)
	 * @see #getElementsByTagName(JsElement, String, Selector)
	 * @see jsx.dom.Nodes#getElementsByTagName(JsNode, String)
	 * @since 1.0
	 */
	public static final ArrayLike<JsNode> getElementsByTagName(JsElement ctx, String name) {
		return getElementsByTagName(ctx, name, Selector.ANY);
	}

	/**
	 * <p>Returns an array of all {@link JsElement} nodes in the current document that have the
	 * specified tag name by traversing all descendants of the current document and are selected against
	 * the given {@link Selector} object.</p>
	 * @param name The tag name of the desired elements.
	 * @param sel A {@link Selector} object.
	 * @return An array of result nodes.
	 * @see #getElementsByTagName(String)
	 * @see #getElementsByTagName(JsElement, String)
	 * @see #getElementsByTagName(JsElement, String, Selector)
	 * @see jsx.dom.Nodes#getElementsByTagName(JsNode, String)
	 * @since 1.0
	 */
	public static final ArrayLike<JsNode> getElementsByTagName(String name, Selector sel) {
		return sel.reset().select(Win.document.var().getElementsByTagName(name));
	}

	/**
	 * <p>Returns an array of all {@link JsElement} nodes in the current document that have the
	 * specified tag name by traversing all descendants of the current document.</p>
	 * @param name The tag name of the desired elements.
	 * @return An array of result nodes.
	 * @see #getElementsByTagName(JsElement, String)
	 * @see #getElementsByTagName(String, Selector)
	 * @see #getElementsByTagName(JsElement, String, Selector)
	 * @see jsx.dom.Nodes#getElementsByTagName(JsNode, String)
	 * @since 1.0
	 */
	public static final ArrayLike<JsNode> getElementsByTagName(String name) {
		return getElementsByTagName(name, Selector.ANY);
	}

	/**
	 * <p>Returns an array of all the child nodes of the current node that are selected against
	 * the given {@link Selector} object.</p>
	 * @param ctx The current node.
	 * @param sel A {@link Selector} object.
	 * @return An array of result nodes.
	 * @since 1.0
	 */
	public static final ArrayLike<JsNode> getChildren(JsNode ctx, Selector sel) {
		return sel.reset().select(JsNode.childNodes.with(ctx));
	}

	private final static Var<JsFunction<String>> namespaceURLMapper = new Static<JsFunction<String>>(
			new Var<JsFunction<String>>() {
				@Override
				public JsFunction<String> var() {
					return new Function<String>() {
						@Override
						protected String function(Object jsthis, Call<String> callee) {
							return "";

						}
					}.var();
				}
			}
	);

	/**
	 * <p>Creates a new XPath expression object that represents a compiled <tt>XPath</tt> query.</p>
	 * <p>This method tries to eliminate browser dependencies.</p>
	 * @param xpath The string representing the XPath expression to compile.
	 * @return A newly created XPath expression object. 
	 * @see JsDocument#createExpression(String)
	 * @see #selectNodes(JsObject, JsNode)
	 * @see #selectNodes(JsObject)
	 * @since 1.0
	 */
	public static final JsObject createExpression(String xpath) {
		if (Browser.isIE) {
			return Js.function(
					"cn",
					"x=new ActiveXObject('Microsoft.XMLDOM');" +
					"x.async=false;" +
					"x.load(cn.innerHTML);" +
					"x.setProperty('SelectionLanguage', 'XPath');" +
					"return x.selectNodes('" + xpath + "');"
			);
		} else {
			return Win.document.var().createExpression(xpath, namespaceURLMapper.var());
		}
	}

	/**
	 * <p>Performs an XPath query using the current document as the root and returns the result as
	 * an array of nodes.</p>
	 * <p>This method tries to eliminate browser dependencies.</p>
	 * @param expr A compiled XPath expression object.
	 * @return The query result as an array of nodes.
	 * @see #selectNodes(JsObject, JsNode)
	 * @see #createExpression(String)
	 * @see JsNode#selectNodes(String)
	 * @since 1.0
	 */
	public static final ArrayLike<JsNode> selectNodes(JsObject expr) {
		return selectNodes(expr, Win.document.var());
	}

	/**
	 * <p>Performs an XPath query using the given node as the root and returns the result as
	 * an array of nodes.</p>
	 * <p>This method tries to eliminate browser dependencies.</p>
	 * @param expr A compiled XPath expression object.
	 * @param ctx The root node.
	 * @return The query result as an array of nodes.
	 * @see #selectNodes(JsObject)
	 * @see #createExpression(String)
	 * @see JsNode#selectNodes(String)
	 * @since 1.0
	 */
	public static final ArrayLike<JsNode> selectNodes(JsObject expr, JsNode ctx) {
		ArrayLike<JsNode> ret = Js.array();
		if (Browser.isIE) {
			JsNodeList<?> rs = new JsFunction<JsNodeList<?>>(expr).invoke(ctx);
			if (Js.be(rs)) {
				for (int i = 0, len = rs.length(); i < len; i++) {
					ret.push(rs.get(i));
				}
			}
		} else {
			JsXPathResult rs = new JsXPathExpression(expr).evaluate(ctx, JsClient.XPathResult.ORDERED_NODE_SNAPSHOT_TYPE.with());
			Js.win().alert(rs);
			if (Js.be(rs)) {
				int len = JsXPathResult.snapshotLength.with(rs).intValue();
				Js.win().alert(len);
				for (int i = 0; i < len; i++) {
					ret.push(rs.snapshotItem(i));
				}
			}
		}
		return ret;
	}
}
