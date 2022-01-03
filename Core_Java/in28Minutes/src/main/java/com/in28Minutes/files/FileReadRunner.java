package com.in28Minutes.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;

//Files.list returns stream of file names. It is not recursive means it gives files of current directory not underneath.
//It expects Path as input.

public class FileReadRunner {

	public static void main(String[] args) throws IOException {
		
		Path currentDirectory = Paths.get(".");
//		Files.list(currentDirectory).forEach(System.out::println);
		
		BiPredicate<Path, BasicFileAttributes> directoryMatcher
		  =(path, attributes) -> attributes.isDirectory();
		  
//		Files.find(currentDirectory, 10, directoryMatcher)
//		      .forEach(System.out::println);;
		      
    // above is get resource path, we need it to need data.txt file .\src\main\resources
		      
		 Path dataFilePathToRead = Paths.get("./src/main/resources/data.txt");
	     List<String> lines = Files.readAllLines(dataFilePathToRead);
//	     System.out.println(lines);
		      
//		above one reads all lines at once. will be problem if file has more data
	    
//	     Below is read file the using Streams, so that we process file one line a time
//	     and apply all stream funtions like  filer, map
	     
	     Files.lines(dataFilePathToRead)
	      .filter(str -> str.contains("a"))
	      .map(e ->e.toLowerCase())   // another way using method reference .map(String::toLowerCase)    
	      .forEach(System.out::println);     
	}

}
