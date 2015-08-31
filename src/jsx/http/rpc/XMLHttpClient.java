
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

package jsx.http.rpc;

import js.ArrayLike;
import js.Js;
import js.ObjectLike;
import js.user.JsDocument;
import js.user.JsElement;
import js.user.JsNode;
import js.user.JsNodeList;
import jsx.client.Global;
import jsx.core.ArrayLikes;
import jsx.dom.Nodes;

/**
 * <p>XML & HTTP serialization contexts for client-side.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class XMLHttpClient extends XMLHttpContext
{
	/**
	 * <p>The default constructor for the contexts of this class type.</p>
	 * <p>The constructor simply invokes the default constructor of the super class.</p>
	 * @since 1.0
	 */
	public XMLHttpClient() {
		super();
	}

	/**
	 * <p>Prepares XML body for {@link jsx.http.Http} or {@link jsx.http.Ajax} to send or post.</p>
	 * @param base The base object for a remote call.
	 * @param args An array of arguments for a remote call.
	 * @return The XML document ready for {@link jsx.http.Http} or {@link jsx.http.Ajax} to send or post.
	 * @since 1.0
	 */
	public final String body(HttpRemote base, ArrayLike<?> args) {
		String s = "";
		for (int i = 0, len = ArrayLikes.length(args); i < len; i++) {
			s = Js.add(s, serialize(args.get(i), 0));
		}
		s = xelt(ARGS, s);
		s = Js.add(xelt(BASE, serialize(base, 0)), s);
		s = Js.add(xelt(CNTX, serialize()), s);
		s = Js.add(xelt(SIDS, sids()), s);
		return doc(xelt(XML, s));
	}

	/**
	 * <p>Gets the return value of a remote call.</p>
	 * @param response The XML response of the remote call.
	 * @return The return value.
	 * @since 1.0
	 */
	public final Object getReturn(JsDocument response) {
		return deserialize(
				Nodes.firstChild(
						getFirstByTag(response, RTRN)
				)
		);
	}

	/**
	 * <p>Updates the calling context with an XML response.</p>
	 * @param response The XML response of the remote call.
	 * @since 1.0
	 */
	public final void updateContext(JsDocument response) {
		expand(getText(getFirstByTag(response, SIDS)));
		JsNode n = Nodes.firstChild(
				getFirstByTag(response, CNTX)
		);
		while (Js.be(n)) {
			updateObject(n);
			n = Nodes.nextSibling(n);
		}
	}

	private final void updateObject(JsNode n) {
		ObjectLike o = object(getText(getFirstByTag(n, SID)));
		JsNodeList<? extends JsElement> flds = Nodes.getElementsByTagName(n, FLD);
		for (int i = 0, len = flds.length(); i < len; i++) {
			JsNode f = flds.get(i);
			o.var(
					getText(
							getFirstByTag(f, IDX)
					),
					deserialize(
							Nodes.firstChild(
									getFirstByTag(f, VAL)
							)
					)
			);
		}
	}

	private static final JsElement getFirstByTag(JsNode node, String tag) {
		return Nodes.getElementsByTagName(node, tag).get(0);
	}

	private static final String getText(JsNode n) {
		return Nodes.nodeValue(Nodes.firstChild(n));
	}

	private final Object deserialize(JsNode n) {
		String t = Nodes.tagName(n);
		if (t == NUM) {
			return Global.parseFloat(getText(n));
		}
		if (t == STR) {
			return getText(n);
		}
		return object(getText(n));
	}
}
