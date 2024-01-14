package com.practice;

import java.util.Arrays;

public class CheckAnagrams {
	
	@SuppressWarnings("null")
	static boolean  isAnagramSort(String string1, String string2) {
		
		if(string1.length() != string2.length()) {
			return false;
		}
	
	char[] a1 = string1.toCharArray();
	char[] a2 = string2.toCharArray();
	
	Arrays.sort(a1);
	Arrays.sort(a2);
	
	return Arrays.equals(a1, a2);
	}

	public static void main(String args[]) {
		CheckAnagrams ca = new CheckAnagrams();
		//isAnagramSort("cinema1","iceman")
		//System.out.println("Are anagrams:" + ca.isAnagramSort("cinema1","iceman"));
		System.out.println("The both strings are Anagrams: " + isAnagramSort("secure","rescue1"));
	}
}
