package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;	
	
	public int binarySearch(int[] numbers, int numberTosearchFor) {
		
		//Implementing sorting logic sort array
		//BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int[] sortNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		//search array
		
		//Return the result		
		return 3;
	}


}
