package com.lambda;

import java.util.function.Predicate;

public class Validator {

/*	private static  boolean validator(String data, Predicate<String> predicate) {
		return predicate.test(data);
	} */

	public boolean isDataValid(String city, Predicate<String> predicate) {
	//	String data = "newyork";
		return predicate.test(city);
	}
}
