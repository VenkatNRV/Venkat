package org.qspiders.calculatorapp;

public class GreetingDevice {
	void greet() {
		System.out.println("Hello");
	}

	void greet(String name) {
		System.out.println("Hello " + name);
	}

	public static void main(String[] args) {
		GreetingDevice g = new GreetingDevice();
		g.greet();
		g.greet();
		g.greet("Ricky");
		g.greet("Steve");
		

	}
}