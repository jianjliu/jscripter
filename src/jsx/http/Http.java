
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

import js.ArrayLike;
import js.Disposable;
import js.Js;
import js.Vars;
import js.core.JsFunction;
import js.user.JsClient;
import js.user.JsDocument;
import js.user.JsXMLHttpRequest;
import jsx.client.Client;
import jsx.client.Browser;
import jsx.core.ArrayLikes;

/**
 * <p>An utility class providing static methods to manipulate HTTP connections and 
 * transmissions eliminating browser dependencies.</p>
 * <p>Users are encouraged to use the utilities provided by this class instead of the 
 * <b>opaque</b> methods of {@link JsXMLHttpRequest} in consideration of the reuse benefit 
 * for re-compilation results.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see Ajax
 */
public final class Http extends Disposable
{
	private Http() {}

	/**
	 * <p>Creates an HTTP request.</p>
	 * @return A {@link JsXMLHttpRequest} object constructed with {@link js.dom.DOM.XMLHttpRequest#create()} 
	 * or {@link js.dom.DOM.ActiveXObject#create(String)} for IE.
	 * @since 1.0
	 */
	public static final JsXMLHttpRequest create() {
		return Browser.hasXMLHttpRequest ? Client.XMLHttpRequest.var().create() : create4IE();
	}

	/**
	 * <p>Creates an HTTP request that is Java simulated in JS Simulation mode.</p>
	 * @return A {@link JsXMLHttpRequest} object constructed with {@link Js#http()} 
	 * or {@link Js#activeX(String)} for IE.
	 * @since 1.0
	 */
	public static final JsXMLHttpRequest create2() {
		return Browser.hasXMLHttpRequest ? Js.http() : create4IE2();
	}

	private final static ArrayLike<String> ACTIVEX = new Vars<String>()
			.add("MSXML2.XMLHTTP.5.0")
			.add("MSXML2.XMLHTTP.4.0")
			.add("MSXML2.XMLHTTP.3.0")
			.add("MSXML2.XMLHTTP")
			.add("Microsoft.XMLHTTP").var();

	private static final JsXMLHttpRequest create4IE() {
		JsXMLHttpRequest ret = null;
		for (int i = 0, len = ArrayLikes.length(ACTIVEX); Js.not(ret) && i < len; i++) {
			try {
				ret = new JsXMLHttpRequest(
						JsClient.ActiveXObject.with(Js.core()).create(ACTIVEX.get(i))
				);
			} catch (Throwable t) {}
		}
		return ret;
	}

	private static final JsXMLHttpRequest create4IE2() {
		JsXMLHttpRequest ret = null;
		for (int i = 0, len = ArrayLikes.length(ACTIVEX); Js.not(ret) && i < len; i++) {
			try {
				ret = new JsXMLHttpRequest(Js.activeX(ACTIVEX.get(i)));
			} catch (Throwable t) {}
		}
		return ret;
	}

	/**
	 * <p>Cancels the current HTTP request, closing connections and stopping any pending 
	 * network activity.</p>
	 * <p>This method resets the {@link JsXMLHttpRequest} object to a {@link JsXMLHttpRequest#readyState} 
	 * of {@link JsXMLHttpRequest#UNINITIALIZED} and aborts any pending network activity. 
	 * You might call this method, for example, if a request has taken too long, and the 
	 * response is no longer necessary.</p>
	 * @param http The current HTTP request.
	 * @since 1.0
	 * @see JsXMLHttpRequest#abort()
	 */
	public static final void abort(JsXMLHttpRequest http) {
		http.abort();
	}

	/**
	 * <p>Returns the HTTP response headers as an unparsed string.</p>
	 * @param http The current HTTP request.
	 * @return <tt>null</tt> if {@link JsXMLHttpRequest#readyState} is less than {@link JsXMLHttpRequest#RECEIVING}; 
	 * Otherwise, it returns all HTTP response headers, but not the status line, sent by 
	 * the server. The headers are returned as a single string, with one header per line. 
	 * Lines are delimited by "\r\n" line terminators.
	 * @since 1.0
	 * @see JsXMLHttpRequest#getAllResponseHeaders()
	 */
	public static final String getAllResponseHeaders(JsXMLHttpRequest http) {
		return http.getAllResponseHeaders();
	}

