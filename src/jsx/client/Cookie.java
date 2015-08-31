
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

import js.ArrayLike;
import js.Id;
import js.Initializer;
import js.Js;
import js.ObjectLike;
import js.Value;
import js.user.JsHTMLDocument;
import jsx.Configurable;
import jsx.core.ArrayLikes;
import jsx.core.StringLikes;
import jsx.core.Variables;

/**
 * <p>A class of cookie objects, with its static methods, providing utilities 
 * for managing client-side persistence.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Cookie extends Configurable
{
	private final static Id<String> NAME = new Id<String>();
	private final static Id<ObjectLike> CACHE = new Id<ObjectLike>();

	private Cookie(ObjectLike ini) {
		super(ini);
	}

	/**
	 * <p>Gets the underline cache object from the given cookie.</p>
	 * @param c A cookie object of this class.
	 * @return The actual cache object wrapped by the given cookie object.
	 * @since 1.0
	 */
	public static ObjectLike getCache(Cookie c) {
		return ini(c).var(CACHE);
	}

	/**
	 * <p>Gets the cookie name from the given cookie object.</p>
	 * @param c A cookie object of this class.
	 * @return The cookie name of the given cookie object.
	 * @since 1.0
	 */
	public static String getName(Cookie c) {
		return ini(c).var(NAME);
	}


	/**
	 * <p>Creates a cookie object by the cookie name.</p>
	 * @param name The cookie name.
	 * @return The newly created cookie object.
	 * @since 1.0
	 */
	@SuppressWarnings("unchecked")
	public static Cookie cache(String name) {
		String all = JsHTMLDocument.cookie.with(Win.document.var());
		if (Js.not(all)) {
			return null;
		}
		ArrayLike<String> pairs = (ArrayLike<String>)StringLikes.split(all, ";");
		String s = Js.add(name, "=");
		int slen = s.length();
		String c = null;
		for (int i = 0, len = ArrayLikes.length(pairs); i < len; i++) {
			String p = pairs.get(i);
			if (Js.eq(StringLikes.substring(p, 0, slen), s)) {
				c = p;
				break;
			}
		}
		if (Js.not(c)) {
			return null;
		}

		ObjectLike cache = new Initializer().var();

		Cookie cookie = new Cookie(new Initializer().set(
				NAME, name
		).set(
				CACHE, cache
		).var());

		ArrayLike<String> a = (ArrayLike<String>)StringLikes.split(
				StringLikes.substring(c, slen), "&"
		);

		for (int i = 0, len = ArrayLikes.length(a); i < len; i++) {
			ArrayLike<String> ap = (ArrayLike<String>)StringLikes.split(a.get(i), ":");
			cache.var(ap.get(0), Global.decodeURIComponent(ap.get(1)));
		}

		return cookie;
	}

	/**
	 * <p>Persists a cookie object.</p>
	 * @param cookie The cookie object to persist.
	 * @param sec The <tt>max-age</tt> attribute in seconds of the cookie.
	 * @param path The <tt>path</tt> attribute of the cookie.
	 * @param domain The <tt>domain</tt> attribute of the cookie.
	 * @param secure The <tt>secure</tt> attribute of the cookie.
	 * @since 1.0
	 */
	public static void store(Cookie cookie, Number sec, String path, String domain, boolean secure) {
		Value.String v = new Value.String("");
		ObjectLike cache = getCache(cookie);
		ArrayLike<String> keys = Js.keys(cache);
		for (int i = 0, len = ArrayLikes.length(keys); i < len; i++) {
			if (Js.not(v)) {
				v.aadd("&");
			}
			String k = keys.get(i);
			v.aadd(Js.add(Js.add(k, ":"), Global.encodeURIComponent(cache.var(k))));
		}
		Value.String c = new Value.String(
				cook(getName(cookie), v.var())
		);
		if (Variables.defined(sec)) {
			c.aadd(age(sec));
		}
		if (Js.be(path)) {
			c.aadd(Js.add(";path=", path));
		}
		if (Js.be(domain)) {
			c.aadd(Js.add(";domain=", domain));
		}
		if (secure) {
			c.aadd(";secure");
		}
		JsHTMLDocument.cookie.with(
				Win.document.var(),
				c
		);
	}

	/**
	 * <p>Removes a cookie from the browsers local store.</p>
	 * @param cookie The cookie object to persist.
	 * @param path The <tt>path</tt> attribute of the cookie.
	 * @param domain The <tt>domain</tt> attribute of the cookie.
	 * @param secure The <tt>secure</tt> attribute of the cookie.
	 * @since 1.0
	 */
	public static void remove(Cookie cookie, String path, String domain, boolean secure) {
		ini(cookie).var(CACHE, new Initializer().var());
		store(cookie, 0, path, domain, secure);
	}

	private static final String cook(String name, String value) {
		return Js.add(name, Js.add("=", value));
	}

	private static final String age(Number stl) {
		return Js.add(";max-age=", stl);
	}

	private static Boolean isCookieEnabled;

	/**
	 * <p>Determine whether cookies are enabled.</p>
	 * @return <tt>true</tt> if they appear to be enabled and <tt>false</tt> otherwise.
	 * @since 1.0
	 */
	public static final boolean isEnabled() {
		Boolean cookieEnabled = Browser.cookieEnabled.var();
		if (Variables.defined(cookieEnabled)) {
			return cookieEnabled;
		}
		if (Variables.defined(isCookieEnabled)) {
			return isCookieEnabled;
		}
		String cookie = cook(Cookie.class.getName(), Cookie.class.getName());
		JsHTMLDocument.cookie.with(
				Win.document.var(),
				Js.add(cookie, age(9999))
		);
		if (JsHTMLDocument.cookie.with(Win.document.var()).indexOf(cookie) == -1) {
			return isCookieEnabled = false;
		} else {
			JsHTMLDocument.cookie.with(
					Win.document.var(),
					Js.add(cookie, age(0))
			);
			return isCookieEnabled = true;
		}
	}
}
