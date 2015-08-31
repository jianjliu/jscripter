
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

import js.core.*;
import js.user.*;

/**
 * <p>An <b>opaque</b> class providing basic utilities with its static methods.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be 
 * generated into the target codes. Re-compilers must exit with error on the operations of 
 * accessing that kind of class objects.
 */
public abstract class Js extends Function<Void>
{
	private Js() {}

	private static Sim s = null;

	/**
	 * <p>An <b>internal</b> method only called internally in {@link Js#init(Sim)} to 
	 * initialize JS Simulation and JS developers must follow this rule to ensure the 
	 * class {@link Sim} and its subclasses invisible to JS re-compilers which start 
	 * processing at {@link JsApplet#onReady()}.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	public static final synchronized void init(Sim sim) {
		s = sim;
	}
	/**
	 * <p>An <b>internal</b> method only called internally to destroy the cache of static 
	 * references.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	static final synchronized void destroy() {
		s = null;
		Static.destroy();
	}
	/**
	 * <p>An <b>internal</b> method only called internally to get JS Simulation instance.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	static final Sim s() {
		return s;
	}

	/**
	 * <p>Opaquely tells whether the current running environment is JS Simulation (debug mode) 
	 * or JavaScript (re-compiled).</p>
	 * @return <tt>true</tt> if the current program is running with JS Simulation 
	 * (in debug mode); <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method and simply 
	 * replace it with a boolean <tt>false</tt> value.
	 */
	public static final boolean debug() {
		return true;
	}
	/**
	 * <p>Opaquely gets the JavaScript Global object with the core support only.</p>
	 * <p>This method exists for the efficiency of small tests.</p>
	 * @return The JavaScript Global object with the core support only.
	 * @see #win()
	 * @see jsx.client.Global
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method and simply 
	 * replace it with the expression: 
	 * <pre>window</pre>
	 */
	public static final JsGlobal core() {
		return s().core();
	}
	/**
	 * <p>Opaquely gets the JavaScript Global object with the client-side support.</p>
	 * @return The JavaScript Global object with the client-side support.
	 * @see #core()
	 * @see jsx.client.Client
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method and simply 
	 * replace it with the expression: 
	 * <pre>window</pre>
	 */
	public static final JsWin win() {
		return s().win();
	}

	/**
	 * <p>Displays a simple message in a dialog box, 
	 * simulating the JavaScript global function of the same name.</p>
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
	 * @see jsx.client.Global#alert(Object)
	 * @see jsx.client.Client#alert(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the static invocation of this method directly into 
	 * a JavaScript invocation on the default object (<tt>window</tt>) without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public static final void alert(Object message) { s().alert(message);}
	/**
	 * <p>Asks a yes-or-no question with a dialog box, 
	 * simulating the JavaScript global function of the same name.</p>
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
	 * @see jsx.client.Global#confirm(Object)
	 * @see jsx.client.Client#confirm(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the static invocation of this method directly into 
	 * a JavaScript invocation on the default object (<tt>window</tt>) without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public static final boolean confirm(Object question) { return s().confirm(question);}
	/**
	 * <p>Asks for simple string input with a dialog box, 
	 * simulating the JavaScript global function of the same name.</p>
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
	 * @see #prompt(Object, Object)
	 * @see jsx.client.Global#prompt(Object)
	 * @see jsx.client.Client#prompt(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the static invocation of this method directly into 
	 * a JavaScript invocation on the default object (<tt>window</tt>) without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public static final String prompt(Object message) { return s().prompt(message);}
	/**
	 * <p>Asks for simple string input with a dialog box, 
	 * simulating the JavaScript global function of the same name.</p>
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
	 * @see #prompt(Object)
	 * @see jsx.client.Global#prompt(Object, Object)
	 * @see jsx.client.Client#prompt(Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the static invocation of this method directly into 
	 * a JavaScript invocation on the default object (<tt>window</tt>) without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public static final String prompt(Object message, Object defaultInput) { return s().prompt(message, defaultInput);}
	/**
	 * <p>Cancels periodic execution of code, 
	 * simulating the JavaScript global function of the same name.</p>
	 * <p>This method stops the repeated execution of code that was started by a call to 
	 * {@link #setInterval(JsFunction, Number)}. <tt>intervalId</tt> must be the value 
	 * that was returned by a call to {@link #setInterval(JsFunction, Number)}.</p>
	 * @param intervalId The value returned by the corresponding call to {@link #setInterval(JsFunction, Number)}.
	 * @see #setInterval(JsFunction, Number)
	 * @see jsx.client.Global#clearInterval(Object)
	 * @see jsx.client.Client#clearInterval(Object)
	 * @see jsx.Interval
	 * @since 1.0
	 * @javascript Re-compilers must convert the static invocation of this method directly into 
	 * a JavaScript invocation on the default object (<tt>window</tt>) without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public static final void clearInterval(Object intervalId) { s().clearInterval(intervalId);}
	/**
	 * <p>Cancels a pending timeout operation, 
	 * simulating the JavaScript global function of the same name.</p>
	 * <p>This method cancels the execution of code that has been deferred with the 
	 * {@link #setTimeout(JsFunction, Number)} method. The <tt>timeoutId</tt> argument 
	 * is a value returned by the call to {@link #setTimeout(JsFunction, Number)} and 
	 * identifies which deferred code to cancel.</p>
	 * @param timeoutId A value returned by {@link #setTimeout(JsFunction, Number)} that 
	 * identifies the timeout to be canceled.
	 * @see #setTimeout(JsFunction)
	 * @see #setTimeout(JsFunction, Number)
	 * @see jsx.client.Global#clearTimeout(Object)
	 * @see jsx.client.Client#clearTimeout(Object)
	 * @see jsx.Timeout
	 * @since 1.0
	 * @javascript Re-compilers must convert the static invocation of this method directly into 
	 * a JavaScript invocation on the default object (<tt>window</tt>) without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public static final void clearTimeout (Object timeoutId ) { s().clearTimeout (timeoutId);}
	/**
	 * <p>Executes code at periodic intervals, 
	 * simulating the JavaScript global function of the same name.</p>
	 * <p>Note that the specified function is executed in the context of the Window object, 
	 * that is, the Window object is the value of the <tt>this</tt> keyword of the 
	 * executing context of the function. This is <tt>true</tt> even if the call to 
	 * {@link #setTimeout(JsFunction, Number)} occurred within a function with a longer 
	 * scope chain.</p>
	 * @param f A function to be periodically invoked.
	 * @param interval The interval, in milliseconds, between invocations of the function.
	 * @return A value that can be passed to {@link #clearInterval(Object)} method to 
	 * cancel the periodic execution of the function.
	 * @see #setInterval(JsFunction)
	 * @see #clearInterval(Object)
	 * @see jsx.client.Global#setInterval(JsFunction)
	 * @see jsx.client.Global#setInterval(JsFunction, Number)
	 * @see jsx.client.Client#setInterval(JsFunction)
	 * @see jsx.client.Client#setInterval(JsFunction, Number)
	 * @see jsx.Interval
	 * @since 1.0
	 * @javascript Re-compilers must convert the static invocation of this method directly into 
	 * a JavaScript invocation on the default object (<tt>window</tt>) without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public static final Object setInterval(JsFunction<?> f, Number interval) { return s().setInterval(f, interval);}
	/**
	 * <p>Executes code at periodic intervals, 
	 * simulating the JavaScript global function of the same name.</p>
	 * <p>Note that the specified function is executed in the context of the Window object, 
	 * that is, the Window object is the value of the <tt>this</tt> keyword of the 
	 * executing context of the function. This is <tt>true</tt> even if the call to 
	 * {@link #setTimeout(JsFunction, Number)} occurred within a function with a longer 
	 * scope chain.</p>
	 * @param f A function to be periodically invoked.
	 * @return A value that can be passed to {@link #clearInterval(Object)} method to 
	 * cancel the periodic execution of the function.
	 * @see #setInterval(JsFunction, Number)
	 * @see #clearInterval(Object)
	 * @see jsx.client.Global#setInterval(JsFunction)
	 * @see jsx.client.Global#setInterval(JsFunction, Number)
	 * @see jsx.client.Client#setInterval(JsFunction)
	 * @see jsx.client.Client#setInterval(JsFunction, Number)
	 * @see jsx.Interval
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript invocation:
	 * <pre>setInterval(f, 10)</pre>
	 */
	public static final Object setInterval(JsFunction<?> f) { return s().setInterval(f, null);}
	/**
	 * <p>Executes code after a specified amount of time elapses, 
	 * simulating the JavaScript global function of the same name.</p>
	 * <p>Note that this method executes the specified function only once. The function is 
	 * executed in the context of the Window object, that is, the Window object is the 
	 * value of the <tt>this</tt> keyword of the executing context of the function. 
	 * This is <tt>true</tt> even if the call to {@link #setTimeout(JsFunction, Number)} 
	 * occurred within a function with a longer scope chain.</p>
	 * @param f A function to be invoked after the <tt>delay</tt> has elapsed.
	 * @param delay The amount of time, in milliseconds, before the function should be executed.
	 * @return A value that can be passed to the {@link #clearTimeout(Object)} method to 
	 * cancel the execution of the function.
	 * @see #setTimeout(JsFunction)
	 * @see #clearTimeout(Object)
	 * @see jsx.client.Global#setTimeout(JsFunction)
	 * @see jsx.client.Global#setTimeout(JsFunction, Number)
	 * @see jsx.client.Client#setTimeout(JsFunction)
	 * @see jsx.client.Client#setTimeout(JsFunction, Number)
	 * @see jsx.Timeout
	 * @since 1.0
	 * @javascript Re-compilers must convert the static invocation of this method directly into 
	 * a JavaScript invocation on the default object (<tt>window</tt>) without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public static final Object setTimeout (JsFunction<?> f, Number delay) { return s().setTimeout (f, delay);}
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
	 * @see #setTimeout(JsFunction, Number)
	 * @see #clearTimeout(Object)
	 * @see jsx.client.Global#setTimeout(JsFunction)
	 * @see jsx.client.Global#setTimeout(JsFunction, Number)
	 * @see jsx.client.Client#setTimeout(JsFunction)
	 * @see jsx.client.Client#setTimeout(JsFunction, Number)
	 * @see jsx.Timeout
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript invocation:
	 * <pre>setTimeout(f, 10)</pre>
	 */
	public static final Object setTimeout (JsFunction<?> f) { return s().setTimeout (f, null);}
	/**
	 * <p>Decodes a string escaped with {@link #encodeURI(Object)}, 
	 * simulating the JavaScript global function of the same name.</p>
	 * @param s A string that contains an encoded URI or other text to be decoded.
	 * @return A copy of <tt>s</tt>, with any hexadecimal escape sequences replaced with 
	 * the characters they represent.
	 * @throws RuntimeException JavaScript throws a <tt>URIError</tt> if one or more of the 
	 * escape sequences in <tt>s</tt> is malformed and cannot be correctly decoded. See 
	 * {@link Js#err(Object)} and {@link js.core.JsURIError} for JS Simulation.
	 * @see #encodeURI(Object)
	 * @see jsx.client.Global#decodeURI(Object)
	 * @see jsx.client.Client#decodeURI(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the static invocation of this method directly into 
	 * a JavaScript invocation on the default object (<tt>window</tt>) without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public static final String decodeURI(Object s) { return s().decodeURI(s); }
	/**
	 * <p>Decodes a string escaped with {@link #encodeURIComponent(Object)}, 
	 * simulating the JavaScript global function of the same name.</p>
	 * @param s A string that contains an encoded URI component or other text to be decoded.
	 * @return A copy of <tt>s</tt>, with any hexadecimal escape sequences replaced 
	 * with the characters they represent.
	 * @throws RuntimeException JavaScript throws a <tt>URIError</tt> if one or more of the 
	 * escape sequences in <tt>s</tt> is malformed and cannot be correctly decoded. See 
	 * {@link Js#err(Object)} and {@link js.core.JsURIError} for JS Simulation.
	 * @see #encodeURIComponent(Object)
	 * @see jsx.client.Global#decodeURIComponent(Object)
	 * @see jsx.client.Client#decodeURIComponent(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the static invocation of this method directly into 
	 * a JavaScript invocation on the default object (<tt>window</tt>) without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public static final String decodeURIComponent(Object s) { return s().decodeURIComponent(s); }
	/**
	 * <p>Encodes a URI by escaping certain characters, 
	 * simulating the JavaScript global function of the same name.</p>
	 * @param uri A string that contains the URI or other text to be encoded.
	 * @return A copy of <tt>uri</tt>, with any hexadecimal escape sequences replaced 
	 * with the characters they represent..
	 * @throws RuntimeException JavaScript throws a <tt>URIError</tt> if <tt>s</tt> 
	 * contains malformed unicode surrogate pairs and cannot be encoded. See 
	 * {@link Js#err(Object)} and {@link js.core.JsURIError} for JS Simulation.
	 * @see #decodeURI(Object)
	 * @see jsx.client.Global#encodeURI(Object)
	 * @see jsx.client.Client#encodeURI(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the static invocation of this method directly into 
	 * a JavaScript invocation on the default object (<tt>window</tt>) without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public static final String encodeURI(Object uri) { return s().encodeURI(uri); }
	/**
	 * <p>Encodes a URI component by escaping certain characters, 
	 * simulating the JavaScript global function of the same name.</p>
	 * @param uri A string that contains a portion of a URI or other text to be encoded.
	 * @return A copy of <tt>uri</tt>, with certain characters replaced by hexadecimal escape sequences.
	 * @throws RuntimeException JavaScript throws a <tt>URIError</tt> if <tt>s</tt> 
	 * contains malformed unicode surrogate pairs and cannot be encoded. See 
	 * {@link Js#err(Object)} and {@link js.core.JsURIError} for JS Simulation.
	 * @see #decodeURIComponent(Object)
	 * @see jsx.client.Global#encodeURIComponent(Object)
	 * @see jsx.client.Client#encodeURIComponent(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the static invocation of this method directly into 
	 * a JavaScript invocation on the default object (<tt>window</tt>) without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public static final String encodeURIComponent(Object uri) { return s().encodeURIComponent(uri); }
	/**
	 * <p>Encodes a string by replacing certain characters with escape sequences, 
	 * simulating the JavaScript global function of the same name.</p>
	 * @param s The string that is to be "escaped" or encoded.
	 * @return An encoded copy of <tt>s</tt> in which certain characters have been 
	 * replaced by hexadecimal escape sequences.
	 * @see #unescape(Object)
	 * @see jsx.client.Global#escape(Object)
	 * @see jsx.client.Client#escape(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the static invocation of this method directly into 
	 * a JavaScript invocation on the default object (<tt>window</tt>) without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public static final String escape(Object s) { return s().escape(s); }
	/**
	 * <p>Decodes a string encoded with {@link #escape(Object)}, 
	 * simulating the JavaScript global function of the same name.</p>
	 * @param s The string that is to be decoded or "unescaped".
	 * @return A decoded copy of <tt>s</tt>.
	 * @see #escape(Object)
	 * @see jsx.client.Global#unescape(Object)
	 * @see jsx.client.Client#unescape(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the static invocation of this method directly into 
	 * a JavaScript invocation on the default object (<tt>window</tt>) without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public static final String unescape(Object s) { return s().escape(s); }
	/**
	 * <p>Evaluates the argument string as JavaScript code and returns the result, 
	 * simulating the JavaScript global function of the same name.</p>
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
	 * @javascript Re-compilers must convert the instance invocation of this method directly into 
	 * a JavaScript invocation on the default object (<tt>window</tt>) without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public static final Object eval(Object s) {
		return s().eval(s);
	}
	/**
	 * <p>Tests whether a value is a finite number, 
	 * simulating the JavaScript global function of the same name.</p>
	 * @param v The number to be tested.
	 * @return <tt>true</tt> if <tt>v</tt> is (or can be converted to) a finite 
	 * number, or <tt>false</tt> if <tt>v</tt> is <tt>NaN</tt> (not a number) 
	 * or positive or negative infinity.
	 * @see jsx.client.Global#isFinite(Object)
	 * @see jsx.client.Client#isFinite(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the static invocation of this method directly into 
	 * a JavaScript invocation on the default object (<tt>window</tt>) without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public static final boolean isFinite(Object v) { return s().isFinite(v); }
	/**
	 * <p>Tests whether a value is the not-a-number value, 
	 * simulating the JavaScript global function of the same name.</p>
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
	 * @see jsx.client.Global#isNaN(Object)
	 * @see jsx.client.Client#isNaN(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the static invocation of this method directly into 
	 * a JavaScript invocation on the default object (<tt>window</tt>) without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public static final boolean isNaN(Object v) { return s().isNaN(v); }
	/**
	 * <p>Parses an integer from a string, 
	 * simulating the JavaScript global function of the same name.</p>
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
	 * @see #parseFloat(Object)
	 * @see #parseInt(Object, int)
	 * @see jsx.client.Global#parseInt(Object)
	 * @see jsx.client.Client#parseInt(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the static invocation of this method directly into 
	 * a JavaScript invocation on the default object (<tt>window</tt>) without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public static final Integer parseInt(Object value) { return s().parseInt(value); }
	/**
	 * <p>Parses an integer from a string in a base specified, 
	 * simulating the JavaScript global function of the same name.</p>
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
	 * @see #parseInt(Object)
	 * @see jsx.client.Global#parseInt(Object, int)
	 * @see jsx.client.Client#parseInt(Object, int)
	 * @since 1.0
	 * @javascript Re-compilers must convert the static invocation of this method directly into 
	 * a JavaScript invocation on the default object (<tt>window</tt>) without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public static final Integer parseInt(Object value, int radix) { return s().parseInt(value, radix); }
	/**
	 * <p>Parses a number from a string, 
	 * simulating the JavaScript global function of the same name.</p>
	 * <p>In JavaScript, this function parses and returns the first number that occurs in 
	 * <tt>value</tt>. Parsing stops, and the value is returned, when it encounters a 
	 * character in <tt>value</tt> that is not a valid part of the number. If <tt>value</tt> 
	 * does not begin with a number that it can parse, the function returns the not-a-number 
	 * value <tt>NaN</tt>. Test for this return value with the {@link #isNaN(Object)} 
	 * function. If you want to parse only the integer portion of a number, use {@link #parseInt(Object)} 
	 * or {@link #parseInt(Object, int)} instead of this one.</p>
	 * @param value The string to be parsed and converted to a number.
	 * @return The parsed number, or <tt>NaN</tt> if <tt>value</tt> does not begin 
	 * with a valid number. In JavaScript 1.0, this function returns 0 instead of <tt>NaN</tt> 
	 * when <tt>value</tt> cannot be parsed as a number.
	 * @see #parseInt(Object)
	 * @see jsx.client.Global#parseFloat(Object)
	 * @see jsx.client.Client#parseFloat(Object)
	 * @since 1.0
	 * @javascript Re-compilers must convert the static invocation of this method directly into 
	 * a JavaScript invocation on the default object (<tt>window</tt>) without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public static final Double parseFloat(Object value) { return s().parseFloat(value); }

	/**
	 * <p>Creates and return a <tt>Cases</tt> cache.</p>
	 * @return The newly created <tt>Cases</tt> cache.
	 * @since 1.0
	 * @javascript Re-compilers must, on the static invocation of this method, create a new 
	 * re-compile time <tt>Cases</tt> cache, without generating any JavaScript statement 
	 * in the target codes. 
	 */
	public static final Cases cases() { return s().cases();};
	/**
	 * <p>Gets the list of the property names of an object.</p>
	 * @param o The object.
	 * @return The list of the property names of the object.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript invocation:
	 * <pre>keys(o)</pre>
	 * of a common JavaScript function like:
	 * <pre>function keys(o) {
	 *  var keys = [];
	 *  for (k in o) {
	 *    keys.put(k);
	 *  }
	 *  return keys;
	 *}</pre>
	 */
	public static final ArrayLike<String> keys(ObjectLike o) { return s().keys(o);}
	/**
	 * <p>Copies all the properties of <tt>a</tt> to <tt>o</tt>.</p>
	 * @param o The object that the properties being copied to.
	 * @param a The object that the properties being copied from.
	 * @since 1.0
	 * @javascript Re-compilers must replace this static invocation of this method with the 
	 * JavaScript invocation:
	 * <pre>copy(o, a)</pre>
	 * of a common JavaScript function like:
	 * <pre>function copy(o, a) {
	 *  for (k in o) {
	 *    o[k] = a[k];
	 *  }
	 *  return o;
	 *}</pre>
	 */
	public static final ObjectLike apply(ObjectLike o, ObjectLike a) { s().apply(o, a); return o;}

