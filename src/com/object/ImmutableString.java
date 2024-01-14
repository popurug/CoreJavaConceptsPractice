package com.object;

public class ImmutableString {

	public static void main(String[] args) {
		String s1 = "Edureka"; //"Java" string created in pool and reference assigned to s1
		
		String s2 = s1; //s2 is also having the same reference to "Java" in the pool
		
		System.out.println(s1 == s2); //proof that s1 and s2 have same reference
		
		s1 = "Learning";
		//s1 value got changed above, so how String is immutable?
		
		//well, in above case a new String "" got created in the pool
		//s1 is now referring to the new String in the pool
		//BUT, the original String "Java" is still unchanged and remains in the pool
		
		//Proof that s1 and s2 have different reference
		System.out.println(s1 == s2);
		
		System.out.println(s2);
		//prints "Java" supporting the fact that original String value is unchanged, hence string is immutable.
	}
}
