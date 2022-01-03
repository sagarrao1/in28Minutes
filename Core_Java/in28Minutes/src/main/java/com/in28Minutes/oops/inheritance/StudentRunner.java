package com.in28Minutes.oops.inheritance;

public class StudentRunner {

//	Inheritance is IS A relationship
	public static void main(String[] args) {
		Student student = new Student("Sagar", "GangesVolley");
		
//		student.setName("Sagar");
//		student.setEmail("sagar@gmail.com");
//		student.setPhoneNumber(123456789);;
//		student.setCollegeName("GangesVolley");
//		student.setYear(2018);

		System.out.println(student);
		
//		If a class does not extend any class budeafult it automatically extends Object class
//		Person person = new Person();
//		String value = person.toString(); // it gets all inherited methods from Object
//		System.out.println(value); // like toString, equals,hascode, etc..
//		System.out.println(person);
//
//		System.out.println(person.getClass().getName());
//		System.out.println(person.getClass().getSimpleName());
//		System.out.println(person.getClass().getTypeName());
	}

}
