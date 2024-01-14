package com.strings;

public class DivideStringInNEqualParts {
	
	public static void splitString(String s1, int n) {
		int strSize = s1.length();
		int partSize;
		if(strSize % n != 0) {
			System.out.println("The size of the given string is not divided by " + n);
			return;
		}else {
			System.out.println("The given string is: " + s1);
			System.out.println("The string divided into " + n + " parts and they are: ");
			partSize = strSize / n;
			for(int i = 0; i < strSize; i++) {
				if(i % partSize == 0) {
					System.out.println();
				}
				
					System.out.print(s1.charAt(i));
					
				
			}
		}
	}

	public static void main(String[] args) {

		String s1 = "abcdefghijklmnopqrstuvwxy";
		int splitNumber = 5;
		splitString(s1, splitNumber);
		
	}

}
