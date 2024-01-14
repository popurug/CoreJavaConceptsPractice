package com.lambda;

@FunctionalInterface
interface Statement{
	public String greet();
}
public class LambdaProgram {

	public static void main(String[] args) {
		Statement s = () -> {
			return "Hello world. Welcome to my Java World.";
		};
		System.out.println(s.greet());
	}
}
