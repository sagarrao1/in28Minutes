package com.in28minutes.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class House implements Serializable {
	public House(int number) {
		super();
		this.number = number;
	}

	Wall wall;
	int number;
}

class Wall implements Serializable {
	int length;
	int breadth;
	int color;
}

public class SerializationExamples2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileOutputStream fileStream = new FileOutputStream("House.ser");
		ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
		House house = new House(10);
		house.wall = new Wall();
		// Exception in thread "main" java.io.NotSerializableException:
		// com.rithus.serialization.Wall
		objectStream.writeObject(house);
		objectStream.close();
		
		
		FileInputStream fi  = new FileInputStream("House.ser");
		ObjectInputStream oi = new ObjectInputStream(fi);		
		House house1 = (House) oi.readObject();
		oi.close();
		
		System.out.println(house1.number);
		System.out.println(house1.wall.breadth);
		System.out.println(house1.wall.length);
	}
}
