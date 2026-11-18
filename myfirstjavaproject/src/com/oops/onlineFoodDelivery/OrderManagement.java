package com.oops.onlineFoodDelivery;



public class OrderManagement {

	public static void main(String[] args) {
		
		PizzaOrder p = new PizzaOrder(11,"vinod",3);
		System.out.println("***********Pizza Details***************");
		p.placeorder();
		p.calculateBill();
		p.displayDetails();
	
		
		
		System.out.println("**************************");
		
		BurgerOrder b = new BurgerOrder(12,"hemanth",2);
		System.out.println("***********Burger Details***************");
		b.placeorder();
		b.calculateBill();
		b.displayDetails();
	
		
		
		System.out.println("**************************");
		
		
		BiryaniOrder v = new BiryaniOrder(13,"eswar",2);
		System.out.println("***********Biryani Details***************");
		v.placeorder();
		v.calculateBill();
		v.displayDetails();
	
		
		
		System.out.println("**************************");
		
		
		

	}

}
