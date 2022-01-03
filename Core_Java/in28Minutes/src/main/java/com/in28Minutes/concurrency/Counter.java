package com.in28Minutes.concurrency;

public class Counter {
	
	private int i=0;
	
	// without synchronized , this method is not thread safe
	// thread safe means a method can be run by multiple threads at the same time
	// if it not synchronized, multiple threads run this method can get 15 and try increase to 16
	synchronized public void increment() {
		i++;	// i++ is not Atomic	
		//get i  15         15
		//increment 16      16 actuall it shlould be 17   
		//set i 16          16 
	}
	
	public int getI() {
		return i;
	}
	
	

}
