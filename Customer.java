package com.shop.app.customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {

	private int customerId;
	private String name;
	private String location;

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
