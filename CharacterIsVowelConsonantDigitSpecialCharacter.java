package com.practice;

public class CharacterIsVowelConsonantDigitSpecialCharacter {

	public static void main(String[] args) {
		char character = 4;

		if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {

			if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'
					|| character == 'A' || character == 'E' || character == 'I' || character == 'O'
					|| character == 'U') {

				System.out.println("Character is Vowel.");

			} else {

				System.out.println("Character is Consonant.");

			}
		}
		else if (character >= 0 && character <= 9) {
			
			System.out.println("Character is Digit.");
			
		}
		else {
			
			System.out.println("Character is Special Character.");
		}
	}
}
