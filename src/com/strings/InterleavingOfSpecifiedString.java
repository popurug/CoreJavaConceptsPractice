package com.strings;

public class InterleavingOfSpecifiedString {
	private static boolean checkInterleaved(String s1, String s2, String CheckInString) {
		int i = 0, j = 0, k = 0;
		if (s1.length() + s2.length() != CheckInString.length()) {
			return false;
		}
		while (k < CheckInString.length()) {
			if (i < s1.length() && s1.charAt(i) == CheckInString.charAt(k)) {
				i++;
			} else if (j < s2.length() && s2.charAt(j) == CheckInString.charAt(k)) {
				j++;
			} else {
				return false;
			}
			k++;
		}

		if (!(i == s1.length() && j == s2.length() && k == CheckInString.length())) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

		String s1 = "MNO";
		String s2 = "PQ";
		String s3 = "PMQNO";
		System.out.println("The given string is: " + s3);
		System.out.println("The interleaving strings are " + s1 + " and " + s2);
		System.out.println("The given string is interleaving: " + checkInterleaved(s1, s2, s3));
	}

}
