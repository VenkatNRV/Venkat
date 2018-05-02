package org.qspiders.calculatorapp;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("Addition:" + c.add(41, 31));
		System.out.println("Multiplication: " + c.mul(2, 5));
		System.out.println("Subtraction:" + c.sub(4, 2));
		System.out.println("Division: " + c.div(5, 2));
		int square = c.square(15);
		System.out.println("square:" + square);
		int cube = c.cubeOfNumber(3);
		System.out.println("Cube:" + cube);
		System.out.println("HourToMinutes:" + c.convertHourToMinute(2));

	}
}
