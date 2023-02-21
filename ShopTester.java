package com.shop.app;

import com.shop.app.customer.Customer;
import com.shop.app.shop.Shop;

public class ShopTester {

	public static void main(String[] args) {
		Shop shop = new Shop();
		
		Customer customer = new Customer(1, "Vishal", "Bangalore");
		Customer customer2 = new Customer(2, "Kushal", "Tumkur");
		
		shop.save(customer);
		shop.save(customer2);
		shop.getCustomer();

	}
}
