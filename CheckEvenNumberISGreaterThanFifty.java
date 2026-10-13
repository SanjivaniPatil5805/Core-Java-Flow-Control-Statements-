package com.practice;

public class CheckEvenNumberISGreaterThanFifty {

	public static void main(String[] args) {
		
		int num = 40;
		
		if(num % 2 == 0) {
			
			System.out.println("Even Number");
			
			if(num > 50) {
				
				System.out.println("Number is greater than 50");
				
			} else {
				
				System.out.println("Number is less than 50");
				
			}
			
		}else {
			
			System.out.println("Odd Number");
			
		}
		
	}
	
}
