package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FindOccurrenceOfEachWordInString {

	public static void main(String[] args) {
		

		String str = "My name is Gopinath and My friend name is Nishanth";
		Map<String, Integer> wordCounts = new HashMap<>();
		for(String word : str.split(" ")) {
			if(wordCounts.containsKey(word)) {
				
				wordCounts.put(word, wordCounts.get(word) + 1);
			}else{
				wordCounts.put(word, 1);
			}
		}
		System.out.println("Word occurrences: ");
		for(Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
