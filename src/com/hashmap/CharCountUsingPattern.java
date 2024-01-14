package com.hashmap;

import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CharCountUsingPattern {

	public static void main(String[] args) {

		String str = "Nishanth";
		Pattern.compile(".").matcher(str).results().map(m -> m.group().toLowerCase())
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()))
				.forEach((k, v) -> System.out.println(k + " = " + v + " times "));
	}

}
