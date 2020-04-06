package com.in28Minutes.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsRunner3 {

	// check commented method 1st and check 2nd method
	// you will understand easily

//	static double sumOfNumberList(List<Integer> numbers) {
//		double sum = 0.0;
//		for (Integer integer : numbers) {
//			sum += integer.doubleValue();
//		}
//		return sum;
//	}

//	check commented method 1st and check this method
	// not only Integer , you are accepting all numbers using wildcard (?)
	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}

	static void addDoubleList(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1l);
	}

	public static void main(String[] args) {
//		System.out.println(sumOfNumberList(new ArrayList<Integer>(Arrays.asList(1, 3, 5, 6))));
//		System.out.println(sumOfNumberList(new ArrayList<Double>(Arrays.asList(1.0, 3.0, 5.0, 6.0))));
//		We can write in above way also

		System.out.println(sumOfNumberList(Arrays.asList(1, 3, 5, 6)));
		System.out.println(sumOfNumberList(Arrays.asList(1.0, 3.0, 5.0, 6.0)));
		System.out.println(sumOfNumberList(Arrays.asList(1l, 3l, 5l, 6l)));

		System.out.println("==================");
		List<Number> emptyList = new ArrayList<>();
		addDoubleList(emptyList);
		System.out.println(emptyList);
	}

}
