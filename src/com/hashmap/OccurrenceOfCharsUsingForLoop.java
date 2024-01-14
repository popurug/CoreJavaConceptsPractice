package com.hashmap;

public class OccurrenceOfCharsUsingForLoop {
	static final int maxChar = 256;
	public static void getOccurringChar(String str) {
		int count[] = new int[maxChar];
		int len = str.length();
		//Initialize count array index
		for(int i=0; i<len; i++) 
			count[str.charAt(i)]++;
			//Create an array of given string size.
			char ch[] = new char[str.length()];
			for(int i=0; i<len; i++) {
				ch[i] = str.charAt(i);
				int find = 0;
				for(int j=0; j<=i; j++) {
					//If any matches found
					if(str.charAt(i) == ch[j])
						find++;
				}
				if(find == 1)
					//prints occurrence of the character
					System.out.println("The occurrence of " + str.charAt(i) + " is: " + count[str.charAt(i)]);
			}
			
		
	}
	

	public static void main(String[] args) {

		String str = "Nishanth";
		getOccurringChar(str);
	}
}
