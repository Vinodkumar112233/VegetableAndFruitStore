package com.oops.Abstraction.task1;

public abstract interface Payment {
	
	abstract void makePayment();
	
	default void displaymessage() {
		System.out.println("Welcome To Online Payment System !");
		
	}
	
	

}
