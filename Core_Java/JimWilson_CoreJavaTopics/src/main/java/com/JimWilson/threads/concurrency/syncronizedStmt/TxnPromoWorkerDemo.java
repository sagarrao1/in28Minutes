package com.JimWilson.threads.concurrency.syncronizedStmt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.JimWilson.threads.concurrency.BankAccount;

public class TxnPromoWorkerDemo {

	public static void main(String[] args) {
		
		ExecutorService es=  Executors.newFixedThreadPool(5);
		BankAccount account= new BankAccount(200);

//		TxnWorker[] workers =  new TxnWorker[5];
		
		for (int i = 0; i < 5; i++) {		
			TxnWorker worker= new TxnPromoWorker(account,'d',100);
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
