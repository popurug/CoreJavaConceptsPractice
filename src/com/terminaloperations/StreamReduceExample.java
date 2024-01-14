package com.terminaloperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamReduceExample {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();
		strList.add("one");
		strList.add("two");
		strList.add("three");
		strList.add("four");
		
		Stream<String> stream = strList.stream();
		
		Optional<String> reduced = stream.reduce((value, combinedValue) -> {
			return combinedValue + " + " + value;
		});
		
		System.out.println("The reduce() method result is: " + reduced.get());
	}

}
