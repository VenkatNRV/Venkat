package org.qspiders.calculatorapp;

//this program is showing how the method is calling the other method
public class Sample {
	void show() {
		disp();
		System.out.println("show method");
	}

	void disp() {
		// show(); // if you add this line you will get StackOverflowError
		System.out.println("display method");
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.show();
	}
}
