package com.JimWilson.ExerciseCmdLine;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertyReadinFromFileWithDefaultFile {

	public static void main(String[] args) {
		try {
			Properties defaultProps=  new Properties();
			
			try(InputStream in = 
				  PropertyReadinFromFileWithDefaultFile.class.getResourceAsStream("MyDefaultValues.xml") ) {				
				defaultProps.loadFromXML(in);
			} 
			
			Properties userProps = new Properties(defaultProps);
			loadUserProps(userProps);
			
			String welcomeMsg = userProps.getProperty("welcomeMessage");
			String fareWellMsg= userProps.getProperty("farewellMessage");
			System.out.println(welcomeMsg);
			System.out.println(fareWellMsg);
			
			 if(userProps.getProperty("isFirstRun").equalsIgnoreCase("Y")) {
	                userProps.setProperty("welcomeMessage", "Welcome back 2");
	                userProps.setProperty("farewellMessage", "Things will be familiar now 2");
	                userProps.setProperty("isFirstRun", "N");
	                saveUserProps(userProps);
	            }			
			
		} catch (Exception e) {
			System.out.println("Exception <" + e.getClass().getSimpleName() + "> " + e.getMessage());
		}
	}
	
	
	public static Properties loadUserProps( Properties userProps) {
		Path useFile = Paths.get("userValues.xml");	
		if(Files.exists(useFile)) {
			try(InputStream in = Files.newInputStream(useFile)) {
				userProps.loadFromXML(in);
			} catch (Exception e) {
				System.out.println(e.getClass().getSimpleName()+ " - "+ e.getMessage());
			}
		}		
		return userProps;
	}
	
	public static void saveUserProps(Properties userProps) {
		try (OutputStream out = Files.newOutputStream(Paths.get("userValues.xml"))) {
			userProps.storeToXML(out, null);
		} catch (Exception e) {
			System.out.println(e.getClass().getSimpleName()+ " - "+ e.getMessage());
		}
		
	}

}
