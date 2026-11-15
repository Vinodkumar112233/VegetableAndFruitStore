package com.oops.Abstraction.task1;

public class NetBankingPayment implements Payment{

	@Override
	public void makePayment() {

		System.out.println("Payment Method: Net Banking");
		System.out.println("Bank Name: SBI");
		System.out.println("Amount Holder: Vinod Kumar");
		System.out.println("Amount: 3000");
		System.out.println("Payment Status: Successful");

	}

}
