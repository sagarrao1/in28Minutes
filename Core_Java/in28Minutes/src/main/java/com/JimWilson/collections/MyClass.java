package com.JimWilson.collections;

public class MyClass implements Comparable<MyClass>{
	
	private String lable;
	private String value;	

	public MyClass(String lable, String value) {
		super();
		this.lable = lable;
		this.value = value;
	}

	public String getLable() {
		return lable;
	}

	public void setLable(String lable) {
		this.lable = lable;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		/*
		 * if (this == obj) return true; if (obj == null) return false; if (getClass()
		 * != obj.getClass()) return false; MyClass other = (MyClass) obj; if (value ==
		 * null) { if (other.value != null) return false; } else if
		 * (!value.equals(other.value)) return false; return true;
		 */
		
		MyClass other =(MyClass) obj;
		return value.equalsIgnoreCase(other.value);
	}

//	comparing using values only here
	@Override
	public int compareTo(MyClass other) {
		return value.compareToIgnoreCase(other.value);
	}

	@Override
	public String toString() {
		return "MyClass [lable=" + lable + ", value=" + value + "]";
	}

	

}
