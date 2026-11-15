package com.oops.Abstraction.task1;

public class Testdemo1 {

	public static void main(String[] args) {
		
		UPIpayment u = new UPIpayment();
		u.displaymessage();
		u.makePayment();
		
		
		System.out.println("                        ");
		System.out.println("                        ");
		
		CreditCardPayment c= new CreditCardPayment();
		c.displaymessage();
		c.makePayment();
		
		System.out.println("                        ");
		System.out.println("                        ");
		
		
		NetBankingPayment n = new NetBankingPayment();
		n.displaymessage();
		n.makePayment();
		
		System.out.println("                        ");
		System.out.println("                        ");
		
		
		
		

	}

}
