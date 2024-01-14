package com.functionallambdaexpressions;

public class LambdaExpressionToCountWordsInSentence {

	public static void main(String[] args) {

		String text = "Java lambda expression.";
		System.out.println("Original string: " + text);
		WordCounter wordCounter = s -> s.split("\\s").length;
		int ctr = wordCounter.countWords(text);
		System.out.println("Word count: " + ctr);
		text = "The quick brown fox jumps over the lazy dog.";
		System.out.println("\n Original string: " + text);
		wordCounter = s -> s.split("\\s+").length;
		ctr = wordCounter.countWords(text);
		System.out.println("Word count: " + ctr);
		
		text = "My name is Gopinath Popuru.";
		System.out.println("\n Original string: " + text);
		wordCounter = s -> s.split("\\s+").length;
		ctr = wordCounter.countWords(text);
		System.out.println("Word count: " + ctr);
		
	}

}

