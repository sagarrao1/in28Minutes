package com.tips.accessModifiers.package2;

public class MethodAccessRunnerProtectedInDiffertPkg {

	public static void main(String[] args) {
		extendsExample extendExample = new extendsExample();
		
		extendExample.publicMethod();
//		extendExample.privateMethod();
//		we can't access private methods in different package
		extendExample.protectedMethod();
//		extendExample.defaultMethod();

	}

}
