package gfg.hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratingHashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("gfg", 10);
		map.put("dsa", 20);
		map.put("course", 30);

		System.err.println(map);

		System.err.println("Size of map : " + map.size());

		for (Map.Entry<String, Integer> i : map.entrySet()) {
			System.err.println(i.getKey() + " : " + i.getValue());
		}

		Iterator mapIterator = map.entrySet().iterator();
		while (mapIterator.hasNext()) {
			Map.Entry m = (Map.Entry) mapIterator.next();

			System.err.println(m.getKey() + " : " + m.getValue());
		}
	}

}
