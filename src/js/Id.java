
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
 * <p>An <b>opaque</b> class to construct an ID which can be used as a field 
 * identifier that is globally or locally unique.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 */

public class Id<T> extends Disposable
{
	private static int nextId;

	private final Var.Mid mid;

	/**
	 * <p>The typical constructor to create an ID that is locally unique with a 
	 * specified string value.</p>
	 * @param idx The argument string value that uniquely identifies the ID in the 
	 * local context.
	 * @since 1.0
	 * @javascript Re-compilers must replace this constructor with the specified string 
	 * argument as field identifier.
	 */
	protected Id(String idx) {
		mid = Var.Members.id(idx);
	}

	/**
	 * <p>Re-wraps the argument ID to the desired generic type.</p>
	 * @param idx The argument ID of the original type.
	 * @since 1.0
	 * @javascript Re-compilers must replace this constructor with the the argument ID.
	 */
	public Id(Id<?> idx) {
		mid = idx.mid;
	}

	/**
	 * <p>Creates an ID that is globally unique.</p>
	 * @since 1.0
	 * @javascript Re-compilers must replace this constructor with a globally unique 
	 * integer as a field identifier.
	 */
	public Id() {
		this(Integer.toString(nextId++));
	}

	/**
	 * <p>Gets the member ID of the current ID  instance.</p>
	 * @return The member ID of the current ID  instance.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the virtual invocation of this method, that is, 
	 * replacing it with its current instance.
	 */
	public final Var.Mid mid() {
		return mid;
	}

	/**
	 * <p>Gets the hash code of the current ID  instance.</p>
	 * @return The hash code of the current ID  instance.
	 * @since 1.0
	 * @javascript Re-compilers must replace the virtual invocation of this method with the 
	 * JavaScript expression converted from the Java static invocation:
	 * <pre>System.identityHashCode(this)</pre>.
	 */
	@Override
	public final int hashCode() {
		return mid.hashCode();
	}

	/**
	 * <p>Checks if the current ID  instance equals another object.</p>
	 * @param o Any value
	 * @return <tt>true</tt> if the current ID  instance equals <tt>o</tt>; 
	 * false, otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must replace the virtual invocation of this method with the 
	 * JavaScript expression converted from the Java special invocation:
	 * <pre>super.equals(o)</pre>.
	 */
	@Override
	public final boolean equals(Object o) {
		return o.equals(mid);
	}

	/**
	 * <p>Gets the string representation of the current ID  instance.</p>
	 * @return The string representation of the current ID  instance.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the virtual invocation of this method, that is, 
	 * replacing it with its current instance.
	 */
	@Override
	public final String toString() {
		return mid.toString();
	}
}
