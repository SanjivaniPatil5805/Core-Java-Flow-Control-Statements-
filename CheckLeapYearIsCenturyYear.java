package com.practice;

public class CheckLeapYearIsCenturyYear {

	public static void main(String[] args) {

		int year = 2000;

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {

			System.out.println(year + " is Leap Year.");
			
			if(year % 100 == 0) {
				
				System.out.println(year+ " is a Century Year.");
			}

		} else {

			System.out.println(year + " is Not Leap Year.");

		}
	}

}
