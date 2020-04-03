package com.learning.basics.loops;

import java.util.Scanner;

public class DoWhileRepeatQuestionRunner {

	public static void main(String[] args) {
		int number = -1;
		Scanner scanner = new Scanner(System.in);
		
		do {
			if (number != -1) {
			System.out.println("Cube is :" + (number * number * number));
			}
		System.out.println("Enter a number :");
			number = scanner.nextInt();
		} while (number > 0);
		System.out.println("thank you have fun! :");

		scanner.close();
	}

}
