
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
import js.Vars;
import jsx.Code;
import jsx.core.ArrayLikes;

/**
 * <p>An abstract base class for client-side non-disposable reflected objects that are finalized 
 * automatically once out of reference.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public abstract class Objective
{
	/**
	 * <p>The package name <tt>java.lang</tt>.</p>
	 * @since 1.0
	 */
	public final static String JAVA_LANG = Code.ref("java", "lang");
	/**
	 * <p>The class name for {@link java.lang.Class}.</p>
	 * @since 1.0
	 */
	public final static String JAVA_LANG_CLASS = Code.ref(JAVA_LANG, "Class");
	/**
	 * <p>The class name for {@link java.lang.Object}.</p>
	 * @since 1.0
	 */
	public final static String JAVA_LANG_OBJECT = Code.ref(JAVA_LANG, "Object");
	/**
	 * <p>The class name for {@link java.lang.String}.</p>
	 * @since 1.0
	 */
	public final static String JAVA_LANG_STRING = Code.ref(JAVA_LANG, "String");
	/**
	 * <p>The package name <tt>java.lang.reflect</tt>.</p>
	 * @since 1.0
	 */
	public final static String JAVA_LANG_REFLECT = Code.ref(JAVA_LANG, "reflect");
	/**
	 * <p>The class name for {@link java.lang.reflect.Field}.</p>
	 * @since 1.0
	 */
	public final static String JAVA_LANG_REFLECT_FIELD = Code.ref(JAVA_LANG_REFLECT, "Field");
	/**
	 * <p>The class name for {@link java.lang.reflect.Method}.</p>
	 * @since 1.0
	 */
	public final static String JAVA_LANG_REFLECT_METHOD = Code.ref(JAVA_LANG_REFLECT, "Method");

	/**
	 * <p>The {@link Reflector} object associated with the current {@link Objective} object.</p>
	 * @since 1.0
	 */
	public final Reflector reflector;
	/**
	 * <p>The underlying {@link Remote} object associated with the current {@link Objective} object.</p>
	 * @since 1.0
	 */
	public final Remote remote;

	/**
	 * <p>The typical constructor for an {@link Objective} object.</p>
	 * @param reflector The {@link Reflector} object associated with the {@link Objective} object 
	 * being constructed.
	 * @param remote The underlying {@link Remote} object associated with the {@link Objective} 
	 * object being constructed.
	 * @since 1.0
	 */
	protected Objective(Reflector reflector, Remote remote) {
		this.reflector = reflector;
		this.remote = remote;
	}

	/**
	 * <p>Finalizes this object when all the references to it are out of scope.</p>
	 * <p>This method decreases the reference count of the remote object that reflects this one 
	 * by calling {@link Reflector#decrease(ArrayLike, jsx.Returnable)} without a 
	 * {@link jsx.Returnable}.</p>
	 * @since 1.0
	 */
	@Override
	protected void finalize() {
		reflector.decrease(cat(), null);
	}

	/**
	 * <p>Concatenates a {@link Remote} object to a new array to create an 
	 * array of arguments for calling remote object services.</p>
	 * @param remote A {@link Remote} object.
	 * @return An array of arguments for calling remote object services.
	 * @since 1.0
	 */
	public static final ArrayLike<Remote> cat(Remote remote) {
		return new Vars<Remote>().add(remote).var();
	}

	/**
	 * <p>Concatenates the underlying {@link Remote} object to a new array to create an 
	 * array of arguments for calling remote object services.</p>
	 * @return An array of arguments for calling remote object services.
	 * @since 1.0
	 */
	public final ArrayLike<Remote> cat() {
		return cat(remote);
	}

	/**
	 * <p>Concatenates the underlying {@link Remote} object to the given array to create an 
	 * array of arguments for calling remote object services.</p>
	 * @param args An array of {@link Remote} objects.
	 * @return The new array of arguments for calling remote object services.
	 * @since 1.0
	 */
	public final ArrayLike<Remote> cat(ArrayLike<Remote> args) {
		return ArrayLikes.concat(cat(), args);
	}

	/**
	 * <p>Concatenates the underlying {@link Remote} object together with that of anther given
	 * {@link Objective} object to a new array to create an array of arguments for calling 
	 * remote object services.</p>
	 * @param o Another {@link Objective} object.
	 * @return An array of arguments for calling remote object services.
	 * @since 1.0
	 */
	public final ArrayLike<Remote> cat(Objective o) {
		return cat(o.cat());
	}
}
