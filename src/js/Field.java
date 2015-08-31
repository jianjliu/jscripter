
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

package js;

import js.core.JsGlobal;
import js.core.JsObject;

/**
 * <p>An <b>opaque</b> class helping to simulate the JavaScript's late-evaluation feature 
 * of object fields.</p>
 * <p>This <b>opaque</b> class is especially helpful when used together with the <b>opaque</b> 
 * class {@link Static} to make Java <tt>static final</tt> references to the fields of 
 * JavaScript global objects which requires late-evaluation and refresh-on-reload in 
 * JS applets or other JS Embed Simulations.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see Static
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 */

public final class Field<T> extends Var<T>
{
	private final Var<? extends JsObject> q;
	private final Var.Member<?> m;

	/**
	 * <p>Creates a late-evaluation field with an opaque qualifier.</p>
	 * @param q The opaque qualifier for the field
	 * @param m The opaque member for the field
	 * @since 1.0
	 * @javascript Re-compilers must convert this constructor into the JavaScript expression: 
	 * <pre>q.m</pre>
	 * where <tt>m</tt> must be resolved to the field identifier at re-compile time.
	 */
	public Field(Var<? extends JsObject> q, Var.Member<?> m) {
		this.q = q;
		this.m = m;
	}

	/**
	 * <p>Creates a late-evaluation global field.</p>
	 * @param m The opaque member for the global field
	 * @since 1.0
	 * @javascript Re-compilers must convert this constructor into the JavaScript expression: 
	 * <pre>m</pre>
	 * where <tt>m</tt> m must be resolved to the field identifier at re-compile time.
	 */
	public Field(Var.Member<?> m) {
		this(global, m);
	}

	private static final Var<JsGlobal> global = new Static<JsGlobal> (
			new Var<JsGlobal>() {
				@Override
				public JsGlobal var() {
					return Js.core();
				}
			}
	);

	/**
	 * <p>Evaluates the field.</p>
	 * @since 1.0
	 * @javascript Re-compilers must ignore the virtual invocation of this method, that is, 
	 * replacing it with its current instance.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T var() {
		return (T)m.with(q.var());
	}
}
