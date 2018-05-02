package com.qspiders.idgenerator;

public class TestIdCard {
	public static void main(String[] args) {
		IdCard i1 = new IdCard();
		System.out.println(i1);
		System.out.println(i1.name + " " + i1.mobileNumber + " " + i1.branch);
		i1.name = "Alpha";
		i1.mobileNumber = 9883412345L;
		i1.branch = "S_BTM";
		System.out.println(i1.name + " " + i1.mobileNumber + " " + i1.branch);
		// Alpha 9883412345 S_BTM
		IdCard i2 = new IdCard();
	}

}
