package com.in28minutes.javaBasics;

public class Animal {
	
	private String name;
	private String type;
	
	public Animal(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + "]";
	}

	

}
