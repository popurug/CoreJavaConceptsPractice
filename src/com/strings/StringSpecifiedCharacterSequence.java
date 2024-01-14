package com.strings;

public class StringSpecifiedCharacterSequence {

	public static void main(String[] args) {

	/*	String s1 = "example.com";
		String s2 = "Example.com";
		CharSequence cs = "example.com";
		System.out.println("Comparing " + s1 + " and " + cs + ": " + s1.contentEquals(cs));
		System.out.println("Comparing " + s2 + " and " + cs + ": " + s2.contentEquals(cs)); */
		
		String s1 = "example.com";
		String s2 = "Example.com";
		StringBuffer sbuffer = new StringBuffer(s2);
		
		System.out.println("Comparing " + s1 + " and " + sbuffer + ": " + s1.contentEquals(sbuffer));
		System.out.println("Comparing " + s2 + " and " + sbuffer + ": " + s2.contentEquals(sbuffer));
	}

}
