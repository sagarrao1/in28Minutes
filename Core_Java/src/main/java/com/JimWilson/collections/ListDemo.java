package com.JimWilson.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<String> list1=  new ArrayList<String>();
		list1.add("Foo");
		list1.add("Bar");
		
		LinkedList<String> list2=  new LinkedList<String>();
		list2.add("Baz");
		list2.add("Boo");
		
		list1.addAll(list2);
		
//		for (int i=0; i<list1.size();i++) {
////			System.out.println(list1.get(i));
//		}
		
//		print using lambda expression
		list1.forEach(m -> System.out.println(m.toString()));

	}

}
