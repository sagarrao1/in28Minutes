package com.learning.loops;

public class WhileNumber {

	private int limit;

	public WhileNumber(int limit) {
		this.limit = limit;
	}

	public void printSquareUptoLimit() {
		int i = 1;
		while (i * i < limit) {
			System.out.print(i * i + " ");
			i++;
		}

	}

	public void printCubesUptoLimit() {
		System.out.println();
		int i = 1;
		while (i * i * i < limit) {
			System.out.print(i * i * i + " ");
			i++;
		}

	}

}
