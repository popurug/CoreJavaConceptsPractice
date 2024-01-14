package com.bayoneproblems;

public class FibanacciSeries {

	public static void main(String[] args) {

		int n1 = 0, n2 = 1, n3, i, count = 20;
		for (i = 2; i < count; i++) {
		//	System.out.println(i);
			n3 = n1 + n2;
			System.out.print(", " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

}
