
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

package js.user;

import js.*;
import js.core.*;

/**
 * <p>An <b>opaque</b> class representing JavaScript client-side objects of the global 
 * {@link JsClient#XMLHttpRequest} class.</p>
 * <p>A {@link JsXMLHttpRequest} object allows client-side JavaScript to issue HTTP 
 * requests and receive responses, which need not be XML, from web servers.</p>
 * <p>{@link JsXMLHttpRequest} is quite portable and well supported by all modern 
 * browsers. The only browser dependency involves the creation of an {@link JsXMLHttpRequest} 
 * object. In IE, you must use the constructor of the IE-specific {@link JsClient#ActiveXObject}: 
 * {@link js.dom.DOM.ActiveXObject#create(String)}.</p>
 * <p>Once a {@link JsXMLHttpRequest} object has been created, you typically use it like this:
 * <ol>
 * <li>Call {@link JsXMLHttpRequest#open(String, String, Boolean, String, String)} to specify the URL 
 * and method (usually "GET" or "POST") for the request. When you call {@link JsXMLHttpRequest#open(String, String, Boolean, String, String)}, 
 * you also specify whether you want the request to be synchronous or asynchronous.</li>
 * <li>If you specified an asynchronous request, set the {@link JsXMLHttpRequest#onreadystatechange} 
 * property to the function that will be notified of the progress of the request.</li>
 * <li>Call {@link JsXMLHttpRequest#setRequestHeader(String, String)}, if needed, to 
 * specify additional request parameters</li>
 * <li>Call {@link JsXMLHttpRequest#send(Object)} to send the request to the web server. 
 * If it is a POST request, you may also pass a request body to this method. If you 
 * specify a synchronous request in your call to {@link JsXMLHttpRequest#open(String, String, Boolean, String, String)}, 
 * the {@link JsXMLHttpRequest#send(Object)} method blocks until the response is complete 
 * and {@link JsXMLHttpRequest#readyState} is {@link JsXMLHttpRequest#LOADED}. Otherwise, 
 * your {@link JsXMLHttpRequest#onreadystatechange} event handler function must wait 
 * until the {@link JsXMLHttpRequest#readyState} property reaches {@link JsXMLHttpRequest#LOADED} 
 * (or at least {@link JsXMLHttpRequest#RECEIVING}).</li>
 * <li>Once {@link JsXMLHttpRequest#send(Object)} has returned for synchronous requests, 
 * or {@link JsXMLHttpRequest#readyState} has reached {@link JsXMLHttpRequest#LOADED} 
 * for asynchronous requests, you can use the server's response. First, check the {@link JsXMLHttpRequest#status} 
 * code to ensure that the request was successful. If so, use {@link JsXMLHttpRequest#getResponseHeader(String)} 
 * or {@link JsXMLHttpRequest#getAllResponseHeaders()} to retrieve values from the 
 * response header, and use the {@link JsXMLHttpRequest#responseText} or {@link JsXMLHttpRequest#responseXML} 
 * properties to obtain the response body.</li>
 * </ol></p>
 * <p>{@link JsXMLHttpRequest} objects have not been standardized, but work on a 
 * standard has begun at the W3C.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsXMLHttpRequest extends JsClient.XMLHttpRequest.Prototype
{
	/**
	 * A legal value for the {@link #readyState} representing the initial state that 
	 * the {@link JsXMLHttpRequest} object has just been created or has been reset with 
	 * the {@link #abort()} method.
	 * @since 1.0
	 */
	public final static short UNINITIALIZED = 0;
	/**
	 * A legal value for the {@link #readyState} indicating that the {@link #open(String, String)} 
	 * method has been called, but {@link #send(Object)} has not, that is, the request 
	 * has not yet been sent.
	 * @since 1.0
	 */
	public final static short OPEN          = 1;
	/**
	 * A legal value for the {@link #readyState} indicating that the {@link #send(Object)} 
	 * method has been called, and the HTTP request has been transmitted to the web 
	 * server but no response has been received yet.
	 * @since 1.0
	 */
	public final static short SENT          = 2;
	/**
	 * A legal value for the {@link #readyState} indicating that all response headers 
	 * have been received and the response body is being received but is not complete.
	 * @since 1.0
	 */
	public final static short RECEIVING     = 3;
	/**
	 * A legal value for the {@link #readyState} indicating that the HTTP response 
	 * has been fully received.
	 * @since 1.0
	 */
	public final static short LOADED        = 4;

	/**
	 * <p>An <b>internal</b> class containing membership data for its enclosing
	 * opaque class.</p>
	 * <p>This class is only used inside of <b>opaque</b> or <b>internal</b> classes or
	 * class members.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript Re-compilers must report error on resolving an <b>internal</b> class.
	 */
	protected static abstract class Members extends JsClient.XMLHttpRequest.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsXMLHttpRequest#readyState
		 * @see JsXMLHttpRequest.Member#readyState
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid readyState         = id("readyState"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsXMLHttpRequest#responseText
		 * @see JsXMLHttpRequest.Member#responseText
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid responseText       = id("responseText"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsXMLHttpRequest#responseXML
		 * @see JsXMLHttpRequest.Member#responseXML
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid responseXML        = id("responseXML"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsXMLHttpRequest#status
		 * @see JsXMLHttpRequest.Member#status
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid status             = id("status"            );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsXMLHttpRequest#statusText
		 * @see JsXMLHttpRequest.Member#statusText
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid statusText         = id("statusText"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsXMLHttpRequest#onreadystatechange
		 * @see JsXMLHttpRequest.Member#onreadystatechange
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onreadystatechange = id("onreadystatechange");
	}
	/**
	 * <p>An <b>opaque</b> class representing members of its enclosing <b>opaque</b> type.</p>
	 * <p>Note that, this class is <b>opaque</b> but its constructors are all <b>internal</b>. 
	 * This class and the subclasses of this class are used to declare either <b>opaque</b> 
	 * <tt>public</tt> instance fields of the opaque type {@link js.Var.Member} or the 
	 * <b>opaque</b> <tt>public</tt> static fields of other <b>opaque</b> types while their 
	 * constructors are used to define the fields inside <b>opaque</b> classes. Under 
	 * either circumstance, the field names must be exactly same as the member names, as 
	 * the <b>opaque</b> fields of <b>opaque</b> types are resolved by re-compilers directly 
	 * based on the field names.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be created
	 * in the target codes. Re-compilers must exit with error on operations accessing that kind 
	 * of class objects.
	 * Re-compilers must resolve an <b>opaque</b> instance field declared by this class in
	 * {@link js.Var.Member} or its subclasses to the JavaScript identifier: 
	 * <pre>q.m</pre>
	 * where <tt>m</tt> is the identifier of the field name and <tt>q</tt> is the identifier
	 * resolved from the instance of the enclosing member. Re-compilers must resolve an 
	 * <b>opaque</b> static field declared by this class in <b>opaque</b> types other than 
	 * {@link js.Var.Member} and its subclasses to the JavaScript identifier: 
	 * <pre>m</pre>
	 * where <tt>m</tt> is the identifier of the field name. And re-compilers must report
	 * error on the access to <b>opaque</b> fields declared by this class under any other 
	 * circumstances.
	 */
	public static class Member extends JsClient.XMLHttpRequest.Prototype.Member
	{
		/**
		 * <p>Internally constructs a member based on a qualifying member.</p>
		 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b>
		 * or <b>internal</b> classes or class members.</p>
		 * <p>Note that, this constructor is <b>internal</b> but its declaring class is
		 * <b>opaque</b>. This constructor is used to define <b>opaque</b> instance fields 
		 * declared in the declaring class of this constructor itself or its subclasses. 
		 * Under this circumstance, the field names must be exactly same as the member 
		 * names, as the <b>opaque</b> instance fields of the <b>opaque</b> type 
		 * {@link js.Var.Member} or its subclasses are resolved by re-compilers directly
		 * to their names appending to the name resolved from the specified qualifying 
		 * member with a dot in between.</p>
		 * @param q A qualifying member
		 * @param mid The ID of the member to construct
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor.
		 */
		public Member(JsObject.Member q, Mid mid) {
			super(q, mid);
		}
		/**
		 * <p>Internally constructs a member without a qualifying member.</p>
		 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b>
		 * or <b>internal</b> classes or class members.</p>
		 * <p>Note that, this constructor is <b>internal</b> but its declaring class is
		 * <b>opaque</b>. This constructor is used to define <b>opaque</b> static fields, 
		 * declared in <b>opaque</b> types other than the declaring class of this constructor 
		 * itself and its subclasses. Under this circumstance, the field names must be
		 * exactly same as the member names, as the <b>opaque</b> static fields of <b>opaque</b>
		 * types are generally resolved by re-compilers directly to identifiers of their names.</p>
		 * @param mid The ID of the member to construct
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor.
		 */
		public Member(Mid mid) {
			super(mid);
		}
		@Override
		/**
		 * <p>Evaluates the property, represented by the current member instance, of the
		 * argument object.</p>
		 * @param o The argument object
		 * @return The value of the current member based on the object argument.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into
		 * the JavaScript expression: 
		 * <pre>o.m</pre>
		 * where <tt>m</tt> is the identifier name resolved from the current member
		 * instance of the invocation.
		 */
		public JsXMLHttpRequest with(ObjectLike o) {
			return new JsXMLHttpRequest(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsXMLHttpRequest} object 
		 * refers to a read-only integer value specifying the state of the HTTP request. 
		 * The value begins at {@link JsXMLHttpRequest#UNINITIALIZED} or 0 when the {@link JsXMLHttpRequest} 
		 * object is first created and increases to {@link JsXMLHttpRequest#LOADED} or 4 
		 * when the complete HTTP response has been received. The five states are {@link JsXMLHttpRequest#UNINITIALIZED}, 
		 * {@link JsXMLHttpRequest#OPEN}, {@link JsXMLHttpRequest#SENT}, {@link JsXMLHttpRequest#RECEIVING} 
		 * and {@link JsXMLHttpRequest#LOADED}, each having an informal name associated 
		 * with it.</p>
		 * <p>The value of the property never decreases, unless {@link JsXMLHttpRequest#abort()} 
		 * or {@link JsXMLHttpRequest#open(String, String, Boolean, String, String)} method 
		 * is called on a request that is already in progress. Every time the value of 
		 * the property increases, the {@link JsXMLHttpRequest#onreadystatechange} event 
		 * handler is triggered.</p> 
		 * @since 1.0
		 * @see JsXMLHttpRequest#UNINITIALIZED
		 * @see JsXMLHttpRequest#OPEN
		 * @see JsXMLHttpRequest#SENT
		 * @see JsXMLHttpRequest#RECEIVING
		 * @see JsXMLHttpRequest#LOADED
		 * @see JsXMLHttpRequest#onreadystatechange
		 * @see JsXMLHttpRequest#abort()
		 * @see JsXMLHttpRequest#open(String, String)
		 * @see JsXMLHttpRequest#open(String, String, Boolean)
		 * @see JsXMLHttpRequest#open(String, String, Boolean, String, String)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member readyState   = new Value.Number.Member(this, Members.readyState  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsXMLHttpRequest} object 
		 * refers to a read-only string value specifying the body of the response, excluding 
		 * headers, that has been received from the server so far, or the empty string if 
		 * no data has been received yet. If {@link #readyState} is less than {@link JsXMLHttpRequest#RECEIVING}, 
		 * the property is the empty string. When {@link #readyState} is {@link JsXMLHttpRequest#RECEIVING}, 
		 * the property returns whatever portion of the response has been received so 
		 * far. If {@link #readyState} is {@link JsXMLHttpRequest#LOADED}, the property 
		 * holds the complete body of the response.</p>
		 * <p>If the response includes headers that specify a character encoding for the 
		 * body, that encoding is used. Otherwise, the Unicode UTF-8 encoding is assumed.</p> 
		 * @since 1.0
		 * @see JsXMLHttpRequest#UNINITIALIZED
		 * @see JsXMLHttpRequest#OPEN
		 * @see JsXMLHttpRequest#SENT
		 * @see JsXMLHttpRequest#RECEIVING
		 * @see JsXMLHttpRequest#LOADED
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member responseText = new Value.String.Member(this, Members.responseText);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsXMLHttpRequest} object 
		 * refers to a read-only integer value specifying the HTTP status code returned 
		 * by the server, such as 200 for success and 404 for "Not Found" errors. 
		 * Reading this property when {@link #readyState} is less than {@link JsXMLHttpRequest#RECEIVING} 
		 * causes an error.</p> 
		 * @since 1.0
		 * @see JsXMLHttpRequest#UNINITIALIZED
		 * @see JsXMLHttpRequest#OPEN
		 * @see JsXMLHttpRequest#SENT
		 * @see JsXMLHttpRequest#RECEIVING
		 * @see JsXMLHttpRequest#LOADED
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member status       = new Value.Number.Member(this, Members.status      );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsXMLHttpRequest} object 
		 * refers to a read-only string value specifying the HTTP status code of the 
		 * request by name rather than by number. That is, it is "OK" when status is 200 
		 * and "Not Found" when status is 404. As with the {@link #status} property, reading 
		 * the property when {@link #readyState} is less than {@link JsXMLHttpRequest#RECEIVING} 
		 * causes an error.</p> 
		 * @since 1.0
		 * @see JsXMLHttpRequest#UNINITIALIZED
		 * @see JsXMLHttpRequest#OPEN
		 * @see JsXMLHttpRequest#SENT
		 * @see JsXMLHttpRequest#RECEIVING
		 * @see JsXMLHttpRequest#LOADED
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member statusText   = new Value.String.Member(this, Members.statusText  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsXMLHttpRequest} object
		 * is a read-only reference to the response to the request, parsed as XML and 
		 * returned as a Document object. The property will be <tt>null</tt> unless all 
		 * three of the following conditions are true:
		 * <ul>
		 * <li>{@link #readyState} is {@link JsXMLHttpRequest#LOADED}.</li>
		 * <li>The response includes a <tt>Content-Type</tt> header of "text/xml", 
		 * "application/xml", or anything ending with "+xml" to indicate that the 
		 * response is an XML document.</li>
		 * <li>The response body consists of well-formed XML mark-up that can be parsed 
		 * without errors.</li>
		 * </ul></p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsDocument.Member responseXML = new JsDocument.Member(this, Members.responseXML);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsXMLHttpRequest} object
		 * is a reference to the event handler function invoked each time the {@link #readyState} 
		 * property changes. It may also be invoked multiple times while {@link #readyState} 
		 * is {@link JsXMLHttpRequest#RECEIVING}.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onreadystatechange = new JsFunction.Member<Object>(this, Members.onreadystatechange);
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsXMLHttpRequest(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsXMLHttpRequest} object 
	 * refers to a read-only integer value specifying the state of the HTTP request. 
	 * The value begins at {@link #UNINITIALIZED} or 0 when the {@link JsXMLHttpRequest} 
	 * object is first created and increases to {@link JsXMLHttpRequest#LOADED} or 4 
	 * when the complete HTTP response has been received. The five states are {@link #UNINITIALIZED}, 
	 * {@link #OPEN}, {@link #SENT}, {@link #RECEIVING} and {@link #LOADED}, each having 
	 * an informal name associated with it.</p>
	 * <p>The value of the property never decreases, unless the {@link #abort()} 
	 * or {@link #open(String, String, Boolean, String, String)} method is called on a 
	 * request that is already in progress. Every time the value of the property 
	 * increases, the {@link #onreadystatechange} event handler is triggered.</p> 
	 * @since 1.0
	 * @see #UNINITIALIZED
	 * @see #OPEN
	 * @see #SENT
	 * @see #RECEIVING
	 * @see #LOADED
	 * @see #onreadystatechange
	 * @see #abort()
	 * @see #open(String, String)
	 * @see #open(String, String, Boolean)
	 * @see #open(String, String, Boolean, String, String)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member readyState   = new Value.Number.Member(Members.readyState  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsXMLHttpRequest} object 
	 * refers to a read-only string value specifying the body of the response, excluding 
	 * headers, that has been received from the server so far, or the empty string if 
	 * no data has been received yet. If {@link #readyState} is less than {@link #RECEIVING}, 
	 * the property is the empty string. When {@link #readyState} is {@link #RECEIVING}, 
	 * the property returns whatever portion of the response has been received so 
	 * far. If {@link #readyState} is {@link #LOADED}, the property holds the complete 
	 * body of the response.</p>
	 * <p>If the response includes headers that specify a character encoding for the 
	 * body, that encoding is used. Otherwise, the Unicode UTF-8 encoding is assumed.</p> 
	 * @since 1.0
	 * @see #UNINITIALIZED
	 * @see #OPEN
	 * @see #SENT
	 * @see #RECEIVING
	 * @see #LOADED
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member responseText = new Value.String.Member(Members.responseText);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsXMLHttpRequest} object 
	 * refers to a read-only integer value specifying the HTTP status code returned 
	 * by the server, such as 200 for success and 404 for "Not Found" errors. 
	 * Reading this property when {@link #readyState} is less than {@link #RECEIVING} 
	 * causes an error.</p> 
	 * @since 1.0
	 * @see #UNINITIALIZED
	 * @see #OPEN
	 * @see #SENT
	 * @see #RECEIVING
	 * @see #LOADED
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member status       = new Value.Number.Member(Members.status      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsXMLHttpRequest} object 
	 * refers to a read-only string value specifying the HTTP status code of the 
	 * request by name rather than by number. That is, it is "OK" when status is 200 
	 * and "Not Found" when status is 404. As with the {@link #status} property, reading 
	 * the property when {@link #readyState} is less than {@link #RECEIVING} causes an 
	 * error.</p> 
	 * @since 1.0
	 * @see #UNINITIALIZED
	 * @see #OPEN
	 * @see #SENT
	 * @see #RECEIVING
	 * @see #LOADED
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member statusText   = new Value.String.Member(Members.statusText  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsXMLHttpRequest} object
	 * is a read-only reference to the response to the request, parsed as XML and 
	 * returned as a Document object. The property will be <tt>null</tt> unless all 
	 * three of the following conditions are true:
	 * <ul>
	 * <li>{@link #readyState} is {@link #LOADED}.</li>
	 * <li>The response includes a <tt>Content-Type</tt> header of "text/xml", 
	 * "application/xml", or anything ending with "+xml" to indicate that the 
	 * response is an XML document.</li>
	 * <li>The response body consists of well-formed XML mark-up that can be parsed 
	 * without errors.</li>
	 * </ul></p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsDocument.Member responseXML = new JsDocument.Member(Members.responseXML);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsXMLHttpRequest} object
	 * is a reference to the event handler function invoked each time the {@link #readyState} 
	 * property changes. It may also be invoked multiple times while {@link #readyState} 
	 * is {@link #RECEIVING}.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onreadystatechange = new JsFunction.Member<Object>(Members.onreadystatechange);

	@Override
	/**
	 * <p>Returns the primitive value associated with the current instance, if there is one.
	 * This invocation simply returns the instance itself for the current instance is an 
	 * object and there is no primitive value for it.</p>
	 * @return The current object itself.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public JsXMLHttpRequest valueOf() {
		return new JsXMLHttpRequest((JsObject)var().valueOf());
	}
	public final JsDocument var(JsDocument.Member r) {
		return r.with(this);
	}

	/**
	 * <p>Cancels the current request, closing connections and stopping any pending 
	 * network activity.</p>
	 * <p>This method resets the {@link JsXMLHttpRequest} object to a {@link #readyState} 
	 * of {@link #UNINITIALIZED} and aborts any pending network activity. You might call 
	 * this method, for example, if a request has taken too long, and the response is 
	 * no longer necessary.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void abort() {
		call(abort);
	}
	/**
	 * <p>Returns the HTTP response headers as an unparsed string.</p>
	 * @return <tt>null</tt> if {@link #readyState} is less than {@link #RECEIVING}; 
	 * Otherwise, it returns all HTTP response headers, but not the status line, sent by 
	 * the server. The headers are returned as a single string, with one header per line. 
	 * Lines are delimited by "\r\n" line terminators.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String getAllResponseHeaders() {
		return call(getAllResponseHeaders);
	}
	/**
	 * <p>Returns the value of a named HTTP response header.</p>
	 * @param header The name of the HTTP response header whose value is to be returned. 
	 * the <tt>header</tt> name may be specified using any case, as the comparison to 
	 * response headers is case-insensitive.
	 * @return The value of the named HTTP response header, or the empty string if no 
	 * such header was received or if {@link #readyState} is less than {@link #RECEIVING}. 
	 * If more than one header with the specified name is received, the values of those 
	 * headers are concatenated and returned, using a comma and space as the delimiter.
	 * @since 1.0
	 * @see #getResponseHeader(StringLike)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String getResponseHeader(String header) {
		return call(getResponseHeader, header);
	}
	/**
	 * <p>Returns the value of a named HTTP response header.</p>
	 * @param header The name of the HTTP response header whose value is to be returned. 
	 * the <tt>header</tt> name may be specified using any case, as the comparison to 
	 * response headers is case-insensitive.
	 * @return The value of the named HTTP response header, or the empty string if no 
	 * such header was received or if {@link #readyState} is less than {@link #RECEIVING}. 
	 * If more than one header with the specified name is received, the values of those 
	 * headers are concatenated and returned, using a comma and space as the delimiter.
	 * @since 1.0
	 * @see #getResponseHeader(String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String getResponseHeader(StringLike header) {
		return getResponseHeader(Js.valueOf(header));
	}
	/**
	 * <p>Initializes HTTP request parameters, such as the URL and HTTP method, but 
	 * does not send the request.</p>
	 * <p>This method initializes request parameters for later use by the {@link #send(Object)} 
	 * method. It sets {@link #readyState} to {@link #OPEN}, deletes any previously 
	 * specified request headers and previously received response headers, and sets the 
	 * {@link #responseText}, {@link #responseXML}, {@link #status}, and {@link #statusText} 
	 * properties to their default values. It is safe to call this method when {@link #readyState} 
	 * is {@link #UNINITIALIZED} {when the {@link JsXMLHttpRequest} object is just created 
	 * or after a call to {@link #abort()}), and when {@link #readyState} is {@link #LOADED}, 
	 * (after a response has been received). The behavior of this method is unspecified 
	 * when it is called from any other state.</p>
	 * <p>Other than storing request parameters for use by {@link #send(Object)} and 
	 * resetting the {@link JsXMLHttpRequest} object for reuse, this method has no other 
	 * behavior. In particular, note that implementations do not typically open a 
	 * network connection to the web server when this method is called.</p>
	 * @param method The HTTP method to be used for the request. Reliably implemented 
	 * values include "GET", "POST", and "HEAD". Implementations may also support other 
	 * methods as well.
	 * @param url The URL that is the subject of the request. Most browsers impose a 
	 * same-origin security policy and require that this URL have the same host name and 
	 * port as the document that contains the script. Relative URLs are resolved in the 
	 * normal way, using the URL of the document that contains the script.
	 * @since 1.0
	 * @see #open(String, String, Boolean)
	 * @see #open(String, String, Boolean, String, String)
	 * @see #send(Object)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void open(String method, String url) {
		call(open, new Vars<Object>().add(method).add(url));
	}
	/**
	 * <p>Initializes HTTP request parameters, such as the URL and HTTP method, but 
	 * does not send the request.</p>
	 * <p>This method initializes request parameters for later use by the {@link #send(Object)} 
	 * method. It sets {@link #readyState} to {@link #OPEN}, deletes any previously 
	 * specified request headers and previously received response headers, and sets the 
	 * {@link #responseText}, {@link #responseXML}, {@link #status}, and {@link #statusText} 
	 * properties to their default values. It is safe to call this method when {@link #readyState} 
	 * is {@link #UNINITIALIZED} {when the {@link JsXMLHttpRequest} object is just created 
	 * or after a call to {@link #abort()}), and when {@link #readyState} is {@link #LOADED}, 
	 * (after a response has been received). The behavior of this method is unspecified 
	 * when it is called from any other state.</p>
	 * <p>Other than storing request parameters for use by {@link #send(Object)} and 
	 * resetting the {@link JsXMLHttpRequest} object for reuse, this method has no other 
	 * behavior. In particular, note that implementations do not typically open a 
	 * network connection to the web server when this method is called.</p>
	 * @param method The HTTP method to be used for the request. Reliably implemented 
	 * values include "GET", "POST", and "HEAD". Implementations may also support other 
	 * methods as well.
	 * @param url The URL that is the subject of the request. Most browsers impose a 
	 * same-origin security policy and require that this URL have the same host name and 
	 * port as the document that contains the script. Relative URLs are resolved in the 
	 * normal way, using the URL of the document that contains the script.
	 * @param async Specifies whether the request should be performed asynchronously or 
	 * not. If this argument is <tt>false</tt>, the request is synchronous, and a 
	 * subsequent call to {@link #send(Object)} will block until the response is fully 
	 * received. If this argument is <tt>true</tt> or is undefined, the request is 
	 * asynchronous, and an {@link #onreadystatechange} event handler is typically 
	 * required.
	 * @since 1.0
	 * @see #open(String, String)
	 * @see #open(String, String, Boolean, String, String)
	 * @see #send(Object)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void open(String method, String url, Boolean async) {
		call(open, new Vars<Object>().add(method).add(url).add(async));
	}
	/**
	 * <p>Initializes HTTP request parameters, such as the URL and HTTP method, but 
	 * does not send the request.</p>
	 * <p>This method initializes request parameters for later use by the {@link #send(Object)} 
	 * method. It sets {@link #readyState} to {@link #OPEN}, deletes any previously 
	 * specified request headers and previously received response headers, and sets the 
	 * {@link #responseText}, {@link #responseXML}, {@link #status}, and {@link #statusText} 
	 * properties to their default values. It is safe to call this method when {@link #readyState} 
	 * is {@link #UNINITIALIZED} {when the {@link JsXMLHttpRequest} object is just created 
	 * or after a call to {@link #abort()}), and when {@link #readyState} is {@link #LOADED}, 
	 * (after a response has been received). The behavior of this method is unspecified 
	 * when it is called from any other state.</p>
	 * <p>Other than storing request parameters for use by {@link #send(Object)} and 
	 * resetting the {@link JsXMLHttpRequest} object for reuse, this method has no other 
	 * behavior. In particular, note that implementations do not typically open a 
	 * network connection to the web server when this method is called.</p>
	 * @param method The HTTP method to be used for the request. Reliably implemented 
	 * values include "GET", "POST", and "HEAD". Implementations may also support other 
	 * methods as well.
	 * @param url The URL that is the subject of the request. Most browsers impose a 
	 * same-origin security policy and require that this URL have the same host name and 
	 * port as the document that contains the script. Relative URLs are resolved in the 
	 * normal way, using the URL of the document that contains the script.
	 * @param async Specifies whether the request should be performed asynchronously or 
	 * not. If this argument is <tt>false</tt>, the request is synchronous, and a 
	 * subsequent call to {@link #send(Object)} will block until the response is fully 
	 * received. If this argument is <tt>true</tt> or is undefined, the request is 
	 * asynchronous, and an {@link #onreadystatechange} event handler is typically 
	 * required.
	 * @param username An optional argument specifying authorization user name for use 
	 * with URLs that require authorization. If specified, it overrides the user name 
	 * specified in the URL itself.
	 * @param password An optional argument specifying authorization password for use 
	 * with URLs that require authorization. If specified, it overrides the password 
	 * specified in the URL itself.
	 * @since 1.0
	 * @see #open(String, String)
	 * @see #open(String, String, Boolean)
	 * @see #send(Object)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void open(String method, String url, Boolean async, String username, String password) {
		call(open, new Vars<Object>().add(method).add(url).add(async).add(username).add(password));
	}
	/**
	 * <p>Sends the HTTP request, using parameters passed to the {@link #open(String, String, Boolean, String, String)} 
	 * method and an optional request <tt>body</tt> passed to this method.</p>
	 * <p>This method causes an HTTP request to be issued. If there has been no previous 
	 * call to {@link #open(String, String, Boolean)}, or, more generally, if {@link #readyState} 
	 * is not {@link #OPEN}, this method throws an error. Otherwise, it issues an HTTP 
	 * request that consists of:
	 * <ul>
	 * <li>The HTTP method, URL, and authorization credentials (if any) specified in the 
	 * previous call to {@link #open(String, String, Boolean, String, String)}.</li>
	 * <li>The request headers, if any, specified by previous calls to {@link #setRequestHeader(String, String)}.</li>
	 * <li>The <tt>body</tt> argument passed to this method.</li>
	 * </ul>
	 * Once the request has been issued, this method sets {@link #readyState} to {@link #SENT} 
	 * and triggers the {@link #onreadystatechange} event handler.</p>
	 * <p>If the <tt>async</tt> argument to the previous call to {@link #open(String, String, Boolean, String, String)} 
	 * was <tt>false</tt>, this method blocks and does not return until {@link #readyState} 
	 * is {@link #LOADED} and the server's response has been fully received. Otherwise, 
	 * if the <tt>async</tt> argument is <tt>true</tt> or if that argument is undefined, 
	 * this method returns immediately, and the server's response is processed on a 
	 * background thread.</p>
	 * <p>If the server responds with an HTTP redirect, this method or the background 
	 * thread follow the redirect automatically. When all HTTP response headers have 
	 * been received, this method or the background thread sets {@link #readyState} to 
	 * {@link #RECEIVING} and triggers the {@link #onreadystatechange} event handler. 
	 * If the response is long, this method or the background thread may trigger the 
	 * {@link #onreadystatechange} more than once while in state {@link #RECEIVING}. 
	 * This can serve as a download progress indicator. Finally, when the response is 
	 * complete, this method or the background thread sets {@link #readyState} to {@link #LOADED} 
	 * and triggers the event handler one last time.</p>
	 * @param body If the HTTP method specified by the call to {@link #open(String, String, Boolean, String, String)} 
	 * is "POST" or "PUT", this argument specifies the body of the request, as a string 
	 * or {@link JsDocument} object, or <tt>null</tt> if no body is necessary. For any 
	 * other method, this argument is unused and should be <tt>null</tt>, but some 
	 * implementations do not allow you to omit this argument.
	 * @since 1.0
	 * @see #open(String, String)
	 * @see #open(String, String, Boolean)
	 * @see #open(String, String, Boolean, String, String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void send(Object body) {
		call(send, body);
	}
	/**
	 * <p>Sets or adds an HTTP request header to an open but unsent request.</p>
	 * <p>This method specifies an HTTP request header that should be included in the 
	 * request issued by a subsequent call to {@link #send(Object)}. This method may be 
	 * called only when {@link #readyState} is {@link #OPEN}, that is, after a call to 
	 * {@link #open(String, String, Boolean, String, String)} but before a call to {@link #send(Object)}.</p>
	 * <p>If a header with the specified name has already been specified, the new value 
	 * for that header is the previously specified value, plus a comma, a space, and the 
	 * value specified in this call.</p>
	 * <p>If the call to {@link #open(String, String, Boolean, String, String)} specifies 
	 * authorization credentials, {@link JsClient#XMLHttpRequest} automatically sends an 
	 * appropriate <tt>Authorization</tt> request header. You can append to this header 
	 * with this method, however. Similarly, if the web browser has stored cookies 
	 * associated with the URL passed to {@link #open(String, String, Boolean, String, String)}, 
	 * appropriate <tt>Cookie</tt> or <tt>Cookie2</tt> headers are automatically included 
	 * with the request. You can append additional cookies to these headers by calling 
	 * this method. {@link JsClient#XMLHttpRequest} may also provide a default value for 
	 * the <tt>User-Agent</tt> header. If it does this, any value you specify for that 
	 * header is appended to the default value.</p>
	 * <p>Some request headers are automatically set by the {@link JsClient#XMLHttpRequest} 
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
	 * @param name The name of the header to be set. This argument should not contain 
	 * spaces, colons, linefeeds, or newlines.
	 * @param value The value for the header. This argument should not contain 
	 * linefeeds or newlines.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void setRequestHeader(String name, String value) {
		call(setRequestHeader, new Vars<Object>().add(name).add(value));
	}
}
