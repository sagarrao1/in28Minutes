package com.learning.conditionals;

public class TerneryOperatorRunner {

	public static void main(String[] args) {
		//Ternary operator
		// isEven = (condition ? ValueIfTrue : valueIfFalse);
		// can be used with any type not only with booelan
		// can be used with String , int
		// both values should be same type
		int i = 20;
		boolean isEven;
		isEven = ((i % 2 == 0) ? true : false);
		System.out.println(isEven);

		String isEvenString;
		isEvenString = ((i % 2 == 0) ? "YES" : "NO");
		System.out.println(isEvenString);
		
	}

}
