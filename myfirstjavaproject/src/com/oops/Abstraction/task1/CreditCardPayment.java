package com.oops.Abstraction.task1;

public class CreditCardPayment implements Payment{

	@Override
	public void makePayment() {

		System.out.println("Payment Method: Credit Card");
		System.out.println("Card Holder: Vinod Kumar");
		System.out.println("Amount: 5000");
		System.out.println("Payment Status: Successful");

	}

}
