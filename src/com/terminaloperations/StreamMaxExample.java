package com.terminaloperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamMaxExample {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();
		strList.add("one");
		strList.add("two");
		strList.add("three");
		strList.add("four");
		
		Stream<String> stream = strList.stream();
		
		Optional<String> max = stream.max((v1, v2) -> {
			return v1.compareTo(v2);
		});
		
		String maxString = max.get();
		System.out.println("The maximum element in the given list is: " + maxString);
	}

}
