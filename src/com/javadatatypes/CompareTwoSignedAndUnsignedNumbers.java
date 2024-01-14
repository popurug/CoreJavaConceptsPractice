package com.javadatatypes;

public class CompareTwoSignedAndUnsignedNumbers {

	public static void main(String[] args) {

		int n1 = Integer.MIN_VALUE;
		int n2 = Integer.MAX_VALUE;
		System.out.println("Signed integers are: " + n1 + ", " + n2);
		System.out.println("-----------------------------------");
		int compareSignedNum = Integer.compare(n1, n2);
		System.out.println("Result of comparing signed numbers: " + compareSignedNum);
		int compareUnsignedNum = Integer.compareUnsigned(n1, n2);
		System.out.println("Result of comparing unsigned numbers: " + compareUnsignedNum);
	}

}
