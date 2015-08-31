
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

package jsx.http.rpc.remote;

import js.Initializer;
import js.Js;
import js.ObjectLike;
import jsx.Returnable;

/**
 * <p>An abstract base class for call-backs.</p>
 * <p>Call-backs help client-side asynchronous calls to remote object service based on 
 * XMLHTTP serialized RPC.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public abstract class Callback<T> implements Returnable<T>
{
	private final static ObjectLike cache = new Initializer().var();
	private static int nextid = 0;

	private final String id;

	/**
	 * <p>The default constructor for a call-back object.</p>
	 * <p>This constructor statically caches itself for finalization in asynchronous mode.</p>
	 * @since 1.0
	 */
	protected Callback() {
		id = Js.toString(nextid++);
		cache.var(id, this);
	}

	/**
	 * <p>Performs an action before with the returned value.</p>
	 * <p>The implementing class provides the actions with the returned value.</p>
	 * @param ret The value argument to return.
	 * @since 1.0
	 */
	protected abstract void onCall(T ret);

	/**
	 * <p>Returns the specified value.</p>
	 * <p>This implementation simply calls {@link #onCall(Object)} with the return value and 
	 * then removes this call-back object from the global cache to initiate finalization.</p>
	 * @param ret The value argument to return.
	 * @since 1.0
	 */
	public final void onReturn(T ret) {
		onCall(ret);
		cache.delete(id);
	}

	/**
	 * <p>Converts a {@link Returnable} to a {@link Callback}.</p>
	 * @param rt The {@link Returnable} object to convert.
	 * @return The newly converted {@link Callback} object.
	 * @since 1.0
	 */
	public static final <T> Callback<T> create(final Returnable<T> rt) {
		return new Callback<T>() {
			@Override
			protected void onCall(T ret) {
				rt.onReturn(ret);
			}
		};
	}
}
