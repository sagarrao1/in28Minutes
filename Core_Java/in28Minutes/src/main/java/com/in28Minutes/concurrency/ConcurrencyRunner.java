package com.in28Minutes.concurrency;

public class ConcurrencyRunner {

	public static void main(String[] args) {
		Counter counter= new Counter();
		counter.increment();
		counter.increment();
		counter.increment();		
		System.out.println(counter.getI());
		
		System.out.println("===============================");
		BiCounterWithLock biCounterWithLock = new BiCounterWithLock();
		biCounterWithLock.incrementI();
		biCounterWithLock.incrementI();
		biCounterWithLock.incrementJ();
		biCounterWithLock.incrementJ();
		
		System.out.println(biCounterWithLock.getI());
		System.out.println(biCounterWithLock.getJ());
		System.out.println("===============================");
		BiCounterWithAtomicInteger atomicInteger= new BiCounterWithAtomicInteger();
		atomicInteger.incrementI();
		atomicInteger.incrementI();
		atomicInteger.incrementI();
		atomicInteger.incrementJ();
		atomicInteger.incrementJ();
		atomicInteger.incrementJ();

		System.out.println(biCounterWithLock.getI());
		System.out.println(biCounterWithLock.getJ());


	}

}
