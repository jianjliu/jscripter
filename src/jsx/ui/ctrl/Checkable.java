
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

package jsx.ui.ctrl;

import js.ArrayLike;
import js.Id;
import js.Js;
import js.Vars;
import jsx.core.ArrayLikes;
import jsx.core.ObjectLikes;
import jsx.dom.Markups;
import jsx.ui.Component;
import jsx.ui.event.Change;
import jsx.ui.event.Check;
import jsx.ui.event.Click;
import jsx.ui.event.OnChange;
import jsx.ui.event.Uncheck;
import jsx.ui.event.OnCheck;
import jsx.ui.event.OnClick;
import jsx.ui.event.OnUncheck;

/**
 * <p>A base class for checkable widgets resembling HTML radio buttons.</p>
 * <p>A checkable widget is a {@link jsx.Source} that fires high level events of {@link Check}, 
 * {@link Uncheck} and {@link Change}. It is also a high level event listener that listens to 
 * events of {@link Click}, {@link Check}, {@link Uncheck} and {@link Change}.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class Checkable extends Clickable implements OnClick, OnCheck, OnUncheck, OnChange
{
	/**
	 * <p>Constructs a checkable widget.</p>
	 * <p>This constructor invokes the typical constructor {@link #Checkable(Component)}.</p>
	 * @param label The label of HTML text for the checkable widget being constructed.
	 * @since 1.0
	 */
	public Checkable(String label) {
		this(new Component(Markups.span(label)));
	}

	/**
	 * <p>Typically constructs a checkable widget.</p>
	 * <p>This constructor makes the widget listen to events of {@link Click}, {@link Check}, 
	 * {@link Uncheck} and {@link Change}.</p>
	 * @param e The underlying component for the widget.
	 * @since 1.0
	 */
	protected Checkable(Component e) {
		super(e);
		sub(Clickable.get(e), this, CHECKABLE);
		addListener(Click.class, this);
		addListener(Check.class, this);
		addListener(Uncheck.class, this);
		addListener(Change.class, this);
	}

	private final static Id<Checkable> CHECKABLE = new Id<Checkable>();

	/**
	 * <p>Gets the {@link Checkable} widget associated with a component.</p>
	 * <p>If the specified component does not have an associated {@link Checkable} widget,
	 * this method will creates one based on that component and associate them.</p>
	 * @param e A component that may have a {@link Checkable} widget based on it.
	 * @return The {@link Checkable} widget associated with <tt>e</tt>.
	 * @since 1.0
	 */
	public static Checkable get(Component e) {
		Checkable c = ini(Clickable.get(e)).var(CHECKABLE);
		return Js.be(c) ? c : new Checkable(e);
	}

	private final static Id<Boolean> CHECKED = new Id<Boolean>();

	/**
	 * <p>Returns the checked state of the checkable widget.</p>
	 * @return <tt>true</tt> if the widget is checked; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	public final boolean checked() {
		return Js.be(ini(unwrap()).var(CHECKED));
	}

	private static final void link(Checkable c1, Checkable c2) {
		Component.addClasses(c2.unwrap(), c2.subs("grouped"));
		c1.addListener(Change.class, c2);
		c2.addListener(Change.class, c1);
	}

	private final ArrayLike<Checkable> links() {
		ArrayLike<Checkable> ret = new Vars<Checkable>().var();
		ArrayLike<OnChange> ons = getListeners(this, Change.class);
		for (int i = 0, len = ArrayLikes.length(ons); i < len; i++) {
			OnChange on = ons.get(i);
			if (on instanceof Checkable && on != this) {
				ArrayLikes.push(ret, (Checkable)on);
			}
		}
		return ret;
	}

	/**
	 * <p>Groups with another given checkable widget.</p>
	 * <p>This method expands sub CSS selector "grouped" to the components.</p>
	 * <p>A checkable group allows only one checkable widget to be in checked state at the
	 * same time. Checking a widget in a group will uncheck all the others in the group.</p>
	 * @since 1.0
	 */
	public final void group(Checkable c) {
		Component.addClasses(unwrap(), subs("grouped"));
		link(this, c);
		ArrayLike<Checkable> links = links();
		for (int i = 0, len = ArrayLikes.length(links); i < len; i++) {
			Checkable link = links.get(i);
			link(this, link);
		}
	}

	/**
	 * <p>Removes the checkable widget from its group.</p>
	 * <p>This method removes sub CSS selector "grouped" from the underlying component.</p>
	 * <p>A checkable group allows only one checkable widget to be in checked state at the
	 * same time. Checking a widget in a group will uncheck all the others in the group.</p>
	 * @since 1.0
	 */
	public final void ungroup() {
		Component.removeClasses(unwrap(), subs("grouped"));
		ArrayLike<Checkable> links = links();
		for (int i = 0, len = ArrayLikes.length(links); i < len; i++) {
			Checkable c = links.get(i);
			removeListener(Change.class, c);
			c.removeListener(Change.class, this);
			if (Js.not(ArrayLikes.length(c.links()))) {
				Component.removeClasses(c.unwrap(), c.subs("grouped"));
			}
		}
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method fires {@link Uncheck} event from itself if the dispatched event is from 
	 * a different widget and they both are checked.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(Change evt) {
		Checkable c = (Checkable)Event.source(evt);
		if (c.checked() && c != this && checked()) {
			fire(new Uncheck(unwrap()));
		}
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method fires {@link Check} event from itself if it is not checked.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(Click evt) {
		if (!checked()) {
			exec(new Check(unwrap()));
		}
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method fires {@link Change} event from itself and expands CSS sub selector "checked" 
	 * to its component if it is not checked.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(Check evt) {
		if (!checked()) {
			Component e = unwrap();
			ini(e).var(CHECKED, true);
			Component.addClasses(e, subs("checked"));
			fire(new Change(e));
		}
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method fires {@link Change} event from itself and removes CSS sub selector "checked" 
	 * from its component if it is checked.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(Uncheck evt) {
		if (checked()) {
			Component e = unwrap();
			ObjectLikes.delete(ini(e), CHECKED);
			Component.removeClasses(e, subs("checked"));
			fire(new Change(e));
		}
	}
}
