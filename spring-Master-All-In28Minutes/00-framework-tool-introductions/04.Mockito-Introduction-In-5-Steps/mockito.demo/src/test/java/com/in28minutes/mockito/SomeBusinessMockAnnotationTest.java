package com.in28minutes.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
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
