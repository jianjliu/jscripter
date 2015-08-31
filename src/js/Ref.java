
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

package js;

/**
 * <p>An <b>opaque</b> class to construct a value reference which is useful from an 
 * enclosed class to access a variable or field of the enclosing class that must have been 
 * modified as <tt>final</tt> in that case.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 */

public final class Ref<T>
{
	/**
	 * <p>The value the current value reference refers to.</p>
	 * @since 1.0
	 * @javascript Re-compilers must replace any access to this instance field with the 
	 * JavaScript expression: 
	 * <pre>r[0]</pre>
	 * where <tt>r</tt> is the current instance of the value reference.
	 */
	public T value;

	/**
	 * <p>Creates a value reference.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert this constructor into the JavaScript expression: 
	 * <pre>[value]</pre>.
	 */
	@SuppressWarnings("unchecked")
	public Ref(Object value) {
		this.value = (T)value;
	}

	/**
	 * <p>Checks if the current value reference equals another object.</p>
	 * <p>This method is <b>internal</b> and calling this method is unsupported.</p>
	 * @param o Any value
	 * @return <tt>true</tt> if the current value reference equals <tt>o</tt>; 
	 * false, otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	public final boolean equals(Object o) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <p>Gets the hash code of the current value reference.</p>
	 * <p>This method is <b>internal</b> and calling this method is unsupported.</p>
	 * @return The hash code of the current value reference.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	public final int hashCode() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <p>Gets the string representation of the current value reference.</p>
	 * <p>This method is <b>internal</b> and calling this method is unsupported.</p>
	 * @return The string representation of the current value reference.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	public final String toString() {
		throw new UnsupportedOperationException();
	}
}
