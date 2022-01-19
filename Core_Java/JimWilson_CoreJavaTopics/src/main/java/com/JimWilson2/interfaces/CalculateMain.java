package com.JimWilson2.interfaces;

import java.util.Scanner;

public class CalculateMain {
	
	public static void main(String[] args) {
		dynamicInteractivity();
	}

	private static void dynamicInteractivity() {
		MathProcessing[] mathArray= { new Adder(),
				new PowerOf(),
				new Multiply()};		
		
		DynamicHelper helper =new DynamicHelper(mathArray);
		
		System.out.println("Enter operation and two numbers");
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		
		helper.process(userInput);
		scanner.close();
	}

}
