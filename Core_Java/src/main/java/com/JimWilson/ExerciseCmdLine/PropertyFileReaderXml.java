package com.JimWilson.ExerciseCmdLine;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertyFileReaderXml {

	public static void main(String[] args) {
		Properties props =  new Properties();
		
		try (InputStream in = Files.newInputStream(Paths.get("props.xml"))) {
			props.loadFromXML(in);
			
			String string1 = props.getProperty("displayName");			
			System.out.println(string1);
			
			System.out.println(props.getProperty("accountNumber"));
			
		} catch (Exception e) {
			System.out.println(e.getClass().getSimpleName()+ " - "+ e.getMessage());
		}
	}

}
