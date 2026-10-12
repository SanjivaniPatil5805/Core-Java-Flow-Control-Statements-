package com.practice;

public class CalculateElectricityBill {

	public static void main(String[] args) {
		
		double unit = 403.85;
		
		if(unit  >= 0 && unit <= 100) {
			
			double billAmount = 5 * unit;
			
			System.out.println("Your Billing Amount is "+ billAmount);
			
		}
		else if(unit >= 101 && unit <= 200) {
			
			double billAmount = 7 * unit;
			
			System.out.println("Your Billing Amount is "+billAmount);
			
		}
		else {
			
			double billAmount = 10 * unit;
			
			System.out.println("Your Billing Amount is "+billAmount);
		}
	}
}
