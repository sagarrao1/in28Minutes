package com.in28Minutes.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
	
	// With lock you will not block entire method'
	// you will only lock only particular block and release the lock so that other threads can get it 
	private int i=0;
	private int j=0;
	
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	
	public void incrementI() {
		
		lockForI.lock();
		//Lock
		i++;	
		lockForI.unlock();
		//Release Lock
	}
	
	public void incrementJ() {
		lockForI.lock();
		j++;		
		lockForI.unlock();
	}

	
	public int getI() {
		return i;
	}
	
	public int getJ() {
		return j;
	}
	

}