	/**
	 * <p>Creates an empty JavaScript function.</p>
	 * <p>A function is a fundamental data-type in JavaScript. Note that although functions 
	 * may be created with this method, this is not efficient, and the preferred way to 
	 * define functions, in most cases, is to extend {@link Function}.</p>
	 * @return A newly created empty function. 
	 * @see #function(String)
	 * @see #function(String, String)
	 * @see #function(Vars, String)
	 * @see Function
	 * @see js.core.JsGlobal.Function#create()
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript invocation:
	 * <pre>new Function()</pre>
	 */
	public static final <T> JsFunction<T> function() { return s().function(new Vars<String>());}
	/**
	 * <p>Creates a JavaScript function that has no argument names.</p>
	 * <p>A function is a fundamental data-type in JavaScript. Note that although functions 
	 * may be created with this method, this is not efficient, and the preferred way to 
	 * define functions, in most cases, is to extend {@link Function}.</p>
	 * @param body A string that specifies the body of the function.
	 * @return A newly created function. Invoking it executes the JavaScript code specified 
	 * by <tt>body</tt>.
	 * @throws RuntimeException JavaScript throws a <tt>SyntaxError</tt> if there was a 
	 * JavaScript syntax error in one of the value of <tt>body</tt>. See {@link Js#err(Object)} 
	 * and {@link js.core.JsSyntaxError} for JS Simulation.
	 * @see #function()
	 * @see #function(String)
	 * @see #function(String, String)
	 * @see Function
	 * @see js.core.JsGlobal.Function#create(String)
	 * @see js.core.JsGlobal.Function#create(Vars, String)
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript invocation:
	 * <pre>new Function(body)</pre>
	 */
	public static final <T> JsFunction<T> function(String body) { return s().function(new Vars<String>().add(body));}
	/**
	 * <p>Creates a JavaScript function with an argument name.</p>
	 * <p>A function is a fundamental data-type in JavaScript. Note that although functions 
	 * may be created with this method, this is not efficient, and the preferred way to 
	 * define functions, in most cases, is to extend {@link Function}.</p>
	 * @param argname A string literal, naming an argument of the function being created.
	 * @param body A string that specifies the body of the function.
	 * @return A newly created function. Invoking it executes the JavaScript code specified 
	 * by <tt>body</tt>.
	 * @throws RuntimeException JavaScript throws a <tt>SyntaxError</tt> if there was a 
	 * JavaScript syntax error in one of the value of the variable arguments or <tt>body</tt>. 
	 * See {@link Js#err(Object)} and {@link js.core.JsSyntaxError} for JS Simulation.
	 * @see #function()
	 * @see #function(String)
	 * @see #function(Vars, String)
	 * @see Function
	 * @see js.core.JsGlobal.Function#create(String, String)
	 * @see js.core.JsGlobal.Function#create(Vars, String)
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript invocation:
	 * <pre>new Function(argname, body)</pre>
	 * where <tt>argname</tt> must be a string literal and converted into an argument name.
	 */
	public static final <T> JsFunction<T> function(String argname, String body) { return s().function(new Vars<String>().add(argname).add(body));}
	/**
	 * <p>Creates a JavaScript function.</p>
	 * <p>A function is a fundamental data-type in JavaScript. Note that although functions 
	 * may be created with this method, this is not efficient, and the preferred way to 
	 * define functions, in most cases, is to extend {@link Function}.</p>
	 * @param argnames A list of the argument values, each naming one or more arguments of the 
	 * function being created.
	 * @param body A string that specifies the body of the function.
	 * @return A newly created function. Invoking it executes the JavaScript code specified 
	 * by <tt>body</tt>.
	 * @throws RuntimeException JavaScript throws a <tt>SyntaxError</tt> if there was a 
	 * JavaScript syntax error in one of the value of the variable arguments and <tt>body</tt>. 
	 * See {@link Js#err(Object)} and {@link js.core.JsSyntaxError} for JS Simulation.
	 * @see #function()
	 * @see #function(String)
	 * @see #function(String, String)
	 * @see Function
	 * @see js.core.JsGlobal.Function#create(Vars, String)
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript invocation:
	 * <pre>new Function(argnames, body)</pre>
	 * where <tt>argnames</tt> must be a list of string literals and expanded into 
	 * comma-separated argument names.
	 */
	public static final <T> JsFunction<T> function(Vars<String> argnames, String body) { return s().function(new Vars<String>().addAll(argnames).add(body));}

	/**
	 * <p>Creates an integer literal.</p>
	 * <p>This method is used to create formatted integer literal in re-compiled JavaScript 
	 * code. A re-compiler leaves the literal as it is without even parsing check but JS 
	 * Simulations parse it to an integer and throws RuntimeException if it is malformatted.</p>
	 * @param s The literal text of an integer.
	 * @return The integer literal.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript invocation:
	 * <pre>s</pre>
	 * where <tt>s</tt> must be a string literals and converted into an integer literal.
	 */
	public static final int integer(String s) { return s().integer(s);}
	/**
	 * <p>Creates a number literal.</p>
	 * <p>This method is used to create formatted number literal in re-compiled JavaScript 
	 * code. A re-compiler leaves the literal as it is without even parsing check but JS 
	 * Simulations parse it to a number and throws RuntimeException if it is malformatted.</p>
	 * @param s The literal text of a number.
	 * @return The numberer literal.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript invocation:
	 * <pre>s</pre>
	 * where <tt>s</tt> must be a string literal and converted into a number literal.
	 */
	public static final Number number(String s) { return s().number(s);}

