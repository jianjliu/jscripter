
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

package jsx.http.rpc.server;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import js.ArrayLike;
import js.Js;
import js.ObjectLike;
import js.Vars;
import jsx.core.ArrayLikes;
import jsx.http.rpc.XMLHttpContext;

/**
 * <p>An abstract class for XML & HTTP serialization contexts at server-side.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public abstract class XMLHttpServer extends XMLHttpContext
{
	/**
	 * <p>The default constructor for the contexts of this class type.</p>
	 * <p>The constructor simply invokes the default constructor of the super class.</p>
	 * @since 1.0
	 */
	protected XMLHttpServer() {
		super();
	}

	/**
	 * <p>Calls this context as a server-side method with the base object and arguments.</p>
	 * @param base The base object for calling.
	 * @param args An array of arguments for the calling.
	 * @return The result of the call.
	 * @since 1.0
	 */
	protected abstract Object call(ObjectLike base, ArrayLike<?> args);

	/**
	 * <p>Makes this connection context respond against a {@link InputSource}.</p>
	 * @param is The {@link InputSource} to the connection context.
	 * @return The response XML document for the remote call.
	 * @since 1.0
	 */
	public final String respond(InputSource is)
		throws ParserConfigurationException, SAXException, IOException {
		Document request = DocumentBuilderFactory.newInstance()
			.newDocumentBuilder().parse(is);
		updateContext(request);
		ObjectLike base = getBase(request);
		ArrayLike<?> args = getArguments(request);
		Object ret = call(base, args);
		if (Js.not(type(ret))) {
			sid(unwrap(ret));
		}
		String s = xelt(CNTX, serialize());
		if (ret != null) {
			s = Js.add(xelt(RTRN, serialize(ret, 0)), s);
		}
		s = Js.add(xelt(SIDS, sids()), s);
		release();
		return doc(xelt(XML, s));
	}

	private static final Node getFirstByTag(Node n, String tag) {
		return getElementsByTagName(n, tag).item(0);
	}

	private final Object deserialize(Node n) {
		String t = n.getNodeName();
		if (t == NUM) {
			return Double.parseDouble(getText(n));
		}
		if (t == STR) {
			return getText(n);
		}
		return object(getText(n));
	}

	private final ObjectLike getBase(Document request) {
		return object(getText(getFirstByTag(request, BASE).getFirstChild()));
	}

	private final ArrayLike<?> getArguments(Document request) {
		ArrayLike<?> ret = new Vars<Object>().var();
		Node arg = getFirstByTag(request, ARGS).getFirstChild();
		while (arg != null) {
			ArrayLikes.push(ret, deserialize(arg));
			arg = arg.getNextSibling();
		}
		return ret;
	}

	private final void updateContext(Document request) {
		expand(getText(getFirstByTag(request, SIDS)));
		Node n = getFirstByTag(request, CNTX).getFirstChild();
		while (Js.be(n)) {
			updateObject(n);
			n = n.getNextSibling();
		}
	}

	private final void updateObject(Node n) {
		ObjectLike o = object(getText(getFirstByTag(n, SID)));
		NodeList flds = getElementsByTagName(n, FLD);
		for (int i = 0, len = flds.getLength(); i < len; i++) {
			Node f = flds.item(i);
			o.var(
					getText(
							getFirstByTag(f, IDX)
					),
					deserialize(
							getFirstByTag(f, VAL).getFirstChild()
					)
			);
		}
	}

	private static final NodeList getElementsByTagName(Node n, String tagname) {
		return n instanceof Document ? ((Document)n).getElementsByTagName(tagname) :
			((Element)n).getElementsByTagName(tagname);
	}

	private static final String getText(Node n) {
		return n.getFirstChild().getNodeValue();
	}
}
