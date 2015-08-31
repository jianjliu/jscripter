
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

package jsx.ui.event;

import js.Id;
import js.Initializer;
import jsx.Configurable;
import jsx.Source;
import jsx.ui.Component;
import jsx.ui.Widget;

/**
 * <p>An abstract type of high level events that may be fired from a source widget when 
 * the mouse has position data to report to the element wrapped by the widget.</p>
 * <p>This class is designed generic with the type parameter being the type of its 
 * corresponding listener type. A subclass must be concrete and final if it is to be an 
 * event type. As an event type, the subclass must also declare the type parameter of 
 * this class as the type of its own listener.</p>
 * <p>An event listener is typically of an interface with a declared method to react on 
 * the event it handles so that the class of the event can implement the {@link jsx.Source.Event#execute(Object)} 
 * method by simply calling that declared method passing the event itself as the argument. 
 * A subclass of this class defines events uniquely typed by the subclass itself and 
 * designates a listener type corresponding to that type of events.</p>
 * <p>For an event source to fire an event, the listener of the event must have been 
 * registered onto the source object with a call to the {@link Source#addListener(Class, Object)} 
 * method which asks both the type of the event and the listener object for arguments.</p>
 * <p>Note that, high level events are {@link Configurable}.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public abstract class Position<T> extends Widget.Event<T>
{
	/**
	 * <p>A global identifier for a configurable property of a {@link Position} object.</p>
	 * <p>The identified configurable property of a {@link Position} object 
	 * refers to an integer value specifying the X coordinate of the mouse position, 
	 * in pixels when the event is fired.</p>
	 * @since 1.0
	 */
	public final static Id<Number> X = new Id<Number>();
	/**
	 * <p>A global identifier for a configurable property of a {@link Position} object.</p>
	 * <p>The identified configurable property of a {@link Position} object 
	 * refers to an integer value specifying the Y coordinate of the mouse position, 
	 * in pixels when the event is fired.</p>
	 * @since 1.0
	 */
	public final static Id<Number> Y = new Id<Number>();

	/**
	 * <p>Constructs an event of this type.</p>
	 * <p>This constructor simply invokes the default constructor of the superclass and 
	 * sets its configurable property {@link jsx.ui.Widget.Event#TARGET} to the first 
	 * argument, {@link #X} to the second, and {@link #Y} to the third.</p>
	 * <p>Note that, this constructor does not change the configurable properties 
	 * {@link jsx.Source.Event#BUBBLE} and {@link jsx.Source.Event#UPDATE}.</p>
	 * @param target A related mouse target when this event is fired.
	 * @param x The X coordinate, in pixels,  of the mouse position.
	 * @param y The y coordinate, in pixels,  of the mouse position.
	 * @since 1.0
	 */
	protected Position(Component target, Number x, Number y) {
		super(new Initializer().set(TARGET, target)
				.set(X, x).set(Y, y).var());
	}
}
