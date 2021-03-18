package com.in28minutes.inheritence;

public class Comedian extends Actor {
	
	public void performComdey() {
		System.out.println("comdey");
	}

	public static void main(String[] args) {
		Comedian comedian= new Comedian();
		
		comedian.act();
		comedian.performComdey();
	}
}
