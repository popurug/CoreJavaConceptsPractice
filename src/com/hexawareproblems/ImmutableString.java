package com.hexawareproblems;

public class ImmutableString {

	public static void main(String[] args) {

	//	String s = "Sachin";
	//	s.concat("Tendulkar");  //contact() method appends the string at the end
	//	System.out.println(s);  //will print Sachin because strings are immutable objects 
		
	/*	String s1 = "Gopinath";
		String s2 = "Popuru";
		String res = s1.concat(" " + s2);
		System.out.println(res); */
		
		String s = "Sachin";
		  s = s.concat("Tendulkar");
		 System.out.println(" " + s);
	}

}
