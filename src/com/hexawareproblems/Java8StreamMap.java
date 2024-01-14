package com.hexawareproblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamMap {

	public static void main(String[] args) {

		List<String> listOfStrings = Arrays.asList("Gopi", "Siva", "Nishanth", "ManiRam", "Badri", "Purna");

		List<String> listOfIntegers = listOfStrings.stream().map(String::valueOf).collect(Collectors.toList());

		System.out.println(listOfIntegers);
	}

}
