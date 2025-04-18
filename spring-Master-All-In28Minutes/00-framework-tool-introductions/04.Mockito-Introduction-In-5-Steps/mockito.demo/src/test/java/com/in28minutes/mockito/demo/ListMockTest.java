package com.in28minutes.mockito.demo;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class ListMockTest {
	
	@org.junit.jupiter.api.Test
	public void testListSize() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10);
		assertEquals(10, listMock.size());		
		assertEquals(10, listMock.size());
	}

	@Test
	public void testListSize_multi() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, listMock.size());
		assertEquals(20, listMock.size());		
		assertEquals(20, listMock.size());		
	}
	
	@Test
	public void testListGet() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("some string");
		assertEquals("some string", listMock.get(0));		
		assertEquals(null, listMock.get(1));
	}

	@Test
	public void testListGet_Specific() {
		List listMock = mock(List.class);
		when(listMock.get(Mockito.anyInt())).thenReturn("some string");
		assertEquals("some string", listMock.get(0));		
		assertEquals("some string", listMock.get(4));
	}
	


}
