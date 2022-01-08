package com.JimWilson.serializatation;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializingDemo {
		
	public static void main(String[] args) {
		BankAccount acct=  new BankAccount("1234", 200);
		acct.deposit(300);
		saveAccount(acct, "./src/main/resources/serializeFile.dat");
	}
	
//	Serializing Object state to file (saving state to file)
	public static void saveAccount(BankAccount ba, String filename) {
		
		try(ObjectOutputStream objectStream= new  ObjectOutputStream(
				Files.newOutputStream(Paths.get(filename) ) )) {				
			objectStream.writeObject(ba);			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
