package com.in28minutes.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Rectangle1 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int length;
	private int width;	
	 transient private int area;

	public Rectangle1(int length, int width) {
		this.length = length;
		this.width = width;
		this.area = length*width;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public int getArea() {
		return area;
	}	
	
	
	
	
}


public class SerializationPracticed {	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileOutputStream fs=  new FileOutputStream("rectangle.ser");
		ObjectOutputStream os = new ObjectOutputStream(fs);		
		os.writeObject(new Rectangle1(5,6));
		os.close();
		
		
		FileInputStream fi  = new FileInputStream("rectangle.ser");
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		Rectangle1 rectangle = (Rectangle1) oi.readObject();
		oi.close();
		
		System.out.println(rectangle.getLength());
		System.out.println(rectangle.getWidth());
		System.out.println(rectangle.getArea());
		
	}
	
	

}
