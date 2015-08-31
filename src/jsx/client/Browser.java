
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

package jsx.client;

import js.Field;
import js.Disposable;
import js.Js;
import js.Static;
import js.Var;
import js.user.JsHTMLElement;
import js.user.JsNavigator;

/**
 * <p>A utility class accessing the properties of {@link js.user.JsWindow#navigator}.</p>
 * <p>Users are encouraged to use the utilities provided by this class instead of the 
 * <b>opaque</b> methods of {@link js.user.JsNavigator} in consideration of the reuse 
 * benefit for re-compilation results.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Browser extends Disposable
{
	private Browser() {}

	/**
	 * <p>Statically accesses a property of <tt>navigator</tt> by the name of this field. 
	 * @see js.user.JsNavigator
	 * @since 1.0
	 */
	public final static Var<String> userAgent = new Static<String>(new Field<String>(Win.navigator, JsNavigator.userAgent));
	/**
	 * <p>Statically accesses a property of <tt>navigator</tt> by the name of this field. 
	 * @see js.user.JsNavigator
	 * @since 1.0
	 */
	public final static Var<Boolean> cookieEnabled = new Static<Boolean>(new Field<Boolean>(Win.navigator, JsNavigator.cookieEnabled));

	/**
	 * <p>Determines whether the current browser supports {@link JsHTMLElement#insertAdjacentHTML}.</p>
	 * @since 1.0
	 */
	public static final boolean canInsertHTML = Js.be(JsHTMLElement.insertAdjacentHTML.with(Document.body.var()));
	/**
	 * <p>Determines whether the current browser supports {@link Client#XMLHttpRequest}.</p>
	 * @since 1.0
	 */
	public static final boolean hasXMLHttpRequest = Js.be(Client.XMLHttpRequest.var());

	/**
	 * <p>Determines whether the {@link #userAgent} of the current browser 
	 * case-insensitively contains a specified string.</p>
	 * @param s A string.
	 * @return <tt>true</tt> if the {@link #userAgent} of the current browser 
	 * case-insensitively contains <tt>s</tt>, <tt>false</tt> otherwise.
	 * @since 1.0
	 */
	public static final boolean userAgent(String s) {
		return Js.re(s, "i").test(userAgent.var());
	}
	/**
	 * <p>Determines whether the running browser supports AdobeAir.</p>
	 * @since 1.0
	 */
	public static final boolean isAdobeAir = userAgent("AdobeAir");
	/**
	 * <p>Determines whether the running browser supports Chrome.</p>
	 * @since 1.0
	 */
	public static final boolean isChrome   = userAgent("Chrome"  );
	/**
	 * <p>Determines whether the running browser supports Gecko.</p>
	 * @since 1.0
	 */
	public static final boolean isGecko    = userAgent("Gecko"   );
	/**
	 * <p>Determines whether the running browser supports Firefox.</p>
	 * @since 1.0
	 */
	public static final boolean isFirefox  = userAgent("Firefox" );
	/**
	 * <p>Determines whether the running browser supports Internet Explorer.</p>
	 * @since 1.0
	 */
	public static final boolean isIE       = userAgent("MSIE"    );
	/**
	 * <p>Determines whether the running browser supports Internet Explorer 7.</p>
	 * @since 1.0
	 */
	public static final boolean isIE7      = userAgent("MSIE 7"  );
	/**
	 * <p>Determines whether the running browser supports Internet Explorer 8.</p>
	 * @since 1.0
	 */
	public static final boolean isIE8      = userAgent("MSIE 8"  );
	/**
	 * <p>Determines whether the running browser supports Internet Explorer 9.</p>
	 * @since 1.0
	 */
	public static final boolean isIE9      = userAgent("MSIE 9"  );
	/**
	 * <p>Determines whether the running browser supports Opera.</p>
	 * @since 1.0
	 */
	public static final boolean isOpera    = userAgent("Opera"   );
	/**
	 * <p>Determines whether the running browser supports Safari.</p>
	 * @since 1.0
	 */
	public static final boolean isSafari   = userAgent("Safari"  );
	/**
	 * <p>Determines whether the running browser supports WebKit.</p>
	 * @since 1.0
	 */
	public static final boolean isWebKit   = userAgent("WebKit"  );

	/**
	 * <p>Determines whether the running browser supports Linux.</p>
	 * @since 1.0
	 */
	public static final boolean isLinux    = userAgent("Linux"             );
	/**
	 * <p>Determines whether the running browser supports Macintosh.</p>
	 * @since 1.0
	 */
	public static final boolean isMac      = userAgent("Macintosh|Mac OS X");
	/**
	 * <p>Determines whether the running browser supports Windows.</p>
	 * @since 1.0
	 */
	public static final boolean isWindows  = userAgent("Windows|Win32"     );
}
