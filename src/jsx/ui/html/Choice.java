
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

package jsx.ui.html;

import js.Id;
import js.Js;
import js.user.JsHTMLInputElement;
import jsx.core.ArrayLikes;
import jsx.ui.Component;
import jsx.ui.event.Change;
import jsx.ui.event.Check;
import jsx.ui.event.Click;
import jsx.ui.event.OnClick;
import jsx.ui.event.Uncheck;

/**
 * <p>An abstract base class for HTML elementary checkable input widgets.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public abstract class Choice extends Input implements OnClick
{
	/**
	 * <p>A global identifier for a configurable property of a {@link Choice} widget.</p>
	 * <p>The identified configurable property of a {@link Choice} widget is a reference 
	 * to a {@link Group} object that defines the group that a choice widget belongs to.</p>
	 * @since 1.0
	 */
	public final static Id<Group> GROUP = new Id<Group>();

	/**
	 * <p>Typically constructs a choice widget.</p>
	 * @param html The HTML text of the choice widget.
	 * @since 1.0
	 */
	protected Choice(String html) {
		super(html);
		addListener(Click.class, this);
	}

	/**
	 * <p>Typically constructs a choice widget in a group.</p>
	 * @param group The group this choice joins.
	 * @param html The HTML text of the choice widget.
	 * @since 1.0
	 */
	protected Choice(Group group, String html) {
		this(html);
		ArrayLikes.add(ini(group).var(Group.CHOICES), this);
		ini(this).var(GROUP, group);
	}

	/**
	 * <p>Checks whether the choice is checked.</p>
	 * @return The "checked" state of the underlying input element.
	 * @since 1.0
	 */
	public Boolean checked() {
		return JsHTMLInputElement.checked.with(
				Component.getHTMLElement(unwrap())
		);
	}

	/**
	 * <p>Sets "checked" state of the choice.</p>
	 * <p>This method synchronizes the group of choices.</p>
	 * @param checked The new "checked" state for the underlying input element.
	 * @since 1.0
	 */
	public void setChecked(boolean checked) {
		Component e = unwrap();
		JsHTMLInputElement.checked.with(
				Component.getHTMLElement(e),
				checked
		);
		synchronize();
	}

	private final static Id<Boolean> CHECKED = new Id<Boolean>();

	/**
	 * <p>Synchronizes the state of the choice.</p>
	 * <p>This method checks the "checked" state of the underlying input element. It fires
	 * {@link Check}, {@link Uncheck} or {@link Change} event from the choice widget
	 * depending on the "checked" states.</p>
	 * @return <tt>true</tt> if the "checked" state of the underlying input element has been
	 * changed; <tt>false</tt>, otherwise.
	 * @since 1.0
	 */
	public boolean synchronize() {
		Boolean checked = checked();
		boolean changed = Js.not(ini(this).var(CHECKED)) == checked;
		if (changed) {
			ini(this).var(CHECKED, checked);
			Component e = unwrap();
			fire(new Change(e));
			if (checked) {
				fire(new Check(e));
			} else {
				fire(new Uncheck(e));
			}
		}
		return changed;
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method simply invokes {@link #synchronize()} method.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(Click evt) {
		synchronize();
	}
}
