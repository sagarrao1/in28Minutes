package com.JimWilson.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ConvrtCollectionToArrays {

	public static void main(String[] args) {
		ArrayList<MyClass> list=  new ArrayList<MyClass>();		
		
		MyClass v1=  new MyClass("v1","abc");
		MyClass v2=  new MyClass("v2","xyz");
		MyClass v3=  new MyClass("v3","abc");
		list.add(v1);
		list.add(v2);
		list.add(v3);
		
		
//		print all obje
		// 1st way 
		Object[] objArray = list.toArray(); 
		
		MyClass c1= (MyClass)objArray[0];		
		System.out.println(c1.getLable());
		
//		2nd way
		MyClass[] a1 = list.toArray(new MyClass[0]);
		System.out.println(a1.length);
		System.out.println(a1[0].getLable());
		
//		3rd way
		MyClass[] a2= new MyClass[3];
		MyClass[] a3= list.toArray(a2);
				
		System.out.println(a2.length);
		System.out.println(a3.length);
		
		if (a2==a3) {
			System.out.println("a2 & a3 reference same array");
		}
		System.out.println("a2[0] lable : " +a2[0].getLable());
		
		
		System.out.println("======================================================");
		System.out.println("Arrays to collection ");
		
		MyClass[] myArray = {
				 new MyClass("v1","abc"),
				 new MyClass("v2","xyz"),
				new MyClass("v3","abc")				
		};
		
//		we have static aslist method in Arrays class which we use to convert arrays to collection 
			Collection<MyClass> list2 = Arrays.asList(myArray);
//			List<MyClass> list2 = Arrays.asList(myArray);
			
			list2.forEach(m -> System.out.println(m.getLable()));
		
		
		
	}

}
