package com.JimWilson.threads.concurrency;

public class BankAccount {
	
	private int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public synchronized int getBalance() {
		return balance;
	}

	public synchronized void deposit(int amt) {
		this.balance +=amt;
		System.out.println(amt +" depositied : " +balance);
	}
	
	public synchronized void withdrawl(int amt) {
		this.balance -=amt;
		System.out.println(amt +" deducted : " +balance);
	}

}
