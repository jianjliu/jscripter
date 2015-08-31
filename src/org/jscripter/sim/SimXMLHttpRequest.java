
/*
 *  JScripter Simulation 1.0 - For Java To Script
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

package org.jscripter.sim;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

import js.*;
import js.core.*;
import js.user.JsXMLHttpRequest;

class SimXMLHttpRequest extends JsXMLHttpRequest
{
    private final ObjectLike obj;
	private String responseHeaders;
	private byte[] responseBytes;
	private Map<String, List<String>> responseHeadersMap;
	private Map<String, String> requestHeadersMap;

	private boolean async;
	private boolean sent;
	private URLConnection conn;
	private String userAgent = DEFAULT_USERAGENT;
	private String postCharset = DEFAULT_AJAX_CHARSET;

	private URL url;
	protected String method;

	public SimXMLHttpRequest() {
		super(null);
		obj = Js.object();

		obj.var(abort, new Function<Void>() {
			@Override
			protected Void function(Object jsthis, Call<Void> callee) {
				((SimXMLHttpRequest)((Var<?>)jsthis).var()).abort();
				return null;
			}
		}.var());
		obj.var(getAllResponseHeaders, new Function<String>() {
			@Override
			protected String function(Object jsthis, Call<String> callee) {
				return ((SimXMLHttpRequest)((Var<?>)jsthis).var()).getAllResponseHeaders();
			}
		}.var());
		obj.var(getResponseHeader, new Function<String>() {
			@Override
			protected String function(Object jsthis, Call<String> callee) {
				return ((SimXMLHttpRequest)((Var<?>)jsthis).var()).getResponseHeader(
						Js.toString(callee.arguments.get(0))
				);
			}
		}.var());
		obj.var(open, new Function<Void>() {
			@Override
			protected Void function(Object jsthis, Call<Void> callee) {
				((SimXMLHttpRequest)((Var<?>)jsthis).var()).open(
						Js.toString(callee.arguments.get(0)),
						Js.toString(callee.arguments.get(1)),
						Js.be(callee.arguments.get(2)),
						Js.toString(callee.arguments.get(3)),
						Js.toString(callee.arguments.get(4))
				);
				return null;
			}
		}.var());
		obj.var(send, new Function<Void>() {
			@Override
			protected Void function(Object jsthis, Call<Void> callee) {
				((SimXMLHttpRequest)((Var<?>)jsthis).var()).send(
						Js.toString(callee.arguments.get(0))
				);
				return null;
			}
		}.var());
		obj.var(setRequestHeader, new Function<Void>() {
			@Override
			protected Void function(Object jsthis, Call<Void> callee) {
				((SimXMLHttpRequest)((Var<?>)jsthis).var()).setRequestHeader(
						Js.toString(callee.arguments.get(0)),
						Js.toString(callee.arguments.get(1))
				);
				return null;
			}
		}.var());

		requestHeadersMap = new LinkedHashMap<String, String>();
		setRequestHeader("X-Requested-With", "XMLHttpRequest");
		setRequestHeader("Accept",
		"text/javascript, text/html, application/xml, application/json, text/xml, */*");
	}

	public static final String DEFAULT_USERAGENT = "Mozilla/4.0 (compatible; MSIE 6.0;) SimXMLHttpRequest 1.0";
	public static final String DEFAULT_AJAX_CHARSET = "UTF-8";
	public static final String DEFAULT_HTTP_CHARSET = "ISO-8859-1";
	public static final String DEFAULT_REQUEST_METHOD = "POST";

	@Override
	public void setRequestHeader(String key, String value) {
		this.requestHeadersMap.put(key, value);
    }

	@Override
	public void open(
			String method, String url, Boolean async, String userName, String password) {
		try {
			URL urlObj = new URL(null, url);
			open(method, urlObj, async, userName, password);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void open(final String method, final URL url, boolean async,
			final String userName, final String password) throws IOException {  
		abort();
		URLConnection c = url.openConnection();
		synchronized (this) {
			this.conn = c;
			this.async = async;
			this.method = method;
			this.url = url;
		}
		changeState(OPEN, 0, null, null);
	}

	@Override
	public void open(String method, String url) {
		open(method, url, true, null, null);
	}

	@Override
	public void open(String method, String url, Boolean async) {
		open(method, url, async, null, null);
	}

	@Override
	public void send(final Object body) {
		if (async) {
			new Thread(getClass().getName() + "-" + url.getHost()) {
				public void run() {
					try {
						sendSync(Js.toString(body));
					} catch (Throwable t) {
						throw new RuntimeException(t);
					}
				}
			}.start();
		} else {
			try {
				sendSync(Js.toString(body));
			} catch (Throwable t) {
				throw new RuntimeException(t);
			}
		}
	}

	@Override
	public synchronized String getResponseHeader(String headerName) {
		return responseHeadersMap == null ? null :
			responseHeadersMap.get(headerName).toString();
	}

	@Override
	public synchronized String getAllResponseHeaders() {
		return this.responseHeaders;
	}  

	@Override
	public void abort() {
		URLConnection c = null;
		synchronized (this) {
			c = this.conn;
		}
		if (c instanceof HttpURLConnection) {
			((HttpURLConnection) c).disconnect();
		} else if (c != null) {
			try {
				c.getInputStream().close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

	protected void sendSync(String content) throws IOException {
		if (sent){
			return ;
		}
		try {
			URLConnection c;
			synchronized(this) {
				c = conn;
			}
			if (c == null) {
				return;
			}
			sent = true;
			initConnectionRequestHeader(c);
			int istatus;
			String istatusText;
			InputStream err;
			if (c instanceof HttpURLConnection) {
				HttpURLConnection hc = (HttpURLConnection) c;
				String method = this.method == null ? DEFAULT_REQUEST_METHOD : this.method;

				method = method.toUpperCase();
				hc.setRequestMethod(method);
				if ("POST".equals(method) && content != null) {
					hc.setDoOutput(true);
					byte[] contentBytes = content.getBytes(postCharset);
					hc.setFixedLengthStreamingMode(contentBytes.length);
					OutputStream out = hc.getOutputStream();
					try {
						out.write(contentBytes);
					} finally {
						out.flush();
					}
				}
				istatus = hc.getResponseCode();
				istatusText = hc.getResponseMessage();
				err = hc.getErrorStream();
			} else {
				istatus = 0;
				istatusText = "";
				err = null;
			}
			synchronized (this) {
				responseHeaders = SimUtil.getConnectionResponseHeaders(c);
				responseHeadersMap = c.getHeaderFields();
			}
			changeState(SENT, istatus, istatusText, null);
			InputStream in = err == null ? c.getInputStream() : err;
			int contentLength = c.getContentLength();

			changeState(RECEIVING, istatus, istatusText, null);
			byte[] bytes = SimUtil.loadStream(in, contentLength == -1 ? 4096 : contentLength);
			changeState(LOADED, istatus, istatusText, bytes);
		} finally {
			synchronized(this) {
				conn = null;
				sent = false;
			}
		}
	}

	protected void changeState(int rs, int st, String stxt, byte[] bytes) {
		synchronized(this) {
			var(readyState, rs);
			var(status, st);
			var(statusText, stxt);
			this.responseBytes = bytes;
			if (rs == LOADED) {
				var(responseText, getResponseText());
			}
		}
		JsFunction<?> on = onreadystatechange.with(this);
		if (Js.be(on)) {
			on.invoke();
		}
	}

	private synchronized String getResponseText() {
		byte[] bytes = this.responseBytes;
		String encoding = SimUtil.getCharset(conn);
		if (encoding == null) {
			encoding = postCharset;
		}
		if (encoding == null) {
			encoding = DEFAULT_HTTP_CHARSET;
		}
		try {
			return bytes == null ? null : new String(bytes, encoding);
		} catch (UnsupportedEncodingException uee) {
			try {
				return new String(bytes, DEFAULT_HTTP_CHARSET);
			} catch (UnsupportedEncodingException uee2) {
				return null;
			}
		}
	}

	synchronized Document getResponseXML() {
		byte[] bytes =  this.responseBytes;
		if (bytes == null) {
			return null;
		}
		InputStream in =  new ByteArrayInputStream(bytes);
		try {
			return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(in);
		} catch (Exception err) {
			return null;
		}
	}

	protected String encode(Object str) {
		try {
			return URLEncoder.encode(String.valueOf(str), postCharset);
		} catch (UnsupportedEncodingException e) {
			return String.valueOf(str);
		}
	}

	protected void initConnectionRequestHeader(URLConnection c) {
		c.setRequestProperty("User-Agent", userAgent);
		Iterator<String> keyItor = this.requestHeadersMap.keySet().iterator();
		while (keyItor.hasNext()) {
			String key = keyItor.next();
			String value = requestHeadersMap.get(key);
			c.setRequestProperty(key, value);
		}
	}

	@Override
	public final JsXMLHttpRequest var() {
		return this;
	}

	@Override
	public final String typeof() {
		return "object";
	}

	@Override
	public final boolean undefined() {
		return false;
	}

	@Override
	public final String toString() {
		return "[object SimXMLHttpRequest]";
	}

	@Override
	public final JsXMLHttpRequest valueOf() {
		return this;
	}

	@Override
	public final boolean delete() {
		return false;
	}

	@Override
	public final boolean delete(Mid mid) {
		if (undefined()) {
			return false;
		}
		if (obj.delete(mid)) {
			return true;
		}
		JsObject p = JsFunction.prototype.with(this);
		if (Js.be(p) && Js.be(p.var(mid))) {
			obj.var(mid, null);
			return true;
		}
		return false;
	}

	@Override
	public final Object var(Mid mid) {
		return obj.var(mid);
	}

	public final <T> T var(Mid mid, T v) {
		return obj.var(mid, v);
	}

	@Override
	protected final <T> T call(JsFunction.Member<T> member) {
		return member.with(this).call(this);
	}
	@Override
	protected final <T> T call(JsFunction.Member<T> member, Object arg) {
		return member.with(this).call(this, arg);
	}
	@Override
	protected final <T> T call(JsFunction.Member<T> member, Vars<?> args) {
		return member.with(this).call(this, args);
	}
}
