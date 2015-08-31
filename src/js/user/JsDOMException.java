
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
 * {@link JsClient#DOMException} class.</p>
 * <p>An object of this class is thrown when a DOM method or property is used incorrectly 
 * or in an inappropriate context. The value of the {@link JsDOMException#code} property 
 * indicates the general type of exception that occurred. Note that an object of this 
 * class may be thrown when reading or writing a property of an object as well as when 
 * calling a method of an object.</p>
 * <p>The descriptions of object properties and methods in this specification include a 
 * list of exception types they may throw. Note, however, that certain commonly thrown 
 * exceptions are omitted from these lists. An object of {@link JsDOMException} with the 
 * {@link JsDOMException#code} value of {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
 * is thrown any time an attempt is made to modify a read-only node. Thus, most methods 
 * and read/write properties of the {@link JsNode} and of its subclass may throw this 
 * exception. Because read-only nodes appear only in XML documents and not in HTML 
 * documents, and because it applies so universally to the methods and writable properties 
 * of {@link JsNode} objects, the {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
 * exception is omitted from the descriptions of those methods and properties</p>
 * <p>Similarly, many DOM methods and properties that return strings may throw a 
 * {@link JsDOMException} with the value {@link JsDOMException#code} of {@link JsDOMException#DOMSTRING_SIZE_ERR}, 
 * which indicates that the text to be returned is too long to be represented as a string 
 * value in the underlying JavaScript implementation. Although this type of exception 
 * may theoretically be thrown by many properties and methods, it is very rare in 
 * practice and is omitted from the descriptions of those methods and properties</p>
 * <p>Note that not all exceptions in the DOM are signaled with a {@link JsDOMException}. 
 * Exceptions involving the DOM Range module cause a {@link JsRangeException} to be 
 * thrown.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsDOMException extends JsClient.DOMException.Prototype
{
	/**
	 * A legal value for the {@link #code} property of a {@link JsDOMException} object 
	 * indicating an out-of-bounds error for an array or string index.
	 * @since 1.0
	 * @see js.dom.DOM2Core.DOMException#INDEX_SIZE_ERR
	 * @see js.dom.DOM2Core.DOMException.Member#INDEX_SIZE_ERR
	 */
	public static final int INDEX_SIZE_ERR              = 1;
	/**
	 * A legal value for the {@link #code} property of a {@link JsDOMException} object 
	 * indicating that a requested text is too big to fit into a string in the current 
	 * JavaScript implementation.
	 * @since 1.0
	 * @see js.dom.DOM2Core.DOMException#DOMSTRING_SIZE_ERR
	 * @see js.dom.DOM2Core.DOMException.Member#DOMSTRING_SIZE_ERR
	 */
	public static final int DOMSTRING_SIZE_ERR          = 2;
	/**
	 * A legal value for the {@link #code} property of a {@link JsDOMException} object 
	 * indicating that an attempt was made to place a node somewhere illegal in the 
	 * document-tree hierarchy.
	 * @since 1.0
	 * @see js.dom.DOM2Core.DOMException#HIERARCHY_REQUEST_ERR
	 * @see js.dom.DOM2Core.DOMException.Member#HIERARCHY_REQUEST_ERR
	 */
	public static final int HIERARCHY_REQUEST_ERR       = 3;
	/**
	 * A legal value for the {@link #code} property of a {@link JsDOMException} object 
	 * indicating an attempt to use a node with a document that is different from the 
	 * document that created the node.
	 * @since 1.0
	 * @see js.dom.DOM2Core.DOMException#WRONG_DOCUMENT_ERR
	 * @see js.dom.DOM2Core.DOMException.Member#WRONG_DOCUMENT_ERR
	 */
	public static final int WRONG_DOCUMENT_ERR          = 4;
	/**
	 * A legal value for the {@link #code} property of a {@link JsDOMException} object 
	 * indicating that an illegal character is used (in an element name, for example).
	 * @since 1.0
	 * @see js.dom.DOM2Core.DOMException#INVALID_CHARACTER_ERR
	 * @see js.dom.DOM2Core.DOMException.Member#INVALID_CHARACTER_ERR
	 */
	public static final int INVALID_CHARACTER_ERR       = 5;
	/**
	 * A legal value for the {@link #code} property of a {@link JsDOMException} object 
	 * not currently used.
	 * @since 1.0
	 * @see js.dom.DOM2Core.DOMException#NO_DATA_ALLOWED_ERR
	 * @see js.dom.DOM2Core.DOMException.Member#NO_DATA_ALLOWED_ERR
	 */
	public static final int NO_DATA_ALLOWED_ERR         = 6;
	/**
	 * A legal value for the {@link #code} property of a {@link JsDOMException} object 
	 * indicating that an attempt was made to modify a node that is read-only and does 
	 * not allow modifications.
	 * @since 1.0
	 * @see js.dom.DOM2Core.DOMException#NO_MODIFICATION_ALLOWED_ERR
	 * @see js.dom.DOM2Core.DOMException.Member#NO_MODIFICATION_ALLOWED_ERR
	 */
	public static final int NO_MODIFICATION_ALLOWED_ERR = 7;
	/**
	 * A legal value for the {@link #code} property of a {@link JsDOMException} object 
	 * indicating that a node was not found where it was expected.
	 * @since 1.0
	 * @see js.dom.DOM2Core.DOMException#NOT_FOUND_ERR
	 * @see js.dom.DOM2Core.DOMException.Member#NOT_FOUND_ERR
	 */
	public static final int NOT_FOUND_ERR               = 8;
	/**
	 * A legal value for the {@link #code} property of a {@link JsDOMException} object 
	 * indicating that a method or property is not supported in the current DOM 
	 * implementation.
	 * @since 1.0
	 * @see js.dom.DOM2Core.DOMException#NOT_SUPPORTED_ERR
	 * @see js.dom.DOM2Core.DOMException.Member#NOT_SUPPORTED_ERR
	 */
	public static final int NOT_SUPPORTED_ERR           = 9;
	/**
	 * A legal value for the {@link #code} property of a {@link JsDOMException} object 
	 * indicating that an attempt was made to associate an {@link JsAttr} node with a 
	 * {@link JsElement} node when that {@link JsAttr} node was already associated with 
	 * a different {@link JsElement} node.
	 * @since 1.0
	 * @see js.dom.DOM2Core.DOMException#INUSE_ATTRIBUTE_ERR
	 * @see js.dom.DOM2Core.DOMException.Member#INUSE_ATTRIBUTE_ERR
	 */
	public static final int INUSE_ATTRIBUTE_ERR         = 10;
	/**
	 * A legal value for the {@link #code} property of a {@link JsDOMException} object 
	 * indicating an attempt to use an object that is not yet, or is no longer, in a 
	 * state that allows such use.
	 * @since 1.0
	 * @see js.dom.DOM2Core.DOMException#INVALID_STATE_ERR
	 * @see js.dom.DOM2Core.DOMException.Member#INVALID_STATE_ERR
	 */
	public static final int INVALID_STATE_ERR           = 11;
	/**
	 * A legal value for the {@link #code} property of a {@link JsDOMException} object 
	 * indicating that a specified string contains a syntax error. Commonly used with 
	 * CSS property specifications.
	 * @since 1.0
	 * @see js.dom.DOM2Core.DOMException#SYNTAX_ERR
	 * @see js.dom.DOM2Core.DOMException.Member#SYNTAX_ERR
	 */
	public static final int SYNTAX_ERR                  = 12;
	/**
	 * A legal value for the {@link #code} property of a {@link JsDOMException} object 
	 * indicating an attempt to modify the type of a {@link JsCSSRule} or 
	 * {@link JsCSSStyleSheet} object.
	 * @since 1.0
	 * @see js.dom.DOM2Core.DOMException#INVALID_MODIFICATION_ERR
	 * @see js.dom.DOM2Core.DOMException.Member#INVALID_MODIFICATION_ERR
	 */
	public static final int INVALID_MODIFICATION_ERR    = 13;
	/**
	 * A legal value for the {@link #code} property of a {@link JsDOMException} object 
	 * indicating an error involving element or attribute namespaces.
	 * @since 1.0
	 * @see js.dom.DOM2Core.DOMException#NAMESPACE_ERR
	 * @see js.dom.DOM2Core.DOMException.Member#NAMESPACE_ERR
	 */
	public static final int NAMESPACE_ERR               = 14;
	/**
	 * A legal value for the {@link #code} property of a {@link JsDOMException} object 
	 * indicating an attempt to access an object in a way that is not supported by the 
	 * implementation.
	 * @since 1.0
	 * @see js.dom.DOM2Core.DOMException#INVALID_ACCESS_ERR
	 * @see js.dom.DOM2Core.DOMException.Member#INVALID_ACCESS_ERR
	 */
	public static final int INVALID_ACCESS_ERR          = 15;

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
	protected static abstract class Members extends JsClient.DOMException.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsDOMException#code
		 * @see JsDOMException.Member#code
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid code = id("code");
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
	public static class Member extends JsClient.DOMException.Prototype.Member
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
		public JsDOMException with(ObjectLike o) {
			return new JsDOMException(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsDOMException} 
		 * object refers to an error code that provides some detail about what caused 
		 * the exception. The legal values and their meanings for the property are 
		 * defined by the static constants of {@link JsDOMException} class.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member code = new Value.Number.Member(this, Members.code);
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsDOMException(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsDOMException} 
	 * object refers to an error code that provides some detail about what caused 
	 * the exception. The legal values and their meanings for the property are 
	 * defined by the static constants of {@link JsDOMException} class.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member code = new Value.Number.Member(Members.code);

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
	public JsDOMException valueOf() {
		return new JsDOMException((JsObject)var().valueOf());
	}
}