	/**
	 * <p>Creates an empty array.</p>
	 * @return The empty array.
	 * @see #array(Object[])
	 * @see #array(boolean[])
	 * @see #array(byte[])
	 * @see #array(char[])
	 * @see #array(short[])
	 * @see #array(int[])
	 * @see #array(long[])
	 * @see #array(float[])
	 * @see #array(double[])
	 * @see Vars#var()
	 * @see js.core.JsArray#JsArray()
	 * @see js.core.JsGlobal.Array#create()
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript invocation:
	 * <pre>[]</pre>
	 */
	public static final <T> ArrayLike<T> array() { return s().array();}
	/**
	 * <p>Gets the array-like representation of a generic array.</p>
	 * @param a A generic array
	 * @return The array-like representation.
	 * @see #array(boolean[])
	 * @see #array(byte[])
	 * @see #array(char[])
	 * @see #array(short[])
	 * @see #array(int[])
	 * @see #array(long[])
	 * @see #array(float[])
	 * @see #array(double[])
	 * @see js.core.JsArray#JsArray(js.core.JsObject)
	 * @see js.core.JsArray#JsArray(Object[])
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final <T> ArrayLike<T> array(T[] a) { return s().array(a);}
	/**
	 * <p>Gets the array-like representation of a boolean array.</p>
	 * @param a A boolean array
	 * @return The array-like representation.
	 * @see #array(Object[])
	 * @see #array(byte[])
	 * @see #array(char[])
	 * @see #array(short[])
	 * @see #array(int[])
	 * @see #array(long[])
	 * @see #array(float[])
	 * @see #array(double[])
	 * @see js.core.JsArray#JsArray(boolean[])
	 * @see js.core.JsArray#JsArray(js.core.JsObject)
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final ArrayLike<Boolean>   array(boolean[] a) { return s().array(a);}
	/**
	 * <p>Gets the array-like representation of a byte array.</p>
	 * @param a A byte array
	 * @return The array-like representation.
	 * @see #array(Object[])
	 * @see #array(boolean[])
	 * @see #array(char[])
	 * @see #array(short[])
	 * @see #array(int[])
	 * @see #array(long[])
	 * @see #array(float[])
	 * @see #array(double[])
	 * @see js.core.JsArray#JsArray(byte[])
	 * @see js.core.JsArray#JsArray(js.core.JsObject)
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final ArrayLike<Byte>      array(byte   [] a) { return s().array(a);}
	/**
	 * <p>Gets the array-like representation of a char array.</p>
	 * @param a A char array
	 * @return The array-like representation.
	 * @see #array(Object[])
	 * @see #array(boolean[])
	 * @see #array(byte[])
	 * @see #array(short[])
	 * @see #array(int[])
	 * @see #array(long[])
	 * @see #array(float[])
	 * @see #array(double[])
	 * @see js.core.JsArray#JsArray(char[])
	 * @see js.core.JsArray#JsArray(js.core.JsObject)
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final ArrayLike<Character> array(char   [] a) { return s().array(a);}
	/**
	 * <p>Gets the array-like representation of a short array.</p>
	 * @param a A short array
	 * @return The array-like representation.
	 * @see #array(Object[])
	 * @see #array(boolean[])
	 * @see #array(byte[])
	 * @see #array(char[])
	 * @see #array(int[])
	 * @see #array(long[])
	 * @see #array(float[])
	 * @see #array(double[])
	 * @see js.core.JsArray#JsArray(short[])
	 * @see js.core.JsArray#JsArray(js.core.JsObject)
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final ArrayLike<Short>     array(short  [] a) { return s().array(a);}
	/**
	 * <p>Gets the array-like representation of an int array.</p>
	 * @param a An int array
	 * @return The array-like representation.
	 * @see #array(Object[])
	 * @see #array(boolean[])
	 * @see #array(byte[])
	 * @see #array(char[])
	 * @see #array(short[])
	 * @see #array(long[])
	 * @see #array(float[])
	 * @see #array(double[])
	 * @see js.core.JsArray#JsArray(int[])
	 * @see js.core.JsArray#JsArray(js.core.JsObject)
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final ArrayLike<Integer>   array(int    [] a) { return s().array(a);}
	/**
	 * <p>Gets the array-like representation of a long array.</p>
	 * @param a A long array
	 * @return The array-like representation.
	 * @see #array(Object[])
	 * @see #array(boolean[])
	 * @see #array(byte[])
	 * @see #array(char[])
	 * @see #array(short[])
	 * @see #array(int[])
	 * @see #array(float[])
	 * @see #array(double[])
	 * @see js.core.JsArray#JsArray(long[])
	 * @see js.core.JsArray#JsArray(js.core.JsObject)
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final ArrayLike<Long>      array(long   [] a) { return s().array(a);}
	/**
	 * <p>Gets the array-like representation of a float array.</p>
	 * @param a A float array
	 * @return The array-like representation.
	 * @see #array(Object[])
	 * @see #array(boolean[])
	 * @see #array(byte[])
	 * @see #array(char[])
	 * @see #array(short[])
	 * @see #array(int[])
	 * @see #array(long[])
	 * @see #array(double[])
	 * @see js.core.JsArray#JsArray(float[])
	 * @see js.core.JsArray#JsArray(js.core.JsObject)
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final ArrayLike<Float>     array(float  [] a) { return s().array(a);}
	/**
	 * <p>Gets the array-like representation of a double array.</p>
	 * @param a A double array
	 * @return The array-like representation.
	 * @see #array(Object[])
	 * @see #array(boolean[])
	 * @see #array(byte[])
	 * @see #array(char[])
	 * @see #array(short[])
	 * @see #array(int[])
	 * @see #array(long[])
	 * @see #array(float[])
	 * @see js.core.JsArray#JsArray(double[])
	 * @see js.core.JsArray#JsArray(js.core.JsObject)
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final ArrayLike<Double>    array(double [] a) { return s().array(a);}
	/**
	 * <p>Creates a date object set to the current system date and time.</p>
	 * @return The newly created date object.
	 * @see #date(Number)
	 * @see #date(String)
	 * @see js.core.JsGlobal.Date#create()
	 * @see js.core.JsGlobal.Date#create(Vars)
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>new Date()</pre>
	 */
	public static final DateLike date() { return s().date();}
	/**
	 * <p>Creates a date object from a numeric representation in milliseconds.</p>
	 * @param milliseconds A numeric representation of date in milliseconds.
	 * @return The newly created date object.
	 * @see #date()
	 * @see #date(String)
	 * @see js.core.JsDate#JsDate(Number)
	 * @see js.core.JsDate#JsDate(NumberLike)
	 * @see js.core.JsGlobal.Date#create(Number)
	 * @see js.core.JsGlobal.Date#create(NumberLike)
	 * @see js.core.JsGlobal.Date#create(Vars)
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>new Date(milliseconds)</pre>
	 */
	public static final DateLike date(Number milliseconds) { return s().date(milliseconds);}
	/**
	 * <p>Creates a date object from a string representation.</p>
	 * @param datestring A string representation of date.
	 * @return The newly created date object.
	 * @see #date()
	 * @see #date(Number)
	 * @see js.core.JsDate#JsDate(String)
	 * @see js.core.JsDate#JsDate(StringLike)
	 * @see js.core.JsGlobal.Date#create(Object)
	 * @see js.core.JsGlobal.Date#create(Vars)
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>new Date(datestring)</pre>
	 */
	public static final DateLike date(String datestring) { return s().date(datestring);}
	/**
	 * <p>Returns the math-like object.</p>
	 * @return The math-like object.
	 * @see js.core.JsGlobal.Math
	 * @see jsx.core.Maths
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>Math</pre>
	 */
	public static final MathLike math() { return s().math();}
	/**
	 * <p>Creates and returns a newly created object.</p>
	 * @return The newly created object.
	 * @see #object(Object)
	 * @see Initializer#var()
	 * @see js.core.JsObject#JsObject()
	 * @see js.core.JsGlobal.Object#create()
	 * @see js.core.JsGlobal.Object#invoke()
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>{}</pre>
	 */
	public static final ObjectLike object() { return s().object();}
	/**
	 * <p>Converts a value to an object and returns it.</p>
	 * @param o A value to be converted to object. If this argument is a primitive value, 
	 * this method creates a corresponding object for it. Otherwise, the method returns 
	 * the object itself.
	 * @return The converted or created object. If the argument is a primitive value, 
	 * this method returns a corresponding object for it. Otherwise, the method returns 
	 * the object argument itself.
	 * @see #object()
	 * @see js.core.JsObject#JsObject(JsObject)
	 * @see js.core.JsGlobal.Object#create(Boolean)
	 * @see js.core.JsGlobal.Object#create(JsBoolean)
	 * @see js.core.JsGlobal.Object#create(Value)
	 * @see js.core.JsGlobal.Object#create(Number)
	 * @see js.core.JsGlobal.Object#create(NumberLike)
	 * @see js.core.JsGlobal.Object#create(String)
	 * @see js.core.JsGlobal.Object#create(StringLike)
	 * @see js.core.JsGlobal.Object#invoke(Boolean)
	 * @see js.core.JsGlobal.Object#invoke(JsBoolean)
	 * @see js.core.JsGlobal.Object#invoke(Value)
	 * @see js.core.JsGlobal.Object#invoke(Number)
	 * @see js.core.JsGlobal.Object#invoke(NumberLike)
	 * @see js.core.JsGlobal.Object#invoke(String)
	 * @see js.core.JsGlobal.Object#invoke(StringLike)
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>Object(o)</pre>
	 */
	public static final ObjectLike object(Object o) { return s().object(o);}
	/**
	 * <p>Creates a regular expression with the specified pattern.</p>
	 * @param regex A string that specifies the pattern of the regular expression.
	 * @return A new regular expression object, with the specified pattern.
	 * @throws RuntimeException JavaScript throws a <tt>SyntaxError</tt> If <tt>regex</tt> 
	 * is not a legal regular expression. See {@link Js#err(Object)} and {@link js.core.JsSyntaxError} 
	 * for JS Simulation.
	 * @see #re(String, String)
	 * @see js.core.JsRegExp#JsRegExp(String)
	 * @see js.core.JsGlobal.RegExp#create(Object)
	 * @see js.core.JsGlobal.RegExp#create(Vars)
	 * @see js.core.JsGlobal.RegExp#invoke(Object)
	 * @see js.core.JsGlobal.RegExp#invoke(Vars)
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>RegExp(regex)</pre>
	 * or if <tt>regex</tt> is a string literal,
	 * <pre>/regex/</pre>
	 * where <tt>regex</tt> is converted to a literal text.
	 */
	public static final RegExpLike re(String regex) { return s().re(regex);}
	/**
	 * <p>Creates a regular expression with the specified pattern and flags.</p>
	 * @param regex A string that specifies the pattern of the regular expression.
	 * @param flags An optional string containing any of the "g", "i", and "m" attributes 
	 * that specify global, case-insensitive, and multiline matches, respectively. The "m" 
	 * attribute is not available prior to ECMAScript standardization.
	 * @return A new regular expression object, with the specified pattern and flags.
	 * @throws RuntimeException JavaScript throws a <tt>SyntaxError</tt> If <tt>regex</tt> 
	 * is not a legal regular expression, or if <tt>flags</tt> contains characters other than 
	 * "g", "i", and "m". See {@link Js#err(Object)} and {@link js.core.JsSyntaxError} for 
	 * JS Simulation.
	 * @see #re(String)
	 * @see js.core.JsRegExp#JsRegExp(String, String)
	 * @see js.core.JsGlobal.RegExp#create(Object, Object)
	 * @see js.core.JsGlobal.RegExp#create(Vars)
	 * @see js.core.JsGlobal.RegExp#invoke(Object, Object)
	 * @see js.core.JsGlobal.RegExp#invoke(Vars)
	 * @since 1.0
	 * @javascript Re-compilers must replace this static invocation with the JavaScript expression:
	 * <pre>RegExp(regex, flags)</pre>
	 * or if <tt>regex</tt> and <tt>flags</tt> are both string literals, 
	 * <pre>/regex/flags</pre>
	 * where <tt>regex</tt> and <tt>flags</tt> are converted to literal texts.
	 */
	public static final RegExpLike re(String regex, String flags) { return s().re(regex, flags);}
	/**
	 * <p>Returns an instance of XMLHttpRequest in Java version.</p>
	 * @return The instance of XMLHttpRequest in Java version.
	 * @see js.dom.DOM.XMLHttpRequest#create()
	 * @see js.dom.DOM.XMLHttpRequest#invoke()
	 * @see jsx.http.Http#create()
	 * @see jsx.http.Http#create2()
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>new XMLHttpRequest()</pre>
	 */
	public static final JsXMLHttpRequest http() { return s().http();}
	/**
	 * <p>Creates an OLE Automation (ActiveX) object for Internet Explorer.</p>
	 * @param cls The class of the OLE Automation (ActiveX) object being created.
	 * @return The newly created OLE Automation (ActiveX) object.
	 * @see js.dom.DOM.ActiveXObject#create(Object)
	 * @see js.dom.DOM.ActiveXObject#create(String)
	 * @see js.dom.DOM.ActiveXObject#create(Vars)
	 * @see jsx.http.Http#create()
	 * @see jsx.http.Http#create2()
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>new ActiveXObject(cls)</pre>
	 */
	public static final JsObject activeX(String cls) { return s().activeX(cls);}

	/**
	 * <p>Connects to a Java class in an applet and returns a LiveConnect class.</p>
	 * @param applet The applet ID where the Java class is to be connected to.
	 * @param cls The Java class to be connected to.
	 * @return The LiveConnect class connected to the Java class.
	 * @see #connect(Object)
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>applet.cls</pre>
	 * where <tt>applet</tt> and <tt>cls</tt> must be both string literals and converted 
	 * into identifiers.
	 */
	public static final LiveClass connect(String applet, String cls) { return s().connect(applet, cls);}
	/**
	 * <p>Connects to a Java object and returns a LiveConnect object.</p>
	 * @param obj The Java object to be connected to.
	 * @return The LiveConnect object connected to the Java object.
	 * @see #connect(String, String)
	 * @since 1.0
	 * @javascript Re-compilers must replace this static invocation with the JavaScript expression:
	 * <pre>obj</pre>
	 * where <tt>obj</tt> must be a string literal and converted to an identifier.
	 */
	public static final LiveObject connect(Object obj) { return s().connect(obj);}

	private static final class Err extends RuntimeException
	{
		private static final long serialVersionUID = 1L;
		private final Object var;

		private Err(Object var) {
			this.var = var;
		}
		@Override
		public final String toString() {
			return Js.toString(var);
		}
		public final String typeof() {
			return Js.typeof(var);
		}
		public final boolean undefined() {
			return Js.undefined(var);
		}
		public final Object valueOf() {
			return Js.valueOf(var);
		}
	}
	/**
	 * <p>Makes a variable runtime throwable, resembling JavaScript.</p>
	 * @param v Any value or object.
	 * @return A <tt>RuntimeException</tt> wrapping the value or object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final RuntimeException err(Object v) {
		return v instanceof Err ? (Err)v : new Err(v);
	}
	/**
	 * <p>Gets the value or object contained in a <tt>RuntimeException</tt> object 
	 * thrown by JS Simulation.</p>
	 * @param e The <tt>RuntimeException</tt> object thrown by JS Simulation.
	 * @return The value or object contained in the <tt>RuntimeException</tt> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final Object err(RuntimeException e) {
		return e instanceof Err ? ((Err)e).var : s().err(e);
	}
	/**
	 * <p>Checks if a variable is undefined.</p>
	 * @param v Any value or object.
	 * @return <tt>true</tt> if <tt>v</tt> is undefined; <tt>false</tt>, otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v===undefined</pre>
	 */
	public static final boolean undefined(Object v) {
		return v == null ||
		       v instanceof Err && ((Err)v).undefined() ||
		       v instanceof Var<?> && ((Var<?>)v).undefined();
	}
	/**
	 * <p>Checks if a variable is defined.</p>
	 * @param v Any value or object.
	 * @return <tt>true</tt> if <tt>v</tt> is defined; <tt>false</tt>, otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v!==undefined</pre>
	 */
	public static final boolean defined(Object v) {
		return !undefined(v);
	}
	/**
	 * <p>Checks if a variable represents a Java object.</p>
	 * @param v Any value or object.
	 * @return <tt>true</tt> if <tt>v</tt> is Java; <tt>false</tt>, otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v instanceof JavaObject</pre>
	 */
	public static final boolean isJavaObject(Object v) {
		return s().isJavaObject(v);
	}
	/**
	 * <p>Returns a string representation of a variable.</p>
	 * @param v Any value or object.
	 * @return The string representation of the value or object.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>"" + v</pre>
	 */
	public static final String toString(Object v) {
		return undefined(v) ? "undefined" : v.toString();
	}

	/**
	 * <p>Logically evaluates a variable.</p>
	 * @param v The variable.
	 * @return The logical value of the variable.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final boolean be(boolean v) {
		return v;
	}
	/**
	 * <p>Logically evaluates a variable.</p>
	 * @param v The variable.
	 * @return The logical value of the variable.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final boolean be(Boolean v) {
		return v != null && v;
	}
	/**
	 * <p>Logically evaluates a variable.</p>
	 * @param v The variable.
	 * @return The logical value of the variable.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final boolean be(Character v) {
		return v != null && v != 0;
	}
	/**
	 * <p>Logically evaluates a variable.</p>
	 * @param v The variable.
	 * @return The logical value of the variable.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final boolean be(char v) {
		return v != 0;
	}
	/**
	 * <p>Logically evaluates a variable.</p>
	 * @param v The variable.
	 * @return The logical value of the variable.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final boolean be(Number v) {
		return v != null && v.doubleValue() != 0;
	}
	/**
	 * <p>Logically evaluates a variable.</p>
	 * @param v The variable.
	 * @return The logical value of the variable.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final boolean be(byte v) {
		return v != 0;
	}
	/**
	 * <p>Logically evaluates a variable.</p>
	 * @param v The variable.
	 * @return The logical value of the variable.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final boolean be(short v) {
		return v != 0;
	}
	/**
	 * <p>Logically evaluates a variable.</p>
	 * @param v The variable.
	 * @return The logical value of the variable.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final boolean be(int v) {
		return v != 0;
	}
	/**
	 * <p>Logically evaluates a variable.</p>
	 * @param v The variable.
	 * @return The logical value of the variable.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final boolean be(long v) {
		return v != 0;
	}
	/**
	 * <p>Logically evaluates a variable.</p>
	 * @param v The variable.
	 * @return The logical value of the variable.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final boolean be(float v) {
		return v != 0;
	}
	/**
	 * <p>Logically evaluates a variable.</p>
	 * @param v The variable.
	 * @return The logical value of the variable.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final boolean be(double v) {
		return v != 0;
	}
	/**
	 * <p>Logically evaluates a variable.</p>
	 * @param v The variable.
	 * @return The logical value of the variable.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final boolean be(String v) {
		return v != null && v.length() > 0;
	}
	/**
	 * <p>Logically evaluates a variable.</p>
	 * @param v The variable.
	 * @return The logical value of the variable.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final boolean be(ArrayLike<?> v) {
		return defined(v) && v.length() > 0;
	}
	/**
	 * <p>Logically evaluates a variable.</p>
	 * @param v The variable.
	 * @return The logical value of the variable.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final boolean be(JsArray v) {
		return defined(v) && v.length() > 0;
	}
	/**
	 * <p>Logically evaluates a variable.</p>
	 * @param v The variable.
	 * @return The logical value of the variable.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final boolean be(Var<?> v) {
		return v instanceof ArrayLike<?> ? be((ArrayLike<?>)v) :
		       v instanceof NumberLike<?>  ||
		       v instanceof StringLike ? be(v.valueOf()) : defined(v);
	}
	/**
	 * <p>Logically evaluates a variable.</p>
	 * @param v The variable.
	 * @return The logical value of the variable.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the static invocation of this method, that is, 
	 * replacing it with its only argument.
	 */
	public static final boolean be(Object v) {
		return v instanceof Boolean      ? be((Boolean     )v) :
		       v instanceof Character    ? be((Character   )v) :
		       v instanceof Number       ? be((Number      )v) :
		       v instanceof String       ? be((String      )v) :
		       v instanceof ArrayLike<?> ? be((ArrayLike<?>)v) :
		       v instanceof Var<?>       ? be((Var<?>      )v) : v != null;
	}

	/**
	 * <p>Returns a string indicating the data-type of the argument.</p>
	 * <p>Simulating the JavaScript <tt>typeof</tt> operator and <tt>typeof()</tt> 
	 * function, this invocation evaluates to "number", "string", or "boolean" if the  
	 * argument is a number, string, or boolean value. It evaluates to "object" for objects 
	 * and arrays. It evaluates to "function" for function instance and to "undefined" if 
	 * the argument is undefined.</p>
	 * @param v Any value or object.
	 * @return A string indicating the data-type of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>typeof v</pre>
	 */
	public static final String typeof(Object v) {
		return v == null ? "undefined" :
		       v instanceof Boolean ? "boolean" :
		       v instanceof Function<?> ? "function" :
		       v instanceof Character ? "number" :
		       v instanceof Long ? "object" :
		       v instanceof Number ? "number" :
			   v instanceof String ? "string" :
		       v instanceof Err ? ((Err)v).typeof() :
		       v instanceof Var<?> ? ((Var<?>)v).typeof() : "object";
	}

