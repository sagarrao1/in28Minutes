package com.JimWilson.ExerciseCmdLine;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertyFileWrite {

	public static void main(String[] args) {
		Properties props = new Properties();
		props.setProperty("displayName", "Jim Wilson");
		props.setProperty("accountNumber", "123-456-789");
		
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("xyz.properties")) )  {
			props.store(writer, "My comments");
		} catch (Exception e) {
			System.out.println(e.getClass().getSimpleName()+ " - "+ e.getMessage());
		}
		

	}

}
