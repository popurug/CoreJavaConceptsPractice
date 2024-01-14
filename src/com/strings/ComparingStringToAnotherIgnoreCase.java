package com.strings;

public class ComparingStringToAnotherIgnoreCase {

	public static void main(String[] args) {

		String c1 = "Gopinath Popuru";
		String c2 = "Aharnish Namburu";
		String c3 = "gopinath popuru";
		
		//Test any of the above Strings equals to one another
		boolean e1 = c1.equalsIgnoreCase(c2);
		boolean e2 = c1.equalsIgnoreCase(c3);
		
		//Display the results of the equality checks
		System.out.println(c1 + " equals " + c2 + "\"? " + e1);
		System.out.println(c1 + " equals " + c3 + "\"? " + e2);
	}

}
