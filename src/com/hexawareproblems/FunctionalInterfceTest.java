package com.hexawareproblems;


@FunctionalInterface
public interface FunctionalInterfceTest {
	public abstract boolean execute();
	//public abstract boolean execute2();
	default void test() {
		System.out.println("This method is used for testing: ");
	}

}