	/**
	 * <p>Returns the value of a named HTTP response header.</p>
	 * @param http The current HTTP request.
	 * @param header The name of the HTTP response header whose value is to be returned. 
	 * the <tt>header</tt> name may be specified using any case, as the comparison to 
	 * response headers is case-insensitive.
	 * @return The value of the named HTTP response header, or the empty string if no 
	 * such header was received or if {@link JsXMLHttpRequest#readyState} is less than {@link JsXMLHttpRequest#RECEIVING}. 
	 * If more than one header with the specified name is received, the values of those 
	 * headers are concatenated and returned, using a comma and space as the delimiter.
	 * @since 1.0
	 * @see JsXMLHttpRequest#getResponseHeader(String)
	 */
	public static final String getResponseHeader(JsXMLHttpRequest http, String header) {
		return http.getResponseHeader(header);
	}

	/**
	 * <p>Returns the {@link JsXMLHttpRequest#onreadystatechange} event handler of the 
	 * current HTTP request.</p>
	 * @param http The current HTTP request.
	 * @return The {@link JsXMLHttpRequest#onreadystatechange} event handler of the 
	 * current HTTP request.
	 * @since 1.0
	 */
	public static final JsFunction<?> onReadyStateChange(JsXMLHttpRequest http) {
		return JsXMLHttpRequest.onreadystatechange.with(http);
	}

	/**
	 * <p>Sets the {@link JsXMLHttpRequest#onreadystatechange} event handler of the 
	 * current HTTP request to the specified function.</p>
	 * @param http The current HTTP request.
	 * @param f An event handler to be set.
	 * @since 1.0
	 */
	public static final void onReadyStateChange(JsXMLHttpRequest http, JsFunction<?> f) {
		JsXMLHttpRequest.onreadystatechange.with(http, f);
	}

	/**
	 * <p>Initializes HTTP request parameters, such as the URL and HTTP method, but 
	 * does not send the request.</p>
	 * <p>This method initializes request parameters for later use by the {@link #send(JsXMLHttpRequest, Object)} 
	 * method. It sets {@link JsXMLHttpRequest#readyState} to {@link JsXMLHttpRequest#OPEN}, deletes any previously 
	 * specified request headers and previously received response headers, and sets the 
	 * {@link JsXMLHttpRequest#responseText}, {@link JsXMLHttpRequest#responseXML}, {@link JsXMLHttpRequest#status}, and {@link JsXMLHttpRequest#statusText} 
	 * properties to their default values. It is safe to call this method when {@link JsXMLHttpRequest#readyState} 
	 * is {@link JsXMLHttpRequest#UNINITIALIZED} {when the {@link JsXMLHttpRequest} object is just created 
	 * or after a call to {@link #abort(JsXMLHttpRequest)}), and when {@link JsXMLHttpRequest#readyState} is {@link JsXMLHttpRequest#LOADED}, 
	 * (after a response has been received). The behavior of this method is unspecified 
	 * when it is called from any other state.</p>
	 * <p>Other than storing request parameters for use by {@link #send(JsXMLHttpRequest, Object)} and 
	 * resetting the {@link JsXMLHttpRequest} object for reuse, this method has no other 
	 * behavior. In particular, note that implementations do not typically open a 
	 * network connection to the web server when this method is called.</p>
	 * @param http The current HTTP request.
	 * @param method The HTTP method to be used for the request. Reliably implemented 
	 * values include "GET", "POST", and "HEAD". Implementations may also support other 
	 * methods as well.
	 * @param url The URL that is the subject of the request. Most browsers impose a 
	 * same-origin security policy and require that this URL have the same host name and 
	 * port as the document that contains the script. Relative URLs are resolved in the 
	 * normal way, using the URL of the document that contains the script.
	 * @since 1.0
	 * @see #open(JsXMLHttpRequest, String, String, Boolean)
	 * @see #open(JsXMLHttpRequest, String, String, Boolean, String, String)
	 * @see #send(JsXMLHttpRequest, Object)
	 * @see JsXMLHttpRequest#open(String, String)
	 */
	public static final void open(JsXMLHttpRequest http, String method, String url) {
		http.open(method, url);
	}

