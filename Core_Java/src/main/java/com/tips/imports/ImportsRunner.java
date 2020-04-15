package com.tips.imports;

import static java.lang.System.out;
import static java.util.Collections.sort;

import java.math.BigDecimal;
import java.util.ArrayList;


public class ImportsRunner {

	public static void main(String[] args) {
	
		String str="";
		
		BigDecimal big;
		
//		System.out.println("imports");
		out.println("static import");
		
		//2nd example of static import
//		Collections.sort(new ArrayList<String>());
		
		sort(new ArrayList<String>());
		
	}

}
