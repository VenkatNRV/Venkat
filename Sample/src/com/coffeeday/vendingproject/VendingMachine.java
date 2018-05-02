package com.coffeeday.vendingproject;

public class VendingMachine {
	// Preparing cold water
	Givcoldwater prepare(Water w) {
		System.out.println("Creating coldwater object");
		Givcoldwater cw = new Givcoldwater();
		System.out.println("Givcoldwater object is created and it gives the cold water");
		return cw;
	}

	// Preparing coffee
	Givcoffee prepare(Coffeebean cb) {
		System.out.println("Creating Givcoffee object");
		Givcoffee gc = new Givcoffee();
		System.out.println("Givcoffee object is created and it gives the Coffee");
		return gc;
	}

	// Preparing Apple juice
	Givapplejuice prepare(Apple a) {
		System.out.println("Creating Givapplejuice object");
		Givapplejuice ga = new Givapplejuice();
		System.out.println("Givapplejuice object is created and it gives the Apple Juice");
		return ga;
	}
}
