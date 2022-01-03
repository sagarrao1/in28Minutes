package com.in28Minutes.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//   This demo is to what is happening in behind the screens when are using functions

class EvenNumberPredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer number) {		
		return number%2==0;
	}
}

class PrintConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer number) {
		System.out.print(number+" ");		
	}	
}

class SquareMapperFunction implements Function<Integer, Integer>{

	@Override
	public Integer apply(Integer t) {
		return t*t;
	}	
	
}

public class LambdaBehindTheScreensRunner {
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(23,43,34,45,2,8);
		
		//print even
		list.stream()
		    .filter(n -> n%2==0)
		    .map(n -> n*n)
		    .forEach(e -> System.out.print(e +" "));
		
		System.out.println();		
		
//		Background explanation of functions using functional interfaces
		
//		filter(Predicate<? super T> predicate);
//		boolean test(T t); is Predicate interface
		
//		void forEach(Consumer<? super T> action);
//	    void accept(T t); is unimplemented method of Consumer Interface
		
//		<R> Stream<R> map(Function<? super T, ? extends R> mapper);
//	    R apply(T t);
	    
	    
		list.stream()
		    .filter(new EvenNumberPredicate())
		    .map(new SquareMapperFunction())
		    .forEach(new PrintConsumer());
		
	}
	
	
//  There are 3 types of functional interfaces
//	Functions accepts input and returns a output
//	Predicate accepts input and tells true or false
//	Consumer accepts input and consumes it , does not return a output
	
//   you are creating implementations of functional interfaces and instances of that implementations	
	
	
}
