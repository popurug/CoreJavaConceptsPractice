package com.hexawareproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamDistinct {

	public static void main(String[] args) {

		List<String> stringList = new ArrayList<>();
		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("four");
		stringList.add("one");
		stringList.add("three");

		Stream<String> stream = stringList.stream();

		List<String> distinctStrings = stream.distinct().collect(Collectors.toList());

		System.out.println(distinctStrings);
	}

}
