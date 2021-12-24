package com.JimWilson.ExerciseCmdLine;

import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertyFileWriteXml {

	public static void main(String[] args) {
		Properties props = new Properties();
		props.setProperty("displayName", "Jim Wilson");
		props.setProperty("accountNumber", "123-456-789");
		
		try (OutputStream out = Files.newOutputStream(Paths.get("props.xml")) )  {
			props.storeToXML(out, "My comments");
		} catch (Exception e) {
			System.out.println(e.getClass().getSimpleName()+ " - "+ e.getMessage());
		}
		

	}

}
