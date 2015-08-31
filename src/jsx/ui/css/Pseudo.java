
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

package jsx.ui.css;

import js.ArrayLike;
import js.Id;
import js.Js;
import js.Vars;
import js.core.JsFunction;
import jsx.Code;
import jsx.event.Handle;
import jsx.ui.Component;
import jsx.ui.Widget;

/**
 * <p>A class of wrapper widgets that facilitates to efficiently manage CSS pseudo class 
 * selectors over the underlying HTML elements of the wrapped components.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class Pseudo extends Widget
{
	private final String pseudo;

	/**
	 * <p>Typically constructs a {@link Pseudo} widget.</p>
	 * <p>This constructor invokes the typical constructor of the super class with the given 
	 * component as argument.</p>
	 * @param c The underlying component for the {@link Pseudo} widget being constructed.
	 * @param pseudo The name of a CSS pseudo class selector for the {@link Pseudo} widget 
	 * to manage.
	 * @since 1.0
	 */
	public Pseudo(Component c, String pseudo) {
		super(c);
		this.pseudo = pseudo;
	}

	/**
	 * <p>Sets up events of the underly HTML element to activate or deactivate the pseudo selector.</p>
	 * @param c The underlying component to handle the browser events.
	 * @param activator A browser event to add the pseudo selector to the component.
	 * @param deactivator A browser event to remove the pseudo selector from the component.
	 * @return An array of the two {@link Handle}s being set up.
	 * @since 1.0
	 */
	public final ArrayLike<Handle> attach(Component c, String activator, String deactivator) {
		return new Vars<Handle>().add(
				c.handle(activator  , getAdder  ())
		).add(
				c.handle(deactivator, getRemover())
		).var();
	}

	/**
	 * <p>Sets up a browser event of the underly HTML element toggling to activate and deactivate 
	 * the pseudo selector.</p>
	 * @param c The underlying component to handle the browser events.
	 * @param bevt A browser event toggling to add and remove the pseudo selector of the component.
	 * @return The {@link Handle} being set up.
	 * @since 1.0
	 */
	public final Handle toggle(Component c, String bevt) {
		return c.handle(bevt, getToggler());
	}

	private final static Id<JsFunction<Boolean>> ADDER   = new Id<JsFunction<Boolean>>();
	private final static Id<JsFunction<Boolean>> REMOVER = new Id<JsFunction<Boolean>>();
	private final static Id<JsFunction<Boolean>> TOGGLER = new Id<JsFunction<Boolean>>();

	/**
	 * <p>Gets a function that toggles to add and remove the pseudo selector against the 
	 * underlying component.</p>
	 * @return The toggling function.
	 * @since 1.0
	 */
	public final JsFunction<Boolean> getToggler() {
		JsFunction<Boolean> f = ini(this).var(TOGGLER);
		if (Js.not(f)) {
			f = new JsFunction<Boolean>(
					Handle.HANDLER.var().invoke(
							new Vars<Object>().add(Component.getHTMLElement(unwrap())).add(
									Code.handler(
											Code.cond(
													Code.test(
															Code.regi(Code.hyphen(ui(Code.NONWS), pseudo)),
															Code.THIS_CLASSNAME
													),
													Code.replaceThisClassName(
															Code.hyphen(ui(Code.NONWS), pseudo),
															Code.EMPTY
													),
													Code.replaceThisClassName(
															ui(Code.NONWS),
															lambda(pseudo)
													)
											)
									)
							)
					)
			);
			ini(this).var(TOGGLER, f);
		}
		return f;
	}

	/**
	 * <p>Gets a function that adds the pseudo selector to the underlying component.</p>
	 * @return The pseudo selector adding function.
	 * @since 1.0
	 */
	public final JsFunction<Boolean> getAdder() {
		JsFunction<Boolean> f = ini(this).var(ADDER);
		if (Js.not(f)) {
			f = new JsFunction<Boolean>(
					Handle.HANDLER.var().invoke(
							new Vars<Object>().add(Component.getHTMLElement(unwrap())).add(
									Code.handler(
											Code.replaceThisClassName(
													ui(Code.NONWS),
													lambda(pseudo)
											)
									)
							)
					)
			);
			ini(this).var(ADDER, f);
		}
		return f;
	}

	private final static JsFunction<String> lambda(String s) {
		return Js.function(
				"w",
				Code.ret(
						Code.cond(
								Code.test(Code.re(Code.ASCII),"w"),
								Code.qlist("w", ps("w", Code.qt(s))),
								"w"
						)
				)
		);
	}

	/**
	 * <p>Gets a function that removes the pseudo selector from the underlying component.</p>
	 * @return The pseudo selector removing function.
	 * @since 1.0
	 */
	public final JsFunction<Boolean> getRemover() {
		JsFunction<Boolean> f = ini(this).var(REMOVER);
		if (Js.not(f)) {
			f = new JsFunction<Boolean>(
					Handle.HANDLER.var().invoke(
							new Vars<Object>().add(Component.getHTMLElement(unwrap())).add(
									Code.handler(
											Code.replaceThisClassName(
													Code.hyphen(ui(Code.NONWS), pseudo),
													Code.EMPTY
											)
									)
							)
					)
			);
			ini(this).var(REMOVER, f);
		}
		return f;
	}

	private final static String JSX_UI = Code.underline("jsx", "ui");

	private static final String ui(String s) {
		return Code.underline(JSX_UI, s);
	}

	private static final String ps(String css, String ps) {
		return Code.add(Code.add(css, "'-'"), ps);
	}
}
