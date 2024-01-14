package com.hexawareproblems;

public class ConcatTest {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer("Java");
		for(int i=0; i<10000; i++) {
			buffer.append("Tpoint");
		}
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
		
		startTime = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder("Java");
		for(int i=0; i<10000; i++) {
			builder.append("Tpoint");
		}
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime + "ms"));
	}

}
