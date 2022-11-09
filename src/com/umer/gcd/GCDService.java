package com.umer.gcd;

public class GCDService {

	public int calculateGCD(int a, int b) {
		// checking constraint
		if (a < 0 || b < 0) {
			return -1;
		}

		// Exit condition
		if (b == 0) {
			return a;
		}

		// recursive flow
		// Euclidean algorithm
		return calculateGCD(b, a % b);
	}
}
