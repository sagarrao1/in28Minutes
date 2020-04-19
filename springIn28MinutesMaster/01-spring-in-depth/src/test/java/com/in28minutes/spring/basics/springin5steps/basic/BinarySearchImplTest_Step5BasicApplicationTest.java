package com.in28minutes.spring.basics.springin5steps.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsBasicApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SpringIn5StepsBasicApplication.class)
public class BinarySearchImplTest_Step5BasicApplicationTest {
	@Autowired
	BinarySearchImpl binarySearchImpl;
	
	@Test
	public void binarySearchGivenNum() {
		
		int result = binarySearchImpl.binarySearch(new int[] {12,4,8}, 4);
		assertEquals(3, result);
		
	}

}


