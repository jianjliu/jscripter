
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
import js.dom.*;
import js.core.*;

/**
 * <p>An <b>opaque</b> class representing JavaScript client-side objects of the global 
 * {@link JsClient#Window} class.</p>
 * <p>The {@link JsWindow} object represents a browser window or frame.</p>
 * <p>In client-side JavaScript, the {@link JsWindow} object serves as the global object, 
 * and all expressions are evaluated in the context of the current {@link JsWindow} object. 
 * This means that no special syntax is required to refer to the current window, and you 
 * can use the properties of that window object as if they were global variables. 
 * Similarly, you can use the methods of the current window object as if they were 
 * functions. In addition, the {@link JsWindow} object also implements all the global 
 * properties and functions defined by core JavaScript.</p>
 * <p>{@link Js#win()} returns the current {@link JsWindow} object.
 * {@link JsWindow#self} and {@link JsWindow#window} properties refer to the window 
 * object itself. You can use these to make the current window reference. 
 * {@link JsWindow#parent} 
 * {@link JsWindow#frames} array refer to other {@link JsWindow} objects related to the 
 * current one.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsWindow extends JsClient.Window.Prototype implements EventTarget
{
	/**
	 * <p>An <b>opaque</b> class representing the global <tt>Imaget</tt> function of JavaScript.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
	 * generated into the target codes. Re-compilers must exit with error on the operations of
	 * accessing that kind of class objects.
	 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
	 * and <tt>instanceof</tt> to it always <tt>true</tt>.
	 */
	public static class Image extends JsFunction<JsHTMLImageElement>
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
		public static class Member extends JsFunction.Member<JsHTMLImageElement>
		{
			private Member(JsObject.Member q, Mid mid) {
				super(q, mid);
			}
			private Member(Mid mid) {
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
			public Image with(ObjectLike o) {
				return new Image(super.with(o));
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
			public Image with() {
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
		public Image(JsObject var) {
			super(var(var, (JsFunction<?>)null));
		}

		/**
		 * <p>Creates an image.</p>
		 * <p>You can create offscreen {@link JsHTMLImageElement} objects dynamically using the 
		 * constructor function of {@link JsWindow#Image}. Note that this constructor method 
		 * does not have an argument to specify the image to be loaded. As with images created 
		 * from HTML, you tell the browser to load an image by setting the <tt>src</tt> property 
		 * of any images you create explicitly. There is no way to display a {@link JsHTMLImageElement} 
		 * object created in this way. All you can do is force the {@link JsHTMLImageElement} 
		 * object to download an image by setting the {@link JsHTMLImageElement#src} property. 
		 * This is useful, however, because it loads an image into the browser's cache; if that 
		 * same image URL is used later with an actual <tt>&lt;img&gt;</tt> tag, it will display 
		 * quickly since it has already been loaded.</p>
		 * @param w An optionally specified width  for the image.
		 * @param h An optionally specified height for the image.
		 * @return The newly created image.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new Image(w, h)</pre>
		 */
		public final JsHTMLImageElement create(int w, int h) {
			return create(new Vars<java.lang.Integer>().add(w).add(h));
		}

		/**
		 * <p>Creates an image.</p>
		 * <p>You can create offscreen {@link JsHTMLImageElement} objects dynamically using the 
		 * constructor function of {@link JsWindow#Image}. Note that this constructor method 
		 * does not have an argument to specify the image to be loaded. As with images created 
		 * from HTML, you tell the browser to load an image by setting the <tt>src</tt> property 
		 * of any images you create explicitly. There is no way to display a {@link JsHTMLImageElement} 
		 * object created in this way. All you can do is force the {@link JsHTMLImageElement} 
		 * object to download an image by setting the {@link JsHTMLImageElement#src} property. 
		 * This is useful, however, because it loads an image into the browser's cache; if that 
		 * same image URL is used later with an actual <tt>&lt;img&gt;</tt> tag, it will display 
		 * quickly since it has already been loaded.</p>
		 * @param args The variable argument.
		 * @return The newly created image.
		 * @since 1.0
		 * @javascript Re-compilers must replace the instance invocation of this method with the 
		 * JavaScript invocation:
		 * <pre>new Image(args)</pre>
		 * where <tt>args</tt> must be expanded to comma-separated arguments.
		 */
		@Override
		public final JsHTMLImageElement create(Vars<?> args) {
			return new JsHTMLImageElement(super.create(args));
		}
	}

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
	protected static abstract class Members extends JsClient.Window.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#alert
		 * @see JsWindow.Member#alert
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid alert                    = id("alert"                   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#confirm
		 * @see JsWindow.Member#confirm
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid confirm                  = id("confirm"                 );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#prompt
		 * @see JsWindow.Member#prompt
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid prompt                   = id("prompt"                  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#clearInterval
		 * @see JsWindow.Member#clearInterval
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid clearInterval            = id("clearInterval"           );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#clearTimeout
		 * @see JsWindow.Member#clearTimeout
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid clearTimeout             = id("clearTimeout"            );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#setInterval
		 * @see JsWindow.Member#setInterval
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid setInterval              = id("setInterval"             );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#setTimeout
		 * @see JsWindow.Member#setTimeout
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid setTimeout               = id("setTimeout"              );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#addEventListener
		 * @see JsWindow.Member#addEventListener
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid addEventListener         = id("addEventListener"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#removeEventListener
		 * @see JsWindow.Member#removeEventListener
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid removeEventListener      = id("removeEventListener"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#attachEvent
		 * @see JsWindow.Member#attachEvent
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid attachEvent              = id("attachEvent"             );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#detachEvent
		 * @see JsWindow.Member#detachEvent
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid detachEvent              = id("detachEvent"             );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#htmlControl
		 * @see JsWindow.Member#htmlControl
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid htmlControl              = id("htmlControl"             );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#self
		 * @see JsWindow.Member#self
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid self                     = id("self"                    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#window
		 * @see JsWindow.Member#window
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid window                   = id("window"                  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#document
		 * @see JsWindow.Member#document
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid document                 = id("document"                );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#getComputedStyle
		 * @see JsWindow.Member#getComputedStyle
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid getComputedStyle         = id("getComputedStyle"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#history
		 * @see JsWindow.Member#history
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid history                  = id("history"                 );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#innerHeight
		 * @see JsWindow.Member#innerHeight
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid innerHeight              = id("innerHeight"             );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#innerWidth
		 * @see JsWindow.Member#innerWidth
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid innerWidth               = id("innerWidth"              );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#event
		 * @see JsWindow.Member#event
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid event                    = id("event"                   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#pageXOffset
		 * @see JsWindow.Member#pageXOffset
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid pageXOffset              = id("pageXOffset"             );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#pageYOffset
		 * @see JsWindow.Member#pageYOffset
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid pageYOffset              = id("pageYOffset"             );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#navigator
		 * @see JsWindow.Member#navigator
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid navigator                = id("navigator"               );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#location
		 * @see JsWindow.Member#location
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid location                 = id("location"                );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#screen
		 * @see JsWindow.Member#screen
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid screen                   = id("screen"                  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#closed
		 * @see JsWindow.Member#closed
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid closed                   = id("closed"                  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#defaultStatus
		 * @see JsWindow.Member#defaultStatus
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid defaultStatus            = id("defaultStatus"           );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#frames
		 * @see JsWindow.Member#frames
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid frames                   = id("frames"                  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#name
		 * @see JsWindow.Member#name
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid name                     = id("name"                    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#opener
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid opener                   = id("opener"                  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#outerHeight
		 * @see JsWindow.Member#outerHeight
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid outerHeight              = id("outerHeight"             );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#outerWidth
		 * @see JsWindow.Member#outerWidth
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid outerWidth               = id("outerWidth"              );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#parent
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid parent                   = id("parent"                  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#screenLeft
		 * @see JsWindow.Member#screenLeft
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid screenLeft               = id("screenLeft"              );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#screenTop
		 * @see JsWindow.Member#screenTop
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid screenTop                = id("screenTop"               );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#screenX
		 * @see JsWindow.Member#screenX
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid screenX                  = id("screenX"                 );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#screenY
		 * @see JsWindow.Member#screenY
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid screenY                  = id("screenY"                 );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#top
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid top                      = id("top"                     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#blur
		 * @see JsWindow.Member#blur
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid blur                     = id("blur"                    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#close
		 * @see JsWindow.Member#close
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid close                    = id("close"                   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#focus
		 * @see JsWindow.Member#focus
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid focus                    = id("focus"                   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#moveBy
		 * @see JsWindow.Member#moveBy
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid moveBy                   = id("moveBy"                  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#moveTo
		 * @see JsWindow.Member#moveTo
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid moveTo                   = id("moveTo"                  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#open
		 * @see JsWindow.Member#open
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid open                     = id("open"                    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#print
		 * @see JsWindow.Member#print
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid print                    = id("print"                   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#resizeBy
		 * @see JsWindow.Member#resizeBy
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid resizeBy                 = id("resizeBy"                );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#resizeTo
		 * @see JsWindow.Member#resizeTo
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid resizeTo                 = id("resizeTo"                );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#scrollBy
		 * @see JsWindow.Member#scrollBy
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid scrollBy                 = id("scrollBy"                );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#scrollTo
		 * @see JsWindow.Member#scrollTo
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid scrollTo                 = id("scrollTo"                );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#onblur
		 * @see JsWindow.Member#onblur
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onblur                   = id("onblur"                  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#onerror
		 * @see JsWindow.Member#onerror
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onerror                  = id("onerror"                 );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#onfocus
		 * @see JsWindow.Member#onfocus
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onfocus                  = id("onfocus"                 );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#onload
		 * @see JsWindow.Member#onload
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onload                   = id("onload"                  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#onresize
		 * @see JsWindow.Member#onresize
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onresize                 = id("onresize"                );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#onunload
		 * @see JsWindow.Member#onunload
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid onunload                 = id("onunload"                );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsWindow#Image
		 * @see JsWindow.Member#Image
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid Image                    = id("Image"                   );
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
	public static class Member extends JsClient.Window.Prototype.Member
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
		public JsWindow with(ObjectLike o) {
			return new JsWindow(super.with(o));
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
		public JsWindow with() {
			return with(Js.win());
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#alert(Object)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<Void> alert   = new JsFunction.Member<Void>(this, Members.alert  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#confirm(Object)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<java.lang.Boolean> confirm = new JsFunction.Member<java.lang.Boolean>(this, Members.confirm);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#prompt(Object)
		 * @see JsWindow#prompt(Object, Object)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<java.lang.String> prompt  = new JsFunction.Member<java.lang.String>(this, Members.prompt );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#clearInterval(Object)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> clearInterval = new JsFunction.Member<java.lang.Object>(this, Members.clearInterval);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#clearTimeout(Object)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> clearTimeout  = new JsFunction.Member<java.lang.Object>(this, Members.clearTimeout );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#setInterval(JsFunction, Object)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> setInterval   = new JsFunction.Member<java.lang.Object>(this, Members.setInterval  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#setTimeout(JsFunction, Object)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> setTimeout    = new JsFunction.Member<java.lang.Object>(this, Members.setTimeout   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#addEventListener(String, JsFunction, Boolean)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> addEventListener = new JsFunction.Member<java.lang.Object>(this, Members.addEventListener);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#removeEventListener(String, JsFunction, Boolean)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> removeEventListener = new JsFunction.Member<java.lang.Object>(this, Members.removeEventListener);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#attachEvent(String, JsFunction)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> attachEvent = new JsFunction.Member<java.lang.Object>(this, Members.attachEvent);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#detachEvent(String, JsFunction)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> detachEvent = new JsFunction.Member<java.lang.Object>(this, Members.detachEvent);

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member htmlControl = new Value.Boolean.Member(this, Members.htmlControl);

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
		 * read-only reference to the {@link JsDocument} object that describes the document 
		 * contained in this window or frame.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsDocument.Member document = new JsDocument.Member(this, Members.document);

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
		 * read-only reference to the {@link JsHistory} object of this window or frame.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsHistory.Member history = new JsHistory.Member(this, Members.history);

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object 
		 * refers to a read-only integer value specifying the height, in pixels, of the 
		 * document display area of this window. This dimension does not include the 
		 * size of the menu bar, tool bars, scroll bars, and so on. The property is not 
		 * supported by IE. Instead use the {@link JsHTMLElement#clientHeight} property 
		 * of {@link JsHTMLDocument#documentElement} or {@link JsHTMLDocument#body} 
		 * depending on the version of IE.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Integer.Member innerHeight = new Value.Integer.Member(this, Members.innerHeight);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object 
		 * refers to a read-only integer value specifying the width, in pixels, of the 
		 * document display area of this window. This dimension does not include the 
		 * size of the menu bar, tool bars, scroll bars, and so on. The property is not 
		 * supported by IE. Instead use the {@link JsHTMLElement#clientWidth} property 
		 * of {@link JsHTMLDocument#documentElement} or {@link JsHTMLDocument#body} 
		 * depending on the version of IE.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Integer.Member innerWidth  = new Value.Integer.Member(this, Members.innerWidth );

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object refers 
		 * to the {@link JsEvent} object that describes the most recent event. This property 
		 * is used in the IE event model. In the standard DOM event model, the {@link JsEvent} 
		 * object is passed as an argument to event-handler functions.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsEvent.Member event = new JsEvent.Member(this, Members.event);

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object 
		 * refers to a read-only integer value specifying the number of pixels that the 
		 * current document has been scrolled to the right. This property is not 
		 * supported by IE. In IE, use the {@link JsHTMLElement#scrollLeft} property of 
		 * {@link JsHTMLDocument#documentElement} or {@link JsHTMLDocument#body} 
		 * depending on the version of IE.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member pageXOffset = new Value.Number.Member(this, Members.pageXOffset);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object 
		 * refers to a read-only integer value specifying the number of pixels that the 
		 * current document has been scrolled down. This property is not 
		 * supported by IE. In IE, use the {@link JsHTMLElement#scrollTop} property of 
		 * {@link JsHTMLDocument#documentElement} or {@link JsHTMLDocument#body} 
		 * depending on the version of IE.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member pageYOffset = new Value.Number.Member(this, Members.pageYOffset);

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
		 * read-only reference to the {@link JsNavigator} object, which provides version 
		 * and configuration information about the web browser.</p>
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsNavigator.Member navigator = new JsNavigator.Member(this, Members.navigator);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
		 * reference to the {@link JsLocation} object for this window or frame. The 
		 * object specifies the URL of the currently loaded document. Setting this 
		 * property to a new URL string causes the browser to load and display the 
		 * contents of that URL.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsLocation.Member location = new JsLocation.Member(this, Members.location);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object is a
		 * read-only reference to a {@link JsScreen} object that specifies information 
		 * about the screen: the number of available pixels and the number of available 
		 * colors.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsScreen.Member screen = new JsScreen.Member(this, Members.screen);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#getComputedStyle(JsHTMLElement, String)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<JsObject> getComputedStyle = new JsFunction.Member<JsObject>(this, Members.getComputedStyle);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object 
		 * refers to a read-only boolean value specifying whether the window has been 
		 * closed. When a browser window closes, the {@link JsWindow} object that 
		 * represents it does not simply disappear; it continues to exist, but its {@link #closed} 
		 * property is set to <tt>true</tt>.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Boolean.Member closed                   = new Value.Boolean.Member               (this, Members.closed                  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object 
		 * refers to a read/write string specifying the default message that appears in 
		 * the status line of the window.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String .Member defaultStatus            = new Value.String .Member               (this, Members.defaultStatus           );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object 
		 * refers to an array of {@link JsWindow} objects, one for each {@link JsHTMLFrameElement} or 
		 * {@link JsHTMLIFrameElement} object contained within this window. Note that 
		 * frames referenced by this array may themselves contain frames and may have a 
		 * {@link #frames} array of their own.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsArray      .Member frames                   = new JsArray      .Member               (this, Members.frames                  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object 
		 * refers to a string containing the name of the window. The name is optionally 
		 * specified when the window is created with the {@link JsWindow#open(String, String, String, Boolean)} 
		 * method or with the <tt>name</tt> attribute of a <tt>&lt;frame&gt;</tt> tag. 
		 * The name of a window may be used as the value of a <tt>target</tt> attribute 
		 * of an <tt>&lt;a&gt;</tt> or <tt>&lt;form&gt;</tt> tag. Using the <tt>target</tt> 
		 * attribute in this way specifies that the hyper-linked document or the results 
		 * of form submission should be displayed in the named window or frame.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.String .Member name                     = new Value.String .Member               (this, Members.name                    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object 
		 * refers to a read-only integer value specifying the total height, in pixels, 
		 * of the browser window. This dimension includes the height of the menu bar, 
		 * tool bars, scroll bars, window borders, and so on. The property is not 
		 * supported by IE, and IE offers no alternative property.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Integer.Member outerHeight              = new Value.Integer.Member               (this, Members.outerHeight             );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object 
		 * refers to a read-only integer value specifying the total width, in pixels, 
		 * of the browser window. This dimension includes the width of the menu bar, 
		 * tool bars, scroll bars, window borders, and so on. The property is not 
		 * supported by IE, and IE offers no alternative property.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Integer.Member outerWidth               = new Value.Integer.Member               (this, Members.outerWidth              );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object 
		 * refers to a read-only integer value specifying the X coordinate of the 
		 * upper-left corner of the window on the screen. 
		 * IE, Safari, and Opera support {@link #screenLeft} and {@link #screenTop} 
		 * while Firefox and Safari support {@link #screenX} and {@link #screenY}.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Integer.Member screenLeft               = new Value.Integer.Member               (this, Members.screenLeft              );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object 
		 * refers to a read-only integer value specifying the Y coordinate of the 
		 * upper-left corner of the window on the screen. 
		 * IE, Safari, and Opera support {@link #screenLeft} and {@link #screenTop} 
		 * while Firefox and Safari support {@link #screenX} and {@link #screenY}.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Integer.Member screenTop                = new Value.Integer.Member               (this, Members.screenTop               );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object 
		 * refers to a read-only integer value specifying the X coordinate of the 
		 * upper-left corner of the window on the screen. 
		 * IE, Safari, and Opera support {@link #screenLeft} and {@link #screenTop} 
		 * while Firefox and Safari support {@link #screenX} and {@link #screenY}.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Integer.Member screenX                  = new Value.Integer.Member               (this, Members.screenX                 );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object 
		 * refers to a read-only integer value specifying the Y coordinate of the 
		 * upper-left corner of the window on the screen. 
		 * IE, Safari, and Opera support {@link #screenLeft} and {@link #screenTop} 
		 * while Firefox and Safari support {@link #screenX} and {@link #screenY}.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Integer.Member screenY                  = new Value.Integer.Member               (this, Members.screenY                 );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#blur()
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> blur                     = new JsFunction.Member<java.lang.Object>(this, Members.blur                    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#close()
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> close                    = new JsFunction.Member<java.lang.Object>(this, Members.close                   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#focus()
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> focus                    = new JsFunction.Member<java.lang.Object>(this, Members.focus                   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#moveBy(Integer, Integer)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> moveBy                   = new JsFunction.Member<java.lang.Object>(this, Members.moveBy                  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#moveTo(Integer, Integer)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> moveTo                   = new JsFunction.Member<java.lang.Object>(this, Members.moveTo                  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#open(String, String, String, Boolean)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<JsWindow> open = new JsFunction.Member<JsWindow>(this, Members.open, Generic.get(JsWindow.class));
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#print()
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> print                    = new JsFunction.Member<java.lang.Object>(this, Members.print                   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#resizeBy(Integer, Integer)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> resizeBy                 = new JsFunction.Member<java.lang.Object>(this, Members.resizeBy                );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#resizeTo(Integer, Integer)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> resizeTo                 = new JsFunction.Member<java.lang.Object>(this, Members.resizeTo                );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#scrollBy(Integer, Integer)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> scrollBy                 = new JsFunction.Member<java.lang.Object>(this, Members.scrollBy                );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow#scrollTo(Integer, Integer)
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> scrollTo                 = new JsFunction.Member<java.lang.Object>(this, Members.scrollTo                );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
		 * reference to an event handler function invoked when the window loses focus.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onblur                   = new JsFunction.Member<java.lang.Object>(this, Members.onblur                  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
		 * reference to an event handler function invoked when a JavaScript error occurs.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onerror                  = new JsFunction.Member<java.lang.Object>(this, Members.onerror                 );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
		 * reference to an event handler function invoked when the window gains focus.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onfocus                  = new JsFunction.Member<java.lang.Object>(this, Members.onfocus                 );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
		 * reference to an event handler function invoked when the document or frameset is fully 
		 * loaded.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onload                   = new JsFunction.Member<java.lang.Object>(this, Members.onload                  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
		 * reference to an event handler function invoked when the window is resized.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onresize                 = new JsFunction.Member<java.lang.Object>(this, Members.onresize                );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
		 * reference to an event handler function invoked when the browser leaves the current 
		 * document or frameset.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final JsFunction.Member<?> onunload                 = new JsFunction.Member<java.lang.Object>(this, Members.onunload                );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see JsWindow.Image
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Image.Member Image = new Image.Member(this, Members.Image);
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsWindow(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsWindow#alert(Object)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<Void> alert = new JsFunction.Member<Void>(Members.alert);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsWindow#confirm(Object)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<java.lang.Boolean> confirm = new JsFunction.Member<java.lang.Boolean>(Members.confirm);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see JsWindow#prompt(Object)
	 * @see JsWindow#prompt(Object, Object)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<java.lang.String> prompt = new JsFunction.Member<java.lang.String>(Members.prompt );
	/**
	 * <p>Displays a simple message in a dialog box.</p>
	 * <p>In JavaScript, this method displays the specified <tt>message</tt> to the 
	 * user in a dialog box. The dialog box contains an OK button the user can click to 
	 * dismiss it. The dialog box is typically modal, and the call to this function 
	 * typically blocks until the dialog is dismissed.</p>
	 * <p>Perhaps the most common use of this method is to display error messages when the 
	 * user's input to some form element is invalid in some way. The alert dialog box can 
	 * inform the user of the problem and explain what needs to be corrected to avoid the 
	 * problem in the future</p>
	 * <p>The appearance of the dialog box is platform-dependent, but it generally contains 
	 * graphics that indicate an error, warning, or alert message of some kind. While it can 
	 * display any desired message, the alert graphics of the dialog box mean that this 
	 * method is not appropriate for simple informational messages like "Welcome to my blog"</p>
	 * <p>Note that the <tt>message</tt> displayed in the dialog box is a string of 
	 * plain text, not formatted HTML. You can use the newline character "\n" in your strings 
	 * to break your message across multiple lines. You can also do some rudimentary 
	 * formatting using spaces and can approximate horizontal rules with underscore characters, 
	 * but the results depend greatly on the font used in the dialog box and thus are 
	 * system-dependent.</p>
	 * @param message The plain-text (not HTML) string to display in a dialog box popped up 
	 * over the current window.
	 * @see js.Js#alert(Object)
	 * @see jsx.client.Global#alert(Object)
	 * @see jsx.client.Client#alert(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void alert(java.lang.Object message) {
		call(alert, message);
	}
	/**
	 * <p>Asks a yes-or-no question with a dialog box.</p>
	 * <p>In JavaScript, this method displays the specified question in a dialog box. The 
	 * dialog box contains OK and Cancel buttons that the user can use to answer the 
	 * question. If the user clicks the OK button, it returns <tt>true</tt>. If the 
	 * user clicks Cancel, it returns <tt>false</tt>.</p>
	 * <p>The dialog box that is displayed by the this method is modal. That is, it blocks 
	 * all user input to the main browser window until the user dismisses the dialog box 
	 * by clicking on the OK or Cancel buttons. Since this method returns a value depending 
	 * on the user's response to the dialog box, JavaScript execution pauses in the call to 
	 * this method, and subsequent statements are not executed until the user responds to 
	 * the dialog box.</p>
	 * <p>There is no way to change the labels that appear in the buttons of the dialog box 
	 * (to make them read Yes and No, for example). Therefore, you should take care to 
	 * phrase your question or message so that OK and Cancel are suitable responses.</p>
	 * @param question The plain-text (not HTML) string to be displayed in the dialog box. 
	 * It should generally express a question you want the user to answer.
	 * @return <tt>true</tt> if the user clicks the OK button; <tt>false</tt> if 
	 * the user clicks the Cancel button.
	 * @see js.Js#confirm(Object)
	 * @see jsx.client.Global#confirm(Object)
	 * @see jsx.client.Client#confirm(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final java.lang.Boolean confirm(java.lang.Object question) {
		return call(confirm, question);
	}
	/**
	 * <p>Asks for simple string input with a dialog box.</p>
	 * <p>This method displays text input field and OK and Cancel buttons in a dialog box. 
	 * Platform-dependent graphics in the dialog box help indicate to the user that an 
	 * input is desired.</p>
	 * <p>If the user clicks the Cancel button, the method returns <tt>null</tt>. If 
	 * the user clicks the OK button, it returns the text currently displayed in the 
	 * input field.</p>
	 * <p>The dialog box that is displayed by this method is modal. That is, it blocks all 
	 * user input to the main browser window until the user dismisses the dialog box by 
	 * clicking on the OK or Cancel buttons. Since this method returns a value depending 
	 * on the user's response to the dialog box, JavaScript execution pauses in the call 
	 * to this method, and subsequent statements are not executed until the user responds 
	 * to the dialog box.</p>
	 * @param message The plain-text (not HTML) string to be displayed in the dialog box. 
	 * It should ask the user to enter the information you want.
	 * @return The string entered by the user, the empty string if the user did not enter 
	 * a string, or <tt>null</tt> if the user clicked Cancel.
	 * @see #prompt(Object, Object)
	 * @see js.Js#prompt(Object)
	 * @see jsx.client.Global#prompt(Object)
	 * @see jsx.client.Client#prompt(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final java.lang.String prompt(java.lang.Object message) {
		return call(prompt, message);
	}
	/**
	 * <p>Asks for simple string input with a dialog box.</p>
	 * <p>This method displays the specified message in a dialog box that also contains a 
	 * text input field and OK and Cancel buttons. Platform-dependent graphics in the 
	 * dialog box help indicate to the user that an input is desired.</p>
	 * <p>If the user clicks the Cancel button, the method returns <tt>null</tt>. If 
	 * the user clicks the OK button, it returns the text currently displayed in the 
	 * input field.</p>
	 * <p>The dialog box that is displayed by this method is modal. That is, it blocks all 
	 * user input to the main browser window until the user dismisses the dialog box by 
	 * clicking on the OK or Cancel buttons. Since this method returns a value depending 
	 * on the user's response to the dialog box, JavaScript execution pauses in the call 
	 * to this method, and subsequent statements are not executed until the user responds 
	 * to the dialog box.</p>
	 * @param message The plain-text (not HTML) string to be displayed in the dialog box. 
	 * It should ask the user to enter the information you want.
	 * @param defaultInput A string that is displayed as the default input in the dialog 
	 * box. Pass the empty string ("") to make the method display an empty input box.
	 * @return The string entered by the user, the empty string if the user did not enter 
	 * a string, or <tt>null</tt> if the user clicked Cancel.
	 * @see #prompt(Object)
	 * @see js.Js#prompt(Object, Object)
	 * @see jsx.client.Global#prompt(Object, Object)
	 * @see jsx.client.Client#prompt(Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final java.lang.String prompt(java.lang.Object message, java.lang.Object defaultInput) {
		return call(prompt, new Vars<java.lang.Object>().add(message).add(defaultInput));
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see #clearInterval(Object)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> clearInterval = new JsFunction.Member<java.lang.Object>(Members.clearInterval);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see #clearTimeout(Object)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> clearTimeout  = new JsFunction.Member<java.lang.Object>(Members.clearTimeout );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see #setInterval(JsFunction, Object)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> setInterval   = new JsFunction.Member<java.lang.Object>(Members.setInterval  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see #setTimeout(JsFunction, Object)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> setTimeout    = new JsFunction.Member<java.lang.Object>(Members.setTimeout   );
	/**
	 * <p>Cancels periodic execution of code.</p>
	 * <p>This method stops the repeated execution of code that was started by a call to 
	 * {@link #setInterval(JsFunction, Object)}. <tt>intervalId</tt> must be the value 
	 * that was returned by a call to {@link #setInterval(JsFunction, Object)}.</p>
	 * @param intervalId The value returned by the corresponding call to {@link #setInterval(JsFunction, Object)}.
	 * @see #setInterval(JsFunction, Object)
	 * @see js.Js#clearInterval(Object)
	 * @see jsx.client.Global#clearInterval(Object)
	 * @see jsx.client.Client#clearInterval(Object)
	 * @see jsx.Interval
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void clearInterval(java.lang.Object intervalId) {
		call(clearInterval, intervalId);
	}
	/**
	 * <p>Cancels a pending timeout operation.</p>
	 * <p>This method cancels the execution of code that has been deferred with the 
	 * {@link #setTimeout(JsFunction, Object)} method. The <tt>timeoutId</tt> argument 
	 * is a value returned by the call to {@link #setTimeout(JsFunction, Object)} and 
	 * identifies which deferred code to cancel.</p>
	 * @param timeoutId A value returned by {@link #setTimeout(JsFunction, Object)} that 
	 * identifies the timeout to be canceled.
	 * @see #clearTimeout(Object)
	 * @see js.Js#clearTimeout(Object)
	 * @see jsx.client.Global#clearTimeout(Object)
	 * @see jsx.client.Client#clearTimeout(Object)
	 * @see jsx.Timeout
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void clearTimeout(java.lang.Object timeoutId) {
		call(clearTimeout, timeoutId);
	}
	/**
	 * <p>Executes code at periodic intervals.</p>
	 * <p>Note that the specified function is executed in the context of the Window object, 
	 * that is, the Window object is the value of the <tt>this</tt> keyword of the 
	 * executing context of the function. This is <tt>true</tt> even if the call to 
	 * {@link #setTimeout(JsFunction, Object)} occurred within a function with a longer 
	 * scope chain.</p>
	 * @param f A function to be periodically invoked.
	 * @param interval The interval, in milliseconds, between invocations of the function.
	 * @return A value that can be passed to {@link #clearInterval(Object)} method to 
	 * cancel the periodic execution of the function.
	 * @see #clearInterval(Object)
	 * @see js.Js#setInterval(JsFunction, Number)
	 * @see jsx.client.Global#setInterval(JsFunction)
	 * @see jsx.client.Global#setInterval(JsFunction, Number)
	 * @see jsx.client.Client#setInterval(JsFunction)
	 * @see jsx.client.Client#setInterval(JsFunction, Number)
	 * @see jsx.Interval
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final java.lang.Object setInterval(JsFunction<?> f, java.lang.Object interval) {
		return call(setInterval, new Vars<java.lang.Object>().add(f).add(interval));
	}
	/**
	 * <p>Executes code after a specified amount of time elapses.</p>
	 * <p>Note that this method executes the specified function only once. The function is 
	 * executed in the context of the Window object, that is, the Window object is the 
	 * value of the <tt>this</tt> keyword of the executing context of the function. 
	 * This is <tt>true</tt> even if the call to {@link #setTimeout(JsFunction, Object)} 
	 * occurred within a function with a longer scope chain.</p>
	 * @param f A function to be invoked after the <tt>delay</tt> has elapsed.
	 * @param delay The amount of time, in milliseconds, before the function should be executed.
	 * @return A value that can be passed to the {@link #clearTimeout(Object)} method to 
	 * cancel the execution of the function.
	 * @see #clearTimeout(Object)
	 * @see js.Js#setTimeout(JsFunction, Number)
	 * @see jsx.client.Global#setTimeout(JsFunction)
	 * @see jsx.client.Global#setTimeout(JsFunction, Number)
	 * @see jsx.client.Client#setTimeout(JsFunction)
	 * @see jsx.client.Client#setTimeout(JsFunction, Number)
	 * @see jsx.Timeout
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final java.lang.Object setTimeout(JsFunction<?> f, java.lang.Object delay) {
		return call(setTimeout, new Vars<java.lang.Object>().add(f).add(delay));
	}
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see #addEventListener(String, JsFunction, Boolean)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> addEventListener = new JsFunction.Member<java.lang.Object>(Members.addEventListener);
	/**
	 * <p>Adds an event handler function to the set of event handlers for this node. 
	 * This is a DOM-standard method supported by all modern browsers except IE.</p>
	 * <p>This method adds the specified event <tt>listener</tt> function to the set of 
	 * listeners registered on this node to handle events of the specified <tt>type</tt>. 
	 * If <tt>useCapture</tt> is <tt>true</tt>, the <tt>listener</tt> is registered as 
	 * a capturing event listener. If <tt>useCapture</tt> is <tt>false</tt>, it is 
	 * registered as a normal event listener.</p>
	 * <p>This method may be called multiple times to register multiple event handlers 
	 * for the same type of event on the same node. Note, however, that the DOM 
	 * Specification makes no guarantees about the order in which multiple event handlers 
	 * are invoked.</p>
	 * <p>If the same event listener function is registered twice on the same node with 
	 * the same <tt>type</tt> and <tt>useCapture</tt> arguments, the second registration 
	 * is simply ignored. If a new event listener is registered on this node while an 
	 * event is being handled at this node, the new event listener is not invoked for 
	 * that event.</p>
	 * <p>When a node is duplicated with {@link JsNode#cloneNode(Boolean)} or {@link JsDocument#importNode(JsNode, Boolean)}, 
	 * the event listeners registered for the original node are not copied.</p>
	 * <p>The same method is also defined by, and works analogously on, the {@link JsElement} 
	 * and {@link JsWindow} objects</p>
	 * @param type The type of event for which the event listener is to be invoked.
	 * @param listener The event listener function that is invoked when an event of the 
	 * specified type is dispatched to this node. When invoked, the listener function 
	 * is passed an {@link JsEvent} object and is invoked as a method of the node on 
	 * which it is registered.
	 * @param useCapture If <tt>true</tt>, the specified <tt>listener</tt> is to be 
	 * invoked only during the capturing phase of event propagation. The more common 
	 * value of <tt>false</tt> means that the <tt>listener</tt> is not invoked during 
	 * the capturing phase but instead is invoked when this node is the actual event 
	 * target or when the event bubbles up to this node from its original target.
	 * @since 1.0
	 * @see #attachEvent(String, JsFunction)
	 * @see #removeEventListener(String, JsFunction, Boolean)
	 * @see JsElement#addEventListener(String, JsFunction, Boolean)
	 * @see JsDocument#addEventListener(String, JsFunction, Boolean)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void addEventListener(java.lang.String type, JsFunction<?> listener, java.lang.Boolean useCapture) {
		call(addEventListener, new Vars<java.lang.Object>().add(type).add(listener).add(useCapture));
	}
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see #removeEventListener(String, JsFunction, Boolean)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> removeEventListener = new JsFunction.Member<java.lang.Object>(Members.removeEventListener);
	/**
	 * <p>Removes an event handler function from the set of handlers for this node. 
	 * This is a standard DOM method implemented by all modern browsers except IE.</p>
	 * <p>This method removes the specified event <tt>listener</tt> function. The <tt>type</tt> 
	 * and <tt>useCapture</tt> arguments must be the same as they are in the 
	 * corresponding call to {@link #addEventListener(String, JsFunction, Boolean)}. If 
	 * no event listener is found that matches the specified arguments, this method does 
	 * nothing.</p>
	 * <p>Once an event <tt>listener</tt> function has been removed by this method, it 
	 * will no longer be invoked for the specified <tt>type</tt> of event on this node. 
	 * This is true even if the event <tt>listener</tt> is removed by another event 
	 * listener registered for the same type of event on the same node.</p>
	 * <p>The same method is also defined by, and works analogously on, the {@link JsElement} 
	 * and {@link JsDocument} objects</p>
	 * @param type The type of event for which the event listener is to be deleted.
	 * @param listener The event listener function that is to be removed.
	 * @param useCapture <tt>true</tt> if a capturing event listener is to be removed; 
	 * <tt>false</tt> if a normal event listener is to be removed.
	 * @since 1.0
	 * @see #detachEvent(String, JsFunction)
	 * @see #addEventListener(String, JsFunction, Boolean)
	 * @see JsElement#removeEventListener(String, JsFunction, Boolean)
	 * @see JsDocument#removeEventListener(String, JsFunction, Boolean)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void removeEventListener(java.lang.String type, JsFunction<?> listener, java.lang.Boolean useCapture) {
		call(removeEventListener, new Vars<java.lang.Object>().add(type).add(listener).add(useCapture));
	}
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see #attachEvent(String, JsFunction)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> attachEvent = new JsFunction.Member<java.lang.Object>(Members.attachEvent);
	/**
	 * <p>Adds an event handler function to the set of handlers for this node. 
	 * This is the IE-specific alternative to {@link #addEventListener(String, JsFunction, Boolean)}.</p>
	 * <p>This method is an IE-specific event registration method. It serves the same 
	 * purpose as the standard {@link #addEventListener(String, JsFunction, Boolean)} 
	 * method, which IE does not support, but is different from that function in several 
	 * important ways:
	 * <ul>
	 * <li>Since the IE event model does not support event capturing, this method and 
	 * {@link #detachEvent(String, JsFunction)} expect only two arguments: the event 
	 * type and the handler function.</li>
	 * <li>The event handler names passed to the IE methods should include the "on" 
	 * prefix.</li>
	 * <li>Functions registered with this method are invoked with no {@link JsEvent} 
	 * {@link JsWindow#event} property of 
	 * {@link JsWindow#window} object.</li>
	 * <li>Functions registered with this method are invoked as global functions, rather 
	 * than as methods of the node on which the event occurred. That is, when an event 
	 * handler registered with this method executes, the <tt>this</tt> keyword refers to 
	 * {@link JsWindow#window} object, not to the event's target node.</li>
	 * <li>This method allows the same event handler function to be registered more than 
	 * once. When an event of the specified type occurs, the registered function is 
	 * invoked as many times as it is registered.</li>
	 * </ul>
	 * </p>
	 * <p>The same method is also defined by, and works analogously on, the {@link JsElement} 
	 * and {@link JsDocument} objects</p>
	 * @param type The type of event for which the event listener is to be invoked, with 
	 * a leading "on" prefix.
	 * @param listener The event listener function that is invoked when an event of the 
	 * specified type is dispatched to this node. This function is not passed any 
	 * {@link JsWindow#event} 
	 * property of the {@link JsWindow} object.
	 * @since 1.0
	 * @see #addEventListener(String, JsFunction, Boolean)
	 * @see #detachEvent(String, JsFunction)
	 * @see JsElement#attachEvent(String, JsFunction)
	 * @see JsDocument#attachEvent(String, JsFunction)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void attachEvent(java.lang.String type, JsFunction<?> listener) {
		call(attachEvent, new Vars<java.lang.Object>().add(type).add(listener));
	}
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see #detachEvent(String, JsFunction)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> detachEvent = new JsFunction.Member<java.lang.Object>(Members.detachEvent);
	/**
	 * <p>Removes an event handler function from this node. This is the IE-specific 
	 * alternative to the standard {@link #removeEventListener(String, JsFunction, Boolean)} 
	 * method.</p>
	 * <p>This method undoes the event handler function registration performed by the 
	 * {@link #attachEvent(String, JsFunction)} method. It is the IE-specific analog to 
	 * the standard {@link #removeEventListener(String, JsFunction, Boolean)}. To remove 
	 * an event handler function for a node, simply invoke this method with the same 
	 * arguments you originally passed to {@link #attachEvent(String, JsFunction)}.</p>
	 * <p>The same method is also defined by, and works analogously on, the {@link JsElement} 
	 * and {@link JsDocument} objects</p>
	 * @param type The type of event for which the event listener is to be invoked, with 
	 * a leading "on" prefix.
	 * @param listener The event listener function that is to be removed.
	 * @since 1.0
	 * @see #removeEventListener(String, JsFunction, Boolean)
	 * @see #attachEvent(String, JsFunction)
	 * @see JsElement#detachEvent(String, JsFunction)
	 * @see JsDocument#detachEvent(String, JsFunction)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void detachEvent(java.lang.String type, JsFunction<?> listener) {
		call(detachEvent, new Vars<java.lang.Object>().add(type).add(listener));
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member htmlControl = new Value.Boolean.Member(Members.htmlControl);

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
	 * read-only reference to this window itself. This is a synonym for the {@link #window} 
	 * property.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsWindow.Member self   = new JsWindow.Member(Members.self  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
	 * read-only reference to this window itself. This is identical to the {@link #self} 
	 * property.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsWindow.Member window = new JsWindow.Member(Members.window);

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
	 * read-only reference to the {@link JsDocument} object that describes the document 
	 * contained in this window or frame.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsDocument.Member document = new JsDocument.Member(Members.document);

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
	 * read-only reference to the {@link JsHistory} object of this window or frame.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsHistory.Member history = new JsHistory.Member(Members.history);

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object 
	 * refers to a read-only integer value specifying the height, in pixels, of the 
	 * document display area of this window. This dimension does not include the 
	 * size of the menu bar, tool bars, scroll bars, and so on. The property is not 
	 * supported by IE. Instead use the {@link JsHTMLElement#clientHeight} property 
	 * of {@link JsHTMLDocument#documentElement} or {@link JsHTMLDocument#body} 
	 * depending on the version of IE.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Integer.Member innerHeight = new Value.Integer.Member(Members.innerHeight);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object 
	 * refers to a read-only integer value specifying the width, in pixels, of the 
	 * document display area of this window. This dimension does not include the 
	 * size of the menu bar, tool bars, scroll bars, and so on. The property is not 
	 * supported by IE. Instead use the {@link JsHTMLElement#clientWidth} property 
	 * of {@link JsHTMLDocument#documentElement} or {@link JsHTMLDocument#body} 
	 * depending on the version of IE.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Integer.Member innerWidth  = new Value.Integer.Member(Members.innerWidth );

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object refers 
	 * to the {@link JsEvent} object that describes the most recent event. This property 
	 * is used in the IE event model. In the standard DOM event model, the {@link JsEvent} 
	 * object is passed as an argument to event-handler functions.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsEvent.Member event = new JsEvent.Member(Members.event);

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object 
	 * refers to a read-only integer value specifying the number of pixels that the 
	 * current document has been scrolled to the right. This property is not 
	 * supported by IE. In IE, use the {@link JsHTMLElement#scrollLeft} property of 
	 * {@link JsHTMLDocument#documentElement} or {@link JsHTMLDocument#body} 
	 * depending on the version of IE.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member pageXOffset = new Value.Number.Member(Members.pageXOffset);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object 
	 * refers to a read-only integer value specifying the number of pixels that the 
	 * current document has been scrolled down. This property is not 
	 * supported by IE. In IE, use the {@link JsHTMLElement#scrollTop} property of 
	 * {@link JsHTMLDocument#documentElement} or {@link JsHTMLDocument#body} 
	 * depending on the version of IE.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member pageYOffset = new Value.Number.Member(Members.pageYOffset);

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
	 * read-only reference to the {@link JsNavigator} object, which provides version 
	 * and configuration information about the web browser.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsNavigator.Member navigator = new JsNavigator.Member(Members.navigator);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
	 * reference to the {@link JsLocation} object for this window or frame. The 
	 * object specifies the URL of the currently loaded document. Setting this 
	 * property to a new URL string causes the browser to load and display the 
	 * contents of that URL.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsLocation.Member location = new JsLocation.Member(Members.location);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object is a
	 * read-only reference to a {@link JsScreen} object that specifies information 
	 * about the screen: the number of available pixels and the number of available 
	 * colors.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsScreen.Member screen = new JsScreen.Member(Members.screen);

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see #getComputedStyle(JsHTMLElement, String)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<JsObject> getComputedStyle = new JsFunction.Member<JsObject>(Members.getComputedStyle);
	/**
	 * <p>Determines the CSS styles that apply to a document element.</p>
	 * <p>An element in a document may obtain style information from an inline style 
	 * attribute and from any number of style sheets in the stylesheet "cascade." Before 
	 * the element can actually be displayed in a view, its style information must be 
	 * extracted from the cascade, and styles specified with relative units (such as 
	 * percentages or "ems") must be "computed" to convert to absolute units.</p>
	 * <p>This method returns a read-only <tt>CSS2Properties</tt> object that represents 
	 * those cascaded and computed styles. The DOM specification requires that any 
	 * styles representing lengths use absolute units such as inches or millimeters. In 
	 * practice, pixel values are commonly returned instead, although there is no 
	 * guarantee that an implementation will always do this.</p>
	 * <p>Contrast this method with the <tt>style</tt> property of an HTMLElement, which 
	 * gives you access only to the inline styles of an element, in whatever units they 
	 * were specified, and tells you nothing about stylesheet styles that apply to the 
	 * element.</p>
	 * <p>In Internet Explorer, similar functionality is available through the 
	 * nonstandard <tt>currentStyle</tt> property of each HTMLElement object.</p>
	 * @param elt The document element whose style information is desired.
	 * @return A read-only <tt>CSS2Properties</tt> object that represents the style 
	 * attributes and values used to render the specified element in this window. Any 
	 * length values queried from this object are always expressed as pixel or absolute 
	 * values, not relative or percentage values.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsCSS2Properties getComputedStyle(JsHTMLElement elt) {
		return getComputedStyle(elt, "");
	}
	/**
	 * <p>Determines the CSS styles that apply to a document element.</p>
	 * <p>An element in a document may obtain style information from an inline style 
	 * attribute and from any number of style sheets in the stylesheet "cascade." Before 
	 * the element can actually be displayed in a view, its style information must be 
	 * extracted from the cascade, and styles specified with relative units (such as 
	 * percentages or "ems") must be "computed" to convert to absolute units.</p>
	 * <p>This method returns a read-only <tt>CSS2Properties</tt> object that represents 
	 * those cascaded and computed styles. The DOM specification requires that any 
	 * styles representing lengths use absolute units such as inches or millimeters. In 
	 * practice, pixel values are commonly returned instead, although there is no 
	 * guarantee that an implementation will always do this.</p>
	 * <p>Contrast this method with the <tt>style</tt> property of an HTMLElement, which 
	 * gives you access only to the inline styles of an element, in whatever units they 
	 * were specified, and tells you nothing about stylesheet styles that apply to the 
	 * element.</p>
	 * <p>In Internet Explorer, similar functionality is available through the 
	 * nonstandard <tt>currentStyle</tt> property of each HTMLElement object.</p>
	 * @param elt The document element whose style information is desired.
	 * @param pseudoElt The CSS pseudoelement string, such as ":before" or ":first-line", 
	 * or <tt>null</tt> if there is none.
	 * @return A read-only <tt>CSS2Properties</tt> object that represents the style 
	 * attributes and values used to render the specified element in this window. Any 
	 * length values queried from this object are always expressed as pixel or absolute 
	 * values, not relative or percentage values.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly 
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsCSS2Properties getComputedStyle(JsHTMLElement elt, java.lang.String pseudoElt) {
		return new JsCSS2Properties(call(getComputedStyle, new Vars<java.lang.Object>().add(elt).add(pseudoElt)));
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object 
	 * refers to a read-only boolean value specifying whether the window has been 
	 * closed. When a browser window closes, the {@link JsWindow} object that 
	 * represents it does not simply disappear; it continues to exist, but its {@link #closed} 
	 * property is set to <tt>true</tt>.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Boolean.Member closed                   = new Value.Boolean.Member               (Members.closed                  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object 
	 * refers to a read/write string specifying the default message that appears in 
	 * the status line of the window.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String .Member defaultStatus            = new Value.String .Member               (Members.defaultStatus           );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object 
	 * refers to an array of {@link JsWindow} objects, one for each {@link JsHTMLFrameElement} or 
	 * {@link JsHTMLIFrameElement} object contained within this window. Note that 
	 * frames referenced by this array may themselves contain frames and may have a 
	 * {@link #frames} array of their own.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsArray      .Member frames                   = new JsArray      .Member               (Members.frames                  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object 
	 * refers to a string containing the name of the window. The name is optionally 
	 * specified when the window is created with the {@link JsWindow#open(String, String, String, Boolean)} 
	 * method or with the <tt>name</tt> attribute of a <tt>&lt;frame&gt;</tt> tag. 
	 * The name of a window may be used as the value of a <tt>target</tt> attribute 
	 * of an <tt>&lt;a&gt;</tt> or <tt>&lt;form&gt;</tt> tag. Using the <tt>target</tt> 
	 * attribute in this way specifies that the hyper-linked document or the results 
	 * of form submission should be displayed in the named window or frame.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.String .Member name                     = new Value.String .Member               (Members.name                    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
	 * read/write reference to the {@link JsWindow} object that contained the script 
	 * that called {@link #open(String, String, String, Boolean)} to open this browser 
	 * window. This property is valid only for {@link JsWindow} objects that represent 
	 * top-level windows, not those that represent frames. The property is useful so 
	 * that a newly created {@link JsWindow} object can refer to properties and functions 
	 * defined in the window that created it.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsWindow     .Member opener                   = new JsWindow     .Member               (Members.opener                  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object 
	 * refers to a read-only integer value specifying the total height, in pixels, 
	 * of the browser window. This dimension includes the height of the menu bar, 
	 * tool bars, scroll bars, window borders, and so on. The property is not 
	 * supported by IE, and IE offers no alternative property.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Integer.Member outerHeight              = new Value.Integer.Member               (Members.outerHeight             );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object 
	 * refers to a read-only integer value specifying the total width, in pixels, 
	 * of the browser window. This dimension includes the width of the menu bar, 
	 * tool bars, scroll bars, window borders, and so on. The property is not 
	 * supported by IE, and IE offers no alternative property.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Integer.Member outerWidth               = new Value.Integer.Member               (Members.outerWidth              );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
	 * read-only reference to the {@link JsWindow} object that contains this window or 
	 * frame. If this window is a top-level window, this property refers to the window 
	 * itself. If this window is a frame, the property refers to the window or frame 
	 * that contains it. Contrast with the {@link #top} property.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsWindow     .Member parent                   = new JsWindow     .Member               (Members.parent                  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object 
	 * refers to a read-only integer value specifying the X coordinate of the 
	 * upper-left corner of the window on the screen. 
	 * IE, Safari, and Opera support {@link #screenLeft} and {@link #screenTop} 
	 * while Firefox and Safari support {@link #screenX} and {@link #screenY}.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Integer.Member screenLeft               = new Value.Integer.Member               (Members.screenLeft              );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object 
	 * refers to a read-only integer value specifying the Y coordinate of the 
	 * upper-left corner of the window on the screen. 
	 * IE, Safari, and Opera support {@link #screenLeft} and {@link #screenTop} 
	 * while Firefox and Safari support {@link #screenX} and {@link #screenY}.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Integer.Member screenTop                = new Value.Integer.Member               (Members.screenTop               );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object 
	 * refers to a read-only integer value specifying the X coordinate of the 
	 * upper-left corner of the window on the screen. 
	 * IE, Safari, and Opera support {@link #screenLeft} and {@link #screenTop} 
	 * while Firefox and Safari support {@link #screenX} and {@link #screenY}.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Integer.Member screenX                  = new Value.Integer.Member               (Members.screenX                 );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object 
	 * refers to a read-only integer value specifying the Y coordinate of the 
	 * upper-left corner of the window on the screen. 
	 * IE, Safari, and Opera support {@link #screenLeft} and {@link #screenTop} 
	 * while Firefox and Safari support {@link #screenX} and {@link #screenY}.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Integer.Member screenY                  = new Value.Integer.Member               (Members.screenY                 );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
	 * read-only reference to the top-level window that contains this window. If this 
	 * window is a top-level window itself, this property simply contains a reference to 
	 * the window itself. If this window is a frame, the property refers to the top-level 
	 * window that contains the frame. Contrast with the {@link #parent} property.</p>
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsWindow     .Member top                      = new JsWindow     .Member               (Members.top                     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see #blur()
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> blur                     = new JsFunction.Member<java.lang.Object>(Members.blur                    );
	/**
	 * <p>Takes keyboard focus away from the top-level browser window.</p>
	 * <p>This method removes keyboard focus from the top-level browser window specified 
	 * by the current {@link JsWindow} object. It is unspecified which window gains 
	 * keyboard focus as a result. In some browsers and/or platforms, this method may 
	 * have no effect.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void blur() {
		call(blur);
	}
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see #close()
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> close                    = new JsFunction.Member<java.lang.Object>(Members.close                   );
	/**
	 * <p>Closes the window.</p>
	 * <p>This method method closes the top-level browser window specified by the current 
	 * {@link JsWindow} object. A window can close itself by calling this method on itself 
	 * or {@link #self}. Only windows opened by JavaScript can be closed by JavaScript. 
	 * This prevents malicious scripts from causing the user's browser to exit.</p>
	 * @since 1.0
	 * @see #opener
	 * @see #closed
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void close() {
		call(close);
	}
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see #focus()
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> focus                    = new JsFunction.Member<java.lang.Object>(Members.focus                   );
	/**
	 * <p>Gives the top-level browser window keyboard focus and brings the window to 
	 * the front on most platforms.</p>
	 * <p>This method gives keyboard focus to the browser window specified by the current 
	 * {@link JsWindow} object.</p>
	 * <p>On most platforms, a top-level window is brought forward to the top of the 
	 * window stack so that it becomes visible when it is given focus.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void focus() {
		call(focus);
	}
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see #moveBy(Integer, Integer)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> moveBy                   = new JsFunction.Member<java.lang.Object>(Members.moveBy                  );
	/**
	 * <p>Moves the window by a relative amount.</p>
	 * <p>This method moves the window to the relative position specified by <tt>dx</tt> 
	 * and <tt>dy</tt>. For security resasons, browsers may restrict this method so it 
	 * cannot move a window offscreen. It is usually a bad idea to move a user's browser 
	 * window unless he explicitly request it. Scripts should typically use this method 
	 * only on windows that they created themselves with the {@link #open(String, String, String, Boolean)} 
	 * method.</p>
	 * @param dx The number of pixels to move the window to the right.
	 * @param dy The number of pixels to move the window down.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void moveBy(Integer dx, Integer dy) {
		call(moveBy, new Vars<Integer>().add(dx).add(dy));
	}
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see #moveTo(Integer, Integer)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> moveTo                   = new JsFunction.Member<java.lang.Object>(Members.moveTo                  );
	/**
	 * <p>Moves the window to an absolute position.</p>
	 * <p>This method moves the window so its upper-left corner is at the position 
	 * specified by <tt>x</tt> and <tt>y</tt>. For security resasons, browsers may 
	 * restrict this method so it cannot move a window offscreen. It is usually a bad 
	 * idea to move a user's browser window unless he explicitly request it. Scripts 
	 * should typically use this method only on windows that they created themselves 
	 * with the {@link #open(String, String, String, Boolean)} method.</p>
	 * @param x The X coordinate of the new window position.
	 * @param y The Y coordinate of the new window position.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void moveTo(Integer x, Integer y) {
		call(moveTo, new Vars<Integer>().add(x).add(y));
	}
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see #open(String, String, String, Boolean)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<JsWindow> open = new JsFunction.Member<JsWindow>(Members.open, Generic.get(JsWindow.class));
	/**
	 * <p>Creates and opens a new window.</p>
	 * @param url . 
	 * @param name . 
	 * @param features . 
	 * @param replace . 
	 * @return A reference to a {@link JsWindow} object, which may be a newly created 
	 * or an already existing one, depending on the <tt>name</tt> argument.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public JsWindow open(java.lang.String url, java.lang.String name, java.lang.String features, java.lang.Boolean replace) {
		return call(open, new Vars<java.lang.Object>().add(url).add(name).add(features).add(replace));
	}
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see #print()
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> print                    = new JsFunction.Member<java.lang.Object>(Members.print                   );
	/**
	 * <p>Simulates a click on the browser's <tt>Print</tt> button.</p>
	 * <p>Calling this method causes the browser to behave as if the user had clicked 
	 * the browser's <tt>Print</tt> button. Usually, this brings up a dialog box that 
	 * enables the user to cancel or customize the print request.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void print() {
		call(print);
	}
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see #resizeBy(Integer, Integer)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> resizeBy                 = new JsFunction.Member<java.lang.Object>(Members.resizeBy                );
	/**
	 * <p>Resizes the window by a specified amount.</p>
	 * <p>This method resizes the window by the relative amounts specified by <tt>dw</tt> 
	 * and <tt>dh</tt>. For security reasons, the browser may restrict this method to 
	 * prevent scripts from making windows very small. For usability reasons, it is 
	 * almost always a bad idea to change the size of a user's window. If a script 
	 * created a window, the script can resize it, but it is bad form for a script to 
	 * resize the window that it is loaded into.</p>
	 * @param dw The number of pixels by which to increase the width of the window. 
	 * @param dh The number of pixels by which to increase the height of the window. 
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void resizeBy(Integer dw, Integer dh) {
		call(resizeBy, new Vars<Integer>().add(dw).add(dh));
	}
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see #resizeTo(Integer, Integer)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> resizeTo                 = new JsFunction.Member<java.lang.Object>(Members.resizeTo                );
	/**
	 * <p>Resizes the window to a specified size.</p>
	 * <p>This method resizes the window so it is <tt>w</tt> pixels wide and <tt>h</tt> 
	 * pixels high. For security reasons, the browser may restrict this method to 
	 * prevent scripts from making windows very small. For usability reasons, it is 
	 * almost always a bad idea to change the size of a user's window. If a script 
	 * created a window, the script can resize it, but it is bad form for a script to 
	 * resize the window that it is loaded into.</p>
	 * @param w The desired width for the window.
	 * @param h The desired height for the window.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void resizeTo(Integer w, Integer h) {
		call(resizeTo, new Vars<Integer>().add(w).add(h));
	}
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see #scrollBy(Integer, Integer)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> scrollBy                 = new JsFunction.Member<java.lang.Object>(Members.scrollBy                );
	/**
	 * <p>Scrolls the window by a specified amount.</p>
	 * <p>This method scrolls the document displayed in window by the relative amounts 
	 * specified by <tt>dx</tt> and <tt>dy</tt>.</p>
	 * @param dx The number of pixels by which to scroll the document to the right.
	 * @param dy The number of pixels by which to scroll the document down.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void scrollBy(Integer dx, Integer dy) {
		call(scrollBy, new Vars<Integer>().add(dx).add(dy));
	}
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see #scrollTo(Integer, Integer)
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> scrollTo                 = new JsFunction.Member<java.lang.Object>(Members.scrollTo                );
	/**
	 * <p>Scrolls the window to a specified position.</p>
	 * <p>This method scrolls the document displayed within window so the point in the 
	 * document specified by the <tt>x</tt> and <tt>y</tt> coordinates is displayed in 
	 * the upper-left corner, if possible.</p>
	 * @param x The document X coordinate that is to appear at the left edge of the 
	 * window's document display area.
	 * @param y The document Y coordinate that is to appear at the top of the 
	 * window's document display area.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public void scrollTo(Integer x, Integer y) {
		call(scrollTo, new Vars<Integer>().add(x).add(y));
	}
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
	 * reference to an event handler function invoked when the window loses focus.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onblur                   = new JsFunction.Member<java.lang.Object>(Members.onblur                  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
	 * reference to an event handler function invoked when a JavaScript error occurs.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onerror                  = new JsFunction.Member<java.lang.Object>(Members.onerror                 );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
	 * reference to an event handler invoked the window gains focus.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onfocus                  = new JsFunction.Member<java.lang.Object>(Members.onfocus                 );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
	 * reference to an event handler function invoked when the document or frameset is fully 
	 * loaded.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onload                   = new JsFunction.Member<java.lang.Object>(Members.onload                  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
	 * reference to an event handler function invoked when the window is resized.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onresize                 = new JsFunction.Member<java.lang.Object>(Members.onresize                );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsWindow} object is a 
	 * reference to an event handler function invoked when the browser leaves the current 
	 * document or frameset.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final JsFunction.Member<?> onunload                 = new JsFunction.Member<java.lang.Object>(Members.onunload                );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLImageElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Image.Member Image = new Image.Member(Members.Image);

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
	public JsWindow valueOf() {
		return new JsWindow((JsObject)var().valueOf());
	}
}
