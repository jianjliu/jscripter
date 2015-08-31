
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

package jsx.client;

import js.*;
import js.user.*;

/**
 * <p>A utility class accessing the global objects and functions of JavaScript with a 
 * full client-side support.</p>
 * <p>Users are encouraged to use the utilities and static fields provided in this class 
 * instead of the <b>opaque</b> methods and the members of the {@link js.core.JsGlobal} 
 * class or the {@link js.user.JsClient} class in consideration of the reuse benefit for 
 * re-compilation results.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public abstract class Client extends Global
{
	Client() {}

	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.Attr> Attr = new Static<JsClient.Attr>(new Field<JsClient.Attr>(JsClient.Attr));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.CanvasGradient> CanvasGradient = new Static<JsClient.CanvasGradient>(new Field<JsClient.CanvasGradient>(JsClient.CanvasGradient));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.CanvasPattern> CanvasPattern = new Static<JsClient.CanvasPattern>(new Field<JsClient.CanvasPattern>(JsClient.CanvasPattern));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.CanvasRenderingContext2D> CanvasRenderingContext2D = new Static<JsClient.CanvasRenderingContext2D>(new Field<JsClient.CanvasRenderingContext2D>(JsClient.CanvasRenderingContext2D));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.CDATASection> CDATASection = new Static<JsClient.CDATASection>(new Field<JsClient.CDATASection>(JsClient.CDATASection));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.CharacterData> CharacterData = new Static<JsClient.CharacterData>(new Field<JsClient.CharacterData>(JsClient.CharacterData));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.Comment> Comment = new Static<JsClient.Comment>(new Field<JsClient.Comment>(JsClient.Comment));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.CSS2Properties> CSS2Properties = new Static<JsClient.CSS2Properties>(new Field<JsClient.CSS2Properties>(JsClient.CSS2Properties));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.CSSRule> CSSRule = new Static<JsClient.CSSRule>(new Field<JsClient.CSSRule>(JsClient.CSSRule));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.CSSStyleSheet> CSSStyleSheet = new Static<JsClient.CSSStyleSheet>(new Field<JsClient.CSSStyleSheet>(JsClient.CSSStyleSheet));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.Document> Document = new Static<JsClient.Document>(new Field<JsClient.Document>(JsClient.Document));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.DocumentFragment> DocumentFragment = new Static<JsClient.DocumentFragment>(new Field<JsClient.DocumentFragment>(JsClient.DocumentFragment));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.DocumentType> DocumentType = new Static<JsClient.DocumentType>(new Field<JsClient.DocumentType>(JsClient.DocumentType));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.DOMImplementation> DOMImplementation = new Static<JsClient.DOMImplementation>(new Field<JsClient.DOMImplementation>(JsClient.DOMImplementation));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.DOMParser> DOMParser = new Static<JsClient.DOMParser>(new Field<JsClient.DOMParser>(JsClient.DOMParser));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.Element> Element = new Static<JsClient.Element>(new Field<JsClient.Element>(JsClient.Element));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.Event> Event = new Static<JsClient.Event>(new Field<JsClient.Event>(JsClient.Event));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.FlashPlayer> FlashPlayer = new Static<JsClient.FlashPlayer>(new Field<JsClient.FlashPlayer>(JsClient.FlashPlayer));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.History> History = new Static<JsClient.History>(new Field<JsClient.History>(JsClient.History));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLAnchorElement> HTMLAnchorElement = new Static<JsClient.HTMLAnchorElement>(new Field<JsClient.HTMLAnchorElement>(JsClient.HTMLAnchorElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLAppletElement> HTMLAppletElement = new Static<JsClient.HTMLAppletElement>(new Field<JsClient.HTMLAppletElement>(JsClient.HTMLAppletElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLAreaElement> HTMLAreaElement = new Static<JsClient.HTMLAreaElement>(new Field<JsClient.HTMLAreaElement>(JsClient.HTMLAreaElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLBaseElement> HTMLBaseElement = new Static<JsClient.HTMLBaseElement>(new Field<JsClient.HTMLBaseElement>(JsClient.HTMLBaseElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLBaseFontElement> HTMLBaseFontElement = new Static<JsClient.HTMLBaseFontElement>(new Field<JsClient.HTMLBaseFontElement>(JsClient.HTMLBaseFontElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLBodyElement> HTMLBodyElement = new Static<JsClient.HTMLBodyElement>(new Field<JsClient.HTMLBodyElement>(JsClient.HTMLBodyElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLBRElement> HTMLBRElement = new Static<JsClient.HTMLBRElement>(new Field<JsClient.HTMLBRElement>(JsClient.HTMLBRElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLButtonElement> HTMLButtonElement = new Static<JsClient.HTMLButtonElement>(new Field<JsClient.HTMLButtonElement>(JsClient.HTMLButtonElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLCanvasElement> HTMLCanvasElement = new Static<JsClient.HTMLCanvasElement>(new Field<JsClient.HTMLCanvasElement>(JsClient.HTMLCanvasElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLCheckBoxElement> HTMLCheckboxElement = new Static<JsClient.HTMLCheckBoxElement>(new Field<JsClient.HTMLCheckBoxElement>(JsClient.HTMLCheckBoxElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLCollection> HTMLCollection = new Static<JsClient.HTMLCollection>(new Field<JsClient.HTMLCollection>(JsClient.HTMLCollection));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLDirectoryElement> HTMLDirectoryElement = new Static<JsClient.HTMLDirectoryElement>(new Field<JsClient.HTMLDirectoryElement>(JsClient.HTMLDirectoryElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLDivElement> HTMLDivElement = new Static<JsClient.HTMLDivElement>(new Field<JsClient.HTMLDivElement>(JsClient.HTMLDivElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLDListElement> HTMLDListElement = new Static<JsClient.HTMLDListElement>(new Field<JsClient.HTMLDListElement>(JsClient.HTMLDListElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLDocument> HTMLDocument = new Static<JsClient.HTMLDocument>(new Field<JsClient.HTMLDocument>(JsClient.HTMLDocument));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLElement> HTMLElement = new Static<JsClient.HTMLElement>(new Field<JsClient.HTMLElement>(JsClient.HTMLElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLFieldSetElement> HTMLFieldSetElement = new Static<JsClient.HTMLFieldSetElement>(new Field<JsClient.HTMLFieldSetElement>(JsClient.HTMLFieldSetElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLFileUploadElement> HTMLFileUploadElement = new Static<JsClient.HTMLFileUploadElement>(new Field<JsClient.HTMLFileUploadElement>(JsClient.HTMLFileUploadElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLFontElement> HTMLFontElement = new Static<JsClient.HTMLFontElement>(new Field<JsClient.HTMLFontElement>(JsClient.HTMLFontElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLFormElement> HTMLFormElement = new Static<JsClient.HTMLFormElement>(new Field<JsClient.HTMLFormElement>(JsClient.HTMLFormElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLFrameElement> HTMLFrameElement = new Static<JsClient.HTMLFrameElement>(new Field<JsClient.HTMLFrameElement>(JsClient.HTMLFrameElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLFrameSetElement> HTMLFrameSetElement = new Static<JsClient.HTMLFrameSetElement>(new Field<JsClient.HTMLFrameSetElement>(JsClient.HTMLFrameSetElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLHeadElement> HTMLHeadElement = new Static<JsClient.HTMLHeadElement>(new Field<JsClient.HTMLHeadElement>(JsClient.HTMLHeadElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLHeadingElement> HTMLHeadingElement = new Static<JsClient.HTMLHeadingElement>(new Field<JsClient.HTMLHeadingElement>(JsClient.HTMLHeadingElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLHiddenElement> HTMLHiddenElement = new Static<JsClient.HTMLHiddenElement>(new Field<JsClient.HTMLHiddenElement>(JsClient.HTMLHiddenElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLHRElement> HTMLHRElement = new Static<JsClient.HTMLHRElement>(new Field<JsClient.HTMLHRElement>(JsClient.HTMLHRElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLHtmlElement> HTMLHtmlElement = new Static<JsClient.HTMLHtmlElement>(new Field<JsClient.HTMLHtmlElement>(JsClient.HTMLHtmlElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLIFrameElement> HTMLIFrameElement = new Static<JsClient.HTMLIFrameElement>(new Field<JsClient.HTMLIFrameElement>(JsClient.HTMLIFrameElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLImageElement> HTMLImageElement = new Static<JsClient.HTMLImageElement>(new Field<JsClient.HTMLImageElement>(JsClient.HTMLImageElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLInputElement> HTMLInputElement = new Static<JsClient.HTMLInputElement>(new Field<JsClient.HTMLInputElement>(JsClient.HTMLInputElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLIsIndexElement> HTMLIsIndexElement = new Static<JsClient.HTMLIsIndexElement>(new Field<JsClient.HTMLIsIndexElement>(JsClient.HTMLIsIndexElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLLabelElement> HTMLLabelElement = new Static<JsClient.HTMLLabelElement>(new Field<JsClient.HTMLLabelElement>(JsClient.HTMLLabelElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLLegendElement> HTMLLegendElement = new Static<JsClient.HTMLLegendElement>(new Field<JsClient.HTMLLegendElement>(JsClient.HTMLLegendElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLLIElement> HTMLLIElement = new Static<JsClient.HTMLLIElement>(new Field<JsClient.HTMLLIElement>(JsClient.HTMLLIElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLLinkElement> HTMLLinkElement = new Static<JsClient.HTMLLinkElement>(new Field<JsClient.HTMLLinkElement>(JsClient.HTMLLinkElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLMapElement> HTMLMapElement = new Static<JsClient.HTMLMapElement>(new Field<JsClient.HTMLMapElement>(JsClient.HTMLMapElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLMenuElement> HTMLMenuElement = new Static<JsClient.HTMLMenuElement>(new Field<JsClient.HTMLMenuElement>(JsClient.HTMLMenuElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLMetaElement> HTMLMetaElement = new Static<JsClient.HTMLMetaElement>(new Field<JsClient.HTMLMetaElement>(JsClient.HTMLMetaElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLModElement> HTMLModElement = new Static<JsClient.HTMLModElement>(new Field<JsClient.HTMLModElement>(JsClient.HTMLModElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLObjectElement> HTMLObjectElement = new Static<JsClient.HTMLObjectElement>(new Field<JsClient.HTMLObjectElement>(JsClient.HTMLObjectElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLOListElement> HTMLOListElement = new Static<JsClient.HTMLOListElement>(new Field<JsClient.HTMLOListElement>(JsClient.HTMLOListElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLOptGroupElement> HTMLOptGroupElement = new Static<JsClient.HTMLOptGroupElement>(new Field<JsClient.HTMLOptGroupElement>(JsClient.HTMLOptGroupElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLOptionElement> HTMLOptionElement = new Static<JsClient.HTMLOptionElement>(new Field<JsClient.HTMLOptionElement>(JsClient.HTMLOptionElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLParagraphElement> HTMLParagraphElement = new Static<JsClient.HTMLParagraphElement>(new Field<JsClient.HTMLParagraphElement>(JsClient.HTMLParagraphElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLParamElement> HTMLParamElement = new Static<JsClient.HTMLParamElement>(new Field<JsClient.HTMLParamElement>(JsClient.HTMLParamElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLPasswordElement> HTMLPasswordElement = new Static<JsClient.HTMLPasswordElement>(new Field<JsClient.HTMLPasswordElement>(JsClient.HTMLPasswordElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLPreElement> HTMLPreElement = new Static<JsClient.HTMLPreElement>(new Field<JsClient.HTMLPreElement>(JsClient.HTMLPreElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLQuoteElement> HTMLQuoteElement = new Static<JsClient.HTMLQuoteElement>(new Field<JsClient.HTMLQuoteElement>(JsClient.HTMLQuoteElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLRadioElement> HTMLRadioElement = new Static<JsClient.HTMLRadioElement>(new Field<JsClient.HTMLRadioElement>(JsClient.HTMLRadioElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLResetElement> HTMLResetElement = new Static<JsClient.HTMLResetElement>(new Field<JsClient.HTMLResetElement>(JsClient.HTMLResetElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLScriptElement> HTMLScriptElement = new Static<JsClient.HTMLScriptElement>(new Field<JsClient.HTMLScriptElement>(JsClient.HTMLScriptElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLSelectElement> HTMLSelectElement = new Static<JsClient.HTMLSelectElement>(new Field<JsClient.HTMLSelectElement>(JsClient.HTMLSelectElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLStyleElement> HTMLStyleElement = new Static<JsClient.HTMLStyleElement>(new Field<JsClient.HTMLStyleElement>(JsClient.HTMLStyleElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLSubmitElement> HTMLSubmitElement = new Static<JsClient.HTMLSubmitElement>(new Field<JsClient.HTMLSubmitElement>(JsClient.HTMLSubmitElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLTableCaptionElement> HTMLTableCaptionElement = new Static<JsClient.HTMLTableCaptionElement>(new Field<JsClient.HTMLTableCaptionElement>(JsClient.HTMLTableCaptionElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLTableCellElement> HTMLTableCellElement = new Static<JsClient.HTMLTableCellElement>(new Field<JsClient.HTMLTableCellElement>(JsClient.HTMLTableCellElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLTableColElement> HTMLTableColElement = new Static<JsClient.HTMLTableColElement>(new Field<JsClient.HTMLTableColElement>(JsClient.HTMLTableColElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLTableElement> HTMLTableElement = new Static<JsClient.HTMLTableElement>(new Field<JsClient.HTMLTableElement>(JsClient.HTMLTableElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLTableRowElement> HTMLTableRowElement = new Static<JsClient.HTMLTableRowElement>(new Field<JsClient.HTMLTableRowElement>(JsClient.HTMLTableRowElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLTableSectionElement> HTMLTableSectionElement = new Static<JsClient.HTMLTableSectionElement>(new Field<JsClient.HTMLTableSectionElement>(JsClient.HTMLTableSectionElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLTextAreaElement> HTMLTextareaElement = new Static<JsClient.HTMLTextAreaElement>(new Field<JsClient.HTMLTextAreaElement>(JsClient.HTMLTextAreaElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLTextFieldElement> HTMLTextFieldElement = new Static<JsClient.HTMLTextFieldElement>(new Field<JsClient.HTMLTextFieldElement>(JsClient.HTMLTextFieldElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLTitleElement> HTMLTitleElement = new Static<JsClient.HTMLTitleElement>(new Field<JsClient.HTMLTitleElement>(JsClient.HTMLTitleElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.HTMLUListElement> HTMLUListElement = new Static<JsClient.HTMLUListElement>(new Field<JsClient.HTMLUListElement>(JsClient.HTMLUListElement));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.KeyEvent> KeyEvent = new Static<JsClient.KeyEvent>(new Field<JsClient.KeyEvent>(JsClient.KeyEvent));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.Location> Location = new Static<JsClient.Location>(new Field<JsClient.Location>(JsClient.Location));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.MimeType> MimeType = new Static<JsClient.MimeType>(new Field<JsClient.MimeType>(JsClient.MimeType));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.MouseEvent> MouseEvent = new Static<JsClient.MouseEvent>(new Field<JsClient.MouseEvent>(JsClient.MouseEvent));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.Navigator> Navigator = new Static<JsClient.Navigator>(new Field<JsClient.Navigator>(JsClient.Navigator));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.Node> Node = new Static<JsClient.Node>(new Field<JsClient.Node>(JsClient.Node));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.NodeList> NodeList = new Static<JsClient.NodeList>(new Field<JsClient.NodeList>(JsClient.NodeList));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.Plugin> Plugin = new Static<JsClient.Plugin>(new Field<JsClient.Plugin>(JsClient.Plugin));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.ProcessingInstruction> ProcessingInstruction = new Static<JsClient.ProcessingInstruction>(new Field<JsClient.ProcessingInstruction>(JsClient.ProcessingInstruction));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.Range> Range = new Static<JsClient.Range>(new Field<JsClient.Range>(JsClient.Range));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.Screen> Screen = new Static<JsClient.Screen>(new Field<JsClient.Screen>(JsClient.Screen));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.Text> Text = new Static<JsClient.Text>(new Field<JsClient.Text>(JsClient.Text));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.UIEvent> UIEvent = new Static<JsClient.UIEvent>(new Field<JsClient.UIEvent>(JsClient.UIEvent));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.Window> Window = new Static<JsClient.Window>(new Field<JsClient.Window>(JsClient.Window));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.XMLHttpRequest> XMLHttpRequest = new Static<JsClient.XMLHttpRequest>(new Field<JsClient.XMLHttpRequest>(JsClient.XMLHttpRequest));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.XPathExpression> XPathExpression = new Static<JsClient.XPathExpression>(new Field<JsClient.XPathExpression>(JsClient.XPathExpression));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public static final Var<JsClient.XPathResult> XPathResult = new Static<JsClient.XPathResult>(new Field<JsClient.XPathResult>(JsClient.XPathResult));
}
