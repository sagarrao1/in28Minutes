package com.in28minutes.interfaces;

public class Animal implements Walk, Run {

	@Override
	public void run() {
		System.out.println("Runnable interface is executing");
		
	}

	@Override
	public void walk() {
		System.out.println("Walkable interface is executing");
		
	}
	
}
