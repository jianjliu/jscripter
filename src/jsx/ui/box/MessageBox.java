
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

package jsx.ui.box;

import jsx.ui.Component;

/**
 * <p>A base class for message box dialog.</p>
 * <p>A message box is the simplest dialog.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public class MessageBox extends Dialog
{
	/**
	 * <p>Typically constructs a message box.</p>
	 * <p>This constructor invokes its super constructor with the specified title text and adds
	 * the given message text to the content box.</p>
	 * @param title The title text for the message box.
	 * @param message The message text for the content box.
	 * @since 1.0
	 */
	public MessageBox(String title, String message) {
		super(title);
		getContent().add(Component.title(message));
	}
}
