
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

package jsx.http;

import js.Function;
import js.Id;
import js.Initializer;
import js.Js;
import js.ObjectLike;
import js.user.JsXMLHttpRequest;
import jsx.Configurable;
import jsx.Source;
import jsx.Timeout;
import jsx.client.Browser;
import jsx.core.Variables;
import jsx.http.event.HTTPAborted;
import jsx.http.event.HTTPLoaded;
import jsx.http.event.HTTPOpen;
import jsx.http.event.HTTPReceiving;
import jsx.http.event.HTTPSent;
import jsx.http.event.HTTPState;

/**
 * <p>Facilitates the administration of asynchronous HTTP connections and transmissions 
 * eliminating browser dependencies.</p>
 * <p>Note that, an {@link Ajax} object is an event source and therefore {@link Configurable}. 
 * An object of this class fires HTTP events of types extended from {@link HTTPState}. 
 * This class is quite intuitive and handy for creating Ajax applications in Java manner.</p>
 * <p>A use of this class involves three steps in a logical sense:
 * <ol>
 * <li>Create an object of this class with the default constructor {@link Ajax#Ajax()}.</li>
 * <li>Add necessary event listeners to the created object preparing to receive data from 
 * the {@link JsXMLHttpRequest} object obtained with its {@link Ajax#http()} method.</li>
 * <li>Call {@link Ajax#get(String, String, String)}, {@link Ajax#get(String)}, {@link Ajax#post(String, Object)} 
 * or {@link Ajax#post(String, Object, String, String)} to send request asynchronously.</li>
 * </ol></p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see Http
 */
public final class Ajax extends Source
{
	private final static Id<Number> TIMEOUT = new Id<Number>();
	private final static Id<JsXMLHttpRequest> HTTP = new Id<JsXMLHttpRequest>();

	/**
	 * <p>The default constructor to create an {@link Ajax} object with the underlying 
	 * asynchronous HTTP request created and high level event mechanism set up.</p>
	 * @since 1.0
	 */
	public Ajax() {
		super(new Initializer().var());
		init(this, !Browser.isIE);
	}
	/**
	 * <p>The typical constructor which simply invokes the typical constructor of the 
	 * superclass passing the specified initializing object as argument.</p>
	 * @param ini The initializing object that can also be created with an object literal. 
	 * @since 1.0
	 */
	protected Ajax(ObjectLike ini) {
		super(ini);
	}

	private static final void init(final Ajax ajax, boolean init) {
		if (init) {
			ini(ajax).var(HTTP, Http.create());
			Http.onReadyStateChange(ajax.http(), new Function<Void>() {
				@Override
				protected Void function(Object jsthis, Call<Void> callee) {
					JsXMLHttpRequest http = ajax.http();
					switch (Http.readyState(http).intValue())
					{
						case (int)JsXMLHttpRequest.OPEN :
							setTimeout(ajax);
							ajax.fire(new HTTPOpen());
							break;
						case (int)JsXMLHttpRequest.SENT :
							ajax.fire(new HTTPSent());
							break;
						case (int)JsXMLHttpRequest.RECEIVING :
							ajax.fire(new HTTPReceiving());
							break;
						case (int)JsXMLHttpRequest.LOADED :
							ajax.fire(new HTTPLoaded());
							break;
					}
					return null;
				}
			}.var());
		}
	}

	/**
	 * <p>Gets the underlying HTTP request object.</p>
	 * @return The underlying HTTP request object. This object is returned for retrieving 
	 * its data properties only. Use the object with caution, not to break {@link Ajax}.
	 * @since 1.0
	 */
	public final JsXMLHttpRequest http() {
		return ini(this).var(HTTP);
	}

	private static final JsXMLHttpRequest open(Ajax ajax, String method, String url) {
		init(ajax, Browser.isIE);
		JsXMLHttpRequest http = ajax.http();
		Http.open(http, method, url);
		return http;
	}

	private static final JsXMLHttpRequest open(
			Ajax ajax, String method, String url, String username, String password) {
		init(ajax, Browser.isIE);
		JsXMLHttpRequest http = ajax.http();
		Http.open(http, method, url, true, username, password);
		return http;
	}

	private static final void send(JsXMLHttpRequest http, Object body) {
		if (Http.isOpen(http)) {
			Http.send(http, body);
		}
	}

