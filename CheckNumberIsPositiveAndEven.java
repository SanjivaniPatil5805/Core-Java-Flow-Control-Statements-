package com.practice;

public class CheckNumberIsPositiveAndEven {

	public static void main(String[] args) {

		int num = -22;

		if (num > 0 && num % 2 == 0) {

			System.out.println(num + " is Positive And Even");

		} else if (num > 0 && num % 2 != 0) {

			System.out.println(num + " is Positive And Odd");

		} else if (num < 0 && num % 2 == 0) {

			System.out.println(num + " is Negative And Even");

		} else {

			System.out.println(num + " is Negative And Odd");

		}
		
	}
}
