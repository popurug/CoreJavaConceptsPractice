package com.hashmap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class RemovingElementsFromNavigableMap {

	public static void main(String[] args) {

		NavigableMap<Integer, String> nmap = new TreeMap<Integer, String>();

		// Adding elements using put() method.
		nmap.put(3, "Gopinath");
		nmap.put(2, "Nishanth");
		nmap.put(1, "ManiRam");
		nmap.put(4, "Naveen");

		System.out.println("Mappings of NavigableMap is: " + nmap);

		nmap.remove(4);
		System.out.println("\n NavigableMap, after remove operation is: " + nmap);

		// Clear the entire map using clear() method.
		nmap.clear();
		System.out.println("\n NavigableMap, after clear operation is: " + nmap);
	}

}
