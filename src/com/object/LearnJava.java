package com.object;

public class LearnJava {
 
	public static void main(String[] args) {
		addExaclamationPoint("Gopinath Popuru");
	    LearnJava lj = new LearnJava();
	    lj.multiplyNumbers(6, 5);
	    lj.concatStrings("Nishanth", "Bandala");
	    lj.substractNumbers(20, 30);
	    lj.divideNumbers(2, 30);
	}
	
	public static void addExaclamationPoint(String s) {
		System.out.println(s + "!!!!!$$$$");
		
		addIntegers(10, 20, 50);
	
	}
	
	public static void addIntegers(int a, int b, int c) {
		Object sum;
		sum = a + b + c;
		System.out.println("The addition of three numbers is: " + sum);
	}
	
	public int multiplyNumbers(int num1, int num2) {
		int mul;
		mul = num1 * num2;
		System.out.println("The multiplication of given numbers is: " + mul);
		return mul;
	}
	
	public String concatStrings(String s1, String s2) {
		s1 = "Nishanth";
		s2 = "Bandala";
		String s3 = s1.concat(s2);
		System.out.println("The concatnation of strings are: " + s3);
		return s3;
	}
	
	public double substractNumbers(int n1, int n2) {
		double sub;
		sub = n2 - n1;
		System.out.println("The substraction of given numbers is: " + sub);
		return sub;
	}
	
	public float divideNumbers(float n1, float n2) {
		float divide;
		divide = n2/n1;
		System.out.println("The division of given numbers is: " + divide);
		return divide;
	}
}
