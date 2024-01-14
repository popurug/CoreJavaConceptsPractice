package com.hexawareproblems;

import java.util.Scanner;

public class StringFuncLambdaTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringFunc reverse = (string) -> {
			String result = "";
			for(int i = string.length()-1; i >= 0; i--)
				result += string.charAt(i);
			return result;
		};
		System.out.println("Lambda reversed is: " + reverse.func("Lambda Expression"));
		
		System.out.println("Enter a word to reverse a String: ");
		String word = sc.nextLine();
		System.out.println(word + " in reversed form - " + reverse.func(word));
	}

}
