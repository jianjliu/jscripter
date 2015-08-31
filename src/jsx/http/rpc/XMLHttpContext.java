
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
import js.Vars;
import jsx.core.ArrayLikes;

/**
 * <p>An abstract base class for an XML based serialization through HTTP context.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public abstract class XMLHttpContext extends HttpRemote.Context
{
	/**
	 * <p>The tag name for arguments.</p>
	 * @since 1.0
	 */
	protected final static String ARGS = "args";
	/**
	 * <p>The tag name for base objects.</p>
	 * @since 1.0
	 */
	protected final static String BASE = "base";
	/**
	 * <p>The tag name for contexts.</p>
	 * @since 1.0
	 */
	protected final static String CNTX = "cntx";
	/**
	 * <p>The tag name for return value.</p>
	 * @since 1.0
	 */
	protected final static String RTRN = "rtrn";
	/**
	 * <p>The tag name for serialization ids.</p>
	 * @since 1.0
	 */
	protected final static String SIDS = "sids";

	/**
	 * <p>The tag name for objects.</p>
	 * @since 1.0
	 */
	protected final static String OBJ = "obj";
	/**
	 * <p>The tag name for numbers.</p>
	 * @since 1.0
	 */
	protected final static String NUM = "num";
	/**
	 * <p>The tag name for strings.</p>
	 * @since 1.0
	 */
	protected final static String STR = "str";
	/**
	 * <p>The tag name for XML.</p>
	 * @since 1.0
	 */
	protected final static String XML = "xml";
	/**
	 * <p>The tag name for object fields.</p>
	 * @since 1.0
	 */
	protected final static String FLD = "fld";
	/**
	 * <p>The tag name for {@link js.Index} of object fields.</p>
	 * @since 1.0
	 */
	protected final static String IDX = "idx";
	/**
	 * <p>The tag name for field values.</p>
	 * @since 1.0
	 */
	protected final static String VAL = "val";

	/**
	 * <p>The default constructor for the contexts of this class type.</p>
	 * <p>The constructor simply invokes the default constructor of the super class.</p>
	 * @since 1.0
	 */
	protected XMLHttpContext() {
		super();
	}

	/**
	 * <p>Creates an XML document.</p>
	 * @param v The content of the document being created.
	 * @return The document.
	 * @since 1.0
	 */
	protected static final String doc(String v) {
		return Js.add("<?xml version=\"1.0\" encoding=\"utf-8\"?>", v);
	}

	/**
	 * <p>Creates an XML element.</p>
	 * @param t The tag name of the XML element being created.
	 * @param v The content of the XML element being created.
	 * @return The XML element.
	 * @since 1.0
	 */
	protected static final String xelt(String t, String v) {
		return new Vars<String>().add("<").add(t).add(">").add(v)
		                         .add("<").add("/").add(t).add(">")
		                         .var().join("");
	}

	/**
	 * <p>Creates an XML element representing an object field.</p>
	 * @param idx The {@link js.Index} of the field.
	 * @param val The value of the field.
	 * @return The XML element.
	 * @since 1.0
	 */
	protected static final String fld(String idx, String val) {
		return xelt(
				FLD,
				Js.add(
						xelt(IDX, idx),
						xelt(VAL, val)
				)
		);
	}

	private final static ArrayLike<String> tags = new Vars<String>().add(OBJ)
	                                                                .add(NUM)
	                                                                .add(STR).var();

	/**
	 * <p>Serializes an object to the specified depth into the current context.</p>
	 * @param o A number, string, {@link ObjectLike} or {@link HttpRemote}. 
	 * @return A serialization of the specified object. 
	 * @since 1.0
	 */
	@Override
	protected final String serialize(Object o, int depth) {
		int t = type(o);
		String tag = tags.get(t);
		if (Js.be(t)) {
			return xelt(tag, Js.toString(o));
		}
		if (depth < 1) {
			return xelt(tag, sid(unwrap(o)));
		}
		String s = depth > 1 ? "" : xelt(SID, sid(unwrap(o)));
		ArrayLike<String> ids = Js.keys(unwrap(o));
		for (int i = 0, len = ArrayLikes.length(ids); i < len; i++) {
			String id = ids.get(i);
			if (Js.be(id) && id != SID) {
				String v = serialize(
						unwrap(o).var(id),
						depth - 1
				);
				s = depth > 1 ? Js.add(s, v) : Js.add(s, fld(id, v));
			}
		}
		return depth > 1 ? s : xelt(tag, s);
	}
}
