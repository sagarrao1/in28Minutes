package com.in28Minutes.generics;

public class GenericsRunner {

	public static void main(String[] args) {
		MyCustomList<String> list = new MyCustomList<>();

		list.addElement("element 1");
		list.addElement("element 2");
		System.out.println(list);

		String element = list.getElement(0);
		System.out.println(" element from " + list.getClass().getSimpleName() + " is at 0 index : " + element);

		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(4));
		list2.addElement(Integer.valueOf(19));

		System.out.println(list2);

		Integer element2 = list2.getElement(0);
		System.out.println(" element from " + list.getClass().getSimpleName() + " is at 0 index : " + element2);

	}

}
