
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

package org.jscripter.emu.java.lang;

import org.jscripter.emu.java.JavaClass;
import org.jscripter.emu.java.JavaInterface;
import org.jscripter.emu.java.JavaObject;

import js.*;
import js.core.JsGlobal;

/**
 * <p><b>Internal</b> instances of the class <tt>java.lang.Class</tt> represent classes and 
 * interfaces in a running application, emulating a 
 * standard <tt>java.lang</tt> interface or class with the same simple name as this one.</p>
 * <p>This interface or class is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */
public final class Class<T>
{
	private Class() {}

	/**
	 * <p>Casts this Class object to represent a subclass of the class represented by the 
	 * specified class object. Checks that that the cast is valid, and throws a 
	 * <tt>java.lang.ClassCastException</tt> if it is not. If this method succeeds, it always 
	 * returns a reference to this class object.</p>
	 * @param clazz A class object.
	 * @return This Class object, cast to represent a subclass of the specified class object.
	 * @throws java.lang.ClassCastException if this Class object does not represent a subclass 
	 * of the specified class (here "subclass" includes the class itself).
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public <U> java.lang.Class<? extends U> asSubclass(java.lang.Class<U> clazz) {
		if (isAssignableFrom(clazz)) {
			return clazz;
		}
		throw new java.lang.ClassCastException();
	}

	/**
	 * <p>Casts an object to the class or interface represented by this Class object.</p>
	 * @param obj An object to be cast.
	 * @return The object after casting, or <tt>null</tt> if <tt>obj</tt> is <tt>null</tt>.
	 * @throws java.lang.ClassCastException if the object is not <tt>null</tt> and is not 
	 * assignable to the type T.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@SuppressWarnings("unchecked")
	public T cast(Object obj) {
		return (T)obj;
	}

	/**
	 * <p>Determines the interfaces implemented by the class or interface represented by 
	 * this object.</p>
	 * @return An array of interfaces implemented by this class.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public java.lang.Class<?>[] getInterfaces() {
		return (java.lang.Class<?>[])(java.lang.Object)((JavaInterface)(java.lang.Object)this).interfaces;
	}

	/**
	 * <p>Returns the name of the class or interface represented by this Class object, 
	 * as a string.</p>
	 * @return The name of the class or interface represented by this object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public java.lang.String getName() {
		return JavaInterface.getName((JavaInterface)(java.lang.Object)this);
	}

	/**
	 * <p>Returns the simple name of the underlying class.</p>
	 * <p>Returns an empty string if the underlying class is anonymous.</p>
	 * @return The simple name of the underlying class.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public java.lang.String getSimpleName() {
		return JavaInterface.getSimpleName((JavaInterface)(java.lang.Object)this);
	}

	/**
	 * <p>Returns the Class representing the superclass of the class or interface represented 
	 * by this Class.</p>
	 * <p>If this Class represents either the <tt>java.lang.Object</tt> class or an interface, 
	 * then <tt>null</tt> is returned. If this object represents an array class then the Class 
	 * object representing the <tt>java.lang.Object</tt> class is returned.</p>
	 * @return The superclass of the class represented by this object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@SuppressWarnings("unchecked")
	public java.lang.Class<? super T> getSuperclass() {
		return (java.lang.Class<T>)(java.lang.Object)((JavaClass)(java.lang.Object)this).superClass;
	}

	/**
	 * <p>Determines if this Class object represents an array class.</p>
	 * @return <tt>true</tt> if this object represents an array class; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public boolean isArray() {
		return Js.eq(this, JsGlobal.Array.with());
	}

	/**
	 * <p>Determines if the class or interface represented by this Class object is either the 
	 * same as, or is a superclass or superinterface of, the class or interface represented by 
	 * the specified Class parameter.</p>
	 * @param cls A Class object to be checked.
	 * @return Indicates whether objects of the type <tt>cls</tt> can be assigned to objects of 
	 * this class.
	 * @throws java.lang.NullPointerException if the specified Class parameter is null.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public boolean isAssignableFrom(java.lang.Class<?> cls) throws java.lang.NullPointerException {
		return isInterface() ? JavaInterface.isSuperInterface(
				(JavaInterface)(java.lang.Object)this,
				(JavaInterface)(java.lang.Object)cls
		) : JavaClass.isSuperClass(
				(JavaClass)(java.lang.Object)this,
				(JavaClass)(java.lang.Object)cls
		);
	}

	/**
	 * <p>Determines if the specified Object is assignment-compatible with the object 
	 * represented by this Class.</p>
	 * @param obj An object to check.
	 * @return <tt>true</tt> if <tt>obj</tt> is an instance of this class; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public boolean isInstance(Object obj) {
		return JavaInterface.instanceOf(obj, (JavaInterface)(java.lang.Object)this);
	}

	/**
	 * <p>Determines if the specified Class object represents an interface type.</p>
	 * @return <tt>true</tt> if this object represents an interface; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public boolean isInterface() {
		return Js.be(((JavaObject)(java.lang.Object)this).jclass) &&
			Js.not(((JavaClass)(java.lang.Object)this).constructor);
	}

	/**
	 * <p>Determines if the specified Class object represents a primitive type.</p>
	 * @return <tt>true</tt> if this object represents a primitive type; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public boolean isPrimitive() {
		return Js.not(((JavaObject)(java.lang.Object)this).jclass);
	}

	/**
	 * <p>Creates a new instance of the class represented by this Class object.</p>
	 * @return A newly allocated instance of the class represented by this object.
	 * @throws java.lang.IllegalAccessException if the class or its nullary constructor 
	 * is not accessible.
	 * @throws java.lang.InstantiationException if this Class represents an abstract class, 
	 * an interface, an array class, a primitive type, or void; or if the class has no nullary 
	 * constructor; or if the instantiation fails for some other reason.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public T newInstance() throws java.lang.InstantiationException, java.lang.IllegalAccessException {
		if (isInterface()) {
			throw new java.lang.IllegalAccessException(getName());
		}
		JavaClass jc = (JavaClass)(java.lang.Object)this;
		if (isPrimitive() || Js.not(jc.init)) {
			throw new java.lang.InstantiationException(getName());
		}
		JavaObject jo = JavaObject.createObject(jc);
		jc.init.call(jo);
		return new Ref<T>(jo).value;
	}

	/**
	 * <p>Converts the object to a string.</p>
	 * <p>The string representation is the string "class" or "interface", followed by a space, 
	 * and then by the fully qualified name of the class in the format returned by {@link #getName()}.</p>
	 * @return A string representation of this class object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public java.lang.String toString() {
		return Js.toString(this);
	}
}
