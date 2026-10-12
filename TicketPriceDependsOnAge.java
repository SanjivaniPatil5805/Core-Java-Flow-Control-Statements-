package com.practice;

public class TicketPriceDependsOnAge {

	public static void main(String[] args) {
		
		int age = 65;
		
		if(age > 0 && age < 101) {
			
			if(age >= 18) {
				
				   if(age >= 60) {
					   
					   System.out.println("Senior discount applicable.");
					   System.out.println("Ticket Price : Rs. 100");
					   
				   } else {
					   
					   System.out.println("Ticket Price : Rs. 200");
				   }
					
				}else {
					
					System.out.println(" Child Ticket Price : Rs. 100");
				}
		}else {
			
			System.out.println("Enter Valid Age");
			
		}
	}
}
