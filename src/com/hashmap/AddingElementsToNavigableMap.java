package com.hashmap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class AddingElementsToNavigableMap {

	public static void main(String[] args) {

		// Instantiate an object since NavigableMap is an interface
		// We use TreeMap
		NavigableMap<Integer, String> nmap = new TreeMap<Integer, String>();
		nmap.put(3, "Welcome to");
		nmap.put(2, "my");
		nmap.put(1, "Java World!!");

		System.out.println("Mappings of NavigableMap is: " + nmap);
	}

}
