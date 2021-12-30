package com.JimWilson.threads;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SingleThread {

	public static void main(String[] args) {
		String[] inFiles= {".//src//main//resources//iFile1.txt",".//src//main//resources//iFile2.txt",".//src//main//resources//iFile3.txt"};
		String[] outFiles = {".//src//main//resources//oFile1.txt",".//src//main//resources//oFile2.txt",".//src//main//resources//oFile3.txt"};
		
		for (int i = 0; i < outFiles.length; i++) {
			Adder adder =  new Adder(inFiles[i],outFiles[i]);
			adder.doAdd();
		}
	}

}

class Adder{
	private String inFile, outFile;	
	
	public Adder(String inFile, String outFile) {
		this.inFile = inFile;
		this.outFile = outFile;
	}

	public void doAdd() {
		int total=0;
		String line=null;
		
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(inFile)) )  {
			while ((line = reader.readLine()) !=null) {
				total += Integer.parseInt(line);
			}
		try(BufferedWriter writer = Files.newBufferedWriter(Paths.get(outFile))){
			writer.write("Total : "+total);
		}
		
		} catch (Exception e) {
		System.out.println(e.getClass().getSimpleName()+" - "+e.getMessage());
		}	
		
	}
}
