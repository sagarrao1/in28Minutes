package com.learning.basics.arrays;

import java.util.Arrays;

public class ArrayObject {

	public static void main(String[] args) {
		Person[] persons = new Person[5];
		System.out.println("persons : " + Arrays.toString(persons));

		// assinging persons[1] to Person object
		persons[1] = new Person();
		System.out.println("persons : " + Arrays.toString(persons));

//		another way of creating person object
//		creating 2 persons
		Person[] students = { new Person(), new Person() };
		System.out.println("students : " + Arrays.toString(students));

		// with strings we can do same thing
		// create array of strings. with string we do not need even new
		String[] textValues = { "Apple", "Ball", "Cat" };
		System.out.println("textValues : " + Arrays.toString(textValues));

	}

}
