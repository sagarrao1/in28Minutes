package com.in28minutes.mockito.mockito.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class SomeBusinessMockTest {

	@Test
	public void testFindGreatestOfallNums() {
		DataService dataServiceMock = mock(DataService.class);
//		when dataServiceMock.retriveAlldata() then {5,7,12} 
		when(dataServiceMock.retriveAlldata()).thenReturn(new int[] {5,7,12});
				
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findGreatestOfallNums();
		assertEquals(12, result);		
	}
	
	@Test
	public void testFindGreatestOfoneNum() {
		DataService dataServiceMock = mock(DataService.class);		 
		when(dataServiceMock.retriveAlldata()).thenReturn(new int[] {15});
				
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findGreatestOfallNums();
		assertEquals(15, result);
		
	}
}