	/**
	 * <p>Returns the primitive value associated with the argument, if there is one. 
	 * @param v Any value or object.
	 * @return The primitive string value associated with the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v.valueOf()</pre>
	 */
	public static final Boolean valueOf(Boolean v) {
		return v;
	}
	/**
	 * <p>Returns the primitive value associated with the argument, if there is one. 
	 * @param v Any value or object.
	 * @return The primitive string value associated with the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v.valueOf()</pre>
	 */
	public static final Number valueOf(Number v) {
		return v;
	}
	/**
	 * <p>Returns the primitive value associated with the argument, if there is one. 
	 * @param v Any value or object.
	 * @return The primitive string value associated with the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v.valueOf()</pre>
	 */
	public static final Byte valueOf(Byte v) {
		return v;
	}
	/**
	 * <p>Returns the primitive value associated with the argument, if there is one. 
	 * @param v Any value or object.
	 * @return The primitive string value associated with the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v.valueOf()</pre>
	 */
	public static final Short valueOf(Character v) {
		return v == null ? null : (short)v.charValue();
	}
	/**
	 * <p>Returns the primitive value associated with the argument, if there is one. 
	 * @param v Any value or object.
	 * @return The primitive string value associated with the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v.valueOf()</pre>
	 */
	public static final Short valueOf(Short v) {
		return v;
	}
	/**
	 * <p>Returns the primitive value associated with the argument, if there is one. 
	 * @param v Any value or object.
	 * @return The primitive string value associated with the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v.valueOf()</pre>
	 */
	public static final Integer valueOf(Integer v) {
		return v;
	}
	/**
	 * <p>Returns the primitive value associated with the argument, if there is one. 
	 * @param v Any value or object.
	 * @return The primitive string value associated with the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v.valueOf()</pre>
	 */
	public static final Long valueOf(Long v) {
		return v;
	}
	/**
	 * <p>Returns the primitive value associated with the argument, if there is one. 
	 * @param v Any value or object.
	 * @return The primitive string value associated with the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v.valueOf()</pre>
	 */
	public static final Float valueOf(Float v) {
		return v;
	}
	/**
	 * <p>Returns the primitive value associated with the argument, if there is one. 
	 * @param v Any value or object.
	 * @return The primitive string value associated with the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v.valueOf()</pre>
	 */
	public static final Double valueOf(Double v) {
		return v;
	}
	/**
	 * <p>Returns the primitive value associated with the argument, if there is one. 
	 * @param v Any value or object.
	 * @return The primitive string value associated with the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v.valueOf()</pre>
	 */
	public static final String valueOf(String v) {
		return v;
	}
	/**
	 * <p>Returns the primitive value associated with the argument, if there is one. 
	 * @param v Any value or object.
	 * @return The primitive string value associated with the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v.valueOf()</pre>
	 */
	public static final <T> ArrayLike<T> valueOf(ArrayLike<T> v) {
		return v == null ? null : v.valueOf();
	}
	/**
	 * <p>Returns the primitive value associated with the argument, if there is one. 
	 * @param v Any value or object.
	 * @return The primitive string value associated with the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v.valueOf()</pre>
	 */
	@SuppressWarnings("unchecked")
	public static final <T extends JsObject> T valueOf(T v) {
		return v == null ? null : (T)v.valueOf();
	}
	/**
	 * <p>Returns the primitive value associated with the argument, if there is one. 
	 * @param v Any value or object.
	 * @return The primitive string value associated with the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v.valueOf()</pre>
	 */
	public static final Boolean valueOf(JsBoolean v) {
		return v == null ? null : v.valueOf();
	}
	/**
	 * <p>Returns the primitive value associated with the argument, if there is one. 
	 * @param v Any value or object.
	 * @return The primitive string value associated with the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v.valueOf()</pre>
	 */
	public static final Number valueOf(DateLike v) {
		return v == null ? null : v.valueOf();
	}
	/**
	 * <p>Returns the primitive value associated with the argument, if there is one. 
	 * @param v Any value or object.
	 * @return The primitive string value associated with the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v.valueOf()</pre>
	 */
	public static final <T> JsFunction<T> valueOf(Function<T> v) {
		return v == null ? null : v.valueOf();
	}
	/**
	 * <p>Returns the primitive value associated with the argument, if there is one. 
	 * @param v Any value or object.
	 * @return The primitive string value associated with the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v.valueOf()</pre>
	 */
	public static final <T extends Number> T valueOf(NumberLike<T> v) {
		return v == null ? null : v.valueOf();
	}
	/**
	 * <p>Returns the primitive value associated with the argument, if there is one. 
	 * @param v Any value or object.
	 * @return The primitive string value associated with the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v.valueOf()</pre>
	 */
	public static final Number valueOf(JsNumber v) {
		return v == null ? null : v.valueOf();
	}
	/**
	 * <p>Returns the primitive value associated with the argument, if there is one. 
	 * @param v Any value or object.
	 * @return The primitive string value associated with the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v.valueOf()</pre>
	 */
	public static final String valueOf(StringLike v) {
		return v == null ? null : v.valueOf();
	}
	/**
	 * <p>Returns the primitive value associated with the argument, if there is one. 
	 * @param v Any value or object.
	 * @return The primitive string value associated with the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v.valueOf()</pre>
	 */
	public static final String valueOf(JsString v) {
		return v == null ? null : v.valueOf();
	}
	/**
	 * <p>Returns the primitive value associated with the argument, if there is one. 
	 * @param v Any value or object.
	 * @return The primitive string value associated with the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v.valueOf()</pre>
	 */
	public static final <T> T valueOf(Var<T> v) {
		return v == null ? null : v.var();
	}
	/**
	 * <p>Returns the primitive value associated with the argument, if there is one. 
	 * @param v Any value or object.
	 * @return The primitive string value associated with the argument.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>v.valueOf()</pre>
	 */
	public static final Object valueOf(Object v) {
		return v == null ? null :
		       v instanceof Function<?> ? ((Function<?>)v).valueOf() :
		       v instanceof Var<?> ? ((Var<?>)v).valueOf() :
		       v instanceof Err ? ((Err)v).valueOf() : v;
	}

	/**
	 * <p>Undefines a variable.</p>
	 * @param var The variable to delete.
	 * @return <tt>true</tt> if the deletion is successful; Otherwise, <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>delete var</pre>
	 */
	public static final boolean delete(Value<?> var) { 
		return var == null ? false : var.delete();
	}
	/**
	 * <p>Undefines a variable.</p>
	 * @param var The variable to delete.
	 * @return <tt>true</tt> if the deletion is successful; Otherwise, <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>delete var</pre>
	 */
	public static final boolean delete(Var<? extends JsObject> var) { 
		return var == null ? false : delete(var.var());
	}
	/**
	 * <p>Undefines a variable.</p>
	 * @param var The variable to delete.
	 * @return <tt>true</tt> if the deletion is successful; Otherwise, <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>delete var</pre>
	 */
	public static final boolean delete(JsObject var) { 
		return var == null ? false : var.delete();
	}
	/**
	 * <p>Undefines a property.</p>
	 * @param var The variable to delete a property from.
	 * @param p The property to delete.
	 * @return <tt>true</tt> if the deletion is successful; Otherwise, <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>delete var[p]</pre>
	 */
	public static final boolean delete(Var<? extends JsObject> var, Object p) {
		return var == null ? false : delete(var.var(), p);
	}
	/**
	 * <p>Undefines a property.</p>
	 * @param var The variable to delete a property from.
	 * @param p The property to delete.
	 * @return <tt>true</tt> if the deletion is successful; Otherwise, <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>delete var[p]</pre>
	 */
	public static final boolean delete(ObjectLike var, Object p) {
		return var == null ? false : var.delete(p.toString());
	}
	/**
	 * <p>Undefines a property.</p>
	 * @param var The variable to delete a property from.
	 * @param p The property to delete.
	 * @return <tt>true</tt> if the deletion is successful; Otherwise, <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>delete var[p]</pre>
	 */
	public static final boolean delete(JsObject var, Object p) {
		return var == null ? false : var.delete(p.toString());
	}
	/**
	 * <p>Delete an array element.</p>
	 * @param var The array to delete an element from.
	 * @param i The array index of the element to delete.
	 * @return <tt>true</tt> if the deletion is successful; Otherwise, <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>delete var[i]</pre>
	 */
	public static final boolean delete(ArrayLike<?> var, int i) {
		return var == null ? false : var.delete(i);
	}

	/**
	 * <p>Performs unary negation, resembling the unary minus operator in JavaScript.</p>
	 * <p>This operation converts a positive value to an equivalently negative value, and 
	 * vice versa. If the operand is not a number, it attempts to convert it to one.</p>
	 * @param var Any numeric value.
	 * @return The negation of the numeric value.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>-var</pre>
	 */
	public static final Number neg(Object var) { return s().neg(s().getNumber(var));}
	/**
	 * <p>Multiplies the two operands, resembling the multiplication operator in JavaScript.</p>
	 * <p>If used with non-numeric operands, this operation attempts to convert them to 
	 * numbers.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return The product of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var * other</pre>
	 */
	public static final Number mul(Object var, Object other) { return s().mul(s().getNumber(var), s().getNumber(other));}
	/**
	 * <p>Divides the first operand by the second, resembling the division operator 
	 * in JavaScript.</p>
	 * <p>Used with non-numeric operands, this operation attempts to convert them to 
	 * numbers. If you are used to programming languages that distinguish between integer 
	 * and floating-point numbers, you might expect to get an integer result when you 
	 * divide one integer by another. In JavaScript, however, all numbers are floating-point, 
	 * so all division operations have floating-point results. Division by zero yields positive 
	 * or negative infinity, while <tt>0/0</tt> evaluates to <tt>NaN</tt>.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return The quotient of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var / other</pre>
	 */
	public static final Number div(Object var, Object other) { return s().div(s().getNumber(var), s().getNumber(other));}
	/**
	 * <p>Computes the first operand modulo the second operand, resembling the modulo 
	 * operator in JavaScript.</p>
	 * <p>The operation returns the remainder when the first operand is divided by the 
	 * second operand a certain number of times. If used with non-numeric operands, the 
	 * operation attempts to convert them to numbers. The sign of the result is the same 
	 * as the sign of the first operand.</p>
	 * <p>This operation is typically used with integer operands, it also works for 
	 * floating-point values.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return The remainder.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var % other</pre>
	 */
	public static final Number mod(Object var, Object other) { return s().mod(s().getNumber(var), s().getNumber(other));}
	/**
	 * <p>Subtracts the second operand from the first operand, resembling the modulo 
	 * operator in JavaScript.</p>
	 * <p>If used with non-numeric operands, this operation attempts to convert them to 
	 * numbers.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return The difference between the operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var - other</pre>
	 */
	public static final Number sub(Object var, Object other) { return s().add(s().getNumber(var), neg(other));}
	private static final String cat(Object var, Object other) {
		return Js.toString(var).concat(Js.toString(other));
	}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final Object add(Object var, Object other) {
		Number n1 = s().getNumber(var);
		if (n1 == null) {
			return Js.toString(var).concat(Js.toString(other));
		} else {
			Number n2 = s().getNumber(other);
			if (n2 == null) {
				return cat(var, other);
			} else {
				return s().add(n1, n2);
			}
		}
	}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final String add(Object var, String other) { return cat(var, other);}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final String add(Object var, StringLike other) { return cat(var, other);}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final String add(String var, Object other) { return cat(var, other);}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final String add(String var, String other) { return cat(var, other);}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final String add(String var, StringLike other) { return cat(var, other);}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final String add(StringLike var, Object other) { return cat(var, other);}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final String add(StringLike var, String other) { return cat(var, other);}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final String add(StringLike var, StringLike other) { return cat(var, other);}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final Number add(Character var, Character other) { return s().add(valueOf(var), valueOf(other));}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final Number add(Character var, Var<Character> other) { return s().add(valueOf(var), valueOf(other.var()));}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final Number add(Character var, Number other) { return s().add(valueOf(var), other);}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final Number add(Character var, NumberLike<? extends Number> other) { return s().add(valueOf(var), valueOf(other));}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final Number add(Var<Character> var, Character other) { return s().add(valueOf(var.var()), valueOf(other));}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final Number add(Var<Character> var, Var<Character> other) { return s().add(valueOf(var.var()), valueOf(other.var()));}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final Number add(Var<Character> var, Number other) { return s().add(valueOf(var.var()), other);}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final Number add(Var<Character> var, NumberLike<? extends Number> other) { return s().add(valueOf(var.var()), valueOf(other));}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final Number add(Number var, Character other) { return s().add(var, valueOf(other));}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final Number add(Number var, Var<Character> other) { return s().add(var, valueOf(other.var()));}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final Number add(Number var, Number other) { return s().add(var, other);}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final Number add(Number var, NumberLike<? extends Number> other) { return s().add(var, valueOf(other));}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final Number add(NumberLike<? extends Number> var, Character other) { return s().add(valueOf(var), valueOf(other));}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final Number add(NumberLike<? extends Number> var, Var<Character> other) { return s().add(valueOf(var), valueOf(other.var()));}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final Number add(NumberLike<? extends Number> var, Number other) { return s().add(valueOf(var), other);}
	/**
	 * <p>Adds numeric operands or concatenates string operands, resembling the addition 
	 * operator in JavaScript.</p>
	 * <p>If one operand is a string, the other is converted to a string, and the two 
	 * strings are then concatenated. Object operands are converted to numbers or strings 
	 * that can be added or concatenated. The conversion is performed by {@link #valueOf(Object)}  
	 * method and/or the {@link #toString(Object)} method on the object.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The sum or concatenation of the values.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var + other</pre>
	 */
	public static final Number add(NumberLike<? extends Number> var, NumberLike<? extends Number> other) { return s().add(valueOf(var), valueOf(other));}

	/**
	 * <p>Checks if the first operand is the name of a property of the second, resembling 
	 * the <tt>in</tt> operator in JavaScript.</p>
	 * <p>This operation converts the first operand to a string and expects the second 
	 * operand be an object (or array).</p>
	 * @param var Any value that is or can be converted to a string.
	 * @param other Any object or array.
	 * @return <tt>true</tt> if the first operand is the name of a property of the 
	 * second operand; <tt>false</tt>, otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var in other</pre>
	 */
	public static final boolean in(Object var, Object other) { return s().in(var, other);}
	/**
	 * <p>Checks if the first operand is an instance of the second, resembling the 
	 * <tt>instanceof</tt> operator in JavaScript.</p>
	 * <p>This operation expects the first operand be an object and the second be a class 
	 * of objects. In JavaScript, classes of objects are defined by the constructor function 
	 * that initializes them.</p>
	 * @param var Any value or object.
	 * @param other A constructor function.
	 * @return <tt>true</tt> if the first operand is an instance of the second; 
	 * <tt>false</tt>, otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var instanceof other</pre>
	 */
	public static final boolean instanceOf(Object var, Object other) { return s().instanceOf(var, other);}

