package com.practice;

public class EligibleForVoting {

	public static void main(String[] args) {
		
		int age = 25;
		
		if(age >= 18 && age <= 100) {
			
			System.out.println("You are Eligible For Voting.");
			
		} else {
			
			System.out.println("You are not Eligible For Voting.");
			
		}
	}
}
