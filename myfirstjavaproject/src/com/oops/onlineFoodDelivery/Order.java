package com.oops.onlineFoodDelivery;

public class Order {
	private int orderId;
	private String customerName;
	private int quantity;
	public Order(int orderId, String customerName, int quantity) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.quantity = quantity;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	

}
