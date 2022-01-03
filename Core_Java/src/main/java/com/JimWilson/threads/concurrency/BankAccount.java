package com.JimWilson.threads.concurrency;

public class BankAccount implements Runnable{
	
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

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
