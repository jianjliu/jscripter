
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
import js.Vars;
import jsx.Returnable;
import jsx.http.rpc.remote.Callback;
import jsx.http.rpc.remote.Objective;
import jsx.http.rpc.remote.Reflector;
import jsx.http.rpc.remote.Remote;

/**
 * <p>A client reflection to <tt>java.lang.Exception</tt> with the help of {@link Reflector}.</p>
 * <p>Note that a object of this class is an {@link Objective} at client-side in that 
 * when finalized it automatically tries to asynchronously dereference its server-side entity.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class CException extends CObject
{
	/**
	 * <p>The typical constructor for a {@link CException} reflection.</p>
	 * @param reflector The {@link Reflector} object associated with the {@link CException} object 
	 * being constructed.
	 * @param remote The underlying {@link Remote} object associated with the {@link CException} 
	 * object being constructed.
	 * @since 1.0
	 */
	protected CException(Reflector reflector, Remote remote) {
		super(reflector, remote);
	}

	/**
	 * <p>Synchronously creates a {@link CException} reflection from a {@link Remote} object 
	 * with a {@link Reflector}.</p>
	 * <p>This method synchronously increases server-side references to the {@link Remote} object.</p>
	 * @param reflector The {@link Reflector} object associated with the {@link CException} object 
	 * being constructed.
	 * @param remote The underlying {@link Remote} object associated with the {@link CException} 
	 * object being constructed.
	 * @return The created {@link CException} reflection.
	 * @since 1.0
	 */
	public static CException create(Reflector reflector, Remote remote) {
		reflector.increase(cat(remote));
		return new CException(reflector, remote);
	}

	/**
	 * <p>Asynchronously creates a {@link CException} reflection from a {@link Remote} object 
	 * with a {@link Reflector}.</p>
	 * <p>This method asynchronously increases server-side references to the {@link Remote} object.</p>
	 * @param reflector The {@link Reflector} object associated with the {@link CException} object 
	 * being constructed.
	 * @param remote The underlying {@link Remote} object associated with the {@link CException} 
	 * object being constructed.
	 * @param rt A {@link Returnable} to return the created {@link CException} reflection.
	 * @since 1.0
	 */
	public static void create(final Reflector reflector, final Remote remote, final Returnable<CException> rt) {
		reflector.increase(cat(remote), new Callback<Remote>() {
			@Override
			public void onCall(Remote ret) {
				rt.onReturn(new CException(reflector, remote));
			}
		});
	}

	private CMethod getCause;

	/**
	 * <p>Synchronously gets cause from the server-side exception entity and returns the result.</p>
	 * @return The result of the remote invocation.
	 * @since 1.0
	 */
	public final String getCause() {
		if (Js.not(getCause)) {
			getCause = getRemoteClass().getMethod("getCause");
		}
		return Remote.getString(getCause.invoke(
				new Vars<Remote>().add(remote).var()
		));
	}

	/**
	 * <p>Asynchronously gets the {@link Exception#getCause()} method on the server-side entity.</p>
	 * @param rt A {@link Returnable} to return the result of the remote invocation.
	 * @since 1.0
	 */
	public final void getGetCause(final Returnable<CMethod> rt) {
		if (Js.not(getCause)) {
			getRemoteClass(new Returnable<CClass>() {
				public void onReturn(CClass cc) {
					cc.getMethod(
							"getCause",
							new Returnable<CMethod>() {
								public void onReturn(CMethod cm) {
									getCause = cm;
									rt.onReturn(getCause);
								}
							}
					);
				}
			});
		} else {
			rt.onReturn(getCause);
		}
	}

	/**
	 * <p>Asynchronously gets cause from the server-side exception entity and returns the result.</p>
	 * @param rt A {@link Returnable} to return the result of the remote invocation.
	 * @since 1.0
	 */
	public final void getCause(final Returnable<String> rt) {
		getGetCause(new Returnable<CMethod>() {
			public void onReturn(CMethod cm) {
				cm.invoke(
						cat(),
						relay(rt)
				);
			}
		});
	}

	private CMethod getMessage;

	/**
	 * <p>Synchronously gets detail message from the server-side exception entity and returns the result.</p>
	 * @return The result of the remote invocation.
	 * @since 1.0
	 */
	public final String getMessage() {
		if (Js.not(getMessage)) {
			getMessage = getRemoteClass().getMethod("getMessage");
		}
		return Remote.getString(getMessage.invoke(
				new Vars<Remote>().add(remote).var()
		));
	}

	/**
	 * <p>Asynchronously gets the {@link Exception#getMessage()} method on the server-side entity.</p>
	 * @param rt A {@link Returnable} to return the result of the remote invocation.
	 * @since 1.0
	 */
	public final void getGetMessage(final Returnable<CMethod> rt) {
		if (Js.not(getMessage)) {
			getRemoteClass(new Returnable<CClass>() {
				public void onReturn(CClass cc) {
					cc.getMethod(
							"getMessage",
							new Returnable<CMethod>() {
								public void onReturn(CMethod cm) {
									getMessage = cm;
									rt.onReturn(getMessage);
								}
							}
					);
				}
			});
		} else {
			rt.onReturn(getMessage);
		}
	}

	/**
	 * <p>Asynchronously gets detail message from the server-side exception entity and returns the result.</p>
	 * @param rt A {@link Returnable} to return the result of the remote invocation.
	 * @since 1.0
	 */
	public final void getMessage(final Returnable<String> rt) {
		getGetMessage(new Returnable<CMethod>() {
			public void onReturn(CMethod cm) {
				cm.invoke(
						cat(),
						relay(rt)
				);
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
	public static Returnable<Remote> relay(final Reflector ref, final Returnable<CException> rt) {
		return new Returnable<Remote>() {
			public void onReturn(Remote r) {
				create(ref, r, rt);
			}
		};
	}
}
