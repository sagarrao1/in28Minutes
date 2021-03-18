package com.in28minutes.threads.practiced;

class BattiingThread extends Thread{	
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println("BattiingThread i = "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class BowlingThread implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i <=100; i++) {
			System.out.println(" BowlingThread i : "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
	}
}

public class ThreadExample {
	
	public static void battingStatistics() {		
	}	
	public static void bowlingStatistics() {		
	}	
	public static void feildingStatistics() {		
	}	
	public static void mergeAndAnalyze() {		
	}		
		
	public static void main(String[] args) {
	
		battingStatistics();		
		bowlingStatistics();		
		feildingStatistics();		
		mergeAndAnalyze();		
		
		BattiingThread thread1 = new BattiingThread();
		thread1.start();
		
		BowlingThread bowlingThreadImpl = new BowlingThread();
		Thread thread2=  new Thread(bowlingThreadImpl);
		thread2.start();	
		
		
	}

}
