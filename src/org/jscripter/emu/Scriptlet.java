
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

package org.jscripter.emu;

import js.Function;
import js.Js;
import js.JsApplet;
import js.Ref;
import jsx.event.Handle;

/**
 * <p>An <tt>internal</tt> abstract class emulating {@link JsApplet} in JavaScript.</p>
 * <p>This class is only used internally by JS re-compiler implementations.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect resolution of {@link JsApplet} to this class.
 */
public abstract class Scriptlet
{
	/**
	 * <p>Prevents {@link JsApplet#init()} from resolution.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on resolving this method.
	 */
	public abstract void init();
	/**
	 * <p>Prevents {@link JsApplet#destroy()} from resolution.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on resolving this method.
	 */
	public abstract void destroy();
	/**
	 * <p>Prevents {@link JsApplet#start()} from resolution.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on resolving this method.
	 */
	public abstract void start();
	/**
	 * <p>Prevents {@link JsApplet#stop()} from resolution.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on resolving this method.
	 */
	public abstract void stop();
	/**
	 * <p>Prevents {@link JsApplet#onReady()} from resolution.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on resolving this method.
	 */
	public abstract void onReady();

	/**
	 * <p>Application entry point.</p>
	 * @param app A {@link JsApplet} object.
	 * @since 1.0
	 * @javascript Re-compilers must get browsers run the codes of this method immediately after 
	 * loading the document.
	 */
	public static final void onLoad(final JsApplet app) {
		final Ref<Handle> h = new Ref<Handle>(null);
		h.value = new Handle(
				Js.win(),
				"load",
				new Function<Void>() {
					@Override
					protected Void function(Object jsthis, Call<Void> callee) {
						app.onReady();
						h.value.detach();
						return null;
					}
				}.var(),
				false
		);
		h.value.attach();
	}
}
