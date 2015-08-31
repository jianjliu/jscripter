
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

package jsx;

import js.ArrayLike;
import js.Disposable;
import js.Js;
import js.Value;
import js.Vars;

/**
 * <p>A utility class, with its static methods, providing facilities to operate on 
 * HTML templates.</p>
 * <p>A template in JScripter(JS) Class Library is actually an array of strings.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Template extends Disposable
{
	private Template() {}

	/**
	 * <p>Applies a template by itself.</p>
	 * @return The result string.
	 * @since 1.0
	 */
	public static final String apply(ArrayLike<String> tmplt) {
		return apply(tmplt, new Vars<String>().var());
	}

	/**
	 * <p>Applies a template to an argument string.</p>
	 * @param tmplt The template (an array of strings) to apply.
	 * @param arg The argument string.
	 * @return The result string.
	 * @since 1.0
	 */
	public static final String apply(ArrayLike<String> tmplt, String arg) {
		return apply(tmplt, create(arg));
	}

	/**
	 * <p>Applies a template to an array of parameter strings.</p>
	 * @param tmplt The template (an array of strings) to apply.
	 * @param paras The parameters, which is also an array of strings.
	 * @return The result string.
	 * @since 1.0
	 */
	public static final String apply(ArrayLike<String> tmplt, ArrayLike<String> paras) {
		Value.String html = new Value.String("");
		int tlen = tmplt.length();
		int plen = paras.length();
		if (tlen < plen) {
			for (int i = 0; i < tlen; i++) {
				html.aadd(paras.get(i));
				html.aadd(tmplt.get(i));
			}
			for (int i = tlen; i < plen; i++) {
				html.aadd(paras.get(i));
			}
		} else {
			for (int i = 0; i < plen; i++) {
				html.aadd(tmplt.get(i));
				html.aadd(paras.get(i));
			}
			for (int i = plen; i < tlen; i++) {
				html.aadd(tmplt.get(i));
			}
		}
		return html.var();
	}

	/**
	 * <p>Creates a template with a single argument string.</p>
	 * @param s The argument string.
	 * @return The result template.
	 * @since 1.0
	 */
	public static final ArrayLike<String> create(String s) {
		return new Vars<String>().add(s).var();
	}

	/**
	 * <p>The template for creating XML starting tags.</p>
	 * @since 1.0
	 */
	public final static ArrayLike<String> START = new Vars<String>().add("<").add(">").var();
	/**
	 * <p>The template for creating XML closing tags.</p>
	 * @since 1.0
	 */
	public final static ArrayLike<String> CLOSE = new Vars<String>().add(Js.add("<", "/")).add(">").var();

	/**
	 * <p>Creates a template for creating XML elements with starting and closing tag names.</p>
	 * @param start The start tag name.
	 * @param close The close tag name.
	 * @return The result template.
	 * @since 1.0
	 */
	public static final ArrayLike<String> element(String start, String close) {
		return new Vars<String>().add(Template.apply(START, Template.create(start)))
		                         .add(Template.apply(CLOSE, Template.create(close)))
		                         .var();
	}
	/**
	 * <p>Creates a template for creating XML elements with the tag name.</p>
	 * @param tag The tag name.
	 * @return The result template.
	 * @since 1.0
	 */
	public static final ArrayLike<String> element(String tag) {
		return element(tag, tag);
	}
	/**
	 * <p>Creates a template for creating XML attributes with the attribute name.</p>
	 * @param attr The attribute name.
	 * @return The result template.
	 * @since 1.0
	 */
	public static final ArrayLike<String> attr(String attr) {
		return new Vars<String>().add(
				Code.join(" ", attr, "=")
		).var();
	}

	/**
	 * <p>The template for creating HTML &lt;button&gt;&lt;/button&gt; elements.</p>
	 * @since 1.0
	 */
	public final static ArrayLike<String> BUTTON = element("button");
	/**
	 * <p>The template for creating HTML &lt;div&gt;&lt;/div&gt; elements.</p>
	 * @since 1.0
	 */
	public final static ArrayLike<String> DIV    = element("div"   );
	/**
	 * <p>The template for creating HTML &lt;label&gt;&lt;/label&gt; elements.</p>
	 * @since 1.0
	 */
	public final static ArrayLike<String> LABEL  = element("label" );
	/**
	 * <p>The template for creating HTML &lt;li&gt;&lt;/li&gt; elements.</p>
	 * @since 1.0
	 */
	public final static ArrayLike<String> LI     = element("li"    );
	/**
	 * <p>The template for creating HTML &lt;ul&gt;&lt;/ul&gt; elements.</p>
	 * @since 1.0
	 */
	public final static ArrayLike<String> UL     = element("ul"    );
	/**
	 * <p>The template for creating HTML &lt;span&gt;&lt;/span&gt; elements.</p>
	 * @since 1.0
	 */
	public final static ArrayLike<String> SPAN   = element("span"  );
}
