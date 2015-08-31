
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

import js.Js;
import jsx.Returnable;
import jsx.http.rpc.remote.Callback;
import jsx.http.rpc.remote.Objective;
import jsx.http.rpc.remote.Reflector;
import jsx.http.rpc.remote.Remote;

/**
 * <p>A client reflection to <tt>java.lang.Object</tt> with the help of {@link Reflector}.</p>
 * <p>Note that a object of this class is an {@link Objective} at client-side in that 
 * when finalized it automatically tries to asynchronously dereference its server-side entity.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class CObject extends Objective
{
	/**
	 * <p>The typical constructor for a {@link CObject} reflection.</p>
	 * @param reflector The {@link Reflector} object associated with the {@link CObject} object 
	 * being constructed.
	 * @param remote The underlying {@link Remote} object associated with the {@link CObject} 
	 * object being constructed.
	 * @since 1.0
	 */
	protected CObject(Reflector reflector, Remote remote) {
		super(reflector, remote);
	}

	/**
	 * <p>Synchronously creates a {@link CObject} reflection from a {@link Remote} object 
	 * with a {@link Reflector}.</p>
	 * <p>This method synchronously increases server-side references to the {@link Remote} object.</p>
	 * @param reflector The {@link Reflector} object associated with the {@link CObject} object 
	 * being constructed.
	 * @param remote The underlying {@link Remote} object associated with the {@link CObject} 
	 * object being constructed.
	 * @return The created {@link CObject} reflection.
	 * @since 1.0
	 */
	public static CObject create(Reflector reflector, Remote remote) {
		reflector.increase(cat(remote));
		return new CObject(reflector, remote);
	}

	/**
	 * <p>Asynchronously creates a {@link CObject} reflection from a {@link Remote} object 
	 * with a {@link Reflector}.</p>
	 * <p>This method asynchronously increases server-side references to the {@link Remote} object.</p>
	 * @param reflector The {@link Reflector} object associated with the {@link CObject} object 
	 * being constructed.
	 * @param remote The underlying {@link Remote} object associated with the {@link CObject} 
	 * object being constructed.
	 * @param rt A {@link Returnable} to return the created {@link CObject} reflection.
	 * @since 1.0
	 */
	public static void create(final Reflector reflector, final Remote remote, final Returnable<CObject> rt) {
		reflector.increase(cat(remote), new Callback<Remote>() {
			@Override
			public void onCall(Remote ret) {
				rt.onReturn(new CObject(reflector, remote));
			}
		});
	}

	/**
	 * <p>Synchronously calls {@link Object#toString()} on the server-side entity.</p>
	 * @return The result of the remote invocation.
	 * @since 1.0
	 */
	@Override
	public final String toString() {
		if (Js.not(toString)) {
			toString = getRemoteClass().getMethod(
					"toString"
			);
		}
		return Remote.getString(toString.invoke(cat()));
	}

	private CMethod toString;

	/**
	 * <p>Asynchronously gets the {@link Object#toString()} method on the server-side entity.</p>
	 * @param rt A {@link Returnable} to return the result of the remote invocation.
	 * @since 1.0
	 */
	public final void getToString(final Returnable<CMethod> rt) {
		if (Js.not(toString)) {
			getRemoteClass(new Returnable<CClass>() {
				public void onReturn(CClass cc) {
					cc.getMethod(
							"toString",
							new Returnable<CMethod>() {
								public void onReturn(CMethod cm) {
									toString = cm;
									rt.onReturn(toString);
								}
							}
					);
				}
			});
		} else {
			rt.onReturn(toString);
		}
	}

	/**
	 * <p>Asynchronously calls {@link Object#toString()} on the server-side entity.</p>
	 * @param rt A {@link Returnable} to return the result of the remote invocation.
	 * @since 1.0
	 */
	public final void toString(final Returnable<String> rt) {
		getToString(new Returnable<CMethod>() {
			public void onReturn(CMethod cm) {
				cm.invoke(
						cat(),
						relay(rt)
				);
			}
		});
	}

	private CClass cClass;

	/**
	 * <p>Synchronously gets the class of the server-side entity as a {@link CClass}.</p>
	 * @return The result of the remote invocation.
	 * @since 1.0
	 */
	public final CClass getRemoteClass() {
		if (Js.not(cClass)) {
			cClass = CClass.create(reflector, reflector.getRemoteClass(remote));
		}
		return cClass;
	}

	/**
	 * <p>Asynchronously gets the class of the server-side entity as a {@link CClass}.</p>
	 * @param rt A {@link Returnable} to return the result of the remote invocation.
	 * @since 1.0
	 */
	public final void getRemoteClass(final Returnable<CClass> rt) {
		if (Js.not(cClass)) {
			reflector.increase(cat(), new Callback<Remote>() {
				@Override
				protected void onCall(Remote ret) {
					reflector.getRemoteClass(
							remote,
							new Callback<Remote>() {
								@Override
								public void onCall(final Remote r) {
									reflector.decrease(cat(), new Callback<Remote>() {
										@Override
										public void onCall(Remote dr) {
											CClass.create(reflector, r, new Returnable<CClass>() {
												public void onReturn(CClass cc) {
													cClass = cc;
													rt.onReturn(cClass);
												}
											});
										}
									});
								}
							}
					);
				}
				
			});
		} else {
			rt.onReturn(cClass);
		}
	}

	/**
	 * <p>Synchronously evaluates a string field of the server-side entity.</p>
	 * @param name The name of the field.
	 * @return The result of the remote evaluation.
	 * @since 1.0
	 */
	public final String getStringField(String name) {
		return Remote.getString(
				getRemoteClass().getField(name).get(this)
		);
	}

	/**
	 * <p>Asynchronously evaluates a string field of the server-side entity.</p>
	 * @param name The name of the field.
	 * @param rt A {@link Returnable} to return the result of the remote evaluation.
	 * @since 1.0
	 */
	public final void getStringField(final String name, final Returnable<String> rt) {
		getRemoteClass(new Returnable<CClass>() {
			public void onReturn(CClass cc) {
				cc.getField(name, new Returnable<CField>() {
					public void onReturn(CField cf) {
						cf.get(CObject.this, relay(rt));
					}
				});
			}
		});
	}

	/**
	 * <p>Relays a given {@link Returnable} for asynchronous service of {@link Reflector}.</p>
	 * @param rt The given {@link Returnable} to be relayed.
	 * @return The relaying {@link Returnable}.
	 * @since 1.0
	 */
	protected static final Returnable<Remote> relay(final Returnable<String> rt) {
		return new Returnable<Remote>() {
			public void onReturn(Remote r) {
				rt.onReturn(Remote.getString(r));
			}
		};
	}

	/**
	 * <p>Relays a given {@link Returnable} for asynchronous service of {@link Reflector}.</p>
	 * @param ref The associated {@link Reflector} object.
	 * @param rt The given {@link Returnable} to be relayed.
	 * @return The relaying {@link Returnable}.
	 * @since 1.0
	 */
	protected static Returnable<Remote> relay(final Reflector ref, final Returnable<CObject> rt) {
		return new Returnable<Remote>() {
			public void onReturn(Remote r) {
				create(ref, r, rt);
			}
		};
	}
}
