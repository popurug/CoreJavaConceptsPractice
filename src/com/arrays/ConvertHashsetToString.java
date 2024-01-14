package com.arrays;

import java.util.HashSet;

public class ConvertHashsetToString {

	public static void main(String[] args) {

	/*	HashSet<String> set = new HashSet<>();
		set.add("Boston");
		set.add("NewYork");
		set.add("SanFrancisco");
		set.add("Washington");
		
		String result = String.join(",", set);
		System.out.println("\t" + result);  */
		
		//Using toString() method
	/*	HashSet<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Google");
		set.add("Facebook");
		set.add("Amazon");
		
		String result = set.toString();
		System.out.println(result); */
		
		//Using Apache Commons
	/*	HashSet<String> set = new HashSet<>();
		set.add("Alive");
		set.add("is");
		set.add("Awesome");
		set.add("Day");
		
	//	String result = StringUtils.join(set, ",");
		String result = String.join(",", set);
		System.out.print(result);  */
		
		String s1 = "Learning";
		String s2 = " Concatenation";
		String s3 = " in strings";
		String s4 = s1.concat(s2).concat(s3);
		System.out.println(s4);
	}

}
