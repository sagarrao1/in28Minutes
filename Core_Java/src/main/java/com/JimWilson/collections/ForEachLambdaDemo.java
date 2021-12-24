package com.JimWilson.collections;

import java.util.ArrayList;

public class ForEachLambdaDemo {

	public static void main(String[] args) {
		ArrayList<MyClass> list=  new ArrayList<MyClass>();		
		
		MyClass v1=  new MyClass("v1","abc");
		MyClass v2=  new MyClass("v2","xyz");
		MyClass v3=  new MyClass("v3","abc");
		
		list.add(v1);
		list.add(v2);
		list.add(v3);
//		print all object's values
		list.forEach(m -> System.out.println(m.getLable()));
		
//		removeif takes predicate lambda expression. it deletes all objects which has value "abc"
		list.removeIf(m -> m.getValue().equals("abc"));

		System.out.println("======================");
//		print sing lambda. pass Cosnumer
//		it pass m as argument to sysout and it will be executed each time
		list.forEach(m -> System.out.println(m.getLable()));
		
	}

}