	/**
	 * <p>Opens the underlying HTTP request if it is not opened yet and sends an HTTP-GET 
	 * to the specified URL through it.</p>
	 * <p>Note that, this method returns immediately with nothing. Get the actual responses 
	 * in the event listeners that should have been registered with the current event source 
	 * object.</p>
	 * @param url The URL that is the subject of the request. Most browsers impose a 
	 * same-origin security policy and require that this URL have the same host name and 
	 * port as the document that contains the script. Relative URLs are resolved in the 
	 * normal way, using the URL of the document that contains the script.
	 * @since 1.0
	 */
	public final void get(String url) {
		send(open(this, "GET", url), null);
	}

	/**
	 * <p>Opens the underlying HTTP request if it is not opened yet and sends an HTTP-GET 
	 * to the specified URL through it with explicit credentials.</p>
	 * <p>Note that, this method returns immediately with nothing. Get the actual responses 
	 * in the event listeners that should have been registered with the current event source 
	 * object.</p>
	 * @param url The URL that is the subject of the request. Most browsers impose a 
	 * same-origin security policy and require that this URL have the same host name and 
	 * port as the document that contains the script. Relative URLs are resolved in the 
	 * normal way, using the URL of the document that contains the script.
	 * @param username An optional argument specifying authorization user name for use 
	 * with URLs that require authorization. If specified, it overrides the user name 
	 * specified in the URL itself.
	 * @param password An optional argument specifying authorization password for use 
	 * with URLs that require authorization. If specified, it overrides the password 
	 * specified in the URL itself.
	 * @since 1.0
	 */
	public final void get(String url, String username, String password) {
		send(open(this, "GET", url, username, password), null);
	}

	/**
	 * <p>Opens the underlying HTTP request if it is not opened yet and sends an HTTP-HEAD 
	 * to the specified URL through it.</p>
	 * <p>Note that, this method returns immediately with nothing. Get the actual responses 
	 * in the event listeners that should have been registered with the current event source 
	 * object.</p>
	 * @param url The URL that is the subject of the request. Most browsers impose a 
	 * same-origin security policy and require that this URL have the same host name and 
	 * port as the document that contains the script. Relative URLs are resolved in the 
	 * normal way, using the URL of the document that contains the script.
	 * @since 1.0
	 */
	public final void head(String url) {
		send(open(this, "HEAD", url), null);
	}

	/**
	 * <p>Opens the underlying HTTP request if it is not opened yet and sends an HTTP-HEAD 
	 * to the specified URL through it with explicit credentials.</p>
	 * <p>Note that, this method returns immediately with nothing. Get the actual responses 
	 * in the event listeners that should have been registered with the current event source 
	 * object.</p>
	 * @param url The URL that is the subject of the request. Most browsers impose a 
	 * same-origin security policy and require that this URL have the same host name and 
	 * port as the document that contains the script. Relative URLs are resolved in the 
	 * normal way, using the URL of the document that contains the script.
	 * @param username An optional argument specifying authorization user name for use 
	 * with URLs that require authorization. If specified, it overrides the user name 
	 * specified in the URL itself.
	 * @param password An optional argument specifying authorization password for use 
	 * with URLs that require authorization. If specified, it overrides the password 
	 * specified in the URL itself.
	 * @since 1.0
	 */
	public final void head(String url, String username, String password) {
		send(open(this, "HEAD", url, username, password), null);
	}

	/**
	 * <p>Opens the underlying HTTP request if it is not opened yet and sends an HTTP-POST 
	 * to the specified URL through it.</p>
	 * <p>Note that, this method returns immediately with nothing. Get the actual responses 
	 * in the event listeners that should have been registered with the current event source 
	 * object.</p>
	 * @param url The URL that is the subject of the request. Most browsers impose a 
	 * same-origin security policy and require that this URL have the same host name and 
	 * port as the document that contains the script. Relative URLs are resolved in the 
	 * normal way, using the URL of the document that contains the script.
	 * @param body Specifies the body of the POST request, as a string or 
	 * {@link js.user.JsDocument} object.
	 * @since 1.0
	 */
	public final void post(String url, Object body) {
		send(open(this, "POST", url), body);
	}

