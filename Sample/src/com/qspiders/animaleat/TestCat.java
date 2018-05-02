package com.qspiders.animaleat;

public class TestCat {
	public static void main(String[] args) {
		Cat c = new Cat();
		Fish fish = new Fish();
		c.eat(fish);
		Rat ra = new Rat();
		c.eat(ra);
		Cheese ch = new Cheese();
		c.eat(ch);
	}
}
