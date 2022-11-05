package com.umer.sumofdigits;

public class SumOfDigitsService {

	public int calculateSumOfDigits(int number) {

		// Exit condition
		// number == 0

		// checking constraint
		// number < 0
		if (number == 0 || number < 0) {
			return 0;
		}
		// recursive flow
		final int remainder = number % 10;
		return calculateSumOfDigits(number / 10) + remainder;

	}
}
