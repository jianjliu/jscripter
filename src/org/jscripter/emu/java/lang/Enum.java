
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

import org.jscripter.emu.java.io.Serializable;

import js.*;

/**
 * <p>The <b>internal</b> common base class of all Java language enumeration types, emulating a 
 * standard <tt>java.lang</tt> interface or class with the same simple name as this one.</p>
 * <p>This interface or class is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */
public abstract class Enum<E extends Enum<E>> implements Comparable<E>, Serializable
{
	private final java.lang.String name;
	final int ordinal;

	/**
	 * <p>Sole constructor.</p>
	 * <p>Programmers cannot invoke this constructor. It is for use by code emitted by the 
	 * Java compiler in response to <tt>enum</tt> type declarations.</p>
	 * @param name The name of this <tt>enum</tt> constant, which is the identifier used to declare it.
	 * @param ordinal The ordinal of this enumeration constant (its position in the <tt>enum</tt> 
	 * declaration, where the initial constant is assigned an ordinal of zero).
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	protected Enum(java.lang.String name, int ordinal) {
		this.name = name;
		this.ordinal = ordinal;
		((js.ObjectLike)(java.lang.Object)getClass()).var(name, this);
	}

	/**
	 * <p>Returns the enum constant of the specified enum type with the specified name.</p>
	 * <p>The name must match exactly an identifier used to declare an enum constant in this type. 
	 * (Extraneous whitespace characters are not permitted.).</p>
	 * @param enumType The Class object of the enum type from which to return a constant.
	 * @param name The name of the constant to return.
	 * @return The enum constant of the specified enum type with the specified name.
	 * @throws java.lang.IllegalArgumentException if the specified enum type has no constant with 
	 * the specified name, or the specified class object does not represent an enum type.
	 * @throws java.lang.NullPointerException if <tt>enumType</tt> or <tt>name</tt> is <tt>null</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Enum<T>> T valueOf(Class<T> enumType, java.lang.String name) {
		if (Js.not(enumType) || Js.not(name)) {
			throw new java.lang.NullPointerException(name);
		}
		java.lang.Object o = ((js.ObjectLike)(java.lang.Object)enumType).var(name);
		if (Js.not(o)) {
			throw new java.lang.IllegalArgumentException(name);
		}
		return (T)o;
	}

	/**
	 * <p>Throws java.lang.CloneNotSupportedException.</p>
	 * <p>This guarantees that enums are never cloned, which is necessary to preserve their 
	 * "singleton" status.</p>
	 * @return (never returns).
	 * @throws java.lang.CloneNotSupportedException if the object's class does not support the 
	 * {@link Cloneable} interface. Subclasses that override the {@link #clone()} method can also 
	 * throw this exception to indicate that an instance cannot be cloned.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	protected java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		throw new java.lang.CloneNotSupportedException();
	}

	/**
	 * <p>Compares this enum with the specified object for order.</p>
	 * <p>It Returns a negative integer, zero, or a positive integer as this object is less than, 
	 * equal to, or greater than the specified object.</p>
	 * <p>Enum constants are only comparable to other enum constants of the same enum type.</p>
	 * <p>The natural order implemented by this method is the order in which the constants are declared.</p>
	 * @param other The object to be compared.
	 * @return A negative integer, zero, or a positive integer as this object is less than, equal 
	 * to, or greater than the specified object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public final int compareTo(E other) {
		return this.ordinal - other.ordinal;
	}

	/**
	 * <p>Determines whether the specified object is equal to this enum constant.</p>
	 * @param other The object to be compared for equality with this object.
	 * @return <tt>true</tt> if the specified object is equal to this enum constant.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	@Override
	public final boolean equals(java.lang.Object other) {
		return this == other;
	}

	/**
	 * <p>Returns the Class object corresponding to this enum constant's enum type.</p>
	 * @return The Class object corresponding to this enum constant's enum type.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@SuppressWarnings("unchecked")
	public final java.lang.Class<E> getDeclaringClass() {
		java.lang.Class<?> clazz = getClass();
		java.lang.Class<?> superclass = clazz.getSuperclass();

		return (superclass == Enum.class) ? (java.lang.Class<E>)clazz : (java.lang.Class<E>)superclass;
	}

	/**
	 * <p>Returns a hash code for this enum constant.</p>
	 * @return A hash code for this enum constant.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	@Override
	public final int hashCode() {
		return java.lang.System.identityHashCode(this);
	}

	/**
	 * <p>Returns the name of this enum constant, exactly as declared in its enum declaration.</p>
	 * @return The name of this enum constant.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public final java.lang.String name() {
		return name;
	}

	/**
	 * <p>Returns the ordinal of this enumeration constant (its position in its enum declaration, 
	 * where the initial constant is assigned an ordinal of zero).</p>
	 * @return The ordinal of this enumeration constant.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	public final int ordinal() {
		return ordinal;
	}

	/**
	 * <p>Returns the name of this enum constant, as contained in the declaration.</p>
	 * @return The name of this enum constant.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	@Override
	public java.lang.String toString() {
		return name;
	}
}
