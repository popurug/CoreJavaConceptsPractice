package com.arrays;

import java.util.HashSet;

public class StringConcatenation {
	
	public static String mergedString(String s1, String s2) {
		HashSet<Character> set = new HashSet<>();
		StringBuilder result = new StringBuilder();
		
		for(char ch : s1.toCharArray()) {
			if(ch != ',') {
				set.add(ch);
			}
		}
		
		//Add all characters
		for(char ch : s2.toCharArray()) {
			if(ch != ',') {
				set.add(ch);
			}
		}
		
		//Append all
		for(char ch : set) {
			result.append(ch);
			result.append(",");
		}
	//	System.out.println(set);
	//	System.out.println(result);
		//Remove the trailing comma
		if(result.length() > 0) {
			result.deleteCharAt(result.length() - 1);
		//	result.deleteCharAt(1);
		}
		return result.toString();
}

	public static void main(String[] args) {

		String s1 = "z, j,r, k, g";
		String s2 = "a, b, c, d, e, k, f, g";
		String mergedString = mergedString(s1, s2);
		System.out.println(mergedString);
		 	
	}

}
 