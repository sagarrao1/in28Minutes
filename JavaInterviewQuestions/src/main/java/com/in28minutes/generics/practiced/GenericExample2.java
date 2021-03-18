package com.in28minutes.generics.practiced;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Animal {

}

class Dog extends Animal {

}

public class GenericExample2 {

	static void doSomthingArray(Animal[] animals) {
	}

	static void doSomthingList(List<Animal> animals) {
		animals.add(new Animal());
	}

	static void doSomthingListModified(List<? extends Animal> animals) {
		// Adding an element into a list declared with ? is prohibited.
//		animals.add(new Animal());
	}

	static void doSomthingListModifiedSuper(List<? super Dog> animals) {
		// Adding an element into a list declared with ? is prohibited.
//		animals.add(new Animal());
	}

	static void doSomthingListInterface(List<? extends Serializable> animals) {
		// Adding an element into a list declared with ? is prohibited.

//		animals.add(new Animal());
	}
	
	public static void main(String[] args) {
		Animal[] animalsArray= {new Animal(),new Dog()};
		Dog[] dogsArray		 = {new Dog(),new Dog()};
		
		List<Animal> animalsList= Arrays.asList(animalsArray);
		List<Dog>	 dogsList	= Arrays.asList(dogsArray);
		
		doSomthingArray(animalsArray);
		doSomthingArray(dogsArray);
		
		doSomthingList(animalsList);
//		doSomthingList(dogsList);
		
		doSomthingListModified(animalsList);
		doSomthingListModified(dogsList);
		
		
		doSomthingListModifiedSuper(animalsList);
		doSomthingListModifiedSuper(dogsList);
		
		
		List<? extends Animal> animals1= new ArrayList<Dog>();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
