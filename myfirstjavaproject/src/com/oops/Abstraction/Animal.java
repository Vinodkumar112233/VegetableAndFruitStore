package com.oops.Abstraction;

public abstract interface Animal {

	public abstract void eat();

	public abstract void walk();

	public abstract void sound();
	
	default void sleep() {
		System.out.println("Animal can Sleep");
	}

}
