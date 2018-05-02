package com.bluestar.acmanufacture;

public class TestAc {
	public static void main(String[] args) {
		{
			AirConditioner ac = new AirConditioner();
			Water w = new Water();
			Air a = ac.blow(w);
			System.out.println("The room is getting chilled");
		}
	}
}
