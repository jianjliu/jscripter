
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

package jsx.ui;

import js.Id;
import js.Initializer;
import js.ObjectLike;
import jsx.dom.Styles;
import jsx.ui.event.OnProgress;
import jsx.ui.event.Progress;

/**
 * <p>A base class for progress widgets.</p>
 * <p>A {@link ProgressBar} is a {@link Widget}.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class ProgressBar extends Widget implements OnProgress
{
	/**
	 * <p>The default constructor.</p>
	 * <p>This constructor invokes the default constructor of this class.</p>
	 * @since 1.0
	 */
	public ProgressBar() {
		super(Component.div());
		addListener(Progress.class, this);
		addClasses();
		Component e = unwrap();
		Component c = Component.div();
		ini(e).var(PROGRESS, c);
		Component.appendChild(e, c);
	}

	private final static Id<Component> PROGRESS = new Id<Component>();

	/**
	 * <p>Sets rate of progress.</p>
	 * @param rate The rate of percentage for the progress.
	 * @since 1.0
	 */
	public void setRate(int rate) {
		ObjectLike p = new Initializer().var();
		Styles.width(p, Styles.pc(rate));
		Component.applyStyle(ini(unwrap()).var(PROGRESS), p);
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method sets {@link Progress#RATE} to this {@link ProgressBar}.</p>
	 * @param evt The event dispatched to this listener.
	 * @see #setRate(int)
	 * @since 1.0
	 */
	public void onEvent(Progress evt) {
		setRate(ini(evt).var(Progress.RATE));
	}
}
