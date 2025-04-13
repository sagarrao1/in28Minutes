package com.in28minutes.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SomeBusinessStubTest {

	@Test
	public void testFindGreatestOfallNums() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result= businessImpl.findGreatestOfallNums();
		assertEquals(12, result);	
	}
}

class DataServiceStub implements DataService{

	@Override
	public int[] retriveAlldata() {		
		return new int[]{1,4,7,12};
	}
}

