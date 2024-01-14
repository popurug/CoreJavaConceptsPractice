package com.hexawareproblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamFilter {

	public static void main(String[] args) {

		List<String> lines = Arrays.asList("java", "c", "python", "dot net", "c++");

		List<String> result = lines.stream().filter(line -> !"c".equals(line) && !"python".equals(line))
				.collect(Collectors.toList());

	//	result.forEach(line -> System.out.println(line));
		
		result.forEach(System.out::println);
	}

}
