package com.hexawareproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Java8StreamLimit {

	public static void main(String[] args) {

		List<String> stringList = new ArrayList<>();
		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("four");
		stringList.add("two");
		stringList.add("three");

		Stream<String> stream = stringList.stream();

		stream.limit(1).forEach(element -> System.out.println(element));
	}

}
