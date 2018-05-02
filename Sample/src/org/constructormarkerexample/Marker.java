package org.constructormarkerexample;

class Marker {
	String color;
	int price = 50;
	String brand = "Camlin";

	// below is the example for one parameter custom constructor
	Marker(String color) {
		this.color = color;
	}

	public static void main(String[] args) {
		Marker m1=new Marker("Black");
		System.out.println(m1);
		System.out.println(m1.color+" "+m1.brand+" "+m1.price);
		Marker m2=new Marker("Green");
		System.out.println(m2.color+" "+m2.brand+" "+m2.price);
	}
}
