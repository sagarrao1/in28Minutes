package com.in28minutes.mockito.mockito.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationTest {
	
	@Mock
	DataService dataServiceMock;

	@InjectMocks
	SomeBusinessImpl businessImpl;

	@Test
	public void testFindGreatestOfallNums() {
//		when dataServiceMock.retriveAlldata() then {5,7,12} 
		when(dataServiceMock.retriveAlldata()).thenReturn(new int[] {5,7,12});				
		int result = businessImpl.findGreatestOfallNums();
		assertEquals(12, result);		
	}
	
	@Test
	public void testFindGreatestOfoneNum() {
//		DataService dataServiceMock = mock(DataService.class);		 
		when(dataServiceMock.retriveAlldata()).thenReturn(new int[] {15});
				
//		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findGreatestOfallNums();
		assertEquals(15, result);		
	}
	
	@Test
	public void testFindGreatestWithNoValues() {			 
		when(dataServiceMock.retriveAlldata()).thenReturn(new int[] {});				
		assertEquals(Integer.MIN_VALUE, businessImpl.findGreatestOfallNums());		
	}

}
