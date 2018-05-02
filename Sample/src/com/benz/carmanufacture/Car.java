package com.benz.carmanufacture;

public class Car {
	Smoke fill(Petrol p) {
		System.out.println("Accepting Petrol");
		System.out.println("Generating Smoke");
		Smoke s = new Smoke();
		System.out.println("Return Smoke");
		return s;
	}

	Smoke fill(Diesel d) {
		System.out.println("Accepting Diesel");
		System.out.println("Generating Smoke");
		Smoke s = new Smoke();
		System.out.println("Return Smoke");
		return s;
	}

	Smoke fill(Gasoline g) {
		System.out.println("Accepting Gasoline");
		System.out.println("Generating Smoke");
		Smoke s = new Smoke();
		System.out.println("Return Smoke");
		return s;
	}
}
