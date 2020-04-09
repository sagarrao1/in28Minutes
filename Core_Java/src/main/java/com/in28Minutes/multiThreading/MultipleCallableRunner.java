package com.in28Minutes.multiThreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// calling multiple callable threads 
// we wait all of threads to be completed, the take result of all threads and continue main method
// use arraylist to store all Future return values

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException  {
		ExecutorService executorService= Executors.newFixedThreadPool(3);
		
		//creating list of 3 tasks
		List<CallableTask> listOfTasks = Arrays.asList(new CallableTask("in28inutes"), 
										new CallableTask("Ranga"),new CallableTask("Sagar"));		
		List<Future<String>> results = executorService.invokeAll(listOfTasks);
		for (Future<String> result : results) {
			System.out.println(result.get());
		}
		
		// we need to use invokeAll() instead of submit() when we are using mutliple Callable interface implementation
		System.out.println("\n Multi CallableTasks completed");
		
		
		System.out.println("\n main method completed");
		executorService.shutdown();
	}

}
