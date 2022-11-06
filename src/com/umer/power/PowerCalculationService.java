package com.umer.power;

public class PowerCalculationService {

	public int calculatePower(int base, int exponent) {
		// checking constraint
		// since the exponent should always be positive as per the problem statement
		if (exponent < 0) {
			return -1;
		}
		// Exit condition
		if (exponent == 0 || exponent == 1) {
			return 1;
		}
		// recursive flow
		return base * calculatePower(base, exponent - 1);
	}
}
