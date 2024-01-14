package com.strings;

public class CheckingStringObjectsContainsSameData {

	public static void main(String[] args) {

		String c1 = "Gopinath Popuru";
		String c2 = "Nishanth Bandala";
		String c3 = "ManiRam Pulipati";
		
		//Are any of the above Strings equal to one another?
		boolean e1 = c1.equals(c2);
		boolean e2 = c1.equals(c3);
		
		//Display the results of the equality checks.
		System.out.println("\"" + c1 + "\" equals \"" + c2 + "\"? " + e1);
		System.out.println("\"" + c1 + "\" equals \"" + c3 + "\"? " + e2);
	}

}
