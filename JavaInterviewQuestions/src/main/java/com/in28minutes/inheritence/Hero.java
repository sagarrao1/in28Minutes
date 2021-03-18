package com.in28minutes.inheritence;

public class Hero extends Actor {
	
	public void fight() {
		System.out.println("fight");
	}
	
	public static void main(String[] args) {
		Hero hero = new Hero();
		
		hero.act();
		hero.fight();
	}
}
