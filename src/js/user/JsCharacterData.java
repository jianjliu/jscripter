
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
 * {@link JsClient#CharacterData} class.</p>
 * <p>This class defines functionality for its subclasses {@link JsText} and {@link JsComment}.</p>
 * <p>Note that it is not necessary to use the string-manipulation methods defined by 
 * this class. The {@link JsCharacterData#data} property is of string type, and you can 
 * manipulate it with various string and regular expression methods.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsCharacterData extends JsClient.CharacterData.Prototype
{
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
	protected static abstract class Members extends JsClient.CharacterData.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCharacterData#data
		 * @see JsCharacterData.Member#data
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid data   = id("data"  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsCharacterData#length
		 * @see JsCharacterData.Member#length
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid length = id("length");
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
	public static class Member extends JsClient.CharacterData.Prototype.Member
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
		public JsCharacterData with(ObjectLike o) {
			return new JsCharacterData(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCharacterData} 
		 * node object refers to the text value contained by the node.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String.Member data   = new Value.String.Member(this, Members.data  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsCharacterData} 
		 * node object refers to the number of characters contained by the node.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member length = new Value.Number.Member(this, Members.length);
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsCharacterData(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCharacterData} 
	 * node object refers to the text value contained by the node.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String.Member data   = new Value.String.Member(Members.data  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsCharacterData} 
	 * node object refers to the number of characters contained by the node.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member length = new Value.Number.Member(Members.length);

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
	public JsCharacterData valueOf() {
		return new JsCharacterData((JsObject)var().valueOf());
	}
	/**
	 * <p>Appends the specified string to the text contained by this node.</p>
	 * <p>This method appends the string <tt>arg</tt> to the end of the {@link #data} 
	 * property for the current node.</p>
	 * @param arg The string to be appended to the current node.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if this method was called on a node that is read-only and may not be modified. 
	 * See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void appendData(String arg) {
		call(appendData, arg);
	}
	/**
	 * <p>Appends the specified string to the text contained by this node.</p>
	 * <p>This method appends the string <tt>arg</tt> to the end of the {@link #data} 
	 * property for the current node.</p>
	 * @param arg The string to be appended to the current node.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if this method was called on a node that is read-only and may not be modified. 
	 * See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void appendData(StringLike arg) {
		call(appendData, arg);
	}
	/**
	 * <p>Deletes text from the current node, starting with the character at the 
	 * specified offset and continuing for the specified number of characters.</p>
	 * <p>This method deletes characters from the current node, starting with the 
	 * character at the position <tt>offset</tt> and continuing for <tt>count</tt> 
	 * characters. If <tt>offset</tt> plus <tt>count</tt> is greater than the number of 
	 * characters in the current node, all characters from <tt>offset</tt> to the end of 
	 * the string are deleted..</p>
	 * @param offset The position of the first character to be deleted.
	 * @param count The number of characters to be deleted.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if this method was called on a node that is read-only and may not be modified, or 
	 * the value {@link JsDOMException#INDEX_SIZE_ERR} if the <tt>offset</tt> or <tt>count</tt> 
	 * argument is negative, or <tt>offset</tt> is greater than the {@link #length} of 
	 * the current node. See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void deleteData(Number offset, Number count) {
		call(deleteData, new Vars<Object>().add(offset).add(count));
	}
	/**
	 * <p>Inserts the specified string into the text of the current node at the specified 
	 * character offset.</p>
	 * <p>This method inserts the specified string <tt>arg</tt> into the text of the 
	 * current node at the specified position <tt>offset</tt>.</p>
	 * @param offset The character position within the current node at which the string 
	 * is to be inserted.
	 * @param arg The string to insert.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if this method was called on a node that is read-only and may not be modified, or 
	 * the value {@link JsDOMException#INDEX_SIZE_ERR} if the <tt>offset</tt> argument 
	 * is negative or greater than the {@link #length} of the current node. See 
	 * {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void insertData(Number offset, String arg) {
		call(insertData, new Vars<Object>().add(offset).add(arg));
	}
	/**
	 * <p>Replaces the characters starting at the specified character offset and 
	 * continuing for the specified number of characters with the specified string.</p>
	 * <p>This method replaces <tt>count</tt> characters starting at position <tt>offset</tt> 
	 * within the string <tt>arg</tt>. If the sum of <tt>offset</tt> and <tt>count</tt> 
	 * is greater than the {@link #length} of the current node, all characters from 
	 * <tt>offset</tt> on are replaced.</p>
	 * @param offset The character position within the current node at which the 
	 * replacement is to begin.
	 * @param count The number of characters to be replaced.
	 * @param arg The string that replaces the characters specified by <tt>offset</tt> 
	 * and <tt>count</tt>.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if this method was called on a node that is read-only and may not be modified, or 
	 * the value {@link JsDOMException#INDEX_SIZE_ERR} if the <tt>offset</tt> or <tt>count</tt> 
	 * argument is negative, or <tt>offset</tt> is greater than the {@link #length} of 
	 * the current node. See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void replaceData(Number offset, Number count, String arg) {
		call(replaceData, new Vars<Object>().add(offset).add(count).add(arg));
	}
	/**
	 * <p>Returns a copy of the text starting at the specified character offset and 
	 * continuing for the specified number of characters.</p>
	 * <p>This method extracts the substring that starts at position <tt>offset</tt> and 
	 * continues for <tt>count</tt> characters from the text of the current node. This 
	 * method is useful only when the amount of text contained by the current node is 
	 * larger than the maximum number of characters that can fit in a string in a 
	 * browser's JavaScript implementation. In this case, a JavaScript program cannot 
	 * use the {@link #data} property of the node directly and must instead work with 
	 * shorter substrings of the node's text. This situation is unlikely to arise in 
	 * practice.</p>
	 * @param offset The position of the first character to be returned.
	 * @param count The number of characters in the substring to be returned.
	 * @return A string that consists of <tt>count</tt> characters of the current node 
	 * starting with the character at position <tt>offset</tt>.
	 * @throws RuntimeException JavaScript throws a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#DOMSTRING_SIZE_ERR} 
	 * if specified range of text is too long to fit into a string in the browser's JavaScript 
	 * implementation, or the value {@link JsDOMException#INDEX_SIZE_ERR} if the <tt>offset</tt> 
	 * argument is negative or greater than the {@link #length} of the current node. 
	 * See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String substringData(Number offset, Number count) {
		return call(substringData, new Vars<Object>().add(offset).add(count));
	}
}
