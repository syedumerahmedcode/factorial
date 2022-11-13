package com.umer.finduppercase;

public class FindUppercaseService {

	public char findFirstUppercaseLetter(String inputForCheckingUppercaseLetter) {
		// Exit condition
		if (inputForCheckingUppercaseLetter.isEmpty()) {
			return ' ';
		}
		// recursive flow
		if (Character.isUpperCase(inputForCheckingUppercaseLetter.charAt(0))) {
			return inputForCheckingUppercaseLetter.charAt(0);
		} else {
			return findFirstUppercaseLetter(
					inputForCheckingUppercaseLetter.substring(1, inputForCheckingUppercaseLetter.length()));
		}
	}
}
