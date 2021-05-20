package com.in28minutes.javaBasics;

public class StringClass implements Cloneable{
	
	private String a= "clone test";
	

	public static void main(String[] args) {
//		String str1 = "value1";
//		str1.concat("value2");
//		System.out.println(str1.concat("value2"));
//		System.out.println(str1);

		
		String str="Testing";
		System.out.println(str.toString());
		System.out.println(str.hashCode());
//		System.out.println(str.clone());
	
		StringClass obj=  new StringClass();
		try {
			StringClass obj2 = (StringClass) obj.clone();
			System.out.println(obj2.a);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 if (str instanceof Object) {
		
			 System.out.println("str is instance of Object");
			
		}
		
	}

}
