package com.hexawareproblems;

import java.util.HashMap;

public class OccuranceOfCharUsingHashMap {

	public static void main(String[] args) {

		String str = "popuru";
		//HashMap char as key and occurrence as a value
		HashMap<Character, Integer> charCount = new HashMap<>();
		for(int i = str.length()-1; i>=0; i--) {
			if(charCount.containsKey(str.charAt(i))) {
		//	int count = 0;
				int count = charCount.get(str.charAt(i));
			charCount.put(str.charAt(i), ++count);
		}else {
			charCount.put(str.charAt(i), 1);
		}
	}
		System.out.println("The occurrence of char count is: " + charCount);

}
}
