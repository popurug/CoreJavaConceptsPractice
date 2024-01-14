package com.object;

import java.util.Scanner;

public class ConcatenateString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String firstStr = s.next();
		
		System.out.println("Enter the second string: ");
		String secondStr = s.next();
		
		System.out.println("Enter the third string: ");
		String thirdStr = s.next();
		
		System.out.println("Result after concatenation: ");
		System.out.println(firstStr+ " " + secondStr+ " " + thirdStr);
		
		s.close();
	}
}
