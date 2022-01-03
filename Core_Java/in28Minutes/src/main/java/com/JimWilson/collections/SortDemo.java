package com.JimWilson.collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class SortDemo {
	
	/*
	 * for sorting collections we use 2 interfaces 
	 * 1. Comparable 
	 * 2. Comparator
	 * 
	 * 1. Comparable. if we access to source code. implement Comparable interface in
	 * that we have compareTO method which we need to implement how you want to
	 * implement by sorting current object to given object and provide retur -, + or
	 * 0 values here MyClass implements comparable . see that
	 * 
	 * 
	 * 2. comparator
	 * when you do not have access to source code to implement comparable like ur using jar file from other app
	 * 
	 * you create new comparator class and pass that class in your collection
	 * 
	 */
	

	public static void main(String[] args) {
		
//		taking treeset here becasue to verify how Comparable interface work in MyClass
//		and treeset allways sorted order by defalut 
		
		TreeSet<MyClass> tree=  new TreeSet<>();		
		
		
		MyClass v1=  new MyClass("2222","ghi");
		MyClass v2=  new MyClass("3333","abc");
		MyClass v3=  new MyClass("1111","def");
		
		tree.add(v1);
		tree.add(v2);
		tree.add(v3);
		System.out.println("sort using Comparable. sort by value here");
		
		tree.forEach(m -> System.out.println(m));
		
		
//		2. comparator
//		 * when you do not have access to source code to implement comparable like ur using jar file from other app		 * 
//		 * you create new comparator class and pass that class in your collection
//		 
//		 first your MyComparator class and implement compare method whic use MyClass 
		
		TreeSet<MyClass> tree2=  new TreeSet<>(new MyComparator());		
				
		tree2.add(v1);
		tree2.add(v2);
		tree2.add(v3);
		
		System.out.println("===========");
		System.out.println("sort using Comparator. sort by lable here");		
		tree2.forEach(m -> System.out.println(m));
		

	}

}
