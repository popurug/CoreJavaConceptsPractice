package com.java8features;

import java.util.Scanner;

@FunctionalInterface
public interface Drawable1 {
   public void draw();
   default void length() {
	   System.out.println("This method is to print length: ");
   }
   static void size() {
	   System.out.println("This method is used to print size: ");
   }
   static void mapping() {
	   int i, n = 10;
	   for(i = 0; i<=n; i++) {
		   System.out.println(i);
	   }
   }
   default void usingScanner() {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the first number: ");
	   int num1 = sc.nextInt();
	   System.out.println("Enter the second number: ");
	   int num2 = sc.nextInt();
	   int result = num1 + num2;
	   System.out.println("The addition of given numbers are: " + result);
   }
   default int methodParameters(int a, int b) {
	   int c = a + b;
	   System.out.println(c);
	return 0;
	   
   }
}
