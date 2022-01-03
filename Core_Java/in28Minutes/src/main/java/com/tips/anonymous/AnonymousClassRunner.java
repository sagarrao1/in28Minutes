package com.tips.anonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CustomAnimalLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o1.length(), o2.length());
	}
	
}

public class AnonymousClassRunner {

	public static void main(String[] args) {
		List<String> animalsList =  Arrays.asList("Tortoise","Cat","Bat","Elephant","Rat");
		/* by default Arrays are immutable, we take arraylist and use sort
		 * ArrayLit is mutable*/

//		only List.of is available in java 9
//		List<String> animals =  new ArrayList<String>(List.of("Ant","Cat","Bat","Elephant"));
		
		List<String> animals =  new ArrayList<String>(animalsList);
		Collections.sort(animals);
		System.out.println(animals);
		
		
		System.out.println("====================");
		
//		Let's if we want to sort in custom order using lenth of string
//		then you new comparator class
//		Collections.sort(animals, new CustomAnimalLengthComparator());
//		System.out.println(animals);
		
		System.out.println("====================");
//		same can be done without creating new class using anonymous class				
		Collections.sort(animals, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		} );
		
		System.out.println(animals);
		
//   same thig we refactor and extract it to local and use it like below
//		here also we are just creating ref to anonymous class
//		Comparator<String> lengthComparator = new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return Integer.compare(o1.length(), o2.length());
//			}
//		};
		
//		Collections.sort(animals, lengthComparator);
		
//		System.out.println(animals);


	}

}
