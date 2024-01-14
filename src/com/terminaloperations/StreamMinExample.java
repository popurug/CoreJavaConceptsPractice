package com.terminaloperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamMinExample {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();
		strList.add("one");
		strList.add("two");
		strList.add("three");
		strList.add("one");
		
		Stream<String> stm = strList.stream();
		
		Optional<String> min = stm.min((v1, v2) -> {
			return v1.compareTo(v2);
		});
		
		String minString = min.get();
		System.out.println("The minimum element in the given list is: " + minString);
	}

}
