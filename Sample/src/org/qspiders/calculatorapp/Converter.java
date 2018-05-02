package org.qspiders.calculatorapp;

public class Converter {
	double convertDegreeCelciusToFah(double celcius) {
		double farenheit = celcius * 1.8 + 32;
		return farenheit;
	}

	double convertFahToDegreeCelcius(double fah) {
		double celcius = (fah - 32) / 1.8;
		return celcius;
	}

	public static void main(String[] args) {
		Converter c = new Converter();
		double fah = c.convertDegreeCelciusToFah(38);
		System.out.println("Degree to Farenheit : " + fah);
		System.out.println("Fah to Celcius : " + c.convertFahToDegreeCelcius(100.4));
	}
}
