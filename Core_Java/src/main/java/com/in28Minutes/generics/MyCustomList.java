package com.in28Minutes.generics;

import java.util.ArrayList;
import java.util.List;

public class MyCustomList<T> {

	List<T> list = new ArrayList<>();


	public void addElement(T elelment) {
		list.add(elelment);
	}

	public void removeElement(T elelment) {
		list.remove(elelment);
	}

	public T getElement(int index) {
		return list.get(index);
	}

	@Override
	public String toString() {
		return "MyCustomList [list=" + list + "]";
	}

}
