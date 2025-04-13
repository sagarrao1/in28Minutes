package com.in28Minutes.junit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;



public class MyAssertTest {
	
	List<String> todos = Arrays.asList("AWS","Azure","DevOPs");

	@Test 
	public void test() {
		boolean test1= todos.contains("AWS");
		boolean test2= todos.contains("GCP");
		
		
		int[] nums = new int[3];
		for (int i = 0; i < nums.length; i++) {
			nums[i]=i+3;
		}
		
		assertEquals(3, todos.size());
		
		int[] numbers= {3,4,5};
		
		boolean cond=true;
		assertEquals(1, 1);
		assertFalse(false);
		
		assertTrue(test1);
		assertFalse(test2);
		
//		assertFalse(cond);
		assertArrayEquals(nums, numbers);
		assertArrayEquals(new int[] {1,2}, new int[] {1,2});
	}

}
