
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
import js.Index;
import js.ObjectLike;
import js.user.JsDocument;
import js.user.JsXMLHttpRequest;
import jsx.Code;
import jsx.http.Ajax;
import jsx.http.Http;
import jsx.http.event.HTTPLoaded;
import jsx.http.event.OnHTTPLoaded;

/**
 * <p>An abstract base class for XMLHTTP remote objects.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public abstract class XMLHttpRemote extends HttpRemote
{
	/**
	 * <p>A typical constructor which simply invokes the typical constructor of the 
	 * superclass passing the initializing object as argument.</p>
	 * @param ini An object of {@link ObjectLike} for configuration. 
	 * @since 1.0
	 */
	protected XMLHttpRemote(ObjectLike ini) {
		super(ini);
	}

	/**
	 * <p>A typical constructor which simply invokes the typical constructor of the 
	 * superclass passing the {@link XMLHttpRemote} object as argument.</p>
	 * @param o An object of {@link XMLHttpRemote}. 
	 * @since 1.0
	 */
	protected XMLHttpRemote(XMLHttpRemote o) {
		super(o);
	}

	/**
	 * <p>A typical constructor for creating fields of this type.</p>
	 * @param base The base object of the field being created. 
	 * @param idx The {@link js.Index} in the base object for the field being created. 
	 * @since 1.0
	 */
	protected XMLHttpRemote(XMLHttpRemote base, Index<? extends XMLHttpRemote> idx) {
		super(base.get(idx));
	}

	/**
	 * <p>Calls a remote method with the current instance.</p>
	 * @param url A HTTP resource locator of the remote method. 
	 * @param args An array of arguments for the invocation. 
	 * @return The value returned from the invocation. The value can only be a number, 
	 * string or {@link ObjectLike}. 
	 * @since 1.0
	 */
	@Override
	protected final Object call(String url, ArrayLike<?> args) {
		JsXMLHttpRequest http = Http.create();
		Http.open(http, "POST", url, false);
		Http.setRequestHeader(
				http,
				Code.hyphen("Content", "type"),
				Code.sub("text", "xml")
		);
		XMLHttpClient c = new XMLHttpClient();
		Http.send(http, c.body(this, args));
		JsDocument response = Http.responseXML(http);
		c.updateContext(response);
		Object ret = c.getReturn(response);
		c.release();
		return ret;
	}

	/**
	 * <p>Client-side XML & HTTP serialization contexts for asynchronous connections.</p>
	 * <p>A {@link Caller} is also an event listener that handles {@link HTTPLoaded} events 
	 * fired from its underlying {@link Ajax} connection.</p>
	 * 
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 */
	public abstract class Caller extends XMLHttpClient implements OnHTTPLoaded
	{
		private final String url;
		private final Ajax ajax;

		/**
		 * <p>A typical constructor which invokes the typical constructor of the 
		 * superclass without arguments, creates an {@link Ajax} connection and then listens
		 * the connection for {@link HTTPLoaded} events.</p>
		 * @param url A HTTP resource locator of the connection. 
		 * @since 1.0
		 */
		protected Caller(String url) {
			super();
			this.url = url;
			ajax = new Ajax();
			ajax.addListener(HTTPLoaded.class, this);
		}

		/**
		 * <p>Calls back with a return value.</p>
		 * <p>The subclasses implements this method to get return value from the asynchronous
		 * call connection.</p>
		 * @param ret The return value.
		 * @since 1.0
		 */
		protected abstract void callback(Object ret);

		/**
		 * <p>Initiates an asynchronous call through the connection with the specified arguments.</p>
		 * @param args An array of arguments.
		 * @since 1.0
		 */
		public final void call(final ArrayLike<?> args) {
			release();
			ajax.post(url, body(XMLHttpRemote.this, args));
		}

		/**
		 * <p>Performs an action on the dispatched event.</p>
		 * <p>This method retrieves the XML response, updates the calling context and 
		 * calls {@link #callback(Object)} with the return value.</p>
		 * @param evt The event dispatched to this listener.
		 * @since 1.0
		 */
		public void onEvent(HTTPLoaded evt) {
			JsDocument response = Http.responseXML(ajax.http());
			updateContext(response);
			callback(getReturn(response));
			release();
		}
	}
}
