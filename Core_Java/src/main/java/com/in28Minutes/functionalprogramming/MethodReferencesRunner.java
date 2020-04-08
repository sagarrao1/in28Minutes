package com.in28Minutes.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class MethodReferencesRunner {
	
	//method reference example
	public static void print(Integer number) {
		System.out.print(number +" " );
	}

	public static void main(String[] args) {
		List<String> list= Arrays.asList("Apple","Bat","Cat","Dog","Elephant");

		list.stream()
			.map(e -> e.length())
		    .forEach(e -> System.out.print(e+ " "));
		
		System.out.println();
		System.out.println("============");
		
	// same example with method reference
//	   method reference syntax is Class::method name 
//	   you wont put () after method
		
		list.stream()
		.map(String::length) // using method reference
//	    .forEach(System.out::println);
		.forEach(MethodReferencesRunner::print);
		
		System.out.println();
		System.out.println("*************");
		
	
		List<Integer> list2= Arrays.asList(2,67,8,2,53,29,4,5,8);
		
		
		// Normal way of coding
		//print max of odd numbers in above list
		Integer max= list2.stream()
					      .filter(e -> e%2==0)
					      .max((n1,n2) -> Integer.compare(n1,n2))
					      .get();
		System.out.println("max :"+max);		

		System.out.println();
		
		// Same using method reference.
		// method readability will be easy when we are using method reference
		//print max of odd numbers in above list
		Integer max2= list2.stream()
						  .filter(MethodReferencesRunner::isEven)  // we need to create custom static method for this isEven
						  .max(Integer::compare)  // method reference work for not only static method, it works for instance method
						  .get();
		System.out.println("max2 :"+max2);		
		
		// method reference work for not only static method, it works for instance method
		// it works for not only 1 input, it works for 2 inputs also like below
		// max((n1,n2) -> Integer.compare(n1,n2)	
		// method reference makes code more readable
		
	}
	
	public static Boolean isEven(Integer number) {
		 return number%2 ==0;
	}

}
