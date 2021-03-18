package com.in28minutes.innerclasses;

import java.util.Arrays;
import java.util.Comparator;

class Animal {
	void bark() {
		System.out.println("Animal Bark");
	}
};

public class AnonymousClass {

	private static String[] reverseSort(String[] array) {
		Comparator<String> reverseComparator = new Comparator<String>() {
			/* Anonymous Class */
			public int compare(String string1, String string2) {
				return string2.compareTo(string1);
			}

		};

		Arrays.sort(array, reverseComparator);

		return array;
	}

	public static void main(String[] args) {

		String[] array = { "Apple", "Cat", "Boy" };

		// New way to print values from array
		System.out.println(Arrays.toString(reverseSort(array)));// [Cat, Boy,Apple]
		
		// Old way of print values from array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		/* Second Anonymous Class - SubClass of Animal */
		Animal animal = new Animal() {
			void bark() {
				System.out.println("Subclass bark");
			}
		};

		animal.bark();// Subclass bark

	}

}
