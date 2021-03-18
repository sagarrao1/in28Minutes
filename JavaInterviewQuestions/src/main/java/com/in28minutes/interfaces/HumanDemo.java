package com.in28minutes.interfaces;

public class HumanDemo {

	public static void main(String[] args) {
		Walk h1 = new Human();
		h1.walk();
		
		Run h2 = new Human();
		h2.run();
		
//		h2.walk();
		System.out.println("====================");
		System.out.println();
		Human h3=  new Human();
		h3.walk();
		h3.run();

	}

}
