package com.in28Minutes.collections;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetNavigableRunner {

//	Treeset implements Navigable interface
//	it more features from that

	public static void main(String[] args) {
		Integer[] nums = { 765432, 65432, 5432, 432, 32 };

		// in order use Navigable featues you nees use Treeset in refer type
		// generally we use set = new TreeSet()
		TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(nums));
		System.out.println(numbers);

//		[32, 432, 5432, 65432, 765432]

		System.out.println(numbers.floor(5432)); // <=5432
		System.out.println(numbers.lower(5432)); // <5432

		System.out.println(numbers.ceiling(5432)); // >=5432
		System.out.println(numbers.higher(5432)); // >5432

		System.out.println(numbers.subSet(432, 65432)); // not inclusion of right num
		System.out.println(numbers.subSet(432, true, 65432, true));

		System.out.println("headSet: " + numbers.headSet(5432)); // all lower than number
		System.out.println("tailSet: " + numbers.tailSet(5432)); // all grater than number

	}

}
