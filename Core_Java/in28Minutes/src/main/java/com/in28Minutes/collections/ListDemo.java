package com.in28Minutes.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		 words.add("Apple");
		 words.add("Orangle");		 
		 words.add("Grape");
		 
		System.out.println(words.isEmpty());
		System.out.println(words.size());
		System.out.println(words.contains("Banana"));
		System.out.println(words.contains("Apple"));
		System.out.println(words.indexOf("Apple"));
		System.out.println(words.indexOf("ertt"));
		System.out.println(words);
		words.add("Mango");
		System.out.println(words);
		words.add(1, "Guva");
		System.out.println(words);

		List<String> list1 = new ArrayList<String>();
		list1.add("Tiger");
		list1.add("Lion");

		// adding list1 to words list
		words.addAll(list1);
		System.out.println(words);

		//change the element at particular position
		words.set(4, "Dog");
		System.out.println(words);

		words.remove(4);
		System.out.println(words);

		// if we have multiple elements with same
		// it will remove 1st occurance
		words.remove("Guva");
		System.out.println(words);

	}

}
