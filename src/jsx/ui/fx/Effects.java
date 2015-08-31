
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

import js.Id;
import js.Initializer;
import js.Js;
import js.ObjectLike;
import js.Ref;
import jsx.Interval;
import jsx.core.Variables;
import jsx.motion.Motion;
import jsx.motion.reg.Uniform;
import jsx.ui.Component;
import jsx.ui.Widget;
import jsx.ui.fx.event.Animation;
import jsx.ui.fx.event.OnAnimation;

/**
 * <p>An abstract base class for widgets providing visual effects abilities to
 * the underlying components.</p>
 * <p>Note that an {@link Effects} is a {@link Widget} that listens to the underlying
 * component for {@link Animation} events.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public abstract class Effects extends Widget implements OnAnimation
{
	/**
	 * <p>A global identifier for a configurable property of a {@link Effects} widget.</p>
	 * <p>The identified configurable property of a {@link Effects} widget is a reference 
	 * to an integer number that defines the total discrete but successive frames for 
	 * animation.</p>
	 * @since 1.0
	 */
	public final static Id<Integer> FRAMES = new Id<Integer>();
	/**
	 * <p>A global identifier for a configurable property of a {@link Effects} widget.</p>
	 * <p>The identified configurable property of a {@link Effects} widget is a reference 
	 * to an integer number that defines the total duration of an animation in milliseconds.</p>
	 * @since 1.0
	 */
	public final static Id<Integer> PERIOD = new Id<Integer>();
	/**
	 * <p>A global identifier for a configurable property of a {@link Effects} widget.</p>
	 * <p>The identified configurable property of a {@link Effects} widget is a reference 
	 * to a {@link Motion} object that defines the motion features for animation.</p>
	 * @since 1.0
	 */
	public final static Id<Motion>  MOTION = new Id<Motion>();

	/**
	 * <p>Typically constructs a effects widget.</p>
	 * <p>This constructor invokes super constructor and configures the widget.</p>
	 * @param ini A configuring object.
	 * @since 1.0
	 */
	protected Effects(ObjectLike ini) {
		super(ini);
		unwrap().addListener(Animation.class, this);
		if (Variables.undefined(getPeriod(this))) {
			ini(this).var(PERIOD, 1000);
		}
		if (Variables.undefined(getFrames(this))) {
			ini(this).var(FRAMES, getPeriod(this) * 50 / 1000 + 1);
		}
		if (Js.not(getMotion(this))) {
			ini(this).var(MOTION, new Uniform());
		}
		getMotion(this).init(getFrames(this));
		unwrap().addListener(Animation.class, this);
	}

	/**
	 * <p>Constructs a effects widget over a component.</p>
	 * <p>This constructor invokes {@link #Effects(ObjectLike)} with the given
	 * component configured.</p>
	 * @param e A component to have the visual effects.
	 * @since 1.0
	 */
	protected Effects(Component e) {
		this(new Initializer().set(COMPONENT, e).var());
	}

	/**
	 * <p>Returns the total frames defined with a visual effects widget.</p>
	 * <p>This method simply return the value of the {@link #FRAMES} property of 
	 * the widget.</p>
	 * @param fx A visual effects widget.
	 * @return The number of the total frames.
	 * @since 1.0
	 */
	public static final Integer getFrames(Effects fx) {
		return ini(fx).var(FRAMES);
	}

	/**
	 * <p>Returns the duration in milliseconds defined with a visual effects widget.</p>
	 * <p>This method simply return the value of the {@link #PERIOD} property of 
	 * the widget.</p>
	 * @param fx A visual effects widget.
	 * @return The milliseconds of duration.
	 * @since 1.0
	 */
	public static final Integer getPeriod(Effects fx) {
		return ini(fx).var(PERIOD);
	}

	/**
	 * <p>Returns the {@link Motion} object defined with a visual effects widget.</p>
	 * <p>This method simply return the value of the {@link #MOTION} property of 
	 * the widget.</p>
	 * @param fx A visual effects widget.
	 * @return The {@link Motion} object.
	 * @since 1.0
	 */
	public static final Motion getMotion(Effects fx) {
		return ini(fx).var(MOTION);
	}

	/**
	 * <p>Defines an action for the given frame.</p>
	 * @param i An index of the current frame ranging from 0 and the total number 
	 * of frames obtained by {@link #getFrames(Effects)}.
	 * @since 1.0
	 */
	protected abstract void frame(int i);

	/**
	 * <p>Finishes an animation with a given style object applied to the widget.</p>
	 * <p>Subclasses overrides or invokes this method to provide different visual effects.</p>
	 * @param style The final style of the widget.
	 * @since 1.0
	 */
	protected void stop(ObjectLike style) {
		if (Js.be(style)) {
			Component.applyStyle(unwrap(), style);
		}
	}

	/**
	 * <p>Animates the widget with a given final style.</p>
	 * <p>Subclasses overrides or invokes this method to provide different visual effects.</p>
	 * @param style The final style of the widget.
	 * @since 1.0
	 */
	protected final void animate(final ObjectLike style) {
		final Ref<Integer> fid = new Ref<Integer>(0);
		new Interval() {
			@Override
			public void run() {
				frame(fid.value);
				if (fid.value >= getFrames(Effects.this)) {
					stop(style);
					clear();
				}
				fid.value += 1;
			}
		}.set(getPeriod(this) / getFrames(this));
	}
}
