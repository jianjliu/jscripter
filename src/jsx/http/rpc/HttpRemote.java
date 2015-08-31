
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
import js.Disposable;
import js.Id;
import js.Index;
import js.Initializer;
import js.Js;
import js.ObjectLike;
import jsx.Configurable;
import jsx.client.Global;
import jsx.core.ArrayLikes;
import jsx.core.ObjectLikes;

/**
 * <p>An abstract base class for HTTP remote objects.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public abstract class HttpRemote extends Disposable
{
	private final ObjectLike ini;

	/**
	 * <p>The typical constructor which simply invokes the typical constructor of the 
	 * superclass passing the initializing object as argument.</p>
	 * @param o An object of {@link HttpRemote} or {@link ObjectLike}. 
	 * @since 1.0
	 */
	protected HttpRemote(Object o) {
		this.ini = o instanceof HttpRemote ? ((HttpRemote)o).ini : (ObjectLike)o;
	}

	/**
	 * <p>Calls a remote method with the current instance.</p>
	 * <p>Subclasses should provide a concrete implementation.</p>
	 * @param url A HTTP resource locator of the remote method. 
	 * @param args An array of arguments for the invocation. 
	 * @return The value returned from the invocation. The value can only be a number, 
	 * string or {@link ObjectLike}. 
	 * @since 1.0
	 */
	protected abstract Object call(String url, ArrayLike<?> args);

	/**
	 * <p>Gets the value of the number field of an HTTP remote object.</p>
	 * @param base A HTTP remote object to get the number field from. 
	 * @param idx The index specifying the number field. 
	 * @return The number value of the desired field. 
	 * @since 1.0
	 */
	public static final Number number(HttpRemote base, Index<Number> idx) {
		return base.ini.var(idx);
	}

	/**
	 * <p>Sets value of the number field of an HTTP remote object.</p>
	 * @param base A HTTP remote object to set number field to. 
	 * @param idx The index specifying the number field. 
	 * @param val The new number value to set. 
	 * @return The new value of the number field. 
	 * @since 1.0
	 */
	public static final Number number(HttpRemote base, Index<Number> idx, Number val) {
		return base.ini.var(idx, val);
	}

	/**
	 * <p>Gets the value of the string field of an HTTP remote object.</p>
	 * @param base A HTTP remote object to get the string field from. 
	 * @param idx The index specifying the string field. 
	 * @return The string value of the desired field. 
	 * @since 1.0
	 */
	public static final String string(HttpRemote base, Index<String> idx) {
		return base.ini.var(idx);
	}

	/**
	 * <p>Sets value of the string field of an HTTP remote object.</p>
	 * @param base A HTTP remote object to set string field to. 
	 * @param idx The index specifying the string field. 
	 * @param val The new string value to set. 
	 * @return The new value of the string field. 
	 * @since 1.0
	 */
	public static final String string(HttpRemote base, Index<String> idx, String val) {
		return base.ini.var(idx, val);
	}

	/**
	 * <p>Sets an object field of an HTTP remote object.</p>
	 * @param base A HTTP remote object to set field to. 
	 * @param idx The index specifying the object field. 
	 * @param o The new value to set. 
	 * @return The new value of the object field. 
	 * @since 1.0
	 */
	public static final <T extends HttpRemote> T set(HttpRemote base, Index<T> idx, T o) {
		return base.ini.var(idx, o);
	}

	/**
	 * <p>Gets the value of the object field of the current HTTP remote object.</p>
	 * @param idx The index specifying the object field. 
	 * @return The value of the specified field. 
	 * @since 1.0
	 */
	protected final Object get(Index<? extends HttpRemote> idx) {
		return ini.var(new Id<Object>(idx));
	}

	/**
	 * <p>An abstract base class for an HTTP serialization context.</p>
	 * 
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 */
	public static abstract class Context extends Configurable
	{
		/**
		 * <p>Unwraps an object.</p>
		 * @param o An object of {@link HttpRemote} or {@link ObjectLike}. 
		 * @return An object of {@link ObjectLike}. 
		 * @since 1.0
		 */
		protected static final ObjectLike unwrap(Object o) {
			return o instanceof HttpRemote ? ((HttpRemote)o).ini : (ObjectLike)o;
		}

		/**
		 * <p>The prefix for serialization IDs.</p>
		 * @since 1.0
		 */
		protected final static String SID = "sid";
		private int sids = 0;

		/**
		 * <p>The default constructor.</p>
		 * @since 1.0
		 */
		protected Context() {
			super(new Initializer().var());
		}

		/**
		 * <p>Serializes the total number of the serialization IDs for the current context.</p>
		 * @return The total number of the serialization IDs for the current context. 
		 * @since 1.0
		 */
		protected final String sids() {
			return Js.toString(sids);
		}

		/**
		 * <p>Serializes an object to the specified depth into the current context.</p>
		 * @param o A number, string, {@link ObjectLike} or {@link HttpRemote}. 
		 * @return A serialization of the specified object. 
		 * @since 1.0
		 */
		protected abstract String serialize(Object o, int depth);

		/**
		 * <p>Serializes the current context.</p>
		 * @return A serialization of the current context. 
		 * @since 1.0
		 */
		protected final String serialize() {
			return serialize(ini(this), 2);
		}

		/**
		 * <p>Creates a new serialization ID for the current context.</p>
		 * @return The newly created serialization ID. 
		 * @since 1.0
		 */
		private final String sid() {
			String sid = Js.add(SID, sids++);
			if (Js.not(ini(this).var(sid))) {
				return sid;
			}
			return sid();
		}

		/**
		 * <p>Determines the type of an object.</p>
		 * @param o A number, string or {@link ObjectLike}. 
		 * @return The type index of the object. 1 for a number, 2 for a string and 
		 * 0 for an object. 
		 * @since 1.0
		 */
		protected static final int type(Object o) {
			return o instanceof Number ? 1 : o instanceof String ? 2 : 0;
		}

		/**
		 * <p>Gets the serialization ID of the specified object in the current context.</p>
		 * @param o An object. 
		 * @return The serialization ID of the specified object in the current context. 
		 * @since 1.0
		 */
		protected final String sid(ObjectLike o) {
			String sid = (String)o.var(SID);
			if (Js.not(sid)) {
				sid = sid();
				o.var(SID, sid);
			}
			if (Js.not(ini(this).var(sid))) {
				ini(this).var(sid, o);
				ArrayLike<String> ids = Js.keys(o);
				for (int i = 0, len = ArrayLikes.length(ids); i < len; i++) {
					Object v = o.var(ids.get(i));
					if (Js.not(type(v))) {
						sid(unwrap(o));
					}
				}
			}
			return sid;
		}

		/**
		 * <p>Expands the current context to have the specified total number of 
		 * serialization IDs.</p>
		 * @param ids The total number of serialization IDs. 
		 * @since 1.0
		 */
		protected final void expand(String ids) {
			int n = Global.parseInt(ids);
			while (n > sids) {
				object(sid());
			}
		}

		/**
		 * <p>Releases the current context.</p>
		 * @since 1.0
		 */
		protected final void release() {
			ArrayLike<String> sids = Js.keys(ini(this));
			for (int i = 0, len = ArrayLikes.length(sids); i < len; i++) {
				String sid = sids.get(i);
				ObjectLikes.delete((ObjectLike)ini(this).var(sid), SID);
			}
			this.sids = 0;
		}

		/**
		 * <p>Gets an object with its serialization ID in the current context.</p>
		 * @param sid A serialization ID in the current context. 
		 * @return The object with the serialization ID in the current context. 
		 * @since 1.0
		 */
		protected final ObjectLike object(String sid) {
			ObjectLike o = (ObjectLike)ini(this).var(sid);
			if (Js.not(o)) {
				o = new Initializer().var();
				o.var(SID, sid);
				ini(this).var(sid, o);
			}
			return o;
		}
	}
}
