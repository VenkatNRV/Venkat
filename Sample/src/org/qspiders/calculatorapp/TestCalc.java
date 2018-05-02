package org.qspiders.calculatorapp;

public class TestCalc {
	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println("Result addition of 2 numbers : " + c.add(2, 2));
		int x = c.add(3, 5, 7);
		System.out.println("Result addition of 3 numbers : " + x);
		System.out.println("Result addition of 4 numbers : " + c.add(5, 7, 9, 15));
	}
}
