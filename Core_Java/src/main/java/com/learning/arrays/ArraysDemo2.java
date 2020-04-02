package com.learning.arrays;

import java.util.Arrays;

public class ArraysDemo2 {

	public static void main(String[] args) {
		// arrays are used to group similar type of elements

		int[] marks1 = { 1, 20, 50, 34 };
		int[] marks2 = { 1, 20 };
		int[] marks3 = { 1, 20, 50, 34, 78 };
		int[] marks4 = { 1, 20 };

		int[] marks = new int[5];
		System.out.println(Arrays.toString(marks)); // [0,0,0,0,0]
		// fill
		Arrays.fill(marks, 85);
		System.out.println(Arrays.toString(marks)); // [85,85,85,85,85]

		// sort
		System.out.println(Arrays.toString(marks1)); // [1,20,50,34]
		Arrays.sort(marks1);
		System.out.println(Arrays.toString(marks1)); // sorted [1,20,34,50]

		// compare
		System.out.println("equals :" + Arrays.equals(marks2, marks4));

	}

}
