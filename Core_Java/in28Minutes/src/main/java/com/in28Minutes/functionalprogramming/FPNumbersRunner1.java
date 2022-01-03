package com.in28Minutes.functionalprogramming;
import java.util.Arrays;
import java.util.List;

public class FPNumbersRunner1 {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(2,5,8,13,29);
		
//		list.stream().forEach(element -> System.out.println(element));
	
		Integer sum = sumOfNumbersFP(list);				
		System.out.println("sumOfNumbers : "+sum);
		

		Integer sumOfOddNumbers = sumOfOddNumbers(list);
		System.out.println("sumOfOddNumbers : "+sumOfOddNumbers);
		
//		int sum = normalSum(list);
		
	}

//	using lambda expression and functional programming
//	compare first numbers and sum, start with 0 and continue till last
	private static Integer sumOfNumbersFP(List<Integer> list) {
//		old code
//		return list.stream()
//				   .reduce(0,
//						  (number1, number2) -> number1+number2);
		
		return list.stream()
			   .reduce(0,
					  (number1, number2) -> { 
			   	       System.out.println(number1 + " " + number2);
				      return number1+number2; 
				    }
				);		
	}
	
//	sum odd numbers
	private static Integer sumOfOddNumbers(List<Integer> list) {
		Integer sumOfOddNumbers = list.stream()
				.filter(element -> element%2 !=0)
				.reduce(0,(number1, number2) -> number1+number2);
		return sumOfOddNumbers;
	}

//	using normal way calculating sum
	private static int normalSum(List<Integer> list) {
		int sum=0;
		for (Integer number : list) {
			sum +=number;
		}
		return sum;
	}

}