	/**
	 * <p>Shift-left operation, resembling that of JavaScript, moves all bits in the first 
	 * operand to the left by the number of places specified in the second operand, which 
	 * should be an integer between 0 and 31.</p>
	 * <p>A zero is used for the new first bit, and the value of the 32nd bit is lost. 
	 * Shifting a value left by one position is equivalent to multiplying by 2, shifting 
	 * two positions is equivalent to multiplying by 4, etc.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with operands that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
	 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
	 * the 32nd. The shift operation requires a right-side operand between 0 and 31. After 
	 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
	 * yields a number in the appropriate range.</p>
	 * @param var A numeric value.
	 * @param n The number of bits to shift.
	 * @return The shifted integer number.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var << n</pre>
	 */
	public static final int shl (Object var, int n) { return s().getNumber(var).intValue() << n;}
	/**
	 * <p>Shift-right operation, resembling that of JavaScript, moves all bits in the first 
	 * operand to the right by the number of places specified in the second operand (an 
	 * integer between 0 and 31). Bits that are shifted off the right are lost. The bits 
	 * filled in on the left depend on the sign bit of the original operand, in order to 
	 * preserve the sign of the result. If the first operand is positive, the result has 
	 * zeros placed in the high bits; if the first operand is negative, the result has ones 
	 * placed in the high bits.</p>
	 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
	 * remainder), shifting right two places is equivalent to integer division by 4, and 
	 * so on.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with operands that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
	 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
	 * the 32nd. The shift operation requires a right-side operand between 0 and 31. After 
	 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
	 * yields a number in the appropriate range.</p>
	 * @param var A numeric value.
	 * @param n The number of bits to shift.
	 * @return The shifted integer number.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var >> n</pre>
	 */
	public static final int shr (Object var, int n) { return s().getNumber(var).intValue() >> n;}
	/**
	 * <p>Shift-right-unsigned operation, resembling that of JavaScript, moves all bits in 
	 * the first operand to the right by the number of places specified in the second 
	 * operand (an integer between 0 and 31). Bits that are shifted off the right are lost. 
	 * The result has zeros placed in the high bits.</p>
	 * <p>This operation is just like {@link #shr(Object, int)}, except that the bits shifted 
	 * in on the left are always zero, regardless of the sign of the first operand.</p>
	 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
	 * remainder), shifting right two places is equivalent to integer division by 4, and 
	 * so on.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with operands that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
	 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
	 * the 32nd. The shift operation requires a right-side operand between 0 and 31. After 
	 * converting this operand to a 32-bit integer, it drops any bits beyond the 5th, which 
	 * yields a number in the appropriate range.</p>
	 * @param var A numeric value.
	 * @param n The number of bits to shift.
	 * @return The shifted integer number.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var >>> n</pre>
	 */
	public static final int shru(Object var, int n) { return s().getNumber(var).intValue() >>> n;}
	/**
	 * <p>Bitwise-NOT operation, resembling that of JavaScript, operates by reversing all 
	 * bits in the operand.</p>
	 * <p>Because of the way signed integers are represented in JavaScript, applying this 
	 * operation to a value is equivalent to changing its sign and subtracting 1.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with operands that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
	 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
	 * the 32nd.</p>
	 * @param var A numeric value.
	 * @return The bitwise-NOT of the operand.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>~var</pre>
	 */
	public static final int bnot(Object var) { return ~s().getNumber(var).intValue();}
	/**
	 * <p>Bitwise-AND operation, resembling that of JavaScript, performs a boolean AND 
	 * operation on each bit of the integer arguments. A bit is set in the result only if 
	 * the corresponding bit is set in both operands.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with operands that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
	 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
	 * the 32nd.</p>
	 * @param var A numeric value.
	 * @param other A numeric value.
	 * @return The bitwise-AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var & other</pre>
	 */
	public static final int band(Object var, Object other) { return s().getNumber(var).intValue() & s().getNumber(other).intValue();}
	/**
	 * <p>Bitwise-OR operation, resembling that of JavaScript, performs a boolean OR operation 
	 * on each bit of the integer arguments. A bit is set in the result if the corresponding 
	 * bit is set in one or both of the operands.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with operands that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
	 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
	 * the 32nd.</p>
	 * @param var A numeric value.
	 * @param other A numeric value.
	 * @return The bitwise-OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var | other</pre>
	 */
	public static final int bor (Object var, Object other) { return s().getNumber(var).intValue() | s().getNumber(other).intValue();}
	/**
	 * <p>Bitwise-XOR operation, resembling that of JavaScript, performs a boolean exclusive 
	 * OR operation on each bit of the integer arguments. Exclusive OR means that either 
	 * operand one is <tt>true</tt> or operand two is <tt>true</tt>, but not both. A bit is 
	 * set in this operation's result if a corresponding bit is set in one (but not both) 
	 * of the two operands.</p>
	 * <p>Despite the fact that all numbers in JavaScript are floating-point numbers, the bitwise 
	 * operation requires numeric operands that have integer values. It operate on the integer 
	 * operands using a 32-bit integer representation instead of the equivalent floating-point 
	 * representation.</p>
	 * <p>If this bitwise operation is used with operands that are not integers or are too 
	 * large to fit in a 32-bit integer representation, it simply coerces the operands to 
	 * 32-bit integers by dropping any fractional part of the operand or any bits beyond 
	 * the 32nd.</p>
	 * @param var A numeric value.
	 * @param other A numeric value.
	 * @return The bitwise-exclusive-OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var ^ other</pre>
	 */
	public static final int xor (Object var, Object other) { return s().getNumber(var).intValue() ^ s().getNumber(other).intValue();}

