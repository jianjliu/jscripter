
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

package jsx.ui.vect.canvas;

import js.Id;
import js.Initializer;
import js.Js;
import js.ObjectLike;
import jsx.Configurable;
import jsx.core.ObjectLikes;
import jsx.dom.Styles;
import jsx.ui.Component;
import jsx.ui.dd.Mouse;
import jsx.ui.dd.event.DragMove;
import jsx.ui.dd.event.DragStart;
import jsx.ui.dd.event.DragStop;
import jsx.ui.vect.Canvas;

/**
 * <p>An abstract base class for drawing tools that can interactively draw on a wrapped 
 * canvas with the help of a cached draft canvas.</p>
 * <p>A drawing tool of a subclass of this one wraps a {@link Canvas} component and 
 * draws a specific type of shapes in accordance with the {@link Mouse} handle to which 
 * it listens mouse events but shows the intermediate drawings on a draft canvas.</p>
 * <p>A {@link CanvasDraft} widget is {@link Configurable} and is also an event source 
 * which may fire high level events.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public abstract class CanvasDraft extends CanvasDraw
{
	/**
	 * <p>A global identifier for a configurable property of a {@link CanvasDraft} object.</p>
	 * <p>The identified configurable property of a {@link CanvasDraft} widget caches the 
	 * latest mouse press event that occurs on the canvas.</p>
	 * @since 1.0
	 */
	protected final static Id<DragStart> PRESS = new Id<DragStart>();
	/**
	 * <p>A global identifier for a configurable property of a {@link CanvasDraft} object.</p>
	 * <p>The identified configurable property of a {@link CanvasDraft} widget caches the 
	 * draft canvas widget cached by the canvas drawing tool.</p>
	 * @since 1.0
	 */
	protected final static Id<Canvas> DRAFT = new Id<Canvas>();

	/**
	 * <p>A typical constructor that constructs a wrapper widget of this type and forces 
	 * constructors of subclasses to pass a {@link Canvas} widget.</p>
	 * <p>This constructor invokes the typical constructor of the superclass passing 
	 * the component wrapped by the specified {@link Canvas} widget that is set to the 
	 * configurable property {@link CanvasDraw#CANVAS} of the widget to be constructed.</p>
	 * @param c A canvas widget.
	 * @since 1.0
	 */
	protected CanvasDraft(Canvas c) {
		super(c);
	}

	/**
	 * <p>Gets the draft canvas cached by this canvas drawing wrapper.</p>
	 * <p>This method simply returns the configurable property {@link #DRAFT} of this 
	 * wrapper widget if it exists. If it does not, this method will create a new one, 
	 * set it to the property and return it.</p>
	 * @return The draft canvas cached by this canvas drawing tool.
	 * @since 1.0
	 */
	protected static final Canvas getDraft(CanvasDraw d) {
		Canvas t = ini(d).var(DRAFT);
		if (Js.not(t)) {
			t = Canvas.create();
			ini(d).var(DRAFT, t);
			Canvas c = d.canvas();
			Canvas.width (t, Canvas.width (c));
			Canvas.height(t, Canvas.height(c));
			Canvas.fillStyle  (t, Canvas.fillStyle  (c));
			Canvas.strokeStyle(t, Canvas.strokeStyle(c));
			Canvas.lineWidth  (t, Canvas.lineWidth  (c));
			ObjectLike o = new Initializer().var();
			Styles.left(o, Styles.px(ini(d).var(X)));
			Styles.top (o, Styles.px(ini(d).var(Y)));
			Styles.position(o, "absolute");
			Styles.zIndex(o, "9999");
			Component.applyStyle(t.unwrap(), o);
		}
		return t;
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method invokes the overridden method of the superclass to initialize and caches the 
	 * mouse press event in the configurable property {@link #PRESS} of the current canvas 
	 * drawing tool.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	@Override
	public void onEvent(DragStart evt) {
		super.onEvent(evt);
		ini(this).var(PRESS, evt);
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>This method clears the cached draft canvas if the current canvas drawing tool 
	 * is in a drawing mode.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(DragMove evt) {
		if (Js.be(ini(this).var(START))) {
			Canvas t = getDraft(this);
			Canvas.clearRect(t, 0, 0, Canvas.width(t), Canvas.height(t));
		}
	}

	/**
	 * <p>Performs an action on the dispatched event.</p>
	 * <p>If the current canvas drawing tool is in a drawing mode this method deletes 
	 * the cached draft canvas.</p>
	 * @param evt The event dispatched to this listener.
	 * @since 1.0
	 */
	public void onEvent(DragStop evt) {
		if (Js.be(ini(this).var(START))) {
			Canvas t = ini(this).var(DRAFT);
			if (Js.be(t)) {
				Component e = t.unwrap();
				ObjectLikes.delete(ini(this), DRAFT);
				Component.detach(e);
			}
		}
	}
}
