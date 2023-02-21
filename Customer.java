package com.shop.app.customer;

public class Customer {

	public int customerId;
	public String name;
	public String location;

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", location=" + location + "]";
	}

	public Customer(int customerId, String name, String location) {
		this.customerId = customerId;
		this.name = name;
		this.location = location;

	}

	public Customer() {

	}


}
