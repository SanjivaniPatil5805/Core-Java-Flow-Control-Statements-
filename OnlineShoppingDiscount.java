package com.practice;

public class OnlineShoppingDiscount {

	public static void main(String[] args) {
		
		double amount = 2110.00;
		boolean membership = false;
		
		if(amount >= 1000) {
			
			if(membership == true) {
				
				double discount = amount * 0.20;
				System.out.println("Discount = "+ discount);
				System.out.println("Amount to Pay = "+(amount - discount));
				
			} else {
				
				double discount = amount * 0.10;
				System.out.println("Discount = "+ discount);
				System.out.println("Amount to Pay = "+(amount - discount));
			}
		} else {
			
			System.out.println("Discount is available on only more than shopping of 1000Rs.");
		}
	}
}
