
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
import js.Initializer;
import js.Js;
import js.ObjectLike;
import js.Vars;
import jsx.Returnable;
import jsx.core.ArrayLikes;

/**
 * <p>A base class of the client-side providers for remote reflect services.</p>
 * <p>Note that a client-side provider for remote reflect services is also a 
 * {@link Remote} object.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Reflector extends RemoteReflector
{
	/**
	 * <p>A typical constructor for a {@link Reflector} object.</p>
	 * @param o An initializer for configuration.
	 * @since 1.0
	 */
	protected Reflector(ObjectLike o) {
		super(o);
	}

	/**
	 * <p>A typical constructor for a {@link Reflector} object.</p>
	 * @param url The resource locator for {@link Reflector} object being constructed.
	 * @since 1.0
	 */
	public Reflector(String url) {
		super(new Initializer().set(TID, TID_REFLECTOR).set(URL, url).var());
	}

	/**
	 * <p>Synchronously registers the current reflector.</p>
	 * @return A registered version of this reflector.
	 * @since 1.0
	 */
	@Override
	public final Reflector register() {
		return new Reflector((ObjectLike)call(
				url(),
				new Vars<Object>().add(REGISTER).var()
		));
	}

	/**
	 * <p>Synchronously increases remote reference count for a remote object.</p>
	 * @param args An array of arguments. Only the first one is used here.
	 * @since 1.0
	 */
	@Override
	public final void increase(ArrayLike<Remote> args) {
		call(url(), ArrayLikes.concat(
				new Vars<Object>().add(INCREASE).var(),
				args
		));
	}

	/**
	 * <p>Synchronously decreases remote reference count for a remote object.</p>
	 * @param args An array of arguments. Only the first one is used here.
	 * @since 1.0
	 */
	@Override
	public final void decrease(ArrayLike<Remote> args) {
		call(url(), ArrayLikes.concat(
				new Vars<Object>().add(DECREASE).var(),
				args
		));
	}

	/**
	 * <p>Synchronously loads a remote class by the class name.</p>
	 * @param name A Java class name.
	 * @return The newly created remote class with the class name.
	 * @since 1.0
	 */
	@Override
	public Remote forName(String name) {
		return new Remote((ObjectLike)call(
				url(),
				new Vars<Object>().add(FOR_NAME).add(name).var()
		));
	}

	/**
	 * <p>Synchronously gets the remote class for a remote object.</p>
	 * @param o A remote object.
	 * @return The remote class for the remote object.
	 * @since 1.0
	 */
	@Override
	public Remote getRemoteClass(Remote o) {
		return new Remote((ObjectLike)call(
				url(),
				new Vars<Object>().add(GET_REMOTE_CLASS).add(o).var()
		));
	}

	/**
	 * <p>Synchronously creates a remote instance of a remote class.</p>
	 * @param o The remote class.
	 * @return The newly created remote object.
	 * @since 1.0
	 */
	@Override
	public Remote newInstance(Remote o) {
		assertType(o, TID_CLASS);
		return new Remote((ObjectLike)call(
				url(),
				new Vars<Object>().add(NEW_INSTANCE).add(o).var()
		));
	}

	/**
	 * <p>Synchronously gets an element of a remote array.</p>
	 * @param o The remote array.
	 * @param i The array index for the element.
	 * @return A remote value or object.
	 * @since 1.0
	 */
	@Override
	public Remote getArrayElement(Remote o, int i) {
		assertType(o, TID_ARRAY);
		return new Remote((ObjectLike)call(
				url(),
				new Vars<Object>().add(GET_ARRAY_ELEMENT).add(o).add(i).var()
		));
	}

	/**
	 * <p>Synchronously gets the current length of a remote array.</p>
	 * @param o The remote array.
	 * @return A remote value for the length.
	 * @since 1.0
	 */
	@Override
	public Remote getArrayLength(Remote o) {
		assertType(o, TID_ARRAY);
		return new Remote((ObjectLike)call(
				url(),
				new Vars<Object>().add(GET_ARRAY_LENGTH).add(o).var()
		));
	}

	/**
	 * <p>Synchronously sets an element of a remote array.</p>
	 * @param o The remote array.
	 * @param i The array index for the element.
	 * @param v The new value for the element.
	 * @return A remote value or object.
	 * @since 1.0
	 */
	@Override
	public Remote setArrayElement(Remote o, int i, Remote v) {
		assertType(o, TID_ARRAY);
		return new Remote((ObjectLike)call(
				url(),
				new Vars<Object>().add(SET_ARRAY_ELEMENT).add(o).add(i).add(v).var()
		));
	}

	/**
	 * <p>Synchronously gets a remote field.</p>
	 * @param o The remote object for the base.
	 * @param name The name for the field.
	 * @return A remote field.
	 * @since 1.0
	 */
	@Override
	public Remote getField(Remote o, String name) {
		return new Remote((ObjectLike)call(
				url(),
				new Vars<Object>().add(GET_FIELD).add(o).add(name).var()
		));
	}

	/**
	 * <p>Synchronously evaluates a remote static field.</p>
	 * @param o The remote static field.
	 * @return A remote value or object.
	 * @since 1.0
	 */
	@Override
	public Remote get(Remote o) {
		assertType(o, TID_FIELD);
		return new Remote((ObjectLike)call(
				url(),
				new Vars<Object>().add(GET).add(o).var()
		));
	}

	/**
	 * <p>Synchronously evaluates a remote instance field.</p>
	 * @param o The remote instance field.
	 * @param base The remote object for the base.
	 * @return A remote value or object.
	 * @since 1.0
	 */
	@Override
	public Remote get(Remote o, Remote base) {
		assertType(o, TID_FIELD);
		assertObject(base);
		return new Remote((ObjectLike)call(
				url(),
				new Vars<Object>().add(GET).add(o).add(base).var()
		));
	}

	/**
	 * <p>Synchronously gets a remote method.</p>
	 * @param o The remote object for the base.
	 * @param name The name for the method.
	 * @return A remote method.
	 * @since 1.0
	 */
	@Override
	public Remote getMethod(Remote o, String name) {
		return new Remote((ObjectLike)call(
				url(),
				new Vars<Object>().add(GET_METHOD).add(o).add(name).var()
		));
	}

	/**
	 * <p>Synchronously gets a remote method.</p>
	 * @param o The remote object for the base.
	 * @param name The name for the method.
	 * @param types An array of argument types for the remote method.
	 * @return A remote method.
	 * @since 1.0
	 */
	@Override
	public Remote getMethod(Remote o, String name, ArrayLike<String> types) {
		return new Remote((ObjectLike)call(
				url(),
				ArrayLikes.concat(
						new Vars<Object>().add(GET_METHOD).add(o).add(name).var(),
						types
				)
		));
	}

	/**
	 * <p>Synchronously invokes a remote method without arguments.</p>
	 * @param o The remote method.
	 * @return A remote value or object returned from the remote method invocation.
	 * @since 1.0
	 */
	@Override
	public Remote invoke(Remote o) {
		assertType(o, TID_METHOD);
		return new Remote((ObjectLike)call(
				url(),
				new Vars<Object>().add(INVOKE).add(o).var()
		));
	}

	/**
	 * <p>Synchronously invokes a remote method with arguments.</p>
	 * @param o The remote method.
	 * @param args An array of arguments.
	 * @return A remote value or object returned from the remote method invocation.
	 * @since 1.0
	 */
	@Override
	public Remote invoke(Remote o, ArrayLike<Remote> args) {
		assertType(o, TID_METHOD);
		return new Remote((ObjectLike)call(
				url(),
				ArrayLikes.concat(
						new Vars<Object>().add(INVOKE).add(o).var(),
						args
				)
		));
	}

	/**
	 * <p>Asynchronously registers the current reflector.</p>
	 * @param rt A {@link Returnable} for this asynchronous call to return a registered 
	 * version of the current reflector.
	 * @since 1.0
	 */
	public synchronized final void register(final Returnable<Reflector> rt) {
		new Caller(url()) {
			@Override
			public void callback(Object ret) {
				if (Js.be(rt)) {
					rt.onReturn(new Reflector((ObjectLike)ret));
				}
			}
		}.call(new Vars<Object>().add(REGISTER).var());
	}

	/**
	 * <p>Gets an asynchronous caller for this reflector with a given {@link Returnable}.</p>
	 * @param rt The {@link Returnable} for the asynchronous caller to return value 
	 * on the success of an invocation.
	 * @return An asynchronous caller.
	 * @since 1.0
	 */
	protected final Caller getCaller(final Returnable<Remote> rt) {
		return new Caller(url()) {
			@Override
			public void callback(Object ret) {
				if (Js.be(rt)) {
					rt.onReturn(new Remote((ObjectLike)ret));
				}
			}
		};
	}

	/**
	 * <p>Asynchronously increases remote reference count for a remote object.</p>
	 * @param args An array of arguments. Only the first one is used here.
	 * @param rt A {@link Returnable} for this asynchronous call to return value.
	 * @since 1.0
	 */
	public synchronized final void increase(ArrayLike<Remote> args, Returnable<Remote> rt) {
		getCaller(rt).call(ArrayLikes.concat(
				new Vars<Object>().add(INCREASE).var(),
				args
		));
	}

	/**
	 * <p>Asynchronously decreases remote reference count for a remote object.</p>
	 * @param args An array of arguments. Only the first one is used here.
	 * @param rt A {@link Returnable} for this asynchronous call to return value.
	 * @since 1.0
	 */
	public synchronized final void decrease(ArrayLike<Remote> args, Returnable<Remote> rt) {
		getCaller(rt).call(ArrayLikes.concat(
				new Vars<Object>().add(DECREASE).var(),
				args
		));
	}

	/**
	 * <p>Asynchronously loads a remote class by the class name.</p>
	 * @param name A Java class name.
	 * @param rt A {@link Returnable} for this asynchronous call to return the newly 
	 * created remote class with the class name.
	 * @since 1.0
	 */
	public synchronized final void forName(String name, Returnable<Remote> rt) {
		getCaller(rt).call(new Vars<Object>().add(FOR_NAME).add(name).var());
	}

	/**
	 * <p>Asynchronously gets the remote class for a remote object.</p>
	 * @param o A remote object.
	 * @param rt A {@link Returnable} for this asynchronous call to return the remote 
	 * class for the remote object.
	 * @since 1.0
	 */
	public synchronized final void getRemoteClass(Remote o, Returnable<Remote> rt) {
		getCaller(rt).call(new Vars<Object>().add(GET_REMOTE_CLASS).add(o).var());
	}

	/**
	 * <p>Asynchronously creates a remote instance of a remote class.</p>
	 * @param o The remote class.
	 * @param rt A {@link Returnable} for this asynchronous call to return the newly 
	 * created remote object.
	 * @since 1.0
	 */
	public synchronized final void newInstance(Remote o, Returnable<Remote> rt) {
		assertType(o, TID_CLASS);
		getCaller(rt).call(new Vars<Object>().add(NEW_INSTANCE).add(o).var());
	}

	/**
	 * <p>Asynchronously gets an element of a remote array.</p>
	 * @param o The remote array.
	 * @param i The array index for the element.
	 * @param rt A {@link Returnable} for this asynchronous call to return value.
	 * @since 1.0
	 */
	public synchronized final void getArrayElement(Remote o, int i, Returnable<Remote> rt) {
		assertType(o, TID_ARRAY);
		getCaller(rt).call(new Vars<Object>().add(GET_ARRAY_ELEMENT).add(o).add(i).var());
	}

	/**
	 * <p>Asynchronously gets the current length of a remote array.</p>
	 * @param o The remote array.
	 * @param rt A {@link Returnable} for this asynchronous call to return value.
	 * @since 1.0
	 */
	public synchronized final void getArrayLength(Remote o, Returnable<Remote> rt) {
		assertType(o, TID_ARRAY);
		getCaller(rt).call(new Vars<Object>().add(GET_ARRAY_LENGTH).add(o).var());
	}

	/**
	 * <p>Asynchronously sets an element of a remote array.</p>
	 * @param o The remote array.
	 * @param i The array index for the element.
	 * @param v The new value for the element.
	 * @param rt A {@link Returnable} for this asynchronous call to return value.
	 * @since 1.0
	 */
	public synchronized final void setArrayElement(Remote o, int i, Remote v, Returnable<Remote> rt) {
		assertType(o, TID_ARRAY);
		getCaller(rt).call(new Vars<Object>().add(SET_ARRAY_ELEMENT).add(o).add(i).add(v).var());
	}

	/**
	 * <p>Asynchronously gets a remote field.</p>
	 * @param o The remote object for the base.
	 * @param name The name for the field.
	 * @param rt A {@link Returnable} for this asynchronous call to return a remote field.
	 * @since 1.0
	 */
	public synchronized final void getField(Remote o, String name, Returnable<Remote> rt) {
		getCaller(rt).call(new Vars<Object>().add(GET_FIELD).add(o).add(name).var());
	}

	/**
	 * <p>Asynchronously evaluates a remote static field.</p>
	 * @param o The remote static field.
	 * @param rt A {@link Returnable} for this asynchronous call to return value.
	 * @since 1.0
	 */
	public synchronized final void get(Remote o, Returnable<Remote> rt) {
		assertType(o, TID_FIELD);
		getCaller(rt).call(new Vars<Object>().add(GET).add(o).var());
	}

	/**
	 * <p>Asynchronously evaluates a remote instance field.</p>
	 * @param o The remote instance field.
	 * @param base The remote object for the base.
	 * @param rt A {@link Returnable} for this asynchronous call to return value.
	 * @since 1.0
	 */
	public synchronized final void get(Remote o, Remote base, Returnable<Remote> rt) {
		assertType(o, TID_FIELD);
		assertObject(base);
		getCaller(rt).call(new Vars<Object>().add(GET).add(o).add(base).var());
	}

	/**
	 * <p>Asynchronously gets a remote method.</p>
	 * @param o The remote object for the base.
	 * @param name The name for the method.
	 * @param rt A {@link Returnable} for this asynchronous call to return a remote method.
	 * @since 1.0
	 */
	public synchronized final void getMethod(Remote o, String name, Returnable<Remote> rt) {
		getCaller(rt).call(new Vars<Object>().add(GET_METHOD).add(o).add(name).var());
	}

	/**
	 * <p>Asynchronously gets a remote method.</p>
	 * @param o The remote object for the base.
	 * @param name The name for the method.
	 * @param types An array of argument types for the remote method.
	 * @param rt A {@link Returnable} for this asynchronous call to return a remote method.
	 * @since 1.0
	 */
	public synchronized final void getMethod(Remote o, String name, ArrayLike<String> types, final Returnable<Remote> rt) {
		getCaller(rt).call(ArrayLikes.concat(
				new Vars<Object>().add(GET_METHOD).add(o).add(name).var(),
				types
		));
	}

	/**
	 * <p>Asynchronously invokes a remote method without arguments.</p>
	 * @param o The remote method.
	 * @param rt A {@link Returnable} for this asynchronous call to return the remote value 
	 * or object returned from the remote method invocation.
	 * @since 1.0
	 */
	public synchronized final void invoke(Remote o, Returnable<Remote> rt) {
		assertType(o, TID_METHOD);
		getCaller(rt).call(new Vars<Object>().add(INVOKE).add(o).var());
	}

	/**
	 * <p>Asynchronously invokes a remote method with arguments.</p>
	 * @param o The remote method.
	 * @param args An array of arguments.
	 * @param rt A {@link Returnable} for this asynchronous call to return the remote value 
	 * or object returned from the remote method invocation.
	 * @since 1.0
	 */
	public synchronized final void invoke(Remote o, ArrayLike<Remote> args, Returnable<Remote> rt) {
		assertType(o, TID_METHOD);
		getCaller(rt).call(ArrayLikes.concat(
				new Vars<Object>().add(INVOKE).add(o).var(),
				args
		));
	}
}