	/**
	 * <p>Initializes HTTP request parameters, such as the URL and HTTP method, but 
	 * does not send the request.</p>
	 * <p>This method initializes request parameters for later use by the {@link #send(JsXMLHttpRequest, Object)} 
	 * method. It sets {@link JsXMLHttpRequest#readyState} to {@link JsXMLHttpRequest#OPEN}, deletes any previously 
	 * specified request headers and previously received response headers, and sets the 
	 * {@link JsXMLHttpRequest#responseText}, {@link JsXMLHttpRequest#responseXML}, {@link JsXMLHttpRequest#status}, and {@link JsXMLHttpRequest#statusText} 
	 * properties to their default values. It is safe to call this method when {@link JsXMLHttpRequest#readyState} 
	 * is {@link JsXMLHttpRequest#UNINITIALIZED} {when the {@link JsXMLHttpRequest} object is just created 
	 * or after a call to {@link #abort(JsXMLHttpRequest)}), and when {@link JsXMLHttpRequest#readyState} is {@link JsXMLHttpRequest#LOADED}, 
	 * (after a response has been received). The behavior of this method is unspecified 
	 * when it is called from any other state.</p>
	 * <p>Other than storing request parameters for use by {@link #send(JsXMLHttpRequest, Object)} and 
	 * resetting the {@link JsXMLHttpRequest} object for reuse, this method has no other 
	 * behavior. In particular, note that implementations do not typically open a 
	 * network connection to the web server when this method is called.</p>
	 * @param http The current HTTP request.
	 * @param method The HTTP method to be used for the request. Reliably implemented 
	 * values include "GET", "POST", and "HEAD". Implementations may also support other 
	 * methods as well.
	 * @param url The URL that is the subject of the request. Most browsers impose a 
	 * same-origin security policy and require that this URL have the same host name and 
	 * port as the document that contains the script. Relative URLs are resolved in the 
	 * normal way, using the URL of the document that contains the script.
	 * @param async Specifies whether the request should be performed asynchronously or 
	 * not. If this argument is <tt>false</tt>, the request is synchronous, and a 
	 * subsequent call to {@link #send(JsXMLHttpRequest, Object)} will block until the response is fully 
	 * received. If this argument is <tt>true</tt> or is undefined, the request is 
	 * asynchronous, and an {@link JsXMLHttpRequest#onreadystatechange} event handler is typically 
	 * required.
	 * @since 1.0
	 * @see #open(JsXMLHttpRequest, String, String)
	 * @see #open(JsXMLHttpRequest, String, String, Boolean, String, String)
	 * @see #send(JsXMLHttpRequest, Object)
	 * @see JsXMLHttpRequest#open(String, String, Boolean)
	 */
	public static final void open(JsXMLHttpRequest http, String method, String url, Boolean async) {
		http.open(method, url, async);
	}

	/**
	 * <p>Initializes HTTP request parameters, such as the URL and HTTP method, but 
	 * does not send the request.</p>
	 * <p>This method initializes request parameters for later use by the {@link #send(JsXMLHttpRequest, Object)} 
	 * method. It sets {@link JsXMLHttpRequest#readyState} to {@link JsXMLHttpRequest#OPEN}, deletes any previously 
	 * specified request headers and previously received response headers, and sets the 
	 * {@link JsXMLHttpRequest#responseText}, {@link JsXMLHttpRequest#responseXML}, {@link JsXMLHttpRequest#status}, and {@link JsXMLHttpRequest#statusText} 
	 * properties to their default values. It is safe to call this method when {@link JsXMLHttpRequest#readyState} 
	 * is {@link JsXMLHttpRequest#UNINITIALIZED} {when the {@link JsXMLHttpRequest} object is just created 
	 * or after a call to {@link #abort(JsXMLHttpRequest)}), and when {@link JsXMLHttpRequest#readyState} is {@link JsXMLHttpRequest#LOADED}, 
	 * (after a response has been received). The behavior of this method is unspecified 
	 * when it is called from any other state.</p>
	 * <p>Other than storing request parameters for use by {@link #send(JsXMLHttpRequest, Object)} and 
	 * resetting the {@link JsXMLHttpRequest} object for reuse, this method has no other 
	 * behavior. In particular, note that implementations do not typically open a 
	 * network connection to the web server when this method is called.</p>
	 * @param http The current HTTP request.
	 * @param method The HTTP method to be used for the request. Reliably implemented 
	 * values include "GET", "POST", and "HEAD". Implementations may also support other 
	 * methods as well.
	 * @param url The URL that is the subject of the request. Most browsers impose a 
	 * same-origin security policy and require that this URL have the same host name and 
	 * port as the document that contains the script. Relative URLs are resolved in the 
	 * normal way, using the URL of the document that contains the script.
	 * @param async Specifies whether the request should be performed asynchronously or 
	 * not. If this argument is <tt>false</tt>, the request is synchronous, and a 
	 * subsequent call to {@link #send(JsXMLHttpRequest, Object)} will block until the response is fully 
	 * received. If this argument is <tt>true</tt> or is undefined, the request is 
	 * asynchronous, and an {@link JsXMLHttpRequest#onreadystatechange} event handler is typically 
	 * required.
	 * @param username An optional argument specifying authorization user name for use 
	 * with URLs that require authorization. If specified, it overrides the user name 
	 * specified in the URL itself.
	 * @param password An optional argument specifying authorization password for use 
	 * with URLs that require authorization. If specified, it overrides the password 
	 * specified in the URL itself.
	 * @since 1.0
	 * @see #open(JsXMLHttpRequest, String, String)
	 * @see #open(JsXMLHttpRequest, String, String, Boolean)
	 * @see #send(JsXMLHttpRequest, Object)
	 * @see JsXMLHttpRequest#open(String, String, Boolean, String, String)
	 */
	public static final void open(
			JsXMLHttpRequest http, String method, String url, Boolean async, String username, String password) {
		http.open(method, url, async, username, password);
	}

