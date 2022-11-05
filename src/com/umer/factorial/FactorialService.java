package com.umer.factorial;

public class FactorialService {

	public int calculateFactorial(int number) {
		// checking constraint
		if (number < 0) {
			return -1;
		}
		// Exit condition
		if (number == 0 || number == 1) {
			return 1;
		}
		// recursive flow
		return number * calculateFactorial(number - 1);
	}

}
