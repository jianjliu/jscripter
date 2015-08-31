
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

package jsx.ui;

import js.Function;
import js.Id;
import js.Initializer;
import js.Js;
import js.ObjectLike;
import js.Static;
import js.Var;
import jsx.TaskManager;
import jsx.client.Browser;
import jsx.client.Win;
import jsx.dom.Elements;
import jsx.dom.Styles;
import jsx.event.Handle;
import jsx.ui.event.OnResize;
import jsx.ui.event.Resize;
import jsx.ui.event.Style;

/**
 * <p>Defines the view port of the current HTML document.</p>
 * <p>A view port is a {@link Box} that fits the HTML <tt>&lt;body&gt;</tt> element.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Viewport extends Box<Widget>
{
	/**
	 * <p>Gets the view port of the current HTML document.</p>
	 * @return The view port. If it does not exist, creates one and returns 
	 * it.
	 * @since 1.0
	 */
	public static final Viewport get() {
		return SINGLETON.var();
	}

	/**
	 * <p>Hides <tt>overflow</tt> of the underlying HTML element of the view port.</p>
	 * <p>If running in JS Simulation mode and IE, this method sets the <tt>overflow</tt> 
	 * style of the underlying HTML element of the view port to "hidden". 
	 * It is useful to remove the right scroll bar of the browser window for IE.</p>
	 * @since 1.0
	 */
	public static final void hideOverflow() {
		if (!Js.debug() || Browser.canInsertHTML) {
			ObjectLike p = new Initializer().var();
			Styles.overflow(p, "hidden");
			Elements.applyStyle(
					Component.getHTMLElement(get().unwrap()),
					p
			); 
		}
	}

	private static Var<Viewport> SINGLETON = new Static<Viewport>(
			new Var<Viewport>() {
				@Override
				public Viewport var() {
					return new Viewport(Component.body());
				}
			}
	);

	private Viewport(final Component e) {
		super(e);
	}

	private static class View extends Container implements OnResize
	{
		private View(Component e) {
			super(e);
			fit(e);
			addListener(Resize.class, this);
			new Handle(
					Js.win(),
					"resize",
					new Function<Void>() {
						@Override
						protected Void function(Object jsthis, Call<Void> callee) {
							fire(new Resize(), DISPATCHER.var());
							return null;
						}
					}.var(),
					false
			).attach();
		}

		public void onEvent(Resize evt) {
			fit(unwrap());
			unwrap().exec(new Style());
		}

		private final static Var<TaskManager> DISPATCHER = new Static<TaskManager>(
				new Var<TaskManager>() {
					@Override
					public TaskManager var() {
						return new TaskManager();
					}
				}
		);

		private static final void fit(Component e) {
			ObjectLike p = new Initializer().var();
			Styles.width (p, Styles.px(Win.clientWidth ()));
			Styles.height(p, Styles.px(Win.clientHeight()));
			Component.applyStyle(e, p);
		}
	}

	private final static Id<Container> VIEW = new Id<Container>();

	/**
	 * <p>Gets the container for the system view port.</p>
	 * @return The container for the system view port.
	 * @since 1.0
	 */
	public final Container getContainer() {
		Container v = ini(this).var(VIEW);
		if (Js.not(v)) {
			Component c = Component.div();
			Component.appendChild(unwrap(), c);
			v = new View(c);
			ini(this).var(VIEW, v);
		}
		return v;
	}
}
