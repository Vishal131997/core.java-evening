package com.shop.app.shop;

import com.shop.app.customer.Customer;

public class KiraniShop implements Shop {
	Customer c[] = new Customer[2];
	int index;

	public KiraniShop() {
		System.out.println("Shop object is created");
	}

	@Override
	public boolean save(Customer customer) {
		System.out.println("Save method started");
		boolean isSaved = false;
		if (customer.getName() != null) {
			this.c[index++] = customer;
			isSaved = true;
		}
		return isSaved;
	}

	@Override
	public void getCustomer() {
		System.out.println("Customer Details");
		for (int i = 0; i < this.c.length; i++) {
			System.out.println(c[i]);
		}

	}
}
