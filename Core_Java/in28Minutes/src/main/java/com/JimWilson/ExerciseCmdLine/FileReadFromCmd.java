package com.JimWilson.ExerciseCmdLine;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReadFromCmd {

	public static void main(String[] args) {
		if (args.length == 0) {
			showMessage();
			return;
		} 
		
		String file= args[0];
		if ( ! Files.exists(Paths.get(file))) {
			System.out.println("\n File name found "+ file);
			return;
		}
		
		showFileLines(file);	 	
		
	}
	
	
	public static void showFileLines(String fileName) {		
		
		try(BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {
			String line=null;
			while( (line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch(Exception ex) {
			System.out.println(ex.getClass().getSimpleName() +" - " + ex.getMessage());
		}
	}
	
	
	public static void showMessage() {
		System.out.println();
		System.out.println("PLease enter file name as argumeent to Main method");
	}
	

}
