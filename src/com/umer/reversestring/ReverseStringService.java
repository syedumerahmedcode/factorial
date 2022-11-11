package com.umer.reversestring;

public class ReverseStringService {

	public String reverseString(String stringToReverse) {
		// Exit condition
		if (stringToReverse.isEmpty()) {
			return stringToReverse;
		}
		// recursive flow
		return reverseString(stringToReverse.substring(1)) + stringToReverse.charAt(0);
	}
}
