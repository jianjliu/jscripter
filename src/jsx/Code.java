
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

package jsx;

import js.Disposable;
import js.Js;
import js.Vars;
import js.core.JsFunction;
import jsx.core.ArrayLikes;

/**
 * <p>A utility class, with its static methods, providing facilities to create JavaScript
 * code at runtime.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Code extends Disposable
{
	private Code() {}

	/**
	 * <p>Statically creates code that joins three strings into one.</p>
	 * @param s1 The 1st string to join.
	 * @param s2 The 2nd string to join.
	 * @param s3 The 3rd string to join.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public final static String join(Object s1, Object s2, Object s3) {
		return ArrayLikes.join(
				new Vars<Object>().add(s1).add(s2).add(s3).var(),
				""
		);
	}

	/**
	 * <p>Statically creates code that quotes a string.</p>
	 * @param s The string to quote.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String qt(String s) {
		return join("'", s, "'");
	}

	/**
	 * <p>Statically creates code that joins two strings with a symbol of slash.</p> 
	 * @param p The parent name.
	 * @param c The child name.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String sub(String p, String c) {
		return join(p, "/", c);
	}

	/**
	 * <p>Statically creates code that joins two strings with a symbol of dash.</p> 
	 * @param s The string preceding the hyphen.
	 * @param t The string succeeding the hyphen.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String hyphen(String s, String t) {
		return join(s, "-", t);
	}

	/**
	 * <p>Statically creates code that joins two strings with a symbol of underline.</p>
	 * @param s The string preceding the underline.
	 * @param t The string succeeding the underline.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String underline(String s, String t) {
		return join(s, "_", t);
	}

	/**
	 * <p>Statically creates code that joins two strings with a symbol of period.</p> 
	 * @param q The qualifier.
	 * @param r The reference.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String ref(String q, String r) {
		return join(q, ".", r);
	}

	/**
	 * <p>Statically creates code that joins two expressions with a symbol of comma.</p> 
	 * @param a The 1st expression.
	 * @param b The 2nd expression.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String comma(String a, String b) {
		return join(a, ",", b);
	}

	/**
	 * <p>Statically creates code that lists two strings with a blank separator.</p> 
	 * @param a The 1st expression.
	 * @param b The 2nd expression.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String list(String a, String b) {
		return join(a, " ", b);
	}

	/**
	 * <p>Statically creates code that creates an assignment expression with the two
	 * existing expressions.</p> 
	 * @param a The 1st expression.
	 * @param b The 2nd expression.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String asg(String a, String b) {
		return join(a, "=", b);
	}

	/**
	 * <p>Statically creates code that creates an assignment-adding expression with the two
	 * existing expressions.</p> 
	 * @param a The 1st expression.
	 * @param b The 2nd expression.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String aasg(String a, String b) {
		return join(a, AASG, b);
	}

	/**
	 * <p>Statically creates code that creates an add expression with the two
	 * existing expressions.</p> 
	 * @param a The 1st expression.
	 * @param b The 2nd expression.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String add(String a, String b) {
		return join(a, "+", b);
	}

	/**
	 * <p>Statically creates code that creates code that dynamically lists the two
	 * expressions with a blank separator.</p> 
	 * @param a The 1st expression.
	 * @param b The 2nd expression.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String qlist(String a, String b) {
		return add(add(a, "' '"), b);
	}

	/**
	 * <p>Statically creates code that creates a conditional expression.</p> 
	 * @param c The conditional expression.
	 * @param a The 1st expression.
	 * @param b The 2nd expression.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String cond(String c, String a, String b) {
		return join(c, "?", join(a, ":", b));
	}

	/**
	 * <p>Statically creates code that invokes a method with no arguments.</p> 
	 * @param met The method name.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String invoke(String met) {
		return join(met, "(", ")");
	}

	/**
	 * <p>Statically creates code that invokes a method with arguments.</p> 
	 * @param met The method name.
	 * @param arg The argument(s).
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String invoke(String met, String arg) {
		return Js.add(met, join("(", arg, ")"));
	}

	/**
	 * <p>Statically creates code that calls a method at an object with no arguments.</p> 
	 * @param met The method name.
	 * @param obj The base object.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String call(String met, String obj) {
		return invoke(ref(met, "call"), obj);
	}

	/**
	 * <p>Statically creates code that calls a method at the base object with arguments.</p> 
	 * @param met The method name.
	 * @param obj The base object.
	 * @param arg The argument(s).
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String call(String met, String obj, String arg) {
		return invoke(ref(met, "call"), comma(obj, arg));
	}

	/**
	 * <p>Statically creates code that dynamically creates a block with statements.</p> 
	 * @param stmts The statement(s).
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String block(String stmts) {
		return join("{", stmts, "}");
	}

	/**
	 * <p>Statically creates code that dynamically defines a function with statements.</p> 
	 * @param stmts The statement(s).
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String function(String stmts) {
		return Js.add(invoke("function"), block(stmts));
	}

	/**
	 * <p>Statically creates code that dynamically creates a NOT expression.</p> 
	 * @param e The expression to apply a NOT-operation for.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String not(String e) {
		return Js.add("!", e);
	}

	/**
	 * <p>Statically creates code that dynamically creates an IF-NOT expression.</p> 
	 * @param e The expression to apply a NOT-operation for.
	 * @param s The statement for the if-statement.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String ifnot(String e, String s) {
		return Js.add(invoke("if", not(e)), s);
	}

	/**
	 * <p>Statically creates code that dynamically creates a statement from the statement.</p> 
	 * @param e The expression for the expressive statement.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String stmt(String e) {
		return Js.add(e, ";");
	}

	/**
	 * <p>Statically creates code that dynamically returns the expression.</p> 
	 * @param e The expression to return.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String ret(String e) {
		return stmt(list("return", e));
	}

	/**
	 * <p>Statically creates code that dynamically creates an event handler with a
	 * single statement to return an expression.</p> 
	 * @param e The expression to return.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final JsFunction<Boolean> handler(String e) {
		return Js.function(
				Js.add(
						stmt(e),
						ret("true")
				)
		);
	}

	/**
	 * <p>Statically creates code that dynamically creates a regular expression.</p> 
	 * @param r The regular expression.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String re(String r) {
		return join("/", r, "/");
	}

	/**
	 * <p>Statically creates code that dynamically creates a regular expression with
	 * an ignore-case option.</p>
	 * @param r The regular expression.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String regi(String r) {
		return join(re(r), "g", "i");
	}

	/**
	 * <p>Statically creates code that dynamically tests the regular express against 
	 * the other string.</p> 
	 * @param r The regular expression to test.
	 * @param s The string to test against.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String test(String r, String s) {
		return invoke(ref(r, "test"), s);
	}

	/**
	 * <p>The assignment-add operator.</p> 
	 * @since 1.0
	 */
	public final static String AASG = Js.add("+", "=");
	/**
	 * <p>The ascii character specifier for regular expressions.</p> 
	 * @since 1.0
	 */
	public final static String ASCII = join("\\", "w", "+");
	/**
	 * <p>The non-white character specifier for regular expressions.</p> 
	 * @since 1.0
	 */
	public final static String NONWS = join("\\", "S", "+");
	/**
	 * <p>The code for an empty string.</p> 
	 * @since 1.0
	 */
	public final static String EMPTY = "''";
	/**
	 * <p>The code for the <tt>this.className</tt> objects.</p> 
	 * @since 1.0
	 */
	public final static String THIS_CLASSNAME = ref("this", "className");
	/**
	 * <p>The code for the <tt>this.className.replace</tt> function.</p> 
	 * @since 1.0
	 */
	public final static String THIS_CLASSNAME_REPLACE = ref(
			THIS_CLASSNAME,
			"replace"
	);

	/**
	 * <p>Statically creates code that dynamically performs replacements on the JavaScript
	 * <tt>this.className objects</tt>.</p> 
	 * @param r The regular expression to perform the replacement.
	 * @param s The replacement string.
	 * @return The newly created JavaScript code.
	 * @since 1.0
	 */
	public static final String replaceThisClassName(String r, Object s) {
		return asg(
				THIS_CLASSNAME,
				invoke(
						THIS_CLASSNAME_REPLACE,
						join(
								regi(r),
								",",
								s
						)
				)
		);
	}
}
