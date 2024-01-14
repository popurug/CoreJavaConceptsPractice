package com.bayoneproblems;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class BalanceUnbalancedUsingDeque {

	public static void main(String[] args) {

		String inputStr;

		// create an empty deque using LinkedList
		Deque<Character> deque = new LinkedList<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an expression to check whether it is balanced or not:\n");
		inputStr = sc.nextLine();
		sc.close();

		// Iterate input string using for loop
		for (char ch : inputStr.toCharArray()) {
			// add element to deque if ch = '{', ch = '[', ch = '('
			if (ch == '{' || ch == '[' || ch == '(') {
				deque.add(ch);
			} else {
				// If deque is not empty
				if (!deque.isEmpty()) {
					if ((deque.peekFirst() == '{' && ch == '}') || (deque.peekFirst() == '[' && ch == ']')
							|| (deque.peekFirst() == '(' && ch == ')')) {
						deque.removeFirst();
					} else {
						System.out.println("\n Unbalanced Parentheses!@.");
						return;
					}
				}
			}

		}
		System.out.println("\n Balanced Parentheses.");
	}

}
