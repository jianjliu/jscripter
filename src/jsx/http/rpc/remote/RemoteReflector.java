
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

import js.ArrayLike;
import js.Index;
import js.ObjectLike;

/**
 * <p>An abstract base class for remote reflect service providers.</p>
 * <p>Note that a remote reflect service provider is also a {@link Remote} object.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public abstract class RemoteReflector extends Remote
{
	/**
	 * <p>The {@link Index} of the resource locator for remote reflect services.</p>
	 * @since 1.0
	 */
	protected final static Index<String> URL = new Index<String>(3);

	/**
	 * <p>A typical constructor for a {@link RemoteReflector} object.</p>
	 * @param o An initializer for configuration.
	 * @since 1.0
	 */
	protected RemoteReflector(ObjectLike o) {
		super(o);
	}

	/**
	 * <p>Gets the resource locator for the current reflector.</p>
	 * @return The resource locator for the current reflector.
	 * @since 1.0
	 */
	public final String url() {
		return string(this, URL);
	}

	/**
	 * <p>A service type for a remote reflect service.</p>
	 * <p>This type of service is to register a remote reflector.</p>
	 * @since 1.0
	 */
	public final static int REGISTER          = 0;
	/**
	 * <p>A service type for a remote reflect service.</p>
	 * <p>This type of service is to increase reference count of remote objects.</p>
	 * @since 1.0
	 */
	public final static int INCREASE          = 1;
	/**
	 * <p>A service type for a remote reflect service.</p>
	 * <p>This type of service is to decrease reference count of remote objects.</p>
	 * @since 1.0
	 */
	public final static int DECREASE          = 2;
	/**
	 * <p>A service type for a remote reflect service.</p>
	 * <p>This type of service is to load a remote class.</p>
	 * @since 1.0
	 */
	public final static int FOR_NAME          = 3;
	/**
	 * <p>A service type for a remote reflect service.</p>
	 * <p>This type of service is to create an instance of a remote class.</p>
	 * @since 1.0
	 */
	public final static int NEW_INSTANCE      = 4;
	/**
	 * <p>A service type for a remote reflect service.</p>
	 * <p>This type of service is to get the remote class of a remote object.</p>
	 * @since 1.0
	 */
	public final static int GET_REMOTE_CLASS  = 5;
	/**
	 * <p>A service type for a remote reflect service.</p>
	 * <p>This type of service is to get an element of a remote array.</p>
	 * @since 1.0
	 */
	public final static int GET_ARRAY_ELEMENT = 6;
	/**
	 * <p>A service type for a remote reflect service.</p>
	 * <p>This type of service is to get the length of a remote array.</p>
	 * @since 1.0
	 */
	public final static int GET_ARRAY_LENGTH  = 7;
	/**
	 * <p>A service type for a remote reflect service.</p>
	 * <p>This type of service is to set the length of a remote array.</p>
	 * @since 1.0
	 */
	public final static int SET_ARRAY_ELEMENT = 8;
	/**
	 * <p>A service type for a remote reflect service.</p>
	 * <p>This type of service is to get a remote field of a remote object.</p>
	 * @since 1.0
	 */
	public final static int GET_FIELD         = 9;
	/**
	 * <p>A service type for a remote reflect service.</p>
	 * <p>This type of service is to evaluate a remote field.</p>
	 * @since 1.0
	 */
	public final static int GET               = 10;
	/**
	 * <p>A service type for a remote reflect service.</p>
	 * <p>This type of service is to get a remote method of a remote object.</p>
	 * @since 1.0
	 */
	public final static int GET_METHOD        = 11;
	/**
	 * <p>A service type for a remote reflect service.</p>
	 * <p>This type of service is to invoke a remote method.</p>
	 * @since 1.0
	 */
	public final static int INVOKE            = 12;

	/**
	 * <p>Increases remote reference count for a remote object.</p>
	 * @param args An array of arguments. Only the first one is used here.
	 * @since 1.0
	 */
	public abstract void increase(ArrayLike<Remote> args);
	/**
	 * <p>Decreases remote reference count for a remote object.</p>
	 * @param args An array of arguments. Only the first one is used here.
	 * @since 1.0
	 */
	public abstract void decrease(ArrayLike<Remote> args);
	/**
	 * <p>Registers the current reflector.</p>
	 * @return A registered version of this reflector.
	 * @since 1.0
	 */
	public abstract RemoteReflector register();
	/**
	 * <p>Loads a remote class by the class name.</p>
	 * @param name A Java class name.
	 * @return The newly created remote class with the class name.
	 * @since 1.0
	 */
	public abstract Remote forName(String name);
	/**
	 * <p>Gets the remote class for a remote object.</p>
	 * @param o A remote object.
	 * @return The remote class for the remote object.
	 * @since 1.0
	 */
	public abstract Remote getRemoteClass(Remote o);
	/**
	 * <p>Creates a remote instance of a remote class.</p>
	 * @param o The remote class.
	 * @return The newly created remote object.
	 * @since 1.0
	 */
	public abstract Remote newInstance(Remote o);
	/**
	 * <p>Gets an element of a remote array.</p>
	 * @param o The remote array.
	 * @param i The array index for the element.
	 * @return A remote value or object.
	 * @since 1.0
	 */
	public abstract Remote getArrayElement(Remote o, int i);
	/**
	 * <p>Gets the current length of a remote array.</p>
	 * @param o The remote array.
	 * @return A remote value for the length.
	 * @since 1.0
	 */
	public abstract Remote getArrayLength(Remote o);
	/**
	 * <p>Sets an element of a remote array.</p>
	 * @param o The remote array.
	 * @param i The array index for the element.
	 * @param v The new value for the element.
	 * @return A remote value or object.
	 * @since 1.0
	 */
	public abstract Remote setArrayElement(Remote o, int i, Remote v);
	/**
	 * <p>Gets a remote field.</p>
	 * @param o The remote object for the base.
	 * @param name The name for the field.
	 * @return A remote field.
	 * @since 1.0
	 */
	public abstract Remote getField(Remote o, String name);
	/**
	 * <p>Evaluates a remote static field.</p>
	 * @param o The remote static field.
	 * @return A remote value or object.
	 * @since 1.0
	 */
	public abstract Remote get(Remote o);
	/**
	 * <p>Evaluates a remote instance field.</p>
	 * @param o The remote instance field.
	 * @param base The remote object for the base.
	 * @return A remote value or object.
	 * @since 1.0
	 */
	public abstract Remote get(Remote o, Remote base);
	/**
	 * <p>Gets a remote method.</p>
	 * @param o The remote object for the base.
	 * @param name The name for the method.
	 * @return A remote method.
	 * @since 1.0
	 */
	public abstract Remote getMethod(Remote o, String name);
	/**
	 * <p>Gets a remote method.</p>
	 * @param o The remote object for the base.
	 * @param name The name for the method.
	 * @param types An array of argument types for the remote method.
	 * @return A remote method.
	 * @since 1.0
	 */
	public abstract Remote getMethod(Remote o, String name, ArrayLike<String> types);
	/**
	 * <p>Invokes a remote method without arguments.</p>
	 * @param o The remote method.
	 * @return A remote value or object returned from the remote method invocation.
	 * @since 1.0
	 */
	public abstract Remote invoke(Remote o);
	/**
	 * <p>Invokes a remote method with arguments.</p>
	 * @param o The remote method.
	 * @param args An array of arguments.
	 * @return A remote value or object returned from the remote method invocation.
	 * @since 1.0
	 */
	public abstract Remote invoke(Remote o, ArrayLike<Remote> args);
}
