package com.in28minutes.CouplingProblemSolution;

public class ShoppingCartEntry {
	public float price;
	public int qty;
	
	
	public float totalPrice() {
		return price*qty;
	}
}