	/**
	 * <p>Opens the underlying HTTP request if it is not opened yet and sends an HTTP-POST 
	 * to the specified URL through it with explicit credentials.</p>
	 * <p>Note that, this method returns immediately with nothing. Get the actual responses 
	 * in the event listeners that should have been registered with the current event source 
	 * object.</p>
	 * @param url The URL that is the subject of the request. Most browsers impose a 
	 * same-origin security policy and require that this URL have the same host name and 
	 * port as the document that contains the script. Relative URLs are resolved in the 
	 * normal way, using the URL of the document that contains the script.
	 * @param body Specifies the body of the POST request, as a string or 
	 * {@link js.user.JsDocument} object.
	 * @param username An optional argument specifying authorization user name for use 
	 * with URLs that require authorization. If specified, it overrides the user name 
	 * specified in the URL itself.
	 * @param password An optional argument specifying authorization password for use 
	 * with URLs that require authorization. If specified, it overrides the password 
	 * specified in the URL itself.
	 * @since 1.0
	 */
	public final void post(String url, Object body, String username, String password) {
		send(open(this, "POST", url, username, password), body);
	}

	/**
	 * <p>Cancels the underlying HTTP request of the current {@link Ajax} object, closing 
	 * connections and stopping any pending network activity.</p>
	 * <p>This method resets the {@link JsXMLHttpRequest} object to a {@link JsXMLHttpRequest#readyState} 
	 * of {@link JsXMLHttpRequest#UNINITIALIZED} and aborts any pending network activity. 
	 * You might call this method, for example, if a request has taken too long, and the 
	 * response is no longer necessary.</p>
	 * <p>This method fires an {@link HTTPAborted} event from the current {@link Ajax} 
	 * object if the underlying HTTP request had been open but not loaded and has had 
	 * to be aborted.</p>
	 * @since 1.0
	 * @see Http#abort(JsXMLHttpRequest)
	 * @see JsXMLHttpRequest#abort()
	 */
	public final void abort() {
		JsXMLHttpRequest http = http();
		int rs = Http.readyState(http).intValue();
		if (rs > JsXMLHttpRequest.UNINITIALIZED && rs < JsXMLHttpRequest.LOADED) {
			Http.abort(http);
			if (Http.readyState(http).intValue() == JsXMLHttpRequest.UNINITIALIZED) {
				fire(new HTTPAborted());
			}
		}
	}

	private final static Id<Timeout> TIMER = new Id<Timeout>();

	/**
	 * <p>Sets a timeout in milliseconds to the current {@link Ajax} object so that it will 
	 * be aborted and fire an {@link HTTPAborted} event when its underlying HTTP request 
	 * has been waited for a longer time than the specified limit.</p>
	 * <p>Setting a timeout of <tt>null</tt> or 0 means no limitation. The previous timeout 
	 * can be canceled by call this method again with a timeout of <tt>null</tt> or 0.</p>
	 * @param ajax The current {@link Ajax} object.
	 * @param ms Timeout limit in milliseconds.
	 * @since 1.0
	 */
	public static final void setTimeout(Ajax ajax, Number ms) {
		ini(ajax).var(TIMEOUT, ms);
	}

	private static final void setTimeout(final Ajax ajax) {
		if (Variables.defined(ini(ajax).var(TIMEOUT))) {
			if (Js.not(ini(ajax).var(TIMER))) {
				ini(ajax).var(TIMER, new Timeout() {
					@Override
					public void run() {
						ajax.abort();
					}
				});
			}
			ini(ajax).var(TIMER).set(ini(ajax).var(TIMEOUT));
		}
	}

	/**
	 * <p>Returns the wrapped event source.</p>
	 * <p>The event queuing and dispatching mechanism in the superclass tries to dispatch 
	 * an event fired from an event source also to its wrapped source by calling this method, 
	 * if this object does wrap another valid source.</p>
	 * <p>An {@link Ajax} object wraps nothing and this method simply returns <tt>null</tt> 
	 * to make the high level event mechanism work.</p>
	 * @return <tt>null</tt>.
	 * @since 1.0
	 */
	@Override
	protected final Ajax unwrap() {
		return null;
	}

	/**
	 * <p>Returns the container source object if this one is graphically contained by 
	 * another graphical event source.</p>
	 * <p>The event queuing and dispatching mechanism of the superclass tries to dispatch 
	 * an event fired from an event source also to its container by calling this method, 
	 * if this source is graphically contained by another valid source and the event wants 
	 * to bubble, that is, its {@link jsx.Source.Event#BUBBLE} configurable property is 
	 * <tt>true</tt>.</p>
	 * <p>An {@link Ajax} object is neither graphical nor containable and this method 
	 * simply returns <tt>null</tt> to make the high level event mechanism work.</p>
	 * @return <tt>null</tt>.
	 * @since 1.0
	 */
	@Override
	protected final Source getParent() {
		return null;
	}
}
