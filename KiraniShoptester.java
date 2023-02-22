package com.shop.app;

import com.shop.app.customer.Customer;
import com.shop.app.shop.KiraniShop;
import com.shop.app.shop.Shop;

public class KiraniShoptester {

	public static void main(String[] args) {
		Shop shop = new KiraniShop();
		Customer customer = new Customer(1, "Arjun", "Hosur");
		Customer customer1 = new Customer(2, "Arun", "Hosur cross");

		shop.save(customer1);
		shop.save(customer);
		shop.getCustomer();

		// down casting..... adding some implementation in sub classes
		KiraniShop kiranishop = (KiraniShop) shop;

		// making child class object with the help of parent class reference its
		// upcasting..
	}

}