	/**
	 * <p>Returns the {@link JsXMLHttpRequest#readyState} property of the current HTTP request.</p>
	 * @param http The current HTTP request.
	 * @return The value of the {@link JsXMLHttpRequest#readyState} property of the current HTTP request.
	 * @since 1.0
	 */
	public static final Number readyState(JsXMLHttpRequest http) {
		return JsXMLHttpRequest.readyState.with(http);
	}

	/**
	 * <p>Returns the {@link JsXMLHttpRequest#responseText} property of the current HTTP request.</p>
	 * @param http The current HTTP request.
	 * @return The value of the {@link JsXMLHttpRequest#responseText} property of the current HTTP request.
	 * @since 1.0
	 */
	public static final String responseText(JsXMLHttpRequest http) {
		return JsXMLHttpRequest.responseText.with(http);
	}

	/**
	 * <p>Returns the {@link JsXMLHttpRequest#responseXML} property of the current HTTP request.</p>
	 * @param http The current HTTP request.
	 * @return The value of the {@link JsXMLHttpRequest#responseXML} property of the current HTTP request.
	 * @since 1.0
	 */
	public static final JsDocument responseXML(JsXMLHttpRequest http) {
		return JsXMLHttpRequest.responseXML.with(http);
	}

	/**
	 * <p>Sends the HTTP request, using parameters passed to the {@link #open(JsXMLHttpRequest, String, String, Boolean, String, String)} 
	 * method and an optional request <tt>body</tt> passed to this method.</p>
	 * <p>This method causes an HTTP request to be issued. If there has been no previous 
	 * call to {@link #open(JsXMLHttpRequest, String, String, Boolean)}, or, more generally, if {@link JsXMLHttpRequest#readyState} 
	 * is not {@link JsXMLHttpRequest#OPEN}, this method throws an error. Otherwise, it issues an HTTP 
	 * request that consists of:
	 * <ul>
	 * <li>The HTTP method, URL, and authorization credentials (if any) specified in the 
	 * previous call to {@link #open(JsXMLHttpRequest, String, String, Boolean, String, String)}.</li>
	 * <li>The request headers, if any, specified by previous calls to {@link #setRequestHeader(JsXMLHttpRequest, String, String)}.</li>
	 * <li>The <tt>body</tt> argument passed to this method.</li>
	 * </ul>
	 * Once the request has been issued, this method sets {@link JsXMLHttpRequest#readyState} to {@link JsXMLHttpRequest#SENT} 
	 * and triggers the {@link JsXMLHttpRequest#onreadystatechange} event handler.</p>
	 * <p>If the <tt>async</tt> argument to the previous call to {@link #open(JsXMLHttpRequest, String, String, Boolean, String, String)} 
	 * was <tt>false</tt>, this method blocks and does not return until {@link JsXMLHttpRequest#readyState} 
	 * is {@link JsXMLHttpRequest#LOADED} and the server's response has been fully received. Otherwise, 
	 * if the <tt>async</tt> argument is <tt>true</tt> or if that argument is undefined, 
	 * this method returns immediately, and the server's response is processed on a 
	 * background thread.</p>
	 * <p>If the server responds with an HTTP redirect, this method or the background 
	 * thread follow the redirect automatically. When all HTTP response headers have 
	 * been received, this method or the background thread sets {@link JsXMLHttpRequest#readyState} to 
	 * {@link JsXMLHttpRequest#RECEIVING} and triggers the {@link JsXMLHttpRequest#onreadystatechange} event handler. 
	 * If the response is long, this method or the background thread may trigger the 
	 * {@link JsXMLHttpRequest#onreadystatechange} more than once while in state {@link JsXMLHttpRequest#RECEIVING}. 
	 * This can serve as a download progress indicator. Finally, when the response is 
	 * complete, this method or the background thread sets {@link JsXMLHttpRequest#readyState} to {@link JsXMLHttpRequest#LOADED} 
	 * and triggers the event handler one last time.</p>
	 * @param http The current HTTP request.
	 * @since 1.0
	 * @see #open(JsXMLHttpRequest, String, String)
	 * @see #open(JsXMLHttpRequest, String, String, Boolean)
	 * @see #open(JsXMLHttpRequest, String, String, Boolean, String, String)
	 * @see JsXMLHttpRequest#send(Object)
	 */
	public static final void send(JsXMLHttpRequest http) {
		http.send(null);
	}

