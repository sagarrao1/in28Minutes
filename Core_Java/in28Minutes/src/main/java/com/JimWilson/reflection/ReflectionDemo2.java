package com.JimWilson.reflection;

import java.lang.reflect.Method;

import com.JimWilson.threads.concurrency.BankAccount;

public class ReflectionDemo2 {

	public static void main(String[] args) throws ClassNotFoundException {
		BankAccount acct=  new BankAccount(200);

//		Method Access and invoke method using reflection
		callGetbalance(acct);
		
//		Method Access and invoke method which takes parameters using reflection
		callDeposit(acct, 300);
		
//		Instance creation with reflection. constructor can be executed
//		calling newInstace() method is like calling no arg constructor of class
		
		
	}
	
	public static void callGetbalance(Object obj) {				
		try {
			Class<?> thisClass = obj.getClass();
			Method method = thisClass.getMethod("getBalance");
			Object result = method.invoke(obj);
			System.out.println("result :"+result);
			
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	public static void callDeposit(Object obj, int amt) {				
		try {
			Class<?> thisClass = obj.getClass();
			 Method method = thisClass.getMethod("deposit", int.class);
			Object result = method.invoke(obj, amt);
//			System.out.println("result :"+result);
			
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
}
