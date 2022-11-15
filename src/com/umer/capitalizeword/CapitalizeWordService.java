package com.umer.capitalizeword;

public class CapitalizeWordService {
	public String capitalizeWord(String input) {
		// Exit condition
		if (input.isEmpty()) {
			return input;
		}
		// recursive flow
		// fetch individual character
		char character = input.charAt(input.length() - 1);
		// Handle single alphabet input
		if (input.length() == 1) {
			return Character.toString(Character.toUpperCase(character));
		}
		// Look back in the input from the end to check if it contains a [SPACE] 
		if ((input.substring(input.length() - 2, input.length() - 1).equals(" "))) {
			// The alphabet before the [SPACE] should be capitalized
			character = Character.toUpperCase(character);
		}
		// input string progressively gets smaller with every recursion call
		return capitalizeWord(input.substring(0, input.length() - 1)) + Character.toString(character);
	}
}
