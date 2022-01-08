package com.JimWilson.serializatation;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectInputStream.GetField;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DeSerializingDemo {

	public static void main(String[] args) {
		BankAccount acct = 	loadAccount("./src/main/resources/serializeFile.dat");
		System.out.println("Balance :" +acct);			
	}
	
//	De-Serializing Object state from file (getting Object state from file)
	public static BankAccount loadAccount(String filename) {
		BankAccount ba=null;
		
		try(ObjectInputStream objectStream= new  ObjectInputStream(
				Files.newInputStream(Paths.get(filename) ) )) {				
			ba = (BankAccount) objectStream.readObject();
			
//			System.out.println(" ba Balance :" +ba.getBalance());	
		} catch (IOException e) {
			System.out.println("catch 1 :"+e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("catch 2 :"+e.getMessage());
		}
		return ba;
		
		
	}

}
