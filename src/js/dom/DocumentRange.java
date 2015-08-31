
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

import js.user.*;

/**
 * <p>An <b>opaque</b> interface from <tt>DocumentRange</tt> interface of DOM Level2 Range.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public interface DocumentRange
{
	/**
	 * <p>Creates a new {@link JsRange} object.</p>
	 * <p>This method creates a {@link JsRange} object that can be used to represent a 
	 * region of this document or of a {@link JsDocumentFragment} associated with this 
	 * document.</p>
	 * <p>This method is technically part of the <tt>DocumentRange</tt> interface in DOM2 
	 * specification. It is implemented by the {@link JsDocument} object only in 
	 * implementations that support the {@link JsRange} module. That is in the DOM Specification 
	 * this method is actually defined not by the DOM <tt>Document</tt> interface but by 
	 * the <tt>DocumentRange</tt> interface. If an implementation supports the <tt>Range</tt> 
	 * module, the {@link JsDocument} object always implements <tt>DocumentRange</tt> and 
	 * defines this method. Internet Explorer does not support this module.</p>
	 * @return A newly created {@link JsRange} object with both boundary points set to the 
	 * beginning of the document. 
	 * @since 1.0
	 * @javascript Re-compilers must convert the interface invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public JsRange createRange();
}
