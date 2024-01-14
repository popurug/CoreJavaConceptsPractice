package com.bayoneproblems;

public class Reverse {

	public static void main(String[] args) {

		String value = "Nishanth Bandala";
		String reversedString = "";

		for (int i = value.length() - 1; i >= 0; i--) {
			reversedString = reversedString + value.charAt(i);
		}

		System.out.print("The reversed string of the " + value + " is: ");
		System.out.println(reversedString);
	}

}
