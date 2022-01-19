package com.JimWilson2.interfaces;

public class Passanger implements Comparable<Passanger>{
	
	private String name;
	private int memberLevel; // 3 is highest 1 is lowest
	private int memberDays;
	
	
	public Passanger(String name, int memberLevel, int memberDays) {
		this.name = name;
		this.memberLevel = memberLevel;
		this.memberDays = memberDays;
	}


//	returnValue -1(negative)  -> retunr current Object
//	returnValue 1(positive)  -> retunr received Object (o)
//	returnValue 0  -> both are equal
	
	@Override
	public int compareTo(Passanger o) {
		int returnValue = o.memberLevel- memberLevel;		
		if (returnValue == 0)
			returnValue = o.memberDays - memberDays;
		
		return returnValue;
	}


	@Override
	public String toString() {
		return "Passanger [name=" + name + ", memberLevel=" + memberLevel + ", memberDays=" + memberDays + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMemberLevel() {
		return memberLevel;
	}


	public void setMemberLevel(int memberLevel) {
		this.memberLevel = memberLevel;
	}


	public int getMemberDays() {
		return memberDays;
	}


	public void setMemberDays(int memberDays) {
		this.memberDays = memberDays;
	}
	
	
	
	

}
