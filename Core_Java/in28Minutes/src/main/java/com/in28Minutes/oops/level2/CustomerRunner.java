package com.in28Minutes.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("road no. 2", "Hyderabad", "500090");
		Customer customer = new Customer("Sagar", homeAddress);

		Address workAddress = new Address("street 1", "Bangalore", "6520123");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
	}

}
