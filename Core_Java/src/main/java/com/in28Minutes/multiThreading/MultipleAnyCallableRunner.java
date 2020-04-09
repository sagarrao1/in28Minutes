package com.in28Minutes.multiThreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// in previous step we waited all of threads to be completed, the take result of threads and continue main method
// this step , we wait only if any thread completed, then take the result

public class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException  {
		ExecutorService executorService= Executors.newFixedThreadPool(3);
		
		//creating list of 3 tasks
		// calling any of the tasks
		List<CallableTask> listOfTasks = Arrays.asList(new CallableTask("in28inutes"), 
										new CallableTask("Ranga"),new CallableTask("Sagar"));		
		String result = executorService.invokeAny(listOfTasks);
		
		System.out.println(result);		
		
		System.out.println("\n main method completed");
		executorService.shutdown();
	}

}
