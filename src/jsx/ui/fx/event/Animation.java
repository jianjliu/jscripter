
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

package jsx.ui.fx.event;

import js.Id;
import js.Initializer;
import js.Js;
import js.ObjectLike;
import jsx.ui.Widget;
import jsx.ui.event.Style;
import jsx.ui.fx.Effects;

/**
 * <p>A type of high level events that may be fired from a source widget when 
 * it is asked for a required animation or has finished an animation.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Animation extends Widget.Event<OnAnimation>
{
	/**
	 * <p>A global identifier for a configurable property of an {@link Animation} event.</p>
	 * <p>The identified configurable property of an {@link Animation} event 
	 * is a reference to a visual effects that how the animation animates.</p>
	 * @since 1.0
	 */
	public final static Id<Class<? extends Effects>> FX =
	                new Id<Class<? extends Effects>>();

	/**
	 * <p>Constructs an event of this type.</p>
	 * <p>This constructor simply invokes the default constructor of the superclass without 
	 * setting the configurable property {@link #FX}. The event constructed with this 
	 * constructor is expected to only be used as a notification of an animation.</p>
	 * <p>Note that, this constructor does not change the configurable properties 
	 * {@link jsx.Source.Event#BUBBLE} and {@link jsx.Source.Event#UPDATE} of this event object.</p>
	 * @since 1.0
	 */
	public Animation() {}

	/**
	 * <p>Constructs an event of this type.</p>
	 * <p>This constructor simply invokes the default constructor of the superclass and sets 
	 * the configurable property {@link #FX} of this event to the specified visual effects. 
	 * The event constructed with this constructor is expected to be used as an animation 
	 * command asking for a specific visual effects.</p>
	 * <p>Note that, this constructor does not change the configurable properties 
	 * {@link jsx.Source.Event#BUBBLE} and {@link jsx.Source.Event#UPDATE} of this event.</p>
	 * @param fx A visual effects object that defines what the animation does.
	 * @since 1.0
	 */
	public Animation(Class<? extends Effects> fx) {
		ini(this).var(FX, fx);
	}

	/**
	 * <p>Constructs an event of this type.</p>
	 * <p>This constructor simply invokes the default constructor of the superclass and sets 
	 * the configurable property {@link #FX} to the specified visual effects and {@link jsx.ui.event.Style#STYLE} 
	 * to the specified style object. The event constructed with this constructor is expected 
	 * to be used as an animation command asking for a specific visual effects and a critical 
	 * style the visual effects uses.</p>
	 * <p>Note that, this constructor does not change the configurable properties 
	 * {@link jsx.Source.Event#BUBBLE} and {@link jsx.Source.Event#UPDATE} of this event object.</p>
	 * @param fx A visual effects object that defines what the animation does.
	 * @param style A style object the visual effects wants.
	 * @since 1.0
	 */
	public Animation(Class<? extends Effects> fx, ObjectLike style) {
		this(fx);
		ini(this).var(
				Style.STYLE,
				Js.apply(
						new Initializer().var(),
						style
				)
		);
	}

	/**
	 * <p>Constructs an event of this type.</p>
	 * <p>This constructor simply invokes the default constructor of the superclass and sets 
	 * the configurable property {@link jsx.ui.event.Style#STYLE} to the specified style 
	 * object. The event constructed with this constructor is expected to be used as an 
	 * animation command sending to event listeners of this type with the critical style 
	 * object.</p>
	 * <p>Note that, this constructor does not change the configurable properties 
	 * {@link jsx.Source.Event#BUBBLE} and {@link jsx.Source.Event#UPDATE} of this event object.</p>
	 * @param style A style object the event listeners can use.
	 * @since 1.0
	 */
	public Animation(ObjectLike style) {
		this(null, style);
	}

	/**
	 * <p>Dispatches this event to the specified event listener to handle, by invoking the 
	 * handler method of the listener interface passing the event itself as the argument.</p>
	 * @param on The event listener that handles this event.
	 * @since 1.0
	 */
	@Override
	protected final void execute(OnAnimation on) {
		on.onEvent(this);
	}
}
