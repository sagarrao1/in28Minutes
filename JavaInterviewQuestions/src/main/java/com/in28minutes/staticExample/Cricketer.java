package com.in28minutes.staticExample;

public class Cricketer {
	
	private static int count=0;
	
	public Cricketer() {
		count++;
	}
	
	public static int getCount() {
		return count;
	}

	public static void main(String[] args) {
		Cricketer cr1 = new Cricketer();
		Cricketer cr2 = new Cricketer();
		Cricketer cr3 = new Cricketer();
		Cricketer cr4 = new Cricketer();
		
		System.out.println(Cricketer.getCount());
	}

}
