package com.hexawareproblems;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterPredicate {

	//@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// creating a stream
		Stream stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

		// Custom predicate to check odd number
	//	@SuppressWarnings("rawtypes")
		Predicate oddPredicate = new Predicate() {

		//	@Override
			public boolean test(Object t) {
				if (((Integer)t) % 2 == 1) {
					return true;
				}
				return false;
			}

			/*
			 * @Override public boolean test(Object arg0) { // TODO Auto-generated method
			 * stub return false; }
			 */
		};

		// filtering only odd numbers using custom predicate
		List oddNumbers = (List) stream.filter(oddPredicate).collect(Collectors.toList());

		// printing
		oddNumbers.forEach(value -> System.out.println(value));
	}

}
