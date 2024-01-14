package com.hashmap;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TraversingElementsToNavigableMap {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		NavigableMap<Integer, String> nmap = new TreeMap<Integer, String>();
		nmap.put(3, "Welcome to");
		nmap.put(2, "my");
		nmap.put(1, "Java World!!!");

		// Create an Iterator over the NavigableMap
		Iterator<NavigableMap.Entry<Integer, String>> itr = nmap.entrySet().iterator();
		System.out.println("Traversing using Iterator: ");

		// The hasNext() method is used to check if there is a next element,
		// The next() method is used to retrieve the next element.
		while (itr.hasNext()) {
			NavigableMap.Entry<Integer, String> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

		System.out.println("Traversing using for-each: ");
		// Iterate using for-each loop
		for (Map.Entry mapElement : nmap.entrySet()) {
			// get the key using getKey()
			int key = (int) mapElement.getKey();
			// Finding the value
			String value = (String) mapElement.getValue();

			System.out.println("Key = " + key + ", Value = " + value);
		}
	}

}
