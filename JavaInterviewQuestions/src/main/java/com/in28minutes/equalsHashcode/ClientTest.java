package com.in28minutes.equalsHashcode;

public class ClientTest {

	public static void main(String[] args) {
		Client c1= new Client(25);
		Client c2= new Client(25);
		
		Client c3= c1;
		
		System.out.println("c1.equals(c2) : "+c1.equals(c2));
		System.out.println("c1.equals(c3) : "+c1.equals(c3));
		
		System.out.println(c1.hashCode()); //56

	}

}
