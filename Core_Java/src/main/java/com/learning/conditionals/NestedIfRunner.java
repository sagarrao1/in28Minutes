package com.learning.conditionals;

public class NestedIfRunner {

	public static void main(String[] args) {
		// Nested of If else. only one block will be executed.
		// i =25,24,26
		int i = 26;

		if (i == 25) {
			System.out.println("i = 25");
		} else if (i == 24) {
			System.out.println("i = 24");
		} else {
			System.out.println("i != 25 && i != 24");
		}

	}

}
