package com.umer.decimaltobinary;

public class DecimnalToBinaryConverterService {

	public int convertDecimalToBinary(int n) {
		// No constraint condition applicable here.
		// Exit condition
		if (n == 0) {
			return 0;
		}

		// recursive flow
		return n % 2 + 10 * convertDecimalToBinary(n / 2);
	}

}