	/**
	 * <p>Less-than operation, resembling that of JavaScript, evaluates to <tt>true</tt> if 
	 * the first operand is less than the second operand; otherwise it evaluates to 
	 * <tt>false</tt>.</p>
	 * <p>The operands of this operation may be of any type. Comparison can be performed 
	 * only on numbers and strings, however, so operands that are not numbers or strings 
	 * are converted. Comparison and conversion occur as follows:</p>
	 * <ul>
	 * <li>If both operands are numbers, or if both convert to numbers, they are compared 
	 * numerically.</li>
	 * <li>If both operands are strings or convert to strings, they are compared as 
	 * strings.</li>
	 * <li>If one operand is or converts to a string, and one is or converts to a number, 
	 * the operation attempts to convert the string to a number and performs a numerical 
	 * comparison. If the string does not represent a number, it converts to <tt>NaN</tt>, 
	 * and the comparison is <tt>false</tt>. In JavaScript 1.1, the string-to-number 
	 * conversion causes an error instead of yielding <tt>NaN</tt>.</li>
	 * <li>If an object can be converted to either a number or a string, JavaScript performs 
	 * the numerical conversion. This means, for example, that Date objects are compared 
	 * numerically, and it is meaningful to compare two dates to see whether one is earlier 
	 * than the other.</li>
	 * <li>If the operands of the comparison operations cannot both be successfully converted 
	 * to numbers or to strings, these operations always return <tt>false</tt>.</li>
	 * <li>If either operand is or converts to <tt>NaN</tt>, the comparison operation always 
	 * yields <tt>false</tt>.</li>
	 * </ul>
	 * <p>Keep in mind that string comparison is done on a strict character-by-character 
	 * basis using the numerical value of each character from the Unicode encoding. Although 
	 * in some cases the Unicode standard allows equivalent strings to be encoded using 
	 * different sequences of characters, the JavaScript comparison operations do not 
	 * detect these encoding differences; they assume that all strings are expressed in 
	 * normalized form. Note in particular that string comparison is case-sensitive, and 
	 * in the Unicode encoding (at least for the ASCII subset), all capital letters are 
	 * "less than" all lowercase letters. This rule can cause confusing results if you do 
	 * not expect it.</p>
	 * <p>For a more robust string-comparison algorithm, see the {@link StringLike#localeCompare(Object)} 
	 * method, which also takes locale-specific definitions of alphabetical order into account. 
	 * For case-insensitive comparisons, you must first convert the strings to all lowercase or 
	 * all uppercase using {@link StringLike#toLowerCase()} or {@link StringLike#toUpperCase()}.</p>
	 * <p>The less-than-or-equal and greater-than-or-equal operations do not rely on the 
	 * equality or identity operations for determining whether two values are "equal." 
	 * Instead, the less-than-or-equal operator is simply defined as "not greater than", 
	 * and the greater-than-or-equal operator is defined as "not less than". The one 
	 * exception occurs when either operand is (or converts to) <tt>NaN</tt>, in which case 
	 * all comparison operations return <tt>false</tt>.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return <tt>true</tt> if the first operand is less than the second operand; 
	 * otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var < other</pre>
	 */
	public static final boolean lt (Object var, Object other) { return s().lt(var, other);}
	/**
	 * <p>Greater-than operation, resembling that of JavaScript, evaluates to <tt>true</tt> if 
	 * the first operand is greater than the second operand; otherwise it evaluates to 
	 * <tt>false</tt>.</p>
	 * <p>The operands of this operation may be of any type. Comparison can be performed 
	 * only on numbers and strings, however, so operands that are not numbers or strings 
	 * are converted. Comparison and conversion occur as follows:</p>
	 * <ul>
	 * <li>If both operands are numbers, or if both convert to numbers, they are compared 
	 * numerically.</li>
	 * <li>If both operands are strings or convert to strings, they are compared as 
	 * strings.</li>
	 * <li>If one operand is or converts to a string, and one is or converts to a number, 
	 * the operation attempts to convert the string to a number and performs a numerical 
	 * comparison. If the string does not represent a number, it converts to <tt>NaN</tt>, 
	 * and the comparison is <tt>false</tt>. In JavaScript 1.1, the string-to-number 
	 * conversion causes an error instead of yielding <tt>NaN</tt>.</li>
	 * <li>If an object can be converted to either a number or a string, JavaScript performs 
	 * the numerical conversion. This means, for example, that Date objects are compared 
	 * numerically, and it is meaningful to compare two dates to see whether one is earlier 
	 * than the other.</li>
	 * <li>If the operands of the comparison operations cannot both be successfully converted 
	 * to numbers or to strings, these operations always return <tt>false</tt>.</li>
	 * <li>If either operand is or converts to <tt>NaN</tt>, the comparison operation always 
	 * yields <tt>false</tt>.</li>
	 * </ul>
	 * <p>Keep in mind that string comparison is done on a strict character-by-character 
	 * basis using the numerical value of each character from the Unicode encoding. Although 
	 * in some cases the Unicode standard allows equivalent strings to be encoded using 
	 * different sequences of characters, the JavaScript comparison operations do not 
	 * detect these encoding differences; they assume that all strings are expressed in 
	 * normalized form. Note in particular that string comparison is case-sensitive, and 
	 * in the Unicode encoding (at least for the ASCII subset), all capital letters are 
	 * "less than" all lowercase letters. This rule can cause confusing results if you do 
	 * not expect it.</p>
	 * <p>For a more robust string-comparison algorithm, see the {@link StringLike#localeCompare(Object)} 
	 * method, which also takes locale-specific definitions of alphabetical order into account. 
	 * For case-insensitive comparisons, you must first convert the strings to all lowercase or 
	 * all uppercase using {@link StringLike#toLowerCase()} or {@link StringLike#toUpperCase()}.</p>
	 * <p>The less-than-or-equal and greater-than-or-equal operations do not rely on the 
	 * equality or identity operations for determining whether two values are "equal." 
	 * Instead, the less-than-or-equal operator is simply defined as "not greater than", 
	 * and the greater-than-or-equal operator is defined as "not less than". The one 
	 * exception occurs when either operand is (or converts to) <tt>NaN</tt>, in which case 
	 * all comparison operations return <tt>false</tt>.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return <tt>true</tt> if the first operand is greater than the second operand; 
	 * otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var > other</pre>
	 */
	public static final boolean gt (Object var, Object other) { return s().gt(var, other);}
	/**
	 * <p>Less-than-or-equal operation, resembling that of JavaScript, evaluates to 
	 * <tt>true</tt> if the first operand is less than or equal to the second operand; 
	 * otherwise it evaluates to <tt>false</tt>.</p>
	 * <p>The operands of this operation may be of any type. Comparison can be performed 
	 * only on numbers and strings, however, so operands that are not numbers or strings 
	 * are converted. Comparison and conversion occur as follows:</p>
	 * <ul>
	 * <li>If both operands are numbers, or if both convert to numbers, they are compared 
	 * numerically.</li>
	 * <li>If both operands are strings or convert to strings, they are compared as 
	 * strings.</li>
	 * <li>If one operand is or converts to a string, and one is or converts to a number, 
	 * the operation attempts to convert the string to a number and performs a numerical 
	 * comparison. If the string does not represent a number, it converts to <tt>NaN</tt>, 
	 * and the comparison is <tt>false</tt>. In JavaScript 1.1, the string-to-number 
	 * conversion causes an error instead of yielding <tt>NaN</tt>.</li>
	 * <li>If an object can be converted to either a number or a string, JavaScript performs 
	 * the numerical conversion. This means, for example, that Date objects are compared 
	 * numerically, and it is meaningful to compare two dates to see whether one is earlier 
	 * than the other.</li>
	 * <li>If the operands of the comparison operations cannot both be successfully converted 
	 * to numbers or to strings, these operations always return <tt>false</tt>.</li>
	 * <li>If either operand is or converts to <tt>NaN</tt>, the comparison operation always 
	 * yields <tt>false</tt>.</li>
	 * </ul>
	 * <p>Keep in mind that string comparison is done on a strict character-by-character 
	 * basis using the numerical value of each character from the Unicode encoding. Although 
	 * in some cases the Unicode standard allows equivalent strings to be encoded using 
	 * different sequences of characters, the JavaScript comparison operations do not 
	 * detect these encoding differences; they assume that all strings are expressed in 
	 * normalized form. Note in particular that string comparison is case-sensitive, and 
	 * in the Unicode encoding (at least for the ASCII subset), all capital letters are 
	 * "less than" all lowercase letters. This rule can cause confusing results if you do 
	 * not expect it.</p>
	 * <p>For a more robust string-comparison algorithm, see the {@link StringLike#localeCompare(Object)} 
	 * method, which also takes locale-specific definitions of alphabetical order into account. 
	 * For case-insensitive comparisons, you must first convert the strings to all lowercase or 
	 * all uppercase using {@link StringLike#toLowerCase()} or {@link StringLike#toUpperCase()}.</p>
	 * <p>The less-than-or-equal and greater-than-or-equal operations do not rely on the 
	 * equality or identity operations for determining whether two values are "equal." 
	 * Instead, the less-than-or-equal operator is simply defined as "not greater than", 
	 * and the greater-than-or-equal operator is defined as "not less than". The one 
	 * exception occurs when either operand is (or converts to) <tt>NaN</tt>, in which case 
	 * all comparison operations return <tt>false</tt>.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return <tt>true</tt> if the first operand is less than or equal to the second operand; 
	 * otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var <= other</pre>
	 */
	public static final boolean lte(Object var, Object other) { return s().lte(var, other);}
	/**
	 * <p>Greater-than-or-equal operation, resembling that of JavaScript, evaluates to 
	 * <tt>true</tt> if the first operand is greater than or equal to the second operand; 
	 * otherwise it evaluates to <tt>false</tt>.</p>
	 * <p>The operands of this operation may be of any type. Comparison can be performed 
	 * only on numbers and strings, however, so operands that are not numbers or strings 
	 * are converted. Comparison and conversion occur as follows:</p>
	 * <ul>
	 * <li>If both operands are numbers, or if both convert to numbers, they are compared 
	 * numerically.</li>
	 * <li>If both operands are strings or convert to strings, they are compared as 
	 * strings.</li>
	 * <li>If one operand is or converts to a string, and one is or converts to a number, 
	 * the operation attempts to convert the string to a number and performs a numerical 
	 * comparison. If the string does not represent a number, it converts to <tt>NaN</tt>, 
	 * and the comparison is <tt>false</tt>. In JavaScript 1.1, the string-to-number 
	 * conversion causes an error instead of yielding <tt>NaN</tt>.</li>
	 * <li>If an object can be converted to either a number or a string, JavaScript performs 
	 * the numerical conversion. This means, for example, that Date objects are compared 
	 * numerically, and it is meaningful to compare two dates to see whether one is earlier 
	 * than the other.</li>
	 * <li>If the operands of the comparison operations cannot both be successfully converted 
	 * to numbers or to strings, these operations always return <tt>false</tt>.</li>
	 * <li>If either operand is or converts to <tt>NaN</tt>, the comparison operation always 
	 * yields <tt>false</tt>.</li>
	 * </ul>
	 * <p>Keep in mind that string comparison is done on a strict character-by-character 
	 * basis using the numerical value of each character from the Unicode encoding. Although 
	 * in some cases the Unicode standard allows equivalent strings to be encoded using 
	 * different sequences of characters, the JavaScript comparison operations do not 
	 * detect these encoding differences; they assume that all strings are expressed in 
	 * normalized form. Note in particular that string comparison is case-sensitive, and 
	 * in the Unicode encoding (at least for the ASCII subset), all capital letters are 
	 * "less than" all lowercase letters. This rule can cause confusing results if you do 
	 * not expect it.</p>
	 * <p>For a more robust string-comparison algorithm, see the {@link StringLike#localeCompare(Object)} 
	 * method, which also takes locale-specific definitions of alphabetical order into account. 
	 * For case-insensitive comparisons, you must first convert the strings to all lowercase or 
	 * all uppercase using {@link StringLike#toLowerCase()} or {@link StringLike#toUpperCase()}.</p>
	 * <p>The less-than-or-equal and greater-than-or-equal operations do not rely on the 
	 * equality or identity operations for determining whether two values are "equal." 
	 * Instead, the less-than-or-equal operator is simply defined as "not greater than", 
	 * and the greater-than-or-equal operator is defined as "not less than". The one 
	 * exception occurs when either operand is (or converts to) <tt>NaN</tt>, in which case 
	 * all comparison operations return <tt>false</tt>.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return <tt>true</tt> if the first operand is greater than or equal to the second operand; 
	 * otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var >= other</pre>
	 */
	public static final boolean gte(Object var, Object other) { return s().gte(var, other);}
	/**
	 * <p>Checks whether the two operands are "equal" using a more relaxed definition of 
	 * sameness that allows type conversions, resembling the equality operator in 
	 * JavaScript.</p>
	 * <p>The equality and identity operations check whether two values are the same, using 
	 * two different definitions of sameness. Both operations accept operands of any type, 
	 * and both return <tt>true</tt> if their operands are the same and <tt>false</tt> 
	 * if they are different. The identity operation checks whether its two operands are 
	 * "identical" using a strict definition of sameness. The equality operation checks 
	 * whether its two operands are "equal" using a more relaxed definition of sameness 
	 * that allows type conversions.</p>
	 * <p>The identity operation is standardized by ECMAScript v3 and implemented in 
	 * JavaScript 1.3 and later. Be sure you understand the differences between the 
	 * assignment, equality, and identity operations, and be careful to use the correct one 
	 * when coding! Although it is tempting to call all three operations "equals," it may 
	 * help to reduce confusion if you read "gets or is assigned" for assignment operation, 
	 * "is equal to" for equality operation, and "is identical to" for identity operation.</p>
	 * <p>In JavaScript, numbers, strings, and boolean values are compared by value. In this 
	 * case, two separate values are involved, and the equality and identity operations 
	 * check that these two values are identical. This means that two variables are equal 
	 * or identical only if they contain the same value. For example, two strings are equal 
	 * only if they each contain exactly the same characters.</p>
	 * <p>On the other hand, objects, arrays, and functions are compared by reference. This 
	 * means that two variables are equal only if they refer to the same object. Two 
	 * separate arrays are never equal or identical, even if they contain equal or identical 
	 * elements. Two variables that contain references to objects, arrays, or functions are 
	 * equal only if they refer to the same object, array, or function. If you want to test 
	 * that two distinct objects contain the same properties or that two distinct arrays 
	 * contain the same elements, you'll have to check the properties or elements individually 
	 * for equality or identity. And, if any of the properties or elements are themselves 
	 * objects or arrays, you'll have to decide how deep you want the comparison to go.</p>
	 * <p>The following rules determine whether two values are equal according to the 
	 * equality operation:
	 * <ul>
	 * <li>If the two values have the same type, test them for identity. If the values are 
	 * identical, they are equal; if they are not identical, they are not equal.</li>
	 * <li>If the two values do not have the same type, they may still be equal. Use the 
	 * following rules and type conversions to check for equality:</li>
	 * <ul>
	 * <li>If one value is null and the other is undefined, they are equal.</li>
	 * <li>If one value is a number and the other is a string, convert the string to a 
	 * number and try the comparison again, using the converted value.</li>
	 * <li>If either value is <tt>true</tt>, convert it to 1 and try the comparison 
	 * again. If either value is <tt>false</tt>, convert it to 0 and try the comparison 
	 * again.</li>
	 * <li>If one value is an object and the other is a number or string, convert the 
	 * object to a primitive and try the comparison again. An object is converted to a 
	 * primitive value by either its <tt>toString()</tt> method or its <tt>valueOf()</tt> 
	 * method. The built-in classes of core JavaScript attempt <tt>valueOf()</tt> 
	 * conversion before <tt>toString()</tt> conversion, except for the Date class, 
	 * which performs <tt>toString()</tt> conversion. Objects that are not part of core 
	 * JavaScript may convert themselves to primitive values in an implementation-defined 
	 * way.</li>
	 * <li>Any other combinations of values are not equal.</li>
	 * </ul>
	 * </ul>
	 * @param var Any value or object.
	 * @param other Any value or object.
	 * @return <tt>true</tt> if the first operand equals the second; <tt>false</tt>, 
	 * otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var == other</pre>
	 */
	public static final boolean eq  (Object var, Object other) { return s().eq  (var, other);}
	/**
	 * <p>Checks whether the two operands are "identical" using a strict definition of 
	 * sameness, resembling the identity operator in JavaScript.</p>
	 * <p>The equality and identity operations check whether two values are the same, using 
	 * two different definitions of sameness. Both operations accept operands of any type, 
	 * and both return <tt>true</tt> if their operands are the same and <tt>false</tt> 
	 * if they are different. The identity operation checks whether its two operands are 
	 * "identical" using a strict definition of sameness. The equality operation checks 
	 * whether its two operands are "equal" using a more relaxed definition of sameness 
	 * that allows type conversions.</p>
	 * <p>The identity operation is standardized by ECMAScript v3 and implemented in 
	 * JavaScript 1.3 and later. Be sure you understand the differences between the 
	 * assignment, equality, and identity operations, and be careful to use the correct one 
	 * when coding! Although it is tempting to call all three operations "equals," it may 
	 * help to reduce confusion if you read "gets or is assigned" for assignment operation, 
	 * "is equal to" for equality operation, and "is identical to" for identity operation.</p>
	 * <p>In JavaScript, numbers, strings, and boolean values are compared by value. In this 
	 * case, two separate values are involved, and the equality and identity operations 
	 * check that these two values are identical. This means that two variables are equal 
	 * or identical only if they contain the same value. For example, two strings are equal 
	 * only if they each contain exactly the same characters.</p>
	 * <p>On the other hand, objects, arrays, and functions are compared by reference. This 
	 * means that two variables are equal only if they refer to the same object. Two 
	 * separate arrays are never equal or identical, even if they contain equal or identical 
	 * elements. Two variables that contain references to objects, arrays, or functions are 
	 * equal only if they refer to the same object, array, or function. If you want to test 
	 * that two distinct objects contain the same properties or that two distinct arrays 
	 * contain the same elements, you'll have to check the properties or elements individually 
	 * for equality or identity. And, if any of the properties or elements are themselves 
	 * objects or arrays, you'll have to decide how deep you want the comparison to go.</p>
	 * <p>The following rules determine whether two values are identical according to the identity operation:
	 * <ul>
	 * <li>If the two values have different types, they are not identical.</li>
	 * <li>If both values are numbers and have the same value, they are identical, unless 
	 * either or both values are <tt>NaN</tt>, in which case they are not identical. 
	 * The <tt>NaN</tt> value is never identical to any other value, including itself! 
	 * To check whether a value is <tt>NaN</tt>, use the global {@link Js#isNaN(Object)} 
	 * function.</li>
	 * <li>If both values are strings and contain exactly the same characters in the same 
	 * positions, they are identical. If the strings differ in length or content, they are 
	 * not identical. Note that in some cases, the Unicode standard allows more than one 
	 * way to encode the same string. For efficiency, however, JavaScript's string 
	 * comparison compares strictly on a character-by-character basis, and it assumes that 
	 * all strings have been converted to a "normalized form" before they are compared. 
	 * See the {@link StringLike#localeCompare(Object)} for another way to compare strings.</li>
	 * <li>If both values are the boolean value <tt>true</tt> or both are the boolean 
	 * value <tt>false</tt>, they are identical.</li>
	 * <li>If both values refer to the same object, array, or function, they are identical. 
	 * If they refer to different objects (or arrays or functions) they are not identical, 
	 * even if both objects have identical properties or both arrays have identical elements.</li>
	 * <li>If both values are null or both values are undefined, they are identical.</li>
	 * </ul>
	 * @param var Any value or object.
	 * @param other Any value or object.
	 * @return <tt>true</tt> if the first operand is identical to the second; 
	 * <tt>false</tt>, otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var === other</pre>
	 */
	public static final boolean eqs (Object var, Object other) { return s().eqs (var, other);}
	/**
	 * <p>Checks whether the two operands are not "equal" using a more relaxed definition of 
	 * sameness that allows type conversions, resembling the equality operator in 
	 * JavaScript.</p>
	 * <p>The equality and identity operations check whether two values are the same, using 
	 * two different definitions of sameness. Both operations accept operands of any type, 
	 * and both return <tt>true</tt> if their operands are the same and <tt>false</tt> 
	 * if they are different. The identity operation checks whether its two operands are 
	 * "identical" using a strict definition of sameness. The equality operation checks 
	 * whether its two operands are "equal" using a more relaxed definition of sameness 
	 * that allows type conversions.</p>
	 * <p>The identity operation is standardized by ECMAScript v3 and implemented in 
	 * JavaScript 1.3 and later. Be sure you understand the differences between the 
	 * assignment, equality, and identity operations, and be careful to use the correct one 
	 * when coding! Although it is tempting to call all three operations "equals," it may 
	 * help to reduce confusion if you read "gets or is assigned" for assignment operation, 
	 * "is equal to" for equality operation, and "is identical to" for identity operation.</p>
	 * <p>In JavaScript, numbers, strings, and boolean values are compared by value. In this 
	 * case, two separate values are involved, and the equality and identity operations 
	 * check that these two values are identical. This means that two variables are equal 
	 * or identical only if they contain the same value. For example, two strings are equal 
	 * only if they each contain exactly the same characters.</p>
	 * <p>On the other hand, objects, arrays, and functions are compared by reference. This 
	 * means that two variables are equal only if they refer to the same object. Two 
	 * separate arrays are never equal or identical, even if they contain equal or identical 
	 * elements. Two variables that contain references to objects, arrays, or functions are 
	 * equal only if they refer to the same object, array, or function. If you want to test 
	 * that two distinct objects contain the same properties or that two distinct arrays 
	 * contain the same elements, you'll have to check the properties or elements individually 
	 * for equality or identity. And, if any of the properties or elements are themselves 
	 * objects or arrays, you'll have to decide how deep you want the comparison to go.</p>
	 * <p>The following rules determine whether two values are equal according to the 
	 * equality operation:
	 * <ul>
	 * <li>If the two values have the same type, test them for identity. If the values are 
	 * identical, they are equal; if they are not identical, they are not equal.</li>
	 * <li>If the two values do not have the same type, they may still be equal. Use the 
	 * following rules and type conversions to check for equality:</li>
	 * <ul>
	 * <li>If one value is null and the other is undefined, they are equal.</li>
	 * <li>If one value is a number and the other is a string, convert the string to a 
	 * number and try the comparison again, using the converted value.</li>
	 * <li>If either value is <tt>true</tt>, convert it to 1 and try the comparison 
	 * again. If either value is <tt>false</tt>, convert it to 0 and try the comparison 
	 * again.</li>
	 * <li>If one value is an object and the other is a number or string, convert the 
	 * object to a primitive and try the comparison again. An object is converted to a 
	 * primitive value by either its <tt>toString()</tt> method or its <tt>valueOf()</tt> 
	 * method. The built-in classes of core JavaScript attempt <tt>valueOf()</tt> 
	 * conversion before <tt>toString()</tt> conversion, except for the Date class, 
	 * which performs <tt>toString()</tt> conversion. Objects that are not part of core 
	 * JavaScript may convert themselves to primitive values in an implementation-defined 
	 * way.</li>
	 * <li>Any other combinations of values are not equal.</li>
	 * </ul>
	 * </ul>
	 * @param var Any value or object.
	 * @param other Any value or object.
	 * @return <tt>false</tt> if the first operand equals the second; <tt>true</tt>, 
	 * otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var != other</pre>
	 */
	public static final boolean neq (Object var, Object other) { return !eq (var, other);}
	/**
	 * <p>Checks whether the two operands are not "identical" using a strict definition of 
	 * sameness, resembling the identity operator in JavaScript.</p>
	 * <p>The equality and identity operations check whether two values are the same, using 
	 * two different definitions of sameness. Both operations accept operands of any type, 
	 * and both return <tt>true</tt> if their operands are the same and <tt>false</tt> 
	 * if they are different. The identity operation checks whether its two operands are 
	 * "identical" using a strict definition of sameness. The equality operation checks 
	 * whether its two operands are "equal" using a more relaxed definition of sameness 
	 * that allows type conversions.</p>
	 * <p>The identity operation is standardized by ECMAScript v3 and implemented in 
	 * JavaScript 1.3 and later. Be sure you understand the differences between the 
	 * assignment, equality, and identity operations, and be careful to use the correct one 
	 * when coding! Although it is tempting to call all three operations "equals," it may 
	 * help to reduce confusion if you read "gets or is assigned" for assignment operation, 
	 * "is equal to" for equality operation, and "is identical to" for identity operation.</p>
	 * <p>In JavaScript, numbers, strings, and boolean values are compared by value. In this 
	 * case, two separate values are involved, and the equality and identity operations 
	 * check that these two values are identical. This means that two variables are equal 
	 * or identical only if they contain the same value. For example, two strings are equal 
	 * only if they each contain exactly the same characters.</p>
	 * <p>On the other hand, objects, arrays, and functions are compared by reference. This 
	 * means that two variables are equal only if they refer to the same object. Two 
	 * separate arrays are never equal or identical, even if they contain equal or identical 
	 * elements. Two variables that contain references to objects, arrays, or functions are 
	 * equal only if they refer to the same object, array, or function. If you want to test 
	 * that two distinct objects contain the same properties or that two distinct arrays 
	 * contain the same elements, you'll have to check the properties or elements individually 
	 * for equality or identity. And, if any of the properties or elements are themselves 
	 * objects or arrays, you'll have to decide how deep you want the comparison to go.</p>
	 * <p>The following rules determine whether two values are identical according to the identity operation:
	 * <ul>
	 * <li>If the two values have different types, they are not identical.</li>
	 * <li>If both values are numbers and have the same value, they are identical, unless 
	 * either or both values are <tt>NaN</tt>, in which case they are not identical. 
	 * The <tt>NaN</tt> value is never identical to any other value, including itself! 
	 * To check whether a value is <tt>NaN</tt>, use the global {@link Js#isNaN(Object)} 
	 * function.</li>
	 * <li>If both values are strings and contain exactly the same characters in the same 
	 * positions, they are identical. If the strings differ in length or content, they are 
	 * not identical. Note that in some cases, the Unicode standard allows more than one 
	 * way to encode the same string. For efficiency, however, JavaScript's string 
	 * comparison compares strictly on a character-by-character basis, and it assumes that 
	 * all strings have been converted to a "normalized form" before they are compared. 
	 * See the {@link StringLike#localeCompare(Object)} for another way to compare strings.</li>
	 * <li>If both values are the boolean value <tt>true</tt> or both are the boolean 
	 * value <tt>false</tt>, they are identical.</li>
	 * <li>If both values refer to the same object, array, or function, they are identical. 
	 * If they refer to different objects (or arrays or functions) they are not identical, 
	 * even if both objects have identical properties or both arrays have identical elements.</li>
	 * <li>If both values are null or both values are undefined, they are identical.</li>
	 * </ul>
	 * @param var Any value or object.
	 * @param other Any value or object.
	 * @return <tt>false</tt> if the first operand is identical to the second; 
	 * <tt>true</tt>, otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var !== other</pre>
	 */
	public static final boolean neqs(Object var, Object other) { return !eqs(var, other);}

