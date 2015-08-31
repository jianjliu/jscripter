
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

import js.Js;
import js.ObjectLike;
import js.Value;
import js.Vars;
import js.core.JsArray;
import js.core.JsGlobal;
import js.core.JsObject;

/**
 * <p>An <tt>internal</tt> class for the emulation of Java objects.</p>
 * <p>This class is only used internally by JS re-compiler implementations.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript This class is only loaded and resolved by re-compiler implementations.
 */
public class JavaObject
{
	/**
	 * <p>Internally stores the Java class object for this Java object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public JavaClass jclass;

	/**
	 * <p>Internally clones the Java object.</p>
	 * @return A copy of the current Java object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		if (!java.lang.Cloneable.class.isInstance(this)) {
			return clone(this);
		}
		final JsObject jso = jclass.constructor.create();
		Js.apply(jso, (ObjectLike)this);
		return jso;
	}

	/**
	 * <p>Internally clones a Java object.</p>
	 * <p>This method simply throws a {link CloneNotSupportedException} exception.</p>
	 * @param o An object to clone.
	 * @return A copy of the Java object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public final static Object clone(Object o) throws CloneNotSupportedException {
		throw new java.lang.CloneNotSupportedException();
	}

	/**
	 * <p>Internally compares the current Java object with another value.</p>
	 * @param other A value or object.
	 * @return <tt>true</tt> if the two values are equal; <tt>false</tt>, otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public boolean equals(Object other) {
		return other instanceof JavaObject && 
				Js.eq(((JavaObject)(Object)other).jclass, jclass) &&
				Js.eq(this, other);
	}

	private static interface hashCode {
		static final java.lang.String $ = Js.add(":", "hashCode");
	}
	private static interface nextHashCode {
		static final Value.Number $ = new Value.Number(0);
	}

	/**
	 * <p>Internally computes the hash code for an object.</p>
	 * @param o An object.
	 * @return The hash code for the object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public final static int hashCode(Object o) {
		if (Js.undefined(Js.object(o).var(hashCode.$))) {
			Js.object(o).var(hashCode.$, nextHashCode.$.inc());
		}
		java.lang.Object h = Js.object(o).var(hashCode.$);
		return ((Integer)h).intValue();
	}

	/**
	 * <p>Internally computes the hash code for the current Java object.</p>
	 * @return The hash code for the current Java object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
   	@Override
	public int hashCode() {
		return hashCode(this);
	}

	/**
	 * <p>Internally returns a string representation for the current Java object.</p>
	 * @return The string representation for the current Java object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public String toString() {
		return new Value.String("[")
		                   .add("object")
		                   .add(" ")
		                   .add(JavaInterface.getName(jclass))
		                   .add("]")
		                   .var();
	}

	@Override
	public void finalize() {
	}

	/**
	 * <p>Internally creates a Java object by a Java class object.</p>
	 * @param jclass A Java class object.
	 * @return The newly created Java object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public final static JavaObject createObject(JavaClass jclass) {
		JavaObject jo = (JavaObject)(Object)jclass.constructor.create();
		jo.jclass = jclass;
		return jo;
	}

	/**
	 * <p>Internally creates a Java array object with the sizes provided.</p>
	 * @param sizes An array of sizes for the Java array being created. The length of this 
	 * argument indicates the dimension of the Java array to create.
	 * @return The newly created Java array object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	protected final static JsArray createArray(JsArray sizes) {
		int dimensions = sizes.length();
		JsArray jsa = new Vars<Object>().var().var();
		int size = ((Integer)sizes.get(0)).intValue();
		jsa.var(JsArray.length, size);
		if (dimensions > 1) {
			for (int i = 0; i < size; ++i) {
				jsa.set(
						i,
						createArray(
								sizes.slice(1)
						)
				);
			}
		}
		((JavaObject)(Object)jsa).jclass = (JavaClass)(Object)JsGlobal.Array.with();
		return jsa;
	}
}
