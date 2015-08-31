
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

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

class IdentityMap extends HashMap<String, Object>
{
	private static final long serialVersionUID = 1L;

	private final IdentityHashMap<Object, String> idMap =
	          new IdentityHashMap<Object, String>();

	private final Map<String, Long> refMap = new HashMap<String, Long>();
	private final Map<String, Long> useMap = new HashMap<String, Long>();
	private final Timer timer = new Timer();

	public IdentityMap() {
		super();
		final long ttl = 30000L;
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				purge(ttl);
			}
		}, ttl, ttl);
	}

	protected synchronized void purge(long ttl) {
		long now = new Date().getTime();
		Object[] keys = keySet().toArray();
		for (Object k : keys) {
			String key = (String)k;
			if (ref(key) < 1L) {
				if (now - usage(key) > ttl) {
					remove(key);
				}
			}
		}
	}

	protected synchronized long usage(String key) {
		if (key == null) return 0L;
		Long r = useMap.get(key);
		return r == null ? 0L : r.longValue();
	}

	protected synchronized String use(String key) {
		if (key == null) return key;
		useMap.put(key, new Date().getTime());
		return key;
	}

	public String getString(String key) {
		Object o = get(key);
		return o == null ? "NULL" : o.toString();
	}

	protected synchronized long idle(String key) {
		return new Date().getTime() - usage(key);
	}

	public synchronized long ref(String key) {
		Long r = refMap.get(key);
		return r == null ? 0L : r.longValue();
	}

	public synchronized void increase(String key) {
		if (key != null) {
			refMap.put(use(key), ref(key) + 1L);
		}
	}

	public synchronized void decrease(String key) {
		if (key != null) {
			refMap.put(use(key), ref(key) - 1L);
		}
	}

	@Override
	public synchronized void clear() {
		super.clear();
		idMap.clear();
		refMap.clear();
		useMap.clear();
	}

	@Override
	public synchronized boolean containsValue(Object value) {
		return idMap.containsKey(value);
	}

	public synchronized String getKey(Object value) {
		return use(idMap.get(value));
	}

	@Override
	public synchronized Object put(String key, Object value) {
		Object prev = super.put(use(key), value);
		if (prev != value) {
			idMap.put(value, key);
		}
		return prev;
	}

	@Override
	public synchronized Object remove(Object key) {
		Object value = super.remove(key);
		idMap.remove(value);
		refMap.remove(key);
		useMap.remove(key);
		return value;
	}

	public synchronized String removeValue(Object value) {
		String key = idMap.remove(value);
		super.remove(key);
		refMap.remove(key);
		useMap.remove(key);
		return key;
	}

	@Override
	public synchronized Collection<Object> values() {
		return idMap.keySet();
	}
}
