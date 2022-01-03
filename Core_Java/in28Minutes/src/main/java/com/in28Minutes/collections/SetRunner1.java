package com.in28Minutes.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner1 {
	// Hash set -- will not store in insert order
	// will not in sorting order
	// Retrieval is faster . it uses hash table internally to store
	// you cannot add element in position

	public static void main(String[] args) {
		String[] values = {"Apple","Orange","Grape"};
		Set<String> set = new HashSet<>(Arrays.asList(values));
//		Collections.addAll(set, values);  // another to pass array to collection
		System.out.println(set);		
		System.out.println("set.add(\"Apple\") : " + set.add("Apple"));

//		 Hash Set - No inserting order
//					   No sorting order
//					No duplicates

		Integer[] numbers = { 765432, 65432, 5432, 432, 32 };
		Set<Integer> set1 = new HashSet<>(Arrays.asList(numbers));
		System.out.println("HashSet : " + set1);

//       LinkedHashSet -- insertion order maintained
//		                 - No sorting order
//		No duplicates
		Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(numbers));
		System.out.println("LinkedHashSet : " + set2);

//      TreeSet -- No insertion order 
//        - 		sorting order maintained
//		No duplicates
		Set<Integer> set3 = new TreeSet<>(Arrays.asList(numbers));
		System.out.println("TreeSet : " + set3);

	}

}
