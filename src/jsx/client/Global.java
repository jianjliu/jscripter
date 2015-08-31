
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

import js.Field;
import js.Disposable;
import js.Function;
import js.Js;
import js.Static;
import js.Var;
import js.core.JsFunction;
import js.core.JsGlobal;
import js.core.JsObject;

/**
 * <p>A utility class accessing the objects and simulating the functions of JavaScript 
 * in global scope without full client-side support.</p>
 * <p>Users are encouraged to use the utilities and static fields provided in this class 
 * instead of the <b>opaque</b> methods and the members of the {@link js.Js} class or the 
 * {@link js.core.JsGlobal} class in consideration of the reuse benefit for re-compilation 
 * results.</p
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public abstract class Global extends Disposable
{
	Global() {}

	public static Object nullObject() {
		return Browser.isIE ? null : 0;
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
	 * @see js.Js#alert(Object)
	 * @see Client#alert(Object)
	 * @since 1.0
	 */
	public static void alert(Object message) {
		Js.alert(message);
	}
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
	 * @see js.Js#confirm(Object)
	 * @see Win#confirm(Object)
	 * @since 1.0
	 */
	public static boolean confirm(Object question) {
		return Js.confirm(question);
	}
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
	 * @see js.Js#prompt(Object)
	 * @see Win#prompt(Object)
	 * @since 1.0
	 */
	public static String prompt(Object message) {
		return Js.prompt(message);
	}
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
	 * @see js.Js#prompt(Object, Object)
	 * @see Win#prompt(Object, Object)
	 * @since 1.0
	 */
	public static String prompt(Object message, Object defaultInput) {
		return Js.prompt(message, defaultInput);
	}
	/**
	 * <p>Cancels periodic execution of code, 
	 * simulating the JavaScript global function of the same name.</p>
	 * <p>This method stops the repeated execution of code that was started by a call to 
	 * {@link #setInterval(JsFunction, Number)}. <tt>intervalId</tt> must be the value 
	 * that was returned by a call to {@link #setInterval(JsFunction, Number)}.</p>
	 * @param intervalId The value returned by the corresponding call to {@link #setInterval(JsFunction, Number)}.
	 * @see #setInterval(JsFunction, Number)
	 * @see js.Js#clearInterval(Object)
	 * @see Win#clearInterval(Object)
	 * @see jsx.Interval
	 * @since 1.0
	 */
	public static void clearInterval(Object intervalId) {
		Js.clearInterval(intervalId);
	}
	/**
	 * <p>Cancels a pending timeout operation, 
	 * simulating the JavaScript global function of the same name.</p>
	 * <p>This method cancels the execution of code that has been deferred with the 
	 * {@link #setTimeout(JsFunction, Number)} method. The <tt>timeoutId</tt> argument 
	 * is a value returned by the call to {@link #setTimeout(JsFunction, Number)} and 
	 * identifies which deferred code to cancel.</p>
	 * @param timeoutId A value returned by {@link #setTimeout(JsFunction, Number)} that 
	 * identifies the timeout to be canceled.
	 * @see #clearTimeout(Object)
	 * @see js.Js#clearTimeout(Object)
	 * @see Win#clearTimeout(Object)
	 * @see jsx.Timeout
	 * @since 1.0
	 */
	public static void clearTimeout(Object timeoutId ) {
		Js.clearTimeout(timeoutId);
	}
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
	 * @see js.Js#setInterval(JsFunction)
	 * @see js.Js#setInterval(JsFunction, Number)
	 * @see Win#setInterval(JsFunction)
	 * @see Win#setInterval(JsFunction, Number)
	 * @see jsx.Interval
	 * @since 1.0
	 */
	public static Object setInterval(JsFunction<?> f, Number interval) {
		return Js.setInterval(f, interval);
	}
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
	 * @see js.Js#setInterval(JsFunction)
	 * @see js.Js#setInterval(JsFunction, Number)
	 * @see Win#setInterval(JsFunction)
	 * @see Win#setInterval(JsFunction, Number)
	 * @see jsx.Interval
	 * @since 1.0
	 */
	public static Object setInterval(JsFunction<?> f) {
		return Js.setInterval(f);
	}
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
	 * @see js.Js#setTimeout(JsFunction)
	 * @see js.Js#setTimeout(JsFunction, Number)
	 * @see Win#setTimeout(JsFunction)
	 * @see Win#setTimeout(JsFunction, Number)
	 * @see jsx.Timeout
	 * @since 1.0
	 */
	public static Object setTimeout(JsFunction<?> f, Number delay) {
		return Js.setTimeout(f, delay);
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
	 * @see #setTimeout(JsFunction, Number)
	 * @see #clearTimeout(Object)
	 * @see js.Js#setTimeout(JsFunction)
	 * @see js.Js#setTimeout(JsFunction, Number)
	 * @see Win#setTimeout(JsFunction)
	 * @see Win#setTimeout(JsFunction, Number)
	 * @see jsx.Timeout
	 * @since 1.0
	 */
	public static Object setTimeout(JsFunction<?> f) {
		return Js.setTimeout(f);
	}
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
	 * @see js.Js#decodeURI(Object)
	 * @see Win#decodeURI(Object)
	 * @since 1.0
	 */
	public static String decodeURI(Object s) {
		return Js.decodeURI(s);
	}
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
	 * @see js.Js#decodeURIComponent(Object)
	 * @see Win#decodeURIComponent(Object)
	 * @since 1.0
	 */
	public static String decodeURIComponent(Object s) {
		return Js.decodeURIComponent(s);
	}
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
	 * @see js.Js#encodeURI(Object)
	 * @see Win#encodeURI(Object)
	 * @since 1.0
	 */
	public static String encodeURI(Object uri) {
		return Js.encodeURI(uri);
	}
	/**
	 * <p>Encodes a URI component by escaping certain characters, 
	 * simulating the JavaScript global function of the same name.</p>
	 * @param uri A string that contains a portion of a URI or other text to be encoded.
	 * @return A copy of <tt>uri</tt>, with certain characters replaced by hexadecimal escape sequences.
	 * @throws RuntimeException JavaScript throws a <tt>URIError</tt> if <tt>s</tt> 
	 * contains malformed unicode surrogate pairs and cannot be encoded. See 
	 * {@link Js#err(Object)} and {@link js.core.JsURIError} for JS Simulation.
	 * @see #decodeURIComponent(Object)
	 * @see js.Js#encodeURIComponent(Object)
	 * @see Win#encodeURIComponent(Object)
	 * @since 1.0
	 */
	public static String encodeURIComponent(Object uri) {
		return Js.encodeURIComponent(uri);
	}
	/**
	 * <p>Encodes a string by replacing certain characters with escape sequences, 
	 * simulating the JavaScript global function of the same name.</p>
	 * @param s The string that is to be "escaped" or encoded.
	 * @return An encoded copy of <tt>s</tt> in which certain characters have been 
	 * replaced by hexadecimal escape sequences.
	 * @see #unescape(Object)
	 * @see js.Js#escape(Object)
	 * @see Win#escape(Object)
	 * @since 1.0
	 */
	public static String escape(Object s) {
		return Js.escape(s);
	}
	/**
	 * <p>Decodes a string encoded with {@link #escape(Object)}, 
	 * simulating the JavaScript global function of the same name.</p>
	 * @param s The string that is to be decoded or "unescaped".
	 * @return A decoded copy of <tt>s</tt>.
	 * @see #escape(Object)
	 * @see js.Js#unescape(Object)
	 * @see Win#unescape(Object)
	 * @since 1.0
	 */
	public static String unescape(Object s) {
		return Js.unescape(s);
	}
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
	 */
	public static Object eval(Object s) {
		return Js.eval(s);
	}
	/**
	 * <p>Tests whether a value is a finite number, 
	 * simulating the JavaScript global function of the same name.</p>
	 * @param v The number to be tested.
	 * @return <tt>true</tt> if <tt>v</tt> is (or can be converted to) a finite 
	 * number, or <tt>false</tt> if <tt>v</tt> is <tt>NaN</tt> (not a number) 
	 * or positive or negative infinity.
	 * @see js.Js#isFinite(Object)
	 * @see Win#isFinite(Object)
	 * @since 1.0
	 */
	public static boolean isFinite(Object v) {
		return Js.isFinite(v);
	}
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
	 * @see js.Js#isNaN(Object)
	 * @see Win#isNaN(Object)
	 * @since 1.0
	 */
	public static boolean isNaN(Object v) {
		return Js.isNaN(v);
	}
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
	 * @see js.Js#parseInt(Object)
	 * @see Win#parseInt(Object)
	 * @since 1.0
	 */
	public static Integer parseInt(Object value) {
		return Js.parseInt(value);
	}
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
	 * @see js.Js#parseInt(Object, int)
	 * @see Win#parseInt(Object, int)
	 * @since 1.0
	 */
	public static Integer parseInt(Object value, int radix) {
		return Js.parseInt(value, radix);
	}
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
	 * @see js.Js#parseFloat(Object)
	 * @see Win#parseFloat(Object)
	 * @since 1.0
	 */
	public static Double parseFloat(Object value) {
		return Js.parseFloat(value);
	}

	public static JsFunction<Void> function() {
		return new Function<Void>() {
			@Override
			protected Void function(java.lang.Object jsthis, Call<Void> callee) {
				return null;
			}
		}.var();
	}

	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see js.core.JsGlobal
	 * @since 1.0
	 */
	public final static Var<JsGlobal.Array> Array = new Static<JsGlobal.Array>(new Field<JsGlobal.Array>(JsGlobal.Array));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see js.core.JsGlobal
	 * @since 1.0
	 */
	public final static Var<JsGlobal.Boolean> Boolean = new Static<JsGlobal.Boolean>(new Field<JsGlobal.Boolean>(JsGlobal.Boolean));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see js.core.JsGlobal
	 * @since 1.0
	 */
	public final static Var<JsGlobal.Date> Date = new Static<JsGlobal.Date>(new Field<JsGlobal.Date>(JsGlobal.Date));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see js.core.JsGlobal
	 * @since 1.0
	 */
	public final static Var<JsGlobal.Function<JsObject>> Function = new Static<JsGlobal.Function<JsObject>>(new Field<JsGlobal.Function<JsObject>>(JsGlobal.Function));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see js.core.JsGlobal
	 * @since 1.0
	 */
	public final static Var<JsGlobal.Number> Number = new Static<JsGlobal.Number>(new Field<JsGlobal.Number>(JsGlobal.Number));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see js.core.JsGlobal
	 * @since 1.0
	 */
	public final static Var<JsGlobal.Math> Math = new Static<JsGlobal.Math>(new Field<JsGlobal.Math>(JsGlobal.Math));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see js.core.JsGlobal
	 * @since 1.0
	 */
	public final static Var<JsGlobal.Object> Object = new Static<JsGlobal.Object>(new Field<JsGlobal.Object>(JsGlobal.Object));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see js.core.JsGlobal
	 * @since 1.0
	 */
	public final static Var<JsGlobal.RegExp> RegExp = new Static<JsGlobal.RegExp>(new Field<JsGlobal.RegExp>(JsGlobal.RegExp));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see js.core.JsGlobal
	 * @since 1.0
	 */
	public final static Var<JsGlobal.String> String = new Static<JsGlobal.String>(new Field<JsGlobal.String>(JsGlobal.String));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see js.core.JsGlobal
	 * @since 1.0
	 */
	public final static Var<JsGlobal.Error> Error = new Static<JsGlobal.Error>(new Field<JsGlobal.Error>(JsGlobal.Error));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see js.core.JsGlobal
	 * @since 1.0
	 */
	public final static Var<JsGlobal.EvalError> EvalError = new Static<JsGlobal.EvalError>(new Field<JsGlobal.EvalError>(JsGlobal.EvalError));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see js.core.JsGlobal
	 * @since 1.0
	 */
	public final static Var<JsGlobal.RangeError> RangeError = new Static<JsGlobal.RangeError>(new Field<JsGlobal.RangeError>(JsGlobal.RangeError));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see js.core.JsGlobal
	 * @since 1.0
	 */
	public final static Var<JsGlobal.ReferenceError> ReferenceError = new Static<JsGlobal.ReferenceError>(new Field<JsGlobal.ReferenceError>(JsGlobal.ReferenceError));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see js.core.JsGlobal
	 * @since 1.0
	 */
	public final static Var<JsGlobal.SyntaxError> SyntaxError = new Static<JsGlobal.SyntaxError>(new Field<JsGlobal.SyntaxError>(JsGlobal.SyntaxError));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see js.core.JsGlobal
	 * @since 1.0
	 */
	public final static Var<JsGlobal.TypeError> TypeError = new Static<JsGlobal.TypeError>(new Field<JsGlobal.TypeError>(JsGlobal.TypeError));
	/**
	 * <p>Statically accesses the JavaScript global object of the name of this field. 
	 * @see js.core.JsGlobal
	 * @since 1.0
	 */
	public final static Var<JsGlobal.URIError> URIError = new Static<JsGlobal.URIError>(new Field<JsGlobal.URIError>(JsGlobal.URIError));
}
