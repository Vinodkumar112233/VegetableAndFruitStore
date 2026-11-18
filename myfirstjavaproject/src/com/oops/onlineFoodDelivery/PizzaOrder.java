package com.oops.onlineFoodDelivery;

public class PizzaOrder extends Order implements  Foodorder{

	public PizzaOrder(int orderId, String customerName, int quantity) {
		super(orderId, customerName, quantity);
		
	}

	@Override
	public void placeorder() {
		
		System.out.println("Your Order is SuccessFully Placed!!");
		
	}

	@Override
	public void calculateBill() {
		System.out.println("Total Price is: "+(getQuantity()*150));
		
		
	}

	@Override
	public void displayDetails() {
		
		System.out.println("Your Ordered ID : "+getOrderId());
		System.out.println("Customer Name: "+getCustomerName());
		System.out.println("Total Quantity: "+getQuantity());
		
	}

}
