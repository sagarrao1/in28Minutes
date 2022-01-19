package com.MetaData.annotaionAccess;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 	System.out.println("Enter an operation and two numbers:");
	        Scanner scanner = new Scanner(System.in);
	        String userInput = scanner.nextLine();

	        String[] parts = userInput.split(" ");
	        String keyword = parts[0];
	        double leftVal = valueFromWord(parts[1]);
	        double rightVal = valueFromWord(parts[2]);

	        process(keyword, leftVal, rightVal);
	}

	private static void process(String keyword, double leftVal, double rightVal) {
		Calculator processer = retrieveCalculator(keyword);
		double result = processer.doCalculation(leftVal, rightVal);
		System.out.println("result : "+result);
		
	}
	
	private static Calculator retrieveCalculator(String keyword) {
		switch (keyword) {
		case "add":
			return new Adder();
		case "multiply":
			return new Multiply();
		case "devide":
			return new Devider();
		case "subtract":
			return new Subtractor();
		case "power":
			return new PowerOf();
		}		
		
		return null;
	}

	private static double valueFromWord(String word) {
		String[] numberWords = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
		
		double value=-1d;
		for (int index = 0; index < numberWords.length; index++) {
			if (word.equalsIgnoreCase(numberWords[index])) {
				value= index;
			}
		}
		
		if (value == -1d) {
			value = Double.parseDouble(word);
		}
		
		return value;
	}

}
