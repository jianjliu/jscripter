
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

import js.Index;
import js.Initializer;
import js.Js;
import js.ObjectLike;
import jsx.http.rpc.XMLHttpRemote;

/**
 * <p>A base class for objects that support remote reflect services.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Remote extends XMLHttpRemote
{
	/**
	 * <p>The type id for <tt>null</tt> in remote reflect service.</p>
	 * @since 1.0
	 */
	public final static int TID_NULL      = 0;
	/**
	 * <p>The type id for strings in remote reflect service.</p>
	 * @since 1.0
	 */
	public final static int TID_STRING    = 1;
	/**
	 * <p>The type id for numbers in remote reflect service.</p>
	 * @since 1.0
	 */
	public final static int TID_NUMBER    = 2;
	/**
	 * <p>The type id for general objects in remote reflect service.</p>
	 * @since 1.0
	 */
	public final static int TID_OBJECT    = 3;
	/**
	 * <p>The type id for fields in remote reflect service.</p>
	 * @since 1.0
	 */
	public final static int TID_FIELD     = 4;
	/**
	 * <p>The type id for methods in remote reflect service.</p>
	 * @since 1.0
	 */
	public final static int TID_METHOD    = 5;
	/**
	 * <p>The type id for classes in remote reflect service.</p>
	 * @since 1.0
	 */
	public final static int TID_CLASS     = 6;
	/**
	 * <p>The type id for arrays in remote reflect service.</p>
	 * @since 1.0
	 */
	public final static int TID_ARRAY     = 7;
	/**
	 * <p>The type id for exceptions in remote reflect service.</p>
	 * @since 1.0
	 */
	public final static int TID_EXCEPTION = 8;
	/**
	 * <p>The type id for reflectors in remote reflect service.</p>
	 * @since 1.0
	 */
	public final static int TID_REFLECTOR = 9;

	/**
	 * <p>Returns a remote object for <tt>null</tt>.</p>
	 * @return A remote object of <tt>null</tt>.
	 * @since 1.0
	 */
	public static final Remote nul() {
		return new Remote(
				new Initializer().set(TID, TID_NULL).var()
		);
	}

	/**
	 * <p>Creates and returns a remote object for a given number.</p>
	 * @param v A number value.
	 * @return A remote object of the given number.
	 * @since 1.0
	 */
	public static final Remote create(Number v) {
		return new Remote(
				new Initializer().set(TID, TID_NUMBER)
				                 .set(VID, Js.toString(v))
				                 .var()
		);
	}

	/**
	 * <p>Creates and returns a remote object for a given string.</p>
	 * @param v A string value.
	 * @return A remote object of the given string.
	 * @since 1.0
	 */
	public static final Remote create(String v) {
		return new Remote(
				new Initializer().set(TID, TID_STRING)
				                 .set(VID, v)
				                 .var()
		);
	}

	/**
	 * <p>The {@link Index} of type id fields in remote objects.</p>
	 * @since 1.0
	 */
	public final static Index<Number> TID = new Index<Number>(0);
	/**
	 * <p>The {@link Index} of value id fields in remote objects.</p>
	 * @since 1.0
	 */
	public final static Index<String> VID = new Index<String>(1);

	/**
	 * <p>A typical constructor for a {@link Remote} object.</p>
	 * @param o An initializer for configuration.
	 * @since 1.0
	 */
	public Remote(ObjectLike o) {
		super(o);
	}

	/**
	 * <p>A typical constructor for an {@link Remote} object.</p>
	 * @param tid The type id for the remote object. The legal type ids are:
	 * <ul>
	 * <li>{@link #TID_ARRAY}</li>
	 * <li>{@link #TID_CLASS}</li>
	 * <li>{@link #TID_EXCEPTION}</li>
	 * <li>{@link #TID_FIELD}</li>
	 * <li>{@link #TID_METHOD}</li>
	 * <li>{@link #TID_NULL}</li>
	 * <li>{@link #TID_NUMBER}</li>
	 * <li>{@link #TID_OBJECT}</li>
	 * <li>{@link #TID_REFLECTOR}</li>
	 * <li>{@link #TID_STRING}</li>
	 * </ul>
	 * @param vid The value id for the remote object.
	 * @since 1.0
	 */
	public Remote(int tid, String vid) {
		this(new Initializer().set(TID, tid).set(VID, vid).var());
	}

	/**
	 * <p>Gets a string field with an {@link Index} from a given {@link Remote} object.</p>
	 * @param v A given {@link Remote} object.
	 * @param id An {@link Index} for the field.
	 * @return A string value for the field.
	 * @since 1.0
	 */
	public static final String getString(Remote v, Index<String> id) {
		return string(v, id);
	}

	/**
	 * <p>Gets description for a remote object type.</p>
	 * @param tid A type id for remote objects. The legal type ids are:
	 * <ul>
	 * <li>{@link #TID_ARRAY}</li>
	 * <li>{@link #TID_CLASS}</li>
	 * <li>{@link #TID_EXCEPTION}</li>
	 * <li>{@link #TID_FIELD}</li>
	 * <li>{@link #TID_METHOD}</li>
	 * <li>{@link #TID_NULL}</li>
	 * <li>{@link #TID_NUMBER}</li>
	 * <li>{@link #TID_OBJECT}</li>
	 * <li>{@link #TID_REFLECTOR}</li>
	 * <li>{@link #TID_STRING}</li>
	 * </ul>
	 * @return A short descriptive name for the type.
	 * @since 1.0
	 */
	public static final String type(int tid) {
		switch (tid) {
			case TID_NULL:
				return "NULL";
			case TID_STRING:
				return "STRING";
			case TID_NUMBER:
				return "NUMBER";
			case TID_OBJECT:
				return "OBJECT";
			case TID_FIELD:
				return "FIELD";
			case TID_METHOD:
				return "METHOD";
			case TID_CLASS:
				return "CLASS";
			case TID_ARRAY:
				return "ARRAY";
			case TID_EXCEPTION:
				return "EXCEPTION";
			case TID_REFLECTOR:
				return "REFLECTOR";
			default:
				return "UNKNOWN";
		}
	}

	/**
	 * <p>Gets an integer value from a number field with an {@link Index} from a given 
	 * {@link Remote} object.</p>
	 * @param v A given {@link Remote} object.
	 * @param id An {@link Index} for the field.
	 * @return An integer value for the field.
	 * @since 1.0
	 */
	public static final int get(Remote v, Index<Number> id) {
		Number r = number(v, id);
		if (Js.not(r)) {
			return 0;
		}
		return r.intValue();
	}

	/**
	 * <p>Asserts a {@link Remote} object is of a type.</p>
	 * @param v A given {@link Remote} object.
	 * @param t A type id.
	 * @throws This method throws a {@link ReflectException} if the types do not match.
	 * @since 1.0
	 */
	public static final void assertType(Remote v, int t) {
		if (Js.not(v)) {
			throw new ReflectException();
		}
		if (get(v, TID) != t) {
			throw new ReflectException();
		}
	}

	/**
	 * <p>Checks whether a {@link Remote} object is a remote object and not just a value.</p>
	 * @param v A given {@link Remote} object.
	 * @return <tt>true</tt> if the {@link Remote} object is a remote object; <tt>false</tt>
	 * if the {@link Remote} object is just a remote value.
	 * @since 1.0
	 */
	public static final boolean isObject(Remote v) {
		return Js.be(v) && get(v, TID) >= TID_OBJECT;
	}

	/**
	 * <p>Asserts a {@link Remote} object is a remote object and not just a value.</p>
	 * @param v A given {@link Remote} object.
	 * @throws This method throws a {@link ReflectException} if the {@link Remote} 
	 * object is just a remote value and not a remote object.
	 * @since 1.0
	 */
	public static final void assertObject(Remote v) {
		if (!isObject(v)) {
			throw new ReflectException();
		}
	}

	/**
	 * <p>Evaluates a given {@link Remote} object as a string value.</p>
	 * @param v A given {@link Remote} object.
	 * @return A string value of the given {@link Remote} object.
	 * @throws This method throws a {@link ReflectException} if the {@link Remote} 
	 * object is not a remote value of string.
	 * @since 1.0
	 */
	public static final String getString(Remote v) {
		assertType(v, TID_STRING);
		return string(v, VID);
	}
}
