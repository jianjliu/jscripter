
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

package jsx.ui.css;

import js.Disposable;
import js.Js;
import js.Vars;
import js.user.JsElement;
import js.user.JsHTMLLinkElement;
import jsx.Code;
import jsx.client.Document;
import jsx.client.Browser;
import jsx.core.ArrayLikes;
import jsx.dom.Nodes;
import jsx.ui.Widget;

/**
 * <p>A utility class providing static methods to manage external style sheets
 * for the current HTML document.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class StyleSheets extends Disposable
{
	private StyleSheets() {}

	/**
	 * <p>Appends a new external style sheet to the current HTML document.</p>
	 * @param url The resource locator for the external style sheet.
	 * @since 1.0
	 */
	public static final void create(String url) {
		Nodes.appendChild(
				Document.head(),
				createLink(url)
		);
	}

	/**
	 * <p>Creates the external file name of the style sheet for a class of widgets.</p>
	 * @param cls A class of widgets.
	 * @return The external file name of the style sheet for that class of widgets
	 * @since 1.0
	 */
	public static final String css(Class<? extends Widget> cls) {
		return Code.ref(cls.getName(), "css");
	}

	/**
	 * <p>Links all style sheets under a named base folder.</p>
	 * @param base The name of a base folder.
	 * @since 1.0
	 */
	public static final void link(String base) {
		create(def(base, "all"));
	}

	/**
	 * <p>Links a named external style sheet under a named base folder.</p>
	 * @param base The name of a base folder.
	 * @param css The file name of an external style sheet.
	 * @since 1.0
	 */
	public static final void link(String base, String css) {
		create(Code.sub(base, css));
	}

	/**
	 * <p>Gets the default folder under a named base for system external style sheets.</p>
	 * @param base The name of a base folder.
	 * @return The default folder for system external style sheets.
	 * @since 1.0
	 */
	public static final String def(String base) {
		return ArrayLikes.join(
				new Vars<String>().add(base)
				                  .add("css")
				                  .add("def")
				                  .var(),
				"/"
		);
	}

	/**
	 * <p>Links all the system default external style sheets.</p>
	 * @since 1.0
	 */
	public static final void prelink() {
		if (Js.not(prelinks)) {
			prelink(".");
//			prelink("http://www.jscripter.org");
			prelinks++;
		}
	}

	private static int prelinks = 0;

	private static final String def(String base, String css) {
		return Code.sub(base, Code.ref(css, "css"));
	}
	private static final JsElement createLink(String url) {
		JsElement e = Document.createElement("link");
		JsHTMLLinkElement.rel.with(e, "stylesheet");
		JsHTMLLinkElement.type.with(e, Code.sub("text", "css"));
		JsHTMLLinkElement.href.with(e, url);
		return e;
	}
	private static final void prelink(String base) {
		String all = def(def(base), "all");
		if (Browser.isIE) {
			Document.createStyleSheet(all, 0);
		} else {
			Document.head().insertBefore(
					createLink(all),
					Nodes.firstChild(Document.head())
			);
		}
	}
}
