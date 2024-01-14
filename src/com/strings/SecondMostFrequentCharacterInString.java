package com.strings;

public class SecondMostFrequentCharacterInString {
	static final int NoOfChars = 256;
	static char getSecondMostFrequency(String str1) {
		int[] ct = new int[NoOfChars];
		int i;
		for(i=0; i<str1.length(); i++)
			(ct[str1.charAt(i)])++;
		int ct_first = 0, ct_second = 0;
		for(i = 0; i < NoOfChars; i++) {
			if(ct[i] > ct[ct_first]) {
				ct_second = ct_first;
				ct_first = i;
			}else if(ct[i] > ct[ct_second] && ct[i] != ct[ct_first])
				ct_second = i;
		}
		return (char)ct_second;
	}

	public static void main(String[] args) {

		String str1 = "nishanth";
		System.out.println("The given string is: " + str1);
		char res = getSecondMostFrequency(str1);
		if(res != '\0')
			System.out.println("The second most frequent char in the string is: " + res);
		else
			System.out.println("No second most frequent character found in the string.");
	}

}
