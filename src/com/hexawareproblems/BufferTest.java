package com.hexawareproblems;

public class BufferTest {

	public static void main(String[] args) {

	/*	StringBuffer buffer = new StringBuffer("Hello");
		buffer.append(" " + "Welcome to my first java program!!");
		System.out.println(buffer); */
		
		StringBuilder builder = new StringBuilder("Hello,");
		builder.append(" " + "Welcome to my Java learning center: ");
		System.out.println(builder);
	}

}
