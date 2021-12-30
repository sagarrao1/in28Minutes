package com.JimWilson.threads.concurrency.syncronizedStmt;

import com.JimWilson.threads.concurrency.BankAccount;

public class TxnPromoWorker extends TxnWorker{	
	
	public TxnPromoWorker(BankAccount account, char txnType, int amt) {
		super(account,txnType,amt);
	}

	@Override
	public void run() {
		if (txnType=='w') {
			account.withdrawl(amt);
		} else if (txnType =='d') {
			synchronized (account) {				
			account.deposit(amt);			
			if (account.getBalance() > 500) {
				int bonus = (int) ((account.getBalance()- 500 ) * 0.1);
				System.out.println("you got Bonus : "+bonus);
				account.deposit(bonus);
				}
			}
		}
	}
	
}

