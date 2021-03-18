package com.in28minutes.CouplingProblemSolution;

class ShoppingCart{
	public ShoppingCartEntry[] items;
	
	
	public ShoppingCartEntry[] getItems() {
		return items;
	}

	public void setItems(ShoppingCartEntry[] items) {
		this.items = items;
	}		
	
	
	public float getTotalPrice() {
		float totalPrice=0;
		for (ShoppingCartEntry shoppingCartEntry : items) {
			totalPrice += shoppingCartEntry.totalPrice();
		}
		
		return totalPrice;
	}
	
}

