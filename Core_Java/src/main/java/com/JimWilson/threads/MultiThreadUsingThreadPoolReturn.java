package com.JimWilson.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class MultiThreadUsingThreadPoolReturn {

	public static void main(String[] args) {
		String[] inFiles = { ".//src//main//resources//iFile1.txt", ".//src//main//resources//iFile2.txt",
				".//src//main//resources//iFile3.txt" };
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<Integer>[] results=  new Future[inFiles.length];
		
		for (int i = 0; i < inFiles.length; i++) {
			AdderReturn adder = new AdderReturn(inFiles[i]);
			results[i]=es.submit(adder);
		}
		
		try {
			es.shutdown();
			es.awaitTermination(60, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (Future<Integer> result : results) {
				try {
					int value = result.get();
					System.out.println("Total : "+ value);
				} catch (ExecutionException e) {  // exception raised in AdderReturn class
					Throwable adderEx = e.getCause(); // Get Adder class exception
					// Do Somthing with AdderEx
				} catch (Exception e) {  // Non-Adder exceptions
					e.printStackTrace(); 					
				}
		}
	}
}


