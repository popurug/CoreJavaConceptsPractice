package com.hexawareproblems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterCubic {

	public static void main(String[] args) {

		// creating a stream
		Stream stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

		// filtering only odd numbers using custom predicate and generating cubic
		// numbers
		List<Integer> oddNumbers = (List<Integer>) stream.filter(n -> (int) n % 2 == 1)
				.map(value -> (int) value * (int) value * (int) value).collect(Collectors.toList());

		// printing
		System.out.println("The odd numbers with it's cubic values are: ");
		oddNumbers.forEach(value -> System.out.println(value));
	}

}
