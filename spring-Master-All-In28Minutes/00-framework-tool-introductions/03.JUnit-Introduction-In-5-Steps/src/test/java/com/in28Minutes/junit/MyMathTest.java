package com.in28Minutes.junit;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyMathTest {
	MyMath myMath = new MyMath();		

	@Test
	public void sum_With3Numbers() throws InterruptedException {
//		int[] numbers = new int[3];		
//		int[] numbers = {1,2,3};		
		assertEquals(6, myMath.sum(new int[] {1,2,3}));	
	}

	@Test
	public void sum_With1Numbers() {
//		MyMath myMath = new MyMath();		
//		int[] numbers = new int[3];		
//		int[] numbers = {1,2,3};		
		try {
			assertEquals(13, myMath.sum(new int[] {13}));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
