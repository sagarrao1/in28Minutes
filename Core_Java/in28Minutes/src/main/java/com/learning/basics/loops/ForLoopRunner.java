package com.learning.basics.loops;

public class ForLoopRunner {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < 10; i = i + 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 1; i < 10; i = i + 2) {
			System.out.print(i + " ");
		}
		int i = 3;
		System.out.println();
		for (; i < 10;) {
			System.out.print(i + " ");
			i++;
		}

	}

}
