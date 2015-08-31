
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
 * {@link JsClient#XSLTProcessor} class.</p>
 * <p>This class enables you to transforms XML document nodes using XSLT stylesheets. 
 * To use this class, create an object of it with the no-argument constructor of the 
 * {@link JsClient#XSLTProcessor}:
 * <pre>JsXSLTProcessor xsltp = Js.win().XSLTProcessor.create();</pre>
 * and initialize it with an XSLT stylesheet with the {@link #importStyleSheet(JsNode)} 
 * method. If your stylesheet uses parameters, you can set those with {@link #setParameter(String, String, String)}. 
 * Finally, perform an actual XSL transformation with {@link #transformToDocument(JsNode)} 
 * or {@link #transformToFragment(JsNode, JsDocument)}.</p>
 * <p>IE does not implement this class. See IE-specific {@link JsNode#transformNode(JsDocument)} 
 * and {@link JsNode#transformNodeToObject(JsDocument)} methods.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see JsNode#transformNode(JsDocument)
 * @see JsNode#transformNodeToObject(JsDocument)
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsXSLTProcessor extends JsClient.XSLTProcessor.Prototype
{
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
	public static class Member extends JsClient.XSLTProcessor.Prototype.Member
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
		public JsXSLTProcessor with(ObjectLike o) {
			return new JsXSLTProcessor(super.with(o));
		}
		/**
		 * <p>Evaluates a property, represented by the current member instance, of the
		 * JavaScript global object, that is, evaluates the member to a global identifier.</p>
		 * @return The value of the current member based on the JavaScript global object.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into
		 * the JavaScript expression: 
		 * <pre>m</pre>
		 * where <tt>m</tt> is the identifier name resolved from the current member
		 * instance of the invocation.
		 */
		public JsXSLTProcessor with() {
			return with(Js.win());
		}
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsXSLTProcessor(JsObject var) {
		super(var);
	}

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
	public JsXSLTProcessor valueOf() {
		return new JsXSLTProcessor((JsObject)var().valueOf());
	}

	/**
	 * <p>Deletes any previously set parameters.</p>
	 * <p>This method erases any parameter values that have been specified with the {@link #setParameter(String, String, String)} 
	 * method. If a transformation is performed with no parameters set, the default values 
	 * specified by the stylesheet are used.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void clearParameters() {
		call(clearParameters);
	}
	/**
	 * <p>Returns the value of a named parameter.</p>
	 * @param namespaceURI The name space of the parameter.
	 * @param localName The name of the parameter.
	 * @return The value of the parameter, or <tt>null</tt> if it has not been set. 
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public String getParameter(String namespaceURI, String localName) {
		return call(getParameter, new Vars<String>().add(namespaceURI).add(localName));
	}
	/**
	 * <p>Specifies the XSLT stylesheet to be used.</p>
	 * <p>This method specifies the XSLT stylesheet to be used by future calls to 
	 * {@link #transformToDocument(JsNode)} and {@link #transformToFragment(JsNode, JsDocument)}.</p>
	 * @param stylesheet The XSLT stylesheet to be used for transformations. This may be 
	 * a {@link JsDocument} object of its own, or an <tt>&lt;xsl:stylesheet&gt;</tt> or 
	 * <tt>&lt;xsl:transform&gt;</tt> {@link JsElement} node.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void importStyleSheet(JsNode stylesheet) {
		call(importStyleSheet, stylesheet);
	}
	/**
	 * <p>Removes a named parameter.</p>
	 * <p>This method deletes the value of the named parameter, if any such parameter 
	 * was previously set with the {@link #setParameter(String, String, String)} method. 
	 * Subsequent transformations use the default value of the parameter that is 
	 * specified in the stylesheet.</p>
	 * @param namespaceURI The name space of the parameter.
	 * @param localName The name of the parameter.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void removeParameter(String namespaceURI, String localName) {
		call(removeParameter, new Vars<String>().add(namespaceURI).add(localName));
	}
	/**
	 * <p>Resets the XSLTProcessor to its initial state, clearing all parameters and 
	 * stylesheets.</p>
	 * <p>This method restores a {@link JsXSLTProcessor} object to the state it was in 
	 * when it was first created. After calling this method, there is no stylesheet and 
	 * are no parameter values associated with the object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void reset() {
		call(reset);
	}
	/**
	 * <p>Sets a named parameter to a specified value.</p>
	 * @param namespaceURI The name space of the parameter.
	 * @param localName The name of the parameter.
	 * @param value The value of the parameter.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void setParameter(String namespaceURI, String localName, String value) {
		call(setParameter, new Vars<String>().add(namespaceURI).add(localName).add(value));
	}
	/**
	 * <p>Transforms the specified document or node using the stylesheet passed to 
	 * {@link #importStyleSheet(JsNode)} and parameters passed to {@link #setParameter(String, String, String)} 
	 * and returns the result as a new {@link JsDocument} object.</p>
	 * @param source The document or node that is to be transformed.
	 * @return A {@link JsDocument} object that holds the result of the transformation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public JsDocument transformToDocument(JsNode source) {
		return call(transformToDocument, source);
	}
	/**
	 * <p>Transforms the specified document or node, returning the result as a 
	 * {@link JsDocumentFragment} object.</p>
	 * <p>This method performs an XSLT transformation on the specified node, returning 
	 * the result as a {@link JsDocumentFragment} object. The transformation uses the 
	 * XSLT stylesheet specified by {@link #importStyleSheet(JsNode)} and the parameter 
	 * values specified with {@link #setParameter(String, String, String)}. The returned 
	 * fragment can be inserted into the specified <tt>owner</tt> document.</p>
	 * @param source The document or node that is to be transformed.
	 * @param owner The document through which the returned {@link JsDocumentFragment} 
	 * object is created. The {@link JsNode#ownerDocument} property of the returned 
	 * {@link JsDocumentFragment} object refers to this document.
	 * @return A {@link JsDocumentFragment} object that holds the result of the transformation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public JsDocumentFragment transformToFragment(JsNode source, JsDocument owner) {
		return call(transformToFragment,  new Vars<JsNode>().add(source).add(owner));
	}
}
