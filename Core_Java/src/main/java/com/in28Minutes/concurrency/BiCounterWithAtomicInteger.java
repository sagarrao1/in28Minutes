package com.in28Minutes.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicInteger {
	
	// Instead of lock and unlock we can use 
	// This only works for only Integer value
	// similarly we have other Class which implements synchronization	
	// AtomicInteger automatically makes thread safe
	
	private AtomicInteger i= new AtomicInteger();
	private AtomicInteger j= new AtomicInteger();
	
	public void incrementI() {
		
//		lockForI.lock();
//		i++;	
//		lockForI.unlock();
		i.incrementAndGet(); // 

	}
	
	public void incrementJ() {
//		lockForI.lock();
//		j++;		
//		lockForI.unlock();
		j.incrementAndGet();
	}

	
	public int getI() {
		return i.get();
	}
	
	public int getJ() {
		return j.get();
	}
	

}
