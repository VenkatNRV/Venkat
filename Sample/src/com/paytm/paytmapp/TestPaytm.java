package com.paytm.paytmapp;

public class TestPaytm {
	public static void main(String[] args) {
		System.out.println("Opened paytm website");
		Paytm p = new Paytm();
		System.out.println("Trying to login");
		p.login(9965453737L, "abcd@123");
		p.login("Paytm@abc.com", "abcd@456");
	}
}
