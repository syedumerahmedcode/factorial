package com.umer.factorial;

public class FactorialService {

	public int calculateFactorial(int number) {
		if (number < 0) {
			return -1;
		}
		if (number == 0 || number == 1) {
			return 1;
		}
		return number * calculateFactorial(number - 1);
	}

}
