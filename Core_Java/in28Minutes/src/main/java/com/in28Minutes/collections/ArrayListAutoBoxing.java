package com.in28Minutes.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAutoBoxing {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(101);
		numbers.add(102);
		numbers.add(301);
		numbers.add(402);
		System.out.println(numbers);
		System.out.println(numbers.indexOf(101));

//		will give indexOutOfBound expection because
//		it tries to search index 101 to remove
//		numbers.remove(101);
//		System.out.println(numbers);

//		Correct way
		numbers.remove(Integer.valueOf(101));
		numbers.remove(new Integer(301));
		System.out.println(numbers);

	}

}
