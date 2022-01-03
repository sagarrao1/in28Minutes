package com.JimWilson.collections;

import java.util.Comparator;

public class MyComparator implements Comparator<MyClass> {

	// compare using Myclass lable this time
//	so that you can understand difference
	
	@Override
	public int compare(MyClass x, MyClass y) {
		// TODO Auto-generated method stub
		return x.getLable().compareToIgnoreCase(y.getLable());
	}

}
