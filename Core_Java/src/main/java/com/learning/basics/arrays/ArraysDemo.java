package com.learning.basics.arrays;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// arrays are used to group similar type of elements
		int[] marks = { 1, 20, 50, 34 };

//		for (int i : marks) {
//			System.out.print(i + ",");
//		}

//		We can also arrays class static toString method to print elements
		System.out.println(Arrays.toString(marks));
		System.out.println();
		// another way to create array
		int[] marks1 = new int[5];
		for (int i : marks1) {
			System.out.print(i + ",");
		}
		System.out.println();
		System.out.println("marks[0] :" + marks[0]);

		for (int i = 0; i < 5; i++) {
			marks1[i] = i + 1;
		}
		System.out.println("==================");
		for (int i : marks1) {
			System.out.print(i + ",");
		}
		System.out.println();
		// marks1.length is not method. it is property
		System.out.println("marks1.length :" + marks1.length);

		// default intialization of double is 0.0
//		default intialization of int is 0
//		default intialization of boolean  is false
//		default intialization of object is null
		double[] marks2 = new double[5];
		for (double i : marks2) {
			System.out.print(i + ",");
		}
		System.out.println();

//		default intialization of object is null		
		System.out.println("*** Array of person Objects with null pointer ***");
		Person[] persons = new Person[5];
		for (Person person : persons) {
			System.out.print(person + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(persons));
	}

}
