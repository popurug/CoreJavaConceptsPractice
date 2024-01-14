package com.java8features;

public class LambdaExpRetrunKeyword {

	public static void main(String[] args) {

		//Lambda expression without return keyword
		Addable1 a1 = (a,b) -> (a + b);
		System.out.println(a1.add(20, 40));
		
		//Lambda expression with return keyword
		Addable1 a2 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(a2.add(100, 800));
	}

}
