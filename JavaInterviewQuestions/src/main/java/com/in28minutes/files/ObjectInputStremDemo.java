package com.in28minutes.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStremDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("src\\main\\resources\\serializeFile.txt");
		ObjectInputStremDemo demo = new ObjectInputStremDemo();
		demo.deSerializeToFile(file);
	}

	private void deSerializeToFile(File file) throws IOException {
		FileInputStream fileStream = new FileInputStream(file);
		ObjectInputStream objStream = new ObjectInputStream(fileStream);
		try {
			VehicleInfo readVehicleObj = (VehicleInfo) objStream.readObject();
			System.out.println(readVehicleObj);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
