package com.hashmap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {

	public static void main(String[] args) {

		NavigableMap<String, Integer> nm = new TreeMap<String, Integer>();
		nm.put("C", 884);
		nm.put("Y", 999);
		nm.put("A", 666);
		nm.put("T", 555);
		nm.put("B", 444);
		nm.put("A", 222);

		System.out.println("Mappings of NavigableMap is: " + nm);

		System.out.printf("Descending Set: %s%n", nm.descendingKeySet());
		System.out.printf("Floor Entry: %s%n", nm.floorEntry("L"));
		System.out.printf("First Entry: %s%n", nm.firstEntry());
		System.out.printf("Last Key: %s%n", nm.lastKey());
		System.out.printf("First Key: %s%n", nm.firstKey());
		System.out.printf("Original Map: %s%n", nm);
		System.out.printf("Reverse Map: %s%n", nm.descendingMap());
	}

}
