package com.umer.fabonacci;

public class FabonacciService {

	public int calculateFabonacci(int number) {
		// checking constraint
		if (number < 0) {
			return -1;
		}
		// Exit condition
		if (number == 0 || number == 1) {
			return number;
		}
		// recursive flow
		return calculateFabonacci(number - 1) + calculateFabonacci(number - 2);
	}

}
