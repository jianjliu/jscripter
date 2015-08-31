
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
 * <p>An <b>opaque</b> class representing the JavaScript <tt>Global</tt> object 
 * with the full client-side support.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see jsx.client.Client
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored 
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsClient extends JsGlobal implements 
	DOM, DOM2Core, DOM2Event, DOM2HTML, DOM2CSS, DOM2Range
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
	protected static abstract class Members extends JsGlobal.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#ActiveXObject
		 * @see JsClient.Member#ActiveXObject
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid ActiveXObject            = id("ActiveXObject"           );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#Attr
		 * @see JsClient.Member#Attr
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid Attr                     = id("Attr"                    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#CanvasGradient
		 * @see JsClient.Member#CanvasGradient
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid CanvasGradient           = id("CanvasGradient"          );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#CanvasPattern
		 * @see JsClient.Member#CanvasPattern
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid CanvasPattern            = id("CanvasPattern"           );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#CanvasRenderingContext2D
		 * @see JsClient.Member#CanvasRenderingContext2D
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid CanvasRenderingContext2D = id("CanvasRenderingContext2D");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#CDATASection
		 * @see JsClient.Member#CDATASection
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid CDATASection             = id("CDATASection"            );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#CharacterData
		 * @see JsClient.Member#CharacterData
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid CharacterData            = id("CharacterData"           );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#Comment
		 * @see JsClient.Member#Comment
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid Comment                  = id("Comment"                 );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#CSS2Properties
		 * @see JsClient.Member#CSS2Properties
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid CSS2Properties           = id("CSS2Properties"          );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#CSSRule
		 * @see JsClient.Member#CSSRule
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid CSSRule                  = id("CSSRule"                 );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#CSSStyleSheet
		 * @see JsClient.Member#CSSStyleSheet
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid CSSStyleSheet            = id("CSSStyleSheet"           );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#Document
		 * @see JsClient.Member#Document
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid Document                 = id("Document"                );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#DocumentFragment
		 * @see JsClient.Member#DocumentFragment
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid DocumentFragment         = id("DocumentFragment"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#DocumentType
		 * @see JsClient.Member#DocumentType
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid DocumentType             = id("DocumentType"            );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#DOMException
		 * @see JsClient.Member#DOMException
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid DOMException             = id("DOMException"            );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#DOMImplementation
		 * @see JsClient.Member#DOMImplementation
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid DOMImplementation        = id("DOMImplementation"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#DOMParser
		 * @see JsClient.Member#DOMParser
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid DOMParser                = id("DOMParser"               );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#Element
		 * @see JsClient.Member#Element
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid Element                  = id("Element"                 );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#Event
		 * @see JsClient.Member#Event
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid Event                    = id("Event"                   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#FlashPlayer
		 * @see JsClient.Member#FlashPlayer
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid FlashPlayer              = id("FlashPlayer"             );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#History
		 * @see JsClient.Member#History
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid History                  = id("History"                 );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLAnchorElement
		 * @see JsClient.Member#HTMLAnchorElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLAnchorElement        = id("HTMLAnchorElement"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLAppletElement
		 * @see JsClient.Member#HTMLAppletElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLAppletElement        = id("HTMLAppletElement"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLAreaElement
		 * @see JsClient.Member#HTMLAreaElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLAreaElement          = id("HTMLAreaElement"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLBaseElement
		 * @see JsClient.Member#HTMLBaseElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLBaseElement          = id("HTMLBaseElement"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLBaseFontElement
		 * @see JsClient.Member#HTMLBaseFontElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLBaseFontElement      = id("HTMLBaseFontElement"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLBodyElement
		 * @see JsClient.Member#HTMLBodyElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLBodyElement          = id("HTMLBodyElement"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLBRElement
		 * @see JsClient.Member#HTMLBRElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLBRElement            = id("HTMLBRElement"           );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLButtonElement
		 * @see JsClient.Member#HTMLButtonElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLButtonElement        = id("HTMLButtonElement"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLCanvasElement
		 * @see JsClient.Member#HTMLCanvasElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLCanvasElement        = id("HTMLCanvasElement"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLCheckBoxElement
		 * @see JsClient.Member#HTMLCheckboxElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLCheckboxElement      = id("HTMLCheckboxElement"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLCollection
		 * @see JsClient.Member#HTMLCollection
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLCollection           = id("HTMLCollection"          );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLDirectoryElement
		 * @see JsClient.Member#HTMLDirectoryElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLDirectoryElement     = id("HTMLDirectoryElement"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLDivElement
		 * @see JsClient.Member#HTMLDivElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLDivElement           = id("HTMLDivElement"          );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLDListElement
		 * @see JsClient.Member#HTMLDListElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLDListElement         = id("HTMLDListElement"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLDocument
		 * @see JsClient.Member#HTMLDocument
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLDocument             = id("HTMLDocument"            );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLElement
		 * @see JsClient.Member#HTMLElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLElement              = id("HTMLElement"             );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLFieldSetElement
		 * @see JsClient.Member#HTMLFieldSetElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLFieldSetElement      = id("HTMLFieldSetElement"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLFileUploadElement
		 * @see JsClient.Member#HTMLFileUploadElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLFileUploadElement    = id("HTMLFileUploadElement"   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLFontElement
		 * @see JsClient.Member#HTMLFontElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLFontElement          = id("HTMLFontElement"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLFormElement
		 * @see JsClient.Member#HTMLFormElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLFormElement          = id("HTMLFormElement"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLFrameElement
		 * @see JsClient.Member#HTMLFrameElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLFrameElement         = id("HTMLFrameElement"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLFrameSetElement
		 * @see JsClient.Member#HTMLFrameSetElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLFrameSetElement      = id("HTMLFrameSetElement"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLHeadElement
		 * @see JsClient.Member#HTMLHeadElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLHeadElement          = id("HTMLHeadElement"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLHeadingElement
		 * @see JsClient.Member#HTMLHeadingElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLHeadingElement       = id("HTMLHeadingElement"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLHiddenElement
		 * @see JsClient.Member#HTMLHiddenElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLHiddenElement        = id("HTMLHiddenElement"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLHRElement
		 * @see JsClient.Member#HTMLHRElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLHRElement            = id("HTMLHRElement"           );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLHtmlElement
		 * @see JsClient.Member#HTMLHtmlElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLHtmlElement          = id("HTMLHtmlElement"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLIFrameElement
		 * @see JsClient.Member#HTMLIFrameElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLIFrameElement        = id("HTMLIFrameElement"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLImageElement
		 * @see JsClient.Member#HTMLImageElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLImageElement         = id("HTMLImageElement"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLInputElement
		 * @see JsClient.Member#HTMLInputElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLInputElement         = id("HTMLInputElement"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLIsIndexElement
		 * @see JsClient.Member#HTMLIsIndexElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLIsIndexElement       = id("HTMLIsIndexElement"      );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLLabelElement
		 * @see JsClient.Member#HTMLLabelElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLLabelElement         = id("HTMLLabelElement"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLLegendElement
		 * @see JsClient.Member#HTMLLegendElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLLegendElement        = id("HTMLLegendElement"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLLIElement
		 * @see JsClient.Member#HTMLLIElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLLIElement            = id("HTMLLIElement"           );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLLinkElement
		 * @see JsClient.Member#HTMLLinkElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLLinkElement          = id("HTMLLinkElement"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLMapElement
		 * @see JsClient.Member#HTMLMapElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLMapElement           = id("HTMLMapElement"          );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLMenuElement
		 * @see JsClient.Member#HTMLMenuElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLMenuElement          = id("HTMLMenuElement"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLMetaElement
		 * @see JsClient.Member#HTMLMetaElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLMetaElement          = id("HTMLMetaElement"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLModElement
		 * @see JsClient.Member#HTMLModElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLModElement           = id("HTMLModElement"          );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLObjectElement
		 * @see JsClient.Member#HTMLObjectElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLObjectElement        = id("HTMLObjectElement"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLOListElement
		 * @see JsClient.Member#HTMLOListElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLOListElement         = id("HTMLOListElement"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLOptGroupElement
		 * @see JsClient.Member#HTMLOptGroupElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLOptGroupElement      = id("HTMLOptGroupElement"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLOptionElement
		 * @see JsClient.Member#HTMLOptionElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLOptionElement        = id("HTMLOptionElement"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLParagraphElement
		 * @see JsClient.Member#HTMLParagraphElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLParagraphElement     = id("HTMLParagraphElement"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLParamElement
		 * @see JsClient.Member#HTMLParamElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLParamElement         = id("HTMLParamElement"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLPasswordElement
		 * @see JsClient.Member#HTMLPasswordElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLPasswordElement      = id("HTMLPasswordElement"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLPreElement
		 * @see JsClient.Member#HTMLPreElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLPreElement           = id("HTMLPreElement"          );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLQuoteElement
		 * @see JsClient.Member#HTMLQuoteElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLQuoteElement         = id("HTMLQuoteElement"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLRadioElement
		 * @see JsClient.Member#HTMLRadioElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLRadioElement         = id("HTMLRadioElement"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLResetElement
		 * @see JsClient.Member#HTMLResetElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLResetElement         = id("HTMLResetElement"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLScriptElement
		 * @see JsClient.Member#HTMLScriptElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLScriptElement        = id("HTMLScriptElement"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLSelectElement
		 * @see JsClient.Member#HTMLSelectElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLSelectElement        = id("HTMLSelectElement"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLStyleElement
		 * @see JsClient.Member#HTMLStyleElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLStyleElement         = id("HTMLStyleElement"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLSubmitElement
		 * @see JsClient.Member#HTMLSubmitElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLSubmitElement        = id("HTMLSubmitElement"       );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLTableCaptionElement
		 * @see JsClient.Member#HTMLTableCaptionElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLTableCaptionElement  = id("HTMLTableCaptionElement" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLTableCellElement
		 * @see JsClient.Member#HTMLTableCellElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLTableCellElement     = id("HTMLTableCellElement"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLTableColElement
		 * @see JsClient.Member#HTMLTableColElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLTableColElement      = id("HTMLTableColElement"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLTableElement
		 * @see JsClient.Member#HTMLTableElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLTableElement         = id("HTMLTableElement"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLTableRowElement
		 * @see JsClient.Member#HTMLTableRowElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLTableRowElement      = id("HTMLTableRowElement"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLTableSectionElement
		 * @see JsClient.Member#HTMLTableSectionElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLTableSectionElement  = id("HTMLTableSectionElement" );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLTextAreaElement
		 * @see JsClient.Member#HTMLTextAreaElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLTextAreaElement      = id("HTMLTextAreaElement"     );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLTextFieldElement
		 * @see JsClient.Member#HTMLTextFieldElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLTextFieldElement     = id("HTMLTextFieldElement"    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLTitleElement
		 * @see JsClient.Member#HTMLTitleElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLTitleElement         = id("HTMLTitleElement"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#HTMLUListElement
		 * @see JsClient.Member#HTMLUListElement
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid HTMLUListElement         = id("HTMLUListElement"        );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#KeyEvent
		 * @see JsClient.Member#KeyEvent
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid KeyEvent                 = id("KeyEvent"                );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#Location
		 * @see JsClient.Member#Location
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid Location                 = id("Location"                );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#MimeType
		 * @see JsClient.Member#MimeType
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid MimeType                 = id("MimeType"                );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#MouseEvent
		 * @see JsClient.Member#MouseEvent
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid MouseEvent               = id("MouseEvent"              );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#Navigator
		 * @see JsClient.Member#Navigator
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid Navigator                = id("Navigator"               );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#Node
		 * @see JsClient.Member#Node
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid Node                     = id("Node"                    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#NodeList
		 * @see JsClient.Member#NodeList
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid NodeList                 = id("NodeList"                );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#Plugin
		 * @see JsClient.Member#Plugin
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid Plugin                   = id("Plugin"                  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#ProcessingInstruction
		 * @see JsClient.Member#ProcessingInstruction
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid ProcessingInstruction    = id("ProcessingInstruction"   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#Range
		 * @see JsClient.Member#Range
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid Range                    = id("Range"                   );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#RangeException
		 * @see JsClient.Member#RangeException
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid RangeException           = id("RangeException"          );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#Screen
		 * @see JsClient.Member#Screen
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid Screen                   = id("Screen"                  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#Text
		 * @see JsClient.Member#Text
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid Text                     = id("Text"                    );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#UIEvent
		 * @see JsClient.Member#UIEvent
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid UIEvent                  = id("UIEvent"                 );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#Window
		 * @see JsClient.Member#Window
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid Window                   = id("Window"                  );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#XMLHttpRequest
		 * @see JsClient.Member#XMLHttpRequest
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid XMLHttpRequest           = id("XMLHttpRequest"          );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#XMLSerializer
		 * @see JsClient.Member#XMLSerializer
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid XMLSerializer            = id("XMLSerializer"           );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#XMLSerializer
		 * @see JsClient.Member#XMLSerializer
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid XPathExpression          = id("XPathExpression"         );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#XPathResult
		 * @see JsClient.Member#XPathResult
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid XPathResult              = id("XPathResult"             );
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsClient#XSLTProcessor
		 * @see JsClient.Member#XSLTProcessor
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid XSLTProcessor            = id("XSLTProcessor"           );
	}

	protected static class Member extends JsGlobal.Member
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
		protected Member(JsObject.Member q, Mid mid) {
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
		protected Member(Mid mid) {
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
		public JsClient with(ObjectLike o) {
			return new JsClient(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM.ActiveXObject
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final ActiveXObject           .Member ActiveXObject            = new ActiveXObject           .Member(this, Members.ActiveXObject           );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2Core.Attr
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Attr                    .Member Attr                     = new Attr                    .Member(this, Members.Attr                    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM.CanvasGradient
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final CanvasGradient          .Member CanvasGradient           = new CanvasGradient          .Member(this, Members.CanvasGradient          );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM.CanvasPattern
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final CanvasPattern           .Member CanvasPattern            = new CanvasPattern           .Member(this, Members.CanvasPattern           );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM.CanvasRenderingContext2D
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final CanvasRenderingContext2D.Member CanvasRenderingContext2D = new CanvasRenderingContext2D.Member(this, Members.CanvasRenderingContext2D);
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2Core.CDATASection
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final CDATASection            .Member CDATASection             = new CDATASection            .Member(this, Members.CDATASection            );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2Core.CharacterData
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final CharacterData           .Member CharacterData            = new CharacterData           .Member(this, Members.CharacterData           );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2Core.Comment
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Comment                 .Member Comment                  = new Comment                 .Member(this, Members.Comment                 );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2CSS.CSS2Properties
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final CSS2Properties          .Member CSS2Properties           = new CSS2Properties          .Member(this, Members.CSS2Properties          );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2CSS.CSSRule
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final CSSRule                 .Member CSSRule                  = new CSSRule                 .Member(this, Members.CSSRule                 );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2CSS.CSSStyleSheet
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final CSSStyleSheet           .Member CSSStyleSheet            = new CSSStyleSheet           .Member(this, Members.CSSStyleSheet           );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2Core.Document
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Document                .Member Document                 = new Document                .Member(this, Members.Document                );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2Core.DocumentFragment
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final DocumentFragment        .Member DocumentFragment         = new DocumentFragment        .Member(this, Members.DocumentFragment        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2Core.DocumentType
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final DocumentType            .Member DocumentType             = new DocumentType            .Member(this, Members.DocumentType            );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2Core.DOMException
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final DOMException            .Member DOMException             = new DOMException            .Member(this, Members.DOMException            );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2Core.DOMImplementation
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final DOMImplementation       .Member DOMImplementation        = new DOMImplementation       .Member(this, Members.DOMImplementation       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM.DOMParser
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final DOMParser               .Member DOMParser                = new DOMParser               .Member(this, Members.DOMParser               );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2Core.Element
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Element                 .Member Element                  = new Element                 .Member(this, Members.Element                 );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2Event.Event
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Event                   .Member Event                    = new Event                   .Member(this, Members.Event                   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM.FlashPlayer
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final FlashPlayer             .Member FlashPlayer              = new FlashPlayer             .Member(this, Members.FlashPlayer             );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM.History
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final History                 .Member History                  = new History                 .Member(this, Members.History                 );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLAnchorElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLAnchorElement       .Member HTMLAnchorElement        = new HTMLAnchorElement       .Member(this, Members.HTMLAnchorElement       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLAppletElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLAppletElement       .Member HTMLAppletElement        = new HTMLAppletElement       .Member(this, Members.HTMLAppletElement       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLAreaElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLAreaElement         .Member HTMLAreaElement          = new HTMLAreaElement         .Member(this, Members.HTMLAreaElement         );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLBaseElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLBaseElement         .Member HTMLBaseElement          = new HTMLBaseElement         .Member(this, Members.HTMLBaseElement         );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLBaseFontElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLBaseFontElement     .Member HTMLBaseFontElement      = new HTMLBaseFontElement     .Member(this, Members.HTMLBaseFontElement     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLBodyElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLBodyElement         .Member HTMLBodyElement          = new HTMLBodyElement         .Member(this, Members.HTMLBodyElement         );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLBRElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLBRElement           .Member HTMLBRElement            = new HTMLBRElement           .Member(this, Members.HTMLBRElement           );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLButtonElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLButtonElement       .Member HTMLButtonElement        = new HTMLButtonElement       .Member(this, Members.HTMLButtonElement       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLCanvasElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLCanvasElement       .Member HTMLCanvasElement        = new HTMLCanvasElement       .Member(this, Members.HTMLCanvasElement       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLCheckBoxElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLCheckBoxElement     .Member HTMLCheckboxElement      = new HTMLCheckBoxElement     .Member(this, Members.HTMLCheckboxElement     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLCollection
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLCollection          .Member HTMLCollection           = new HTMLCollection          .Member(this, Members.HTMLCollection          );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLDirectoryElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLDirectoryElement    .Member HTMLDirectoryElement     = new HTMLDirectoryElement    .Member(this, Members.HTMLDirectoryElement    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLDivElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLDivElement          .Member HTMLDivElement           = new HTMLDivElement          .Member(this, Members.HTMLDivElement          );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLDListElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLDListElement        .Member HTMLDListElement         = new HTMLDListElement        .Member(this, Members.HTMLDListElement        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLDocument
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLDocument            .Member HTMLDocument             = new HTMLDocument            .Member(this, Members.HTMLDocument            );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLElement             .Member HTMLElement              = new HTMLElement             .Member(this, Members.HTMLElement             );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLFieldSetElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLFieldSetElement     .Member HTMLFieldSetElement      = new HTMLFieldSetElement     .Member(this, Members.HTMLFieldSetElement     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLFileUploadElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLFileUploadElement   .Member HTMLFileUploadElement    = new HTMLFileUploadElement   .Member(this, Members.HTMLFileUploadElement   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLFontElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLFontElement         .Member HTMLFontElement          = new HTMLFontElement         .Member(this, Members.HTMLFontElement         );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLFormElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLFormElement         .Member HTMLFormElement          = new HTMLFormElement         .Member(this, Members.HTMLFormElement         );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLFrameElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLFrameElement        .Member HTMLFrameElement         = new HTMLFrameElement        .Member(this, Members.HTMLFrameElement        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLFrameSetElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLFrameSetElement     .Member HTMLFrameSetElement      = new HTMLFrameSetElement     .Member(this, Members.HTMLFrameSetElement     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLHeadElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLHeadElement         .Member HTMLHeadElement          = new HTMLHeadElement         .Member(this, Members.HTMLHeadElement         );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLHeadingElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLHeadingElement      .Member HTMLHeadingElement       = new HTMLHeadingElement      .Member(this, Members.HTMLHeadingElement      );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLHiddenElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLHiddenElement       .Member HTMLHiddenElement        = new HTMLHiddenElement       .Member(this, Members.HTMLHiddenElement       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLHRElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLHRElement           .Member HTMLHRElement            = new HTMLHRElement           .Member(this, Members.HTMLHRElement           );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLHtmlElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLHtmlElement         .Member HTMLHtmlElement          = new HTMLHtmlElement         .Member(this, Members.HTMLHtmlElement         );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLIFrameElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLIFrameElement       .Member HTMLIFrameElement        = new HTMLIFrameElement       .Member(this, Members.HTMLIFrameElement       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLImageElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLImageElement        .Member HTMLImageElement         = new HTMLImageElement        .Member(this, Members.HTMLImageElement        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLInputElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLInputElement        .Member HTMLInputElement         = new HTMLInputElement        .Member(this, Members.HTMLInputElement        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLIsIndexElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLIsIndexElement      .Member HTMLIsIndexElement       = new HTMLIsIndexElement      .Member(this, Members.HTMLIsIndexElement      );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLLabelElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLLabelElement        .Member HTMLLabelElement         = new HTMLLabelElement        .Member(this, Members.HTMLLabelElement        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLLegendElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLLegendElement       .Member HTMLLegendElement        = new HTMLLegendElement       .Member(this, Members.HTMLLegendElement       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLLIElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLLIElement           .Member HTMLLIElement            = new HTMLLIElement           .Member(this, Members.HTMLLIElement           );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLLinkElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLLinkElement         .Member HTMLLinkElement          = new HTMLLinkElement         .Member(this, Members.HTMLLinkElement         );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLMapElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLMapElement          .Member HTMLMapElement           = new HTMLMapElement          .Member(this, Members.HTMLMapElement          );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLMenuElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLMenuElement         .Member HTMLMenuElement          = new HTMLMenuElement         .Member(this, Members.HTMLMenuElement         );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLMetaElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLMetaElement         .Member HTMLMetaElement          = new HTMLMetaElement         .Member(this, Members.HTMLMetaElement         );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLModElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLModElement          .Member HTMLModElement           = new HTMLModElement          .Member(this, Members.HTMLModElement          );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLObjectElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLObjectElement       .Member HTMLObjectElement        = new HTMLObjectElement       .Member(this, Members.HTMLObjectElement       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLOListElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLOListElement        .Member HTMLOListElement         = new HTMLOListElement        .Member(this, Members.HTMLOListElement        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLOptGroupElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLOptGroupElement     .Member HTMLOptGroupElement      = new HTMLOptGroupElement     .Member(this, Members.HTMLOptGroupElement     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLOptionElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLOptionElement       .Member HTMLOptionElement        = new HTMLOptionElement       .Member(this, Members.HTMLOptionElement       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLParagraphElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLParagraphElement    .Member HTMLParagraphElement     = new HTMLParagraphElement    .Member(this, Members.HTMLParagraphElement    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLParamElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLParamElement        .Member HTMLParamElement         = new HTMLParamElement        .Member(this, Members.HTMLParamElement        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLPasswordElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLPasswordElement     .Member HTMLPasswordElement      = new HTMLPasswordElement     .Member(this, Members.HTMLPasswordElement     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLPreElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLPreElement          .Member HTMLPreElement           = new HTMLPreElement          .Member(this, Members.HTMLPreElement          );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLQuoteElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLQuoteElement        .Member HTMLQuoteElement         = new HTMLQuoteElement        .Member(this, Members.HTMLQuoteElement        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLRadioElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLRadioElement        .Member HTMLRadioElement         = new HTMLRadioElement        .Member(this, Members.HTMLRadioElement        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLResetElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLResetElement        .Member HTMLResetElement         = new HTMLResetElement        .Member(this, Members.HTMLResetElement        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLScriptElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLScriptElement       .Member HTMLScriptElement        = new HTMLScriptElement       .Member(this, Members.HTMLScriptElement       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLSelectElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLSelectElement       .Member HTMLSelectElement        = new HTMLSelectElement       .Member(this, Members.HTMLSelectElement       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLStyleElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLStyleElement        .Member HTMLStyleElement         = new HTMLStyleElement        .Member(this, Members.HTMLStyleElement        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLSubmitElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLSubmitElement       .Member HTMLSubmitElement        = new HTMLSubmitElement       .Member(this, Members.HTMLSubmitElement       );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLTableCaptionElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLTableCaptionElement .Member HTMLTableCaptionElement  = new HTMLTableCaptionElement .Member(this, Members.HTMLTableCaptionElement );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLTableCellElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLTableCellElement    .Member HTMLTableCellElement     = new HTMLTableCellElement    .Member(this, Members.HTMLTableCellElement    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLTableColElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLTableColElement     .Member HTMLTableColElement      = new HTMLTableColElement     .Member(this, Members.HTMLTableColElement     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLTableElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLTableElement        .Member HTMLTableElement         = new HTMLTableElement        .Member(this, Members.HTMLTableElement        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLTableRowElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLTableRowElement     .Member HTMLTableRowElement      = new HTMLTableRowElement     .Member(this, Members.HTMLTableRowElement     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLTableSectionElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLTableSectionElement .Member HTMLTableSectionElement  = new HTMLTableSectionElement .Member(this, Members.HTMLTableSectionElement );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLTextAreaElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLTextAreaElement     .Member HTMLTextAreaElement      = new HTMLTextAreaElement     .Member(this, Members.HTMLTextAreaElement     );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLTextFieldElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLTextFieldElement    .Member HTMLTextFieldElement     = new HTMLTextFieldElement    .Member(this, Members.HTMLTextFieldElement    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLTitleElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLTitleElement        .Member HTMLTitleElement         = new HTMLTitleElement        .Member(this, Members.HTMLTitleElement        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2HTML.HTMLUListElement
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final HTMLUListElement        .Member HTMLUListElement         = new HTMLUListElement        .Member(this, Members.HTMLUListElement        );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2Event.KeyEvent
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final KeyEvent                .Member KeyEvent                 = new KeyEvent                .Member(this, Members.KeyEvent                );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM.Location
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Location                .Member Location                 = new Location                .Member(this, Members.Location                );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM.MimeType
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final MimeType                .Member MimeType                 = new MimeType                .Member(this, Members.MimeType                );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2Event.MouseEvent
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final MouseEvent              .Member MouseEvent               = new MouseEvent              .Member(this, Members.MouseEvent              );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM.Navigator
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Navigator               .Member Navigator                = new Navigator               .Member(this, Members.Navigator               );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2Core.Node
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Node                    .Member Node                     = new Node                    .Member(this, Members.Node                    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2Core.NodeList
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final NodeList                .Member NodeList                 = new NodeList                .Member(this, Members.NodeList                );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM.Plugin
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Plugin                  .Member Plugin                   = new Plugin                  .Member(this, Members.Plugin                  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2Core.ProcessingInstruction
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final ProcessingInstruction   .Member ProcessingInstruction    = new ProcessingInstruction   .Member(this, Members.ProcessingInstruction   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2Range.Range
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Range                   .Member Range                    = new Range                   .Member(this, Members.Range                   );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2Range.RangeException
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final RangeException          .Member RangeException           = new RangeException          .Member(this, Members.RangeException          );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM.Screen
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Screen                  .Member Screen                   = new Screen                  .Member(this, Members.Screen                  );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2Core.Text
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Text                    .Member Text                     = new Text                    .Member(this, Members.Text                    );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM2Event.UIEvent
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final UIEvent                 .Member UIEvent                  = new UIEvent                 .Member(this, Members.UIEvent                 );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM.XMLHttpRequest
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final XMLHttpRequest          .Member XMLHttpRequest           = new XMLHttpRequest          .Member(this, Members.XMLHttpRequest          );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM.XMLSerializer
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final XMLSerializer           .Member XMLSerializer            = new XMLSerializer           .Member(this, Members.XMLSerializer           );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM.XPathExpression
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final XPathExpression         .Member XPathExpression          = new XPathExpression         .Member(this, Members.XPathExpression         );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM.XPathResult
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final XPathResult             .Member XPathResult              = new XPathResult             .Member(this, Members.XPathResult             );
		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * @since 1.0
		 * @see js.dom.DOM.XSLTProcessor
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final XSLTProcessor           .Member XSLTProcessor            = new XSLTProcessor           .Member(this, Members.XSLTProcessor           );
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsClient(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM.ActiveXObject
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final ActiveXObject           .Member ActiveXObject            = new ActiveXObject           .Member(Members.ActiveXObject           );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2Core.Attr
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Attr                    .Member Attr                     = new Attr                    .Member(Members.Attr                    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM.CanvasGradient
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final CanvasGradient          .Member CanvasGradient           = new CanvasGradient          .Member(Members.CanvasGradient          );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM.CanvasPattern
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final CanvasPattern           .Member CanvasPattern            = new CanvasPattern           .Member(Members.CanvasPattern           );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM.CanvasRenderingContext2D
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final CanvasRenderingContext2D.Member CanvasRenderingContext2D = new CanvasRenderingContext2D.Member(Members.CanvasRenderingContext2D);
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2Core.CDATASection
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final CDATASection            .Member CDATASection             = new CDATASection            .Member(Members.CDATASection            );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2Core.CharacterData
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final CharacterData           .Member CharacterData            = new CharacterData           .Member(Members.CharacterData           );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2Core.Comment
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Comment                 .Member Comment                  = new Comment                 .Member(Members.Comment                 );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2CSS.CSS2Properties
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final CSS2Properties          .Member CSS2Properties           = new CSS2Properties          .Member(Members.CSS2Properties          );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2CSS.CSSRule
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final CSSRule                 .Member CSSRule                  = new CSSRule                 .Member(Members.CSSRule                 );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2CSS.CSSStyleSheet
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final CSSStyleSheet           .Member CSSStyleSheet            = new CSSStyleSheet           .Member(Members.CSSStyleSheet           );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2Core.Document
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Document                .Member Document                 = new Document                .Member(Members.Document                );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2Core.DocumentFragment
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final DocumentFragment        .Member DocumentFragment         = new DocumentFragment        .Member(Members.DocumentFragment        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2Core.DocumentType
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final DocumentType            .Member DocumentType             = new DocumentType            .Member(Members.DocumentType            );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2Core.DOMException
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final DOMException            .Member DOMException             = new DOMException            .Member(Members.DOMException            );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2Core.DOMImplementation
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final DOMImplementation       .Member DOMImplementation        = new DOMImplementation       .Member(Members.DOMImplementation       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM.DOMParser
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final DOMParser               .Member DOMParser                = new DOMParser               .Member(Members.DOMParser               );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2Core.Element
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Element                 .Member Element                  = new Element                 .Member(Members.Element                 );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2Event.Event
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Event                   .Member Event                    = new Event                   .Member(Members.Event                   );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM.FlashPlayer
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final FlashPlayer             .Member FlashPlayer              = new FlashPlayer             .Member(Members.FlashPlayer             );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM.History
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final History                 .Member History                  = new History                 .Member(Members.History                 );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLAnchorElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLAnchorElement       .Member HTMLAnchorElement        = new HTMLAnchorElement       .Member(Members.HTMLAnchorElement       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLAppletElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLAppletElement       .Member HTMLAppletElement        = new HTMLAppletElement       .Member(Members.HTMLAppletElement       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLAreaElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLAreaElement         .Member HTMLAreaElement          = new HTMLAreaElement         .Member(Members.HTMLAreaElement         );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLBaseElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLBaseElement         .Member HTMLBaseElement          = new HTMLBaseElement         .Member(Members.HTMLBaseElement         );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLBaseFontElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLBaseFontElement     .Member HTMLBaseFontElement      = new HTMLBaseFontElement     .Member(Members.HTMLBaseFontElement     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLBodyElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLBodyElement         .Member HTMLBodyElement          = new HTMLBodyElement         .Member(Members.HTMLBodyElement         );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLBRElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLBRElement           .Member HTMLBRElement            = new HTMLBRElement           .Member(Members.HTMLBRElement           );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLButtonElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLButtonElement       .Member HTMLButtonElement        = new HTMLButtonElement       .Member(Members.HTMLButtonElement       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLCanvasElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLCanvasElement       .Member HTMLCanvasElement        = new HTMLCanvasElement       .Member(Members.HTMLCanvasElement       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLCheckBoxElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLCheckBoxElement     .Member HTMLCheckBoxElement      = new HTMLCheckBoxElement     .Member(Members.HTMLCheckboxElement     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLCollection
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLCollection          .Member HTMLCollection           = new HTMLCollection          .Member(Members.HTMLCollection          );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLDirectoryElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLDirectoryElement    .Member HTMLDirectoryElement     = new HTMLDirectoryElement    .Member(Members.HTMLDirectoryElement    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLDivElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLDivElement          .Member HTMLDivElement           = new HTMLDivElement          .Member(Members.HTMLDivElement          );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLDListElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLDListElement        .Member HTMLDListElement         = new HTMLDListElement        .Member(Members.HTMLDListElement        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLDocument
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLDocument            .Member HTMLDocument             = new HTMLDocument            .Member(Members.HTMLDocument            );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLElement             .Member HTMLElement              = new HTMLElement             .Member(Members.HTMLElement             );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLFieldSetElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLFieldSetElement     .Member HTMLFieldSetElement      = new HTMLFieldSetElement     .Member(Members.HTMLFieldSetElement     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLFileUploadElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLFileUploadElement   .Member HTMLFileUploadElement    = new HTMLFileUploadElement   .Member(Members.HTMLFileUploadElement   );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLFontElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLFontElement         .Member HTMLFontElement          = new HTMLFontElement         .Member(Members.HTMLFontElement         );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLFormElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLFormElement         .Member HTMLFormElement          = new HTMLFormElement         .Member(Members.HTMLFormElement         );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLFrameElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLFrameElement        .Member HTMLFrameElement         = new HTMLFrameElement        .Member(Members.HTMLFrameElement        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLFrameSetElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLFrameSetElement     .Member HTMLFrameSetElement      = new HTMLFrameSetElement     .Member(Members.HTMLFrameSetElement     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLHeadElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLHeadElement         .Member HTMLHeadElement          = new HTMLHeadElement         .Member(Members.HTMLHeadElement         );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLHeadingElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLHeadingElement      .Member HTMLHeadingElement       = new HTMLHeadingElement      .Member(Members.HTMLHeadingElement      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLHiddenElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLHiddenElement       .Member HTMLHiddenElement        = new HTMLHiddenElement       .Member(Members.HTMLHiddenElement       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLHRElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLHRElement           .Member HTMLHRElement            = new HTMLHRElement           .Member(Members.HTMLHRElement           );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLHtmlElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLHtmlElement         .Member HTMLHtmlElement          = new HTMLHtmlElement         .Member(Members.HTMLHtmlElement         );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLIFrameElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLIFrameElement       .Member HTMLIFrameElement        = new HTMLIFrameElement       .Member(Members.HTMLIFrameElement       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLImageElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLImageElement        .Member HTMLImageElement         = new HTMLImageElement        .Member(Members.HTMLImageElement        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLInputElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLInputElement        .Member HTMLInputElement         = new HTMLInputElement        .Member(Members.HTMLInputElement        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLIsIndexElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLIsIndexElement      .Member HTMLIsIndexElement       = new HTMLIsIndexElement      .Member(Members.HTMLIsIndexElement      );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLLabelElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLLabelElement        .Member HTMLLabelElement         = new HTMLLabelElement        .Member(Members.HTMLLabelElement        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLLegendElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLLegendElement       .Member HTMLLegendElement        = new HTMLLegendElement       .Member(Members.HTMLLegendElement       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLLIElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLLIElement           .Member HTMLLIElement            = new HTMLLIElement           .Member(Members.HTMLLIElement           );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLLinkElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLLinkElement         .Member HTMLLinkElement          = new HTMLLinkElement         .Member(Members.HTMLLinkElement         );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLMapElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLMapElement          .Member HTMLMapElement           = new HTMLMapElement          .Member(Members.HTMLMapElement          );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLMenuElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLMenuElement         .Member HTMLMenuElement          = new HTMLMenuElement         .Member(Members.HTMLMenuElement         );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLMetaElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLMetaElement         .Member HTMLMetaElement          = new HTMLMetaElement         .Member(Members.HTMLMetaElement         );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLModElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLModElement          .Member HTMLModElement           = new HTMLModElement          .Member(Members.HTMLModElement          );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLObjectElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLObjectElement       .Member HTMLObjectElement        = new HTMLObjectElement       .Member(Members.HTMLObjectElement       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLOListElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLOListElement        .Member HTMLOListElement         = new HTMLOListElement        .Member(Members.HTMLOListElement        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLOptGroupElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLOptGroupElement     .Member HTMLOptGroupElement      = new HTMLOptGroupElement     .Member(Members.HTMLOptGroupElement     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLOptionElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLOptionElement       .Member HTMLOptionElement        = new HTMLOptionElement       .Member(Members.HTMLOptionElement       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLParagraphElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLParagraphElement    .Member HTMLParagraphElement     = new HTMLParagraphElement    .Member(Members.HTMLParagraphElement    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLParamElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLParamElement        .Member HTMLParamElement         = new HTMLParamElement        .Member(Members.HTMLParamElement        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLPasswordElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLPasswordElement     .Member HTMLPasswordElement      = new HTMLPasswordElement     .Member(Members.HTMLPasswordElement     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLPreElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLPreElement          .Member HTMLPreElement           = new HTMLPreElement          .Member(Members.HTMLPreElement          );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLQuoteElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLQuoteElement        .Member HTMLQuoteElement         = new HTMLQuoteElement        .Member(Members.HTMLQuoteElement        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLRadioElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLRadioElement        .Member HTMLRadioElement         = new HTMLRadioElement        .Member(Members.HTMLRadioElement        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLResetElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLResetElement        .Member HTMLResetElement         = new HTMLResetElement        .Member(Members.HTMLResetElement        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLScriptElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLScriptElement       .Member HTMLScriptElement        = new HTMLScriptElement       .Member(Members.HTMLScriptElement       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLSelectElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLSelectElement       .Member HTMLSelectElement        = new HTMLSelectElement       .Member(Members.HTMLSelectElement       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLStyleElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLStyleElement        .Member HTMLStyleElement         = new HTMLStyleElement        .Member(Members.HTMLStyleElement        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLSubmitElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLSubmitElement       .Member HTMLSubmitElement        = new HTMLSubmitElement       .Member(Members.HTMLSubmitElement       );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLTableCaptionElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLTableCaptionElement .Member HTMLTableCaptionElement  = new HTMLTableCaptionElement .Member(Members.HTMLTableCaptionElement );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLTableCellElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLTableCellElement    .Member HTMLTableCellElement     = new HTMLTableCellElement    .Member(Members.HTMLTableCellElement    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLTableColElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLTableColElement     .Member HTMLTableColElement      = new HTMLTableColElement     .Member(Members.HTMLTableColElement     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLTableElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLTableElement        .Member HTMLTableElement         = new HTMLTableElement        .Member(Members.HTMLTableElement        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLTableRowElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLTableRowElement     .Member HTMLTableRowElement      = new HTMLTableRowElement     .Member(Members.HTMLTableRowElement     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLTableSectionElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLTableSectionElement .Member HTMLTableSectionElement  = new HTMLTableSectionElement .Member(Members.HTMLTableSectionElement );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLTextAreaElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLTextAreaElement     .Member HTMLTextAreaElement      = new HTMLTextAreaElement     .Member(Members.HTMLTextAreaElement     );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLTextFieldElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLTextFieldElement    .Member HTMLTextFieldElement     = new HTMLTextFieldElement    .Member(Members.HTMLTextFieldElement    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLTitleElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLTitleElement        .Member HTMLTitleElement         = new HTMLTitleElement        .Member(Members.HTMLTitleElement        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2HTML.HTMLUListElement
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final HTMLUListElement        .Member HTMLUListElement         = new HTMLUListElement        .Member(Members.HTMLUListElement        );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2Event.KeyEvent
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final KeyEvent                .Member KeyEvent                 = new KeyEvent                .Member(Members.KeyEvent                );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM.Location
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Location                .Member Location                 = new Location                .Member(Members.Location                );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM.MimeType
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final MimeType                .Member MimeType                 = new MimeType                .Member(Members.MimeType                );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2Event.MouseEvent
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final MouseEvent              .Member MouseEvent               = new MouseEvent              .Member(Members.MouseEvent              );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM.Navigator
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Navigator               .Member Navigator                = new Navigator               .Member(Members.Navigator               );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2Core.Node
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Node                    .Member Node                     = new Node                    .Member(Members.Node                    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2Core.NodeList
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final NodeList                .Member NodeList                 = new NodeList                .Member(Members.NodeList                );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM.Plugin
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Plugin                  .Member Plugin                   = new Plugin                  .Member(Members.Plugin                  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2Core.ProcessingInstruction
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final ProcessingInstruction   .Member ProcessingInstruction    = new ProcessingInstruction   .Member(Members.ProcessingInstruction   );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2Range.Range
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Range                   .Member Range                    = new Range                   .Member(Members.Range                   );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2Range.Range
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final RangeException          .Member RangeException           = new RangeException          .Member(Members.RangeException          );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM.Screen
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Screen                  .Member Screen                   = new Screen                  .Member(Members.Screen                  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2Core.Text
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Text                    .Member Text                     = new Text                    .Member(Members.Text                    );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM2Event.UIEvent
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final UIEvent                 .Member UIEvent                  = new UIEvent                 .Member(Members.UIEvent                 );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM.Window
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Window                  .Member Window                   = new Window                  .Member(Members.Window                  );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM.XMLHttpRequest
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final XMLHttpRequest          .Member XMLHttpRequest           = new XMLHttpRequest          .Member(Members.XMLHttpRequest          );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM.XMLSerializer
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final XMLSerializer          .Member XMLSerializer             = new XMLSerializer           .Member(Members.XMLSerializer           );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM.XPathExpression
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final XPathExpression         .Member XPathExpression          = new XPathExpression         .Member(Members.XPathExpression         );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM.XPathResult
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final XPathResult             .Member XPathResult              = new XPathResult             .Member(Members.XPathResult             );
	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * @since 1.0
	 * @see js.dom.DOM.XSLTProcessor
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final XSLTProcessor           .Member XSLTProcessor            = new XSLTProcessor           .Member(Members.XSLTProcessor           );
}
