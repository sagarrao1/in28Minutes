package com.in28Minutes.junit;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*Order of test1 and test2 are not maintained
Before class and After class are class level methods so it should be static
test case should always has return type as void
Before and After are executed once for each test case
BeforeClass and AfterClass are executed once for all test cases*/
public class MyMathBeforeAfterTest {
	MyMath myMath = new MyMath();		
	
	
	@Before
	public void setup() {
		System.out.println("Before");
	}

	@After
	public void teardown() {
		System.out.println("After");
	}

	@BeforeClass
	public static void BeforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void AfterClass() {
		System.out.println("After Class");
	}
	
	@Test
	public void sum_With3Numbers() {
		System.out.println("test 1");
//		int[] numbers = new int[3];		
//		int[] numbers = {1,2,3};		
		assertEquals(6, myMath.sum(new int[] {1,2,3}));			
	}

	@Test
	public void sum_With1Numbers() {
		System.out.println("test 2");
//		MyMath myMath = new MyMath();		
//		int[] numbers = new int[3];		
//		int[] numbers = {1,2,3};		
		assertEquals(13, myMath.sum(new int[] {13}));	
	}

}
