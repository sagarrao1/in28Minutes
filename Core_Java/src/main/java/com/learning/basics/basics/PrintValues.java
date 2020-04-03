package com.learning.basics.basics;


public class PrintValues {

	public static void main(String[] args) {
		System.out.println("24* 60* 60");
		System.out.println(24 * 60 * 60);

		System.out.printf("seconds in day are 24* 60* 60 = %d", (24 * 60 * 60));
		System.out.println();
		System.out.println("Hello \n world");
		System.out.println("Hello \\\\ world");

		System.out.println(Math.random());
		System.out.println("Min: " + Math.min(23, 45));
		System.out.println("Max: " + Math.max(23, 45));

		System.out.printf("\n5 * 2= 10");
		System.out.printf("\n%d * %d= %d", 5, 3, 5 * 3).println();
		// ignore 4 value
		System.out.printf("\n%d * %d= %d", 1, 2, 3, 4).println();

		// print string
		System.out.printf("print %s ", "Testing").println();

		// print float
		System.out.printf("\n%f + %f= %f", 5.3, 6.7, (5.3 + 6.7)).println();

	}

}