	/**
	 * <p>Sends the HTTP request, using parameters passed to the {@link #open(JsXMLHttpRequest, String, String, Boolean, String, String)} 
	 * method and an optional request <tt>body</tt> passed to this method.</p>
	 * <p>This method causes an HTTP request to be issued. If there has been no previous 
	 * call to {@link #open(JsXMLHttpRequest, String, String, Boolean)}, or, more generally, if {@link JsXMLHttpRequest#readyState} 
	 * is not {@link JsXMLHttpRequest#OPEN}, this method throws an error. Otherwise, it issues an HTTP 
	 * request that consists of:
	 * <ul>
	 * <li>The HTTP method, URL, and authorization credentials (if any) specified in the 
	 * previous call to {@link #open(JsXMLHttpRequest, String, String, Boolean, String, String)}.</li>
	 * <li>The request headers, if any, specified by previous calls to {@link #setRequestHeader(JsXMLHttpRequest, String, String)}.</li>
	 * <li>The <tt>body</tt> argument passed to this method.</li>
	 * </ul>
	 * Once the request has been issued, this method sets {@link JsXMLHttpRequest#readyState} to {@link JsXMLHttpRequest#SENT} 
	 * and triggers the {@link JsXMLHttpRequest#onreadystatechange} event handler.</p>
	 * <p>If the <tt>async</tt> argument to the previous call to {@link #open(JsXMLHttpRequest, String, String, Boolean, String, String)} 
	 * was <tt>false</tt>, this method blocks and does not return until {@link JsXMLHttpRequest#readyState} 
	 * is {@link JsXMLHttpRequest#LOADED} and the server's response has been fully received. Otherwise, 
	 * if the <tt>async</tt> argument is <tt>true</tt> or if that argument is undefined, 
	 * this method returns immediately, and the server's response is processed on a 
	 * background thread.</p>
	 * <p>If the server responds with an HTTP redirect, this method or the background 
	 * thread follow the redirect automatically. When all HTTP response headers have 
	 * been received, this method or the background thread sets {@link JsXMLHttpRequest#readyState} to 
	 * {@link JsXMLHttpRequest#RECEIVING} and triggers the {@link JsXMLHttpRequest#onreadystatechange} event handler. 
	 * If the response is long, this method or the background thread may trigger the 
	 * {@link JsXMLHttpRequest#onreadystatechange} more than once while in state {@link JsXMLHttpRequest#RECEIVING}. 
	 * This can serve as a download progress indicator. Finally, when the response is 
	 * complete, this method or the background thread sets {@link JsXMLHttpRequest#readyState} to {@link JsXMLHttpRequest#LOADED} 
	 * and triggers the event handler one last time.</p>
	 * @param http The current HTTP request.
	 * @param body If the HTTP method specified by the call to {@link #open(JsXMLHttpRequest, String, String, Boolean, String, String)} 
	 * is "POST" or "PUT", this argument specifies the body of the request, as a string 
	 * or {@link js.user.JsDocument} object, or <tt>null</tt> if no body is necessary. For any 
	 * other method, this argument is unused and should be <tt>null</tt>, but some 
	 * implementations do not allow you to omit this argument.
	 * @since 1.0
	 * @see #open(JsXMLHttpRequest, String, String)
	 * @see #open(JsXMLHttpRequest, String, String, Boolean)
	 * @see #open(JsXMLHttpRequest, String, String, Boolean, String, String)
	 * @see JsXMLHttpRequest#send(Object)
	 */
	public static final void send(JsXMLHttpRequest http, Object body) {
		http.send(body);
	}

