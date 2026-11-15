package com.oops.Abstraction.task1;

public class UPIpayment implements Payment {



	@Override
	public void makePayment() {

		System.out.println("Payment Method: UPI");
		System.out.println("UPI ID: vinod@okaxis");
		System.out.println("Amount: 2000");
		System.out.println("Payment Status: Successful");

	}
}
