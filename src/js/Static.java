
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

/**
 * <p>An <b>opaque</b> class helping to create Java <tt>static final</tt> references 
 * for Java applets.</p>
 * <p>This <b>opaque</b> class is especially helpful when used together with the <b>opaque</b> 
 * class {@link Field} to make Java <tt>static final</tt> references to the fields of 
 * JavaScript global objects which requires refresh-on-reload and late-evaluation in 
 * JS applets or other JS Embed Simulations.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see Field
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 */

public final class Static<T> extends Var<T>
{
	private final Var<T> var;
	private T t;

	/**
	 * <p>Creates a refresh-on-reload static reference of an opaque variable.</p>
	 * @param var The opaque variable to create the refresh-on-reload static reference for.
	 * @since 1.0
	 * @javascript Re-compilers must ignore this constructor, that is, replacing it with its 
	 * only argument.
	 */
	public Static(Var<T> var) {
		synchronized(Static.class) {
			statics = new Object[]{this, statics};
		}
		this.var = var;
	}

	/**
	 * <p>Evaluates the current refresh-on-reload static reference, loading it if it is 
	 * not loaded.</p>
	 * @since 1.0
	 * @javascript Re-compilers must ignore the virtual invocation of this method, that is, 
	 * replacing it with its current instance.
	 */
	@Override
	public final T var() {
		return t != null ? t : (t = var.var());
	}

	private static Object[] statics;

	/**
	 * <p>Clear all of the static references.</p>
	 * <p>This method is <b>internal</b> and only called inside of <b>opaque</b> or 
	 * <b>internal</b> classes or class members.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	static final synchronized void destroy() {
		Object[] statics = Static.statics;
		while (statics != null) {
			((Static<?>)statics[0]).t = null;
			statics = (Object[])statics[1];
		}
	}
}
