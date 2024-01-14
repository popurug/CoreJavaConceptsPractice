package com.object;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Details {
	public void countDuplicateChars(String str) {
		//Create a HashMap
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		//Convert the string to char array
		char[] chars = str.toCharArray();
		
		//Logic
		for(Character ch:chars) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		//Obtaining set of keys
		Set<Character> keys = map.keySet();
		
		//Duplicate counting logic
		for(Character ch:keys) {
			if(map.get(ch) > 1) {
				System.out.println("Char "+ch+" "+map.get(ch));
			}
		}
	}

	public static void main(String[] args) {
		Details d = new Details();
		System.out.println("String: BeginnersBook.com");
		System.out.println("-------------------------");
		d.countDuplicateChars("BeginnersBook.com");
		
		System.out.println("\nString: Gopinath Popuru");
		System.out.println("--------------------------");
		d.countDuplicateChars("Gopinath Popuru");
		
		System.out.println("\nString: Nishanth Bandala");
		System.out.println("--------------------------");
		d.countDuplicateChars("Nishanth Bandala");
	}
}
