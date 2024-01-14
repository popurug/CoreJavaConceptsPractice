package com.java8features;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceofCharacters {

	public static void main(String[] args) {

		 String s = "This program is to print occurances of each character";
	        Map<String, Long> countChars = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	        
	        System.out.println(countChars);
	}

}
