package com.strings;

public class RemoveDuplicatesFromGivenString {
	
	private static String removeDuplicateChars(String sourceStr) {
		char[] arr1 = sourceStr.toCharArray();
		
		String targetStr = "";
		for(char value : arr1) {
			
			if(targetStr.indexOf(value) == -1) {
				targetStr = targetStr + value;
			}

		}
		return targetStr;
	}

	public static void main(String[] args) {

		String s1 = "eppppppp";
		
		System.out.println("The given string is: " + s1);
		System.out.println("After removing duplicate characters the new string is: " + removeDuplicateChars(s1));
	}

}