	/**
	 * <p>Sets or adds an HTTP request header to an open but unsent request.</p>
	 * <p>This method specifies an HTTP request header that should be included in the 
	 * request issued by a subsequent call to {@link #send(JsXMLHttpRequest, Object)}. This method may be 
	 * called only when {@link JsXMLHttpRequest#readyState} is {@link JsXMLHttpRequest#OPEN}, that is, after a call to 
	 * {@link #open(JsXMLHttpRequest, String, String, Boolean, String, String)} but before a call to {@link #send(JsXMLHttpRequest, Object)}.</p>
	 * <p>If a header with the specified name has already been specified, the new value 
	 * for that header is the previously specified value, plus a comma, a space, and the 
	 * value specified in this call.</p>
	 * <p>If the call to {@link #open(JsXMLHttpRequest, String, String, Boolean, String, String)} specifies 
	 * authorization credentials, {@link js.user.JsClient#XMLHttpRequest} automatically sends an 
	 * appropriate <tt>Authorization</tt> request header. You can append to this header 
	 * with this method, however. Similarly, if the web browser has stored cookies 
	 * associated with the URL passed to {@link #open(JsXMLHttpRequest, String, String, Boolean, String, String)}, 
	 * appropriate <tt>Cookie</tt> or <tt>Cookie2</tt> headers are automatically included 
	 * with the request. You can append additional cookies to these headers by calling 
	 * this method. {@link js.user.JsClient#XMLHttpRequest} may also provide a default value for 
	 * the <tt>User-Agent</tt> header. If it does this, any value you specify for that 
	 * header is appended to the default value.</p>
	 * <p>Some request headers are automatically set by the {@link js.user.JsClient#XMLHttpRequest} 
	 * for conformance to the HTTP protocol and may not be set with this method. These 
	 * include proxy-related headers as well as the following:
	 * <ul>
	 * <li><tt>Host</tt></li>
	 * <li><tt>Connection</tt></li>
	 * <li><tt>Keep-Alive</tt></li>
	 * <li><tt>Accept-Charset</tt></li>
	 * <li><tt>Accept-Encoding</tt></li>
	 * <li><tt>If-Modified-Since</tt></li>
	 * <li><tt>If-None-Match</tt></li>
	 * <li><tt>If-Range</tt></li>
	 * <li><tt>Range</tt></li>
	 * </ul></p>
	 * @param http The current HTTP request.
	 * @param name The name of the header to be set. This argument should not contain 
	 * spaces, colons, linefeeds, or newlines.
	 * @param value The value for the header. This argument should not contain 
	 * linefeeds or newlines.
	 * @since 1.0
	 * @see JsXMLHttpRequest#setRequestHeader(String, String)
	 */
	public static final void setRequestHeader(JsXMLHttpRequest http, String name, String value) {
		http.setRequestHeader(name, value);
	}

	/**
	 * <p>Returns the {@link JsXMLHttpRequest#status} property of the current HTTP request.</p>
	 * @param http The current HTTP request.
	 * @return The value of the {@link JsXMLHttpRequest#status} property of the current HTTP request.
	 * @since 1.0
	 */
	public static final Number status(JsXMLHttpRequest http) {
		return isLoaded(http) ? JsXMLHttpRequest.status.with(http) : null;
	}

	/**
	 * <p>Returns the {@link JsXMLHttpRequest#statusText} property of the current HTTP request.</p>
	 * @param http The current HTTP request.
	 * @return The value of the {@link JsXMLHttpRequest#statusText} property of the current HTTP request.
	 * @since 1.0
	 */
	public static final String statusText(JsXMLHttpRequest http) {
		return isLoaded(http) ? JsXMLHttpRequest.statusText.with(http) : null;
	}

	/**
	 * <p>Determines if the current HTTP request is open.</p>
	 * @param http The current HTTP request.
	 * @return <tt>true</tt> if the current HTTP request is open; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	public static final boolean isOpen(JsXMLHttpRequest http) {
		return Js.be(http) && Js.eq(JsXMLHttpRequest.readyState.with(http), JsXMLHttpRequest.OPEN);
	}

	/**
	 * <p>Determines if the current HTTP request is loaded.</p>
	 * @param http The current HTTP request.
	 * @return <tt>true</tt> if the current HTTP request is loaded; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	public static final boolean isLoaded(JsXMLHttpRequest http) {
		return Js.be(http) && Js.eq(JsXMLHttpRequest.readyState.with(http), JsXMLHttpRequest.LOADED);
	}
}
