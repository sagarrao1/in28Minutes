package com.in28Minutes.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*Order of test1 and test2 are not maintained
Before class and After class are class level methods so it should be static
test case should always has return type as void
Before and After are executed once for each test case
BeforeClass and AfterClass are executed once for all test cases*/
public class MyMathBeforeAfterTest {
	MyMath myMath = new MyMath();		
	
	
	@BeforeEach
	public void setup() {
		System.out.println("Before");
	}

	@AfterEach
	public void teardown1() {
		System.out.println("After 1");
	}

	@BeforeAll
	public static void BeforeClass() {
		System.out.println("Before Class");
	}

	@AfterAll
	public static void AfterClass() {
		System.out.println("After Class");
	}
	
	@Test()	
	public void sum_With3Numbers() throws InterruptedException {
		System.out.println("test 1");
//		int[] numbers = new int[3];		
//		int[] numbers = {1,2,3};		
		assertEquals(6, myMath.calculateSum(new int[] {1,2,3}));		
		
	}

	@Test
	
	public void sum_With1Numbers() throws InterruptedException {
		System.out.println("test 2");
//		MyMath myMath = new MyMath();		
//		int[] numbers = new int[3];		
//		int[] numbers = {1,2,3};		
		assertEquals(13, myMath.calculateSum(new int[] {13}));	
	}

}
