package com.practice;

public class FibonacciSeries {
private void sysout() {
	// TODO Auto-generated method stub

}
	public static void main(String args[]) {
		int n1=0, n2=1, n3, i, count=20;
		
		System.out.print(n1+" "+n2); //printing 0 and 1
		
		for(i=2; i<count; i++) {
			n3 = n1+n2;
			
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
		System.out.println("This is the example for fibonacci series");
		
		System.out.println("*************");
	}
	
}
