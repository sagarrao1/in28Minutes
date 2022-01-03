package com.in28Minutes.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner2 {
	// Hash set -- will not store in insert order
	// will not in sorting order
	// Retrieval is faster . it uses hash table internally to store
	// you cannot add element in position

	public static void main(String[] args) {
		Character[] values = { 'A', 'Z', 'A', 'K', 'C', 'H' };

//		 Hash Set - No inserting order
//					   No sorting order
//					No duplicates
		Set<Character> set1 = new HashSet<>(Arrays.asList(values));
		System.out.println("HashSet : " + set1);

//       LinkedHashSet -- insertion order maintained
//		                 - No sorting order
//						- No duplicates
		Set<Character> set2 = new LinkedHashSet<>(Arrays.asList(values));
		System.out.println("LinkedHashSet : " + set2);

//      TreeSet -- No insertion order 
//        	 	-	sorting order maintained
//				-	No duplicates
		Set<Character> set3 = new TreeSet<>(Arrays.asList(values));
		System.out.println("TreeSet : " + set3);

	}

}
