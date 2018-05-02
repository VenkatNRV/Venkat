package org.qspiders.calculatorapp;

public class GSTCalculator {
	void calculateGST(double productPrice) {
		double gst = productPrice * 0.18;
		double totalCost = productPrice + gst;
		System.out.println("The base price of product is : " + productPrice);
		System.out.println("GST of the product is : " + gst);
		System.out.println("Total cost of the product is : " + totalCost);
	}

	public static void main(String[] args) {
		GSTCalculator g = new GSTCalculator();
		g.calculateGST(155.35);
	}

}
