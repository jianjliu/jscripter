
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

import js.Js;

/**
 * <p><b>Internally</b> represents primitive boolean values, emulating a standard <tt>java.lang</tt> interface or 
 * class with the same simple name as this one.</p>
 * <p>This interface or class is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */
public final class Boolean implements Comparable<Boolean>, Serializable
{
	/**
	 * <p>Internally stores the {@link Boolean} corresponding to the primitive value <tt>false</tt>.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public final static Boolean FALSE = new Boolean(false);
	/**
	 * <p>Internally stores the {@link Boolean} corresponding to the primitive value <tt>true</tt>.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this field.
	 */
	public final static Boolean TRUE  = new Boolean(true );

	/**
	 * <p>Parses the string argument as a boolean.</p>
	 * <p>The boolean returned represents the value <tt>true</tt> if the string argument is 
	 * not <tt>null</tt> and is equal, ignoring case, to the string "true".</p>
	 * @param s A string containing the boolean representation to be parsed.
	 * @return The {@link Boolean} represented by the string argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized Boolean parseString(java.lang.String s) {
		return valueOf(s);
	}

	/**
	 * <p>Returns a string representing the specified boolean.</p>
	 * <p>If the specified boolean is true, then the string "true" will be returned, otherwise the 
	 * string "false" will be returned.</p>
	 * @param b A boolean to be converted.
	 * @return The string representation of the specified boolean.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized java.lang.String toString(boolean b) {
		return Js.cond(b, "true", "false");
	}

	/**
	 * <p>Returns a {@link Boolean} representing the specified boolean value.</p>
	 * @param b A boolean value.
	 * @return A {@link Boolean} representing <tt>b</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized Boolean valueOf(boolean b) {
		return new Boolean(b);
	}

	/**
	 * <p>Returns a {@link Boolean} represented by the specified string value.</p>
	 * @param s A string value.
	 * @return A {@link Boolean} represented by <tt>s</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * As a "synchronized" static emulating method, its invocation should be re-compiled into in-lined code for efficiency.
	 */
	public static final synchronized Boolean valueOf(java.lang.String s) {
		return new Boolean(s.equalsIgnoreCase("true"));
	}

	/**
	 * <p>Allocates a {@link Boolean} representing the boolean argument.</p>
	 * @param value A boolean value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 * A re-compiler simply replaces an invocation of this empty constructor with its argument.
	 */
	public Boolean(boolean value) {
	}

	/**
	 * <p>Allocates a {@link Boolean} representing the value <tt>true</tt> if the string argument is 
	 * not <tt>null</tt> and is equal, ignoring case, to the string "true". Otherwise, allocate a 
	 * {@link Boolean} object representing the value <tt>false</tt>.</p>
	 * @param s A string to be converted to a {@link Boolean}.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 * A re-compiler simply replaces an invocation of this empty constructor with its argument.
	 */
	public Boolean(java.lang.String s) {
	}

	/**
	 * <p>Returns the value of this {@link Boolean} as a boolean primitive.</p>
	 * @return The primitive boolean value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this native method with the current {@link Boolean}.
	 */
	public final native boolean booleanValue();

	/**
	 * <p>Compares this {@link Boolean} with another.</p>
	 * @param b The {@link Boolean} to be compared.
	 * @return zero if this {@link Boolean} represents the same boolean value as the argument; a positive 
	 * value if this {@link Boolean} represents <tt>true</tt> and the argument represents <tt>false</tt>; 
	 * and a negative value if this {@link Boolean} represents <tt>false</tt> and the argument 
	 * represents <tt>true</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public int compareTo(Boolean b) {
		return Js.be(this) ? (Js.be(b) ? 0 : 1) : (Js.be(b) ? -1 : 0);
	}

	/**
	 * <p>Compares this {@link Boolean} to the specified object.</p>
	 * <p>Returns <tt>true</tt> if and only if the argument is not <tt>null</tt> and is a {@link Boolean} 
	 * that represents the same boolean value as this {@link Boolean}.</p>
	 * @param o The object to compare with.
	 * @return <tt>true</tt> if the {@link Boolean}s represent the same value; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	@Override
	public boolean equals(java.lang.Object o) {
		return Js.eq(this, o);
	}

	/**
	 * <p>Returns a hash code for this {@link Boolean}.</p>
	 * @return The integer 1231 if this {@link Boolean} represents <tt>true</tt>; it returns the integer 1237 
	 * if this {@link Boolean} represents false.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * For efficiency, the invocation of this instance emulation method with single statement can be in-lined in re-compilation.
	 */
	@Override
	public int hashCode() {
		return Js.be(this) ? 1231 : 1237;
	}

	/**
	 * <p>Returns a string representing this {@link Boolean}'s value.</p>
	 * <p>If this {@link Boolean} represents the value <tt>true</tt>, a string equal to "true" is 
	 * returned. Otherwise, a string equal to "false" is returned.</p>
	 * @return A string representation of this {@link Boolean}.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public java.lang.String toString() {
		return toString(booleanValue());
	}
}
