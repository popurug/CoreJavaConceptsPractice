package com.collectionframeworks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterface {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Cricket");
		map.put(2, "Hockey");
		map.put(3, "Archery");
		map.put(4, "VolleyBall");
		map.put(5, "FoodBall");
		map.put(6, "Coco");
		for (Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
			Entry<Integer, String> m = iterator.next();
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
