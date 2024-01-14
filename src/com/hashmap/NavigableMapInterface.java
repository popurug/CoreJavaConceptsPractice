package com.hashmap;

import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class NavigableMapInterface {

	public static void main(String[] args) {

		NavigableMap<Integer, String> map = new TreeMap<>();
		BiConsumer<Integer, String> consumer = map::putIfAbsent;
		consumer.accept(1, null);
		consumer.accept(2, "two");
		consumer.accept(1, "one");
		consumer.accept(2, "two");
		System.out.println(map);
	}

}
