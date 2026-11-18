package com.oops.onlineFoodDelivery;

public class BurgerOrder extends Order implements  Foodorder{

	public BurgerOrder(int orderId, String customerName, int quantity) {
		super(orderId, customerName, quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void placeorder() {
		System.out.println("Your Order is SuccessFully Placed!!");		
	}

	@Override
	public void calculateBill() {
		System.out.println("Total Price is: "+(getQuantity()*200));		
	}

	@Override
	public void displayDetails() {
		System.out.println("Your Ordered ID : "+getOrderId());
		System.out.println("Customer Name: "+getCustomerName());
		System.out.println("Total Quantity: "+getQuantity());		
	}

}
