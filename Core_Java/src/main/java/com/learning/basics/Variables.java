package com.learning.basics;

public class Variables {

	public static void main(String[] args) {
		// concatination
		System.out.println(1 + 2);
		System.out.println("1" + 2);
		System.out.println("1" + (2 + 3));
		System.out.println("ABC" + "DEF");
		int i = 5;
		System.out.println("value of i is " + i);
		i++;
		System.out.println("value of i is " + i);
		++i;
		System.out.println("value of i is " + i);

		i += 5;
		System.out.println("value of i is " + i);

		int number = 8;
		if (number % 2 == 0) {
			System.out.println("number is even");
		}
		number++;
		if (number % 2 == 0) {
			System.out.println("number is even");
		}

		int angle1 = 20, angle2 = 60, angle3 = 100;
		if (angle1 + angle2 + angle3 == 180) {
			System.out.println("valid triangle");
		}


	}

}
