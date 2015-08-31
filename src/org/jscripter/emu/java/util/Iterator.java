
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

package org.jscripter.emu.java.util;

/**
 * <p><b>Internally</b> represents an iterator over a collection, emulating a standard 
 * <tt>java.util</tt> interface or class with the same simple name as this one.</p>
 * <p>This interface or class is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */
public interface Iterator<E>
{
	/**
	 * <p>Determines whether the iterator has more elements.</p>
	 * @return <tt>true</tt> if the iteration has more elements, i.e., if {@link #next()} would 
	 * return an element rather than throwing an exception.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	boolean hasNext();
	/**
	 * <p>Returns the next element in the iteration.</p>
	 * @return The next element in the iteration.
	 * @throws java.util.NoSuchElementException if the iteration has no more elements.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	E next();
	/**
	 * <p>Removes from the underlying collection the last element returned by the iterator (optional operation). This method can be called only once per call to next. The behavior of an iterator is unspecified if the underlying collection is modified while the iteration is in progress in any way other than by calling this method.</p>
	 * @throws java.lang.UnsupportedOperationException if the {@link #remove()} operation is not supported by this Iterator.
	 * @throws java.lang.IllegalStateException if the {@link #next()} method has not yet been called, 
	 * or the {@link #remove()} method has already been called after the last call to the {@link #next()} method.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	void remove();
}
