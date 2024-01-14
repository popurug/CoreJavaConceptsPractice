package com.javamethods;

public class PrintCharactersBetweenTwoCharacters {

	public static void printChars(char ch1, char ch2, int n) {
		for (int c = 1; ch1 <= ch2; c++, ch1++) {
			System.out.print(ch1 + " ");
			if (c % n == 0)
				System.out.println();
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {

		printChars('a', 'z', 6);

	}

}
