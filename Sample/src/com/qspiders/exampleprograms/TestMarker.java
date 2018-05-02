package com.qspiders.exampleprograms;
//This program is for constructor which explain about After object creation
public class TestMarker {
	public static void main(String[] args) {
		Marker m1=new Marker();
		System.out.println(m1);
		System.out.println(m1.color+" "+m1.brand+" "+m1.price);
		m1.color="Black";
		System.out.println(m1.color+" "+m1.brand+" F"+m1.price);
	}
}
