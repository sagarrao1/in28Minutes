package com.in28Minutes.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// 3 ways to iterate
		List<String> words = new ArrayList<>();
		words.add("Apple");
		words.add("Orangle");
		words.add("Grape");
//		1

		for (int i = 0; i < words.size(); i++) {
			System.out.print(words.get(i) + " ");
		}
		System.out.println();
		
//		2
		for (String word : words) {
			System.out.print(word + " ");
		}
		System.out.println();
		
//		3
		Iterator<String> wordsIterator= words.iterator();
		while(wordsIterator.hasNext()) {
			System.out.print(wordsIterator.next() + " ");
		}
		System.out.println();
		System.out.println("===================");

//		when you want to find element ending with pe use foreach

		for (String word : words) {
			if (word.endsWith("pe")) {
				System.out.println(word);
			}
		}

//		will get java.util.ConcurrentModificationException
//		We cannot use foreach if we want remove element while iterating, 
//		need to use iterator in this case

//		for (String word : words) {
//			if (word.endsWith("pe")) {
//				words.remove(word);
//			}
//		}
		System.out.println("*************");
		Iterator<String> iterator = words.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().endsWith("pe")) {
				iterator.remove();
			}
		}

		System.out.println(words);


	}

}
