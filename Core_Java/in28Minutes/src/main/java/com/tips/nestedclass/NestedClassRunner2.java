package com.tips.nestedclass;

import com.tips.nestedclass.NestedClassRunner.InnerClass;
import com.tips.nestedclass.NestedClassRunner.StaticNestedClass;

public class NestedClassRunner2 {
	
	public static void main(String[] args) {
		Default defaultClass = new Default();
		
		StaticNestedClass staticNestedClass= new StaticNestedClass();
		System.out.println(staticNestedClass.j);
		
		NestedClassRunner outerClass=  new NestedClassRunner();
		InnerClass innerClass = outerClass.new InnerClass();
		System.out.println(innerClass.i);
		System.out.println("k : "+innerClass.k);

		
	}

}

