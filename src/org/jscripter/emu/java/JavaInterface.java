
/*
 *  JScripter Emulation 1.0 - To Script Java
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

package org.jscripter.emu.java;

import js.ArrayLike;
import js.Js;
import js.Value;
import js.core.JsGlobal;
import jsx.core.ArrayLikes;

/**
 * <p>An <tt>internal</tt> class for the emulation of Java interface objects.</p>
 * <p>This class is only used internally by JS re-compiler implementations.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript This class is only loaded and resolved by re-compiler implementations.
 */
public class JavaInterface extends JavaObject
{
	/**
	 * <p>Internally stores the name of this Java interface or class object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public ArrayLike<String> name;
	/**
	 * <p>Internally stores all the super interfaces for this Java interface or class object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public ArrayLike<JavaInterface> interfaces;

	/**
	 * <p>Internally returns a string representation for the current Java interface object.</p>
	 * @return The string representation for the current Java interface object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public String toString() {
		return new Value.String("interface").add(" ").add(name).var();
	}

	/**
	 * <p>Internally gets the name of a Java interface or class object.</p>
	 * @param ji A Java interface or class object.
	 * @return The name of the Java interface or class object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final String getName(JavaInterface ji) {
		return ArrayLikes.join(ji.name, ".");
	}

	/**
	 * <p>Internally gets the simple name of a Java interface or class object.</p>
	 * @param ji A Java interface or class object.
	 * @return The simple name of the Java interface or class object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final String getSimpleName(JavaInterface ji) {
		ArrayLike<String> name = ji.name;
		int len = ArrayLikes.length(name);
		return name.get(len - 1);
	}

	/**
	 * <p>Internally determines whether a Java object is an instance of a Java 
	 * interface or class object.</p>
	 * @param v A Java object.
	 * @param c A Java interface or class object.
	 * @return <tt>true</tt> if the Java object is an instance of the Java interface
	 * or class object; <tt>false</tt>, otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final boolean instanceOf(Object v, JavaInterface c) {
		return Js.be(v) && Js.instanceOf(v, JsGlobal.Object.with()) && (
				Js.be(((JavaClass)(java.lang.Object)c).constructor) ?
				Js.instanceOf(
						v, 
						((JavaClass)(java.lang.Object)c).constructor
				) : 
				Js.in(getName(c), v)
		);
	}

	/**
	 * <p>Internally determines whether a Java interface object represents a super
	 * interface of that another Java interface object does.</p>
	 * @param sup A Java interface object.
	 * @param sub A Java interface object.
	 * @return <tt>true</tt> if the 1st Java interface object represents a super interface
	 * of that the 2nd Java interface object does; <tt>false</tt>, otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final boolean isSuperInterface(JavaInterface sup, JavaInterface sub) {
		ArrayLike<JavaInterface> si = sub.interfaces;
		if (Js.not(si)) {
			return false;
		} else if (ArrayLikes.indexOf(si, sup) != -1) {
			return true;
		}
		for (int i = 0, len = ArrayLikes.length(si); i < len; i++) {
			if (isSuperInterface(sup, si.get(i))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <p>Internally creates a Java interface object by its name.</p>
	 * @param name Represents the name of a Java interface.
	 * @return The newly created Java interface object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	protected final static JavaInterface createInterface(ArrayLike<String> name) {
		JavaInterface oi = new JavaInterface();
		oi.name = name;
		return oi;
	}

	/**
	 * <p>Internally casts an object to a Java interface or class represented by a
	 * given Java interface object.</p>
	 * @param o An object to cast.
	 * @param c A Java interface object.
	 * @return The object itself.
	 * @throws A {@link ClassCastException} exception if the cast fails.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	protected final static Object checkCast(Object o, JavaInterface c) {
		return Js.cond(
				Js.be(o),
				returnOrThrow(
						JavaInterface.instanceOf(o, c),
						JavaInterface.getName(c),
						o
				),
				o
		);
	}

	private static Object returnOrThrow(boolean test, String message, Object o) {
		if (!test) {
			ClassCastException cce = new ClassCastException(
					new Value.String(o.getClass().getName())
					         .add(":")
					         .add(message)
					         .var()
			);
			Js.alert(cce.getMessage());
			throw cce;
		}
		return o;
	}
}
