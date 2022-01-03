package com.JimWilson.collections;

import java.util.ArrayList;

public class MyClassDemo {

//	Removing a member using equals menthod of class
	
	public static void main(String[] args) {
		
		ArrayList<MyClass> list=  new ArrayList<MyClass>();		
		
		MyClass v1=  new MyClass("v1","abc");
		MyClass v2=  new MyClass("v2","xyz");
		MyClass v3=  new MyClass("v3","abc");
		
		list.add(v1);
		list.add(v2);
		list.add(v3);
			
		// will think that it will remove v3 but check equals method. it is checking only values matching 
//		or not.MyClassDemo so here abc is atching v1 and v3 so it will remove v1 
		list.remove(v3); 
		list.forEach(m -> System.out.println(m.getLable()));
		
		
	}

}
