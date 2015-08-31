
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

import org.jscripter.emu.java.lang.Class;

import js.ArrayLike;
import js.Js;
import js.Value;
import js.core.JsFunction;
import js.core.JsGlobal;
import js.core.JsObject;
import jsx.core.ArrayLikes;

/**
 * <p>An <tt>internal</tt> class for the emulation of Java class objects.</p>
 * <p>This class is only used internally by JS re-compiler implementations.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript This class is only loaded and resolved by re-compiler implementations.
 */
public class JavaClass extends JavaInterface
{
	/**
	 * <p>Internally stores the constructor for this Java class object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public JsFunction<JsObject> constructor;
	/**
	 * <p>Internally stores the superclass for this Java class object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public JavaClass superClass;
	/**
	 * <p>Internally stores the prototype for this Java class object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public JsObject prototype;
	/**
	 * <p>Internally stores the initialization function for this Java class object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public JsFunction<Void> init;

	/**
	 * <p>Internally returns a string representation for the current Java class object.</p>
	 * @return The string representation for the current Java class object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public String toString() {
		return new Value.String("Class").add(" ").add(getName(this)).var();
	}

	/**
	 * <p>Internally gets the Java class of an object.</p>
	 * @param o An object or value.
	 * @return A Java class object representing the Java class of the object or
	 * <tt>null</tt> if the value is not a Java object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public final static JavaClass getClass(Object o) {
		return (JavaClass)(Object)Js.cond(
				o instanceof JavaObject,
				((JavaObject)(Object)o).jclass,
				(JavaClass)null
		);
	}

	/**
	 * <p>Internally determines whether a Java class object represents a super
	 * class of that another Java class object does.</p>
	 * @param sup A Java class object.
	 * @param sub A Java class object.
	 * @return <tt>true</tt> if the 1st Java class object represents a super class
	 * of that the 2nd Java class object does; <tt>false</tt>, otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final boolean isSuperClass(JavaClass sup, JavaClass sub) {
		if (Js.eq(sub, Class.class)) {
			return Js.eq(sup, Class.class);
		}
		do {
			if (Js.eq(sup, sub)) {
				return true;
			}
			sub = sub.superClass;
		} while (Js.be(sub) && Js.neq(sub, Class.class));
		return false;
	}

	/**
	 * <p>Internally creates a Java class object with its name and super class.</p>
	 * @param name Represents the name of a Java class.
	 * @param superClass Represents the name of a Java class.
	 * @return The newly created Java class object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	protected final static JavaClass createClass(ArrayLike<String> name, JavaClass superClass) {
		JavaClass jc = new JavaClass();
		jc.name = name;
		JsFunction<JsObject> c = JsGlobal.Function.with().create();
		c.var(JsFunction.prototype, superClass.constructor.create());
		jc.constructor = c;
		jc.superClass = superClass;
		jc.prototype = JsFunction.prototype.with(c);
		return jc;
	}

	/**
	 * <p>Internally stores the implemented interfaces to a Java class object.</p>
	 * @param jc Represents a Java class.
	 * @param si Represents all the interfaces for a Java class.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	protected final static void setInterfaces(JavaClass jc, ArrayLike<JavaInterface> si) {
		JsObject p = jc.prototype;
		for (int i = 0, n = ArrayLikes.length(si); i < n; ++i) {
			JavaInterface ji = si.get(i);
			p.var(JavaInterface.getName(ji), ji);
		}
	}
}
