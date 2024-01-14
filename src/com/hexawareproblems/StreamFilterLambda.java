package com.hexawareproblems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterLambda {

	public static void main(String[] args) {

		//creating a stream
		Stream stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
		
		//Filtering only odd numbers
		List<Integer> oddNumbers =  (List<Integer>) stream.filter(n -> ((int)n) % 2 == 1).collect(Collectors.toList());
		
		//printing
		System.out.println("The odd numbers are: ");
		oddNumbers.forEach(value -> System.out.println(value));
	}

}
