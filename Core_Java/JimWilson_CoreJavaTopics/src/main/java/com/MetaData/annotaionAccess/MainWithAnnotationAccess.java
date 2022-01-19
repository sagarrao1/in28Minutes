package com.MetaData.annotaionAccess;

import java.util.Scanner;

public class MainWithAnnotationAccess {

	public static void main(String[] args) {
		 	System.out.println("Enter an operation and two numbers:");
	        Scanner scanner = new Scanner(System.in);
	        String userInput = scanner.nextLine();

	        String[] parts = userInput.split(" ");
	        String keyword = parts[0];
	        double leftVal = valueFromWord(parts[1]);
	        double rightVal = valueFromWord(parts[2]);

	        process(keyword, leftVal, rightVal);
	        scanner.close();
	}

	private static void process(String keyword, double leftVal, double rightVal) {
		Calculator processer = retrieveCalculator(keyword);
		double result = processer.doCalculation(leftVal, rightVal);
		System.out.println("result : "+result);
		
	}
	
	private static Calculator retrieveCalculator(String keyword) {
//		1st way
		
//		switch (keyword) {
//		case "add":
//			return new Adder();
//		case "multiply":
//			return new Multiply();
//		case "devide":
//			return new Devider();
//		case "subtract":
//			return new Subtractor();
//		case "power":
//			return new PowerOf();
//		}		
		
//	2nd way same with annotations
		
		Calculator[] processers = {new Adder(), new Multiply(), new PowerOf(), new Subtractor(), new Devider()};
		
		for (Calculator processer : processers) {
			CommandKeyword commandKeyword = processer.getClass().getAnnotation(CommandKeyword.class);
			String name =commandKeyword.name();
			
			if (keyword.equalsIgnoreCase(name)) {
				return processer;
			}
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
