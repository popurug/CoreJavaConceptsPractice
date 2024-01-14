package com.javadatatypes;

public class GetNextFloatingPointFloatDoubleNumber {

	public static void main(String[] args) {

		float fn = 0.2f;
		System.out.println("\n Initial floating number: " + fn);
		float nextDownfn = Math.nextDown(fn);
		float nextUpfn = Math.nextUp(fn);
		System.out.println("Float " + fn + " next down is " + nextDownfn);
		System.out.println("Float " + fn + " next up is " + nextUpfn);
		System.out.println("******************************");
		double dn = 0.2d;
		System.out.println("\n Initial double number: " + dn);
		double nextDowndn = Math.nextDown(dn);
		double nextUpdn = Math.nextUp(dn);
		System.out.println("Double " + dn + " next down is " + nextDowndn);
		System.out.println("DOuble " + dn + " next up is " + nextUpdn);
	}

}
