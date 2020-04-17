package com.tips.nonaccessModifiers.package1;

//instance variabes are not accessible from static methods
// but static variable or static method can be accessed from instance methods
class  PlayerHyd{
	private String name;  // is instance or member variable
	
	static private int count=0; // is class variable
	
	
	public PlayerHyd(String name) {
		super();
		this.name = name;
		count++;
	}
	
//	instance variabes are not accessible from static methods
//	but static variable or static method can be accessed from instance methods
//	is class method or static method
	static public int getCount() {
		//System.out.println(name);  cannot access instance variable from static method
//		System.out.println("geCount() static method");
		return count;
	}

	// is instance method
	public String getName() {
		System.out.println("count in getName : "+getCount());  //can access static variable or method from instance method
		return name;
	}	
	
	
}


public class StaticModifierRunner2 {

	public static void main(String[] args) {
		PlayerHyd player1 =  new PlayerHyd("Sachin");
		System.out.println(player1.getCount());
		PlayerHyd player2 =  new PlayerHyd("A B devilers");		
		System.out.println(player2.getCount());
		System.out.println(PlayerHyd.getCount());
		
		
		System.out.println(player2.getName());
		
	}

}
