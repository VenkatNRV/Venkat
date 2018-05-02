package org.qspiders.calculatorapp;

public class GenDecide {
	String genderDecision(int no) {
		// String gen;
		if (no == 1) {
			return "Boy";
		} else if (no == 2) {
			return "Girl";
			
		} else
			return "Nil";
	}

	public static void main(String[] args) {
		GenDecide no = new GenDecide();
		System.out.println("Gender decision is : " + no.genderDecision(2));
	}
}
