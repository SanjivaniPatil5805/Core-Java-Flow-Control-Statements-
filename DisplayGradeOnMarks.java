package com.practice;

public class DisplayGradeOnMarks {
	
	public static void main(String[] args) {
		
		double marks = 83.59;
		
		if(marks >= 75 && marks <= 100) {
			
			System.out.println("You are passed with Distinction.");
			
		}
		else if(marks >= 60 && marks <= 74) {
			
			System.out.println("You are passed with First Class.");
			
		}
		else if(marks >= 50 && marks <= 59) {
			
			System.out.println("You are passed with Second Class.");
			
		}
		else if(marks >= 35 && marks <= 49) {
			
			System.out.println("You are Passed.");
			
		}
		else if(marks >= 0  && marks <= 35) {
			
			System.out.println("You are Failed.");
			
		}
		else {
			
			System.out.println("Enter Valid Marks");
		}
	}

}
