package com.in28minutes.basics;

import org.junit.Test;

import com.learning.basics.Loops;

public class LoopsTest {

	@Test
	public void testTable() {
		Loops loops = new Loops();
		loops.table();

	}

	@Test
	public void testTable1() {
		Loops loops = new Loops();
		loops.table(6);

	}

	@Test
	public void testTable2() {
		Loops loops = new Loops();
		loops.table(8, 1, 6);

	}

}
