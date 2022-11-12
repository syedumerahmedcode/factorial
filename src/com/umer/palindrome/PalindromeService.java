package com.umer.palindrome;

public class PalindromeService {

	public boolean isPalindrone(String input) {
		// Exit condition

		// 0 means this is a word with even number of alphabets and all pairs have
		// already been verified with no alphabets left

		// 1 means this is a word with odd number of alphabets and all pairs have
		// already been verified with one alphabet left
		if (input.length() == 0 || input.length() == 1) {
			return true;
		}
		// recursive flow
		if (input.charAt(0) == input.charAt(input.length() - 1)) {
			// The alphabets match so continue further with a smaller subset of the string
			return isPalindrone(input.substring(1, input.length() - 1));
		} else {
			// The alphabets do not match. Hence, return false.
			return false;
		}
	}

}
