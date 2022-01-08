package com.JimWilson.serializatation;

import java.io.Serializable;

public class BankAccount implements Serializable{
	
	private static final long serialVersionUID = -5672642541297956259L;
	private int balance;
	private String id;
	
	private char txnType; // 'w' 'd'
	
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amt) {
		this.balance += amt;
		System.out.println("deposited : "+amt);
		txnType='d';
	}
	
	public void withdrawl(int amt) {
		this.balance -= amt;
		System.out.println("withdrawl : "+amt);
		txnType='w';
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public BankAccount(String id,int balance) {
		this.balance = balance;
		this.id = id;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + ", id=" + id + ", txnType=" + txnType + "]";
	}


}
