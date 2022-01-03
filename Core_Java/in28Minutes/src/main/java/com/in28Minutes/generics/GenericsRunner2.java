package com.in28Minutes.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GenericsRunner2 {

	// Generics with methods
	static <X> X doSomething(X value) {
		return value;
	}

	static <T extends List> void duplicate(T list) {
		list.addAll(list);
	}

	public static void main(String[] args) {

		Integer v1 = doSomething(Integer.valueOf(5));
		String str1 = doSomething(new String("text"));
		
//		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList al2 = doSomething(new ArrayList<>(Arrays.asList(1, 2, 3)));
		
		// duplicate static method accepts any list type
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
		System.out.println("numbers :" + numbers);
		duplicate(numbers);
		System.out.println("numbers after duplicate:" + numbers);
		
		LinkedList<Integer> numbers1 = new LinkedList<>(Arrays.asList(1, 2, 3));
		System.out.println("numbers :" + numbers1);
		duplicate(numbers1);
		System.out.println("numbers after duplicate:" + numbers1);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		MyCustomList2<Long> list = new MyCustomList2<>();

		list.addElement((long) 12345);
		list.addElement((long) 123);
		System.out.println(list);

		Long element = list.getElement(0);
		System.out.println(" element from " + list.getClass().getSimpleName() + " is at 0 index : " + element);

		MyCustomList2<Integer> list2 = new MyCustomList2<>();
		list2.addElement(Integer.valueOf(4));
		list2.addElement(Integer.valueOf(19));

		System.out.println(list2);

		Integer element2 = list2.getElement(0);
		System.out.println(" element from " + list.getClass().getSimpleName() + " is at 0 index : " + element2);

	}

}
