
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

import js.ArrayLike;
import jsx.Returnable;
import jsx.http.rpc.remote.Callback;
import jsx.http.rpc.remote.Objective;
import jsx.http.rpc.remote.Reflector;
import jsx.http.rpc.remote.Remote;

/**
 * <p>A client reflection to <tt>java.lang.Class</tt> with the help of {@link Reflector}.</p>
 * <p>Note that a object of this class is an {@link Objective} at client-side in that 
 * when finalized it automatically tries to asynchronously dereference its server-side entity.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class CClass extends CObject
{
	/**
	 * <p>The typical constructor for a {@link CClass} reflection.</p>
	 * @param reflector The {@link Reflector} object associated with the {@link CClass} object 
	 * being constructed.
	 * @param remote The underlying {@link Remote} object associated with the {@link CClass} 
	 * object being constructed.
	 * @since 1.0
	 */
	protected CClass(Reflector reflector, Remote remote) {
		super(reflector, remote);
	}

	/**
	 * <p>Synchronously creates a {@link CClass} reflection from a {@link Remote} object 
	 * with a {@link Reflector}.</p>
	 * <p>This method synchronously increases server-side references to the {@link Remote} object.</p>
	 * @param reflector The {@link Reflector} object associated with the {@link CClass} object 
	 * being constructed.
	 * @param remote The underlying {@link Remote} object associated with the {@link CClass} 
	 * object being constructed.
	 * @return The created {@link CClass} reflection.
	 * @since 1.0
	 */
	public static CClass create(Reflector reflector, Remote remote) {
		reflector.increase(cat(remote));
		return new CClass(reflector, remote);
	}

	/**
	 * <p>Asynchronously creates a {@link CClass} reflection from a {@link Remote} object 
	 * with a {@link Reflector}.</p>
	 * <p>This method asynchronously increases server-side references to the {@link Remote} object.</p>
	 * @param reflector The {@link Reflector} object associated with the {@link CClass} object 
	 * being constructed.
	 * @param remote The underlying {@link Remote} object associated with the {@link CClass} 
	 * object being constructed.
	 * @param rt A {@link Returnable} to return the created {@link CClass} reflection.
	 * @since 1.0
	 */
	public static void create(final Reflector reflector, final Remote remote, final Returnable<CClass> rt) {
		reflector.increase(cat(remote), new Callback<Remote>() {
			@Override
			public void onCall(Remote ret) {
				rt.onReturn(new CClass(reflector, remote));
			}
		});
	}

	/**
	 * <p>Synchronously asks server-side to load a named class and return it as a 
	 * {@link CClass} reflection.</p>
	 * @param name The name of the class to load.
	 * @param ref The {@link Reflector} object providing the service.
	 * @return The {@link CClass} reflection for the loaded class.
	 * @since 1.0
	 */
	public static final CClass forName(String name, Reflector ref) {
		return create(ref, ref.forName(name));
	}

	/**
	 * <p>Asynchronously asks server-side to load a named class and return it as a 
	 * {@link CClass} reflection.</p>
	 * @param name The name of the class to load.
	 * @param ref The {@link Reflector} object providing the service.
	 * @param rt A {@link Returnable} to return the {@link CClass} reflection for the loaded class.
	 * @since 1.0
	 */
	public static final void forName(String name, Reflector ref, Returnable<CClass> rt) {
		ref.forName(name, Callback.create(relay(ref, rt)));
	}

	/**
	 * <p>Gets the name of the server-side class of reflected by this {@link CClass} reflection.</p>
	 * @return The name of the server-side class.
	 * @since 1.0
	 */
	public final String getName() {
		Remote.assertType(remote, Remote.TID_CLASS);
		return Remote.getString(remote, Remote.VID);
	}

	/**
	 * <p>Synchronously asks server-side to create an instance of the reflected class and 
	 * return it as a {@link CObject} reflection.</p>
	 * @return The {@link CObject} reflection for the created server-side object.
	 * @since 1.0
	 */
	public final CObject newInstance() {
		return CObject.create(reflector, reflector.newInstance(remote));
	}

	/**
	 * <p>Asynchronously asks server-side to create an instance of the reflected class and 
	 * return it as a {@link CObject} reflection.</p>
	 * @param rt A {@link Returnable} to return the {@link CObject} reflection for the created 
	 * server-side object.
	 * @since 1.0
	 */
	public final void newInstance(Returnable<CObject> rt) {
		reflector.newInstance(
				remote,
				Callback.create(CObject.relay(reflector, rt))
		);
	}

	/**
	 * <p>Synchronously asks server-side to get a named field of the reflected class and 
	 * return it as a {@link CField} reflection.</p>
	 * @param name The name for the field.
	 * @return The {@link CField} reflection for the server-side field.
	 * @since 1.0
	 */
	public final CField getField(String name) {
		return CField.create(reflector, reflector.getField(remote, name));
	}

	/**
	 * <p>Asynchronously asks server-side to get a named field of the reflected class and 
	 * return it as a {@link CField} reflection.</p>
	 * @param name The name for the field.
	 * @param rt A {@link Returnable} to return the {@link CField} reflection for the 
	 * server-side field.
	 * @since 1.0
	 */
	public final void getField(String name, Returnable<CField> rt) {
		reflector.getField(
				remote,
				name,
				Callback.create(CField.relay(reflector, rt))
		);
	}

	/**
	 * <p>Synchronously asks server-side to get a named method of the reflected class and 
	 * return it as a {@link CMethod} reflection.</p>
	 * @param name The name for the method.
	 * @return The {@link CMethod} reflection for the server-side method.
	 * @since 1.0
	 */
	public final CMethod getMethod(String name) {
		return CMethod.create(reflector, reflector.getMethod(remote, name));
	}

	/**
	 * <p>Asynchronously asks server-side to get a named method of the reflected class and 
	 * return it as a {@link CMethod} reflection.</p>
	 * @param name The name for the method.
	 * @param rt A {@link Returnable} to return the {@link CMethod} reflection for the 
	 * server-side method.
	 * @since 1.0
	 */
	public final void getMethod(String name, Returnable<CMethod> rt) {
		reflector.getMethod(
				remote,
				name,
				Callback.create(CMethod.relay(reflector, rt))
		);
	}

	/**
	 * <p>Synchronously asks server-side to get a named method with a given parameter types of 
	 * the reflected class and return it as a {@link CMethod} reflection.</p>
	 * @param name The name for the method.
	 * @param types An array of parameters for the method to get.
	 * @return The {@link CMethod} reflection for the server-side method.
	 * @since 1.0
	 */
	public final CMethod getMethod(String name, ArrayLike<String> types) {
		return CMethod.create(reflector, reflector.getMethod(remote, name, types));
	}

	/**
	 * <p>Asynchronously asks server-side to get a named method with a given parameter types of 
	 * the reflected class and return it as a {@link CMethod} reflection.</p>
	 * @param name The name for the method.
	 * @param types An array of parameters for the method to get.
	 * @param rt A {@link Returnable} to return the {@link CMethod} reflection for the server-side method.
	 * @since 1.0
	 */
	public final void getMethod(String name, ArrayLike<String> types, Returnable<CMethod> rt) {
		reflector.getMethod(
				remote,
				name,
				types,
				Callback.create(CMethod.relay(reflector, rt))
		);
	}

	/**
	 * <p>Relays a given {@link Returnable} for asynchronous service of {@link Reflector}.</p>
	 * @param ref The associated {@link Reflector} object.
	 * @param rt The given {@link Returnable} to be relayed.
	 * @return The relaying {@link Returnable}.
	 * @since 1.0
	 */
	public static Returnable<Remote> relay(final Reflector ref, final Returnable<CClass> rt) {
		return new Returnable<Remote>() {
			public void onReturn(Remote r) {
				create(ref, r, rt);
			}
		};
	}
}
