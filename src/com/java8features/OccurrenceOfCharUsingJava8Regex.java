package com.java8features;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class OccurrenceOfCharUsingJava8Regex {

	public static void main(String[] args) {

	//	String str = "Monopoly";
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String str = s1.next();
		
		Pattern.compile(".").matcher(str).results().map(m -> m.group().toUpperCase()).
		collect(Collectors.groupingBy(sum -> sum, LinkedHashMap::new, Collectors.counting())).
		forEach((k,v) -> System.out.println(k + " = " + v + " times "));
	}

}
