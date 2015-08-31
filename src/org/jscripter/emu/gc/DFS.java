
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

package org.jscripter.emu.gc;

import js.ArrayLike;
import js.Index;
import js.Js;
import js.ObjectLike;
import jsx.core.ArrayLikes;
import jsx.core.ObjectLikes;

/**
 * <p>An <tt>internal</tt> abstract base class for DOM-enabled depth-first-search object visitors 
 * emulating garbage collection based finalization in JavaScript.</p>
 * <p>This class is only used internally by JS re-compiler implementations.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript This class is only loaded and resolved by re-compiler implementations.
 */
public abstract class DFS extends GC
{
	/**
	 * <p>A global identifier for a configurable property of an object.</p>
	 * <p>The identified configurable property of an object is a reference 
	 * to an integer number that indicates how many times the object has been visited
	 * by the current process of finalization.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this identifier.
	 */
	protected final static Index<Integer> COUNT = new Index<Integer>("$DFS.COUNT");
	/**
	 * <p>A global identifier for a configurable property of an object.</p>
	 * <p>The identified configurable property of an object is a reference 
	 * to an integer number that indicates how many lives the object currently has.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this identifier.
	 */
	protected final static Index<Integer> LIVES = new Index<Integer>("$DFS.LIVES");
	/**
	 * <p>A global identifier for a configurable property of an object.</p>
	 * <p>The identified configurable property of an object is a reference 
	 * to an integer number that indicates the time stamp of the last finalization
	 * process that visited the object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this identifier.
	 */
	protected final static Index<Integer> TIMES = new Index<Integer>("$DFS.TIMES");

	/**
	 * <p>Internally constructs an object visitor of this type.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	protected DFS() {}

	/**
	 * <p>Internally traverses all children of an object.</p>
	 * @param o An object to traverse.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public void traverse(ObjectLike o) {
		if (GCDOM.isElement(o)) {
			super.traverse(o);
		}
		ArrayLike<String> keys = Js.keys(o);
		for (int i = 0, len = ArrayLikes.length(keys); i < len; i++) {
			Object c = o.var(keys.get(i));
			if (isObjectLike(c) && isAllocated((ObjectLike)c) && c != o &&
				(!GCDOM.isElement(o) || !GCDOM.isNode((ObjectLike)c)) &&
				isRelevant((ObjectLike)c)
			) {
				visit((ObjectLike)c);
			}
		}
	}

	private static int times = 0;

	/**
	 * <p>Internally gets the time stamp of garbage collection based finalization.</p>
	 * @return A unique integer number that identifies a finalization process.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	protected static int times() {
		return times;
	}

	/**
	 * <p>Internally starts a garbage collection based finalization from an object.</p>
	 * @param o An object from where to start a new finalization process.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public static final void start(ObjectLike o) {
		times++;
		new DFSMarker().visit(o);
		ObjectLikes.inc(o, REFS);
		new DFSSearcher().visit(o);
		ObjectLikes.dec(o, REFS);
		new DFSSweeper().visit(o);
	}
}
