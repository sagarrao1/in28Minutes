package com.in28minutes.CouplingProblemSolution;

public class CouplingProblemSolution {		

	public static void main(String[] args) {
		ShoppingCartEntry entry1 = new ShoppingCartEntry();
		entry1.price=(float) 2.2;
		entry1.qty=2;

		ShoppingCartEntry entry2 = new ShoppingCartEntry();
		entry2.price=(float) 3.3;
		entry2.qty=3;

		ShoppingCartEntry[] ims=  new ShoppingCartEntry[2];
		ims[0]= entry1;
		ims[1]= entry2;
		
		ShoppingCart cart = new ShoppingCart();
		cart.setItems(ims);

		Order order =  new Order(cart, 1.2f);		
		System.out.println("orderTotalPrice :"+order.orderTotalPrice());
	}
}