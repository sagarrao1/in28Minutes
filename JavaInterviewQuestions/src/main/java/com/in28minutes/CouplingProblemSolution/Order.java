package com.in28minutes.CouplingProblemSolution;

class Order {
	
	private ShoppingCart cart;
	private float salesTax;
	
	public Order(ShoppingCart cart, float salesTax) {
		super();
		this.cart = cart;
		this.salesTax = salesTax;
	}

	public float orderTotalPrice() {
		return cart.getTotalPrice()*salesTax;
	}
		
	
}

