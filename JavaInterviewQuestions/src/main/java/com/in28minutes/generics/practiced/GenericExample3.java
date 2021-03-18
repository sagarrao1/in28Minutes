package com.in28minutes.generics.practiced;

import java.util.ArrayList;
import java.util.List;

class MyList {
	 List<String> values = new ArrayList<>(); 
	
	void add(String value) {
		values.add(value);
		}
	
	void remove(String value) {
		values.remove(value);
	}	
}	


class MyGenericList<T> {
	 List<T> values = new ArrayList<>(); 
		
		void add(T value) {
			values.add(value);
			}
		
		void remove(T value) {
			values.remove(value);
		}
		
		T get(int index) {
			return values.get(index);
		}
}

class MyRestrictedGenericList<T extends Number> {
	 List<T> values = new ArrayList<>(); 
		
		void add(T value) {
			values.add(value);
			}
		
		void remove(T value) {
			values.remove(value);
		}
		
		T get(int index) {
			return values.get(index);
		}
}

public class GenericExample3 {
	
	@SuppressWarnings("unchecked")
	public static <X extends Number> X doSomething(X num){		
		X result = num;
		
		Integer p = num.intValue();
//		System.out.println(p*3);
		p=p*3;
		return (X) p;
	}
	
	public static void main(String[] args) {
		
//		***********************************************
		MyList myList= new MyList();
		myList.add("value 1");
	
		for (String string : myList.values) {
			System.out.println(string);
		}
//		************************************************
		
		MyGenericList<String> myGenericListString = new MyGenericList<>();
		myGenericListString.add("generic list value 1");
		System.out.println(myGenericListString.get(0));
		
		MyGenericList<Integer> myGenericListInteger = new MyGenericList<>();
		myGenericListInteger.add(1);
		myGenericListInteger.add(2);
		System.out.println(myGenericListInteger.get(1));
		
//		##################################################	
		
		
//		Will give error
//		MyRestrictedGenericList<String> myRestrictedGenericListString = new MyRestrictedGenericList<>();
//		myRestrictedGenericListString.add("generic list value 1");
//		System.out.println(myRestrictedGenericListString.get(0));
		
		MyRestrictedGenericList<Integer> myRestrictedGenericListInteger = new MyRestrictedGenericList<>();
		myRestrictedGenericListInteger.add(2);
		myRestrictedGenericListInteger.add(3);
		System.out.println(myRestrictedGenericListInteger.get(1));

		MyRestrictedGenericList<Double> myRestrictedGenericListDouble = new MyRestrictedGenericList<>();
		myRestrictedGenericListDouble.add(2.0);
		myRestrictedGenericListDouble.add(3.0);
		System.out.println(myRestrictedGenericListDouble.get(1));
		
//		&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		
		Integer i= 5;
		Integer something = doSomething(i);
		System.out.println(something);
		
	}
}
