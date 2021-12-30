package com.JimWilson.threads.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WorkerDemoSingleThread {

	public static void main(String[] args) {
		ExecutorService es=  Executors.newFixedThreadPool(5);
		
//		We have 5 threads in threadpool but we are using only one thread
		BankAccount account= new BankAccount(100);
		Worker worker= new Worker(account);
//		worker.run();
		es.submit(worker);
		
		try {
			es.shutdown();
			es.awaitTermination(60, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
