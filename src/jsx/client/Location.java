
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

import js.Field;
import js.Disposable;
import js.Js;
import js.Static;
import js.Var;
import js.user.JsLocation;

/**
 * <p>A utility class accessing the properties of {@link js.user.JsWindow#location}.</p>
 * <p>Users are encouraged to use the utilities provided in this class instead of the 
 * <b>opaque</b> methods of the {@link js.user.JsLocation} class in consideration of the 
 * reuse benefit for re-compilation results.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Location extends Disposable
{
	private Location() {}

	/**
	 * <p>Statically accesses a property of <tt>location</tt> by the name of this field.</p> 
	 * @see js.user.JsLocation
	 * @since 1.0
	 */
	public final static Var<String> protocol = new Static<String>(new Field<String>(Win.location, JsLocation.protocol));

	/**
	 * <p>Determines the {@link #protocol} of the current location is secure.</p>
	 * @see Browser
	 * @since 1.0
	 */
	public static final boolean isSecure  = Js.re("^https", "i").test(protocol.var());
}
