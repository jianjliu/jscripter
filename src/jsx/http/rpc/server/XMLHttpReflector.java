
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

package jsx.http.rpc.server;

import js.ArrayLike;
import js.ObjectLike;
import js.Vars;
import jsx.http.rpc.remote.Remote;
import jsx.http.rpc.remote.RemoteReflector;

/**
 * <p>A class for XML & HTTP serialized reflection server.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 */
public final class XMLHttpReflector extends XMLHttpServer
{
	/**
	 * <p>Calls this context as a server-side method with the base object and arguments.</p>
	 * @param base The base object for calling.
	 * @param args An array of arguments for the calling.
	 * @return The result of the call.
	 * @since 1.0
	 */
	@Override
	protected Object call(ObjectLike base, ArrayLike<?> args) {
		ServerReflector sr = new ServerReflector(base);
		if (!sr.isReflector()) {
			return Remote.nul();
		}
		int sid = ((Number)args.get(0)).intValue();
		switch(sid) {
			default:
				return Remote.nul();
			case RemoteReflector.REGISTER:
				if (args.length() != 1) {
					return Remote.nul();
				}
				return sr.register();
			case RemoteReflector.INCREASE:
				if (args.length() > 1) {
					ArrayLike<Remote> a = new Vars<Remote>().var();
					for (int i = 1; i < args.length(); i++) {
						a.push(new Remote((ObjectLike)args.get(i)));
					}
					sr.increase(a);
				}
				return Remote.nul();
			case RemoteReflector.DECREASE:
				if (args.length() > 1) {
					ArrayLike<Remote> a = new Vars<Remote>().var();
					for (int i = 1; i < args.length(); i++) {
						a.push(new Remote((ObjectLike)args.get(i)));
					}
					sr.decrease(a);
				}
				return Remote.nul();
			case RemoteReflector.FOR_NAME:
				if (args.length() != 2) {
					return Remote.nul();
				}
				return sr.forName(
						(String)args.get(1)
				);
			case RemoteReflector.NEW_INSTANCE:
				if (args.length() != 2) {
					return Remote.nul();
				}
				return sr.newInstance(
						new Remote((ObjectLike)args.get(1))
				);
			case RemoteReflector.GET_REMOTE_CLASS:
				if (args.length() != 2) {
					return Remote.nul();
				}
				return sr.getRemoteClass(
						new Remote((ObjectLike)args.get(1))
				);
			case RemoteReflector.GET_ARRAY_ELEMENT:
				if (args.length() != 3) {
					return Remote.nul();
				}
				return sr.getArrayElement(
						new Remote((ObjectLike)args.get(1)),
						((Number)args.get(2)).intValue()
				);
			case RemoteReflector.GET_ARRAY_LENGTH:
				if (args.length() != 2) {
					return Remote.nul();
				}
				return sr.getArrayLength(
						new Remote((ObjectLike)args.get(1))
				);
			case RemoteReflector.SET_ARRAY_ELEMENT:
				if (args.length() != 4) {
					return Remote.nul();
				}
				return sr.setArrayElement(
						new Remote((ObjectLike)args.get(1)),
						((Number)args.get(2)).intValue(),
						new Remote((ObjectLike)args.get(3))
				);
			case RemoteReflector.GET_FIELD:
				if (args.length() < 3) {
					return Remote.nul();
				} else {
					return sr.getField(
							new Remote((ObjectLike)args.get(1)),
							(String)args.get(2)
					);
				}
			case RemoteReflector.GET:
				if (args.length() < 2) {
					return Remote.nul();
				} else if (args.length() < 3) {
					return sr.get(
							new Remote((ObjectLike)args.get(1))
					);
				} else {
					return sr.get(
							new Remote((ObjectLike)args.get(1)),
							new Remote((ObjectLike)args.get(2))
					);
				}
			case RemoteReflector.GET_METHOD:
				if (args.length() < 3) {
					return Remote.nul();
				} else if (args.length() < 4) {
					return sr.getMethod(
							new Remote((ObjectLike)args.get(1)),
							(String)args.get(2)
					);
				} else {
					@SuppressWarnings("unchecked")
					ArrayLike<String> a = (ArrayLike<String>)args.slice(3);
					return sr.getMethod(
							new Remote((ObjectLike)args.get(1)),
							(String)args.get(2),
							a
					);
				}
			case RemoteReflector.INVOKE:
				if (args.length() < 2) {
					return Remote.nul();
				} else if (args.length() < 3) {
					return sr.invoke(
							new Remote((ObjectLike)args.get(1))
					);
				} else {
					ArrayLike<Remote> a = new Vars<Remote>().var();
					for (int i = 2; i < args.length(); i++) {
						a.push(new Remote((ObjectLike)args.get(i)));
					}
					return sr.invoke(
							new Remote((ObjectLike)args.get(1)),
							a
					);
				}
		}
	}
}
