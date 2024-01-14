package com.functionallambdaexpressions;

import java.util.function.Predicate;

public class LambdaExpressionToCheckGivenStringIsEmpty {

	public static void main(String[] args) {

		//Lambda expression to check if a given string is empty
		Predicate isEmptyString = str -> ((String) str).isEmpty();
		
		//Test cases
		String s1 = "";
		String s2 = "Java Lambda Expressions!!";
		
		//Check if strings are empty using the lambda expression.
		System.out.println("String 1 is: " + s1);
		System.out.println("String 1 is empty: " + isEmptyString.test(s1));
		System.out.println("\n String 2 is: " + s2);
		System.out.println("String 2 is empty: " + isEmptyString.test(s2));
	}

}
