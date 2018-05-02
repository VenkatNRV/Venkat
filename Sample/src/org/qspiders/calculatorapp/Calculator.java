package org.qspiders.calculatorapp;

public class Calculator {
	int add(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}

	int mul(int num1, int num2) {
		int res = num1 * num2;
		return res;
	}

	int sub(int num1, int num2) {
		int res = num1 - num2;
		return res;
	}

	double div(double num1, double num2) {
		double res = num1 / num2;
		return res;
	}

	int square(int num1) {
		int res = num1 * num1;
		return res;

	}

	int cubeOfNumber(int num1) {
		int res = num1 * num1 * num1;
		return res;

	}

	int convertHourToMinute(int hour) {
		int minutes = hour * 60;
		return minutes;

	}

}
