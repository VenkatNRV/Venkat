package org.amazon.paymentapp;

public class Amazon {
	Product pay(Wallet w) {
		System.out.println("Accepted payment using Wallet");
		System.out.println("Product is packed");
		Product p = new Product();
		System.out.println("Delivering the product to the customer");
		return p;
	}

	Product pay(CreditCard w) {
		System.out.println("Accepted payment using Credit Card");
		System.out.println("Product is packed");
		Product p = new Product();
		System.out.println("Delivering the product to the customer");
		return p;
	}

	Product pay(DebitCard w) {
		System.out.println("Accepted payment using DebitCard");
		System.out.println("Product is packed");
		Product p = new Product();
		System.out.println("Delivering the product to the customer");
		return p;
	}

}
