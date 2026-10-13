package com.practice;

public class EligibleForContestInElection {

	public static void main(String[] args) {

		int age = 0;

		if (age > 0 && age <= 100) {

			if (age >= 18) {

				System.out.println("You are Eligible For Vote");

				if (age >= 25) {

					System.out.println("You are Eligible for contest in Election");

				} else {

					System.out.println("You are Eligible for not contest in Election");

				}

			} else {

				System.out.println("You are Not Eligible For Vote");

			}

		} else {

			System.out.println("Age is Invalid");

		}

	}

}
