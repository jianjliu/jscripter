
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

package jsx.core;

import js.*;

/**
 * <p>A utility class providing the static methods operating on regular expressions.</p>
 * <p>Users are encouraged to use the utilities provided by this class instead of the 
 * <b>opaque</b> methods of {@link js.RegExpLike} or {@link js.core.JsRegExp} in 
 * consideration of the reuse benefit for re-compilation results.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class RegExpLikes extends Disposable
{
	private RegExpLikes() {}

	/**
	 * <p>Gets the <tt>global</tt> field of the current regular expression instance.</p>
	 * <p>The <tt>global</tt> field is a read-only boolean property of regular expression
	 * instances. It specifies whether a particular regular expression performs global matching, 
	 * that is, whether it was created with the "g" attribute.</p>
	 * @param r The current regular expression.
	 * @return The value of the <tt>global</tt> field of the regular expression.
	 * @see Js#re(String, String)
	 * @since 1.0
	 */
	public static final boolean global(RegExpLike r) {
		return r.global();
	}
	/**
	 * <p>Gets the <tt>ignoreCase</tt> field of the current regular expression instance.</p>
	 * <p>The <tt>ignoreCase</tt> field is a read-only boolean property of regular expression 
	 * instances. It specifies whether a particular regular expression performs case-insensitive 
	 * matching, that is, whether it was created with the "i" attribute.</p>
	 * @param r The current regular expression.
	 * @return The value of the <tt>ignoreCase</tt> field of the regular expression.
	 * @see Js#re(String, String)
	 * @since 1.0
	 */
	public static final boolean ignoreCase(RegExpLike r) {
		return r.ignoreCase();
	}
	/**
	 * <p>Gets the <tt>multiline</tt> field of the current regular expression instance.</p>
	 * <p>The <tt>multiline</tt> field is a read-only boolean property of regular expression 
	 * instances. It specifies whether a particular regular expression performs multiline 
	 * matching, that is, whether it was created with the "m" attribute.</p>
	 * @param r The current regular expression.
	 * @return The value of the <tt>multiline</tt> field of the regular expression.
	 * @see Js#re(String, String)
	 * @since 1.0
	 */
	public static final boolean multiline(RegExpLike r) {
		return r.multiline();
	}
	/**
	 * <p>Gets the <tt>lastIndex</tt> field of the current regular expression instance.</p>
	 * <p>The <tt>lastIndex</tt> field is a read/write property of regular expression 
	 * instances. For regular expressions with the "g" attribute set, it contains an 
	 * integer that specifies the character position immediately following the last match 
	 * found by the {@link #exec(js.RegExpLike, Object)} and {@link #test(js.RegExpLike, Object)} methods. These methods 
	 * use this property as the starting point for the next search they conduct. This 
	 * allows you to call those methods repeatedly, to loop through all matches in a 
	 * string. Note that <tt>lastIndex</tt> is not used by regular expressions that do 
	 * not have the "g" attribute set and do not represent global patterns.</p>
	 * <p>This property is read/write, so you can set it at any time to specify where in the 
	 * target string the next search should begin. {@link #exec(js.RegExpLike, Object)} and {@link #test(js.RegExpLike, Object)} 
	 * automatically reset <tt>lastIndex</tt> to 0 when they fail to find a match 
	 * (or another match). If you begin to search a new string after a successful match 
	 * of some other string, you have to explicitly set this property to 0.</p>
	 * @param r The current regular expression.
	 * @return The value of the <tt>lastIndex</tt> field of the regular expression.
	 * @see #lastIndex(js.RegExpLike, Integer)
	 * @see #exec(js.RegExpLike, Object)
	 * @see #test(js.RegExpLike, Object)
	 * @since 1.0
	 */
	public static final Integer lastIndex(RegExpLike r) {
		return r.lastIndex();
	}
	/**
	 * <p>Sets the <tt>lastIndex</tt> field of the current regular expression instance.</p>
	 * <p>The <tt>lastIndex</tt> field is a read/write property of regular expression 
	 * instances. For regular expressions with the "g" attribute set, it contains an 
	 * integer that specifies the character position immediately following the last match 
	 * found by the {@link #exec(js.RegExpLike, Object)} and {@link #test(js.RegExpLike, Object)} methods. These methods 
	 * use this property as the starting point for the next search they conduct. This 
	 * allows you to call those methods repeatedly, to loop through all matches in a 
	 * string. Note that <tt>lastIndex</tt> is not used by regular expressions that do 
	 * not have the "g" attribute set and do not represent global patterns.</p>
	 * <p>This property is read/write, so you can set it at any time to specify where in the 
	 * target string the next search should begin. {@link #exec(js.RegExpLike, Object)} and {@link #test(js.RegExpLike, Object)} 
	 * automatically reset <tt>lastIndex</tt> to 0 when they fail to find a match 
	 * (or another match). If you begin to search a new string after a successful match 
	 * of some other string, you have to explicitly set this property to 0.</p>
	 * @param r The current regular expression.
	 * @param lastIndex The new <tt>lastIndex</tt> to set.
	 * @return The new value of the <tt>lastIndex</tt>.
	 * @see #lastIndex(js.RegExpLike)
	 * @see #exec(js.RegExpLike, Object)
	 * @see #test(js.RegExpLike, Object)
	 * @since 1.0
	 */
	public static final Integer lastIndex(RegExpLike r, Integer lastIndex) {
		return r.lastIndex(lastIndex);
	}
	/**
	 * <p>Gets the <tt>source</tt> field of the current regular expression instance.</p>
	 * <p>The <tt>source</tt> field is a read-only string property of regular expression 
	 * instances. It contains the text of the regular expression. This text does not include 
	 * the delimiting slashes used in regular-expression literals, and it does not include 
	 * the "g", "i", and "m" attributes.</p>
	 * @param r The current regular expression.
	 * @return The source text of the regular expression.
	 * @since 1.0
	 */
	public static final String source(RegExpLike r) {
		return r.source();
	}
	/**
	 * <p>Performs powerful, general-purpose pattern matching with the current regular expression instance.</p>
	 * <p>This method is the most powerful of all the regular expression and string 
	 * pattern-matching methods. It is a general-purpose method that is somewhat more 
	 * complex to use than {@link #test(js.RegExpLike, Object)}, {@link StringLikes#search(js.StringLike, RegExpLike)}, 
	 * {@link StringLikes#replace(js.StringLike, RegExpLike, String)}, and {@link StringLikes#match(js.StringLike, RegExpLike)}.</p>
	 * <p>This invocation searches string for text that matches the current regular expression. 
	 * If it finds a match, it returns an array of results; otherwise, it returns 
	 * <tt>null</tt>. Element 0 of the returned array is the matched text. Element 1 is 
	 * the text that matched the first parenthesized subexpression, if any, within the current 
	 * regular expression. Element 2 contains the text that matched the second subexpression, 
	 * and so on. The array length property specifies the number of elements in the array, 
	 * as usual. In addition to the array elements and the length property, the value 
	 * returned by the invocation also has two other properties. The <tt>index</tt> 
	 * property (see {@link ArrayLikes#index(js.ArrayLike)}) specifies the character position of the first 
	 * character of the matched text. The <tt>input</tt> property (see {@link ArrayLikes#input(js.ArrayLike)}) 
	 * refers to <tt>s</tt>. This returned array is the same as the array that is 
	 * returned by the {@link StringLikes#match(js.StringLike, RegExpLike)} method, when invoked on a 
	 * non-global regular expression instance.</p>
	 * <p>When this method is invoked on a non-global pattern, it performs the search and 
	 * returns the result described earlier. When the current instance is a global regular 
	 * expression, however, the invocation behaves in a slightly more complex way. It begins 
	 * searching string at the character position specified by the <tt>lastIndex</tt> 
	 * property (see {@link #lastIndex(js.RegExpLike)} and {@link #lastIndex(js.RegExpLike, Integer)}) of the current 
	 * regular expression. When it finds a match, it sets <tt>lastIndex</tt> to the 
	 * position of the first character after the match. This means that you can invoke 
	 * this method repeatedly in order to loop through all matches in a string. When 
	 * the invocation cannot find any more matches, it returns <tt>null</tt> and 
	 * resets <tt>lastIndex</tt> to zero. If you begin searching a new string 
	 * immediately after successfully finding a match in another string, you must be 
	 * careful to manually reset <tt>lastIndex</tt> to zero.</p>
	 * <p>Note that this invocation always includes full details of every match in the 
	 * array it returns, whether or not the current regular expression is a global pattern. 
	 * This is where this method differs from {@link StringLikes#match(js.StringLike, RegExpLike)}, which 
	 * returns much less information when used with global patterns. Calling this method 
	 * repeatedly in a loop is the only way to obtain complete pattern-matching 
	 * information for a global pattern.</p>
	 * @param r The current regular expression.
	 * @param s The string to be tested.
	 * @return An array containing the results of the match or undefined 
	 * <tt>null</tt> if no match was found.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked with an instance that is not a regular expression. See {@link Js#err(Object)} 
	 * and {@link js.core.JsTypeError} for JS Simulation.
	 * @see #lastIndex(js.RegExpLike)
	 * @see #lastIndex(js.RegExpLike, Integer)
	 * @see #test(js.RegExpLike, Object)
	 * @see StringLikes#match(js.StringLike, RegExpLike)
	 * @see StringLikes#replace(js.StringLike, RegExpLike, String)
	 * @see StringLikes#replace(js.StringLike, RegExpLike, StringLike)
	 * @see StringLikes#replace(js.StringLike, RegExpLike, js.core.JsFunction)
	 * @see StringLikes#search(js.StringLike, RegExpLike)
	 * @since 1.0
	 */
	public static final ArrayLike<?> exec(RegExpLike r, Object s) {
		return r.exec(s);
	}
	/**
	 * <p>Tests whether a string contains the pattern represented by the current regular 
	 * expression.</p>
	 * <p></p>
	 * @param r The current regular expression.
	 * @param s The string to be tested.
	 * @return <tt>true</tt> if <tt>s</tt> contains text that matches the current 
	 * regular expression; false otherwise.
	 * @throws RuntimeException JavaScript throws a <tt>TypeError</tt> if this method 
	 * is invoked with an instance that is not a regular expression. See {@link Js#err(Object)} 
	 * and {@link js.core.JsTypeError} for JS Simulation.
	 * @see #exec(js.RegExpLike, Object)
	 * @see #lastIndex(js.RegExpLike)
	 * @see #lastIndex(js.RegExpLike, Integer)
	 * @see StringLikes#match(js.StringLike, RegExpLike)
	 * @see StringLikes#replace(js.StringLike, RegExpLike, String)
	 * @see StringLikes#replace(js.StringLike, RegExpLike, StringLike)
	 * @see StringLikes#replace(js.StringLike, RegExpLike, js.core.JsFunction)
	 * @see StringLikes#search(js.StringLike, RegExpLike)
	 * @see StringLikes#substring(js.StringLike, Object)
	 * @see StringLikes#substring(js.StringLike, Object, Object)
	 * @since 1.0
	 */
	public static final boolean test(RegExpLike r, Object s) {
		return r.test(s);
	}
}
