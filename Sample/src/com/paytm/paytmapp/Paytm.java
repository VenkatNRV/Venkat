package com.paytm.paytmapp;

public class Paytm {
	void login(long phoneNumber, String pwd) {
		System.out.println("Logged in successfully using " + phoneNumber);
	}

	void login(String emailAddress, String pwd) {
		System.out.println("Logged in successfully using " + emailAddress);
	}
}
