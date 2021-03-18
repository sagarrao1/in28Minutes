package com.in28minutes.CouplingProblem;

class Order {
	
	private ShoppingCart cart;
	private float salesTax;
	
	public Order(ShoppingCart cart, float salesTax) {
		super();
		this.cart = cart;
		this.salesTax = salesTax;
	}

	public float orderTotalPrice() {
		float carTotalPrice=0;
		for (int i = 0; i < cart.items.length; i++) {
			carTotalPrice += cart.items[i].price*cart.items[i].qty;				
			}				
		return carTotalPrice*salesTax;
	}
		
	
}

