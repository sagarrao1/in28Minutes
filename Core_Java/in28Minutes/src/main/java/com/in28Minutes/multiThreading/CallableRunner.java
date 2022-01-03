package com.in28Minutes.multiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Till now we have seen threads which execute and does not return anything
// to use threads which return, we need to use Callable interface

class CallableTask implements Callable<String>{
	
	private String name;

	public CallableTask(String name) {
		this.name=name;
//		System.out.println("CallableTask "+name);
	}
	
	@Override
	public String call() throws Exception {
		/*
		 * if (this.name=="in28inutes"){ Thread.sleep(5000); } else if
		 * (this.name=="Ranga"){ Thread.sleep(5000); }else { Thread.sleep(2000); }
		 */				
		Thread.sleep(5000);
		return "Hello "+name;
	}
	
}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService= Executors.newFixedThreadPool(1);
		Future<String> futureName = executorService.submit(new CallableTask("in28Minutes"));
		// we need to submit() not execute() when we are using Callable interface implementation
		System.out.println("\n new CallableTask(\"in28Minutes\") completed");
		
		String futureString = futureName.get();
		System.out.println("futureString :"+futureString);
		
		System.out.println("\n main method completed");
		executorService.shutdown();
	}

}
