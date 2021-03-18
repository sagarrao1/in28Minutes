package com.in28minutes.inheritence;

public class superClassRefTest {

	public static void main(String[] args) {
		Actor actor1 = new Hero();
		Actor actor2 = new Comedian();
		
		actor1.act();
//		actor1.fight()
		
		// you can not use Hero methods when you are creating Object with 
//		super class reference
		
		
		actor2.act();
		
		
		
		
		
		

	}

}
