package com.practice;

public class BooleanEqualsExample1 {

	public static void main(String args[]) {
	Boolean b1 = new Boolean(true);
	Boolean b2 = new Boolean(false);
	
	//method will give the result of equals method on b1,b2 to b3.
	if(b1.equals(b2)) {
		System.out.println("equals() method returns true");
	}
	else {
		System.out.println("equals() method returns false");
	}
}
}
