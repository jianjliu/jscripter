
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

package jsx.ui.fx;

import js.Js;
import js.JsApplet;
import js.ObjectLike;
import jsx.dom.Styles;
import jsx.ui.Component;
import jsx.ui.event.Style;
import jsx.ui.fx.event.Animation;

/**
 * <p>A base class for widgets providing fade-out effects to their components.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class FadeOut extends Effects
{
	private double t;

	/**
	 * <p>Constructs a fade-out effects over a component.</p>
	 * <p>This constructor simply invokes its super constructor with the component
	 * as argument.</p>
	 * @param e A component to have the visual effects.
	 * @since 1.0
	 */
	public FadeOut(Component e) {
		super(e);
	}

	/**
	 * <p>Defines an action for the given frame.</p>
	 * <p>This method changes the transparency of the widget.</p>
	 * @param i An index of the current frame ranging from 0 and the total number 
	 * of frames obtained by {@link #getFrames(Effects)}.
	 * @since 1.0
	 */
	@Override
	protected void frame(int i) {
		Component.transparency(
				unwrap(),
				getMotion(this).get(i) * t
		);
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method animates the widget with fade-out effects.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(Animation evt) {
		Class<? extends Effects> fx = ini(evt).var(Animation.FX);
		if (Js.not(fx) || fx == FadeOut.class) {
			ObjectLike style = ini(evt).var(Style.STYLE);
			t = Js.be(style) ? Styles.transparency(style) : 0;
			if (Js.not(fx)) {
				style = null;
			}
			animate(style);
		}
	}

	/**
	 * <p>Animates a component with fade-out effects.</p>
	 * @param e A component to fade out.
	 * @param p A final style to the component.
	 * @since 1.0
	 */
	public static final void animate(Component e, ObjectLike p) {
		synchronized(JsApplet.class) {
			FadeOut fo = new FadeOut(e);
			fo.exec(new Animation(FadeOut.class, p));
			e.removeListener(Animation.class, fo);
		}
	}
}
