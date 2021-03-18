package com.in28Minutes.junit;

public class MyMath {
	
	public int sum(int[] numbers) throws InterruptedException {
		int sum=0;
		for (int num : numbers) {
			sum+=num;			
		}
		
		 Thread.sleep(100);
		 
		return sum;
	}

}
