package com.JimWilson.threads.concurrency.syncronizedStmt;

import com.JimWilson.threads.concurrency.BankAccount;

public class TxnWorker implements Runnable{
	
	protected BankAccount account;
	protected char txnType;	// 'w' -> withdrawl 'd' -> deposit
	protected int amt;
	
	public TxnWorker(BankAccount account, char txnType, int amt) {
		this.account =account;
		this.txnType = txnType;
		this.amt = amt;
	}

	@Override
	public void run() {
		if (txnType=='w') {
			account.withdrawl(amt);
			
		} else if (txnType =='d') {
			account.deposit(amt);
		}
	}
	
}

