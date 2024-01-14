package com.strings;

public class RegionInStringMatchesOtherString {

	public static void main(String[] args) {

		String s1 = "Shanghai Houston Colorado Alexandria";
		String s2 = "Alexandria Colorado Houston Shanghai";
		
		//Determine whether characters 0 through 7 in s1 
		//matches characters 28 through 35 in s2
		boolean match1 = s1.regionMatches(0, s2, 28, 8);
		
		//Determine whether characters 9 through 15 in s1
		//matches characters 28 through 35 in s2
		boolean match2 = s1.regionMatches(9, s2, 9, 8);
		
		//Display the results of the regionMatches method calls.
		System.out.println("s1[0 -7] == s2[28 - 35]? " + match1);
		System.out.println("s1[9 - 15] == s2[9 - 15]? " + match2);
	}

}
