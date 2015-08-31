
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

import org.jscripter.emu.java.*;

import js.Js;

/**
 * <p>The <b>internal</b> root of the Java class hierarchy, emulating a standard <tt>java.lang</tt> 
 * interface or class with the same simple name as this one.</p>
 * <p>This interface or class is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */
public class Object
{
	/**
	 * <p>Internally constructs a new {@link Object}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	public Object() {}

	/**
	 * <p>Returns the runtime class of this {@link Object}.</p>
	 * <p>Note that for the emulation, {@link Object}s can be anything including primitive values.</p>
	 * @return The object after casting, or <tt>null</tt> if <tt>obj</tt> is <tt>null</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * It must redirect resolution of <tt>java.lang.Object.getClass()</tt> method to this one.
	 */
	public final java.lang.Class<?> getJavaClass() {
		return (java.lang.Class<?>)(java.lang.Object)JavaClass.getClass(this);
	}

	/**
	 * <p>Creates and returns a copy of this object.</p>
	 * <p>Note that for the emulation, {@link Object}s can be anything including primitive values.</p>
	 * @return A clone of this instance.
	 * @throws java.lang.CloneNotSupportedException if the object's class does not support the 
	 * {@link Cloneable} interface. Subclasses that override the {@link #clone()} method can also 
	 * throw this exception to indicate that an instance cannot be cloned.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	protected java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return Js.cond(
				(java.lang.Object)this instanceof JavaObject,
				((JavaObject)(java.lang.Object)this).clone(), 
				JavaObject.clone(this)
		);
	}

	/**
	 * <p>Indicates whether some other object is "equal to" this one.</p>
	 * <p>Note that for the emulation, {@link Object}s can be anything including primitive values.</p>
	 * @param obj The object to compare with.
	 * @return <tt>true</tt>if this object is the same as the <tt>obj</tt> argument; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	@Override
	public boolean equals(java.lang.Object obj) {
		return Js.cond(
				(java.lang.Object)this instanceof JavaObject,
				((JavaObject)(java.lang.Object)this).equals(obj), 
				Js.eq(this, obj)
		);
	}

	/**
	 * <p>Returns a hash code for this {@link Object}.</p>
	 * <p>Note that for the emulation, {@link Object}s can be anything including primitive values.</p>
	 * @return A hash code value for this {@link Object}.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	@Override
	public int hashCode() {
		return ((java.lang.Integer)Js.cond(
				(java.lang.Object)this instanceof JavaObject,
				((JavaObject)(java.lang.Object)this).hashCode(), 
				System.identityHashCode(this)
		)).intValue();
	}

	/**
	 * <p>Returns a string representing this {@link Object}'s value.</p>
	 * <p>Note that for the emulation, {@link Object}s can be anything including primitive values.</p>
	 * @return A string representation of this {@link Object}.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public java.lang.String toString() {
		return Js.cond(
				(java.lang.Object)this instanceof JavaObject,
				((JavaObject)(java.lang.Object)this).toString(), 
				Js.toString(this)
		);
	}
}
