package com.JimWilson.ExerciseCmdLine;

import java.util.Map;

public class SystemPropertiesAndEnvironemntVar {

	public static void main(String[] args) {
		
//		system properties specific to java app provides
		
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("java.vendor"));
		System.out.println(System.getProperty("java.version"));
		
//		Environment variables ar at OS level values
		
		System.out.println(System.getenv("COMPUTERNAME"));
		System.out.println(System.getenv("SystemRoot"));
		
//		To list all env variables
		Map<String, String> map = System.getenv();		
		map.forEach((k,v) -> System.out.println(k + " - "+v));
		
		

	}

}
