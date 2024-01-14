package com.hashmap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class AccessingElementsFromNavigableMap {

	public static void main(String[] args) {

		NavigableMap<Integer, String> nmap = new TreeMap<Integer, String>();
		nmap.put(8, "Third");
		nmap.put(6, "Second");
		nmap.put(3, "First");
		nmap.put(11, "Fourth");

		// Accessing elements using get() method
		// with key as a parameter
		System.out.println(nmap.get(3));
		System.out.println(nmap.get(6));
		System.out.println(nmap.get(8));
		System.out.println(nmap.get(11));

		// Display the set of keys using KeySet() method.
		System.out.println("\n The NavigableMap key set is: " + nmap.keySet());
	}

}
