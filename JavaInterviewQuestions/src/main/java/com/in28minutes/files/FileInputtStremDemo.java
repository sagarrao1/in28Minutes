package com.in28minutes.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputtStremDemo {

	public static void main(String[] args) {
		File file = new File("src\\main\\resources\\bikeInfo.txt");
		FileInputtStremDemo demo =  new FileInputtStremDemo();
		demo.writeToFile(file);

	}
	
	private void writeToFile(File file) {
		FileInputStream fileWriter=null;
		
		try {
			fileWriter = new FileInputStream(file);
			 while ((fileWriter.read()) != -1) {
				 System.out.println( (char) fileWriter.read());
			 }
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	
}
