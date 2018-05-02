package com.rbi.notedesign;

public class TestNote {
	public static void main(String[] args) {
		Note n1 = new Note();
		Note n2 = new Note();
		Note n3 = new Note();

		// Specification 1st rupee note
		System.out.println("1st note hash/address value : " + n1);// printing
																	// hash
																	// value for
																	// n1 object
		System.out.println("1st rupee note color : " + n1.color);
		System.out.println("1st rupee note value : " + n1.value);
		System.out.println("1st rupee note length : " + n1.length);
		System.out.println();

		// Specification 2nd rupee note
		n2.color = "Pink";
		n2.value = 2000;
		n2.length = 12.6;
		System.out.println("2nd note hash/address value : " + n2);// printing
																	// hash
																	// value for
																	// n2 object
		System.out.println("2nd rupee note color : " + n2.color);
		System.out.println("2nd rupee note value : " + n2.value);
		System.out.println("2nd rupee note length : " + n2.length);
		System.out.println();

		// Specification 3rd rupee note
		n3.color = "Orange";
		n3.value = 200;
		n3.length = 10.4;
		System.out.println("3rd note hash/address value : " + n3); // printing
																	// hash
																	// value for
																	// n3 object
		System.out.println("3rd rupee note color : " + n3.color);
		System.out.println("3rd rupee note value : " + n3.value);
		System.out.println("3rd rupee note length : " + n3.length);

	}
}
