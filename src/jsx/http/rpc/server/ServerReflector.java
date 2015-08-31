
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

package jsx.http.rpc.server;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

import js.ArrayLike;
import js.ObjectLike;
import jsx.http.rpc.remote.Remote;
import jsx.http.rpc.remote.RemoteReflector;

/**
 * <p>A base class of the server-side providers for remote reflect services.</p>
 * <p>Note that a server-side provider for remote reflect services is also a 
 * {@link Remote} object.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class ServerReflector extends RemoteReflector
{
	/**
	 * <p>A typical constructor for a {@link ServerReflector} object.</p>
	 * @param ini An initializer for configuration.
	 * @since 1.0
	 */
	public ServerReflector(ObjectLike ini) {
		super(ini);
	}

	/**
	 * <p>Checks if the servicing remote object IS a reflector.</p>
	 * @return <tt>true</tt> if it is a reflector; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	public boolean isReflector() {
		return get(this, TID) == TID_REFLECTOR;
	}

	private final static IdentityMap cache = new IdentityMap();
	private final static AtomicInteger nextvid = new AtomicInteger(0);

	private static final String getCacheKey(Object o) {
		if (cache.containsValue(o)) {
			return cache.getKey(o);
		} else {
			String k = new Integer(nextvid.incrementAndGet()).toString();
			cache.put(k, o);
			return k;
		}
	}

	/**
	 * <p>Locally registers the current reflector.</p>
	 * @return A registered version of this reflector.
	 * @since 1.0
	 */
	@Override
	public RemoteReflector register() {
		string(this, VID, new Integer(nextvid.incrementAndGet()).toString());
		return this;
	}

	/**
	 * <p>Locally increases remote reference count for a remote object.</p>
	 * @param args An array of arguments. Only the first one is used here.
	 * @since 1.0
	 */
	@Override
	public void increase(ArrayLike<Remote> args) {
		for (int i = 0; i < args.length(); i++) {
			Remote o = args.get(i);
			int tid = get(o, TID);
			switch(tid) {
				case TID_NULL:
				case TID_NUMBER:
				case TID_STRING:
				case TID_CLASS:
				case TID_REFLECTOR:
					break;
				default:
					cache.increase(string(o, VID));
			}
		}
	}

	/**
	 * <p>Locally decreases remote reference count for a remote object.</p>
	 * @param args An array of arguments. Only the first one is used here.
	 * @since 1.0
	 */
	@Override
	public void decrease(ArrayLike<Remote> args) {
		for (int i = 0; i < args.length(); i++) {
			Remote o = args.get(i);
			int tid = get(o, TID);
			switch(tid) {
				case TID_NULL:
				case TID_NUMBER:
				case TID_STRING:
				case TID_CLASS:
				case TID_REFLECTOR:
					break;
				default:
					cache.decrease(string(o, VID));
			}
		}
	}

	/**
	 * <p>Locally loads a remote class by the class name.</p>
	 * @param name A Java class name.
	 * @return The newly created remote class with the class name.
	 * @since 1.0
	 */
	@Override
	public Remote forName(String name) {
		try {
			Class.forName(name);
			return new Remote(Remote.TID_CLASS, name);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		}
	}

	private static final Object checkIn(Remote v, int tid) {
		if (!(v instanceof Remote) || tid != get(v, TID)) return null;
		switch(tid) {
			case TID_NULL:
				return null;
			case TID_NUMBER:
			case TID_STRING:
				return v;
			case TID_CLASS:
				return string(v, VID);
			default:
				return cache.get(string(v, VID));
		}
	}

	/**
	 * <p>Locally gets the remote class for a remote object.</p>
	 * @param o A remote object.
	 * @return The remote class for the remote object.
	 * @since 1.0
	 */
	@Override
	public Remote getRemoteClass(Remote o) {
		return checkOut(checkIn(
				o,
				get(o, TID)
		).getClass());
	}

	/**
	 * <p>Locally creates a remote instance of a remote class.</p>
	 * @param o The remote class.
	 * @return The newly created remote object.
	 * @since 1.0
	 */
	@Override
	public Remote newInstance(Remote o) {
		try {
			return checkOut(Class.forName((String)checkIn(
					o,
					TID_CLASS
			)).newInstance());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		} catch (InstantiationException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		}
	}

	private static final int tid(Object o) {
		if (o == null) {
			return TID_NULL;
		} else if (o instanceof Number) {
			return TID_NUMBER;
		} else if (o instanceof String) {
			return TID_STRING;
		} else if (o instanceof Class) {
			return TID_CLASS;
		} else if (o instanceof Exception) {
			return TID_EXCEPTION;
		} else if (o instanceof Field) {
			return TID_FIELD;
		} else if (o instanceof Method) {
			return TID_METHOD;
		} else {
			return TID_OBJECT;
		}
	}

	private static final Remote checkOut(Object o) {
		int tid = tid(o);
		switch (tid) {
			case TID_NULL:
				return new Remote(tid, "null");
			case TID_NUMBER:
			case TID_STRING:
				return new Remote(tid, o.toString());
			case TID_CLASS:
				return new Remote(tid, ((Class<?>)o).getName());
			default:
				return new Remote(tid, getCacheKey(o));
		}
	}

	/**
	 * <p>Locally gets an element of a remote array.</p>
	 * @param o The remote array.
	 * @param i The array index for the element.
	 * @return A remote value or object.
	 * @since 1.0
	 */
	@Override
	public Remote getArrayElement(Remote o, int i) {
		try {
			return checkOut(((Object[])checkIn(o, TID_ARRAY))[i]);
		} catch (Exception e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		}
	}

	/**
	 * <p>Locally gets the current length of a remote array.</p>
	 * @param o The remote array.
	 * @return A remote value for the length.
	 * @since 1.0
	 */
	@Override
	public Remote getArrayLength(Remote o) {
		try {
			return new Remote(
					Remote.TID_NUMBER,
					new Integer(((Object[])checkIn(o, TID_ARRAY)).length).toString()
			);
		} catch (Exception e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		}
	}

	/**
	 * <p>Locally sets an element of a remote array.</p>
	 * @param o The remote array.
	 * @param i The array index for the element.
	 * @param v The new value for the element.
	 * @return A remote value or object.
	 * @since 1.0
	 */
	@Override
	public Remote setArrayElement(Remote o, int i, Remote v) {
		try {
			getCacheKey(v);
			((Object[])checkIn(o, TID_ARRAY))[i] = checkIn(v, get(v, TID));
			return v;
		} catch (Exception e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		}
	}

	/**
	 * <p>Locally gets a remote field.</p>
	 * @param o The remote object for the base.
	 * @param name The name for the field.
	 * @return A remote field.
	 * @since 1.0
	 */
	@Override
	public Remote getField(Remote o, String name) {
		Class<?> c;
		try {
			c = Class.forName(string(o, VID));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		}
		try {
			return checkOut(
					c.getField(name)
			);
		} catch (SecurityException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		}
	}

	/**
	 * <p>Locally evaluates a remote static field.</p>
	 * @param o The remote static field.
	 * @return A remote value or object.
	 * @since 1.0
	 */
	@Override
	public Remote get(Remote o) {
		Field f;
		try {
			f = (Field)checkIn(o, TID_FIELD);
		} catch (Exception e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		}
		try {
			Object v = f.get(null);
			return checkOut(v);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		}
	}

	/**
	 * <p>Locally evaluates a remote instance field.</p>
	 * @param o The remote instance field.
	 * @param base The remote object for the base.
	 * @return A remote value or object.
	 * @since 1.0
	 */
	@Override
	public Remote get(Remote o, Remote base) {
		Field f;
		try {
			f = (Field)checkIn(o, TID_FIELD);
		} catch (Exception e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		}
		try {
			Object v = f.get(checkIn(base, get(base, TID)));
			return checkOut(v);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		}
	}

	/**
	 * <p>Locally gets a remote method.</p>
	 * @param o The remote object for the base.
	 * @param name The name for the method.
	 * @return A remote method.
	 * @since 1.0
	 */
	@Override
	public Remote getMethod(Remote o, String name) {
		Class<?> c;
		try {
			c = Class.forName(string(o, VID));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		}
		try {
			return checkOut(
					c.getMethod(name)
			);
		} catch (SecurityException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		}
	}

	/**
	 * <p>Locally gets a remote method.</p>
	 * @param o The remote object for the base.
	 * @param name The name for the method.
	 * @param types An array of argument types for the remote method.
	 * @return A remote method.
	 * @since 1.0
	 */
	@Override
	public Remote getMethod(Remote o, String name, ArrayLike<String> types) {
		Class<?> c; Class<?>[] atypes;
		try {
			c = Class.forName(string(o, VID));
			atypes = new Class<?>[types.length()];
			for (int i = 0; i < types.length(); i++) {
				atypes[i] = Class.forName(types.get(i));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		}
		try {
			return checkOut(c.getMethod(name, atypes));
		} catch (SecurityException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		}
	}

	/**
	 * <p>Locally invokes a remote method without arguments.</p>
	 * @param o The remote method.
	 * @return A remote value or object returned from the remote method invocation.
	 * @since 1.0
	 */
	@Override
	public Remote invoke(Remote o) {
		Method m;
		try {
			m = (Method)checkIn(o, TID_METHOD);
		} catch (Exception e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		}
		try {
			Object v = m.invoke(null);
			return checkOut(v);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		}
	}

	/**
	 * <p>Locally invokes a remote method with arguments.</p>
	 * @param o The remote method.
	 * @param args An array of arguments.
	 * @return A remote value or object returned from the remote method invocation.
	 * @since 1.0
	 */
	@Override
	public Remote invoke(Remote o, ArrayLike<Remote> args) {
		Method m; Object b; Object[] a;
		try {
			m = (Method)checkIn(o, TID_METHOD);
			b = checkIn(args.get(0), get(args.get(0), TID));
			a = new Object[args.length() - 1];
			for (int i = 1; i < args.length(); i++) {
				a[i - 1] = checkIn(args.get(i), get(args.get(i), TID));
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		}
		try {
			return checkOut(m.invoke(b, a));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			return new Remote(Remote.TID_EXCEPTION, getCacheKey(e));
		}
	}
}
