package com.in28minutes.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		File file = new File("src\\main\\resources\\bikeInfo.txt");
		FileWriterDemo demo =  new FileWriterDemo();
		demo.writeToFile(file);

	}
	
	private void writeToFile(File file) {
		FileWriter fileWriter=null;
		
		try {
			fileWriter = new FileWriter(file);
			fileWriter.write("Dukati");			
			fileWriter.write("Yamaha");
			fileWriter.flush();
			
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
