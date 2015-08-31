
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

package js.dom;

import js.*;
import js.core.*;
import js.user.*;

/**
 * <p>An <b>opaque</b> interface for DOM Level 2 HTML implementors.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public interface DOM2HTML
{
	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLCollection</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class HTMLCollection extends JsFunction<JsHTMLCollection<?>>
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
		public static class Member extends JsFunction.Member<JsHTMLCollection<?>>
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLCollection with(ObjectLike o) {
				return new HTMLCollection(super.with(o));
			}
			@Override
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
			public HTMLCollection with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member<?> prototype = new Prototype.Member<JsHTMLElement>(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLCollection(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member<?> prototype = new Prototype.Member<JsHTMLElement>(Members.prototype);

		public static class Prototype<T extends JsHTMLElement> extends JsObject
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
			protected static abstract class Members extends JsObject.Members
			{
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLCollection.Prototype#item
				 * @see DOM2HTML.HTMLCollection.Prototype.Member#item
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid item      = id("item"     );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLCollection.Prototype#namedItem
				 * @see DOM2HTML.HTMLCollection.Prototype.Member#namedItem
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid namedItem = id("namedItem");
			}
			public static class Member<T extends JsHTMLElement> extends JsObject.Member
			{
				private final Generic<?> eWrapper;

				public Member(JsObject.Member q, Mid mid, Generic<?> eWrapper) {
					super(q, mid);
					this.eWrapper = eWrapper;
				}
				public Member(Mid mid, Generic<?> eWrapper) {
					super(mid);
					this.eWrapper = eWrapper;
				}
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
					this(q, mid, null);
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
					this(mid, null);
				}
				protected final Generic<?> getElementWrapper() {
					return eWrapper;
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
				public Prototype<T> with(ObjectLike o) {
					return new Prototype<T>(super.with(o), getElementWrapper());
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLCollection#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLCollection<T>> valueOf = new JsFunction.Member<JsHTMLCollection<T>>(this, Members.valueOf, Generic.get(JsHTMLCollection.class, getElementWrapper()));
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLCollection#item(Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<T> item = new JsFunction.Member<T>(this, Members.item, getElementWrapper());
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLCollection#namedItem(String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<T> namedItem = new JsFunction.Member<T>(this, Members.namedItem, getElementWrapper());
			}

			private final Generic<?> eWrapper;

			protected Prototype(JsObject var, Generic<?> eWrapper) {
				super(var(var, (JsFunction<?>)null));
				this.eWrapper = eWrapper;
			}
			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				this(var, Generic.get(JsHTMLElement.class));
			}
			public final Generic<?> getElementWrapper() {
				return eWrapper;
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLCollection#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLCollection<JsHTMLElement>> valueOf = new JsFunction.Member<JsHTMLCollection<JsHTMLElement>>(Members.valueOf, Generic.get(JsHTMLCollection.class, Generic.get(JsHTMLElement.class)));
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLCollection#item(Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> item = new JsFunction.Member<JsHTMLElement>(Members.item, Generic.get(JsHTMLElement.class));
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLCollection#namedItem(String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> namedItem = new JsFunction.Member<JsHTMLElement>(Members.namedItem, Generic.get(JsHTMLElement.class));
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLDocument</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLDocument extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLDocument with(ObjectLike o) {
				return new HTMLDocument(super.with(o));
			}
			@Override
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
			public HTMLDocument with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLDocument(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsDocument
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
			protected static abstract class Members extends JsDocument.Members
			{
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLDocument.Prototype#close
				 * @see DOM2HTML.HTMLDocument.Prototype.Member#close
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid close             = id("close"            );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLDocument.Prototype#getElementsByName
				 * @see DOM2HTML.HTMLDocument.Prototype.Member#getElementsByName
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid getElementsByName = id("getElementsByName");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLDocument.Prototype#open
				 * @see DOM2HTML.HTMLDocument.Prototype.Member#open
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid open              = id("open"             );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLDocument.Prototype#write
				 * @see DOM2HTML.HTMLDocument.Prototype.Member#write
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid write             = id("write"            );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLDocument.Prototype#writeln
				 * @see DOM2HTML.HTMLDocument.Prototype.Member#writeln
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid writeln           = id("writeln"          );
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
			public static class Member extends JsDocument.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLDocument#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLDocument> valueOf = new JsFunction.Member<JsHTMLDocument>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLDocument#close()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> close   = new JsFunction.Member<java.lang.Object>(this, Members.close  );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLDocument#open()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> open    = new JsFunction.Member<java.lang.Object>(this, Members.open   );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLDocument#write(String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> write   = new JsFunction.Member<java.lang.Object>(this, Members.write  );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLDocument#writeln(String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> writeln = new JsFunction.Member<java.lang.Object>(this, Members.writeln);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLDocument#getElementsByTagName(String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsNodeList<JsHTMLElement>> getElementsByName = new JsFunction.Member<JsNodeList<JsHTMLElement>>(this, Members.getElementsByName);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLDocument#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLDocument> valueOf = new JsFunction.Member<JsHTMLDocument>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLDocument#close()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> close   = new JsFunction.Member<java.lang.Object>(Members.close  );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLDocument#open()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> open    = new JsFunction.Member<java.lang.Object>(Members.open   );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLDocument#write(String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> write   = new JsFunction.Member<java.lang.Object>(Members.write  );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLDocument#writeln(String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> writeln = new JsFunction.Member<java.lang.Object>(Members.writeln);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLDocument#getElementsByTagName(String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsNodeList<JsHTMLElement>> getElementsByName = new JsFunction.Member<JsNodeList<JsHTMLElement>>(Members.getElementsByName);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLElement with(ObjectLike o) {
				return new HTMLElement(super.with(o));
			}
			@Override
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
			public HTMLElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsElement
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
			protected static abstract class Members extends JsElement.Members
			{
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLElement.Prototype#scrollIntoView
				 * @see DOM2HTML.HTMLElement.Prototype.Member#scrollIntoView
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid scrollIntoView = id("scrollIntoView"  );
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
			public static class Member extends JsElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLElement> valueOf = new JsFunction.Member<JsHTMLElement>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLElement#scrollIntoView()
				 * @see JsHTMLElement#scrollIntoView(Boolean)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> scrollIntoView = new JsFunction.Member<java.lang.Object>(this, Members.scrollIntoView);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLElement> valueOf = new JsFunction.Member<JsHTMLElement>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLElement#scrollIntoView()
			 * @see JsHTMLElement#scrollIntoView(Boolean)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> scrollIntoView = new JsFunction.Member<java.lang.Object>(Members.scrollIntoView);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLAnchorElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLAnchorElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLAnchorElement with(ObjectLike o) {
				return new HTMLAnchorElement(super.with(o));
			}
			@Override
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
			public HTMLAnchorElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLAnchorElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			protected static abstract class Members extends JsHTMLElement.Members
			{
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLAnchorElement.Prototype#blur
				 * @see DOM2HTML.HTMLAnchorElement.Prototype.Member#blur
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid blur   = id("blur"  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLAnchorElement.Prototype#focus
				 * @see DOM2HTML.HTMLAnchorElement.Prototype.Member#focus
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid focus = id("focus");
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLAnchorElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLAnchorElement> valueOf = new JsFunction.Member<JsHTMLAnchorElement>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLAnchorElement#blur()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> blur   = new JsFunction.Member<java.lang.Object>(this, Members.blur  );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLAnchorElement#focus()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> focus = new JsFunction.Member<java.lang.Object>(this, Members.focus);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLAnchorElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLAnchorElement> valueOf = new JsFunction.Member<JsHTMLAnchorElement>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLAnchorElement#blur()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> blur   = new JsFunction.Member<java.lang.Object>(Members.blur  );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLAnchorElement#focus()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> focus = new JsFunction.Member<java.lang.Object>(Members.focus);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLAppletElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLAppletElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLAppletElement with(ObjectLike o) {
				return new HTMLAppletElement(super.with(o));
			}
			@Override
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
			public HTMLAppletElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLAppletElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLAppletElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLAppletElement> valueOf = new JsFunction.Member<JsHTMLAppletElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLAppletElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLAppletElement> valueOf = new JsFunction.Member<JsHTMLAppletElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLAreaElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLAreaElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLAreaElement with(ObjectLike o) {
				return new HTMLAreaElement(super.with(o));
			}
			@Override
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
			public HTMLAreaElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLAreaElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLAreaElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLAreaElement> valueOf = new JsFunction.Member<JsHTMLAreaElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLAreaElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLAreaElement> valueOf = new JsFunction.Member<JsHTMLAreaElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLBaseElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLBaseElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLBaseElement with(ObjectLike o) {
				return new HTMLBaseElement(super.with(o));
			}
			@Override
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
			public HTMLBaseElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLBaseElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLBaseElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLBaseElement> valueOf = new JsFunction.Member<JsHTMLBaseElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @see JsHTMLBaseElement#valueOf()
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLBaseElement> valueOf = new JsFunction.Member<JsHTMLBaseElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLBaseFontElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLBaseFontElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLBaseFontElement with(ObjectLike o) {
				return new HTMLBaseFontElement(super.with(o));
			}
			@Override
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
			public HTMLBaseFontElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLBaseFontElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLBaseFontElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLBaseFontElement> valueOf = new JsFunction.Member<JsHTMLBaseFontElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @see JsHTMLBaseFontElement#valueOf()
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLBaseFontElement> valueOf = new JsFunction.Member<JsHTMLBaseFontElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLQuoteElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLQuoteElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLQuoteElement with(ObjectLike o) {
				return new HTMLQuoteElement(super.with(o));
			}
			@Override
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
			public HTMLQuoteElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLQuoteElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLQuoteElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLQuoteElement> valueOf = new JsFunction.Member<JsHTMLQuoteElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLQuoteElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLQuoteElement> valueOf = new JsFunction.Member<JsHTMLQuoteElement>(Members.valueOf);
		}

	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLBodyElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLBodyElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLBodyElement with(ObjectLike o) {
				return new HTMLBodyElement(super.with(o));
			}
			@Override
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
			public HTMLBodyElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLBodyElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLBodyElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLBodyElement> valueOf = new JsFunction.Member<JsHTMLBodyElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLBodyElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLBodyElement> valueOf = new JsFunction.Member<JsHTMLBodyElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLBRElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLBRElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLBRElement with(ObjectLike o) {
				return new HTMLBRElement(super.with(o));
			}
			@Override
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
			public HTMLBRElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLBRElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLBRElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLBRElement> valueOf = new JsFunction.Member<JsHTMLBRElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLBRElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLBRElement> valueOf = new JsFunction.Member<JsHTMLBRElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLTableCaptionElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLTableCaptionElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLTableCaptionElement with(ObjectLike o) {
				return new HTMLTableCaptionElement(super.with(o));
			}
			@Override
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
			public HTMLTableCaptionElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLTableCaptionElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTableCaptionElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLTableCaptionElement> valueOf = new JsFunction.Member<JsHTMLTableCaptionElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTableCaptionElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLTableCaptionElement> valueOf = new JsFunction.Member<JsHTMLTableCaptionElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLTableColElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLTableColElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLTableColElement with(ObjectLike o) {
				return new HTMLTableColElement(super.with(o));
			}
			@Override
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
			public HTMLTableColElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLTableColElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTableColElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLTableColElement> valueOf = new JsFunction.Member<JsHTMLTableColElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTableColElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLTableColElement> valueOf = new JsFunction.Member<JsHTMLTableColElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLModElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLModElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLModElement with(ObjectLike o) {
				return new HTMLModElement(super.with(o));
			}
			@Override
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
			public HTMLModElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLModElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLModElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLModElement> valueOf = new JsFunction.Member<JsHTMLModElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLModElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLModElement> valueOf = new JsFunction.Member<JsHTMLModElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLDirectoryElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLDirectoryElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLDirectoryElement with(ObjectLike o) {
				return new HTMLDirectoryElement(super.with(o));
			}
			@Override
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
			public HTMLDirectoryElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLDirectoryElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLDirectoryElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLDirectoryElement> valueOf = new JsFunction.Member<JsHTMLDirectoryElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLDirectoryElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLDirectoryElement> valueOf = new JsFunction.Member<JsHTMLDirectoryElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLDivElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLDivElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLDivElement with(ObjectLike o) {
				return new HTMLDivElement(super.with(o));
			}
			@Override
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
			public HTMLDivElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLDivElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLDivElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLDivElement> valueOf = new JsFunction.Member<JsHTMLDivElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLDivElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLDivElement> valueOf = new JsFunction.Member<JsHTMLDivElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLDListElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLDListElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLDListElement with(ObjectLike o) {
				return new HTMLDListElement(super.with(o));
			}
			@Override
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
			public HTMLDListElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLDListElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLDListElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLDListElement> valueOf = new JsFunction.Member<JsHTMLDListElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLDListElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLDListElement> valueOf = new JsFunction.Member<JsHTMLDListElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLFieldSetElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLFieldSetElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLFieldSetElement with(ObjectLike o) {
				return new HTMLFieldSetElement(super.with(o));
			}
			@Override
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
			public HTMLFieldSetElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLFieldSetElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLFieldSetElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLFieldSetElement> valueOf = new JsFunction.Member<JsHTMLFieldSetElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLFieldSetElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLFieldSetElement> valueOf = new JsFunction.Member<JsHTMLFieldSetElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLFontElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLFontElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLFontElement with(ObjectLike o) {
				return new HTMLFontElement(super.with(o));
			}
			@Override
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
			public HTMLFontElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLFontElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLFontElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLFontElement> valueOf = new JsFunction.Member<JsHTMLFontElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLFontElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLFontElement> valueOf = new JsFunction.Member<JsHTMLFontElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLFrameSetElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLFrameSetElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLFrameSetElement with(ObjectLike o) {
				return new HTMLFrameSetElement(super.with(o));
			}
			@Override
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
			public HTMLFrameSetElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLFrameSetElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLFrameSetElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLFrameSetElement> valueOf = new JsFunction.Member<JsHTMLFrameSetElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLFrameSetElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLFrameSetElement> valueOf = new JsFunction.Member<JsHTMLFrameSetElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLHeadingElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLHeadingElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLHeadingElement with(ObjectLike o) {
				return new HTMLHeadingElement(super.with(o));
			}
			@Override
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
			public HTMLHeadingElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLHeadingElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLHeadingElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLHeadingElement> valueOf = new JsFunction.Member<JsHTMLHeadingElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLHeadingElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLHeadingElement> valueOf = new JsFunction.Member<JsHTMLHeadingElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLHeadElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLHeadElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLHeadElement with(ObjectLike o) {
				return new HTMLHeadElement(super.with(o));
			}
			@Override
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
			public HTMLHeadElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLHeadElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLHeadElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLHeadElement> valueOf = new JsFunction.Member<JsHTMLHeadElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLHeadElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLHeadElement> valueOf = new JsFunction.Member<JsHTMLHeadElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLHRElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLHRElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLHRElement with(ObjectLike o) {
				return new HTMLHRElement(super.with(o));
			}
			@Override
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
			public HTMLHRElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLHRElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLHRElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLHRElement> valueOf = new JsFunction.Member<JsHTMLHRElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLHRElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLHRElement> valueOf = new JsFunction.Member<JsHTMLHRElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLHtmlElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLHtmlElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLHtmlElement with(ObjectLike o) {
				return new HTMLHtmlElement(super.with(o));
			}
			@Override
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
			public HTMLHtmlElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLHtmlElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLHtmlElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLHtmlElement> valueOf = new JsFunction.Member<JsHTMLHtmlElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLHtmlElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLHtmlElement> valueOf = new JsFunction.Member<JsHTMLHtmlElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLIsIndexElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLIsIndexElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLIsIndexElement with(ObjectLike o) {
				return new HTMLIsIndexElement(super.with(o));
			}
			@Override
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
			public HTMLIsIndexElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLIsIndexElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLIsIndexElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLIsIndexElement> valueOf = new JsFunction.Member<JsHTMLIsIndexElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLIsIndexElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLIsIndexElement> valueOf = new JsFunction.Member<JsHTMLIsIndexElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLLabelElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLLabelElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLLabelElement with(ObjectLike o) {
				return new HTMLLabelElement(super.with(o));
			}
			@Override
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
			public HTMLLabelElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLLabelElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLLabelElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLLabelElement> valueOf = new JsFunction.Member<JsHTMLLabelElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLLabelElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLLabelElement> valueOf = new JsFunction.Member<JsHTMLLabelElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLLegendElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLLegendElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLLegendElement with(ObjectLike o) {
				return new HTMLLegendElement(super.with(o));
			}
			@Override
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
			public HTMLLegendElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLLegendElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLLegendElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLLegendElement> valueOf = new JsFunction.Member<JsHTMLLegendElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLLegendElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLLegendElement> valueOf = new JsFunction.Member<JsHTMLLegendElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLLIElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLLIElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLLIElement with(ObjectLike o) {
				return new HTMLLIElement(super.with(o));
			}
			@Override
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
			public HTMLLIElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLLIElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLLIElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLLIElement> valueOf = new JsFunction.Member<JsHTMLLIElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLLIElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLLIElement> valueOf = new JsFunction.Member<JsHTMLLIElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLMapElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLMapElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLMapElement with(ObjectLike o) {
				return new HTMLMapElement(super.with(o));
			}
			@Override
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
			public HTMLMapElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLMapElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLMapElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLMapElement> valueOf = new JsFunction.Member<JsHTMLMapElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLMapElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLMapElement> valueOf = new JsFunction.Member<JsHTMLMapElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLMenuElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLMenuElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLMenuElement with(ObjectLike o) {
				return new HTMLMenuElement(super.with(o));
			}
			@Override
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
			public HTMLMenuElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLMenuElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLMenuElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLMenuElement> valueOf = new JsFunction.Member<JsHTMLMenuElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLMenuElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLMenuElement> valueOf = new JsFunction.Member<JsHTMLMenuElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLMetaElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLMetaElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLMetaElement with(ObjectLike o) {
				return new HTMLMetaElement(super.with(o));
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
			public HTMLMetaElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLMetaElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLMetaElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLMetaElement> valueOf = new JsFunction.Member<JsHTMLMetaElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLMetaElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLMetaElement> valueOf = new JsFunction.Member<JsHTMLMetaElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLObjectElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLObjectElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLObjectElement with(ObjectLike o) {
				return new HTMLObjectElement(super.with(o));
			}
			@Override
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
			public HTMLObjectElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLObjectElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLObjectElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLObjectElement> valueOf = new JsFunction.Member<JsHTMLObjectElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLObjectElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLObjectElement> valueOf = new JsFunction.Member<JsHTMLObjectElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLOListElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLOListElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLOListElement with(ObjectLike o) {
				return new HTMLOListElement(super.with(o));
			}
			@Override
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
			public HTMLOListElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLOListElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLOListElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLOListElement> valueOf = new JsFunction.Member<JsHTMLOListElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLOListElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLOListElement> valueOf = new JsFunction.Member<JsHTMLOListElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLOptGroupElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLOptGroupElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLOptGroupElement with(ObjectLike o) {
				return new HTMLOptGroupElement(super.with(o));
			}
			@Override
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
			public HTMLOptGroupElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLOptGroupElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLOptGroupElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLOptGroupElement> valueOf = new JsFunction.Member<JsHTMLOptGroupElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLOptGroupElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLOptGroupElement> valueOf = new JsFunction.Member<JsHTMLOptGroupElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLParagraphElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLParagraphElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLParagraphElement with(ObjectLike o) {
				return new HTMLParagraphElement(super.with(o));
			}
			@Override
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
			public HTMLParagraphElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLParagraphElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLParagraphElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLParagraphElement> valueOf = new JsFunction.Member<JsHTMLParagraphElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLParagraphElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLParagraphElement> valueOf = new JsFunction.Member<JsHTMLParagraphElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLParamElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLParamElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLParamElement with(ObjectLike o) {
				return new HTMLParamElement(super.with(o));
			}
			@Override
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
			public HTMLParamElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLParamElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLParamElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLParamElement> valueOf = new JsFunction.Member<JsHTMLParamElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLParamElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLParamElement> valueOf = new JsFunction.Member<JsHTMLParamElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLPreElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLPreElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLPreElement with(ObjectLike o) {
				return new HTMLPreElement(super.with(o));
			}
			@Override
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
			public HTMLPreElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLPreElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLPreElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLPreElement> valueOf = new JsFunction.Member<JsHTMLPreElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLPreElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLPreElement> valueOf = new JsFunction.Member<JsHTMLPreElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLScriptElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLScriptElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLScriptElement with(ObjectLike o) {
				return new HTMLScriptElement(super.with(o));
			}
			@Override
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
			public HTMLScriptElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLScriptElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLScriptElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLScriptElement> valueOf = new JsFunction.Member<JsHTMLScriptElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLScriptElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLScriptElement> valueOf = new JsFunction.Member<JsHTMLScriptElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLStyleElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLStyleElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLStyleElement with(ObjectLike o) {
				return new HTMLStyleElement(super.with(o));
			}
			@Override
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
			public HTMLStyleElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLStyleElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLStyleElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLStyleElement> valueOf = new JsFunction.Member<JsHTMLStyleElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLStyleElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLStyleElement> valueOf = new JsFunction.Member<JsHTMLStyleElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLTitleElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLTitleElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLTitleElement with(ObjectLike o) {
				return new HTMLTitleElement(super.with(o));
			}
			@Override
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
			public HTMLTitleElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLTitleElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTitleElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLTitleElement> valueOf = new JsFunction.Member<JsHTMLTitleElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTitleElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLTitleElement> valueOf = new JsFunction.Member<JsHTMLTitleElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLUListElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLUListElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLUListElement with(ObjectLike o) {
				return new HTMLUListElement(super.with(o));
			}
			@Override
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
			public HTMLUListElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLUListElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLUListElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLUListElement> valueOf = new JsFunction.Member<JsHTMLUListElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLUListElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLUListElement> valueOf = new JsFunction.Member<JsHTMLUListElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLCanvasElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLCanvasElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLCanvasElement with(ObjectLike o) {
				return new HTMLCanvasElement(super.with(o));
			}
			@Override
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
			public HTMLCanvasElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLCanvasElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			protected static abstract class Members extends JsHTMLElement.Members
			{
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid getContext = id("getContext");
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLCanvasElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLCanvasElement> valueOf = new JsFunction.Member<JsHTMLCanvasElement>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLCanvasElement#getContext(String)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsCanvasRenderingContext2D> getContext = new JsFunction.Member<JsCanvasRenderingContext2D>(this, Members.getContext);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLCanvasElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLCanvasElement> valueOf = new JsFunction.Member<JsHTMLCanvasElement>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLCanvasElement#getContext(String)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsCanvasRenderingContext2D> getContext = new JsFunction.Member<JsCanvasRenderingContext2D>(Members.getContext);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLFormElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLFormElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLFormElement with(ObjectLike o) {
				return new HTMLFormElement(super.with(o));
			}
			@Override
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
			public HTMLFormElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLFormElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			protected static abstract class Members extends JsHTMLElement.Members
			{
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLFormElement.Prototype#reset
				 * @see DOM2HTML.HTMLFormElement.Prototype.Member#reset
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid reset   = id("reset"  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLFormElement.Prototype#submit
				 * @see DOM2HTML.HTMLFormElement.Prototype.Member#submit
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid submit  = id("submit" );
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLFormElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLFormElement> valueOf = new JsFunction.Member<JsHTMLFormElement>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLFormElement#reset()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> reset  = new JsFunction.Member<java.lang.Object>(this, Members.reset );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLFormElement#submit()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> submit = new JsFunction.Member<java.lang.Object>(this, Members.submit);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLFormElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLFormElement> valueOf = new JsFunction.Member<JsHTMLFormElement>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLFormElement#reset()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> reset  = new JsFunction.Member<java.lang.Object>(Members.reset );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLFormElement#submit()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> submit = new JsFunction.Member<java.lang.Object>(Members.submit);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLFrameElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLFrameElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLFrameElement with(ObjectLike o) {
				return new HTMLFrameElement(super.with(o));
			}
			@Override
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
			public HTMLFrameElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLFrameElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLFrameElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLFrameElement> valueOf = new JsFunction.Member<JsHTMLFrameElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLFrameElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLFrameElement> valueOf = new JsFunction.Member<JsHTMLFrameElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLIFrameElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLIFrameElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLIFrameElement with(ObjectLike o) {
				return new HTMLIFrameElement(super.with(o));
			}
			@Override
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
			public HTMLIFrameElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLIFrameElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLIFrameElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLIFrameElement> valueOf = new JsFunction.Member<JsHTMLIFrameElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLIFrameElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLIFrameElement> valueOf = new JsFunction.Member<JsHTMLIFrameElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLImageElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLImageElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLImageElement with(ObjectLike o) {
				return new HTMLImageElement(super.with(o));
			}
			@Override
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
			public HTMLImageElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLImageElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLInputElement
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
			public static class Member extends JsHTMLInputElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLImageElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLImageElement> valueOf = new JsFunction.Member<JsHTMLImageElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLImageElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLImageElement> valueOf = new JsFunction.Member<JsHTMLImageElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLInputElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLInputElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLInputElement with(ObjectLike o) {
				return new HTMLInputElement(super.with(o));
			}
			@Override
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
			public HTMLInputElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLInputElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			protected static abstract class Members extends JsHTMLElement.Members
			{
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLInputElement.Prototype#blur
				 * @see DOM2HTML.HTMLInputElement.Prototype.Member#blur
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid blur   = id("blur"  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLInputElement.Prototype#click
				 * @see DOM2HTML.HTMLInputElement.Prototype.Member#click
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid click  = id("click" );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLInputElement.Prototype#focus
				 * @see DOM2HTML.HTMLInputElement.Prototype.Member#focus
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid focus  = id("focus" );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLInputElement.Prototype#select
				 * @see DOM2HTML.HTMLInputElement.Prototype.Member#select
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid select = id("select");
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLInputElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLInputElement> valueOf = new JsFunction.Member<JsHTMLInputElement>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLInputElement#blur()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> blur   = new JsFunction.Member<java.lang.Object>(this, Members.blur  );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLInputElement#click()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> click  = new JsFunction.Member<java.lang.Object>(this, Members.click );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLInputElement#focus()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> focus  = new JsFunction.Member<java.lang.Object>(this, Members.focus );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLInputElement#select()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> select = new JsFunction.Member<java.lang.Object>(this, Members.select);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLInputElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLInputElement> valueOf = new JsFunction.Member<JsHTMLInputElement>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLInputElement#blur()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> blur   = new JsFunction.Member<java.lang.Object>(Members.blur  );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLInputElement#click()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> click  = new JsFunction.Member<java.lang.Object>(Members.click );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLInputElement#focus()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> focus  = new JsFunction.Member<java.lang.Object>(Members.focus );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLInputElement#select()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> select = new JsFunction.Member<java.lang.Object>(Members.select);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLButtonElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLButtonElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLButtonElement with(ObjectLike o) {
				return new HTMLButtonElement(super.with(o));
			}
			@Override
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
			public HTMLButtonElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLButtonElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLInputElement
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
			protected static abstract class Members extends JsHTMLInputElement.Members
			{
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
			public static class Member extends JsHTMLInputElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLButtonElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLButtonElement> valueOf = new JsFunction.Member<JsHTMLButtonElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLButtonElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLButtonElement> valueOf = new JsFunction.Member<JsHTMLButtonElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLCheckboxElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLCheckBoxElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLCheckBoxElement with(ObjectLike o) {
				return new HTMLCheckBoxElement(super.with(o));
			}
			@Override
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
			public HTMLCheckBoxElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLCheckBoxElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLInputElement
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
			protected static abstract class Members extends JsHTMLInputElement.Members
			{
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
			public static class Member extends JsHTMLInputElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLCheckBoxElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLCheckBoxElement> valueOf = new JsFunction.Member<JsHTMLCheckBoxElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLCheckBoxElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLCheckBoxElement> valueOf = new JsFunction.Member<JsHTMLCheckBoxElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLFileUploadElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLFileUploadElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLFileUploadElement with(ObjectLike o) {
				return new HTMLFileUploadElement(super.with(o));
			}
			@Override
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
			public HTMLFileUploadElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLFileUploadElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLInputElement
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
			protected static abstract class Members extends JsHTMLInputElement.Members
			{
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
			public static class Member extends JsHTMLInputElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLFileUploadElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLFileUploadElement> valueOf = new JsFunction.Member<JsHTMLFileUploadElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLFileUploadElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLFileUploadElement> valueOf = new JsFunction.Member<JsHTMLFileUploadElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLHiddenElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLHiddenElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLHiddenElement with(ObjectLike o) {
				return new HTMLHiddenElement(super.with(o));
			}
			@Override
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
			public HTMLHiddenElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLHiddenElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLInputElement
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
			protected static abstract class Members extends JsHTMLInputElement.Members
			{
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
			public static class Member extends JsHTMLInputElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLHiddenElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLHiddenElement> valueOf = new JsFunction.Member<JsHTMLHiddenElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLHiddenElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLHiddenElement> valueOf = new JsFunction.Member<JsHTMLHiddenElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLPasswordElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLPasswordElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLPasswordElement with(ObjectLike o) {
				return new HTMLPasswordElement(super.with(o));
			}
			@Override
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
			public HTMLPasswordElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLPasswordElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLInputElement
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
			protected static abstract class Members extends JsHTMLInputElement.Members
			{
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
			public static class Member extends JsHTMLInputElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLPasswordElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLPasswordElement> valueOf = new JsFunction.Member<JsHTMLPasswordElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLPasswordElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLPasswordElement> valueOf = new JsFunction.Member<JsHTMLPasswordElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLRadioElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLRadioElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLRadioElement with(ObjectLike o) {
				return new HTMLRadioElement(super.with(o));
			}
			@Override
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
			public HTMLRadioElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLRadioElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLInputElement
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
			protected static abstract class Members extends JsHTMLInputElement.Members
			{
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
			public static class Member extends JsHTMLInputElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLRadioElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLRadioElement> valueOf = new JsFunction.Member<JsHTMLRadioElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLRadioElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLRadioElement> valueOf = new JsFunction.Member<JsHTMLRadioElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLResetElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLResetElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLResetElement with(ObjectLike o) {
				return new HTMLResetElement(super.with(o));
			}
			@Override
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
			public HTMLResetElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLResetElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLInputElement
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
			protected static abstract class Members extends JsHTMLInputElement.Members
			{
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
			public static class Member extends JsHTMLInputElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLResetElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLResetElement> valueOf = new JsFunction.Member<JsHTMLResetElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLResetElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLResetElement> valueOf = new JsFunction.Member<JsHTMLResetElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLSubmitElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLSubmitElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLSubmitElement with(ObjectLike o) {
				return new HTMLSubmitElement(super.with(o));
			}
			@Override
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
			public HTMLSubmitElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLSubmitElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLInputElement
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
			protected static abstract class Members extends JsHTMLInputElement.Members
			{
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
			public static class Member extends JsHTMLInputElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLSubmitElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLSubmitElement> valueOf = new JsFunction.Member<JsHTMLSubmitElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLSubmitElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLSubmitElement> valueOf = new JsFunction.Member<JsHTMLSubmitElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLTextFieldElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLTextFieldElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLTextFieldElement with(ObjectLike o) {
				return new HTMLTextFieldElement(super.with(o));
			}
			@Override
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
			public HTMLTextFieldElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLTextFieldElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLInputElement
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
			protected static abstract class Members extends JsHTMLInputElement.Members
			{
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
			public static class Member extends JsHTMLInputElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTextFieldElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLTextFieldElement> valueOf = new JsFunction.Member<JsHTMLTextFieldElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTextFieldElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLTextFieldElement> valueOf = new JsFunction.Member<JsHTMLTextFieldElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLLinkElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLLinkElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLLinkElement with(ObjectLike o) {
				return new HTMLLinkElement(super.with(o));
			}
			@Override
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
			public HTMLLinkElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLLinkElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			protected static abstract class Members extends JsHTMLElement.Members
			{
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLLinkElement.Prototype#blur
				 * @see DOM2HTML.HTMLLinkElement.Prototype.Member#blur
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid blur  = id("blur" );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLLinkElement.Prototype#focus
				 * @see DOM2HTML.HTMLLinkElement.Prototype.Member#focus
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid focus = id("focus");
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLLinkElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLLinkElement> valueOf = new JsFunction.Member<JsHTMLLinkElement>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLLinkElement#blur()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> blur  = new JsFunction.Member<java.lang.Object>(this, Members.blur );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLLinkElement#focus()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> focus = new JsFunction.Member<java.lang.Object>(this, Members.focus);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLLinkElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLLinkElement> valueOf = new JsFunction.Member<JsHTMLLinkElement>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLLinkElement#blur()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> blur  = new JsFunction.Member<java.lang.Object>(Members.blur );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLLinkElement#focus()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> focus = new JsFunction.Member<java.lang.Object>(Members.focus);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLOptionElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLOptionElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLOptionElement with(ObjectLike o) {
				return new HTMLOptionElement(super.with(o));
			}
			@Override
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
			public HTMLOptionElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLOptionElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLOptionElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLOptionElement> valueOf = new JsFunction.Member<JsHTMLOptionElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLOptionElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLOptionElement> valueOf = new JsFunction.Member<JsHTMLOptionElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLSelectElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLSelectElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLSelectElement with(ObjectLike o) {
				return new HTMLSelectElement(super.with(o));
			}
			@Override
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
			public HTMLSelectElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLSelectElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			protected static abstract class Members extends JsHTMLElement.Members
			{
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLSelectElement.Prototype#add
				 * @see DOM2HTML.HTMLSelectElement.Prototype.Member#add
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid add    = id("add"   );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLSelectElement.Prototype#blur
				 * @see DOM2HTML.HTMLSelectElement.Prototype.Member#blur
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid blur   = id("blur"  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLSelectElement.Prototype#focus
				 * @see DOM2HTML.HTMLSelectElement.Prototype.Member#focus
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid focus  = id("focus" );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid remove = id("remove");
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLSelectElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLSelectElement> valueOf = new JsFunction.Member<JsHTMLSelectElement>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLSelectElement#add(JsHTMLElement, JsHTMLElement)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> add    = new JsFunction.Member<java.lang.Object>(this, Members.add   );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLSelectElement#blur()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> blur   = new JsFunction.Member<java.lang.Object>(this, Members.blur  );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLSelectElement#focus()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> focus  = new JsFunction.Member<java.lang.Object>(this, Members.focus );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLSelectElement#remove(Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> remove = new JsFunction.Member<java.lang.Object>(this, Members.remove);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLSelectElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLSelectElement> valueOf = new JsFunction.Member<JsHTMLSelectElement>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLSelectElement#add(JsHTMLElement, JsHTMLElement)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> add    = new JsFunction.Member<java.lang.Object>(Members.add   );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLSelectElement#blur()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> blur   = new JsFunction.Member<java.lang.Object>(Members.blur  );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLSelectElement#focus()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> focus  = new JsFunction.Member<java.lang.Object>(Members.focus );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLSelectElement#remove(Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> remove = new JsFunction.Member<java.lang.Object>(Members.remove);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLTableCellElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLTableCellElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLTableCellElement with(ObjectLike o) {
				return new HTMLTableCellElement(super.with(o));
			}
			@Override
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
			public HTMLTableCellElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLTableCellElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTableCellElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLTableCellElement> valueOf = new JsFunction.Member<JsHTMLTableCellElement>(this, Members.valueOf);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTableCellElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLTableCellElement> valueOf = new JsFunction.Member<JsHTMLTableCellElement>(Members.valueOf);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLTableElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLTableElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLTableElement with(ObjectLike o) {
				return new HTMLTableElement(super.with(o));
			}
			@Override
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
			public HTMLTableElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLTableElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			protected static abstract class Members extends JsHTMLElement.Members
			{
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLTableElement.Prototype#createCaption
				 * @see DOM2HTML.HTMLTableElement.Prototype.Member#createCaption
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid createCaption = id("createCaption");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLTableElement.Prototype#createTFoot
				 * @see DOM2HTML.HTMLTableElement.Prototype.Member#createTFoot
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid createTFoot   = id("createTFoot"  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLTableElement.Prototype#createTHead
				 * @see DOM2HTML.HTMLTableElement.Prototype.Member#createTHead
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid createTHead   = id("createTHead"  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLTableElement.Prototype#deleteCaption
				 * @see DOM2HTML.HTMLTableElement.Prototype.Member#deleteCaption
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid deleteCaption = id("deleteCaption");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLTableElement.Prototype#deleteRow
				 * @see DOM2HTML.HTMLTableElement.Prototype.Member#deleteRow
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid deleteRow     = id("deleteRow"    );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLTableElement.Prototype#deleteTFoot
				 * @see DOM2HTML.HTMLTableElement.Prototype.Member#deleteTFoot
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid deleteTFoot   = id("deleteTFoot"  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLTableElement.Prototype#deleteTHead
				 * @see DOM2HTML.HTMLTableElement.Prototype.Member#deleteTHead
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid deleteTHead   = id("deleteTHead"  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLTableElement.Prototype#insertRow
				 * @see DOM2HTML.HTMLTableElement.Prototype.Member#insertRow
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid insertRow     = id("insertRow"    );
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTableElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLTableElement> valueOf = new JsFunction.Member<JsHTMLTableElement>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTableElement#createCaption()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLElement> createCaption = new JsFunction.Member<JsHTMLElement>(this, Members.createCaption);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTableElement#createTFoot()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLTableSectionElement> createTFoot = new JsFunction.Member<JsHTMLTableSectionElement>(this, Members.createTFoot);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTableElement#createTHead()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLTableSectionElement> createTHead = new JsFunction.Member<JsHTMLTableSectionElement>(this, Members.createTHead);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTableElement#insertRow(Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLTableRowElement> insertRow = new JsFunction.Member<JsHTMLTableRowElement>(this, Members.insertRow);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTableElement#deleteCaption()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> deleteCaption = new JsFunction.Member<java.lang.Object>(this, Members.deleteCaption);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTableElement#deleteRow(Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> deleteRow     = new JsFunction.Member<java.lang.Object>(this, Members.deleteRow    );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTableElement#deleteTFoot()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> deleteTFoot   = new JsFunction.Member<java.lang.Object>(this, Members.deleteTFoot  );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTableElement#deleteTHead()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> deleteTHead   = new JsFunction.Member<java.lang.Object>(this, Members.deleteTHead  );
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTableElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLTableElement> valueOf = new JsFunction.Member<JsHTMLTableElement>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTableElement#createCaption()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLElement> createCaption = new JsFunction.Member<JsHTMLElement>(Members.createCaption);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTableElement#createTFoot()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLTableSectionElement> createTFoot = new JsFunction.Member<JsHTMLTableSectionElement>(Members.createTFoot);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTableElement#createTHead()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLTableSectionElement> createTHead = new JsFunction.Member<JsHTMLTableSectionElement>(Members.createTHead);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTableElement#insertRow(Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLTableRowElement> insertRow = new JsFunction.Member<JsHTMLTableRowElement>(Members.insertRow);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTableElement#deleteCaption()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> deleteCaption = new JsFunction.Member<java.lang.Object>(Members.deleteCaption);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTableElement#deleteRow(Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> deleteRow     = new JsFunction.Member<java.lang.Object>(Members.deleteRow    );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTableElement#deleteTFoot()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> deleteTFoot   = new JsFunction.Member<java.lang.Object>(Members.deleteTFoot  );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTableElement#deleteTHead()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> deleteTHead   = new JsFunction.Member<java.lang.Object>(Members.deleteTHead  );
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLTableRowElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLTableRowElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLTableRowElement with(ObjectLike o) {
				return new HTMLTableRowElement(super.with(o));
			}
			@Override
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
			public HTMLTableRowElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLTableRowElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			protected static abstract class Members extends JsHTMLElement.Members
			{
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLTableRowElement.Prototype#deleteCell
				 * @see DOM2HTML.HTMLTableRowElement.Prototype.Member#deleteCell
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid deleteCell = id("deleteCell");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLTableRowElement.Prototype#insertCell
				 * @see DOM2HTML.HTMLTableRowElement.Prototype.Member#insertCell
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid insertCell = id("insertCell");
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTableRowElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLTableRowElement> valueOf = new JsFunction.Member<JsHTMLTableRowElement>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTableRowElement#deleteCell(Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> deleteCell = new JsFunction.Member<java.lang.Object>(this, Members.deleteCell);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTableRowElement#insertCell(Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLTableCellElement> insertCell = new JsFunction.Member<JsHTMLTableCellElement>(this, Members.insertCell);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTableRowElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLTableRowElement> valueOf = new JsFunction.Member<JsHTMLTableRowElement>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTableRowElement#deleteCell(Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> deleteCell = new JsFunction.Member<java.lang.Object>(Members.deleteCell);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTableRowElement#insertCell(Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLTableCellElement> insertCell = new JsFunction.Member<JsHTMLTableCellElement>(Members.insertCell);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLTableSectionElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLTableSectionElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLTableSectionElement with(ObjectLike o) {
				return new HTMLTableSectionElement(super.with(o));
			}
			@Override
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
			public HTMLTableSectionElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLTableSectionElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			protected static abstract class Members extends JsHTMLElement.Members
			{
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLTableSectionElement.Prototype#deleteRow
				 * @see DOM2HTML.HTMLTableSectionElement.Prototype.Member#deleteRow
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid deleteRow = id("deleteRow");
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLTableSectionElement.Prototype#insertRow
				 * @see DOM2HTML.HTMLTableSectionElement.Prototype.Member#insertRow
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid insertRow = id("insertRow");
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTableSectionElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLTableSectionElement> valueOf = new JsFunction.Member<JsHTMLTableSectionElement>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTableSectionElement#deleteRow(Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> deleteRow = new JsFunction.Member<java.lang.Object>(this, Members.deleteRow);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTableSectionElement#insertRow(Number)
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLTableRowElement> insertRow = new JsFunction.Member<JsHTMLTableRowElement>(this, Members.insertRow);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTableSectionElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLTableSectionElement> valueOf = new JsFunction.Member<JsHTMLTableSectionElement>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTableSectionElement#deleteRow(Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> deleteRow = new JsFunction.Member<java.lang.Object>(Members.deleteRow);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTableSectionElement#insertRow(Number)
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLTableRowElement> insertRow = new JsFunction.Member<JsHTMLTableRowElement>(Members.insertRow);
		}
	}

	/**
	 * <p>An <b>opaque</b> class representing the global <tt>HTMLTextareaElement</tt> class of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public class HTMLTextAreaElement extends JsClass
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
		public static class Member extends JsClass.Member
		{
			public Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
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
			public HTMLTextAreaElement with(ObjectLike o) {
				return new HTMLTextAreaElement(super.with(o));
			}
			@Override
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
			public HTMLTextAreaElement with() {
				return with(Js.win());
			}

			/**
			 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
			 * name of this field, qualified by the current member instance of the field, and 
			 * to access the property of the name on an object.</p>
			 * @since 1.0
			 * @javascript Re-compilers must resolve the member of this instance field to the
			 * identifier of the field name appending to the identifier resolved from its 
			 * qualifying member with a dot in between.
			 */
			public final Prototype.Member prototype = new Prototype.Member(this, Members.prototype);
		}

		/**
		 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
		 * with the wrapping constructor.</p>
		 * @param var The argument of an <b>opaque</b> object.
		 * @since 1.0
		 * @javascript Re-compilers must ignore the construction operation of this constructor,
		 * that is, replacing it with its only argument.
		 */
		public HTMLTextAreaElement(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>An <b>opaque</b> static field defining a member that is named by the field name
		 * without a qualifying member and to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this static field to the
		 * identifier of the field name.
		 */
		public static final Prototype.Member prototype = new Prototype.Member(Members.prototype);

		/**
		 * <p>An <b>opaque</b> class representing the prototype of the enclosing global
		 * class of JavaScript.</p>
		 *
		 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
		 * 
		 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
		 * generated into the target codes. Re-compilers must exit with error on the operations of
		 * accessing that kind of class objects.
		 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
		 * and <tt>instanceof</tt> to it always <tt>true</tt>.
		 */
		public static class Prototype extends JsHTMLElement
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
			protected static abstract class Members extends JsHTMLElement.Members
			{
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLTextAreaElement.Prototype#blur
				 * @see DOM2HTML.HTMLTextAreaElement.Prototype.Member#blur
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid blur   = id("blur"  );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLTextAreaElement.Prototype#focus
				 * @see DOM2HTML.HTMLTextAreaElement.Prototype.Member#focus
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid focus  = id("focus" );
				/**
				 * <p>An <b>internal</b> static field defining a member ID of the field name and
				 * used internally to define a member of the same name.</p>
				 * @since 1.0
				 * @see DOM2HTML.HTMLTextAreaElement.Prototype#select
				 * @see DOM2HTML.HTMLTextAreaElement.Prototype.Member#select
				 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
				 */
				public final static Mid select = id("select");
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
			public static class Member extends JsHTMLElement.Member
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
				public Prototype with(ObjectLike o) {
					return new Prototype(super.with(o));
				}

				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTextAreaElement#valueOf()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<JsHTMLTextAreaElement> valueOf = new JsFunction.Member<JsHTMLTextAreaElement>(this, Members.valueOf);
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTextAreaElement#blur()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> blur   = new JsFunction.Member<java.lang.Object>(this, Members.blur  );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTextAreaElement#focus()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> focus  = new JsFunction.Member<java.lang.Object>(this, Members.focus );
				/**
				 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
				 * name of this field, qualified by the current member instance of the field, and 
				 * to access the property of the name on an object.</p>
				 * @since 1.0
				 * @see JsHTMLTextAreaElement#select()
				 * @javascript Re-compilers must resolve the member of this instance field to the
				 * identifier of the field name appending to the identifier resolved from its 
				 * qualifying member with a dot in between.
				 */
				public final JsFunction.Member<?> select = new JsFunction.Member<java.lang.Object>(this, Members.select);
			}

			/**
			 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
			 * with the wrapping constructor.</p>
			 * @param var The argument of an <b>opaque</b> object.
			 * @since 1.0
			 * @javascript Re-compilers must ignore the construction operation of this constructor,
			 * that is, replacing it with its only argument.
			 */
			public Prototype(JsObject var) {
				super(var(var, (JsFunction<?>)null));
			}

			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTextAreaElement#valueOf()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<JsHTMLTextAreaElement> valueOf = new JsFunction.Member<JsHTMLTextAreaElement>(Members.valueOf);
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTextAreaElement#blur()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> blur   = new JsFunction.Member<java.lang.Object>(Members.blur  );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTextAreaElement#focus()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> focus  = new JsFunction.Member<java.lang.Object>(Members.focus );
			/**
			 * <p>An <b>opaque</b> static field defining a member that is named by the field name
			 * without a qualifying member and to access the property of the name on an object.</p>
			 * @since 1.0
			 * @see JsHTMLTextAreaElement#select()
			 * @javascript Re-compilers must resolve the member of this static field to the
			 * identifier of the field name.
			 */
			public static final JsFunction.Member<?> select = new JsFunction.Member<java.lang.Object>(Members.select);
		}
	}
}
