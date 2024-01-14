package com.functionallambdaexpressions;

import java.util.function.Function;

public class ConvertIntegerToBinaryRepresentation {

	public static void main(String[] args) {

		int n = 33;
		System.out.println("The Number is: " + n);

		Function<Integer, String> convertToBinary = num -> Integer.toBinaryString(num);
		String binaryRepresentation = convertToBinary.apply(n);
		System.out.println("The binary representation is: " + binaryRepresentation);

		n = 747;
		System.out.println("The Number is: " + n);
		convertToBinary = num -> Integer.toBinaryString(num);
		binaryRepresentation = convertToBinary.apply(n);
		System.out.println("The binary representation is: " + binaryRepresentation);
	}

}
