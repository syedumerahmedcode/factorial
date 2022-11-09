package com.umer.gcd;

public class GCDService {

	public int calculateGCD(int firstNumber, int secondNumber) {
		// checking constraint
		if (firstNumber < 0 || secondNumber < 0) {
			return -1;
		}

		// Exit condition
		if (secondNumber == 0) {
			return firstNumber;
		}

		// recursive flow
		// Euclidean algorithm
		return calculateGCD(secondNumber, firstNumber % secondNumber);
	}
}
