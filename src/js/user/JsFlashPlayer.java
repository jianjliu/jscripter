
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

package js.user;

import js.*;
import js.core.*;

/**
 * <p>An <b>opaque</b> class representing JavaScript client-side objects of the global 
 * {@link JsClient#FlashPlayer} class.</p>
 * <p>An object of this class represents a Flash movie embedded in a web page and the 
 * instance of the Flash plug-in that is playing that movie. You can obtain an object 
 * of this class using {@link JsDocument#getElementById(String)} to get the 
 * <tt>&lt;embed&gt;</tt> or <tt>&lt;object&gt;</tt> tag that embeds the movie in the 
 * web page.</p>
 * <p>Once you have obtained an object of this class, you can use the various methods it 
 * defines to control playback of the movie and to interact with it by setting and 
 * querying variables. Note that {@link JsFlashPlayer} methods all begin with a capital 
 * letter, which is not a common naming convention in Java and JavaScript.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsFlashPlayer extends JsClient.FlashPlayer.Prototype
{
	/**
	 * <p>An <b>opaque</b> class representing members of its enclosing <b>opaque</b> type.</p>
	 * <p>Note that, this class is <b>opaque</b> but its constructors are all <b>internal</b>. 
	 * This class and the subclasses of this class are used to declare either <b>opaque</b> 
	 * <tt>public</tt> instance fields of the opaque type {@link js.Var.Member} or the 
	 * <b>opaque</b> <tt>public</tt> static fields of other <b>opaque</b> types while their 
	 * constructors are used to define the fields inside <b>opaque</b> classes. Under 
	 * either circumstance, the field names must be exactly same as the member names, as 
	 * the <b>opaque</b> fields of <b>opaque</b> types are resolved by re-compilers directly 
	 * based on the field names.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be created
	 * in the target codes. Re-compilers must exit with error on operations accessing that kind 
	 * of class objects.
	 * Re-compilers must resolve an <b>opaque</b> instance field declared by this class in
	 * {@link js.Var.Member} or its subclasses to the JavaScript identifier: 
	 * <pre>q.m</pre>
	 * where <tt>m</tt> is the identifier of the field name and <tt>q</tt> is the identifier
	 * resolved from the instance of the enclosing member. Re-compilers must resolve an 
	 * <b>opaque</b> static field declared by this class in <b>opaque</b> types other than 
	 * {@link js.Var.Member} and its subclasses to the JavaScript identifier: 
	 * <pre>m</pre>
	 * where <tt>m</tt> is the identifier of the field name. And re-compilers must report
	 * error on the access to <b>opaque</b> fields declared by this class under any other 
	 * circumstances.
	 */
	public static class Member extends JsClient.FlashPlayer.Prototype.Member
	{
		/**
		 * <p>Internally constructs a member based on a qualifying member.</p>
		 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b>
		 * or <b>internal</b> classes or class members.</p>
		 * <p>Note that, this constructor is <b>internal</b> but its declaring class is
		 * <b>opaque</b>. This constructor is used to define <b>opaque</b> instance fields 
		 * declared in the declaring class of this constructor itself or its subclasses. 
		 * Under this circumstance, the field names must be exactly same as the member 
		 * names, as the <b>opaque</b> instance fields of the <b>opaque</b> type 
		 * {@link js.Var.Member} or its subclasses are resolved by re-compilers directly
		 * to their names appending to the name resolved from the specified qualifying 
		 * member with a dot in between.</p>
		 * @param q A qualifying member
		 * @param mid The ID of the member to construct
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor.
		 */
		public Member(JsObject.Member q, Mid mid) {
			super(q, mid);
		}
		/**
		 * <p>Internally constructs a member without a qualifying member.</p>
		 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b>
		 * or <b>internal</b> classes or class members.</p>
		 * <p>Note that, this constructor is <b>internal</b> but its declaring class is
		 * <b>opaque</b>. This constructor is used to define <b>opaque</b> static fields, 
		 * declared in <b>opaque</b> types other than the declaring class of this constructor 
		 * itself and its subclasses. Under this circumstance, the field names must be
		 * exactly same as the member names, as the <b>opaque</b> static fields of <b>opaque</b>
		 * types are generally resolved by re-compilers directly to identifiers of their names.</p>
		 * @param mid The ID of the member to construct
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor.
		 */
		public Member(Mid mid) {
			super(mid);
		}
		@Override
		/**
		 * <p>Evaluates the property, represented by the current member instance, of the
		 * argument object.</p>
		 * @param o The argument object
		 * @return The value of the current member based on the object argument.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into
		 * the JavaScript expression: 
		 * <pre>o.m</pre>
		 * where <tt>m</tt> is the identifier name resolved from the current member
		 * instance of the invocation.
		 */
		public JsFlashPlayer with(ObjectLike o) {
			return new JsFlashPlayer(super.with(o));
		}
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsFlashPlayer(JsObject var) {
		super(var);
	}

	@Override
	/**
	 * <p>Returns the primitive value associated with the current instance, if there is one.
	 * This invocation simply returns the instance itself for the current instance is an 
	 * object and there is no primitive value for it.</p>
	 * @return The current object itself.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final JsFlashPlayer valueOf() {
		return new JsFlashPlayer((JsObject)var().valueOf());
	}

	/**
	 * <p>Returns the value of a variable defined by a Flash movie.</p>
	 * @param variableName The name of the variable defined in the Flash movie.
	 * @return The value of the named variable as a string, or <tt>null</tt> if no such 
	 * variable exists.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String GetVariable(String variableName) {
		return call(GetVariable, variableName);
	}
	/**
	 * <p>Returns the value of a variable defined by a Flash movie.</p>
	 * @param variableName The name of the variable defined in the Flash movie.
	 * @return The value of the named variable as a string, or <tt>null</tt> if no such 
	 * variable exists.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final String GetVariable(StringLike variableName) {
		return GetVariable(Js.valueOf(variableName));
	}
	/**
	 * <p>Jumps to the specified frame number in the movie.</p>
	 * <p>This method skips to the specified frame of the movie, or skips to the last 
	 * available frame, if the specified frame has not been loaded yet. To avoid this 
	 * indeterminate behavior, use {@link #PercentLoaded()} to determine how much of the 
	 * movie is available.</p>
	 * @param frameNumber The frame number to skip to.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void GotoFrame(Number frameNumber) {
		call(GotoFrame, frameNumber);
	}
	/**
	 * <p>Jumps to the specified frame number in the movie.</p>
	 * <p>This method skips to the specified frame of the movie, or skips to the last 
	 * available frame, if the specified frame has not been loaded yet. To avoid this 
	 * indeterminate behavior, use {@link #PercentLoaded()} to determine how much of the 
	 * movie is available.</p>
	 * @param frameNumber The frame number to skip to.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void GotoFrame(NumberLike<?> frameNumber) {
		GotoFrame(Js.valueOf(frameNumber));
	}
	/**
	 * <p>Checks whether the movie is playing.</p>
	 * @return <tt>true</tt> if the movie is playing; <tt>false</tt> otherwise.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Boolean IsPlaying() {
		return call(IsPlaying);
	}
	/**
	 * <p>Loads an auxiliary Flash movie and displays it at a specified layer or level 
	 * of the current movie.</p>
	 * <p>This method loads an auxiliary movie from the specified <tt>url</tt> and 
	 * displays it at the specified <tt>layer</tt> within the current movie.</p>
	 * @param layer The level or layer within the current movie on which the newly 
	 * loaded movie is to be displayed.
	 * @param url The URL of the movie to load.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void LoadMovie(Number layer, String url) {
		call(LoadMovie, new Vars<Object>().add(layer).add(url));
	}
	/**
	 * <p>Moves the viewport of the movie.</p>
	 * <p>The Flash player defines a viewport through which Flash movies are visible. 
	 * Typically, the size of the viewport and the size of the movie are the same, but 
	 * this may not be not the case when {@link #SetZoomRect(Number, Number, Number, Number)} or 
	 * {@link #Zoom(Number)} have been called: those methods can alter the viewport so that 
	 * only a portion of the movie shows through.</p>
	 * <p>When the viewport is showing only a portion of the movie, this method moves 
	 * (or "pans") the viewport so that a different portion of the movie shows. This 
	 * method doesn't allow you to pan beyond the edges of a movie, however.</p>
	 * @param dx The horizontal amounts to pan.
	 * @param dy The vertical amounts to pan.
	 * @param mode Specifies how to interpret the <tt>dx</tt> and <tt>dy</tt> values. 
	 * If this argument is 0, the other arguments are taken as pixels. If this argument 
	 * is 1, the others are percentages.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void Pan(Number dx, Number dy, Number mode) {
		call(Pan, new Vars<Object>().add(dx).add(dy).add(mode));
	}
	/**
	 * <p>Determines how much of the movie has loaded.</p>
	 * @return An integer between 0 and 100 representing the approximate percentage of 
	 * the movie that has been loaded into the player.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number PercentLoaded() {
		return call(PercentLoaded);
	}
	/**
	 * <p>Begins playing the movie.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void Play() {
		call(Play);
	}
	/**
	 * <p>Rewinds the movie to its first frame.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void Rewind() {
		call(Rewind);
	}
	/**
	 * <p>Sets a variable defined by a Flash movie.</p>
	 * @param name The name of the variable to set.
	 * @param value The new value for the named variable. This value must be a string.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void SetVariable(String name, String value) {
		call(SetVariable, new Vars<Object>().add(name).add(value));
	}
	/**
	 * <p>Sets the area of the movie displayed by the Flash player.</p>
	 * <p>This method defines the movie's viewport, that is, it specifies a sub-rectangle 
	 * of the movie to appear in the Flash player. Flash movies are measured in a unit 
	 * known as the twip. There are 20 twips to a point and 1,440 twips to an inch.</p>
	 * @param left   The X-coordinate, in twips, of the upper-left  corner of the viewport.
	 * @param top    The Y-coordinate, in twips, of the upper-left  corner of the viewport.
	 * @param right  The X-coordinate, in twips, of the lower-right corner of the viewport.
	 * @param bottom The Y-coordinate, in twips, of the lower-right corner of the viewport.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void SetZoomRect(Number left, Number top, Number right, Number bottom) {
		call(SetZoomRect, new Vars<Object>().add(left).add(top).add(right).add(bottom));
	}
	/**
	 * <p>Stops the movie.</p>
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void StopPlay() {
		call(StopPlay);
	}
	/**
	 * <p>Returns the length of the movie, as a number of frames.</p>
	 * @return The length of the movie in frames.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final Number TotalFrames() {
		return call(TotalFrames);
	}
	/**
	 * <p>Changes the size of the movie's viewport.</p>
	 * <p>This method scales the viewport by a specified percentage. Arguments between 
	 * 1 and 99 reduce the size of the viewport, which makes objects in the movie 
	 * appear larger. Arguments greater than 100 enlarge the viewport (but never beyond 
	 * the size of the movie) and make objects in the movie appear smaller. As a special 
	 * case, the argument 0 restores the viewport to full size, so that the entire movie 
	 * is visible.</p>
	 * @param percentage The percentage by which to scale the viewport, or 0 to restore 
	 * the viewport to its full size.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void Zoom(Number percentage) {
		call(Zoom, percentage);
	}
	/**
	 * <p>Changes the size of the movie's viewport.</p>
	 * <p>This method scales the viewport by a specified percentage. Arguments between 
	 * 1 and 99 reduce the size of the viewport, which makes objects in the movie 
	 * appear larger. Arguments greater than 100 enlarge the viewport (but never beyond 
	 * the size of the movie) and make objects in the movie appear smaller. As a special 
	 * case, the argument 0 restores the viewport to full size, so that the entire movie 
	 * is visible.</p>
	 * @param percentage The percentage by which to scale the viewport, or 0 to restore 
	 * the viewport to its full size.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void Zoom(NumberLike<?> percentage) {
		Zoom(Js.valueOf(percentage));
	}
}
