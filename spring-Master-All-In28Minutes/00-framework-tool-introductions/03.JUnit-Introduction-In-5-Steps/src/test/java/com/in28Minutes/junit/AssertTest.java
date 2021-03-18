package com.in28Minutes.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertTest {

	@Test
	public void test() {
		int[] nums = new int[3];
		for (int i = 0; i < nums.length; i++) {
			nums[i]=i+3;
		}
		
			
		int[] numbers= {3,4,5};
		
		boolean cond=true;
		assertEquals(1, 1);
		assertFalse(false);
//		assertFalse(cond);
		assertArrayEquals(nums, numbers);
	}

}
