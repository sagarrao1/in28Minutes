package com.in28Minutes.junit;

public class MyMath {
	
	public int sum(int[] numbers) {
		int sum=0;
		for (int num : numbers) {
			sum+=num;			
		}
		return sum;
	}

}
