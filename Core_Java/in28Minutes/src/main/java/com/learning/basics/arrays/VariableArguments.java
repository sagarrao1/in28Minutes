package com.learning.basics.arrays;

import java.util.Arrays;

//varaible length of arguments int... values
// uses array internally to pass values from method
// restriction is this var argument should be last parameter to work
public class VariableArguments {

	int[] values;

	public static void main(String[] args) {
//		VariableArguments v = new VariableArguments();
		int result = sum(1, 2, 3);
		System.out.println("result :" + result);

		result = sum(1, 2, 3, 4, 5);
		System.out.println("result :" + result);

		result = sum(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println("result :" + result);

	}

	// syntax for variable argument is int... values(name of array)
	public static int sum(int... values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		System.out.println(Arrays.toString(values));
		return sum;
	}

}
