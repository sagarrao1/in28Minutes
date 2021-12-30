package com.JimWilson.threads.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WorkerDemoMultiThread {

	public static void main(String[] args) {
		ExecutorService es=  Executors.newFixedThreadPool(5);
		BankAccount account= new BankAccount(100);
		
		for (int i = 0; i < 15; i++) {			
			Worker worker= new Worker(account);
			es.submit(worker);
		}
		
		try {
			es.shutdown();
			es.awaitTermination(60, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
