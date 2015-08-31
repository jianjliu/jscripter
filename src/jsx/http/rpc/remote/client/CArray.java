
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

package jsx.http.rpc.remote.client;

import jsx.Returnable;
import jsx.http.rpc.remote.Callback;
import jsx.http.rpc.remote.Objective;
import jsx.http.rpc.remote.Reflector;
import jsx.http.rpc.remote.Remote;

/**
 * <p>A client reflection to basic Java arrays with the help of {@link Reflector}.</p>
 * <p>Note that a object of this class is an {@link Objective} at client-side in that 
 * when finalized it automatically tries to asynchronously dereference its server-side entity.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class CArray extends CObject
{
	/**
	 * <p>The typical constructor for a {@link CArray} reflection.</p>
	 * @param reflector The {@link Reflector} object associated with the {@link CArray} object 
	 * being constructed.
	 * @param remote The underlying {@link Remote} object associated with the {@link CArray} 
	 * object being constructed.
	 * @since 1.0
	 */
	protected CArray(Reflector reflector, Remote remote) {
		super(reflector, remote);
	}

	/**
	 * <p>Synchronously creates a {@link CArray} reflection from a {@link Remote} object 
	 * with a {@link Reflector}.</p>
	 * <p>This method synchronously increases server-side references to the {@link Remote} object.</p>
	 * @param reflector The {@link Reflector} object associated with the {@link CArray} object 
	 * being constructed.
	 * @param remote The underlying {@link Remote} object associated with the {@link CArray} 
	 * object being constructed.
	 * @return The created {@link CArray} reflection.
	 * @since 1.0
	 */
	public static CArray create(Reflector reflector, Remote remote) {
		reflector.increase(cat(remote));
		return new CArray(reflector, remote);
	}

	/**
	 * <p>Asynchronously creates a {@link CArray} reflection from a {@link Remote} object 
	 * with a {@link Reflector}.</p>
	 * <p>This method asynchronously increases server-side references to the {@link Remote} object.</p>
	 * @param reflector The {@link Reflector} object associated with the {@link CArray} object 
	 * being constructed.
	 * @param remote The underlying {@link Remote} object associated with the {@link CArray} 
	 * object being constructed.
	 * @param rt A {@link Returnable} to return the created {@link CArray} reflection.
	 * @since 1.0
	 */
	public static void create(final Reflector reflector, final Remote remote, final Returnable<CArray> rt) {
		reflector.increase(cat(remote), new Callback<Remote>() {
			@Override
			public void onCall(Remote ret) {
				rt.onReturn(new CArray(reflector, remote));
			}
		});
	}

	/**
	 * <p>Synchronously gets the current length of the server-side array entity.</p>
	 * @return A {@link Remote} value of the current length of the server-side array entity.
	 * @since 1.0
	 */
	public final Remote getLength() {
		return reflector.getArrayLength(remote);
	}

	/**
	 * <p>Asynchronously gets the current length of the server-side array entity.</p>
	 * @param rt A {@link Returnable} to return the {@link Remote} value of the current length 
	 * of the server-side array entity.
	 * @since 1.0
	 */
	public final void getLength(final Returnable<Remote> rt) {
		reflector.getArrayLength(remote, Callback.create(rt));
	}

	/**
	 * <p>Synchronously gets an element of the server-side array entity.</p>
	 * @param i The array index of the element.
	 * @return A {@link Remote} value or object of the element.
	 * @since 1.0
	 */
	public final Remote getElement(int i) {
		return reflector.getArrayElement(remote, i);
	}

	/**
	 * <p>Asynchronously gets an element of the server-side array entity.</p>
	 * @param i The array index of the element.
	 * @param rt A {@link Returnable} to return the {@link Remote} value or object of the element.
	 * @since 1.0
	 */
	public final void getElement(final int i, final Returnable<Remote> rt) {
		reflector.getArrayElement(remote, i, Callback.create(rt));
	}

	/**
	 * <p>Synchronously sets an element of the server-side array entity.</p>
	 * @param i The array index of the element.
	 * @param v A {@link Remote} value or object for the element.
	 * @return The {@link Remote} value or object of the element.
	 * @since 1.0
	 */
	public final Remote setElement(int i, Remote v) {
		return reflector.setArrayElement(remote, i, v);
	}

	/**
	 * <p>Asynchronously sets an element of the server-side array entity.</p>
	 * @param i The array index of the element.
	 * @param v A {@link Remote} value or object for the element.
	 * @param rt A {@link Returnable} to return the {@link Remote} value or object of the element.
	 * @since 1.0
	 */
	public final void setElement(final int i, final Remote v, final Returnable<Remote> rt) {
		reflector.setArrayElement(remote, i, v, Callback.create(rt));
	}

	/**
	 * <p>Relays a given {@link Returnable} for asynchronous service of {@link Reflector}.</p>
	 * @param ref The associated {@link Reflector} object.
	 * @param rt The given {@link Returnable} to be relayed.
	 * @return The relaying {@link Returnable}.
	 * @since 1.0
	 */
	public static Returnable<Remote> relay(final Reflector ref, final Returnable<CArray> rt) {
		return new Returnable<Remote>() {
			public void onReturn(Remote r) {
				create(ref, r, rt);
			}
		};
	}
}
