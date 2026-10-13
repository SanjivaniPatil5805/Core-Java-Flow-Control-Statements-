package com.practice;

public class AgeGroup {

	public static void main(String[] args) {
		
		int age = 23;
		
		if(age > 0 && age <= 100) {
			
			if(age <= 12) {
				
				System.out.println("Child");
				
			} else if(age >= 13 && age <= 19) {
				
				System.err.println("Teenager");
				
			} else if(age >= 20 && age <= 59) {
				
				System.out.println("Adult");
				
			} else {
				
				System.out.println("Senior Citizen");
			}
			
		} else {
			
			System.out.println("Enter Valid Age");
			
		}
		
	}
	
	
}
