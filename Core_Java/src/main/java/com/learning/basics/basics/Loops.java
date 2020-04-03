package com.learning.basics.basics;

public class Loops {

	public void table() {
		table(5);
//		for (int i = 1; i <= 10; i++) {
//			System.out.printf("%d * %d = %d", 5, i, 5 * i);
//			System.out.println();
//		}
	}

	public void table(int number) {
		table(number, 1, 10);
//		for (int i = 1; i <= 10; i++) {
//			System.out.printf("%d * %d = %d", number, i, number * i);
//			System.out.println();
//		}
	}

	public void table(int number, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d x %d = %d", number, i, number * i);
			System.out.println();
		}
	}

}