	/**
	 * <p>Inverts the boolean value of its operand, resembling the logical NOT operator 
	 * in JavaScript.</p>
	 * <p>This operation converts its operand to a boolean value using the following rules 
	 * if necessary before inverting the converted value.</p>
	 * <ul>
	 * <li>If a number is used where a boolean value is expected, the number is converted 
	 * to <tt>true</tt> unless the number is 0 or NaN, which are converted to <tt>false</tt>.</li>
	 * <li>If a string is used where a boolean value is expected, it is converted to <tt>true</tt> 
	 * except for the empty string, which is converted to <tt>false</tt>.</li>
	 * <li><tt>null</tt> and the undefined value convert to <tt>false</tt>, and any 
	 * non-null object, array, or function converts to <tt>true</tt>.
	 * </ul>
	 * <p>You can convert any value <tt>x</tt> to its equivalent boolean value by applying 
	 * this operation twice: <tt>Js.not(Js.not(x))</tt></p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical NOT operator of the 
	 * Java language like this:
	 * <pre>!Js.be(var)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @return The inverted boolean value.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>!var</pre>
	 */
	public static final boolean not(Object var) { return !Js.be(var);}

	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final <T> T and(T var, T other) { return not(var) ? var : other;}
	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final <T> T and(Var<? extends T> var, T other) {
		if (var == null) return (T)null;
		T v = var.var();
		return not(v) ? v : other;
	}
	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final <T> T and(T var, Var<? extends T> other) {
		return not(var) ? var : other == null ? (T)null : other.var();
	}
	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final JsBoolean and(Boolean var, JsBoolean other) { return not(var) ? new JsBoolean(var) : other;}
	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final JsBoolean and(Var<Boolean> var, JsBoolean other) { return not(var) ? new JsBoolean(valueOf(var.var())) : other;}
	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final Boolean and(JsBoolean var, Boolean other) { return not(var) ? var.valueOf() : other;}
	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final Boolean and(JsBoolean var, Var<Boolean> other) { return not(var) ? var.valueOf() : valueOf(other.var());}
	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final JsNumber and(Character var, JsNumber other) { return not(var) ? new JsNumber(valueOf(var)) : other;}
	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final JsNumber and(Number var, JsNumber other) { return not(var) ? new JsNumber(var) : other;}
	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final JsNumber and(Var<? extends Number> var, JsNumber other) { return not(var) ? new JsNumber(valueOf(var)) : other;}
	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final JsNumber and(Value<Character> var, JsNumber other) { return not(var) ? new JsNumber(valueOf(var.var())) : other;}
	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final Number and(JsNumber var, Character other) { return not(var) ? var.valueOf() : valueOf(other);}
	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final Number and(JsNumber var, Number other) { return not(var) ? var.valueOf() : other;}
	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final Number and(JsNumber var, Var<? extends Number> other) { return not(var) ? var.valueOf() : valueOf(other);}
	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final Number and(JsNumber var, Value<Character> other) { return not(var) ? var.valueOf() : valueOf(other.var());}
	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final JsString and(String var, JsString other) { return not(var) ? new JsString(var) : other;}
	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final JsString and(Var<String> var, JsString other) { return not(var) ? new JsString(var.var()) : other;}
	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final String and(JsString var, String other) { return not(var) ? var.valueOf() : other;}
	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final String and(JsString var, Var<String> other) { return not(var) ? var.valueOf() : other.var();}

	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final <T> T or(T var, T other) { return be(var) ? var : other;}
	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final <T> T or(Var<? extends T> var, T other) {
		T v = var == null ? (T)null : var.var();
		return be(v) ? v : other;
	}
	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final <T> T or(T var, Var<? extends T> other) {
		return be(var) ? var : other == null ? (T)null : other.var();
	}
	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final JsBoolean or(JsBoolean var, Boolean other) { return be(var) ? var : new JsBoolean(other);}
	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final JsBoolean or(JsBoolean var, Var<Boolean> other) { return be(var) ? var : new JsBoolean(other.var());}
	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final Boolean or(Boolean var, JsBoolean other) { return be(var) ? var : valueOf(other);}
	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final Boolean or(Var<Boolean> var, JsBoolean other) { return be(var) ? var.var() : valueOf(other);}
	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final JsNumber or(JsNumber var, Character other) { return be(var) ? var : new JsNumber(valueOf(other));}
	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final JsNumber or(JsNumber var, Number other) { return be(var) ? var : new JsNumber(other);}
	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final JsNumber or(JsNumber var, Var<? extends Number> other) { return be(var) ? var : new JsNumber(valueOf(other));}
	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final JsNumber or(JsNumber var, Value<Character> other) { return be(var) ? var : new JsNumber(valueOf(other.var()));}
	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final Number or(Number var, JsNumber other) { return be(var) ? var : valueOf(other);}
	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final Number or(Character var, JsNumber other) { return be(var) ? valueOf(var) : valueOf(other);}
	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final Number or(Var<? extends Number> var, JsNumber other) { return be(var) ? var.var() : valueOf(other);}
	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final Number or(Value<Character> var, JsNumber other) { return be(var) ? valueOf(var.var()) : valueOf(other);}
	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final JsString or(JsString var, String other) { return be(var) ? var : new JsString(other);}
	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final JsString or(JsString var, Var<String> other) { return be(var) ? var : new JsString(other.var());}
	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final String or(String var, JsString other) { return be(var) ? var : valueOf(other);}
	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final String or(Var<String> var, JsString other) { return be(var) ? var.var() : valueOf(other);}

	/**
	 * <p>Conditional operation, resembling the ternary operator of JavaScript, returns the 
	 * second operand if the first operand evaluates to <tt>true</tt>; Returns the third 
	 * operand, otherwise.</p>
	 * <p>The first operand of the conditional operation must be (or be convertible to) a 
	 * boolean value. Usually this is the result of a comparison operation. The second and 
	 * third operands may have any value. The value returned by the conditional operation 
	 * depends on the boolean value of the first operand. If that operand is <tt>true</tt>, 
	 * the value of the conditional expression is the value of the second operand. If the 
	 * first operand is <tt>false</tt>, the value of the conditional expression is the 
	 * value of the third operand.</p>
	 * <p>To make the second and third operands really late-evaluated or not evaluated in 
	 * JS Simulation mode, resembling what happens in JavaScript, you may have to extend 
	 * {@link Var} anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the conditional operator of the 
	 * Java language like this:
	 * <pre>Js.be(test) ? var : other</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The second operand if the first operand evaluates to <tt>true</tt>; Otherwise, 
	 * the third operand.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>test ? var : other</pre>
	 */
	public static final <T> T cond(Object test, T var, T other) { return be(test) ? var : other;}
	/**
	 * <p>Conditional operation, resembling the ternary operator of JavaScript, returns the 
	 * second operand if the first operand evaluates to <tt>true</tt>; Returns the third 
	 * operand, otherwise.</p>
	 * <p>The first operand of the conditional operation must be (or be convertible to) a 
	 * boolean value. Usually this is the result of a comparison operation. The second and 
	 * third operands may have any value. The value returned by the conditional operation 
	 * depends on the boolean value of the first operand. If that operand is <tt>true</tt>, 
	 * the value of the conditional expression is the value of the second operand. If the 
	 * first operand is <tt>false</tt>, the value of the conditional expression is the 
	 * value of the third operand.</p>
	 * <p>To make the second and third operands really late-evaluated or not evaluated in 
	 * JS Simulation mode, resembling what happens in JavaScript, you may have to extend 
	 * {@link Var} anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the conditional operator of the 
	 * Java language like this:
	 * <pre>Js.be(test) ? var : other</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The second operand if the first operand evaluates to <tt>true</tt>; Otherwise, 
	 * the third operand.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>test ? var : other</pre>
	 */
	public static final <T> T cond(Object test, Var<? extends T> var, T other) {
		return be(test) ? (var == null ? (T)null : var.var()) : other;
	}
	/**
	 * <p>Conditional operation, resembling the ternary operator of JavaScript, returns the 
	 * second operand if the first operand evaluates to <tt>true</tt>; Returns the third 
	 * operand, otherwise.</p>
	 * <p>The first operand of the conditional operation must be (or be convertible to) a 
	 * boolean value. Usually this is the result of a comparison operation. The second and 
	 * third operands may have any value. The value returned by the conditional operation 
	 * depends on the boolean value of the first operand. If that operand is <tt>true</tt>, 
	 * the value of the conditional expression is the value of the second operand. If the 
	 * first operand is <tt>false</tt>, the value of the conditional expression is the 
	 * value of the third operand.</p>
	 * <p>To make the second and third operands really late-evaluated or not evaluated in 
	 * JS Simulation mode, resembling what happens in JavaScript, you may have to extend 
	 * {@link Var} anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the conditional operator of the 
	 * Java language like this:
	 * <pre>Js.be(test) ? var : other</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The second operand if the first operand evaluates to <tt>true</tt>; Otherwise, 
	 * the third operand.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>test ? var : other</pre>
	 */
	public static final <T> T cond(Object test, T var, Var<? extends T> other) {
		return be(test) ? var : other == null ? (T)null : other.var();
	}
	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final <T extends JsObject> T and(T var, T other) { return not(var) ? var : other;}
	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final <T extends JsObject> T and(Var<? extends T> var, T other) {
		if (var == null) return (T)null;
		T v = var.var();
		return not(v) ? v : other;
	}
	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final <T extends JsObject> T and(T var, Var<? extends T> other) {
		return not(var) ? var : other == null ? (T)null : other.var();
	}
	/**
	 * <p>Logical AND operation, resembling that of JavaScript, performs the Boolean AND 
	 * operation on the two values: it returns <tt>true</tt> if and only if both its first 
	 * operand and its second operand are <tt>true</tt>. If one or both of these operands 
	 * is <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, depending on the value of the left-side expression, the operator 
	 * may or may not evaluate the right-side expression. The actual behavior of the operator 
	 * is somewhat more complicated. It starts by evaluating its first operand, the expression 
	 * on its left. If the value of this expression can be converted to <tt>false</tt> 
	 * (for example, if the left operand evaluates to <tt>null</tt>, 0, "", or undefined), 
	 * the operator returns the value of the left-side expression. Otherwise, it evaluates 
	 * its second operand, the expression on its right, and returns the value of that 
	 * expression. In JavaScript 1.0 and JavaScript 1.1, if the left-side expression 
	 * evaluates to <tt>false</tt>, the && operator returns <tt>false</tt> rather than 
	 * returning the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Sometimes, this operation probably does not do what the programmers intended. 
	 * To avoid problems, do not use expressions with side effects (assignments, increments, 
	 * decrements, and function calls) for the second operand unless you are quite sure 
	 * you know exactly what you are doing.</p>
	 * <p>Despite the fairly confusing way that this operation actually works, it is 
	 * easiest, and perfectly safe, to think of it as merely a Boolean algebra operator. 
	 * Although it does not actually return a boolean value, the value it returns can always 
	 * be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical AND operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) && Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical AND of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var && other</pre>
	 */
	public static final <T> T and(Var<? extends T> var, Var<? extends T> other) {
		if (var == null) return (T)null;
		T v = var.var();
		return not(v) ? v : other == null ? (T)null : other.var();
	}
	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final <T extends JsObject> T or(T var, T other) { return be(var) ? var : other;}
	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final <T extends JsObject> T or(Var<? extends T> var, T other) {
		T v = var == null ? (T)null : var.var();
		return be(v) ? v : other;
	}
	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final <T extends JsObject> T or(T var, Var<? extends T> other) {
		return be(var) ? var : other == null ? (T)null : other.var();
	}
	/**
	 * <p>Logical OR operation, resembling that of JavaScript, performs the Boolean OR 
	 * operation on the two values: it returns <tt>true</tt> if either the first operand or 
	 * the second operand is <tt>true</tt>, or if both are <tt>true</tt>. If both operands 
	 * are <tt>false</tt>, it returns <tt>false</tt>.</p>
	 * <p>In JavaScript, although the || operator is most often used simply as a Boolean OR 
	 * operator, it, like the && operator, has more complex behavior. It starts by evaluating 
	 * its first operand, the expression on its left. If the value of this expression can 
	 * be converted to <tt>true</tt>, it returns the unconverted value of the left-side 
	 * expression. Otherwise, it evaluates its second operand, the expression on its right, 
	 * and returns the value of that expression. In JavaScript 1.0 and JavaScript 1.1, if the 
	 * left-side expression can be converted to <tt>true</tt>, the operator returns <tt>true</tt> 
	 * and doesn't return the unconverted value of the left-side expression.</p>
	 * <p>To make the second operand really late-evaluated or not evaluated in JS Simulation 
	 * mode, resembling what happens in JavaScript, you may have to extend {@link Var} 
	 * anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>As with the {@link #and(Object, Object)} operation, you should avoid right-side 
	 * operands that include side effects, unless you purposely want to use the fact that 
	 * the right-side expression may not be evaluated in JavaScript.</p>
	 * <p>Even when this operation is used with operands that are not boolean values, it 
	 * can still be considered a Boolean OR operator because its return value, whatever the 
	 * type, can be converted to a boolean value.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the logical OR operator of the 
	 * Java language like this:
	 * <pre>Js.be(var) || Js.be(other)</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The logical OR of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var || other</pre>
	 */
	public static final <T> T or(Var<? extends T> var, Var<? extends T> other) {
		T v = var == null ? (T)null : var.var();
		return be(v) ? v : other == null ? (T)null : other.var();
	}
	/**
	 * <p>Conditional operation, resembling the ternary operator of JavaScript, returns the 
	 * second operand if the first operand evaluates to <tt>true</tt>; Returns the third 
	 * operand, otherwise.</p>
	 * <p>The first operand of the conditional operation must be (or be convertible to) a 
	 * boolean value. Usually this is the result of a comparison operation. The second and 
	 * third operands may have any value. The value returned by the conditional operation 
	 * depends on the boolean value of the first operand. If that operand is <tt>true</tt>, 
	 * the value of the conditional expression is the value of the second operand. If the 
	 * first operand is <tt>false</tt>, the value of the conditional expression is the 
	 * value of the third operand.</p>
	 * <p>To make the second and third operands really late-evaluated or not evaluated in 
	 * JS Simulation mode, resembling what happens in JavaScript, you may have to extend 
	 * {@link Var} anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the conditional operator of the 
	 * Java language like this:
	 * <pre>Js.be(test) ? var : other</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The second operand if the first operand evaluates to <tt>true</tt>; Otherwise, 
	 * the third operand.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>test ? var : other</pre>
	 */
	public static final <T extends JsObject> T cond(Object test, T var, T other) { return be(test) ? var : other;}
	/**
	 * <p>Conditional operation, resembling the ternary operator of JavaScript, returns the 
	 * second operand if the first operand evaluates to <tt>true</tt>; Returns the third 
	 * operand, otherwise.</p>
	 * <p>The first operand of the conditional operation must be (or be convertible to) a 
	 * boolean value. Usually this is the result of a comparison operation. The second and 
	 * third operands may have any value. The value returned by the conditional operation 
	 * depends on the boolean value of the first operand. If that operand is <tt>true</tt>, 
	 * the value of the conditional expression is the value of the second operand. If the 
	 * first operand is <tt>false</tt>, the value of the conditional expression is the 
	 * value of the third operand.</p>
	 * <p>To make the second and third operands really late-evaluated or not evaluated in 
	 * JS Simulation mode, resembling what happens in JavaScript, you may have to extend 
	 * {@link Var} anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the conditional operator of the 
	 * Java language like this:
	 * <pre>Js.be(test) ? var : other</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The second operand if the first operand evaluates to <tt>true</tt>; Otherwise, 
	 * the third operand.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>test ? var : other</pre>
	 */
	public static final <T extends JsObject> T cond(Object test, Var<? extends T> var, T other) {
		return be(test) ? (var == null ? (T)null : var.var()) : other;
	}
	/**
	 * <p>Conditional operation, resembling the ternary operator of JavaScript, returns the 
	 * second operand if the first operand evaluates to <tt>true</tt>; Returns the third 
	 * operand, otherwise.</p>
	 * <p>The first operand of the conditional operation must be (or be convertible to) a 
	 * boolean value. Usually this is the result of a comparison operation. The second and 
	 * third operands may have any value. The value returned by the conditional operation 
	 * depends on the boolean value of the first operand. If that operand is <tt>true</tt>, 
	 * the value of the conditional expression is the value of the second operand. If the 
	 * first operand is <tt>false</tt>, the value of the conditional expression is the 
	 * value of the third operand.</p>
	 * <p>To make the second and third operands really late-evaluated or not evaluated in 
	 * JS Simulation mode, resembling what happens in JavaScript, you may have to extend 
	 * {@link Var} anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the conditional operator of the 
	 * Java language like this:
	 * <pre>Js.be(test) ? var : other</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The second operand if the first operand evaluates to <tt>true</tt>; Otherwise, 
	 * the third operand.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>test ? var : other</pre>
	 */
	public static final <T extends JsObject> T cond(Object test, T var, Var<? extends T> other) {
		return be(test) ? var : other == null ? (T)null : other.var();
	}
	/**
	 * <p>Conditional operation, resembling the ternary operator of JavaScript, returns the 
	 * second operand if the first operand evaluates to <tt>true</tt>; Returns the third 
	 * operand, otherwise.</p>
	 * <p>The first operand of the conditional operation must be (or be convertible to) a 
	 * boolean value. Usually this is the result of a comparison operation. The second and 
	 * third operands may have any value. The value returned by the conditional operation 
	 * depends on the boolean value of the first operand. If that operand is <tt>true</tt>, 
	 * the value of the conditional expression is the value of the second operand. If the 
	 * first operand is <tt>false</tt>, the value of the conditional expression is the 
	 * value of the third operand.</p>
	 * <p>To make the second and third operands really late-evaluated or not evaluated in 
	 * JS Simulation mode, resembling what happens in JavaScript, you may have to extend 
	 * {@link Var} anonymously, returning the actual expression in the method overriding 
	 * {@link Var#var()}.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations. However, in most cases you can use the conditional operator of the 
	 * Java language like this:
	 * <pre>Js.be(test) ? var : other</pre>
	 * which is definitely late-evaluated but not necessarily re-compiled into an expected 
	 * JavaScript expression since the Java compilers generally used are free to compile 
	 * the expression into any byte codes they think efficient, making it too hard for the 
	 * re-compilers to reconvert the byte codes to an expression in JavaScript.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The second operand if the first operand evaluates to <tt>true</tt>; Otherwise, 
	 * the third operand.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>test ? var : other</pre>
	 */
	public static final <T> T cond(Object test, Var<? extends T> var, Var<? extends T> other) {
		return be(test) ? (var == null ? (T)null : var.var()) : (other == null ? (T)null : other.var());
	}

