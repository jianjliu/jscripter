
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
 * {@link JsClient#DOMImplementation} class.</p>
 * <p>This class is a place-holder for methods that are not specific to any particular 
 * {@link JsDocument} object but rather are "global" to an implementation of the DOM.</p>
 * <p>A reference to the {@link JsDOMImplementation} object can be obtained through the 
 * {@link JsDocument#implementation} property of any {@link JsDocument} object.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsDOMImplementation extends JsClient.DOMImplementation.Prototype
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
	public static class Member extends JsClient.DOMImplementation.Prototype.Member
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
		public JsDOMImplementation with(ObjectLike o) {
			return new JsDOMImplementation(super.with(o));
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
	public JsDOMImplementation(JsObject var) {
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
	public JsDOMImplementation valueOf() {
		return new JsDOMImplementation((JsObject)var().valueOf());
	}
	/**
	 * <p>creates a new XML {@link JsDocument} object and the specified root {@link JsDocument#documentElement} 
	 * object for that document.</p>
	 * <p>If the <tt>doctype</tt> argument is not <tt>null</tt>, the {@link JsNode#ownerDocument} 
	 * property of the {@link JsDocumentType} object is set to the newly created document.</p>
	 * <p>This method is used to create XML documents and may not be supported by HTML-only 
	 * implementations.</p>
	 * @param namespaceURI The unique identifier of the name space of the root element to be 
	 * created for the document, or null for no name space.
	 * @param qualifiedName The name of the root element to be created for this document. 
	 * If <tt>namespaceURI</tt> is not <tt>null</tt>, this name should include a name 
	 * space prefix and a colon.
	 * @param doctype The {@link JsDocumentType} object for the newly created {@link JsDocument} 
	 * node, or <tt>null</tt> if none is desired.
	 * @return A {@link JsDocument} object with its {@link JsDocument#documentElement} 
	 * property set to a root {@link JsElement} node of the specified type.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#INVALID_CHARACTER_ERR} 
	 * if <tt>qualifiedName</tt> contains an illegal character, the value {@link JsDOMException#NAMESPACE_ERR} 
	 * if <tt>qualifiedName</tt> is malformed or there is a mismatch between <tt>qualifiedName</tt> 
	 * and <tt>namespaceURI</tt>, the value {@link JsDOMException#NOT_SUPPORTED_ERR} if 
	 * the current implementation does not support XML documents and has not implemented 
	 * this method, or the value {@link JsDOMException#WRONG_DOCUMENT_ERR} if <tt>doctype</tt> 
	 * is already in use for another document or was created by a different {@link JsDOMImplementation} 
	 * object. See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see #createDocumentType(String, String, String)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsDocument createDocument(String namespaceURI, String qualifiedName, JsDocumentType doctype) {
		return new JsDocument(call(createDocument, new Vars<Object>().add(namespaceURI).add(qualifiedName).add(doctype)));
	}
	/**
	 * <p>Creates a new {@link JsDocumentType} node.</p>
	 * <p>This method is useful only with XML documents. It specifies only an external 
	 * subset of the document type. As of Level 2, the DOM standard does not provide any 
	 * way to specify an internal subset, and the returned {@link JsDocumentType} does 
	 * not define any <tt>Entity</tt> or <tt>Notation</tt> nodes.</p>
	 * @param qualifiedName The name of the document type. If you are using XML name 
	 * spaces, this may be a qualified name that specifies a name space prefix and a 
	 * local name separated by a colon.
	 * @param publicId The public identifier of the document type, or <tt>null</tt>.
	 * @param systemId The system identifier of the document type, or <tt>null</tt>. 
	 * This argument typically specifies the local filename of a DTD file.
	 * @return A new {@link JsDocumentType} object with a {@link JsNode#ownerDocument} 
	 * property of <tt>null</tt>.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#INVALID_CHARACTER_ERR} 
	 * if <tt>qualifiedName</tt> contains an illegal character, the value {@link JsDOMException#NAMESPACE_ERR} 
	 * if <tt>qualifiedName</tt> is malformed, or the value {@link JsDOMException#NOT_SUPPORTED_ERR} if 
	 * the current implementation does not support XML documents and has not implemented 
	 * this method. See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsDocumentType createDocumentType(String qualifiedName, String publicId, String systemId) {
		return new JsDocumentType(call(createDocumentType, new Vars<Object>().add(qualifiedName).add(publicId).add(systemId)));
	}
	/**
	 * <p>Checks whether the current implementation supports a specified version of a 
	 * named feature.</p>
	 * <p>The W3C DOM standard is modular, and implementations are not required to 
	 * implement all modules or features of the standard. This method tests whether a 
	 * DOM implementation supports a named module of the DOM specification.</p>
	 * @param feature The name of the feature for which support is being tested. 
	 * Feature names are case-insensitive. 
	 * The complete set of valid module names for the 
	 * DOM Level 2 standard that may be used as this argument are listed as follows:
	 * <ul>
	 * <li>Core: Node, Element, Document, Text, and the other fundamental interfaces 
	 * required by all DOM implementations are implemented. All conforming implementations 
	 * must support this module.</li>
	 * <li>HTML: HTMLElement, HTMLDocument, and the other HTML-specific interfaces are 
	 * implemented.</li>
	 * <li>XML: Entity, EntityReference, ProcessingInstruction, Notation, and the other 
	 * node types that are useful only with XML documents are implemented.</li>
	 * <li>StyleSheets: Simple interfaces describing generic style-sheets are implemented.</li>
	 * <li>CSS: Interfaces that are specific to CSS style-sheets are implemented.</li>
	 * <li>CSS2: The CSS2Properties interface is implemented.</li>
	 * <li>Events: The basic event-handling interfaces are implemented.</li>
	 * <li>UIEvents: The interfaces for user-interface events are implemented.</li>
	 * <li>MouseEvents: The interfaces for mouse events are implemented.</li>
	 * <li>HTMLEvents: The interfaces for HTML events are implemented.</li>
	 * <li>MutationEvents: The interfaces for document mutation events are implemented.</li>
	 * <li>Range: The interfaces for manipulating ranges of a document are implemented.</li>
	 * <li>Traversal: The interfaces for advanced document traversal are implemented.</li>
	 * <li>Views: The interfaces for document views are implemented.</li>
	 * </ul>
	 * @param version The feature version number for which support is being tested, or 
	 * <tt>null</tt> or the empty string "" if support for any version of the feature 
	 * is sufficient. In the Level 2 DOM specification, supported version numbers are 
	 * 1.0 and 2.0.
	 * @return <tt>true</tt> if the implementation completely supports the specified 
	 * version of the specified feature; <tt>false</tt> otherwise. If no version number 
	 * is specified, the method returns <tt>true</tt> if the implementation completely 
	 * supports any version of the specified feature.
	 * @since 1.0
	 * @see JsNode#isSupported(Object, Object)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Boolean hasFeature(String feature, String version) {
		return call(hasFeature, new Vars<Object>().add(feature).add(version));
	}
}
