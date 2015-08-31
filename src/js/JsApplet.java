
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

import java.applet.Applet;

/**
 * <p>A <b>normal</b> class extended to develop JS applets (also called JsApplets) which 
 * can be re-compiled by third-party JS re-compilers into JavaScript applications (also 
 * called scriptlets) as well as loaded and run directly with <tt>JS Simulation 
 * (packed as sim.jar)</tt> as normal Java applets.</p>
 * <p>Developers are only expected to extend this class to create JS applets and override
 * its abstract method {@link JsApplet#onReady()} to make entry points for them. The members 
 * of this class, except for this abstract method and {@link JsApplet#start()}, are all 
 * <b>internal</b>. The superclass <tt>java.applet</tt> is obviously <b>internal</b>. Any 
 * use, from the entry points, of the internal members shall cause re-compilation failure.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must first load the subclasses of this one which have concrete 
 * methods overriding {@link JsApplet#onReady()}, replacing the naming references to this 
 * class with that to the class <tt>com.javajavascript.emu.scriptlet</tt>, which is also 
 * <b>normal</b>, then resolve those subclasses and start re-compilation processes from 
 * the static <tt>onLoad(JsApplet)</tt> method of that class. 
 */

public abstract class JsApplet extends Applet
{
	private static final long serialVersionUID = -581207089484628883L;

	/**
	 * <p>Internally initializes this Java applet.</p>
	 * <p>This method is <b>internal</b> and can only be called by JRE plugin at browser client.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	public final void init() {
		Js.init(org.jscripter.sim.client.Embeded.create(this));
	}

	/**
	 * <p>Internally destroys this Java applet.</p>
	 * <p>This method is <b>internal</b> and can only be called by JRE plugin at browser client.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	public final void destroy() {
		Js.destroy();
	}

	/**
	 * <p>Starts this Java applet.</p>
	 * <p>This method is <b>normal</b> but only expected to be called by JRE plugin at 
	 * browser client.</p>
	 * @since 1.0
	 */
	@Override
	public final void start() {
		synchronized(JsApplet.class) {
			onReady();
		}
	}

	/**
	 * <p>The entry point of the extended JS applet.</p>
	 * <p>The method is <b>normal</b> but not expected to be called. A concrete method 
	 * overriding this one is also <b>normal</b>, so we must write "normal" Java statements 
	 * to start the applet and re-compilation shall start its processing from there.</p>
	 * @since 1.0
	 * @javascript A Re-compiler must start the process from the concrete overriding method 
	 * in an extended JS applet and make an explicit invocation of it.
	 */
	public abstract void onReady();

	/**
	 * <p>Internally stops this Java applet.</p>
	 * <p>This method is <b>internal</b> and can only be called by JRE plugin at browser client.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	public final void stop() {
	}

	/**
	 * <p>Internally finalizes this Java applet.</p>
	 * <p>This method is <b>internal</b> and can only be called by JRE plugin at browser client.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	public final void finalize() {}
}
