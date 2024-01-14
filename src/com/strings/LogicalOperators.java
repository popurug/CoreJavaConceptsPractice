package com.strings;

public class LogicalOperators {

	public static void main(String[] args) {

		//Variables definition and initialization
		boolean bool1 = true;
		boolean bool2 = false;
		
		//Logical AND
		System.out.println("bool1 && bool2 = " + (bool1 && bool2));
		
		//Logical OR
		System.out.println("bool1 || bool2 = " + (bool1 || bool2));
		
		//Logical NOT
		System.out.println("!(bool1 || bool2) = " + !(bool1 && bool2));
	}

}
