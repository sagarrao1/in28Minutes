package com.in28Minutes.generics;

import java.util.ArrayList;
import java.util.List;

public class MyCustomListOld {

	List<String> list = new ArrayList<>();


	public void addElement(String elelment) {
		list.add(elelment);
	}

	public void removeElement(String elelment) {
		list.remove(elelment);
	}
}
