
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
import js.core.*;

/**
 * <p>A utility class providing basic string operations with its static methods.</p>
 * <p>Users are encouraged to use the utilities provided by this class instead of the 
 * <b>opaque</b> methods of {@link js.StringLike}, {@link js.core.JsString} or 
 * {@link js.Value.String} in consideration of the reuse benefit for re-compilation 
 * results.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class StringLikes extends Disposable
{
	private StringLikes() {}

	/**
	 * <p>Gets the length of the current string, an integer that indicates the number of 
	 * characters in the current string. For any string <tt>s</tt>, the index of the 
	 * last character is <tt>s.length() - 1</tt>. The length property of a string may 
	 * not be deleted.</p>
	 * @param s The current string.
	 * @return The length of the current string.
	 * @see js.StringLike#length()
	 * @since 1.0
	 */
	public static final int length(StringLike s) {
		return s.length();
	}
	public static final String fromCharCode(Object ch) {
		return JsGlobal.String.with().fromCharCode(ch);
	}
	/**
	 * <p>Returns the character string of length 1 at the specified <tt>index</tt> within 
	 * the current string. An index ranges from 0 to <tt>length() - 1</tt>. The first 
	 * character of the sequence is at index 0, the next at index 1, and so on, as for 
	 * array indexing. If <tt>index</tt> is not between 0 and <tt>length() - 1</tt>, 
	 * this invocation returns an empty string.</p>
	 * @param s The current string.
	 * @param index The index of the character
	 * @return The character string of length 1 at the specified index of the current string
	 * @see #charCodeAt(js.StringLike, Object)
	 * @see #indexOf(js.StringLike, Object)
	 * @see #indexOf(js.StringLike, Object, Object)
	 * @see #lastIndexOf(js.StringLike, Object)
	 * @see #lastIndexOf(js.StringLike, Object, Object)
	 * @see js.StringLike#charAt(Object)
	 * @since 1.0
	 */
	public static final String charAt(StringLike s, Object index) {
		return s.charAt(index);
	}
	/**
	 * <p>Returns the character string of length 1 at the specified <tt>index</tt> within 
	 * the current string. An index ranges from 0 to <tt>length() - 1</tt>. The first 
	 * character of the sequence is at index 0, the next at index 1, and so on, as for 
	 * array indexing. If <tt>index</tt> is not between 0 and <tt>length() - 1</tt>, 
	 * this invocation returns an empty string.</p>
	 * @param s The current string.
	 * @param index The index of the character
	 * @return The character string of length 1 at the specified index of the current string
	 * @see #charCodeAt(String, Object)
	 * @see #indexOf(String, Object)
	 * @see #indexOf(String, Object, Object)
	 * @see #lastIndexOf(String, Object)
	 * @see #lastIndexOf(String, Object, Object)
	 * @see js.Value.String#charAt(Object)
	 * @since 1.0
	 */
	public static final String charAt(String s, Object index) {
		return new Value.String(s).charAt(index);
	}
	/**
	 * <p>Returns the character encoding at a specific <tt>index</tt> within the current 
	 * string. An index ranges from 0 to <tt>length() - 1</tt>. The first 
	 * character of the sequence is at index 0, the next at index 1, and so on, as for 
	 * array indexing. If <tt>index</tt> is not between 0 and <tt>length() - 1</tt>, 
	 * this invocation returns <tt>NaN</tt>.</p>
	 * @param s The current string.
	 * @param index The index of the character
	 * @return The Unicode encoding of the character within the current string. The return 
	 * value is a 16-bit integer between 0 and 65535.
	 * @see #charAt(js.StringLike, Object)
	 * @see #indexOf(js.StringLike, Object)
	 * @see #indexOf(js.StringLike, Object, Object)
	 * @see #lastIndexOf(js.StringLike, Object)
	 * @see #lastIndexOf(js.StringLike, Object, Object)
	 * @see js.StringLike#charCodeAt(Object)
	 * @since 1.0
	 */
	public static final Character charCodeAt(StringLike s, Object index) {
		return s.charCodeAt(index);
	}
	/**
	 * <p>Returns the character encoding at a specific <tt>index</tt> within the current 
	 * string. An index ranges from 0 to <tt>length() - 1</tt>. The first 
	 * character of the sequence is at index 0, the next at index 1, and so on, as for 
	 * array indexing. If <tt>index</tt> is not between 0 and <tt>length() - 1</tt>, 
	 * this invocation returns <tt>NaN</tt>.</p>
	 * @param s The current string.
	 * @param index The index of the character
	 * @return The Unicode encoding of the character within the current string. The return 
	 * value is a 16-bit integer between 0 and 65535.
	 * @see #charAt(String, Object)
	 * @see #indexOf(String, Object)
	 * @see #indexOf(String, Object, Object)
	 * @see #lastIndexOf(String, Object)
	 * @see #lastIndexOf(String, Object, Object)
	 * @see js.Value.String#charCodeAt(Object)
	 * @since 1.0
	 */
	public static final Character charCodeAt(String s, Object index) {
		return new Value.String(s).charCodeAt(index);
	}
	/**
	 * <p>Converts the argument to a string (if necessary) and appends them, in order, to 
	 * the end of the current string and returns the resulting concatenation.</p>
	 * <p>Note that the current string itself is not modified.</p>
	 * <p>This method is an analog to {@link ArrayLikes#concat(js.ArrayLike, Object)}. Note that it is 
	 * often easier to use {@link Js#add(Object, Object)} perform string concatenation.</p>
	 * @param s The current string.
	 * @param other A value to be concatenated to the current string
	 * @return A new string that results from concatenating the argument to the current 
	 * string.
	 * @see ArrayLikes#concat(js.ArrayLike, Object)
	 * @see js.StringLike#concat(Object)
	 * @since 1.0
	 */
	public static final String concat(StringLike s, Object other) {
		return s.concat(other);
	}
	/**
	 * <p>Converts the argument to a string (if necessary) and appends them, in order, to 
	 * the end of the current string and returns the resulting concatenation.</p>
	 * <p>Note that the current string itself is not modified.</p>
	 * <p>This method is an analog to {@link ArrayLikes#concat(js.ArrayLike, Object)}. Note that it is 
	 * often easier to use {@link Js#add(Object, Object)} perform string concatenation.</p>
	 * @param s The current string.
	 * @param other A value to be concatenated to the current string
	 * @return A new string that results from concatenating the argument to the current 
	 * string.
	 * @see ArrayLikes#concat(js.ArrayLike, Object)
	 * @see js.Value.String#concat(Object)
	 * @since 1.0
	 */
	public static final String concat(String s, Object other) {
		return new Value.String(s).concat(other);
	}
	/**
	 * <p>Searches the current string instance from beginning to end to see if it contains 
	 * an occurrence of the substring <tt>other</tt>. The search begins at the beginning 
	 * of the current string. If an occurrence of the substring is found, this invocation 
	 * returns the position of the first character of the first occurrence of the substring 
	 * within the current string. Character positions within string are numbered starting with 
	 * zero. If no occurrence of substring is found within the current string, this invocation 
	 * returns -1.</p>
	 * @param s The current string.
	 * @param other The substring that is to be searched for within the current string
	 * @return The position of the first occurrence of <tt>other</tt> within string, if 
	 * any, or -1 if no such occurrence is found.
	 * @see #indexOf(js.StringLike, Object, Object)
	 * @see #charAt(js.StringLike, Object)
	 * @see #lastIndexOf(js.StringLike, Object)
	 * @see #lastIndexOf(js.StringLike, Object, Object)
	 * @see #substr(js.StringLike, Object)
	 * @see #substr(js.StringLike, Object, Object)
	 * @see #substring(js.StringLike, Object)
	 * @see #substring(js.StringLike, Object, Object)
	 * @see js.StringLike#indexOf(Object)
	 * @since 1.0
	 */
	public static final int indexOf(StringLike s, Object other) {
		return s.indexOf(other);
	}
	/**
	 * <p>Searches the current string instance from beginning to end to see if it contains 
	 * an occurrence of the substring <tt>other</tt>. The search begins at the beginning 
	 * of the current string. If an occurrence of the substring is found, this invocation 
	 * returns the position of the first character of the first occurrence of the substring 
	 * within the current string. Character positions within string are numbered starting with 
	 * zero. If no occurrence of substring is found within the current string, this invocation 
	 * returns -1.</p>
	 * @param s The current string.
	 * @param other The substring that is to be searched for within the current string
	 * @return The position of the first occurrence of <tt>other</tt> within string, if 
	 * any, or -1 if no such occurrence is found.
	 * @see #indexOf(String, Object, Object)
	 * @see #charAt(String, Object)
	 * @see #lastIndexOf(String, Object)
	 * @see #lastIndexOf(String, Object, Object)
	 * @see #substr(String, Object)
	 * @see #substr(String, Object, Object)
	 * @see #substring(String, Object)
	 * @see #substring(String, Object, Object)
	 * @see js.Value.String#indexOf(Object)
	 * @since 1.0
	 */
	public static final int indexOf(String s, Object other) {
		return new Value.String(s).indexOf(other).intValue();
	}
	/**
	 * <p>Searches the current string instance from beginning to end to see if it contains 
	 * an occurrence of the substring <tt>other</tt>. The search begins at position 
	 * <tt>pos</tt> within string, or at the beginning of string if <tt>pos</tt> is  
	 * undefined. If an occurrence of the substring is found, this invocation returns the 
	 * position of the first character of the first occurrence of the substring within 
	 * the current string. Character positions within string are numbered starting with 
	 * zero. If no occurrence of substring is found within the current string, this invocation 
	 * returns -1.</p>
	 * @param s The current string.
	 * @param other The substring that is to be searched for within the current string
	 * @param pos An optional integer argument that specifies the position within the 
	 * current string at which the search is to start. Legal values are 0 (the position of 
	 * the first character in the string) to <tt>length() - 1</tt> (the position of 
	 * the last character in the string). If this argument is undefined, the search begins 
	 * at the first character of the string
	 * @return The position of the first occurrence of <tt>other</tt> within string that 
	 * appears after the <tt>pos</tt> position, if any, or -1 if no such occurrence 
	 * is found.
	 * @see #indexOf(js.StringLike, Object)
	 * @see #charAt(js.StringLike, Object)
	 * @see #lastIndexOf(js.StringLike, Object)
	 * @see #lastIndexOf(js.StringLike, Object, Object)
	 * @see #substr(js.StringLike, Object)
	 * @see #substr(js.StringLike, Object, Object)
	 * @see #substring(js.StringLike, Object)
	 * @see #substring(js.StringLike, Object, Object)
	 * @see js.StringLike#indexOf(Object, Object)
	 * @since 1.0
	 */
	public static final int indexOf(StringLike s, Object other, Object pos) {
		return s.indexOf(other, pos);
	}
	/**
	 * <p>Searches the current string instance from beginning to end to see if it contains 
	 * an occurrence of the substring <tt>other</tt>. The search begins at position 
	 * <tt>pos</tt> within string, or at the beginning of string if <tt>pos</tt> is  
	 * undefined. If an occurrence of the substring is found, this invocation returns the 
	 * position of the first character of the first occurrence of the substring within 
	 * the current string. Character positions within string are numbered starting with 
	 * zero. If no occurrence of substring is found within the current string, this invocation 
	 * returns -1.</p>
	 * @param s The current string.
	 * @param other The substring that is to be searched for within the current string
	 * @param pos An optional integer argument that specifies the position within the 
	 * current string at which the search is to start. Legal values are 0 (the position of 
	 * the first character in the string) to <tt>length() - 1</tt> (the position of 
	 * the last character in the string). If this argument is undefined, the search begins 
	 * at the first character of the string
	 * @return The position of the first occurrence of <tt>other</tt> within string that 
	 * appears after the <tt>pos</tt> position, if any, or -1 if no such occurrence 
	 * is found.
	 * @see #indexOf(String, Object)
	 * @see #charAt(String, Object)
	 * @see #lastIndexOf(String, Object)
	 * @see #lastIndexOf(String, Object, Object)
	 * @see #substr(String, Object)
	 * @see #substr(String, Object, Object)
	 * @see #substring(String, Object)
	 * @see #substring(String, Object, Object)
	 * @see js.Value.String#indexOf(Object, Object)
	 * @since 1.0
	 */
	public static final int indexOf(String s, Object other, Object pos) {
		return new Value.String(s).indexOf(other, pos).intValue();
	}
	/**
	 * <p>Searches the current string instance from end to beginning to see if it contains 
	 * an occurrence of the substring <tt>other</tt>. The search begins at the end 
	 * of the current string. If an occurrence of the substring is found, this invocation 
	 * returns the position of the first character of that occurrence. If no occurrence of 
	 * substring is found within the current string, this invocation returns -1.</p>
	 * @param s The current string.
	 * @param other The substring that is to be searched for within the current string
	 * @return The position of the last occurrence of <tt>other</tt> within string, if 
	 * any, or -1 if no such occurrence is found.
	 * @see #lastIndexOf(js.StringLike, Object, Object)
	 * @see #charAt(js.StringLike, Object)
	 * @see #indexOf(js.StringLike, Object)
	 * @see #indexOf(js.StringLike, Object, Object)
	 * @see #substr(js.StringLike, Object)
	 * @see #substr(js.StringLike, Object, Object)
	 * @see #substring(js.StringLike, Object)
	 * @see #substring(js.StringLike, Object, Object)
	 * @see js.StringLike#lastIndexOf(Object)
	 * @since 1.0
	 */
	public static final int lastIndexOf(StringLike s, Object other) {
		return s.lastIndexOf(other);
	}
	/**
	 * <p>Searches the current string instance from end to beginning to see if it contains 
	 * an occurrence of the substring <tt>other</tt>. The search begins at the end 
	 * of the current string. If an occurrence of the substring is found, this invocation 
	 * returns the position of the first character of that occurrence. If no occurrence of 
	 * substring is found within the current string, this invocation returns -1.</p>
	 * @param s The current string.
	 * @param other The substring that is to be searched for within the current string
	 * @return The position of the last occurrence of <tt>other</tt> within string, if 
	 * any, or -1 if no such occurrence is found.
	 * @see #lastIndexOf(String, Object, Object)
	 * @see #charAt(String, Object)
	 * @see #indexOf(String, Object)
	 * @see #indexOf(String, Object, Object)
	 * @see #substr(String, Object)
	 * @see #substr(String, Object, Object)
	 * @see #substring(String, Object)
	 * @see #substring(String, Object, Object)
	 * @see js.Value.String#lastIndexOf(Object)
	 * @since 1.0
	 */
	public static final int lastIndexOf(String s, Object other) {
		return new Value.String(s).lastIndexOf(other).intValue();
	}
	/**
	 * <p>Searches the current string instance from end to beginning to see if it contains 
	 * an occurrence of the substring <tt>other</tt>. The search begins at position 
	 * <tt>pos</tt> within string, or at the end of string if <tt>pos</tt> is  
	 * undefined. If an occurrence of the substring is found, this invocation returns the 
	 * position of the first character that occurrence. Since this method 
	 * searches from end to beginning of the string, the first occurrence found is the last 
	 * one in the string that occurs before the <tt>pos</tt> position. If no occurrence 
	 * of substring is found within the current string, this invocation returns -1.</p>
	 * @param s The current string.
	 * @param other The substring that is to be searched for within the current string
	 * @param pos An optional integer argument that specifies the position within the 
	 * current string at which the search is to start. Legal values are 0 (the position of 
	 * the first character in the string) to <tt>length() - 1</tt> (the position of 
	 * the last character in the string). If this argument is undefined, the search begins 
	 * at the last character of the string
	 * @return The position of the last occurrence of <tt>other</tt> within string that 
	 * appears before the <tt>pos</tt> position, if any, or -1 if no such occurrence 
	 * is found.
	 * @see #lastIndexOf(js.StringLike, Object)
	 * @see #charAt(js.StringLike, Object)
	 * @see #indexOf(js.StringLike, Object)
	 * @see #indexOf(js.StringLike, Object, Object)
	 * @see #substr(js.StringLike, Object)
	 * @see #substr(js.StringLike, Object, Object)
	 * @see #substring(js.StringLike, Object)
	 * @see #substring(js.StringLike, Object, Object)
	 * @see js.StringLike#lastIndexOf(Object, Object)
	 * @since 1.0
	 */
	public static final int lastIndexOf(StringLike s, Object other, Object pos) {
		return s.lastIndexOf(other, pos);
	}
	/**
	 * <p>Searches the current string instance from end to beginning to see if it contains 
	 * an occurrence of the substring <tt>other</tt>. The search begins at position 
	 * <tt>pos</tt> within string, or at the end of string if <tt>pos</tt> is  
	 * undefined. If an occurrence of the substring is found, this invocation returns the 
	 * position of the first character that occurrence. Since this method 
	 * searches from end to beginning of the string, the first occurrence found is the last 
	 * one in the string that occurs before the <tt>pos</tt> position. If no occurrence 
	 * of substring is found within the current string, this invocation returns -1.</p>
	 * @param s The current string.
	 * @param other The substring that is to be searched for within the current string
	 * @param pos An optional integer argument that specifies the position within the 
	 * current string at which the search is to start. Legal values are 0 (the position of 
	 * the first character in the string) to <tt>length() - 1</tt> (the position of 
	 * the last character in the string). If this argument is undefined, the search begins 
	 * at the last character of the string
	 * @return The position of the last occurrence of <tt>other</tt> within string that 
	 * appears before the <tt>pos</tt> position, if any, or -1 if no such occurrence 
	 * is found.
	 * @see #lastIndexOf(String, Object)
	 * @see #charAt(String, Object)
	 * @see #indexOf(String, Object)
	 * @see #indexOf(String, Object, Object)
	 * @see #substr(String, Object)
	 * @see #substr(String, Object, Object)
	 * @see #substring(String, Object)
	 * @see #substring(String, Object, Object)
	 * @see js.Value.String#lastIndexOf(Object, Object)
	 * @since 1.0
	 */
	public static final int lastIndexOf(String s, Object other, Object pos) {
		return new Value.String(s).lastIndexOf(other, pos).intValue();
	}
	/**
	 * <p>Compares strings taking the collation order of the default locale into account.</p>
	 * <p>The ECMAScript standard does not specify how the locale-specific comparison is done; 
	 * it merely specifies that this function utilize the collation order provided by the 
	 * underlying operating system.</p>
	 * @param s The current string.
	 * @param other A string to be compared, in a locale-sensitive fashion, with the current string
	 * @return An integer number that indicates the result of the comparison. If the current 
	 * string is "less than" the string <tt>other</tt>, this invocation returns a 
	 * number less than zero. If the current string is "greater than" <tt>other</tt>, 
	 * it returns a integer number greater than zero. And if the strings are identical or 
	 * indistinguishable according to the locale ordering conventions, the method returns 0.
	 * @see js.StringLike#localeCompare(Object)
	 * @since 1.0
	 */
	public static final int localeCompare(StringLike s, Object other) {
		return s.localeCompare(other);
	}
	/**
	 * <p>Compares strings taking the collation order of the default locale into account.</p>
	 * <p>The ECMAScript standard does not specify how the locale-specific comparison is done; 
	 * it merely specifies that this function utilize the collation order provided by the 
	 * underlying operating system.</p>
	 * @param s The current string.
	 * @param other A string to be compared, in a locale-sensitive fashion, with the current string
	 * @return An integer number that indicates the result of the comparison. If the current 
	 * string is "less than" the string <tt>other</tt>, this invocation returns a 
	 * number less than zero. If the current string is "greater than" <tt>other</tt>, 
	 * it returns a integer number greater than zero. And if the strings are identical or 
	 * indistinguishable according to the locale ordering conventions, the method returns 0.
	 * @see js.StringLike#localeCompare(Object)
	 * @since 1.0
	 */
	public static final int localeCompare(String s, Object other) {
		return new Value.String(s).localeCompare(other).intValue();
	}
	/**
	 * <p>Searches the current string for one or more matches of <tt>regexp</tt>. 
	 * The behavior of this invocation depends significantly on whether <tt>regexp</tt> 
	 * has the "g" attribute or not .</p>
	 * <p>If <tt>regexp</tt> does not have the "g" attribute, this invocation searches 
	 * string for a single match. If no match is found, it returns <tt>null</tt>. 
	 * Otherwise, it returns an array containing information about the match that it found. 
	 * Element 0 of the array contains the matched text. The remaining elements contain 
	 * the text that matches any parenthesized subexpressions within the regular expression. 
	 * In addition to these normal array elements, the returned array also has two object 
	 * properties. The <tt>index</tt> property (see {@link ArrayLikes#index(js.ArrayLike)}) of the array  
	 * specifies the character position within string of the start of the matched text. Also, 
	 * the <tt>input</tt> property (see {@link ArrayLikes#input(js.ArrayLike)}) of the returned array 
	 * is a reference to string itself.</p>
	 * <p>If <tt>regexp</tt> has the "g" flag, this invocation does a global search, 
	 * searching string for all matching substrings. It returns <tt>null</tt> if no 
	 * match is found, and it returns an array if one or more matches are found. The 
	 * contents of this returned array are quite different for global matches, however. In 
	 * this case, the array elements contain each of the matched substrings within string. 
	 * The returned array does not have <tt>index</tt> (see {@link ArrayLikes#index(js.ArrayLike)}) 
	 * or <tt>input</tt> (see {@link ArrayLikes#input(js.ArrayLike)}) properties in this case. Note 
	 * that for global matches, this invocation does not provide information about 
	 * parenthesized subexpressions, nor does it specify where within string each match 
	 * occurred. If you need to obtain this information for a global search, you can use 
	 * {@link RegExpLikes#exec(js.RegExpLike, Object)}.</p>
	 * @param s The current string.
	 * @param regexp A RegExp object that specifies the pattern to be matched
	 * @return An array containing the results of the match. The contents of the array 
	 * depend on whether regexp has the global "g" attribute set.
	 * @see #replace(js.StringLike, RegExpLike, String)
	 * @see #replace(js.StringLike, RegExpLike, StringLike)
	 * @see #replace(js.StringLike, RegExpLike, JsFunction)
	 * @see #search(js.StringLike, RegExpLike)
	 * @see ArrayLikes#index(js.ArrayLike)
	 * @see ArrayLikes#input(js.ArrayLike)
	 * @see Js#re(String)
	 * @see Js#re(String, String)
	 * @see RegExpLikes#exec(js.RegExpLike, Object)
	 * @see RegExpLikes#test(js.RegExpLike, Object)
	 * @see js.StringLike#match(js.RegExpLike)
	 * @since 1.0
	 */
	public static final ArrayLike<?> match(StringLike s, RegExpLike regexp) {
		return s.match(regexp);
	}
	/**
	 * <p>Searches the current string for one or more matches of <tt>regexp</tt>. 
	 * The behavior of this invocation depends significantly on whether <tt>regexp</tt> 
	 * has the "g" attribute or not .</p>
	 * <p>If <tt>regexp</tt> does not have the "g" attribute, this invocation searches 
	 * string for a single match. If no match is found, it returns <tt>null</tt>. 
	 * Otherwise, it returns an array containing information about the match that it found. 
	 * Element 0 of the array contains the matched text. The remaining elements contain 
	 * the text that matches any parenthesized subexpressions within the regular expression. 
	 * In addition to these normal array elements, the returned array also has two object 
	 * properties. The <tt>index</tt> property (see {@link ArrayLikes#index(js.ArrayLike)}) of the array  
	 * specifies the character position within string of the start of the matched text. Also, 
	 * the <tt>input</tt> property (see {@link ArrayLikes#input(js.ArrayLike)}) of the returned array 
	 * is a reference to string itself.</p>
	 * <p>If <tt>regexp</tt> has the "g" flag, this invocation does a global search, 
	 * searching string for all matching substrings. It returns <tt>null</tt> if no 
	 * match is found, and it returns an array if one or more matches are found. The 
	 * contents of this returned array are quite different for global matches, however. In 
	 * this case, the array elements contain each of the matched substrings within string. 
	 * The returned array does not have <tt>index</tt> (see {@link ArrayLikes#index(js.ArrayLike)}) 
	 * or <tt>input</tt> (see {@link ArrayLikes#input(js.ArrayLike)}) properties in this case. Note 
	 * that for global matches, this invocation does not provide information about 
	 * parenthesized subexpressions, nor does it specify where within string each match 
	 * occurred. If you need to obtain this information for a global search, you can use 
	 * {@link RegExpLikes#exec(js.RegExpLike, Object)}.</p>
	 * @param s The current string.
	 * @param regexp A RegExp object that specifies the pattern to be matched
	 * @return An array containing the results of the match. The contents of the array 
	 * depend on whether regexp has the global "g" attribute set.
	 * @see #replace(String, RegExpLike, String)
	 * @see #replace(String, RegExpLike, StringLike)
	 * @see #replace(String, RegExpLike, JsFunction)
	 * @see #search(String, RegExpLike)
	 * @see ArrayLikes#index(js.ArrayLike)
	 * @see ArrayLikes#input(js.ArrayLike)
	 * @see Js#re(String)
	 * @see Js#re(String, String)
	 * @see RegExpLikes#exec(js.RegExpLike, Object)
	 * @see RegExpLikes#test(js.RegExpLike, Object)
	 * @see js.Value.String#match(js.RegExpLike)
	 * @since 1.0
	 */
	public static final ArrayLike<?> match(String s, RegExpLike regexp) {
		return new Value.String(s).match(regexp);
	}
	/**
	 * <p>Performs a search-and-replace operation on the current string.</p>
	 * <p>This invocation searches the current string for one or more substrings that 
	 * match <tt>regexp</tt> and replaces them with the replacement string 
	 * <tt>newSubStr</tt>.</p>
	 * <p>If <tt>regexp</tt> has the global "g" attribute specified, this invocation 
	 * replaces all matching substrings. Otherwise, it replaces only the first matching 
	 * substring.</p>
	 * <p>Note that the $ character has special meaning within the replacement string 
	 * <tt>newSubStr</tt>. As shown in the following, it indicates that a string 
	 * derived from the pattern match is used in the replacement.</p>
	 * <ul>
	 * <li>$1, $2, ..., $99 The text that matched the 1st through 99th parenthesized 
	 * subexpression within <tt>regexp</tt></li>
	 * <li>$& The substring that matched <tt>regexp</tt></li>
	 * <li>$' The text to the left of the matched substring</li>
	 * <li>$' The text to the right of the matched substring</li>
	 * <li>$$ A literal dollar sign</li>
	 * </ul>
	 * @param s The current string.
	 * @param regexp The RegExp object that specifies the pattern to be replaced
	 * @param newSubStr A string that specifies the replacement text
	 * @return A new string, with the first match, or all matches, of <tt>regexp</tt> 
	 * replaced with the replacement.
	 * @see #replace(js.StringLike, js.RegExpLike, js.StringLike)
	 * @see #replace(js.StringLike, js.RegExpLike, js.core.JsFunction)
	 * @see #match(js.StringLike, js.RegExpLike)
	 * @see #search(js.StringLike, js.RegExpLike)
	 * @see Js#re(String)
	 * @see Js#re(String, String)
	 * @see RegExpLikes#exec(js.RegExpLike, Object)
	 * @see RegExpLikes#test(js.RegExpLike, Object)
	 * @see js.StringLike#replace(js.RegExpLike, String)
	 * @since 1.0
	 */
	public static final String replace(StringLike s, RegExpLike regexp, String newSubStr) {
		return s.replace(regexp, newSubStr);
	}
	/**
	 * <p>Performs a search-and-replace operation on the current string.</p>
	 * <p>This invocation searches the current string for one or more substrings that 
	 * match <tt>regexp</tt> and replaces them with the replacement string 
	 * <tt>newSubStr</tt>.</p>
	 * <p>If <tt>regexp</tt> has the global "g" attribute specified, this invocation 
	 * replaces all matching substrings. Otherwise, it replaces only the first matching 
	 * substring.</p>
	 * <p>Note that the $ character has special meaning within the replacement string 
	 * <tt>newSubStr</tt>. As shown in the following, it indicates that a string 
	 * derived from the pattern match is used in the replacement.</p>
	 * <ul>
	 * <li>$1, $2, ..., $99 The text that matched the 1st through 99th parenthesized 
	 * subexpression within <tt>regexp</tt></li>
	 * <li>$& The substring that matched <tt>regexp</tt></li>
	 * <li>$' The text to the left of the matched substring</li>
	 * <li>$' The text to the right of the matched substring</li>
	 * <li>$$ A literal dollar sign</li>
	 * </ul>
	 * @param s The current string.
	 * @param regexp The RegExp object that specifies the pattern to be replaced
	 * @param newSubStr A string that specifies the replacement text
	 * @return A new string, with the first match, or all matches, of <tt>regexp</tt> 
	 * replaced with the replacement.
	 * @see #replace(js.StringLike, js.RegExpLike, String)
	 * @see #replace(js.StringLike, js.RegExpLike, js.core.JsFunction)
	 * @see #match(js.StringLike, js.RegExpLike)
	 * @see #search(js.StringLike, js.RegExpLike)
	 * @see Js#re(String)
	 * @see Js#re(String, String)
	 * @see RegExpLikes#exec(js.RegExpLike, Object)
	 * @see RegExpLikes#test(js.RegExpLike, Object)
	 * @see js.StringLike#replace(js.RegExpLike, js.StringLike)
	 * @since 1.0
	 */
	public static final String replace(StringLike s, RegExpLike regexp, StringLike newSubStr) {
		return replace(s, regexp, newSubStr.valueOf());
	}
	/**
	 * <p>Performs a search-and-replace operation on the current string.</p>
	 * <p>This invocation searches the current string for one or more substrings that 
	 * match <tt>regexp</tt> and replaces them with the replacement string 
	 * <tt>newSubStr</tt>.</p>
	 * <p>If <tt>regexp</tt> has the global "g" attribute specified, this invocation 
	 * replaces all matching substrings. Otherwise, it replaces only the first matching 
	 * substring.</p>
	 * <p>Note that the $ character has special meaning within the replacement string 
	 * <tt>newSubStr</tt>. As shown in the following, it indicates that a string 
	 * derived from the pattern match is used in the replacement.</p>
	 * <ul>
	 * <li>$1, $2, ..., $99 The text that matched the 1st through 99th parenthesized 
	 * subexpression within <tt>regexp</tt></li>
	 * <li>$& The substring that matched <tt>regexp</tt></li>
	 * <li>$' The text to the left of the matched substring</li>
	 * <li>$' The text to the right of the matched substring</li>
	 * <li>$$ A literal dollar sign</li>
	 * </ul>
	 * @param s The current string.
	 * @param regexp The RegExp object that specifies the pattern to be replaced
	 * @param newSubStr A string that specifies the replacement text
	 * @return A new string, with the first match, or all matches, of <tt>regexp</tt> 
	 * replaced with the replacement.
	 * @see #replace(String, js.RegExpLike, js.StringLike)
	 * @see #replace(String, js.RegExpLike, js.core.JsFunction)
	 * @see #match(String, js.RegExpLike)
	 * @see #search(String, js.RegExpLike)
	 * @see Js#re(String)
	 * @see Js#re(String, String)
	 * @see RegExpLikes#exec(js.RegExpLike, Object)
	 * @see RegExpLikes#test(js.RegExpLike, Object)
	 * @see js.Value.String#replace(js.RegExpLike, String)
	 * @since 1.0
	 */
	public static final String replace(String s, RegExpLike regexp, String newSubStr) {
		return new Value.String(s).replace(regexp, newSubStr);
	}
	/**
	 * <p>Performs a search-and-replace operation on the current string.</p>
	 * <p>This invocation searches the current string for one or more substrings that 
	 * match <tt>regexp</tt> and replaces them with the replacement string 
	 * <tt>newSubStr</tt>.</p>
	 * <p>If <tt>regexp</tt> has the global "g" attribute specified, this invocation 
	 * replaces all matching substrings. Otherwise, it replaces only the first matching 
	 * substring.</p>
	 * <p>Note that the $ character has special meaning within the replacement string 
	 * <tt>newSubStr</tt>. As shown in the following, it indicates that a string 
	 * derived from the pattern match is used in the replacement.</p>
	 * <ul>
	 * <li>$1, $2, ..., $99 The text that matched the 1st through 99th parenthesized 
	 * subexpression within <tt>regexp</tt></li>
	 * <li>$& The substring that matched <tt>regexp</tt></li>
	 * <li>$' The text to the left of the matched substring</li>
	 * <li>$' The text to the right of the matched substring</li>
	 * <li>$$ A literal dollar sign</li>
	 * </ul>
	 * @param s The current string.
	 * @param regexp The RegExp object that specifies the pattern to be replaced
	 * @param newSubStr A string that specifies the replacement text
	 * @return A new string, with the first match, or all matches, of <tt>regexp</tt> 
	 * replaced with the replacement.
	 * @see #replace(String, js.RegExpLike, String)
	 * @see #replace(String, js.RegExpLike, js.core.JsFunction)
	 * @see #match(String, js.RegExpLike)
	 * @see #search(String, js.RegExpLike)
	 * @see Js#re(String)
	 * @see Js#re(String, String)
	 * @see RegExpLikes#exec(js.RegExpLike, Object)
	 * @see RegExpLikes#test(js.RegExpLike, Object)
	 * @see js.Value.String#replace(js.RegExpLike, js.StringLike)
	 * @since 1.0
	 */
	public static final String replace(String s, RegExpLike regexp, StringLike newSubStr) {
		return replace(s, regexp, newSubStr.valueOf());
	}
	/**
	 * <p>Performs a search-and-replace operation on the current string.</p>
	 * <p>This invocation searches the current string for one or more substrings that 
	 * match <tt>regexp</tt> and replaces them with the replacement string generated by 
	 * <tt>lambda</tt>.</p>
	 * <p>If <tt>regexp</tt> has the global "g" attribute specified, this invocation 
	 * replaces all matching substrings. Otherwise, it replaces only the first matching 
	 * substring.</p>
	 * @param s The current string.
	 * @param regexp The RegExp object that specifies the pattern to be replaced
	 * @param lambda A function that is invoked to generate the replacement text
	 * @return A new string, with the first match, or all matches, of <tt>regexp</tt> 
	 * replaced with the replacement.
	 * @see #replace(js.StringLike, js.RegExpLike, String)
	 * @see #replace(js.StringLike, js.RegExpLike, js.StringLike)
	 * @see #match(js.StringLike, js.RegExpLike)
	 * @see #search(js.StringLike, js.RegExpLike)
	 * @see Js#re(String)
	 * @see Js#re(String, String)
	 * @see RegExpLikes#exec(js.RegExpLike, Object)
	 * @see RegExpLikes#test(js.RegExpLike, Object)
	 * @see js.StringLike#replace(js.RegExpLike, JsFunction)
	 * @since 1.0
	 */
	public static final String replace(StringLike s, RegExpLike regexp, JsFunction<String> lambda) {
		return s.replace(regexp, lambda);
	}
	/**
	 * <p>Performs a search-and-replace operation on the current string.</p>
	 * <p>This invocation searches the current string for one or more substrings that 
	 * match <tt>regexp</tt> and replaces them with the replacement string generated by 
	 * <tt>lambda</tt>.</p>
	 * <p>If <tt>regexp</tt> has the global "g" attribute specified, this invocation 
	 * replaces all matching substrings. Otherwise, it replaces only the first matching 
	 * substring.</p>
	 * @param s The current string.
	 * @param regexp The RegExp object that specifies the pattern to be replaced
	 * @param lambda A function that is invoked to generate the replacement text
	 * @return A new string, with the first match, or all matches, of <tt>regexp</tt> 
	 * replaced with the replacement.
	 * @see #replace(String, js.RegExpLike, String)
	 * @see #replace(String, js.RegExpLike, js.StringLike)
	 * @see #match(String, js.RegExpLike)
	 * @see #search(String, js.RegExpLike)
	 * @see Js#re(String)
	 * @see Js#re(String, String)
	 * @see RegExpLikes#exec(js.RegExpLike, Object)
	 * @see RegExpLikes#test(js.RegExpLike, Object)
	 * @see js.Value.String#replace(js.RegExpLike, JsFunction)
	 * @since 1.0
	 */
	public static final String replace(String s, RegExpLike regexp, JsFunction<String> lambda) {
		return new Value.String(s).replace(regexp, lambda);
	}
	/**
	 * <p>Looks for a substring matching <tt>regexp</tt> within the current string 
	 * and returns the position of the first character of the matching substring, 
	 * or -1 if no match was found.</p>
	 * <p>This invocation does not do global matches; it ignores the "g" flag of 
	 * <tt>regexp</tt>. It also ignores the <tt>lastIndex</tt> property 
	 * (see {@link RegExpLikes#lastIndex(js.RegExpLike)} and {@link RegExpLikes#lastIndex(js.RegExpLike, Integer)}) of 
	 * <tt>regexp</tt> and always searches from the beginning of the string, which 
	 * means that it always returns the position of the first match in the string.</p>
	 * @param s The current string.
	 * @param regexp A RegExp object that specifies the pattern to be searched for in the current string.
	 * @return The position of the start of the first substring of the current string 
	 * that matches <tt>regexp</tt>, or -1 if no match is found.
	 * @see #replace(js.StringLike, RegExpLike, String)
	 * @see #replace(js.StringLike, RegExpLike, StringLike)
	 * @see #replace(js.StringLike, RegExpLike, JsFunction)
	 * @see #match(js.StringLike, RegExpLike)
	 * @see Js#re(String)
	 * @see Js#re(String, String)
	 * @see RegExpLikes#exec(js.RegExpLike, Object)
	 * @see RegExpLikes#test(js.RegExpLike, Object)
	 * @see js.StringLike#search(js.RegExpLike)
	 * @since 1.0
	 */
	public static final int search(StringLike s, RegExpLike regexp) {
		return s.search(regexp);
	}
	/**
	 * <p>Looks for a substring matching <tt>regexp</tt> within the current string 
	 * and returns the position of the first character of the matching substring, 
	 * or -1 if no match was found.</p>
	 * <p>This invocation does not do global matches; it ignores the "g" flag of 
	 * <tt>regexp</tt>. It also ignores the <tt>lastIndex</tt> property 
	 * (see {@link RegExpLikes#lastIndex(js.RegExpLike)} and {@link RegExpLikes#lastIndex(js.RegExpLike, Integer)}) of 
	 * <tt>regexp</tt> and always searches from the beginning of the string, which 
	 * means that it always returns the position of the first match in the string.</p>
	 * @param s The current string.
	 * @param regexp A RegExp object that specifies the pattern to be searched for in the current string.
	 * @return The position of the start of the first substring of the current string 
	 * that matches <tt>regexp</tt>, or -1 if no match is found.
	 * @see #replace(String, RegExpLike, String)
	 * @see #replace(String, RegExpLike, StringLike)
	 * @see #replace(String, RegExpLike, JsFunction)
	 * @see #match(String, RegExpLike)
	 * @see Js#re(String)
	 * @see Js#re(String, String)
	 * @see RegExpLikes#exec(js.RegExpLike, Object)
	 * @see RegExpLikes#test(js.RegExpLike, Object)
	 * @see js.Value.String#search(js.RegExpLike)
	 * @since 1.0
	 */
	public static final int search(String s, RegExpLike regexp) {
		return new Value.String(s).search(regexp).intValue();
	}
	/**
	 * <p>Returns a string containing a slice, or substring, of the current string without 
	 * modify it.</p>
	 * @param s The current string.
	 * @param begin The string index where the slice is to begin. If negative, this argument 
	 * specifies a position measured from the end of the string. That is, -1 indicates the 
	 * last character, -2 indicates the second from last character, and so on.
	 * @return A new string that contains all the characters of string from and including 
	 * <tt>begin</tt>.
	 * @see #slice(js.StringLike, Object, Object)
	 * @see #substr(js.StringLike, Object)
	 * @see #substr(js.StringLike, Object, Object)
	 * @see #substring(js.StringLike, Object)
	 * @see #substring(js.StringLike, Object, Object)
	 * @see ArrayLikes#slice(js.ArrayLike, Object)
	 * @see ArrayLikes#slice(js.ArrayLike, Object, Object)
	 * @see js.StringLike#slice(Object)
	 * @since 1.0
	 */
	public static final String slice(StringLike s, Object begin) {
		return s.slice(begin);
	}
	/**
	 * <p>Returns a string containing a slice, or substring, of the current string without 
	 * modify it.</p>
	 * @param s The current string.
	 * @param begin The string index where the slice is to begin. If negative, this argument 
	 * specifies a position measured from the end of the string. That is, -1 indicates the 
	 * last character, -2 indicates the second from last character, and so on.
	 * @return A new string that contains all the characters of string from and including 
	 * <tt>begin</tt>.
	 * @see #slice(String, Object, Object)
	 * @see #substr(String, Object)
	 * @see #substr(String, Object, Object)
	 * @see #substring(String, Object)
	 * @see #substring(String, Object, Object)
	 * @see ArrayLikes#slice(js.ArrayLike, Object)
	 * @see ArrayLikes#slice(js.ArrayLike, Object, Object)
	 * @see js.Value.String#slice(Object)
	 * @since 1.0
	 */
	public static final String slice(String s, Object begin) {
		return new Value.String(s).slice(begin);
	}
	/**
	 * <p>Returns a string containing a slice, or substring, of the current string without 
	 * modify it.</p>
	 * @param s The current string.
	 * @param begin The string index where the slice is to begin. If negative, this argument 
	 * specifies a position measured from the end of the string. That is, -1 indicates the 
	 * last character, -2 indicates the second from last character, and so on.
	 * @param end The string index immediately after the end of the slice. If undefined, 
	 * the slice includes all characters from <tt>begin</tt> to the end of the string. 
	 * If this argument is negative, it specifies a position measured from the end of the 
	 * string.
	 * @return A new string that contains all the characters of string from and including 
	 * <tt>begin</tt>, and up to but not including <tt>end</tt>.
	 * @see #slice(js.StringLike, Object, Object)
	 * @see #substr(js.StringLike, Object)
	 * @see #substr(js.StringLike, Object, Object)
	 * @see #substring(js.StringLike, Object)
	 * @see #substring(js.StringLike, Object, Object)
	 * @see ArrayLikes#slice(js.ArrayLike, Object)
	 * @see ArrayLikes#slice(js.ArrayLike, Object, Object)
	 * @see js.StringLike#slice(Object, Object)
	 * @since 1.0
	 */
	public static final String slice(StringLike s, Object begin, Object end) {
		return s.slice(begin, end);
	}
	/**
	 * <p>Returns a string containing a slice, or substring, of the current string without 
	 * modify it.</p>
	 * @param s The current string.
	 * @param begin The string index where the slice is to begin. If negative, this argument 
	 * specifies a position measured from the end of the string. That is, -1 indicates the 
	 * last character, -2 indicates the second from last character, and so on.
	 * @param end The string index immediately after the end of the slice. If undefined, 
	 * the slice includes all characters from <tt>begin</tt> to the end of the string. 
	 * If this argument is negative, it specifies a position measured from the end of the 
	 * string.
	 * @return A new string that contains all the characters of string from and including 
	 * <tt>begin</tt>, and up to but not including <tt>end</tt>.
	 * @see #slice(String, Object, Object)
	 * @see #substr(String, Object)
	 * @see #substr(String, Object, Object)
	 * @see #substring(String, Object)
	 * @see #substring(String, Object, Object)
	 * @see ArrayLikes#slice(js.ArrayLike, Object)
	 * @see ArrayLikes#slice(js.ArrayLike, Object, Object)
	 * @see js.Value.String#slice(Object, Object)
	 * @since 1.0
	 */
	public static final String slice(String s, Object begin, Object end) {
		return new Value.String(s).slice(begin, end);
	}
	/**
	 * <p>Creates and returns an array of substrings of the current string. These 
	 * substrings are created by searching the string from start to end for text that 
	 * matches <tt>separator</tt> and breaking the string before and after that 
	 * matching text. The <tt>separator</tt> text is not included in any of the 
	 * returned substrings, except as noted at the end of this section. Note that if the 
	 * <tt>separator</tt> matches the beginning of the string, the first element of 
	 * the returned array will be an empty string, the text that appears before the 
	 * <tt>separator</tt>. Similarly, if the <tt>separator</tt> matches the end of 
	 * the string, the last element of the array will be the empty string.</p>
	 * <p>If <tt>separator</tt> is undefined, the current string is not split at all, 
	 * and the returned array contains only a single, unbroken string element. If 
	 * <tt>separator</tt> is the empty string or a regular expression that matches 
	 * the empty string, the string is broken between each character, and the returned 
	 * array has the same length as the string does. Note that this is a special case 
	 * because the empty strings before the first character and after the last character 
	 * are not matched.</p>
	 * <p>As noted earlier, the substrings in the array returned by this invocation do not 
	 * contain the delimiting text <tt>separator</tt> used to split the string. However, 
	 * if <tt>separator</tt> is a regular expression that contains parenthesized 
	 * subexpressions, the substrings that match those parenthesized subexpressions 
	 * (but not the text that matches the regular expression as a whole) are included in 
	 * the returned array.</p>
	 * <p>Note that this method is the inverse of the {@link ArrayLikes#join(js.ArrayLike)} or 
	 * {@link ArrayLikes#join(js.ArrayLike, Object)} method.</p>
	 * @param s The current string.
	 * @param separator The string or regular expression at which the current string splits.
	 * @return An array of strings, created by splitting string into substrings at the 
	 * boundaries specified by <tt>separator</tt>. The substrings in the returned 
	 * array do not include <tt>separator</tt> itself, except in the case noted in the 
	 * above description.
	 * @see #split(js.StringLike, Object, Object)
	 * @see ArrayLikes#join(js.ArrayLike)
	 * @see ArrayLikes#join(js.ArrayLike, Object)
	 * @see js.StringLike#split(Object)
	 * @since 1.0
	 */
	public static final ArrayLike<?> split(StringLike s, Object separator) {
		return s.split(separator);
	}
	/**
	 * <p>Creates and returns an array of substrings of the current string. These 
	 * substrings are created by searching the string from start to end for text that 
	 * matches <tt>separator</tt> and breaking the string before and after that 
	 * matching text. The <tt>separator</tt> text is not included in any of the 
	 * returned substrings, except as noted at the end of this section. Note that if the 
	 * <tt>separator</tt> matches the beginning of the string, the first element of 
	 * the returned array will be an empty string, the text that appears before the 
	 * <tt>separator</tt>. Similarly, if the <tt>separator</tt> matches the end of 
	 * the string, the last element of the array will be the empty string.</p>
	 * <p>If <tt>separator</tt> is undefined, the current string is not split at all, 
	 * and the returned array contains only a single, unbroken string element. If 
	 * <tt>separator</tt> is the empty string or a regular expression that matches 
	 * the empty string, the string is broken between each character, and the returned 
	 * array has the same length as the string does. Note that this is a special case 
	 * because the empty strings before the first character and after the last character 
	 * are not matched.</p>
	 * <p>As noted earlier, the substrings in the array returned by this invocation do not 
	 * contain the delimiting text <tt>separator</tt> used to split the string. However, 
	 * if <tt>separator</tt> is a regular expression that contains parenthesized 
	 * subexpressions, the substrings that match those parenthesized subexpressions 
	 * (but not the text that matches the regular expression as a whole) are included in 
	 * the returned array.</p>
	 * <p>Note that this method is the inverse of the {@link ArrayLikes#join(js.ArrayLike)} or 
	 * {@link ArrayLikes#join(js.ArrayLike, Object)} method.</p>
	 * @param s The current string.
	 * @param separator The string or regular expression at which the current string splits.
	 * @return An array of strings, created by splitting string into substrings at the 
	 * boundaries specified by <tt>separator</tt>. The substrings in the returned 
	 * array do not include <tt>separator</tt> itself, except in the case noted in the 
	 * above description.
	 * @see #split(String, Object, Object)
	 * @see ArrayLikes#join(js.ArrayLike)
	 * @see ArrayLikes#join(js.ArrayLike, Object)
	 * @see js.Value.String#split(Object)
	 * @since 1.0
	 */
	public static final ArrayLike<?> split(String s, Object separator) {
		return new Value.String(s).split(separator);
	}
	/**
	 * <p>Creates and returns an array of as many as <tt>limit</tt> substrings of the 
	 * current string. These substrings are created by searching the string from start to 
	 * end for text that matches <tt>separator</tt> and breaking the string before and 
	 * after that matching text. The <tt>separator</tt> text is not included in any of 
	 * the returned substrings, except as noted at the end of this section. Note that if 
	 * the <tt>separator</tt> matches the beginning of the string, the first element 
	 * of the returned array will be an empty string, the text that appears before the 
	 * <tt>separator</tt>. Similarly, if the <tt>separator</tt> matches the end of 
	 * the string, the last element of the array (assuming no conflicting <tt>limit</tt>) 
	 * will be the empty string.</p>
	 * <p>If <tt>separator</tt> is undefined, the current string is not split at all, 
	 * and the returned array contains only a single, unbroken string element. If 
	 * <tt>separator</tt> is the empty string or a regular expression that matches 
	 * the empty string, the string is broken between each character, and the returned 
	 * array has the same length as the string does, assuming no smaller <tt>limit</tt> 
	 * is specified. Note that this is a special case because the empty strings before 
	 * the first character and after the last character are not matched.</p>
	 * <p>As noted earlier, the substrings in the array returned by this invocation do not 
	 * contain the delimiting text <tt>separator</tt> used to split the string. However, 
	 * if <tt>separator</tt> is a regular expression that contains parenthesized 
	 * subexpressions, the substrings that match those parenthesized subexpressions 
	 * (but not the text that matches the regular expression as a whole) are included in 
	 * the returned array.</p>
	 * <p>Note that this method is the inverse of the {@link ArrayLike#join()} or 
	 * {@link ArrayLike#join(Object)} method.</p>
	 * @param s The current string.
	 * @param separator The string or regular expression at which the current string splits.
	 * @param limit This optional integer specifies the maximum length of the returned 
	 * array. If defined, no more than this number of substrings will be returned. 
	 * If undefined, the entire string will be split, regardless of its length.
	 * @return An array of strings, created by splitting string into substrings at the 
	 * boundaries specified by <tt>separator</tt>. The substrings in the returned 
	 * array do not include <tt>separator</tt> itself, except in the case noted in the 
	 * above description.
	 * @see #split(js.StringLike, Object)
	 * @see ArrayLikes#join(js.ArrayLike)
	 * @see ArrayLikes#join(js.ArrayLike, Object)
	 * @see js.StringLike#split(Object, Object)
	 * @since 1.0
	 */
	public static final ArrayLike<?> split(StringLike s, Object separator, Object limit) {
		return s.split(separator, limit);
	}
	/**
	 * <p>Creates and returns an array of as many as <tt>limit</tt> substrings of the 
	 * current string. These substrings are created by searching the string from start to 
	 * end for text that matches <tt>separator</tt> and breaking the string before and 
	 * after that matching text. The <tt>separator</tt> text is not included in any of 
	 * the returned substrings, except as noted at the end of this section. Note that if 
	 * the <tt>separator</tt> matches the beginning of the string, the first element 
	 * of the returned array will be an empty string, the text that appears before the 
	 * <tt>separator</tt>. Similarly, if the <tt>separator</tt> matches the end of 
	 * the string, the last element of the array (assuming no conflicting <tt>limit</tt>) 
	 * will be the empty string.</p>
	 * <p>If <tt>separator</tt> is undefined, the current string is not split at all, 
	 * and the returned array contains only a single, unbroken string element. If 
	 * <tt>separator</tt> is the empty string or a regular expression that matches 
	 * the empty string, the string is broken between each character, and the returned 
	 * array has the same length as the string does, assuming no smaller <tt>limit</tt> 
	 * is specified. Note that this is a special case because the empty strings before 
	 * the first character and after the last character are not matched.</p>
	 * <p>As noted earlier, the substrings in the array returned by this invocation do not 
	 * contain the delimiting text <tt>separator</tt> used to split the string. However, 
	 * if <tt>separator</tt> is a regular expression that contains parenthesized 
	 * subexpressions, the substrings that match those parenthesized subexpressions 
	 * (but not the text that matches the regular expression as a whole) are included in 
	 * the returned array.</p>
	 * <p>Note that this method is the inverse of the {@link ArrayLike#join()} or 
	 * {@link ArrayLike#join(Object)} method.</p>
	 * @param s The current string.
	 * @param separator The string or regular expression at which the current string splits.
	 * @param limit This optional integer specifies the maximum length of the returned 
	 * array. If defined, no more than this number of substrings will be returned. 
	 * If undefined, the entire string will be split, regardless of its length.
	 * @return An array of strings, created by splitting string into substrings at the 
	 * boundaries specified by <tt>separator</tt>. The substrings in the returned 
	 * array do not include <tt>separator</tt> itself, except in the case noted in the 
	 * above description.
	 * @see #split(String, Object)
	 * @see ArrayLikes#join(js.ArrayLike)
	 * @see ArrayLikes#join(js.ArrayLike, Object)
	 * @see js.Value.String#split(Object, Object)
	 * @since 1.0
	 */
	public static final ArrayLike<?> split(String s, Object separator, Object limit) {
		return new Value.String(s).split(separator, limit);
	}
	/**
	 * <p>Extracts and returns a substring of the current string without modifying it.</p>
	 * <p>Note that this method has not been standardized by ECMAScript and is therefore 
	 * deprecated</p>
	 * @param s The current string.
	 * @param start The start position of the substring. If this argument is negative, it 
	 * specifies a position measured from the end of the string: -1 specifies the last character, 
	 * -2 specifies the second-to-last character, and so on.
	 * @return A copy of the portion of the current string starting at and including the character 
	 * specified by <tt>start</tt> to the end of the string.
	 * @see #substr(js.StringLike, Object)
	 * @see #slice(js.StringLike, Object)
	 * @see #slice(js.StringLike, Object, Object)
	 * @see #substring(js.StringLike, Object)
	 * @see #substring(js.StringLike, Object, Object)
	 * @see js.StringLike#substr(Object)
	 * @since 1.0
	 */
	public static final String substr(StringLike s, Object start) {
		return s.substr(start);
	}
	/**
	 * <p>Extracts and returns a substring of the current string without modifying it.</p>
	 * <p>Note that this method has not been standardized by ECMAScript and is therefore 
	 * deprecated</p>
	 * @param s The current string.
	 * @param start The start position of the substring. If this argument is negative, it 
	 * specifies a position measured from the end of the string: -1 specifies the last character, 
	 * -2 specifies the second-to-last character, and so on.
	 * @return A copy of the portion of the current string starting at and including the character 
	 * specified by <tt>start</tt> to the end of the string.
	 * @see #substr(String, Object)
	 * @see #slice(String, Object)
	 * @see #slice(String, Object, Object)
	 * @see #substring(String, Object)
	 * @see #substring(String, Object, Object)
	 * @see js.Value.String#substr(Object)
	 * @since 1.0
	 */
	public static final String substr(String s, Object start) {
		return new Value.String(s).substr(start);
	}
	/**
	 * <p>Extracts and returns a substring of the current string without modifying it.</p>
	 * <p>Note this method specifies the desired substring with a character position and a 
	 * <tt>length</tt>. This provides a useful alternative to 
	 * {@link StringLikes#substring(js.StringLike, Object, Object)}, which specify a substring with two 
	 * character positions. Note, however, that this method has not been standardized by 
	 * ECMAScript and is therefore deprecated</p>
	 * @param s The current string.
	 * @param start The start position of the substring. If this argument is negative, it 
	 * specifies a position measured from the end of the string: -1 specifies the last character, 
	 * -2 specifies the second-to-last character, and so on.
	 * @param length The number of characters in the substring. If this argument is undefined, 
	 * the returned substring includes all characters from the starting position to the end of 
	 * the string.
	 * @return A copy of the portion of the current string starting at and including the character 
	 * specified by <tt>start</tt> and continuing for <tt>length</tt> characters, 
	 * or to the end of the string if <tt>length</tt> is undefined.
	 * @see #substr(js.StringLike, Object)
	 * @see #slice(js.StringLike, Object)
	 * @see #slice(js.StringLike, Object, Object)
	 * @see #substring(js.StringLike, Object)
	 * @see #substring(js.StringLike, Object, Object)
	 * @see js.StringLike#substr(Object, Object)
	 * @since 1.0
	 */
	public static final String substr(StringLike s, Object start, Object length) {
		return s.substr(start, length);
	}
	/**
	 * <p>Extracts and returns a substring of the current string without modifying it.</p>
	 * <p>Note this method specifies the desired substring with a character position and a 
	 * <tt>length</tt>. This provides a useful alternative to 
	 * {@link StringLikes#substring(String, Object, Object)}, which specify a substring with two 
	 * character positions. Note, however, that this method has not been standardized by 
	 * ECMAScript and is therefore deprecated</p>
	 * @param s The current string.
	 * @param start The start position of the substring. If this argument is negative, it 
	 * specifies a position measured from the end of the string: -1 specifies the last character, 
	 * -2 specifies the second-to-last character, and so on.
	 * @param length The number of characters in the substring. If this argument is undefined, 
	 * the returned substring includes all characters from the starting position to the end of 
	 * the string.
	 * @return A copy of the portion of the current string starting at and including the character 
	 * specified by <tt>start</tt> and continuing for <tt>length</tt> characters, 
	 * or to the end of the string if <tt>length</tt> is undefined.
	 * @see #substr(String, Object)
	 * @see #slice(String, Object)
	 * @see #slice(String, Object, Object)
	 * @see #substring(String, Object)
	 * @see #substring(String, Object, Object)
	 * @see js.Value.String#substr(Object, Object)
	 * @since 1.0
	 */
	public static final String substr(String s, Object start, Object length) {
		return new Value.String(s).substr(start, length);
	}
	/**
	 * <p>Returns a substring of the current string consisting of the characters from 
	 * position <tt>from</tt> to the end of the string. The character at position 
	 * <tt>from</tt> is included.</p>
	 * <p>It is important to remember that the character at position <tt>from</tt> is 
	 * included in the substring.</p>
	 * <p>Note that {@link StringLikes#slice(js.StringLike, Object)} and the nonstandard 
	 * {@link StringLikes#substr(js.StringLike, Object)} can also extract substrings from a string. 
	 * Unlike those methods, this method does not accept negative arguments.</p>
	 * @param s The current string.
	 * @param from A nonnegative integer that specifies the position within the current 
	 * string of the first character of the desired substring.
	 * @return  A substring of the current string containing characters copied from 
	 * position <tt>from</tt> to the end of the current string.
	 * @see #substring(js.StringLike, Object, Object)
	 * @see #charAt(js.StringLike, Object)
	 * @see #indexOf(js.StringLike, Object)
	 * @see #indexOf(js.StringLike, Object, Object)
	 * @see #lastIndexOf(js.StringLike, Object)
	 * @see #lastIndexOf(js.StringLike, Object, Object)
	 * @see #slice(js.StringLike, Object)
	 * @see #slice(js.StringLike, Object, Object)
	 * @see #substr(js.StringLike, Object)
	 * @see #substr(js.StringLike, Object, Object)
	 * @see js.StringLike#substring(Object)
	 * @since 1.0
	 */
	public static final String substring(StringLike s, Object from) {
		return s.substring(from);
	}
	/**
	 * <p>Returns a substring of the current string consisting of the characters from 
	 * position <tt>from</tt> to the end of the string. The character at position 
	 * <tt>from</tt> is included.</p>
	 * <p>It is important to remember that the character at position <tt>from</tt> is 
	 * included in the substring.</p>
	 * <p>Note that {@link StringLikes#slice(String, Object)} and the nonstandard 
	 * {@link StringLikes#substr(String, Object)} can also extract substrings from a string. 
	 * Unlike those methods, this method does not accept negative arguments.</p>
	 * @param s The current string.
	 * @param from A nonnegative integer that specifies the position within the current 
	 * string of the first character of the desired substring.
	 * @return  A substring of the current string containing characters copied from 
	 * position <tt>from</tt> to the end of the current string.
	 * @see #substring(String, Object, Object)
	 * @see #charAt(String, Object)
	 * @see #indexOf(String, Object)
	 * @see #indexOf(String, Object, Object)
	 * @see #lastIndexOf(String, Object)
	 * @see #lastIndexOf(String, Object, Object)
	 * @see #slice(String, Object)
	 * @see #slice(String, Object, Object)
	 * @see #substr(String, Object)
	 * @see #substr(String, Object, Object)
	 * @see js.Value.String#substring(Object)
	 * @since 1.0
	 */
	public static final String substring(String s, Object from) {
		return new Value.String(s).substring(from);
	}
	/**
	 * <p>Returns a substring of the current string consisting of the characters between 
	 * positions <tt>from</tt> and <tt>to</tt>. The character at position <tt>from</tt> 
	 * is included, but the character at position <tt>to</tt> is not included.</p>
	 * <p>If <tt>from</tt> equals <tt>to</tt>, this method returns an empty 
	 * (length 0) string. If <tt>from</tt> is greater than <tt>to</tt>, this method 
	 * first swaps the two arguments and then returns the substring between them.</p>
	 * <p>It is important to remember that the character at position <tt>from</tt> is 
	 * included in the substring but that the character at position <tt>to</tt> is 
	 * not included in the substring. While this may seem arbitrary or counter-intuitive, 
	 * a notable feature of this system is that the length of the returned substring is 
	 * always equal to <tt>to - from</tt>.</p>
	 * <p>Note that {@link StringLikes#slice(js.StringLike, Object, Object)} and the nonstandard 
	 * {@link StringLikes#substr(js.StringLike, Object, Object)} can also extract substrings from a string. 
	 * Unlike those methods, this method does not accept negative arguments.</p>
	 * @param s The current string.
	 * @param from A nonnegative integer that specifies the position within the current 
	 * string of the first character of the desired substring.
	 * @param to A nonnegative optional integer that is one greater than the position of 
	 * the last character of the desired substring. If this argument is undefined, the 
	 * returned substring runs to the end of the string.
	 * @return A new string, of length <tt>to - from</tt>, which contains a substring 
	 * of the current string. The new string contains characters copied from positions 
	 * <tt>from</tt> to <tt>to</tt> - 1 of the string.
	 * @see #substring(js.StringLike, Object)
	 * @see #charAt(js.StringLike, Object)
	 * @see #indexOf(js.StringLike, Object)
	 * @see #indexOf(js.StringLike, Object, Object)
	 * @see #lastIndexOf(js.StringLike, Object)
	 * @see #lastIndexOf(js.StringLike, Object, Object)
	 * @see #slice(js.StringLike, Object)
	 * @see #slice(js.StringLike, Object, Object)
	 * @see #substr(js.StringLike, Object)
	 * @see #substr(js.StringLike, Object, Object)
	 * @see js.StringLike#substring(Object, Object)
	 * @since 1.0
	 */
	public static final String substring(StringLike s, Object from, Object to) {
		return s.substring(from, to);
	}
	/**
	 * <p>Returns a substring of the current string consisting of the characters between 
	 * positions <tt>from</tt> and <tt>to</tt>. The character at position <tt>from</tt> 
	 * is included, but the character at position <tt>to</tt> is not included.</p>
	 * <p>If <tt>from</tt> equals <tt>to</tt>, this method returns an empty 
	 * (length 0) string. If <tt>from</tt> is greater than <tt>to</tt>, this method 
	 * first swaps the two arguments and then returns the substring between them.</p>
	 * <p>It is important to remember that the character at position <tt>from</tt> is 
	 * included in the substring but that the character at position <tt>to</tt> is 
	 * not included in the substring. While this may seem arbitrary or counter-intuitive, 
	 * a notable feature of this system is that the length of the returned substring is 
	 * always equal to <tt>to - from</tt>.</p>
	 * <p>Note that {@link StringLikes#slice(String, Object, Object)} and the nonstandard 
	 * {@link StringLikes#substr(String, Object, Object)} can also extract substrings from a string. 
	 * Unlike those methods, this method does not accept negative arguments.</p>
	 * @param s The current string.
	 * @param from A nonnegative integer that specifies the position within the current 
	 * string of the first character of the desired substring.
	 * @param to A nonnegative optional integer that is one greater than the position of 
	 * the last character of the desired substring. If this argument is undefined, the 
	 * returned substring runs to the end of the string.
	 * @return A new string, of length <tt>to - from</tt>, which contains a substring 
	 * of the current string. The new string contains characters copied from positions 
	 * <tt>from</tt> to <tt>to</tt> - 1 of the string.
	 * @see #substring(String, Object)
	 * @see #charAt(String, Object)
	 * @see #indexOf(String, Object)
	 * @see #indexOf(String, Object, Object)
	 * @see #lastIndexOf(String, Object)
	 * @see #lastIndexOf(String, Object, Object)
	 * @see #slice(String, Object)
	 * @see #slice(String, Object, Object)
	 * @see #substr(String, Object)
	 * @see #substr(String, Object, Object)
	 * @see js.Value.String#substring(Object, Object)
	 * @since 1.0
	 */
	public static final String substring(String s, Object from, Object to) {
		return new Value.String(s).substring(from, to);
	}
	/**
	 * <p>Returns a copy of string, with each upper-case letter converted to its lower-case 
	 * equivalent, if it has one.</p>
	 * @param s The current string.
	 * @return A copy of string, with each upper-case letter converted to its lower-case 
	 * equivalent, if it has one.
	 * @see #toLocaleLowerCase(js.StringLike)
	 * @see #toLocaleUpperCase(js.StringLike)
	 * @see #toUpperCase(js.StringLike)
	 * @see js.StringLike#toLowerCase()
	 * @since 1.0
	 */
	public static final String toLowerCase(StringLike s) {
		return s.toLowerCase();
	}
	/**
	 * <p>Returns a copy of string, with each upper-case letter converted to its lower-case 
	 * equivalent, if it has one.</p>
	 * @param s The current string.
	 * @return A copy of string, with each upper-case letter converted to its lower-case 
	 * equivalent, if it has one.
	 * @see #toLocaleLowerCase(String)
	 * @see #toLocaleUpperCase(String)
	 * @see #toUpperCase(String)
	 * @see js.Value.String#toLowerCase()
	 * @since 1.0
	 */
	public static final String toLowerCase(String s) {
		return new Value.String(s).toLowerCase();
	}
	/**
	 * <p>Returns a copy of string, with each lower-case letter converted to its upper-case 
	 * equivalent, if it has one.</p>
	 * @param s The current string.
	 * @return A copy of string, with each lower-case letter converted to its upper-case 
	 * equivalent, if it has one.
	 * @see #toLocaleLowerCase(js.StringLike)
	 * @see #toLocaleUpperCase(js.StringLike)
	 * @see #toLowerCase(js.StringLike)
	 * @see js.StringLike#toUpperCase()
	 * @since 1.0
	 */
	public static final String toUpperCase(StringLike s) {
		return s.toUpperCase();
	}
	/**
	 * <p>Returns a copy of string, with each lower-case letter converted to its upper-case 
	 * equivalent, if it has one.</p>
	 * @param s The current string.
	 * @return A copy of string, with each lower-case letter converted to its upper-case 
	 * equivalent, if it has one.
	 * @see #toLocaleLowerCase(String)
	 * @see #toLocaleUpperCase(String)
	 * @see #toLowerCase(String)
	 * @see js.Value.String#toUpperCase()
	 * @since 1.0
	 */
	public static final String toUpperCase(String s) {
		return new Value.String(s).toUpperCase();
	}
	/**
	 * <p>Returns a copy of the current string, converted to lower-case letters in a 
	 * locale-specific way. Only a few languages, such as Turkish, have locale-specific 
	 * case mappings, so this method usually returns the same value as 
	 * {@link #toLowerCase(js.StringLike)}.</p>
	 * @param s The current string.
	 * @return A copy of the current string, converted to lower-case letters in a 
	 * locale-specific way.
	 * @see #toLocaleUpperCase(js.StringLike)
	 * @see #toLowerCase(js.StringLike)
	 * @see #toUpperCase(js.StringLike)
	 * @see js.StringLike#toLocaleLowerCase()
	 * @since 1.0
	 */
	public static final String toLocaleLowerCase(StringLike s) {
		return s.toLocaleLowerCase();
	}
	/**
	 * <p>Returns a copy of the current string, converted to lower-case letters in a 
	 * locale-specific way. Only a few languages, such as Turkish, have locale-specific 
	 * case mappings, so this method usually returns the same value as 
	 * {@link #toLowerCase(String)}.</p>
	 * @param s The current string.
	 * @return A copy of the current string, converted to lower-case letters in a 
	 * locale-specific way.
	 * @see #toLocaleUpperCase(String)
	 * @see #toLowerCase(String)
	 * @see #toUpperCase(String)
	 * @see js.Value.String#toLocaleLowerCase()
	 * @since 1.0
	 */
	public static final String toLocaleLowerCase(String s) {
		return new Value.String(s).toLocaleLowerCase();
	}
	/**
	 * <p>Returns a copy of the current string, converted to upper-case letters in a 
	 * locale-specific way. Only a few languages, such as Turkish, have locale-specific 
	 * case mappings, so this method usually returns the same value as 
	 * {@link #toUpperCase(js.StringLike)}.</p>
	 * @param s The current string.
	 * @return A copy of the current string, converted to upper-case letters in a 
	 * locale-specific way.
	 * @see #toLocaleLowerCase(js.StringLike)
	 * @see #toLowerCase(js.StringLike)
	 * @see #toUpperCase(js.StringLike)
	 * @see js.StringLike#toLocaleUpperCase()
	 * @since 1.0
	 */
	public static final String toLocaleUpperCase(StringLike s) {
		return s.toLocaleUpperCase();
	}
	/**
	 * <p>Returns a copy of the current string, converted to upper-case letters in a 
	 * locale-specific way. Only a few languages, such as Turkish, have locale-specific 
	 * case mappings, so this method usually returns the same value as 
	 * {@link #toUpperCase(String)}.</p>
	 * @param s The current string.
	 * @return A copy of the current string, converted to upper-case letters in a 
	 * locale-specific way.
	 * @see #toLocaleLowerCase(String)
	 * @see #toLowerCase(String)
	 * @see #toUpperCase(String)
	 * @see js.Value.String#toLocaleUpperCase()
	 * @since 1.0
	 */
	public static final String toLocaleUpperCase(String s) {
		return new Value.String(s).toLocaleUpperCase();
	}
	private static interface TRIMRE {
		static final RegExpLike $ = Js.re("^\\s+|\\s+$", "g");
	}
	/**
	 * <p>Trims whitespace from either end of the current string, leaving spaces within 
	 * it intact.</p>
	 * @param s The current string.
	 * @return The trimmed string.
	 * @since 1.0
	 */
	public static final String trim(Object s) {
		return replace(Js.toString(s), TRIMRE.$, "");
	}
}
