package com.practice;

public class EligibleForLoan {

	public static void main(String[] args) {
		
		int age = 34;
		double salary = 34000;
		
		if(age >= 21) {
			
			if(salary >= 25000) {
				
				System.out.println("You are Eligible For Loan.");
			}
		}
		else {
			System.out.println("You are Not Eligible For Loan.");
		}
	}
}
