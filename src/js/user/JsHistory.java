
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
 * {@link JsClient#History} class.</p>
 * <p>This class was originally designed to represent the browsing history of a window. 
 * For privacy reasons, however, it no longer allows scripted access to the actual URLs 
 * that have been visited. The only functionality that remains is in the use of the 
 * {@link #back()}, {@link #forward()}, and {@link #go(Number)} methods.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see JsWindow#history
 * @see JsLocation
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsHistory extends JsClient.History.Prototype
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
	protected static abstract class Members extends JsClient.History.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsHistory#length
		 * @see JsHistory.Member#length
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
	public static class Member extends JsClient.History.Prototype.Member
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
		public JsHistory with(ObjectLike o) {
			return new JsHistory(super.with(o));
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
		public JsHistory with() {
			return with(Js.win());
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsHistory} object is 
		 * reference to an integer value specifying the number of URLs in the browser's 
		 * history list. Since there is no way to determine the index of the currently 
		 * displayed document within this list, knowing the size of this list is not 
		 * particularly helpful.</p> 
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
	public JsHistory(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsHistory} object is 
	 * reference to an integer value specifying the number of URLs in the browser's 
	 * history list. Since there is no way to determine the index of the currently 
	 * displayed document within this list, knowing the size of this list is not 
	 * particularly helpful.</p> 
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
	public final JsHistory valueOf() {
		return new JsHistory((JsObject)var().valueOf());
	}

	/**
	 * <p>Goes backward to a previously visited URL.</p>
	 * <p>A call of this method causes the window or frame to which the {@link JsHistory} 
	 * object belongs to revisit the URL (if any) that was visited immediately before 
	 * the current one. Calling this method has the same effect as clicking on the 
	 * browser's <tt>Back</tt> button. It is also equivalent to:
	 * <pre>Js.g().history.go(-1);</pre>
	 * </p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void back() {
		call(back);
	}
	/**
	 * <p>Goes forward to a previously visited URL.</p>
	 * <p>A call of this method causes the window or frame to which the {@link JsHistory} 
	 * object belongs to revisit the URL (if any) that was visited immediately afters 
	 * the current one. Calling this method has the same effect as clicking on the 
	 * browser's <tt>Forward</tt> button. It is also equivalent to:
	 * <pre>Js.g().history.go(1);</pre>
	 * </p>
	 * <p>Note that if the browser user has not used the <tt>Back</tt> button or the 
	 * <tt>Go</tt> menu to move backward through the history, and {@link #back()} and 
	 * {@link #go(Number)} methods have not been invoked, invoking this method has no 
	 * effect because the browser is already at the end of its list of URLs, and there 
	 * is no URL to go forward to.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void forward() {
		call(forward);
	}
	/**
	 * <p>Goes to a previously visited URL.</p>
	 * <p>This method takes an integer argument and causes the browser to visit the URL 
	 * that is the specified number of positions away in the history list maintained by 
	 * the {@link JsHistory} object. Positive arguments move the browser forward through 
	 * the list, and negative arguments move it backward. Thus, calling <tt>Js.g().history.go(-1)</tt> 
	 * is equivalent to calling <tt>Js.g().history.back()</tt> and produces the same 
	 * effect as clicking on the <tt>Back</tt> button. Similarly, <tt>Js.g().history.go(3)</tt> 
	 * revisits the same URL that would be visited by calling <tt>Js.g().history.forward()</tt> 
	 * three times.</p>
	 * @param relative_position The relative position in the history list of the URL to 
	 * be visited.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void go(Number relative_position) {
		call(go, relative_position);
	}
	/**
	 * <p>Goes to a previously visited URL.</p>
	 * <p>This method takes an integer argument and causes the browser to visit the URL 
	 * that is the specified number of positions away in the history list maintained by 
	 * the {@link JsHistory} object. Positive arguments move the browser forward through 
	 * the list, and negative arguments move it backward. Thus, calling <tt>Js.g().history.go(-1)</tt> 
	 * is equivalent to calling <tt>Js.g().history.back()</tt> and produces the same 
	 * effect as clicking on the <tt>Back</tt> button. Similarly, <tt>Js.g().history.go(3)</tt> 
	 * revisits the same URL that would be visited by calling <tt>Js.g().history.forward()</tt> 
	 * three times.</p>
	 * @param relative_position The relative position in the history list of the URL to 
	 * be visited.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void go(NumberLike<?> relative_position) {
		go(Js.valueOf(relative_position));
	}
	/**
	 * <p>Goes to a previously visited URL.</p>
	 * <p>This method takes a string argument and causes the browser to revisit the 
	 * first, that is most recently visited, URL that contains the specified string. 
	 * This form of the method is not well specified and may work differently on different 
	 * browsers. For example, Microsoft's documentation specifies that the argument 
	 * must match the URL of a previously specified site exactly, while old Netscape 
	 * documentation (Netscape created the <tt>History</tt> object) says that the 
	 * argument may be a substring of a previously visited URL.</p>
	 * @param target_string A URL (or URL fragment) to be visited, if a matching URL 
	 * exists in the history list.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void go(String target_string) {
		call(go, target_string);
	}
	/**
	 * <p>Goes to a previously visited URL.</p>
	 * <p>This method takes a string argument and causes the browser to revisit the 
	 * first, that is most recently visited, URL that contains the specified string. 
	 * This form of the method is not well specified and may work differently on different 
	 * browsers. For example, Microsoft's documentation specifies that the argument 
	 * must match the URL of a previously specified site exactly, while old Netscape 
	 * documentation (Netscape created the <tt>History</tt> object) says that the 
	 * argument may be a substring of a previously visited URL.</p>
	 * @param target_string A URL (or URL fragment) to be visited, if a matching URL 
	 * exists in the history list.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void go(StringLike target_string) {
		go(Js.valueOf(target_string));
	}
}
