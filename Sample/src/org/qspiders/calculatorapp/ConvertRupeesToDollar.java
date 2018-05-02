package org.qspiders.calculatorapp;

public class ConvertRupeesToDollar {
	void convertRupeesToUSD(double rupees) {
		double USD = rupees / 64.8;
		double comm = USD * 0.03;
		double totalValue = USD - comm;
		System.out.println("The total conversion value is :  " + USD);
		System.out.println("The commission value is : " + comm);
		System.out.println("The total value is : " + totalValue);
	}

	public static void main(String[] args) {
		ConvertRupeesToDollar c = new ConvertRupeesToDollar();
		c.convertRupeesToUSD(1000);
	}

}
