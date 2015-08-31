
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
 * <p>A <b>normal</b> abstract class helping re-compilers in their finalization mechanisms.</p>
 * <p>Subclasses of a disposable class is disposable. Objects of a disposable class is disposable.
 * Members of a disposable class can only access disposable classes but can be accessed by members 
 * of any non-disposable classes.</p>
 * <p>The <b>opaque</b> classes in this library inherit this class, and therefore are naturally 
 * disposable.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript In its finalization mechanism, a re-compiler must ignore the <tt>finalize</tt> methods 
 * of disposable classes and not try to garbage collect any disposable objects.
 */

public abstract class Disposable
{
	/**
	 * <p>The default constructor to create a disposable object.</p>
	 * @since 1.0
	 * @javascript Re-compilers must treat this construct as <b>normal</b> unless the concrete subclass
	 * is <b>opaque</b>.
	 */
	protected Disposable() {}

	/**
	 * <p>An empty method to prevent subclasses from overriding.</p>
	 * @since 1.0
	 * @javascript Re-compilers must ignore any unnecessary invocations to this method. 
	 */
	@Override
	protected final void finalize() {}
}
