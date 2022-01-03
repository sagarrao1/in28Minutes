package com.JimWilson.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.JimWilson.threads.concurrency.BankAccount;

public class ReflectionDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		BankAccount acct=  new BankAccount(100);
		doWork(acct);		
		
//		2nd way
		Class<?> cName = Class.forName("com.JimWilson.threads.concurrency.BankAccount");
		showName(cName);
		
//		3rd Way
		Class<?> c3= BankAccount.class;
		showName(c3);
		
//		Accessing super class and interfaces
		objectInfo(acct);
		
//		Accessing all oublic and private fields
		fieldInfo(acct);

//		Accessing all method info, method will have return parameters
		methodInfo(acct);		
	}
	
	public static void doWork(Object obj) {
		Class<? > c = obj.getClass();
		showName(c);
	}
	
	public static void showName(Class<?> thisClass) {
		System.out.println(thisClass.getSimpleName());
		
	}

	public static void objectInfo(Object obj) {
		Class<? > thisClass = obj.getClass();
		System.out.println(thisClass.getSimpleName());
		
		
		Class<? > superClass = thisClass.getSuperclass() ;
		System.out.println( "SuperClass : "+superClass.getSimpleName());
		
		Class<?>[] interfaces = thisClass.getInterfaces() ;
		for (Class<?> interf : interfaces) {
			System.out.println( "interface : " +interf.getSimpleName());
		}
		
		boolean interface1 = thisClass.isInterface();
			System.out.println( "interface1 : " +interface1);
			
		int modifiers = thisClass.getModifiers();
		
		if (Modifier.isFinal(modifiers)) {
			System.out.println( "class has Final modifier " );
		}
		if (Modifier.isPublic(modifiers)) {
			System.out.println( "class has Public modifier " );
		}
	}
	
	
	public static void fieldInfo(Object obj) {
		Class<?> thisClass1 = obj.getClass();
		Field[] fields = thisClass1.getFields();
		
		for (Field field : fields) {
			System.out.println("field : "+field);
		}

		Field[] fields1 = thisClass1.getDeclaredFields();
		
		for (Field field : fields1) {
			System.out.println("private field : "+field);
		}
	}
	
	public static void methodInfo(Object obj) {
		Class<?> thisClass2 = obj.getClass();
		Method[] methods = thisClass2.getMethods();
		
		for (Method method : methods) {
			System.out.println("method : "+method);
		}

		Method[] methods1 = thisClass2.getDeclaredMethods();
		
		for (Method method : methods1) {
			System.out.println("private method : "+method);
		}
		
		System.out.println("************************");
//		not to display Object class methods like equals(), toString(), getClass()
		for (Method method : methods) {
			
			if (method.getDeclaringClass() != Object.class) {
				System.out.println("method : "+method);
			}
		}
	}
	
}
