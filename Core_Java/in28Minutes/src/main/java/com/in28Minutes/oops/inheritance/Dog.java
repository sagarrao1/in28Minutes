package com.in28Minutes.oops.inheritance;

public class Dog extends Pet {

	public static void main(String[] args) {
		Dog dog = new Dog();

//		dog extends pet, pet extends Animal, animal extends Object
//		Object has toString method
		System.out.println(dog.toString());

		dog.groom();

		// you can have super class reference to sub class Object
		// that is allowed
		Pet pet = new Dog();
		System.out.println(pet);
		pet.groom();

	}
}
