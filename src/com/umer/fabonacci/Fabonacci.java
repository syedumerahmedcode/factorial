package com.umer.fabonacci;

public class Fabonacci {

	public int fabonacci(int number) {
		if (number < 0) {
			return -1;
		}
		if (number == 0 || number == 1) {
			return number;
		}
		return fabonacci(number - 1) + fabonacci(number - 2);
	}

}
