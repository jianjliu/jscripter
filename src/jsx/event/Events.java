
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

package jsx.event;

import js.*;
import js.user.*;
import jsx.client.Browser;
import jsx.client.Win;
import jsx.dom.Nodes;

/**
 * <p>A utility class with its static methods providing facilities to access DOM events 
 * related information eliminating browser dependencies.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Events extends Disposable
{
	private Events() {}

	/**
	 * <p>Returns a copy of a browser event object.</p>
	 * @param e The original browser event object.
	 * @return A copy of the event object for IE or the event object itself for other browsers.
	 * @see jsx.dom.Nodes#copy
	 * @since 1.0
	 */
	public static final JsEvent copyEvent(JsEvent e) {
		return !Browser.isIE ? e :
				new JsEvent(
						Nodes.copy.var().call(JsWindow.event.with(Js.core()))
				);
	}

	/**
	 * <p>Dispatches a browser event object.</p>
	 * @param elm The element to fire a browser event.
	 * @param evt The browser event being dispatched from the element.
	 * @see JsElement#fireEvent(JsEvent)
	 * @see JsElement#dispatchEvent(JsEvent)
	 * @since 1.0
	 */
	public final static void fireEvent(JsElement elm, JsEvent evt) {
		if (Browser.isIE) {
			elm.fireEvent(evt);
		} else {
			elm.dispatchEvent(evt);
		}
	}

	/**
	 * <p>Gets the HTML element that originally fires the given browser event object.</p>
	 * @param e A browser event object.
	 * @return The HTML element related.
	 * @see JsEvent#srcElement
	 * @see JsEvent#target
	 * @since 1.0
	 */
	public final static JsHTMLElement srcElement(JsEvent e) {
		return Browser.isIE ?
				new JsHTMLElement(JsEvent.srcElement .with(e)) :
				new JsHTMLElement(JsMouseEvent.target.with(e));
	}

	/**
	 * <p>Gets the related source element when the given browser event is fired.</p>
	 * @param e A browser event object.
	 * @return The HTML element related.
	 * @see JsEvent#fromElement
	 * @see JsMouseEvent#relatedTarget
	 * @since 1.0
	 */
	public final static JsHTMLElement fromElement(JsEvent e) {
		return Browser.isIE ?
				new JsHTMLElement(JsMouseEvent.fromElement  .with(e)) :
				new JsHTMLElement(JsMouseEvent.relatedTarget.with(e));
	}

	/**
	 * <p>Gets the related target element when the given browser event is fired.</p>
	 * @param e A browser event object.
	 * @return The HTML element related.
	 * @see JsEvent#toElement
	 * @see JsMouseEvent#relatedTarget
	 * @since 1.0
	 */
	public final static JsHTMLElement toElement(JsEvent e) {
		return Browser.isIE ?
				new JsHTMLElement(JsMouseEvent.toElement    .with(e)) :
				new JsHTMLElement(JsMouseEvent.relatedTarget.with(e));
	}

	/**
	 * <p>Gets {@link JsEvent#clientX} of the given browser event.</p>
	 * @param e A browser event object.
	 * @return The value of the property.
	 * @see #clientY(JsEvent)
	 * @see JsEvent#clientX
	 * @since 1.0
	 */
	public final static Number clientX(JsEvent e) {
		return JsEvent.clientX.with(e);
	}
	/**
	 * <p>Gets {@link JsEvent#clientY} of the given browser event.</p>
	 * @param e A browser event object.
	 * @return The value of the property.
	 * @see #clientX(JsEvent)
	 * @see JsEvent#clientY
	 * @since 1.0
	 */
	public final static Number clientY(JsEvent e) {
		return JsEvent.clientY.with(e);
	}
	/**
	 * <p>Gets {@link JsEvent#pageX} of the given browser event.</p>
	 * @param e A browser event object.
	 * @return The value of the property.
	 * @see #pageY(JsEvent)
	 * @see JsEvent#pageX
	 * @since 1.0
	 */
	public final static Number pageX(JsEvent e) {
		Number x = JsEvent.pageX.with(e);
		return Js.undefined(x) ? clientX(e).doubleValue() + Win.scrollLeft().doubleValue() : x;
	}
	/**
	 * <p>Gets {@link JsEvent#pageY} of the given browser event.</p>
	 * @param e A browser event object.
	 * @return The value of the property.
	 * @see #pageX(JsEvent)
	 * @see JsEvent#pageY
	 * @since 1.0
	 */
	public final static Number pageY(JsEvent e) {
		Number y = JsEvent.pageY.with(e);
		return Js.undefined(y) ? clientY(e).doubleValue() + Win.scrollTop().doubleValue() : y;
	}
	/**
	 * <p>Sets the mouse capture to the object belonging to the current document if relevant.</p>
	 * <p>Note that this method is browser-independent in that it simply calls {@link JsNode#setCapture()} 
	 * at the given node object on IE browsers or does nothing on others.</p>
	 * @param o A node object.
	 * @see JsNode#setCapture()
	 * @since 1.0
	 */
	public final static void setCapture(JsNode o) {
		if (Browser.isIE) {
			o.setCapture();
		}
	}
	/**
	 * <p>Removes mouse capture from the object in the current document if relevant.</p>
	 * <p>Note that this method is browser-independent in that it simply calls {@link JsNode#setCapture()} 
	 * at the given node object on IE browsers or does nothing on others.</p>
	 * @param o A node object.
	 * @see JsNode#releaseCapture()
	 * @since 1.0
	 */
	public final static void releaseCapture(JsNode o) {
		if (Browser.isIE) {
			o.releaseCapture();
		}
	}

	/**
	 * <p>Determines whether a browser event comes from the left mouse button, eliminating 
	 * the browser dependencies.</p>
	 * @param e A browser event.
	 * @return <tt>true</tt> if the event was fired by the left mouse button; 
	 * <tt>false</tt>, otherwise.
	 * @see JsMouseEvent#button
	 * @since 1.0
	 */
	public static final boolean fromLeftButton(JsEvent e) {
		Number n = JsMouseEvent.button.with(e);
		return n != null && ((Browser.isIE || Browser.isWebKit) &&
				Js.eq(n, 1) || Js.eq(n, 0));
	}

	/**
	 * <p>Stops a browser event from propagating any further through the capturing, target, or 
	 * bubbling phases of event propagation.</p>
	 * <p>This method simply set {@link JsEvent#cancelBubble} of the event object to <tt>true</tt> on 
	 * IE or calls {@link JsEvent#stopPropagation()} at the event object on other web browsers.</p>
	 * @param e A browser event.
	 * @see #preventDefault(JsEvent)
	 * @see #stop(JsEvent)
	 * @see JsEvent#stopPropagation()
	 * @see JsEvent#cancelBubble
	 * @since 1.0
	 */
	public static final void stopPropagation(JsEvent e) {
		if (Browser.isIE) {
			e.var(JsEvent.cancelBubble, true);
		} else {
			e.stopPropagation();
		}
	}

	/**
	 * <p>Tells the web browser not to perform the default action associated with the given 
	 * event, if there is one.</p>
	 * <p>This method simply set {@link JsEvent#returnValue} of the event object to <tt>false</tt> on 
	 * IE or calls {@link JsEvent#preventDefault()} at the event object on other web browsers.</p>
	 * @param e A browser event.
	 * @see #stopPropagation(JsEvent)
	 * @see #stop(JsEvent)
	 * @see JsEvent#preventDefault()
	 * @see JsEvent#returnValue
	 * @since 1.0
	 */
	public static final void preventDefault(JsEvent e) {
		if (Browser.isIE) {
			e.var(JsEvent.returnValue, false);
		} else {
			e.preventDefault();
		}
	}

	/**
	 * <p>Stops a browser event from propagating any further through the capturing, target, or 
	 * bubbling phases of event propagation and tells the web browser not to perform the default 
	 * action associated with the given event, if there is one.</p>
	 * <p>This method simply calls the {@link #stopPropagation(JsEvent)} and 
	 * {@link #preventDefault(JsEvent)} methods with the same browser event object.</p>
	 * @param e A browser event.
	 * @see #preventDefault(JsEvent)
	 * @see #stopPropagation(JsEvent)
	 * @see JsEvent#stopPropagation()
	 * @see JsEvent#cancelBubble
	 * @since 1.0
	 */
	public static final void stop(JsEvent e) {
		stopPropagation(e);
		preventDefault(e);
	}
}
