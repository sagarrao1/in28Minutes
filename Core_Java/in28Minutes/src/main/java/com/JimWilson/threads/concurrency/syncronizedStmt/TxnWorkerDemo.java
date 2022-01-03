package com.JimWilson.threads.concurrency.syncronizedStmt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.JimWilson.threads.concurrency.BankAccount;

public class TxnWorkerDemo {

	public static void main(String[] args) {
		
		ExecutorService es=  Executors.newFixedThreadPool(5);
		BankAccount account= new BankAccount(100);

//		TxnWorker[] workers =  new TxnWorker[5];
		
		for (int i = 0; i < 5; i++) {
			char t;
			if (i %2 == 0) {
				t='w';
			} else {
				t='d';
			}
			TxnWorker worker= new TxnWorker(account, t, 10+i);
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
