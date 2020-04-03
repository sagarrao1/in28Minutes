package com.learning.basics.conditionals;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		System.out.print("Enter number 1 :");
//		Obj obj = new OBj(arguments);
		Scanner scanner= new Scanner(System.in);
		int number1 = scanner.nextInt();
		System.out.println("Entered number1 is : " + number1);

		System.out.print("Enter number 2 :");
		int number2 = scanner.nextInt();
		System.out.println("Entered number2 is : " + number2);

		System.out.println("1. add :");
		System.out.println("2. Subtract:");
		System.out.println("3. Multiply :");
		System.out.println("4. divide :");
		System.out.println("================");
		System.out.println("Enter your choice :");

		int choice = scanner.nextInt();
		System.out.println("your choice is :" + choice);

		performOperationUsingSwitch(number1, number2, choice);

		scanner.close();
	}

	private static void performOperationUsingSwitch(int number1, int number2, int choice) {
		int sum = 0;
		switch (choice) {
		case 1:
			sum = number1 + number2;
			break;
		case 2:
			sum = number1 - number2;
			break;
		case 3:
			sum = number1 * number2;
			break;
		case 4:
			sum = number1 / number2;
			break;
		default:
			System.out.println("Wrong choice");
			break;
		}

		System.out.println("Total is : " + sum);
	}


	private static void performOperationUsingNestedIfElese(int number1, int number2, int choice) {
		int sum = 0;
		if (choice == 1) {
			sum = number1 + number2;
		} else if (choice == 2) {
			sum = number1 - number2;
		} else if (choice == 3) {
			sum = number1 * number2;
		} else if (choice == 4) {
			sum = number1 / number2;
		} else {
			System.out.println("Wrong choice");
		}

		System.out.println("Total is : " + sum);
	}

}