	/**
	 * <p>Comma operation, resembling the comma operator of JavaScript, evaluates the 
	 * first operand, evaluates the second operand, and then returns the value of the 
	 * second operand.</p>
	 * <p>In JavaScript, this strange operator is useful only in a few limited circumstances, 
	 * primarily when you need to evaluate several independent expressions with side effects 
	 * in a situation where only a single expression is allowed. In practice, the comma 
	 * operator is really used only in conjunction with the <tt>for</tt> loop statement.</p>
	 * <p>Note that, this method is probably useful in emulation codes just for perfect 
	 * re-compilations.</p>
	 * @param var A value or object.
	 * @param other A value or object.
	 * @return The second operand.
	 * @since 1.0
	 * @javascript Re-compilers must replace the static invocation of this method with the 
	 * JavaScript expression:
	 * <pre>var, other</pre>
	 */
	public static final <T> T comma(Object var, T other) { valueOf(var); return other;}

	/**
	 * <p>Performs unary negation on a 64-bit integer.</p>
	 * <p>This operation converts a positive value to an equivalently negative value, and 
	 * vice versa. If the operand is not a 64-bit integer, it attempts to convert it to one.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision. </p>
	 * @param var Any numeric value.
	 * @return The negation of the 64-bit integer.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the static invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a negation operation on a long number, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>-((Number)var).longValue()</pre>
	 */
	public static final long lneg(Object var) { return s().neg(s().getNumber(var)).longValue();}
	/**
	 * <p>The 64-bit bitwise-NOT operation, casting the operand to a <tt>long</tt> number 
	 * if it is not 64-bit, operates by reversing all bits in the 64-bit integer.</p>
	 * <p>Because of the way signed integers are represented in JavaScript, applying this 
	 * operation to a value is equivalent to changing its sign and subtracting 1.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param var Any numeric value.
	 * @return The bitwise-NOT of the 64-bit integer.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the static invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a bitwise-NOT operation on a long number, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>~((Number)var).longValue()</pre>
	 */
	public static final long lnot(Object var) { return ~s().getNumber(var).longValue();}
	/**
	 * <p>Adds two 64-bit integers, casting the operands to <tt>long</tt> numbers if any 
	 * one of them is not a 64-bit integer.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return The sum of the two 64-bit integers.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the static invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of an addition operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)var).longValue() + ((Number)other).longValue()</pre>
	 */
	public static final long ladd(Object var, Object other) { return s().getNumber(var).longValue() + s().getNumber(other).longValue();}
	/**
	 * <p>Subtracts the second 64-bit integer from the first 64-bit integer, casting the 
	 * operands to <tt>long</tt> numbers if any one of them is not a 64-bit integer.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return The difference between the two 64-bit integers.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the static invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a subtraction operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)var).longValue() - ((Number)other).longValue()</pre>
	 */
	public static final long lsub(Object var, Object other) { return s().getNumber(var).longValue() - s().getNumber(other).longValue();}
	/**
	 * <p>Multiplies the two 64-bit integer, casting the operands to <tt>long</tt> numbers 
	 * if any one of them is not a 64-bit integer.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return The product of the two 64-bit integers.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the static invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a multiplication operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)var).longValue() * ((Number)other).longValue()</pre>
	 */
	public static final long lmul(Object var, Object other) { return s().getNumber(var).longValue() * s().getNumber(other).longValue();}
	/**
	 * <p>Divides the first 64-bit integer by the second 64-bit integer, casting the operands 
	 * to <tt>long</tt> numbers if any one of them is not a 64-bit integer.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return The quotient of the two 64-bit integers.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the static invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of an division operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)var).longValue() / ((Number)other).longValue()</pre>
	 */
	public static final long ldiv(Object var, Object other) { return s().getNumber(var).longValue() / s().getNumber(other).longValue();}
	/**
	 * <p>Computes the first operand modulo the second operand, casting the operands to 
	 * <tt>long</tt> numbers if any one of them is not a 64-bit integer.</p>
	 * <p>The operation returns the remainder when the first operand is divided by the 
	 * second operand a certain number of times. The sign of the result is the same as the 
	 * sign of the first operand.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return The remainder.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the static invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a modulo operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)var).longValue() % ((Number)other).longValue()</pre>
	 */
	public static final long lmod(Object var, Object other) { return s().getNumber(var).longValue() % s().getNumber(other).longValue();}
	/**
	 * <p>The 64-bit shift-left operation, casting the first operand to a <tt>long</tt> 
	 * number if it is not 64-bit, moves all bits in it to the left by the number of places 
	 * specified in the second operand, which should be an integer between 0 and 63.</p>
	 * <p>A zero is used for the new first bit, and the value of the 64th bit is lost. 
	 * Shifting a value left by one position is equivalent to multiplying by 2, shifting 
	 * two positions is equivalent to multiplying by 4, etc.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param var Any numeric value.
	 * @param n The number of bits to shift.
	 * @return The shifted 64-bit integer.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the static invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a shift-left operation on a long number, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)var).longValue() << n</pre>
	 */
	public static final long lshl (Object var, int n) { return s().getNumber(var).longValue() << n;}
	/**
	 * <p>The 64-bit shift-right operation, casting the first operand to a <tt>long</tt> 
	 * number if it is not 64-bit, moves all bits in it to the right by the number of 
	 * places specified in the second operand (an integer between 0 and 63). Bits that are 
	 * shifted off the right are lost. The bits filled in on the left depend on the sign 
	 * bit of the original operand, in order to preserve the sign of the result. If the 
	 * first operand is positive, the result has zeros placed in the high bits; if the 
	 * first operand is negative, the result has ones placed in the high bits.</p>
	 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
	 * remainder), shifting right two places is equivalent to integer division by 4, and 
	 * so on.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param var Any numeric value.
	 * @param n The number of bits to shift.
	 * @return The shifted 64-bit integer.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the static invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a shift-right operation on a long number, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)var).longValue() >> n</pre>
	 */
	public static final long lshr (Object var, int n) { return s().getNumber(var).longValue() >> n;}
	/**
	 * <p>The 64-bit shift-right-unsigned operation, casting the first operand to a 
	 * <tt>long</tt> number if it is not 64-bit, moves all bits in it to the right by the 
	 * number of places specified in the second operand (an integer between 0 and 63). Bits 
	 * that are shifted off the right are lost. The result has zeros placed in the high 
	 * bits.</p>
	 * <p>This operation is just like {@link #lshr(Object, int)}, except that the bits shifted 
	 * in on the left are always zero, regardless of the sign of the first operand.</p>
	 * <p>Shifting a value right one place is equivalent to dividing by 2 (discarding the 
	 * remainder), shifting right two places is equivalent to integer division by 4, and 
	 * so on.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param var Any numeric value.
	 * @param n The number of bits to shift.
	 * @return The shifted 64-bit integer.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the static invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of an unsigned shift-right operation on a long number, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)var).longValue() >>> n</pre>
	 */
	public static final long lshru(Object var, int n) { return s().getNumber(var).longValue() >>> n;}
	/**
	 * <p>The 64-bit bitwise-AND operation, casting the operands to <tt>long</tt> numbers 
	 * if any one of them is not a 64-bit integer, performs a boolean AND operation on each 
	 * bit of the 64-bit integers. A bit is set in the result only if the corresponding 
	 * bit is set in both operands.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return The bitwise-AND of the two 64-bit integers.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the static invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a bitwise AND operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)var).longValue() & ((Number)other).longValue()</pre>
	 */
	public static final long land(Object var, Object other) { return s().getNumber(var).longValue() & s().getNumber(other).longValue();}
	/**
	 * <p>The 64-bit bitwise-OR operation, casting the operands to <tt>long</tt> numbers if 
	 * any one of them is not a 64-bit integer, performs a boolean OR operation on each bit 
	 * of the 64-bit integers. A bit is set in the result if the corresponding bit is set 
	 * in one or both of the operands.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return The bitwise-OR of the two 64-bit integers.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the static invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a bitwise OR operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)var).longValue() | ((Number)other).longValue()</pre>
	 */
	public static final long lor (Object var, Object other) { return s().getNumber(var).longValue() | s().getNumber(other).longValue();}
	/**
	 * <p>The 64-bit bitwise-XOR operation, casting the operands to <tt>long</tt> numbers 
	 * if any one of them is not a 64-bit integer, performs a boolean exclusive OR operation 
	 * on each bit of the 64-bit integers. Exclusive OR means that either operand one is 
	 * <tt>true</tt> or operand two is <tt>true</tt>, but not both. A bit is set in this 
	 * operation's result if a corresponding bit is set in one (but not both) of the two 
	 * operands.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return The bitwise-exclusive-OR of the two 64-bit integers.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the static invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a bitwise exclusive OR operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)var).longValue() ^ ((Number)other).longValue()</pre>
	 */
	public static final long lxor(Object var, Object other) { return s().getNumber(var).longValue() ^ s().getNumber(other).longValue();}
	/**
	 * <p>The 64-bit less-than operation, casting the operands to <tt>long</tt> numbers if 
	 * any one of them is not a 64-bit integer, evaluates to <tt>true</tt> if the first 
	 * operand is less than the second operand; otherwise it evaluates to <tt>false</tt>.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return <tt>true</tt> if the first operand is less than the second operand; 
	 * otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the static invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a less-than operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)var).longValue() < ((Number)other).longValue()</pre>
	 */
	public static final boolean llt (Object var, Object other) { return s().getNumber(var).longValue() <  s().getNumber(other).longValue();}
	/**
	 * <p>The 64-bit greater-than operation, casting the operands to <tt>long</tt> numbers 
	 * if any one of them is not a 64-bit integer, evaluates to <tt>true</tt> if the first 
	 * operand is greater than the second operand; otherwise it evaluates to <tt>false</tt>.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return <tt>true</tt> if the first operand is greater than the second operand; 
	 * otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the static invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a greater-than operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)var).longValue() > ((Number)other).longValue()</pre>
	 */
	public static final boolean lgt (Object var, Object other) { return s().getNumber(var).longValue() >  s().getNumber(other).longValue();}
	/**
	 * <p>The 64-bit less-than-or-equal operation, casting the operands to <tt>long</tt> 
	 * numbers if any one of them is not a 64-bit integer, evaluates to <tt>true</tt> if 
	 * the first operand is less than or equal to the second operand; otherwise it evaluates 
	 * to <tt>false</tt>.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return <tt>true</tt> if the first operand is less than or equal to the second operand; 
	 * otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the static invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a less-than-or-equal operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)var).longValue() <= ((Number)other).longValue()</pre>
	 */
	public static final boolean llte(Object var, Object other) { return s().getNumber(var).longValue() <= s().getNumber(other).longValue();}
	/**
	 * <p>The 64-bit greater-than-or-equal operation, casting the operands to <tt>long</tt> 
	 * numbers if any one of them is not a 64-bit integer, evaluates to <tt>true</tt> if the 
	 * first operand is greater than or equal to the second operand; otherwise it evaluates 
	 * to <tt>false</tt>.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return <tt>true</tt> if the first operand is greater than or equal to the second operand; 
	 * otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the static invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of a greater-than-or-equal operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)var).longValue() >= ((Number)other).longValue()</pre>
	 */
	public static final boolean lgte(Object var, Object other) { return s().getNumber(var).longValue() >= s().getNumber(other).longValue();}
	/**
	 * <p>Checks whether the two 64-bit integers are "equal", casting the operands to 
	 * <tt>long</tt> numbers if any one of them is not a 64-bit integer.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return <tt>true</tt> if the first operand equals the second; <tt>false</tt>, 
	 * otherwise;
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the static invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of an equality operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)var).longValue() == ((Number)other).longValue()</pre>
	 */
	public static final boolean leq (Object var, Object other) { return s().getNumber(var).longValue() == s().getNumber(other).longValue();}
	/**
	 * <p>Checks whether the two 64-bit integers are not "equal", casting the operands to 
	 * <tt>long</tt> numbers if any one of them is not a 64-bit integer.</p>
	 * <p>Note that, although the representation of <tt>long</tt> numbers in JavaScript and 
	 * the 64-bit operations on them are re-compiler dependent, the re-compilers are expected 
	 * to express 64-bit integers as JavaScript objects or arrays, with a bitwise or arithmetc 
	 * operation on <tt>long</tt> numbers converted to the invocation of a predefined global 
	 * function that is also re-compiler dependent. The <tt>valueOf()</tt> method of the object 
	 * or array representing a 64-bit integer must return a number representing the <tt>long</tt> 
	 * number in JavaScript limited bits range, so that a <tt>long</tt> integer in JavaScript 
	 * naturally evaluates to a normal number without extra casting codes. That is, casting 
	 * a normal number to a <tt>long</tt> integer, or creating a <tt>long</tt> integer from 
	 * bits involve the invocation of a predefined re-compiler dependent function while 
	 * casting a <tt>long</tt> integer to a normal number is expected to be ignored by re-compilation. 
	 * In addition, the <tt>toString()</tt> method of that object or array must return a 
	 * string representation of the <tt>long</tt> number in full 64-bit precision.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return <tt>false</tt> if the first operand equals the second; <tt>true</tt>, 
	 * otherwise;
	 * @since 1.0
	 * @javascript A re-compiler is expected to replace the static invocation of this method 
	 * with the invocation of a predefined and re-compiler dependent function, with an invocation of which 
	 * the same re-compiler would replace the byte codes of an inequality operation on two long numbers, 
	 * such as the byte codes compiled from the following Java expression:  
	 * <pre>((Number)var).longValue() != ((Number)other).longValue()</pre>
	 */
	public static final boolean lneq(Object var, Object other) { return s().getNumber(var).longValue() != s().getNumber(other).longValue();}
}
