package com.JimWilson.stringRegex;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		
		StringJoiner sj = new StringJoiner(", ");
		sj.add("gamma");
		sj.add("beta");
		sj.add("alpha");		
		String result=  sj.toString();
		System.out.println(result);
		//gamma, beta, alpha

		StringJoiner sj2 = new StringJoiner(", ");
		sj2.add("gamma").add("beta").add("alpha");		
		String result2=  sj2.toString();
		System.out.println(result2);
		
//		with prefix and suffix
		StringJoiner sj3 = new StringJoiner(", ", "{ ", " }");
		sj3.add("gamma").add("beta").add("alpha");		
		String result3=  sj3.toString();
		System.out.println(result3);

//		with prefix and suffix
		StringJoiner sj4 = new StringJoiner(" ], [ ", "[ ", " ]");
		sj4.add("gamma").add("beta").add("alpha");		
		String result4=  sj4.toString();
		System.out.println(result4);		
		

//		customizing empty handling
		StringJoiner sj5 = new StringJoiner(", ");
		sj5.setEmptyValue("EMPTY");
		String result5=  sj5.toString();		
		System.out.println(result5);
		
		sj5 = new StringJoiner(", ", "{ ", " }");
		sj5.setEmptyValue("EMPTY");
		result5=  sj5.toString();		
		System.out.println(result5);
		
	}

}
