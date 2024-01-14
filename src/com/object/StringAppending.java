package com.object;

public class StringAppending {

	/*
	 * public StringAppending(String string) {
	 * 
	 * }
	 */
	public static void main(String[] args) {
		/*
		 * StringBuilder sb1 = new StringBuilder("Welcome to my Java World ");
		 * System.out.println("Input: " + sb1);
		 * 
		 * //Appending the boolean value sb1.append(true); System.out.println("Output: "
		 * + sb1);
		 * 
		 * System.out.println();
		 * 
		 * StringBuilder sb2 = new StringBuilder("We fail- ");
		 * System.out.println("Output: " + sb2);
		 * 
		 * //Appending the boolean value sb2.append(false);
		 * System.out.println("Output: " + sb2);
		 */
		
		StringBuilder s1 = new StringBuilder("Welcome geeks!!");
		System.out.println(s1);
		
		//Here it appends the char argument as string to the StringBuilder
		s1.append('T');
		System.out.println("Result after" + " appending = " + s1);
		
		s1 = new StringBuilder("hello world- ");
		System.out.println(s1);
		
		//Here it appends the char argument as string to the StringBuilder
		s1.append("$#&");
		System.out.println("Result after appending = " + s1);
	}

	/*
	 * private void append(boolean b) {
	 * 
	 * }
	 */
}
