package com.in28Minutes.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

//Files.list returns stream of file names. It is not recursive means it gives files of current directory not underneath.
//It expects Path as input.

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {
		
		Path currentDirectory = Paths.get(".");
		
//		Files.list(Paths.get(".")).forEach(e -> System.out.println(e)); // bothe are same.below is using method reference
//		Files.list(currentDirectory).forEach(System.out::println);
		
		Predicate<? super Path> predicate= path -> String.valueOf(path).contains(".java");
		
		// how many level you want to go 
//		Files.walk(currentDirectory, 10)
//		.filter(path -> String.valueOf(path).contains(".java")) // wrting same defining predicate outside
//		.filter(predicate)
//		.forEach(System.out::println);
		
//		Another way file name using find method
//		it has more features than walk like isdirectory, last modified date of file using attributes method
		
		BiPredicate<Path, BasicFileAttributes> javaMatcher
		  =(path, attributes) -> String.valueOf(path).contains(".java");

		BiPredicate<Path, BasicFileAttributes> directoryMatcher
		  =(path, attributes) -> attributes.isDirectory();

//		Files.find(currentDirectory, 10, javaMatcher)
//			.forEach(System.out::println);
		
		Files.find(currentDirectory, 10, directoryMatcher)
			.forEach(System.out::println);

	}

}

//There are 3 types of functional interfaces
//Predicate accepts a value and tells true or false
//Functions accepts a value and returns a value
//Consumer accepts value and consumes it , does not return a value
