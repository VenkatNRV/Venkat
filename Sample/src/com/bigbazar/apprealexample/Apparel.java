package com.bigbazar.apprealexample;

public class Apparel {
	String type;
	String color;
	char size;

	// example for 3 parameter custom constructor
	Apparel(String type, String color, char size) {
		this.type = type;
		this.color = color;
		this.size = size;
	}

	// below is the example for constructor overloading
	Apparel(String type, char size) {
		this.type = type;
		this.size = size;
		this.color = "Black";
	}

	void showDetails() {
		System.out.println(this.type + " " + this.color + " " + this.size);
	}

	public static void main(String[] args) {
		Apparel a = new Apparel("Jean", "Blue", 'M');
		a.showDetails();
		Apparel a2 = new Apparel("T shirt", "Green", 'S');
		a2.showDetails();

		// Apparel a3=new Apparel();
		Apparel a3 = new Apparel("Shirt", 'L');
		a3.showDetails();

	}
}
