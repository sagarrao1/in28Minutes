package com.learning.basics.arrays;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Bat");
		list.add("Car");

		System.out.println(list);

		list.remove("Car");
		list.remove(1);
		System.out.println(list);

	}

}
