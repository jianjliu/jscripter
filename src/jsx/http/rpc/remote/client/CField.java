
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
 * <p>A client reflection to <tt>java.lang.reflect.Field</tt> with the help of {@link Reflector}.</p>
 * <p>Note that a object of this class is an {@link Objective} at client-side in that 
 * when finalized it automatically tries to asynchronously dereference its server-side entity.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class CField extends CObject
{
	/**
	 * <p>The typical constructor for a {@link CField} reflection.</p>
	 * @param reflector The {@link Reflector} object associated with the {@link CField} object 
	 * being constructed.
	 * @param remote The underlying {@link Remote} object associated with the {@link CField} 
	 * object being constructed.
	 * @since 1.0
	 */
	protected CField(Reflector reflector, Remote remote) {
		super(reflector, remote);
	}

	/**
	 * <p>Synchronously creates a {@link CField} reflection from a {@link Remote} object 
	 * with a {@link Reflector}.</p>
	 * <p>This method synchronously increases server-side references to the {@link Remote} object.</p>
	 * @param reflector The {@link Reflector} object associated with the {@link CField} object 
	 * being constructed.
	 * @param remote The underlying {@link Remote} object associated with the {@link CField} 
	 * object being constructed.
	 * @return The created {@link CField} reflection.
	 * @since 1.0
	 */
	public static CField create(Reflector reflector, Remote remote) {
		reflector.increase(cat(remote));
		return new CField(reflector, remote);
	}

	/**
	 * <p>Asynchronously creates a {@link CField} reflection from a {@link Remote} object 
	 * with a {@link Reflector}.</p>
	 * <p>This method asynchronously increases server-side references to the {@link Remote} object.</p>
	 * @param reflector The {@link Reflector} object associated with the {@link CField} object 
	 * being constructed.
	 * @param remote The underlying {@link Remote} object associated with the {@link CField} 
	 * object being constructed.
	 * @param rt A {@link Returnable} to return the created {@link CField} reflection.
	 * @since 1.0
	 */
	public static void create(final Reflector reflector, final Remote remote, final Returnable<CField> rt) {
		reflector.increase(cat(remote), new Callback<Remote>() {
			@Override
			public void onCall(Remote ret) {
				rt.onReturn(new CField(reflector, remote));
			}
		});
	}

	/**
	 * <p>Synchronously evaluates the server-side static field entity and returns the result as a
	 * {@link Remote} value or object.</p>
	 * @return The result of the remote evaluation.
	 * @since 1.0
	 */
	public final Remote get() {
		return reflector.get(remote);
	}

	/**
	 * <p>Synchronously evaluates the server-side instance field entity based on an object entity
	 * reflected by the given {@link CObject} object and returns the result as a {@link Remote} 
	 * value or object.</p>
	 * @return The result of the remote evaluation.
	 * @since 1.0
	 */
	public final Remote get(CObject o) {
		return reflector.get(remote, o.remote);
	}

	/**
	 * <p>Asynchronously evaluates the server-side static field entity and returns the result as a
	 * {@link Remote} value or object.</p>
	 * @param rt A {@link Returnable} to return the result of the remote evaluation.
	 * @since 1.0
	 */
	public final void get(final Returnable<Remote> rt) {
		reflector.increase(cat(), new Callback<Remote>() {
			@Override
			public void onCall(Remote ret) {
				reflector.get(remote, new Callback<Remote>() {
					@Override
					public void onCall(Remote ret) {
						rt.onReturn(ret);
						reflector.decrease(cat(), null);
					}
				});
			}
			
		});
	}

	/**
	 * <p>Asynchronously evaluates the server-side instance field entity based on an object entity
	 * reflected by the given {@link CObject} object and returns the result as a {@link Remote} 
	 * value or object.</p>
	 * @param rt A {@link Returnable} to return the result of the remote evaluation.
	 * @since 1.0
	 */
	public final void get(final CObject o, final Returnable<Remote> rt) {
		reflector.increase(cat(o), new Callback<Remote>() {
			@Override
			public void onCall(Remote ret) {
				reflector.get(remote, o.remote, new Callback<Remote>() {
					@Override
					public void onCall(Remote ret) {
						rt.onReturn(ret);
						reflector.decrease(cat(o), null);
					}
					
				});
			}
			
		});
	}

	/**
	 * <p>Relays a given {@link Returnable} for asynchronous service of {@link Reflector}.</p>
	 * @param ref The associated {@link Reflector} object.
	 * @param rt The given {@link Returnable} to be relayed.
	 * @return The relaying {@link Returnable}.
	 * @since 1.0
	 */
	public static Returnable<Remote> relay(final Reflector ref, final Returnable<CField> rt) {
		return new Returnable<Remote>() {
			public void onReturn(Remote r) {
				create(ref, r, rt);
			}
		};
	}
}
