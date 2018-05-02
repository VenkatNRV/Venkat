package com.sony.unlockapp;

public class TestMobilePhone {
public static void main(String[] args) {
	System.out.println("Phone object is present");
	MobilePhone m=new MobilePhone();
	System.out.println("Trying to unlock using phone");
	m.unlock(1234);
	
	Pattern p=new Pattern();
	m.unlock(p);
}
}
