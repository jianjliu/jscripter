
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
 * <p>An <b>opaque</b> interface helping to simulate JavaScript <tt>switch</tt> 
 * statement in the Java language environment.</p>
 * <p>This interface must be implemented in JS Simulation Libraries.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * @see Js#cases()
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 * Re-compilers shall convert Java <tt>switch</tt> statements like:
 * <pre>switch (Js.cases().add(k0).add(k1).add(k2).indexOf(k)) {
 *  case 0:
 *    statement0;</p>
 *  case 1:</p>
 *    statement1;</p>
 *  case 2:</p>
 *    statement2;</p>
 *  default:</p>
 *    default_statement;</p>
 *}</pre>
 * into JavaScript <tt>switch</tt> statements as:
 * <pre>switch (k) {
 *  case k0:
 *    statement0;</p>
 *  case k1:</p>
 *    statement1;</p>
 *  case k2:</p>
 *    statement2;</p>
 *  default:</p>
 *    default_statement;</p>
 *}</pre>
 */

public interface Cases
{
	/**
	 * <p>Adds a key to the current <tt>Cases</tt> cache.</p>
	 * @return The current <tt>Cases</tt> cache itself.
	 * @since 1.0
	 * @javascript Re-compilers must append the expression of <tt>key</tt> to the current 
	 * re-compile time <tt>Cases</tt> cache without generating any JavaScript statements 
	 * or expressions for the interface invocation of this method.
	 */
	public Cases add(Object key);
	/**
	 * <p>Returns the index of a key by searching its reference in the current <tt>Cases</tt> 
	 * cache.</p>
	 * @return The index of a key in the current <tt>Cases</tt> cache.
	 * @since 1.0
	 * @javascript Re-compilers must find the identifier of <tt>key </tt> by looking 
	 * into the current re-compile time <tt>Cases</tt> cache reporting error if it can 
	 * not and replace the interface invocation of this method with the key identifier it 
	 * has found.
	 */
	public int indexOf(Object key);
}
