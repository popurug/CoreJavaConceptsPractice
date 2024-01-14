package com.object;

public class ReverseStr {

	public static void main(String[] args) {
	//	System.out.println("Dog");
		String r = reverse("My name is Gopinath Popuru");
		System.out.println(r);
	}
	
	public static String reverse(String s) {
		char[] letters = new char[s.length()];
		
		int letterIndex = 0;
		for(int i=s.length()-1; i>=0; i--) {
		//	System.out.println(s.charAt(i));
			letters[letterIndex] = s.charAt(i);
			letterIndex++;
		}
		
		String reverse = "";
		for(int i=0; i<s.length(); i++) {
			reverse = reverse + letters[i];
		}
		
		return reverse;
	}
}
