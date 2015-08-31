
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

package jsx;

import js.Disposable;
import js.Initializer;
import js.ObjectLike;

/**
 * <p>An abstract base class for configurable objects.</p>
 * <p>A configurable object typically keeps an {@link ObjectLike} object that is initialized 
 * in a constructor of the {@link Configurable} object and is reconfigurable later.</p>
 * <p>With the design of this class, its objects are all configurable in any of its 
 * subclasses and behave much like what happens in JavaScript.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public abstract class Configurable extends Disposable
{
	/**
	 * <p>The object holding the configuration data.</p>
	 * <p>Although it is very convenient to access this field of a configurable object from 
	 * the class of the object and its subclasses, the {@link #ini(Configurable)} method 
	 * makes it possible to access this field of a configurable object from any subclasses 
	 * of the {@link Configurable} class.</p>
	 * @since 1.0
	 * @see #ini(Configurable)
	 */
	private ObjectLike ini;

	/**
	 * <p>The default constructor that may be invoked in the constructors of the subclasses 
	 * extending this class.</p>
	 * <p>This constructor does not set the {@link #ini} field and is only intended to be 
	 * invoked for the constructors of the subclasses extending this class to access the 
	 * {@link #ini(Configurable)} method.</p>
	 * @see #Configurable(ObjectLike ini)
	 * @see #ini(Configurable)
	 * @since 1.0
	 */
	protected Configurable() {
	}
	/**
	 * <p>The typical constructor that may be invoked in the constructors of the subclasses 
	 * extending this class.</p>
	 * <p>This constructor forces constructors of its subclasses to invoke and pass the 
	 * initializing objects to it.</p>
	 * @param ini The initializing object that can also be created with an object literal 
	 * (see {@link Initializer}).
	 * @see #Configurable()
	 * @see #ini(Configurable)
	 * @since 1.0
	 */
	protected Configurable(ObjectLike ini) {
		this.ini = ini;
	}

	/**
	 * <p>Gets the configuration data from a configurable object.</p>
	 * <p>Although it is very convenient to access the {@link #ini} field of a configurable 
	 * object from the class of the object and its subclasses, this method makes it possible 
	 * to access the {@link #ini} field of a configurable object from any subclasses of the 
	 * {@link Configurable} class.</p>
	 * @param o The configurable object. 
	 * @return The configuration data of the configurable object. 
	 * @since 1.0
	 * @see #ini
	 */
	protected static final ObjectLike ini(Configurable o) {
		return o.ini;
	}
}
