package com.collectionframeworks;

import java.util.HashMap;

public class HashMapClass {

	public static void main(String[] args) {
		HashMap<String, String> hmap = new HashMap<String, String>();
		hmap.put("Honda", "CBR");
		hmap.put("Kawasaki", "Ninja");
		hmap.put("Ducati", "Panigale");
		hmap.put("Yamaha", "R1");
		hmap.put("Toyota", "Rav4");
		hmap.put("Toyota", "Camry");
		hmap.put("Nissan", "Altima");
		hmap.put("RangeRover", "M1");
		System.out.println(hmap);
	}
}
