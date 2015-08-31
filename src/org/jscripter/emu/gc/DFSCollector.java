
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

import org.jscripter.emu.java.JavaObject;

import js.ObjectLike;
import jsx.core.ObjectLikes;

/**
 * <p>An <tt>internal</tt> class for DOM-enabled depth-first-search garbage collectors emulating 
 * garbage collection based finalization in JavaScript.</p>
 * <p>This class is only used internally by JS re-compiler implementations.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript This class is only loaded and resolved by re-compiler implementations.
 */
public final class DFSCollector extends DFS
{
	/**
	 * <p>Internally constructs an object visitor of this type.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	public DFSCollector() {}

	/**
	 * <p>Internally visits an object.</p>
	 * @param o An object to visit.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public final void visit(ObjectLike o) {
		if (isAllocated(o)) {
			ObjectLikes.dec(o, REFS);
		} else {
			if (isJavaObject(o)) {
				((JavaObject)o).finalize();
			}
			traverse(o);
		}
	}
}
