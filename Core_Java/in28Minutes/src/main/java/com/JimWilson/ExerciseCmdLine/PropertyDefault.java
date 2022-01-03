package com.JimWilson.ExerciseCmdLine;

import java.util.Properties;

public class PropertyDefault {

	public static void main(String[] args) {
		Properties defaults= new Properties();		
		defaults.setProperty("position", "1");
		
//		Passing deafults to another property
		Properties props= new Properties(defaults);
		String string = props.getProperty("position");
		System.out.println(string);  // 1

		int iPOs= Integer.parseInt(string);
		props.setProperty("position", Integer.toString(++iPOs));
		
		String string2 = props.getProperty("position");
		System.out.println(string2);  // 2

	}

}
