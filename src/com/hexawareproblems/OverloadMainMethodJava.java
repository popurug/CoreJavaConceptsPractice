package com.hexawareproblems;

public class OverloadMainMethodJava {
	public static void main(int a) {
		System.out.println(a);
	}
	
	public static void main(double b) {
		System.out.println(b);
	}
	
	public static void main(float c) {
		System.out.println(c);
	}
	
	public static void main(boolean d) {
		System.out.println(d);
	}
	
	public static void main(char e) {
		System.out.println(e);
	}
	
	public static void main(long f) {
		System.out.println(f);
	}

	public static void main(String[] args) {
        System.out.println("main() method invoked");
        main(10);
        main(20.54);
        main(70.645f);
        main(true);
        main('G');
        main(884L);
	}

}
