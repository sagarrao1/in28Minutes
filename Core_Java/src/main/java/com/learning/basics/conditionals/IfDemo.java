package com.learning.basics.conditionals;

public class IfDemo {

	public static void main(String[] args) {
		// condition will not ptint
		if (false) {
			System.out.println("will not print");
		}

		if (true) {
			System.out.println("will print");
		}

		int i = 3;

		if (i > 4) {
			System.out.println("will not print");
		}

		if (i >= 3) {
			System.out.println("will print");
		}
		System.out.println("============");
		if (i == 5) {
			System.out.println("i is 5");
		} else {
			System.out.println("i is not 5");
		}

	}

}
