package com.in28minutes.spring.example1.database;

import java.util.List;

public class Database {
		public static List<String> retriveTodos(String user) {
			throw new RuntimeException("Database is down");
//			return Arrays.asList("Learn Spring", "Learn Struts", "Learn to Dance");
		}

	}
