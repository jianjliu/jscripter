
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

/**
 * <p>Emulates a standard <tt>java.lang</tt> interface or class with the same simple 
 * name as this one.</p>
 * <p>This interface or class is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the Java interface or class to this one.
 */
public abstract class Number implements org.jscripter.emu.java.io.Serializable
{
	/**
	 * <p>Returns the value of this {@link Number} as a byte primitive.</p>
	 * @return The primitive byte value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this abstract method with the current {@link Number}
	 * involving rounding or truncation necessarily.
	 */
	public abstract byte byteValue();
	/**
	 * <p>Returns the value of this {@link Number} as a short primitive.</p>
	 * @return The primitive short value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this abstract method with the current {@link Number}
	 * involving rounding or truncation necessarily.
	 */
	public abstract short shortValue();
	/**
	 * <p>Returns the value of this {@link Number} as an int primitive.</p>
	 * @return The primitive int value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this abstract method with the current {@link Number}.
	 * involving rounding or truncation necessarily.
	 */
	public abstract int intValue();
	/**
	 * <p>Returns the value of this {@link Number} as a long primitive.</p>
	 * @return The primitive long value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this abstract method with the current {@link Number}.
	 * involving rounding necessarily.
	 */
	public abstract long longValue();
	/**
	 * <p>Returns the value of this {@link Number} as a float primitive.</p>
	 * @return The primitive float value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this abstract method with the current {@link Number}.
	 * involving rounding necessarily.
	 */
	public abstract float floatValue();
	/**
	 * <p>Returns the value of this {@link Number} as a long primitive.</p>
	 * @return The primitive double value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 * A re-compiler simply replaces an invocation of this abstract method with the current {@link Number}.
	 */
	public abstract double doubleValue();
}
