package com.hexawareproblems;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterSqueres {

	public static void main(String[] args) {

		// creating a stream
		Stream stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

		// Custom predicate to check odd number
		Predicate oddPredicate = new Predicate() {

			@Override
			public boolean test(Object t) {
				if (((Integer)t) % 2 == 1) {
					return true;
				}
				return false;
			}

		};

		// filtering only odd numbers using custom predicate and generating square
		// numbers.
		List<Integer> oddNumbers = (List<Integer>) stream.filter(oddPredicate).map(value -> (int)value * (int)value).collect(Collectors.toList());

		// printing
		System.out.println("The odd numbers with it's squares are: ");
		oddNumbers.forEach(value -> System.out.println(value));
	}

}
