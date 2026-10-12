package com.practice;

public class ATMWithdrawal {

	public static void main(String[] args) {

		double balance = 50000;
		double amount = 3230;

		if (balance >= amount) {

			if (amount % 100 == 0) {

				System.out.println("Withdrawal Successful..");
				System.out.println("Remaining balance : " + (balance - amount));
				
			} else {
				
				System.out.println("Invalid Denomination");
				
			}
		} else {
			
			System.out.println("Insufficient balance..");
			
		}
	}
}
