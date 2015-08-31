
/*
 *  JScripter Simulation 1.0 - For Java To Script
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

package org.jscripter.sim;

import js.core.JsFunction;

final class SimTimeout extends SimThread
{
	SimTimeout(final JsFunction<?> f, final Number delay) {
		super(f, delay);
		start();
	}

	@Override
	public void run() {
		if (!clear) {
			if (delay != null) {
				try {
					Thread.sleep(delay.longValue());
				} catch (InterruptedException ie) {
					return;
				}
			}
			if (!clear) {
				f.invoke();
			}
		}
	}
}
