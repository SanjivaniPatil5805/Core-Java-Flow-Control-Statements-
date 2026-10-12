package com.practice;

public class CharacterIsVowelOrConsonant {
	
	public static void main(String[] args) {
		
		char character = 'I';
		
		if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || 
				character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
			
			System.out.println(character + " is Vowel.");
			
		}
		else {
			
			System.out.println(character + " is Consonant.");
			
		}
	}

}
