package com.umer.fabonacci;

public class FabonacciService {

	public int calculateFabonacci(int number) {
		if (number < 0) {
			return -1;
		}
		if (number == 0 || number == 1) {
			return number;
		}
		return calculateFabonacci(number - 1) + calculateFabonacci(number - 2);
	}

}
