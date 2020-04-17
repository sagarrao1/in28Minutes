package com.tips.nonaccessModifiers.package1;

class  Player{
	private String name;
	
//	1. static variable
//	private int count=0;
//	count will be created for each instance seperatly same like name
//	we want to count total number of players created
	static private int count=0;
	
	public Player(String name) {
		super();
		this.name = name;
		count++;
	}
	
//	2. static method
	
	/*
	 * tatic method: same like static variable, static method will available to
	 * access for all instances we can use object ref to call static method. Best
	 * way to use is class name and method Ex: 1. Player.getcount() // getcount() is
	 * static method
	 */
	static public int getCount() {
		return count;
	}	
}


public class StaticModifierRunner {

	public static void main(String[] args) {
		PlayerHyd player1 =  new PlayerHyd("Sachin");
		System.out.println(player1.getCount());
		PlayerHyd player2 =  new PlayerHyd("A B devilers");		
		System.out.println(player2.getCount());
		System.out.println(PlayerHyd.getCount());
		
	}

}
