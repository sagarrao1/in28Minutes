package com.JimWilson.ExerciseCmdLine;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertyFileReader {

	public static void main(String[] args) {
		Properties props =  new Properties();
		
		
		try (BufferedReader reader = Files.newBufferedReader(Paths.get("myapp.properties"))) {
			props.load(reader);
			
			String string1 = props.getProperty("val1");			
			System.out.println(string1);
			
			System.out.println(props.getProperty("val2"));
			System.out.println(props.getProperty("val3"));
			System.out.println(props.getProperty("val4"));
			
			
			
		} catch (Exception e) {
			System.out.println(e.getClass().getSimpleName()+ " - "+ e.getMessage());
		}
	}

}
