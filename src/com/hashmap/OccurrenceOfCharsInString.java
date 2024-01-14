package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfCharsInString {

	@SuppressWarnings("rawtypes")
	public static void charCount(String str) {
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		char[] strArray = str.toCharArray();

		// Checking each character of strArray
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				// If char is present in charCountMap,
				// incrementing it's count by 1
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				// If char is not present in charCountMap,
				// putting this char to charCountMap with 1 as it's value
				charCountMap.put(c, 1);
			}
		}
		// Printing the charCountMap
		for (Map.Entry e : charCountMap.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());

		}
	}

	public static void main(String[] args) {

		String str = "ajith";
		charCount(str);
	}

}
