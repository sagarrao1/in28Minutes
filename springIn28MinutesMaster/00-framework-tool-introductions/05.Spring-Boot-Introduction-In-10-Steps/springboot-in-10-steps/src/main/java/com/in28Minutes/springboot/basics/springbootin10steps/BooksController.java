package com.in28Minutes.springboot.basics.springbootin10steps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return Arrays.asList(
				new Book(1001, "Mastering Spring 5.2", "Sagar rao"),
				new Book(1002, "Mastering Chef", "Sanju Kokkirala"));
	}
}