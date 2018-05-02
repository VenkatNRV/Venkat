package com.coffeeday.vendingproject;

public class TestVendingMachine {
	public static void main(String[] args) {
		System.out.println("VendingMachine object is created ");
		VendingMachine vm = new VendingMachine();

		// cold water preparation
		System.out.println("Water object is created in main program ");
		Water w = new Water();
		System.out.println("Give cold water object is referred in main program ");
		Givcoldwater gcw = vm.prepare(w);
		System.out.println();

		// coffee preparation
		System.out.println("coffeebean object is created in main program ");
		Coffeebean c = new Coffeebean();
		System.out.println("Givcoffee is referred in main program");
		Givcoffee gc = vm.prepare(c);
		System.out.println();

		// Applejuice preparation
		System.out.println("Apple object is created in main program : ");
		Apple a = new Apple();
		System.out.println("Givapplejuice is referred in main program");
		Givapplejuice ga = vm.prepare(a);

	}

}
