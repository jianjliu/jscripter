
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

package jsx.client;

import js.*;
import js.core.*;
import js.user.*;

/**
 * <p>A utility class accessing the functions of JavaScript with a full client-side support.</p>
 * <p>Users are encouraged to use the utilities provided in this class instead of the 
 * <b>opaque</b> methods of the {@link js.core.JsGlobal}, {@link js.user.JsWindow} or 
 * {@link js.user.JsWin} classes in consideration of the reuse benefit for re-compilation 
 * results.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Win extends Client
{
	private Win() {}

	/**
	 * <p>Displays a simple message in a dialog box.</p>
	 * <p>In JavaScript, this method displays the specified <tt>message</tt> to the 
	 * user in a dialog box. The dialog box contains an OK button the user can click to 
	 * dismiss it. The dialog box is typically modal, and the call to this function 
	 * typically blocks until the dialog is dismissed.</p>
	 * <p>Perhaps the most common use of this method is to display error messages when the 
	 * user's input to some form element is invalid in some way. The alert dialog box can 
	 * inform the user of the problem and explain what needs to be corrected to avoid the 
	 * problem in the future</p>
	 * <p>The appearance of the dialog box is platform-dependent, but it generally contains 
	 * graphics that indicate an error, warning, or alert message of some kind. While it can 
	 * display any desired message, the alert graphics of the dialog box mean that this 
	 * method is not appropriate for simple informational messages like "Welcome to my blog"</p>
	 * <p>Note that the <tt>message</tt> displayed in the dialog box is a string of 
	 * plain text, not formatted HTML. You can use the newline character "\n" in your strings 
	 * to break your message across multiple lines. You can also do some rudimentary 
	 * formatting using spaces and can approximate horizontal rules with underscore characters, 
	 * but the results depend greatly on the font used in the dialog box and thus are 
	 * system-dependent.</p>
	 * @param message The plain-text (not HTML) string to display in a dialog box popped up 
	 * over the current window.
	 * @since 1.0
	 * @see Js#alert(Object)
	 * @see Global#alert(Object)
	 * @see JsWindow#alert(Object)
	 */
	public static final void alert(Object message) {
		Js.win().alert(message);
	}
	/**
	 * <p>Asks a yes-or-no question with a dialog box.</p>
	 * <p>In JavaScript, this method displays the specified question in a dialog box. The 
	 * dialog box contains OK and Cancel buttons that the user can use to answer the 
	 * question. If the user clicks the OK button, it returns <tt>true</tt>. If the 
	 * user clicks Cancel, it returns <tt>false</tt>.</p>
	 * <p>The dialog box that is displayed by the this method is modal. That is, it blocks 
	 * all user input to the main browser window until the user dismisses the dialog box 
	 * by clicking on the OK or Cancel buttons. Since this method returns a value depending 
	 * on the user's response to the dialog box, JavaScript execution pauses in the call to 
	 * this method, and subsequent statements are not executed until the user responds to 
	 * the dialog box.</p>
	 * <p>There is no way to change the labels that appear in the buttons of the dialog box 
	 * (to make them read Yes and No, for example). Therefore, you should take care to 
	 * phrase your question or message so that OK and Cancel are suitable responses.</p>
	 * @param question The plain-text (not HTML) string to be displayed in the dialog box. 
	 * It should generally express a question you want the user to answer.
	 * @return <tt>true</tt> if the user clicks the OK button; <tt>false</tt> if 
	 * the user clicks the Cancel button.
	 * @since 1.0
	 * @see Js#confirm(Object)
	 * @see Global#confirm(Object)
	 * @see JsWindow#confirm(Object)
	 */
	public static final boolean confirm(Object question) {
		return Js.win().confirm(question);
	}
	/**
	 * <p>Asks for simple string input with a dialog box.</p>
	 * <p>This method displays text input field and OK and Cancel buttons in a dialog box. 
	 * Platform-dependent graphics in the dialog box help indicate to the user that an 
	 * input is desired.</p>
	 * <p>If the user clicks the Cancel button, the method returns <tt>null</tt>. If 
	 * the user clicks the OK button, it returns the text currently displayed in the 
	 * input field.</p>
	 * <p>The dialog box that is displayed by this method is modal. That is, it blocks all 
	 * user input to the main browser window until the user dismisses the dialog box by 
	 * clicking on the OK or Cancel buttons. Since this method returns a value depending 
	 * on the user's response to the dialog box, JavaScript execution pauses in the call 
	 * to this method, and subsequent statements are not executed until the user responds 
	 * to the dialog box.</p>
	 * @param message The plain-text (not HTML) string to be displayed in the dialog box. 
	 * It should ask the user to enter the information you want.
	 * @return The string entered by the user, the empty string if the user did not enter 
	 * a string, or <tt>null</tt> if the user clicked Cancel.
	 * @since 1.0
	 * @see #prompt(Object, Object)
	 * @see Js#prompt(Object)
	 * @see Global#prompt(Object)
	 * @see JsWindow#prompt(Object)
	 */
	public static final String prompt(Object message) {
		return Js.win().prompt(message);
	}
	/**
	 * <p>Asks for simple string input with a dialog box.</p>
	 * <p>This method displays the specified message in a dialog box that also contains a 
	 * text input field and OK and Cancel buttons. Platform-dependent graphics in the 
	 * dialog box help indicate to the user that an input is desired.</p>
	 * <p>If the user clicks the Cancel button, the method returns <tt>null</tt>. If 
	 * the user clicks the OK button, it returns the text currently displayed in the 
	 * input field.</p>
	 * <p>The dialog box that is displayed by this method is modal. That is, it blocks all 
	 * user input to the main browser window until the user dismisses the dialog box by 
	 * clicking on the OK or Cancel buttons. Since this method returns a value depending 
	 * on the user's response to the dialog box, JavaScript execution pauses in the call 
	 * to this method, and subsequent statements are not executed until the user responds 
	 * to the dialog box.</p>
	 * @param message The plain-text (not HTML) string to be displayed in the dialog box. 
	 * It should ask the user to enter the information you want.
	 * @param defaultInput A string that is displayed as the default input in the dialog 
	 * box. Pass the empty string ("") to make the method display an empty input box.
	 * @return The string entered by the user, the empty string if the user did not enter 
	 * a string, or <tt>null</tt> if the user clicked Cancel.
	 * @since 1.0
	 * @see #prompt(Object)
	 * @see Js#prompt(Object, Object)
	 * @see Global#prompt(Object, Object)
	 * @see JsWindow#prompt(Object, Object)
	 */
	public static final String prompt(Object message, Object defaultInput) {
		return Js.win().prompt(message, defaultInput);
	}
	/**
	 * <p>Cancels periodic execution of code.</p>
	 * <p>This method stops the repeated execution of code that was started by a call to 
	 * {@link #setInterval(JsFunction, Object)}. <tt>intervalId</tt> must be the value 
	 * that was returned by a call to {@link #setInterval(JsFunction, Object)}.</p>
	 * @param intervalId The value returned by the corresponding call to {@link #setInterval(JsFunction, Object)}.
	 * @since 1.0
	 * @see #setInterval(JsFunction, Object)
	 * @see Js#clearInterval(Object)
	 * @see Global#clearInterval(Object)
	 * @see JsWindow#clearInterval(Object)
	 * @see jsx.Interval
	 */
	public static final void clearInterval(Object intervalId) {
		Js.win().clearInterval(intervalId);
	}
	/**
	 * <p>Cancels a pending timeout operation.</p>
	 * <p>This method cancels the execution of code that has been deferred with the 
	 * {@link #setTimeout(JsFunction, Object)} method. The <tt>timeoutId</tt> argument 
	 * is a value returned by the call to {@link #setTimeout(JsFunction, Object)} and 
	 * identifies which deferred code to cancel.</p>
	 * @param timeoutId A value returned by {@link #setTimeout(JsFunction, Object)} that 
	 * identifies the timeout to be canceled.
	 * @since 1.0
	 * @see #clearTimeout(Object)
	 * @see Js#clearTimeout(Object)
	 * @see Global#clearTimeout(Object)
	 * @see JsWindow#clearTimeout(Object)
	 * @see jsx.Timeout
	 */
	public static final void clearTimeout(Object timeoutId ) {
		Js.win().clearTimeout(timeoutId);
	}
	/**
	 * <p>Executes code at periodic intervals.</p>
	 * <p>Note that the specified function is executed in the context of the Window object, 
	 * that is, the Window object is the value of the <tt>this</tt> keyword of the 
	 * executing context of the function. This is <tt>true</tt> even if the call to 
	 * {@link #setTimeout(JsFunction, Object)} occurred within a function with a longer 
	 * scope chain.</p>
	 * @param f A function to be periodically invoked.
	 * @param interval The interval, in milliseconds, between invocations of the function.
	 * @return A value that can be passed to {@link #clearInterval(Object)} method to 
	 * cancel the periodic execution of the function.
	 * @since 1.0
	 * @see #clearInterval(Object)
	 * @see Js#setInterval(JsFunction, Number)
	 * @see Global#setInterval(JsFunction)
	 * @see Global#setInterval(JsFunction, Number)
	 * @see JsWindow#setInterval(JsFunction, Object)
	 * @see jsx.Interval
	 */
	public static final Object setInterval(JsFunction<?> f, Object interval) {
		return Js.win().setInterval(f, interval);
	}
	/**
	 * <p>Executes code at periodic intervals.</p>
	 * <p>Note that the specified function is executed in the context of the Window object, 
	 * that is, the Window object is the value of the <tt>this</tt> keyword of the 
	 * executing context of the function. This is <tt>true</tt> even if the call to 
	 * {@link #setTimeout(JsFunction, Number)} occurred within a function with a longer 
	 * scope chain.</p>
	 * @param f A function to be periodically invoked.
	 * @return A value that can be passed to {@link #clearInterval(Object)} method to 
	 * cancel the periodic execution of the function.
	 * @since 1.0
	 * @see #setInterval(JsFunction, Number)
	 * @see #clearInterval(Object)
	 * @see Js#setInterval(JsFunction)
	 * @see Js#setInterval(JsFunction, Number)
	 * @see Global#setInterval(JsFunction)
	 * @see Global#setInterval(JsFunction, Number)
	 * @see JsWindow#setInterval(JsFunction, Object)
	 * @see jsx.Interval
	 */
	public static final Object setInterval(JsFunction<?> f) {
		return Js.win().setInterval(f, 1);
	}
	/**
	 * <p>Executes code after a specified amount of time elapses.</p>
	 * <p>Note that this method executes the specified function only once. The function is 
	 * executed in the context of the Window object, that is, the Window object is the 
	 * value of the <tt>this</tt> keyword of the executing context of the function. 
	 * This is <tt>true</tt> even if the call to {@link #setTimeout(JsFunction, Object)} 
	 * occurred within a function with a longer scope chain.</p>
	 * @param f A function to be invoked after the <tt>delay</tt> has elapsed.
	 * @param delay The amount of time, in milliseconds, before the function should be executed.
	 * @return A value that can be passed to the {@link #clearTimeout(Object)} method to 
	 * cancel the execution of the function.
	 * @since 1.0
	 * @see #clearTimeout(Object)
	 * @see Js#setTimeout(JsFunction, Number)
	 * @see Global#setTimeout(JsFunction)
	 * @see Global#setTimeout(JsFunction, Number)
	 * @see JsWindow#setTimeout(JsFunction, Object)
	 * @see jsx.Timeout
	 */
	public static final Object setTimeout(JsFunction<?> f, Object delay) {
		return Js.win().setTimeout(f, delay);
	}
	/**
	 * <p>Executes code after an amount of time elapses, 
	 * simulating the JavaScript global function of the same name.</p>
	 * <p>Note that this method executes the specified function only once. The function is 
	 * executed in the context of the Window object, that is, the Window object is the 
	 * value of the <tt>this</tt> keyword of the executing context of the function. 
	 * This is <tt>true</tt> even if the call to {@link #setTimeout(JsFunction, Number)} 
	 * occurred within a function with a longer scope chain.</p>
	 * @param f A function to be invoked after the <tt>delay</tt> has elapsed.
	 * @return A value that can be passed to the {@link #clearTimeout(Object)} method to 
	 * cancel the execution of the function.
	 * @since 1.0
	 * @see #setTimeout(JsFunction, Object)
	 * @see #clearTimeout(Object)
	 * @see Js#setTimeout(JsFunction)
	 * @see Js#setTimeout(JsFunction, Number)
	 * @see Global#setTimeout(JsFunction)
	 * @see Global#setTimeout(JsFunction, Number)
	 * @see JsWindow#setTimeout(JsFunction, Object)
	 * @see jsx.Timeout
	 */
	public static final Object setTimeout(JsFunction<?> f) {
		return Js.win().setTimeout(f, 1);
	}
	/**
	 * <p>Adds an event handler function to the set of event handlers for the current {@link JsWindow#window} object. 
	 * This is a DOM-standard method supported by all modern browsers except IE.</p>
	 * <p>This method adds the specified event <tt>listener</tt> function to the set of 
	 * listeners registered on this node to handle events of the specified <tt>type</tt>. 
	 * If <tt>useCapture</tt> is <tt>true</tt>, the <tt>listener</tt> is registered as 
	 * a capturing event listener. If <tt>useCapture</tt> is <tt>false</tt>, it is 
	 * registered as a normal event listener.</p>
	 * <p>This method may be called multiple times to register multiple event handlers 
	 * for the same type of event on the same node. Note, however, that the DOM 
	 * Specification makes no guarantees about the order in which multiple event handlers 
	 * are invoked.</p>
	 * <p>If the same event listener function is registered twice on the same node with 
	 * the same <tt>type</tt> and <tt>useCapture</tt> arguments, the second registration 
	 * is simply ignored. If a new event listener is registered on this node while an 
	 * event is being handled at this node, the new event listener is not invoked for 
	 * that event.</p>
	 * <p>When a node is duplicated with {@link JsNode#cloneNode(Boolean)} or {@link JsDocument#importNode(JsNode, Boolean)}, 
	 * the event listeners registered for the original node are not copied.</p>
	 * <p>The same method is also defined by, and works analogously on, the {@link JsElement} 
	 * and {@link JsWindow} objects</p>
	 * @param type The type of event for which the event listener is to be invoked.
	 * @param listener The event listener function that is invoked when an event of the 
	 * specified type is dispatched to this node. When invoked, the listener function 
	 * is passed an {@link JsEvent} object and is invoked as a method of the node on 
	 * which it is registered.
	 * @param useCapture If <tt>true</tt>, the specified <tt>listener</tt> is to be 
	 * invoked only during the capturing phase of event propagation. The more common 
	 * value of <tt>false</tt> means that the <tt>listener</tt> is not invoked during 
	 * the capturing phase but instead is invoked when this node is the actual event 
	 * target or when the event bubbles up to this node from its original target.
	 * @since 1.0
	 * @see #attachEvent(String, JsFunction)
	 * @see #removeEventListener(String, JsFunction, Boolean)
	 * @see JsWindow#addEventListener(String, JsFunction, Boolean)
	 * @see Document#addEventListener(String, JsFunction, Boolean)
	 * @see JsDocument#addEventListener(String, JsFunction, Boolean)
	 * @see JsElement#addEventListener(String, JsFunction, Boolean)
	 */
	public static final void addEventListener(String type, JsFunction<?> listener, Boolean useCapture) {
		Js.win().addEventListener(type, listener, useCapture);
	}
	/**
	 * <p>Removes an event handler function from the set of handlers for the current {@link JsWindow#window} object. 
	 * This is a standard DOM method implemented by all modern browsers except IE.</p>
	 * <p>This method removes the specified event <tt>listener</tt> function. The <tt>type</tt> 
	 * and <tt>useCapture</tt> arguments must be the same as they are in the 
	 * corresponding call to {@link #addEventListener(String, JsFunction, Boolean)}. If 
	 * no event listener is found that matches the specified arguments, this method does 
	 * nothing.</p>
	 * <p>Once an event <tt>listener</tt> function has been removed by this method, it 
	 * will no longer be invoked for the specified <tt>type</tt> of event on this node. 
	 * This is true even if the event <tt>listener</tt> is removed by another event 
	 * listener registered for the same type of event on the same node.</p>
	 * <p>The same method is also defined by, and works analogously on, the {@link JsElement} 
	 * and {@link JsWindow} objects</p>
	 * @param type The type of event for which the event listener is to be deleted.
	 * @param listener The event listener function that is to be removed.
	 * @param useCapture <tt>true</tt> if a capturing event listener is to be removed; 
	 * <tt>false</tt> if a normal event listener is to be removed.
	 * @since 1.0
	 * @see #detachEvent(String, JsFunction)
	 * @see #addEventListener(String, JsFunction, Boolean)
	 * @see JsWindow#removeEventListener(String, JsFunction, Boolean)
	 * @see Document#removeEventListener(String, JsFunction, Boolean)
	 * @see JsDocument#removeEventListener(String, JsFunction, Boolean)
	 * @see JsElement#removeEventListener(String, JsFunction, Boolean)
	 */
	public static final void removeEventListener(String type, JsFunction<?> listener, Boolean useCapture) {
		Js.win().removeEventListener(type, listener, useCapture);
	}
	/**
	 * <p>Adds an event handler function to the set of handlers for the current {@link JsWindow#window} object. 
	 * This is the IE-specific alternative to {@link #addEventListener(String, JsFunction, Boolean)}.</p>
	 * <p>This method is an IE-specific event registration method. It serves the same 
	 * purpose as the standard {@link #addEventListener(String, JsFunction, Boolean)} 
	 * method, which IE does not support, but is different from that function in several 
	 * important ways:
	 * <ul>
	 * <li>Since the IE event model does not support event capturing, this method and 
	 * {@link #detachEvent(String, JsFunction)} expect only two arguments: the event 
	 * type and the handler function.</li>
	 * <li>The event handler names passed to the IE methods should include the "on" 
	 * prefix.</li>
	 * <li>Functions registered with this method are invoked with no {@link JsEvent} 
	 * object argument. Instead, they must read the {@link JsWindow#event} property of 
	 * the {@link JsWindow#window} object.</li>
	 * <li>Functions registered with this method are invoked as global functions, rather 
	 * than as methods of the node on which the event occurred. That is, when an event 
	 * handler registered with this method executes, the <tt>this</tt> keyword refers to 
	 * the {@link JsWindow#window} object, not to the event's target node.</li>
	 * <li>This method allows the same event handler function to be registered more than 
	 * once. When an event of the specified type occurs, the registered function is 
	 * invoked as many times as it is registered.</li>
	 * </ul>
	 * </p>
	 * <p>The same method is also defined by, and works analogously on, the {@link JsElement} 
	 * and {@link JsWindow} objects</p>
	 * @param type The type of event for which the event listener is to be invoked, with 
	 * a leading "on" prefix.
	 * @param listener The event listener function that is invoked when an event of the 
	 * specified type is dispatched to this node. This function is not passed any 
	 * arguments but can obtain the {@link JsEvent} object from the {@link JsWindow#event} 
	 * property of the {@link JsWindow} object.
	 * @since 1.0
	 * @see #addEventListener(String, JsFunction, Boolean)
	 * @see #detachEvent(String, JsFunction)
	 * @see JsWindow#attachEvent(String, JsFunction)
	 * @see Document#attachEvent(String, JsFunction)
	 * @see JsDocument#attachEvent(String, JsFunction)
	 * @see JsElement#attachEvent(String, JsFunction)
	 */
	public static final void attachEvent(String type, JsFunction<?> listener) {
		Js.win().attachEvent(type, listener);
	}
	/**
	 * <p>Removes an event handler function from the current {@link JsWindow#window} object. This is the IE-specific 
	 * alternative to the standard {@link #removeEventListener(String, JsFunction, Boolean)} 
	 * method.</p>
	 * <p>This method undoes the event handler function registration performed by the 
	 * {@link #attachEvent(String, JsFunction)} method. It is the IE-specific analog to 
	 * the standard {@link #removeEventListener(String, JsFunction, Boolean)}. To remove 
	 * an event handler function for a node, simply invoke this method with the same 
	 * arguments you originally passed to {@link #attachEvent(String, JsFunction)}.</p>
	 * <p>The same method is also defined by, and works analogously on, the {@link JsElement} 
	 * and {@link JsWindow} objects</p>
	 * @param type The type of event for which the event listener is to be invoked, with 
	 * a leading "on" prefix.
	 * @param listener The event listener function that is to be removed.
	 * @since 1.0
	 * @see #removeEventListener(String, JsFunction, Boolean)
	 * @see #attachEvent(String, JsFunction)
	 * @see JsWindow#detachEvent(String, JsFunction)
	 * @see Document#detachEvent(String, JsFunction)
	 * @see JsDocument#detachEvent(String, JsFunction)
	 * @see JsElement#detachEvent(String, JsFunction)
	 */
	public static final void detachEvent(String type, JsFunction<?> listener) {
		Js.win().detachEvent(type, listener);
	}
	public static final void yield() {
		setTimeout(function());
	}
	/**
	 * <p>Decodes a string escaped with {@link #encodeURI(Object)}.</p>
	 * @param s A string that contains an encoded URI or other text to be decoded.
	 * @return A copy of <tt>s</tt>, with any hexadecimal escape sequences replaced with 
	 * the characters they represent.
	 * @throws RuntimeException JavaScript throws a <tt>URIError</tt> if one or more of the 
	 * escape sequences in <tt>s</tt> is malformed and cannot be correctly decoded. See 
	 * {@link Js#err(Object)} and {@link js.core.JsURIError} for JS Simulation.
	 * @since 1.0
	 * @see #encodeURI(Object)
	 * @see Js#decodeURI(Object)
	 * @see Global#decodeURI(Object)
	 * @see JsGlobal#decodeURI(Object)
	 */
	public static final String decodeURI(Object s) {
		return Js.core().decodeURI(s);
	}
	/**
	 * <p>Decodes a string escaped with {@link #encodeURIComponent(Object)}.</p>
	 * @param s A string that contains an encoded URI component or other text to be decoded.
	 * @return A copy of <tt>s</tt>, with any hexadecimal escape sequences replaced 
	 * with the characters they represent.
	 * @throws RuntimeException JavaScript throws a <tt>URIError</tt> if one or more of the 
	 * escape sequences in <tt>s</tt> is malformed and cannot be correctly decoded. See 
	 * {@link Js#err(Object)} and {@link js.core.JsURIError} for JS Simulation.
	 * @since 1.0
	 * @see #encodeURIComponent(Object)
	 * @see Js#decodeURIComponent(Object)
	 * @see Global#decodeURIComponent(Object)
	 * @see JsGlobal#decodeURIComponent(Object)
	 */
	public static final String decodeURIComponent(Object s) {
		return Js.core().decodeURIComponent(s);
	}
	/**
	 * <p>Encodes a URI by escaping certain characters.</p>
	 * @param uri A string that contains the URI or other text to be encoded.
	 * @return A copy of <tt>uri</tt>, with any hexadecimal escape sequences replaced 
	 * with the characters they represent..
	 * @throws RuntimeException JavaScript throws a <tt>URIError</tt> if <tt>s</tt> 
	 * contains malformed unicode surrogate pairs and cannot be encoded. See 
	 * {@link Js#err(Object)} and {@link js.core.JsURIError} for JS Simulation.
	 * @since 1.0
	 * @see #decodeURI(Object)
	 * @see Js#encodeURI(Object)
	 * @see Global#encodeURI(Object)
	 * @see JsGlobal#encodeURI(Object)
	 */
	public static final String encodeURI(Object uri) {
		return Js.core().encodeURI(uri);
	}
	/**
	 * <p>Encodes a URI component by escaping certain characters.</p>
	 * @param uri A string that contains a portion of a URI or other text to be encoded.
	 * @return A copy of <tt>uri</tt>, with certain characters replaced by hexadecimal escape sequences.
	 * @throws RuntimeException JavaScript throws a <tt>URIError</tt> if <tt>s</tt> 
	 * contains malformed unicode surrogate pairs and cannot be encoded. See 
	 * {@link Js#err(Object)} and {@link js.core.JsURIError} for JS Simulation.
	 * @since 1.0
	 * @see #decodeURIComponent(Object)
	 * @see Js#encodeURIComponent(Object)
	 * @see Global#encodeURIComponent(Object)
	 * @see JsGlobal#encodeURIComponent(Object)
	 */
	public static final String encodeURIComponent(Object uri) {
		return Js.core().encodeURIComponent(uri);
	}
	/**
	 * <p>Encodes a string by replacing certain characters with escape sequences.</p>
	 * @param s The string that is to be "escaped" or encoded.
	 * @return An encoded copy of <tt>s</tt> in which certain characters have been 
	 * replaced by hexadecimal escape sequences.
	 * @since 1.0
	 * @see #unescape(Object)
	 * @see Js#escape(Object)
	 * @see Global#escape(Object)
	 * @see JsGlobal#escape(Object)
	 */
	public static final String escape(Object s) {
		return Js.core().escape(s);
	}
	/**
	 * <p>Decodes a string encoded with {@link #escape(Object)}.</p>
	 * @param s The string that is to be decoded or "unescaped".
	 * @return A decoded copy of <tt>s</tt>.
	 * @see #escape(Object)
	 * @see Js#unescape(Object)
	 * @see Global#unescape(Object)
	 * @see JsGlobal#unescape(Object)
	 * @since 1.0
	 */
	public static final String unescape(Object s) {
		return Js.core().unescape(s);
	}
	/**
	 * <p>Evaluates the argument string as JavaScript code and returns the result.</p>
	 * <p>In JavaScript, <tt>eval()</tt> is a global method that evaluates a string of 
	 * JavaScript code in the current lexical scope. If the code contains an expression, 
	 * eval evaluates the expression and returns its value. If the code contains a 
	 * JavaScript statement or statements, it executes those statements and returns the 
	 * value, if any, returned by the last statement. If the code does not return any 
	 * value, <tt>eval()</tt> returns undefined. Finally, if code throws an exception, 
	 * <tt>eval()</tt> passes that exception on to the caller.</p>
	 * <p>The global function <tt>eval()</tt> provides a very powerful capability to 
	 * the JavaScript language, but its use is infrequent in real-world programs. 
	 * Obvious uses are to write programs that act as recursive JavaScript interpreters 
	 * and to write programs that dynamically generate and evaluate JavaScript code.</p>
	 * <p>Most JavaScript functions and methods that expect string arguments accept 
	 * arguments of other types as well and simply convert those argument values to 
	 * strings before proceeding. <tt>eval()</tt> does not behave like this. If the 
	 * code argument is not a primitive string, it is simply returned unchanged. Be 
	 * careful, therefore, that you do not inadvertently pass a String object to 
	 * <tt>eval()</tt> when you intended to pass a primitive string value.</p>
	 * <p>For purposes of implementation efficiency, the ECMAScript v3 standard places 
	 * an unusual restriction on the use of <tt>eval()</tt>. An ECMAScript implementation 
	 * is allowed to throw an <tt>EvalError</tt> exception if you attempt to overwrite 
	 * the <tt>eval</tt> property or if you assign the <tt>eval()</tt> method to another 
	 * property and attempt to invoke it through that property.</p>
	 * @param s A string of JavaScript code.
	 * @return The return value of the evaluated code, if any.
	 * @throws RuntimeException JavaScript throws a <tt>SyntaxError</tt> if the argument string 
	 * does not contain legal JavaScript, a <tt>EvalError</tt> if the <tt>eval</tt> function 
	 * was called illegally, through an identifier other than "eval", or other JavaScript error 
	 * generated by the code passed. See {@link Js#err(Object)}, {@link js.core.JsSyntaxError}, 
	 * {@link js.core.JsEvalError}, and {@link js.core.JsError} for JS Simulation.
	 * @since 1.0
	 * @see Js#eval(Object)
	 * @see Global#eval(Object)
	 * @see JsGlobal#eval(Object)
	 */
	public static final Object eval(Object s) {
		return Js.core().eval(s);
	}
	/**
	 * <p>Tests whether a value is a finite number.</p>
	 * @param v The number to be tested.
	 * @return <tt>true</tt> if <tt>v</tt> is (or can be converted to) a finite 
	 * number, or <tt>false</tt> if <tt>v</tt> is <tt>NaN</tt> (not a number) 
	 * or positive or negative infinity.
	 * @since 1.0
	 * @see Js#isFinite(Object)
	 * @see Global#isFinite(Object)
	 * @see JsGlobal#isFinite(Object)
	 */
	public static final boolean isFinite(Object v) {
		return Js.core().isFinite(v);
	}
	/**
	 * <p>Tests whether a value is the not-a-number value.</p>
	 * <p>In JavaScript, This function tests its argument to determine whether it is the 
	 * value <tt>NaN</tt>, which represents an illegal number (such as the result of 
	 * division by zero). This function is required because comparing a <tt>NaN</tt> 
	 * with any value, including itself, always returns <tt>false</tt>, so it is not 
	 * possible to test for <tt>NaN</tt> with the == or === operators.</p>
	 * <p>A common use in JavaScript of this function is to test the results of {@link #parseFloat(Object)} 
	 * and {@link #parseInt(Object)} to determine if they represent legal numbers. You can 
	 * also use {@link #isNaN(Object)} to check for arithmetic errors, such as division by 
	 * zero</p>
	 * @param v The value to be tested.
	 * @return <tt>true</tt> if <tt>v</tt> is (or can be converted to) the special 
	 * not-a-number value; <tt>false</tt> if <tt>v</tt> is any other value.
	 * @since 1.0
	 * @see Js#isNaN(Object)
	 * @see Global#isNaN(Object)
	 * @see JsGlobal#isNaN(Object)
	 */
	public static final boolean isNaN(Object v) {
		return Js.core().isNaN(v);
	}
	/**
	 * <p>Parses a number from a string.</p>
	 * <p>In JavaScript, this function parses and returns the first number that occurs in 
	 * <tt>value</tt>. Parsing stops, and the value is returned, when it encounters a 
	 * character in <tt>value</tt> that is not a valid part of the number. If <tt>value</tt> 
	 * does not begin with a number that it can parse, the function returns the not-a-number 
	 * value <tt>NaN</tt>. Test for this return value with the {@link #isNaN(Object)} 
	 * function. If you want to parse only the integer portion of a number, use {@link #parseInt(Object)} 
	 * or {@link #parseInt(Object, Object)} instead of this one.</p>
	 * @param value The string to be parsed and converted to a number.
	 * @return The parsed number, or <tt>NaN</tt> if <tt>value</tt> does not begin 
	 * with a valid number. In JavaScript 1.0, this function returns 0 instead of <tt>NaN</tt> 
	 * when <tt>value</tt> cannot be parsed as a number.
	 * @since 1.0
	 * @see #parseInt(Object)
	 * @see Js#parseFloat(Object)
	 * @see Global#parseFloat(Object)
	 * @see JsGlobal#parseFloat(Object)
	 */
	public static final Double parseFloat(Object value) {
		return (Double)Js.core().parseFloat(value);
	}
	/**
	 * <p>Parses an integer from a string.</p>
	 * <p>In JavaScript, this function parses and returns the first number (with an 
	 * optional leading minus sign) that occurs in <tt>value</tt>. Parsing stops, and 
	 * the value is returned, when it encounters a character in <tt>value</tt> that is 
	 * not a valid digit for the specified radix. If <tt>value</tt> does not begin with 
	 * a number that it can parse, the function returns the not-a-number value <tt>NaN</tt>. 
	 * Use the {@link #isNaN(Object)} function to test for this return value.</p>
	 * @param value The string to be parsed.
	 * @return The parsed number, or <tt>NaN</tt> if <tt>value</tt> does not begin with 
	 * a valid integer. In JavaScript 1.0, this function returns 0 instead of <tt>NaN</tt> 
	 * when it cannot parse <tt>value</tt>.
	 * @since 1.0
	 * @see #parseFloat(Object)
	 * @see #parseInt(Object, Object)
	 * @see Js#parseInt(Object)
	 * @see Global#parseInt(Object)
	 * @see JsGlobal#parseInt(Object)
	 */
	public static final Integer parseInt(Object value) {
		return (Integer)Js.core().parseInt(value);
	}
	/**
	 * <p>Parses an integer from a string in a base specified.</p>
	 * <p>In JavaScript, this function parses and returns the first number (with an 
	 * optional leading minus sign) that occurs in <tt>value</tt>. Parsing stops, and 
	 * the value is returned, when it encounters a character in <tt>value</tt> that is 
	 * not a valid digit for the specified radix. If <tt>value</tt> does not begin with 
	 * a number that it can parse, the function returns the not-a-number value <tt>NaN</tt>. 
	 * Use the {@link #isNaN(Object)} function to test for this return value.</p>
	 * <p>The <tt>radix</tt> argument specifies the base of the number to be parsed. 
	 * Specifying 10 makes this function parse a decimal number. The value 8 specifies that 
	 * an octal number (using digits 0 through 7) is to be parsed. The value 16 specifies 
	 * a hexadecimal value, using digits 0 through 9 and letters A through F. <tt>radix</tt> 
	 * can be any value between 2 and 36.</p>
	 * <p>If <tt>radix</tt> is 0 or is undefined, this function tries to determine the 
	 * radix of the number from <tt>value</tt>. If <tt>value</tt> begins (after an 
	 * optional minus sign) with 0x, it parses the remainder of <tt>value</tt> as a 
	 * hexadecimal number. If <tt>value</tt> begins with a 0, the ECMAScript v3 standard 
	 * allows an implementation of this function to interpret the following characters as 
	 * an octal number or as a decimal number. Otherwise, if <tt>value</tt> begins with 
	 * a digit from 1 through 9, it parses it as a decimal number</p>
	 * @param value The string to be parsed.
	 * @param radix An optional integer argument that represents the radix (or base) of the 
	 * number to be parsed. If this argument is undefined or is 0, the number is parsed in 
	 * base 10 or in base 16 if it begins with 0x or 0X. If this argument is less than 2 or 
	 * greater than 36, <tt>NaN</tt> is returned.
	 * @return The parsed number, or <tt>NaN</tt> if <tt>value</tt> does not begin with 
	 * a valid integer. In JavaScript 1.0, this function returns 0 instead of <tt>NaN</tt> 
	 * when it cannot parse <tt>value</tt>.
	 * @since 1.0
	 * @see #parseInt(Object)
	 * @see Js#parseInt(Object, int)
	 * @see Global#parseInt(Object, int)
	 * @see JsGlobal#parseInt(Object, Object)
	 */
	public static final Integer parseInt(Object value, Object radix) {
		return (Integer)Js.core().parseInt(value, radix);
	}
	public static final JsObject getComputedStyle(JsHTMLElement elt) {
		return Js.win().getComputedStyle(elt, "");
	}
	public static final JsObject getComputedStyle(JsHTMLElement elt, String pseudoElt) {
		return Js.win().getComputedStyle(elt, pseudoElt);
	}
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public final static Var<JsDocument> document = new Static<JsDocument>(new Field<JsDocument>(JsWindow.document));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public final static Var<JsLocation> location = new Static<JsLocation>(new Field<JsLocation>(JsWindow.location));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public final static Var<JsNavigator> navigator = new Static<JsNavigator>(new Field<JsNavigator>(JsWindow.navigator));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see JsClient
	 * @since 1.0
	 */
	public final static Var<JsWindow> window = new Static<JsWindow>(new Field<JsWindow>(JsWindow.window));

	public final static Number clientWidth() {
		return jsx.client.Browser.isIE ? (
				jsx.client.Document.isStrict ?
						JsHTMLElement.clientWidth.with(
								JsDocument.documentElement.with(
										Win.document.var()
								)
						) : JsHTMLElement.clientWidth.with(
								jsx.client.Document.body.var()
						)
		) : JsWindow.innerWidth.with();
	}

	public final static Number clientHeight() {
		return jsx.client.Browser.isIE ? (
				jsx.client.Document.isStrict ?
						JsHTMLElement.clientHeight.with(
								JsDocument.documentElement.with(
										Win.document.var()
								)
						) : JsHTMLElement.clientHeight.with(
								jsx.client.Document.body.var()
						)
		) : JsWindow.innerHeight.with();
	}

	public final static JsNode documentElement() {
		return jsx.client.Browser.isIE && !jsx.client.Document.isStrict ?
				jsx.client.Document.body.var() : jsx.client.Document.documentElement.var();
	}

	public final static Number scrollLeft() {
		return JsHTMLElement.scrollLeft.with(documentElement());
	}

	public final static Number scrollTop() {
		return JsHTMLElement.scrollTop.with(documentElement());
	}
}
