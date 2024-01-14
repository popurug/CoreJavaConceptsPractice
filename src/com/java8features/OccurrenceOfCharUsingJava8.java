package com.java8features;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OccurrenceOfCharUsingJava8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String str = sc.next();
		
		Map<String, Long> result = Arrays.stream(str.split("")).map(String::toLowerCase).
				collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
		System.out.println(result);
	}

}
